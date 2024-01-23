import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ef")
public final class Class47 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!ef", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		if (Static266.aClass47_1 != null) {
			@Pc(5) char local5 = arg0.getKeyChar();
			if (local5 != '\u0000' && local5 != '\uffff' && Static133.method2169(local5)) {
				@Pc(22) int local22 = Static82.anInt1790 + 1 & 0x7F;
				if (Static210.anInt4476 != local22) {
					Static157.anIntArray498[Static82.anInt1790] = -1;
					Static207.aCharArray5[Static82.anInt1790] = local5;
					Static82.anInt1790 = local22;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!ef", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static266.aClass47_1 != null) {
			Static30.anInt733 = 0;
			@Pc(7) int local7 = arg0.getKeyCode();
			if (local7 >= 0 && local7 < Static49.anIntArray75.length) {
				local7 = Static49.anIntArray75[local7] & 0xFFFFFF7F;
			} else {
				local7 = -1;
			}
			if (Static51.anInt1122 >= 0 && local7 >= 0) {
				Static125.anIntArray199[Static51.anInt1122] = ~local7;
				Static51.anInt1122 = Static51.anInt1122 + 1 & 0x7F;
				if (Static192.anInt3877 == Static51.anInt1122) {
					Static51.anInt1122 = -1;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!ef", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static266.aClass47_1 != null) {
			Static51.anInt1122 = -1;
		}
	}

	@OriginalMember(owner = "client!ef", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!ef", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static266.aClass47_1 == null) {
			return;
		}
		Static30.anInt733 = 0;
		@Pc(12) int local12 = arg0.getKeyCode();
		if (local12 >= 0 && Static49.anIntArray75.length > local12) {
			local12 = Static49.anIntArray75[local12];
			if ((local12 & 0x80) != 0) {
				local12 = -1;
			}
		} else {
			local12 = -1;
		}
		if (Static51.anInt1122 >= 0 && local12 >= 0) {
			Static125.anIntArray199[Static51.anInt1122] = local12;
			Static51.anInt1122 = Static51.anInt1122 + 1 & 0x7F;
			if (Static51.anInt1122 == Static192.anInt3877) {
				Static51.anInt1122 = -1;
			}
		}
		@Pc(71) int local71;
		if (local12 >= 0) {
			local71 = Static82.anInt1790 + 1 & 0x7F;
			if (Static210.anInt4476 != local71) {
				Static157.anIntArray498[Static82.anInt1790] = local12;
				Static207.aCharArray5[Static82.anInt1790] = '\u0000';
				Static82.anInt1790 = local71;
			}
		}
		local71 = arg0.getModifiers();
		if ((local71 & 0xA) != 0 || local12 == 85 || local12 == 10) {
			arg0.consume();
		}
	}
}
