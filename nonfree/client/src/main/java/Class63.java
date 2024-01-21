import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public final class Class63 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!rc", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static71.aClass63_1 != null) {
			Static48.anInt1589 = 0;
			Static4.anInt103 = arg0.getX();
			Static67.anInt1912 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!rc", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static71.aClass63_1 != null) {
			Static48.anInt1589 = 0;
			Static4.anInt103 = arg0.getX();
			Static67.anInt1912 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!rc", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static71.aClass63_1 != null) {
			Static48.anInt1589 = 0;
			Static4.anInt103 = -1;
			Static67.anInt1912 = -1;
		}
	}

	@OriginalMember(owner = "client!rc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static71.aClass63_1 != null) {
			Static91.anInt2547 = 0;
		}
	}

	@OriginalMember(owner = "client!rc", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static71.aClass63_1 != null) {
			Static48.anInt1589 = 0;
			Static91.anInt2547 = 0;
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!rc", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static71.aClass63_1 != null) {
			Static48.anInt1589 = 0;
			Static4.anInt103 = arg0.getX();
			Static67.anInt1912 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!rc", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!rc", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static71.aClass63_1 != null) {
			Static48.anInt1589 = 0;
			Static108.anInt2836 = arg0.getX();
			Static69.anInt1983 = arg0.getY();
			Static46.aLong71 = Static62.method1228();
			if (arg0.isMetaDown()) {
				Static37.anInt1076 = 2;
				Static91.anInt2547 = 2;
			} else {
				Static37.anInt1076 = 1;
				Static91.anInt2547 = 1;
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!rc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}
}
