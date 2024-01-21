import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public final class Class64 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!s", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static102.aClass64_1 == null) {
			return;
		}
		Static20.anInt582 = 0;
		@Pc(10) int local10 = arg0.getKeyCode();
		if (local10 >= 0 && Static5.anIntArray6.length > local10) {
			local10 = Static5.anIntArray6[local10];
			if ((local10 & 0x80) != 0) {
				local10 = -1;
			}
		} else {
			local10 = -1;
		}
		if (Static10.anInt234 >= 0 && local10 >= 0) {
			Static114.anIntArray300[Static10.anInt234] = local10;
			Static10.anInt234 = Static10.anInt234 + 1 & 0x7F;
			if (Static131.anInt3028 == Static10.anInt234) {
				Static10.anInt234 = -1;
			}
		}
		@Pc(77) int local77;
		if (local10 >= 0) {
			local77 = Static32.anInt886 + 1 & 0x7F;
			if (local77 != Static104.anInt2501) {
				Static109.anIntArray291[Static32.anInt886] = local10;
				Static66.anIntArray164[Static32.anInt886] = -1;
				Static32.anInt886 = local77;
			}
		}
		local77 = arg0.getModifiers();
		if ((local77 & 0xA) != 0 || local10 == 85 || local10 == 10) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!s", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static102.aClass64_1 != null) {
			Static20.anInt582 = 0;
			@Pc(6) int local6 = arg0.getKeyCode();
			if (local6 >= 0 && local6 < Static5.anIntArray6.length) {
				local6 = Static5.anIntArray6[local6] & 0xFFFFFF7F;
			} else {
				local6 = -1;
			}
			if (Static10.anInt234 >= 0 && local6 >= 0) {
				Static114.anIntArray300[Static10.anInt234] = ~local6;
				Static10.anInt234 = Static10.anInt234 + 1 & 0x7F;
				if (Static10.anInt234 == Static131.anInt3028) {
					Static10.anInt234 = -1;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!s", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!s", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static102.aClass64_1 != null) {
			Static10.anInt234 = -1;
		}
	}

	@OriginalMember(owner = "client!s", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(7) int local7 = Static85.method1497(arg0);
		if (local7 >= 0) {
			@Pc(18) int local18 = Static32.anInt886 + 1 & 0x7F;
			if (local18 != Static104.anInt2501) {
				Static109.anIntArray291[Static32.anInt886] = -1;
				Static66.anIntArray164[Static32.anInt886] = local7;
				Static32.anInt886 = local18;
			}
		}
		arg0.consume();
	}
}
