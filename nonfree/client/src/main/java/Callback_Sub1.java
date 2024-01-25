import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mr")
public final class Callback_Sub1 extends Callback {

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "I")
	private volatile int anInt6016;

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "I")
	private volatile int anInt6017;

	@OriginalMember(owner = "client!mr", name = "d", descriptor = "Z")
	private boolean aBoolean390;

	@OriginalMember(owner = "client!mr", name = "e", descriptor = "I")
	private int anInt6018;

	@OriginalMember(owner = "client!mr", name = "c", descriptor = "Z")
	private volatile boolean aBoolean389 = true;

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(III)V")
	public void method5032(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		User32.SetCursorPos(arg0, arg1);
	}

	@OriginalMember(owner = "client!mr", name = "callback", descriptor = "(IIII)I")
	private synchronized int callback(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11;
		if (this.anInt6017 != arg0) {
			local11 = User32.GetWindowLong(arg0, -4);
			return User32.CallWindowProc(local11, arg0, arg1, arg2, arg3);
		}
		if (arg1 == 32) {
			local11 = arg3 & 0xFFFF;
			if (local11 == 1) {
				User32.SetCursor(this.aBoolean389 ? this.anInt6018 : 0);
				return 0;
			}
		}
		if (arg1 == 101024) {
			User32.SetCursor(this.aBoolean389 ? this.anInt6018 : 0);
			return 0;
		}
		if (arg1 == 1) {
			this.anInt6017 = 0;
			this.aBoolean389 = true;
		}
		return User32.CallWindowProc(this.anInt6016, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(BLjava/awt/Component;Z)V")
	public void method5033(@OriginalArg(1) Component arg0, @OriginalArg(2) boolean arg1) {
		@Pc(3) WComponentPeer local3 = (WComponentPeer) arg0.getPeer();
		@Pc(6) int local6 = local3.getTopHwnd();
		if (this.anInt6017 == local6 && arg1 == this.aBoolean389) {
			return;
		}
		if (!this.aBoolean390) {
			this.anInt6018 = User32.LoadCursor(0, 32512);
			Root.alloc(this);
			this.aBoolean390 = true;
		}
		if (local6 != this.anInt6017) {
			if (this.anInt6017 != 0) {
				this.aBoolean389 = true;
				User32.SendMessage(local6, 101024, 0, 0);
				synchronized (this) {
					User32.SetWindowLong(this.anInt6017, -4, this.anInt6016);
				}
			}
			synchronized (this) {
				this.anInt6017 = local6;
				this.anInt6016 = User32.SetWindowLong(this.anInt6017, -4, this);
			}
		}
		this.aBoolean389 = arg1;
		User32.SendMessage(local6, 101024, 0, 0);
	}
}
