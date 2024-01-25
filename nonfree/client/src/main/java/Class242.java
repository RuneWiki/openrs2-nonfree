import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nu")
public final class Class242 {

	@OriginalMember(owner = "client!nu", name = "b", descriptor = "Ljava/awt/DisplayMode;")
	private DisplayMode aDisplayMode1;

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "Ljava/awt/GraphicsDevice;")
	private GraphicsDevice aGraphicsDevice1;

	@OriginalMember(owner = "client!nu", name = "<init>", descriptor = "()V")
	public Class242() throws Exception {
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

	@OriginalMember(owner = "client!nu", name = "listmodes", descriptor = "()[I")
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

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(ILjava/awt/Frame;)V")
	private void method6063(@OriginalArg(0) int arg0, @OriginalArg(1) Frame arg1) {
		@Pc(1) boolean local1 = false;
		try {
			@Pc(6) Field local6 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
			local6.setAccessible(true);
			@Pc(16) boolean local16 = (Boolean) local6.get(this.aGraphicsDevice1);
			if (local16) {
				local1 = true;
				local6.set(this.aGraphicsDevice1, Boolean.FALSE);
			}
		} catch (@Pc(27) Throwable local27) {
		}
		try {
			this.aGraphicsDevice1.setFullScreenWindow(arg1);
			if (arg0 >= -34) {
				this.enter((Frame) null, 35, -39, -110, 26);
			}
		} finally {
			if (local1) {
				try {
					@Pc(67) Field local67 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					local67.set(this.aGraphicsDevice1, Boolean.TRUE);
				} catch (@Pc(74) Throwable local74) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!nu", name = "exit", descriptor = "()V")
	private void exit() {
		if (this.aDisplayMode1 != null) {
			this.aGraphicsDevice1.setDisplayMode(this.aDisplayMode1);
			if (!this.aGraphicsDevice1.getDisplayMode().equals(this.aDisplayMode1)) {
				throw new RuntimeException("Did not return to correct resolution!");
			}
			this.aDisplayMode1 = null;
		}
		this.method6063(-87, (Frame) null);
	}

	@OriginalMember(owner = "client!nu", name = "enter", descriptor = "(Ljava/awt/Frame;IIII)V")
	private void enter(@OriginalArg(0) Frame arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aDisplayMode1 = this.aGraphicsDevice1.getDisplayMode();
		if (this.aDisplayMode1 == null) {
			throw new NullPointerException();
		}
		arg0.setUndecorated(true);
		arg0.enableInputMethods(false);
		this.method6063(-80, arg0);
		if (arg4 == 0) {
			@Pc(31) int local31 = this.aDisplayMode1.getRefreshRate();
			@Pc(35) DisplayMode[] local35 = this.aGraphicsDevice1.getDisplayModes();
			@Pc(37) boolean local37 = false;
			for (@Pc(39) int local39 = 0; local39 < local35.length; local39++) {
				if (arg1 == local35[local39].getWidth() && arg2 == local35[local39].getHeight() && arg3 == local35[local39].getBitDepth()) {
					@Pc(67) int local67 = local35[local39].getRefreshRate();
					if (!local37 || Math.abs(local67 - local31) < Math.abs(arg4 - local31)) {
						arg4 = local67;
						local37 = true;
					}
				}
			}
			if (!local37) {
				arg4 = local31;
			}
		}
		this.aGraphicsDevice1.setDisplayMode(new DisplayMode(arg1, arg2, arg3, arg4));
	}
}
