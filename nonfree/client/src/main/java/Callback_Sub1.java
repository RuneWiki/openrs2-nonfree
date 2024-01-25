import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public final class Callback_Sub1 extends Callback {

	@OriginalMember(owner = "client!o", name = "a", descriptor = "Z")
	private boolean aBoolean521;

	@OriginalMember(owner = "client!o", name = "b", descriptor = "I")
	private volatile int anInt6303;

	@OriginalMember(owner = "client!o", name = "c", descriptor = "I")
	private volatile int anInt6304;

	@OriginalMember(owner = "client!o", name = "d", descriptor = "I")
	private int anInt6305;

	@OriginalMember(owner = "client!o", name = "e", descriptor = "Z")
	private volatile boolean aBoolean522 = true;

	@OriginalMember(owner = "client!o", name = "callback", descriptor = "(IIII)I")
	private synchronized int callback(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11;
		if (this.anInt6304 != arg0) {
			local11 = User32.GetWindowLong(arg0, -4);
			return User32.CallWindowProc(local11, arg0, arg1, arg2, arg3);
		}
		if (arg1 == 32) {
			local11 = arg3 & 0xFFFF;
			if (local11 == 1) {
				User32.SetCursor(this.aBoolean522 ? this.anInt6305 : 0);
				return 0;
			}
		}
		if (arg1 == 101024) {
			User32.SetCursor(this.aBoolean522 ? this.anInt6305 : 0);
			return 0;
		}
		if (arg1 == 1) {
			this.anInt6304 = 0;
			this.aBoolean522 = true;
		}
		return User32.CallWindowProc(this.anInt6303, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(III)V")
	public void method5462(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		User32.SetCursorPos(arg0, arg1);
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ZLjava/awt/Component;B)V")
	public void method5463(@OriginalArg(0) boolean arg0, @OriginalArg(1) Component arg1) {
		@Pc(3) WComponentPeer local3 = (WComponentPeer) arg1.getPeer();
		@Pc(6) int local6 = local3.getTopHwnd();
		if (local6 == this.anInt6304 && arg0 == this.aBoolean522) {
			return;
		}
		if (!this.aBoolean521) {
			this.anInt6305 = User32.LoadCursor(0, 32512);
			Root.alloc(this);
			this.aBoolean521 = true;
		}
		if (this.anInt6304 != local6) {
			if (this.anInt6304 != 0) {
				this.aBoolean522 = true;
				User32.SendMessage(local6, 101024, 0, 0);
				synchronized (this) {
					User32.SetWindowLong(this.anInt6304, -4, this.anInt6303);
				}
			}
			synchronized (this) {
				this.anInt6304 = local6;
				this.anInt6303 = User32.SetWindowLong(this.anInt6304, -4, this);
			}
		}
		this.aBoolean522 = arg0;
		User32.SendMessage(local6, 101024, 0, 0);
	}
}
