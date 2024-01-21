import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public final class Class9 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!aj", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static156.aClass9_1 != null) {
			Static97.anInt2044 = 0;
		}
	}

	@OriginalMember(owner = "client!aj", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!aj", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static156.aClass9_1 != null) {
			Static165.anInt3435 = 0;
			Static65.anInt703 = -1;
			Static148.anInt3015 = -1;
		}
	}

	@OriginalMember(owner = "client!aj", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static156.aClass9_1 != null) {
			Static165.anInt3435 = 0;
			Static191.anInt4162 = arg0.getX();
			Static120.anInt2556 = arg0.getY();
			Static101.aLong113 = Static124.method1828();
			if (arg0.isMetaDown()) {
				Static5.anInt107 = 2;
				Static97.anInt2044 = 2;
			} else {
				Static5.anInt107 = 1;
				Static97.anInt2044 = 1;
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!aj", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static156.aClass9_1 != null) {
			Static165.anInt3435 = 0;
			Static65.anInt703 = arg0.getX();
			Static148.anInt3015 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!aj", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static156.aClass9_1 != null) {
			Static165.anInt3435 = 0;
			Static97.anInt2044 = 0;
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!aj", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static156.aClass9_1 != null) {
			Static165.anInt3435 = 0;
			Static65.anInt703 = arg0.getX();
			Static148.anInt3015 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!aj", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static156.aClass9_1 != null) {
			Static165.anInt3435 = 0;
			Static65.anInt703 = arg0.getX();
			Static148.anInt3015 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!aj", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}
}
