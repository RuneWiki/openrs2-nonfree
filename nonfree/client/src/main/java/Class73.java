import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public final class Class73 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!ob", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!ob", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static107.aClass73_1 != null) {
			Static27.anInt724 = 0;
			Static202.anInt4521 = arg0.getX();
			Static36.anInt956 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!ob", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static107.aClass73_1 != null) {
			Static27.anInt724 = 0;
			Static202.anInt4521 = -1;
			Static36.anInt956 = -1;
		}
	}

	@OriginalMember(owner = "client!ob", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static107.aClass73_1 != null) {
			Static42.anInt1102 = 0;
		}
	}

	@OriginalMember(owner = "client!ob", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static107.aClass73_1 != null) {
			Static27.anInt724 = 0;
			Static202.anInt4521 = arg0.getX();
			Static36.anInt956 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!ob", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static107.aClass73_1 != null) {
			Static27.anInt724 = 0;
			Static109.anInt2507 = arg0.getX();
			Static172.anInt3844 = arg0.getY();
			Static41.aLong41 = Static24.method503();
			if (arg0.isMetaDown()) {
				Static56.anInt1411 = 2;
				Static42.anInt1102 = 2;
			} else {
				Static56.anInt1411 = 1;
				Static42.anInt1102 = 1;
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ob", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ob", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static107.aClass73_1 != null) {
			Static27.anInt724 = 0;
			Static202.anInt4521 = arg0.getX();
			Static36.anInt956 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!ob", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static107.aClass73_1 != null) {
			Static27.anInt724 = 0;
			Static42.anInt1102 = 0;
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}
}
