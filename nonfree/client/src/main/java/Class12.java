import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public final class Class12 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!cd", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static13.aClass12_1 != null) {
			Static79.anInt2303 = -1;
		}
	}

	@OriginalMember(owner = "client!cd", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static13.aClass12_1 != null) {
			Static39.anInt1458 = 0;
			@Pc(10) int local10 = arg0.getKeyCode();
			if (local10 >= 0 && Static65.anIntArray300.length > local10) {
				local10 = Static65.anIntArray300[local10] & 0xFFFFFF7F;
			} else {
				local10 = -1;
			}
			if (Static79.anInt2303 >= 0 && local10 >= 0) {
				Static28.anIntArray141[Static79.anInt2303] = ~local10;
				Static79.anInt2303 = Static79.anInt2303 + 1 & 0x7F;
				if (Static95.anInt2569 == Static79.anInt2303) {
					Static79.anInt2303 = -1;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!cd", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		arg0.consume();
	}

	@OriginalMember(owner = "client!cd", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static13.aClass12_1 != null) {
			Static39.anInt1458 = 0;
			@Pc(12) int local12 = arg0.getKeyCode();
			if (local12 >= 0 && Static65.anIntArray300.length > local12) {
				local12 = Static65.anIntArray300[local12];
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
				local61 = Static65.method1339(arg0);
			}
			if (Static79.anInt2303 >= 0 && local12 >= 0) {
				Static28.anIntArray141[Static79.anInt2303] = local12;
				Static79.anInt2303 = Static79.anInt2303 + 1 & 0x7F;
				if (Static95.anInt2569 == Static79.anInt2303) {
					Static79.anInt2303 = -1;
				}
			}
			if (local12 >= 0 || local61 >= 0) {
				@Pc(97) int local97 = Static77.anInt2275 + 1 & 0x7F;
				if (local97 != Static38.anInt1429) {
					Static16.anIntArray94[Static77.anInt2275] = local12;
					Static79.anIntArray324[Static77.anInt2275] = local61;
					Static77.anInt2275 = local97;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!cd", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}
}
