import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public final class Class56 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!q", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static117.aClass56_1 != null) {
			Static13.anInt463 = -1;
		}
	}

	@OriginalMember(owner = "client!q", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(3) int local3 = Static101.method1766(arg0);
		if (local3 >= 0) {
			@Pc(18) int local18 = Static117.anInt2754 + 1 & 0x7F;
			if (local18 != Static123.anInt2836) {
				Static75.anIntArray342[Static117.anInt2754] = -1;
				Static109.anIntArray446[Static117.anInt2754] = local3;
				Static117.anInt2754 = local18;
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!q", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static117.aClass56_1 == null) {
			return;
		}
		Static54.anInt1750 = 0;
		@Pc(10) int local10 = arg0.getKeyCode();
		if (local10 >= 0 && local10 < Static2.anIntArray17.length) {
			local10 = Static2.anIntArray17[local10];
			if ((local10 & 0x80) != 0) {
				local10 = -1;
			}
		} else {
			local10 = -1;
		}
		if (Static13.anInt463 >= 0 && local10 >= 0) {
			Static81.anIntArray362[Static13.anInt463] = local10;
			Static13.anInt463 = Static13.anInt463 + 1 & 0x7F;
			if (Static13.anInt463 == Static84.anInt2215) {
				Static13.anInt463 = -1;
			}
		}
		@Pc(77) int local77;
		if (local10 >= 0) {
			local77 = Static117.anInt2754 + 1 & 0x7F;
			if (local77 != Static123.anInt2836) {
				Static75.anIntArray342[Static117.anInt2754] = local10;
				Static109.anIntArray446[Static117.anInt2754] = -1;
				Static117.anInt2754 = local77;
			}
		}
		local77 = arg0.getModifiers();
		if ((local77 & 0xA) != 0 || local10 == 85 || local10 == 10) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!q", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static117.aClass56_1 != null) {
			Static54.anInt1750 = 0;
			@Pc(10) int local10 = arg0.getKeyCode();
			if (local10 >= 0 && Static2.anIntArray17.length > local10) {
				local10 = Static2.anIntArray17[local10] & 0xFFFFFF7F;
			} else {
				local10 = -1;
			}
			if (Static13.anInt463 >= 0 && local10 >= 0) {
				Static81.anIntArray362[Static13.anInt463] = ~local10;
				Static13.anInt463 = Static13.anInt463 + 1 & 0x7F;
				if (Static13.anInt463 == Static84.anInt2215) {
					Static13.anInt463 = -1;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!q", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}
}
