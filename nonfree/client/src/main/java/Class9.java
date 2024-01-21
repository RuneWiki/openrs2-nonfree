import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public final class Class9 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!ca", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static69.aClass9_1 != null) {
			Static97.anInt2830 = 0;
		}
	}

	@OriginalMember(owner = "client!ca", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static69.aClass9_1 != null) {
			Static94.anInt2641 = 0;
			Static70.anInt2073 = arg0.getX();
			Static81.anInt2298 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!ca", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static69.aClass9_1 != null) {
			Static94.anInt2641 = 0;
			Static97.anInt2830 = 0;
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ca", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static69.aClass9_1 != null) {
			Static94.anInt2641 = 0;
			Static70.anInt2073 = arg0.getX();
			Static81.anInt2298 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!ca", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!ca", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static69.aClass9_1 != null) {
			Static94.anInt2641 = 0;
			Static70.anInt2073 = arg0.getX();
			Static81.anInt2298 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!ca", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static69.aClass9_1 != null) {
			Static94.anInt2641 = 0;
			Static70.anInt2073 = -1;
			Static81.anInt2298 = -1;
		}
	}

	@OriginalMember(owner = "client!ca", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ca", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static69.aClass9_1 != null) {
			Static94.anInt2641 = 0;
			Static95.anInt2767 = arg0.getX();
			Static85.anInt2384 = arg0.getY();
			Static58.aLong64 = Static1.method3();
			if (arg0.isMetaDown()) {
				Static58.anInt1735 = 2;
				Static97.anInt2830 = 2;
			} else {
				Static58.anInt1735 = 1;
				Static97.anInt2830 = 1;
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}
}
