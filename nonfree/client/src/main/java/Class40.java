import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class40 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!kb", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static66.aClass40_1 != null) {
			Static20.anInt675 = 0;
			@Pc(12) int local12 = arg0.getKeyCode();
			if (local12 >= 0 && local12 < Static89.anIntArray255.length) {
				local12 = Static89.anIntArray255[local12];
				if ((local12 & 0x80) != 0) {
					local12 = -1;
				}
			} else {
				local12 = -1;
			}
			@Pc(67) int local67;
			if (local12 == 85 || local12 == 80 || local12 == 84 || local12 == 0 || local12 == 101) {
				local67 = -1;
			} else {
				local67 = Static48.method939(arg0);
			}
			if (Static87.anInt2054 >= 0 && local12 >= 0) {
				Static24.anIntArray88[Static87.anInt2054] = local12;
				Static87.anInt2054 = Static87.anInt2054 + 1 & 0x7F;
				if (Static39.anInt1032 == Static87.anInt2054) {
					Static87.anInt2054 = -1;
				}
			}
			if (local12 >= 0 || local67 >= 0) {
				@Pc(109) int local109 = Static16.anInt512 + 1 & 0x7F;
				if (Static2.anInt1866 != local109) {
					Static75.anIntArray229[Static16.anInt512] = local12;
					Static19.anIntArray78[Static16.anInt512] = local67;
					Static16.anInt512 = local109;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!kb", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static66.aClass40_1 != null) {
			Static20.anInt675 = 0;
			@Pc(6) int local6 = arg0.getKeyCode();
			if (local6 >= 0 && local6 < Static89.anIntArray255.length) {
				local6 = Static89.anIntArray255[local6] & 0xFFFFFF7F;
			} else {
				local6 = -1;
			}
			if (Static87.anInt2054 >= 0 && local6 >= 0) {
				Static24.anIntArray88[Static87.anInt2054] = ~local6;
				Static87.anInt2054 = Static87.anInt2054 + 1 & 0x7F;
				if (Static39.anInt1032 == Static87.anInt2054) {
					Static87.anInt2054 = -1;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!kb", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		arg0.consume();
	}

	@OriginalMember(owner = "client!kb", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!kb", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static66.aClass40_1 != null) {
			Static87.anInt2054 = -1;
		}
	}
}
