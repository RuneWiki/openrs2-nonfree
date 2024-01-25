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

@OriginalClass("client!vf")
public final class Class5_Sub2 extends Class5 implements MouseListener, MouseMotionListener, MouseWheelListener {

	@OriginalMember(owner = "client!vf", name = "h", descriptor = "I")
	private int anInt8609;

	@OriginalMember(owner = "client!vf", name = "i", descriptor = "I")
	private int anInt8610;

	@OriginalMember(owner = "client!vf", name = "j", descriptor = "I")
	private int anInt8611;

	@OriginalMember(owner = "client!vf", name = "k", descriptor = "I")
	private int anInt8612;

	@OriginalMember(owner = "client!vf", name = "l", descriptor = "I")
	private int anInt8613;

	@OriginalMember(owner = "client!vf", name = "m", descriptor = "I")
	private int anInt8614;

	@OriginalMember(owner = "client!vf", name = "p", descriptor = "Ljava/awt/Component;")
	private Component aComponent4;

	@OriginalMember(owner = "client!vf", name = "g", descriptor = "Lclient!bv;")
	private Class37 aClass37_101 = new Class37();

	@OriginalMember(owner = "client!vf", name = "n", descriptor = "Lclient!bv;")
	private Class37 aClass37_102 = new Class37();

	@OriginalMember(owner = "client!vf", name = "o", descriptor = "Z")
	private final boolean aBoolean610;

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class5_Sub2(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method7057(arg0);
		this.aBoolean610 = arg1;
	}

	@OriginalMember(owner = "client!vf", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method7055(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IBI)V")
	private void method7055(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt8612 = arg0;
		this.anInt8614 = arg1;
		if (this.aBoolean610) {
			this.method7056(arg1, -1, 0, arg0);
		}
	}

	@OriginalMember(owner = "client!vf", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method7055(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!vf", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method7058(arg0);
		if ((this.anInt8613 & local4) == 0) {
			local4 = this.anInt8613;
		}
		if ((local4 & 0x1) != 0) {
			this.method7056(arg0.getY(), 3, 0, arg0.getX());
		}
		if ((local4 & 0x4) != 0) {
			this.method7056(arg0.getY(), 5, 0, arg0.getX());
		}
		if ((local4 & 0x2) != 0) {
			this.method7056(arg0.getY(), 4, 0, arg0.getX());
		}
		this.anInt8613 &= ~local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIII)V")
	private void method7056(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class1_Sub13_Sub1 local3 = new Class1_Sub13_Sub1();
		local3.anInt2017 = arg3;
		local3.anInt2019 = arg1;
		local3.anInt2018 = arg0;
		local3.aLong88 = Static60.method1119();
		local3.anInt2016 = arg2;
		this.aClass37_102.method970(local3);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Z)V")
	@Override
	public void method7047() {
		this.method7059();
	}

	@OriginalMember(owner = "client!vf", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method7055(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(Z)Z")
	@Override
	protected boolean method7048() {
		return (this.anInt8610 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(ILjava/awt/Component;)V")
	private void method7057(@OriginalArg(1) Component arg0) {
		this.method7059();
		this.aComponent4 = arg0;
		this.aComponent4.addMouseListener(this);
		this.aComponent4.addMouseMotionListener(this);
		this.aComponent4.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(I)Lclient!sda;")
	@Override
	public Class1_Sub13 method7043() {
		return (Class1_Sub13) this.aClass37_101.method973();
	}

	@OriginalMember(owner = "client!vf", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method7058(arg0);
		if (local4 == 1) {
			this.method7056(arg0.getY(), 0, 0, arg0.getX());
		} else if (local4 == 4) {
			this.method7056(arg0.getY(), 2, 0, arg0.getX());
		} else if (local4 == 2) {
			this.method7056(arg0.getY(), 1, 0, arg0.getX());
		}
		this.anInt8613 |= local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(B)I")
	@Override
	public int method7052() {
		return this.anInt8609;
	}

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7044() {
		return (this.anInt8610 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(BLjava/awt/event/MouseEvent;)I")
	private int method7058(@OriginalArg(1) MouseEvent arg0) {
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

	@OriginalMember(owner = "client!vf", name = "f", descriptor = "(I)V")
	private void method7059() {
		if (this.aComponent4 == null) {
			return;
		}
		this.aComponent4.removeMouseWheelListener(this);
		this.aComponent4.removeMouseMotionListener(this);
		this.aComponent4.removeMouseListener(this);
		this.aClass37_101 = null;
		this.anInt8609 = this.anInt8611 = this.anInt8610 = 0;
		this.anInt8612 = this.anInt8614 = this.anInt8613 = 0;
		this.aClass37_102 = null;
		this.aComponent4 = null;
	}

	@OriginalMember(owner = "client!vf", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		@Pc(8) int local8 = arg0.getWheelRotation();
		this.method7056(local5, 6, local8, local2);
		arg0.consume();
	}

	@OriginalMember(owner = "client!vf", name = "e", descriptor = "(I)V")
	@Override
	public synchronized void method7054() {
		this.anInt8611 = this.anInt8614;
		this.anInt8610 = this.anInt8613;
		this.anInt8609 = this.anInt8612;
		@Pc(22) Class37 local22 = this.aClass37_101;
		this.aClass37_101 = this.aClass37_102;
		this.aClass37_102 = local22;
		this.aClass37_102.method967();
	}

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "(I)Z")
	@Override
	protected boolean method7045() {
		return (this.anInt8610 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)I")
	@Override
	public int method7042() {
		return this.anInt8611;
	}

	@OriginalMember(owner = "client!vf", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!vf", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method7055(arg0.getX(), arg0.getY());
	}
}
