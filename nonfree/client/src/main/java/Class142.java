import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class Class142 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!qa", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!qa", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static88.aClass142_1 != null) {
			Static92.anInt2206 = -1;
		}
	}

	@OriginalMember(owner = "client!qa", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static88.aClass142_1 == null) {
			return;
		}
		Static108.anInt2490 = 0;
		@Pc(11) int local11 = arg0.getKeyCode();
		if (local11 >= 0 && Static166.anIntArray362.length > local11) {
			local11 = Static166.anIntArray362[local11];
			if ((local11 & 0x80) != 0) {
				local11 = -1;
			}
		} else {
			local11 = -1;
		}
		if (Static92.anInt2206 >= 0 && local11 >= 0) {
			Static251.anIntArray482[Static92.anInt2206] = local11;
			Static92.anInt2206 = Static92.anInt2206 + 1 & 0x7F;
			if (Static92.anInt2206 == Static155.anInt3464) {
				Static92.anInt2206 = -1;
			}
		}
		@Pc(69) int local69;
		if (local11 >= 0) {
			local69 = Static6.anInt114 + 1 & 0x7F;
			if (local69 != Static12.anInt252) {
				Static191.anIntArray400[Static6.anInt114] = local11;
				Static199.aCharArray7[Static6.anInt114] = '\u0000';
				Static6.anInt114 = local69;
			}
		}
		local69 = arg0.getModifiers();
		if ((local69 & 0xA) != 0 || local11 == 85 || local11 == 10) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!qa", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		if (Static88.aClass142_1 != null) {
			@Pc(5) char local5 = arg0.getKeyChar();
			if (local5 != '\u0000' && local5 != '\uffff' && Static257.method4041(local5)) {
				@Pc(25) int local25 = Static6.anInt114 + 1 & 0x7F;
				if (local25 != Static12.anInt252) {
					Static191.anIntArray400[Static6.anInt114] = -1;
					Static199.aCharArray7[Static6.anInt114] = local5;
					Static6.anInt114 = local25;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!qa", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static88.aClass142_1 != null) {
			Static108.anInt2490 = 0;
			@Pc(11) int local11 = arg0.getKeyCode();
			if (local11 >= 0 && local11 < Static166.anIntArray362.length) {
				local11 = Static166.anIntArray362[local11] & 0xFFFFFF7F;
			} else {
				local11 = -1;
			}
			if (Static92.anInt2206 >= 0 && local11 >= 0) {
				Static251.anIntArray482[Static92.anInt2206] = ~local11;
				Static92.anInt2206 = Static92.anInt2206 + 1 & 0x7F;
				if (Static155.anInt3464 == Static92.anInt2206) {
					Static92.anInt2206 = -1;
				}
			}
		}
		arg0.consume();
	}
}
