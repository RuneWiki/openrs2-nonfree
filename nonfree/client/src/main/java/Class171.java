import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vm")
public final class Class171 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!vm", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static1.aClass171_1 != null) {
			Static270.anInt5840 = -1;
		}
	}

	@OriginalMember(owner = "client!vm", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static1.aClass171_1 != null) {
			Static241.anInt5295 = 0;
			@Pc(10) int local10 = arg0.getKeyCode();
			if (local10 >= 0 && local10 < Static48.anIntArray138.length) {
				local10 = Static48.anIntArray138[local10] & 0xFFFFFF7F;
			} else {
				local10 = -1;
			}
			if (Static270.anInt5840 >= 0 && local10 >= 0) {
				Static216.anIntArray480[Static270.anInt5840] = ~local10;
				Static270.anInt5840 = Static270.anInt5840 + 1 & 0x7F;
				if (Static36.anInt1022 == Static270.anInt5840) {
					Static270.anInt5840 = -1;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!vm", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static1.aClass171_1 == null) {
			return;
		}
		Static241.anInt5295 = 0;
		@Pc(10) int local10 = arg0.getKeyCode();
		if (local10 >= 0 && Static48.anIntArray138.length > local10) {
			local10 = Static48.anIntArray138[local10];
			if ((local10 & 0x80) != 0) {
				local10 = -1;
			}
		} else {
			local10 = -1;
		}
		if (Static270.anInt5840 >= 0 && local10 >= 0) {
			Static216.anIntArray480[Static270.anInt5840] = local10;
			Static270.anInt5840 = Static270.anInt5840 + 1 & 0x7F;
			if (Static270.anInt5840 == Static36.anInt1022) {
				Static270.anInt5840 = -1;
			}
		}
		@Pc(75) int local75;
		if (local10 >= 0) {
			local75 = Static236.anInt5212 + 1 & 0x7F;
			if (Static14.anInt390 != local75) {
				Static54.anIntArray150[Static236.anInt5212] = local10;
				Static167.aCharArray4[Static236.anInt5212] = '\u0000';
				Static236.anInt5212 = local75;
			}
		}
		local75 = arg0.getModifiers();
		if ((local75 & 0xA) != 0 || local10 == 85 || local10 == 10) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!vm", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		if (Static1.aClass171_1 != null) {
			@Pc(5) char local5 = arg0.getKeyChar();
			if (local5 != '\u0000' && local5 != '\uffff' && Static154.method2863(local5)) {
				@Pc(22) int local22 = Static236.anInt5212 + 1 & 0x7F;
				if (Static14.anInt390 != local22) {
					Static54.anIntArray150[Static236.anInt5212] = -1;
					Static167.aCharArray4[Static236.anInt5212] = local5;
					Static236.anInt5212 = local22;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!vm", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}
}
