import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public final class Class3 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!ab", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static54.aClass3_1 != null) {
			Static93.anInt2268 = 0;
			Static2.anInt1360 = arg0.getX();
			Static111.anInt2688 = arg0.getY();
			Static24.aLong20 = Static16.method286();
			if (arg0.isMetaDown()) {
				Static26.anInt729 = 2;
				Static56.anInt1432 = 2;
			} else {
				Static26.anInt729 = 1;
				Static56.anInt1432 = 1;
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ab", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!ab", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static54.aClass3_1 != null) {
			Static56.anInt1432 = 0;
		}
	}

	@OriginalMember(owner = "client!ab", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static54.aClass3_1 != null) {
			Static93.anInt2268 = 0;
			Static130.anInt3021 = arg0.getX();
			Static46.anInt1191 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!ab", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ab", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static54.aClass3_1 != null) {
			Static93.anInt2268 = 0;
			Static130.anInt3021 = arg0.getX();
			Static46.anInt1191 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!ab", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static54.aClass3_1 != null) {
			Static93.anInt2268 = 0;
			Static130.anInt3021 = -1;
			Static46.anInt1191 = -1;
		}
	}

	@OriginalMember(owner = "client!ab", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static54.aClass3_1 != null) {
			Static93.anInt2268 = 0;
			Static56.anInt1432 = 0;
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ab", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static54.aClass3_1 != null) {
			Static93.anInt2268 = 0;
			Static130.anInt3021 = arg0.getX();
			Static46.anInt1191 = arg0.getY();
		}
	}
}
