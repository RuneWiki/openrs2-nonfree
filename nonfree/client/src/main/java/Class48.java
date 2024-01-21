import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public final class Class48 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!lb", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!lb", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static45.aClass48_1 != null) {
			Static5.anInt74 = 0;
			Static81.anInt2191 = -1;
			Static126.anInt3098 = -1;
		}
	}

	@OriginalMember(owner = "client!lb", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static45.aClass48_1 != null) {
			Static80.anInt2144 = 0;
		}
	}

	@OriginalMember(owner = "client!lb", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static45.aClass48_1 != null) {
			Static5.anInt74 = 0;
			Static81.anInt2191 = arg0.getX();
			Static126.anInt3098 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!lb", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static45.aClass48_1 != null) {
			Static5.anInt74 = 0;
			Static60.anInt1763 = arg0.getX();
			Static102.anInt3221 = arg0.getY();
			Static104.aLong82 = Static38.method694();
			if (arg0.isMetaDown()) {
				Static30.anInt915 = 2;
				Static80.anInt2144 = 2;
			} else {
				Static30.anInt915 = 1;
				Static80.anInt2144 = 1;
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!lb", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!lb", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static45.aClass48_1 != null) {
			Static5.anInt74 = 0;
			Static81.anInt2191 = arg0.getX();
			Static126.anInt3098 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!lb", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static45.aClass48_1 != null) {
			Static5.anInt74 = 0;
			Static81.anInt2191 = arg0.getX();
			Static126.anInt3098 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!lb", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static45.aClass48_1 != null) {
			Static5.anInt74 = 0;
			Static80.anInt2144 = 0;
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}
}
