import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public final class Class45 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!jd", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static16.aClass45_1 != null) {
			Static33.anInt971 = 0;
			Static78.anInt1923 = arg0.getX();
			Static38.anInt1049 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!jd", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static16.aClass45_1 != null) {
			Static33.anInt971 = 0;
			Static169.anInt2039 = arg0.getX();
			Static160.anInt2784 = arg0.getY();
			Static102.aLong80 = Static190.method3141();
			if (arg0.isMetaDown()) {
				Static37.anInt1046 = 2;
				Static7.anInt180 = 2;
			} else {
				Static37.anInt1046 = 1;
				Static7.anInt180 = 1;
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!jd", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static16.aClass45_1 != null) {
			Static33.anInt971 = 0;
			Static78.anInt1923 = arg0.getX();
			Static38.anInt1049 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!jd", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!jd", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static16.aClass45_1 != null) {
			Static33.anInt971 = 0;
			Static7.anInt180 = 0;
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!jd", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static16.aClass45_1 != null) {
			Static7.anInt180 = 0;
		}
	}

	@OriginalMember(owner = "client!jd", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static16.aClass45_1 != null) {
			Static33.anInt971 = 0;
			Static78.anInt1923 = arg0.getX();
			Static38.anInt1049 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!jd", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!jd", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static16.aClass45_1 != null) {
			Static33.anInt971 = 0;
			Static78.anInt1923 = -1;
			Static38.anInt1049 = -1;
		}
	}
}
