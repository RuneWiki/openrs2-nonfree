import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oi")
public final class Callback_Sub1 extends Callback {

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "I")
	private volatile int anInt7339;

	@OriginalMember(owner = "client!oi", name = "e", descriptor = "Z")
	private boolean aBoolean494;

	@OriginalMember(owner = "client!oi", name = "d", descriptor = "I")
	private int anInt7340;

	@OriginalMember(owner = "client!oi", name = "c", descriptor = "I")
	private volatile int anInt7341;

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "Z")
	private volatile boolean aBoolean493 = true;

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(III)V")
	public void method6344(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		User32.SetCursorPos(arg1, arg0);
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(ZILjava/awt/Component;)V")
	public void method6345(@OriginalArg(0) boolean arg0, @OriginalArg(2) Component arg1) {
		@Pc(3) WComponentPeer local3 = (WComponentPeer) arg1.getPeer();
		@Pc(6) int local6 = local3.getTopHwnd();
		if (local6 == this.anInt7339 && arg0 == this.aBoolean493) {
			return;
		}
		if (!this.aBoolean494) {
			this.anInt7340 = User32.LoadCursor(0, 32512);
			Root.alloc(this);
			this.aBoolean494 = true;
		}
		if (local6 != this.anInt7339) {
			if (this.anInt7339 != 0) {
				this.aBoolean493 = true;
				User32.SendMessage(local6, 101024, 0, 0);
				synchronized (this) {
					User32.SetWindowLong(this.anInt7339, -4, this.anInt7341);
				}
			}
			synchronized (this) {
				this.anInt7339 = local6;
				this.anInt7341 = User32.SetWindowLong(this.anInt7339, -4, this);
			}
		}
		this.aBoolean493 = arg0;
		User32.SendMessage(local6, 101024, 0, 0);
	}

	@OriginalMember(owner = "client!oi", name = "callback", descriptor = "(IIII)I")
	private synchronized int callback(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11;
		if (arg0 != this.anInt7339) {
			local11 = User32.GetWindowLong(arg0, -4);
			return User32.CallWindowProc(local11, arg0, arg1, arg2, arg3);
		}
		if (arg1 == 32) {
			local11 = arg3 & 0xFFFF;
			if (local11 == 1) {
				User32.SetCursor(this.aBoolean493 ? this.anInt7340 : 0);
				return 0;
			}
		}
		if (arg1 == 101024) {
			User32.SetCursor(this.aBoolean493 ? this.anInt7340 : 0);
			return 0;
		}
		if (arg1 == 1) {
			this.anInt7339 = 0;
			this.aBoolean493 = true;
		}
		return User32.CallWindowProc(this.anInt7341, arg0, arg1, arg2, arg3);
	}
}
