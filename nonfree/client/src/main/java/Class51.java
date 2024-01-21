import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public final class Class51 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!lg", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static93.aClass51_1 != null) {
			Static139.anInt3553 = 0;
		}
	}

	@OriginalMember(owner = "client!lg", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static93.aClass51_1 != null) {
			Static20.anInt672 = 0;
			Static170.anInt814 = -1;
			Static9.anInt376 = -1;
		}
	}

	@OriginalMember(owner = "client!lg", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!lg", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static93.aClass51_1 != null) {
			Static20.anInt672 = 0;
			Static105.anInt2707 = arg0.getX();
			Static86.anInt2300 = arg0.getY();
			Static13.aLong15 = Static47.method763();
			if (arg0.isMetaDown()) {
				Static39.anInt1073 = 2;
				Static139.anInt3553 = 2;
			} else {
				Static39.anInt1073 = 1;
				Static139.anInt3553 = 1;
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!lg", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static93.aClass51_1 != null) {
			Static20.anInt672 = 0;
			Static139.anInt3553 = 0;
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!lg", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!lg", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static93.aClass51_1 != null) {
			Static20.anInt672 = 0;
			Static170.anInt814 = arg0.getX();
			Static9.anInt376 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!lg", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static93.aClass51_1 != null) {
			Static20.anInt672 = 0;
			Static170.anInt814 = arg0.getX();
			Static9.anInt376 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!lg", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static93.aClass51_1 != null) {
			Static20.anInt672 = 0;
			Static170.anInt814 = arg0.getX();
			Static9.anInt376 = arg0.getY();
		}
	}
}
