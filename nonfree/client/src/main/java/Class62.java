import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public final class Class62 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!vd", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static81.aClass62_1 != null) {
			Static58.anInt1497 = 0;
			Static99.anInt112 = arg0.getX();
			Static66.anInt1663 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!vd", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static81.aClass62_1 != null) {
			Static58.anInt1497 = 0;
			Static99.anInt112 = arg0.getX();
			Static66.anInt1663 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!vd", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static81.aClass62_1 != null) {
			Static58.anInt1497 = 0;
			Static99.anInt112 = -1;
			Static66.anInt1663 = -1;
		}
	}

	@OriginalMember(owner = "client!vd", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static81.aClass62_1 != null) {
			Static58.anInt1497 = 0;
			Static38.anInt969 = 0;
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!vd", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static81.aClass62_1 != null) {
			Static58.anInt1497 = 0;
			Static99.anInt112 = arg0.getX();
			Static66.anInt1663 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!vd", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static81.aClass62_1 != null) {
			Static58.anInt1497 = 0;
			Static51.anInt1166 = arg0.getX();
			Static103.anInt2494 = arg0.getY();
			Static46.aLong149 = System.currentTimeMillis();
			if (arg0.isMetaDown()) {
				Static105.anInt2520 = 2;
				Static38.anInt969 = 2;
			} else {
				Static105.anInt2520 = 1;
				Static38.anInt969 = 1;
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!vd", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}
}
