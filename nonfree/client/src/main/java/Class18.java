import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public final class Class18 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!ec", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static93.aClass18_1 != null) {
			Static80.anInt2006 = 0;
			Static68.anInt1579 = arg0.getX();
			Static75.anInt1751 = arg0.getY();
			Static23.aLong24 = Static52.method906();
			if (arg0.isMetaDown()) {
				Static121.anInt3117 = 2;
				Static19.anInt648 = 2;
			} else {
				Static121.anInt3117 = 1;
				Static19.anInt648 = 1;
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ec", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static93.aClass18_1 != null) {
			Static80.anInt2006 = 0;
			Static77.anInt1808 = arg0.getX();
			Static46.anInt1123 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!ec", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static93.aClass18_1 != null) {
			Static80.anInt2006 = 0;
			Static19.anInt648 = 0;
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ec", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static93.aClass18_1 != null) {
			Static19.anInt648 = 0;
		}
	}

	@OriginalMember(owner = "client!ec", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static93.aClass18_1 != null) {
			Static80.anInt2006 = 0;
			Static77.anInt1808 = -1;
			Static46.anInt1123 = -1;
		}
	}

	@OriginalMember(owner = "client!ec", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ec", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!ec", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static93.aClass18_1 != null) {
			Static80.anInt2006 = 0;
			Static77.anInt1808 = arg0.getX();
			Static46.anInt1123 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!ec", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static93.aClass18_1 != null) {
			Static80.anInt2006 = 0;
			Static77.anInt1808 = arg0.getX();
			Static46.anInt1123 = arg0.getY();
		}
	}
}
