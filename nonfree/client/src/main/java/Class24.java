import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public final class Class24 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!fc", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static51.aClass24_1 != null) {
			Static49.anInt1165 = 0;
			Static22.anInt680 = arg0.getX();
			Static87.anInt1981 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!fc", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static51.aClass24_1 != null) {
			Static49.anInt1165 = 0;
			Static22.anInt680 = arg0.getX();
			Static87.anInt1981 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!fc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static51.aClass24_1 != null) {
			Static6.anInt320 = 0;
		}
	}

	@OriginalMember(owner = "client!fc", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static51.aClass24_1 != null) {
			Static49.anInt1165 = 0;
			Static22.anInt680 = -1;
			Static87.anInt1981 = -1;
		}
	}

	@OriginalMember(owner = "client!fc", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static51.aClass24_1 != null) {
			Static49.anInt1165 = 0;
			Static6.anInt320 = 0;
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!fc", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!fc", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static51.aClass24_1 != null) {
			Static49.anInt1165 = 0;
			Static22.anInt680 = arg0.getX();
			Static87.anInt1981 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!fc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!fc", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static51.aClass24_1 != null) {
			Static49.anInt1165 = 0;
			Static104.anInt2431 = arg0.getX();
			Static22.anInt675 = arg0.getY();
			Static74.aLong50 = Static80.method1369();
			if (arg0.isMetaDown()) {
				Static61.anInt1423 = 2;
				Static6.anInt320 = 2;
			} else {
				Static61.anInt1423 = 1;
				Static6.anInt320 = 1;
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}
}
