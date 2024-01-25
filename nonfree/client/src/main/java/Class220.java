import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wr")
public final class Class220 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!wr", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static112.aClass220_1 != null) {
			Static134.anInt2646 = 0;
			Static256.anInt5258 = -1;
			Static346.anInt6679 = -1;
		}
	}

	@OriginalMember(owner = "client!wr", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!wr", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static112.aClass220_1 != null) {
			Static140.anInt2707 = 0;
		}
	}

	@OriginalMember(owner = "client!wr", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static112.aClass220_1 != null) {
			Static134.anInt2646 = 0;
			Static256.anInt5258 = arg0.getX();
			Static346.anInt6679 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!wr", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static112.aClass220_1 != null) {
			Static134.anInt2646 = 0;
			Static140.anInt2707 = 0;
			@Pc(8) int local8 = arg0.getModifiers();
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!wr", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static112.aClass220_1 != null) {
			Static134.anInt2646 = 0;
			Static28.anInt530 = arg0.getX();
			Static48.anInt1210 = arg0.getY();
			Static151.aLong75 = Static292.method5114();
			if (arg0.isMetaDown()) {
				Static298.anInt6015 = 2;
				Static140.anInt2707 = 2;
			} else {
				Static298.anInt6015 = 1;
				Static140.anInt2707 = 1;
			}
			@Pc(28) int local28 = arg0.getModifiers();
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!wr", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static112.aClass220_1 != null) {
			Static134.anInt2646 = 0;
			Static256.anInt5258 = arg0.getX();
			Static346.anInt6679 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!wr", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static112.aClass220_1 != null) {
			Static134.anInt2646 = 0;
			Static256.anInt5258 = arg0.getX();
			Static346.anInt6679 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!wr", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}
}
