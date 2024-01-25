import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bq")
public final class Callback_Sub1 extends Callback {

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "I")
	private volatile int anInt889;

	@OriginalMember(owner = "client!bq", name = "b", descriptor = "I")
	private int anInt890;

	@OriginalMember(owner = "client!bq", name = "d", descriptor = "Z")
	private boolean aBoolean60;

	@OriginalMember(owner = "client!bq", name = "e", descriptor = "I")
	private volatile int anInt891;

	@OriginalMember(owner = "client!bq", name = "c", descriptor = "Z")
	private volatile boolean aBoolean59 = true;

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Ljava/awt/Component;ZZ)V")
	public void method766(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		@Pc(11) WComponentPeer local11 = (WComponentPeer) arg0.getPeer();
		@Pc(14) int local14 = local11.getTopHwnd();
		if (local14 == this.anInt891 && this.aBoolean59 == arg1) {
			return;
		}
		if (!this.aBoolean60) {
			this.anInt890 = User32.LoadCursor(0, 32512);
			Root.alloc(this);
			this.aBoolean60 = true;
		}
		if (this.anInt891 != local14) {
			if (this.anInt891 != 0) {
				this.aBoolean59 = true;
				User32.SendMessage(local14, 101024, 0, 0);
				synchronized (this) {
					User32.SetWindowLong(this.anInt891, -4, this.anInt889);
				}
			}
			synchronized (this) {
				this.anInt891 = local14;
				this.anInt889 = User32.SetWindowLong(this.anInt891, -4, this);
			}
		}
		this.aBoolean59 = arg1;
		User32.SendMessage(local14, 101024, 0, 0);
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(IIB)V")
	public void method767(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		User32.SetCursorPos(arg1, arg0);
	}

	@OriginalMember(owner = "client!bq", name = "callback", descriptor = "(IIII)I")
	private synchronized int callback(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		if (this.anInt891 != arg0) {
			local7 = User32.GetWindowLong(arg0, -4);
			return User32.CallWindowProc(local7, arg0, arg1, arg2, arg3);
		}
		if (arg1 == 32) {
			local7 = arg3 & 0xFFFF;
			if (local7 == 1) {
				User32.SetCursor(this.aBoolean59 ? this.anInt890 : 0);
				return 0;
			}
		}
		if (arg1 == 101024) {
			User32.SetCursor(this.aBoolean59 ? this.anInt890 : 0);
			return 0;
		}
		if (arg1 == 1) {
			this.anInt891 = 0;
			this.aBoolean59 = true;
		}
		return User32.CallWindowProc(this.anInt889, arg0, arg1, arg2, arg3);
	}
}
