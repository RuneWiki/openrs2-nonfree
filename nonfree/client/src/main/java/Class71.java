import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public final class Class71 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!ta", name = "z", descriptor = "[I")
	public static int[] anIntArray344 = new int[256];

	static {
		for (@Pc(34) int local34 = 0; local34 < 256; local34++) {
			@Pc(37) int local37 = local34;
			for (@Pc(39) int local39 = 0; local39 < 8; local39++) {
				if ((local37 & 0x1) == 1) {
					local37 = local37 >>> 1 ^ 0xEDB88320;
				} else {
					local37 >>>= 0x1;
				}
			}
			anIntArray344[local34] = local37;
		}
	}

	@OriginalMember(owner = "client!ta", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!ta", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static122.aClass71_1 != null) {
			Static29.anInt904 = 0;
			Static101.anInt2543 = -1;
			Static17.anInt645 = -1;
		}
	}

	@OriginalMember(owner = "client!ta", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static122.aClass71_1 != null) {
			Static116.anInt2803 = 0;
		}
	}

	@OriginalMember(owner = "client!ta", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static122.aClass71_1 != null) {
			Static29.anInt904 = 0;
			Static76.anInt2060 = arg0.getX();
			Static56.anInt2384 = arg0.getY();
			Static116.aLong145 = Static35.method634();
			if (arg0.isMetaDown()) {
				Static41.anInt1172 = 2;
				Static116.anInt2803 = 2;
			} else {
				Static41.anInt1172 = 1;
				Static116.anInt2803 = 1;
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ta", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static122.aClass71_1 != null) {
			Static29.anInt904 = 0;
			Static116.anInt2803 = 0;
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ta", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static122.aClass71_1 != null) {
			Static29.anInt904 = 0;
			Static101.anInt2543 = arg0.getX();
			Static17.anInt645 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!ta", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ta", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static122.aClass71_1 != null) {
			Static29.anInt904 = 0;
			Static101.anInt2543 = arg0.getX();
			Static17.anInt645 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!ta", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static122.aClass71_1 != null) {
			Static29.anInt904 = 0;
			Static101.anInt2543 = arg0.getX();
			Static17.anInt645 = arg0.getY();
		}
	}
}
