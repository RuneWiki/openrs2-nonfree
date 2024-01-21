import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public final class Class15 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!cf", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static86.aClass15_1 == null) {
			return;
		}
		Static90.anInt3878 = 0;
		@Pc(6) int local6 = arg0.getKeyCode();
		if (local6 >= 0 && Static122.anIntArray246.length > local6) {
			local6 = Static122.anIntArray246[local6];
			if ((local6 & 0x80) != 0) {
				local6 = -1;
			}
		} else {
			local6 = -1;
		}
		if (Static76.anInt1827 >= 0 && local6 >= 0) {
			Static56.anIntArray225[Static76.anInt1827] = local6;
			Static76.anInt1827 = Static76.anInt1827 + 1 & 0x7F;
			if (Static153.anInt3534 == Static76.anInt1827) {
				Static76.anInt1827 = -1;
			}
		}
		@Pc(61) int local61;
		if (local6 >= 0) {
			local61 = Static176.anInt4072 + 1 & 0x7F;
			if (local61 != Static138.anInt3226) {
				Static81.anIntArray145[Static176.anInt4072] = local6;
				Static105.anIntArray217[Static176.anInt4072] = -1;
				Static176.anInt4072 = local61;
			}
		}
		local61 = arg0.getModifiers();
		if ((local61 & 0xA) != 0 || local6 == 85 || local6 == 10) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!cf", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static86.aClass15_1 != null) {
			Static90.anInt3878 = 0;
			@Pc(10) int local10 = arg0.getKeyCode();
			if (local10 >= 0 && Static122.anIntArray246.length > local10) {
				local10 = Static122.anIntArray246[local10] & 0xFFFFFF7F;
			} else {
				local10 = -1;
			}
			if (Static76.anInt1827 >= 0 && local10 >= 0) {
				Static56.anIntArray225[Static76.anInt1827] = ~local10;
				Static76.anInt1827 = Static76.anInt1827 + 1 & 0x7F;
				if (Static76.anInt1827 == Static153.anInt3534) {
					Static76.anInt1827 = -1;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!cf", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static86.aClass15_1 != null) {
			Static76.anInt1827 = -1;
		}
	}

	@OriginalMember(owner = "client!cf", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!cf", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		if (Static86.aClass15_1 != null) {
			@Pc(9) int local9 = Static36.method640(arg0);
			if (local9 >= 0) {
				@Pc(17) int local17 = Static176.anInt4072 + 1 & 0x7F;
				if (Static138.anInt3226 != local17) {
					Static81.anIntArray145[Static176.anInt4072] = -1;
					Static105.anIntArray217[Static176.anInt4072] = local9;
					Static176.anInt4072 = local17;
				}
			}
		}
		arg0.consume();
	}
}
