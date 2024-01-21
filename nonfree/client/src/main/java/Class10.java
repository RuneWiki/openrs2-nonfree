import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ca")
public final class Class10 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!ca", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static119.aClass10_1 != null) {
			Static12.anInt306 = -1;
		}
	}

	@OriginalMember(owner = "client!ca", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		arg0.consume();
	}

	@OriginalMember(owner = "client!ca", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static119.aClass10_1 != null) {
			Static94.anInt2475 = 0;
			@Pc(8) int local8 = arg0.getKeyCode();
			if (local8 >= 0 && Static59.anIntArray134.length > local8) {
				local8 = Static59.anIntArray134[local8];
				if ((local8 & 0x80) != 0) {
					local8 = -1;
				}
			} else {
				local8 = -1;
			}
			@Pc(52) int local52;
			if (local8 == 85 || local8 == 80 || local8 == 84 || local8 == 0 || local8 == 101) {
				local52 = -1;
			} else {
				local52 = Static15.method327(arg0);
			}
			if (Static12.anInt306 >= 0 && local8 >= 0) {
				Static44.anIntArray77[Static12.anInt306] = local8;
				Static12.anInt306 = Static12.anInt306 + 1 & 0x7F;
				if (Static57.anInt1617 == Static12.anInt306) {
					Static12.anInt306 = -1;
				}
			}
			if (local8 >= 0 || local52 >= 0) {
				@Pc(97) int local97 = Static114.anInt2884 + 1 & 0x7F;
				if (Static26.anInt763 != local97) {
					Static1.anIntArray1[Static114.anInt2884] = local8;
					Static126.anIntArray330[Static114.anInt2884] = local52;
					Static114.anInt2884 = local97;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!ca", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static119.aClass10_1 != null) {
			Static94.anInt2475 = 0;
			@Pc(10) int local10 = arg0.getKeyCode();
			if (local10 >= 0 && local10 < Static59.anIntArray134.length) {
				local10 = Static59.anIntArray134[local10] & 0xFFFFFF7F;
			} else {
				local10 = -1;
			}
			if (Static12.anInt306 >= 0 && local10 >= 0) {
				Static44.anIntArray77[Static12.anInt306] = ~local10;
				Static12.anInt306 = Static12.anInt306 + 1 & 0x7F;
				if (Static12.anInt306 == Static57.anInt1617) {
					Static12.anInt306 = -1;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!ca", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}
}
