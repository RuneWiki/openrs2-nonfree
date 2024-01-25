import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Class156 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!pe", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static308.aClass156_1 == null) {
			return;
		}
		Static71.anInt5338 = 0;
		@Pc(6) int local6 = arg0.getKeyCode();
		if (local6 >= 0 && Static255.anIntArray506.length > local6) {
			local6 = Static255.anIntArray506[local6];
			if ((local6 & 0x80) != 0) {
				local6 = -1;
			}
		} else {
			local6 = -1;
		}
		if (Static203.anInt4174 >= 0 && local6 >= 0) {
			Static244.anIntArray394[Static203.anInt4174] = local6;
			Static203.anInt4174 = Static203.anInt4174 + 1 & 0x7F;
			if (Static113.anInt6408 == Static203.anInt4174) {
				Static203.anInt4174 = -1;
			}
		}
		@Pc(62) int local62;
		if (local6 >= 0) {
			local62 = Static47.anInt1041 + 1 & 0x7F;
			if (local62 != Static322.anInt6238) {
				Static188.anIntArray303[Static47.anInt1041] = local6;
				Static126.aCharArray6[Static47.anInt1041] = '\u0000';
				Static47.anInt1041 = local62;
			}
		}
		local62 = arg0.getModifiers();
		if ((local62 & 0xA) != 0 || local6 == 85 || local6 == 10) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!pe", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		if (Static308.aClass156_1 != null) {
			@Pc(4) char local4 = arg0.getKeyChar();
			if (local4 != '\u0000' && local4 != '\uffff' && Static93.method1570(local4)) {
				@Pc(21) int local21 = Static47.anInt1041 + 1 & 0x7F;
				if (Static322.anInt6238 != local21) {
					Static188.anIntArray303[Static47.anInt1041] = -1;
					Static126.aCharArray6[Static47.anInt1041] = local4;
					Static47.anInt1041 = local21;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!pe", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!pe", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static308.aClass156_1 != null) {
			Static71.anInt5338 = 0;
			@Pc(6) int local6 = arg0.getKeyCode();
			if (local6 >= 0 && Static255.anIntArray506.length > local6) {
				local6 = Static255.anIntArray506[local6] & 0xFFFFFF7F;
			} else {
				local6 = -1;
			}
			if (Static203.anInt4174 >= 0 && local6 >= 0) {
				Static244.anIntArray394[Static203.anInt4174] = ~local6;
				Static203.anInt4174 = Static203.anInt4174 + 1 & 0x7F;
				if (Static203.anInt4174 == Static113.anInt6408) {
					Static203.anInt4174 = -1;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!pe", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static308.aClass156_1 != null) {
			Static203.anInt4174 = -1;
		}
	}
}
