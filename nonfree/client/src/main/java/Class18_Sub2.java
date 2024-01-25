import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class18_Sub2 extends Class18 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!jc", name = "F", descriptor = "I")
	private int anInt4567;

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "I")
	private int anInt4570;

	@OriginalMember(owner = "client!jc", name = "r", descriptor = "I")
	private int anInt4580;

	@OriginalMember(owner = "client!jc", name = "G", descriptor = "I")
	private int anInt4584;

	@OriginalMember(owner = "client!jc", name = "u", descriptor = "I")
	private int anInt4585;

	@OriginalMember(owner = "client!jc", name = "E", descriptor = "I")
	private int anInt4590;

	@OriginalMember(owner = "client!jc", name = "q", descriptor = "Ljava/awt/Component;")
	private Component aComponent3;

	@OriginalMember(owner = "client!jc", name = "B", descriptor = "Lclient!sja;")
	private Class342 aClass342_40 = new Class342();

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "Lclient!sja;")
	private Class342 aClass342_41 = new Class342();

	@OriginalMember(owner = "client!jc", name = "n", descriptor = "Z")
	private final boolean aBoolean295;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class18_Sub2(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method4209(arg0);
		this.aBoolean295 = arg1;
	}

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "(I)Z")
	@Override
	protected boolean method4191() {
		return (this.anInt4580 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!jc", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method4208(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!jc", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method4207(arg0);
		if (local10 == 1) {
			this.method4206(arg0.getX(), 0, arg0.getClickCount(), arg0.getY());
		} else if (local10 == 4) {
			this.method4206(arg0.getX(), 2, arg0.getClickCount(), arg0.getY());
		} else if (local10 == 2) {
			this.method4206(arg0.getX(), 1, arg0.getClickCount(), arg0.getY());
		}
		this.anInt4585 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!jc", name = "h", descriptor = "(I)V")
	private void method4202() {
		if (this.aComponent3 == null) {
			return;
		}
		this.aComponent3.removeMouseMotionListener(this);
		this.aComponent3.removeMouseListener(this);
		this.aComponent3 = null;
		this.aClass342_40 = null;
		this.anInt4590 = this.anInt4584 = this.anInt4585 = 0;
		this.anInt4567 = this.anInt4570 = this.anInt4580 = 0;
		this.aClass342_41 = null;
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(B)I")
	@Override
	public int method4192() {
		return this.anInt4567;
	}

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(I)V")
	@Override
	public void method4197() {
		this.method4202();
	}

	@OriginalMember(owner = "client!jc", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method4207(arg0);
		if ((this.anInt4585 & local8) == 0) {
			local8 = this.anInt4585;
		}
		if ((local8 & 0x1) != 0) {
			this.method4206(arg0.getX(), 3, arg0.getClickCount(), arg0.getY());
		}
		if ((local8 & 0x4) != 0) {
			this.method4206(arg0.getX(), 5, arg0.getClickCount(), arg0.getY());
		}
		if ((local8 & 0x2) != 0) {
			this.method4206(arg0.getX(), 4, arg0.getClickCount(), arg0.getY());
		}
		this.anInt4585 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method4200() {
		return (this.anInt4580 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!jc", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method4208(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!jc", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method4208(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)Z")
	@Override
	protected boolean method4201() {
		return (this.anInt4580 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!jc", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IBIII)V")
	private void method4206(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class3_Sub23_Sub2 local7 = new Class3_Sub23_Sub2();
		local7.anInt3526 = arg2;
		local7.anInt3520 = arg3;
		local7.anInt3523 = arg0;
		local7.anInt3528 = arg1;
		local7.aLong135 = Static517.method6965();
		this.aClass342_41.method7654(local7);
	}

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "(I)V")
	@Override
	public synchronized void method4195() {
		this.anInt4567 = this.anInt4590;
		this.anInt4580 = this.anInt4585;
		this.anInt4570 = this.anInt4584;
		@Pc(18) Class342 local18 = this.aClass342_40;
		this.aClass342_40 = this.aClass342_41;
		this.aClass342_41 = local18;
		this.aClass342_41.method7655();
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)I")
	private int method4207(@OriginalArg(1) MouseEvent arg0) {
		@Pc(6) int local6 = arg0.getModifiers();
		@Pc(15) boolean local15 = (local6 & 0x10) != 0;
		@Pc(27) boolean local27 = (local6 & 0x8) != 0;
		@Pc(36) boolean local36 = (local6 & 0x4) != 0;
		if (local27 && (local15 || local36)) {
			local27 = false;
		}
		if (local15 && local36) {
			return 4;
		} else if (local15) {
			return 1;
		} else if (local27) {
			return 2;
		} else if (local36) {
			return 4;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(III)V")
	private void method4208(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt4584 = arg0;
		this.anInt4590 = arg1;
		if (this.aBoolean295) {
			this.method4206(arg1, -1, 0, arg0);
		}
	}

	@OriginalMember(owner = "client!jc", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method4208(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)Lclient!mn;")
	@Override
	public Class3_Sub23 method4198() {
		return (Class3_Sub23) this.aClass342_40.method7653();
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	private void method4209(@OriginalArg(0) Component arg0) {
		this.method4202();
		this.aComponent3 = arg0;
		this.aComponent3.addMouseListener(this);
		this.aComponent3.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "(I)I")
	@Override
	public int method4196() {
		return this.anInt4570;
	}
}
