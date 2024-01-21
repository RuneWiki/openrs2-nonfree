import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public final class Class19 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!fd", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static108.aClass19_1 != null) {
			Static35.anInt1184 = 0;
			Static36.anInt1208 = arg0.getX();
			Static98.anInt2772 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!fd", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static108.aClass19_1 != null) {
			Static35.anInt1184 = 0;
			Static36.anInt1208 = arg0.getX();
			Static98.anInt2772 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!fd", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static108.aClass19_1 != null) {
			Static46.anInt1371 = 0;
		}
	}

	@OriginalMember(owner = "client!fd", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!fd", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!fd", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static108.aClass19_1 != null) {
			Static35.anInt1184 = 0;
			Static36.anInt1208 = -1;
			Static98.anInt2772 = -1;
		}
	}

	@OriginalMember(owner = "client!fd", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static108.aClass19_1 != null) {
			Static35.anInt1184 = 0;
			Static46.anInt1371 = 0;
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!fd", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static108.aClass19_1 != null) {
			Static35.anInt1184 = 0;
			Static68.anInt2046 = arg0.getX();
			Static5.anInt247 = arg0.getY();
			Static62.aLong53 = Static76.method1306();
			if (arg0.isMetaDown()) {
				Static21.anInt2498 = 2;
				Static46.anInt1371 = 2;
			} else {
				Static21.anInt2498 = 1;
				Static46.anInt1371 = 1;
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!fd", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static108.aClass19_1 != null) {
			Static35.anInt1184 = 0;
			Static36.anInt1208 = arg0.getX();
			Static98.anInt2772 = arg0.getY();
		}
	}
}
