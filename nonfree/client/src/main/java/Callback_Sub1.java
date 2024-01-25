import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nr")
public final class Callback_Sub1 extends Callback {

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "I")
	private volatile int anInt6058;

	@OriginalMember(owner = "client!nr", name = "c", descriptor = "I")
	private volatile int anInt6059;

	@OriginalMember(owner = "client!nr", name = "d", descriptor = "I")
	private int anInt6060;

	@OriginalMember(owner = "client!nr", name = "e", descriptor = "Z")
	private boolean aBoolean442;

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "Z")
	private volatile boolean aBoolean441 = true;

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(III)V")
	public void method5166(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		User32.SetCursorPos(arg1, arg0);
	}

	@OriginalMember(owner = "client!nr", name = "callback", descriptor = "(IIII)I")
	private synchronized int callback(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		if (this.anInt6058 != arg0) {
			local7 = User32.GetWindowLong(arg0, -4);
			return User32.CallWindowProc(local7, arg0, arg1, arg2, arg3);
		}
		if (arg1 == 32) {
			local7 = arg3 & 0xFFFF;
			if (local7 == 1) {
				User32.SetCursor(this.aBoolean441 ? this.anInt6060 : 0);
				return 0;
			}
		}
		if (arg1 == 101024) {
			User32.SetCursor(this.aBoolean441 ? this.anInt6060 : 0);
			return 0;
		}
		if (arg1 == 1) {
			this.anInt6058 = 0;
			this.aBoolean441 = true;
		}
		return User32.CallWindowProc(this.anInt6059, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(ZLjava/awt/Component;I)V")
	public void method5167(@OriginalArg(0) boolean arg0, @OriginalArg(1) Component arg1) {
		@Pc(3) WComponentPeer local3 = (WComponentPeer) arg1.getPeer();
		@Pc(6) int local6 = local3.getTopHwnd();
		if (this.anInt6058 == local6 && arg0 == this.aBoolean441) {
			return;
		}
		if (!this.aBoolean442) {
			this.anInt6060 = User32.LoadCursor(0, 32512);
			Root.alloc(this);
			this.aBoolean442 = true;
		}
		if (local6 != this.anInt6058) {
			if (this.anInt6058 != 0) {
				this.aBoolean441 = true;
				User32.SendMessage(local6, 101024, 0, 0);
				synchronized (this) {
					User32.SetWindowLong(this.anInt6058, -4, this.anInt6059);
				}
			}
			synchronized (this) {
				this.anInt6058 = local6;
				this.anInt6059 = User32.SetWindowLong(this.anInt6058, -4, this);
			}
		}
		this.aBoolean441 = arg0;
		User32.SendMessage(local6, 101024, 0, 0);
	}
}
