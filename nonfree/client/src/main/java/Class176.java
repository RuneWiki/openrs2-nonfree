import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uh")
public final class Class176 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!uh", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!uh", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		if (Static154.aClass176_1 != null) {
			@Pc(8) char local8 = arg0.getKeyChar();
			if (local8 != '\u0000' && local8 != '\uffff' && Static199.method3220(local8)) {
				@Pc(26) int local26 = Static79.anInt1470 + 1 & 0x7F;
				if (local26 != Static299.anInt5671) {
					Static136.anIntArray222[Static79.anInt1470] = -1;
					Static295.aCharArray9[Static79.anInt1470] = local8;
					Static79.anInt1470 = local26;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!uh", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static154.aClass176_1 == null) {
			return;
		}
		Static178.anInt3583 = 0;
		@Pc(11) int local11 = arg0.getKeyCode();
		if (local11 >= 0 && local11 < Static237.anIntArray289.length) {
			local11 = Static237.anIntArray289[local11];
			if ((local11 & 0x80) != 0) {
				local11 = -1;
			}
		} else {
			local11 = -1;
		}
		if (Static304.anInt5750 >= 0 && local11 >= 0) {
			Static240.anIntArray107[Static304.anInt5750] = local11;
			Static304.anInt5750 = Static304.anInt5750 + 1 & 0x7F;
			if (Static199.anInt4010 == Static304.anInt5750) {
				Static304.anInt5750 = -1;
			}
		}
		@Pc(76) int local76;
		if (local11 >= 0) {
			local76 = Static79.anInt1470 + 1 & 0x7F;
			if (local76 != Static299.anInt5671) {
				Static136.anIntArray222[Static79.anInt1470] = local11;
				Static295.aCharArray9[Static79.anInt1470] = '\u0000';
				Static79.anInt1470 = local76;
			}
		}
		local76 = arg0.getModifiers();
		if ((local76 & 0xA) != 0 || local11 == 85 || local11 == 10) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!uh", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static154.aClass176_1 != null) {
			Static304.anInt5750 = -1;
		}
	}

	@OriginalMember(owner = "client!uh", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static154.aClass176_1 != null) {
			Static178.anInt3583 = 0;
			@Pc(11) int local11 = arg0.getKeyCode();
			if (local11 >= 0 && Static237.anIntArray289.length > local11) {
				local11 = Static237.anIntArray289[local11] & 0xFFFFFF7F;
			} else {
				local11 = -1;
			}
			if (Static304.anInt5750 >= 0 && local11 >= 0) {
				Static240.anIntArray107[Static304.anInt5750] = ~local11;
				Static304.anInt5750 = Static304.anInt5750 + 1 & 0x7F;
				if (Static199.anInt4010 == Static304.anInt5750) {
					Static304.anInt5750 = -1;
				}
			}
		}
		arg0.consume();
	}
}
