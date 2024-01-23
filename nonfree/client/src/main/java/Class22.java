import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public final class Class22 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!cf", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!cf", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static188.aClass22_1 == null) {
			return;
		}
		Static13.anInt326 = 0;
		@Pc(10) int local10 = arg0.getKeyCode();
		if (local10 >= 0 && local10 < Static106.anIntArray140.length) {
			local10 = Static106.anIntArray140[local10];
			if ((local10 & 0x80) != 0) {
				local10 = -1;
			}
		} else {
			local10 = -1;
		}
		if (Static53.anInt1239 >= 0 && local10 >= 0) {
			Static223.anIntArray373[Static53.anInt1239] = local10;
			Static53.anInt1239 = Static53.anInt1239 + 1 & 0x7F;
			if (Static53.anInt1239 == Static123.anInt2719) {
				Static53.anInt1239 = -1;
			}
		}
		@Pc(74) int local74;
		if (local10 >= 0) {
			local74 = Static86.anInt2010 + 1 & 0x7F;
			if (Static39.anInt968 != local74) {
				Static68.anIntArray101[Static86.anInt2010] = local10;
				Static221.anIntArray362[Static86.anInt2010] = -1;
				Static86.anInt2010 = local74;
			}
		}
		local74 = arg0.getModifiers();
		if ((local74 & 0xA) != 0 || local10 == 85 || local10 == 10) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!cf", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static188.aClass22_1 != null) {
			Static53.anInt1239 = -1;
		}
	}

	@OriginalMember(owner = "client!cf", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		if (Static188.aClass22_1 != null) {
			@Pc(5) int local5 = Static67.method1163(arg0);
			if (local5 >= 0) {
				@Pc(13) int local13 = Static86.anInt2010 + 1 & 0x7F;
				if (Static39.anInt968 != local13) {
					Static68.anIntArray101[Static86.anInt2010] = -1;
					Static221.anIntArray362[Static86.anInt2010] = local5;
					Static86.anInt2010 = local13;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!cf", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static188.aClass22_1 != null) {
			Static13.anInt326 = 0;
			@Pc(6) int local6 = arg0.getKeyCode();
			if (local6 >= 0 && local6 < Static106.anIntArray140.length) {
				local6 = Static106.anIntArray140[local6] & 0xFFFFFF7F;
			} else {
				local6 = -1;
			}
			if (Static53.anInt1239 >= 0 && local6 >= 0) {
				Static223.anIntArray373[Static53.anInt1239] = ~local6;
				Static53.anInt1239 = Static53.anInt1239 + 1 & 0x7F;
				if (Static53.anInt1239 == Static123.anInt2719) {
					Static53.anInt1239 = -1;
				}
			}
		}
		arg0.consume();
	}
}
