import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public final class Class67 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!pd", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static79.aClass67_41 != null) {
			Static61.anInt1317 = 0;
			Static70.anInt1443 = arg0.getX();
			Static41.anInt1001 = arg0.getY();
			Static94.aLong91 = Static108.method1828();
			if (arg0.isMetaDown()) {
				Static18.anInt371 = 2;
				Static48.anInt1123 = 2;
			} else {
				Static18.anInt371 = 1;
				Static48.anInt1123 = 1;
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!pd", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static79.aClass67_41 != null) {
			Static48.anInt1123 = 0;
		}
	}

	@OriginalMember(owner = "client!pd", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static79.aClass67_41 != null) {
			Static61.anInt1317 = 0;
			Static35.anInt893 = arg0.getX();
			Static48.anInt1129 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!pd", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static79.aClass67_41 != null) {
			Static61.anInt1317 = 0;
			Static35.anInt893 = arg0.getX();
			Static48.anInt1129 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!pd", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!pd", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static79.aClass67_41 != null) {
			Static61.anInt1317 = 0;
			Static35.anInt893 = arg0.getX();
			Static48.anInt1129 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!pd", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static79.aClass67_41 != null) {
			Static61.anInt1317 = 0;
			Static48.anInt1123 = 0;
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!pd", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!pd", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static79.aClass67_41 != null) {
			Static61.anInt1317 = 0;
			Static35.anInt893 = -1;
			Static48.anInt1129 = -1;
		}
	}
}
