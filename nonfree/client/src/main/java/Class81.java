import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public final class Class81 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!oa", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static32.aClass81_1 == null) {
			return;
		}
		Static93.anInt1907 = 0;
		@Pc(6) int local6 = arg0.getKeyCode();
		if (local6 >= 0 && Static182.anIntArray427.length > local6) {
			local6 = Static182.anIntArray427[local6];
			if ((local6 & 0x80) != 0) {
				local6 = -1;
			}
		} else {
			local6 = -1;
		}
		if (Static221.anInt4310 >= 0 && local6 >= 0) {
			Static12.anIntArray27[Static221.anInt4310] = local6;
			Static221.anInt4310 = Static221.anInt4310 + 1 & 0x7F;
			if (Static221.anInt4310 == Static130.anInt2695) {
				Static221.anInt4310 = -1;
			}
		}
		@Pc(63) int local63;
		if (local6 >= 0) {
			local63 = Static153.anInt3178 + 1 & 0x7F;
			if (Static2.anInt53 != local63) {
				Static50.anIntArray87[Static153.anInt3178] = local6;
				Static129.anIntArray286[Static153.anInt3178] = -1;
				Static153.anInt3178 = local63;
			}
		}
		local63 = arg0.getModifiers();
		if ((local63 & 0xA) != 0 || local6 == 85 || local6 == 10) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!oa", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!oa", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static32.aClass81_1 != null) {
			Static93.anInt1907 = 0;
			@Pc(10) int local10 = arg0.getKeyCode();
			if (local10 >= 0 && local10 < Static182.anIntArray427.length) {
				local10 = Static182.anIntArray427[local10] & 0xFFFFFF7F;
			} else {
				local10 = -1;
			}
			if (Static221.anInt4310 >= 0 && local10 >= 0) {
				Static12.anIntArray27[Static221.anInt4310] = ~local10;
				Static221.anInt4310 = Static221.anInt4310 + 1 & 0x7F;
				if (Static130.anInt2695 == Static221.anInt4310) {
					Static221.anInt4310 = -1;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!oa", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static32.aClass81_1 != null) {
			Static221.anInt4310 = -1;
		}
	}

	@OriginalMember(owner = "client!oa", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		if (Static32.aClass81_1 != null) {
			@Pc(5) int local5 = Static103.method1595(arg0);
			if (local5 >= 0) {
				@Pc(16) int local16 = Static153.anInt3178 + 1 & 0x7F;
				if (Static2.anInt53 != local16) {
					Static50.anIntArray87[Static153.anInt3178] = -1;
					Static129.anIntArray286[Static153.anInt3178] = local5;
					Static153.anInt3178 = local16;
				}
			}
		}
		arg0.consume();
	}
}
