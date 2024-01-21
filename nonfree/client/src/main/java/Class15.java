import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class15 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!cc", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static30.aClass15_1 != null) {
			Static82.anInt1814 = 0;
			Static153.anInt3128 = arg0.getX();
			Static132.anInt3730 = arg0.getY();
			Static214.aLong247 = Static188.method2822();
			if (arg0.isMetaDown()) {
				Static113.anInt2375 = 2;
				Static40.anInt846 = 2;
			} else {
				Static113.anInt2375 = 1;
				Static40.anInt846 = 1;
			}
			@Pc(28) int local28 = arg0.getModifiers();
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!cc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static30.aClass15_1 != null) {
			Static40.anInt846 = 0;
		}
	}

	@OriginalMember(owner = "client!cc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!cc", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!cc", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static30.aClass15_1 != null) {
			Static82.anInt1814 = 0;
			Static199.anInt3916 = arg0.getX();
			Static195.anInt3810 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!cc", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static30.aClass15_1 != null) {
			Static82.anInt1814 = 0;
			Static199.anInt3916 = arg0.getX();
			Static195.anInt3810 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!cc", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static30.aClass15_1 != null) {
			Static82.anInt1814 = 0;
			Static40.anInt846 = 0;
			@Pc(12) int local12 = arg0.getModifiers();
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!cc", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static30.aClass15_1 != null) {
			Static82.anInt1814 = 0;
			Static199.anInt3916 = arg0.getX();
			Static195.anInt3810 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!cc", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static30.aClass15_1 != null) {
			Static82.anInt1814 = 0;
			Static199.anInt3916 = -1;
			Static195.anInt3810 = -1;
		}
	}
}
