import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!p")
public final class Class59 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!p", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static45.aClass59_1 != null) {
			Static99.anInt2498 = 0;
			@Pc(6) int local6 = arg0.getKeyCode();
			if (local6 >= 0 && local6 < Static8.anIntArray32.length) {
				local6 = Static8.anIntArray32[local6] & 0xFFFFFF7F;
			} else {
				local6 = -1;
			}
			if (Static81.anInt2516 >= 0 && local6 >= 0) {
				Static177.anIntArray362[Static81.anInt2516] = ~local6;
				Static81.anInt2516 = Static81.anInt2516 + 1 & 0x7F;
				if (Static107.anInt2606 == Static81.anInt2516) {
					Static81.anInt2516 = -1;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!p", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static45.aClass59_1 == null) {
			return;
		}
		Static99.anInt2498 = 0;
		@Pc(6) int local6 = arg0.getKeyCode();
		if (local6 >= 0 && Static8.anIntArray32.length > local6) {
			local6 = Static8.anIntArray32[local6];
			if ((local6 & 0x80) != 0) {
				local6 = -1;
			}
		} else {
			local6 = -1;
		}
		if (Static81.anInt2516 >= 0 && local6 >= 0) {
			Static177.anIntArray362[Static81.anInt2516] = local6;
			Static81.anInt2516 = Static81.anInt2516 + 1 & 0x7F;
			if (Static107.anInt2606 == Static81.anInt2516) {
				Static81.anInt2516 = -1;
			}
		}
		@Pc(63) int local63;
		if (local6 >= 0) {
			local63 = Static95.anInt2367 + 1 & 0x7F;
			if (Static47.anInt1604 != local63) {
				Static26.anIntArray62[Static95.anInt2367] = local6;
				Static104.anIntArray238[Static95.anInt2367] = -1;
				Static95.anInt2367 = local63;
			}
		}
		local63 = arg0.getModifiers();
		if ((local63 & 0xA) != 0 || local6 == 85 || local6 == 10) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!p", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		if (Static45.aClass59_1 != null) {
			@Pc(9) int local9 = Static105.method1830(arg0);
			if (local9 >= 0) {
				@Pc(20) int local20 = Static95.anInt2367 + 1 & 0x7F;
				if (Static47.anInt1604 != local20) {
					Static26.anIntArray62[Static95.anInt2367] = -1;
					Static104.anIntArray238[Static95.anInt2367] = local9;
					Static95.anInt2367 = local20;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!p", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static45.aClass59_1 != null) {
			Static81.anInt2516 = -1;
		}
	}

	@OriginalMember(owner = "client!p", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}
}
