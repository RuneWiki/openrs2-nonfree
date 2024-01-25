import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fh")
public final class Class115 {

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "Ljava/awt/DisplayMode;")
	private DisplayMode aDisplayMode1;

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "Ljava/awt/GraphicsDevice;")
	private GraphicsDevice aGraphicsDevice1;

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "()V")
	public Class115() throws Exception {
		@Pc(3) GraphicsEnvironment local3 = GraphicsEnvironment.getLocalGraphicsEnvironment();
		this.aGraphicsDevice1 = local3.getDefaultScreenDevice();
		if (!this.aGraphicsDevice1.isFullScreenSupported()) {
			@Pc(15) GraphicsDevice[] local15 = local3.getScreenDevices();
			for (@Pc(19) int local19 = 0; local19 < local15.length; local19++) {
				@Pc(27) GraphicsDevice local27 = local15[local19];
				if (local27 != null && local27.isFullScreenSupported()) {
					this.aGraphicsDevice1 = local27;
					return;
				}
			}
			throw new Exception();
		}
	}

	@OriginalMember(owner = "client!fh", name = "exit", descriptor = "()V")
	private void exit() {
		if (this.aDisplayMode1 != null) {
			this.aGraphicsDevice1.setDisplayMode(this.aDisplayMode1);
			if (!this.aGraphicsDevice1.getDisplayMode().equals(this.aDisplayMode1)) {
				throw new RuntimeException("Did not return to correct resolution!");
			}
			this.aDisplayMode1 = null;
		}
		this.method2713((Frame) null, 63);
	}

	@OriginalMember(owner = "client!fh", name = "listmodes", descriptor = "()[I")
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

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Ljava/awt/Frame;I)V")
	private void method2713(@OriginalArg(0) Frame arg0, @OriginalArg(1) int arg1) {
		if (arg1 < 16) {
			this.exit();
		}
		@Pc(6) boolean local6 = false;
		try {
			@Pc(11) Field local11 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
			local11.setAccessible(true);
			@Pc(21) boolean local21 = (Boolean) local11.get(this.aGraphicsDevice1);
			if (local21) {
				local11.set(this.aGraphicsDevice1, Boolean.FALSE);
				local6 = true;
			}
		} catch (@Pc(33) Throwable local33) {
		}
		try {
			this.aGraphicsDevice1.setFullScreenWindow(arg0);
		} finally {
			if (local6) {
				try {
					@Pc(62) Field local62 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					local62.set(this.aGraphicsDevice1, Boolean.TRUE);
				} catch (@Pc(69) Throwable local69) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!fh", name = "enter", descriptor = "(Ljava/awt/Frame;IIII)V")
	private void enter(@OriginalArg(0) Frame arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aDisplayMode1 = this.aGraphicsDevice1.getDisplayMode();
		if (this.aDisplayMode1 == null) {
			throw new NullPointerException();
		}
		arg0.setUndecorated(true);
		arg0.enableInputMethods(false);
		this.method2713(arg0, 108);
		if (arg4 == 0) {
			@Pc(33) int local33 = this.aDisplayMode1.getRefreshRate();
			@Pc(37) DisplayMode[] local37 = this.aGraphicsDevice1.getDisplayModes();
			@Pc(39) boolean local39 = false;
			for (@Pc(41) int local41 = 0; local41 < local37.length; local41++) {
				if (arg1 == local37[local41].getWidth() && local37[local41].getHeight() == arg2 && arg3 == local37[local41].getBitDepth()) {
					@Pc(69) int local69 = local37[local41].getRefreshRate();
					if (!local39 || Math.abs(local69 - local33) < Math.abs(arg4 - local33)) {
						arg4 = local69;
						local39 = true;
					}
				}
			}
			if (!local39) {
				arg4 = local33;
			}
		}
		this.aGraphicsDevice1.setDisplayMode(new DisplayMode(arg1, arg2, arg3, arg4));
	}
}
