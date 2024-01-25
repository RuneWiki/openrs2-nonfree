import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dda")
public final class Class75_Sub1 extends Class75 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!dda", name = "m", descriptor = "I")
	private int anInt2097;

	@OriginalMember(owner = "client!dda", name = "v", descriptor = "I")
	private int anInt2105;

	@OriginalMember(owner = "client!dda", name = "x", descriptor = "I")
	private int anInt2107;

	@OriginalMember(owner = "client!dda", name = "I", descriptor = "I")
	private int anInt2118;

	@OriginalMember(owner = "client!dda", name = "J", descriptor = "I")
	private int anInt2119;

	@OriginalMember(owner = "client!dda", name = "L", descriptor = "I")
	private int anInt2120;

	@OriginalMember(owner = "client!dda", name = "M", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!dda", name = "l", descriptor = "Lclient!jia;")
	private Class193 aClass193_10 = new Class193();

	@OriginalMember(owner = "client!dda", name = "K", descriptor = "Lclient!jia;")
	private Class193 aClass193_11 = new Class193();

	@OriginalMember(owner = "client!dda", name = "N", descriptor = "Z")
	private final boolean aBoolean183;

	@OriginalMember(owner = "client!dda", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class75_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method1954(arg0);
		this.aBoolean183 = arg1;
	}

	@OriginalMember(owner = "client!dda", name = "b", descriptor = "(I)Z")
	@Override
	protected boolean method8409() {
		return (this.anInt2097 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!dda", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method1953(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!dda", name = "b", descriptor = "(III)V")
	private void method1953(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt2120 = arg1;
		this.anInt2118 = arg0;
		if (this.aBoolean183) {
			this.method1955(0, arg1, -1, arg0);
		}
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(ILjava/awt/Component;)V")
	private void method1954(@OriginalArg(1) Component arg0) {
		this.method1959();
		this.aComponent1 = arg0;
		this.aComponent1.addMouseListener(this);
		this.aComponent1.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(IIIII)V")
	private void method1955(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(11) Class3_Sub21_Sub1 local11 = new Class3_Sub21_Sub1();
		local11.anInt3488 = arg2;
		local11.anInt3487 = arg1;
		local11.anInt3486 = arg0;
		local11.anInt3489 = arg3;
		local11.aLong98 = Static131.method2268();
		this.aClass193_11.method4462(local11);
	}

	@OriginalMember(owner = "client!dda", name = "c", descriptor = "(B)V")
	@Override
	public void method8407() {
		this.method1959();
	}

	@OriginalMember(owner = "client!dda", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method1960(arg0);
		if (local10 == 1) {
			this.method1955(arg0.getClickCount(), arg0.getX(), 0, arg0.getY());
		} else if (local10 == 4) {
			this.method1955(arg0.getClickCount(), arg0.getX(), 2, arg0.getY());
		} else if (local10 == 2) {
			this.method1955(arg0.getClickCount(), arg0.getX(), 1, arg0.getY());
		}
		this.anInt2119 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!dda", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method1953(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(I)Z")
	@Override
	protected boolean method8403() {
		return (this.anInt2097 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!dda", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method1953(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!dda", name = "b", descriptor = "(Z)Lclient!hl;")
	@Override
	public Class3_Sub21 method8411() {
		return (Class3_Sub21) this.aClass193_10.method4452();
	}

	@OriginalMember(owner = "client!dda", name = "b", descriptor = "(B)I")
	@Override
	public int method8405() {
		return this.anInt2107;
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(B)V")
	@Override
	public synchronized void method8404() {
		this.anInt2105 = this.anInt2120;
		this.anInt2107 = this.anInt2118;
		this.anInt2097 = this.anInt2119;
		@Pc(18) Class193 local18 = this.aClass193_10;
		this.aClass193_10 = this.aClass193_11;
		this.aClass193_11 = local18;
		this.aClass193_11.method4458();
	}

	@OriginalMember(owner = "client!dda", name = "d", descriptor = "(I)V")
	private void method1959() {
		if (this.aComponent1 == null) {
			return;
		}
		this.aComponent1.removeMouseMotionListener(this);
		this.aComponent1.removeMouseListener(this);
		this.anInt2105 = this.anInt2107 = this.anInt2097 = 0;
		this.aComponent1 = null;
		this.anInt2120 = this.anInt2118 = this.anInt2119 = 0;
		this.aClass193_10 = null;
		this.aClass193_11 = null;
	}

	@OriginalMember(owner = "client!dda", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method1960(arg0);
		if ((this.anInt2119 & local8) == 0) {
			local8 = this.anInt2119;
		}
		if ((local8 & 0x1) != 0) {
			this.method1955(arg0.getClickCount(), arg0.getX(), 3, arg0.getY());
		}
		if ((local8 & 0x4) != 0) {
			this.method1955(arg0.getClickCount(), arg0.getX(), 5, arg0.getY());
		}
		if ((local8 & 0x2) != 0) {
			this.method1955(arg0.getClickCount(), arg0.getX(), 4, arg0.getY());
		}
		this.anInt2119 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!dda", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method1953(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!dda", name = "d", descriptor = "(B)I")
	@Override
	public int method8412() {
		return this.anInt2105;
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;Z)I")
	private int method1960(@OriginalArg(0) MouseEvent arg0) {
		@Pc(6) int local6 = arg0.getModifiers();
		@Pc(17) boolean local17 = (local6 & 0x10) != 0;
		@Pc(33) boolean local33 = (local6 & 0x8) != 0;
		@Pc(41) boolean local41 = (local6 & 0x4) != 0;
		if (local33 && (local17 || local41)) {
			local33 = false;
		}
		if (local17 && local41) {
			return 4;
		} else if (local17) {
			return 1;
		} else if (local33) {
			return 2;
		} else if (local41) {
			return 4;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8408() {
		return (this.anInt2097 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!dda", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}
}
