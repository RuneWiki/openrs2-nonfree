import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class51 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!qb", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		arg0.consume();
	}

	@OriginalMember(owner = "client!qb", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static57.aClass51_1 != null) {
			Static51.anInt1409 = -1;
		}
	}

	@OriginalMember(owner = "client!qb", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static57.aClass51_1 != null) {
			Static95.anInt2441 = 0;
			@Pc(12) int local12 = arg0.getKeyCode();
			if (local12 >= 0 && local12 < Static1.anIntArray1.length) {
				local12 = Static1.anIntArray1[local12];
				if ((local12 & 0x80) != 0) {
					local12 = -1;
				}
			} else {
				local12 = -1;
			}
			@Pc(61) int local61;
			if (local12 == 85 || local12 == 80 || local12 == 84 || local12 == 0 || local12 == 101) {
				local61 = -1;
			} else {
				local61 = Static93.method1108(arg0);
			}
			if (Static51.anInt1409 >= 0 && local12 >= 0) {
				Static33.anIntArray111[Static51.anInt1409] = local12;
				Static51.anInt1409 = Static51.anInt1409 + 1 & 0x7F;
				if (Static51.anInt1409 == Static37.anInt1042) {
					Static51.anInt1409 = -1;
				}
			}
			if (local12 >= 0 || local61 >= 0) {
				@Pc(105) int local105 = Static34.anInt1015 + 1 & 0x7F;
				if (local105 != Static96.anInt2450) {
					Static29.anIntArray95[Static34.anInt1015] = local12;
					Static80.anIntArray242[Static34.anInt1015] = local61;
					Static34.anInt1015 = local105;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!qb", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static57.aClass51_1 != null) {
			Static95.anInt2441 = 0;
			@Pc(10) int local10 = arg0.getKeyCode();
			if (local10 >= 0 && local10 < Static1.anIntArray1.length) {
				local10 = Static1.anIntArray1[local10] & 0xFFFFFF7F;
			} else {
				local10 = -1;
			}
			if (Static51.anInt1409 >= 0 && local10 >= 0) {
				Static33.anIntArray111[Static51.anInt1409] = ~local10;
				Static51.anInt1409 = Static51.anInt1409 + 1 & 0x7F;
				if (Static37.anInt1042 == Static51.anInt1409) {
					Static51.anInt1409 = -1;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!qb", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}
}
