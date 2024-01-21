import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public final class Class70 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!te", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!te", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static124.aClass70_1 != null) {
			Static67.anInt2790 = 0;
		}
	}

	@OriginalMember(owner = "client!te", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static124.aClass70_1 != null) {
			Static3.anInt72 = 0;
			Static67.anInt2790 = 0;
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!te", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!te", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static124.aClass70_1 != null) {
			Static3.anInt72 = 0;
			Static46.anInt1414 = arg0.getX();
			Static4.anInt134 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!te", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static124.aClass70_1 != null) {
			Static3.anInt72 = 0;
			Static115.anInt3047 = arg0.getX();
			Static54.anInt1633 = arg0.getY();
			Static14.aLong14 = Static87.method1625();
			if (arg0.isMetaDown()) {
				Static87.anInt2438 = 2;
				Static67.anInt2790 = 2;
			} else {
				Static87.anInt2438 = 1;
				Static67.anInt2790 = 1;
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!te", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static124.aClass70_1 != null) {
			Static3.anInt72 = 0;
			Static46.anInt1414 = arg0.getX();
			Static4.anInt134 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!te", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static124.aClass70_1 != null) {
			Static3.anInt72 = 0;
			Static46.anInt1414 = -1;
			Static4.anInt134 = -1;
		}
	}

	@OriginalMember(owner = "client!te", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static124.aClass70_1 != null) {
			Static3.anInt72 = 0;
			Static46.anInt1414 = arg0.getX();
			Static4.anInt134 = arg0.getY();
		}
	}
}
