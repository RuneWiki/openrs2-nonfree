import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public final class Class39 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!j", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static49.aClass39_1 != null) {
			Static10.anInt2956 = 0;
			Static104.anInt2963 = -1;
			Static132.anInt2895 = -1;
		}
	}

	@OriginalMember(owner = "client!j", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!j", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static49.aClass39_1 != null) {
			Static10.anInt2956 = 0;
			Static124.anInt2641 = arg0.getX();
			Static116.anInt2570 = arg0.getY();
			Static7.aLong10 = Static78.method1296();
			if (arg0.isMetaDown()) {
				Static117.anInt2580 = 2;
				Static103.anInt2333 = 2;
			} else {
				Static117.anInt2580 = 1;
				Static103.anInt2333 = 1;
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!j", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static49.aClass39_1 != null) {
			Static10.anInt2956 = 0;
			Static104.anInt2963 = arg0.getX();
			Static132.anInt2895 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!j", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static49.aClass39_1 != null) {
			Static103.anInt2333 = 0;
		}
	}

	@OriginalMember(owner = "client!j", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static49.aClass39_1 != null) {
			Static10.anInt2956 = 0;
			Static104.anInt2963 = arg0.getX();
			Static132.anInt2895 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!j", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!j", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static49.aClass39_1 != null) {
			Static10.anInt2956 = 0;
			Static103.anInt2333 = 0;
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!j", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static49.aClass39_1 != null) {
			Static10.anInt2956 = 0;
			Static104.anInt2963 = arg0.getX();
			Static132.anInt2895 = arg0.getY();
		}
	}
}
