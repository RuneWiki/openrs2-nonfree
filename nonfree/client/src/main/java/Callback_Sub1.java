import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lq")
public final class Callback_Sub1 extends Callback {

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "I")
	private volatile int anInt6698;

	@OriginalMember(owner = "client!lq", name = "c", descriptor = "I")
	private int anInt6699;

	@OriginalMember(owner = "client!lq", name = "d", descriptor = "I")
	private volatile int anInt6700;

	@OriginalMember(owner = "client!lq", name = "e", descriptor = "Z")
	private boolean aBoolean495;

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "Z")
	private volatile boolean aBoolean494 = true;

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(IBI)V")
	public void method5704(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		User32.SetCursorPos(arg0, arg1);
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(ZILjava/awt/Component;)V")
	public void method5705(@OriginalArg(0) boolean arg0, @OriginalArg(2) Component arg1) {
		@Pc(3) WComponentPeer local3 = (WComponentPeer) arg1.getPeer();
		@Pc(6) int local6 = local3.getTopHwnd();
		if (this.anInt6698 == local6 && arg0 == this.aBoolean494) {
			return;
		}
		if (!this.aBoolean495) {
			this.anInt6699 = User32.LoadCursor(0, 32512);
			Root.alloc(this);
			this.aBoolean495 = true;
		}
		if (local6 != this.anInt6698) {
			if (this.anInt6698 != 0) {
				this.aBoolean494 = true;
				User32.SendMessage(local6, 101024, 0, 0);
				synchronized (this) {
					User32.SetWindowLong(this.anInt6698, -4, this.anInt6700);
				}
			}
			synchronized (this) {
				this.anInt6698 = local6;
				this.anInt6700 = User32.SetWindowLong(this.anInt6698, -4, this);
			}
		}
		this.aBoolean494 = arg0;
		User32.SendMessage(local6, 101024, 0, 0);
	}

	@OriginalMember(owner = "client!lq", name = "callback", descriptor = "(IIII)I")
	private synchronized int callback(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		if (arg0 != this.anInt6698) {
			local7 = User32.GetWindowLong(arg0, -4);
			return User32.CallWindowProc(local7, arg0, arg1, arg2, arg3);
		}
		if (arg1 == 32) {
			local7 = arg3 & 0xFFFF;
			if (local7 == 1) {
				User32.SetCursor(this.aBoolean494 ? this.anInt6699 : 0);
				return 0;
			}
		}
		if (arg1 == 101024) {
			User32.SetCursor(this.aBoolean494 ? this.anInt6699 : 0);
			return 0;
		}
		if (arg1 == 1) {
			this.anInt6698 = 0;
			this.aBoolean494 = true;
		}
		return User32.CallWindowProc(this.anInt6700, arg0, arg1, arg2, arg3);
	}
}
