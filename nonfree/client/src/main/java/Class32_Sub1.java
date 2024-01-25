import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mc")
public final class Class32_Sub1 extends Class32 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
	private int anInt4226;

	@OriginalMember(owner = "client!mc", name = "i", descriptor = "I")
	private int anInt4229;

	@OriginalMember(owner = "client!mc", name = "u", descriptor = "I")
	private int anInt4240;

	@OriginalMember(owner = "client!mc", name = "F", descriptor = "I")
	private int anInt4248;

	@OriginalMember(owner = "client!mc", name = "G", descriptor = "I")
	private int anInt4249;

	@OriginalMember(owner = "client!mc", name = "H", descriptor = "I")
	private int anInt4250;

	@OriginalMember(owner = "client!mc", name = "M", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!mc", name = "g", descriptor = "Lclient!ko;")
	private Class142 aClass142_23 = new Class142();

	@OriginalMember(owner = "client!mc", name = "L", descriptor = "Lclient!ko;")
	private Class142 aClass142_24 = new Class142();

	@OriginalMember(owner = "client!mc", name = "N", descriptor = "Z")
	private final boolean aBoolean335;

	static {
		new Class96(" days.", " Tage.", " jours.", " dias.");
	}

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class32_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method3531(arg0);
		this.aBoolean335 = arg1;
	}

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "(I)Lclient!lf;")
	@Override
	public Class1_Sub22 method3523() {
		return (Class1_Sub22) this.aClass142_23.method3196();
	}

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "(I)Z")
	@Override
	protected boolean method3521() {
		return (this.anInt4240 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)V")
	private void method3527(@OriginalArg(0) MouseEvent arg0) {
		this.anInt4250 = arg0.getX();
		this.anInt4249 = arg0.getY();
		if (this.aBoolean335) {
			this.method3530(arg0.getY(), -1, arg0.getX());
		}
	}

	@OriginalMember(owner = "client!mc", name = "f", descriptor = "(I)V")
	@Override
	public synchronized void method3525() {
		this.anInt4229 = this.anInt4249;
		this.anInt4226 = this.anInt4250;
		this.anInt4240 = this.anInt4248;
		@Pc(24) Class142 local24 = this.aClass142_23;
		this.aClass142_23 = this.aClass142_24;
		this.aClass142_24 = local24;
		this.aClass142_24.method3206();
	}

	@OriginalMember(owner = "client!mc", name = "g", descriptor = "(I)V")
	private void method3529() {
		if (this.aComponent2 == null) {
			return;
		}
		this.aComponent2.removeMouseListener(this);
		this.aComponent2.removeMouseMotionListener(this);
		this.aClass142_24 = null;
		this.aClass142_23 = null;
		this.anInt4250 = this.anInt4249 = this.anInt4248 = 0;
		this.anInt4226 = this.anInt4229 = this.anInt4240 = 0;
		this.aComponent2 = null;
	}

	@OriginalMember(owner = "client!mc", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method3527(arg0);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIB)V")
	private void method3530(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(15) Class1_Sub22_Sub1 local15 = new Class1_Sub22_Sub1();
		local15.anInt3423 = arg2;
		local15.anInt3426 = arg1;
		local15.anInt3427 = arg0;
		local15.aLong103 = Static107.method1707();
		this.aClass142_24.method3212(local15);
	}

	@OriginalMember(owner = "client!mc", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method3532(arg0);
		if (local10 == 1) {
			this.method3530(arg0.getY(), 0, arg0.getX());
		} else if (local10 == 4) {
			this.method3530(arg0.getY(), 2, arg0.getX());
		} else if (local10 == 2) {
			this.method3530(arg0.getY(), 1, arg0.getX());
		}
		this.anInt4248 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method3519() {
		return (this.anInt4240 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!mc", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "(I)I")
	@Override
	public int method3524() {
		return this.anInt4229;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)I")
	@Override
	public int method3517() {
		return this.anInt4226;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(BLjava/awt/Component;)V")
	private void method3531(@OriginalArg(1) Component arg0) {
		this.method3529();
		this.aComponent2 = arg0;
		this.aComponent2.addMouseListener(this);
		this.aComponent2.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!mc", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.anInt4250 = -1;
		this.anInt4249 = -1;
	}

	@OriginalMember(owner = "client!mc", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method3532(arg0);
		if ((this.anInt4248 & local8) == 0) {
			local8 = this.anInt4248;
		}
		if ((local8 & 0x1) != 0) {
			this.method3530(arg0.getY(), 3, arg0.getX());
		}
		if ((local8 & 0x4) != 0) {
			this.method3530(arg0.getY(), 5, arg0.getX());
		}
		if ((local8 & 0x2) != 0) {
			this.method3530(arg0.getY(), 4, arg0.getX());
		}
		this.anInt4248 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!mc", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method3527(arg0);
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)Z")
	@Override
	protected boolean method3520() {
		return (this.anInt4240 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(Ljava/awt/event/MouseEvent;I)I")
	private int method3532(@OriginalArg(0) MouseEvent arg0) {
		@Pc(6) int local6 = arg0.getModifiers();
		@Pc(15) boolean local15 = (local6 & 0x10) != 0;
		@Pc(26) boolean local26 = (local6 & 0x8) != 0;
		@Pc(34) boolean local34 = (local6 & 0x4) != 0;
		if (local26 && (local15 || local34)) {
			local26 = false;
		}
		if (local15 && local34) {
			return 4;
		} else if (local15) {
			return 1;
		} else if (local26) {
			return 2;
		} else if (local34) {
			return 4;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)V")
	@Override
	public void method3516() {
		this.method3529();
	}

	@OriginalMember(owner = "client!mc", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method3527(arg0);
	}
}
