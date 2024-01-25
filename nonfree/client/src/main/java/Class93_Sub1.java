import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hl")
public final class Class93_Sub1 extends Class93 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!hl", name = "k", descriptor = "I")
	private int anInt2693;

	@OriginalMember(owner = "client!hl", name = "p", descriptor = "I")
	private int anInt2697;

	@OriginalMember(owner = "client!hl", name = "D", descriptor = "I")
	private int anInt2710;

	@OriginalMember(owner = "client!hl", name = "N", descriptor = "I")
	private int anInt2715;

	@OriginalMember(owner = "client!hl", name = "Q", descriptor = "I")
	private int anInt2717;

	@OriginalMember(owner = "client!hl", name = "R", descriptor = "I")
	private int anInt2718;

	@OriginalMember(owner = "client!hl", name = "T", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!hl", name = "M", descriptor = "Lclient!sf;")
	private Class180 aClass180_20 = new Class180();

	@OriginalMember(owner = "client!hl", name = "S", descriptor = "Lclient!sf;")
	private Class180 aClass180_21 = new Class180();

	@OriginalMember(owner = "client!hl", name = "U", descriptor = "Z")
	private final boolean aBoolean259;

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class93_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method2477(arg0);
		this.aBoolean259 = arg1;
	}

	@OriginalMember(owner = "client!hl", name = "e", descriptor = "(B)I")
	@Override
	public int method2470() {
		return this.anInt2697;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	private void method2477(@OriginalArg(0) Component arg0) {
		this.method2483();
		this.aComponent2 = arg0;
		this.aComponent2.addMouseListener(this);
		this.aComponent2.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!hl", name = "f", descriptor = "(B)V")
	@Override
	public synchronized void method2473() {
		this.anInt2693 = this.anInt2718;
		this.anInt2710 = this.anInt2715;
		this.anInt2697 = this.anInt2717;
		@Pc(18) Class180 local18 = this.aClass180_20;
		this.aClass180_20 = this.aClass180_21;
		this.aClass180_21 = local18;
		this.aClass180_21.method4917();
	}

	@OriginalMember(owner = "client!hl", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.anInt2715 = -1;
		this.anInt2717 = -1;
	}

	@OriginalMember(owner = "client!hl", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method2481(arg0);
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)I")
	private int method2478(@OriginalArg(1) MouseEvent arg0) {
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

	@OriginalMember(owner = "client!hl", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method2478(arg0);
		if (local10 == 1) {
			this.method2480(arg0.getY(), 0, arg0.getX());
		} else if (local10 == 4) {
			this.method2480(arg0.getY(), 2, arg0.getX());
		} else if (local10 == 2) {
			this.method2480(arg0.getY(), 1, arg0.getX());
		}
		this.anInt2718 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!hl", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method2478(arg0);
		if ((local8 & this.anInt2718) == 0) {
			local8 = this.anInt2718;
		}
		if ((local8 & 0x1) != 0) {
			this.method2480(arg0.getY(), 3, arg0.getX());
		}
		if ((local8 & 0x4) != 0) {
			this.method2480(arg0.getY(), 5, arg0.getX());
		}
		if ((local8 & 0x2) != 0) {
			this.method2480(arg0.getY(), 4, arg0.getX());
		}
		this.anInt2718 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!hl", name = "c", descriptor = "(I)Z")
	@Override
	protected boolean method2468() {
		return (this.anInt2693 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IZII)V")
	private void method2480(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class2_Sub1_Sub1 local11 = new Class2_Sub1_Sub1();
		local11.anInt52 = arg0;
		local11.anInt47 = arg1;
		local11.anInt56 = arg2;
		local11.aLong4 = Static22.method285();
		this.aClass180_21.method4909(local11);
	}

	@OriginalMember(owner = "client!hl", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method2481(arg0);
	}

	@OriginalMember(owner = "client!hl", name = "c", descriptor = "(B)Lclient!hc;")
	@Override
	public Class2_Sub1 method2467() {
		return (Class2_Sub1) this.aClass180_20.method4914();
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(ZLjava/awt/event/MouseEvent;)V")
	private void method2481(@OriginalArg(1) MouseEvent arg0) {
		this.anInt2717 = arg0.getX();
		this.anInt2715 = arg0.getY();
		if (this.aBoolean259) {
			this.method2480(arg0.getY(), -1, arg0.getX());
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method2462() {
		return (this.anInt2693 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!hl", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method2481(arg0);
	}

	@OriginalMember(owner = "client!hl", name = "f", descriptor = "(I)V")
	private void method2483() {
		if (this.aComponent2 == null) {
			return;
		}
		this.aComponent2.removeMouseListener(this);
		this.aComponent2.removeMouseMotionListener(this);
		this.aComponent2 = null;
		this.aClass180_21 = null;
		this.aClass180_20 = null;
		this.anInt2697 = this.anInt2710 = this.anInt2693 = 0;
		this.anInt2717 = this.anInt2715 = this.anInt2718 = 0;
	}

	@OriginalMember(owner = "client!hl", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!hl", name = "d", descriptor = "(I)Z")
	@Override
	protected boolean method2472() {
		return (this.anInt2693 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "(I)I")
	@Override
	public int method2466() {
		return this.anInt2710;
	}

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "(Z)V")
	@Override
	public void method2475() {
		this.method2483();
	}
}
