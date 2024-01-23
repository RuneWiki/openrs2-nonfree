import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hc")
public final class Class69 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!hc", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static254.aClass69_1 != null) {
			Static215.anInt4218 = 0;
			@Pc(10) int local10 = arg0.getKeyCode();
			if (local10 >= 0 && local10 < Static307.anIntArray621.length) {
				local10 = Static307.anIntArray621[local10] & 0xFFFFFF7F;
			} else {
				local10 = -1;
			}
			if (Static206.anInt4081 >= 0 && local10 >= 0) {
				Static163.anIntArray354[Static206.anInt4081] = ~local10;
				Static206.anInt4081 = Static206.anInt4081 + 1 & 0x7F;
				if (Static41.anInt683 == Static206.anInt4081) {
					Static206.anInt4081 = -1;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!hc", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		if (Static254.aClass69_1 != null) {
			@Pc(8) char local8 = arg0.getKeyChar();
			if (local8 != '\u0000' && local8 != '\uffff' && Static15.method3533(local8)) {
				@Pc(28) int local28 = Static267.anInt5441 + 1 & 0x7F;
				if (Static88.anInt1661 != local28) {
					Static136.anIntArray308[Static267.anInt5441] = -1;
					Static114.aCharArray41[Static267.anInt5441] = local8;
					Static267.anInt5441 = local28;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!hc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!hc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static254.aClass69_1 != null) {
			Static206.anInt4081 = -1;
		}
	}

	@OriginalMember(owner = "client!hc", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static254.aClass69_1 == null) {
			return;
		}
		Static215.anInt4218 = 0;
		@Pc(11) int local11 = arg0.getKeyCode();
		if (local11 >= 0 && local11 < Static307.anIntArray621.length) {
			local11 = Static307.anIntArray621[local11];
			if ((local11 & 0x80) != 0) {
				local11 = -1;
			}
		} else {
			local11 = -1;
		}
		if (Static206.anInt4081 >= 0 && local11 >= 0) {
			Static163.anIntArray354[Static206.anInt4081] = local11;
			Static206.anInt4081 = Static206.anInt4081 + 1 & 0x7F;
			if (Static41.anInt683 == Static206.anInt4081) {
				Static206.anInt4081 = -1;
			}
		}
		@Pc(77) int local77;
		if (local11 >= 0) {
			local77 = Static267.anInt5441 + 1 & 0x7F;
			if (local77 != Static88.anInt1661) {
				Static136.anIntArray308[Static267.anInt5441] = local11;
				Static114.aCharArray41[Static267.anInt5441] = '\u0000';
				Static267.anInt5441 = local77;
			}
		}
		local77 = arg0.getModifiers();
		if ((local77 & 0xA) != 0 || local11 == 85 || local11 == 10) {
			arg0.consume();
		}
	}
}
