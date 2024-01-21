import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public final class Class45 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!le", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static63.aClass45_1 != null) {
			Static22.anInt754 = 0;
			Static85.anInt2026 = arg0.getX();
			Static102.anInt2580 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!le", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!le", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!le", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static63.aClass45_1 != null) {
			Static22.anInt754 = 0;
			Static85.anInt2026 = arg0.getX();
			Static102.anInt2580 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!le", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static63.aClass45_1 != null) {
			Static2.anInt137 = 0;
		}
	}

	@OriginalMember(owner = "client!le", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static63.aClass45_1 != null) {
			Static22.anInt754 = 0;
			Static85.anInt2026 = arg0.getX();
			Static102.anInt2580 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!le", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static63.aClass45_1 != null) {
			Static22.anInt754 = 0;
			Static123.anInt2992 = arg0.getX();
			Static72.anInt1805 = arg0.getY();
			Static63.aLong47 = Static124.method2079();
			if (arg0.isMetaDown()) {
				Static26.anInt921 = 2;
				Static2.anInt137 = 2;
			} else {
				Static26.anInt921 = 1;
				Static2.anInt137 = 1;
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!le", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static63.aClass45_1 != null) {
			Static22.anInt754 = 0;
			Static2.anInt137 = 0;
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!le", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static63.aClass45_1 != null) {
			Static22.anInt754 = 0;
			Static85.anInt2026 = -1;
			Static102.anInt2580 = -1;
		}
	}
}
