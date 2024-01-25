import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fv")
public final class Callback_Sub1 extends Callback {

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "I")
	private volatile int anInt3363;

	@OriginalMember(owner = "client!fv", name = "b", descriptor = "I")
	private volatile int anInt3364;

	@OriginalMember(owner = "client!fv", name = "d", descriptor = "Z")
	private boolean aBoolean263;

	@OriginalMember(owner = "client!fv", name = "e", descriptor = "I")
	private int anInt3365;

	@OriginalMember(owner = "client!fv", name = "c", descriptor = "Z")
	private volatile boolean aBoolean262 = true;

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(IZLjava/awt/Component;)V")
	public void method2776(@OriginalArg(1) boolean arg0, @OriginalArg(2) Component arg1) {
		@Pc(3) WComponentPeer local3 = (WComponentPeer) arg1.getPeer();
		@Pc(6) int local6 = local3.getTopHwnd();
		if (local6 == this.anInt3364 && arg0 == this.aBoolean262) {
			return;
		}
		if (!this.aBoolean263) {
			this.anInt3365 = User32.LoadCursor(0, 32512);
			Root.alloc(this);
			this.aBoolean263 = true;
		}
		if (this.anInt3364 != local6) {
			if (this.anInt3364 != 0) {
				this.aBoolean262 = true;
				User32.SendMessage(local6, 101024, 0, 0);
				synchronized (this) {
					User32.SetWindowLong(this.anInt3364, -4, this.anInt3363);
				}
			}
			synchronized (this) {
				this.anInt3364 = local6;
				this.anInt3363 = User32.SetWindowLong(this.anInt3364, -4, this);
			}
		}
		this.aBoolean262 = arg0;
		User32.SendMessage(local6, 101024, 0, 0);
	}

	@OriginalMember(owner = "client!fv", name = "callback", descriptor = "(IIII)I")
	private synchronized int callback(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		if (this.anInt3364 != arg0) {
			local7 = User32.GetWindowLong(arg0, -4);
			return User32.CallWindowProc(local7, arg0, arg1, arg2, arg3);
		}
		if (arg1 == 32) {
			local7 = arg3 & 0xFFFF;
			if (local7 == 1) {
				User32.SetCursor(this.aBoolean262 ? this.anInt3365 : 0);
				return 0;
			}
		}
		if (arg1 == 101024) {
			User32.SetCursor(this.aBoolean262 ? this.anInt3365 : 0);
			return 0;
		}
		if (arg1 == 1) {
			this.anInt3364 = 0;
			this.aBoolean262 = true;
		}
		return User32.CallWindowProc(this.anInt3363, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(III)V")
	public void method2777(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		User32.SetCursorPos(arg0, arg1);
	}
}
