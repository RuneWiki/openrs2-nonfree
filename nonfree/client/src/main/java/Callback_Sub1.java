import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
public final class Callback_Sub1 extends Callback {

	@OriginalMember(owner = "client!u", name = "a", descriptor = "I")
	private int anInt8375;

	@OriginalMember(owner = "client!u", name = "b", descriptor = "I")
	private volatile int anInt8376;

	@OriginalMember(owner = "client!u", name = "c", descriptor = "Z")
	private boolean aBoolean645;

	@OriginalMember(owner = "client!u", name = "d", descriptor = "I")
	private volatile int anInt8377;

	@OriginalMember(owner = "client!u", name = "e", descriptor = "Z")
	private volatile boolean aBoolean646 = true;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ZILjava/awt/Component;)V")
	public void method6974(@OriginalArg(0) boolean arg0, @OriginalArg(2) Component arg1) {
		@Pc(3) WComponentPeer local3 = (WComponentPeer) arg1.getPeer();
		@Pc(6) int local6 = local3.getTopHwnd();
		if (this.anInt8377 == local6 && arg0 == this.aBoolean646) {
			return;
		}
		if (!this.aBoolean645) {
			this.anInt8375 = User32.LoadCursor(0, 32512);
			Root.alloc(this);
			this.aBoolean645 = true;
		}
		if (local6 != this.anInt8377) {
			if (this.anInt8377 != 0) {
				this.aBoolean646 = true;
				User32.SendMessage(local6, 101024, 0, 0);
				synchronized (this) {
					User32.SetWindowLong(this.anInt8377, -4, this.anInt8376);
				}
			}
			synchronized (this) {
				this.anInt8377 = local6;
				this.anInt8376 = User32.SetWindowLong(this.anInt8377, -4, this);
			}
		}
		this.aBoolean646 = arg0;
		User32.SendMessage(local6, 101024, 0, 0);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IZI)V")
	public void method6975(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		User32.SetCursorPos(arg0, arg1);
	}

	@OriginalMember(owner = "client!u", name = "callback", descriptor = "(IIII)I")
	private synchronized int callback(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		if (arg0 != this.anInt8377) {
			local7 = User32.GetWindowLong(arg0, -4);
			return User32.CallWindowProc(local7, arg0, arg1, arg2, arg3);
		}
		if (arg1 == 32) {
			local7 = arg3 & 0xFFFF;
			if (local7 == 1) {
				User32.SetCursor(this.aBoolean646 ? this.anInt8375 : 0);
				return 0;
			}
		}
		if (arg1 == 101024) {
			User32.SetCursor(this.aBoolean646 ? this.anInt8375 : 0);
			return 0;
		}
		if (arg1 == 1) {
			this.anInt8377 = 0;
			this.aBoolean646 = true;
		}
		return User32.CallWindowProc(this.anInt8376, arg0, arg1, arg2, arg3);
	}
}
