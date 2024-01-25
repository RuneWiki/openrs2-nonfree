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

@OriginalClass("client!gt")
public final class Class3_Sub1 extends Class3 implements MouseListener, MouseMotionListener, MouseWheelListener {

	@OriginalMember(owner = "client!gt", name = "h", descriptor = "I")
	private int anInt3335;

	@OriginalMember(owner = "client!gt", name = "j", descriptor = "I")
	private int anInt3336;

	@OriginalMember(owner = "client!gt", name = "k", descriptor = "I")
	private int anInt3337;

	@OriginalMember(owner = "client!gt", name = "l", descriptor = "I")
	private int anInt3338;

	@OriginalMember(owner = "client!gt", name = "m", descriptor = "I")
	private int anInt3339;

	@OriginalMember(owner = "client!gt", name = "o", descriptor = "I")
	private int anInt3340;

	@OriginalMember(owner = "client!gt", name = "q", descriptor = "Ljava/awt/Component;")
	private Component aComponent4;

	@OriginalMember(owner = "client!gt", name = "i", descriptor = "Lclient!tg;")
	private Class330 aClass330_17 = new Class330();

	@OriginalMember(owner = "client!gt", name = "n", descriptor = "Lclient!tg;")
	private Class330 aClass330_18 = new Class330();

	@OriginalMember(owner = "client!gt", name = "p", descriptor = "Z")
	private final boolean aBoolean233;

	@OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class3_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method2886(arg0);
		this.aBoolean233 = arg1;
	}

	@OriginalMember(owner = "client!gt", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method2887(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(BIIII)V")
	private void method2883(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class5_Sub13_Sub1 local3 = new Class5_Sub13_Sub1();
		local3.anInt2494 = arg1;
		local3.anInt2495 = arg2;
		local3.anInt2496 = arg3;
		local3.aLong74 = Static95.method1587();
		local3.anInt2497 = arg0;
		this.aClass330_18.method7917(local3);
	}

	@OriginalMember(owner = "client!gt", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method2884(arg0);
		if ((local4 & this.anInt3340) == 0) {
			local4 = this.anInt3340;
		}
		if ((local4 & 0x1) != 0) {
			this.method2883(arg0.getClickCount(), arg0.getX(), 3, arg0.getY());
		}
		if ((local4 & 0x4) != 0) {
			this.method2883(arg0.getClickCount(), arg0.getX(), 5, arg0.getY());
		}
		if ((local4 & 0x2) != 0) {
			this.method2883(arg0.getClickCount(), arg0.getX(), 4, arg0.getY());
		}
		this.anInt3340 &= ~local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!gt", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method2884(arg0);
		if (local4 == 1) {
			this.method2883(arg0.getClickCount(), arg0.getX(), 0, arg0.getY());
		} else if (local4 == 4) {
			this.method2883(arg0.getClickCount(), arg0.getX(), 2, arg0.getY());
		} else if (local4 == 2) {
			this.method2883(arg0.getClickCount(), arg0.getX(), 1, arg0.getY());
		}
		this.anInt3340 |= local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!gt", name = "f", descriptor = "(B)V")
	@Override
	public synchronized void method8880() {
		this.anInt3336 = this.anInt3338;
		this.anInt3337 = this.anInt3339;
		this.anInt3335 = this.anInt3340;
		@Pc(14) Class330 local14 = this.aClass330_17;
		this.aClass330_17 = this.aClass330_18;
		this.aClass330_18 = local14;
		this.aClass330_18.method7910();
	}

	@OriginalMember(owner = "client!gt", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8874() {
		return (this.anInt3335 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(I)V")
	@Override
	public void method8871() {
		this.method2885();
	}

	@OriginalMember(owner = "client!gt", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method2887(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;Z)I")
	private int method2884(@OriginalArg(0) MouseEvent arg0) {
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

	@OriginalMember(owner = "client!gt", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method2887(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!gt", name = "e", descriptor = "(I)V")
	private void method2885() {
		if (this.aComponent4 == null) {
			return;
		}
		this.aComponent4.removeMouseWheelListener(this);
		this.aComponent4.removeMouseMotionListener(this);
		this.aComponent4.removeMouseListener(this);
		this.aComponent4 = null;
		this.aClass330_18 = null;
		this.aClass330_17 = null;
		this.anInt3339 = this.anInt3338 = this.anInt3340 = 0;
		this.anInt3337 = this.anInt3336 = this.anInt3335 = 0;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(ZLjava/awt/Component;)V")
	private void method2886(@OriginalArg(1) Component arg0) {
		this.method2885();
		this.aComponent4 = arg0;
		this.aComponent4.addMouseListener(this);
		this.aComponent4.addMouseMotionListener(this);
		this.aComponent4.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(III)V")
	private void method2887(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt3338 = arg0;
		this.anInt3339 = arg1;
		if (this.aBoolean233) {
			this.method2883(0, arg1, -1, arg0);
		}
	}

	@OriginalMember(owner = "client!gt", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(B)Z")
	@Override
	protected boolean method8872() {
		return (this.anInt3335 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!gt", name = "b", descriptor = "(I)Z")
	@Override
	protected boolean method8873() {
		return (this.anInt3335 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!gt", name = "e", descriptor = "(B)I")
	@Override
	public int method8879() {
		return this.anInt3336;
	}

	@OriginalMember(owner = "client!gt", name = "c", descriptor = "(I)I")
	@Override
	public int method8875() {
		return this.anInt3337;
	}

	@OriginalMember(owner = "client!gt", name = "c", descriptor = "(B)Lclient!ck;")
	@Override
	public Class5_Sub13 method8876() {
		return (Class5_Sub13) this.aClass330_17.method7911();
	}

	@OriginalMember(owner = "client!gt", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		@Pc(8) int local8 = arg0.getWheelRotation();
		this.method2883(local8, local2, 6, local5);
		arg0.consume();
	}

	@OriginalMember(owner = "client!gt", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method2887(arg0.getY(), arg0.getX());
	}
}
