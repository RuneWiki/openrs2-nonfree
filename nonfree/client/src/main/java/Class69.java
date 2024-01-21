import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!w")
public final class Class69 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!w", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static74.aClass69_1 != null) {
			Static104.anInt2433 = 0;
			@Pc(6) int local6 = arg0.getKeyCode();
			if (local6 >= 0 && local6 < Static87.anIntArray292.length) {
				local6 = Static87.anIntArray292[local6] & 0xFFFFFF7F;
			} else {
				local6 = -1;
			}
			if (Static79.anInt1888 >= 0 && local6 >= 0) {
				Static60.anIntArray209[Static79.anInt1888] = ~local6;
				Static79.anInt1888 = Static79.anInt1888 + 1 & 0x7F;
				if (Static10.anInt397 == Static79.anInt1888) {
					Static79.anInt1888 = -1;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!w", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!w", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static74.aClass69_1 != null) {
			Static79.anInt1888 = -1;
		}
	}

	@OriginalMember(owner = "client!w", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static74.aClass69_1 != null) {
			Static104.anInt2433 = 0;
			@Pc(12) int local12 = arg0.getKeyCode();
			if (local12 >= 0 && Static87.anIntArray292.length > local12) {
				local12 = Static87.anIntArray292[local12];
				if ((local12 & 0x80) != 0) {
					local12 = -1;
				}
			} else {
				local12 = -1;
			}
			@Pc(61) int local61;
			if (local12 == 85 || local12 == 80 || local12 == 84 || local12 == 0 || local12 == 101) {
				local61 = -1;
			} else {
				local61 = Static9.method229(arg0);
			}
			if (Static79.anInt1888 >= 0 && local12 >= 0) {
				Static60.anIntArray209[Static79.anInt1888] = local12;
				Static79.anInt1888 = Static79.anInt1888 + 1 & 0x7F;
				if (Static10.anInt397 == Static79.anInt1888) {
					Static79.anInt1888 = -1;
				}
			}
			if (local12 >= 0 || local61 >= 0) {
				@Pc(107) int local107 = Static17.anInt562 + 1 & 0x7F;
				if (local107 != Static95.anInt2167) {
					Static94.anIntArray311[Static17.anInt562] = local12;
					Static89.anIntArray301[Static17.anInt562] = local61;
					Static17.anInt562 = local107;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!w", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		arg0.consume();
	}
}
