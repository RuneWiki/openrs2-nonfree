import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public final class Class70 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!r", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static156.aClass70_1 != null) {
			Static160.anInt3569 = 0;
			Static147.anInt3357 = -1;
			Static6.anInt138 = -1;
		}
	}

	@OriginalMember(owner = "client!r", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static156.aClass70_1 != null) {
			Static160.anInt3569 = 0;
			Static147.anInt3357 = arg0.getX();
			Static6.anInt138 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!r", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static156.aClass70_1 != null) {
			Static160.anInt3569 = 0;
			Static147.anInt3357 = arg0.getX();
			Static6.anInt138 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!r", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!r", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static156.aClass70_1 != null) {
			Static55.anInt1456 = 0;
		}
	}

	@OriginalMember(owner = "client!r", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static156.aClass70_1 != null) {
			Static160.anInt3569 = 0;
			Static180.anInt3973 = arg0.getX();
			Static180.anInt3970 = arg0.getY();
			Static148.aLong125 = Static150.method2481();
			if (arg0.isMetaDown()) {
				Static130.anInt3068 = 2;
				Static55.anInt1456 = 2;
			} else {
				Static130.anInt3068 = 1;
				Static55.anInt1456 = 1;
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!r", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static156.aClass70_1 != null) {
			Static160.anInt3569 = 0;
			Static147.anInt3357 = arg0.getX();
			Static6.anInt138 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!r", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!r", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static156.aClass70_1 != null) {
			Static160.anInt3569 = 0;
			Static55.anInt1456 = 0;
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}
}
