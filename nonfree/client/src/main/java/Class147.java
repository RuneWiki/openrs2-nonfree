import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class147 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!wc", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static240.aClass147_1 != null) {
			Static148.anInt413 = 0;
			@Pc(6) int local6 = arg0.getKeyCode();
			if (local6 >= 0 && local6 < Static43.anIntArray95.length) {
				local6 = Static43.anIntArray95[local6] & 0xFFFFFF7F;
			} else {
				local6 = -1;
			}
			if (Static12.anInt503 >= 0 && local6 >= 0) {
				Static44.anIntArray101[Static12.anInt503] = ~local6;
				Static12.anInt503 = Static12.anInt503 + 1 & 0x7F;
				if (Static12.anInt503 == Static246.anInt5268) {
					Static12.anInt503 = -1;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!wc", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static240.aClass147_1 == null) {
			return;
		}
		Static148.anInt413 = 0;
		@Pc(6) int local6 = arg0.getKeyCode();
		if (local6 >= 0 && Static43.anIntArray95.length > local6) {
			local6 = Static43.anIntArray95[local6];
			if ((local6 & 0x80) != 0) {
				local6 = -1;
			}
		} else {
			local6 = -1;
		}
		if (Static12.anInt503 >= 0 && local6 >= 0) {
			Static44.anIntArray101[Static12.anInt503] = local6;
			Static12.anInt503 = Static12.anInt503 + 1 & 0x7F;
			if (Static246.anInt5268 == Static12.anInt503) {
				Static12.anInt503 = -1;
			}
		}
		@Pc(70) int local70;
		if (local6 >= 0) {
			local70 = Static118.anInt3084 + 1 & 0x7F;
			if (local70 != Static33.anInt5180) {
				Static255.anIntArray464[Static118.anInt3084] = local6;
				Static193.aCharArray4[Static118.anInt3084] = '\u0000';
				Static118.anInt3084 = local70;
			}
		}
		local70 = arg0.getModifiers();
		if ((local70 & 0xA) != 0 || local6 == 85 || local6 == 10) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!wc", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		if (Static240.aClass147_1 != null) {
			@Pc(8) char local8 = arg0.getKeyChar();
			if (local8 != '\u0000' && local8 != '\uffff' && Static134.method2496(local8)) {
				@Pc(28) int local28 = Static118.anInt3084 + 1 & 0x7F;
				if (local28 != Static33.anInt5180) {
					Static255.anIntArray464[Static118.anInt3084] = -1;
					Static193.aCharArray4[Static118.anInt3084] = local8;
					Static118.anInt3084 = local28;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!wc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!wc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static240.aClass147_1 != null) {
			Static12.anInt503 = -1;
		}
	}
}
