import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rg")
public final class Class142_Sub1 extends Class142 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!rg", name = "o", descriptor = "I")
	private int anInt5368;

	@OriginalMember(owner = "client!rg", name = "w", descriptor = "I")
	private int anInt5375;

	@OriginalMember(owner = "client!rg", name = "J", descriptor = "I")
	private int anInt5387;

	@OriginalMember(owner = "client!rg", name = "K", descriptor = "I")
	private int anInt5388;

	@OriginalMember(owner = "client!rg", name = "L", descriptor = "I")
	private int anInt5389;

	@OriginalMember(owner = "client!rg", name = "O", descriptor = "I")
	private int anInt5391;

	@OriginalMember(owner = "client!rg", name = "P", descriptor = "Ljava/awt/Component;")
	private Component aComponent3;

	@OriginalMember(owner = "client!rg", name = "n", descriptor = "Lclient!eb;")
	private Class42 aClass42_41 = new Class42();

	@OriginalMember(owner = "client!rg", name = "N", descriptor = "Lclient!eb;")
	private Class42 aClass42_42 = new Class42();

	@OriginalMember(owner = "client!rg", name = "Q", descriptor = "Z")
	private final boolean aBoolean417;

	static {
		new Class106("Select", "Auswählen", "Sélectionner", "Selecionar");
	}

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class142_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method4924(arg0);
		this.aBoolean417 = arg1;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method4907() {
		return (this.anInt5387 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!rg", name = "d", descriptor = "(I)I")
	@Override
	public int method4911() {
		return this.anInt5375;
	}

	@OriginalMember(owner = "client!rg", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method4927(arg0);
	}

	@OriginalMember(owner = "client!rg", name = "h", descriptor = "(I)Lclient!rb;")
	@Override
	public Class1_Sub8 method4918() {
		return (Class1_Sub8) this.aClass42_41.method1541();
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)Z")
	@Override
	protected boolean method4908() {
		return (this.anInt5387 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIII)V")
	private void method4920(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class1_Sub8_Sub1 local7 = new Class1_Sub8_Sub1();
		local7.anInt556 = arg1;
		local7.anInt554 = arg0;
		local7.anInt552 = arg2;
		local7.aLong23 = Static183.method3462();
		this.aClass42_42.method1549(local7);
	}

	@OriginalMember(owner = "client!rg", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method4923(arg0);
		if ((local8 & this.anInt5389) == 0) {
			local8 = this.anInt5389;
		}
		if ((local8 & 0x1) != 0) {
			this.method4920(3, arg0.getX(), arg0.getY());
		}
		if ((local8 & 0x4) != 0) {
			this.method4920(5, arg0.getX(), arg0.getY());
		}
		if ((local8 & 0x2) != 0) {
			this.method4920(4, arg0.getX(), arg0.getY());
		}
		this.anInt5389 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "(B)V")
	private void method4921() {
		if (this.aComponent3 == null) {
			return;
		}
		this.aComponent3.removeMouseListener(this);
		this.aComponent3.removeMouseMotionListener(this);
		this.anInt5391 = this.anInt5388 = this.anInt5389 = 0;
		this.aComponent3 = null;
		this.aClass42_42 = null;
		this.anInt5375 = this.anInt5368 = this.anInt5387 = 0;
		this.aClass42_41 = null;
	}

	@OriginalMember(owner = "client!rg", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!rg", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method4923(arg0);
		if (local10 == 1) {
			this.method4920(0, arg0.getX(), arg0.getY());
		} else if (local10 == 4) {
			this.method4920(2, arg0.getX(), arg0.getY());
		} else if (local10 == 2) {
			this.method4920(1, arg0.getX(), arg0.getY());
		}
		this.anInt5389 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)I")
	private int method4923(@OriginalArg(0) MouseEvent arg0) {
		@Pc(6) int local6 = arg0.getModifiers();
		@Pc(14) boolean local14 = (local6 & 0x10) != 0;
		@Pc(25) boolean local25 = (local6 & 0x8) != 0;
		@Pc(33) boolean local33 = (local6 & 0x4) != 0;
		if (local25 && (local14 || local33)) {
			local25 = false;
		}
		if (local14 && local33) {
			return 4;
		} else if (local14) {
			return 1;
		} else if (local25) {
			return 2;
		} else if (local33) {
			return 4;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(BLjava/awt/Component;)V")
	private void method4924(@OriginalArg(1) Component arg0) {
		this.method4921();
		this.aComponent3 = arg0;
		this.aComponent3.addMouseListener(this);
		this.aComponent3.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!rg", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.anInt5388 = -1;
		this.anInt5391 = -1;
	}

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method4910() {
		this.anInt5387 = this.anInt5389;
		this.anInt5375 = this.anInt5391;
		this.anInt5368 = this.anInt5388;
		@Pc(26) Class42 local26 = this.aClass42_41;
		this.aClass42_41 = this.aClass42_42;
		this.aClass42_42 = local26;
		this.aClass42_42.method1542();
	}

	@OriginalMember(owner = "client!rg", name = "g", descriptor = "(I)I")
	@Override
	public int method4915() {
		return this.anInt5368;
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(B)V")
	@Override
	public void method4916() {
		this.method4921();
	}

	@OriginalMember(owner = "client!rg", name = "e", descriptor = "(I)Z")
	@Override
	protected boolean method4912() {
		return (this.anInt5387 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(BLjava/awt/event/MouseEvent;)V")
	private void method4927(@OriginalArg(1) MouseEvent arg0) {
		this.anInt5391 = arg0.getX();
		this.anInt5388 = arg0.getY();
		if (this.aBoolean417) {
			this.method4920(-1, arg0.getX(), arg0.getY());
		}
	}

	@OriginalMember(owner = "client!rg", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method4927(arg0);
	}

	@OriginalMember(owner = "client!rg", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method4927(arg0);
	}
}
