import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public final class Class46 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!kf", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static74.aClass46_1 != null) {
			Static128.anInt2950 = 0;
			Static160.anInt600 = arg0.getX();
			Static121.anInt2821 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!kf", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static74.aClass46_1 != null) {
			Static128.anInt2950 = 0;
			Static160.anInt600 = arg0.getX();
			Static121.anInt2821 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!kf", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static74.aClass46_1 != null) {
			Static128.anInt2950 = 0;
			Static160.anInt600 = -1;
			Static121.anInt2821 = -1;
		}
	}

	@OriginalMember(owner = "client!kf", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!kf", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static74.aClass46_1 != null) {
			Static39.anInt1125 = 0;
		}
	}

	@OriginalMember(owner = "client!kf", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!kf", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static74.aClass46_1 != null) {
			Static128.anInt2950 = 0;
			Static160.anInt600 = arg0.getX();
			Static121.anInt2821 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!kf", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static74.aClass46_1 != null) {
			Static128.anInt2950 = 0;
			Static10.anInt245 = arg0.getX();
			Static49.anInt1366 = arg0.getY();
			Static58.aLong81 = Static70.method1106();
			if (arg0.isMetaDown()) {
				Static149.anInt3474 = 2;
				Static39.anInt1125 = 2;
			} else {
				Static149.anInt3474 = 1;
				Static39.anInt1125 = 1;
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!kf", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static74.aClass46_1 != null) {
			Static128.anInt2950 = 0;
			Static39.anInt1125 = 0;
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}
}
