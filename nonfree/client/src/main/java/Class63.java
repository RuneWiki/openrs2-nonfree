import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public final class Class63 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!ub", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static48.aClass63_1 != null) {
			Static76.anInt2062 = 0;
			Static21.anInt917 = arg0.getX();
			Static13.anInt653 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!ub", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static48.aClass63_1 != null) {
			Static76.anInt2062 = 0;
			Static21.anInt917 = -1;
			Static13.anInt653 = -1;
		}
	}

	@OriginalMember(owner = "client!ub", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static48.aClass63_1 != null) {
			Static13.anInt651 = 0;
		}
	}

	@OriginalMember(owner = "client!ub", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static48.aClass63_1 != null) {
			Static76.anInt2062 = 0;
			Static21.anInt917 = arg0.getX();
			Static13.anInt653 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!ub", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!ub", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static48.aClass63_1 != null) {
			Static76.anInt2062 = 0;
			Static90.anInt2331 = arg0.getX();
			Static80.anInt2128 = arg0.getY();
			Static29.aLong28 = Static85.method1534();
			if (arg0.isMetaDown()) {
				Static67.anInt2761 = 2;
				Static13.anInt651 = 2;
			} else {
				Static67.anInt2761 = 1;
				Static13.anInt651 = 1;
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ub", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ub", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static48.aClass63_1 != null) {
			Static76.anInt2062 = 0;
			Static21.anInt917 = arg0.getX();
			Static13.anInt653 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!ub", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static48.aClass63_1 != null) {
			Static76.anInt2062 = 0;
			Static13.anInt651 = 0;
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}
}
