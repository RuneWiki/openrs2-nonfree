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

@OriginalClass("client!kl")
public final class Class191_Sub1 extends Class191 implements MouseListener, MouseMotionListener, MouseWheelListener {

	@OriginalMember(owner = "client!kl", name = "e", descriptor = "I")
	private int anInt5314;

	@OriginalMember(owner = "client!kl", name = "g", descriptor = "I")
	private int anInt5315;

	@OriginalMember(owner = "client!kl", name = "h", descriptor = "I")
	private int anInt5316;

	@OriginalMember(owner = "client!kl", name = "j", descriptor = "I")
	private int anInt5317;

	@OriginalMember(owner = "client!kl", name = "k", descriptor = "I")
	private int anInt5318;

	@OriginalMember(owner = "client!kl", name = "l", descriptor = "I")
	private int anInt5319;

	@OriginalMember(owner = "client!kl", name = "m", descriptor = "Ljava/awt/Component;")
	private Component aComponent4;

	@OriginalMember(owner = "client!kl", name = "f", descriptor = "Lclient!mr;")
	private Class223 aClass223_22 = new Class223();

	@OriginalMember(owner = "client!kl", name = "i", descriptor = "Lclient!mr;")
	private Class223 aClass223_23 = new Class223();

	@OriginalMember(owner = "client!kl", name = "n", descriptor = "Z")
	private final boolean aBoolean356;

	@OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class191_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method4767(arg0);
		this.aBoolean356 = arg1;
	}

	@OriginalMember(owner = "client!kl", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	private void method4767(@OriginalArg(0) Component arg0) {
		this.method4770();
		this.aComponent4 = arg0;
		this.aComponent4.addMouseListener(this);
		this.aComponent4.addMouseMotionListener(this);
		this.aComponent4.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!kl", name = "g", descriptor = "(I)V")
	@Override
	public void method6988() {
		this.method4770();
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)Z")
	@Override
	protected boolean method6980() {
		return (this.anInt5315 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!kl", name = "c", descriptor = "(I)I")
	@Override
	public int method6982() {
		return this.anInt5314;
	}

	@OriginalMember(owner = "client!kl", name = "h", descriptor = "(I)I")
	@Override
	public int method6989() {
		return this.anInt5316;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)I")
	private int method4768(@OriginalArg(1) MouseEvent arg0) {
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

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIIB)V")
	private void method4769(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class3_Sub31_Sub2 local3 = new Class3_Sub31_Sub2();
		local3.anInt7961 = arg3;
		local3.anInt7963 = arg0;
		local3.anInt7960 = arg2;
		local3.aLong217 = Static374.method6036();
		local3.anInt7962 = arg1;
		this.aClass223_23.method5868(local3);
	}

	@OriginalMember(owner = "client!kl", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method6984() {
		return (this.anInt5315 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!kl", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method6983() {
		this.anInt5315 = this.anInt5319;
		this.anInt5314 = this.anInt5318;
		this.anInt5316 = this.anInt5317;
		@Pc(14) Class223 local14 = this.aClass223_22;
		this.aClass223_22 = this.aClass223_23;
		this.aClass223_23 = local14;
		this.aClass223_23.method5862();
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(B)Lclient!rg;")
	@Override
	public Class3_Sub31 method6986() {
		return (Class3_Sub31) this.aClass223_22.method5872();
	}

	@OriginalMember(owner = "client!kl", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method4771(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!kl", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method4768(arg0);
		if ((local4 & this.anInt5319) == 0) {
			local4 = this.anInt5319;
		}
		if ((local4 & 0x1) != 0) {
			this.method4769(arg0.getY(), arg0.getClickCount(), arg0.getX(), 3);
		}
		if ((local4 & 0x4) != 0) {
			this.method4769(arg0.getY(), arg0.getClickCount(), arg0.getX(), 5);
		}
		if ((local4 & 0x2) != 0) {
			this.method4769(arg0.getY(), arg0.getClickCount(), arg0.getX(), 4);
		}
		this.anInt5319 &= ~local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!kl", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		@Pc(8) int local8 = arg0.getWheelRotation();
		this.method4769(local5, local8, local2, 6);
		arg0.consume();
	}

	@OriginalMember(owner = "client!kl", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method4768(arg0);
		if (local4 == 1) {
			this.method4769(arg0.getY(), arg0.getClickCount(), arg0.getX(), 0);
		} else if (local4 == 4) {
			this.method4769(arg0.getY(), arg0.getClickCount(), arg0.getX(), 2);
		} else if (local4 == 2) {
			this.method4769(arg0.getY(), arg0.getClickCount(), arg0.getX(), 1);
		}
		this.anInt5319 |= local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!kl", name = "i", descriptor = "(I)V")
	private void method4770() {
		if (this.aComponent4 == null) {
			return;
		}
		this.aComponent4.removeMouseWheelListener(this);
		this.aComponent4.removeMouseMotionListener(this);
		this.aComponent4.removeMouseListener(this);
		this.anInt5316 = this.anInt5314 = this.anInt5315 = 0;
		this.aClass223_23 = null;
		this.anInt5317 = this.anInt5318 = this.anInt5319 = 0;
		this.aClass223_22 = null;
		this.aComponent4 = null;
	}

	@OriginalMember(owner = "client!kl", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method4771(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!kl", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method4771(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!kl", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method4771(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(ZII)V")
	private void method4771(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt5317 = arg1;
		this.anInt5318 = arg0;
		if (this.aBoolean356) {
			this.method4769(arg0, 0, arg1, -1);
		}
	}

	@OriginalMember(owner = "client!kl", name = "f", descriptor = "(I)Z")
	@Override
	protected boolean method6987() {
		return (this.anInt5315 & 0x4) != 0;
	}
}
