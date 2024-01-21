import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public final class Class34 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!i", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!i", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static4.aClass34_2 != null) {
			Static62.anInt1536 = 0;
			Static133.anInt3391 = 0;
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!i", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static4.aClass34_2 != null) {
			Static62.anInt1536 = 0;
			Static31.anInt943 = arg0.getX();
			Static73.anInt1737 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!i", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static4.aClass34_2 != null) {
			Static62.anInt1536 = 0;
			Static31.anInt943 = -1;
			Static73.anInt1737 = -1;
		}
	}

	@OriginalMember(owner = "client!i", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static4.aClass34_2 != null) {
			Static62.anInt1536 = 0;
			Static30.anInt922 = arg0.getX();
			Static107.anInt2767 = arg0.getY();
			Static29.aLong35 = Static102.method1742();
			if (arg0.isMetaDown()) {
				Static1.anInt8 = 2;
				Static133.anInt3391 = 2;
			} else {
				Static1.anInt8 = 1;
				Static133.anInt3391 = 1;
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!i", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static4.aClass34_2 != null) {
			Static133.anInt3391 = 0;
		}
	}

	@OriginalMember(owner = "client!i", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static4.aClass34_2 != null) {
			Static62.anInt1536 = 0;
			Static31.anInt943 = arg0.getX();
			Static73.anInt1737 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!i", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static4.aClass34_2 != null) {
			Static62.anInt1536 = 0;
			Static31.anInt943 = arg0.getX();
			Static73.anInt1737 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!i", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}
}
