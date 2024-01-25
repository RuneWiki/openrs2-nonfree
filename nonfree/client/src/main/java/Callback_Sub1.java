import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oca")
public final class Callback_Sub1 extends Callback {

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "I")
	private int anInt6290;

	@OriginalMember(owner = "client!oca", name = "b", descriptor = "I")
	private volatile int anInt6291;

	@OriginalMember(owner = "client!oca", name = "c", descriptor = "Z")
	private boolean aBoolean492;

	@OriginalMember(owner = "client!oca", name = "e", descriptor = "I")
	private volatile int anInt6292;

	@OriginalMember(owner = "client!oca", name = "d", descriptor = "Z")
	private volatile boolean aBoolean493 = true;

	@OriginalMember(owner = "client!oca", name = "callback", descriptor = "(IIII)I")
	private synchronized int callback(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		if (arg0 != this.anInt6292) {
			local7 = User32.GetWindowLong(arg0, -4);
			return User32.CallWindowProc(local7, arg0, arg1, arg2, arg3);
		}
		if (arg1 == 32) {
			local7 = arg3 & 0xFFFF;
			if (local7 == 1) {
				User32.SetCursor(this.aBoolean493 ? this.anInt6290 : 0);
				return 0;
			}
		}
		if (arg1 == 101024) {
			User32.SetCursor(this.aBoolean493 ? this.anInt6290 : 0);
			return 0;
		}
		if (arg1 == 1) {
			this.anInt6292 = 0;
			this.aBoolean493 = true;
		}
		return User32.CallWindowProc(this.anInt6291, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(III)V")
	public void method5252(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		User32.SetCursorPos(arg0, arg1);
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(ZILjava/awt/Component;)V")
	public void method5253(@OriginalArg(0) boolean arg0, @OriginalArg(2) Component arg1) {
		@Pc(3) WComponentPeer local3 = (WComponentPeer) arg1.getPeer();
		@Pc(14) int local14 = local3.getTopHwnd();
		if (this.anInt6292 == local14 && arg0 == this.aBoolean493) {
			return;
		}
		if (!this.aBoolean492) {
			this.anInt6290 = User32.LoadCursor(0, 32512);
			Root.alloc(this);
			this.aBoolean492 = true;
		}
		if (local14 != this.anInt6292) {
			if (this.anInt6292 != 0) {
				this.aBoolean493 = true;
				User32.SendMessage(local14, 101024, 0, 0);
				synchronized (this) {
					User32.SetWindowLong(this.anInt6292, -4, this.anInt6291);
				}
			}
			synchronized (this) {
				this.anInt6292 = local14;
				this.anInt6291 = User32.SetWindowLong(this.anInt6292, -4, this);
			}
		}
		this.aBoolean493 = arg0;
		User32.SendMessage(local14, 101024, 0, 0);
	}
}
