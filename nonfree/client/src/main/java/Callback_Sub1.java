import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Callback_Sub1 extends Callback {

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "I")
	private volatile int anInt4106;

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
	private int anInt4107;

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "Z")
	private boolean aBoolean336;

	@OriginalMember(owner = "client!ib", name = "e", descriptor = "I")
	private volatile int anInt4108;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "Z")
	private volatile boolean aBoolean335 = true;

	@OriginalMember(owner = "client!ib", name = "callback", descriptor = "(IIII)I")
	private synchronized int callback(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11;
		if (arg0 != this.anInt4108) {
			local11 = User32.GetWindowLong(arg0, -4);
			return User32.CallWindowProc(local11, arg0, arg1, arg2, arg3);
		}
		if (arg1 == 32) {
			local11 = arg3 & 0xFFFF;
			if (local11 == 1) {
				User32.SetCursor(this.aBoolean335 ? this.anInt4107 : 0);
				return 0;
			}
		}
		if (arg1 == 101024) {
			User32.SetCursor(this.aBoolean335 ? this.anInt4107 : 0);
			return 0;
		}
		if (arg1 == 1) {
			this.anInt4108 = 0;
			this.aBoolean335 = true;
		}
		return User32.CallWindowProc(this.anInt4106, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Ljava/awt/Component;BZ)V")
	public void method3445(@OriginalArg(0) Component arg0, @OriginalArg(2) boolean arg1) {
		@Pc(3) WComponentPeer local3 = (WComponentPeer) arg0.getPeer();
		@Pc(6) int local6 = local3.getTopHwnd();
		if (this.anInt4108 == local6 && this.aBoolean335 == arg1) {
			return;
		}
		if (!this.aBoolean336) {
			this.anInt4107 = User32.LoadCursor(0, 32512);
			Root.alloc(this);
			this.aBoolean336 = true;
		}
		if (this.anInt4108 != local6) {
			if (this.anInt4108 != 0) {
				this.aBoolean335 = true;
				User32.SendMessage(local6, 101024, 0, 0);
				synchronized (this) {
					User32.SetWindowLong(this.anInt4108, -4, this.anInt4106);
				}
			}
			synchronized (this) {
				this.anInt4108 = local6;
				this.anInt4106 = User32.SetWindowLong(this.anInt4108, -4, this);
			}
		}
		this.aBoolean335 = arg1;
		User32.SendMessage(local6, 101024, 0, 0);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IBI)V")
	public void method3446(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		User32.SetCursorPos(arg1, arg0);
	}
}
