import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public final class Class61 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!td", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static55.aClass61_1 != null) {
			Static95.anInt2498 = 0;
			Static44.anInt1490 = arg0.getX();
			Static12.anInt2438 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!td", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static55.aClass61_1 != null) {
			Static95.anInt2498 = 0;
			Static44.anInt1490 = arg0.getX();
			Static12.anInt2438 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!td", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static55.aClass61_1 != null) {
			Static95.anInt2498 = 0;
			Static14.anInt264 = arg0.getX();
			Static33.anInt1048 = arg0.getY();
			Static18.aLong10 = Static82.method1454();
			if (arg0.isMetaDown()) {
				Static46.anInt1585 = 2;
				Static106.anInt2721 = 2;
			} else {
				Static46.anInt1585 = 1;
				Static106.anInt2721 = 1;
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!td", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!td", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static55.aClass61_1 != null) {
			Static95.anInt2498 = 0;
			Static44.anInt1490 = arg0.getX();
			Static12.anInt2438 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!td", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static55.aClass61_1 != null) {
			Static95.anInt2498 = 0;
			Static44.anInt1490 = -1;
			Static12.anInt2438 = -1;
		}
	}

	@OriginalMember(owner = "client!td", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!td", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static55.aClass61_1 != null) {
			Static95.anInt2498 = 0;
			Static106.anInt2721 = 0;
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!td", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static55.aClass61_1 != null) {
			Static106.anInt2721 = 0;
		}
	}
}
