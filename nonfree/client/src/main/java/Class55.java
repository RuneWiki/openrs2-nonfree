import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class55 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!qe", name = "n", descriptor = "[I")
	public static int[] anIntArray300 = new int[99];

	static {
		@Pc(20) int local20 = 0;
		for (@Pc(22) int local22 = 0; local22 < 99; local22++) {
			@Pc(27) int local27 = local22 + 1;
			@Pc(40) int local40 = (int) (Math.pow(2.0D, (double) local27 / 7.0D) * 300.0D + (double) local27);
			local20 += local40;
			anIntArray300[local22] = local20 / 4;
		}
	}

	@OriginalMember(owner = "client!qe", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static45.aClass55_1 != null) {
			Static69.anInt2010 = 0;
			@Pc(8) int local8 = arg0.getKeyCode();
			if (local8 >= 0 && local8 < Static72.anIntArray257.length) {
				local8 = Static72.anIntArray257[local8];
				if ((local8 & 0x80) != 0) {
					local8 = -1;
				}
			} else {
				local8 = -1;
			}
			@Pc(61) int local61;
			if (local8 == 85 || local8 == 80 || local8 == 84 || local8 == 0 || local8 == 101) {
				local61 = -1;
			} else {
				local61 = Static4.method73(arg0);
			}
			if (Static15.anInt2856 >= 0 && local8 >= 0) {
				Static30.anIntArray93[Static15.anInt2856] = local8;
				Static15.anInt2856 = Static15.anInt2856 + 1 & 0x7F;
				if (Static15.anInt2856 == Static7.anInt156) {
					Static15.anInt2856 = -1;
				}
			}
			if (local8 >= 0 || local61 >= 0) {
				@Pc(107) int local107 = Static102.anInt2775 + 1 & 0x7F;
				if (Static71.anInt2019 != local107) {
					Static67.anIntArray243[Static102.anInt2775] = local8;
					Static5.anIntArray16[Static102.anInt2775] = local61;
					Static102.anInt2775 = local107;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!qe", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static45.aClass55_1 != null) {
			Static69.anInt2010 = 0;
			@Pc(10) int local10 = arg0.getKeyCode();
			if (local10 >= 0 && local10 < Static72.anIntArray257.length) {
				local10 = Static72.anIntArray257[local10] & 0xFFFFFF7F;
			} else {
				local10 = -1;
			}
			if (Static15.anInt2856 >= 0 && local10 >= 0) {
				Static30.anIntArray93[Static15.anInt2856] = ~local10;
				Static15.anInt2856 = Static15.anInt2856 + 1 & 0x7F;
				if (Static7.anInt156 == Static15.anInt2856) {
					Static15.anInt2856 = -1;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!qe", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static45.aClass55_1 != null) {
			Static15.anInt2856 = -1;
		}
	}

	@OriginalMember(owner = "client!qe", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!qe", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		arg0.consume();
	}
}
