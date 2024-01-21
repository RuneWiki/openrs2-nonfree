import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kf")
public final class Class44 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "[I")
	public static int[] anIntArray250 = new int[32];

	static {
		@Pc(20) int local20 = 2;
		for (@Pc(22) int local22 = 0; local22 < 32; local22++) {
			anIntArray250[local22] = local20 - 1;
			local20 += local20;
		}
	}

	@OriginalMember(owner = "client!kf", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static127.aClass44_1 != null) {
			Static91.anInt2416 = 0;
			@Pc(10) int local10 = arg0.getKeyCode();
			if (local10 >= 0 && local10 < Static88.anIntArray446.length) {
				local10 = Static88.anIntArray446[local10] & 0xFFFFFF7F;
			} else {
				local10 = -1;
			}
			if (Static41.anInt2294 >= 0 && local10 >= 0) {
				Static8.anIntArray49[Static41.anInt2294] = ~local10;
				Static41.anInt2294 = Static41.anInt2294 + 1 & 0x7F;
				if (Static41.anInt2294 == Static76.anInt1866) {
					Static41.anInt2294 = -1;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!kf", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(3) int local3 = Static103.method1750(arg0);
		if (local3 >= 0) {
			@Pc(14) int local14 = Static4.anInt2609 + 1 & 0x7F;
			if (local14 != Static96.anInt2501) {
				Static58.anIntArray211[Static4.anInt2609] = -1;
				Static40.anIntArray175[Static4.anInt2609] = local3;
				Static4.anInt2609 = local14;
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!kf", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!kf", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static127.aClass44_1 != null) {
			Static41.anInt2294 = -1;
		}
	}

	@OriginalMember(owner = "client!kf", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static127.aClass44_1 == null) {
			return;
		}
		Static91.anInt2416 = 0;
		@Pc(10) int local10 = arg0.getKeyCode();
		if (local10 >= 0 && local10 < Static88.anIntArray446.length) {
			local10 = Static88.anIntArray446[local10];
			if ((local10 & 0x80) != 0) {
				local10 = -1;
			}
		} else {
			local10 = -1;
		}
		if (Static41.anInt2294 >= 0 && local10 >= 0) {
			Static8.anIntArray49[Static41.anInt2294] = local10;
			Static41.anInt2294 = Static41.anInt2294 + 1 & 0x7F;
			if (Static76.anInt1866 == Static41.anInt2294) {
				Static41.anInt2294 = -1;
			}
		}
		@Pc(70) int local70;
		if (local10 >= 0) {
			local70 = Static4.anInt2609 + 1 & 0x7F;
			if (Static96.anInt2501 != local70) {
				Static58.anIntArray211[Static4.anInt2609] = local10;
				Static40.anIntArray175[Static4.anInt2609] = -1;
				Static4.anInt2609 = local70;
			}
		}
		local70 = arg0.getModifiers();
		if ((local70 & 0xA) != 0 || local10 == 85 || local10 == 10) {
			arg0.consume();
		}
	}
}
