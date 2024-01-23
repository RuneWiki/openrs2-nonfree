import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nf")
public final class Class126 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!nf", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static60.aClass126_1 != null) {
			Static216.anInt4215 = 0;
			Static261.anInt4978 = arg0.getX();
			Static240.anInt4557 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!nf", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!nf", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!nf", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static60.aClass126_1 != null) {
			Static216.anInt4215 = 0;
			Static261.anInt4978 = -1;
			Static240.anInt4557 = -1;
		}
	}

	@OriginalMember(owner = "client!nf", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static60.aClass126_1 != null) {
			Static216.anInt4215 = 0;
			Static67.anInt1306 = 0;
			@Pc(9) int local9 = arg0.getModifiers();
			if ((local9 & 0x8) != 0) {
			}
			if ((local9 & 0x4) != 0) {
			}
			if ((local9 & 0x10) != 0) {
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!nf", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static60.aClass126_1 != null) {
			Static216.anInt4215 = 0;
			Static261.anInt4978 = arg0.getX();
			Static240.anInt4557 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!nf", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static60.aClass126_1 != null) {
			Static67.anInt1306 = 0;
		}
	}

	@OriginalMember(owner = "client!nf", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static60.aClass126_1 != null) {
			Static216.anInt4215 = 0;
			Static313.anInt6053 = arg0.getX();
			Static123.anInt2426 = arg0.getY();
			Static300.aLong198 = Static101.method1677();
			if (arg0.isMetaDown()) {
				Static302.anInt5683 = 2;
				Static67.anInt1306 = 2;
			} else {
				Static302.anInt5683 = 1;
				Static67.anInt1306 = 1;
			}
			@Pc(32) int local32 = arg0.getModifiers();
			if ((local32 & 0x10) == 0) {
			}
			if ((local32 & 0x8) != 0) {
			}
			if ((local32 & 0x4) == 0) {
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!nf", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static60.aClass126_1 != null) {
			Static216.anInt4215 = 0;
			Static261.anInt4978 = arg0.getX();
			Static240.anInt4557 = arg0.getY();
		}
	}
}
