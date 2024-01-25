import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uaa")
public final class Class161_Sub2 extends Class161 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!uaa", name = "w", descriptor = "I")
	private int anInt10238;

	@OriginalMember(owner = "client!uaa", name = "z", descriptor = "I")
	private int anInt10247;

	@OriginalMember(owner = "client!uaa", name = "h", descriptor = "I")
	private int anInt10248;

	@OriginalMember(owner = "client!uaa", name = "m", descriptor = "I")
	private int anInt10261;

	@OriginalMember(owner = "client!uaa", name = "I", descriptor = "I")
	private int anInt10263;

	@OriginalMember(owner = "client!uaa", name = "F", descriptor = "I")
	private int anInt10264;

	@OriginalMember(owner = "client!uaa", name = "v", descriptor = "Ljava/awt/Component;")
	private Component aComponent5;

	@OriginalMember(owner = "client!uaa", name = "n", descriptor = "Lclient!tj;")
	private Class357 aClass357_59 = new Class357();

	@OriginalMember(owner = "client!uaa", name = "j", descriptor = "Lclient!tj;")
	private Class357 aClass357_60 = new Class357();

	@OriginalMember(owner = "client!uaa", name = "J", descriptor = "Z")
	private final boolean aBoolean739;

	@OriginalMember(owner = "client!uaa", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class161_Sub2(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method8583(arg0);
		this.aBoolean739 = arg1;
	}

	@OriginalMember(owner = "client!uaa", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method8587(arg0);
		if (local10 == 1) {
			this.method8586(0, arg0.getClickCount(), arg0.getY(), arg0.getX());
		} else if (local10 == 4) {
			this.method8586(2, arg0.getClickCount(), arg0.getY(), arg0.getX());
		} else if (local10 == 2) {
			this.method8586(1, arg0.getClickCount(), arg0.getY(), arg0.getX());
		}
		this.anInt10261 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(ILjava/awt/Component;)V")
	private void method8583(@OriginalArg(1) Component arg0) {
		this.method8588();
		this.aComponent5 = arg0;
		this.aComponent5.addMouseListener(this);
		this.aComponent5.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!uaa", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8579() {
		return (this.anInt10247 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!uaa", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method8587(arg0);
		if ((this.anInt10261 & local8) == 0) {
			local8 = this.anInt10261;
		}
		if ((local8 & 0x1) != 0) {
			this.method8586(3, arg0.getClickCount(), arg0.getY(), arg0.getX());
		}
		if ((local8 & 0x4) != 0) {
			this.method8586(5, arg0.getClickCount(), arg0.getY(), arg0.getX());
		}
		if ((local8 & 0x2) != 0) {
			this.method8586(4, arg0.getClickCount(), arg0.getY(), arg0.getX());
		}
		this.anInt10261 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!uaa", name = "b", descriptor = "(I)V")
	@Override
	public void method8575() {
		this.method8588();
	}

	@OriginalMember(owner = "client!uaa", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method8585(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(III)V")
	private void method8585(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt10264 = arg1;
		this.anInt10263 = arg0;
		if (this.aBoolean739) {
			this.method8586(-1, 0, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(IIIII)V")
	private void method8586(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class3_Sub14_Sub1 local7 = new Class3_Sub14_Sub1();
		local7.anInt1310 = arg3;
		local7.anInt1312 = arg2;
		local7.anInt1314 = arg0;
		local7.anInt1309 = arg1;
		local7.aLong66 = Static626.method8479();
		this.aClass357_60.method8401(local7);
	}

	@OriginalMember(owner = "client!uaa", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method8585(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!uaa", name = "c", descriptor = "(I)Z")
	@Override
	protected boolean method8572() {
		return (this.anInt10247 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!uaa", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method8585(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!uaa", name = "c", descriptor = "(B)Lclient!td;")
	@Override
	public Class3_Sub14 method8578() {
		return (Class3_Sub14) this.aClass357_59.method8398();
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method8574() {
		this.anInt10238 = this.anInt10264;
		this.anInt10248 = this.anInt10263;
		this.anInt10247 = this.anInt10261;
		@Pc(18) Class357 local18 = this.aClass357_59;
		this.aClass357_59 = this.aClass357_60;
		this.aClass357_60 = local18;
		this.aClass357_60.method8403();
	}

	@OriginalMember(owner = "client!uaa", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method8585(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)I")
	private int method8587(@OriginalArg(1) MouseEvent arg0) {
		@Pc(6) int local6 = arg0.getModifiers();
		@Pc(18) boolean local18 = (local6 & 0x10) != 0;
		@Pc(27) boolean local27 = (local6 & 0x8) != 0;
		@Pc(39) boolean local39 = (local6 & 0x4) != 0;
		if (local27 && (local18 || local39)) {
			local27 = false;
		}
		if (local18 && local39) {
			return 4;
		} else if (local18) {
			return 1;
		} else if (local27) {
			return 2;
		} else if (local39) {
			return 4;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!uaa", name = "d", descriptor = "(I)Z")
	@Override
	protected boolean method8582() {
		return (this.anInt10247 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(B)I")
	@Override
	public int method8573() {
		return this.anInt10248;
	}

	@OriginalMember(owner = "client!uaa", name = "e", descriptor = "(I)I")
	@Override
	public int method8581() {
		return this.anInt10238;
	}

	@OriginalMember(owner = "client!uaa", name = "b", descriptor = "(Z)V")
	private void method8588() {
		if (this.aComponent5 == null) {
			return;
		}
		this.aComponent5.removeMouseMotionListener(this);
		this.aComponent5.removeMouseListener(this);
		this.aClass357_60 = null;
		this.anInt10238 = this.anInt10248 = this.anInt10247 = 0;
		this.aClass357_59 = null;
		this.anInt10264 = this.anInt10263 = this.anInt10261 = 0;
		this.aComponent5 = null;
	}

	@OriginalMember(owner = "client!uaa", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}
}
