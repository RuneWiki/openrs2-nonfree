import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public final class Class68 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!wb", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		arg0.consume();
	}

	@OriginalMember(owner = "client!wb", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!wb", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static5.aClass68_1 != null) {
			Static19.anInt478 = -1;
		}
	}

	@OriginalMember(owner = "client!wb", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static5.aClass68_1 != null) {
			Static17.anInt377 = 0;
			@Pc(10) int local10 = arg0.getKeyCode();
			if (local10 >= 0 && Static54.anIntArray177.length > local10) {
				local10 = Static54.anIntArray177[local10] & 0xFFFFFF7F;
			} else {
				local10 = -1;
			}
			if (Static19.anInt478 >= 0 && local10 >= 0) {
				Static23.anIntArray39[Static19.anInt478] = ~local10;
				Static19.anInt478 = Static19.anInt478 + 1 & 0x7F;
				if (Static19.anInt478 == Static49.anInt1211) {
					Static19.anInt478 = -1;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!wb", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static5.aClass68_1 != null) {
			Static17.anInt377 = 0;
			@Pc(8) int local8 = arg0.getKeyCode();
			if (local8 >= 0 && Static54.anIntArray177.length > local8) {
				local8 = Static54.anIntArray177[local8];
				if ((local8 & 0x80) != 0) {
					local8 = -1;
				}
			} else {
				local8 = -1;
			}
			@Pc(61) int local61;
			if (local8 == 85 || local8 == 80 || local8 == 84 || local8 == 0 || local8 == 101) {
				local61 = -1;
			} else {
				local61 = Static27.method558(arg0);
			}
			if (Static19.anInt478 >= 0 && local8 >= 0) {
				Static23.anIntArray39[Static19.anInt478] = local8;
				Static19.anInt478 = Static19.anInt478 + 1 & 0x7F;
				if (Static49.anInt1211 == Static19.anInt478) {
					Static19.anInt478 = -1;
				}
			}
			if (local8 >= 0 || local61 >= 0) {
				@Pc(106) int local106 = Static103.anInt2530 + 1 & 0x7F;
				if (Static25.anInt760 != local106) {
					Static83.anIntArray245[Static103.anInt2530] = local8;
					Static111.anIntArray336[Static103.anInt2530] = local61;
					Static103.anInt2530 = local106;
				}
			}
		}
		arg0.consume();
	}
}
