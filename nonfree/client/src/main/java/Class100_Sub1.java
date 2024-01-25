import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kj")
public final class Class100_Sub1 extends Class100 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!kj", name = "n", descriptor = "I")
	private int anInt4016;

	@OriginalMember(owner = "client!kj", name = "w", descriptor = "I")
	private int anInt4023;

	@OriginalMember(owner = "client!kj", name = "G", descriptor = "I")
	private int anInt4031;

	@OriginalMember(owner = "client!kj", name = "I", descriptor = "I")
	private int anInt4032;

	@OriginalMember(owner = "client!kj", name = "J", descriptor = "I")
	private int anInt4033;

	@OriginalMember(owner = "client!kj", name = "K", descriptor = "I")
	private int anInt4034;

	@OriginalMember(owner = "client!kj", name = "M", descriptor = "Ljava/awt/Component;")
	private Component aComponent3;

	@OriginalMember(owner = "client!kj", name = "t", descriptor = "Lclient!ug;")
	private Class243 aClass243_24 = new Class243();

	@OriginalMember(owner = "client!kj", name = "H", descriptor = "Lclient!ug;")
	private Class243 aClass243_25 = new Class243();

	@OriginalMember(owner = "client!kj", name = "L", descriptor = "Z")
	private final boolean aBoolean348;

	@OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class100_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method3224(arg0);
		this.aBoolean348 = arg1;
	}

	@OriginalMember(owner = "client!kj", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!kj", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method3225(arg0);
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)Z")
	@Override
	protected boolean method3212() {
		return (this.anInt4016 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Z)Lclient!ji;")
	@Override
	public Class3_Sub23 method3209() {
		return (Class3_Sub23) this.aClass243_24.method5204();
	}

	@OriginalMember(owner = "client!kj", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.anInt4033 = -1;
		this.anInt4032 = -1;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(B)V")
	@Override
	public void method3211() {
		this.method3222();
	}

	@OriginalMember(owner = "client!kj", name = "e", descriptor = "(I)Z")
	@Override
	protected boolean method3220() {
		return (this.anInt4016 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(ZLjava/awt/event/MouseEvent;)I")
	private int method3221(@OriginalArg(1) MouseEvent arg0) {
		@Pc(6) int local6 = arg0.getModifiers();
		@Pc(17) boolean local17 = (local6 & 0x10) != 0;
		@Pc(25) boolean local25 = (local6 & 0x8) != 0;
		@Pc(42) boolean local42 = (local6 & 0x4) != 0;
		if (local25 && (local17 || local42)) {
			local25 = false;
		}
		if (local17 && local42) {
			return 4;
		} else if (local17) {
			return 1;
		} else if (local25) {
			return 2;
		} else if (local42) {
			return 4;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!kj", name = "d", descriptor = "(B)V")
	private void method3222() {
		if (this.aComponent3 == null) {
			return;
		}
		this.aComponent3.removeMouseListener(this);
		this.aComponent3.removeMouseMotionListener(this);
		this.aComponent3 = null;
		this.aClass243_25 = null;
		this.aClass243_24 = null;
		this.anInt4023 = this.anInt4031 = this.anInt4016 = 0;
		this.anInt4033 = this.anInt4032 = this.anInt4034 = 0;
	}

	@OriginalMember(owner = "client!kj", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method3221(arg0);
		if (local10 == 1) {
			this.method3226(arg0.getY(), 0, arg0.getX());
		} else if (local10 == 4) {
			this.method3226(arg0.getY(), 2, arg0.getX());
		} else if (local10 == 2) {
			this.method3226(arg0.getY(), 1, arg0.getX());
		}
		this.anInt4034 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "(B)I")
	@Override
	public int method3213() {
		return this.anInt4031;
	}

	@OriginalMember(owner = "client!kj", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method3225(arg0);
	}

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "(Z)I")
	@Override
	public int method3218() {
		return this.anInt4023;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILjava/awt/Component;)V")
	private void method3224(@OriginalArg(1) Component arg0) {
		this.method3222();
		this.aComponent3 = arg0;
		this.aComponent3.addMouseListener(this);
		this.aComponent3.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)V")
	private void method3225(@OriginalArg(1) MouseEvent arg0) {
		this.anInt4033 = arg0.getX();
		this.anInt4032 = arg0.getY();
		if (this.aBoolean348) {
			this.method3226(arg0.getY(), -1, arg0.getX());
		}
	}

	@OriginalMember(owner = "client!kj", name = "c", descriptor = "(B)V")
	@Override
	public synchronized void method3214() {
		this.anInt4031 = this.anInt4032;
		this.anInt4023 = this.anInt4033;
		this.anInt4016 = this.anInt4034;
		@Pc(25) Class243 local25 = this.aClass243_24;
		this.aClass243_24 = this.aClass243_25;
		this.aClass243_25 = local25;
		this.aClass243_25.method5200();
	}

	@OriginalMember(owner = "client!kj", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method3221(arg0);
		if ((this.anInt4034 & local8) == 0) {
			local8 = this.anInt4034;
		}
		if ((local8 & 0x1) != 0) {
			this.method3226(arg0.getY(), 3, arg0.getX());
		}
		if ((local8 & 0x4) != 0) {
			this.method3226(arg0.getY(), 5, arg0.getX());
		}
		if ((local8 & 0x2) != 0) {
			this.method3226(arg0.getY(), 4, arg0.getX());
		}
		this.anInt4034 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!kj", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method3219() {
		return (this.anInt4016 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!kj", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method3225(arg0);
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIII)V")
	private void method3226(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class3_Sub23_Sub1 local7 = new Class3_Sub23_Sub1();
		local7.anInt4303 = arg0;
		local7.anInt4306 = arg2;
		local7.anInt4304 = arg1;
		local7.aLong139 = Static118.method1934();
		this.aClass243_25.method5198(local7);
	}
}
