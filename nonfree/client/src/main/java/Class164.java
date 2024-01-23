import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class164 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!tb", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static275.aClass164_1 != null) {
			Static241.anInt4596 = -1;
		}
	}

	@OriginalMember(owner = "client!tb", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		if (Static275.aClass164_1 != null) {
			@Pc(9) char local9 = arg0.getKeyChar();
			if (local9 != '\u0000' && local9 != '\uffff' && Static226.method424(local9)) {
				@Pc(27) int local27 = Static255.anInt4862 + 1 & 0x7F;
				if (local27 != Static223.anInt4305) {
					Static80.anIntArray125[Static255.anInt4862] = -1;
					Static212.aCharArray2[Static255.anInt4862] = local9;
					Static255.anInt4862 = local27;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!tb", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!tb", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static275.aClass164_1 == null) {
			return;
		}
		Static221.anInt4280 = 0;
		@Pc(7) int local7 = arg0.getKeyCode();
		if (local7 >= 0 && local7 < Static213.anIntArray445.length) {
			local7 = Static213.anIntArray445[local7];
			if ((local7 & 0x80) != 0) {
				local7 = -1;
			}
		} else {
			local7 = -1;
		}
		if (Static241.anInt4596 >= 0 && local7 >= 0) {
			Static278.anIntArray596[Static241.anInt4596] = local7;
			Static241.anInt4596 = Static241.anInt4596 + 1 & 0x7F;
			if (Static241.anInt4596 == Static171.anInt3314) {
				Static241.anInt4596 = -1;
			}
		}
		@Pc(71) int local71;
		if (local7 >= 0) {
			local71 = Static255.anInt4862 + 1 & 0x7F;
			if (local71 != Static223.anInt4305) {
				Static80.anIntArray125[Static255.anInt4862] = local7;
				Static212.aCharArray2[Static255.anInt4862] = '\u0000';
				Static255.anInt4862 = local71;
			}
		}
		local71 = arg0.getModifiers();
		if ((local71 & 0xA) != 0 || local7 == 85 || local7 == 10) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!tb", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static275.aClass164_1 != null) {
			Static221.anInt4280 = 0;
			@Pc(10) int local10 = arg0.getKeyCode();
			if (local10 >= 0 && local10 < Static213.anIntArray445.length) {
				local10 = Static213.anIntArray445[local10] & 0xFFFFFF7F;
			} else {
				local10 = -1;
			}
			if (Static241.anInt4596 >= 0 && local10 >= 0) {
				Static278.anIntArray596[Static241.anInt4596] = ~local10;
				Static241.anInt4596 = Static241.anInt4596 + 1 & 0x7F;
				if (Static171.anInt3314 == Static241.anInt4596) {
					Static241.anInt4596 = -1;
				}
			}
		}
		arg0.consume();
	}
}
