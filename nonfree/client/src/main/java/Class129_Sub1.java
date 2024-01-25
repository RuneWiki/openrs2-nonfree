import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jt")
public final class Class129_Sub1 extends Class129 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!jt", name = "o", descriptor = "I")
	private int anInt3257;

	@OriginalMember(owner = "client!jt", name = "s", descriptor = "I")
	private int anInt3261;

	@OriginalMember(owner = "client!jt", name = "A", descriptor = "I")
	private int anInt3268;

	@OriginalMember(owner = "client!jt", name = "E", descriptor = "I")
	private int anInt3272;

	@OriginalMember(owner = "client!jt", name = "G", descriptor = "I")
	private int anInt3273;

	@OriginalMember(owner = "client!jt", name = "J", descriptor = "I")
	private int anInt3275;

	@OriginalMember(owner = "client!jt", name = "K", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!jt", name = "k", descriptor = "Lclient!cf;")
	private Class30 aClass30_20 = new Class30();

	@OriginalMember(owner = "client!jt", name = "F", descriptor = "Lclient!cf;")
	private Class30 aClass30_21 = new Class30();

	@OriginalMember(owner = "client!jt", name = "L", descriptor = "Z")
	private final boolean aBoolean246;

	@OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class129_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method3003(arg0);
		this.aBoolean246 = arg1;
	}

	@OriginalMember(owner = "client!jt", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.anInt3273 = -1;
		this.anInt3272 = -1;
	}

	@OriginalMember(owner = "client!jt", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method3007(arg0);
	}

	@OriginalMember(owner = "client!jt", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method3002(arg0);
		if (local10 == 1) {
			this.method3001(0, arg0.getX(), arg0.getY());
		} else if (local10 == 4) {
			this.method3001(2, arg0.getX(), arg0.getY());
		} else if (local10 == 2) {
			this.method3001(1, arg0.getX(), arg0.getY());
		}
		this.anInt3275 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(IIII)V")
	private void method3001(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class2_Sub19_Sub1 local7 = new Class2_Sub19_Sub1();
		local7.anInt2456 = arg0;
		local7.anInt2461 = arg1;
		local7.anInt2454 = arg2;
		local7.aLong85 = Static39.method699();
		this.aClass30_21.method685(local7);
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method2988() {
		this.anInt3268 = this.anInt3275;
		this.anInt3257 = this.anInt3273;
		this.anInt3261 = this.anInt3272;
		@Pc(18) Class30 local18 = this.aClass30_20;
		this.aClass30_20 = this.aClass30_21;
		this.aClass30_21 = local18;
		this.aClass30_21.method692();
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;B)I")
	private int method3002(@OriginalArg(0) MouseEvent arg0) {
		@Pc(6) int local6 = arg0.getModifiers();
		@Pc(14) boolean local14 = (local6 & 0x10) != 0;
		@Pc(22) boolean local22 = (local6 & 0x8) != 0;
		@Pc(30) boolean local30 = (local6 & 0x4) != 0;
		if (local22 && (local14 || local30)) {
			local22 = false;
		}
		if (local14 && local30) {
			return 4;
		} else if (local14) {
			return 1;
		} else if (local22) {
			return 2;
		} else if (local30) {
			return 4;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	private void method3003(@OriginalArg(0) Component arg0) {
		this.method3005();
		this.aComponent2 = arg0;
		this.aComponent2.addMouseListener(this);
		this.aComponent2.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!jt", name = "d", descriptor = "(Z)V")
	@Override
	public void method2998() {
		this.method3005();
	}

	@OriginalMember(owner = "client!jt", name = "f", descriptor = "(I)V")
	private void method3005() {
		if (this.aComponent2 == null) {
			return;
		}
		this.aComponent2.removeMouseListener(this);
		this.aComponent2.removeMouseMotionListener(this);
		this.aComponent2 = null;
		this.anInt3261 = this.anInt3257 = this.anInt3268 = 0;
		this.anInt3272 = this.anInt3273 = this.anInt3275 = 0;
		this.aClass30_20 = null;
		this.aClass30_21 = null;
	}

	@OriginalMember(owner = "client!jt", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method3007(arg0);
	}

	@OriginalMember(owner = "client!jt", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method3002(arg0);
		if ((this.anInt3275 & local8) == 0) {
			local8 = this.anInt3275;
		}
		if ((local8 & 0x1) != 0) {
			this.method3001(3, arg0.getX(), arg0.getY());
		}
		if ((local8 & 0x4) != 0) {
			this.method3001(5, arg0.getX(), arg0.getY());
		}
		if ((local8 & 0x2) != 0) {
			this.method3001(4, arg0.getX(), arg0.getY());
		}
		this.anInt3275 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!jt", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!jt", name = "d", descriptor = "(I)Z")
	@Override
	protected boolean method2996() {
		return (this.anInt3268 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(B)I")
	@Override
	public int method2997() {
		return this.anInt3261;
	}

	@OriginalMember(owner = "client!jt", name = "b", descriptor = "(I)Z")
	@Override
	protected boolean method2991() {
		return (this.anInt3268 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!jt", name = "b", descriptor = "(Ljava/awt/event/MouseEvent;B)V")
	private void method3007(@OriginalArg(0) MouseEvent arg0) {
		this.anInt3272 = arg0.getX();
		this.anInt3273 = arg0.getY();
		if (this.aBoolean246) {
			this.method3001(-1, arg0.getX(), arg0.getY());
		}
	}

	@OriginalMember(owner = "client!jt", name = "c", descriptor = "(Z)Lclient!jm;")
	@Override
	public Class2_Sub19 method2994() {
		return (Class2_Sub19) this.aClass30_20.method695();
	}

	@OriginalMember(owner = "client!jt", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method3007(arg0);
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(Z)I")
	@Override
	public int method2989() {
		return this.anInt3257;
	}

	@OriginalMember(owner = "client!jt", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method2990() {
		return (this.anInt3268 & 0x1) != 0;
	}
}
