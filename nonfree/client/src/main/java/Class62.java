import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!og")
public final class Class62 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!og", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		if (Static156.aClass62_1 != null) {
			@Pc(9) int local9 = Static136.method2659(arg0);
			if (local9 >= 0) {
				@Pc(20) int local20 = Static119.anInt3255 + 1 & 0x7F;
				if (local20 != Static31.anInt1007) {
					Static176.anIntArray423[Static119.anInt3255] = -1;
					Static127.anIntArray327[Static119.anInt3255] = local9;
					Static119.anInt3255 = local20;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!og", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static156.aClass62_1 == null) {
			return;
		}
		Static138.anInt3623 = 0;
		@Pc(10) int local10 = arg0.getKeyCode();
		if (local10 >= 0 && Static148.anIntArray371.length > local10) {
			local10 = Static148.anIntArray371[local10];
			if ((local10 & 0x80) != 0) {
				local10 = -1;
			}
		} else {
			local10 = -1;
		}
		if (Static2.anInt128 >= 0 && local10 >= 0) {
			Static178.anIntArray424[Static2.anInt128] = local10;
			Static2.anInt128 = Static2.anInt128 + 1 & 0x7F;
			if (Static2.anInt128 == Static75.anInt2275) {
				Static2.anInt128 = -1;
			}
		}
		@Pc(73) int local73;
		if (local10 >= 0) {
			local73 = Static119.anInt3255 + 1 & 0x7F;
			if (Static31.anInt1007 != local73) {
				Static176.anIntArray423[Static119.anInt3255] = local10;
				Static127.anIntArray327[Static119.anInt3255] = -1;
				Static119.anInt3255 = local73;
			}
		}
		local73 = arg0.getModifiers();
		if ((local73 & 0xA) != 0 || local10 == 85 || local10 == 10) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!og", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!og", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static156.aClass62_1 != null) {
			Static138.anInt3623 = 0;
			@Pc(10) int local10 = arg0.getKeyCode();
			if (local10 >= 0 && local10 < Static148.anIntArray371.length) {
				local10 = Static148.anIntArray371[local10] & 0xFFFFFF7F;
			} else {
				local10 = -1;
			}
			if (Static2.anInt128 >= 0 && local10 >= 0) {
				Static178.anIntArray424[Static2.anInt128] = ~local10;
				Static2.anInt128 = Static2.anInt128 + 1 & 0x7F;
				if (Static2.anInt128 == Static75.anInt2275) {
					Static2.anInt128 = -1;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!og", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static156.aClass62_1 != null) {
			Static2.anInt128 = -1;
		}
	}
}
