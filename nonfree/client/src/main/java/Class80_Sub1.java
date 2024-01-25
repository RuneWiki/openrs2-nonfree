import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gf")
public final class Class80_Sub1 extends Class80 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!gf", name = "q", descriptor = "I")
	private int anInt2631;

	@OriginalMember(owner = "client!gf", name = "A", descriptor = "I")
	private int anInt2640;

	@OriginalMember(owner = "client!gf", name = "J", descriptor = "I")
	private int anInt2649;

	@OriginalMember(owner = "client!gf", name = "M", descriptor = "I")
	private int anInt2651;

	@OriginalMember(owner = "client!gf", name = "N", descriptor = "I")
	private int anInt2652;

	@OriginalMember(owner = "client!gf", name = "O", descriptor = "I")
	private int anInt2653;

	@OriginalMember(owner = "client!gf", name = "R", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!gf", name = "v", descriptor = "Lclient!pk;")
	private Class183 aClass183_16 = new Class183();

	@OriginalMember(owner = "client!gf", name = "L", descriptor = "Lclient!pk;")
	private Class183 aClass183_17 = new Class183();

	@OriginalMember(owner = "client!gf", name = "Q", descriptor = "Z")
	private final boolean aBoolean242;

	@OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class80_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method2245(arg0);
		this.aBoolean242 = arg1;
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(B)I")
	@Override
	public int method2234() {
		return this.anInt2631;
	}

	@OriginalMember(owner = "client!gf", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method2235() {
		return (this.anInt2649 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!gf", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.anInt2653 = -1;
		this.anInt2652 = -1;
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)Z")
	@Override
	protected boolean method2229() {
		return (this.anInt2649 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(Z)V")
	private void method2239() {
		if (this.aComponent1 == null) {
			return;
		}
		this.aComponent1.removeMouseListener(this);
		this.aComponent1.removeMouseMotionListener(this);
		this.aComponent1 = null;
		this.aClass183_16 = null;
		this.anInt2652 = this.anInt2653 = this.anInt2651 = 0;
		this.anInt2631 = this.anInt2640 = this.anInt2649 = 0;
		this.aClass183_17 = null;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)I")
	private int method2240(@OriginalArg(0) MouseEvent arg0) {
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

	@OriginalMember(owner = "client!gf", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method2240(arg0);
		if ((local8 & this.anInt2651) == 0) {
			local8 = this.anInt2651;
		}
		if ((local8 & 0x1) != 0) {
			this.method2243(arg0.getX(), arg0.getY(), 3);
		}
		if ((local8 & 0x4) != 0) {
			this.method2243(arg0.getX(), arg0.getY(), 5);
		}
		if ((local8 & 0x2) != 0) {
			this.method2243(arg0.getX(), arg0.getY(), 4);
		}
		this.anInt2651 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!gf", name = "f", descriptor = "(I)V")
	@Override
	public synchronized void method2236() {
		this.anInt2631 = this.anInt2652;
		this.anInt2640 = this.anInt2653;
		this.anInt2649 = this.anInt2651;
		@Pc(25) Class183 local25 = this.aClass183_16;
		this.aClass183_16 = this.aClass183_17;
		this.aClass183_17 = local25;
		this.aClass183_17.method4138();
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIBI)V")
	private void method2243(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class4_Sub5_Sub1 local7 = new Class4_Sub5_Sub1();
		local7.anInt449 = arg0;
		local7.anInt455 = arg1;
		local7.anInt451 = arg2;
		local7.aLong23 = Static282.method3962();
		this.aClass183_17.method4137(local7);
	}

	@OriginalMember(owner = "client!gf", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method2244(arg0);
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;Z)V")
	private void method2244(@OriginalArg(0) MouseEvent arg0) {
		this.anInt2652 = arg0.getX();
		this.anInt2653 = arg0.getY();
		if (this.aBoolean242) {
			this.method2243(arg0.getX(), arg0.getY(), -1);
		}
	}

	@OriginalMember(owner = "client!gf", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!gf", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method2240(arg0);
		if (local10 == 1) {
			this.method2243(arg0.getX(), arg0.getY(), 0);
		} else if (local10 == 4) {
			this.method2243(arg0.getX(), arg0.getY(), 2);
		} else if (local10 == 2) {
			this.method2243(arg0.getX(), arg0.getY(), 1);
		}
		this.anInt2651 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	private void method2245(@OriginalArg(0) Component arg0) {
		this.method2239();
		this.aComponent1 = arg0;
		this.aComponent1.addMouseListener(this);
		this.aComponent1.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!gf", name = "c", descriptor = "(I)I")
	@Override
	public int method2230() {
		return this.anInt2640;
	}

	@OriginalMember(owner = "client!gf", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method2244(arg0);
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Z)V")
	@Override
	public void method2227() {
		this.method2239();
	}

	@OriginalMember(owner = "client!gf", name = "c", descriptor = "(B)Z")
	@Override
	protected boolean method2237() {
		return (this.anInt2649 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!gf", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method2244(arg0);
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)Lclient!os;")
	@Override
	public Class4_Sub5 method2232() {
		return (Class4_Sub5) this.aClass183_16.method4136();
	}
}
