import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public final class Class65 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!rc", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static112.aClass65_1 != null) {
			Static126.anInt2863 = 0;
			Static31.anInt796 = -1;
			Static9.anInt292 = -1;
		}
	}

	@OriginalMember(owner = "client!rc", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static112.aClass65_1 != null) {
			Static126.anInt2863 = 0;
			Static31.anInt796 = arg0.getX();
			Static9.anInt292 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!rc", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static112.aClass65_1 != null) {
			Static126.anInt2863 = 0;
			Static31.anInt796 = arg0.getX();
			Static9.anInt292 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!rc", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static112.aClass65_1 != null) {
			Static126.anInt2863 = 0;
			Static31.anInt796 = arg0.getX();
			Static9.anInt292 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!rc", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static112.aClass65_1 != null) {
			Static126.anInt2863 = 0;
			Static109.anInt2395 = arg0.getX();
			Static90.anInt1904 = arg0.getY();
			Static88.aLong74 = Static10.method244();
			if (arg0.isMetaDown()) {
				Static16.anInt465 = 2;
				Static128.anInt2896 = 2;
			} else {
				Static16.anInt465 = 1;
				Static128.anInt2896 = 1;
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!rc", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!rc", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static112.aClass65_1 != null) {
			Static126.anInt2863 = 0;
			Static128.anInt2896 = 0;
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!rc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!rc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static112.aClass65_1 != null) {
			Static128.anInt2896 = 0;
		}
	}
}
