import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!di")
public final class Class48 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!di", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static88.aClass48_1 != null) {
			Static5.anInt94 = 0;
			Static92.anInt1680 = -1;
			Static210.anInt3837 = -1;
		}
	}

	@OriginalMember(owner = "client!di", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static88.aClass48_1 != null) {
			Static5.anInt94 = 0;
			Static319.anInt5900 = 0;
			@Pc(8) int local8 = arg0.getModifiers();
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!di", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static88.aClass48_1 != null) {
			Static5.anInt94 = 0;
			Static92.anInt1680 = arg0.getX();
			Static210.anInt3837 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!di", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!di", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static88.aClass48_1 != null) {
			Static5.anInt94 = 0;
			Static92.anInt1680 = arg0.getX();
			Static210.anInt3837 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!di", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static88.aClass48_1 != null) {
			Static5.anInt94 = 0;
			Static204.anInt3763 = arg0.getX();
			Static175.anInt3283 = arg0.getY();
			Static236.aLong88 = Static245.method4300();
			if (arg0.isMetaDown()) {
				Static59.anInt1111 = 2;
				Static319.anInt5900 = 2;
			} else {
				Static59.anInt1111 = 1;
				Static319.anInt5900 = 1;
			}
			@Pc(28) int local28 = arg0.getModifiers();
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!di", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static88.aClass48_1 != null) {
			Static319.anInt5900 = 0;
		}
	}

	@OriginalMember(owner = "client!di", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!di", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static88.aClass48_1 != null) {
			Static5.anInt94 = 0;
			Static92.anInt1680 = arg0.getX();
			Static210.anInt3837 = arg0.getY();
		}
	}
}
