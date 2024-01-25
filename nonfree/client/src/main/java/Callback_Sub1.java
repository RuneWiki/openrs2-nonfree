import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eja")
public final class Callback_Sub1 extends Callback {

	@OriginalMember(owner = "client!eja", name = "b", descriptor = "I")
	private volatile int anInt2476;

	@OriginalMember(owner = "client!eja", name = "d", descriptor = "Z")
	private boolean aBoolean256;

	@OriginalMember(owner = "client!eja", name = "c", descriptor = "I")
	private int anInt2477;

	@OriginalMember(owner = "client!eja", name = "e", descriptor = "I")
	private volatile int anInt2478;

	@OriginalMember(owner = "client!eja", name = "a", descriptor = "Z")
	private volatile boolean aBoolean257 = true;

	@OriginalMember(owner = "client!eja", name = "a", descriptor = "(IIB)V")
	public void method2142(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		User32.SetCursorPos(arg0, arg1);
	}

	@OriginalMember(owner = "client!eja", name = "a", descriptor = "(Ljava/awt/Component;ZI)V")
	public void method2143(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		@Pc(3) WComponentPeer local3 = (WComponentPeer) arg0.getPeer();
		@Pc(6) int local6 = local3.getTopHwnd();
		if (this.anInt2476 == local6 && arg1 == this.aBoolean257) {
			return;
		}
		if (!this.aBoolean256) {
			this.anInt2477 = User32.LoadCursor(0, 32512);
			Root.alloc(this);
			this.aBoolean256 = true;
		}
		if (this.anInt2476 != local6) {
			if (this.anInt2476 != 0) {
				this.aBoolean257 = true;
				User32.SendMessage(local6, 101024, 0, 0);
				synchronized (this) {
					User32.SetWindowLong(this.anInt2476, -4, this.anInt2478);
				}
			}
			synchronized (this) {
				this.anInt2476 = local6;
				this.anInt2478 = User32.SetWindowLong(this.anInt2476, -4, this);
			}
		}
		this.aBoolean257 = arg1;
		User32.SendMessage(local6, 101024, 0, 0);
	}

	@OriginalMember(owner = "client!eja", name = "callback", descriptor = "(IIII)I")
	private synchronized int callback(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11;
		if (arg0 != this.anInt2476) {
			local11 = User32.GetWindowLong(arg0, -4);
			return User32.CallWindowProc(local11, arg0, arg1, arg2, arg3);
		}
		if (arg1 == 32) {
			local11 = arg3 & 0xFFFF;
			if (local11 == 1) {
				User32.SetCursor(this.aBoolean257 ? this.anInt2477 : 0);
				return 0;
			}
		}
		if (arg1 == 101024) {
			User32.SetCursor(this.aBoolean257 ? this.anInt2477 : 0);
			return 0;
		}
		if (arg1 == 1) {
			this.anInt2476 = 0;
			this.aBoolean257 = true;
		}
		return User32.CallWindowProc(this.anInt2478, arg0, arg1, arg2, arg3);
	}
}
