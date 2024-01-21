import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public final class Class36 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!k", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!k", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!k", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static123.aClass36_1 != null) {
			Static129.anInt2914 = 0;
			Static6.anInt322 = arg0.getX();
			Static58.anInt1816 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!k", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static123.aClass36_1 != null) {
			Static129.anInt2914 = 0;
			Static6.anInt322 = arg0.getX();
			Static58.anInt1816 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!k", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static123.aClass36_1 != null) {
			Static129.anInt2914 = 0;
			Static6.anInt322 = -1;
			Static58.anInt1816 = -1;
		}
	}

	@OriginalMember(owner = "client!k", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static123.aClass36_1 != null) {
			Static129.anInt2914 = 0;
			Static83.anInt2197 = 0;
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!k", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static123.aClass36_1 != null) {
			Static129.anInt2914 = 0;
			Static6.anInt322 = arg0.getX();
			Static58.anInt1816 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!k", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static123.aClass36_1 != null) {
			Static83.anInt2197 = 0;
		}
	}

	@OriginalMember(owner = "client!k", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static123.aClass36_1 != null) {
			Static129.anInt2914 = 0;
			Static132.anInt2933 = arg0.getX();
			Static81.anInt2186 = arg0.getY();
			Static83.aLong86 = Static54.method1236();
			if (arg0.isMetaDown()) {
				Static134.anInt2956 = 2;
				Static83.anInt2197 = 2;
			} else {
				Static134.anInt2956 = 1;
				Static83.anInt2197 = 1;
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}
}
