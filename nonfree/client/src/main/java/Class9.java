import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class9 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!bd", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!bd", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		arg0.consume();
	}

	@OriginalMember(owner = "client!bd", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static77.aClass9_1 != null) {
			Static86.anInt2232 = 0;
			@Pc(10) int local10 = arg0.getKeyCode();
			if (local10 >= 0 && Static18.anIntArray29.length > local10) {
				local10 = Static18.anIntArray29[local10] & 0xFFFFFF7F;
			} else {
				local10 = -1;
			}
			if (Static69.anInt1751 >= 0 && local10 >= 0) {
				Static89.anIntArray276[Static69.anInt1751] = ~local10;
				Static69.anInt1751 = Static69.anInt1751 + 1 & 0x7F;
				if (Static42.anInt1107 == Static69.anInt1751) {
					Static69.anInt1751 = -1;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!bd", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static77.aClass9_1 != null) {
			Static69.anInt1751 = -1;
		}
	}

	@OriginalMember(owner = "client!bd", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static77.aClass9_1 != null) {
			Static86.anInt2232 = 0;
			@Pc(12) int local12 = arg0.getKeyCode();
			if (local12 >= 0 && local12 < Static18.anIntArray29.length) {
				local12 = Static18.anIntArray29[local12];
				if ((local12 & 0x80) != 0) {
					local12 = -1;
				}
			} else {
				local12 = -1;
			}
			@Pc(55) int local55;
			if (local12 == 85 || local12 == 80 || local12 == 84 || local12 == 0 || local12 == 101) {
				local55 = -1;
			} else {
				local55 = Static50.method966(arg0);
			}
			if (Static69.anInt1751 >= 0 && local12 >= 0) {
				Static89.anIntArray276[Static69.anInt1751] = local12;
				Static69.anInt1751 = Static69.anInt1751 + 1 & 0x7F;
				if (Static69.anInt1751 == Static42.anInt1107) {
					Static69.anInt1751 = -1;
				}
			}
			if (local12 >= 0 || local55 >= 0) {
				@Pc(96) int local96 = Static59.anInt1586 + 1 & 0x7F;
				if (Static19.anInt2912 != local96) {
					Static77.anIntArray240[Static59.anInt1586] = local12;
					Static1.anIntArray2[Static59.anInt1586] = local55;
					Static59.anInt1586 = local96;
				}
			}
		}
		arg0.consume();
	}
}
