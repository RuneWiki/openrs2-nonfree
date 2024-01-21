import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public final class Class16 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!cf", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!cf", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static127.aClass16_1 != null) {
			Static92.anInt4203 = -1;
		}
	}

	@OriginalMember(owner = "client!cf", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		if (Static127.aClass16_1 != null) {
			@Pc(9) int local9 = Static174.method3155(arg0);
			if (local9 >= 0) {
				@Pc(17) int local17 = Static52.anInt1498 + 1 & 0x7F;
				if (local17 != Static133.anInt3377) {
					Static157.anIntArray652[Static52.anInt1498] = -1;
					Static98.anIntArray595[Static52.anInt1498] = local9;
					Static52.anInt1498 = local17;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!cf", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static127.aClass16_1 != null) {
			Static141.anInt3621 = 0;
			@Pc(10) int local10 = arg0.getKeyCode();
			if (local10 >= 0 && Static58.anIntArray331.length > local10) {
				local10 = Static58.anIntArray331[local10] & 0xFFFFFF7F;
			} else {
				local10 = -1;
			}
			if (Static92.anInt4203 >= 0 && local10 >= 0) {
				Static129.anIntArray568[Static92.anInt4203] = ~local10;
				Static92.anInt4203 = Static92.anInt4203 + 1 & 0x7F;
				if (Static71.anInt2135 == Static92.anInt4203) {
					Static92.anInt4203 = -1;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!cf", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static127.aClass16_1 == null) {
			return;
		}
		Static141.anInt3621 = 0;
		@Pc(10) int local10 = arg0.getKeyCode();
		if (local10 >= 0 && local10 < Static58.anIntArray331.length) {
			local10 = Static58.anIntArray331[local10];
			if ((local10 & 0x80) != 0) {
				local10 = -1;
			}
		} else {
			local10 = -1;
		}
		if (Static92.anInt4203 >= 0 && local10 >= 0) {
			Static129.anIntArray568[Static92.anInt4203] = local10;
			Static92.anInt4203 = Static92.anInt4203 + 1 & 0x7F;
			if (Static92.anInt4203 == Static71.anInt2135) {
				Static92.anInt4203 = -1;
			}
		}
		@Pc(67) int local67;
		if (local10 >= 0) {
			local67 = Static52.anInt1498 + 1 & 0x7F;
			if (Static133.anInt3377 != local67) {
				Static157.anIntArray652[Static52.anInt1498] = local10;
				Static98.anIntArray595[Static52.anInt1498] = -1;
				Static52.anInt1498 = local67;
			}
		}
		local67 = arg0.getModifiers();
		if ((local67 & 0xA) != 0 || local10 == 85 || local10 == 10) {
			arg0.consume();
		}
	}
}
