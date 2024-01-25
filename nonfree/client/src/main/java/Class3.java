import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ab")
public final class Class3 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!ab", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!ab", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		if (Static224.aClass3_1 != null) {
			@Pc(8) char local8 = arg0.getKeyChar();
			if (local8 != '\u0000' && local8 != '\uffff' && Static175.method3143(local8)) {
				@Pc(26) int local26 = Static165.anInt3407 + 1 & 0x7F;
				if (local26 != Static347.anInt6680) {
					Static291.anIntArray566[Static165.anInt3407] = -1;
					Static76.aCharArray1[Static165.anInt3407] = local8;
					Static165.anInt3407 = local26;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!ab", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static224.aClass3_1 == null) {
			return;
		}
		Static174.anInt5783 = 0;
		@Pc(10) int local10 = arg0.getKeyCode();
		if (local10 >= 0 && local10 < Static276.anIntArray550.length) {
			local10 = Static276.anIntArray550[local10];
			if ((local10 & 0x80) != 0) {
				local10 = -1;
			}
		} else {
			local10 = -1;
		}
		if (Static94.anInt1779 >= 0 && local10 >= 0) {
			Static149.anIntArray299[Static94.anInt1779] = local10;
			Static94.anInt1779 = Static94.anInt1779 + 1 & 0x7F;
			if (Static129.anInt2575 == Static94.anInt1779) {
				Static94.anInt1779 = -1;
			}
		}
		@Pc(63) int local63;
		if (local10 >= 0) {
			local63 = Static165.anInt3407 + 1 & 0x7F;
			if (Static347.anInt6680 != local63) {
				Static291.anIntArray566[Static165.anInt3407] = local10;
				Static76.aCharArray1[Static165.anInt3407] = '\u0000';
				Static165.anInt3407 = local63;
			}
		}
		local63 = arg0.getModifiers();
		if ((local63 & 0xA) != 0 || local10 == 85 || local10 == 10) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ab", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static224.aClass3_1 != null) {
			Static94.anInt1779 = -1;
		}
	}

	@OriginalMember(owner = "client!ab", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static224.aClass3_1 != null) {
			Static174.anInt5783 = 0;
			@Pc(6) int local6 = arg0.getKeyCode();
			if (local6 >= 0 && local6 < Static276.anIntArray550.length) {
				local6 = Static276.anIntArray550[local6] & 0xFFFFFF7F;
			} else {
				local6 = -1;
			}
			if (Static94.anInt1779 >= 0 && local6 >= 0) {
				Static149.anIntArray299[Static94.anInt1779] = ~local6;
				Static94.anInt1779 = Static94.anInt1779 + 1 & 0x7F;
				if (Static129.anInt2575 == Static94.anInt1779) {
					Static94.anInt1779 = -1;
				}
			}
		}
		arg0.consume();
	}
}
