import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class37 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!gd", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static51.aClass37_1 != null) {
			Static1.anInt35 = 0;
			@Pc(10) int local10 = arg0.getKeyCode();
			if (local10 >= 0 && Static38.anIntArray273.length > local10) {
				local10 = Static38.anIntArray273[local10] & 0xFFFFFF7F;
			} else {
				local10 = -1;
			}
			if (Static192.anInt3974 >= 0 && local10 >= 0) {
				Static134.anIntArray254[Static192.anInt3974] = ~local10;
				Static192.anInt3974 = Static192.anInt3974 + 1 & 0x7F;
				if (Static65.anInt1370 == Static192.anInt3974) {
					Static192.anInt3974 = -1;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!gd", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		if (Static51.aClass37_1 != null) {
			@Pc(9) int local9 = Static130.method2002(arg0);
			if (local9 >= 0) {
				@Pc(20) int local20 = Static60.anInt1269 + 1 & 0x7F;
				if (local20 != Static64.anInt1346) {
					Static88.anIntArray173[Static60.anInt1269] = -1;
					Static65.anIntArray108[Static60.anInt1269] = local9;
					Static60.anInt1269 = local20;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!gd", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static51.aClass37_1 == null) {
			return;
		}
		Static1.anInt35 = 0;
		@Pc(6) int local6 = arg0.getKeyCode();
		if (local6 >= 0 && local6 < Static38.anIntArray273.length) {
			local6 = Static38.anIntArray273[local6];
			if ((local6 & 0x80) != 0) {
				local6 = -1;
			}
		} else {
			local6 = -1;
		}
		if (Static192.anInt3974 >= 0 && local6 >= 0) {
			Static134.anIntArray254[Static192.anInt3974] = local6;
			Static192.anInt3974 = Static192.anInt3974 + 1 & 0x7F;
			if (Static65.anInt1370 == Static192.anInt3974) {
				Static192.anInt3974 = -1;
			}
		}
		@Pc(59) int local59;
		if (local6 >= 0) {
			local59 = Static60.anInt1269 + 1 & 0x7F;
			if (local59 != Static64.anInt1346) {
				Static88.anIntArray173[Static60.anInt1269] = local6;
				Static65.anIntArray108[Static60.anInt1269] = -1;
				Static60.anInt1269 = local59;
			}
		}
		local59 = arg0.getModifiers();
		if ((local59 & 0xA) != 0 || local6 == 85 || local6 == 10) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!gd", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static51.aClass37_1 != null) {
			Static192.anInt3974 = -1;
		}
	}

	@OriginalMember(owner = "client!gd", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}
}
