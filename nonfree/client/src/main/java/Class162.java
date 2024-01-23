import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class162 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!td", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static19.aClass162_1 != null) {
			Static185.anInt3926 = 0;
			Static297.anInt6210 = arg0.getX();
			Static176.anInt3782 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!td", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static19.aClass162_1 != null) {
			Static185.anInt3926 = 0;
			Static81.anInt1782 = arg0.getX();
			Static229.anInt5467 = arg0.getY();
			Static155.aLong316 = Static6.method126();
			if (arg0.isMetaDown()) {
				Static63.anInt1423 = 2;
				Static166.anInt3486 = 2;
			} else {
				Static63.anInt1423 = 1;
				Static166.anInt3486 = 1;
			}
			@Pc(34) int local34 = arg0.getModifiers();
			if ((local34 & 0x4) == 0) {
			}
			if ((local34 & 0x8) != 0) {
			}
			if ((local34 & 0x10) == 0) {
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!td", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!td", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static19.aClass162_1 != null) {
			Static185.anInt3926 = 0;
			Static166.anInt3486 = 0;
			@Pc(13) int local13 = arg0.getModifiers();
			if ((local13 & 0x8) != 0) {
			}
			if ((local13 & 0x4) != 0) {
			}
			if ((local13 & 0x10) == 0) {
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!td", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!td", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static19.aClass162_1 != null) {
			Static185.anInt3926 = 0;
			Static297.anInt6210 = arg0.getX();
			Static176.anInt3782 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!td", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static19.aClass162_1 != null) {
			Static166.anInt3486 = 0;
		}
	}

	@OriginalMember(owner = "client!td", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static19.aClass162_1 != null) {
			Static185.anInt3926 = 0;
			Static297.anInt6210 = arg0.getX();
			Static176.anInt3782 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!td", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static19.aClass162_1 != null) {
			Static185.anInt3926 = 0;
			Static297.anInt6210 = -1;
			Static176.anInt3782 = -1;
		}
	}
}
