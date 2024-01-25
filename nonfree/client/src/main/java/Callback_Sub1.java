import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kea")
public final class Callback_Sub1 extends Callback {

	@OriginalMember(owner = "client!kea", name = "b", descriptor = "I")
	private volatile int anInt6007;

	@OriginalMember(owner = "client!kea", name = "c", descriptor = "I")
	private int anInt6008;

	@OriginalMember(owner = "client!kea", name = "d", descriptor = "Z")
	private boolean aBoolean470;

	@OriginalMember(owner = "client!kea", name = "e", descriptor = "I")
	private volatile int anInt6009;

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "Z")
	private volatile boolean aBoolean469 = true;

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(III)V")
	public void method5013(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		User32.SetCursorPos(arg1, arg0);
	}

	@OriginalMember(owner = "client!kea", name = "callback", descriptor = "(IIII)I")
	private synchronized int callback(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11;
		if (arg0 != this.anInt6007) {
			local11 = User32.GetWindowLong(arg0, -4);
			return User32.CallWindowProc(local11, arg0, arg1, arg2, arg3);
		}
		if (arg1 == 32) {
			local11 = arg3 & 0xFFFF;
			if (local11 == 1) {
				User32.SetCursor(this.aBoolean469 ? this.anInt6008 : 0);
				return 0;
			}
		}
		if (arg1 == 101024) {
			User32.SetCursor(this.aBoolean469 ? this.anInt6008 : 0);
			return 0;
		}
		if (arg1 == 1) {
			this.anInt6007 = 0;
			this.aBoolean469 = true;
		}
		return User32.CallWindowProc(this.anInt6009, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(ZLjava/awt/Component;B)V")
	public void method5014(@OriginalArg(0) boolean arg0, @OriginalArg(1) Component arg1) {
		@Pc(3) WComponentPeer local3 = (WComponentPeer) arg1.getPeer();
		@Pc(14) int local14 = local3.getTopHwnd();
		if (this.anInt6007 == local14 && this.aBoolean469 == arg0) {
			return;
		}
		if (!this.aBoolean470) {
			this.anInt6008 = User32.LoadCursor(0, 32512);
			Root.alloc(this);
			this.aBoolean470 = true;
		}
		if (this.anInt6007 != local14) {
			if (this.anInt6007 != 0) {
				this.aBoolean469 = true;
				User32.SendMessage(local14, 101024, 0, 0);
				synchronized (this) {
					User32.SetWindowLong(this.anInt6007, -4, this.anInt6009);
				}
			}
			synchronized (this) {
				this.anInt6007 = local14;
				this.anInt6009 = User32.SetWindowLong(this.anInt6007, -4, this);
			}
		}
		this.aBoolean469 = arg0;
		User32.SendMessage(local14, 101024, 0, 0);
	}
}
