import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vk")
public final class Class185 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!vk", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static253.aClass185_1 != null) {
			Static245.anInt5017 = 0;
			Static252.anInt5112 = 0;
			@Pc(8) int local8 = arg0.getModifiers();
			if ((local8 & 0x10) != 0) {
			}
			if ((local8 & 0x4) != 0) {
			}
			if ((local8 & 0x8) == 0) {
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!vk", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static253.aClass185_1 != null) {
			Static245.anInt5017 = 0;
			Static199.anInt6293 = -1;
			Static157.anInt3508 = -1;
		}
	}

	@OriginalMember(owner = "client!vk", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static253.aClass185_1 != null) {
			Static252.anInt5112 = 0;
		}
	}

	@OriginalMember(owner = "client!vk", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static253.aClass185_1 != null) {
			Static245.anInt5017 = 0;
			Static199.anInt6293 = arg0.getX();
			Static157.anInt3508 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!vk", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!vk", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static253.aClass185_1 != null) {
			Static245.anInt5017 = 0;
			Static199.anInt6293 = arg0.getX();
			Static157.anInt3508 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!vk", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static253.aClass185_1 != null) {
			Static245.anInt5017 = 0;
			Static132.anInt3052 = arg0.getX();
			Static109.anInt2412 = arg0.getY();
			Static280.aLong217 = Static258.method3967();
			if (arg0.isMetaDown()) {
				Static131.anInt3039 = 2;
				Static252.anInt5112 = 2;
			} else {
				Static131.anInt3039 = 1;
				Static252.anInt5112 = 1;
			}
			@Pc(33) int local33 = arg0.getModifiers();
			if ((local33 & 0x10) == 0) {
			}
			if ((local33 & 0x8) != 0) {
			}
			if ((local33 & 0x4) == 0) {
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!vk", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!vk", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static253.aClass185_1 != null) {
			Static245.anInt5017 = 0;
			Static199.anInt6293 = arg0.getX();
			Static157.anInt3508 = arg0.getY();
		}
	}
}
