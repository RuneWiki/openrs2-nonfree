import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public final class Class42 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!jf", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static140.aClass42_1 != null) {
			Static14.anInt489 = 0;
			Static32.anInt4089 = arg0.getX();
			Static87.anInt2471 = arg0.getY();
			Static68.aLong64 = Static169.method2888();
			if (arg0.isMetaDown()) {
				Static112.anInt3057 = 2;
				Static184.anInt4079 = 2;
			} else {
				Static112.anInt3057 = 1;
				Static184.anInt4079 = 1;
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!jf", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!jf", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static140.aClass42_1 != null) {
			Static184.anInt4079 = 0;
		}
	}

	@OriginalMember(owner = "client!jf", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static140.aClass42_1 != null) {
			Static14.anInt489 = 0;
			Static184.anInt4079 = 0;
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!jf", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!jf", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static140.aClass42_1 != null) {
			Static14.anInt489 = 0;
			Static120.anInt3148 = arg0.getX();
			Static57.anInt1802 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!jf", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static140.aClass42_1 != null) {
			Static14.anInt489 = 0;
			Static120.anInt3148 = arg0.getX();
			Static57.anInt1802 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!jf", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static140.aClass42_1 != null) {
			Static14.anInt489 = 0;
			Static120.anInt3148 = arg0.getX();
			Static57.anInt1802 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!jf", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static140.aClass42_1 != null) {
			Static14.anInt489 = 0;
			Static120.anInt3148 = -1;
			Static57.anInt1802 = -1;
		}
	}
}
