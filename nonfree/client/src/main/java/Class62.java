import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class62 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!qb", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!qb", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static73.aClass62_1 != null) {
			Static95.anInt2355 = -1;
		}
	}

	@OriginalMember(owner = "client!qb", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static73.aClass62_1 == null) {
			return;
		}
		Static117.anInt3220 = 0;
		@Pc(10) int local10 = arg0.getKeyCode();
		if (local10 >= 0 && local10 < Static104.anIntArray390.length) {
			local10 = Static104.anIntArray390[local10];
			if ((local10 & 0x80) != 0) {
				local10 = -1;
			}
		} else {
			local10 = -1;
		}
		if (Static95.anInt2355 >= 0 && local10 >= 0) {
			Static102.anIntArray389[Static95.anInt2355] = local10;
			Static95.anInt2355 = Static95.anInt2355 + 1 & 0x7F;
			if (Static103.anInt2535 == Static95.anInt2355) {
				Static95.anInt2355 = -1;
			}
		}
		@Pc(67) int local67;
		if (local10 >= 0) {
			local67 = Static121.anInt3118 + 1 & 0x7F;
			if (local67 != Static56.anInt1346) {
				Static52.anIntArray205[Static121.anInt3118] = local10;
				Static22.anIntArray85[Static121.anInt3118] = -1;
				Static121.anInt3118 = local67;
			}
		}
		local67 = arg0.getModifiers();
		if ((local67 & 0xA) != 0 || local10 == 85 || local10 == 10) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!qb", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static73.aClass62_1 != null) {
			Static117.anInt3220 = 0;
			@Pc(6) int local6 = arg0.getKeyCode();
			if (local6 >= 0 && local6 < Static104.anIntArray390.length) {
				local6 = Static104.anIntArray390[local6] & 0xFFFFFF7F;
			} else {
				local6 = -1;
			}
			if (Static95.anInt2355 >= 0 && local6 >= 0) {
				Static102.anIntArray389[Static95.anInt2355] = ~local6;
				Static95.anInt2355 = Static95.anInt2355 + 1 & 0x7F;
				if (Static103.anInt2535 == Static95.anInt2355) {
					Static95.anInt2355 = -1;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!qb", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(7) int local7 = Static52.method902(arg0);
		if (local7 >= 0) {
			@Pc(15) int local15 = Static121.anInt3118 + 1 & 0x7F;
			if (Static56.anInt1346 != local15) {
				Static52.anIntArray205[Static121.anInt3118] = -1;
				Static22.anIntArray85[Static121.anInt3118] = local7;
				Static121.anInt3118 = local15;
			}
		}
		arg0.consume();
	}
}
