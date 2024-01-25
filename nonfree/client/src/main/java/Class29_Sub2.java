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

@OriginalClass("client!gk")
public final class Class29_Sub2 extends Class29 implements MouseListener, MouseMotionListener, MouseWheelListener {

	@OriginalMember(owner = "client!gk", name = "h", descriptor = "I")
	private int anInt3411;

	@OriginalMember(owner = "client!gk", name = "i", descriptor = "I")
	private int anInt3412;

	@OriginalMember(owner = "client!gk", name = "j", descriptor = "I")
	private int anInt3413;

	@OriginalMember(owner = "client!gk", name = "k", descriptor = "I")
	private int anInt3414;

	@OriginalMember(owner = "client!gk", name = "m", descriptor = "I")
	private int anInt3415;

	@OriginalMember(owner = "client!gk", name = "n", descriptor = "I")
	private int anInt3416;

	@OriginalMember(owner = "client!gk", name = "o", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!gk", name = "g", descriptor = "Lclient!su;")
	private Class298 aClass298_75 = new Class298();

	@OriginalMember(owner = "client!gk", name = "l", descriptor = "Lclient!su;")
	private Class298 aClass298_76 = new Class298();

	@OriginalMember(owner = "client!gk", name = "p", descriptor = "Z")
	private final boolean aBoolean279;

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class29_Sub2(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method2951(arg0);
		this.aBoolean279 = arg1;
	}

	@OriginalMember(owner = "client!gk", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method2952(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IBIII)V")
	private void method2950(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class6_Sub41_Sub1 local7 = new Class6_Sub41_Sub1();
		local7.anInt7917 = arg1;
		local7.anInt7919 = arg2;
		local7.anInt7918 = arg0;
		local7.aLong196 = Static416.method5922();
		local7.anInt7916 = arg3;
		this.aClass298_76.method6812(local7);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method2938() {
		this.anInt3412 = this.anInt3416;
		this.anInt3411 = this.anInt3414;
		this.anInt3413 = this.anInt3415;
		@Pc(14) Class298 local14 = this.aClass298_75;
		this.aClass298_75 = this.aClass298_76;
		this.aClass298_76 = local14;
		this.aClass298_76.method6808();
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(I)I")
	@Override
	public int method2942() {
		return this.anInt3412;
	}

	@OriginalMember(owner = "client!gk", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method2952(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
	private void method2951(@OriginalArg(0) Component arg0) {
		this.method2954();
		this.aComponent2 = arg0;
		this.aComponent2.addMouseListener(this);
		this.aComponent2.addMouseMotionListener(this);
		this.aComponent2.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(III)V")
	private void method2952(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt3416 = arg0;
		this.anInt3415 = arg1;
		if (this.aBoolean279) {
			this.method2950(arg0, -1, arg1, 0);
		}
	}

	@OriginalMember(owner = "client!gk", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method2953(arg0);
		if (local4 == 1) {
			this.method2950(arg0.getY(), 0, arg0.getX(), 0);
		} else if (local4 == 4) {
			this.method2950(arg0.getY(), 2, arg0.getX(), 0);
		} else if (local4 == 2) {
			this.method2950(arg0.getY(), 1, arg0.getX(), 0);
		}
		this.anInt3414 |= local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)I")
	private int method2953(@OriginalArg(0) MouseEvent arg0) {
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

	@OriginalMember(owner = "client!gk", name = "d", descriptor = "(I)Lclient!qea;")
	@Override
	public Class6_Sub41 method2948() {
		return (Class6_Sub41) this.aClass298_75.method6811();
	}

	@OriginalMember(owner = "client!gk", name = "d", descriptor = "(B)I")
	@Override
	public int method2946() {
		return this.anInt3413;
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method2941() {
		return (this.anInt3411 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!gk", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		@Pc(8) int local8 = arg0.getWheelRotation();
		this.method2950(local5, 6, local2, local8);
		arg0.consume();
	}

	@OriginalMember(owner = "client!gk", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)Z")
	@Override
	protected boolean method2939() {
		return (this.anInt3411 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!gk", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method2952(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!gk", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method2952(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!gk", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method2953(arg0);
		if ((local4 & this.anInt3414) == 0) {
			local4 = this.anInt3414;
		}
		if ((local4 & 0x1) != 0) {
			this.method2950(arg0.getY(), 3, arg0.getX(), 0);
		}
		if ((local4 & 0x4) != 0) {
			this.method2950(arg0.getY(), 5, arg0.getX(), 0);
		}
		if ((local4 & 0x2) != 0) {
			this.method2950(arg0.getY(), 4, arg0.getX(), 0);
		}
		this.anInt3414 &= ~local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!gk", name = "e", descriptor = "(I)V")
	private void method2954() {
		if (this.aComponent2 == null) {
			return;
		}
		this.aComponent2.removeMouseWheelListener(this);
		this.aComponent2.removeMouseMotionListener(this);
		this.aComponent2.removeMouseListener(this);
		this.aComponent2 = null;
		this.anInt3413 = this.anInt3412 = this.anInt3411 = 0;
		this.anInt3415 = this.anInt3416 = this.anInt3414 = 0;
		this.aClass298_76 = null;
		this.aClass298_75 = null;
	}

	@OriginalMember(owner = "client!gk", name = "e", descriptor = "(B)V")
	@Override
	public void method2949() {
		this.method2954();
	}

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "(I)Z")
	@Override
	protected boolean method2947() {
		return (this.anInt3411 & 0x4) != 0;
	}
}
