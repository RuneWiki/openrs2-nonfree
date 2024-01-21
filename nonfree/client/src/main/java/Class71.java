import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public final class Class71 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!tc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!tc", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static98.aClass71_1 != null) {
			Static16.anInt2473 = 0;
			@Pc(8) int local8 = arg0.getKeyCode();
			if (local8 >= 0 && local8 < Static4.anIntArray27.length) {
				local8 = Static4.anIntArray27[local8];
				if ((local8 & 0x80) != 0) {
					local8 = -1;
				}
			} else {
				local8 = -1;
			}
			@Pc(54) int local54;
			if (local8 == 85 || local8 == 80 || local8 == 84 || local8 == 0 || local8 == 101) {
				local54 = -1;
			} else {
				local54 = Static58.method1036(arg0);
			}
			if (Static36.anInt1083 >= 0 && local8 >= 0) {
				Static92.anIntArray328[Static36.anInt1083] = local8;
				Static36.anInt1083 = Static36.anInt1083 + 1 & 0x7F;
				if (Static117.anInt2907 == Static36.anInt1083) {
					Static36.anInt1083 = -1;
				}
			}
			if (local8 >= 0 || local54 >= 0) {
				@Pc(99) int local99 = Static69.anInt1767 + 1 & 0x7F;
				if (local99 != Static71.anInt1796) {
					Static112.anIntArray433[Static69.anInt1767] = local8;
					Static53.anIntArray206[Static69.anInt1767] = local54;
					Static69.anInt1767 = local99;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!tc", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		arg0.consume();
	}

	@OriginalMember(owner = "client!tc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static98.aClass71_1 != null) {
			Static36.anInt1083 = -1;
		}
	}

	@OriginalMember(owner = "client!tc", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static98.aClass71_1 != null) {
			Static16.anInt2473 = 0;
			@Pc(10) int local10 = arg0.getKeyCode();
			if (local10 >= 0 && local10 < Static4.anIntArray27.length) {
				local10 = Static4.anIntArray27[local10] & 0xFFFFFF7F;
			} else {
				local10 = -1;
			}
			if (Static36.anInt1083 >= 0 && local10 >= 0) {
				Static92.anIntArray328[Static36.anInt1083] = ~local10;
				Static36.anInt1083 = Static36.anInt1083 + 1 & 0x7F;
				if (Static117.anInt2907 == Static36.anInt1083) {
					Static36.anInt1083 = -1;
				}
			}
		}
		arg0.consume();
	}
}
