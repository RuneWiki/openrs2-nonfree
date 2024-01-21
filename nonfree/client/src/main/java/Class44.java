import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class Class44 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!ic", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static52.aClass44_1 == null) {
			return;
		}
		Static83.anInt1645 = 0;
		@Pc(10) int local10 = arg0.getKeyCode();
		if (local10 >= 0 && Static9.anIntArray14.length > local10) {
			local10 = Static9.anIntArray14[local10];
			if ((local10 & 0x80) != 0) {
				local10 = -1;
			}
		} else {
			local10 = -1;
		}
		if (Static88.anInt1710 >= 0 && local10 >= 0) {
			Static78.anIntArray84[Static88.anInt1710] = local10;
			Static88.anInt1710 = Static88.anInt1710 + 1 & 0x7F;
			if (Static62.anInt1308 == Static88.anInt1710) {
				Static88.anInt1710 = -1;
			}
		}
		@Pc(69) int local69;
		if (local10 >= 0) {
			local69 = Static40.anInt862 + 1 & 0x7F;
			if (Static118.anInt2399 != local69) {
				Static40.anIntArray43[Static40.anInt862] = local10;
				Static122.anIntArray146[Static40.anInt862] = -1;
				Static40.anInt862 = local69;
			}
		}
		local69 = arg0.getModifiers();
		if ((local69 & 0xA) != 0 || local10 == 85 || local10 == 10) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ic", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!ic", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		if (Static52.aClass44_1 != null) {
			@Pc(9) int local9 = Static117.method1689(arg0);
			if (local9 >= 0) {
				@Pc(17) int local17 = Static40.anInt862 + 1 & 0x7F;
				if (local17 != Static118.anInt2399) {
					Static40.anIntArray43[Static40.anInt862] = -1;
					Static122.anIntArray146[Static40.anInt862] = local9;
					Static40.anInt862 = local17;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!ic", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static52.aClass44_1 != null) {
			Static88.anInt1710 = -1;
		}
	}

	@OriginalMember(owner = "client!ic", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static52.aClass44_1 != null) {
			Static83.anInt1645 = 0;
			@Pc(10) int local10 = arg0.getKeyCode();
			if (local10 >= 0 && Static9.anIntArray14.length > local10) {
				local10 = Static9.anIntArray14[local10] & 0xFFFFFF7F;
			} else {
				local10 = -1;
			}
			if (Static88.anInt1710 >= 0 && local10 >= 0) {
				Static78.anIntArray84[Static88.anInt1710] = ~local10;
				Static88.anInt1710 = Static88.anInt1710 + 1 & 0x7F;
				if (Static62.anInt1308 == Static88.anInt1710) {
					Static88.anInt1710 = -1;
				}
			}
		}
		arg0.consume();
	}
}
