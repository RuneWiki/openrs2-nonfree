import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class Class26 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!ic", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static50.aClass26_1 != null) {
			Static53.anInt1943 = 0;
			@Pc(12) int local12 = arg0.getKeyCode();
			if (local12 >= 0 && Static62.anIntArray255.length > local12) {
				local12 = Static62.anIntArray255[local12];
				if ((local12 & 0x80) != 0) {
					local12 = -1;
				}
			} else {
				local12 = -1;
			}
			@Pc(59) int local59;
			if (local12 == 85 || local12 == 80 || local12 == 84 || local12 == 0 || local12 == 101) {
				local59 = -1;
			} else {
				local59 = Static21.method1513(arg0);
			}
			if (Static20.anInt637 >= 0 && local12 >= 0) {
				Static99.anIntArray368[Static20.anInt637] = local12;
				Static20.anInt637 = Static20.anInt637 + 1 & 0x7F;
				if (Static20.anInt637 == Static98.anInt2760) {
					Static20.anInt637 = -1;
				}
			}
			if (local12 >= 0 || local59 >= 0) {
				@Pc(97) int local97 = Static87.anInt2521 + 1 & 0x7F;
				if (local97 != Static81.anInt2913) {
					Static76.anIntArray301[Static87.anInt2521] = local12;
					Static5.anIntArray30[Static87.anInt2521] = local59;
					Static87.anInt2521 = local97;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!ic", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!ic", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static50.aClass26_1 != null) {
			Static53.anInt1943 = 0;
			@Pc(10) int local10 = arg0.getKeyCode();
			if (local10 >= 0 && Static62.anIntArray255.length > local10) {
				local10 = Static62.anIntArray255[local10] & 0xFFFFFF7F;
			} else {
				local10 = -1;
			}
			if (Static20.anInt637 >= 0 && local10 >= 0) {
				Static99.anIntArray368[Static20.anInt637] = ~local10;
				Static20.anInt637 = Static20.anInt637 + 1 & 0x7F;
				if (Static20.anInt637 == Static98.anInt2760) {
					Static20.anInt637 = -1;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!ic", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static50.aClass26_1 != null) {
			Static20.anInt637 = -1;
		}
	}

	@OriginalMember(owner = "client!ic", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		arg0.consume();
	}
}
