import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!naa")
public final class Callback_Sub1 extends Callback {

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "I")
	private volatile int anInt5731;

	@OriginalMember(owner = "client!naa", name = "b", descriptor = "I")
	private volatile int anInt5732;

	@OriginalMember(owner = "client!naa", name = "d", descriptor = "Z")
	private boolean aBoolean437;

	@OriginalMember(owner = "client!naa", name = "e", descriptor = "I")
	private int anInt5733;

	@OriginalMember(owner = "client!naa", name = "c", descriptor = "Z")
	private volatile boolean aBoolean436 = true;

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(ZLjava/awt/Component;Z)V")
	public void method5037(@OriginalArg(1) Component arg0, @OriginalArg(2) boolean arg1) {
		@Pc(7) WComponentPeer local7 = (WComponentPeer) arg0.getPeer();
		@Pc(10) int local10 = local7.getTopHwnd();
		if (local10 == this.anInt5731 && arg1 == this.aBoolean436) {
			return;
		}
		if (!this.aBoolean437) {
			this.anInt5733 = User32.LoadCursor(0, 32512);
			Root.alloc(this);
			this.aBoolean437 = true;
		}
		if (local10 != this.anInt5731) {
			if (this.anInt5731 != 0) {
				this.aBoolean436 = true;
				User32.SendMessage(local10, 101024, 0, 0);
				synchronized (this) {
					User32.SetWindowLong(this.anInt5731, -4, this.anInt5732);
				}
			}
			synchronized (this) {
				this.anInt5731 = local10;
				this.anInt5732 = User32.SetWindowLong(this.anInt5731, -4, this);
			}
		}
		this.aBoolean436 = arg1;
		User32.SendMessage(local10, 101024, 0, 0);
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(IIB)V")
	public void method5038(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		User32.SetCursorPos(arg1, arg0);
	}

	@OriginalMember(owner = "client!naa", name = "callback", descriptor = "(IIII)I")
	private synchronized int callback(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11;
		if (this.anInt5731 != arg0) {
			local11 = User32.GetWindowLong(arg0, -4);
			return User32.CallWindowProc(local11, arg0, arg1, arg2, arg3);
		}
		if (arg1 == 32) {
			local11 = arg3 & 0xFFFF;
			if (local11 == 1) {
				User32.SetCursor(this.aBoolean436 ? this.anInt5733 : 0);
				return 0;
			}
		}
		if (arg1 == 101024) {
			User32.SetCursor(this.aBoolean436 ? this.anInt5733 : 0);
			return 0;
		}
		if (arg1 == 1) {
			this.anInt5731 = 0;
			this.aBoolean436 = true;
		}
		return User32.CallWindowProc(this.anInt5732, arg0, arg1, arg2, arg3);
	}
}
