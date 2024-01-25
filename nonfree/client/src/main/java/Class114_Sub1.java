import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!in")
public final class Class114_Sub1 extends Class114 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!in", name = "n", descriptor = "I")
	private int anInt3120;

	@OriginalMember(owner = "client!in", name = "z", descriptor = "I")
	private int anInt3130;

	@OriginalMember(owner = "client!in", name = "F", descriptor = "I")
	private int anInt3136;

	@OriginalMember(owner = "client!in", name = "H", descriptor = "I")
	private int anInt3138;

	@OriginalMember(owner = "client!in", name = "I", descriptor = "I")
	private int anInt3139;

	@OriginalMember(owner = "client!in", name = "L", descriptor = "I")
	private int anInt3141;

	@OriginalMember(owner = "client!in", name = "N", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!in", name = "v", descriptor = "Lclient!oe;")
	private Class181 aClass181_27 = new Class181();

	@OriginalMember(owner = "client!in", name = "K", descriptor = "Lclient!oe;")
	private Class181 aClass181_28 = new Class181();

	@OriginalMember(owner = "client!in", name = "M", descriptor = "Z")
	private final boolean aBoolean185;

	@OriginalMember(owner = "client!in", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class114_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method2713(arg0);
		this.aBoolean185 = arg1;
	}

	@OriginalMember(owner = "client!in", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method2714(arg0);
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(B)Lclient!bh;")
	@Override
	public Class1_Sub7 method2700() {
		return (Class1_Sub7) this.aClass181_27.method4109();
	}

	@OriginalMember(owner = "client!in", name = "d", descriptor = "(Z)Z")
	@Override
	protected boolean method2703() {
		return (this.anInt3120 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)I")
	private int method2710(@OriginalArg(0) MouseEvent arg0) {
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

	@OriginalMember(owner = "client!in", name = "e", descriptor = "(Z)V")
	private void method2711() {
		if (this.aComponent1 == null) {
			return;
		}
		this.aComponent1.removeMouseListener(this);
		this.aComponent1.removeMouseMotionListener(this);
		this.aComponent1 = null;
		this.anInt3130 = this.anInt3136 = this.anInt3120 = 0;
		this.anInt3141 = this.anInt3139 = this.anInt3138 = 0;
		this.aClass181_27 = null;
		this.aClass181_28 = null;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IIII)V")
	private void method2712(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class1_Sub7_Sub1 local7 = new Class1_Sub7_Sub1();
		local7.anInt4411 = arg0;
		local7.anInt4408 = arg1;
		local7.anInt4413 = arg2;
		local7.aLong131 = Static279.method4058();
		this.aClass181_28.method4102(local7);
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
	private void method2713(@OriginalArg(0) Component arg0) {
		this.method2711();
		this.aComponent1 = arg0;
		this.aComponent1.addMouseListener(this);
		this.aComponent1.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!in", name = "d", descriptor = "(B)Z")
	@Override
	protected boolean method2708() {
		return (this.anInt3120 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!in", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method2714(arg0);
	}

	@OriginalMember(owner = "client!in", name = "b", descriptor = "(B)V")
	@Override
	public void method2704() {
		this.method2711();
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;B)V")
	private void method2714(@OriginalArg(0) MouseEvent arg0) {
		this.anInt3141 = arg0.getX();
		this.anInt3139 = arg0.getY();
		if (this.aBoolean185) {
			this.method2712(-1, arg0.getY(), arg0.getX());
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method2705() {
		return (this.anInt3120 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!in", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method2714(arg0);
	}

	@OriginalMember(owner = "client!in", name = "c", descriptor = "(B)V")
	@Override
	public synchronized void method2706() {
		this.anInt3130 = this.anInt3141;
		this.anInt3120 = this.anInt3138;
		this.anInt3136 = this.anInt3139;
		@Pc(24) Class181 local24 = this.aClass181_27;
		this.aClass181_27 = this.aClass181_28;
		this.aClass181_28 = local24;
		this.aClass181_28.method4101();
	}

	@OriginalMember(owner = "client!in", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method2710(arg0);
		if ((this.anInt3138 & local8) == 0) {
			local8 = this.anInt3138;
		}
		if ((local8 & 0x1) != 0) {
			this.method2712(3, arg0.getY(), arg0.getX());
		}
		if ((local8 & 0x4) != 0) {
			this.method2712(5, arg0.getY(), arg0.getX());
		}
		if ((local8 & 0x2) != 0) {
			this.method2712(4, arg0.getY(), arg0.getX());
		}
		this.anInt3138 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!in", name = "c", descriptor = "(Z)I")
	@Override
	public int method2701() {
		return this.anInt3130;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(Z)I")
	@Override
	public int method2698() {
		return this.anInt3136;
	}

	@OriginalMember(owner = "client!in", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!in", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method2710(arg0);
		if (local10 == 1) {
			this.method2712(0, arg0.getY(), arg0.getX());
		} else if (local10 == 4) {
			this.method2712(2, arg0.getY(), arg0.getX());
		} else if (local10 == 2) {
			this.method2712(1, arg0.getY(), arg0.getX());
		}
		this.anInt3138 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!in", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.anInt3141 = -1;
		this.anInt3139 = -1;
	}
}
