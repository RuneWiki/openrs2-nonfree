import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public final class Class29 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!hd", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static12.aClass29_1 != null) {
			Static59.anInt1621 = 0;
			@Pc(8) int local8 = arg0.getKeyCode();
			if (local8 >= 0 && local8 < Static3.anIntArray18.length) {
				local8 = Static3.anIntArray18[local8];
				if ((local8 & 0x80) != 0) {
					local8 = -1;
				}
			} else {
				local8 = -1;
			}
			@Pc(55) int local55;
			if (local8 == 85 || local8 == 80 || local8 == 84 || local8 == 0 || local8 == 101) {
				local55 = -1;
			} else {
				local55 = Static94.method1592(arg0);
			}
			if (Static14.anInt544 >= 0 && local8 >= 0) {
				Static71.anIntArray202[Static14.anInt544] = local8;
				Static14.anInt544 = Static14.anInt544 + 1 & 0x7F;
				if (Static14.anInt544 == Static72.anInt1950) {
					Static14.anInt544 = -1;
				}
			}
			if (local8 >= 0 || local55 >= 0) {
				@Pc(98) int local98 = Static40.anInt1168 + 1 & 0x7F;
				if (local98 != Static27.anInt824) {
					Static44.anIntArray96[Static40.anInt1168] = local8;
					Static68.anIntArray200[Static40.anInt1168] = local55;
					Static40.anInt1168 = local98;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!hd", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		arg0.consume();
	}

	@OriginalMember(owner = "client!hd", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static12.aClass29_1 != null) {
			Static59.anInt1621 = 0;
			@Pc(6) int local6 = arg0.getKeyCode();
			if (local6 >= 0 && local6 < Static3.anIntArray18.length) {
				local6 = Static3.anIntArray18[local6] & 0xFFFFFF7F;
			} else {
				local6 = -1;
			}
			if (Static14.anInt544 >= 0 && local6 >= 0) {
				Static71.anIntArray202[Static14.anInt544] = ~local6;
				Static14.anInt544 = Static14.anInt544 + 1 & 0x7F;
				if (Static14.anInt544 == Static72.anInt1950) {
					Static14.anInt544 = -1;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!hd", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!hd", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static12.aClass29_1 != null) {
			Static14.anInt544 = -1;
		}
	}
}
