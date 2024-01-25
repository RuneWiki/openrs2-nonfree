import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cga")
public final class Class54_Sub1 extends Class54 implements MouseListener, MouseMotionListener, MouseWheelListener {

	@OriginalMember(owner = "client!cga", name = "i", descriptor = "I")
	private int anInt1804;

	@OriginalMember(owner = "client!cga", name = "j", descriptor = "I")
	private int anInt1805;

	@OriginalMember(owner = "client!cga", name = "l", descriptor = "I")
	private int anInt1806;

	@OriginalMember(owner = "client!cga", name = "m", descriptor = "I")
	private int anInt1807;

	@OriginalMember(owner = "client!cga", name = "n", descriptor = "I")
	private int anInt1808;

	@OriginalMember(owner = "client!cga", name = "o", descriptor = "I")
	private int anInt1809;

	@OriginalMember(owner = "client!cga", name = "q", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!cga", name = "k", descriptor = "Lclient!or;")
	private Class244 aClass244_17 = new Class244();

	@OriginalMember(owner = "client!cga", name = "p", descriptor = "Lclient!or;")
	private Class244 aClass244_18 = new Class244();

	@OriginalMember(owner = "client!cga", name = "r", descriptor = "Z")
	private final boolean aBoolean130;

	@OriginalMember(owner = "client!cga", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class54_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method1621(arg0);
		this.aBoolean130 = arg1;
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(BII)V")
	private void method1617(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt1808 = arg1;
		this.anInt1809 = arg0;
		if (this.aBoolean130) {
			this.method1618(-1, arg1, 0, arg0);
		}
	}

	@OriginalMember(owner = "client!cga", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method1617(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(IIIII)V")
	private void method1618(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class3_Sub27_Sub2 local3 = new Class3_Sub27_Sub2();
		local3.anInt6632 = arg1;
		local3.anInt6633 = arg0;
		local3.anInt6630 = arg3;
		local3.aLong185 = Static96.method2000();
		local3.anInt6631 = arg2;
		this.aClass244_18.method5570(local3);
	}

	@OriginalMember(owner = "client!cga", name = "c", descriptor = "(I)I")
	@Override
	public int method7306() {
		return this.anInt1805;
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(B)Lclient!vfa;")
	@Override
	public Class3_Sub27 method7301() {
		return (Class3_Sub27) this.aClass244_17.method5578();
	}

	@OriginalMember(owner = "client!cga", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(I)V")
	@Override
	public void method7302() {
		this.method1620();
	}

	@OriginalMember(owner = "client!cga", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method1619(arg0);
		if ((this.anInt1807 & local4) == 0) {
			local4 = this.anInt1807;
		}
		if ((local4 & 0x1) != 0) {
			this.method1618(3, arg0.getX(), arg0.getClickCount(), arg0.getY());
		}
		if ((local4 & 0x4) != 0) {
			this.method1618(5, arg0.getX(), arg0.getClickCount(), arg0.getY());
		}
		if ((local4 & 0x2) != 0) {
			this.method1618(4, arg0.getX(), arg0.getClickCount(), arg0.getY());
		}
		this.anInt1807 &= ~local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)I")
	private int method1619(@OriginalArg(1) MouseEvent arg0) {
		if (arg0.getButton() == 1) {
			return arg0.isMetaDown() ? 4 : 1;
		} else if (arg0.getButton() == 2) {
			return 2;
		} else if (arg0.getButton() == 3) {
			return 4;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!cga", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method1617(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!cga", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method1619(arg0);
		if (local4 == 1) {
			this.method1618(0, arg0.getX(), arg0.getClickCount(), arg0.getY());
		} else if (local4 == 4) {
			this.method1618(2, arg0.getX(), arg0.getClickCount(), arg0.getY());
		} else if (local4 == 2) {
			this.method1618(1, arg0.getX(), arg0.getClickCount(), arg0.getY());
		}
		this.anInt1807 |= local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!cga", name = "g", descriptor = "(I)V")
	@Override
	public synchronized void method7312() {
		this.anInt1805 = this.anInt1808;
		this.anInt1806 = this.anInt1809;
		this.anInt1804 = this.anInt1807;
		@Pc(14) Class244 local14 = this.aClass244_17;
		this.aClass244_17 = this.aClass244_18;
		this.aClass244_18 = local14;
		this.aClass244_18.method5581();
	}

	@OriginalMember(owner = "client!cga", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		@Pc(8) int local8 = arg0.getWheelRotation();
		this.method1618(6, local2, local8, local5);
		arg0.consume();
	}

	@OriginalMember(owner = "client!cga", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method7307() {
		return (this.anInt1804 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!cga", name = "i", descriptor = "(I)I")
	@Override
	public int method7315() {
		return this.anInt1806;
	}

	@OriginalMember(owner = "client!cga", name = "b", descriptor = "(B)Z")
	@Override
	protected boolean method7305() {
		return (this.anInt1804 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!cga", name = "j", descriptor = "(I)V")
	private void method1620() {
		if (this.aComponent1 == null) {
			return;
		}
		this.aComponent1.removeMouseWheelListener(this);
		this.aComponent1.removeMouseMotionListener(this);
		this.aComponent1.removeMouseListener(this);
		this.aClass244_18 = null;
		this.aComponent1 = null;
		this.anInt1805 = this.anInt1806 = this.anInt1804 = 0;
		this.aClass244_17 = null;
		this.anInt1808 = this.anInt1809 = this.anInt1807 = 0;
	}

	@OriginalMember(owner = "client!cga", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method1617(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!cga", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method1617(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!cga", name = "f", descriptor = "(I)Z")
	@Override
	protected boolean method7311() {
		return (this.anInt1804 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	private void method1621(@OriginalArg(0) Component arg0) {
		this.method1620();
		this.aComponent1 = arg0;
		this.aComponent1.addMouseListener(this);
		this.aComponent1.addMouseMotionListener(this);
		this.aComponent1.addMouseWheelListener(this);
	}
}
