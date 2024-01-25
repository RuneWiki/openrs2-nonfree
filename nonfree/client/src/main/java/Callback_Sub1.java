import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nr")
public final class Callback_Sub1 extends Callback {

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "I")
	private volatile int anInt7102;

	@OriginalMember(owner = "client!nr", name = "c", descriptor = "I")
	private int anInt7103;

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "Z")
	private boolean aBoolean529;

	@OriginalMember(owner = "client!nr", name = "d", descriptor = "I")
	private volatile int anInt7104;

	@OriginalMember(owner = "client!nr", name = "e", descriptor = "Z")
	private volatile boolean aBoolean530 = true;

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(ILjava/awt/Component;Z)V")
	public void method6252(@OriginalArg(1) Component arg0, @OriginalArg(2) boolean arg1) {
		@Pc(3) WComponentPeer local3 = (WComponentPeer) arg0.getPeer();
		@Pc(11) int local11 = local3.getTopHwnd();
		if (local11 == this.anInt7104 && this.aBoolean530 == arg1) {
			return;
		}
		if (!this.aBoolean529) {
			this.anInt7103 = User32.LoadCursor(0, 32512);
			Root.alloc(this);
			this.aBoolean529 = true;
		}
		if (this.anInt7104 != local11) {
			if (this.anInt7104 != 0) {
				this.aBoolean530 = true;
				User32.SendMessage(local11, 101024, 0, 0);
				synchronized (this) {
					User32.SetWindowLong(this.anInt7104, -4, this.anInt7102);
				}
			}
			synchronized (this) {
				this.anInt7104 = local11;
				this.anInt7102 = User32.SetWindowLong(this.anInt7104, -4, this);
			}
		}
		this.aBoolean530 = arg1;
		User32.SendMessage(local11, 101024, 0, 0);
	}

	@OriginalMember(owner = "client!nr", name = "callback", descriptor = "(IIII)I")
	private synchronized int callback(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		if (arg0 != this.anInt7104) {
			local7 = User32.GetWindowLong(arg0, -4);
			return User32.CallWindowProc(local7, arg0, arg1, arg2, arg3);
		}
		if (arg1 == 32) {
			local7 = arg3 & 0xFFFF;
			if (local7 == 1) {
				User32.SetCursor(this.aBoolean530 ? this.anInt7103 : 0);
				return 0;
			}
		}
		if (arg1 == 101024) {
			User32.SetCursor(this.aBoolean530 ? this.anInt7103 : 0);
			return 0;
		}
		if (arg1 == 1) {
			this.anInt7104 = 0;
			this.aBoolean530 = true;
		}
		return User32.CallWindowProc(this.anInt7102, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(IIB)V")
	public void method6253(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		User32.SetCursorPos(arg1, arg0);
	}
}
