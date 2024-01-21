import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ha")
public final class Class35 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!ha", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static129.aClass35_1 != null) {
			Static7.anInt319 = 0;
			@Pc(6) int local6 = arg0.getKeyCode();
			if (local6 >= 0 && local6 < Static104.anIntArray359.length) {
				local6 = Static104.anIntArray359[local6] & 0xFFFFFF7F;
			} else {
				local6 = -1;
			}
			if (Static170.anInt803 >= 0 && local6 >= 0) {
				Static60.anIntArray610[Static170.anInt803] = ~local6;
				Static170.anInt803 = Static170.anInt803 + 1 & 0x7F;
				if (Static30.anInt2832 == Static170.anInt803) {
					Static170.anInt803 = -1;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!ha", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static129.aClass35_1 != null) {
			Static170.anInt803 = -1;
		}
	}

	@OriginalMember(owner = "client!ha", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!ha", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		if (Static129.aClass35_1 != null) {
			@Pc(5) int local5 = Static94.method1626(arg0);
			if (local5 >= 0) {
				@Pc(13) int local13 = Static97.anInt2500 + 1 & 0x7F;
				if (Static7.anInt324 != local13) {
					Static160.anIntArray540[Static97.anInt2500] = -1;
					Static98.anIntArray311[Static97.anInt2500] = local5;
					Static97.anInt2500 = local13;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!ha", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static129.aClass35_1 == null) {
			return;
		}
		Static7.anInt319 = 0;
		@Pc(6) int local6 = arg0.getKeyCode();
		if (local6 >= 0 && local6 < Static104.anIntArray359.length) {
			local6 = Static104.anIntArray359[local6];
			if ((local6 & 0x80) != 0) {
				local6 = -1;
			}
		} else {
			local6 = -1;
		}
		if (Static170.anInt803 >= 0 && local6 >= 0) {
			Static60.anIntArray610[Static170.anInt803] = local6;
			Static170.anInt803 = Static170.anInt803 + 1 & 0x7F;
			if (Static170.anInt803 == Static30.anInt2832) {
				Static170.anInt803 = -1;
			}
		}
		@Pc(65) int local65;
		if (local6 >= 0) {
			local65 = Static97.anInt2500 + 1 & 0x7F;
			if (local65 != Static7.anInt324) {
				Static160.anIntArray540[Static97.anInt2500] = local6;
				Static98.anIntArray311[Static97.anInt2500] = -1;
				Static97.anInt2500 = local65;
			}
		}
		local65 = arg0.getModifiers();
		if ((local65 & 0xA) != 0 || local6 == 85 || local6 == 10) {
			arg0.consume();
		}
	}
}
