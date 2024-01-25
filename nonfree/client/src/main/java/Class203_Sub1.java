import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class Class203_Sub1 extends Class203 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!te", name = "e", descriptor = "I")
	private int anInt6298;

	@OriginalMember(owner = "client!te", name = "j", descriptor = "I")
	private int anInt6303;

	@OriginalMember(owner = "client!te", name = "v", descriptor = "I")
	private int anInt6314;

	@OriginalMember(owner = "client!te", name = "x", descriptor = "I")
	private int anInt6316;

	@OriginalMember(owner = "client!te", name = "A", descriptor = "I")
	private int anInt6319;

	@OriginalMember(owner = "client!te", name = "J", descriptor = "I")
	private int anInt6327;

	@OriginalMember(owner = "client!te", name = "K", descriptor = "Ljava/awt/Component;")
	private Component aComponent3;

	@OriginalMember(owner = "client!te", name = "t", descriptor = "Lclient!mg;")
	private Class156 aClass156_52 = new Class156();

	@OriginalMember(owner = "client!te", name = "I", descriptor = "Lclient!mg;")
	private Class156 aClass156_53 = new Class156();

	@OriginalMember(owner = "client!te", name = "L", descriptor = "Z")
	private final boolean aBoolean451;

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class203_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method4932(arg0);
		this.aBoolean451 = arg1;
	}

	@OriginalMember(owner = "client!te", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.anInt6327 = -1;
		this.anInt6316 = -1;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;B)I")
	private int method4927(@OriginalArg(0) MouseEvent arg0) {
		@Pc(14) int local14 = arg0.getModifiers();
		@Pc(22) boolean local22 = (local14 & 0x10) != 0;
		@Pc(30) boolean local30 = (local14 & 0x8) != 0;
		@Pc(41) boolean local41 = (local14 & 0x4) != 0;
		if (local30 && (local22 || local41)) {
			local30 = false;
		}
		if (local22 && local41) {
			return 4;
		} else if (local22) {
			return 1;
		} else if (local30) {
			return 2;
		} else if (local41) {
			return 4;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!te", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method4929(arg0);
	}

	@OriginalMember(owner = "client!te", name = "d", descriptor = "(I)Z")
	@Override
	protected boolean method4921() {
		return (this.anInt6298 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(B)I")
	@Override
	public int method4918() {
		return this.anInt6303;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Z)Lclient!dw;")
	@Override
	public Class2_Sub14 method4922() {
		return (Class2_Sub14) this.aClass156_52.method3152();
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(ZLjava/awt/event/MouseEvent;)V")
	private void method4929(@OriginalArg(1) MouseEvent arg0) {
		this.anInt6316 = arg0.getX();
		this.anInt6327 = arg0.getY();
		if (this.aBoolean451) {
			this.method4931(arg0.getX(), -1, arg0.getY());
		}
	}

	@OriginalMember(owner = "client!te", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!te", name = "d", descriptor = "(B)I")
	@Override
	public int method4925() {
		return this.anInt6314;
	}

	@OriginalMember(owner = "client!te", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method4927(arg0);
		if (local10 == 1) {
			this.method4931(arg0.getX(), 0, arg0.getY());
		} else if (local10 == 4) {
			this.method4931(arg0.getX(), 2, arg0.getY());
		} else if (local10 == 2) {
			this.method4931(arg0.getX(), 1, arg0.getY());
		}
		this.anInt6319 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IBII)V")
	private void method4931(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class2_Sub14_Sub1 local7 = new Class2_Sub14_Sub1();
		local7.anInt6944 = arg0;
		local7.anInt6951 = arg2;
		local7.anInt6943 = arg1;
		local7.aLong210 = Static110.method1702();
		this.aClass156_53.method3157(local7);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(BLjava/awt/Component;)V")
	private void method4932(@OriginalArg(1) Component arg0) {
		this.method4933();
		this.aComponent3 = arg0;
		this.aComponent3.addMouseListener(this);
		this.aComponent3.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!te", name = "c", descriptor = "(I)Z")
	@Override
	protected boolean method4920() {
		return (this.anInt6298 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!te", name = "e", descriptor = "(B)V")
	private void method4933() {
		if (this.aComponent3 == null) {
			return;
		}
		this.aComponent3.removeMouseListener(this);
		this.aComponent3.removeMouseMotionListener(this);
		this.aClass156_53 = null;
		this.aComponent3 = null;
		this.aClass156_52 = null;
		this.anInt6303 = this.anInt6314 = this.anInt6298 = 0;
		this.anInt6316 = this.anInt6327 = this.anInt6319 = 0;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method4915() {
		return (this.anInt6298 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!te", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method4927(arg0);
		if ((this.anInt6319 & local8) == 0) {
			local8 = this.anInt6319;
		}
		if ((local8 & 0x1) != 0) {
			this.method4931(arg0.getX(), 3, arg0.getY());
		}
		if ((local8 & 0x4) != 0) {
			this.method4931(arg0.getX(), 5, arg0.getY());
		}
		if ((local8 & 0x2) != 0) {
			this.method4931(arg0.getX(), 4, arg0.getY());
		}
		this.anInt6319 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!te", name = "e", descriptor = "(I)V")
	@Override
	public void method4924() {
		this.method4933();
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method4917() {
		this.anInt6303 = this.anInt6316;
		this.anInt6298 = this.anInt6319;
		this.anInt6314 = this.anInt6327;
		@Pc(18) Class156 local18 = this.aClass156_52;
		this.aClass156_52 = this.aClass156_53;
		this.aClass156_53 = local18;
		this.aClass156_53.method3161();
	}

	@OriginalMember(owner = "client!te", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method4929(arg0);
	}

	@OriginalMember(owner = "client!te", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method4929(arg0);
	}
}
