import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public final class Class41 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!ee", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static125.aClass41_1 != null) {
			Static141.anInt2718 = 0;
			Static117.anInt2181 = arg0.getX();
			Static279.anInt5628 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!ee", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static125.aClass41_1 != null) {
			Static141.anInt2718 = 0;
			Static166.anInt3120 = 0;
			@Pc(8) int local8 = arg0.getModifiers();
			if ((local8 & 0x8) == 0) {
			}
			if ((local8 & 0x10) != 0) {
			}
			if ((local8 & 0x4) == 0) {
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ee", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!ee", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static125.aClass41_1 != null) {
			Static141.anInt2718 = 0;
			Static117.anInt2181 = -1;
			Static279.anInt5628 = -1;
		}
	}

	@OriginalMember(owner = "client!ee", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static125.aClass41_1 != null) {
			Static141.anInt2718 = 0;
			Static117.anInt2181 = arg0.getX();
			Static279.anInt5628 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!ee", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ee", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static125.aClass41_1 != null) {
			Static166.anInt3120 = 0;
		}
	}

	@OriginalMember(owner = "client!ee", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static125.aClass41_1 != null) {
			Static141.anInt2718 = 0;
			Static117.anInt2181 = arg0.getX();
			Static279.anInt5628 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!ee", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static125.aClass41_1 != null) {
			Static141.anInt2718 = 0;
			Static217.anInt4263 = arg0.getX();
			Static117.anInt2178 = arg0.getY();
			Static114.aLong244 = Static128.method2196();
			if (arg0.isMetaDown()) {
				Static213.anInt4156 = 2;
				Static166.anInt3120 = 2;
			} else {
				Static213.anInt4156 = 1;
				Static166.anInt3120 = 1;
			}
			@Pc(32) int local32 = arg0.getModifiers();
			if ((local32 & 0x8) != 0) {
			}
			if ((local32 & 0x10) != 0) {
			}
			if ((local32 & 0x4) == 0) {
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}
}
