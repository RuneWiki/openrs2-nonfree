import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ui")
public final class Class198 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!ui", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static337.aClass198_1 != null) {
			Static69.anInt484 = -1;
		}
	}

	@OriginalMember(owner = "client!ui", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!ui", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		if (Static337.aClass198_1 != null) {
			@Pc(8) char local8 = arg0.getKeyChar();
			if (local8 != '\u0000' && local8 != '\uffff' && Static15.method272(local8)) {
				@Pc(26) int local26 = Static47.anInt924 + 1 & 0x7F;
				if (Static292.anInt5505 != local26) {
					Static181.anIntArray397[Static47.anInt924] = -1;
					Static16.aCharArray1[Static47.anInt924] = local8;
					Static47.anInt924 = local26;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!ui", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static337.aClass198_1 == null) {
			return;
		}
		Static225.anInt4135 = 0;
		@Pc(6) int local6 = arg0.getKeyCode();
		if (local6 >= 0 && local6 < Static203.anIntArray442.length) {
			local6 = Static203.anIntArray442[local6];
			if ((local6 & 0x80) != 0) {
				local6 = -1;
			}
		} else {
			local6 = -1;
		}
		if (Static69.anInt484 >= 0 && local6 >= 0) {
			Static298.anIntArray636[Static69.anInt484] = local6;
			Static69.anInt484 = Static69.anInt484 + 1 & 0x7F;
			if (Static43.anInt865 == Static69.anInt484) {
				Static69.anInt484 = -1;
			}
		}
		@Pc(66) int local66;
		if (local6 >= 0) {
			local66 = Static47.anInt924 + 1 & 0x7F;
			if (Static292.anInt5505 != local66) {
				Static181.anIntArray397[Static47.anInt924] = local6;
				Static16.aCharArray1[Static47.anInt924] = '\u0000';
				Static47.anInt924 = local66;
			}
		}
		local66 = arg0.getModifiers();
		if ((local66 & 0xA) != 0 || local6 == 85 || local6 == 10) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ui", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static337.aClass198_1 != null) {
			Static225.anInt4135 = 0;
			@Pc(6) int local6 = arg0.getKeyCode();
			if (local6 >= 0 && local6 < Static203.anIntArray442.length) {
				local6 = Static203.anIntArray442[local6] & 0xFFFFFF7F;
			} else {
				local6 = -1;
			}
			if (Static69.anInt484 >= 0 && local6 >= 0) {
				Static298.anIntArray636[Static69.anInt484] = ~local6;
				Static69.anInt484 = Static69.anInt484 + 1 & 0x7F;
				if (Static43.anInt865 == Static69.anInt484) {
					Static69.anInt484 = -1;
				}
			}
		}
		arg0.consume();
	}
}
