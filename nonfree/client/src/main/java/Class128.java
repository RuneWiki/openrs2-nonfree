import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oj")
public final class Class128 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!oj", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static165.aClass128_1 != null) {
			Static70.anInt1540 = -1;
		}
	}

	@OriginalMember(owner = "client!oj", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		if (Static165.aClass128_1 != null) {
			@Pc(9) char local9 = arg0.getKeyChar();
			if (local9 != '\u0000' && local9 != '\uffff' && Static59.method1131(local9)) {
				@Pc(24) int local24 = Static196.anInt4105 + 1 & 0x7F;
				if (local24 != Static242.anInt4899) {
					Static196.anIntArray340[Static196.anInt4105] = -1;
					Static203.aCharArray5[Static196.anInt4105] = local9;
					Static196.anInt4105 = local24;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!oj", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static165.aClass128_1 == null) {
			return;
		}
		Static17.anInt419 = 0;
		@Pc(12) int local12 = arg0.getKeyCode();
		if (local12 >= 0 && local12 < Static103.anIntArray160.length) {
			local12 = Static103.anIntArray160[local12];
			if ((local12 & 0x80) != 0) {
				local12 = -1;
			}
		} else {
			local12 = -1;
		}
		if (Static70.anInt1540 >= 0 && local12 >= 0) {
			Static271.anIntArray496[Static70.anInt1540] = local12;
			Static70.anInt1540 = Static70.anInt1540 + 1 & 0x7F;
			if (Static70.anInt1540 == Static110.anInt2379) {
				Static70.anInt1540 = -1;
			}
		}
		@Pc(69) int local69;
		if (local12 >= 0) {
			local69 = Static196.anInt4105 + 1 & 0x7F;
			if (local69 != Static242.anInt4899) {
				Static196.anIntArray340[Static196.anInt4105] = local12;
				Static203.aCharArray5[Static196.anInt4105] = '\u0000';
				Static196.anInt4105 = local69;
			}
		}
		local69 = arg0.getModifiers();
		if ((local69 & 0xA) != 0 || local12 == 85 || local12 == 10) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!oj", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!oj", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static165.aClass128_1 != null) {
			Static17.anInt419 = 0;
			@Pc(7) int local7 = arg0.getKeyCode();
			if (local7 >= 0 && local7 < Static103.anIntArray160.length) {
				local7 = Static103.anIntArray160[local7] & 0xFFFFFF7F;
			} else {
				local7 = -1;
			}
			if (Static70.anInt1540 >= 0 && local7 >= 0) {
				Static271.anIntArray496[Static70.anInt1540] = ~local7;
				Static70.anInt1540 = Static70.anInt1540 + 1 & 0x7F;
				if (Static70.anInt1540 == Static110.anInt2379) {
					Static70.anInt1540 = -1;
				}
			}
		}
		arg0.consume();
	}
}
