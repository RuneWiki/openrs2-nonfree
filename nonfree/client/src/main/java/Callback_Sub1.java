import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ew")
public final class Callback_Sub1 extends Callback {

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "I")
	private volatile int anInt2442;

	@OriginalMember(owner = "client!ew", name = "b", descriptor = "I")
	private int anInt2443;

	@OriginalMember(owner = "client!ew", name = "c", descriptor = "I")
	private volatile int anInt2444;

	@OriginalMember(owner = "client!ew", name = "d", descriptor = "Z")
	private boolean aBoolean157;

	@OriginalMember(owner = "client!ew", name = "e", descriptor = "Z")
	private volatile boolean aBoolean158 = true;

	@OriginalMember(owner = "client!ew", name = "callback", descriptor = "(IIII)I")
	private synchronized int callback(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		if (arg0 != this.anInt2444) {
			local7 = User32.GetWindowLong(arg0, -4);
			return User32.CallWindowProc(local7, arg0, arg1, arg2, arg3);
		}
		if (arg1 == 32) {
			local7 = arg3 & 0xFFFF;
			if (local7 == 1) {
				User32.SetCursor(this.aBoolean158 ? this.anInt2443 : 0);
				return 0;
			}
		}
		if (arg1 == 101024) {
			User32.SetCursor(this.aBoolean158 ? this.anInt2443 : 0);
			return 0;
		}
		if (arg1 == 1) {
			this.anInt2444 = 0;
			this.aBoolean158 = true;
		}
		return User32.CallWindowProc(this.anInt2442, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(ZILjava/awt/Component;)V")
	public void method2095(@OriginalArg(0) boolean arg0, @OriginalArg(2) Component arg1) {
		@Pc(3) WComponentPeer local3 = (WComponentPeer) arg1.getPeer();
		@Pc(6) int local6 = local3.getTopHwnd();
		if (this.anInt2444 == local6 && arg0 == this.aBoolean158) {
			return;
		}
		if (!this.aBoolean157) {
			this.anInt2443 = User32.LoadCursor(0, 32512);
			Root.alloc(this);
			this.aBoolean157 = true;
		}
		if (local6 != this.anInt2444) {
			if (this.anInt2444 != 0) {
				this.aBoolean158 = true;
				User32.SendMessage(local6, 101024, 0, 0);
				synchronized (this) {
					User32.SetWindowLong(this.anInt2444, -4, this.anInt2442);
				}
			}
			synchronized (this) {
				this.anInt2444 = local6;
				this.anInt2442 = User32.SetWindowLong(this.anInt2444, -4, this);
			}
		}
		this.aBoolean158 = arg0;
		User32.SendMessage(local6, 101024, 0, 0);
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(III)V")
	public void method2096(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		User32.SetCursorPos(arg1, arg0);
	}
}
