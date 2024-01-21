import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public final class Class42 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!la", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		arg0.consume();
	}

	@OriginalMember(owner = "client!la", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static39.aClass42_1 != null) {
			Static48.anInt1145 = 0;
			@Pc(12) int local12 = arg0.getKeyCode();
			if (local12 >= 0 && Static119.anIntArray367.length > local12) {
				local12 = Static119.anIntArray367[local12];
				if ((local12 & 0x80) != 0) {
					local12 = -1;
				}
			} else {
				local12 = -1;
			}
			@Pc(54) int local54;
			if (local12 == 85 || local12 == 80 || local12 == 84 || local12 == 0 || local12 == 101) {
				local54 = -1;
			} else {
				local54 = Static86.method1300(arg0);
			}
			if (Static123.anInt2659 >= 0 && local12 >= 0) {
				Static20.anIntArray62[Static123.anInt2659] = local12;
				Static123.anInt2659 = Static123.anInt2659 + 1 & 0x7F;
				if (Static126.anInt2867 == Static123.anInt2659) {
					Static123.anInt2659 = -1;
				}
			}
			if (local12 >= 0 || local54 >= 0) {
				@Pc(102) int local102 = Static49.anInt1164 + 1 & 0x7F;
				if (local102 != Static1.anInt2101) {
					Static112.anIntArray352[Static49.anInt1164] = local12;
					Static2.anIntArray6[Static49.anInt1164] = local54;
					Static49.anInt1164 = local102;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!la", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static39.aClass42_1 != null) {
			Static123.anInt2659 = -1;
		}
	}

	@OriginalMember(owner = "client!la", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static39.aClass42_1 != null) {
			Static48.anInt1145 = 0;
			@Pc(10) int local10 = arg0.getKeyCode();
			if (local10 >= 0 && Static119.anIntArray367.length > local10) {
				local10 = Static119.anIntArray367[local10] & 0xFFFFFF7F;
			} else {
				local10 = -1;
			}
			if (Static123.anInt2659 >= 0 && local10 >= 0) {
				Static20.anIntArray62[Static123.anInt2659] = ~local10;
				Static123.anInt2659 = Static123.anInt2659 + 1 & 0x7F;
				if (Static126.anInt2867 == Static123.anInt2659) {
					Static123.anInt2659 = -1;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!la", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}
}
