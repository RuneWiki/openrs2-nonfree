import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ofa")
public final class Callback_Sub1 extends Callback {

	@OriginalMember(owner = "client!ofa", name = "e", descriptor = "I")
	private volatile int anInt7213;

	@OriginalMember(owner = "client!ofa", name = "b", descriptor = "Z")
	private boolean aBoolean555;

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "I")
	private volatile int anInt7214;

	@OriginalMember(owner = "client!ofa", name = "c", descriptor = "I")
	private int anInt7215;

	@OriginalMember(owner = "client!ofa", name = "d", descriptor = "Z")
	private volatile boolean aBoolean556 = true;

	@OriginalMember(owner = "client!ofa", name = "callback", descriptor = "(IIII)I")
	private synchronized int callback(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11;
		if (arg0 != this.anInt7214) {
			local11 = User32.GetWindowLong(arg0, -4);
			return User32.CallWindowProc(local11, arg0, arg1, arg2, arg3);
		}
		if (arg1 == 32) {
			local11 = arg3 & 0xFFFF;
			if (local11 == 1) {
				User32.SetCursor(this.aBoolean556 ? this.anInt7215 : 0);
				return 0;
			}
		}
		if (arg1 == 101024) {
			User32.SetCursor(this.aBoolean556 ? this.anInt7215 : 0);
			return 0;
		}
		if (arg1 == 1) {
			this.anInt7214 = 0;
			this.aBoolean556 = true;
		}
		return User32.CallWindowProc(this.anInt7213, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(BZLjava/awt/Component;)V")
	public void method6237(@OriginalArg(1) boolean arg0, @OriginalArg(2) Component arg1) {
		@Pc(8) WComponentPeer local8 = (WComponentPeer) arg1.getPeer();
		@Pc(11) int local11 = local8.getTopHwnd();
		if (local11 == this.anInt7214 && arg0 == this.aBoolean556) {
			return;
		}
		if (!this.aBoolean555) {
			this.anInt7215 = User32.LoadCursor(0, 32512);
			Root.alloc(this);
			this.aBoolean555 = true;
		}
		if (local11 != this.anInt7214) {
			if (this.anInt7214 != 0) {
				this.aBoolean556 = true;
				User32.SendMessage(local11, 101024, 0, 0);
				synchronized (this) {
					User32.SetWindowLong(this.anInt7214, -4, this.anInt7213);
				}
			}
			synchronized (this) {
				this.anInt7214 = local11;
				this.anInt7213 = User32.SetWindowLong(this.anInt7214, -4, this);
			}
		}
		this.aBoolean556 = arg0;
		User32.SendMessage(local11, 101024, 0, 0);
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(IIZ)V")
	public void method6238(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		User32.SetCursorPos(arg0, arg1);
	}
}
