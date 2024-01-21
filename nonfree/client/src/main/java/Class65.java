import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ra")
public final class Class65 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!ra", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(7) int local7 = Static78.method1303(arg0);
		if (local7 >= 0) {
			@Pc(15) int local15 = Static30.anInt786 + 1 & 0x7F;
			if (local15 != Static73.anInt1768) {
				Static101.anIntArray280[Static30.anInt786] = -1;
				Static48.anIntArray125[Static30.anInt786] = local7;
				Static30.anInt786 = local15;
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!ra", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static11.aClass65_1 != null) {
			Static94.anInt2270 = 0;
			@Pc(6) int local6 = arg0.getKeyCode();
			if (local6 >= 0 && local6 < Static26.anIntArray67.length) {
				local6 = Static26.anIntArray67[local6] & 0xFFFFFF7F;
			} else {
				local6 = -1;
			}
			if (Static128.anInt3143 >= 0 && local6 >= 0) {
				Static2.anIntArray3[Static128.anInt3143] = ~local6;
				Static128.anInt3143 = Static128.anInt3143 + 1 & 0x7F;
				if (Static9.anInt292 == Static128.anInt3143) {
					Static128.anInt3143 = -1;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!ra", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static11.aClass65_1 != null) {
			Static128.anInt3143 = -1;
		}
	}

	@OriginalMember(owner = "client!ra", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static11.aClass65_1 == null) {
			return;
		}
		Static94.anInt2270 = 0;
		@Pc(10) int local10 = arg0.getKeyCode();
		if (local10 >= 0 && local10 < Static26.anIntArray67.length) {
			local10 = Static26.anIntArray67[local10];
			if ((local10 & 0x80) != 0) {
				local10 = -1;
			}
		} else {
			local10 = -1;
		}
		if (Static128.anInt3143 >= 0 && local10 >= 0) {
			Static2.anIntArray3[Static128.anInt3143] = local10;
			Static128.anInt3143 = Static128.anInt3143 + 1 & 0x7F;
			if (Static9.anInt292 == Static128.anInt3143) {
				Static128.anInt3143 = -1;
			}
		}
		@Pc(66) int local66;
		if (local10 >= 0) {
			local66 = Static30.anInt786 + 1 & 0x7F;
			if (Static73.anInt1768 != local66) {
				Static101.anIntArray280[Static30.anInt786] = local10;
				Static48.anIntArray125[Static30.anInt786] = -1;
				Static30.anInt786 = local66;
			}
		}
		local66 = arg0.getModifiers();
		if ((local66 & 0xA) != 0 || local10 == 85 || local10 == 10) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ra", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}
}
