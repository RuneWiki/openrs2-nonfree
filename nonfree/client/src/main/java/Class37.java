import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gi")
public final class Class37 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!gi", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static15.aClass37_1 != null) {
			Static100.anInt2251 = -1;
		}
	}

	@OriginalMember(owner = "client!gi", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static15.aClass37_1 != null) {
			Static129.anInt2833 = 0;
			@Pc(10) int local10 = arg0.getKeyCode();
			if (local10 >= 0 && local10 < Static71.anIntArray147.length) {
				local10 = Static71.anIntArray147[local10] & 0xFFFFFF7F;
			} else {
				local10 = -1;
			}
			if (Static100.anInt2251 >= 0 && local10 >= 0) {
				Static132.anIntArray239[Static100.anInt2251] = ~local10;
				Static100.anInt2251 = Static100.anInt2251 + 1 & 0x7F;
				if (Static204.anInt4556 == Static100.anInt2251) {
					Static100.anInt2251 = -1;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!gi", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		if (Static15.aClass37_1 != null) {
			@Pc(5) int local5 = Static67.method1325(arg0);
			if (local5 >= 0) {
				@Pc(16) int local16 = Static50.anInt1254 + 1 & 0x7F;
				if (local16 != Static173.anInt3864) {
					Static81.anIntArray166[Static50.anInt1254] = -1;
					Static77.anIntArray159[Static50.anInt1254] = local5;
					Static50.anInt1254 = local16;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!gi", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!gi", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static15.aClass37_1 == null) {
			return;
		}
		Static129.anInt2833 = 0;
		@Pc(10) int local10 = arg0.getKeyCode();
		if (local10 >= 0 && local10 < Static71.anIntArray147.length) {
			local10 = Static71.anIntArray147[local10];
			if ((local10 & 0x80) != 0) {
				local10 = -1;
			}
		} else {
			local10 = -1;
		}
		if (Static100.anInt2251 >= 0 && local10 >= 0) {
			Static132.anIntArray239[Static100.anInt2251] = local10;
			Static100.anInt2251 = Static100.anInt2251 + 1 & 0x7F;
			if (Static204.anInt4556 == Static100.anInt2251) {
				Static100.anInt2251 = -1;
			}
		}
		@Pc(71) int local71;
		if (local10 >= 0) {
			local71 = Static50.anInt1254 + 1 & 0x7F;
			if (local71 != Static173.anInt3864) {
				Static81.anIntArray166[Static50.anInt1254] = local10;
				Static77.anIntArray159[Static50.anInt1254] = -1;
				Static50.anInt1254 = local71;
			}
		}
		local71 = arg0.getModifiers();
		if ((local71 & 0xA) != 0 || local10 == 85 || local10 == 10) {
			arg0.consume();
		}
	}
}
