import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mm")
public final class Callback_Sub1 extends Callback {

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "I")
	private volatile int anInt5719;

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "I")
	private volatile int anInt5720;

	@OriginalMember(owner = "client!mm", name = "c", descriptor = "Z")
	private boolean aBoolean401;

	@OriginalMember(owner = "client!mm", name = "e", descriptor = "I")
	private int anInt5721;

	@OriginalMember(owner = "client!mm", name = "d", descriptor = "Z")
	private volatile boolean aBoolean402 = true;

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(ZLjava/awt/Component;B)V")
	public void method4923(@OriginalArg(0) boolean arg0, @OriginalArg(1) Component arg1) {
		@Pc(3) WComponentPeer local3 = (WComponentPeer) arg1.getPeer();
		@Pc(6) int local6 = local3.getTopHwnd();
		if (local6 == this.anInt5720 && this.aBoolean402 == arg0) {
			return;
		}
		if (!this.aBoolean401) {
			this.anInt5721 = User32.LoadCursor(0, 32512);
			Root.alloc(this);
			this.aBoolean401 = true;
		}
		if (this.anInt5720 != local6) {
			if (this.anInt5720 != 0) {
				this.aBoolean402 = true;
				User32.SendMessage(local6, 101024, 0, 0);
				synchronized (this) {
					User32.SetWindowLong(this.anInt5720, -4, this.anInt5719);
				}
			}
			synchronized (this) {
				this.anInt5720 = local6;
				this.anInt5719 = User32.SetWindowLong(this.anInt5720, -4, this);
			}
		}
		this.aBoolean402 = arg0;
		User32.SendMessage(local6, 101024, 0, 0);
	}

	@OriginalMember(owner = "client!mm", name = "callback", descriptor = "(IIII)I")
	private synchronized int callback(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11;
		if (this.anInt5720 != arg0) {
			local11 = User32.GetWindowLong(arg0, -4);
			return User32.CallWindowProc(local11, arg0, arg1, arg2, arg3);
		}
		if (arg1 == 32) {
			local11 = arg3 & 0xFFFF;
			if (local11 == 1) {
				User32.SetCursor(this.aBoolean402 ? this.anInt5721 : 0);
				return 0;
			}
		}
		if (arg1 == 101024) {
			User32.SetCursor(this.aBoolean402 ? this.anInt5721 : 0);
			return 0;
		}
		if (arg1 == 1) {
			this.anInt5720 = 0;
			this.aBoolean402 = true;
		}
		return User32.CallWindowProc(this.anInt5719, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(III)V")
	public void method4924(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		User32.SetCursorPos(arg1, arg0);
	}
}
