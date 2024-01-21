import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public final class Class10 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!cd", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!cd", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!cd", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static49.aClass10_1 != null) {
			Static5.anInt157 = 0;
			Static112.anInt2608 = arg0.getX();
			Static126.anInt2912 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!cd", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static49.aClass10_1 != null) {
			Static5.anInt157 = 0;
			Static112.anInt2608 = arg0.getX();
			Static126.anInt2912 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!cd", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static49.aClass10_1 != null) {
			Static5.anInt157 = 0;
			Static112.anInt2608 = -1;
			Static126.anInt2912 = -1;
		}
	}

	@OriginalMember(owner = "client!cd", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static49.aClass10_1 != null) {
			Static5.anInt157 = 0;
			Static60.anInt1676 = arg0.getX();
			Static46.anInt1213 = arg0.getY();
			Static64.aLong47 = Static125.method2075();
			if (arg0.isMetaDown()) {
				Static74.anInt942 = 2;
				Static73.anInt1925 = 2;
			} else {
				Static74.anInt942 = 1;
				Static73.anInt1925 = 1;
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!cd", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static49.aClass10_1 != null) {
			Static5.anInt157 = 0;
			Static112.anInt2608 = arg0.getX();
			Static126.anInt2912 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!cd", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static49.aClass10_1 != null) {
			Static73.anInt1925 = 0;
		}
	}

	@OriginalMember(owner = "client!cd", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static49.aClass10_1 != null) {
			Static5.anInt157 = 0;
			Static73.anInt1925 = 0;
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}
}
