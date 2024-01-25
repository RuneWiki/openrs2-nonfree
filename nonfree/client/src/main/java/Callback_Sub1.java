import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sda")
public final class Callback_Sub1 extends Callback {

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "I")
	private int anInt8624;

	@OriginalMember(owner = "client!sda", name = "c", descriptor = "I")
	private volatile int anInt8625;

	@OriginalMember(owner = "client!sda", name = "d", descriptor = "I")
	private volatile int anInt8626;

	@OriginalMember(owner = "client!sda", name = "e", descriptor = "Z")
	private boolean aBoolean637;

	@OriginalMember(owner = "client!sda", name = "b", descriptor = "Z")
	private volatile boolean aBoolean636 = true;

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(III)V")
	public void method7437(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		User32.SetCursorPos(arg1, arg0);
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(Ljava/awt/Component;ZZ)V")
	public void method7438(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		@Pc(3) WComponentPeer local3 = (WComponentPeer) arg0.getPeer();
		@Pc(6) int local6 = local3.getTopHwnd();
		if (local6 == this.anInt8626 && arg1 == this.aBoolean636) {
			return;
		}
		if (!this.aBoolean637) {
			this.anInt8624 = User32.LoadCursor(0, 32512);
			Root.alloc(this);
			this.aBoolean637 = true;
		}
		if (local6 != this.anInt8626) {
			if (this.anInt8626 != 0) {
				this.aBoolean636 = true;
				User32.SendMessage(local6, 101024, 0, 0);
				synchronized (this) {
					User32.SetWindowLong(this.anInt8626, -4, this.anInt8625);
				}
			}
			synchronized (this) {
				this.anInt8626 = local6;
				this.anInt8625 = User32.SetWindowLong(this.anInt8626, -4, this);
			}
		}
		this.aBoolean636 = arg1;
		User32.SendMessage(local6, 101024, 0, 0);
	}

	@OriginalMember(owner = "client!sda", name = "callback", descriptor = "(IIII)I")
	private synchronized int callback(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		if (arg0 != this.anInt8626) {
			local7 = User32.GetWindowLong(arg0, -4);
			return User32.CallWindowProc(local7, arg0, arg1, arg2, arg3);
		}
		if (arg1 == 32) {
			local7 = arg3 & 0xFFFF;
			if (local7 == 1) {
				User32.SetCursor(this.aBoolean636 ? this.anInt8624 : 0);
				return 0;
			}
		}
		if (arg1 == 101024) {
			User32.SetCursor(this.aBoolean636 ? this.anInt8624 : 0);
			return 0;
		}
		if (arg1 == 1) {
			this.anInt8626 = 0;
			this.aBoolean636 = true;
		}
		return User32.CallWindowProc(this.anInt8625, arg0, arg1, arg2, arg3);
	}
}
