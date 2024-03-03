import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!k")
public final class Class119_Sub1 extends Class119 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!k", name = "C", descriptor = "I")
	public static int anInt3334 = 0;

	@OriginalMember(owner = "client!k", name = "m", descriptor = "I")
	private int anInt3319;

	@OriginalMember(owner = "client!k", name = "x", descriptor = "I")
	private int anInt3329;

	@OriginalMember(owner = "client!k", name = "I", descriptor = "I")
	private int anInt3339;

	@OriginalMember(owner = "client!k", name = "K", descriptor = "I")
	private int anInt3341;

	@OriginalMember(owner = "client!k", name = "L", descriptor = "I")
	private int anInt3342;

	@OriginalMember(owner = "client!k", name = "M", descriptor = "I")
	private int anInt3343;

	@OriginalMember(owner = "client!k", name = "P", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!k", name = "p", descriptor = "Lclient!ld;")
	private Class135 aClass135_22 = new Class135();

	@OriginalMember(owner = "client!k", name = "N", descriptor = "Lclient!ld;")
	private Class135 aClass135_23 = new Class135();

	@OriginalMember(owner = "client!k", name = "O", descriptor = "Z")
	private final boolean aBoolean224;

	@OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V", line = 747)
	public Class119_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method3320(arg0);
		this.aBoolean224 = arg1;
	}

	@OriginalMember(owner = "client!k", name = "g", descriptor = "(I)V", line = 3)
	@Override
	public void method3313() {
		this.method3322();
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)V", line = 15)
	private void method3315(@OriginalArg(1) MouseEvent arg0) {
		this.anInt3342 = arg0.getX();
		this.anInt3341 = arg0.getY();
		if (this.aBoolean224) {
			this.method3318(-1, arg0.getX(), arg0.getY());
		}
	}

	@OriginalMember(owner = "client!k", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 407)
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method3315(arg0);
	}

	@OriginalMember(owner = "client!k", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 415)
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IIII)V", line = 425)
	private void method3318(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class2_Sub24_Sub1 local7 = new Class2_Sub24_Sub1();
		local7.anInt5758 = arg1;
		local7.anInt5752 = arg0;
		local7.anInt5754 = arg2;
		local7.aLong175 = Static190.method3686();
		this.aClass135_23.method3541(local7);
	}

	@OriginalMember(owner = "client!k", name = "h", descriptor = "(I)I", line = 454)
	@Override
	public int method3314() {
		return this.anInt3319;
	}

	@OriginalMember(owner = "client!k", name = "c", descriptor = "(B)Z", line = 466)
	@Override
	protected boolean method3310() {
		return (this.anInt3329 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(B)I", line = 479)
	@Override
	public int method3305() {
		return this.anInt3339;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 492)
	private void method3320(@OriginalArg(0) Component arg0) {
		this.method3322();
		this.aComponent1 = arg0;
		this.aComponent1.addMouseListener(this);
		this.aComponent1.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!k", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 506)
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method3315(arg0);
	}

	@OriginalMember(owner = "client!k", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 514)
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.anInt3341 = -1;
		this.anInt3342 = -1;
	}

	@OriginalMember(owner = "client!k", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 529)
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method3315(arg0);
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)I", line = 537)
	private int method3321(@OriginalArg(0) MouseEvent arg0) {
		@Pc(6) int local6 = arg0.getModifiers();
		@Pc(17) boolean local17 = (local6 & 0x10) != 0;
		@Pc(25) boolean local25 = (local6 & 0x8) != 0;
		@Pc(33) boolean local33 = (local6 & 0x4) != 0;
		if (local25 && (local17 || local33)) {
			local25 = false;
		}
		if (local17 && local33) {
			return 4;
		} else if (local17) {
			return 1;
		} else if (local25) {
			return 2;
		} else if (local33) {
			return 4;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!k", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 573)
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method3321(arg0);
		if ((this.anInt3343 & local8) == 0) {
			local8 = this.anInt3343;
		}
		if ((local8 & 0x1) != 0) {
			this.method3318(3, arg0.getX(), arg0.getY());
		}
		if ((local8 & 0x4) != 0) {
			this.method3318(5, arg0.getX(), arg0.getY());
		}
		if ((local8 & 0x2) != 0) {
			this.method3318(4, arg0.getX(), arg0.getY());
		}
		this.anInt3343 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!k", name = "e", descriptor = "(B)V", line = 600)
	private void method3322() {
		if (this.aComponent1 == null) {
			return;
		}
		this.aComponent1.removeMouseListener(this);
		this.aComponent1.removeMouseMotionListener(this);
		this.aClass135_23 = null;
		this.aComponent1 = null;
		this.anInt3339 = this.anInt3319 = this.anInt3329 = 0;
		this.aClass135_22 = null;
		this.anInt3342 = this.anInt3341 = this.anInt3343 = 0;
	}

	@OriginalMember(owner = "client!k", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 626)
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method3321(arg0);
		if (local10 == 1) {
			this.method3318(0, arg0.getX(), arg0.getY());
		} else if (local10 == 4) {
			this.method3318(2, arg0.getX(), arg0.getY());
		} else if (local10 == 2) {
			this.method3318(1, arg0.getX(), arg0.getY());
		}
		this.anInt3343 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(I)Z", line = 655)
	@Override
	protected boolean method3304() {
		return (this.anInt3329 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!k", name = "c", descriptor = "(I)V", line = 668)
	@Override
	public synchronized void method3308() {
		this.anInt3319 = this.anInt3341;
		this.anInt3339 = this.anInt3342;
		this.anInt3329 = this.anInt3343;
		@Pc(25) Class135 local25 = this.aClass135_22;
		this.aClass135_22 = this.aClass135_23;
		this.aClass135_23 = local25;
		this.aClass135_23.method3545();
	}

	@OriginalMember(owner = "client!k", name = "f", descriptor = "(I)Z", line = 709)
	@Override
	public boolean method3312() {
		return (this.anInt3329 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!k", name = "d", descriptor = "(I)Lclient!lm;", line = 724)
	@Override
	public Class2_Sub24 method3309() {
		return (Class2_Sub24) this.aClass135_22.method3550();
	}
}
