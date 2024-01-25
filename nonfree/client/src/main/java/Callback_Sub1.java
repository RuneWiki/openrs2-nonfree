import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ql")
public final class Callback_Sub1 extends Callback {

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "I")
	private int anInt7566;

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "I")
	private volatile int anInt7567;

	@OriginalMember(owner = "client!ql", name = "c", descriptor = "I")
	private volatile int anInt7568;

	@OriginalMember(owner = "client!ql", name = "e", descriptor = "Z")
	private boolean aBoolean591;

	@OriginalMember(owner = "client!ql", name = "d", descriptor = "Z")
	private volatile boolean aBoolean590 = true;

	@OriginalMember(owner = "client!ql", name = "callback", descriptor = "(IIII)I")
	private synchronized int callback(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11;
		if (this.anInt7568 != arg0) {
			local11 = User32.GetWindowLong(arg0, -4);
			return User32.CallWindowProc(local11, arg0, arg1, arg2, arg3);
		}
		if (arg1 == 32) {
			local11 = arg3 & 0xFFFF;
			if (local11 == 1) {
				User32.SetCursor(this.aBoolean590 ? this.anInt7566 : 0);
				return 0;
			}
		}
		if (arg1 == 101024) {
			User32.SetCursor(this.aBoolean590 ? this.anInt7566 : 0);
			return 0;
		}
		if (arg1 == 1) {
			this.anInt7568 = 0;
			this.aBoolean590 = true;
		}
		return User32.CallWindowProc(this.anInt7567, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIB)V")
	public void method6025(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		User32.SetCursorPos(arg0, arg1);
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(ZBLjava/awt/Component;)V")
	public void method6026(@OriginalArg(0) boolean arg0, @OriginalArg(2) Component arg1) {
		@Pc(3) WComponentPeer local3 = (WComponentPeer) arg1.getPeer();
		@Pc(6) int local6 = local3.getTopHwnd();
		if (this.anInt7568 == local6 && arg0 == this.aBoolean590) {
			return;
		}
		if (!this.aBoolean591) {
			this.anInt7566 = User32.LoadCursor(0, 32512);
			Root.alloc(this);
			this.aBoolean591 = true;
		}
		if (local6 != this.anInt7568) {
			if (this.anInt7568 != 0) {
				this.aBoolean590 = true;
				User32.SendMessage(local6, 101024, 0, 0);
				synchronized (this) {
					User32.SetWindowLong(this.anInt7568, -4, this.anInt7567);
				}
			}
			synchronized (this) {
				this.anInt7568 = local6;
				this.anInt7567 = User32.SetWindowLong(this.anInt7568, -4, this);
			}
		}
		this.aBoolean590 = arg0;
		User32.SendMessage(local6, 101024, 0, 0);
	}
}
