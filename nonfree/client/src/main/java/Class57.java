import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public final class Class57 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!od", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		arg0.consume();
	}

	@OriginalMember(owner = "client!od", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static5.aClass57_1 != null) {
			Static29.anInt1062 = 0;
			@Pc(8) int local8 = arg0.getKeyCode();
			if (local8 >= 0 && Static81.anIntArray275.length > local8) {
				local8 = Static81.anIntArray275[local8];
				if ((local8 & 0x80) != 0) {
					local8 = -1;
				}
			} else {
				local8 = -1;
			}
			@Pc(55) int local55;
			if (local8 == 85 || local8 == 80 || local8 == 84 || local8 == 0 || local8 == 101) {
				local55 = -1;
			} else {
				local55 = Static86.method1280(arg0);
			}
			if (Static23.anInt868 >= 0 && local8 >= 0) {
				Static127.anIntArray411[Static23.anInt868] = local8;
				Static23.anInt868 = Static23.anInt868 + 1 & 0x7F;
				if (Static111.anInt3003 == Static23.anInt868) {
					Static23.anInt868 = -1;
				}
			}
			if (local8 >= 0 || local55 >= 0) {
				@Pc(99) int local99 = Static43.anInt1291 + 1 & 0x7F;
				if (local99 != Static102.anInt2669) {
					Static38.anIntArray153[Static43.anInt1291] = local8;
					Static95.anIntArray317[Static43.anInt1291] = local55;
					Static43.anInt1291 = local99;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!od", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static5.aClass57_1 != null) {
			Static29.anInt1062 = 0;
			@Pc(6) int local6 = arg0.getKeyCode();
			if (local6 >= 0 && local6 < Static81.anIntArray275.length) {
				local6 = Static81.anIntArray275[local6] & 0xFFFFFF7F;
			} else {
				local6 = -1;
			}
			if (Static23.anInt868 >= 0 && local6 >= 0) {
				Static127.anIntArray411[Static23.anInt868] = ~local6;
				Static23.anInt868 = Static23.anInt868 + 1 & 0x7F;
				if (Static111.anInt3003 == Static23.anInt868) {
					Static23.anInt868 = -1;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!od", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!od", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static5.aClass57_1 != null) {
			Static23.anInt868 = -1;
		}
	}
}
