import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class Class51 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!je", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static176.aClass51_2 != null) {
			Static24.anInt568 = 0;
			Static122.anInt2734 = arg0.getX();
			Static46.anInt1055 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!je", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static176.aClass51_2 != null) {
			Static24.anInt568 = 0;
			Static122.anInt2734 = -1;
			Static46.anInt1055 = -1;
		}
	}

	@OriginalMember(owner = "client!je", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!je", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!je", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static176.aClass51_2 != null) {
			Static24.anInt568 = 0;
			Static122.anInt2734 = arg0.getX();
			Static46.anInt1055 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!je", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static176.aClass51_2 != null) {
			Static24.anInt568 = 0;
			Static10.anInt342 = 0;
			@Pc(8) int local8 = arg0.getModifiers();
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!je", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static176.aClass51_2 != null) {
			Static24.anInt568 = 0;
			Static122.anInt2734 = arg0.getX();
			Static46.anInt1055 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!je", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static176.aClass51_2 != null) {
			Static10.anInt342 = 0;
		}
	}

	@OriginalMember(owner = "client!je", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static176.aClass51_2 != null) {
			Static24.anInt568 = 0;
			Static4.anInt88 = arg0.getX();
			Static70.anInt1745 = arg0.getY();
			Static17.aLong12 = Static3.method57();
			if (arg0.isMetaDown()) {
				Static156.anInt3476 = 2;
				Static10.anInt342 = 2;
			} else {
				Static156.anInt3476 = 1;
				Static10.anInt342 = 1;
			}
			@Pc(28) int local28 = arg0.getModifiers();
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}
}
