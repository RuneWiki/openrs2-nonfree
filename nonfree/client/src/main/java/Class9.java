import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public final class Class9 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!bc", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static35.aClass9_1 != null) {
			Static116.anInt3353 = 0;
			Static150.anInt3086 = arg0.getX();
			Static6.anInt116 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!bc", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static35.aClass9_1 != null) {
			Static116.anInt3353 = 0;
			Static190.anInt3866 = arg0.getX();
			Static82.anInt1622 = arg0.getY();
			Static41.aLong26 = Static210.method3307();
			if (arg0.isMetaDown()) {
				Static52.anInt1120 = 2;
				Static113.anInt2291 = 2;
			} else {
				Static52.anInt1120 = 1;
				Static113.anInt2291 = 1;
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!bc", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static35.aClass9_1 != null) {
			Static116.anInt3353 = 0;
			Static150.anInt3086 = -1;
			Static6.anInt116 = -1;
		}
	}

	@OriginalMember(owner = "client!bc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!bc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static35.aClass9_1 != null) {
			Static113.anInt2291 = 0;
		}
	}

	@OriginalMember(owner = "client!bc", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static35.aClass9_1 != null) {
			Static116.anInt3353 = 0;
			Static150.anInt3086 = arg0.getX();
			Static6.anInt116 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!bc", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!bc", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static35.aClass9_1 != null) {
			Static116.anInt3353 = 0;
			Static150.anInt3086 = arg0.getX();
			Static6.anInt116 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!bc", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static35.aClass9_1 != null) {
			Static116.anInt3353 = 0;
			Static113.anInt2291 = 0;
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}
}
