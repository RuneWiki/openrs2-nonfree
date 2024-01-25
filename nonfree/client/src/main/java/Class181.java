import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ro")
public final class Class181 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!ro", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static74.aClass181_3 != null) {
			Static171.anInt3580 = 0;
			Static69.anInt1425 = 0;
			@Pc(8) int local8 = arg0.getModifiers();
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ro", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ro", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static74.aClass181_3 != null) {
			Static171.anInt3580 = 0;
			Static202.anInt4090 = arg0.getX();
			Static34.anInt831 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!ro", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static74.aClass181_3 != null) {
			Static69.anInt1425 = 0;
		}
	}

	@OriginalMember(owner = "client!ro", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static74.aClass181_3 != null) {
			Static171.anInt3580 = 0;
			Static202.anInt4090 = arg0.getX();
			Static34.anInt831 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!ro", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static74.aClass181_3 != null) {
			Static171.anInt3580 = 0;
			Static202.anInt4090 = arg0.getX();
			Static34.anInt831 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!ro", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!ro", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static74.aClass181_3 != null) {
			Static171.anInt3580 = 0;
			Static202.anInt4090 = -1;
			Static34.anInt831 = -1;
		}
	}

	@OriginalMember(owner = "client!ro", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static74.aClass181_3 != null) {
			Static171.anInt3580 = 0;
			Static70.anInt1452 = arg0.getX();
			Static10.anInt227 = arg0.getY();
			Static9.aLong12 = Static349.method5647();
			if (arg0.isMetaDown()) {
				Static110.anInt2240 = 2;
				Static69.anInt1425 = 2;
			} else {
				Static110.anInt2240 = 1;
				Static69.anInt1425 = 1;
			}
			@Pc(32) int local32 = arg0.getModifiers();
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}
}
