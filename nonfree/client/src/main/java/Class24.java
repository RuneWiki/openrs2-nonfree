import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class24 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!gb", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static59.aClass24_1 != null) {
			Static9.anInt416 = 0;
			@Pc(6) int local6 = arg0.getKeyCode();
			if (local6 >= 0 && Static9.anIntArray27.length > local6) {
				local6 = Static9.anIntArray27[local6] & 0xFFFFFF7F;
			} else {
				local6 = -1;
			}
			if (Static7.anInt285 >= 0 && local6 >= 0) {
				Static69.anIntArray191[Static7.anInt285] = ~local6;
				Static7.anInt285 = Static7.anInt285 + 1 & 0x7F;
				if (Static50.anInt3259 == Static7.anInt285) {
					Static7.anInt285 = -1;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!gb", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		arg0.consume();
	}

	@OriginalMember(owner = "client!gb", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static59.aClass24_1 != null) {
			Static9.anInt416 = 0;
			@Pc(8) int local8 = arg0.getKeyCode();
			if (local8 >= 0 && Static9.anIntArray27.length > local8) {
				local8 = Static9.anIntArray27[local8];
				if ((local8 & 0x80) != 0) {
					local8 = -1;
				}
			} else {
				local8 = -1;
			}
			@Pc(57) int local57;
			if (local8 == 85 || local8 == 80 || local8 == 84 || local8 == 0 || local8 == 101) {
				local57 = -1;
			} else {
				local57 = Static107.method2006(arg0);
			}
			if (Static7.anInt285 >= 0 && local8 >= 0) {
				Static69.anIntArray191[Static7.anInt285] = local8;
				Static7.anInt285 = Static7.anInt285 + 1 & 0x7F;
				if (Static50.anInt3259 == Static7.anInt285) {
					Static7.anInt285 = -1;
				}
			}
			if (local8 >= 0 || local57 >= 0) {
				@Pc(93) int local93 = Static112.anInt3227 + 1 & 0x7F;
				if (local93 != Static17.anInt931) {
					Static87.anIntArray239[Static112.anInt3227] = local8;
					Static93.anIntArray247[Static112.anInt3227] = local57;
					Static112.anInt3227 = local93;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!gb", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!gb", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static59.aClass24_1 != null) {
			Static7.anInt285 = -1;
		}
	}
}
