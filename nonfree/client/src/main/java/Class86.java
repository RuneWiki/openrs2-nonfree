import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public final class Class86 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!wc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!wc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static142.aClass86_1 != null) {
			Static130.anInt2897 = 0;
		}
	}

	@OriginalMember(owner = "client!wc", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!wc", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static142.aClass86_1 != null) {
			Static56.anInt1431 = 0;
			Static158.anInt3381 = -1;
			Static121.anInt2746 = -1;
		}
	}

	@OriginalMember(owner = "client!wc", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static142.aClass86_1 != null) {
			Static56.anInt1431 = 0;
			Static65.anInt1586 = arg0.getX();
			Static15.anInt409 = arg0.getY();
			Static60.aLong52 = Static29.method615();
			if (arg0.isMetaDown()) {
				Static139.anInt3077 = 2;
				Static130.anInt2897 = 2;
			} else {
				Static139.anInt3077 = 1;
				Static130.anInt2897 = 1;
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!wc", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static142.aClass86_1 != null) {
			Static56.anInt1431 = 0;
			Static158.anInt3381 = arg0.getX();
			Static121.anInt2746 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!wc", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static142.aClass86_1 != null) {
			Static56.anInt1431 = 0;
			Static158.anInt3381 = arg0.getX();
			Static121.anInt2746 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!wc", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static142.aClass86_1 != null) {
			Static56.anInt1431 = 0;
			Static158.anInt3381 = arg0.getX();
			Static121.anInt2746 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!wc", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static142.aClass86_1 != null) {
			Static56.anInt1431 = 0;
			Static130.anInt2897 = 0;
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}
}
