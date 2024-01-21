import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ha")
public final class Class29 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!ha", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static11.aClass29_1 != null) {
			Static52.anInt1262 = -1;
		}
	}

	@OriginalMember(owner = "client!ha", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!ha", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static11.aClass29_1 != null) {
			Static38.anInt1081 = 0;
			@Pc(6) int local6 = arg0.getKeyCode();
			if (local6 >= 0 && local6 < Static74.anIntArray295.length) {
				local6 = Static74.anIntArray295[local6] & 0xFFFFFF7F;
			} else {
				local6 = -1;
			}
			if (Static52.anInt1262 >= 0 && local6 >= 0) {
				Static48.anIntArray243[Static52.anInt1262] = ~local6;
				Static52.anInt1262 = Static52.anInt1262 + 1 & 0x7F;
				if (Static52.anInt1262 == Static109.anInt2515) {
					Static52.anInt1262 = -1;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!ha", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static11.aClass29_1 != null) {
			Static38.anInt1081 = 0;
			@Pc(8) int local8 = arg0.getKeyCode();
			if (local8 >= 0 && local8 < Static74.anIntArray295.length) {
				local8 = Static74.anIntArray295[local8];
				if ((local8 & 0x80) != 0) {
					local8 = -1;
				}
			} else {
				local8 = -1;
			}
			@Pc(53) int local53;
			if (local8 == 85 || local8 == 80 || local8 == 84 || local8 == 0 || local8 == 101) {
				local53 = -1;
			} else {
				local53 = Static2.method30(arg0);
			}
			if (Static52.anInt1262 >= 0 && local8 >= 0) {
				Static48.anIntArray243[Static52.anInt1262] = local8;
				Static52.anInt1262 = Static52.anInt1262 + 1 & 0x7F;
				if (Static52.anInt1262 == Static109.anInt2515) {
					Static52.anInt1262 = -1;
				}
			}
			if (local8 >= 0 || local53 >= 0) {
				@Pc(101) int local101 = Static10.anInt265 + 1 & 0x7F;
				if (local101 != Static26.anInt728) {
					Static62.anIntArray268[Static10.anInt265] = local8;
					Static111.anIntArray435[Static10.anInt265] = local53;
					Static10.anInt265 = local101;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!ha", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		arg0.consume();
	}
}
