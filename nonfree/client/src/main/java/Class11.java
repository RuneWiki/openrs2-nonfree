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
public final class Class11 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!be", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static39.aClass11_1 != null) {
			Static168.anInt3891 = 0;
			Static42.anInt241 = arg0.getX();
			Static124.anInt2949 = arg0.getY();
			Static165.aLong121 = Static182.method2903();
			if (arg0.isMetaDown()) {
				Static143.anInt3268 = 2;
				Static42.anInt217 = 2;
			} else {
				Static143.anInt3268 = 1;
				Static42.anInt217 = 1;
			}
			@Pc(28) int local28 = arg0.getModifiers();
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!be", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static39.aClass11_1 != null) {
			Static42.anInt217 = 0;
		}
	}

	@OriginalMember(owner = "client!be", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static39.aClass11_1 != null) {
			Static168.anInt3891 = 0;
			Static206.anInt4608 = arg0.getX();
			Static152.anInt3540 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!be", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static39.aClass11_1 != null) {
			Static168.anInt3891 = 0;
			Static206.anInt4608 = arg0.getX();
			Static152.anInt3540 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!be", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static39.aClass11_1 != null) {
			Static168.anInt3891 = 0;
			Static206.anInt4608 = arg0.getX();
			Static152.anInt3540 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!be", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!be", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static39.aClass11_1 != null) {
			Static168.anInt3891 = 0;
			Static206.anInt4608 = -1;
			Static152.anInt3540 = -1;
		}
	}

	@OriginalMember(owner = "client!be", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!be", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static39.aClass11_1 != null) {
			Static168.anInt3891 = 0;
			Static42.anInt217 = 0;
			@Pc(12) int local12 = arg0.getModifiers();
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}
}
