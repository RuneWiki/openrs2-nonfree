import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ca")
public final class Class9 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!ca", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!ca", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static125.aClass9_1 == null) {
			return;
		}
		Static70.anInt1893 = 0;
		@Pc(6) int local6 = arg0.getKeyCode();
		if (local6 >= 0 && local6 < Static34.anIntArray158.length) {
			local6 = Static34.anIntArray158[local6];
			if ((local6 & 0x80) != 0) {
				local6 = -1;
			}
		} else {
			local6 = -1;
		}
		if (Static62.anInt1662 >= 0 && local6 >= 0) {
			Static48.anIntArray212[Static62.anInt1662] = local6;
			Static62.anInt1662 = Static62.anInt1662 + 1 & 0x7F;
			if (Static62.anInt1662 == Static30.anInt874) {
				Static62.anInt1662 = -1;
			}
		}
		@Pc(59) int local59;
		if (local6 >= 0) {
			local59 = Static109.anInt893 + 1 & 0x7F;
			if (Static94.anInt2401 != local59) {
				Static57.anIntArray641[Static109.anInt893] = local6;
				Static63.anIntArray262[Static109.anInt893] = -1;
				Static109.anInt893 = local59;
			}
		}
		local59 = arg0.getModifiers();
		if ((local59 & 0xA) != 0 || local6 == 85 || local6 == 10) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ca", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		if (Static125.aClass9_1 != null) {
			@Pc(5) int local5 = Static125.method2166(arg0);
			if (local5 >= 0) {
				@Pc(13) int local13 = Static109.anInt893 + 1 & 0x7F;
				if (Static94.anInt2401 != local13) {
					Static57.anIntArray641[Static109.anInt893] = -1;
					Static63.anIntArray262[Static109.anInt893] = local5;
					Static109.anInt893 = local13;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!ca", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static125.aClass9_1 != null) {
			Static62.anInt1662 = -1;
		}
	}

	@OriginalMember(owner = "client!ca", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static125.aClass9_1 != null) {
			Static70.anInt1893 = 0;
			@Pc(10) int local10 = arg0.getKeyCode();
			if (local10 >= 0 && local10 < Static34.anIntArray158.length) {
				local10 = Static34.anIntArray158[local10] & 0xFFFFFF7F;
			} else {
				local10 = -1;
			}
			if (Static62.anInt1662 >= 0 && local10 >= 0) {
				Static48.anIntArray212[Static62.anInt1662] = ~local10;
				Static62.anInt1662 = Static62.anInt1662 + 1 & 0x7F;
				if (Static30.anInt874 == Static62.anInt1662) {
					Static62.anInt1662 = -1;
				}
			}
		}
		arg0.consume();
	}
}
