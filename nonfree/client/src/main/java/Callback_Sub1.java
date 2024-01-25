import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gda")
public final class Callback_Sub1 extends Callback {

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "Z")
	private boolean aBoolean298;

	@OriginalMember(owner = "client!gda", name = "b", descriptor = "I")
	private volatile int anInt4114;

	@OriginalMember(owner = "client!gda", name = "d", descriptor = "I")
	private int anInt4115;

	@OriginalMember(owner = "client!gda", name = "e", descriptor = "I")
	private volatile int anInt4116;

	@OriginalMember(owner = "client!gda", name = "c", descriptor = "Z")
	private volatile boolean aBoolean299 = true;

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(ILjava/awt/Component;Z)V")
	public void method3348(@OriginalArg(1) Component arg0, @OriginalArg(2) boolean arg1) {
		@Pc(3) WComponentPeer local3 = (WComponentPeer) arg0.getPeer();
		@Pc(6) int local6 = local3.getTopHwnd();
		if (this.anInt4114 == local6 && arg1 == this.aBoolean299) {
			return;
		}
		if (!this.aBoolean298) {
			this.anInt4115 = User32.LoadCursor(0, 32512);
			Root.alloc(this);
			this.aBoolean298 = true;
		}
		if (local6 != this.anInt4114) {
			if (this.anInt4114 != 0) {
				this.aBoolean299 = true;
				User32.SendMessage(local6, 101024, 0, 0);
				synchronized (this) {
					User32.SetWindowLong(this.anInt4114, -4, this.anInt4116);
				}
			}
			synchronized (this) {
				this.anInt4114 = local6;
				this.anInt4116 = User32.SetWindowLong(this.anInt4114, -4, this);
			}
		}
		this.aBoolean299 = arg1;
		User32.SendMessage(local6, 101024, 0, 0);
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(III)V")
	public void method3349(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		User32.SetCursorPos(arg1, arg0);
	}

	@OriginalMember(owner = "client!gda", name = "callback", descriptor = "(IIII)I")
	private synchronized int callback(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11;
		if (arg0 != this.anInt4114) {
			local11 = User32.GetWindowLong(arg0, -4);
			return User32.CallWindowProc(local11, arg0, arg1, arg2, arg3);
		}
		if (arg1 == 32) {
			local11 = arg3 & 0xFFFF;
			if (local11 == 1) {
				User32.SetCursor(this.aBoolean299 ? this.anInt4115 : 0);
				return 0;
			}
		}
		if (arg1 == 101024) {
			User32.SetCursor(this.aBoolean299 ? this.anInt4115 : 0);
			return 0;
		}
		if (arg1 == 1) {
			this.anInt4114 = 0;
			this.aBoolean299 = true;
		}
		return User32.CallWindowProc(this.anInt4116, arg0, arg1, arg2, arg3);
	}
}
