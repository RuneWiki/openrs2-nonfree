import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ll")
public final class Callback_Sub1 extends Callback {

	@OriginalMember(owner = "client!ll", name = "e", descriptor = "I")
	private int anInt5668;

	@OriginalMember(owner = "client!ll", name = "d", descriptor = "I")
	private volatile int anInt5669;

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "Z")
	private boolean aBoolean379;

	@OriginalMember(owner = "client!ll", name = "c", descriptor = "I")
	private volatile int anInt5670;

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "Z")
	private volatile boolean aBoolean378 = true;

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(III)V")
	public void method5084(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		User32.SetCursorPos(arg0, arg1);
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(ZZLjava/awt/Component;)V")
	public void method5085(@OriginalArg(0) boolean arg0, @OriginalArg(2) Component arg1) {
		@Pc(8) WComponentPeer local8 = (WComponentPeer) arg1.getPeer();
		@Pc(11) int local11 = local8.getTopHwnd();
		if (local11 == this.anInt5670 && arg0 == this.aBoolean378) {
			return;
		}
		if (!this.aBoolean379) {
			this.anInt5668 = User32.LoadCursor(0, 32512);
			Root.alloc(this);
			this.aBoolean379 = true;
		}
		if (local11 != this.anInt5670) {
			if (this.anInt5670 != 0) {
				this.aBoolean378 = true;
				User32.SendMessage(local11, 101024, 0, 0);
				synchronized (this) {
					User32.SetWindowLong(this.anInt5670, -4, this.anInt5669);
				}
			}
			synchronized (this) {
				this.anInt5670 = local11;
				this.anInt5669 = User32.SetWindowLong(this.anInt5670, -4, this);
			}
		}
		this.aBoolean378 = arg0;
		User32.SendMessage(local11, 101024, 0, 0);
	}

	@OriginalMember(owner = "client!ll", name = "callback", descriptor = "(IIII)I")
	private synchronized int callback(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		if (this.anInt5670 != arg0) {
			local7 = User32.GetWindowLong(arg0, -4);
			return User32.CallWindowProc(local7, arg0, arg1, arg2, arg3);
		}
		if (arg1 == 32) {
			local7 = arg3 & 0xFFFF;
			if (local7 == 1) {
				User32.SetCursor(this.aBoolean378 ? this.anInt5668 : 0);
				return 0;
			}
		}
		if (arg1 == 101024) {
			User32.SetCursor(this.aBoolean378 ? this.anInt5668 : 0);
			return 0;
		}
		if (arg1 == 1) {
			this.anInt5670 = 0;
			this.aBoolean378 = true;
		}
		return User32.CallWindowProc(this.anInt5669, arg0, arg1, arg2, arg3);
	}
}
