import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Callback_Sub1 extends Callback {

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "Z")
	private boolean aBoolean70;

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
	private int anInt1292;

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
	private volatile int anInt1293;

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
	private volatile int anInt1294;

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "Z")
	private volatile boolean aBoolean71 = true;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Ljava/awt/Component;ZI)V")
	public void method1236(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		@Pc(3) WComponentPeer local3 = (WComponentPeer) arg0.getPeer();
		@Pc(6) int local6 = local3.getTopHwnd();
		if (local6 == this.anInt1294 && arg1 == this.aBoolean71) {
			return;
		}
		if (!this.aBoolean70) {
			this.anInt1292 = User32.LoadCursor(0, 32512);
			Root.alloc(this);
			this.aBoolean70 = true;
		}
		if (this.anInt1294 != local6) {
			if (this.anInt1294 != 0) {
				this.aBoolean71 = true;
				User32.SendMessage(local6, 101024, 0, 0);
				synchronized (this) {
					User32.SetWindowLong(this.anInt1294, -4, this.anInt1293);
				}
			}
			synchronized (this) {
				this.anInt1294 = local6;
				this.anInt1293 = User32.SetWindowLong(this.anInt1294, -4, this);
			}
		}
		this.aBoolean71 = arg1;
		User32.SendMessage(local6, 101024, 0, 0);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(III)V")
	public void method1237(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		User32.SetCursorPos(arg1, arg0);
	}

	@OriginalMember(owner = "client!cc", name = "callback", descriptor = "(IIII)I")
	private synchronized int callback(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		if (arg0 != this.anInt1294) {
			local7 = User32.GetWindowLong(arg0, -4);
			return User32.CallWindowProc(local7, arg0, arg1, arg2, arg3);
		}
		if (arg1 == 32) {
			local7 = arg3 & 0xFFFF;
			if (local7 == 1) {
				User32.SetCursor(this.aBoolean71 ? this.anInt1292 : 0);
				return 0;
			}
		}
		if (arg1 == 101024) {
			User32.SetCursor(this.aBoolean71 ? this.anInt1292 : 0);
			return 0;
		}
		if (arg1 == 1) {
			this.anInt1294 = 0;
			this.aBoolean71 = true;
		}
		return User32.CallWindowProc(this.anInt1293, arg0, arg1, arg2, arg3);
	}
}
