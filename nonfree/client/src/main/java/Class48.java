import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fa")
public final class Class48 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!fa", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static291.aClass48_1 != null) {
			Static201.anInt4016 = 0;
			Static286.anInt5587 = 0;
			@Pc(8) int local8 = arg0.getModifiers();
			if ((local8 & 0x10) != 0) {
			}
			if ((local8 & 0x8) == 0) {
			}
			if ((local8 & 0x4) == 0) {
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!fa", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static291.aClass48_1 != null) {
			Static286.anInt5587 = 0;
		}
	}

	@OriginalMember(owner = "client!fa", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static291.aClass48_1 != null) {
			Static201.anInt4016 = 0;
			Static121.anInt2459 = arg0.getX();
			Static21.anInt449 = arg0.getY();
			Static2.aLong1 = Static61.method1150();
			if (arg0.isMetaDown()) {
				Static31.anInt652 = 2;
				Static286.anInt5587 = 2;
			} else {
				Static31.anInt652 = 1;
				Static286.anInt5587 = 1;
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

	@OriginalMember(owner = "client!fa", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static291.aClass48_1 != null) {
			Static201.anInt4016 = 0;
			Static69.anInt1422 = arg0.getX();
			Static237.anInt4723 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!fa", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static291.aClass48_1 != null) {
			Static201.anInt4016 = 0;
			Static69.anInt1422 = arg0.getX();
			Static237.anInt4723 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!fa", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static291.aClass48_1 != null) {
			Static201.anInt4016 = 0;
			Static69.anInt1422 = arg0.getX();
			Static237.anInt4723 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!fa", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!fa", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static291.aClass48_1 != null) {
			Static201.anInt4016 = 0;
			Static69.anInt1422 = -1;
			Static237.anInt4723 = -1;
		}
	}

	@OriginalMember(owner = "client!fa", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}
}
