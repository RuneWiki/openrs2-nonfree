import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iu")
public final class Class169 {

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "Ljava/awt/DisplayMode;")
	private DisplayMode aDisplayMode1;

	@OriginalMember(owner = "client!iu", name = "b", descriptor = "Ljava/awt/GraphicsDevice;")
	private GraphicsDevice aGraphicsDevice1;

	@OriginalMember(owner = "client!iu", name = "<init>", descriptor = "()V")
	public Class169() throws Exception {
		@Pc(3) GraphicsEnvironment local3 = GraphicsEnvironment.getLocalGraphicsEnvironment();
		this.aGraphicsDevice1 = local3.getDefaultScreenDevice();
		if (!this.aGraphicsDevice1.isFullScreenSupported()) {
			@Pc(14) GraphicsDevice[] local14 = local3.getScreenDevices();
			for (@Pc(18) int local18 = 0; local18 < local14.length; local18++) {
				@Pc(26) GraphicsDevice local26 = local14[local18];
				if (local26 != null && local26.isFullScreenSupported()) {
					this.aGraphicsDevice1 = local26;
					return;
				}
			}
			throw new Exception();
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(Ljava/awt/Frame;I)V")
	private void method3776(@OriginalArg(0) Frame arg0, @OriginalArg(1) int arg1) {
		if (arg1 != -1403970174) {
			this.aDisplayMode1 = (DisplayMode) null;
		}
		@Pc(8) boolean local8 = false;
		try {
			@Pc(13) Field local13 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
			local13.setAccessible(true);
			@Pc(23) boolean local23 = (Boolean) local13.get(this.aGraphicsDevice1);
			if (local23) {
				local13.set(this.aGraphicsDevice1, Boolean.FALSE);
				local8 = true;
			}
		} catch (@Pc(34) Throwable local34) {
		}
		try {
			this.aGraphicsDevice1.setFullScreenWindow(arg0);
		} finally {
			if (local8) {
				try {
					@Pc(63) Field local63 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					local63.set(this.aGraphicsDevice1, Boolean.TRUE);
				} catch (@Pc(70) Throwable local70) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!iu", name = "listmodes", descriptor = "()[I")
	private int[] listmodes() {
		@Pc(3) DisplayMode[] local3 = this.aGraphicsDevice1.getDisplayModes();
		@Pc(9) int[] local9 = new int[local3.length << 2];
		for (@Pc(11) int local11 = 0; local11 < local3.length; local11++) {
			local9[local11 << 2] = local3[local11].getWidth();
			local9[(local11 << 2) + 1] = local3[local11].getHeight();
			local9[(local11 << 2) + 2] = local3[local11].getBitDepth();
			local9[(local11 << 2) + 3] = local3[local11].getRefreshRate();
		}
		return local9;
	}

	@OriginalMember(owner = "client!iu", name = "enter", descriptor = "(Ljava/awt/Frame;IIII)V")
	private void enter(@OriginalArg(0) Frame arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aDisplayMode1 = this.aGraphicsDevice1.getDisplayMode();
		if (this.aDisplayMode1 == null) {
			throw new NullPointerException();
		}
		arg0.setUndecorated(true);
		arg0.enableInputMethods(false);
		this.method3776(arg0, -1403970174);
		if (arg4 == 0) {
			@Pc(29) int local29 = this.aDisplayMode1.getRefreshRate();
			@Pc(33) DisplayMode[] local33 = this.aGraphicsDevice1.getDisplayModes();
			@Pc(35) boolean local35 = false;
			for (@Pc(37) int local37 = 0; local37 < local33.length; local37++) {
				if (local33[local37].getWidth() == arg1 && local33[local37].getHeight() == arg2 && arg3 == local33[local37].getBitDepth()) {
					@Pc(68) int local68 = local33[local37].getRefreshRate();
					if (!local35 || Math.abs(local68 - local29) < Math.abs(arg4 - local29)) {
						local35 = true;
						arg4 = local68;
					}
				}
			}
			if (!local35) {
				arg4 = local29;
			}
		}
		this.aGraphicsDevice1.setDisplayMode(new DisplayMode(arg1, arg2, arg3, arg4));
	}

	@OriginalMember(owner = "client!iu", name = "exit", descriptor = "()V")
	private void exit() {
		if (this.aDisplayMode1 != null) {
			this.aGraphicsDevice1.setDisplayMode(this.aDisplayMode1);
			if (!this.aGraphicsDevice1.getDisplayMode().equals(this.aDisplayMode1)) {
				throw new RuntimeException("Did not return to correct resolution!");
			}
			this.aDisplayMode1 = null;
		}
		this.method3776((Frame) null, -1403970174);
	}
}
