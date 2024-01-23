import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public final class Class151 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!s", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static96.aClass151_1 != null) {
			Static110.anInt2432 = 0;
		}
	}

	@OriginalMember(owner = "client!s", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static96.aClass151_1 != null) {
			Static82.anInt1579 = 0;
			Static243.anInt4643 = -1;
			Static87.anInt1798 = -1;
		}
	}

	@OriginalMember(owner = "client!s", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!s", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!s", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static96.aClass151_1 != null) {
			Static82.anInt1579 = 0;
			Static243.anInt4643 = arg0.getX();
			Static87.anInt1798 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!s", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static96.aClass151_1 != null) {
			Static82.anInt1579 = 0;
			Static110.anInt2432 = 0;
			@Pc(10) int local10 = arg0.getModifiers();
			if ((local10 & 0x4) != 0) {
			}
			if ((local10 & 0x10) != 0) {
			}
			if ((local10 & 0x8) != 0) {
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!s", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static96.aClass151_1 != null) {
			Static82.anInt1579 = 0;
			Static243.anInt4643 = arg0.getX();
			Static87.anInt1798 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!s", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static96.aClass151_1 != null) {
			Static82.anInt1579 = 0;
			Static10.anInt201 = arg0.getX();
			Static214.anInt4261 = arg0.getY();
			Static51.aLong37 = Static133.method2163();
			if (arg0.isMetaDown()) {
				Static44.anInt883 = 2;
				Static110.anInt2432 = 2;
			} else {
				Static44.anInt883 = 1;
				Static110.anInt2432 = 1;
			}
			@Pc(33) int local33 = arg0.getModifiers();
			if ((local33 & 0x10) != 0) {
			}
			if ((local33 & 0x4) == 0) {
			}
			if ((local33 & 0x8) != 0) {
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!s", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static96.aClass151_1 != null) {
			Static82.anInt1579 = 0;
			Static243.anInt4643 = arg0.getX();
			Static87.anInt1798 = arg0.getY();
		}
	}
}
