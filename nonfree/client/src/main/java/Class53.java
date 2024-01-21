import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class53 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!le", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static120.aClass53_1 == null) {
			return;
		}
		Static91.anInt2182 = 0;
		@Pc(6) int local6 = arg0.getKeyCode();
		if (local6 >= 0 && Static108.anIntArray300.length > local6) {
			local6 = Static108.anIntArray300[local6];
			if ((local6 & 0x80) != 0) {
				local6 = -1;
			}
		} else {
			local6 = -1;
		}
		if (Static180.anInt3907 >= 0 && local6 >= 0) {
			Static72.anIntArray196[Static180.anInt3907] = local6;
			Static180.anInt3907 = Static180.anInt3907 + 1 & 0x7F;
			if (Static180.anInt3907 == Static174.anInt3885) {
				Static180.anInt3907 = -1;
			}
		}
		@Pc(67) int local67;
		if (local6 >= 0) {
			local67 = Static119.anInt2957 + 1 & 0x7F;
			if (local67 != Static127.anInt3145) {
				Static196.anIntArray484[Static119.anInt2957] = local6;
				Static81.anIntArray226[Static119.anInt2957] = -1;
				Static119.anInt2957 = local67;
			}
		}
		local67 = arg0.getModifiers();
		if ((local67 & 0xA) != 0 || local6 == 85 || local6 == 10) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!le", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!le", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		if (Static120.aClass53_1 != null) {
			@Pc(5) int local5 = Static61.method1073(arg0);
			if (local5 >= 0) {
				@Pc(16) int local16 = Static119.anInt2957 + 1 & 0x7F;
				if (Static127.anInt3145 != local16) {
					Static196.anIntArray484[Static119.anInt2957] = -1;
					Static81.anIntArray226[Static119.anInt2957] = local5;
					Static119.anInt2957 = local16;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!le", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static120.aClass53_1 != null) {
			Static180.anInt3907 = -1;
		}
	}

	@OriginalMember(owner = "client!le", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static120.aClass53_1 != null) {
			Static91.anInt2182 = 0;
			@Pc(10) int local10 = arg0.getKeyCode();
			if (local10 >= 0 && Static108.anIntArray300.length > local10) {
				local10 = Static108.anIntArray300[local10] & 0xFFFFFF7F;
			} else {
				local10 = -1;
			}
			if (Static180.anInt3907 >= 0 && local10 >= 0) {
				Static72.anIntArray196[Static180.anInt3907] = ~local10;
				Static180.anInt3907 = Static180.anInt3907 + 1 & 0x7F;
				if (Static180.anInt3907 == Static174.anInt3885) {
					Static180.anInt3907 = -1;
				}
			}
		}
		arg0.consume();
	}
}
