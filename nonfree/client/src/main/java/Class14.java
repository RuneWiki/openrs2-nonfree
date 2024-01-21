import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dh")
public final class Class14 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!dh", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static43.aClass14_1 != null) {
			Static35.anInt969 = -1;
		}
	}

	@OriginalMember(owner = "client!dh", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static43.aClass14_1 != null) {
			Static67.anInt1665 = 0;
			@Pc(6) int local6 = arg0.getKeyCode();
			if (local6 >= 0 && Static138.anIntArray321.length > local6) {
				local6 = Static138.anIntArray321[local6] & 0xFFFFFF7F;
			} else {
				local6 = -1;
			}
			if (Static35.anInt969 >= 0 && local6 >= 0) {
				Static108.anIntArray250[Static35.anInt969] = ~local6;
				Static35.anInt969 = Static35.anInt969 + 1 & 0x7F;
				if (Static35.anInt969 == Static114.anInt2143) {
					Static35.anInt969 = -1;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!dh", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		if (Static43.aClass14_1 != null) {
			@Pc(5) int local5 = Static95.method1587(arg0);
			if (local5 >= 0) {
				@Pc(13) int local13 = Static56.anInt1355 + 1 & 0x7F;
				if (local13 != Static56.anInt1352) {
					Static103.anIntArray244[Static56.anInt1355] = -1;
					Static164.anIntArray390[Static56.anInt1355] = local5;
					Static56.anInt1355 = local13;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!dh", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!dh", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static43.aClass14_1 == null) {
			return;
		}
		Static67.anInt1665 = 0;
		@Pc(10) int local10 = arg0.getKeyCode();
		if (local10 >= 0 && local10 < Static138.anIntArray321.length) {
			local10 = Static138.anIntArray321[local10];
			if ((local10 & 0x80) != 0) {
				local10 = -1;
			}
		} else {
			local10 = -1;
		}
		if (Static35.anInt969 >= 0 && local10 >= 0) {
			Static108.anIntArray250[Static35.anInt969] = local10;
			Static35.anInt969 = Static35.anInt969 + 1 & 0x7F;
			if (Static35.anInt969 == Static114.anInt2143) {
				Static35.anInt969 = -1;
			}
		}
		@Pc(73) int local73;
		if (local10 >= 0) {
			local73 = Static56.anInt1355 + 1 & 0x7F;
			if (Static56.anInt1352 != local73) {
				Static103.anIntArray244[Static56.anInt1355] = local10;
				Static164.anIntArray390[Static56.anInt1355] = -1;
				Static56.anInt1355 = local73;
			}
		}
		local73 = arg0.getModifiers();
		if ((local73 & 0xA) != 0 || local10 == 85 || local10 == 10) {
			arg0.consume();
		}
	}
}
