import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ug")
public final class Class177 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!ug", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!ug", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static56.aClass177_1 != null) {
			Static155.anInt3470 = 0;
			Static53.anInt1321 = 0;
			@Pc(10) int local10 = arg0.getModifiers();
			if ((local10 & 0x10) != 0) {
			}
			if ((local10 & 0x4) != 0) {
			}
			if ((local10 & 0x8) != 0) {
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ug", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static56.aClass177_1 != null) {
			Static155.anInt3470 = 0;
			Static175.anInt3854 = -1;
			Static9.anInt3021 = -1;
		}
	}

	@OriginalMember(owner = "client!ug", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static56.aClass177_1 != null) {
			Static155.anInt3470 = 0;
			Static175.anInt3854 = arg0.getX();
			Static9.anInt3021 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!ug", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static56.aClass177_1 != null) {
			Static53.anInt1321 = 0;
		}
	}

	@OriginalMember(owner = "client!ug", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static56.aClass177_1 != null) {
			Static155.anInt3470 = 0;
			Static175.anInt3854 = arg0.getX();
			Static9.anInt3021 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!ug", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ug", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static56.aClass177_1 != null) {
			Static155.anInt3470 = 0;
			Static175.anInt3854 = arg0.getX();
			Static9.anInt3021 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!ug", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static56.aClass177_1 != null) {
			Static155.anInt3470 = 0;
			Static247.anInt1732 = arg0.getX();
			Static2.anInt65 = arg0.getY();
			Static229.aLong173 = Static221.method3670();
			if (arg0.isMetaDown()) {
				Static12.anInt248 = 2;
				Static53.anInt1321 = 2;
			} else {
				Static12.anInt248 = 1;
				Static53.anInt1321 = 1;
			}
			@Pc(33) int local33 = arg0.getModifiers();
			if ((local33 & 0x8) == 0) {
			}
			if ((local33 & 0x10) == 0) {
			}
			if ((local33 & 0x4) != 0) {
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}
}
