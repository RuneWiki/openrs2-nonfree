import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public final class Class34 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!md", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static56.aClass34_1 != null) {
			Static101.anInt2740 = 0;
			Static40.anInt2034 = arg0.getX();
			Static65.anInt2154 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!md", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static56.aClass34_1 != null) {
			Static101.anInt2740 = 0;
			Static40.anInt2034 = -1;
			Static65.anInt2154 = -1;
		}
	}

	@OriginalMember(owner = "client!md", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static56.aClass34_1 != null) {
			Static101.anInt2740 = 0;
			Static46.anInt1617 = 0;
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!md", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static56.aClass34_1 != null) {
			Static101.anInt2740 = 0;
			Static82.anInt2305 = arg0.getX();
			Static75.anInt2245 = arg0.getY();
			Static4.aLong6 = System.currentTimeMillis();
			if (arg0.isMetaDown()) {
				Static102.anInt694 = 2;
				Static46.anInt1617 = 2;
			} else {
				Static102.anInt694 = 1;
				Static46.anInt1617 = 1;
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!md", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!md", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static56.aClass34_1 != null) {
			Static101.anInt2740 = 0;
			Static40.anInt2034 = arg0.getX();
			Static65.anInt2154 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!md", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static56.aClass34_1 != null) {
			Static101.anInt2740 = 0;
			Static40.anInt2034 = arg0.getX();
			Static65.anInt2154 = arg0.getY();
		}
	}
}
