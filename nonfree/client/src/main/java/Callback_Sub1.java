import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lk")
public final class Callback_Sub1 extends Callback {

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "I")
	private volatile int anInt6341;

	@OriginalMember(owner = "client!lk", name = "c", descriptor = "I")
	private volatile int anInt6342;

	@OriginalMember(owner = "client!lk", name = "d", descriptor = "Z")
	private boolean aBoolean566;

	@OriginalMember(owner = "client!lk", name = "e", descriptor = "I")
	private int anInt6343;

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "Z")
	private volatile boolean aBoolean565 = true;

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(ZILjava/awt/Component;)V")
	public void method5287(@OriginalArg(0) boolean arg0, @OriginalArg(2) Component arg1) {
		@Pc(3) WComponentPeer local3 = (WComponentPeer) arg1.getPeer();
		@Pc(6) int local6 = local3.getTopHwnd();
		if (local6 == this.anInt6342 && arg0 == this.aBoolean565) {
			return;
		}
		if (!this.aBoolean566) {
			this.anInt6343 = User32.LoadCursor(0, 32512);
			Root.alloc(this);
			this.aBoolean566 = true;
		}
		if (this.anInt6342 != local6) {
			if (this.anInt6342 != 0) {
				this.aBoolean565 = true;
				User32.SendMessage(local6, 101024, 0, 0);
				synchronized (this) {
					User32.SetWindowLong(this.anInt6342, -4, this.anInt6341);
				}
			}
			synchronized (this) {
				this.anInt6342 = local6;
				this.anInt6341 = User32.SetWindowLong(this.anInt6342, -4, this);
			}
		}
		this.aBoolean565 = arg0;
		User32.SendMessage(local6, 101024, 0, 0);
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(III)V")
	public void method5288(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		User32.SetCursorPos(arg1, arg0);
	}

	@OriginalMember(owner = "client!lk", name = "callback", descriptor = "(IIII)I")
	private synchronized int callback(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		if (this.anInt6342 != arg0) {
			local7 = User32.GetWindowLong(arg0, -4);
			return User32.CallWindowProc(local7, arg0, arg1, arg2, arg3);
		}
		if (arg1 == 32) {
			local7 = arg3 & 0xFFFF;
			if (local7 == 1) {
				User32.SetCursor(this.aBoolean565 ? this.anInt6343 : 0);
				return 0;
			}
		}
		if (arg1 == 101024) {
			User32.SetCursor(this.aBoolean565 ? this.anInt6343 : 0);
			return 0;
		}
		if (arg1 == 1) {
			this.anInt6342 = 0;
			this.aBoolean565 = true;
		}
		return User32.CallWindowProc(this.anInt6341, arg0, arg1, arg2, arg3);
	}
}
