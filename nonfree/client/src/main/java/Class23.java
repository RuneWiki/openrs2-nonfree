import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class23 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!gb", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static80.aClass23_1 == null) {
			return;
		}
		Static91.anInt2766 = 0;
		@Pc(6) int local6 = arg0.getKeyCode();
		if (local6 >= 0 && local6 < Static32.anIntArray71.length) {
			local6 = Static32.anIntArray71[local6];
			if ((local6 & 0x80) != 0) {
				local6 = -1;
			}
		} else {
			local6 = -1;
		}
		if (Static25.anInt880 >= 0 && local6 >= 0) {
			Static108.anIntArray280[Static25.anInt880] = local6;
			Static25.anInt880 = Static25.anInt880 + 1 & 0x7F;
			if (Static143.anInt3955 == Static25.anInt880) {
				Static25.anInt880 = -1;
			}
		}
		@Pc(64) int local64;
		if (local6 >= 0) {
			local64 = Static86.anInt2624 + 1 & 0x7F;
			if (Static118.anInt3368 != local64) {
				Static174.anIntArray426[Static86.anInt2624] = local6;
				Static156.anIntArray395[Static86.anInt2624] = -1;
				Static86.anInt2624 = local64;
			}
		}
		local64 = arg0.getModifiers();
		if ((local64 & 0xA) != 0 || local6 == 85 || local6 == 10) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!gb", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static80.aClass23_1 != null) {
			Static25.anInt880 = -1;
		}
	}

	@OriginalMember(owner = "client!gb", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static80.aClass23_1 != null) {
			Static91.anInt2766 = 0;
			@Pc(6) int local6 = arg0.getKeyCode();
			if (local6 >= 0 && Static32.anIntArray71.length > local6) {
				local6 = Static32.anIntArray71[local6] & 0xFFFFFF7F;
			} else {
				local6 = -1;
			}
			if (Static25.anInt880 >= 0 && local6 >= 0) {
				Static108.anIntArray280[Static25.anInt880] = ~local6;
				Static25.anInt880 = Static25.anInt880 + 1 & 0x7F;
				if (Static25.anInt880 == Static143.anInt3955) {
					Static25.anInt880 = -1;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!gb", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		if (Static80.aClass23_1 != null) {
			@Pc(9) int local9 = Static162.method2994(arg0);
			if (local9 >= 0) {
				@Pc(17) int local17 = Static86.anInt2624 + 1 & 0x7F;
				if (local17 != Static118.anInt3368) {
					Static174.anIntArray426[Static86.anInt2624] = -1;
					Static156.anIntArray395[Static86.anInt2624] = local9;
					Static86.anInt2624 = local17;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!gb", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}
}
