import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public final class Class24 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!ce", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static78.aClass24_1 != null) {
			Static299.anInt5939 = -1;
		}
	}

	@OriginalMember(owner = "client!ce", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static78.aClass24_1 != null) {
			Static18.anInt505 = 0;
			@Pc(10) int local10 = arg0.getKeyCode();
			if (local10 >= 0 && local10 < Static5.anIntArray309.length) {
				local10 = Static5.anIntArray309[local10] & 0xFFFFFF7F;
			} else {
				local10 = -1;
			}
			if (Static299.anInt5939 >= 0 && local10 >= 0) {
				Static122.anIntArray270[Static299.anInt5939] = ~local10;
				Static299.anInt5939 = Static299.anInt5939 + 1 & 0x7F;
				if (Static302.anInt5998 == Static299.anInt5939) {
					Static299.anInt5939 = -1;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!ce", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		if (Static78.aClass24_1 != null) {
			@Pc(9) char local9 = arg0.getKeyChar();
			if (local9 != '\u0000' && local9 != '\uffff' && Static283.method4308(local9)) {
				@Pc(28) int local28 = Static188.anInt4159 + 1 & 0x7F;
				if (local28 != Static46.anInt1109) {
					Static114.anIntArray260[Static188.anInt4159] = -1;
					Static204.aCharArray5[Static188.anInt4159] = local9;
					Static188.anInt4159 = local28;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!ce", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static78.aClass24_1 == null) {
			return;
		}
		Static18.anInt505 = 0;
		@Pc(12) int local12 = arg0.getKeyCode();
		if (local12 >= 0 && local12 < Static5.anIntArray309.length) {
			local12 = Static5.anIntArray309[local12];
			if ((local12 & 0x80) != 0) {
				local12 = -1;
			}
		} else {
			local12 = -1;
		}
		if (Static299.anInt5939 >= 0 && local12 >= 0) {
			Static122.anIntArray270[Static299.anInt5939] = local12;
			Static299.anInt5939 = Static299.anInt5939 + 1 & 0x7F;
			if (Static302.anInt5998 == Static299.anInt5939) {
				Static299.anInt5939 = -1;
			}
		}
		@Pc(63) int local63;
		if (local12 >= 0) {
			local63 = Static188.anInt4159 + 1 & 0x7F;
			if (local63 != Static46.anInt1109) {
				Static114.anIntArray260[Static188.anInt4159] = local12;
				Static204.aCharArray5[Static188.anInt4159] = '\u0000';
				Static188.anInt4159 = local63;
			}
		}
		local63 = arg0.getModifiers();
		if ((local63 & 0xA) != 0 || local12 == 85 || local12 == 10) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ce", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}
}
