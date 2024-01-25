import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iea")
public final class Callback_Sub1 extends Callback {

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "I")
	private volatile int anInt4427;

	@OriginalMember(owner = "client!iea", name = "c", descriptor = "I")
	private int anInt4428;

	@OriginalMember(owner = "client!iea", name = "d", descriptor = "Z")
	private boolean aBoolean327;

	@OriginalMember(owner = "client!iea", name = "e", descriptor = "I")
	private volatile int anInt4429;

	@OriginalMember(owner = "client!iea", name = "b", descriptor = "Z")
	private volatile boolean aBoolean326 = true;

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(ILjava/awt/Component;Z)V")
	public void method3743(@OriginalArg(1) Component arg0, @OriginalArg(2) boolean arg1) {
		@Pc(3) WComponentPeer local3 = (WComponentPeer) arg0.getPeer();
		@Pc(6) int local6 = local3.getTopHwnd();
		if (local6 == this.anInt4429 && arg1 == this.aBoolean326) {
			return;
		}
		if (!this.aBoolean327) {
			this.anInt4428 = User32.LoadCursor(0, 32512);
			Root.alloc(this);
			this.aBoolean327 = true;
		}
		if (local6 != this.anInt4429) {
			if (this.anInt4429 != 0) {
				this.aBoolean326 = true;
				User32.SendMessage(local6, 101024, 0, 0);
				synchronized (this) {
					User32.SetWindowLong(this.anInt4429, -4, this.anInt4427);
				}
			}
			synchronized (this) {
				this.anInt4429 = local6;
				this.anInt4427 = User32.SetWindowLong(this.anInt4429, -4, this);
			}
		}
		this.aBoolean326 = arg1;
		User32.SendMessage(local6, 101024, 0, 0);
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(IZI)V")
	public void method3744(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		User32.SetCursorPos(arg1, arg0);
	}

	@OriginalMember(owner = "client!iea", name = "callback", descriptor = "(IIII)I")
	private synchronized int callback(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11;
		if (arg0 != this.anInt4429) {
			local11 = User32.GetWindowLong(arg0, -4);
			return User32.CallWindowProc(local11, arg0, arg1, arg2, arg3);
		}
		if (arg1 == 32) {
			local11 = arg3 & 0xFFFF;
			if (local11 == 1) {
				User32.SetCursor(this.aBoolean326 ? this.anInt4428 : 0);
				return 0;
			}
		}
		if (arg1 == 101024) {
			User32.SetCursor(this.aBoolean326 ? this.anInt4428 : 0);
			return 0;
		}
		if (arg1 == 1) {
			this.anInt4429 = 0;
			this.aBoolean326 = true;
		}
		return User32.CallWindowProc(this.anInt4427, arg0, arg1, arg2, arg3);
	}
}
