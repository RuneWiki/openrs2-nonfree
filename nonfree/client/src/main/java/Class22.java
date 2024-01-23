import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public final class Class22 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!df", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static158.aClass22_1 != null) {
			Static153.anInt3175 = 0;
		}
	}

	@OriginalMember(owner = "client!df", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static158.aClass22_1 != null) {
			Static175.anInt3594 = 0;
			Static84.anInt1716 = -1;
			Static65.anInt4122 = -1;
		}
	}

	@OriginalMember(owner = "client!df", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static158.aClass22_1 != null) {
			Static175.anInt3594 = 0;
			Static12.anInt243 = arg0.getX();
			Static122.anInt2418 = arg0.getY();
			Static32.aLong28 = Static179.method2941();
			if (arg0.isMetaDown()) {
				Static192.anInt3940 = 2;
				Static153.anInt3175 = 2;
			} else {
				Static192.anInt3940 = 1;
				Static153.anInt3175 = 1;
			}
			@Pc(32) int local32 = arg0.getModifiers();
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!df", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static158.aClass22_1 != null) {
			Static175.anInt3594 = 0;
			Static153.anInt3175 = 0;
			@Pc(12) int local12 = arg0.getModifiers();
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!df", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!df", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static158.aClass22_1 != null) {
			Static175.anInt3594 = 0;
			Static84.anInt1716 = arg0.getX();
			Static65.anInt4122 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!df", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static158.aClass22_1 != null) {
			Static175.anInt3594 = 0;
			Static84.anInt1716 = arg0.getX();
			Static65.anInt4122 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!df", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!df", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static158.aClass22_1 != null) {
			Static175.anInt3594 = 0;
			Static84.anInt1716 = arg0.getX();
			Static65.anInt4122 = arg0.getY();
		}
	}
}
