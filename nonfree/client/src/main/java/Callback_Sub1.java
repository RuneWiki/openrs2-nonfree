import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gi")
public final class Callback_Sub1 extends Callback {

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "I")
	private int anInt3753;

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "I")
	private volatile int anInt3754;

	@OriginalMember(owner = "client!gi", name = "c", descriptor = "I")
	private volatile int anInt3755;

	@OriginalMember(owner = "client!gi", name = "e", descriptor = "Z")
	private boolean aBoolean269;

	@OriginalMember(owner = "client!gi", name = "d", descriptor = "Z")
	private volatile boolean aBoolean268 = true;

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(III)V")
	public void method3328(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		User32.SetCursorPos(arg0, arg1);
	}

	@OriginalMember(owner = "client!gi", name = "callback", descriptor = "(IIII)I")
	private synchronized int callback(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11;
		if (arg0 != this.anInt3755) {
			local11 = User32.GetWindowLong(arg0, -4);
			return User32.CallWindowProc(local11, arg0, arg1, arg2, arg3);
		}
		if (arg1 == 32) {
			local11 = arg3 & 0xFFFF;
			if (local11 == 1) {
				User32.SetCursor(this.aBoolean268 ? this.anInt3753 : 0);
				return 0;
			}
		}
		if (arg1 == 101024) {
			User32.SetCursor(this.aBoolean268 ? this.anInt3753 : 0);
			return 0;
		}
		if (arg1 == 1) {
			this.anInt3755 = 0;
			this.aBoolean268 = true;
		}
		return User32.CallWindowProc(this.anInt3754, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Ljava/awt/Component;ZI)V")
	public void method3329(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		@Pc(3) WComponentPeer local3 = (WComponentPeer) arg0.getPeer();
		@Pc(6) int local6 = local3.getTopHwnd();
		if (this.anInt3755 == local6 && arg1 == this.aBoolean268) {
			return;
		}
		if (!this.aBoolean269) {
			this.anInt3753 = User32.LoadCursor(0, 32512);
			Root.alloc(this);
			this.aBoolean269 = true;
		}
		if (this.anInt3755 != local6) {
			if (this.anInt3755 != 0) {
				this.aBoolean268 = true;
				User32.SendMessage(local6, 101024, 0, 0);
				synchronized (this) {
					User32.SetWindowLong(this.anInt3755, -4, this.anInt3754);
				}
			}
			synchronized (this) {
				this.anInt3755 = local6;
				this.anInt3754 = User32.SetWindowLong(this.anInt3755, -4, this);
			}
		}
		this.aBoolean268 = arg1;
		User32.SendMessage(local6, 101024, 0, 0);
	}
}
