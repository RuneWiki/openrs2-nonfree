import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public final class Class30 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!ge", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static84.aClass30_2 != null) {
			Static9.anInt259 = 0;
			Static76.anInt1994 = arg0.getX();
			Static170.anInt4199 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!ge", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static84.aClass30_2 != null) {
			Static23.anInt715 = 0;
		}
	}

	@OriginalMember(owner = "client!ge", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static84.aClass30_2 != null) {
			Static9.anInt259 = 0;
			Static23.anInt715 = 0;
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ge", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static84.aClass30_2 != null) {
			Static9.anInt259 = 0;
			Static76.anInt1994 = arg0.getX();
			Static170.anInt4199 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!ge", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static84.aClass30_2 != null) {
			Static9.anInt259 = 0;
			Static76.anInt1994 = -1;
			Static170.anInt4199 = -1;
		}
	}

	@OriginalMember(owner = "client!ge", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!ge", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static84.aClass30_2 != null) {
			Static9.anInt259 = 0;
			Static76.anInt1994 = arg0.getX();
			Static170.anInt4199 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!ge", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ge", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static84.aClass30_2 != null) {
			Static9.anInt259 = 0;
			Static143.anInt3516 = arg0.getX();
			Static15.anInt486 = arg0.getY();
			Static177.aLong131 = Static101.method1795();
			if (arg0.isMetaDown()) {
				Static79.anInt2064 = 2;
				Static23.anInt715 = 2;
			} else {
				Static79.anInt2064 = 1;
				Static23.anInt715 = 1;
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}
}
