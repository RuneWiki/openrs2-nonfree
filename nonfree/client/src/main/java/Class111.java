import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mk")
public final class Class111 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!mk", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static16.aClass111_115 != null) {
			Static221.anInt4095 = -1;
		}
	}

	@OriginalMember(owner = "client!mk", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		if (Static16.aClass111_115 != null) {
			@Pc(5) char local5 = arg0.getKeyChar();
			if (local5 != '\u0000' && local5 != '\uffff' && Static212.method608(local5)) {
				@Pc(25) int local25 = Static24.anInt406 + 1 & 0x7F;
				if (local25 != Static293.anInt5261) {
					Static178.anIntArray288[Static24.anInt406] = -1;
					Static297.aCharArray5[Static24.anInt406] = local5;
					Static24.anInt406 = local25;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!mk", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!mk", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static16.aClass111_115 == null) {
			return;
		}
		Static255.anInt4623 = 0;
		@Pc(7) int local7 = arg0.getKeyCode();
		if (local7 >= 0 && local7 < Static192.anIntArray303.length) {
			local7 = Static192.anIntArray303[local7];
			if ((local7 & 0x80) != 0) {
				local7 = -1;
			}
		} else {
			local7 = -1;
		}
		if (Static221.anInt4095 >= 0 && local7 >= 0) {
			Static80.anIntArray139[Static221.anInt4095] = local7;
			Static221.anInt4095 = Static221.anInt4095 + 1 & 0x7F;
			if (Static46.anInt940 == Static221.anInt4095) {
				Static221.anInt4095 = -1;
			}
		}
		@Pc(65) int local65;
		if (local7 >= 0) {
			local65 = Static24.anInt406 + 1 & 0x7F;
			if (local65 != Static293.anInt5261) {
				Static178.anIntArray288[Static24.anInt406] = local7;
				Static297.aCharArray5[Static24.anInt406] = '\u0000';
				Static24.anInt406 = local65;
			}
		}
		local65 = arg0.getModifiers();
		if ((local65 & 0xA) != 0 || local7 == 85 || local7 == 10) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!mk", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static16.aClass111_115 != null) {
			Static255.anInt4623 = 0;
			@Pc(7) int local7 = arg0.getKeyCode();
			if (local7 >= 0 && local7 < Static192.anIntArray303.length) {
				local7 = Static192.anIntArray303[local7] & 0xFFFFFF7F;
			} else {
				local7 = -1;
			}
			if (Static221.anInt4095 >= 0 && local7 >= 0) {
				Static80.anIntArray139[Static221.anInt4095] = ~local7;
				Static221.anInt4095 = Static221.anInt4095 + 1 & 0x7F;
				if (Static221.anInt4095 == Static46.anInt940) {
					Static221.anInt4095 = -1;
				}
			}
		}
		arg0.consume();
	}
}
