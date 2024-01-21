import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public final class Class41 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!kb", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static31.aClass41_1 != null) {
			Static42.anInt1322 = 0;
			Static31.anInt1030 = -1;
			Static110.anInt3043 = -1;
		}
	}

	@OriginalMember(owner = "client!kb", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static31.aClass41_1 != null) {
			Static42.anInt1322 = 0;
			Static29.anInt942 = arg0.getX();
			Static46.anInt1444 = arg0.getY();
			Static73.aLong50 = Static89.method1607();
			if (arg0.isMetaDown()) {
				Static31.anInt1029 = 2;
				Static24.anInt829 = 2;
			} else {
				Static31.anInt1029 = 1;
				Static24.anInt829 = 1;
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!kb", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static31.aClass41_1 != null) {
			Static42.anInt1322 = 0;
			Static31.anInt1030 = arg0.getX();
			Static110.anInt3043 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!kb", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static31.aClass41_1 != null) {
			Static42.anInt1322 = 0;
			Static31.anInt1030 = arg0.getX();
			Static110.anInt3043 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!kb", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!kb", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static31.aClass41_1 != null) {
			Static42.anInt1322 = 0;
			Static24.anInt829 = 0;
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!kb", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static31.aClass41_1 != null) {
			Static42.anInt1322 = 0;
			Static31.anInt1030 = arg0.getX();
			Static110.anInt3043 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!kb", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static31.aClass41_1 != null) {
			Static24.anInt829 = 0;
		}
	}

	@OriginalMember(owner = "client!kb", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}
}
