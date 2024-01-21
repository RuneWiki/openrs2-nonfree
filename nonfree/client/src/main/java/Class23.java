import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!g")
public final class Class23 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!g", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		if (Static99.aClass23_1 != null) {
			@Pc(9) int local9 = Static34.method955(arg0);
			if (local9 >= 0) {
				@Pc(17) int local17 = Static103.anInt2854 + 1 & 0x7F;
				if (local17 != Static165.anInt3887) {
					Static93.anIntArray260[Static103.anInt2854] = -1;
					Static33.anIntArray120[Static103.anInt2854] = local9;
					Static103.anInt2854 = local17;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!g", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static99.aClass23_1 != null) {
			Static47.anInt3276 = 0;
			@Pc(6) int local6 = arg0.getKeyCode();
			if (local6 >= 0 && local6 < Static178.anIntArray445.length) {
				local6 = Static178.anIntArray445[local6] & 0xFFFFFF7F;
			} else {
				local6 = -1;
			}
			if (Static70.anInt2007 >= 0 && local6 >= 0) {
				Static64.anIntArray198[Static70.anInt2007] = ~local6;
				Static70.anInt2007 = Static70.anInt2007 + 1 & 0x7F;
				if (Static70.anInt2007 == Static78.anInt2175) {
					Static70.anInt2007 = -1;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!g", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!g", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static99.aClass23_1 != null) {
			Static70.anInt2007 = -1;
		}
	}

	@OriginalMember(owner = "client!g", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static99.aClass23_1 == null) {
			return;
		}
		Static47.anInt3276 = 0;
		@Pc(6) int local6 = arg0.getKeyCode();
		if (local6 >= 0 && local6 < Static178.anIntArray445.length) {
			local6 = Static178.anIntArray445[local6];
			if ((local6 & 0x80) != 0) {
				local6 = -1;
			}
		} else {
			local6 = -1;
		}
		if (Static70.anInt2007 >= 0 && local6 >= 0) {
			Static64.anIntArray198[Static70.anInt2007] = local6;
			Static70.anInt2007 = Static70.anInt2007 + 1 & 0x7F;
			if (Static70.anInt2007 == Static78.anInt2175) {
				Static70.anInt2007 = -1;
			}
		}
		@Pc(62) int local62;
		if (local6 >= 0) {
			local62 = Static103.anInt2854 + 1 & 0x7F;
			if (local62 != Static165.anInt3887) {
				Static93.anIntArray260[Static103.anInt2854] = local6;
				Static33.anIntArray120[Static103.anInt2854] = -1;
				Static103.anInt2854 = local62;
			}
		}
		local62 = arg0.getModifiers();
		if ((local62 & 0xA) != 0 || local6 == 85 || local6 == 10) {
			arg0.consume();
		}
	}
}
