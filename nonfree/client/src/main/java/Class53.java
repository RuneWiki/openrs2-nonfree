import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class53 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!qb", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static15.aClass53_1 != null) {
			Static91.anInt2519 = 0;
			@Pc(12) int local12 = arg0.getKeyCode();
			if (local12 >= 0 && Static59.anIntArray256.length > local12) {
				local12 = Static59.anIntArray256[local12];
				if ((local12 & 0x80) != 0) {
					local12 = -1;
				}
			} else {
				local12 = -1;
			}
			@Pc(63) int local63;
			if (local12 == 85 || local12 == 80 || local12 == 84 || local12 == 0 || local12 == 101) {
				local63 = -1;
			} else {
				local63 = Static42.method895(arg0);
			}
			if (Static82.anInt2201 >= 0 && local12 >= 0) {
				Static10.anIntArray50[Static82.anInt2201] = local12;
				Static82.anInt2201 = Static82.anInt2201 + 1 & 0x7F;
				if (Static94.anInt2552 == Static82.anInt2201) {
					Static82.anInt2201 = -1;
				}
			}
			if (local12 >= 0 || local63 >= 0) {
				@Pc(99) int local99 = Static32.anInt810 + 1 & 0x7F;
				if (Static65.anInt1666 != local99) {
					Static15.anIntArray54[Static32.anInt810] = local12;
					Static70.anIntArray308[Static32.anInt810] = local63;
					Static32.anInt810 = local99;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!qb", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static15.aClass53_1 != null) {
			Static91.anInt2519 = 0;
			@Pc(6) int local6 = arg0.getKeyCode();
			if (local6 >= 0 && Static59.anIntArray256.length > local6) {
				local6 = Static59.anIntArray256[local6] & 0xFFFFFF7F;
			} else {
				local6 = -1;
			}
			if (Static82.anInt2201 >= 0 && local6 >= 0) {
				Static10.anIntArray50[Static82.anInt2201] = ~local6;
				Static82.anInt2201 = Static82.anInt2201 + 1 & 0x7F;
				if (Static82.anInt2201 == Static94.anInt2552) {
					Static82.anInt2201 = -1;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!qb", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static15.aClass53_1 != null) {
			Static82.anInt2201 = -1;
		}
	}

	@OriginalMember(owner = "client!qb", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!qb", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		arg0.consume();
	}
}
