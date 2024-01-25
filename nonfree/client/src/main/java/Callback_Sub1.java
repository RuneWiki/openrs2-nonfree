import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qha")
public final class Callback_Sub1 extends Callback {

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "I")
	private volatile int anInt8345;

	@OriginalMember(owner = "client!qha", name = "c", descriptor = "I")
	private volatile int anInt8346;

	@OriginalMember(owner = "client!qha", name = "d", descriptor = "I")
	private int anInt8347;

	@OriginalMember(owner = "client!qha", name = "e", descriptor = "Z")
	private boolean aBoolean717;

	@OriginalMember(owner = "client!qha", name = "b", descriptor = "Z")
	private volatile boolean aBoolean716 = true;

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(ZZLjava/awt/Component;)V")
	public void method6900(@OriginalArg(1) boolean arg0, @OriginalArg(2) Component arg1) {
		@Pc(3) WComponentPeer local3 = (WComponentPeer) arg1.getPeer();
		@Pc(6) int local6 = local3.getTopHwnd();
		if (this.anInt8345 == local6 && arg0 == this.aBoolean716) {
			return;
		}
		if (!this.aBoolean717) {
			this.anInt8347 = User32.LoadCursor(0, 32512);
			Root.alloc(this);
			this.aBoolean717 = true;
		}
		if (local6 != this.anInt8345) {
			if (this.anInt8345 != 0) {
				this.aBoolean716 = true;
				User32.SendMessage(local6, 101024, 0, 0);
				synchronized (this) {
					User32.SetWindowLong(this.anInt8345, -4, this.anInt8346);
				}
			}
			synchronized (this) {
				this.anInt8345 = local6;
				this.anInt8346 = User32.SetWindowLong(this.anInt8345, -4, this);
			}
		}
		this.aBoolean716 = arg0;
		User32.SendMessage(local6, 101024, 0, 0);
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(III)V")
	public void method6901(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		User32.SetCursorPos(arg1, arg0);
	}

	@OriginalMember(owner = "client!qha", name = "callback", descriptor = "(IIII)I")
	private synchronized int callback(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11;
		if (arg0 != this.anInt8345) {
			local11 = User32.GetWindowLong(arg0, -4);
			return User32.CallWindowProc(local11, arg0, arg1, arg2, arg3);
		}
		if (arg1 == 32) {
			local11 = arg3 & 0xFFFF;
			if (local11 == 1) {
				User32.SetCursor(this.aBoolean716 ? this.anInt8347 : 0);
				return 0;
			}
		}
		if (arg1 == 101024) {
			User32.SetCursor(this.aBoolean716 ? this.anInt8347 : 0);
			return 0;
		}
		if (arg1 == 1) {
			this.anInt8345 = 0;
			this.aBoolean716 = true;
		}
		return User32.CallWindowProc(this.anInt8346, arg0, arg1, arg2, arg3);
	}
}
