import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class Class40 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!je", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(7) int local7 = Static24.method444(arg0);
		if (local7 >= 0) {
			@Pc(18) int local18 = Static51.anInt1347 + 1 & 0x7F;
			if (local18 != Static36.anInt1009) {
				Static40.anIntArray109[Static51.anInt1347] = -1;
				Static81.anIntArray223[Static51.anInt1347] = local7;
				Static51.anInt1347 = local18;
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!je", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static108.aClass40_1 != null) {
			Static54.anInt1490 = 0;
			@Pc(6) int local6 = arg0.getKeyCode();
			if (local6 >= 0 && Static130.anIntArray345.length > local6) {
				local6 = Static130.anIntArray345[local6] & 0xFFFFFF7F;
			} else {
				local6 = -1;
			}
			if (Static120.anInt2759 >= 0 && local6 >= 0) {
				Static5.anIntArray6[Static120.anInt2759] = ~local6;
				Static120.anInt2759 = Static120.anInt2759 + 1 & 0x7F;
				if (Static120.anInt2759 == Static59.anInt1563) {
					Static120.anInt2759 = -1;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!je", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static108.aClass40_1 != null) {
			Static120.anInt2759 = -1;
		}
	}

	@OriginalMember(owner = "client!je", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!je", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static108.aClass40_1 == null) {
			return;
		}
		Static54.anInt1490 = 0;
		@Pc(6) int local6 = arg0.getKeyCode();
		if (local6 >= 0 && Static130.anIntArray345.length > local6) {
			local6 = Static130.anIntArray345[local6];
			if ((local6 & 0x80) != 0) {
				local6 = -1;
			}
		} else {
			local6 = -1;
		}
		if (Static120.anInt2759 >= 0 && local6 >= 0) {
			Static5.anIntArray6[Static120.anInt2759] = local6;
			Static120.anInt2759 = Static120.anInt2759 + 1 & 0x7F;
			if (Static59.anInt1563 == Static120.anInt2759) {
				Static120.anInt2759 = -1;
			}
		}
		@Pc(68) int local68;
		if (local6 >= 0) {
			local68 = Static51.anInt1347 + 1 & 0x7F;
			if (Static36.anInt1009 != local68) {
				Static40.anIntArray109[Static51.anInt1347] = local6;
				Static81.anIntArray223[Static51.anInt1347] = -1;
				Static51.anInt1347 = local68;
			}
		}
		local68 = arg0.getModifiers();
		if ((local68 & 0xA) != 0 || local6 == 85 || local6 == 10) {
			arg0.consume();
		}
	}
}
