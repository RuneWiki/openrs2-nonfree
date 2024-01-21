import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public final class Class30 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!ka", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		arg0.consume();
	}

	@OriginalMember(owner = "client!ka", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static73.aClass30_1 != null) {
			Static37.anInt949 = -1;
		}
	}

	@OriginalMember(owner = "client!ka", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static73.aClass30_1 != null) {
			Static15.anInt1860 = 0;
			@Pc(10) int local10 = arg0.getKeyCode();
			if (local10 >= 0 && Static104.anIntArray549.length > local10) {
				local10 = Static104.anIntArray549[local10] & 0xFFFFFF7F;
			} else {
				local10 = -1;
			}
			if (Static37.anInt949 >= 0 && local10 >= 0) {
				Static76.anIntArray470[Static37.anInt949] = ~local10;
				Static37.anInt949 = Static37.anInt949 + 1 & 0x7F;
				if (Static37.anInt949 == Static96.anInt2342) {
					Static37.anInt949 = -1;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!ka", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!ka", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static73.aClass30_1 != null) {
			Static15.anInt1860 = 0;
			@Pc(8) int local8 = arg0.getKeyCode();
			if (local8 >= 0 && local8 < Static104.anIntArray549.length) {
				local8 = Static104.anIntArray549[local8];
				if ((local8 & 0x80) != 0) {
					local8 = -1;
				}
			} else {
				local8 = -1;
			}
			@Pc(49) int local49;
			if (local8 == 85 || local8 == 80 || local8 == 84 || local8 == 0 || local8 == 101) {
				local49 = -1;
			} else {
				local49 = Static43.method1243(arg0);
			}
			if (Static37.anInt949 >= 0 && local8 >= 0) {
				Static76.anIntArray470[Static37.anInt949] = local8;
				Static37.anInt949 = Static37.anInt949 + 1 & 0x7F;
				if (Static96.anInt2342 == Static37.anInt949) {
					Static37.anInt949 = -1;
				}
			}
			if (local8 >= 0 || local49 >= 0) {
				@Pc(93) int local93 = Static95.anInt2226 + 1 & 0x7F;
				if (Static45.anInt1094 != local93) {
					Static88.anIntArray453[Static95.anInt2226] = local8;
					Static102.anIntArray545[Static95.anInt2226] = local49;
					Static95.anInt2226 = local93;
				}
			}
		}
		arg0.consume();
	}
}
