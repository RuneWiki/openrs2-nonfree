import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jk")
public final class Class98 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!jk", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static46.aClass98_1 != null) {
			Static241.anInt4679 = 0;
			Static20.anInt551 = arg0.getX();
			Static36.anInt923 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!jk", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static46.aClass98_1 != null) {
			Static241.anInt4679 = 0;
			Static84.anInt2092 = 0;
			@Pc(8) int local8 = arg0.getModifiers();
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!jk", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!jk", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static46.aClass98_1 != null) {
			Static241.anInt4679 = 0;
			Static20.anInt551 = arg0.getX();
			Static36.anInt923 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!jk", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static46.aClass98_1 != null) {
			Static241.anInt4679 = 0;
			Static20.anInt551 = arg0.getX();
			Static36.anInt923 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!jk", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!jk", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static46.aClass98_1 != null) {
			Static241.anInt4679 = 0;
			Static20.anInt551 = -1;
			Static36.anInt923 = -1;
		}
	}

	@OriginalMember(owner = "client!jk", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static46.aClass98_1 != null) {
			Static84.anInt2092 = 0;
		}
	}

	@OriginalMember(owner = "client!jk", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static46.aClass98_1 != null) {
			Static241.anInt4679 = 0;
			Static324.anInt6143 = arg0.getX();
			Static43.anInt1090 = arg0.getY();
			Static130.aLong101 = Static284.method4783();
			if (arg0.isMetaDown()) {
				Static148.anInt3012 = 2;
				Static84.anInt2092 = 2;
			} else {
				Static148.anInt3012 = 1;
				Static84.anInt2092 = 1;
			}
			@Pc(32) int local32 = arg0.getModifiers();
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}
}
