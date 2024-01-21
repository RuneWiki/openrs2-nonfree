import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public final class Class32 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!jb", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static52.aClass32_1 != null) {
			Static95.anInt2531 = 0;
		}
	}

	@OriginalMember(owner = "client!jb", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static52.aClass32_1 != null) {
			Static56.anInt1487 = 0;
			Static100.anInt2620 = arg0.getX();
			Static105.anInt2732 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!jb", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!jb", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static52.aClass32_1 != null) {
			Static56.anInt1487 = 0;
			Static100.anInt2620 = -1;
			Static105.anInt2732 = -1;
		}
	}

	@OriginalMember(owner = "client!jb", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static52.aClass32_1 != null) {
			Static56.anInt1487 = 0;
			Static95.anInt2531 = 0;
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!jb", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!jb", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static52.aClass32_1 != null) {
			Static56.anInt1487 = 0;
			Static100.anInt2620 = arg0.getX();
			Static105.anInt2732 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!jb", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static52.aClass32_1 != null) {
			Static56.anInt1487 = 0;
			Static100.anInt2620 = arg0.getX();
			Static105.anInt2732 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!jb", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static52.aClass32_1 != null) {
			Static56.anInt1487 = 0;
			Static6.anInt162 = arg0.getX();
			Static117.anInt1917 = arg0.getY();
			Static94.aLong74 = Static66.method1158();
			if (arg0.isMetaDown()) {
				Static71.anInt1811 = 2;
				Static95.anInt2531 = 2;
			} else {
				Static71.anInt1811 = 1;
				Static95.anInt2531 = 1;
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}
}
