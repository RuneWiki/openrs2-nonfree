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

@OriginalClass("client!rq")
public final class Class224_Sub1 extends Class224 implements MouseListener, MouseMotionListener, MouseWheelListener {

	@OriginalMember(owner = "client!rq", name = "h", descriptor = "I")
	private int anInt5850;

	@OriginalMember(owner = "client!rq", name = "i", descriptor = "I")
	private int anInt5851;

	@OriginalMember(owner = "client!rq", name = "j", descriptor = "I")
	private int anInt5852;

	@OriginalMember(owner = "client!rq", name = "k", descriptor = "I")
	private int anInt5853;

	@OriginalMember(owner = "client!rq", name = "m", descriptor = "I")
	private int anInt5854;

	@OriginalMember(owner = "client!rq", name = "n", descriptor = "I")
	private int anInt5855;

	@OriginalMember(owner = "client!rq", name = "o", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!rq", name = "g", descriptor = "Lclient!am;")
	private Class14 aClass14_42 = new Class14();

	@OriginalMember(owner = "client!rq", name = "l", descriptor = "Lclient!am;")
	private Class14 aClass14_43 = new Class14();

	@OriginalMember(owner = "client!rq", name = "p", descriptor = "Z")
	private final boolean aBoolean524;

	@OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class224_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method4736(arg0);
		this.aBoolean524 = arg1;
	}

	@OriginalMember(owner = "client!rq", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!rq", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method5619() {
		this.anInt5852 = this.anInt5854;
		this.anInt5850 = this.anInt5853;
		this.anInt5851 = this.anInt5855;
		@Pc(14) Class14 local14 = this.aClass14_42;
		this.aClass14_42 = this.aClass14_43;
		this.aClass14_43 = local14;
		this.aClass14_43.method204();
	}

	@OriginalMember(owner = "client!rq", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.anInt5854 = -1;
		this.anInt5853 = -1;
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(Z)I")
	@Override
	public int method5613() {
		return this.anInt5850;
	}

	@OriginalMember(owner = "client!rq", name = "f", descriptor = "(I)V")
	private void method4732() {
		if (this.aComponent2 == null) {
			return;
		}
		this.aComponent2.removeMouseWheelListener(this);
		this.aComponent2.removeMouseMotionListener(this);
		this.aComponent2.removeMouseListener(this);
		this.aClass14_43 = null;
		this.aComponent2 = null;
		this.anInt5850 = this.anInt5852 = this.anInt5851 = 0;
		this.anInt5853 = this.anInt5854 = this.anInt5855 = 0;
		this.aClass14_42 = null;
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)V")
	private void method4733(@OriginalArg(0) MouseEvent arg0) {
		this.anInt5853 = arg0.getX();
		this.anInt5854 = arg0.getY();
		if (this.aBoolean524) {
			this.method4735(arg0.getX(), 0, arg0.getY(), -1);
		}
	}

	@OriginalMember(owner = "client!rq", name = "c", descriptor = "(B)Z")
	@Override
	protected boolean method5622() {
		return (this.anInt5851 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(I)I")
	@Override
	public int method5615() {
		return this.anInt5852;
	}

	@OriginalMember(owner = "client!rq", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method4733(arg0);
	}

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "(Ljava/awt/event/MouseEvent;I)I")
	private int method4734(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getModifiers();
		@Pc(13) boolean local13 = (local2 & 0x10) != 0;
		@Pc(21) boolean local21 = (local2 & 0x8) != 0;
		@Pc(32) boolean local32 = (local2 & 0x4) != 0;
		if (local21 && (local13 || local32)) {
			local21 = false;
		}
		if (local13 && local32) {
			return 4;
		} else if (local13) {
			return 1;
		} else if (local21) {
			return 2;
		} else if (local32) {
			return 4;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!rq", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method4734(arg0);
		if (local4 == 1) {
			this.method4735(arg0.getX(), 0, arg0.getY(), 0);
		} else if (local4 == 4) {
			this.method4735(arg0.getX(), 0, arg0.getY(), 2);
		} else if (local4 == 2) {
			this.method4735(arg0.getX(), 0, arg0.getY(), 1);
		}
		this.anInt5855 |= local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!rq", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		@Pc(8) int local8 = arg0.getWheelRotation();
		this.method4735(local2, local8, local5, 6);
		arg0.consume();
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(B)V")
	@Override
	public void method5614() {
		this.method4732();
	}

	@OriginalMember(owner = "client!rq", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method4734(arg0);
		if ((local4 & this.anInt5855) == 0) {
			local4 = this.anInt5855;
		}
		if ((local4 & 0x1) != 0) {
			this.method4735(arg0.getX(), 0, arg0.getY(), 3);
		}
		if ((local4 & 0x4) != 0) {
			this.method4735(arg0.getX(), 0, arg0.getY(), 5);
		}
		if ((local4 & 0x2) != 0) {
			this.method4735(arg0.getX(), 0, arg0.getY(), 4);
		}
		this.anInt5855 &= ~local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!rq", name = "c", descriptor = "(I)Lclient!ke;")
	@Override
	public Class1_Sub22 method5617() {
		return (Class1_Sub22) this.aClass14_42.method202();
	}

	@OriginalMember(owner = "client!rq", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method4733(arg0);
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(IIIZI)V")
	private void method4735(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class1_Sub22_Sub2 local3 = new Class1_Sub22_Sub2();
		local3.anInt5194 = arg3;
		local3.anInt5196 = arg0;
		local3.anInt5193 = arg2;
		local3.aLong170 = Static183.method2674();
		local3.anInt5195 = arg1;
		this.aClass14_43.method205(local3);
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	private void method4736(@OriginalArg(0) Component arg0) {
		this.method4732();
		this.aComponent2 = arg0;
		this.aComponent2.addMouseListener(this);
		this.aComponent2.addMouseMotionListener(this);
		this.aComponent2.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!rq", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method4733(arg0);
	}

	@OriginalMember(owner = "client!rq", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5620() {
		return (this.anInt5851 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "(B)Z")
	@Override
	protected boolean method5618() {
		return (this.anInt5851 & 0x4) != 0;
	}
}
