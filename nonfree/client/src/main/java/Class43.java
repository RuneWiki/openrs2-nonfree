import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public final class Class43 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!ke", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static23.aClass43_1 != null) {
			Static50.anInt2791 = 0;
		}
	}

	@OriginalMember(owner = "client!ke", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static23.aClass43_1 != null) {
			Static33.anInt1985 = 0;
			Static12.anInt318 = arg0.getX();
			Static98.anInt2321 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!ke", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static23.aClass43_1 != null) {
			Static33.anInt1985 = 0;
			Static12.anInt318 = arg0.getX();
			Static98.anInt2321 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!ke", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static23.aClass43_1 != null) {
			Static33.anInt1985 = 0;
			Static95.anInt2277 = arg0.getX();
			Static65.anInt1662 = arg0.getY();
			Static71.aLong60 = Static89.method1462();
			if (arg0.isMetaDown()) {
				Static35.anInt1113 = 2;
				Static50.anInt2791 = 2;
			} else {
				Static35.anInt1113 = 1;
				Static50.anInt2791 = 1;
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ke", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ke", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static23.aClass43_1 != null) {
			Static33.anInt1985 = 0;
			Static12.anInt318 = -1;
			Static98.anInt2321 = -1;
		}
	}

	@OriginalMember(owner = "client!ke", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static23.aClass43_1 != null) {
			Static33.anInt1985 = 0;
			Static50.anInt2791 = 0;
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ke", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static23.aClass43_1 != null) {
			Static33.anInt1985 = 0;
			Static12.anInt318 = arg0.getX();
			Static98.anInt2321 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!ke", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}
}
