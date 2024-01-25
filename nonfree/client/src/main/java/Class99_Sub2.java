import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rk")
public final class Class99_Sub2 extends Class99 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!rk", name = "o", descriptor = "I")
	private int anInt7390;

	@OriginalMember(owner = "client!rk", name = "p", descriptor = "I")
	private int anInt7391;

	@OriginalMember(owner = "client!rk", name = "v", descriptor = "I")
	private int anInt7397;

	@OriginalMember(owner = "client!rk", name = "w", descriptor = "I")
	private int anInt7398;

	@OriginalMember(owner = "client!rk", name = "A", descriptor = "I")
	private int anInt7402;

	@OriginalMember(owner = "client!rk", name = "E", descriptor = "I")
	private int anInt7405;

	@OriginalMember(owner = "client!rk", name = "L", descriptor = "Ljava/awt/Component;")
	private Component aComponent4;

	@OriginalMember(owner = "client!rk", name = "j", descriptor = "Lclient!ui;")
	private Class295 aClass295_45 = new Class295();

	@OriginalMember(owner = "client!rk", name = "J", descriptor = "Lclient!ui;")
	private Class295 aClass295_46 = new Class295();

	@OriginalMember(owner = "client!rk", name = "M", descriptor = "Z")
	private final boolean aBoolean559;

	@OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class99_Sub2(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method6626(arg0);
		this.aBoolean559 = arg1;
	}

	@OriginalMember(owner = "client!rk", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method6628(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(Z)Z")
	@Override
	protected boolean method6616() {
		return (this.anInt7397 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!rk", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method6628(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "(I)I")
	@Override
	public int method6618() {
		return this.anInt7391;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(B)V")
	@Override
	public synchronized void method6613() {
		this.anInt7390 = this.anInt7398;
		this.anInt7397 = this.anInt7405;
		this.anInt7391 = this.anInt7402;
		@Pc(24) Class295 local24 = this.aClass295_45;
		this.aClass295_45 = this.aClass295_46;
		this.aClass295_46 = local24;
		this.aClass295_46.method7541();
	}

	@OriginalMember(owner = "client!rk", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method6628(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!rk", name = "c", descriptor = "(I)I")
	@Override
	public int method6619() {
		return this.anInt7390;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	private void method6626(@OriginalArg(0) Component arg0) {
		this.method6627();
		this.aComponent4 = arg0;
		this.aComponent4.addMouseListener(this);
		this.aComponent4.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!rk", name = "e", descriptor = "(B)V")
	private void method6627() {
		if (this.aComponent4 == null) {
			return;
		}
		this.aComponent4.removeMouseMotionListener(this);
		this.aComponent4.removeMouseListener(this);
		this.anInt7391 = this.anInt7390 = this.anInt7397 = 0;
		this.aClass295_46 = null;
		this.anInt7402 = this.anInt7398 = this.anInt7405 = 0;
		this.aComponent4 = null;
		this.aClass295_45 = null;
	}

	@OriginalMember(owner = "client!rk", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method6628(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(BII)V")
	private void method6628(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt7402 = arg0;
		this.anInt7398 = arg1;
		if (this.aBoolean559) {
			this.method6630(-1, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)I")
	private int method6629(@OriginalArg(0) MouseEvent arg0) {
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

	@OriginalMember(owner = "client!rk", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)V")
	@Override
	public void method6617() {
		this.method6627();
	}

	@OriginalMember(owner = "client!rk", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method6620() {
		return (this.anInt7397 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!rk", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method6629(arg0);
		if ((this.anInt7405 & local8) == 0) {
			local8 = this.anInt7405;
		}
		if ((local8 & 0x1) != 0) {
			this.method6630(3, arg0.getY(), arg0.getX());
		}
		if ((local8 & 0x4) != 0) {
			this.method6630(5, arg0.getY(), arg0.getX());
		}
		if ((local8 & 0x2) != 0) {
			this.method6630(4, arg0.getY(), arg0.getX());
		}
		this.anInt7405 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!rk", name = "e", descriptor = "(I)Z")
	@Override
	protected boolean method6623() {
		return (this.anInt7397 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IZII)V")
	private void method6630(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class1_Sub32_Sub1 local7 = new Class1_Sub32_Sub1();
		local7.anInt5377 = arg2;
		local7.anInt5371 = arg1;
		local7.anInt5373 = arg0;
		local7.aLong138 = Static110.method2222();
		this.aClass295_46.method7533(local7);
	}

	@OriginalMember(owner = "client!rk", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method6629(arg0);
		if (local10 == 1) {
			this.method6630(0, arg0.getY(), arg0.getX());
		} else if (local10 == 4) {
			this.method6630(2, arg0.getY(), arg0.getX());
		} else if (local10 == 2) {
			this.method6630(1, arg0.getY(), arg0.getX());
		}
		this.anInt7405 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!rk", name = "d", descriptor = "(B)Lclient!uf;")
	@Override
	public Class1_Sub32 method6624() {
		return (Class1_Sub32) this.aClass295_45.method7547();
	}
}
