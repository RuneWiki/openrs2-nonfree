import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eh")
public final class Class29 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!eh", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static149.aClass29_1 != null) {
			Static100.anInt2446 = 0;
			@Pc(6) int local6 = arg0.getKeyCode();
			if (local6 >= 0 && Static210.anIntArray485.length > local6) {
				local6 = Static210.anIntArray485[local6] & 0xFFFFFF7F;
			} else {
				local6 = -1;
			}
			if (Static29.anInt700 >= 0 && local6 >= 0) {
				Static100.anIntArray245[Static29.anInt700] = ~local6;
				Static29.anInt700 = Static29.anInt700 + 1 & 0x7F;
				if (Static133.anInt3056 == Static29.anInt700) {
					Static29.anInt700 = -1;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!eh", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static149.aClass29_1 == null) {
			return;
		}
		Static100.anInt2446 = 0;
		@Pc(10) int local10 = arg0.getKeyCode();
		if (local10 >= 0 && Static210.anIntArray485.length > local10) {
			local10 = Static210.anIntArray485[local10];
			if ((local10 & 0x80) != 0) {
				local10 = -1;
			}
		} else {
			local10 = -1;
		}
		if (Static29.anInt700 >= 0 && local10 >= 0) {
			Static100.anIntArray245[Static29.anInt700] = local10;
			Static29.anInt700 = Static29.anInt700 + 1 & 0x7F;
			if (Static29.anInt700 == Static133.anInt3056) {
				Static29.anInt700 = -1;
			}
		}
		@Pc(70) int local70;
		if (local10 >= 0) {
			local70 = Static169.anInt3966 + 1 & 0x7F;
			if (local70 != Static179.anInt4147) {
				Static156.anIntArray387[Static169.anInt3966] = local10;
				Static92.anIntArray229[Static169.anInt3966] = -1;
				Static169.anInt3966 = local70;
			}
		}
		local70 = arg0.getModifiers();
		if ((local70 & 0xA) != 0 || local10 == 85 || local10 == 10) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!eh", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static149.aClass29_1 != null) {
			Static29.anInt700 = -1;
		}
	}

	@OriginalMember(owner = "client!eh", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!eh", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		if (Static149.aClass29_1 != null) {
			@Pc(5) int local5 = Static59.method1129(arg0);
			if (local5 >= 0) {
				@Pc(13) int local13 = Static169.anInt3966 + 1 & 0x7F;
				if (Static179.anInt4147 != local13) {
					Static156.anIntArray387[Static169.anInt3966] = -1;
					Static92.anIntArray229[Static169.anInt3966] = local5;
					Static169.anInt3966 = local13;
				}
			}
		}
		arg0.consume();
	}
}
