import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public final class Class53 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!oa", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static6.aClass53_1 != null) {
			Static72.anInt1885 = 0;
			@Pc(6) int local6 = arg0.getKeyCode();
			if (local6 >= 0 && Static9.anIntArray25.length > local6) {
				local6 = Static9.anIntArray25[local6] & 0xFFFFFF7F;
			} else {
				local6 = -1;
			}
			if (Static111.anInt2442 >= 0 && local6 >= 0) {
				Static12.anIntArray36[Static111.anInt2442] = ~local6;
				Static111.anInt2442 = Static111.anInt2442 + 1 & 0x7F;
				if (Static111.anInt2442 == Static81.anInt2006) {
					Static111.anInt2442 = -1;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!oa", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(3) int local3 = Static2.method17(arg0);
		if (local3 >= 0) {
			@Pc(18) int local18 = Static17.anInt341 + 1 & 0x7F;
			if (Static101.anInt2302 != local18) {
				Static55.anIntArray186[Static17.anInt341] = -1;
				Static94.anIntArray307[Static17.anInt341] = local3;
				Static17.anInt341 = local18;
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!oa", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static6.aClass53_1 == null) {
			return;
		}
		Static72.anInt1885 = 0;
		@Pc(10) int local10 = arg0.getKeyCode();
		if (local10 >= 0 && Static9.anIntArray25.length > local10) {
			local10 = Static9.anIntArray25[local10];
			if ((local10 & 0x80) != 0) {
				local10 = -1;
			}
		} else {
			local10 = -1;
		}
		if (Static111.anInt2442 >= 0 && local10 >= 0) {
			Static12.anIntArray36[Static111.anInt2442] = local10;
			Static111.anInt2442 = Static111.anInt2442 + 1 & 0x7F;
			if (Static111.anInt2442 == Static81.anInt2006) {
				Static111.anInt2442 = -1;
			}
		}
		@Pc(66) int local66;
		if (local10 >= 0) {
			local66 = Static17.anInt341 + 1 & 0x7F;
			if (local66 != Static101.anInt2302) {
				Static55.anIntArray186[Static17.anInt341] = local10;
				Static94.anIntArray307[Static17.anInt341] = -1;
				Static17.anInt341 = local66;
			}
		}
		local66 = arg0.getModifiers();
		if ((local66 & 0xA) != 0 || local10 == 85 || local10 == 10) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!oa", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static6.aClass53_1 != null) {
			Static111.anInt2442 = -1;
		}
	}

	@OriginalMember(owner = "client!oa", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}
}
