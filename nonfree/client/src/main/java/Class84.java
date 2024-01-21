import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ve")
public final class Class84 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!ve", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static156.aClass84_1 != null) {
			Static63.anInt1566 = -1;
		}
	}

	@OriginalMember(owner = "client!ve", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		if (Static156.aClass84_1 != null) {
			@Pc(5) int local5 = Static51.method937(arg0);
			if (local5 >= 0) {
				@Pc(13) int local13 = Static91.anInt2154 + 1 & 0x7F;
				if (local13 != Static60.anInt1492) {
					Static167.anIntArray222[Static91.anInt2154] = -1;
					Static97.anIntArray239[Static91.anInt2154] = local5;
					Static91.anInt2154 = local13;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!ve", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static156.aClass84_1 != null) {
			Static47.anInt1149 = 0;
			@Pc(6) int local6 = arg0.getKeyCode();
			if (local6 >= 0 && Static49.anIntArray139.length > local6) {
				local6 = Static49.anIntArray139[local6] & 0xFFFFFF7F;
			} else {
				local6 = -1;
			}
			if (Static63.anInt1566 >= 0 && local6 >= 0) {
				Static115.anIntArray274[Static63.anInt1566] = ~local6;
				Static63.anInt1566 = Static63.anInt1566 + 1 & 0x7F;
				if (Static100.anInt2340 == Static63.anInt1566) {
					Static63.anInt1566 = -1;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!ve", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!ve", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static156.aClass84_1 == null) {
			return;
		}
		Static47.anInt1149 = 0;
		@Pc(10) int local10 = arg0.getKeyCode();
		if (local10 >= 0 && Static49.anIntArray139.length > local10) {
			local10 = Static49.anIntArray139[local10];
			if ((local10 & 0x80) != 0) {
				local10 = -1;
			}
		} else {
			local10 = -1;
		}
		if (Static63.anInt1566 >= 0 && local10 >= 0) {
			Static115.anIntArray274[Static63.anInt1566] = local10;
			Static63.anInt1566 = Static63.anInt1566 + 1 & 0x7F;
			if (Static63.anInt1566 == Static100.anInt2340) {
				Static63.anInt1566 = -1;
			}
		}
		@Pc(66) int local66;
		if (local10 >= 0) {
			local66 = Static91.anInt2154 + 1 & 0x7F;
			if (local66 != Static60.anInt1492) {
				Static167.anIntArray222[Static91.anInt2154] = local10;
				Static97.anIntArray239[Static91.anInt2154] = -1;
				Static91.anInt2154 = local66;
			}
		}
		local66 = arg0.getModifiers();
		if ((local66 & 0xA) != 0 || local10 == 85 || local10 == 10) {
			arg0.consume();
		}
	}
}
