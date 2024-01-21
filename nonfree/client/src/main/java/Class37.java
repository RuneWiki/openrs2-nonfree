import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gg")
public final class Class37 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!gg", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		if (Static82.aClass37_1 != null) {
			@Pc(5) int local5 = Static33.method545(arg0);
			if (local5 >= 0) {
				@Pc(16) int local16 = Static129.anInt2700 + 1 & 0x7F;
				if (Static208.anInt4081 != local16) {
					Static77.anIntArray352[Static129.anInt2700] = -1;
					Static15.anIntArray21[Static129.anInt2700] = local5;
					Static129.anInt2700 = local16;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!gg", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static82.aClass37_1 != null) {
			Static153.anInt3126 = 0;
			@Pc(10) int local10 = arg0.getKeyCode();
			if (local10 >= 0 && local10 < Static160.anIntArray350.length) {
				local10 = Static160.anIntArray350[local10] & 0xFFFFFF7F;
			} else {
				local10 = -1;
			}
			if (Static36.anInt784 >= 0 && local10 >= 0) {
				Static11.anIntArray18[Static36.anInt784] = ~local10;
				Static36.anInt784 = Static36.anInt784 + 1 & 0x7F;
				if (Static67.anInt3977 == Static36.anInt784) {
					Static36.anInt784 = -1;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!gg", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static82.aClass37_1 != null) {
			Static36.anInt784 = -1;
		}
	}

	@OriginalMember(owner = "client!gg", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!gg", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static82.aClass37_1 == null) {
			return;
		}
		Static153.anInt3126 = 0;
		@Pc(10) int local10 = arg0.getKeyCode();
		if (local10 >= 0 && local10 < Static160.anIntArray350.length) {
			local10 = Static160.anIntArray350[local10];
			if ((local10 & 0x80) != 0) {
				local10 = -1;
			}
		} else {
			local10 = -1;
		}
		if (Static36.anInt784 >= 0 && local10 >= 0) {
			Static11.anIntArray18[Static36.anInt784] = local10;
			Static36.anInt784 = Static36.anInt784 + 1 & 0x7F;
			if (Static67.anInt3977 == Static36.anInt784) {
				Static36.anInt784 = -1;
			}
		}
		@Pc(66) int local66;
		if (local10 >= 0) {
			local66 = Static129.anInt2700 + 1 & 0x7F;
			if (local66 != Static208.anInt4081) {
				Static77.anIntArray352[Static129.anInt2700] = local10;
				Static15.anIntArray21[Static129.anInt2700] = -1;
				Static129.anInt2700 = local66;
			}
		}
		local66 = arg0.getModifiers();
		if ((local66 & 0xA) != 0 || local10 == 85 || local10 == 10) {
			arg0.consume();
		}
	}
}
