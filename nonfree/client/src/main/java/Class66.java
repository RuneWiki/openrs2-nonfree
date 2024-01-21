import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public final class Class66 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!rb", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!rb", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static62.aClass66_1 != null) {
			Static42.anInt1070 = 0;
			Static128.anInt3141 = arg0.getX();
			Static9.anInt290 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!rb", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static62.aClass66_1 != null) {
			Static42.anInt1070 = 0;
			Static128.anInt3141 = arg0.getX();
			Static9.anInt290 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!rb", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static62.aClass66_1 != null) {
			Static42.anInt1070 = 0;
			Static128.anInt3141 = arg0.getX();
			Static9.anInt290 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!rb", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static62.aClass66_1 != null) {
			Static42.anInt1070 = 0;
			Static128.anInt3141 = -1;
			Static9.anInt290 = -1;
		}
	}

	@OriginalMember(owner = "client!rb", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!rb", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static62.aClass66_1 != null) {
			Static71.anInt1739 = 0;
		}
	}

	@OriginalMember(owner = "client!rb", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static62.aClass66_1 != null) {
			Static42.anInt1070 = 0;
			Static63.anInt1642 = arg0.getX();
			Static13.anInt356 = arg0.getY();
			Static131.aLong158 = Static23.method431();
			if (arg0.isMetaDown()) {
				Static27.anInt738 = 2;
				Static71.anInt1739 = 2;
			} else {
				Static27.anInt738 = 1;
				Static71.anInt1739 = 1;
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!rb", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static62.aClass66_1 != null) {
			Static42.anInt1070 = 0;
			Static71.anInt1739 = 0;
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}
}
