import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oda")
public final class Callback_Sub1 extends Callback {

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "I")
	private int anInt6623;

	@OriginalMember(owner = "client!oda", name = "b", descriptor = "Z")
	private boolean aBoolean470;

	@OriginalMember(owner = "client!oda", name = "c", descriptor = "I")
	private volatile int anInt6624;

	@OriginalMember(owner = "client!oda", name = "e", descriptor = "I")
	private volatile int anInt6625;

	@OriginalMember(owner = "client!oda", name = "d", descriptor = "Z")
	private volatile boolean aBoolean471 = true;

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(ZLjava/awt/Component;B)V")
	public void method5456(@OriginalArg(0) boolean arg0, @OriginalArg(1) Component arg1) {
		@Pc(3) WComponentPeer local3 = (WComponentPeer) arg1.getPeer();
		@Pc(6) int local6 = local3.getTopHwnd();
		if (this.anInt6624 == local6 && arg0 == this.aBoolean471) {
			return;
		}
		if (!this.aBoolean470) {
			this.anInt6623 = User32.LoadCursor(0, 32512);
			Root.alloc(this);
			this.aBoolean470 = true;
		}
		if (local6 != this.anInt6624) {
			if (this.anInt6624 != 0) {
				this.aBoolean471 = true;
				User32.SendMessage(local6, 101024, 0, 0);
				synchronized (this) {
					User32.SetWindowLong(this.anInt6624, -4, this.anInt6625);
				}
			}
			synchronized (this) {
				this.anInt6624 = local6;
				this.anInt6625 = User32.SetWindowLong(this.anInt6624, -4, this);
			}
		}
		this.aBoolean471 = arg0;
		User32.SendMessage(local6, 101024, 0, 0);
	}

	@OriginalMember(owner = "client!oda", name = "callback", descriptor = "(IIII)I")
	private synchronized int callback(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		if (arg0 != this.anInt6624) {
			local7 = User32.GetWindowLong(arg0, -4);
			return User32.CallWindowProc(local7, arg0, arg1, arg2, arg3);
		}
		if (arg1 == 32) {
			local7 = arg3 & 0xFFFF;
			if (local7 == 1) {
				User32.SetCursor(this.aBoolean471 ? this.anInt6623 : 0);
				return 0;
			}
		}
		if (arg1 == 101024) {
			User32.SetCursor(this.aBoolean471 ? this.anInt6623 : 0);
			return 0;
		}
		if (arg1 == 1) {
			this.anInt6624 = 0;
			this.aBoolean471 = true;
		}
		return User32.CallWindowProc(this.anInt6625, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(IBI)V")
	public void method5457(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		User32.SetCursorPos(arg0, arg1);
	}
}
