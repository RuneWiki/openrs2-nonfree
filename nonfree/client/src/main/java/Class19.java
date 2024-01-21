import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public final class Class19 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!ee", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static86.aClass19_1 == null) {
			return;
		}
		Static108.anInt2898 = 0;
		@Pc(6) int local6 = arg0.getKeyCode();
		if (local6 >= 0 && Static25.anIntArray382.length > local6) {
			local6 = Static25.anIntArray382[local6];
			if ((local6 & 0x80) != 0) {
				local6 = -1;
			}
		} else {
			local6 = -1;
		}
		if (Static72.anInt2057 >= 0 && local6 >= 0) {
			Static130.anIntArray408[Static72.anInt2057] = local6;
			Static72.anInt2057 = Static72.anInt2057 + 1 & 0x7F;
			if (Static72.anInt2057 == Static81.anInt2237) {
				Static72.anInt2057 = -1;
			}
		}
		@Pc(63) int local63;
		if (local6 >= 0) {
			local63 = Static108.anInt2899 + 1 & 0x7F;
			if (local63 != Static71.anInt2025) {
				Static96.anIntArray312[Static108.anInt2899] = local6;
				Static41.anIntArray139[Static108.anInt2899] = -1;
				Static108.anInt2899 = local63;
			}
		}
		local63 = arg0.getModifiers();
		if ((local63 & 0xA) != 0 || local6 == 85 || local6 == 10) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ee", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static86.aClass19_1 != null) {
			Static108.anInt2898 = 0;
			@Pc(10) int local10 = arg0.getKeyCode();
			if (local10 >= 0 && Static25.anIntArray382.length > local10) {
				local10 = Static25.anIntArray382[local10] & 0xFFFFFF7F;
			} else {
				local10 = -1;
			}
			if (Static72.anInt2057 >= 0 && local10 >= 0) {
				Static130.anIntArray408[Static72.anInt2057] = ~local10;
				Static72.anInt2057 = Static72.anInt2057 + 1 & 0x7F;
				if (Static81.anInt2237 == Static72.anInt2057) {
					Static72.anInt2057 = -1;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!ee", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!ee", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(3) int local3 = Static55.method1103(arg0);
		if (local3 >= 0) {
			@Pc(14) int local14 = Static108.anInt2899 + 1 & 0x7F;
			if (Static71.anInt2025 != local14) {
				Static96.anIntArray312[Static108.anInt2899] = -1;
				Static41.anIntArray139[Static108.anInt2899] = local3;
				Static108.anInt2899 = local14;
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!ee", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static86.aClass19_1 != null) {
			Static72.anInt2057 = -1;
		}
	}
}
