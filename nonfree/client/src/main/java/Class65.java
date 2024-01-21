import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public final class Class65 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!s", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static65.aClass65_1 != null) {
			Static32.anInt1130 = 0;
			@Pc(6) int local6 = arg0.getKeyCode();
			if (local6 >= 0 && local6 < Static84.anIntArray279.length) {
				local6 = Static84.anIntArray279[local6] & 0xFFFFFF7F;
			} else {
				local6 = -1;
			}
			if (Static44.anInt1399 >= 0 && local6 >= 0) {
				Static37.anIntArray139[Static44.anInt1399] = ~local6;
				Static44.anInt1399 = Static44.anInt1399 + 1 & 0x7F;
				if (Static13.anInt430 == Static44.anInt1399) {
					Static44.anInt1399 = -1;
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
		if (Static65.aClass65_1 != null) {
			Static44.anInt1399 = -1;
		}
	}

	@OriginalMember(owner = "client!s", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		arg0.consume();
	}

	@OriginalMember(owner = "client!s", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static65.aClass65_1 != null) {
			Static32.anInt1130 = 0;
			@Pc(8) int local8 = arg0.getKeyCode();
			if (local8 >= 0 && Static84.anIntArray279.length > local8) {
				local8 = Static84.anIntArray279[local8];
				if ((local8 & 0x80) != 0) {
					local8 = -1;
				}
			} else {
				local8 = -1;
			}
			@Pc(50) int local50;
			if (local8 == 85 || local8 == 80 || local8 == 84 || local8 == 0 || local8 == 101) {
				local50 = -1;
			} else {
				local50 = Static69.method1359(arg0);
			}
			if (Static44.anInt1399 >= 0 && local8 >= 0) {
				Static37.anIntArray139[Static44.anInt1399] = local8;
				Static44.anInt1399 = Static44.anInt1399 + 1 & 0x7F;
				if (Static13.anInt430 == Static44.anInt1399) {
					Static44.anInt1399 = -1;
				}
			}
			if (local8 >= 0 || local50 >= 0) {
				@Pc(91) int local91 = Static35.anInt1174 + 1 & 0x7F;
				if (Static98.anInt2755 != local91) {
					Static58.anIntArray187[Static35.anInt1174] = local8;
					Static119.anIntArray359[Static35.anInt1174] = local50;
					Static35.anInt1174 = local91;
				}
			}
		}
		arg0.consume();
	}
}
