import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!in")
public final class Class93 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!in", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static7.aClass93_1 == null) {
			return;
		}
		Static72.anInt1799 = 0;
		@Pc(10) int local10 = arg0.getKeyCode();
		if (local10 >= 0 && Static68.anIntArray79.length > local10) {
			local10 = Static68.anIntArray79[local10];
			if ((local10 & 0x80) != 0) {
				local10 = -1;
			}
		} else {
			local10 = -1;
		}
		if (Static244.anInt4742 >= 0 && local10 >= 0) {
			Static209.anIntArray300[Static244.anInt4742] = local10;
			Static244.anInt4742 = Static244.anInt4742 + 1 & 0x7F;
			if (Static244.anInt4742 == Static261.anInt5033) {
				Static244.anInt4742 = -1;
			}
		}
		@Pc(70) int local70;
		if (local10 >= 0) {
			local70 = Static232.anInt4547 + 1 & 0x7F;
			if (Static133.anInt6593 != local70) {
				Static275.anIntArray405[Static232.anInt4547] = local10;
				Static40.aCharArray4[Static232.anInt4547] = '\u0000';
				Static232.anInt4547 = local70;
			}
		}
		local70 = arg0.getModifiers();
		if ((local70 & 0xA) != 0 || local10 == 85 || local10 == 10) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!in", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static7.aClass93_1 != null) {
			Static244.anInt4742 = -1;
		}
	}

	@OriginalMember(owner = "client!in", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!in", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		if (Static7.aClass93_1 != null) {
			@Pc(4) char local4 = arg0.getKeyChar();
			if (local4 != '\u0000' && local4 != '\uffff' && Static121.method2395(local4)) {
				@Pc(19) int local19 = Static232.anInt4547 + 1 & 0x7F;
				if (Static133.anInt6593 != local19) {
					Static275.anIntArray405[Static232.anInt4547] = -1;
					Static40.aCharArray4[Static232.anInt4547] = local4;
					Static232.anInt4547 = local19;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!in", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static7.aClass93_1 != null) {
			Static72.anInt1799 = 0;
			@Pc(10) int local10 = arg0.getKeyCode();
			if (local10 >= 0 && local10 < Static68.anIntArray79.length) {
				local10 = Static68.anIntArray79[local10] & 0xFFFFFF7F;
			} else {
				local10 = -1;
			}
			if (Static244.anInt4742 >= 0 && local10 >= 0) {
				Static209.anIntArray300[Static244.anInt4742] = ~local10;
				Static244.anInt4742 = Static244.anInt4742 + 1 & 0x7F;
				if (Static244.anInt4742 == Static261.anInt5033) {
					Static244.anInt4742 = -1;
				}
			}
		}
		arg0.consume();
	}
}
