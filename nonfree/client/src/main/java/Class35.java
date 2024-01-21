import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public final class Class35 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!kd", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static50.aClass35_1 != null) {
			Static66.anInt1717 = 0;
			Static72.anInt1906 = 0;
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!kd", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static50.aClass35_1 != null) {
			Static66.anInt1717 = 0;
			Static3.anInt96 = arg0.getX();
			Static20.anInt460 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!kd", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static50.aClass35_1 != null) {
			Static66.anInt1717 = 0;
			Static3.anInt96 = arg0.getX();
			Static20.anInt460 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!kd", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static50.aClass35_1 != null) {
			Static66.anInt1717 = 0;
			Static3.anInt96 = -1;
			Static20.anInt460 = -1;
		}
	}

	@OriginalMember(owner = "client!kd", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static50.aClass35_1 != null) {
			Static66.anInt1717 = 0;
			Static3.anInt96 = arg0.getX();
			Static20.anInt460 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!kd", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static50.aClass35_1 != null) {
			Static66.anInt1717 = 0;
			Static1.anInt2 = arg0.getX();
			Static84.anInt2216 = arg0.getY();
			Static109.aLong63 = System.currentTimeMillis();
			if (arg0.isMetaDown()) {
				Static55.anInt1437 = 2;
				Static72.anInt1906 = 2;
			} else {
				Static55.anInt1437 = 1;
				Static72.anInt1906 = 1;
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!kd", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}
}
