import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bg")
public final class Class13 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!bg", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static184.aClass13_1 != null) {
			Static112.anInt5355 = 0;
			Static276.anInt5076 = arg0.getX();
			Static24.anInt491 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!bg", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!bg", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static184.aClass13_1 != null) {
			Static112.anInt5355 = 0;
			Static241.anInt4478 = 0;
			@Pc(14) int local14 = arg0.getModifiers();
			if ((local14 & 0x8) == 0) {
			}
			if ((local14 & 0x10) != 0) {
			}
			if ((local14 & 0x4) != 0) {
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!bg", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!bg", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static184.aClass13_1 != null) {
			Static241.anInt4478 = 0;
		}
	}

	@OriginalMember(owner = "client!bg", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static184.aClass13_1 != null) {
			Static112.anInt5355 = 0;
			Static276.anInt5076 = -1;
			Static24.anInt491 = -1;
		}
	}

	@OriginalMember(owner = "client!bg", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static184.aClass13_1 != null) {
			Static112.anInt5355 = 0;
			Static269.anInt4964 = arg0.getX();
			Static178.anInt3546 = arg0.getY();
			Static267.aLong191 = Static244.method3859();
			if (arg0.isMetaDown()) {
				Static56.anInt1205 = 2;
				Static241.anInt4478 = 2;
			} else {
				Static56.anInt1205 = 1;
				Static241.anInt4478 = 1;
			}
			@Pc(29) int local29 = arg0.getModifiers();
			if ((local29 & 0x8) != 0) {
			}
			if ((local29 & 0x4) != 0) {
			}
			if ((local29 & 0x10) != 0) {
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!bg", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static184.aClass13_1 != null) {
			Static112.anInt5355 = 0;
			Static276.anInt5076 = arg0.getX();
			Static24.anInt491 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!bg", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static184.aClass13_1 != null) {
			Static112.anInt5355 = 0;
			Static276.anInt5076 = arg0.getX();
			Static24.anInt491 = arg0.getY();
		}
	}
}
