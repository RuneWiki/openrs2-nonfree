import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public final class Class8 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!bi", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static157.aClass8_1 != null) {
			Static116.anInt2613 = 0;
			Static42.anInt1067 = arg0.getX();
			Static154.anInt3513 = arg0.getY();
			Static50.aLong40 = Static23.method507();
			if (arg0.isMetaDown()) {
				Static148.anInt3297 = 2;
				Static71.anInt1723 = 2;
			} else {
				Static148.anInt3297 = 1;
				Static71.anInt1723 = 1;
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!bi", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static157.aClass8_1 != null) {
			Static71.anInt1723 = 0;
		}
	}

	@OriginalMember(owner = "client!bi", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static157.aClass8_1 != null) {
			Static116.anInt2613 = 0;
			Static152.anInt3451 = arg0.getX();
			Static96.anInt2114 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!bi", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!bi", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static157.aClass8_1 != null) {
			Static116.anInt2613 = 0;
			Static152.anInt3451 = arg0.getX();
			Static96.anInt2114 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!bi", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!bi", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static157.aClass8_1 != null) {
			Static116.anInt2613 = 0;
			Static71.anInt1723 = 0;
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!bi", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static157.aClass8_1 != null) {
			Static116.anInt2613 = 0;
			Static152.anInt3451 = -1;
			Static96.anInt2114 = -1;
		}
	}

	@OriginalMember(owner = "client!bi", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static157.aClass8_1 != null) {
			Static116.anInt2613 = 0;
			Static152.anInt3451 = arg0.getX();
			Static96.anInt2114 = arg0.getY();
		}
	}
}
