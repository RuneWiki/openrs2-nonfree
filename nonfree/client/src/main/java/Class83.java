import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public final class Class83 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!s", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static183.aClass83_1 != null) {
			Static121.anInt2653 = 0;
			Static180.anInt4017 = arg0.getX();
			Static20.anInt507 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!s", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static183.aClass83_1 != null) {
			Static121.anInt2653 = 0;
			Static180.anInt4017 = -1;
			Static20.anInt507 = -1;
		}
	}

	@OriginalMember(owner = "client!s", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static183.aClass83_1 != null) {
			Static83.anInt1745 = 0;
		}
	}

	@OriginalMember(owner = "client!s", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!s", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!s", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static183.aClass83_1 != null) {
			Static121.anInt2653 = 0;
			Static180.anInt4017 = arg0.getX();
			Static20.anInt507 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!s", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static183.aClass83_1 != null) {
			Static121.anInt2653 = 0;
			Static67.anInt1477 = arg0.getX();
			Static36.anInt823 = arg0.getY();
			Static42.aLong33 = Static86.method1251();
			if (arg0.isMetaDown()) {
				Static20.anInt502 = 2;
				Static83.anInt1745 = 2;
			} else {
				Static20.anInt502 = 1;
				Static83.anInt1745 = 1;
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!s", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static183.aClass83_1 != null) {
			Static121.anInt2653 = 0;
			Static83.anInt1745 = 0;
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!s", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static183.aClass83_1 != null) {
			Static121.anInt2653 = 0;
			Static180.anInt4017 = arg0.getX();
			Static20.anInt507 = arg0.getY();
		}
	}
}
