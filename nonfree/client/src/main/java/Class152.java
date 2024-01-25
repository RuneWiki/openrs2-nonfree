import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oi")
public final class Class152 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!oi", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static239.aClass152_1 == null) {
			return;
		}
		Static116.anInt2643 = 0;
		@Pc(6) int local6 = arg0.getKeyCode();
		if (local6 >= 0 && local6 < Static98.anIntArray194.length) {
			local6 = Static98.anIntArray194[local6];
			if ((local6 & 0x80) != 0) {
				local6 = -1;
			}
		} else {
			local6 = -1;
		}
		if (Static225.anInt4491 >= 0 && local6 >= 0) {
			Static331.anIntArray795[Static225.anInt4491] = local6;
			Static225.anInt4491 = Static225.anInt4491 + 1 & 0x7F;
			if (Static63.anInt5456 == Static225.anInt4491) {
				Static225.anInt4491 = -1;
			}
		}
		@Pc(69) int local69;
		if (local6 >= 0) {
			local69 = Static275.anInt5438 + 1 & 0x7F;
			if (Static283.anInt5557 != local69) {
				Static261.anIntArray662[Static275.anInt5438] = local6;
				Static43.aCharArray2[Static275.anInt5438] = '\u0000';
				Static275.anInt5438 = local69;
			}
		}
		local69 = arg0.getModifiers();
		if ((local69 & 0xA) != 0 || local6 == 85 || local6 == 10) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!oi", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		if (Static239.aClass152_1 != null) {
			@Pc(8) char local8 = arg0.getKeyChar();
			if (local8 != '\u0000' && local8 != '\uffff' && Static354.method5701(local8)) {
				@Pc(23) int local23 = Static275.anInt5438 + 1 & 0x7F;
				if (local23 != Static283.anInt5557) {
					Static261.anIntArray662[Static275.anInt5438] = -1;
					Static43.aCharArray2[Static275.anInt5438] = local8;
					Static275.anInt5438 = local23;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!oi", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static239.aClass152_1 != null) {
			Static116.anInt2643 = 0;
			@Pc(10) int local10 = arg0.getKeyCode();
			if (local10 >= 0 && Static98.anIntArray194.length > local10) {
				local10 = Static98.anIntArray194[local10] & 0xFFFFFF7F;
			} else {
				local10 = -1;
			}
			if (Static225.anInt4491 >= 0 && local10 >= 0) {
				Static331.anIntArray795[Static225.anInt4491] = ~local10;
				Static225.anInt4491 = Static225.anInt4491 + 1 & 0x7F;
				if (Static225.anInt4491 == Static63.anInt5456) {
					Static225.anInt4491 = -1;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!oi", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!oi", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static239.aClass152_1 != null) {
			Static225.anInt4491 = -1;
		}
	}
}
