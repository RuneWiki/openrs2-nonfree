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

@OriginalClass("client!ik")
public final class Class95_Sub1 extends Class95 implements MouseListener, MouseMotionListener, MouseWheelListener {

	@OriginalMember(owner = "client!ik", name = "h", descriptor = "I")
	private int anInt3357;

	@OriginalMember(owner = "client!ik", name = "i", descriptor = "I")
	private int anInt3358;

	@OriginalMember(owner = "client!ik", name = "j", descriptor = "I")
	private int anInt3359;

	@OriginalMember(owner = "client!ik", name = "m", descriptor = "I")
	private int anInt3360;

	@OriginalMember(owner = "client!ik", name = "n", descriptor = "I")
	private int anInt3361;

	@OriginalMember(owner = "client!ik", name = "o", descriptor = "I")
	private int anInt3362;

	@OriginalMember(owner = "client!ik", name = "q", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!ik", name = "k", descriptor = "Lclient!gw;")
	private Class91 aClass91_21 = new Class91();

	@OriginalMember(owner = "client!ik", name = "l", descriptor = "Lclient!gw;")
	private Class91 aClass91_22 = new Class91();

	@OriginalMember(owner = "client!ik", name = "p", descriptor = "Z")
	private final boolean aBoolean226;

	@OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class95_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method3006(arg0);
		this.aBoolean226 = arg1;
	}

	@OriginalMember(owner = "client!ik", name = "h", descriptor = "(I)Lclient!sm;")
	@Override
	public Class4_Sub15 method5178() {
		return (Class4_Sub15) this.aClass91_21.method2583();
	}

	@OriginalMember(owner = "client!ik", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method3008(arg0);
		if (local4 == 1) {
			this.method3005(arg0.getX(), 0, 0, arg0.getY());
		} else if (local4 == 4) {
			this.method3005(arg0.getX(), 2, 0, arg0.getY());
		} else if (local4 == 2) {
			this.method3005(arg0.getX(), 1, 0, arg0.getY());
		}
		this.anInt3362 |= local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ik", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		@Pc(8) int local8 = arg0.getWheelRotation();
		this.method3005(local2, 6, local8, local5);
		arg0.consume();
	}

	@OriginalMember(owner = "client!ik", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method3007(arg0);
	}

	@OriginalMember(owner = "client!ik", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method3007(arg0);
	}

	@OriginalMember(owner = "client!ik", name = "i", descriptor = "(I)V")
	private void method3004() {
		if (this.aComponent1 == null) {
			return;
		}
		this.aComponent1.removeMouseWheelListener(this);
		this.aComponent1.removeMouseMotionListener(this);
		this.aComponent1.removeMouseListener(this);
		this.anInt3359 = this.anInt3357 = this.anInt3358 = 0;
		this.aClass91_22 = null;
		this.aComponent1 = null;
		this.aClass91_21 = null;
		this.anInt3361 = this.anInt3360 = this.anInt3362 = 0;
	}

	@OriginalMember(owner = "client!ik", name = "e", descriptor = "(I)Z")
	@Override
	protected boolean method5173() {
		return (this.anInt3358 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(B)V")
	@Override
	public synchronized void method5177() {
		this.anInt3359 = this.anInt3361;
		this.anInt3357 = this.anInt3360;
		this.anInt3358 = this.anInt3362;
		@Pc(14) Class91 local14 = this.aClass91_21;
		this.aClass91_21 = this.aClass91_22;
		this.aClass91_22 = local14;
		this.aClass91_22.method2582();
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(B)I")
	@Override
	public int method5170() {
		return this.anInt3359;
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(I)Z")
	@Override
	protected boolean method5168() {
		return (this.anInt3358 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!ik", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method5174() {
		return (this.anInt3358 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ik", name = "d", descriptor = "(I)V")
	@Override
	public void method5172() {
		this.method3004();
	}

	@OriginalMember(owner = "client!ik", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method3008(arg0);
		if ((local4 & this.anInt3362) == 0) {
			local4 = this.anInt3362;
		}
		if ((local4 & 0x1) != 0) {
			this.method3005(arg0.getX(), 3, 0, arg0.getY());
		}
		if ((local4 & 0x4) != 0) {
			this.method3005(arg0.getX(), 5, 0, arg0.getY());
		}
		if ((local4 & 0x2) != 0) {
			this.method3005(arg0.getX(), 4, 0, arg0.getY());
		}
		this.anInt3362 &= ~local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ik", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method3007(arg0);
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIII)V")
	private void method3005(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class4_Sub15_Sub1 local3 = new Class4_Sub15_Sub1();
		local3.anInt2170 = arg0;
		local3.anInt2171 = arg1;
		local3.anInt2169 = arg3;
		local3.aLong72 = Static167.method2929();
		local3.anInt2168 = arg2;
		this.aClass91_22.method2587(local3);
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
	private void method3006(@OriginalArg(0) Component arg0) {
		this.method3004();
		this.aComponent1 = arg0;
		this.aComponent1.addMouseListener(this);
		this.aComponent1.addMouseMotionListener(this);
		this.aComponent1.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)V")
	private void method3007(@OriginalArg(1) MouseEvent arg0) {
		this.anInt3361 = arg0.getX();
		this.anInt3360 = arg0.getY();
		if (this.aBoolean226) {
			this.method3005(arg0.getX(), -1, 0, arg0.getY());
		}
	}

	@OriginalMember(owner = "client!ik", name = "g", descriptor = "(I)I")
	@Override
	public int method5175() {
		return this.anInt3357;
	}

	@OriginalMember(owner = "client!ik", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.anInt3360 = -1;
		this.anInt3361 = -1;
	}

	@OriginalMember(owner = "client!ik", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)I")
	private int method3008(@OriginalArg(0) MouseEvent arg0) {
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
}
