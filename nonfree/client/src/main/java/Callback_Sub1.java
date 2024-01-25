import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hca")
public final class Callback_Sub1 extends Callback {

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "I")
	private volatile int anInt3181;

	@OriginalMember(owner = "client!hca", name = "b", descriptor = "Z")
	private boolean aBoolean214;

	@OriginalMember(owner = "client!hca", name = "c", descriptor = "I")
	private int anInt3182;

	@OriginalMember(owner = "client!hca", name = "d", descriptor = "I")
	private volatile int anInt3183;

	@OriginalMember(owner = "client!hca", name = "e", descriptor = "Z")
	private volatile boolean aBoolean215 = true;

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(IZLjava/awt/Component;)V")
	public void method2712(@OriginalArg(1) boolean arg0, @OriginalArg(2) Component arg1) {
		@Pc(3) WComponentPeer local3 = (WComponentPeer) arg1.getPeer();
		@Pc(6) int local6 = local3.getTopHwnd();
		if (this.anInt3183 == local6 && arg0 == this.aBoolean215) {
			return;
		}
		if (!this.aBoolean214) {
			this.anInt3182 = User32.LoadCursor(0, 32512);
			Root.alloc(this);
			this.aBoolean214 = true;
		}
		if (this.anInt3183 != local6) {
			if (this.anInt3183 != 0) {
				this.aBoolean215 = true;
				User32.SendMessage(local6, 101024, 0, 0);
				synchronized (this) {
					User32.SetWindowLong(this.anInt3183, -4, this.anInt3181);
				}
			}
			synchronized (this) {
				this.anInt3183 = local6;
				this.anInt3181 = User32.SetWindowLong(this.anInt3183, -4, this);
			}
		}
		this.aBoolean215 = arg0;
		User32.SendMessage(local6, 101024, 0, 0);
	}

	@OriginalMember(owner = "client!hca", name = "callback", descriptor = "(IIII)I")
	private synchronized int callback(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11;
		if (this.anInt3183 != arg0) {
			local11 = User32.GetWindowLong(arg0, -4);
			return User32.CallWindowProc(local11, arg0, arg1, arg2, arg3);
		}
		if (arg1 == 32) {
			local11 = arg3 & 0xFFFF;
			if (local11 == 1) {
				User32.SetCursor(this.aBoolean215 ? this.anInt3182 : 0);
				return 0;
			}
		}
		if (arg1 == 101024) {
			User32.SetCursor(this.aBoolean215 ? this.anInt3182 : 0);
			return 0;
		}
		if (arg1 == 1) {
			this.anInt3183 = 0;
			this.aBoolean215 = true;
		}
		return User32.CallWindowProc(this.anInt3181, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(III)V")
	public void method2713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		User32.SetCursorPos(arg0, arg1);
	}
}
