import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jd")
public final class Class29 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!jd", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!jd", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		arg0.consume();
	}

	@OriginalMember(owner = "client!jd", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static113.aClass29_1 != null) {
			Static47.anInt1598 = -1;
		}
	}

	@OriginalMember(owner = "client!jd", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static113.aClass29_1 != null) {
			Static89.anInt2391 = 0;
			@Pc(10) int local10 = arg0.getKeyCode();
			if (local10 >= 0 && local10 < Static63.anIntArray224.length) {
				local10 = Static63.anIntArray224[local10] & 0xFFFFFF7F;
			} else {
				local10 = -1;
			}
			if (Static47.anInt1598 >= 0 && local10 >= 0) {
				Static60.anIntArray208[Static47.anInt1598] = ~local10;
				Static47.anInt1598 = Static47.anInt1598 + 1 & 0x7F;
				if (Static55.anInt1716 == Static47.anInt1598) {
					Static47.anInt1598 = -1;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!jd", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static113.aClass29_1 != null) {
			Static89.anInt2391 = 0;
			@Pc(12) int local12 = arg0.getKeyCode();
			if (local12 >= 0 && Static63.anIntArray224.length > local12) {
				local12 = Static63.anIntArray224[local12];
				if ((local12 & 0x80) != 0) {
					local12 = -1;
				}
			} else {
				local12 = -1;
			}
			@Pc(61) int local61;
			if (local12 == 85 || local12 == 80 || local12 == 84 || local12 == 0 || local12 == 101) {
				local61 = -1;
			} else {
				local61 = Static64.method1240(arg0);
			}
			if (Static47.anInt1598 >= 0 && local12 >= 0) {
				Static60.anIntArray208[Static47.anInt1598] = local12;
				Static47.anInt1598 = Static47.anInt1598 + 1 & 0x7F;
				if (Static55.anInt1716 == Static47.anInt1598) {
					Static47.anInt1598 = -1;
				}
			}
			if (local12 >= 0 || local61 >= 0) {
				@Pc(100) int local100 = Static114.anInt2952 + 1 & 0x7F;
				if (local100 != Static57.anInt1780) {
					Static92.anIntArray406[Static114.anInt2952] = local12;
					Static16.anIntArray60[Static114.anInt2952] = local61;
					Static114.anInt2952 = local100;
				}
			}
		}
		arg0.consume();
	}
}
