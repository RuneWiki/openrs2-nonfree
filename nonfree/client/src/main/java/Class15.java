import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ar")
public final class Class15 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!ar", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static11.aClass15_1 != null) {
			Static303.anInt5602 = 0;
			Static140.anInt2850 = arg0.getX();
			Static104.anInt2184 = arg0.getY();
			Static123.aLong97 = Static53.method898();
			if (arg0.isMetaDown()) {
				Static67.anInt1375 = 2;
				Static317.anInt5588 = 2;
			} else {
				Static67.anInt1375 = 1;
				Static317.anInt5588 = 1;
			}
			@Pc(28) int local28 = arg0.getModifiers();
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ar", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static11.aClass15_1 != null) {
			Static303.anInt5602 = 0;
			Static313.anInt6173 = arg0.getX();
			Static8.anInt213 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!ar", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static11.aClass15_1 != null) {
			Static303.anInt5602 = 0;
			Static313.anInt6173 = -1;
			Static8.anInt213 = -1;
		}
	}

	@OriginalMember(owner = "client!ar", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static11.aClass15_1 != null) {
			Static317.anInt5588 = 0;
		}
	}

	@OriginalMember(owner = "client!ar", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static11.aClass15_1 != null) {
			Static303.anInt5602 = 0;
			Static313.anInt6173 = arg0.getX();
			Static8.anInt213 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!ar", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!ar", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ar", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static11.aClass15_1 != null) {
			Static303.anInt5602 = 0;
			Static313.anInt6173 = arg0.getX();
			Static8.anInt213 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!ar", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static11.aClass15_1 != null) {
			Static303.anInt5602 = 0;
			Static317.anInt5588 = 0;
			@Pc(8) int local8 = arg0.getModifiers();
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}
}
