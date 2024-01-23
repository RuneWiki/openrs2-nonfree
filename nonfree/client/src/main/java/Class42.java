import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class42 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!he", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		if (Static85.aClass42_1 != null) {
			@Pc(5) int local5 = Static56.method1064(arg0);
			if (local5 >= 0) {
				@Pc(16) int local16 = Static166.anInt3602 + 1 & 0x7F;
				if (Static141.anInt3165 != local16) {
					Static36.anIntArray508[Static166.anInt3602] = -1;
					Static177.anIntArray498[Static166.anInt3602] = local5;
					Static166.anInt3602 = local16;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!he", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static85.aClass42_1 != null) {
			Static115.anInt2624 = 0;
			@Pc(6) int local6 = arg0.getKeyCode();
			if (local6 >= 0 && local6 < Static55.anIntArray168.length) {
				local6 = Static55.anIntArray168[local6] & 0xFFFFFF7F;
			} else {
				local6 = -1;
			}
			if (Static214.anInt4567 >= 0 && local6 >= 0) {
				Static11.anIntArray655[Static214.anInt4567] = ~local6;
				Static214.anInt4567 = Static214.anInt4567 + 1 & 0x7F;
				if (Static214.anInt4567 == Static84.anInt1464) {
					Static214.anInt4567 = -1;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!he", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static85.aClass42_1 == null) {
			return;
		}
		Static115.anInt2624 = 0;
		@Pc(10) int local10 = arg0.getKeyCode();
		if (local10 >= 0 && local10 < Static55.anIntArray168.length) {
			local10 = Static55.anIntArray168[local10];
			if ((local10 & 0x80) != 0) {
				local10 = -1;
			}
		} else {
			local10 = -1;
		}
		if (Static214.anInt4567 >= 0 && local10 >= 0) {
			Static11.anIntArray655[Static214.anInt4567] = local10;
			Static214.anInt4567 = Static214.anInt4567 + 1 & 0x7F;
			if (Static84.anInt1464 == Static214.anInt4567) {
				Static214.anInt4567 = -1;
			}
		}
		@Pc(67) int local67;
		if (local10 >= 0) {
			local67 = Static166.anInt3602 + 1 & 0x7F;
			if (Static141.anInt3165 != local67) {
				Static36.anIntArray508[Static166.anInt3602] = local10;
				Static177.anIntArray498[Static166.anInt3602] = -1;
				Static166.anInt3602 = local67;
			}
		}
		local67 = arg0.getModifiers();
		if ((local67 & 0xA) != 0 || local10 == 85 || local10 == 10) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!he", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static85.aClass42_1 != null) {
			Static214.anInt4567 = -1;
		}
	}

	@OriginalMember(owner = "client!he", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}
}
