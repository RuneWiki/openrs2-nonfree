import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public final class Class12 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!da", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!da", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static52.aClass12_1 == null) {
			return;
		}
		Static79.anInt2070 = 0;
		@Pc(10) int local10 = arg0.getKeyCode();
		if (local10 >= 0 && local10 < Static122.anIntArray334.length) {
			local10 = Static122.anIntArray334[local10];
			if ((local10 & 0x80) != 0) {
				local10 = -1;
			}
		} else {
			local10 = -1;
		}
		if (Static67.anInt1838 >= 0 && local10 >= 0) {
			Static56.anIntArray145[Static67.anInt1838] = local10;
			Static67.anInt1838 = Static67.anInt1838 + 1 & 0x7F;
			if (Static67.anInt1838 == Static127.anInt2945) {
				Static67.anInt1838 = -1;
			}
		}
		@Pc(66) int local66;
		if (local10 >= 0) {
			local66 = Static103.anInt2504 + 1 & 0x7F;
			if (local66 != Static100.anInt2473) {
				Static120.anIntArray330[Static103.anInt2504] = local10;
				Static19.anIntArray70[Static103.anInt2504] = -1;
				Static103.anInt2504 = local66;
			}
		}
		local66 = arg0.getModifiers();
		if ((local66 & 0xA) != 0 || local10 == 85 || local10 == 10) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!da", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(7) int local7 = Static130.method2151(arg0);
		if (local7 >= 0) {
			@Pc(15) int local15 = Static103.anInt2504 + 1 & 0x7F;
			if (local15 != Static100.anInt2473) {
				Static120.anIntArray330[Static103.anInt2504] = -1;
				Static19.anIntArray70[Static103.anInt2504] = local7;
				Static103.anInt2504 = local15;
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!da", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static52.aClass12_1 != null) {
			Static67.anInt1838 = -1;
		}
	}

	@OriginalMember(owner = "client!da", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static52.aClass12_1 != null) {
			Static79.anInt2070 = 0;
			@Pc(10) int local10 = arg0.getKeyCode();
			if (local10 >= 0 && Static122.anIntArray334.length > local10) {
				local10 = Static122.anIntArray334[local10] & 0xFFFFFF7F;
			} else {
				local10 = -1;
			}
			if (Static67.anInt1838 >= 0 && local10 >= 0) {
				Static56.anIntArray145[Static67.anInt1838] = ~local10;
				Static67.anInt1838 = Static67.anInt1838 + 1 & 0x7F;
				if (Static67.anInt1838 == Static127.anInt2945) {
					Static67.anInt1838 = -1;
				}
			}
		}
		arg0.consume();
	}
}
