import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fo")
public final class Class54 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!fo", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static133.aClass54_1 != null) {
			Static51.anInt1019 = 0;
		}
	}

	@OriginalMember(owner = "client!fo", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!fo", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static133.aClass54_1 != null) {
			Static21.anInt387 = 0;
			Static51.anInt1019 = 0;
			@Pc(9) int local9 = arg0.getModifiers();
			if ((local9 & 0x10) != 0) {
			}
			if ((local9 & 0x8) == 0) {
			}
			if ((local9 & 0x4) != 0) {
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!fo", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static133.aClass54_1 != null) {
			Static21.anInt387 = 0;
			Static302.anInt5358 = arg0.getX();
			Static256.anInt4633 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!fo", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static133.aClass54_1 != null) {
			Static21.anInt387 = 0;
			Static50.anInt1010 = arg0.getX();
			Static208.anInt3972 = arg0.getY();
			Static259.aLong173 = Static298.method4535();
			if (arg0.isMetaDown()) {
				Static29.anInt511 = 2;
				Static51.anInt1019 = 2;
			} else {
				Static29.anInt511 = 1;
				Static51.anInt1019 = 1;
			}
			@Pc(28) int local28 = arg0.getModifiers();
			if ((local28 & 0x4) != 0) {
			}
			if ((local28 & 0x10) != 0) {
			}
			if ((local28 & 0x8) == 0) {
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!fo", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static133.aClass54_1 != null) {
			Static21.anInt387 = 0;
			Static302.anInt5358 = -1;
			Static256.anInt4633 = -1;
		}
	}

	@OriginalMember(owner = "client!fo", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!fo", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static133.aClass54_1 != null) {
			Static21.anInt387 = 0;
			Static302.anInt5358 = arg0.getX();
			Static256.anInt4633 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!fo", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static133.aClass54_1 != null) {
			Static21.anInt387 = 0;
			Static302.anInt5358 = arg0.getX();
			Static256.anInt4633 = arg0.getY();
		}
	}
}
