import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public final class Class57 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!pe", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static33.aClass57_1 != null) {
			Static116.anInt2871 = 0;
			Static105.anInt2637 = arg0.getX();
			Static38.anInt950 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!pe", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static33.aClass57_1 != null) {
			Static116.anInt2871 = 0;
			Static128.anInt3045 = arg0.getX();
			Static13.anInt269 = arg0.getY();
			Static27.aLong26 = Static44.method861();
			if (arg0.isMetaDown()) {
				Static133.anInt3140 = 2;
				Static68.anInt499 = 2;
			} else {
				Static133.anInt3140 = 1;
				Static68.anInt499 = 1;
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!pe", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static33.aClass57_1 != null) {
			Static68.anInt499 = 0;
		}
	}

	@OriginalMember(owner = "client!pe", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!pe", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static33.aClass57_1 != null) {
			Static116.anInt2871 = 0;
			Static68.anInt499 = 0;
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!pe", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!pe", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static33.aClass57_1 != null) {
			Static116.anInt2871 = 0;
			Static105.anInt2637 = arg0.getX();
			Static38.anInt950 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!pe", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static33.aClass57_1 != null) {
			Static116.anInt2871 = 0;
			Static105.anInt2637 = arg0.getX();
			Static38.anInt950 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!pe", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static33.aClass57_1 != null) {
			Static116.anInt2871 = 0;
			Static105.anInt2637 = -1;
			Static38.anInt950 = -1;
		}
	}
}
