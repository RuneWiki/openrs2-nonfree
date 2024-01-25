import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rg")
public final class Callback_Sub1 extends Callback {

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "I")
	private int anInt8050;

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "I")
	private volatile int anInt8051;

	@OriginalMember(owner = "client!rg", name = "d", descriptor = "Z")
	private boolean aBoolean595;

	@OriginalMember(owner = "client!rg", name = "e", descriptor = "I")
	private volatile int anInt8052;

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "Z")
	private volatile boolean aBoolean594 = true;

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IZLjava/awt/Component;)V")
	public void method6737(@OriginalArg(1) boolean arg0, @OriginalArg(2) Component arg1) {
		@Pc(3) WComponentPeer local3 = (WComponentPeer) arg1.getPeer();
		@Pc(14) int local14 = local3.getTopHwnd();
		if (this.anInt8051 == local14 && arg0 == this.aBoolean594) {
			return;
		}
		if (!this.aBoolean595) {
			this.anInt8050 = User32.LoadCursor(0, 32512);
			Root.alloc(this);
			this.aBoolean595 = true;
		}
		if (this.anInt8051 != local14) {
			if (this.anInt8051 != 0) {
				this.aBoolean594 = true;
				User32.SendMessage(local14, 101024, 0, 0);
				synchronized (this) {
					User32.SetWindowLong(this.anInt8051, -4, this.anInt8052);
				}
			}
			synchronized (this) {
				this.anInt8051 = local14;
				this.anInt8052 = User32.SetWindowLong(this.anInt8051, -4, this);
			}
		}
		this.aBoolean594 = arg0;
		User32.SendMessage(local14, 101024, 0, 0);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(III)V")
	public void method6738(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		User32.SetCursorPos(arg0, arg1);
	}

	@OriginalMember(owner = "client!rg", name = "callback", descriptor = "(IIII)I")
	private synchronized int callback(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		if (this.anInt8051 != arg0) {
			local7 = User32.GetWindowLong(arg0, -4);
			return User32.CallWindowProc(local7, arg0, arg1, arg2, arg3);
		}
		if (arg1 == 32) {
			local7 = arg3 & 0xFFFF;
			if (local7 == 1) {
				User32.SetCursor(this.aBoolean594 ? this.anInt8050 : 0);
				return 0;
			}
		}
		if (arg1 == 101024) {
			User32.SetCursor(this.aBoolean594 ? this.anInt8050 : 0);
			return 0;
		}
		if (arg1 == 1) {
			this.anInt8051 = 0;
			this.aBoolean594 = true;
		}
		return User32.CallWindowProc(this.anInt8052, arg0, arg1, arg2, arg3);
	}
}
