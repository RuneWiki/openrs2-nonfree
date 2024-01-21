import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public final class Class46 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!o", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!o", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		arg0.consume();
	}

	@OriginalMember(owner = "client!o", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static107.aClass46_29 != null) {
			Static95.anInt2468 = 0;
			@Pc(6) int local6 = arg0.getKeyCode();
			if (local6 >= 0 && local6 < Static43.anIntArray163.length) {
				local6 = Static43.anIntArray163[local6] & 0xFFFFFF7F;
			} else {
				local6 = -1;
			}
			if (Static62.anInt1471 >= 0 && local6 >= 0) {
				Static104.anIntArray399[Static62.anInt1471] = ~local6;
				Static62.anInt1471 = Static62.anInt1471 + 1 & 0x7F;
				if (Static62.anInt1471 == Static68.anInt1670) {
					Static62.anInt1471 = -1;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!o", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static107.aClass46_29 != null) {
			Static62.anInt1471 = -1;
		}
	}

	@OriginalMember(owner = "client!o", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static107.aClass46_29 != null) {
			Static95.anInt2468 = 0;
			@Pc(12) int local12 = arg0.getKeyCode();
			if (local12 >= 0 && local12 < Static43.anIntArray163.length) {
				local12 = Static43.anIntArray163[local12];
				if ((local12 & 0x80) != 0) {
					local12 = -1;
				}
			} else {
				local12 = -1;
			}
			@Pc(60) int local60;
			if (local12 == 85 || local12 == 80 || local12 == 84 || local12 == 0 || local12 == 101) {
				local60 = -1;
			} else {
				local60 = Static42.method1756(arg0);
			}
			if (Static62.anInt1471 >= 0 && local12 >= 0) {
				Static104.anIntArray399[Static62.anInt1471] = local12;
				Static62.anInt1471 = Static62.anInt1471 + 1 & 0x7F;
				if (Static62.anInt1471 == Static68.anInt1670) {
					Static62.anInt1471 = -1;
				}
			}
			if (local12 >= 0 || local60 >= 0) {
				@Pc(108) int local108 = Static18.anInt615 + 1 & 0x7F;
				if (local108 != Static108.anInt2746) {
					Static57.anIntArray401[Static18.anInt615] = local12;
					Static12.anIntArray35[Static18.anInt615] = local60;
					Static18.anInt615 = local108;
				}
			}
		}
		arg0.consume();
	}
}
