import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class39 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!ia", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static181.aClass39_1 != null) {
			Static71.anInt1459 = -1;
		}
	}

	@OriginalMember(owner = "client!ia", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		if (Static181.aClass39_1 != null) {
			@Pc(5) int local5 = Static85.method1442(arg0);
			if (local5 >= 0) {
				@Pc(16) int local16 = Static102.anInt2159 + 1 & 0x7F;
				if (Static155.anInt3388 != local16) {
					Static74.anIntArray180[Static102.anInt2159] = -1;
					Static28.anIntArray52[Static102.anInt2159] = local5;
					Static102.anInt2159 = local16;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!ia", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!ia", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static181.aClass39_1 != null) {
			Static68.anInt1420 = 0;
			@Pc(10) int local10 = arg0.getKeyCode();
			if (local10 >= 0 && Static95.anIntArray203.length > local10) {
				local10 = Static95.anIntArray203[local10] & 0xFFFFFF7F;
			} else {
				local10 = -1;
			}
			if (Static71.anInt1459 >= 0 && local10 >= 0) {
				Static141.anIntArray281[Static71.anInt1459] = ~local10;
				Static71.anInt1459 = Static71.anInt1459 + 1 & 0x7F;
				if (Static71.anInt1459 == Static51.anInt1162) {
					Static71.anInt1459 = -1;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!ia", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static181.aClass39_1 == null) {
			return;
		}
		Static68.anInt1420 = 0;
		@Pc(6) int local6 = arg0.getKeyCode();
		if (local6 >= 0 && local6 < Static95.anIntArray203.length) {
			local6 = Static95.anIntArray203[local6];
			if ((local6 & 0x80) != 0) {
				local6 = -1;
			}
		} else {
			local6 = -1;
		}
		if (Static71.anInt1459 >= 0 && local6 >= 0) {
			Static141.anIntArray281[Static71.anInt1459] = local6;
			Static71.anInt1459 = Static71.anInt1459 + 1 & 0x7F;
			if (Static51.anInt1162 == Static71.anInt1459) {
				Static71.anInt1459 = -1;
			}
		}
		@Pc(65) int local65;
		if (local6 >= 0) {
			local65 = Static102.anInt2159 + 1 & 0x7F;
			if (Static155.anInt3388 != local65) {
				Static74.anIntArray180[Static102.anInt2159] = local6;
				Static28.anIntArray52[Static102.anInt2159] = -1;
				Static102.anInt2159 = local65;
			}
		}
		local65 = arg0.getModifiers();
		if ((local65 & 0xA) != 0 || local6 == 85 || local6 == 10) {
			arg0.consume();
		}
	}
}
