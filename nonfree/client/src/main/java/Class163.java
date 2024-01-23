import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ug")
public final class Class163 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!ug", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static18.aClass163_1 != null) {
			Static278.anInt5580 = -1;
		}
	}

	@OriginalMember(owner = "client!ug", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!ug", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static18.aClass163_1 == null) {
			return;
		}
		Static3.anInt141 = 0;
		@Pc(11) int local11 = arg0.getKeyCode();
		if (local11 >= 0 && local11 < Static173.anIntArray381.length) {
			local11 = Static173.anIntArray381[local11];
			if ((local11 & 0x80) != 0) {
				local11 = -1;
			}
		} else {
			local11 = -1;
		}
		if (Static278.anInt5580 >= 0 && local11 >= 0) {
			Static43.anIntArray130[Static278.anInt5580] = local11;
			Static278.anInt5580 = Static278.anInt5580 + 1 & 0x7F;
			if (Static107.anInt1997 == Static278.anInt5580) {
				Static278.anInt5580 = -1;
			}
		}
		@Pc(75) int local75;
		if (local11 >= 0) {
			local75 = Static270.anInt5417 + 1 & 0x7F;
			if (Static81.anInt1616 != local75) {
				Static217.anIntArray513[Static270.anInt5417] = local11;
				Static101.aCharArray7[Static270.anInt5417] = '\u0000';
				Static270.anInt5417 = local75;
			}
		}
		local75 = arg0.getModifiers();
		if ((local75 & 0xA) != 0 || local11 == 85 || local11 == 10) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ug", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		if (Static18.aClass163_1 != null) {
			@Pc(8) char local8 = arg0.getKeyChar();
			if (local8 != '\u0000' && local8 != '\uffff' && Static287.method4362(local8)) {
				@Pc(25) int local25 = Static270.anInt5417 + 1 & 0x7F;
				if (Static81.anInt1616 != local25) {
					Static217.anIntArray513[Static270.anInt5417] = -1;
					Static101.aCharArray7[Static270.anInt5417] = local8;
					Static270.anInt5417 = local25;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!ug", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static18.aClass163_1 != null) {
			Static3.anInt141 = 0;
			@Pc(11) int local11 = arg0.getKeyCode();
			if (local11 >= 0 && local11 < Static173.anIntArray381.length) {
				local11 = Static173.anIntArray381[local11] & 0xFFFFFF7F;
			} else {
				local11 = -1;
			}
			if (Static278.anInt5580 >= 0 && local11 >= 0) {
				Static43.anIntArray130[Static278.anInt5580] = ~local11;
				Static278.anInt5580 = Static278.anInt5580 + 1 & 0x7F;
				if (Static107.anInt1997 == Static278.anInt5580) {
					Static278.anInt5580 = -1;
				}
			}
		}
		arg0.consume();
	}
}
