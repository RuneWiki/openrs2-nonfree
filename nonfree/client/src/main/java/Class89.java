import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ug")
public final class Class89 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!ug", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static159.aClass89_1 != null) {
			Static11.anInt253 = 0;
			@Pc(6) int local6 = arg0.getKeyCode();
			if (local6 >= 0 && Static202.anIntArray358.length > local6) {
				local6 = Static202.anIntArray358[local6] & 0xFFFFFF7F;
			} else {
				local6 = -1;
			}
			if (Static104.anInt2249 >= 0 && local6 >= 0) {
				Static33.anIntArray62[Static104.anInt2249] = ~local6;
				Static104.anInt2249 = Static104.anInt2249 + 1 & 0x7F;
				if (Static118.anInt2519 == Static104.anInt2249) {
					Static104.anInt2249 = -1;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!ug", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		if (Static159.aClass89_1 != null) {
			@Pc(5) int local5 = Static173.method2743(arg0);
			if (local5 >= 0) {
				@Pc(16) int local16 = Static59.anInt1433 + 1 & 0x7F;
				if (Static127.anInt2652 != local16) {
					Static200.anIntArray355[Static59.anInt1433] = -1;
					Static6.anIntArray15[Static59.anInt1433] = local5;
					Static59.anInt1433 = local16;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!ug", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static159.aClass89_1 == null) {
			return;
		}
		Static11.anInt253 = 0;
		@Pc(6) int local6 = arg0.getKeyCode();
		if (local6 >= 0 && Static202.anIntArray358.length > local6) {
			local6 = Static202.anIntArray358[local6];
			if ((local6 & 0x80) != 0) {
				local6 = -1;
			}
		} else {
			local6 = -1;
		}
		if (Static104.anInt2249 >= 0 && local6 >= 0) {
			Static33.anIntArray62[Static104.anInt2249] = local6;
			Static104.anInt2249 = Static104.anInt2249 + 1 & 0x7F;
			if (Static104.anInt2249 == Static118.anInt2519) {
				Static104.anInt2249 = -1;
			}
		}
		@Pc(66) int local66;
		if (local6 >= 0) {
			local66 = Static59.anInt1433 + 1 & 0x7F;
			if (local66 != Static127.anInt2652) {
				Static200.anIntArray355[Static59.anInt1433] = local6;
				Static6.anIntArray15[Static59.anInt1433] = -1;
				Static59.anInt1433 = local66;
			}
		}
		local66 = arg0.getModifiers();
		if ((local66 & 0xA) != 0 || local6 == 85 || local6 == 10) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ug", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!ug", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static159.aClass89_1 != null) {
			Static104.anInt2249 = -1;
		}
	}
}
