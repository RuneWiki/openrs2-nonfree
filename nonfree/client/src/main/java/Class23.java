import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fb")
public final class Class23 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!fb", name = "n", descriptor = "[I")
	public static int[] anIntArray127 = new int[32];

	static {
		@Pc(23) int local23 = 2;
		for (@Pc(25) int local25 = 0; local25 < 32; local25++) {
			anIntArray127[local25] = local23 - 1;
			local23 += local23;
		}
	}

	@OriginalMember(owner = "client!fb", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!fb", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static16.aClass23_1 != null) {
			Static39.anInt962 = 0;
			@Pc(10) int local10 = arg0.getKeyCode();
			if (local10 >= 0 && local10 < Static116.anIntArray361.length) {
				local10 = Static116.anIntArray361[local10] & 0xFFFFFF7F;
			} else {
				local10 = -1;
			}
			if (Static96.anInt549 >= 0 && local10 >= 0) {
				Static133.anIntArray408[Static96.anInt549] = ~local10;
				Static96.anInt549 = Static96.anInt549 + 1 & 0x7F;
				if (Static96.anInt549 == Static97.anInt2257) {
					Static96.anInt549 = -1;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!fb", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static16.aClass23_1 == null) {
			return;
		}
		Static39.anInt962 = 0;
		@Pc(10) int local10 = arg0.getKeyCode();
		if (local10 >= 0 && local10 < Static116.anIntArray361.length) {
			local10 = Static116.anIntArray361[local10];
			if ((local10 & 0x80) != 0) {
				local10 = -1;
			}
		} else {
			local10 = -1;
		}
		if (Static96.anInt549 >= 0 && local10 >= 0) {
			Static133.anIntArray408[Static96.anInt549] = local10;
			Static96.anInt549 = Static96.anInt549 + 1 & 0x7F;
			if (Static96.anInt549 == Static97.anInt2257) {
				Static96.anInt549 = -1;
			}
		}
		@Pc(70) int local70;
		if (local10 >= 0) {
			local70 = Static44.anInt1076 + 1 & 0x7F;
			if (local70 != Static40.anInt984) {
				Static78.anIntArray240[Static44.anInt1076] = local10;
				Static130.anIntArray405[Static44.anInt1076] = -1;
				Static44.anInt1076 = local70;
			}
		}
		local70 = arg0.getModifiers();
		if ((local70 & 0xA) != 0 || local10 == 85 || local10 == 10) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!fb", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static16.aClass23_1 != null) {
			Static96.anInt549 = -1;
		}
	}

	@OriginalMember(owner = "client!fb", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(7) int local7 = Static96.method345(arg0);
		if (local7 >= 0) {
			@Pc(18) int local18 = Static44.anInt1076 + 1 & 0x7F;
			if (local18 != Static40.anInt984) {
				Static78.anIntArray240[Static44.anInt1076] = -1;
				Static130.anIntArray405[Static44.anInt1076] = local7;
				Static44.anInt1076 = local18;
			}
		}
		arg0.consume();
	}
}
