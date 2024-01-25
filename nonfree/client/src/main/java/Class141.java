import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nn")
public final class Class141 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!nn", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!nn", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static183.aClass141_1 == null) {
			return;
		}
		Static64.anInt1349 = 0;
		@Pc(10) int local10 = arg0.getKeyCode();
		if (local10 >= 0 && Static2.anIntArray419.length > local10) {
			local10 = Static2.anIntArray419[local10];
			if ((local10 & 0x80) != 0) {
				local10 = -1;
			}
		} else {
			local10 = -1;
		}
		if (Static9.anInt6463 >= 0 && local10 >= 0) {
			Static124.anIntArray311[Static9.anInt6463] = local10;
			Static9.anInt6463 = Static9.anInt6463 + 1 & 0x7F;
			if (Static90.anInt2015 == Static9.anInt6463) {
				Static9.anInt6463 = -1;
			}
		}
		@Pc(67) int local67;
		if (local10 >= 0) {
			local67 = Static171.anInt3787 + 1 & 0x7F;
			if (local67 != Static11.anInt256) {
				Static196.anIntArray361[Static171.anInt3787] = local10;
				Static154.aCharArray4[Static171.anInt3787] = '\u0000';
				Static171.anInt3787 = local67;
			}
		}
		local67 = arg0.getModifiers();
		if ((local67 & 0xA) != 0 || local10 == 85 || local10 == 10) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!nn", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		if (Static183.aClass141_1 != null) {
			@Pc(8) char local8 = arg0.getKeyChar();
			if (local8 != '\u0000' && local8 != '\uffff' && Static157.method3026(local8)) {
				@Pc(26) int local26 = Static171.anInt3787 + 1 & 0x7F;
				if (Static11.anInt256 != local26) {
					Static196.anIntArray361[Static171.anInt3787] = -1;
					Static154.aCharArray4[Static171.anInt3787] = local8;
					Static171.anInt3787 = local26;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!nn", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static183.aClass141_1 != null) {
			Static9.anInt6463 = -1;
		}
	}

	@OriginalMember(owner = "client!nn", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static183.aClass141_1 != null) {
			Static64.anInt1349 = 0;
			@Pc(6) int local6 = arg0.getKeyCode();
			if (local6 >= 0 && local6 < Static2.anIntArray419.length) {
				local6 = Static2.anIntArray419[local6] & 0xFFFFFF7F;
			} else {
				local6 = -1;
			}
			if (Static9.anInt6463 >= 0 && local6 >= 0) {
				Static124.anIntArray311[Static9.anInt6463] = ~local6;
				Static9.anInt6463 = Static9.anInt6463 + 1 & 0x7F;
				if (Static90.anInt2015 == Static9.anInt6463) {
					Static9.anInt6463 = -1;
				}
			}
		}
		arg0.consume();
	}
}
