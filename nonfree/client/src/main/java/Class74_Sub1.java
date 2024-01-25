import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public final class Class74_Sub1 extends Class74 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!fd", name = "i", descriptor = "I")
	private int anInt2403;

	@OriginalMember(owner = "client!fd", name = "t", descriptor = "I")
	private int anInt2413;

	@OriginalMember(owner = "client!fd", name = "D", descriptor = "I")
	private int anInt2422;

	@OriginalMember(owner = "client!fd", name = "F", descriptor = "I")
	private int anInt2424;

	@OriginalMember(owner = "client!fd", name = "G", descriptor = "I")
	private int anInt2425;

	@OriginalMember(owner = "client!fd", name = "J", descriptor = "I")
	private int anInt2426;

	@OriginalMember(owner = "client!fd", name = "L", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!fd", name = "o", descriptor = "Lclient!tu;")
	private Class229 aClass229_13 = new Class229();

	@OriginalMember(owner = "client!fd", name = "I", descriptor = "Lclient!tu;")
	private Class229 aClass229_14 = new Class229();

	@OriginalMember(owner = "client!fd", name = "M", descriptor = "Z")
	private final boolean aBoolean191;

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class74_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method1875(arg0);
		this.aBoolean191 = arg1;
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(B)Lclient!ab;")
	@Override
	public Class3_Sub1 method1864() {
		return (Class3_Sub1) this.aClass229_13.method5331();
	}

	@OriginalMember(owner = "client!fd", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method1877(arg0);
	}

	@OriginalMember(owner = "client!fd", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method1879(arg0);
		if ((local8 & this.anInt2424) == 0) {
			local8 = this.anInt2424;
		}
		if ((local8 & 0x1) != 0) {
			this.method1878(arg0.getX(), 3, arg0.getY());
		}
		if ((local8 & 0x4) != 0) {
			this.method1878(arg0.getX(), 5, arg0.getY());
		}
		if ((local8 & 0x2) != 0) {
			this.method1878(arg0.getX(), 4, arg0.getY());
		}
		this.anInt2424 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!fd", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method1877(arg0);
	}

	@OriginalMember(owner = "client!fd", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "(B)I")
	@Override
	public int method1870() {
		return this.anInt2413;
	}

	@OriginalMember(owner = "client!fd", name = "f", descriptor = "(B)V")
	@Override
	public void method1872() {
		this.method1876();
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)Z")
	@Override
	protected boolean method1867() {
		return (this.anInt2422 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "(B)I")
	@Override
	public int method1865() {
		return this.anInt2403;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	private void method1875(@OriginalArg(0) Component arg0) {
		this.method1876();
		this.aComponent2 = arg0;
		this.aComponent2.addMouseListener(this);
		this.aComponent2.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Z)V")
	private void method1876() {
		if (this.aComponent2 == null) {
			return;
		}
		this.aComponent2.removeMouseListener(this);
		this.aComponent2.removeMouseMotionListener(this);
		this.anInt2413 = this.anInt2403 = this.anInt2422 = 0;
		this.aClass229_13 = null;
		this.aComponent2 = null;
		this.anInt2426 = this.anInt2425 = this.anInt2424 = 0;
		this.aClass229_14 = null;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method1866() {
		this.anInt2413 = this.anInt2426;
		this.anInt2422 = this.anInt2424;
		this.anInt2403 = this.anInt2425;
		@Pc(24) Class229 local24 = this.aClass229_13;
		this.aClass229_13 = this.aClass229_14;
		this.aClass229_14 = local24;
		this.aClass229_14.method5326();
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(BLjava/awt/event/MouseEvent;)V")
	private void method1877(@OriginalArg(1) MouseEvent arg0) {
		this.anInt2426 = arg0.getX();
		this.anInt2425 = arg0.getY();
		if (this.aBoolean191) {
			this.method1878(arg0.getX(), -1, arg0.getY());
		}
	}

	@OriginalMember(owner = "client!fd", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.anInt2425 = -1;
		this.anInt2426 = -1;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIBI)V")
	private void method1878(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class3_Sub1_Sub1 local7 = new Class3_Sub1_Sub1();
		local7.anInt5993 = arg1;
		local7.anInt5995 = arg2;
		local7.anInt5992 = arg0;
		local7.aLong179 = Static150.method2672();
		this.aClass229_14.method5321(local7);
	}

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method1871() {
		return (this.anInt2422 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)I")
	private int method1879(@OriginalArg(0) MouseEvent arg0) {
		@Pc(6) int local6 = arg0.getModifiers();
		@Pc(17) boolean local17 = (local6 & 0x10) != 0;
		@Pc(28) boolean local28 = (local6 & 0x8) != 0;
		@Pc(36) boolean local36 = (local6 & 0x4) != 0;
		if (local28 && (local17 || local36)) {
			local28 = false;
		}
		if (local17 && local36) {
			return 4;
		} else if (local17) {
			return 1;
		} else if (local28) {
			return 2;
		} else if (local36) {
			return 4;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!fd", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method1877(arg0);
	}

	@OriginalMember(owner = "client!fd", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method1879(arg0);
		if (local10 == 1) {
			this.method1878(arg0.getX(), 0, arg0.getY());
		} else if (local10 == 4) {
			this.method1878(arg0.getX(), 2, arg0.getY());
		} else if (local10 == 2) {
			this.method1878(arg0.getX(), 1, arg0.getY());
		}
		this.anInt2424 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "(I)Z")
	@Override
	protected boolean method1868() {
		return (this.anInt2422 & 0x4) != 0;
	}
}
