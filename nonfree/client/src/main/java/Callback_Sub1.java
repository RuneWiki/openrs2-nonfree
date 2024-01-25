import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vp")
public final class Callback_Sub1 extends Callback {

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "Z")
	private boolean aBoolean831;

	@OriginalMember(owner = "client!vp", name = "b", descriptor = "I")
	private volatile int anInt10016;

	@OriginalMember(owner = "client!vp", name = "d", descriptor = "I")
	private volatile int anInt10017;

	@OriginalMember(owner = "client!vp", name = "e", descriptor = "I")
	private int anInt10018;

	@OriginalMember(owner = "client!vp", name = "c", descriptor = "Z")
	private volatile boolean aBoolean832 = true;

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Ljava/awt/Component;ZI)V")
	public void method8131(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		@Pc(7) WComponentPeer local7 = (WComponentPeer) arg0.getPeer();
		@Pc(10) int local10 = local7.getTopHwnd();
		if (this.anInt10017 == local10 && arg1 == this.aBoolean832) {
			return;
		}
		if (!this.aBoolean831) {
			this.anInt10018 = User32.LoadCursor(0, 32512);
			Root.alloc(this);
			this.aBoolean831 = true;
		}
		if (local10 != this.anInt10017) {
			if (this.anInt10017 != 0) {
				this.aBoolean832 = true;
				User32.SendMessage(local10, 101024, 0, 0);
				synchronized (this) {
					User32.SetWindowLong(this.anInt10017, -4, this.anInt10016);
				}
			}
			synchronized (this) {
				this.anInt10017 = local10;
				this.anInt10016 = User32.SetWindowLong(this.anInt10017, -4, this);
			}
		}
		this.aBoolean832 = arg1;
		User32.SendMessage(local10, 101024, 0, 0);
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(III)V")
	public void method8132(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		User32.SetCursorPos(arg1, arg0);
	}

	@OriginalMember(owner = "client!vp", name = "callback", descriptor = "(IIII)I")
	private synchronized int callback(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11;
		if (arg0 != this.anInt10017) {
			local11 = User32.GetWindowLong(arg0, -4);
			return User32.CallWindowProc(local11, arg0, arg1, arg2, arg3);
		}
		if (arg1 == 32) {
			local11 = arg3 & 0xFFFF;
			if (local11 == 1) {
				User32.SetCursor(this.aBoolean832 ? this.anInt10018 : 0);
				return 0;
			}
		}
		if (arg1 == 101024) {
			User32.SetCursor(this.aBoolean832 ? this.anInt10018 : 0);
			return 0;
		}
		if (arg1 == 1) {
			this.anInt10017 = 0;
			this.aBoolean832 = true;
		}
		return User32.CallWindowProc(this.anInt10016, arg0, arg1, arg2, arg3);
	}
}
