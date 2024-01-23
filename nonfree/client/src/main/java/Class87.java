import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ob")
public final class Class87 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!ob", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static213.aClass87_1 != null) {
			Static124.anInt2695 = 0;
			@Pc(10) int local10 = arg0.getKeyCode();
			if (local10 >= 0 && local10 < Static39.anIntArray84.length) {
				local10 = Static39.anIntArray84[local10] & 0xFFFFFF7F;
			} else {
				local10 = -1;
			}
			if (Static131.anInt2857 >= 0 && local10 >= 0) {
				Static7.anIntArray17[Static131.anInt2857] = ~local10;
				Static131.anInt2857 = Static131.anInt2857 + 1 & 0x7F;
				if (Static192.anInt4250 == Static131.anInt2857) {
					Static131.anInt2857 = -1;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!ob", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static213.aClass87_1 != null) {
			Static131.anInt2857 = -1;
		}
	}

	@OriginalMember(owner = "client!ob", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!ob", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		if (Static213.aClass87_1 != null) {
			@Pc(9) int local9 = Static29.method580(arg0);
			if (local9 >= 0) {
				@Pc(17) int local17 = Static163.anInt3553 + 1 & 0x7F;
				if (local17 != Static179.anInt3928) {
					Static89.anIntArray199[Static163.anInt3553] = -1;
					Static152.anIntArray295[Static163.anInt3553] = local9;
					Static163.anInt3553 = local17;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!ob", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static213.aClass87_1 == null) {
			return;
		}
		Static124.anInt2695 = 0;
		@Pc(10) int local10 = arg0.getKeyCode();
		if (local10 >= 0 && Static39.anIntArray84.length > local10) {
			local10 = Static39.anIntArray84[local10];
			if ((local10 & 0x80) != 0) {
				local10 = -1;
			}
		} else {
			local10 = -1;
		}
		if (Static131.anInt2857 >= 0 && local10 >= 0) {
			Static7.anIntArray17[Static131.anInt2857] = local10;
			Static131.anInt2857 = Static131.anInt2857 + 1 & 0x7F;
			if (Static192.anInt4250 == Static131.anInt2857) {
				Static131.anInt2857 = -1;
			}
		}
		@Pc(68) int local68;
		if (local10 >= 0) {
			local68 = Static163.anInt3553 + 1 & 0x7F;
			if (Static179.anInt3928 != local68) {
				Static89.anIntArray199[Static163.anInt3553] = local10;
				Static152.anIntArray295[Static163.anInt3553] = -1;
				Static163.anInt3553 = local68;
			}
		}
		local68 = arg0.getModifiers();
		if ((local68 & 0xA) != 0 || local10 == 85 || local10 == 10) {
			arg0.consume();
		}
	}
}
