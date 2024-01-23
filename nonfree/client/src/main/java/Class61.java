import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hk")
public final class Class61 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!hk", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static210.aClass61_1 != null) {
			Static153.anInt3089 = -1;
		}
	}

	@OriginalMember(owner = "client!hk", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static210.aClass61_1 == null) {
			return;
		}
		Static53.anInt1062 = 0;
		@Pc(12) int local12 = arg0.getKeyCode();
		if (local12 >= 0 && local12 < Static134.anIntArray249.length) {
			local12 = Static134.anIntArray249[local12];
			if ((local12 & 0x80) != 0) {
				local12 = -1;
			}
		} else {
			local12 = -1;
		}
		if (Static153.anInt3089 >= 0 && local12 >= 0) {
			Static19.anIntArray40[Static153.anInt3089] = local12;
			Static153.anInt3089 = Static153.anInt3089 + 1 & 0x7F;
			if (Static114.anInt2477 == Static153.anInt3089) {
				Static153.anInt3089 = -1;
			}
		}
		@Pc(72) int local72;
		if (local12 >= 0) {
			local72 = Static156.anInt3141 + 1 & 0x7F;
			if (local72 != Static205.anInt3999) {
				Static24.anIntArray44[Static156.anInt3141] = local12;
				Static57.aCharArray9[Static156.anInt3141] = '\u0000';
				Static156.anInt3141 = local72;
			}
		}
		local72 = arg0.getModifiers();
		if ((local72 & 0xA) != 0 || local12 == 85 || local12 == 10) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!hk", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!hk", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static210.aClass61_1 != null) {
			Static53.anInt1062 = 0;
			@Pc(7) int local7 = arg0.getKeyCode();
			if (local7 >= 0 && Static134.anIntArray249.length > local7) {
				local7 = Static134.anIntArray249[local7] & 0xFFFFFF7F;
			} else {
				local7 = -1;
			}
			if (Static153.anInt3089 >= 0 && local7 >= 0) {
				Static19.anIntArray40[Static153.anInt3089] = ~local7;
				Static153.anInt3089 = Static153.anInt3089 + 1 & 0x7F;
				if (Static114.anInt2477 == Static153.anInt3089) {
					Static153.anInt3089 = -1;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!hk", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		if (Static210.aClass61_1 != null) {
			@Pc(8) char local8 = arg0.getKeyChar();
			if (local8 != '\u0000' && local8 != '\uffff' && Static32.method477(local8)) {
				@Pc(29) int local29 = Static156.anInt3141 + 1 & 0x7F;
				if (Static205.anInt3999 != local29) {
					Static24.anIntArray44[Static156.anInt3141] = -1;
					Static57.aCharArray9[Static156.anInt3141] = local8;
					Static156.anInt3141 = local29;
				}
			}
		}
		arg0.consume();
	}
}
