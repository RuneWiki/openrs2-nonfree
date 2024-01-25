import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wk")
public final class Class404 {

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "Ljava/awt/DisplayMode;")
	private DisplayMode aDisplayMode1;

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "Ljava/awt/GraphicsDevice;")
	private GraphicsDevice aGraphicsDevice1;

	@OriginalMember(owner = "client!wk", name = "<init>", descriptor = "()V")
	private Class404() throws Exception {
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

	@OriginalMember(owner = "client!wk", name = "exit", descriptor = "()V")
	private void exit() {
		if (this.aDisplayMode1 != null) {
			this.aGraphicsDevice1.setDisplayMode(this.aDisplayMode1);
			if (!this.aGraphicsDevice1.getDisplayMode().equals(this.aDisplayMode1)) {
				throw new RuntimeException("Did not return to correct resolution!");
			}
			this.aDisplayMode1 = null;
		}
		this.method9503(-1, (Frame) null);
	}

	@OriginalMember(owner = "client!wk", name = "enter", descriptor = "(Ljava/awt/Frame;IIII)V")
	private void enter(@OriginalArg(0) Frame arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aDisplayMode1 = this.aGraphicsDevice1.getDisplayMode();
		if (this.aDisplayMode1 == null) {
			throw new NullPointerException();
		}
		arg0.setUndecorated(true);
		arg0.enableInputMethods(false);
		this.method9503(-1, arg0);
		if (arg4 == 0) {
			@Pc(30) int local30 = this.aDisplayMode1.getRefreshRate();
			@Pc(34) DisplayMode[] local34 = this.aGraphicsDevice1.getDisplayModes();
			@Pc(36) boolean local36 = false;
			for (@Pc(38) int local38 = 0; local38 < local34.length; local38++) {
				if (local34[local38].getWidth() == arg1 && local34[local38].getHeight() == arg2 && local34[local38].getBitDepth() == arg3) {
					@Pc(71) int local71 = local34[local38].getRefreshRate();
					if (!local36 || Math.abs(local71 - local30) < Math.abs(arg4 - local30)) {
						arg4 = local71;
						local36 = true;
					}
				}
			}
			if (!local36) {
				arg4 = local30;
			}
		}
		this.aGraphicsDevice1.setDisplayMode(new DisplayMode(arg1, arg2, arg3, arg4));
	}

	@OriginalMember(owner = "client!wk", name = "listmodes", descriptor = "()[I")
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

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(ILjava/awt/Frame;)V")
	private void method9503(@OriginalArg(0) int arg0, @OriginalArg(1) Frame arg1) {
		@Pc(1) boolean local1 = false;
		try {
			@Pc(10) Field local10 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
			if (arg0 != -1) {
				return;
			}
			local10.setAccessible(true);
			@Pc(24) boolean local24 = (Boolean) local10.get(this.aGraphicsDevice1);
			if (local24) {
				local1 = true;
				local10.set(this.aGraphicsDevice1, Boolean.FALSE);
			}
		} catch (@Pc(37) Throwable local37) {
		}
		try {
			this.aGraphicsDevice1.setFullScreenWindow(arg1);
		} finally {
			if (local1) {
				try {
					@Pc(72) Field local72 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					local72.set(this.aGraphicsDevice1, Boolean.TRUE);
				} catch (@Pc(79) Throwable local79) {
				}
			}
		}
	}
}
