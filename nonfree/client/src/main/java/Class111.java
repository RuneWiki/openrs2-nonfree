import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fja")
public final class Class111 {

	@OriginalMember(owner = "client!fja", name = "a", descriptor = "Ljava/awt/DisplayMode;")
	private DisplayMode aDisplayMode1;

	@OriginalMember(owner = "client!fja", name = "b", descriptor = "Ljava/awt/GraphicsDevice;")
	private GraphicsDevice aGraphicsDevice1;

	@OriginalMember(owner = "client!fja", name = "<init>", descriptor = "()V")
	public Class111() throws Exception {
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

	@OriginalMember(owner = "client!fja", name = "enter", descriptor = "(Ljava/awt/Frame;IIII)V")
	private void enter(@OriginalArg(0) Frame arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aDisplayMode1 = this.aGraphicsDevice1.getDisplayMode();
		if (this.aDisplayMode1 == null) {
			throw new NullPointerException();
		}
		arg0.setUndecorated(true);
		arg0.enableInputMethods(false);
		this.method2407(arg0, 122);
		if (arg4 == 0) {
			@Pc(29) int local29 = this.aDisplayMode1.getRefreshRate();
			@Pc(33) DisplayMode[] local33 = this.aGraphicsDevice1.getDisplayModes();
			@Pc(35) boolean local35 = false;
			for (@Pc(37) int local37 = 0; local37 < local33.length; local37++) {
				if (arg1 == local33[local37].getWidth() && arg2 == local33[local37].getHeight() && local33[local37].getBitDepth() == arg3) {
					@Pc(69) int local69 = local33[local37].getRefreshRate();
					if (!local35 || Math.abs(local69 - local29) < Math.abs(arg4 - local29)) {
						arg4 = local69;
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

	@OriginalMember(owner = "client!fja", name = "a", descriptor = "(Ljava/awt/Frame;I)V")
	private void method2407(@OriginalArg(0) Frame arg0, @OriginalArg(1) int arg1) {
		@Pc(1) boolean local1 = false;
		try {
			if (arg1 <= 96) {
				this.exit();
			}
			@Pc(11) Field local11 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
			local11.setAccessible(true);
			@Pc(21) boolean local21 = (Boolean) local11.get(this.aGraphicsDevice1);
			if (local21) {
				local1 = true;
				local11.set(this.aGraphicsDevice1, Boolean.FALSE);
			}
		} catch (@Pc(33) Throwable local33) {
		}
		try {
			this.aGraphicsDevice1.setFullScreenWindow(arg0);
		} finally {
			if (local1) {
				try {
					@Pc(60) Field local60 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					local60.set(this.aGraphicsDevice1, Boolean.TRUE);
				} catch (@Pc(67) Throwable local67) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!fja", name = "exit", descriptor = "()V")
	private void exit() {
		if (this.aDisplayMode1 != null) {
			this.aGraphicsDevice1.setDisplayMode(this.aDisplayMode1);
			if (!this.aGraphicsDevice1.getDisplayMode().equals(this.aDisplayMode1)) {
				throw new RuntimeException("Did not return to correct resolution!");
			}
			this.aDisplayMode1 = null;
		}
		this.method2407((Frame) null, 115);
	}

	@OriginalMember(owner = "client!fja", name = "listmodes", descriptor = "()[I")
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
}
