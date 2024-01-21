import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uh")
public final class Class88 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!uh", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		if (Static71.aClass88_1 != null) {
			@Pc(5) int local5 = Static166.method2755(arg0);
			if (local5 >= 0) {
				@Pc(16) int local16 = Static131.anInt3137 + 1 & 0x7F;
				if (local16 != Static170.anInt3816) {
					Static15.anIntArray42[Static131.anInt3137] = -1;
					Static102.anIntArray241[Static131.anInt3137] = local5;
					Static131.anInt3137 = local16;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!uh", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static71.aClass88_1 == null) {
			return;
		}
		Static5.anInt215 = 0;
		@Pc(10) int local10 = arg0.getKeyCode();
		if (local10 >= 0 && Static144.anIntArray319.length > local10) {
			local10 = Static144.anIntArray319[local10];
			if ((local10 & 0x80) != 0) {
				local10 = -1;
			}
		} else {
			local10 = -1;
		}
		if (Static69.anInt1852 >= 0 && local10 >= 0) {
			Static24.anIntArray60[Static69.anInt1852] = local10;
			Static69.anInt1852 = Static69.anInt1852 + 1 & 0x7F;
			if (Static69.anInt1852 == Static181.anInt4074) {
				Static69.anInt1852 = -1;
			}
		}
		@Pc(68) int local68;
		if (local10 >= 0) {
			local68 = Static131.anInt3137 + 1 & 0x7F;
			if (Static170.anInt3816 != local68) {
				Static15.anIntArray42[Static131.anInt3137] = local10;
				Static102.anIntArray241[Static131.anInt3137] = -1;
				Static131.anInt3137 = local68;
			}
		}
		local68 = arg0.getModifiers();
		if ((local68 & 0xA) != 0 || local10 == 85 || local10 == 10) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!uh", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static71.aClass88_1 != null) {
			Static5.anInt215 = 0;
			@Pc(10) int local10 = arg0.getKeyCode();
			if (local10 >= 0 && Static144.anIntArray319.length > local10) {
				local10 = Static144.anIntArray319[local10] & 0xFFFFFF7F;
			} else {
				local10 = -1;
			}
			if (Static69.anInt1852 >= 0 && local10 >= 0) {
				Static24.anIntArray60[Static69.anInt1852] = ~local10;
				Static69.anInt1852 = Static69.anInt1852 + 1 & 0x7F;
				if (Static69.anInt1852 == Static181.anInt4074) {
					Static69.anInt1852 = -1;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!uh", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static71.aClass88_1 != null) {
			Static69.anInt1852 = -1;
		}
	}

	@OriginalMember(owner = "client!uh", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}
}
