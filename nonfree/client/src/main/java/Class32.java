import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public final class Class32 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!ge", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!ge", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ge", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static59.aClass32_1 != null) {
			Static92.anInt2363 = 0;
			Static97.anInt2462 = -1;
			Static104.anInt2622 = -1;
		}
	}

	@OriginalMember(owner = "client!ge", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static59.aClass32_1 != null) {
			Static92.anInt2363 = 0;
			Static97.anInt2462 = arg0.getX();
			Static104.anInt2622 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!ge", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static59.aClass32_1 != null) {
			Static144.anInt3348 = 0;
		}
	}

	@OriginalMember(owner = "client!ge", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static59.aClass32_1 != null) {
			Static92.anInt2363 = 0;
			Static44.anInt1091 = arg0.getX();
			Static104.anInt2623 = arg0.getY();
			Static165.aLong132 = Static149.method2559();
			if (arg0.isMetaDown()) {
				Static144.anInt3351 = 2;
				Static144.anInt3348 = 2;
			} else {
				Static144.anInt3351 = 1;
				Static144.anInt3348 = 1;
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ge", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static59.aClass32_1 != null) {
			Static92.anInt2363 = 0;
			Static97.anInt2462 = arg0.getX();
			Static104.anInt2622 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!ge", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static59.aClass32_1 != null) {
			Static92.anInt2363 = 0;
			Static144.anInt3348 = 0;
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ge", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static59.aClass32_1 != null) {
			Static92.anInt2363 = 0;
			Static97.anInt2462 = arg0.getX();
			Static104.anInt2622 = arg0.getY();
		}
	}
}
