import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class Class39 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!je", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static2.aClass39_1 != null) {
			Static53.anInt1405 = 0;
			@Pc(12) int local12 = arg0.getKeyCode();
			if (local12 >= 0 && local12 < Static57.anIntArray182.length) {
				local12 = Static57.anIntArray182[local12];
				if ((local12 & 0x80) != 0) {
					local12 = -1;
				}
			} else {
				local12 = -1;
			}
			@Pc(60) int local60;
			if (local12 == 85 || local12 == 80 || local12 == 84 || local12 == 0 || local12 == 101) {
				local60 = -1;
			} else {
				local60 = Static101.method1683(arg0);
			}
			if (Static22.anInt705 >= 0 && local12 >= 0) {
				Static75.anIntArray223[Static22.anInt705] = local12;
				Static22.anInt705 = Static22.anInt705 + 1 & 0x7F;
				if (Static22.anInt705 == Static76.anInt2556) {
					Static22.anInt705 = -1;
				}
			}
			if (local12 >= 0 || local60 >= 0) {
				@Pc(100) int local100 = Static68.anInt1563 + 1 & 0x7F;
				if (local100 != Static65.anInt2448) {
					Static76.anIntArray298[Static68.anInt1563] = local12;
					Static50.anIntArray160[Static68.anInt1563] = local60;
					Static68.anInt1563 = local100;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!je", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!je", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static2.aClass39_1 != null) {
			Static53.anInt1405 = 0;
			@Pc(6) int local6 = arg0.getKeyCode();
			if (local6 >= 0 && Static57.anIntArray182.length > local6) {
				local6 = Static57.anIntArray182[local6] & 0xFFFFFF7F;
			} else {
				local6 = -1;
			}
			if (Static22.anInt705 >= 0 && local6 >= 0) {
				Static75.anIntArray223[Static22.anInt705] = ~local6;
				Static22.anInt705 = Static22.anInt705 + 1 & 0x7F;
				if (Static22.anInt705 == Static76.anInt2556) {
					Static22.anInt705 = -1;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!je", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static2.aClass39_1 != null) {
			Static22.anInt705 = -1;
		}
	}

	@OriginalMember(owner = "client!je", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		arg0.consume();
	}
}
