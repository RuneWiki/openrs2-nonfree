import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jf")
public final class Callback_Sub1 extends Callback {

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
	private volatile int anInt4787;

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "I")
	private int anInt4788;

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "Z")
	private boolean aBoolean357;

	@OriginalMember(owner = "client!jf", name = "e", descriptor = "I")
	private volatile int anInt4789;

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "Z")
	private volatile boolean aBoolean356 = true;

	@OriginalMember(owner = "client!jf", name = "callback", descriptor = "(IIII)I")
	private synchronized int callback(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11;
		if (this.anInt4787 != arg0) {
			local11 = User32.GetWindowLong(arg0, -4);
			return User32.CallWindowProc(local11, arg0, arg1, arg2, arg3);
		}
		if (arg1 == 32) {
			local11 = arg3 & 0xFFFF;
			if (local11 == 1) {
				User32.SetCursor(this.aBoolean356 ? this.anInt4788 : 0);
				return 0;
			}
		}
		if (arg1 == 101024) {
			User32.SetCursor(this.aBoolean356 ? this.anInt4788 : 0);
			return 0;
		}
		if (arg1 == 1) {
			this.anInt4787 = 0;
			this.aBoolean356 = true;
		}
		return User32.CallWindowProc(this.anInt4789, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(III)V")
	public void method4429(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		User32.SetCursorPos(arg0, arg1);
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Ljava/awt/Component;ZI)V")
	public void method4430(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		@Pc(3) WComponentPeer local3 = (WComponentPeer) arg0.getPeer();
		@Pc(12) int local12 = local3.getTopHwnd();
		if (local12 == this.anInt4787 && arg1 == this.aBoolean356) {
			return;
		}
		if (!this.aBoolean357) {
			this.anInt4788 = User32.LoadCursor(0, 32512);
			Root.alloc(this);
			this.aBoolean357 = true;
		}
		if (local12 != this.anInt4787) {
			if (this.anInt4787 != 0) {
				this.aBoolean356 = true;
				User32.SendMessage(local12, 101024, 0, 0);
				synchronized (this) {
					User32.SetWindowLong(this.anInt4787, -4, this.anInt4789);
				}
			}
			synchronized (this) {
				this.anInt4787 = local12;
				this.anInt4789 = User32.SetWindowLong(this.anInt4787, -4, this);
			}
		}
		this.aBoolean356 = arg1;
		User32.SendMessage(local12, 101024, 0, 0);
	}
}
