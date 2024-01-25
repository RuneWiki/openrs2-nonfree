import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cga")
public final class Class54 {

	@OriginalMember(owner = "client!cga", name = "b", descriptor = "Ljava/awt/DisplayMode;")
	private DisplayMode aDisplayMode1;

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "Ljava/awt/GraphicsDevice;")
	private GraphicsDevice aGraphicsDevice1;

	@OriginalMember(owner = "client!cga", name = "<init>", descriptor = "()V")
	public Class54() throws Exception {
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

	@OriginalMember(owner = "client!cga", name = "enter", descriptor = "(Ljava/awt/Frame;IIII)V")
	private void enter(@OriginalArg(0) Frame arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aDisplayMode1 = this.aGraphicsDevice1.getDisplayMode();
		if (this.aDisplayMode1 == null) {
			throw new NullPointerException();
		}
		arg0.setUndecorated(true);
		arg0.enableInputMethods(false);
		this.method1094(false, arg0);
		if (arg4 == 0) {
			@Pc(32) int local32 = this.aDisplayMode1.getRefreshRate();
			@Pc(36) DisplayMode[] local36 = this.aGraphicsDevice1.getDisplayModes();
			@Pc(38) boolean local38 = false;
			for (@Pc(40) int local40 = 0; local40 < local36.length; local40++) {
				if (local36[local40].getWidth() == arg1 && arg2 == local36[local40].getHeight() && local36[local40].getBitDepth() == arg3) {
					@Pc(71) int local71 = local36[local40].getRefreshRate();
					if (!local38 || Math.abs(local71 - local32) < Math.abs(arg4 - local32)) {
						arg4 = local71;
						local38 = true;
					}
				}
			}
			if (!local38) {
				arg4 = local32;
			}
		}
		this.aGraphicsDevice1.setDisplayMode(new DisplayMode(arg1, arg2, arg3, arg4));
	}

	@OriginalMember(owner = "client!cga", name = "exit", descriptor = "()V")
	private void exit() {
		if (this.aDisplayMode1 != null) {
			this.aGraphicsDevice1.setDisplayMode(this.aDisplayMode1);
			if (!this.aGraphicsDevice1.getDisplayMode().equals(this.aDisplayMode1)) {
				throw new RuntimeException("Did not return to correct resolution!");
			}
			this.aDisplayMode1 = null;
		}
		this.method1094(false, null);
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(ZLjava/awt/Frame;)V")
	private void method1094(@OriginalArg(0) boolean arg0, @OriginalArg(1) Frame arg1) {
		@Pc(1) boolean local1 = arg0;
		try {
			@Pc(6) Field local6 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
			local6.setAccessible(true);
			@Pc(16) boolean local16 = (Boolean) local6.get(this.aGraphicsDevice1);
			if (local16) {
				local1 = true;
				local6.set(this.aGraphicsDevice1, Boolean.FALSE);
			}
		} catch (@Pc(28) Throwable local28) {
		}
		try {
			this.aGraphicsDevice1.setFullScreenWindow(arg1);
		} finally {
			if (local1) {
				try {
					@Pc(55) Field local55 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					local55.set(this.aGraphicsDevice1, Boolean.TRUE);
				} catch (@Pc(62) Throwable local62) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!cga", name = "listmodes", descriptor = "()[I")
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
