import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public final class Class29 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!he", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static105.aClass29_1 != null) {
			Static93.anInt2434 = 0;
			Static44.anInt1232 = 0;
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!he", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static105.aClass29_1 != null) {
			Static93.anInt2434 = 0;
			Static9.anInt198 = arg0.getX();
			Static45.anInt1240 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!he", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!he", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static105.aClass29_1 != null) {
			Static93.anInt2434 = 0;
			Static9.anInt198 = arg0.getX();
			Static45.anInt1240 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!he", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static105.aClass29_1 != null) {
			Static93.anInt2434 = 0;
			Static9.anInt198 = -1;
			Static45.anInt1240 = -1;
		}
	}

	@OriginalMember(owner = "client!he", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static105.aClass29_1 != null) {
			Static93.anInt2434 = 0;
			Static55.anInt1561 = arg0.getX();
			Static7.anInt143 = arg0.getY();
			Static102.aLong79 = System.currentTimeMillis();
			if (arg0.isMetaDown()) {
				Static44.anInt1230 = 2;
				Static44.anInt1232 = 2;
			} else {
				Static44.anInt1230 = 1;
				Static44.anInt1232 = 1;
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!he", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static105.aClass29_1 != null) {
			Static93.anInt2434 = 0;
			Static9.anInt198 = arg0.getX();
			Static45.anInt1240 = arg0.getY();
		}
	}
}
