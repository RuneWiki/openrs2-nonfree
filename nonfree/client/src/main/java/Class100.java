import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class100 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!uc", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static206.aClass100_1 != null) {
			Static172.anInt3534 = 0;
			Static166.anInt3424 = arg0.getX();
			Static46.anInt1117 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!uc", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static206.aClass100_1 != null) {
			Static172.anInt3534 = 0;
			Static196.anInt3888 = arg0.getX();
			Static146.anInt3030 = arg0.getY();
			Static175.aLong123 = Static68.method1276();
			if (arg0.isMetaDown()) {
				Static176.anInt3605 = 2;
				Static6.anInt107 = 2;
			} else {
				Static176.anInt3605 = 1;
				Static6.anInt107 = 1;
			}
			@Pc(32) int local32 = arg0.getModifiers();
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!uc", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static206.aClass100_1 != null) {
			Static172.anInt3534 = 0;
			Static166.anInt3424 = -1;
			Static46.anInt1117 = -1;
		}
	}

	@OriginalMember(owner = "client!uc", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static206.aClass100_1 != null) {
			Static172.anInt3534 = 0;
			Static6.anInt107 = 0;
			@Pc(12) int local12 = arg0.getModifiers();
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!uc", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static206.aClass100_1 != null) {
			Static172.anInt3534 = 0;
			Static166.anInt3424 = arg0.getX();
			Static46.anInt1117 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!uc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!uc", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static206.aClass100_1 != null) {
			Static172.anInt3534 = 0;
			Static166.anInt3424 = arg0.getX();
			Static46.anInt1117 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!uc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static206.aClass100_1 != null) {
			Static6.anInt107 = 0;
		}
	}

	@OriginalMember(owner = "client!uc", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}
}
