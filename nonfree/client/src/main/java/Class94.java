import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lc")
public final class Class94 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!lc", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static57.aClass94_1 != null) {
			Static219.anInt4355 = 0;
			@Pc(7) int local7 = arg0.getKeyCode();
			if (local7 >= 0 && Static53.anIntArray465.length > local7) {
				local7 = Static53.anIntArray465[local7] & 0xFFFFFF7F;
			} else {
				local7 = -1;
			}
			if (Static141.anInt3035 >= 0 && local7 >= 0) {
				Static233.anIntArray407[Static141.anInt3035] = ~local7;
				Static141.anInt3035 = Static141.anInt3035 + 1 & 0x7F;
				if (Static141.anInt3035 == Static106.anInt2472) {
					Static141.anInt3035 = -1;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!lc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!lc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static57.aClass94_1 != null) {
			Static141.anInt3035 = -1;
		}
	}

	@OriginalMember(owner = "client!lc", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		if (Static57.aClass94_1 != null) {
			@Pc(8) char local8 = arg0.getKeyChar();
			if (local8 != '\u0000' && local8 != '\uffff' && Static256.method3921(local8)) {
				@Pc(24) int local24 = Static252.anInt4959 + 1 & 0x7F;
				if (local24 != Static61.anInt1302) {
					Static194.anIntArray359[Static252.anInt4959] = -1;
					Static194.aCharArray5[Static252.anInt4959] = local8;
					Static252.anInt4959 = local24;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!lc", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static57.aClass94_1 == null) {
			return;
		}
		Static219.anInt4355 = 0;
		@Pc(7) int local7 = arg0.getKeyCode();
		if (local7 >= 0 && local7 < Static53.anIntArray465.length) {
			local7 = Static53.anIntArray465[local7];
			if ((local7 & 0x80) != 0) {
				local7 = -1;
			}
		} else {
			local7 = -1;
		}
		if (Static141.anInt3035 >= 0 && local7 >= 0) {
			Static233.anIntArray407[Static141.anInt3035] = local7;
			Static141.anInt3035 = Static141.anInt3035 + 1 & 0x7F;
			if (Static106.anInt2472 == Static141.anInt3035) {
				Static141.anInt3035 = -1;
			}
		}
		@Pc(68) int local68;
		if (local7 >= 0) {
			local68 = Static252.anInt4959 + 1 & 0x7F;
			if (local68 != Static61.anInt1302) {
				Static194.anIntArray359[Static252.anInt4959] = local7;
				Static194.aCharArray5[Static252.anInt4959] = '\u0000';
				Static252.anInt4959 = local68;
			}
		}
		local68 = arg0.getModifiers();
		if ((local68 & 0xA) != 0 || local7 == 85 || local7 == 10) {
			arg0.consume();
		}
	}
}
