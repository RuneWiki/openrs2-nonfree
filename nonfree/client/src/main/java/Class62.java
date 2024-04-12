import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public final class Class62 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!vd", name = "l", descriptor = "Lclient!qc;")
	public static Class47 aClass47_22 = new Class47(64);

	@OriginalMember(owner = "client!vd", name = "v", descriptor = "Lclient!o;")
	public static Class40 aClass40_715 = Static12.method257("On");

	@OriginalMember(owner = "client!vd", name = "t", descriptor = "I")
	public static int anInt2491 = 0;

	@OriginalMember(owner = "client!vd", name = "w", descriptor = "I")
	public static int anInt2492 = -1;

	@OriginalMember(owner = "client!vd", name = "u", descriptor = "Lclient!o;")
	public static Class40 aClass40_714 = Static12.method257("Connection lost");

	@OriginalMember(owner = "client!vd", name = "A", descriptor = "I")
	public static volatile int anInt2494 = 0;

	@OriginalMember(owner = "client!vd", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 6)
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Class49.aClass62_1 != null) {
			Class2_Sub2_Sub12_Sub3.anInt1497 = 0;
			Class5.anInt112 = arg0.getX();
			Class37.anInt1663 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!vd", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 21)
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Class49.aClass62_1 != null) {
			Class2_Sub2_Sub12_Sub3.anInt1497 = 0;
			Class5.anInt112 = arg0.getX();
			Class37.anInt1663 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!vd", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 80)
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Class49.aClass62_1 != null) {
			Class2_Sub2_Sub12_Sub3.anInt1497 = 0;
			Class5.anInt112 = -1;
			Class37.anInt1663 = -1;
		}
	}

	@OriginalMember(owner = "client!vd", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 101)
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Class49.aClass62_1 != null) {
			Class2_Sub2_Sub12_Sub3.anInt1497 = 0;
			Class25.anInt969 = 0;
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!vd", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 685)
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Class49.aClass62_1 != null) {
			Class2_Sub2_Sub12_Sub3.anInt1497 = 0;
			Class5.anInt112 = arg0.getX();
			Class37.anInt1663 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!vd", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 747)
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Class49.aClass62_1 != null) {
			Class2_Sub2_Sub12_Sub3.anInt1497 = 0;
			Canvas_Sub1.anInt1166 = arg0.getX();
			anInt2494 = arg0.getY();
			Class2_Sub2.aLong149 = System.currentTimeMillis();
			if (arg0.isMetaDown()) {
				Class64.anInt2520 = 2;
				Class25.anInt969 = 2;
			} else {
				Class64.anInt2520 = 1;
				Class25.anInt969 = 1;
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!vd", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 821)
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}
}
