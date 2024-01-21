import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uf")
public final class Class76 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!uf", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!uf", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static114.aClass76_1 != null) {
			Static58.anInt1620 = 0;
			@Pc(10) int local10 = arg0.getKeyCode();
			if (local10 >= 0 && local10 < Static80.anIntArray261.length) {
				local10 = Static80.anIntArray261[local10] & 0xFFFFFF7F;
			} else {
				local10 = -1;
			}
			if (Static47.anInt1348 >= 0 && local10 >= 0) {
				Static129.anIntArray376[Static47.anInt1348] = ~local10;
				Static47.anInt1348 = Static47.anInt1348 + 1 & 0x7F;
				if (Static21.anInt766 == Static47.anInt1348) {
					Static47.anInt1348 = -1;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!uf", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static114.aClass76_1 != null) {
			Static47.anInt1348 = -1;
		}
	}

	@OriginalMember(owner = "client!uf", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(7) int local7 = Static119.method1888(arg0);
		if (local7 >= 0) {
			@Pc(18) int local18 = Static123.anInt2914 + 1 & 0x7F;
			if (Static1.anInt266 != local18) {
				Static46.anIntArray142[Static123.anInt2914] = -1;
				Static115.anIntArray347[Static123.anInt2914] = local7;
				Static123.anInt2914 = local18;
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!uf", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static114.aClass76_1 == null) {
			return;
		}
		Static58.anInt1620 = 0;
		@Pc(10) int local10 = arg0.getKeyCode();
		if (local10 >= 0 && local10 < Static80.anIntArray261.length) {
			local10 = Static80.anIntArray261[local10];
			if ((local10 & 0x80) != 0) {
				local10 = -1;
			}
		} else {
			local10 = -1;
		}
		if (Static47.anInt1348 >= 0 && local10 >= 0) {
			Static129.anIntArray376[Static47.anInt1348] = local10;
			Static47.anInt1348 = Static47.anInt1348 + 1 & 0x7F;
			if (Static47.anInt1348 == Static21.anInt766) {
				Static47.anInt1348 = -1;
			}
		}
		@Pc(67) int local67;
		if (local10 >= 0) {
			local67 = Static123.anInt2914 + 1 & 0x7F;
			if (Static1.anInt266 != local67) {
				Static46.anIntArray142[Static123.anInt2914] = local10;
				Static115.anIntArray347[Static123.anInt2914] = -1;
				Static123.anInt2914 = local67;
			}
		}
		local67 = arg0.getModifiers();
		if ((local67 & 0xA) != 0 || local10 == 85 || local10 == 10) {
			arg0.consume();
		}
	}
}
