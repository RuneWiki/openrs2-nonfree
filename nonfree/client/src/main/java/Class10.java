import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public final class Class10 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!cc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!cc", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static136.aClass10_1 != null) {
			Static108.anInt3192 = 0;
			Static94.anInt2915 = arg0.getX();
			Static129.anInt3683 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!cc", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static136.aClass10_1 != null) {
			Static108.anInt3192 = 0;
			Static108.anInt3184 = arg0.getX();
			Static2.anInt103 = arg0.getY();
			Static175.aLong135 = Static146.method2771();
			if (arg0.isMetaDown()) {
				Static148.anInt4093 = 2;
				Static146.anInt4045 = 2;
			} else {
				Static148.anInt4093 = 1;
				Static146.anInt4045 = 1;
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!cc", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static136.aClass10_1 != null) {
			Static108.anInt3192 = 0;
			Static94.anInt2915 = -1;
			Static129.anInt3683 = -1;
		}
	}

	@OriginalMember(owner = "client!cc", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static136.aClass10_1 != null) {
			Static108.anInt3192 = 0;
			Static94.anInt2915 = arg0.getX();
			Static129.anInt3683 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!cc", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static136.aClass10_1 != null) {
			Static108.anInt3192 = 0;
			Static94.anInt2915 = arg0.getX();
			Static129.anInt3683 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!cc", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static136.aClass10_1 != null) {
			Static108.anInt3192 = 0;
			Static146.anInt4045 = 0;
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!cc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static136.aClass10_1 != null) {
			Static146.anInt4045 = 0;
		}
	}

	@OriginalMember(owner = "client!cc", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}
}
