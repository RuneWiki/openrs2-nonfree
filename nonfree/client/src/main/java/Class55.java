import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public final class Class55 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!pc", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static92.aClass55_1 != null) {
			Static92.anInt2149 = 0;
			Static57.anInt1523 = 0;
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!pc", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static92.aClass55_1 != null) {
			Static92.anInt2149 = 0;
			Static10.anInt212 = arg0.getX();
			Static98.anInt2267 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!pc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static92.aClass55_1 != null) {
			Static57.anInt1523 = 0;
		}
	}

	@OriginalMember(owner = "client!pc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!pc", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static92.aClass55_1 != null) {
			Static92.anInt2149 = 0;
			Static10.anInt212 = -1;
			Static98.anInt2267 = -1;
		}
	}

	@OriginalMember(owner = "client!pc", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static92.aClass55_1 != null) {
			Static92.anInt2149 = 0;
			Static10.anInt212 = arg0.getX();
			Static98.anInt2267 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!pc", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!pc", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static92.aClass55_1 != null) {
			Static92.anInt2149 = 0;
			Static10.anInt212 = arg0.getX();
			Static98.anInt2267 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!pc", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static92.aClass55_1 != null) {
			Static92.anInt2149 = 0;
			Static42.anInt1165 = arg0.getX();
			Static124.anInt2717 = arg0.getY();
			Static23.aLong22 = Static42.method793();
			if (arg0.isMetaDown()) {
				Static114.anInt2471 = 2;
				Static57.anInt1523 = 2;
			} else {
				Static114.anInt2471 = 1;
				Static57.anInt1523 = 1;
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}
}
