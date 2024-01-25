import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qq")
public final class Callback_Sub1 extends Callback {

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "Z")
	private boolean aBoolean551;

	@OriginalMember(owner = "client!qq", name = "c", descriptor = "I")
	private volatile int anInt7812;

	@OriginalMember(owner = "client!qq", name = "d", descriptor = "I")
	private volatile int anInt7813;

	@OriginalMember(owner = "client!qq", name = "e", descriptor = "I")
	private int anInt7814;

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "Z")
	private volatile boolean aBoolean552 = true;

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(BLjava/awt/Component;Z)V")
	public void method6884(@OriginalArg(1) Component arg0, @OriginalArg(2) boolean arg1) {
		@Pc(3) WComponentPeer local3 = (WComponentPeer) arg0.getPeer();
		@Pc(6) int local6 = local3.getTopHwnd();
		if (local6 == this.anInt7813 && arg1 == this.aBoolean552) {
			return;
		}
		if (!this.aBoolean551) {
			this.anInt7814 = User32.LoadCursor(0, 32512);
			Root.alloc(this);
			this.aBoolean551 = true;
		}
		if (local6 != this.anInt7813) {
			if (this.anInt7813 != 0) {
				this.aBoolean552 = true;
				User32.SendMessage(local6, 101024, 0, 0);
				synchronized (this) {
					User32.SetWindowLong(this.anInt7813, -4, this.anInt7812);
				}
			}
			synchronized (this) {
				this.anInt7813 = local6;
				this.anInt7812 = User32.SetWindowLong(this.anInt7813, -4, this);
			}
		}
		this.aBoolean552 = arg1;
		User32.SendMessage(local6, 101024, 0, 0);
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IBI)V")
	public void method6885(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		User32.SetCursorPos(arg0, arg1);
	}

	@OriginalMember(owner = "client!qq", name = "callback", descriptor = "(IIII)I")
	private synchronized int callback(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		if (this.anInt7813 != arg0) {
			local7 = User32.GetWindowLong(arg0, -4);
			return User32.CallWindowProc(local7, arg0, arg1, arg2, arg3);
		}
		if (arg1 == 32) {
			local7 = arg3 & 0xFFFF;
			if (local7 == 1) {
				User32.SetCursor(this.aBoolean552 ? this.anInt7814 : 0);
				return 0;
			}
		}
		if (arg1 == 101024) {
			User32.SetCursor(this.aBoolean552 ? this.anInt7814 : 0);
			return 0;
		}
		if (arg1 == 1) {
			this.anInt7813 = 0;
			this.aBoolean552 = true;
		}
		return User32.CallWindowProc(this.anInt7812, arg0, arg1, arg2, arg3);
	}
}
