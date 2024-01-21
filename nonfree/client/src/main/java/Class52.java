import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public final class Class52 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!oa", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		arg0.consume();
	}

	@OriginalMember(owner = "client!oa", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static89.aClass52_1 != null) {
			Static53.anInt2369 = 0;
			@Pc(12) int local12 = arg0.getKeyCode();
			if (local12 >= 0 && Static104.anIntArray423.length > local12) {
				local12 = Static104.anIntArray423[local12];
				if ((local12 & 0x80) != 0) {
					local12 = -1;
				}
			} else {
				local12 = -1;
			}
			@Pc(55) int local55;
			if (local12 == 85 || local12 == 80 || local12 == 84 || local12 == 0 || local12 == 101) {
				local55 = -1;
			} else {
				local55 = Static92.method2115(arg0);
			}
			if (Static32.anInt937 >= 0 && local12 >= 0) {
				Static88.anIntArray365[Static32.anInt937] = local12;
				Static32.anInt937 = Static32.anInt937 + 1 & 0x7F;
				if (Static32.anInt937 == Static5.anInt114) {
					Static32.anInt937 = -1;
				}
			}
			if (local12 >= 0 || local55 >= 0) {
				@Pc(100) int local100 = Static73.anInt2174 + 1 & 0x7F;
				if (Static53.anInt2374 != local100) {
					Static52.anIntArray489[Static73.anInt2174] = local12;
					Static5.anIntArray15[Static73.anInt2174] = local55;
					Static73.anInt2174 = local100;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!oa", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static89.aClass52_1 != null) {
			Static32.anInt937 = -1;
		}
	}

	@OriginalMember(owner = "client!oa", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static89.aClass52_1 != null) {
			Static53.anInt2369 = 0;
			@Pc(6) int local6 = arg0.getKeyCode();
			if (local6 >= 0 && local6 < Static104.anIntArray423.length) {
				local6 = Static104.anIntArray423[local6] & 0xFFFFFF7F;
			} else {
				local6 = -1;
			}
			if (Static32.anInt937 >= 0 && local6 >= 0) {
				Static88.anIntArray365[Static32.anInt937] = ~local6;
				Static32.anInt937 = Static32.anInt937 + 1 & 0x7F;
				if (Static32.anInt937 == Static5.anInt114) {
					Static32.anInt937 = -1;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!oa", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}
}
