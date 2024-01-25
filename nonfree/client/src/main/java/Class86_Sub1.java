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

@OriginalClass("client!fea")
public final class Class86_Sub1 extends Class86 implements MouseListener, MouseMotionListener, MouseWheelListener {

	@OriginalMember(owner = "client!fea", name = "h", descriptor = "I")
	private int anInt3088;

	@OriginalMember(owner = "client!fea", name = "j", descriptor = "I")
	private int anInt3089;

	@OriginalMember(owner = "client!fea", name = "k", descriptor = "I")
	private int anInt3090;

	@OriginalMember(owner = "client!fea", name = "l", descriptor = "I")
	private int anInt3091;

	@OriginalMember(owner = "client!fea", name = "n", descriptor = "I")
	private int anInt3092;

	@OriginalMember(owner = "client!fea", name = "o", descriptor = "I")
	private int anInt3093;

	@OriginalMember(owner = "client!fea", name = "q", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!fea", name = "i", descriptor = "Lclient!gk;")
	private Class112 aClass112_22 = new Class112();

	@OriginalMember(owner = "client!fea", name = "m", descriptor = "Lclient!gk;")
	private Class112 aClass112_23 = new Class112();

	@OriginalMember(owner = "client!fea", name = "p", descriptor = "Z")
	private final boolean aBoolean250;

	@OriginalMember(owner = "client!fea", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class86_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method2784(arg0);
		this.aBoolean250 = arg1;
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(I)V")
	@Override
	public void method7262() {
		this.method2788();
	}

	@OriginalMember(owner = "client!fea", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method7264() {
		this.anInt3089 = this.anInt3091;
		this.anInt3090 = this.anInt3093;
		this.anInt3088 = this.anInt3092;
		@Pc(20) Class112 local20 = this.aClass112_22;
		this.aClass112_22 = this.aClass112_23;
		this.aClass112_23 = local20;
		this.aClass112_23.method3092();
	}

	@OriginalMember(owner = "client!fea", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method2786(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!fea", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method7269() {
		return (this.anInt3090 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!fea", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!fea", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method2785(arg0);
		if (local4 == 1) {
			this.method2787(0, arg0.getX(), arg0.getY(), arg0.getClickCount());
		} else if (local4 == 4) {
			this.method2787(2, arg0.getX(), arg0.getY(), arg0.getClickCount());
		} else if (local4 == 2) {
			this.method2787(1, arg0.getX(), arg0.getY(), arg0.getClickCount());
		}
		this.anInt3093 |= local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(ILjava/awt/Component;)V")
	private void method2784(@OriginalArg(1) Component arg0) {
		this.method2788();
		this.aComponent2 = arg0;
		this.aComponent2.addMouseListener(this);
		this.aComponent2.addMouseMotionListener(this);
		this.aComponent2.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(BLjava/awt/event/MouseEvent;)I")
	private int method2785(@OriginalArg(1) MouseEvent arg0) {
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

	@OriginalMember(owner = "client!fea", name = "h", descriptor = "(I)Z")
	@Override
	protected boolean method7272() {
		return (this.anInt3090 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!fea", name = "e", descriptor = "(I)Lclient!aaa;")
	@Override
	public Class3_Sub1 method7268() {
		return (Class3_Sub1) this.aClass112_22.method3094();
	}

	@OriginalMember(owner = "client!fea", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method2786(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!fea", name = "d", descriptor = "(I)Z")
	@Override
	protected boolean method7266() {
		return (this.anInt3090 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(IZI)V")
	private void method2786(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt3091 = arg1;
		this.anInt3092 = arg0;
		if (this.aBoolean250) {
			this.method2787(-1, arg1, arg0, 0);
		}
	}

	@OriginalMember(owner = "client!fea", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method2786(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!fea", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method2786(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!fea", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		@Pc(8) int local8 = arg0.getWheelRotation();
		this.method2787(6, local2, local5, local8);
		arg0.consume();
	}

	@OriginalMember(owner = "client!fea", name = "c", descriptor = "(I)I")
	@Override
	public int method7265() {
		return this.anInt3088;
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(Z)I")
	@Override
	public int method7267() {
		return this.anInt3089;
	}

	@OriginalMember(owner = "client!fea", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method2785(arg0);
		if ((local4 & this.anInt3093) == 0) {
			local4 = this.anInt3093;
		}
		if ((local4 & 0x1) != 0) {
			this.method2787(3, arg0.getX(), arg0.getY(), arg0.getClickCount());
		}
		if ((local4 & 0x4) != 0) {
			this.method2787(5, arg0.getX(), arg0.getY(), arg0.getClickCount());
		}
		if ((local4 & 0x2) != 0) {
			this.method2787(4, arg0.getX(), arg0.getY(), arg0.getClickCount());
		}
		this.anInt3093 &= ~local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(IIIII)V")
	private void method2787(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class3_Sub1_Sub1 local3 = new Class3_Sub1_Sub1();
		local3.anInt6205 = arg1;
		local3.anInt6207 = arg2;
		local3.anInt6204 = arg0;
		local3.aLong161 = Static158.method2936();
		local3.anInt6206 = arg3;
		this.aClass112_23.method3079(local3);
	}

	@OriginalMember(owner = "client!fea", name = "b", descriptor = "(B)V")
	private void method2788() {
		if (this.aComponent2 == null) {
			return;
		}
		this.aComponent2.removeMouseWheelListener(this);
		this.aComponent2.removeMouseMotionListener(this);
		this.aComponent2.removeMouseListener(this);
		this.anInt3089 = this.anInt3088 = this.anInt3090 = 0;
		this.anInt3091 = this.anInt3092 = this.anInt3093 = 0;
		this.aClass112_22 = null;
		this.aClass112_23 = null;
		this.aComponent2 = null;
	}
}
