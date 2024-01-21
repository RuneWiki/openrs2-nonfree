import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class12 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!be", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static63.aClass12_1 != null) {
			Static186.anInt3869 = 0;
			Static74.anInt1523 = 0;
			@Pc(8) int local8 = arg0.getModifiers();
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!be", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static63.aClass12_1 != null) {
			Static186.anInt3869 = 0;
			Static77.anInt3596 = arg0.getX();
			Static59.anInt1232 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!be", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!be", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static63.aClass12_1 != null) {
			Static186.anInt3869 = 0;
			Static77.anInt3596 = arg0.getX();
			Static59.anInt1232 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!be", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!be", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static63.aClass12_1 != null) {
			Static186.anInt3869 = 0;
			Static88.anInt1834 = arg0.getX();
			Static14.anInt337 = arg0.getY();
			Static118.aLong88 = Static104.method1634();
			if (arg0.isMetaDown()) {
				Static69.anInt1431 = 2;
				Static74.anInt1523 = 2;
			} else {
				Static69.anInt1431 = 1;
				Static74.anInt1523 = 1;
			}
			@Pc(32) int local32 = arg0.getModifiers();
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!be", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static63.aClass12_1 != null) {
			Static186.anInt3869 = 0;
			Static77.anInt3596 = arg0.getX();
			Static59.anInt1232 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!be", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static63.aClass12_1 != null) {
			Static74.anInt1523 = 0;
		}
	}

	@OriginalMember(owner = "client!be", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static63.aClass12_1 != null) {
			Static186.anInt3869 = 0;
			Static77.anInt3596 = -1;
			Static59.anInt1232 = -1;
		}
	}
}
