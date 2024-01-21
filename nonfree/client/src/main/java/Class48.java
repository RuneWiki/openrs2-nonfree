import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public final class Class48 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!md", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static41.aClass48_1 != null) {
			Static95.anInt2293 = 0;
			Static66.anInt1653 = arg0.getX();
			Static108.anInt2616 = arg0.getY();
			Static110.aLong102 = Static50.method959();
			if (arg0.isMetaDown()) {
				Static17.anInt613 = 2;
				Static9.anInt291 = 2;
			} else {
				Static17.anInt613 = 1;
				Static9.anInt291 = 1;
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!md", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static41.aClass48_1 != null) {
			Static95.anInt2293 = 0;
			Static93.anInt2251 = arg0.getX();
			Static66.anInt1649 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!md", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static41.aClass48_1 != null) {
			Static9.anInt291 = 0;
		}
	}

	@OriginalMember(owner = "client!md", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!md", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static41.aClass48_1 != null) {
			Static95.anInt2293 = 0;
			Static93.anInt2251 = -1;
			Static66.anInt1649 = -1;
		}
	}

	@OriginalMember(owner = "client!md", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static41.aClass48_1 != null) {
			Static95.anInt2293 = 0;
			Static9.anInt291 = 0;
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!md", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static41.aClass48_1 != null) {
			Static95.anInt2293 = 0;
			Static93.anInt2251 = arg0.getX();
			Static66.anInt1649 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!md", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static41.aClass48_1 != null) {
			Static95.anInt2293 = 0;
			Static93.anInt2251 = arg0.getX();
			Static66.anInt1649 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!md", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}
}
