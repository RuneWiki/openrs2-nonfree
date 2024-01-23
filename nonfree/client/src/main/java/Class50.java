import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class Class50 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!i", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static103.aClass50_2 != null) {
			Static158.anInt3440 = 0;
			Static169.anInt3809 = 0;
			@Pc(12) int local12 = arg0.getModifiers();
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!i", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static103.aClass50_2 != null) {
			Static158.anInt3440 = 0;
			Static97.anInt2130 = arg0.getX();
			Static103.anInt4807 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!i", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static103.aClass50_2 != null) {
			Static158.anInt3440 = 0;
			Static97.anInt2130 = arg0.getX();
			Static103.anInt4807 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!i", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static103.aClass50_2 != null) {
			Static158.anInt3440 = 0;
			Static220.anInt4642 = arg0.getX();
			Static136.anInt2614 = arg0.getY();
			Static126.aLong102 = Static144.method2489();
			if (arg0.isMetaDown()) {
				Static146.anInt774 = 2;
				Static169.anInt3809 = 2;
			} else {
				Static146.anInt774 = 1;
				Static169.anInt3809 = 1;
			}
			@Pc(28) int local28 = arg0.getModifiers();
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!i", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static103.aClass50_2 != null) {
			Static158.anInt3440 = 0;
			Static97.anInt2130 = -1;
			Static103.anInt4807 = -1;
		}
	}

	@OriginalMember(owner = "client!i", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!i", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static103.aClass50_2 != null) {
			Static158.anInt3440 = 0;
			Static97.anInt2130 = arg0.getX();
			Static103.anInt4807 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!i", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static103.aClass50_2 != null) {
			Static169.anInt3809 = 0;
		}
	}

	@OriginalMember(owner = "client!i", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}
}
