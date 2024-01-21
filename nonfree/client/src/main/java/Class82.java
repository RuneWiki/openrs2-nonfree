import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public final class Class82 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!w", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static7.aClass82_1 != null) {
			Static55.anInt1495 = 0;
		}
	}

	@OriginalMember(owner = "client!w", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!w", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static7.aClass82_1 != null) {
			Static72.anInt1824 = 0;
			Static122.anInt2792 = arg0.getX();
			Static66.anInt1658 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!w", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!w", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static7.aClass82_1 != null) {
			Static72.anInt1824 = 0;
			Static55.anInt1495 = 0;
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!w", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static7.aClass82_1 != null) {
			Static72.anInt1824 = 0;
			Static122.anInt2792 = arg0.getX();
			Static66.anInt1658 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!w", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static7.aClass82_1 != null) {
			Static72.anInt1824 = 0;
			Static122.anInt2792 = arg0.getX();
			Static66.anInt1658 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!w", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static7.aClass82_1 != null) {
			Static72.anInt1824 = 0;
			Static122.anInt2792 = -1;
			Static66.anInt1658 = -1;
		}
	}

	@OriginalMember(owner = "client!w", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static7.aClass82_1 != null) {
			Static72.anInt1824 = 0;
			Static78.anInt1894 = arg0.getX();
			Static39.anInt1052 = arg0.getY();
			Static22.aLong26 = Static8.method75();
			if (arg0.isMetaDown()) {
				Static76.anInt1843 = 2;
				Static55.anInt1495 = 2;
			} else {
				Static76.anInt1843 = 1;
				Static55.anInt1495 = 1;
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}
}
