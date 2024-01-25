import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ifa")
public final class Callback_Sub1 extends Callback {

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "Z")
	private boolean aBoolean274;

	@OriginalMember(owner = "client!ifa", name = "b", descriptor = "I")
	private int anInt3959;

	@OriginalMember(owner = "client!ifa", name = "d", descriptor = "I")
	private volatile int anInt3960;

	@OriginalMember(owner = "client!ifa", name = "e", descriptor = "I")
	private volatile int anInt3961;

	@OriginalMember(owner = "client!ifa", name = "c", descriptor = "Z")
	private volatile boolean aBoolean275 = true;

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(III)V")
	public void method3493(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		User32.SetCursorPos(arg1, arg0);
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(Ljava/awt/Component;IZ)V")
	public void method3494(@OriginalArg(0) Component arg0, @OriginalArg(2) boolean arg1) {
		@Pc(13) WComponentPeer local13 = (WComponentPeer) arg0.getPeer();
		@Pc(16) int local16 = local13.getTopHwnd();
		if (this.anInt3960 == local16 && arg1 == this.aBoolean275) {
			return;
		}
		if (!this.aBoolean274) {
			this.anInt3959 = User32.LoadCursor(0, 32512);
			Root.alloc(this);
			this.aBoolean274 = true;
		}
		if (local16 != this.anInt3960) {
			if (this.anInt3960 != 0) {
				this.aBoolean275 = true;
				User32.SendMessage(local16, 101024, 0, 0);
				synchronized (this) {
					User32.SetWindowLong(this.anInt3960, -4, this.anInt3961);
				}
			}
			synchronized (this) {
				this.anInt3960 = local16;
				this.anInt3961 = User32.SetWindowLong(this.anInt3960, -4, this);
			}
		}
		this.aBoolean275 = arg1;
		User32.SendMessage(local16, 101024, 0, 0);
	}

	@OriginalMember(owner = "client!ifa", name = "callback", descriptor = "(IIII)I")
	private synchronized int callback(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11;
		if (arg0 != this.anInt3960) {
			local11 = User32.GetWindowLong(arg0, -4);
			return User32.CallWindowProc(local11, arg0, arg1, arg2, arg3);
		}
		if (arg1 == 32) {
			local11 = arg3 & 0xFFFF;
			if (local11 == 1) {
				User32.SetCursor(this.aBoolean275 ? this.anInt3959 : 0);
				return 0;
			}
		}
		if (arg1 == 101024) {
			User32.SetCursor(this.aBoolean275 ? this.anInt3959 : 0);
			return 0;
		}
		if (arg1 == 1) {
			this.anInt3960 = 0;
			this.aBoolean275 = true;
		}
		return User32.CallWindowProc(this.anInt3961, arg0, arg1, arg2, arg3);
	}
}
