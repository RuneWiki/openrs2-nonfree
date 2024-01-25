import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class Class202 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!v", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static263.aClass202_1 != null) {
			Static81.anInt2142 = 0;
			Static91.anInt5974 = arg0.getX();
			Static150.anInt1955 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!v", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static263.aClass202_1 != null) {
			Static81.anInt2142 = 0;
			Static91.anInt5974 = arg0.getX();
			Static150.anInt1955 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!v", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!v", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static263.aClass202_1 != null) {
			Static296.anInt5941 = 0;
		}
	}

	@OriginalMember(owner = "client!v", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static263.aClass202_1 != null) {
			Static81.anInt2142 = 0;
			Static91.anInt5974 = arg0.getX();
			Static150.anInt1955 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!v", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static263.aClass202_1 != null) {
			Static81.anInt2142 = 0;
			Static121.anInt2741 = arg0.getX();
			Static303.anInt5807 = arg0.getY();
			Static164.aLong118 = Static335.method5308();
			if (arg0.isMetaDown()) {
				Static176.anInt3626 = 2;
				Static296.anInt5941 = 2;
			} else {
				Static176.anInt3626 = 1;
				Static296.anInt5941 = 1;
			}
			@Pc(32) int local32 = arg0.getModifiers();
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!v", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!v", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static263.aClass202_1 != null) {
			Static81.anInt2142 = 0;
			Static296.anInt5941 = 0;
			@Pc(12) int local12 = arg0.getModifiers();
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!v", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static263.aClass202_1 != null) {
			Static81.anInt2142 = 0;
			Static91.anInt5974 = -1;
			Static150.anInt1955 = -1;
		}
	}
}
