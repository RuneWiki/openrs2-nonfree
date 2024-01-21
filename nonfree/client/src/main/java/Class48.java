import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public final class Class48 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!ld", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static139.aClass48_3 != null) {
			Static134.anInt3415 = 0;
			Static104.anInt2690 = arg0.getX();
			Static72.anInt2141 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!ld", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static139.aClass48_3 != null) {
			Static26.anInt713 = 0;
		}
	}

	@OriginalMember(owner = "client!ld", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static139.aClass48_3 != null) {
			Static134.anInt3415 = 0;
			Static104.anInt2690 = -1;
			Static72.anInt2141 = -1;
		}
	}

	@OriginalMember(owner = "client!ld", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static139.aClass48_3 != null) {
			Static134.anInt3415 = 0;
			Static104.anInt2690 = arg0.getX();
			Static72.anInt2141 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!ld", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!ld", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ld", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static139.aClass48_3 != null) {
			Static134.anInt3415 = 0;
			Static104.anInt2690 = arg0.getX();
			Static72.anInt2141 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!ld", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static139.aClass48_3 != null) {
			Static134.anInt3415 = 0;
			Static122.anInt3149 = arg0.getX();
			Static73.anInt2179 = arg0.getY();
			Static86.aLong82 = Static176.method3161();
			if (arg0.isMetaDown()) {
				Static153.anInt3782 = 2;
				Static26.anInt713 = 2;
			} else {
				Static153.anInt3782 = 1;
				Static26.anInt713 = 1;
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ld", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static139.aClass48_3 != null) {
			Static134.anInt3415 = 0;
			Static26.anInt713 = 0;
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}
}
