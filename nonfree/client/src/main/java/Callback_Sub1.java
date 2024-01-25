import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!baa")
public final class Callback_Sub1 extends Callback {

	@OriginalMember(owner = "client!baa", name = "e", descriptor = "I")
	private volatile int anInt688;

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "I")
	private volatile int anInt689;

	@OriginalMember(owner = "client!baa", name = "d", descriptor = "Z")
	private boolean aBoolean54;

	@OriginalMember(owner = "client!baa", name = "b", descriptor = "I")
	private int anInt690;

	@OriginalMember(owner = "client!baa", name = "c", descriptor = "Z")
	private volatile boolean aBoolean53 = true;

	@OriginalMember(owner = "client!baa", name = "callback", descriptor = "(IIII)I")
	private synchronized int callback(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11;
		if (arg0 != this.anInt688) {
			local11 = User32.GetWindowLong(arg0, -4);
			return User32.CallWindowProc(local11, arg0, arg1, arg2, arg3);
		}
		if (arg1 == 32) {
			local11 = arg3 & 0xFFFF;
			if (local11 == 1) {
				User32.SetCursor(this.aBoolean53 ? this.anInt690 : 0);
				return 0;
			}
		}
		if (arg1 == 101024) {
			User32.SetCursor(this.aBoolean53 ? this.anInt690 : 0);
			return 0;
		}
		if (arg1 == 1) {
			this.anInt688 = 0;
			this.aBoolean53 = true;
		}
		return User32.CallWindowProc(this.anInt689, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(III)V")
	public void method546(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		User32.SetCursorPos(arg1, arg0);
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(BLjava/awt/Component;Z)V")
	public void method547(@OriginalArg(1) Component arg0, @OriginalArg(2) boolean arg1) {
		@Pc(3) WComponentPeer local3 = (WComponentPeer) arg0.getPeer();
		@Pc(6) int local6 = local3.getTopHwnd();
		if (local6 == this.anInt688 && this.aBoolean53 == arg1) {
			return;
		}
		if (!this.aBoolean54) {
			this.anInt690 = User32.LoadCursor(0, 32512);
			Root.alloc(this);
			this.aBoolean54 = true;
		}
		if (local6 != this.anInt688) {
			if (this.anInt688 != 0) {
				this.aBoolean53 = true;
				User32.SendMessage(local6, 101024, 0, 0);
				synchronized (this) {
					User32.SetWindowLong(this.anInt688, -4, this.anInt689);
				}
			}
			synchronized (this) {
				this.anInt688 = local6;
				this.anInt689 = User32.SetWindowLong(this.anInt688, -4, this);
			}
		}
		this.aBoolean53 = arg1;
		User32.SendMessage(local6, 101024, 0, 0);
	}
}
