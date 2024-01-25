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

@OriginalClass("client!mf")
public final class Class191_Sub1 extends Class191 implements MouseListener, MouseMotionListener, MouseWheelListener {

	@OriginalMember(owner = "client!mf", name = "f", descriptor = "I")
	private int anInt5753;

	@OriginalMember(owner = "client!mf", name = "h", descriptor = "I")
	private int anInt5754;

	@OriginalMember(owner = "client!mf", name = "i", descriptor = "I")
	private int anInt5755;

	@OriginalMember(owner = "client!mf", name = "j", descriptor = "I")
	private int anInt5756;

	@OriginalMember(owner = "client!mf", name = "k", descriptor = "I")
	private int anInt5757;

	@OriginalMember(owner = "client!mf", name = "m", descriptor = "I")
	private int anInt5758;

	@OriginalMember(owner = "client!mf", name = "o", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!mf", name = "g", descriptor = "Lclient!bu;")
	private Class38 aClass38_42 = new Class38();

	@OriginalMember(owner = "client!mf", name = "l", descriptor = "Lclient!bu;")
	private Class38 aClass38_43 = new Class38();

	@OriginalMember(owner = "client!mf", name = "n", descriptor = "Z")
	private final boolean aBoolean395;

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class191_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method5007(arg0);
		this.aBoolean395 = arg1;
	}

	@OriginalMember(owner = "client!mf", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		@Pc(8) int local8 = arg0.getWheelRotation();
		this.method5003(local8, 6, local5, local2);
		arg0.consume();
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIBI)V")
	private void method5003(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(11) Class1_Sub41_Sub2 local11 = new Class1_Sub41_Sub2();
		local11.anInt9330 = arg2;
		local11.anInt9327 = arg1;
		local11.anInt9328 = arg3;
		local11.aLong242 = Static93.method2172();
		local11.anInt9329 = arg0;
		this.aClass38_43.method1426(local11);
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIB)V")
	private void method5004(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5756 = arg0;
		this.anInt5758 = arg1;
		if (this.aBoolean395) {
			this.method5003(0, -1, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)I")
	@Override
	public int method5141() {
		return this.anInt5755;
	}

	@OriginalMember(owner = "client!mf", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method5149() {
		return (this.anInt5753 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!mf", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "(I)Z")
	@Override
	protected boolean method5147() {
		return (this.anInt5753 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!mf", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method5005(arg0);
		if (local4 == 1) {
			this.method5003(0, 0, arg0.getY(), arg0.getX());
		} else if (local4 == 4) {
			this.method5003(0, 2, arg0.getY(), arg0.getX());
		} else if (local4 == 2) {
			this.method5003(0, 1, arg0.getY(), arg0.getX());
		}
		this.anInt5757 |= local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "(B)V")
	@Override
	public void method5146() {
		this.method5006();
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Z)Z")
	@Override
	protected boolean method5142() {
		return (this.anInt5753 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!mf", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method5004(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(B)Lclient!qw;")
	@Override
	public Class1_Sub41 method5145() {
		return (Class1_Sub41) this.aClass38_42.method1423();
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)I")
	@Override
	public int method5138() {
		return this.anInt5754;
	}

	@OriginalMember(owner = "client!mf", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method5004(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!mf", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method5004(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method5144() {
		this.anInt5755 = this.anInt5758;
		this.anInt5754 = this.anInt5756;
		this.anInt5753 = this.anInt5757;
		@Pc(18) Class38 local18 = this.aClass38_42;
		this.aClass38_42 = this.aClass38_43;
		this.aClass38_43 = local18;
		this.aClass38_43.method1417();
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)I")
	private int method5005(@OriginalArg(0) MouseEvent arg0) {
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

	@OriginalMember(owner = "client!mf", name = "e", descriptor = "(I)V")
	private void method5006() {
		if (this.aComponent1 == null) {
			return;
		}
		this.aComponent1.removeMouseWheelListener(this);
		this.aComponent1.removeMouseMotionListener(this);
		this.aComponent1.removeMouseListener(this);
		this.anInt5754 = this.anInt5755 = this.anInt5753 = 0;
		this.aClass38_42 = null;
		this.aClass38_43 = null;
		this.aComponent1 = null;
		this.anInt5756 = this.anInt5758 = this.anInt5757 = 0;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	private void method5007(@OriginalArg(0) Component arg0) {
		this.method5006();
		this.aComponent1 = arg0;
		this.aComponent1.addMouseListener(this);
		this.aComponent1.addMouseMotionListener(this);
		this.aComponent1.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!mf", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method5005(arg0);
		if ((local4 & this.anInt5757) == 0) {
			local4 = this.anInt5757;
		}
		if ((local4 & 0x1) != 0) {
			this.method5003(0, 3, arg0.getY(), arg0.getX());
		}
		if ((local4 & 0x4) != 0) {
			this.method5003(0, 5, arg0.getY(), arg0.getX());
		}
		if ((local4 & 0x2) != 0) {
			this.method5003(0, 4, arg0.getY(), arg0.getX());
		}
		this.anInt5757 &= ~local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!mf", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method5004(arg0.getX(), arg0.getY());
	}
}
