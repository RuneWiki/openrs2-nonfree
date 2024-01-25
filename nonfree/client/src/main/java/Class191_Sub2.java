import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mu")
public final class Class191_Sub2 extends Class191 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!mu", name = "h", descriptor = "I")
	private int anInt5948;

	@OriginalMember(owner = "client!mu", name = "A", descriptor = "I")
	private int anInt5965;

	@OriginalMember(owner = "client!mu", name = "C", descriptor = "I")
	private int anInt5967;

	@OriginalMember(owner = "client!mu", name = "E", descriptor = "I")
	private int anInt5969;

	@OriginalMember(owner = "client!mu", name = "F", descriptor = "I")
	private int anInt5970;

	@OriginalMember(owner = "client!mu", name = "H", descriptor = "I")
	private int anInt5971;

	@OriginalMember(owner = "client!mu", name = "I", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!mu", name = "i", descriptor = "Lclient!bu;")
	private Class38 aClass38_44 = new Class38();

	@OriginalMember(owner = "client!mu", name = "G", descriptor = "Lclient!bu;")
	private Class38 aClass38_45 = new Class38();

	@OriginalMember(owner = "client!mu", name = "K", descriptor = "Z")
	private final boolean aBoolean407;

	@OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class191_Sub2(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method5154(arg0);
		this.aBoolean407 = arg1;
	}

	@OriginalMember(owner = "client!mu", name = "b", descriptor = "(B)Lclient!qw;")
	@Override
	public Class1_Sub41 method5145() {
		return (Class1_Sub41) this.aClass38_44.method1423();
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(B)I")
	@Override
	public int method5138() {
		return this.anInt5965;
	}

	@OriginalMember(owner = "client!mu", name = "b", descriptor = "(IIII)V")
	private void method5151(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class1_Sub41_Sub1 local11 = new Class1_Sub41_Sub1();
		local11.anInt8886 = arg2;
		local11.anInt8889 = arg1;
		local11.anInt8885 = arg0;
		local11.aLong232 = Static93.method2172();
		this.aClass38_45.method1426(local11);
	}

	@OriginalMember(owner = "client!mu", name = "c", descriptor = "(I)Z")
	@Override
	protected boolean method5147() {
		return (this.anInt5967 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(III)V")
	private void method5152(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt5971 = arg1;
		this.anInt5969 = arg0;
		if (this.aBoolean407) {
			this.method5151(arg0, -1, arg1);
		}
	}

	@OriginalMember(owner = "client!mu", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method5144() {
		this.anInt5965 = this.anInt5971;
		this.anInt5948 = this.anInt5969;
		this.anInt5967 = this.anInt5970;
		@Pc(22) Class38 local22 = this.aClass38_44;
		this.aClass38_44 = this.aClass38_45;
		this.aClass38_45 = local22;
		this.aClass38_45.method1417();
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(BLjava/awt/event/MouseEvent;)I")
	private int method5153(@OriginalArg(1) MouseEvent arg0) {
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

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	private void method5154(@OriginalArg(0) Component arg0) {
		this.method5155();
		this.aComponent2 = arg0;
		this.aComponent2.addMouseListener(this);
		this.aComponent2.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!mu", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method5153(arg0);
		if ((this.anInt5970 & local8) == 0) {
			local8 = this.anInt5970;
		}
		if ((local8 & 0x1) != 0) {
			this.method5151(arg0.getY(), 3, arg0.getX());
		}
		if ((local8 & 0x4) != 0) {
			this.method5151(arg0.getY(), 5, arg0.getX());
		}
		if ((local8 & 0x2) != 0) {
			this.method5151(arg0.getY(), 4, arg0.getX());
		}
		this.anInt5970 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(I)I")
	@Override
	public int method5141() {
		return this.anInt5948;
	}

	@OriginalMember(owner = "client!mu", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method5152(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!mu", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!mu", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method5152(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(Z)Z")
	@Override
	protected boolean method5142() {
		return (this.anInt5967 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!mu", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method5152(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!mu", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method5152(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!mu", name = "c", descriptor = "(B)V")
	@Override
	public void method5146() {
		this.method5155();
	}

	@OriginalMember(owner = "client!mu", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method5153(arg0);
		if (local10 == 1) {
			this.method5151(arg0.getY(), 0, arg0.getX());
		} else if (local10 == 4) {
			this.method5151(arg0.getY(), 2, arg0.getX());
		} else if (local10 == 2) {
			this.method5151(arg0.getY(), 1, arg0.getX());
		}
		this.anInt5970 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!mu", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method5149() {
		return (this.anInt5967 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!mu", name = "f", descriptor = "(B)V")
	private void method5155() {
		if (this.aComponent2 == null) {
			return;
		}
		this.aComponent2.removeMouseMotionListener(this);
		this.aComponent2.removeMouseListener(this);
		this.anInt5971 = this.anInt5969 = this.anInt5970 = 0;
		this.aComponent2 = null;
		this.anInt5965 = this.anInt5948 = this.anInt5967 = 0;
		this.aClass38_45 = null;
		this.aClass38_44 = null;
	}
}
