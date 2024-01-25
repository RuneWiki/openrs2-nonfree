import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dj")
public final class Class43 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!dj", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static65.aClass43_3 == null) {
			return;
		}
		Static269.anInt5122 = 0;
		@Pc(6) int local6 = arg0.getKeyCode();
		if (local6 >= 0 && Static138.anIntArray268.length > local6) {
			local6 = Static138.anIntArray268[local6];
			if ((local6 & 0x80) != 0) {
				local6 = -1;
			}
		} else {
			local6 = -1;
		}
		if (Static115.anInt2550 >= 0 && local6 >= 0) {
			Static158.anIntArray296[Static115.anInt2550] = local6;
			Static115.anInt2550 = Static115.anInt2550 + 1 & 0x7F;
			if (Static176.anInt3875 == Static115.anInt2550) {
				Static115.anInt2550 = -1;
			}
		}
		@Pc(66) int local66;
		if (local6 >= 0) {
			local66 = Static260.anInt5000 + 1 & 0x7F;
			if (Static347.anInt6625 != local66) {
				Static259.anIntArray452[Static260.anInt5000] = local6;
				Static278.aCharArray6[Static260.anInt5000] = '\u0000';
				Static260.anInt5000 = local66;
			}
		}
		local66 = arg0.getModifiers();
		if ((local66 & 0xA) != 0 || local6 == 85 || local6 == 10) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!dj", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!dj", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static65.aClass43_3 != null) {
			Static115.anInt2550 = -1;
		}
	}

	@OriginalMember(owner = "client!dj", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		if (Static65.aClass43_3 != null) {
			@Pc(4) char local4 = arg0.getKeyChar();
			if (local4 != '\u0000' && local4 != '\uffff' && Static260.method4481(local4)) {
				@Pc(24) int local24 = Static260.anInt5000 + 1 & 0x7F;
				if (Static347.anInt6625 != local24) {
					Static259.anIntArray452[Static260.anInt5000] = -1;
					Static278.aCharArray6[Static260.anInt5000] = local4;
					Static260.anInt5000 = local24;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!dj", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static65.aClass43_3 != null) {
			Static269.anInt5122 = 0;
			@Pc(6) int local6 = arg0.getKeyCode();
			if (local6 >= 0 && Static138.anIntArray268.length > local6) {
				local6 = Static138.anIntArray268[local6] & 0xFFFFFF7F;
			} else {
				local6 = -1;
			}
			if (Static115.anInt2550 >= 0 && local6 >= 0) {
				Static158.anIntArray296[Static115.anInt2550] = ~local6;
				Static115.anInt2550 = Static115.anInt2550 + 1 & 0x7F;
				if (Static176.anInt3875 == Static115.anInt2550) {
					Static115.anInt2550 = -1;
				}
			}
		}
		arg0.consume();
	}
}
