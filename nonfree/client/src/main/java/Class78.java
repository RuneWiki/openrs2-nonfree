import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kl")
public final class Class78 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!kl", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!kl", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static154.aClass78_5 != null) {
			Static227.anInt4989 = 0;
			Static20.anInt716 = 0;
			@Pc(12) int local12 = arg0.getModifiers();
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!kl", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static154.aClass78_5 != null) {
			Static227.anInt4989 = 0;
			Static98.anInt2707 = -1;
			Static25.anInt847 = -1;
		}
	}

	@OriginalMember(owner = "client!kl", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static154.aClass78_5 != null) {
			Static227.anInt4989 = 0;
			Static98.anInt2707 = arg0.getX();
			Static25.anInt847 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!kl", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!kl", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static154.aClass78_5 != null) {
			Static20.anInt716 = 0;
		}
	}

	@OriginalMember(owner = "client!kl", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static154.aClass78_5 != null) {
			Static227.anInt4989 = 0;
			Static39.anInt1090 = arg0.getX();
			Static256.anInt5443 = arg0.getY();
			Static187.aLong132 = Static31.method591();
			if (arg0.isMetaDown()) {
				Static197.anInt2392 = 2;
				Static20.anInt716 = 2;
			} else {
				Static197.anInt2392 = 1;
				Static20.anInt716 = 1;
			}
			@Pc(28) int local28 = arg0.getModifiers();
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!kl", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static154.aClass78_5 != null) {
			Static227.anInt4989 = 0;
			Static98.anInt2707 = arg0.getX();
			Static25.anInt847 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!kl", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static154.aClass78_5 != null) {
			Static227.anInt4989 = 0;
			Static98.anInt2707 = arg0.getX();
			Static25.anInt847 = arg0.getY();
		}
	}
}
