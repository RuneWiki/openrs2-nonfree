import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nn")
public final class Callback_Sub1 extends Callback {

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "I")
	private int anInt6880;

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "I")
	private volatile int anInt6881;

	@OriginalMember(owner = "client!nn", name = "c", descriptor = "Z")
	private boolean aBoolean508;

	@OriginalMember(owner = "client!nn", name = "d", descriptor = "I")
	private volatile int anInt6882;

	@OriginalMember(owner = "client!nn", name = "e", descriptor = "Z")
	private volatile boolean aBoolean509 = true;

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(Ljava/awt/Component;ZI)V")
	public void method5770(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		@Pc(3) WComponentPeer local3 = (WComponentPeer) arg0.getPeer();
		@Pc(6) int local6 = local3.getTopHwnd();
		if (local6 == this.anInt6881 && arg1 == this.aBoolean509) {
			return;
		}
		if (!this.aBoolean508) {
			this.anInt6880 = User32.LoadCursor(0, 32512);
			Root.alloc(this);
			this.aBoolean508 = true;
		}
		if (local6 != this.anInt6881) {
			if (this.anInt6881 != 0) {
				this.aBoolean509 = true;
				User32.SendMessage(local6, 101024, 0, 0);
				synchronized (this) {
					User32.SetWindowLong(this.anInt6881, -4, this.anInt6882);
				}
			}
			synchronized (this) {
				this.anInt6881 = local6;
				this.anInt6882 = User32.SetWindowLong(this.anInt6881, -4, this);
			}
		}
		this.aBoolean509 = arg1;
		User32.SendMessage(local6, 101024, 0, 0);
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(III)V")
	public void method5771(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		User32.SetCursorPos(arg1, arg0);
	}

	@OriginalMember(owner = "client!nn", name = "callback", descriptor = "(IIII)I")
	private synchronized int callback(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		if (this.anInt6881 != arg0) {
			local7 = User32.GetWindowLong(arg0, -4);
			return User32.CallWindowProc(local7, arg0, arg1, arg2, arg3);
		}
		if (arg1 == 32) {
			local7 = arg3 & 0xFFFF;
			if (local7 == 1) {
				User32.SetCursor(this.aBoolean509 ? this.anInt6880 : 0);
				return 0;
			}
		}
		if (arg1 == 101024) {
			User32.SetCursor(this.aBoolean509 ? this.anInt6880 : 0);
			return 0;
		}
		if (arg1 == 1) {
			this.anInt6881 = 0;
			this.aBoolean509 = true;
		}
		return User32.CallWindowProc(this.anInt6882, arg0, arg1, arg2, arg3);
	}
}
