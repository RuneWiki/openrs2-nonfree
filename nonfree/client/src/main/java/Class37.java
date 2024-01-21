import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ha")
public final class Class37 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!ha", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static13.aClass37_1 == null) {
			return;
		}
		Static34.anInt792 = 0;
		@Pc(6) int local6 = arg0.getKeyCode();
		if (local6 >= 0 && local6 < Static108.anIntArray386.length) {
			local6 = Static108.anIntArray386[local6];
			if ((local6 & 0x80) != 0) {
				local6 = -1;
			}
		} else {
			local6 = -1;
		}
		if (Static188.anInt4337 >= 0 && local6 >= 0) {
			Static101.anIntArray289[Static188.anInt4337] = local6;
			Static188.anInt4337 = Static188.anInt4337 + 1 & 0x7F;
			if (Static93.anInt1989 == Static188.anInt4337) {
				Static188.anInt4337 = -1;
			}
		}
		@Pc(62) int local62;
		if (local6 >= 0) {
			local62 = Static157.anInt3502 + 1 & 0x7F;
			if (Static180.anInt4008 != local62) {
				Static197.anIntArray527[Static157.anInt3502] = local6;
				Static59.anIntArray173[Static157.anInt3502] = -1;
				Static157.anInt3502 = local62;
			}
		}
		local62 = arg0.getModifiers();
		if ((local62 & 0xA) != 0 || local6 == 85 || local6 == 10) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ha", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		if (Static13.aClass37_1 != null) {
			@Pc(9) int local9 = Static107.method1630(arg0);
			if (local9 >= 0) {
				@Pc(17) int local17 = Static157.anInt3502 + 1 & 0x7F;
				if (Static180.anInt4008 != local17) {
					Static197.anIntArray527[Static157.anInt3502] = -1;
					Static59.anIntArray173[Static157.anInt3502] = local9;
					Static157.anInt3502 = local17;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!ha", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static13.aClass37_1 != null) {
			Static34.anInt792 = 0;
			@Pc(10) int local10 = arg0.getKeyCode();
			if (local10 >= 0 && local10 < Static108.anIntArray386.length) {
				local10 = Static108.anIntArray386[local10] & 0xFFFFFF7F;
			} else {
				local10 = -1;
			}
			if (Static188.anInt4337 >= 0 && local10 >= 0) {
				Static101.anIntArray289[Static188.anInt4337] = ~local10;
				Static188.anInt4337 = Static188.anInt4337 + 1 & 0x7F;
				if (Static93.anInt1989 == Static188.anInt4337) {
					Static188.anInt4337 = -1;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!ha", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static13.aClass37_1 != null) {
			Static188.anInt4337 = -1;
		}
	}

	@OriginalMember(owner = "client!ha", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}
}
