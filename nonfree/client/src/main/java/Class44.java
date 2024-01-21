import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public final class Class44 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!ld", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!ld", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static33.aClass44_1 != null) {
			Static12.anInt215 = -1;
		}
	}

	@OriginalMember(owner = "client!ld", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static33.aClass44_1 != null) {
			Static132.anInt3125 = 0;
			@Pc(6) int local6 = arg0.getKeyCode();
			if (local6 >= 0 && local6 < Static76.anIntArray201.length) {
				local6 = Static76.anIntArray201[local6] & 0xFFFFFF7F;
			} else {
				local6 = -1;
			}
			if (Static12.anInt215 >= 0 && local6 >= 0) {
				Static4.anIntArray4[Static12.anInt215] = ~local6;
				Static12.anInt215 = Static12.anInt215 + 1 & 0x7F;
				if (Static12.anInt215 == Static95.anInt1935) {
					Static12.anInt215 = -1;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!ld", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(3) int local3 = Static64.method1143(arg0);
		if (local3 >= 0) {
			@Pc(11) int local11 = Static51.anInt1453 + 1 & 0x7F;
			if (Static1.anInt2 != local11) {
				Static121.anIntArray316[Static51.anInt1453] = -1;
				Static88.anIntArray271[Static51.anInt1453] = local3;
				Static51.anInt1453 = local11;
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!ld", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static33.aClass44_1 == null) {
			return;
		}
		Static132.anInt3125 = 0;
		@Pc(6) int local6 = arg0.getKeyCode();
		if (local6 >= 0 && Static76.anIntArray201.length > local6) {
			local6 = Static76.anIntArray201[local6];
			if ((local6 & 0x80) != 0) {
				local6 = -1;
			}
		} else {
			local6 = -1;
		}
		if (Static12.anInt215 >= 0 && local6 >= 0) {
			Static4.anIntArray4[Static12.anInt215] = local6;
			Static12.anInt215 = Static12.anInt215 + 1 & 0x7F;
			if (Static12.anInt215 == Static95.anInt1935) {
				Static12.anInt215 = -1;
			}
		}
		@Pc(66) int local66;
		if (local6 >= 0) {
			local66 = Static51.anInt1453 + 1 & 0x7F;
			if (Static1.anInt2 != local66) {
				Static121.anIntArray316[Static51.anInt1453] = local6;
				Static88.anIntArray271[Static51.anInt1453] = -1;
				Static51.anInt1453 = local66;
			}
		}
		local66 = arg0.getModifiers();
		if ((local66 & 0xA) != 0 || local6 == 85 || local6 == 10) {
			arg0.consume();
		}
	}
}
