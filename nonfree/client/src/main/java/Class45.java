import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public final class Class45 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!le", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!le", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static114.aClass45_1 != null) {
			Static108.anInt2860 = 0;
			Static34.anInt983 = -1;
			Static11.anInt476 = -1;
		}
	}

	@OriginalMember(owner = "client!le", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static114.aClass45_1 != null) {
			Static108.anInt2860 = 0;
			Static27.anInt814 = 0;
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!le", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static114.aClass45_1 != null) {
			Static108.anInt2860 = 0;
			Static64.anInt1694 = arg0.getX();
			Static62.anInt1680 = arg0.getY();
			Static3.aLong7 = Static3.method125();
			if (arg0.isMetaDown()) {
				Static32.anInt921 = 2;
				Static27.anInt814 = 2;
			} else {
				Static32.anInt921 = 1;
				Static27.anInt814 = 1;
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!le", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static114.aClass45_1 != null) {
			Static108.anInt2860 = 0;
			Static34.anInt983 = arg0.getX();
			Static11.anInt476 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!le", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static114.aClass45_1 != null) {
			Static108.anInt2860 = 0;
			Static34.anInt983 = arg0.getX();
			Static11.anInt476 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!le", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static114.aClass45_1 != null) {
			Static27.anInt814 = 0;
		}
	}

	@OriginalMember(owner = "client!le", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static114.aClass45_1 != null) {
			Static108.anInt2860 = 0;
			Static34.anInt983 = arg0.getX();
			Static11.anInt476 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!le", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}
}
