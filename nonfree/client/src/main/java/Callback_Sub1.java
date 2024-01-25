import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aq")
public final class Callback_Sub1 extends Callback {

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "I")
	private volatile int anInt472;

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "I")
	private volatile int anInt473;

	@OriginalMember(owner = "client!aq", name = "c", descriptor = "Z")
	private boolean aBoolean38;

	@OriginalMember(owner = "client!aq", name = "d", descriptor = "I")
	private int anInt474;

	@OriginalMember(owner = "client!aq", name = "e", descriptor = "Z")
	private volatile boolean aBoolean39 = true;

	@OriginalMember(owner = "client!aq", name = "callback", descriptor = "(IIII)I")
	private synchronized int callback(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11;
		if (arg0 != this.anInt473) {
			local11 = User32.GetWindowLong(arg0, -4);
			return User32.CallWindowProc(local11, arg0, arg1, arg2, arg3);
		}
		if (arg1 == 32) {
			local11 = arg3 & 0xFFFF;
			if (local11 == 1) {
				User32.SetCursor(this.aBoolean39 ? this.anInt474 : 0);
				return 0;
			}
		}
		if (arg1 == 101024) {
			User32.SetCursor(this.aBoolean39 ? this.anInt474 : 0);
			return 0;
		}
		if (arg1 == 1) {
			this.anInt473 = 0;
			this.aBoolean39 = true;
		}
		return User32.CallWindowProc(this.anInt472, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(ILjava/awt/Component;Z)V")
	public void method495(@OriginalArg(1) Component arg0, @OriginalArg(2) boolean arg1) {
		@Pc(3) WComponentPeer local3 = (WComponentPeer) arg0.getPeer();
		@Pc(6) int local6 = local3.getTopHwnd();
		if (local6 == this.anInt473 && this.aBoolean39 == arg1) {
			return;
		}
		if (!this.aBoolean38) {
			this.anInt474 = User32.LoadCursor(0, 32512);
			Root.alloc(this);
			this.aBoolean38 = true;
		}
		if (local6 != this.anInt473) {
			if (this.anInt473 != 0) {
				this.aBoolean39 = true;
				User32.SendMessage(local6, 101024, 0, 0);
				synchronized (this) {
					User32.SetWindowLong(this.anInt473, -4, this.anInt472);
				}
			}
			synchronized (this) {
				this.anInt473 = local6;
				this.anInt472 = User32.SetWindowLong(this.anInt473, -4, this);
			}
		}
		this.aBoolean39 = arg1;
		User32.SendMessage(local6, 101024, 0, 0);
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(III)V")
	public void method496(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		User32.SetCursorPos(arg0, arg1);
	}
}
