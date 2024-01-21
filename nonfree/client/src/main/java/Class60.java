import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public final class Class60 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!q", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static100.aClass60_1 != null) {
			Static96.anInt1721 = 0;
			Static25.anInt754 = arg0.getX();
			Static39.anInt1066 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!q", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static100.aClass60_1 != null) {
			Static107.anInt2706 = 0;
		}
	}

	@OriginalMember(owner = "client!q", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static100.aClass60_1 != null) {
			Static96.anInt1721 = 0;
			Static25.anInt754 = arg0.getX();
			Static39.anInt1066 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!q", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!q", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static100.aClass60_1 != null) {
			Static96.anInt1721 = 0;
			Static25.anInt754 = -1;
			Static39.anInt1066 = -1;
		}
	}

	@OriginalMember(owner = "client!q", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static100.aClass60_1 != null) {
			Static96.anInt1721 = 0;
			Static107.anInt2706 = 0;
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!q", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static100.aClass60_1 != null) {
			Static96.anInt1721 = 0;
			Static68.anInt1662 = arg0.getX();
			Static21.anInt489 = arg0.getY();
			Static6.aLong6 = Static82.method1291();
			if (arg0.isMetaDown()) {
				Static112.anInt2834 = 2;
				Static107.anInt2706 = 2;
			} else {
				Static112.anInt2834 = 1;
				Static107.anInt2706 = 1;
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!q", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static100.aClass60_1 != null) {
			Static96.anInt1721 = 0;
			Static25.anInt754 = arg0.getX();
			Static39.anInt1066 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!q", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}
}
