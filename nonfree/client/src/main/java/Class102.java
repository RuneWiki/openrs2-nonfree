import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rg")
public final class Class102 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!rg", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static146.aClass102_1 != null) {
			Static182.anInt4083 = 0;
			Static180.anInt4993 = 0;
			@Pc(8) int local8 = arg0.getModifiers();
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!rg", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static146.aClass102_1 != null) {
			Static182.anInt4083 = 0;
			Static170.anInt3702 = arg0.getX();
			Static233.anInt5001 = arg0.getY();
			Static77.aLong61 = Static209.method3309();
			if (arg0.isMetaDown()) {
				Static211.anInt4552 = 2;
				Static180.anInt4993 = 2;
			} else {
				Static211.anInt4552 = 1;
				Static180.anInt4993 = 1;
			}
			@Pc(28) int local28 = arg0.getModifiers();
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!rg", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static146.aClass102_1 != null) {
			Static182.anInt4083 = 0;
			Static131.anInt2852 = arg0.getX();
			Static134.anInt2938 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!rg", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static146.aClass102_1 != null) {
			Static182.anInt4083 = 0;
			Static131.anInt2852 = arg0.getX();
			Static134.anInt2938 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!rg", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!rg", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static146.aClass102_1 != null) {
			Static182.anInt4083 = 0;
			Static131.anInt2852 = -1;
			Static134.anInt2938 = -1;
		}
	}

	@OriginalMember(owner = "client!rg", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static146.aClass102_1 != null) {
			Static182.anInt4083 = 0;
			Static131.anInt2852 = arg0.getX();
			Static134.anInt2938 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!rg", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static146.aClass102_1 != null) {
			Static180.anInt4993 = 0;
		}
	}

	@OriginalMember(owner = "client!rg", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}
}
