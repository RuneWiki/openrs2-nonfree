import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dm")
public final class Class53 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!dm", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static98.aClass53_3 != null) {
			Static93.anInt2052 = 0;
			Static157.anInt3516 = arg0.getX();
			Static83.anInt1765 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!dm", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static98.aClass53_3 != null) {
			Static93.anInt2052 = 0;
			Static157.anInt3516 = -1;
			Static83.anInt1765 = -1;
		}
	}

	@OriginalMember(owner = "client!dm", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static98.aClass53_3 != null) {
			Static93.anInt2052 = 0;
			Static157.anInt3516 = arg0.getX();
			Static83.anInt1765 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!dm", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static98.aClass53_3 != null) {
			Static288.anInt5834 = 0;
		}
	}

	@OriginalMember(owner = "client!dm", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static98.aClass53_3 != null) {
			Static93.anInt2052 = 0;
			Static157.anInt3516 = arg0.getX();
			Static83.anInt1765 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!dm", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static98.aClass53_3 != null) {
			Static93.anInt2052 = 0;
			Static169.anInt3741 = arg0.getX();
			Static140.anInt3163 = arg0.getY();
			Static146.aLong114 = Static274.method4763();
			if (arg0.isMetaDown()) {
				Static342.anInt6703 = 2;
				Static288.anInt5834 = 2;
			} else {
				Static342.anInt6703 = 1;
				Static288.anInt5834 = 1;
			}
			@Pc(28) int local28 = arg0.getModifiers();
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!dm", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static98.aClass53_3 != null) {
			Static93.anInt2052 = 0;
			Static288.anInt5834 = 0;
			@Pc(8) int local8 = arg0.getModifiers();
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!dm", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!dm", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}
}
