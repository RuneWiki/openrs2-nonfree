import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public final class Class62 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!vd", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!vd", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static73.aClass62_1 != null) {
			Static5.anInt128 = 0;
			Static77.anInt1985 = arg0.getX();
			Static29.anInt816 = arg0.getY();
			Static29.aLong21 = System.currentTimeMillis();
			if (arg0.isMetaDown()) {
				Static49.anInt1265 = 2;
				Static58.anInt1433 = 2;
			} else {
				Static49.anInt1265 = 1;
				Static58.anInt1433 = 1;
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!vd", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static73.aClass62_1 != null) {
			Static5.anInt128 = 0;
			Static98.anInt2490 = -1;
			Static21.anInt664 = -1;
		}
	}

	@OriginalMember(owner = "client!vd", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static73.aClass62_1 != null) {
			Static5.anInt128 = 0;
			Static98.anInt2490 = arg0.getX();
			Static21.anInt664 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!vd", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static73.aClass62_1 != null) {
			Static5.anInt128 = 0;
			Static98.anInt2490 = arg0.getX();
			Static21.anInt664 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!vd", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static73.aClass62_1 != null) {
			Static5.anInt128 = 0;
			Static58.anInt1433 = 0;
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!vd", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static73.aClass62_1 != null) {
			Static5.anInt128 = 0;
			Static98.anInt2490 = arg0.getX();
			Static21.anInt664 = arg0.getY();
		}
	}
}
