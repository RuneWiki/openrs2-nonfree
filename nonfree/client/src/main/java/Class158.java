import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ue")
public final class Class158 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!ue", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static191.aClass158_1 != null) {
			Static99.anInt2208 = 0;
			Static243.anInt5328 = arg0.getX();
			Static130.anInt2889 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!ue", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static191.aClass158_1 != null) {
			Static99.anInt2208 = 0;
			Static243.anInt5328 = arg0.getX();
			Static130.anInt2889 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!ue", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static191.aClass158_1 != null) {
			Static99.anInt2208 = 0;
			Static196.anInt4436 = arg0.getX();
			Static83.anInt1983 = arg0.getY();
			Static19.aLong31 = Static294.method4792();
			if (arg0.isMetaDown()) {
				Static78.anInt1882 = 2;
				Static235.anInt5162 = 2;
			} else {
				Static78.anInt1882 = 1;
				Static235.anInt5162 = 1;
			}
			@Pc(29) int local29 = arg0.getModifiers();
			if ((local29 & 0x10) == 0) {
			}
			if ((local29 & 0x8) != 0) {
			}
			if ((local29 & 0x4) != 0) {
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ue", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static191.aClass158_1 != null) {
			Static99.anInt2208 = 0;
			Static243.anInt5328 = arg0.getX();
			Static130.anInt2889 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!ue", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static191.aClass158_1 != null) {
			Static99.anInt2208 = 0;
			Static243.anInt5328 = -1;
			Static130.anInt2889 = -1;
		}
	}

	@OriginalMember(owner = "client!ue", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!ue", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ue", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static191.aClass158_1 != null) {
			Static99.anInt2208 = 0;
			Static235.anInt5162 = 0;
			@Pc(9) int local9 = arg0.getModifiers();
			if ((local9 & 0x4) == 0) {
			}
			if ((local9 & 0x10) != 0) {
			}
			if ((local9 & 0x8) == 0) {
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ue", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static191.aClass158_1 != null) {
			Static235.anInt5162 = 0;
		}
	}
}
