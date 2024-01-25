import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tg")
public final class Callback_Sub1 extends Callback {

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "Z")
	private boolean aBoolean647;

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
	private int anInt9261;

	@OriginalMember(owner = "client!tg", name = "d", descriptor = "I")
	private volatile int anInt9262;

	@OriginalMember(owner = "client!tg", name = "e", descriptor = "I")
	private volatile int anInt9263;

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "Z")
	private volatile boolean aBoolean648 = true;

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Ljava/awt/Component;ZZ)V")
	public void method7530(@OriginalArg(0) Component arg0, @OriginalArg(2) boolean arg1) {
		@Pc(9) WComponentPeer local9 = (WComponentPeer) arg0.getPeer();
		@Pc(12) int local12 = local9.getTopHwnd();
		if (this.anInt9263 == local12 && arg1 == this.aBoolean648) {
			return;
		}
		if (!this.aBoolean647) {
			this.anInt9261 = User32.LoadCursor(0, 32512);
			Root.alloc(this);
			this.aBoolean647 = true;
		}
		if (this.anInt9263 != local12) {
			if (this.anInt9263 != 0) {
				this.aBoolean648 = true;
				User32.SendMessage(local12, 101024, 0, 0);
				synchronized (this) {
					User32.SetWindowLong(this.anInt9263, -4, this.anInt9262);
				}
			}
			synchronized (this) {
				this.anInt9263 = local12;
				this.anInt9262 = User32.SetWindowLong(this.anInt9263, -4, this);
			}
		}
		this.aBoolean648 = arg1;
		User32.SendMessage(local12, 101024, 0, 0);
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(BII)V")
	public void method7531(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		User32.SetCursorPos(arg1, arg0);
	}

	@OriginalMember(owner = "client!tg", name = "callback", descriptor = "(IIII)I")
	private synchronized int callback(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11;
		if (this.anInt9263 != arg0) {
			local11 = User32.GetWindowLong(arg0, -4);
			return User32.CallWindowProc(local11, arg0, arg1, arg2, arg3);
		}
		if (arg1 == 32) {
			local11 = arg3 & 0xFFFF;
			if (local11 == 1) {
				User32.SetCursor(this.aBoolean648 ? this.anInt9261 : 0);
				return 0;
			}
		}
		if (arg1 == 101024) {
			User32.SetCursor(this.aBoolean648 ? this.anInt9261 : 0);
			return 0;
		}
		if (arg1 == 1) {
			this.anInt9263 = 0;
			this.aBoolean648 = true;
		}
		return User32.CallWindowProc(this.anInt9262, arg0, arg1, arg2, arg3);
	}
}
