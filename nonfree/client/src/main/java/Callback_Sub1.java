import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gq")
public final class Callback_Sub1 extends Callback {

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "I")
	private int anInt3684;

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "Z")
	private boolean aBoolean270;

	@OriginalMember(owner = "client!gq", name = "d", descriptor = "I")
	private volatile int anInt3685;

	@OriginalMember(owner = "client!gq", name = "e", descriptor = "I")
	private volatile int anInt3686;

	@OriginalMember(owner = "client!gq", name = "c", descriptor = "Z")
	private volatile boolean aBoolean271 = true;

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(ZII)V")
	public void method2901(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		User32.SetCursorPos(arg1, arg0);
	}

	@OriginalMember(owner = "client!gq", name = "callback", descriptor = "(IIII)I")
	private synchronized int callback(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11;
		if (this.anInt3685 != arg0) {
			local11 = User32.GetWindowLong(arg0, -4);
			return User32.CallWindowProc(local11, arg0, arg1, arg2, arg3);
		}
		if (arg1 == 32) {
			local11 = arg3 & 0xFFFF;
			if (local11 == 1) {
				User32.SetCursor(this.aBoolean271 ? this.anInt3684 : 0);
				return 0;
			}
		}
		if (arg1 == 101024) {
			User32.SetCursor(this.aBoolean271 ? this.anInt3684 : 0);
			return 0;
		}
		if (arg1 == 1) {
			this.anInt3685 = 0;
			this.aBoolean271 = true;
		}
		return User32.CallWindowProc(this.anInt3686, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(ZLjava/awt/Component;I)V")
	public void method2902(@OriginalArg(0) boolean arg0, @OriginalArg(1) Component arg1) {
		@Pc(3) WComponentPeer local3 = (WComponentPeer) arg1.getPeer();
		@Pc(6) int local6 = local3.getTopHwnd();
		if (local6 == this.anInt3685 && this.aBoolean271 == arg0) {
			return;
		}
		if (!this.aBoolean270) {
			this.anInt3684 = User32.LoadCursor(0, 32512);
			Root.alloc(this);
			this.aBoolean270 = true;
		}
		if (this.anInt3685 != local6) {
			if (this.anInt3685 != 0) {
				this.aBoolean271 = true;
				User32.SendMessage(local6, 101024, 0, 0);
				synchronized (this) {
					User32.SetWindowLong(this.anInt3685, -4, this.anInt3686);
				}
			}
			synchronized (this) {
				this.anInt3685 = local6;
				this.anInt3686 = User32.SetWindowLong(this.anInt3685, -4, this);
			}
		}
		this.aBoolean271 = arg0;
		User32.SendMessage(local6, 101024, 0, 0);
	}
}
