import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public final class Class18 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!ec", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static104.aClass18_1 != null) {
			Static68.anInt1895 = 0;
			Static3.anInt157 = arg0.getX();
			Static91.anInt2433 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!ec", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static104.aClass18_1 != null) {
			Static68.anInt1895 = 0;
			Static3.anInt157 = arg0.getX();
			Static91.anInt2433 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!ec", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static104.aClass18_1 != null) {
			Static68.anInt1895 = 0;
			Static62.anInt1701 = 0;
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ec", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static104.aClass18_1 != null) {
			Static68.anInt1895 = 0;
			Static3.anInt157 = -1;
			Static91.anInt2433 = -1;
		}
	}

	@OriginalMember(owner = "client!ec", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static104.aClass18_1 != null) {
			Static68.anInt1895 = 0;
			Static49.anInt1379 = arg0.getX();
			Static33.anInt1087 = arg0.getY();
			Static26.aLong27 = System.currentTimeMillis();
			if (arg0.isMetaDown()) {
				Static10.anInt2190 = 2;
				Static62.anInt1701 = 2;
			} else {
				Static10.anInt2190 = 1;
				Static62.anInt1701 = 1;
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ec", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static104.aClass18_1 != null) {
			Static68.anInt1895 = 0;
			Static3.anInt157 = arg0.getX();
			Static91.anInt2433 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!ec", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}
}
