import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public final class Class36 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!ja", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static125.aClass36_1 != null) {
			Static118.anInt2651 = 0;
		}
	}

	@OriginalMember(owner = "client!ja", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static125.aClass36_1 != null) {
			Static128.anInt3022 = 0;
			Static82.anInt1970 = arg0.getX();
			Static29.anInt836 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!ja", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ja", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static125.aClass36_1 != null) {
			Static128.anInt3022 = 0;
			Static123.anInt2931 = arg0.getX();
			Static40.anInt975 = arg0.getY();
			Static123.aLong97 = Static27.method497();
			if (arg0.isMetaDown()) {
				Static103.anInt2370 = 2;
				Static118.anInt2651 = 2;
			} else {
				Static103.anInt2370 = 1;
				Static118.anInt2651 = 1;
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ja", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static125.aClass36_1 != null) {
			Static128.anInt3022 = 0;
			Static82.anInt1970 = arg0.getX();
			Static29.anInt836 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!ja", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static125.aClass36_1 != null) {
			Static128.anInt3022 = 0;
			Static82.anInt1970 = -1;
			Static29.anInt836 = -1;
		}
	}

	@OriginalMember(owner = "client!ja", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static125.aClass36_1 != null) {
			Static128.anInt3022 = 0;
			Static82.anInt1970 = arg0.getX();
			Static29.anInt836 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!ja", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!ja", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static125.aClass36_1 != null) {
			Static128.anInt3022 = 0;
			Static118.anInt2651 = 0;
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}
}
