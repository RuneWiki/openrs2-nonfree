import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ik")
public final class Class82 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!ik", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static89.aClass82_1 != null) {
			Static118.anInt2384 = 0;
			Static225.anInt4590 = arg0.getX();
			Static209.anInt4337 = arg0.getY();
			Static9.aLong4 = Static71.method1143();
			if (arg0.isMetaDown()) {
				Static22.anInt604 = 2;
				Static27.anInt669 = 2;
			} else {
				Static22.anInt604 = 1;
				Static27.anInt669 = 1;
			}
			@Pc(28) int local28 = arg0.getModifiers();
			if ((local28 & 0x8) == 0) {
			}
			if ((local28 & 0x4) != 0) {
			}
			if ((local28 & 0x10) != 0) {
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ik", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ik", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static89.aClass82_1 != null) {
			Static27.anInt669 = 0;
		}
	}

	@OriginalMember(owner = "client!ik", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static89.aClass82_1 != null) {
			Static118.anInt2384 = 0;
			Static61.anInt1337 = arg0.getX();
			Static240.anInt4800 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!ik", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static89.aClass82_1 != null) {
			Static118.anInt2384 = 0;
			Static61.anInt1337 = arg0.getX();
			Static240.anInt4800 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!ik", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static89.aClass82_1 != null) {
			Static118.anInt2384 = 0;
			Static61.anInt1337 = -1;
			Static240.anInt4800 = -1;
		}
	}

	@OriginalMember(owner = "client!ik", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static89.aClass82_1 != null) {
			Static118.anInt2384 = 0;
			Static61.anInt1337 = arg0.getX();
			Static240.anInt4800 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!ik", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static89.aClass82_1 != null) {
			Static118.anInt2384 = 0;
			Static27.anInt669 = 0;
			@Pc(9) int local9 = arg0.getModifiers();
			if ((local9 & 0x4) != 0) {
			}
			if ((local9 & 0x8) == 0) {
			}
			if ((local9 & 0x10) == 0) {
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ik", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}
}
