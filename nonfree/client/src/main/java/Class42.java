import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public final class Class42 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!je", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static31.aClass42_1 != null) {
			Static66.anInt1459 = 0;
			Static40.anInt1115 = -1;
			Static6.anInt118 = -1;
		}
	}

	@OriginalMember(owner = "client!je", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static31.aClass42_1 != null) {
			Static66.anInt1459 = 0;
			Static40.anInt1115 = arg0.getX();
			Static6.anInt118 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!je", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static31.aClass42_1 != null) {
			Static66.anInt1459 = 0;
			Static114.anInt2640 = arg0.getX();
			Static47.anInt1213 = arg0.getY();
			Static111.aLong156 = Static26.method596();
			if (arg0.isMetaDown()) {
				Static114.anInt2644 = 2;
				Static32.anInt895 = 2;
			} else {
				Static114.anInt2644 = 1;
				Static32.anInt895 = 1;
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!je", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static31.aClass42_1 != null) {
			Static66.anInt1459 = 0;
			Static32.anInt895 = 0;
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!je", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!je", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static31.aClass42_1 != null) {
			Static66.anInt1459 = 0;
			Static40.anInt1115 = arg0.getX();
			Static6.anInt118 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!je", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static31.aClass42_1 != null) {
			Static66.anInt1459 = 0;
			Static40.anInt1115 = arg0.getX();
			Static6.anInt118 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!je", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static31.aClass42_1 != null) {
			Static32.anInt895 = 0;
		}
	}

	@OriginalMember(owner = "client!je", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}
}
