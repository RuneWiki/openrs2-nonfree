import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public final class Class45 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!ld", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static71.aClass45_1 != null) {
			Static36.anInt1185 = 0;
			Static21.anInt918 = -1;
			Static73.anInt1934 = -1;
		}
	}

	@OriginalMember(owner = "client!ld", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static71.aClass45_1 != null) {
			Static36.anInt1185 = 0;
			Static21.anInt918 = arg0.getX();
			Static73.anInt1934 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!ld", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static71.aClass45_1 != null) {
			Static36.anInt1185 = 0;
			Static114.anInt2933 = 0;
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ld", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static71.aClass45_1 != null) {
			Static114.anInt2933 = 0;
		}
	}

	@OriginalMember(owner = "client!ld", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static71.aClass45_1 != null) {
			Static36.anInt1185 = 0;
			Static74.anInt1938 = arg0.getX();
			Static80.anInt2031 = arg0.getY();
			Static9.aLong18 = Static49.method877();
			if (arg0.isMetaDown()) {
				Static62.anInt1800 = 2;
				Static114.anInt2933 = 2;
			} else {
				Static62.anInt1800 = 1;
				Static114.anInt2933 = 1;
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ld", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static71.aClass45_1 != null) {
			Static36.anInt1185 = 0;
			Static21.anInt918 = arg0.getX();
			Static73.anInt1934 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!ld", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static71.aClass45_1 != null) {
			Static36.anInt1185 = 0;
			Static21.anInt918 = arg0.getX();
			Static73.anInt1934 = arg0.getY();
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
}
