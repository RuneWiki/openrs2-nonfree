import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!g")
public final class Callback_Sub1 extends Callback {

	@OriginalMember(owner = "client!g", name = "a", descriptor = "I")
	private int anInt3619;

	@OriginalMember(owner = "client!g", name = "c", descriptor = "I")
	private volatile int anInt3620;

	@OriginalMember(owner = "client!g", name = "d", descriptor = "I")
	private volatile int anInt3621;

	@OriginalMember(owner = "client!g", name = "e", descriptor = "Z")
	private boolean aBoolean255;

	@OriginalMember(owner = "client!g", name = "b", descriptor = "Z")
	private volatile boolean aBoolean254 = true;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Ljava/awt/Component;ZB)V")
	public void method2942(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		@Pc(9) WComponentPeer local9 = (WComponentPeer) arg0.getPeer();
		@Pc(12) int local12 = local9.getTopHwnd();
		if (this.anInt3620 == local12 && arg1 == this.aBoolean254) {
			return;
		}
		if (!this.aBoolean255) {
			this.anInt3619 = User32.LoadCursor(0, 32512);
			Root.alloc(this);
			this.aBoolean255 = true;
		}
		if (local12 != this.anInt3620) {
			if (this.anInt3620 != 0) {
				this.aBoolean254 = true;
				User32.SendMessage(local12, 101024, 0, 0);
				synchronized (this) {
					User32.SetWindowLong(this.anInt3620, -4, this.anInt3621);
				}
			}
			synchronized (this) {
				this.anInt3620 = local12;
				this.anInt3621 = User32.SetWindowLong(this.anInt3620, -4, this);
			}
		}
		this.aBoolean254 = arg1;
		User32.SendMessage(local12, 101024, 0, 0);
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IBI)V")
	public void method2943(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		User32.SetCursorPos(arg0, arg1);
	}

	@OriginalMember(owner = "client!g", name = "callback", descriptor = "(IIII)I")
	private synchronized int callback(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11;
		if (arg0 != this.anInt3620) {
			local11 = User32.GetWindowLong(arg0, -4);
			return User32.CallWindowProc(local11, arg0, arg1, arg2, arg3);
		}
		if (arg1 == 32) {
			local11 = arg3 & 0xFFFF;
			if (local11 == 1) {
				User32.SetCursor(this.aBoolean254 ? this.anInt3619 : 0);
				return 0;
			}
		}
		if (arg1 == 101024) {
			User32.SetCursor(this.aBoolean254 ? this.anInt3619 : 0);
			return 0;
		}
		if (arg1 == 1) {
			this.anInt3620 = 0;
			this.aBoolean254 = true;
		}
		return User32.CallWindowProc(this.anInt3621, arg0, arg1, arg2, arg3);
	}
}
