import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class81 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!wc", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(3) int local3 = Static80.method1620(arg0);
		if (local3 >= 0) {
			@Pc(14) int local14 = Static115.anInt3205 + 1 & 0x7F;
			if (local14 != Static55.anInt1759) {
				Static18.anIntArray78[Static115.anInt3205] = -1;
				Static99.anIntArray308[Static115.anInt3205] = local3;
				Static115.anInt3205 = local14;
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!wc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static97.aClass81_1 != null) {
			Static36.anInt1210 = -1;
		}
	}

	@OriginalMember(owner = "client!wc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!wc", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static97.aClass81_1 != null) {
			Static10.anInt326 = 0;
			@Pc(10) int local10 = arg0.getKeyCode();
			if (local10 >= 0 && local10 < Static20.anIntArray84.length) {
				local10 = Static20.anIntArray84[local10] & 0xFFFFFF7F;
			} else {
				local10 = -1;
			}
			if (Static36.anInt1210 >= 0 && local10 >= 0) {
				Static34.anIntArray141[Static36.anInt1210] = ~local10;
				Static36.anInt1210 = Static36.anInt1210 + 1 & 0x7F;
				if (Static78.anInt2435 == Static36.anInt1210) {
					Static36.anInt1210 = -1;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!wc", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static97.aClass81_1 != null) {
			Static10.anInt326 = 0;
			@Pc(10) int local10 = arg0.getKeyCode();
			if (local10 >= 0 && local10 < Static20.anIntArray84.length) {
				local10 = Static20.anIntArray84[local10];
				if ((local10 & 0x80) != 0) {
					local10 = -1;
				}
			} else {
				local10 = -1;
			}
			if (Static36.anInt1210 >= 0 && local10 >= 0) {
				Static34.anIntArray141[Static36.anInt1210] = local10;
				Static36.anInt1210 = Static36.anInt1210 + 1 & 0x7F;
				if (Static78.anInt2435 == Static36.anInt1210) {
					Static36.anInt1210 = -1;
				}
			}
			if (local10 >= 0) {
				@Pc(70) int local70 = Static115.anInt3205 + 1 & 0x7F;
				if (local70 != Static55.anInt1759) {
					Static18.anIntArray78[Static115.anInt3205] = local10;
					Static99.anIntArray308[Static115.anInt3205] = -1;
					Static115.anInt3205 = local70;
				}
			}
		}
		arg0.consume();
	}
}
