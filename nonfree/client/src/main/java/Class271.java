import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public final class Class271 {

	@OriginalMember(owner = "client!o", name = "a", descriptor = "Ljava/awt/DisplayMode;")
	private DisplayMode aDisplayMode1;

	@OriginalMember(owner = "client!o", name = "b", descriptor = "Ljava/awt/GraphicsDevice;")
	private GraphicsDevice aGraphicsDevice1;

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V")
	public Class271() throws Exception {
		@Pc(3) GraphicsEnvironment local3 = GraphicsEnvironment.getLocalGraphicsEnvironment();
		this.aGraphicsDevice1 = local3.getDefaultScreenDevice();
		if (!this.aGraphicsDevice1.isFullScreenSupported()) {
			@Pc(14) GraphicsDevice[] local14 = local3.getScreenDevices();
			for (@Pc(18) int local18 = 0; local18 < local14.length; local18++) {
				@Pc(30) GraphicsDevice local30 = local14[local18];
				if (local30 != null && local30.isFullScreenSupported()) {
					this.aGraphicsDevice1 = local30;
					return;
				}
			}
			throw new Exception();
		}
	}

	@OriginalMember(owner = "client!o", name = "enter", descriptor = "(Ljava/awt/Frame;IIII)V")
	private void enter(@OriginalArg(0) Frame arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aDisplayMode1 = this.aGraphicsDevice1.getDisplayMode();
		if (this.aDisplayMode1 == null) {
			throw new NullPointerException();
		}
		arg0.setUndecorated(true);
		arg0.enableInputMethods(false);
		this.method6115(-10528, arg0);
		if (arg4 == 0) {
			@Pc(29) int local29 = this.aDisplayMode1.getRefreshRate();
			@Pc(33) DisplayMode[] local33 = this.aGraphicsDevice1.getDisplayModes();
			@Pc(35) boolean local35 = false;
			for (@Pc(37) int local37 = 0; local37 < local33.length; local37++) {
				if (arg1 == local33[local37].getWidth() && arg2 == local33[local37].getHeight() && local33[local37].getBitDepth() == arg3) {
					@Pc(74) int local74 = local33[local37].getRefreshRate();
					if (!local35 || Math.abs(local74 - local29) < Math.abs(arg4 - local29)) {
						arg4 = local74;
						local35 = true;
					}
				}
			}
			if (!local35) {
				arg4 = local29;
			}
		}
		this.aGraphicsDevice1.setDisplayMode(new DisplayMode(arg1, arg2, arg3, arg4));
	}

	@OriginalMember(owner = "client!o", name = "listmodes", descriptor = "()[I")
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

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ILjava/awt/Frame;)V")
	private void method6115(@OriginalArg(0) int arg0, @OriginalArg(1) Frame arg1) {
		@Pc(1) boolean local1 = false;
		try {
			@Pc(10) Field local10 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
			local10.setAccessible(true);
			@Pc(20) boolean local20 = (Boolean) local10.get(this.aGraphicsDevice1);
			if (local20) {
				local10.set(this.aGraphicsDevice1, Boolean.FALSE);
				local1 = true;
			}
		} catch (@Pc(33) Throwable local33) {
		}
		try {
			if (arg0 == -10528) {
				this.aGraphicsDevice1.setFullScreenWindow(arg1);
				return;
			}
		} finally {
			if (local1) {
				try {
					@Pc(90) Field local90 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					local90.set(this.aGraphicsDevice1, Boolean.TRUE);
				} catch (@Pc(97) Throwable local97) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!o", name = "exit", descriptor = "()V")
	private void exit() {
		if (this.aDisplayMode1 != null) {
			this.aGraphicsDevice1.setDisplayMode(this.aDisplayMode1);
			if (!this.aGraphicsDevice1.getDisplayMode().equals(this.aDisplayMode1)) {
				throw new RuntimeException("Did not return to correct resolution!");
			}
			this.aDisplayMode1 = null;
		}
		this.method6115(-10528, (Frame) null);
	}
}
