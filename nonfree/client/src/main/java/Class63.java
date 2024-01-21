import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public final class Class63 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!pb", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static121.aClass63_1 != null) {
			Static45.anInt1480 = 0;
			Static158.anInt4149 = 0;
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!pb", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static121.aClass63_1 != null) {
			Static158.anInt4149 = 0;
		}
	}

	@OriginalMember(owner = "client!pb", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static121.aClass63_1 != null) {
			Static45.anInt1480 = 0;
			Static54.anInt1754 = -1;
			Static101.anInt2866 = -1;
		}
	}

	@OriginalMember(owner = "client!pb", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static121.aClass63_1 != null) {
			Static45.anInt1480 = 0;
			Static54.anInt1754 = arg0.getX();
			Static101.anInt2866 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!pb", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!pb", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static121.aClass63_1 != null) {
			Static45.anInt1480 = 0;
			Static129.anInt4421 = arg0.getX();
			Static3.anInt173 = arg0.getY();
			Static82.aLong74 = Static143.method2807();
			if (arg0.isMetaDown()) {
				Static159.anInt4159 = 2;
				Static158.anInt4149 = 2;
			} else {
				Static159.anInt4159 = 1;
				Static158.anInt4149 = 1;
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!pb", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static121.aClass63_1 != null) {
			Static45.anInt1480 = 0;
			Static54.anInt1754 = arg0.getX();
			Static101.anInt2866 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!pb", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!pb", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static121.aClass63_1 != null) {
			Static45.anInt1480 = 0;
			Static54.anInt1754 = arg0.getX();
			Static101.anInt2866 = arg0.getY();
		}
	}
}
