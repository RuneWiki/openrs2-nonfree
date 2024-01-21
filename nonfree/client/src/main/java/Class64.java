import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public final class Class64 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!qc", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static117.aClass64_1 != null) {
			Static41.anInt1005 = 0;
			Static91.anInt2029 = 0;
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!qc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static117.aClass64_1 != null) {
			Static91.anInt2029 = 0;
		}
	}

	@OriginalMember(owner = "client!qc", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static117.aClass64_1 != null) {
			Static41.anInt1005 = 0;
			Static5.anInt108 = arg0.getX();
			Static176.anInt3866 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!qc", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static117.aClass64_1 != null) {
			Static41.anInt1005 = 0;
			Static5.anInt108 = -1;
			Static176.anInt3866 = -1;
		}
	}

	@OriginalMember(owner = "client!qc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!qc", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static117.aClass64_1 != null) {
			Static41.anInt1005 = 0;
			Static5.anInt108 = arg0.getX();
			Static176.anInt3866 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!qc", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static117.aClass64_1 != null) {
			Static41.anInt1005 = 0;
			Static5.anInt108 = arg0.getX();
			Static176.anInt3866 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!qc", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static117.aClass64_1 != null) {
			Static41.anInt1005 = 0;
			Static168.anInt3654 = arg0.getX();
			Static65.anInt1534 = arg0.getY();
			Static132.aLong141 = Static88.method1536();
			if (arg0.isMetaDown()) {
				Static162.anInt3536 = 2;
				Static91.anInt2029 = 2;
			} else {
				Static162.anInt3536 = 1;
				Static91.anInt2029 = 1;
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!qc", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}
}
