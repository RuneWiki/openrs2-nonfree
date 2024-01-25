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

@OriginalClass("client!hn")
public final class Class134_Sub1 extends Class134 implements MouseListener, MouseMotionListener, MouseWheelListener {

	@OriginalMember(owner = "client!hn", name = "e", descriptor = "I")
	private int anInt3333;

	@OriginalMember(owner = "client!hn", name = "f", descriptor = "I")
	private int anInt3334;

	@OriginalMember(owner = "client!hn", name = "g", descriptor = "I")
	private int anInt3335;

	@OriginalMember(owner = "client!hn", name = "h", descriptor = "I")
	private int anInt3336;

	@OriginalMember(owner = "client!hn", name = "i", descriptor = "I")
	private int anInt3337;

	@OriginalMember(owner = "client!hn", name = "j", descriptor = "I")
	private int anInt3338;

	@OriginalMember(owner = "client!hn", name = "l", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!hn", name = "d", descriptor = "Lclient!rh;")
	private Class275 aClass275_65 = new Class275();

	@OriginalMember(owner = "client!hn", name = "k", descriptor = "Lclient!rh;")
	private Class275 aClass275_66 = new Class275();

	@OriginalMember(owner = "client!hn", name = "m", descriptor = "Z")
	private final boolean aBoolean221;

	@OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class134_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method2889(arg0);
		this.aBoolean221 = arg1;
	}

	@OriginalMember(owner = "client!hn", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method2885(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!hn", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method2885(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(BII)V")
	private void method2885(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt3336 = arg0;
		this.anInt3337 = arg1;
		if (this.aBoolean221) {
			this.method2888(arg1, 0, arg0, -1);
		}
	}

	@OriginalMember(owner = "client!hn", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!hn", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method6094() {
		return (this.anInt3334 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!hn", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method2887(arg0);
		if (local4 == 1) {
			this.method2888(arg0.getY(), 0, arg0.getX(), 0);
		} else if (local4 == 4) {
			this.method2888(arg0.getY(), 0, arg0.getX(), 2);
		} else if (local4 == 2) {
			this.method2888(arg0.getY(), 0, arg0.getX(), 1);
		}
		this.anInt3338 |= local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!hn", name = "g", descriptor = "(I)V")
	private void method2886() {
		if (this.aComponent2 == null) {
			return;
		}
		this.aComponent2.removeMouseWheelListener(this);
		this.aComponent2.removeMouseMotionListener(this);
		this.aComponent2.removeMouseListener(this);
		this.anInt3333 = this.anInt3335 = this.anInt3334 = 0;
		this.aClass275_66 = null;
		this.anInt3336 = this.anInt3337 = this.anInt3338 = 0;
		this.aClass275_65 = null;
		this.aComponent2 = null;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)I")
	private int method2887(@OriginalArg(0) MouseEvent arg0) {
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

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)Z")
	@Override
	protected boolean method6087() {
		return (this.anInt3334 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIIII)V")
	private void method2888(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class6_Sub8_Sub2 local3 = new Class6_Sub8_Sub2();
		local3.anInt9347 = arg0;
		local3.anInt9346 = arg3;
		local3.anInt9345 = arg2;
		local3.aLong240 = Static137.method2058();
		local3.anInt9348 = arg1;
		this.aClass275_66.method6370(local3);
	}

	@OriginalMember(owner = "client!hn", name = "e", descriptor = "(I)Lclient!bv;")
	@Override
	public Class6_Sub8 method6095() {
		return (Class6_Sub8) this.aClass275_65.method6360();
	}

	@OriginalMember(owner = "client!hn", name = "f", descriptor = "(I)Z")
	@Override
	protected boolean method6096() {
		return (this.anInt3334 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!hn", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method2887(arg0);
		if ((this.anInt3338 & local4) == 0) {
			local4 = this.anInt3338;
		}
		if ((local4 & 0x1) != 0) {
			this.method2888(arg0.getY(), 0, arg0.getX(), 3);
		}
		if ((local4 & 0x4) != 0) {
			this.method2888(arg0.getY(), 0, arg0.getX(), 5);
		}
		if ((local4 & 0x2) != 0) {
			this.method2888(arg0.getY(), 0, arg0.getX(), 4);
		}
		this.anInt3338 &= ~local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!hn", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method2885(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(B)I")
	@Override
	public int method6092() {
		return this.anInt3335;
	}

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method6090() {
		this.anInt3333 = this.anInt3336;
		this.anInt3335 = this.anInt3337;
		this.anInt3334 = this.anInt3338;
		@Pc(20) Class275 local20 = this.aClass275_65;
		this.aClass275_65 = this.aClass275_66;
		this.aClass275_66 = local20;
		this.aClass275_66.method6357();
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(ILjava/awt/Component;)V")
	private void method2889(@OriginalArg(1) Component arg0) {
		this.method2886();
		this.aComponent2 = arg0;
		this.aComponent2.addMouseListener(this);
		this.aComponent2.addMouseMotionListener(this);
		this.aComponent2.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!hn", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		@Pc(8) int local8 = arg0.getWheelRotation();
		this.method2888(local5, local8, local2, 6);
		arg0.consume();
	}

	@OriginalMember(owner = "client!hn", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method2885(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!hn", name = "c", descriptor = "(I)V")
	@Override
	public void method6091() {
		this.method2886();
	}

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "(B)I")
	@Override
	public int method6093() {
		return this.anInt3333;
	}
}
