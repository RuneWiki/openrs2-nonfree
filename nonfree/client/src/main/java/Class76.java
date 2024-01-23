import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ph")
public final class Class76 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!ph", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static11.aClass76_1 != null) {
			Static75.anInt1617 = 0;
			Static155.anInt3590 = -1;
			Static101.anInt2208 = -1;
		}
	}

	@OriginalMember(owner = "client!ph", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static11.aClass76_1 != null) {
			Static184.anInt4293 = 0;
		}
	}

	@OriginalMember(owner = "client!ph", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!ph", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static11.aClass76_1 != null) {
			Static75.anInt1617 = 0;
			Static155.anInt3590 = arg0.getX();
			Static101.anInt2208 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!ph", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static11.aClass76_1 != null) {
			Static75.anInt1617 = 0;
			Static226.anInt4899 = arg0.getX();
			Static71.anInt1402 = arg0.getY();
			Static199.aLong162 = Static111.method1911();
			if (arg0.isMetaDown()) {
				Static199.anInt4491 = 2;
				Static184.anInt4293 = 2;
			} else {
				Static199.anInt4491 = 1;
				Static184.anInt4293 = 1;
			}
			@Pc(32) int local32 = arg0.getModifiers();
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ph", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static11.aClass76_1 != null) {
			Static75.anInt1617 = 0;
			Static155.anInt3590 = arg0.getX();
			Static101.anInt2208 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!ph", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static11.aClass76_1 != null) {
			Static75.anInt1617 = 0;
			Static184.anInt4293 = 0;
			@Pc(8) int local8 = arg0.getModifiers();
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ph", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ph", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static11.aClass76_1 != null) {
			Static75.anInt1617 = 0;
			Static155.anInt3590 = arg0.getX();
			Static101.anInt2208 = arg0.getY();
		}
	}
}
