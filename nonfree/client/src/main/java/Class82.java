import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hc")
public final class Class82 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!hc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static28.aClass82_1 != null) {
			Static85.anInt2084 = 0;
		}
	}

	@OriginalMember(owner = "client!hc", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static28.aClass82_1 != null) {
			Static270.anInt5147 = 0;
			Static239.anInt6269 = arg0.getX();
			Static249.anInt4827 = arg0.getY();
			Static18.aLong13 = Static168.method3300();
			if (arg0.isMetaDown()) {
				Static185.anInt3818 = 2;
				Static85.anInt2084 = 2;
			} else {
				Static185.anInt3818 = 1;
				Static85.anInt2084 = 1;
			}
			@Pc(28) int local28 = arg0.getModifiers();
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!hc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!hc", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static28.aClass82_1 != null) {
			Static270.anInt5147 = 0;
			Static319.anInt6145 = -1;
			Static283.anInt5383 = -1;
		}
	}

	@OriginalMember(owner = "client!hc", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static28.aClass82_1 != null) {
			Static270.anInt5147 = 0;
			Static319.anInt6145 = arg0.getX();
			Static283.anInt5383 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!hc", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static28.aClass82_1 != null) {
			Static270.anInt5147 = 0;
			Static319.anInt6145 = arg0.getX();
			Static283.anInt5383 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!hc", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static28.aClass82_1 != null) {
			Static270.anInt5147 = 0;
			Static85.anInt2084 = 0;
			@Pc(12) int local12 = arg0.getModifiers();
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!hc", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static28.aClass82_1 != null) {
			Static270.anInt5147 = 0;
			Static319.anInt6145 = arg0.getX();
			Static283.anInt5383 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!hc", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}
}
