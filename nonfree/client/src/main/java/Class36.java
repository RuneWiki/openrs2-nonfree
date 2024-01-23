import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fb")
public final class Class36 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!fb", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static10.aClass36_1 != null) {
			Static35.anInt581 = 0;
			@Pc(10) int local10 = arg0.getKeyCode();
			if (local10 >= 0 && Static106.anIntArray400.length > local10) {
				local10 = Static106.anIntArray400[local10] & 0xFFFFFF7F;
			} else {
				local10 = -1;
			}
			if (Static213.anInt2032 >= 0 && local10 >= 0) {
				Static27.anIntArray86[Static213.anInt2032] = ~local10;
				Static213.anInt2032 = Static213.anInt2032 + 1 & 0x7F;
				if (Static33.anInt566 == Static213.anInt2032) {
					Static213.anInt2032 = -1;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!fb", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static10.aClass36_1 == null) {
			return;
		}
		Static35.anInt581 = 0;
		@Pc(6) int local6 = arg0.getKeyCode();
		if (local6 >= 0 && Static106.anIntArray400.length > local6) {
			local6 = Static106.anIntArray400[local6];
			if ((local6 & 0x80) != 0) {
				local6 = -1;
			}
		} else {
			local6 = -1;
		}
		if (Static213.anInt2032 >= 0 && local6 >= 0) {
			Static27.anIntArray86[Static213.anInt2032] = local6;
			Static213.anInt2032 = Static213.anInt2032 + 1 & 0x7F;
			if (Static33.anInt566 == Static213.anInt2032) {
				Static213.anInt2032 = -1;
			}
		}
		@Pc(56) int local56;
		if (local6 >= 0) {
			local56 = Static50.anInt906 + 1 & 0x7F;
			if (Static126.anInt2867 != local56) {
				Static139.anIntArray447[Static50.anInt906] = local6;
				Static64.anIntArray223[Static50.anInt906] = -1;
				Static50.anInt906 = local56;
			}
		}
		local56 = arg0.getModifiers();
		if ((local56 & 0xA) != 0 || local6 == 85 || local6 == 10) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!fb", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		if (Static10.aClass36_1 != null) {
			@Pc(9) int local9 = Static57.method467(arg0);
			if (local9 >= 0) {
				@Pc(17) int local17 = Static50.anInt906 + 1 & 0x7F;
				if (Static126.anInt2867 != local17) {
					Static139.anIntArray447[Static50.anInt906] = -1;
					Static64.anIntArray223[Static50.anInt906] = local9;
					Static50.anInt906 = local17;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!fb", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static10.aClass36_1 != null) {
			Static213.anInt2032 = -1;
		}
	}

	@OriginalMember(owner = "client!fb", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}
}
