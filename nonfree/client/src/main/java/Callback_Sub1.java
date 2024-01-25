import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kaa")
public final class Callback_Sub1 extends Callback {

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "I")
	private int anInt5411;

	@OriginalMember(owner = "client!kaa", name = "b", descriptor = "I")
	private volatile int anInt5412;

	@OriginalMember(owner = "client!kaa", name = "c", descriptor = "Z")
	private boolean aBoolean422;

	@OriginalMember(owner = "client!kaa", name = "e", descriptor = "I")
	private volatile int anInt5413;

	@OriginalMember(owner = "client!kaa", name = "d", descriptor = "Z")
	private volatile boolean aBoolean423 = true;

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(ZLjava/awt/Component;I)V")
	public void method4581(@OriginalArg(0) boolean arg0, @OriginalArg(1) Component arg1) {
		@Pc(3) WComponentPeer local3 = (WComponentPeer) arg1.getPeer();
		@Pc(6) int local6 = local3.getTopHwnd();
		if (this.anInt5412 == local6 && this.aBoolean423 == arg0) {
			return;
		}
		if (!this.aBoolean422) {
			this.anInt5411 = User32.LoadCursor(0, 32512);
			Root.alloc(this);
			this.aBoolean422 = true;
		}
		if (local6 != this.anInt5412) {
			if (this.anInt5412 != 0) {
				this.aBoolean423 = true;
				User32.SendMessage(local6, 101024, 0, 0);
				synchronized (this) {
					User32.SetWindowLong(this.anInt5412, -4, this.anInt5413);
				}
			}
			synchronized (this) {
				this.anInt5412 = local6;
				this.anInt5413 = User32.SetWindowLong(this.anInt5412, -4, this);
			}
		}
		this.aBoolean423 = arg0;
		User32.SendMessage(local6, 101024, 0, 0);
	}

	@OriginalMember(owner = "client!kaa", name = "callback", descriptor = "(IIII)I")
	private synchronized int callback(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		if (arg0 != this.anInt5412) {
			local7 = User32.GetWindowLong(arg0, -4);
			return User32.CallWindowProc(local7, arg0, arg1, arg2, arg3);
		}
		if (arg1 == 32) {
			local7 = arg3 & 0xFFFF;
			if (local7 == 1) {
				User32.SetCursor(this.aBoolean423 ? this.anInt5411 : 0);
				return 0;
			}
		}
		if (arg1 == 101024) {
			User32.SetCursor(this.aBoolean423 ? this.anInt5411 : 0);
			return 0;
		}
		if (arg1 == 1) {
			this.anInt5412 = 0;
			this.aBoolean423 = true;
		}
		return User32.CallWindowProc(this.anInt5413, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(III)V")
	public void method4582(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		User32.SetCursorPos(arg1, arg0);
	}
}
