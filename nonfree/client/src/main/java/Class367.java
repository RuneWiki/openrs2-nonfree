import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vda")
public final class Class367 {

	@OriginalMember(owner = "client!vda", name = "b", descriptor = "Ljava/awt/DisplayMode;")
	private DisplayMode aDisplayMode1;

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "Ljava/awt/GraphicsDevice;")
	private GraphicsDevice aGraphicsDevice1;

	@OriginalMember(owner = "client!vda", name = "<init>", descriptor = "()V")
	private Class367() throws Exception {
		@Pc(3) GraphicsEnvironment local3 = GraphicsEnvironment.getLocalGraphicsEnvironment();
		this.aGraphicsDevice1 = local3.getDefaultScreenDevice();
		if (!this.aGraphicsDevice1.isFullScreenSupported()) {
			@Pc(16) GraphicsDevice[] local16 = local3.getScreenDevices();
			for (@Pc(20) int local20 = 0; local20 < local16.length; local20++) {
				@Pc(32) GraphicsDevice local32 = local16[local20];
				if (local32 != null && local32.isFullScreenSupported()) {
					this.aGraphicsDevice1 = local32;
					return;
				}
			}
			throw new Exception();
		}
	}

	@OriginalMember(owner = "client!vda", name = "listmodes", descriptor = "()[I")
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

	@OriginalMember(owner = "client!vda", name = "enter", descriptor = "(Ljava/awt/Frame;IIII)V")
	private void enter(@OriginalArg(0) Frame arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aDisplayMode1 = this.aGraphicsDevice1.getDisplayMode();
		if (this.aDisplayMode1 == null) {
			throw new NullPointerException();
		}
		arg0.setUndecorated(true);
		arg0.enableInputMethods(false);
		this.method8775(arg0, (byte) 119);
		if (arg4 == 0) {
			@Pc(28) int local28 = this.aDisplayMode1.getRefreshRate();
			@Pc(32) DisplayMode[] local32 = this.aGraphicsDevice1.getDisplayModes();
			@Pc(34) boolean local34 = false;
			for (@Pc(36) int local36 = 0; local36 < local32.length; local36++) {
				if (arg1 == local32[local36].getWidth() && arg2 == local32[local36].getHeight() && local32[local36].getBitDepth() == arg3) {
					@Pc(71) int local71 = local32[local36].getRefreshRate();
					if (!local34 || Math.abs(local71 - local28) < Math.abs(arg4 - local28)) {
						arg4 = local71;
						local34 = true;
					}
				}
			}
			if (!local34) {
				arg4 = local28;
			}
		}
		this.aGraphicsDevice1.setDisplayMode(new DisplayMode(arg1, arg2, arg3, arg4));
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(Ljava/awt/Frame;B)V")
	private void method8775(@OriginalArg(0) Frame arg0, @OriginalArg(1) byte arg1) {
		@Pc(1) boolean local1 = false;
		try {
			if (arg1 != 119) {
				this.aDisplayMode1 = (DisplayMode) null;
			}
			@Pc(19) Field local19 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
			local19.setAccessible(true);
			@Pc(29) boolean local29 = (Boolean) local19.get(this.aGraphicsDevice1);
			if (local29) {
				local19.set(this.aGraphicsDevice1, Boolean.FALSE);
				local1 = true;
			}
		} catch (@Pc(42) Throwable local42) {
		}
		try {
			this.aGraphicsDevice1.setFullScreenWindow(arg0);
		} finally {
			if (local1) {
				try {
					@Pc(80) Field local80 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					local80.set(this.aGraphicsDevice1, Boolean.TRUE);
				} catch (@Pc(87) Throwable local87) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!vda", name = "exit", descriptor = "()V")
	private void exit() {
		if (this.aDisplayMode1 != null) {
			this.aGraphicsDevice1.setDisplayMode(this.aDisplayMode1);
			if (!this.aGraphicsDevice1.getDisplayMode().equals(this.aDisplayMode1)) {
				throw new RuntimeException("Did not return to correct resolution!");
			}
			this.aDisplayMode1 = null;
		}
		this.method8775((Frame) null, (byte) 119);
	}
}
