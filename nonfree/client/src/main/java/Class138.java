import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public final class Class138 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!q", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static94.aClass138_1 != null) {
			Static161.anInt3218 = 0;
			@Pc(10) int local10 = arg0.getKeyCode();
			if (local10 >= 0 && Static43.anIntArray74.length > local10) {
				local10 = Static43.anIntArray74[local10] & 0xFFFFFF7F;
			} else {
				local10 = -1;
			}
			if (Static310.anInt5532 >= 0 && local10 >= 0) {
				Static81.anIntArray137[Static310.anInt5532] = ~local10;
				Static310.anInt5532 = Static310.anInt5532 + 1 & 0x7F;
				if (Static310.anInt5532 == Static259.anInt4814) {
					Static310.anInt5532 = -1;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!q", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		if (Static94.aClass138_1 != null) {
			@Pc(6) char local6 = arg0.getKeyChar();
			if (local6 != '\u0000' && local6 != '\uffff' && Static75.method1841(local6)) {
				@Pc(24) int local24 = Static1.anInt46 + 1 & 0x7F;
				if (Static43.anInt981 != local24) {
					Static274.anIntArray557[Static1.anInt46] = -1;
					Static144.aCharArray4[Static1.anInt46] = local6;
					Static1.anInt46 = local24;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!q", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!q", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static94.aClass138_1 == null) {
			return;
		}
		Static161.anInt3218 = 0;
		@Pc(11) int local11 = arg0.getKeyCode();
		if (local11 >= 0 && local11 < Static43.anIntArray74.length) {
			local11 = Static43.anIntArray74[local11];
			if ((local11 & 0x80) != 0) {
				local11 = -1;
			}
		} else {
			local11 = -1;
		}
		if (Static310.anInt5532 >= 0 && local11 >= 0) {
			Static81.anIntArray137[Static310.anInt5532] = local11;
			Static310.anInt5532 = Static310.anInt5532 + 1 & 0x7F;
			if (Static310.anInt5532 == Static259.anInt4814) {
				Static310.anInt5532 = -1;
			}
		}
		@Pc(71) int local71;
		if (local11 >= 0) {
			local71 = Static1.anInt46 + 1 & 0x7F;
			if (Static43.anInt981 != local71) {
				Static274.anIntArray557[Static1.anInt46] = local11;
				Static144.aCharArray4[Static1.anInt46] = '\u0000';
				Static1.anInt46 = local71;
			}
		}
		local71 = arg0.getModifiers();
		if ((local71 & 0xA) != 0 || local11 == 85 || local11 == 10) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!q", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static94.aClass138_1 != null) {
			Static310.anInt5532 = -1;
		}
	}
}
