import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aa")
public final class Class2 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!aa", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static268.aClass2_5 != null) {
			Static209.anInt4120 = 0;
			Static190.anInt3899 = 0;
			@Pc(9) int local9 = arg0.getModifiers();
			if ((local9 & 0x4) == 0) {
			}
			if ((local9 & 0x10) == 0) {
			}
			if ((local9 & 0x8) == 0) {
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!aa", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static268.aClass2_5 != null) {
			Static209.anInt4120 = 0;
			Static302.anInt5719 = arg0.getX();
			Static97.anInt1808 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!aa", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!aa", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static268.aClass2_5 != null) {
			Static209.anInt4120 = 0;
			Static302.anInt5719 = arg0.getX();
			Static97.anInt1808 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!aa", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!aa", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static268.aClass2_5 != null) {
			Static209.anInt4120 = 0;
			Static302.anInt5719 = -1;
			Static97.anInt1808 = -1;
		}
	}

	@OriginalMember(owner = "client!aa", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static268.aClass2_5 != null) {
			Static209.anInt4120 = 0;
			Static302.anInt5719 = arg0.getX();
			Static97.anInt1808 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!aa", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static268.aClass2_5 != null) {
			Static209.anInt4120 = 0;
			Static56.anInt1114 = arg0.getX();
			Static314.anInt5910 = arg0.getY();
			Static1.aLong6 = Static135.method2186();
			if (arg0.isMetaDown()) {
				Static217.anInt4270 = 2;
				Static190.anInt3899 = 2;
			} else {
				Static217.anInt4270 = 1;
				Static190.anInt3899 = 1;
			}
			@Pc(32) int local32 = arg0.getModifiers();
			if ((local32 & 0x8) != 0) {
			}
			if ((local32 & 0x4) != 0) {
			}
			if ((local32 & 0x10) == 0) {
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!aa", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static268.aClass2_5 != null) {
			Static190.anInt3899 = 0;
		}
	}
}
