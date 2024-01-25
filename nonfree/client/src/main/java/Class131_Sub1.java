import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gt")
public final class Class131_Sub1 extends Class131 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!gt", name = "m", descriptor = "I")
	private int anInt2712;

	@OriginalMember(owner = "client!gt", name = "n", descriptor = "I")
	private int anInt2713;

	@OriginalMember(owner = "client!gt", name = "M", descriptor = "I")
	private int anInt2734;

	@OriginalMember(owner = "client!gt", name = "N", descriptor = "I")
	private int anInt2735;

	@OriginalMember(owner = "client!gt", name = "R", descriptor = "I")
	private int anInt2738;

	@OriginalMember(owner = "client!gt", name = "T", descriptor = "I")
	private int anInt2739;

	@OriginalMember(owner = "client!gt", name = "U", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!gt", name = "L", descriptor = "Lclient!dc;")
	private Class70 aClass70_12 = new Class70();

	@OriginalMember(owner = "client!gt", name = "Q", descriptor = "Lclient!dc;")
	private Class70 aClass70_13 = new Class70();

	@OriginalMember(owner = "client!gt", name = "V", descriptor = "Z")
	private final boolean aBoolean194;

	@OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class131_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method2350(arg0);
		this.aBoolean194 = arg1;
	}

	@OriginalMember(owner = "client!gt", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!gt", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method2347(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!gt", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method2347(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!gt", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method6539() {
		return (this.anInt2712 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!gt", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method2346(arg0);
		if ((local8 & this.anInt2735) == 0) {
			local8 = this.anInt2735;
		}
		if ((local8 & 0x1) != 0) {
			this.method2344(arg0.getY(), 3, arg0.getClickCount(), arg0.getX());
		}
		if ((local8 & 0x4) != 0) {
			this.method2344(arg0.getY(), 5, arg0.getClickCount(), arg0.getX());
		}
		if ((local8 & 0x2) != 0) {
			this.method2344(arg0.getY(), 4, arg0.getClickCount(), arg0.getX());
		}
		this.anInt2735 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!gt", name = "b", descriptor = "(B)I")
	@Override
	public int method6542() {
		return this.anInt2734;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIIII)V")
	private void method2344(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class2_Sub29_Sub1 local7 = new Class2_Sub29_Sub1();
		local7.anInt6077 = arg1;
		local7.anInt6072 = arg3;
		local7.anInt6070 = arg2;
		local7.anInt6074 = arg0;
		local7.aLong164 = Static362.method5133();
		this.aClass70_13.method1269(local7);
	}

	@OriginalMember(owner = "client!gt", name = "c", descriptor = "(I)I")
	@Override
	public int method6544() {
		return this.anInt2713;
	}

	@OriginalMember(owner = "client!gt", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method2346(arg0);
		if (local10 == 1) {
			this.method2344(arg0.getY(), 0, arg0.getClickCount(), arg0.getX());
		} else if (local10 == 4) {
			this.method2344(arg0.getY(), 2, arg0.getClickCount(), arg0.getX());
		} else if (local10 == 2) {
			this.method2344(arg0.getY(), 1, arg0.getClickCount(), arg0.getX());
		}
		this.anInt2735 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(B)V")
	@Override
	public synchronized void method6541() {
		this.anInt2712 = this.anInt2735;
		this.anInt2713 = this.anInt2739;
		this.anInt2734 = this.anInt2738;
		@Pc(18) Class70 local18 = this.aClass70_12;
		this.aClass70_12 = this.aClass70_13;
		this.aClass70_13 = local18;
		this.aClass70_13.method1265();
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)I")
	private int method2346(@OriginalArg(0) MouseEvent arg0) {
		@Pc(11) int local11 = arg0.getModifiers();
		@Pc(22) boolean local22 = (local11 & 0x10) != 0;
		@Pc(33) boolean local33 = (local11 & 0x8) != 0;
		@Pc(41) boolean local41 = (local11 & 0x4) != 0;
		if (local33 && (local22 || local41)) {
			local33 = false;
		}
		if (local22 && local41) {
			return 4;
		} else if (local22) {
			return 1;
		} else if (local33) {
			return 2;
		} else if (local41) {
			return 4;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!gt", name = "b", descriptor = "(Z)V")
	@Override
	public void method6547() {
		this.method2353();
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(III)V")
	private void method2347(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2739 = arg1;
		this.anInt2738 = arg0;
		if (this.aBoolean194) {
			this.method2344(arg0, -1, 0, arg1);
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Z)Lclient!ls;")
	@Override
	public Class2_Sub29 method6543() {
		return (Class2_Sub29) this.aClass70_12.method1262();
	}

	@OriginalMember(owner = "client!gt", name = "c", descriptor = "(B)Z")
	@Override
	protected boolean method6548() {
		return (this.anInt2712 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(BLjava/awt/Component;)V")
	private void method2350(@OriginalArg(1) Component arg0) {
		this.method2353();
		this.aComponent1 = arg0;
		this.aComponent1.addMouseListener(this);
		this.aComponent1.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!gt", name = "e", descriptor = "(I)Z")
	@Override
	protected boolean method6546() {
		return (this.anInt2712 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!gt", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method2347(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!gt", name = "d", descriptor = "(B)V")
	private void method2353() {
		if (this.aComponent1 == null) {
			return;
		}
		this.aComponent1.removeMouseMotionListener(this);
		this.aComponent1.removeMouseListener(this);
		this.anInt2713 = this.anInt2734 = this.anInt2712 = 0;
		this.anInt2739 = this.anInt2738 = this.anInt2735 = 0;
		this.aComponent1 = null;
		this.aClass70_12 = null;
		this.aClass70_13 = null;
	}

	@OriginalMember(owner = "client!gt", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method2347(arg0.getY(), arg0.getX());
	}
}
