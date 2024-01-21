import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public final class Class44 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!l", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!l", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!l", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static173.aClass44_1 != null) {
			Static103.anInt2565 = 0;
			Static179.anInt4036 = arg0.getX();
			Static73.anInt1907 = arg0.getY();
			Static62.aLong58 = Static177.method2758();
			if (arg0.isMetaDown()) {
				Static80.anInt2057 = 2;
				Static12.anInt553 = 2;
			} else {
				Static80.anInt2057 = 1;
				Static12.anInt553 = 1;
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!l", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static173.aClass44_1 != null) {
			Static103.anInt2565 = 0;
			Static13.anInt597 = -1;
			Static139.anInt3171 = -1;
		}
	}

	@OriginalMember(owner = "client!l", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static173.aClass44_1 != null) {
			Static103.anInt2565 = 0;
			Static13.anInt597 = arg0.getX();
			Static139.anInt3171 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!l", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static173.aClass44_1 != null) {
			Static103.anInt2565 = 0;
			Static13.anInt597 = arg0.getX();
			Static139.anInt3171 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!l", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static173.aClass44_1 != null) {
			Static103.anInt2565 = 0;
			Static12.anInt553 = 0;
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!l", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static173.aClass44_1 != null) {
			Static103.anInt2565 = 0;
			Static13.anInt597 = arg0.getX();
			Static139.anInt3171 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!l", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static173.aClass44_1 != null) {
			Static12.anInt553 = 0;
		}
	}
}
