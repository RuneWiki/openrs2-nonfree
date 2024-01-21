import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class Class43 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!kc", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static96.aClass43_1 != null) {
			Static37.anInt814 = 0;
			@Pc(6) int local6 = arg0.getKeyCode();
			if (local6 >= 0 && Static32.anIntArray98.length > local6) {
				local6 = Static32.anIntArray98[local6] & 0xFFFFFF7F;
			} else {
				local6 = -1;
			}
			if (Static46.anInt1105 >= 0 && local6 >= 0) {
				Static50.anIntArray155[Static46.anInt1105] = ~local6;
				Static46.anInt1105 = Static46.anInt1105 + 1 & 0x7F;
				if (Static46.anInt1105 == Static28.anInt694) {
					Static46.anInt1105 = -1;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!kc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static96.aClass43_1 != null) {
			Static46.anInt1105 = -1;
		}
	}

	@OriginalMember(owner = "client!kc", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static96.aClass43_1 == null) {
			return;
		}
		Static37.anInt814 = 0;
		@Pc(6) int local6 = arg0.getKeyCode();
		if (local6 >= 0 && local6 < Static32.anIntArray98.length) {
			local6 = Static32.anIntArray98[local6];
			if ((local6 & 0x80) != 0) {
				local6 = -1;
			}
		} else {
			local6 = -1;
		}
		if (Static46.anInt1105 >= 0 && local6 >= 0) {
			Static50.anIntArray155[Static46.anInt1105] = local6;
			Static46.anInt1105 = Static46.anInt1105 + 1 & 0x7F;
			if (Static28.anInt694 == Static46.anInt1105) {
				Static46.anInt1105 = -1;
			}
		}
		@Pc(70) int local70;
		if (local6 >= 0) {
			local70 = Static134.anInt2942 + 1 & 0x7F;
			if (local70 != Static68.anInt2857) {
				Static70.anIntArray196[Static134.anInt2942] = local6;
				Static132.anIntArray412[Static134.anInt2942] = -1;
				Static134.anInt2942 = local70;
			}
		}
		local70 = arg0.getModifiers();
		if ((local70 & 0xA) != 0 || local6 == 85 || local6 == 10) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!kc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!kc", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(7) int local7 = Static73.method1251(arg0);
		if (local7 >= 0) {
			@Pc(15) int local15 = Static134.anInt2942 + 1 & 0x7F;
			if (Static68.anInt2857 != local15) {
				Static70.anIntArray196[Static134.anInt2942] = -1;
				Static132.anIntArray412[Static134.anInt2942] = local7;
				Static134.anInt2942 = local15;
			}
		}
		arg0.consume();
	}
}
