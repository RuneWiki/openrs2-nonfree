import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qca")
public final class Callback_Sub1 extends Callback {

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "I")
	private volatile int anInt7390;

	@OriginalMember(owner = "client!qca", name = "b", descriptor = "I")
	private volatile int anInt7391;

	@OriginalMember(owner = "client!qca", name = "c", descriptor = "Z")
	private boolean aBoolean570;

	@OriginalMember(owner = "client!qca", name = "d", descriptor = "I")
	private int anInt7392;

	@OriginalMember(owner = "client!qca", name = "e", descriptor = "Z")
	private volatile boolean aBoolean571 = true;

	@OriginalMember(owner = "client!qca", name = "callback", descriptor = "(IIII)I")
	private synchronized int callback(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11;
		if (arg0 != this.anInt7391) {
			local11 = User32.GetWindowLong(arg0, -4);
			return User32.CallWindowProc(local11, arg0, arg1, arg2, arg3);
		}
		if (arg1 == 32) {
			local11 = arg3 & 0xFFFF;
			if (local11 == 1) {
				User32.SetCursor(this.aBoolean571 ? this.anInt7392 : 0);
				return 0;
			}
		}
		if (arg1 == 101024) {
			User32.SetCursor(this.aBoolean571 ? this.anInt7392 : 0);
			return 0;
		}
		if (arg1 == 1) {
			this.anInt7391 = 0;
			this.aBoolean571 = true;
		}
		return User32.CallWindowProc(this.anInt7390, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(Ljava/awt/Component;ZI)V")
	public void method5953(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		@Pc(3) WComponentPeer local3 = (WComponentPeer) arg0.getPeer();
		@Pc(6) int local6 = local3.getTopHwnd();
		if (local6 == this.anInt7391 && this.aBoolean571 == arg1) {
			return;
		}
		if (!this.aBoolean570) {
			this.anInt7392 = User32.LoadCursor(0, 32512);
			Root.alloc(this);
			this.aBoolean570 = true;
		}
		if (this.anInt7391 != local6) {
			if (this.anInt7391 != 0) {
				this.aBoolean571 = true;
				User32.SendMessage(local6, 101024, 0, 0);
				synchronized (this) {
					User32.SetWindowLong(this.anInt7391, -4, this.anInt7390);
				}
			}
			synchronized (this) {
				this.anInt7391 = local6;
				this.anInt7390 = User32.SetWindowLong(this.anInt7391, -4, this);
			}
		}
		this.aBoolean571 = arg1;
		User32.SendMessage(local6, 101024, 0, 0);
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(IBI)V")
	public void method5954(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		User32.SetCursorPos(arg0, arg1);
	}
}
