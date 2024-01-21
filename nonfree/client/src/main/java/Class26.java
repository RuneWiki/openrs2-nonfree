import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public final class Class26 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!hd", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static6.aClass26_1 != null) {
			Static96.anInt2744 = 0;
			Static103.anInt2998 = arg0.getX();
			Static91.anInt2642 = arg0.getY();
			Static60.aLong63 = Static102.method1996();
			if (arg0.isMetaDown()) {
				Static57.anInt3399 = 2;
				Static14.anInt433 = 2;
			} else {
				Static57.anInt3399 = 1;
				Static14.anInt433 = 1;
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!hd", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static6.aClass26_1 != null) {
			Static14.anInt433 = 0;
		}
	}

	@OriginalMember(owner = "client!hd", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!hd", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!hd", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static6.aClass26_1 != null) {
			Static96.anInt2744 = 0;
			Static14.anInt433 = 0;
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!hd", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static6.aClass26_1 != null) {
			Static96.anInt2744 = 0;
			Static129.anInt3463 = arg0.getX();
			Static103.anInt2989 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!hd", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static6.aClass26_1 != null) {
			Static96.anInt2744 = 0;
			Static129.anInt3463 = -1;
			Static103.anInt2989 = -1;
		}
	}

	@OriginalMember(owner = "client!hd", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static6.aClass26_1 != null) {
			Static96.anInt2744 = 0;
			Static129.anInt3463 = arg0.getX();
			Static103.anInt2989 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!hd", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static6.aClass26_1 != null) {
			Static96.anInt2744 = 0;
			Static129.anInt3463 = arg0.getX();
			Static103.anInt2989 = arg0.getY();
		}
	}
}
