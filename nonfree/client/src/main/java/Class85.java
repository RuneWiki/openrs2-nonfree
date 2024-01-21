import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public final class Class85 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!ua", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static186.aClass85_1 != null) {
			Static57.anInt1793 = 0;
		}
	}

	@OriginalMember(owner = "client!ua", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!ua", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static186.aClass85_1 != null) {
			Static125.anInt3413 = 0;
			Static54.anInt1756 = arg0.getX();
			Static31.anInt993 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!ua", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static186.aClass85_1 != null) {
			Static125.anInt3413 = 0;
			Static82.anInt2420 = arg0.getX();
			Static111.anInt3123 = arg0.getY();
			Static70.aLong71 = Static1.method2();
			if (arg0.isMetaDown()) {
				Static153.anInt3901 = 2;
				Static57.anInt1793 = 2;
			} else {
				Static153.anInt3901 = 1;
				Static57.anInt1793 = 1;
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ua", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ua", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static186.aClass85_1 != null) {
			Static125.anInt3413 = 0;
			Static54.anInt1756 = arg0.getX();
			Static31.anInt993 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!ua", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static186.aClass85_1 != null) {
			Static125.anInt3413 = 0;
			Static57.anInt1793 = 0;
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ua", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static186.aClass85_1 != null) {
			Static125.anInt3413 = 0;
			Static54.anInt1756 = -1;
			Static31.anInt993 = -1;
		}
	}

	@OriginalMember(owner = "client!ua", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static186.aClass85_1 != null) {
			Static125.anInt3413 = 0;
			Static54.anInt1756 = arg0.getX();
			Static31.anInt993 = arg0.getY();
		}
	}
}
