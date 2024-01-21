import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public final class Class16 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!ea", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static21.aClass16_1 != null) {
			Static51.anInt1420 = 0;
			Static66.anInt1756 = arg0.getX();
			Static64.anInt1733 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!ea", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static21.aClass16_1 != null) {
			Static51.anInt1420 = 0;
			Static66.anInt1756 = arg0.getX();
			Static64.anInt1733 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!ea", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static21.aClass16_1 != null) {
			Static51.anInt1420 = 0;
			Static66.anInt1756 = -1;
			Static64.anInt1733 = -1;
		}
	}

	@OriginalMember(owner = "client!ea", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static21.aClass16_1 != null) {
			Static51.anInt1420 = 0;
			Static66.anInt1756 = arg0.getX();
			Static64.anInt1733 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!ea", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static21.aClass16_1 != null) {
			Static51.anInt1420 = 0;
			Static54.anInt1473 = 0;
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ea", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static21.aClass16_1 != null) {
			Static51.anInt1420 = 0;
			Static55.anInt1486 = arg0.getX();
			Static19.anInt627 = arg0.getY();
			Static8.aLong12 = System.currentTimeMillis();
			if (arg0.isMetaDown()) {
				Static66.anInt1759 = 2;
				Static54.anInt1473 = 2;
			} else {
				Static66.anInt1759 = 1;
				Static54.anInt1473 = 1;
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ea", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}
}
