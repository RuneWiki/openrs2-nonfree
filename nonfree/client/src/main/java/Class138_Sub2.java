import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kq")
public final class Class138_Sub2 extends Class138 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!kq", name = "j", descriptor = "I")
	private int anInt5320;

	@OriginalMember(owner = "client!kq", name = "z", descriptor = "I")
	private int anInt5331;

	@OriginalMember(owner = "client!kq", name = "L", descriptor = "I")
	private int anInt5333;

	@OriginalMember(owner = "client!kq", name = "p", descriptor = "I")
	private int anInt5336;

	@OriginalMember(owner = "client!kq", name = "n", descriptor = "I")
	private int anInt5337;

	@OriginalMember(owner = "client!kq", name = "M", descriptor = "I")
	private int anInt5338;

	@OriginalMember(owner = "client!kq", name = "i", descriptor = "Ljava/awt/Component;")
	private Component aComponent3;

	@OriginalMember(owner = "client!kq", name = "A", descriptor = "Lclient!cga;")
	private Class60 aClass60_109 = new Class60();

	@OriginalMember(owner = "client!kq", name = "h", descriptor = "Lclient!cga;")
	private Class60 aClass60_110 = new Class60();

	@OriginalMember(owner = "client!kq", name = "u", descriptor = "Z")
	private final boolean aBoolean450;

	@OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class138_Sub2(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method4779(arg0);
		this.aBoolean450 = arg1;
	}

	@OriginalMember(owner = "client!kq", name = "c", descriptor = "(I)I")
	@Override
	public int method4771() {
		return this.anInt5331;
	}

	@OriginalMember(owner = "client!kq", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method4781(arg0);
		if (local10 == 1) {
			this.method4776(arg0.getClickCount(), 0, arg0.getY(), arg0.getX());
		} else if (local10 == 4) {
			this.method4776(arg0.getClickCount(), 2, arg0.getY(), arg0.getX());
		} else if (local10 == 2) {
			this.method4776(arg0.getClickCount(), 1, arg0.getY(), arg0.getX());
		}
		this.anInt5336 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIIBI)V")
	private void method4776(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class2_Sub18_Sub2 local7 = new Class2_Sub18_Sub2();
		local7.anInt7993 = arg2;
		local7.anInt7987 = arg0;
		local7.anInt7994 = arg1;
		local7.anInt7984 = arg3;
		local7.aLong249 = Static567.method7863();
		this.aClass60_110.method1233(local7);
	}

	@OriginalMember(owner = "client!kq", name = "d", descriptor = "(I)Z")
	@Override
	protected boolean method4766() {
		return (this.anInt5333 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!kq", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "(B)I")
	@Override
	public int method4767() {
		return this.anInt5320;
	}

	@OriginalMember(owner = "client!kq", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method4780(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!kq", name = "e", descriptor = "(I)V")
	@Override
	public synchronized void method4768() {
		this.anInt5333 = this.anInt5336;
		this.anInt5320 = this.anInt5338;
		this.anInt5331 = this.anInt5337;
		@Pc(18) Class60 local18 = this.aClass60_109;
		this.aClass60_109 = this.aClass60_110;
		this.aClass60_110 = local18;
		this.aClass60_110.method1223();
	}

	@OriginalMember(owner = "client!kq", name = "g", descriptor = "(I)V")
	@Override
	public void method4770() {
		this.method4783();
	}

	@OriginalMember(owner = "client!kq", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method4780(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!kq", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method4780(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "(I)Z")
	@Override
	protected boolean method4765() {
		return (this.anInt5333 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(ZLjava/awt/Component;)V")
	private void method4779(@OriginalArg(1) Component arg0) {
		this.method4783();
		this.aComponent3 = arg0;
		this.aComponent3.addMouseListener(this);
		this.aComponent3.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method4769() {
		return (this.anInt5333 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(BII)V")
	private void method4780(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt5338 = arg0;
		this.anInt5337 = arg1;
		if (this.aBoolean450) {
			this.method4776(0, -1, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;B)I")
	private int method4781(@OriginalArg(0) MouseEvent arg0) {
		@Pc(6) int local6 = arg0.getModifiers();
		@Pc(27) boolean local27 = (local6 & 0x10) != 0;
		@Pc(39) boolean local39 = (local6 & 0x8) != 0;
		@Pc(51) boolean local51 = (local6 & 0x4) != 0;
		if (local39 && (local27 || local51)) {
			local39 = false;
		}
		if (local27 && local51) {
			return 4;
		} else if (local27) {
			return 1;
		} else if (local39) {
			return 2;
		} else if (local51) {
			return 4;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!kq", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method4780(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!kq", name = "i", descriptor = "(I)V")
	private void method4783() {
		if (this.aComponent3 == null) {
			return;
		}
		this.aComponent3.removeMouseMotionListener(this);
		this.aComponent3.removeMouseListener(this);
		this.aComponent3 = null;
		this.anInt5320 = this.anInt5331 = this.anInt5333 = 0;
		this.aClass60_110 = null;
		this.aClass60_109 = null;
		this.anInt5338 = this.anInt5337 = this.anInt5336 = 0;
	}

	@OriginalMember(owner = "client!kq", name = "f", descriptor = "(I)Lclient!em;")
	@Override
	public Class2_Sub18 method4772() {
		return (Class2_Sub18) this.aClass60_109.method1225();
	}

	@OriginalMember(owner = "client!kq", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method4781(arg0);
		if ((local8 & this.anInt5336) == 0) {
			local8 = this.anInt5336;
		}
		if ((local8 & 0x1) != 0) {
			this.method4776(arg0.getClickCount(), 3, arg0.getY(), arg0.getX());
		}
		if ((local8 & 0x4) != 0) {
			this.method4776(arg0.getClickCount(), 5, arg0.getY(), arg0.getX());
		}
		if ((local8 & 0x2) != 0) {
			this.method4776(arg0.getClickCount(), 4, arg0.getY(), arg0.getX());
		}
		this.anInt5336 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}
}
