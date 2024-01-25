import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lv")
public final class Callback_Sub1 extends Callback {

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "I")
	private int anInt6275;

	@OriginalMember(owner = "client!lv", name = "b", descriptor = "I")
	private volatile int anInt6276;

	@OriginalMember(owner = "client!lv", name = "c", descriptor = "Z")
	private boolean aBoolean449;

	@OriginalMember(owner = "client!lv", name = "e", descriptor = "I")
	private volatile int anInt6277;

	@OriginalMember(owner = "client!lv", name = "d", descriptor = "Z")
	private volatile boolean aBoolean450 = true;

	@OriginalMember(owner = "client!lv", name = "callback", descriptor = "(IIII)I")
	private synchronized int callback(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11;
		if (this.anInt6277 != arg0) {
			local11 = User32.GetWindowLong(arg0, -4);
			return User32.CallWindowProc(local11, arg0, arg1, arg2, arg3);
		}
		if (arg1 == 32) {
			local11 = arg3 & 0xFFFF;
			if (local11 == 1) {
				User32.SetCursor(this.aBoolean450 ? this.anInt6275 : 0);
				return 0;
			}
		}
		if (arg1 == 101024) {
			User32.SetCursor(this.aBoolean450 ? this.anInt6275 : 0);
			return 0;
		}
		if (arg1 == 1) {
			this.anInt6277 = 0;
			this.aBoolean450 = true;
		}
		return User32.CallWindowProc(this.anInt6276, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(IIZ)V")
	public void method5453(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		User32.SetCursorPos(arg1, arg0);
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(Ljava/awt/Component;BZ)V")
	public void method5454(@OriginalArg(0) Component arg0, @OriginalArg(2) boolean arg1) {
		@Pc(3) WComponentPeer local3 = (WComponentPeer) arg0.getPeer();
		@Pc(6) int local6 = local3.getTopHwnd();
		if (local6 == this.anInt6277 && this.aBoolean450 == arg1) {
			return;
		}
		if (!this.aBoolean449) {
			this.anInt6275 = User32.LoadCursor(0, 32512);
			Root.alloc(this);
			this.aBoolean449 = true;
		}
		if (local6 != this.anInt6277) {
			if (this.anInt6277 != 0) {
				this.aBoolean450 = true;
				User32.SendMessage(local6, 101024, 0, 0);
				synchronized (this) {
					User32.SetWindowLong(this.anInt6277, -4, this.anInt6276);
				}
			}
			synchronized (this) {
				this.anInt6277 = local6;
				this.anInt6276 = User32.SetWindowLong(this.anInt6277, -4, this);
			}
		}
		this.aBoolean450 = arg1;
		User32.SendMessage(local6, 101024, 0, 0);
	}
}
