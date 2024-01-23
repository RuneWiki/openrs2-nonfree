import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class112 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!md", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static179.aClass112_1 != null) {
			Static113.anInt2117 = 0;
			Static192.anInt5397 = arg0.getX();
			Static20.anInt461 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!md", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static179.aClass112_1 != null) {
			Static113.anInt2117 = 0;
			Static155.anInt2871 = 0;
			@Pc(10) int local10 = arg0.getModifiers();
			if ((local10 & 0x4) == 0) {
			}
			if ((local10 & 0x8) == 0) {
			}
			if ((local10 & 0x10) == 0) {
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!md", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static179.aClass112_1 != null) {
			Static113.anInt2117 = 0;
			Static192.anInt5397 = arg0.getX();
			Static20.anInt461 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!md", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static179.aClass112_1 != null) {
			Static113.anInt2117 = 0;
			Static192.anInt5397 = arg0.getX();
			Static20.anInt461 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!md", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!md", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static179.aClass112_1 != null) {
			Static155.anInt2871 = 0;
		}
	}

	@OriginalMember(owner = "client!md", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static179.aClass112_1 != null) {
			Static113.anInt2117 = 0;
			Static192.anInt5397 = -1;
			Static20.anInt461 = -1;
		}
	}

	@OriginalMember(owner = "client!md", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!md", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static179.aClass112_1 != null) {
			Static113.anInt2117 = 0;
			Static289.anInt5736 = arg0.getX();
			Static251.anInt5124 = arg0.getY();
			Static287.aLong189 = Static252.method3964();
			if (arg0.isMetaDown()) {
				Static94.anInt1785 = 2;
				Static155.anInt2871 = 2;
			} else {
				Static94.anInt1785 = 1;
				Static155.anInt2871 = 1;
			}
			@Pc(29) int local29 = arg0.getModifiers();
			if ((local29 & 0x8) != 0) {
			}
			if ((local29 & 0x10) == 0) {
			}
			if ((local29 & 0x4) == 0) {
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}
}
