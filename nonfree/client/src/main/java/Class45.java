import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!em")
public final class Class45 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!em", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static232.aClass45_1 != null) {
			Static272.anInt5429 = 0;
			@Pc(10) int local10 = arg0.getKeyCode();
			if (local10 >= 0 && local10 < Static305.anIntArray471.length) {
				local10 = Static305.anIntArray471[local10] & 0xFFFFFF7F;
			} else {
				local10 = -1;
			}
			if (Static9.anInt188 >= 0 && local10 >= 0) {
				Static57.anIntArray125[Static9.anInt188] = ~local10;
				Static9.anInt188 = Static9.anInt188 + 1 & 0x7F;
				if (Static144.anInt2859 == Static9.anInt188) {
					Static9.anInt188 = -1;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!em", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static232.aClass45_1 == null) {
			return;
		}
		Static272.anInt5429 = 0;
		@Pc(11) int local11 = arg0.getKeyCode();
		if (local11 >= 0 && Static305.anIntArray471.length > local11) {
			local11 = Static305.anIntArray471[local11];
			if ((local11 & 0x80) != 0) {
				local11 = -1;
			}
		} else {
			local11 = -1;
		}
		if (Static9.anInt188 >= 0 && local11 >= 0) {
			Static57.anIntArray125[Static9.anInt188] = local11;
			Static9.anInt188 = Static9.anInt188 + 1 & 0x7F;
			if (Static144.anInt2859 == Static9.anInt188) {
				Static9.anInt188 = -1;
			}
		}
		@Pc(79) int local79;
		if (local11 >= 0) {
			local79 = Static29.anInt626 + 1 & 0x7F;
			if (local79 != Static92.anInt1844) {
				Static295.anIntArray461[Static29.anInt626] = local11;
				Static170.aCharArray3[Static29.anInt626] = '\u0000';
				Static29.anInt626 = local79;
			}
		}
		local79 = arg0.getModifiers();
		if ((local79 & 0xA) != 0 || local11 == 85 || local11 == 10) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!em", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!em", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static232.aClass45_1 != null) {
			Static9.anInt188 = -1;
		}
	}

	@OriginalMember(owner = "client!em", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		if (Static232.aClass45_1 != null) {
			@Pc(9) char local9 = arg0.getKeyChar();
			if (local9 != '\u0000' && local9 != '\uffff' && Static235.method3644(local9)) {
				@Pc(26) int local26 = Static29.anInt626 + 1 & 0x7F;
				if (local26 != Static92.anInt1844) {
					Static295.anIntArray461[Static29.anInt626] = -1;
					Static170.aCharArray3[Static29.anInt626] = local9;
					Static29.anInt626 = local26;
				}
			}
		}
		arg0.consume();
	}
}
