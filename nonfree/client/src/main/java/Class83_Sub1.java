import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jl")
public final class Class83_Sub1 extends Class83 implements MouseListener, MouseMotionListener, MouseWheelListener {

	@OriginalMember(owner = "client!jl", name = "g", descriptor = "I")
	private int anInt5076;

	@OriginalMember(owner = "client!jl", name = "h", descriptor = "I")
	private int anInt5077;

	@OriginalMember(owner = "client!jl", name = "i", descriptor = "I")
	private int anInt5078;

	@OriginalMember(owner = "client!jl", name = "k", descriptor = "I")
	private int anInt5079;

	@OriginalMember(owner = "client!jl", name = "l", descriptor = "I")
	private int anInt5080;

	@OriginalMember(owner = "client!jl", name = "m", descriptor = "I")
	private int anInt5081;

	@OriginalMember(owner = "client!jl", name = "p", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!jl", name = "j", descriptor = "Lclient!au;")
	private Class22 aClass22_25 = new Class22();

	@OriginalMember(owner = "client!jl", name = "n", descriptor = "Lclient!au;")
	private Class22 aClass22_26 = new Class22();

	@OriginalMember(owner = "client!jl", name = "o", descriptor = "Z")
	private final boolean aBoolean362;

	@OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class83_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method3950(arg0);
		this.aBoolean362 = arg1;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	private void method3950(@OriginalArg(0) Component arg0) {
		this.method3951();
		this.aComponent2 = arg0;
		this.aComponent2.addMouseListener(this);
		this.aComponent2.addMouseMotionListener(this);
		this.aComponent2.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!jl", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method3953(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!jl", name = "d", descriptor = "(B)V")
	private void method3951() {
		if (this.aComponent2 == null) {
			return;
		}
		this.aComponent2.removeMouseWheelListener(this);
		this.aComponent2.removeMouseMotionListener(this);
		this.aComponent2.removeMouseListener(this);
		this.aClass22_25 = null;
		this.aComponent2 = null;
		this.aClass22_26 = null;
		this.anInt5076 = this.anInt5078 = this.anInt5077 = 0;
		this.anInt5081 = this.anInt5080 = this.anInt5079 = 0;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)Z")
	@Override
	protected boolean method6893() {
		return (this.anInt5077 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!jl", name = "f", descriptor = "(I)Z")
	@Override
	protected boolean method6903() {
		return (this.anInt5077 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIIIB)V")
	private void method3952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class4_Sub24_Sub1 local3 = new Class4_Sub24_Sub1();
		local3.anInt4077 = arg0;
		local3.anInt4078 = arg3;
		local3.anInt4076 = arg1;
		local3.aLong109 = Static112.method2047();
		local3.anInt4079 = arg2;
		this.aClass22_26.method894(local3);
	}

	@OriginalMember(owner = "client!jl", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		@Pc(8) int local8 = arg0.getWheelRotation();
		this.method3952(local5, 6, local8, local2);
		arg0.consume();
	}

	@OriginalMember(owner = "client!jl", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method3954(arg0);
		if ((local4 & this.anInt5079) == 0) {
			local4 = this.anInt5079;
		}
		if ((local4 & 0x1) != 0) {
			this.method3952(arg0.getY(), 3, arg0.getClickCount(), arg0.getX());
		}
		if ((local4 & 0x4) != 0) {
			this.method3952(arg0.getY(), 5, arg0.getClickCount(), arg0.getX());
		}
		if ((local4 & 0x2) != 0) {
			this.method3952(arg0.getY(), 4, arg0.getClickCount(), arg0.getX());
		}
		this.anInt5079 &= ~local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!jl", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method3953(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!jl", name = "e", descriptor = "(I)V")
	@Override
	public synchronized void method6902() {
		this.anInt5076 = this.anInt5081;
		this.anInt5077 = this.anInt5079;
		this.anInt5078 = this.anInt5080;
		@Pc(14) Class22 local14 = this.aClass22_25;
		this.aClass22_25 = this.aClass22_26;
		this.aClass22_26 = local14;
		this.aClass22_26.method886();
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(Z)I")
	@Override
	public int method6895() {
		return this.anInt5076;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IBI)V")
	private void method3953(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt5081 = arg1;
		this.anInt5080 = arg0;
		if (this.aBoolean362) {
			this.method3952(arg0, -1, 0, arg1);
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(B)V")
	@Override
	public void method6894() {
		this.method3951();
	}

	@OriginalMember(owner = "client!jl", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!jl", name = "b", descriptor = "(I)I")
	@Override
	public int method6896() {
		return this.anInt5078;
	}

	@OriginalMember(owner = "client!jl", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method3953(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!jl", name = "b", descriptor = "(B)Lclient!rl;")
	@Override
	public Class4_Sub24 method6897() {
		return (Class4_Sub24) this.aClass22_25.method896();
	}

	@OriginalMember(owner = "client!jl", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method6901() {
		return (this.anInt5077 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)I")
	private int method3954(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.getButton() == 1) {
			return arg0.isMetaDown() ? 4 : 1;
		} else if (arg0.getButton() == 2) {
			return 2;
		} else if (arg0.getButton() == 3) {
			return 4;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!jl", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method3954(arg0);
		if (local4 == 1) {
			this.method3952(arg0.getY(), 0, arg0.getClickCount(), arg0.getX());
		} else if (local4 == 4) {
			this.method3952(arg0.getY(), 2, arg0.getClickCount(), arg0.getX());
		} else if (local4 == 2) {
			this.method3952(arg0.getY(), 1, arg0.getClickCount(), arg0.getX());
		}
		this.anInt5079 |= local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!jl", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method3953(arg0.getY(), arg0.getX());
	}
}
