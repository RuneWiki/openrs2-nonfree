import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nh")
public final class Class56 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!nh", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static4.aClass56_1 != null) {
			Static157.anInt3463 = 0;
			@Pc(6) int local6 = arg0.getKeyCode();
			if (local6 >= 0 && local6 < Static134.anIntArray318.length) {
				local6 = Static134.anIntArray318[local6] & 0xFFFFFF7F;
			} else {
				local6 = -1;
			}
			if (Static56.anInt1327 >= 0 && local6 >= 0) {
				Static136.anIntArray321[Static56.anInt1327] = ~local6;
				Static56.anInt1327 = Static56.anInt1327 + 1 & 0x7F;
				if (Static56.anInt1327 == Static125.anInt2896) {
					Static56.anInt1327 = -1;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!nh", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static4.aClass56_1 == null) {
			return;
		}
		Static157.anInt3463 = 0;
		@Pc(6) int local6 = arg0.getKeyCode();
		if (local6 >= 0 && local6 < Static134.anIntArray318.length) {
			local6 = Static134.anIntArray318[local6];
			if ((local6 & 0x80) != 0) {
				local6 = -1;
			}
		} else {
			local6 = -1;
		}
		if (Static56.anInt1327 >= 0 && local6 >= 0) {
			Static136.anIntArray321[Static56.anInt1327] = local6;
			Static56.anInt1327 = Static56.anInt1327 + 1 & 0x7F;
			if (Static125.anInt2896 == Static56.anInt1327) {
				Static56.anInt1327 = -1;
			}
		}
		@Pc(70) int local70;
		if (local6 >= 0) {
			local70 = Static29.anInt765 + 1 & 0x7F;
			if (Static54.anInt1289 != local70) {
				Static146.anIntArray362[Static29.anInt765] = local6;
				Static120.anIntArray305[Static29.anInt765] = -1;
				Static29.anInt765 = local70;
			}
		}
		local70 = arg0.getModifiers();
		if ((local70 & 0xA) != 0 || local6 == 85 || local6 == 10) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!nh", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		if (Static4.aClass56_1 != null) {
			@Pc(5) int local5 = Static8.method158(arg0);
			if (local5 >= 0) {
				@Pc(13) int local13 = Static29.anInt765 + 1 & 0x7F;
				if (local13 != Static54.anInt1289) {
					Static146.anIntArray362[Static29.anInt765] = -1;
					Static120.anIntArray305[Static29.anInt765] = local5;
					Static29.anInt765 = local13;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!nh", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!nh", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static4.aClass56_1 != null) {
			Static56.anInt1327 = -1;
		}
	}
}
