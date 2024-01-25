import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ofa")
public final class Callback_Sub1 extends Callback {

	@OriginalMember(owner = "client!ofa", name = "e", descriptor = "Z")
	private boolean aBoolean513;

	@OriginalMember(owner = "client!ofa", name = "b", descriptor = "I")
	private volatile int anInt7323;

	@OriginalMember(owner = "client!ofa", name = "d", descriptor = "I")
	private volatile int anInt7324;

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "I")
	private int anInt7325;

	@OriginalMember(owner = "client!ofa", name = "c", descriptor = "Z")
	private volatile boolean aBoolean514 = true;

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(Ljava/awt/Component;IZ)V")
	public void method6482(@OriginalArg(0) Component arg0, @OriginalArg(2) boolean arg1) {
		@Pc(3) WComponentPeer local3 = (WComponentPeer) arg0.getPeer();
		@Pc(6) int local6 = local3.getTopHwnd();
		if (local6 == this.anInt7324 && arg1 == this.aBoolean514) {
			return;
		}
		if (!this.aBoolean513) {
			this.anInt7325 = User32.LoadCursor(0, 32512);
			Root.alloc(this);
			this.aBoolean513 = true;
		}
		if (this.anInt7324 != local6) {
			if (this.anInt7324 != 0) {
				this.aBoolean514 = true;
				User32.SendMessage(local6, 101024, 0, 0);
				synchronized (this) {
					User32.SetWindowLong(this.anInt7324, -4, this.anInt7323);
				}
			}
			synchronized (this) {
				this.anInt7324 = local6;
				this.anInt7323 = User32.SetWindowLong(this.anInt7324, -4, this);
			}
		}
		this.aBoolean514 = arg1;
		User32.SendMessage(local6, 101024, 0, 0);
	}

	@OriginalMember(owner = "client!ofa", name = "callback", descriptor = "(IIII)I")
	private synchronized int callback(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		if (this.anInt7324 != arg0) {
			local7 = User32.GetWindowLong(arg0, -4);
			return User32.CallWindowProc(local7, arg0, arg1, arg2, arg3);
		}
		if (arg1 == 32) {
			local7 = arg3 & 0xFFFF;
			if (local7 == 1) {
				User32.SetCursor(this.aBoolean514 ? this.anInt7325 : 0);
				return 0;
			}
		}
		if (arg1 == 101024) {
			User32.SetCursor(this.aBoolean514 ? this.anInt7325 : 0);
			return 0;
		}
		if (arg1 == 1) {
			this.anInt7324 = 0;
			this.aBoolean514 = true;
		}
		return User32.CallWindowProc(this.anInt7323, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(ZII)V")
	public void method6483(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		User32.SetCursorPos(arg1, arg0);
	}
}
