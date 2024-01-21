import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public final class Class27 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!ed", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static85.aClass27_1 == null) {
			return;
		}
		Static213.anInt4241 = 0;
		@Pc(6) int local6 = arg0.getKeyCode();
		if (local6 >= 0 && local6 < Static35.anIntArray72.length) {
			local6 = Static35.anIntArray72[local6];
			if ((local6 & 0x80) != 0) {
				local6 = -1;
			}
		} else {
			local6 = -1;
		}
		if (Static82.anInt1828 >= 0 && local6 >= 0) {
			Static180.anIntArray365[Static82.anInt1828] = local6;
			Static82.anInt1828 = Static82.anInt1828 + 1 & 0x7F;
			if (Static137.anInt2904 == Static82.anInt1828) {
				Static82.anInt1828 = -1;
			}
		}
		@Pc(62) int local62;
		if (local6 >= 0) {
			local62 = Static69.anInt1633 + 1 & 0x7F;
			if (Static6.anInt138 != local62) {
				Static55.anIntArray109[Static69.anInt1633] = local6;
				Static141.anIntArray294[Static69.anInt1633] = -1;
				Static69.anInt1633 = local62;
			}
		}
		local62 = arg0.getModifiers();
		if ((local62 & 0xA) != 0 || local6 == 85 || local6 == 10) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ed", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		if (Static85.aClass27_1 != null) {
			@Pc(5) int local5 = Static75.method1426(arg0);
			if (local5 >= 0) {
				@Pc(13) int local13 = Static69.anInt1633 + 1 & 0x7F;
				if (local13 != Static6.anInt138) {
					Static55.anIntArray109[Static69.anInt1633] = -1;
					Static141.anIntArray294[Static69.anInt1633] = local5;
					Static69.anInt1633 = local13;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!ed", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static85.aClass27_1 != null) {
			Static82.anInt1828 = -1;
		}
	}

	@OriginalMember(owner = "client!ed", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static85.aClass27_1 != null) {
			Static213.anInt4241 = 0;
			@Pc(10) int local10 = arg0.getKeyCode();
			if (local10 >= 0 && local10 < Static35.anIntArray72.length) {
				local10 = Static35.anIntArray72[local10] & 0xFFFFFF7F;
			} else {
				local10 = -1;
			}
			if (Static82.anInt1828 >= 0 && local10 >= 0) {
				Static180.anIntArray365[Static82.anInt1828] = ~local10;
				Static82.anInt1828 = Static82.anInt1828 + 1 & 0x7F;
				if (Static82.anInt1828 == Static137.anInt2904) {
					Static82.anInt1828 = -1;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!ed", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}
}
