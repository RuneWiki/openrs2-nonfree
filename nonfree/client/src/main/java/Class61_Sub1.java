import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class Class61_Sub1 extends Class61 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!ie", name = "o", descriptor = "I")
	private int anInt2751;

	@OriginalMember(owner = "client!ie", name = "v", descriptor = "I")
	private int anInt2758;

	@OriginalMember(owner = "client!ie", name = "z", descriptor = "I")
	private int anInt2761;

	@OriginalMember(owner = "client!ie", name = "R", descriptor = "I")
	private int anInt2777;

	@OriginalMember(owner = "client!ie", name = "S", descriptor = "I")
	private int anInt2778;

	@OriginalMember(owner = "client!ie", name = "T", descriptor = "I")
	private int anInt2779;

	@OriginalMember(owner = "client!ie", name = "W", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!ie", name = "A", descriptor = "Lclient!wq;")
	private Class216 aClass216_28 = new Class216();

	@OriginalMember(owner = "client!ie", name = "U", descriptor = "Lclient!wq;")
	private Class216 aClass216_29 = new Class216();

	@OriginalMember(owner = "client!ie", name = "V", descriptor = "Z")
	private final boolean aBoolean240;

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class61_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method2665(arg0);
		this.aBoolean240 = arg1;
	}

	@OriginalMember(owner = "client!ie", name = "e", descriptor = "(I)I")
	@Override
	public int method2658() {
		return this.anInt2751;
	}

	@OriginalMember(owner = "client!ie", name = "f", descriptor = "(I)I")
	@Override
	public int method2659() {
		return this.anInt2758;
	}

	@OriginalMember(owner = "client!ie", name = "i", descriptor = "(I)V")
	@Override
	public synchronized void method2664() {
		this.anInt2761 = this.anInt2777;
		this.anInt2758 = this.anInt2778;
		this.anInt2751 = this.anInt2779;
		@Pc(18) Class216 local18 = this.aClass216_28;
		this.aClass216_28 = this.aClass216_29;
		this.aClass216_29 = local18;
		this.aClass216_29.method5991();
	}

	@OriginalMember(owner = "client!ie", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	private void method2665(@OriginalArg(0) Component arg0) {
		this.method2673();
		this.aComponent1 = arg0;
		this.aComponent1.addMouseListener(this);
		this.aComponent1.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!ie", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method2668(arg0);
	}

	@OriginalMember(owner = "client!ie", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method2670(arg0);
		if ((local8 & this.anInt2777) == 0) {
			local8 = this.anInt2777;
		}
		if ((local8 & 0x1) != 0) {
			this.method2672(arg0.getY(), arg0.getX(), 3);
		}
		if ((local8 & 0x4) != 0) {
			this.method2672(arg0.getY(), arg0.getX(), 5);
		}
		if ((local8 & 0x2) != 0) {
			this.method2672(arg0.getY(), arg0.getX(), 4);
		}
		this.anInt2777 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)Z")
	@Override
	protected boolean method2653() {
		return (this.anInt2761 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!ie", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method2668(arg0);
	}

	@OriginalMember(owner = "client!ie", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method2670(arg0);
		if (local10 == 1) {
			this.method2672(arg0.getY(), arg0.getX(), 0);
		} else if (local10 == 4) {
			this.method2672(arg0.getY(), arg0.getX(), 2);
		} else if (local10 == 2) {
			this.method2672(arg0.getY(), arg0.getX(), 1);
		}
		this.anInt2777 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "(I)Z")
	@Override
	protected boolean method2655() {
		return (this.anInt2761 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!ie", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.anInt2778 = -1;
		this.anInt2779 = -1;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;B)V")
	private void method2668(@OriginalArg(0) MouseEvent arg0) {
		this.anInt2779 = arg0.getX();
		this.anInt2778 = arg0.getY();
		if (this.aBoolean240) {
			this.method2672(arg0.getY(), arg0.getX(), -1);
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)I")
	private int method2670(@OriginalArg(0) MouseEvent arg0) {
		@Pc(6) int local6 = arg0.getModifiers();
		@Pc(14) boolean local14 = (local6 & 0x10) != 0;
		@Pc(32) boolean local32 = (local6 & 0x8) != 0;
		@Pc(40) boolean local40 = (local6 & 0x4) != 0;
		if (local32 && (local14 || local40)) {
			local32 = false;
		}
		if (local14 && local40) {
			return 4;
		} else if (local14) {
			return 1;
		} else if (local32) {
			return 2;
		} else if (local40) {
			return 4;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ie", name = "h", descriptor = "(I)Lclient!ka;")
	@Override
	public Class2_Sub16 method2663() {
		return (Class2_Sub16) this.aClass216_28.method5999();
	}

	@OriginalMember(owner = "client!ie", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method2668(arg0);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIII)V")
	private void method2672(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class2_Sub16_Sub1 local7 = new Class2_Sub16_Sub1();
		local7.anInt1497 = arg0;
		local7.anInt1502 = arg1;
		local7.anInt1509 = arg2;
		local7.aLong46 = Static51.method1197();
		this.aClass216_29.method5995(local7);
	}

	@OriginalMember(owner = "client!ie", name = "k", descriptor = "(I)V")
	private void method2673() {
		if (this.aComponent1 == null) {
			return;
		}
		this.aComponent1.removeMouseListener(this);
		this.aComponent1.removeMouseMotionListener(this);
		this.aClass216_28 = null;
		this.anInt2779 = this.anInt2778 = this.anInt2777 = 0;
		this.aClass216_29 = null;
		this.aComponent1 = null;
		this.anInt2751 = this.anInt2758 = this.anInt2761 = 0;
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method2660() {
		return (this.anInt2761 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V")
	@Override
	public void method2652() {
		this.method2673();
	}
}
