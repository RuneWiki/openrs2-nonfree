import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class55 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!re", name = "l", descriptor = "[I")
	public static int[] anIntArray289 = new int[256];

	static {
		for (@Pc(12) int local12 = 0; local12 < 256; local12++) {
			@Pc(15) int local15 = local12;
			for (@Pc(17) int local17 = 0; local17 < 8; local17++) {
				if ((local15 & 0x1) == 1) {
					local15 = local15 >>> 1 ^ 0xEDB88320;
				} else {
					local15 >>>= 0x1;
				}
			}
			anIntArray289[local12] = local15;
		}
	}

	@OriginalMember(owner = "client!re", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		arg0.consume();
	}

	@OriginalMember(owner = "client!re", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!re", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static98.aClass55_1 != null) {
			Static44.anInt1506 = -1;
		}
	}

	@OriginalMember(owner = "client!re", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static98.aClass55_1 != null) {
			Static82.anInt2146 = 0;
			@Pc(12) int local12 = arg0.getKeyCode();
			if (local12 >= 0 && local12 < Static111.anIntArray350.length) {
				local12 = Static111.anIntArray350[local12];
				if ((local12 & 0x80) != 0) {
					local12 = -1;
				}
			} else {
				local12 = -1;
			}
			@Pc(65) int local65;
			if (local12 == 85 || local12 == 80 || local12 == 84 || local12 == 0 || local12 == 101) {
				local65 = -1;
			} else {
				local65 = Static85.method1535(arg0);
			}
			if (Static44.anInt1506 >= 0 && local12 >= 0) {
				Static1.anIntArray1[Static44.anInt1506] = local12;
				Static44.anInt1506 = Static44.anInt1506 + 1 & 0x7F;
				if (Static44.anInt1506 == Static106.anInt2663) {
					Static44.anInt1506 = -1;
				}
			}
			if (local12 >= 0 || local65 >= 0) {
				@Pc(109) int local109 = Static79.anInt2098 + 1 & 0x7F;
				if (Static98.anInt2515 != local109) {
					Static50.anIntArray167[Static79.anInt2098] = local12;
					Static86.anIntArray288[Static79.anInt2098] = local65;
					Static79.anInt2098 = local109;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!re", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static98.aClass55_1 != null) {
			Static82.anInt2146 = 0;
			@Pc(6) int local6 = arg0.getKeyCode();
			if (local6 >= 0 && Static111.anIntArray350.length > local6) {
				local6 = Static111.anIntArray350[local6] & 0xFFFFFF7F;
			} else {
				local6 = -1;
			}
			if (Static44.anInt1506 >= 0 && local6 >= 0) {
				Static1.anIntArray1[Static44.anInt1506] = ~local6;
				Static44.anInt1506 = Static44.anInt1506 + 1 & 0x7F;
				if (Static106.anInt2663 == Static44.anInt1506) {
					Static44.anInt1506 = -1;
				}
			}
		}
		arg0.consume();
	}
}
