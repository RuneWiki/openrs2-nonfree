import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dw")
public final class Class90 {

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "Ljava/awt/DisplayMode;")
	private DisplayMode aDisplayMode1;

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "Ljava/awt/GraphicsDevice;")
	private GraphicsDevice aGraphicsDevice1;

	@OriginalMember(owner = "client!dw", name = "<init>", descriptor = "()V")
	private Class90() throws Exception {
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

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(BLjava/awt/Frame;)V")
	private void method1859(@OriginalArg(0) byte arg0, @OriginalArg(1) Frame arg1) {
		if (arg0 != 23) {
			return;
		}
		@Pc(5) boolean local5 = false;
		try {
			@Pc(14) Field local14 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
			local14.setAccessible(true);
			@Pc(24) boolean local24 = (Boolean) local14.get(this.aGraphicsDevice1);
			if (local24) {
				local14.set(this.aGraphicsDevice1, Boolean.FALSE);
				local5 = true;
			}
		} catch (@Pc(37) Throwable local37) {
		}
		try {
			this.aGraphicsDevice1.setFullScreenWindow(arg1);
		} finally {
			if (local5) {
				try {
					@Pc(75) Field local75 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					local75.set(this.aGraphicsDevice1, Boolean.TRUE);
				} catch (@Pc(82) Throwable local82) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!dw", name = "listmodes", descriptor = "()[I")
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

	@OriginalMember(owner = "client!dw", name = "exit", descriptor = "()V")
	private void exit() {
		if (this.aDisplayMode1 != null) {
			this.aGraphicsDevice1.setDisplayMode(this.aDisplayMode1);
			if (!this.aGraphicsDevice1.getDisplayMode().equals(this.aDisplayMode1)) {
				throw new RuntimeException("Did not return to correct resolution!");
			}
			this.aDisplayMode1 = null;
		}
		this.method1859((byte) 23, (Frame) null);
	}

	@OriginalMember(owner = "client!dw", name = "enter", descriptor = "(Ljava/awt/Frame;IIII)V")
	private void enter(@OriginalArg(0) Frame arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aDisplayMode1 = this.aGraphicsDevice1.getDisplayMode();
		if (this.aDisplayMode1 == null) {
			throw new NullPointerException();
		}
		arg0.setUndecorated(true);
		arg0.enableInputMethods(false);
		this.method1859((byte) 23, arg0);
		if (arg4 == 0) {
			@Pc(33) int local33 = this.aDisplayMode1.getRefreshRate();
			@Pc(37) DisplayMode[] local37 = this.aGraphicsDevice1.getDisplayModes();
			@Pc(39) boolean local39 = false;
			for (@Pc(41) int local41 = 0; local41 < local37.length; local41++) {
				if (arg1 == local37[local41].getWidth() && local37[local41].getHeight() == arg2 && arg3 == local37[local41].getBitDepth()) {
					@Pc(80) int local80 = local37[local41].getRefreshRate();
					if (!local39 || Math.abs(local80 - local33) < Math.abs(arg4 - local33)) {
						arg4 = local80;
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
