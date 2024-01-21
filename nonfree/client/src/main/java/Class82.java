import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class82 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!tb", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static134.aClass82_1 != null) {
			Static148.anInt3847 = -1;
		}
	}

	@OriginalMember(owner = "client!tb", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!tb", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static134.aClass82_1 != null) {
			Static66.anInt2048 = 0;
			@Pc(6) int local6 = arg0.getKeyCode();
			if (local6 >= 0 && Static108.anIntArray350.length > local6) {
				local6 = Static108.anIntArray350[local6] & 0xFFFFFF7F;
			} else {
				local6 = -1;
			}
			if (Static148.anInt3847 >= 0 && local6 >= 0) {
				Static164.anIntArray451[Static148.anInt3847] = ~local6;
				Static148.anInt3847 = Static148.anInt3847 + 1 & 0x7F;
				if (Static148.anInt3847 == Static96.anInt3101) {
					Static148.anInt3847 = -1;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!tb", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static134.aClass82_1 == null) {
			return;
		}
		Static66.anInt2048 = 0;
		@Pc(6) int local6 = arg0.getKeyCode();
		if (local6 >= 0 && Static108.anIntArray350.length > local6) {
			local6 = Static108.anIntArray350[local6];
			if ((local6 & 0x80) != 0) {
				local6 = -1;
			}
		} else {
			local6 = -1;
		}
		if (Static148.anInt3847 >= 0 && local6 >= 0) {
			Static164.anIntArray451[Static148.anInt3847] = local6;
			Static148.anInt3847 = Static148.anInt3847 + 1 & 0x7F;
			if (Static148.anInt3847 == Static96.anInt3101) {
				Static148.anInt3847 = -1;
			}
		}
		@Pc(70) int local70;
		if (local6 >= 0) {
			local70 = Static134.anInt3575 + 1 & 0x7F;
			if (local70 != Static119.anInt3313) {
				Static47.anIntArray336[Static134.anInt3575] = local6;
				Static17.anIntArray48[Static134.anInt3575] = -1;
				Static134.anInt3575 = local70;
			}
		}
		local70 = arg0.getModifiers();
		if ((local70 & 0xA) != 0 || local6 == 85 || local6 == 10) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!tb", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		if (Static134.aClass82_1 != null) {
			@Pc(9) int local9 = Static189.method3456(arg0);
			if (local9 >= 0) {
				@Pc(17) int local17 = Static134.anInt3575 + 1 & 0x7F;
				if (Static119.anInt3313 != local17) {
					Static47.anIntArray336[Static134.anInt3575] = -1;
					Static17.anIntArray48[Static134.anInt3575] = local9;
					Static134.anInt3575 = local17;
				}
			}
		}
		arg0.consume();
	}
}
