import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public final class Class79 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!hf", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		if (Static61.aClass79_1 != null) {
			@Pc(8) char local8 = arg0.getKeyChar();
			if (local8 != '\u0000' && local8 != '\uffff' && Static291.method4957(local8)) {
				@Pc(25) int local25 = Static335.anInt6374 + 1 & 0x7F;
				if (Static97.anInt1919 != local25) {
					Static265.anIntArray644[Static335.anInt6374] = -1;
					Static304.aCharArray7[Static335.anInt6374] = local8;
					Static335.anInt6374 = local25;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!hf", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static61.aClass79_1 != null) {
			Static274.anInt5358 = -1;
		}
	}

	@OriginalMember(owner = "client!hf", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!hf", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static61.aClass79_1 != null) {
			Static130.anInt2532 = 0;
			@Pc(6) int local6 = arg0.getKeyCode();
			if (local6 >= 0 && local6 < Static184.anIntArray453.length) {
				local6 = Static184.anIntArray453[local6] & 0xFFFFFF7F;
			} else {
				local6 = -1;
			}
			if (Static274.anInt5358 >= 0 && local6 >= 0) {
				Static229.anIntArray211[Static274.anInt5358] = ~local6;
				Static274.anInt5358 = Static274.anInt5358 + 1 & 0x7F;
				if (Static215.anInt4250 == Static274.anInt5358) {
					Static274.anInt5358 = -1;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!hf", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static61.aClass79_1 == null) {
			return;
		}
		Static130.anInt2532 = 0;
		@Pc(10) int local10 = arg0.getKeyCode();
		if (local10 >= 0 && Static184.anIntArray453.length > local10) {
			local10 = Static184.anIntArray453[local10];
			if ((local10 & 0x80) != 0) {
				local10 = -1;
			}
		} else {
			local10 = -1;
		}
		if (Static274.anInt5358 >= 0 && local10 >= 0) {
			Static229.anIntArray211[Static274.anInt5358] = local10;
			Static274.anInt5358 = Static274.anInt5358 + 1 & 0x7F;
			if (Static215.anInt4250 == Static274.anInt5358) {
				Static274.anInt5358 = -1;
			}
		}
		@Pc(67) int local67;
		if (local10 >= 0) {
			local67 = Static335.anInt6374 + 1 & 0x7F;
			if (local67 != Static97.anInt1919) {
				Static265.anIntArray644[Static335.anInt6374] = local10;
				Static304.aCharArray7[Static335.anInt6374] = '\u0000';
				Static335.anInt6374 = local67;
			}
		}
		local67 = arg0.getModifiers();
		if ((local67 & 0xA) != 0 || local10 == 85 || local10 == 10) {
			arg0.consume();
		}
	}
}
