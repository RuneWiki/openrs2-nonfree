import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qh")
public final class Class138 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!qh", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static48.aClass138_1 != null) {
			Static244.anInt4846 = 0;
			Static113.anInt2604 = 0;
			@Pc(14) int local14 = arg0.getModifiers();
			if ((local14 & 0x4) != 0) {
			}
			if ((local14 & 0x10) == 0) {
			}
			if ((local14 & 0x8) == 0) {
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!qh", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static48.aClass138_1 != null) {
			Static244.anInt4846 = 0;
			Static64.anInt1373 = -1;
			Static199.anInt4055 = -1;
		}
	}

	@OriginalMember(owner = "client!qh", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!qh", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static48.aClass138_1 != null) {
			Static244.anInt4846 = 0;
			Static133.anInt2899 = arg0.getX();
			Static189.anInt3907 = arg0.getY();
			Static140.aLong113 = Static294.method4413();
			if (arg0.isMetaDown()) {
				Static149.anInt3218 = 2;
				Static113.anInt2604 = 2;
			} else {
				Static149.anInt3218 = 1;
				Static113.anInt2604 = 1;
			}
			@Pc(28) int local28 = arg0.getModifiers();
			if ((local28 & 0x10) == 0) {
			}
			if ((local28 & 0x4) != 0) {
			}
			if ((local28 & 0x8) != 0) {
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!qh", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static48.aClass138_1 != null) {
			Static244.anInt4846 = 0;
			Static64.anInt1373 = arg0.getX();
			Static199.anInt4055 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!qh", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static48.aClass138_1 != null) {
			Static113.anInt2604 = 0;
		}
	}

	@OriginalMember(owner = "client!qh", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static48.aClass138_1 != null) {
			Static244.anInt4846 = 0;
			Static64.anInt1373 = arg0.getX();
			Static199.anInt4055 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!qh", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static48.aClass138_1 != null) {
			Static244.anInt4846 = 0;
			Static64.anInt1373 = arg0.getX();
			Static199.anInt4055 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!qh", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}
}
