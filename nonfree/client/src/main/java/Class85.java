import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vd")
public final class Class85 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!vd", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!vd", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		if (Static178.aClass85_1 != null) {
			@Pc(5) int local5 = Static74.method1247(arg0);
			if (local5 >= 0) {
				@Pc(13) int local13 = Static180.anInt3972 + 1 & 0x7F;
				if (Static96.anInt2352 != local13) {
					Static143.anIntArray376[Static180.anInt3972] = -1;
					Static49.anIntArray127[Static180.anInt3972] = local5;
					Static180.anInt3972 = local13;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!vd", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static178.aClass85_1 != null) {
			Static143.anInt3282 = -1;
		}
	}

	@OriginalMember(owner = "client!vd", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static178.aClass85_1 != null) {
			Static55.anInt1435 = 0;
			@Pc(6) int local6 = arg0.getKeyCode();
			if (local6 >= 0 && Static22.anIntArray35.length > local6) {
				local6 = Static22.anIntArray35[local6] & 0xFFFFFF7F;
			} else {
				local6 = -1;
			}
			if (Static143.anInt3282 >= 0 && local6 >= 0) {
				Static148.anIntArray406[Static143.anInt3282] = ~local6;
				Static143.anInt3282 = Static143.anInt3282 + 1 & 0x7F;
				if (Static143.anInt3282 == Static18.anInt425) {
					Static143.anInt3282 = -1;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!vd", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static178.aClass85_1 == null) {
			return;
		}
		Static55.anInt1435 = 0;
		@Pc(10) int local10 = arg0.getKeyCode();
		if (local10 >= 0 && local10 < Static22.anIntArray35.length) {
			local10 = Static22.anIntArray35[local10];
			if ((local10 & 0x80) != 0) {
				local10 = -1;
			}
		} else {
			local10 = -1;
		}
		if (Static143.anInt3282 >= 0 && local10 >= 0) {
			Static148.anIntArray406[Static143.anInt3282] = local10;
			Static143.anInt3282 = Static143.anInt3282 + 1 & 0x7F;
			if (Static143.anInt3282 == Static18.anInt425) {
				Static143.anInt3282 = -1;
			}
		}
		@Pc(73) int local73;
		if (local10 >= 0) {
			local73 = Static180.anInt3972 + 1 & 0x7F;
			if (Static96.anInt2352 != local73) {
				Static143.anIntArray376[Static180.anInt3972] = local10;
				Static49.anIntArray127[Static180.anInt3972] = -1;
				Static180.anInt3972 = local73;
			}
		}
		local73 = arg0.getModifiers();
		if ((local73 & 0xA) != 0 || local10 == 85 || local10 == 10) {
			arg0.consume();
		}
	}
}
