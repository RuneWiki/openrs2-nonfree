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

@OriginalClass("client!maa")
public final class Class128_Sub2 extends Class128 implements MouseListener, MouseMotionListener, MouseWheelListener {

	@OriginalMember(owner = "client!maa", name = "f", descriptor = "I")
	private int anInt6142;

	@OriginalMember(owner = "client!maa", name = "g", descriptor = "I")
	private int anInt6143;

	@OriginalMember(owner = "client!maa", name = "h", descriptor = "I")
	private int anInt6144;

	@OriginalMember(owner = "client!maa", name = "j", descriptor = "I")
	private int anInt6145;

	@OriginalMember(owner = "client!maa", name = "k", descriptor = "I")
	private int anInt6146;

	@OriginalMember(owner = "client!maa", name = "m", descriptor = "I")
	private int anInt6147;

	@OriginalMember(owner = "client!maa", name = "o", descriptor = "Ljava/awt/Component;")
	private Component aComponent4;

	@OriginalMember(owner = "client!maa", name = "i", descriptor = "Lclient!v;")
	private Class362 aClass362_28 = new Class362();

	@OriginalMember(owner = "client!maa", name = "l", descriptor = "Lclient!v;")
	private Class362 aClass362_29 = new Class362();

	@OriginalMember(owner = "client!maa", name = "n", descriptor = "Z")
	private final boolean aBoolean404;

	@OriginalMember(owner = "client!maa", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class128_Sub2(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method5198(arg0);
		this.aBoolean404 = arg1;
	}

	@OriginalMember(owner = "client!maa", name = "b", descriptor = "(B)Z")
	@Override
	protected boolean method5190() {
		return (this.anInt6142 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!maa", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method5202(arg0);
		if (local4 == 1) {
			this.method5200(arg0.getClickCount(), 0, arg0.getX(), arg0.getY());
		} else if (local4 == 4) {
			this.method5200(arg0.getClickCount(), 2, arg0.getX(), arg0.getY());
		} else if (local4 == 2) {
			this.method5200(arg0.getClickCount(), 1, arg0.getX(), arg0.getY());
		}
		this.anInt6147 |= local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!maa", name = "c", descriptor = "(B)I")
	@Override
	public int method5191() {
		return this.anInt6144;
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(BLjava/awt/Component;)V")
	private void method5198(@OriginalArg(1) Component arg0) {
		this.method5201();
		this.aComponent4 = arg0;
		this.aComponent4.addMouseListener(this);
		this.aComponent4.addMouseMotionListener(this);
		this.aComponent4.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5189() {
		return (this.anInt6142 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!maa", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method5199(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!maa", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method5199(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!maa", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		@Pc(8) int local8 = arg0.getWheelRotation();
		this.method5200(local8, 6, local2, local5);
		arg0.consume();
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(I)I")
	@Override
	public int method5188() {
		return this.anInt6143;
	}

	@OriginalMember(owner = "client!maa", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(BII)V")
	private void method5199(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt6145 = arg0;
		this.anInt6146 = arg1;
		if (this.aBoolean404) {
			this.method5200(0, -1, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!maa", name = "c", descriptor = "(I)V")
	@Override
	public void method5194() {
		this.method5201();
	}

	@OriginalMember(owner = "client!maa", name = "d", descriptor = "(I)Lclient!pea;")
	@Override
	public Class6_Sub27 method5196() {
		return (Class6_Sub27) this.aClass362_28.method8531();
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(IIIII)V")
	private void method5200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class6_Sub27_Sub2 local3 = new Class6_Sub27_Sub2();
		local3.anInt9696 = arg3;
		local3.anInt9697 = arg1;
		local3.anInt9698 = arg2;
		local3.aLong287 = Static566.method7936();
		local3.anInt9695 = arg0;
		this.aClass362_29.method8536(local3);
	}

	@OriginalMember(owner = "client!maa", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method5199(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!maa", name = "e", descriptor = "(I)V")
	private void method5201() {
		if (this.aComponent4 == null) {
			return;
		}
		this.aComponent4.removeMouseWheelListener(this);
		this.aComponent4.removeMouseMotionListener(this);
		this.aComponent4.removeMouseListener(this);
		this.aClass362_28 = null;
		this.anInt6144 = this.anInt6143 = this.anInt6142 = 0;
		this.anInt6146 = this.anInt6145 = this.anInt6147 = 0;
		this.aComponent4 = null;
		this.aClass362_29 = null;
	}

	@OriginalMember(owner = "client!maa", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method5202(arg0);
		if ((this.anInt6147 & local4) == 0) {
			local4 = this.anInt6147;
		}
		if ((local4 & 0x1) != 0) {
			this.method5200(arg0.getClickCount(), 3, arg0.getX(), arg0.getY());
		}
		if ((local4 & 0x4) != 0) {
			this.method5200(arg0.getClickCount(), 5, arg0.getX(), arg0.getY());
		}
		if ((local4 & 0x2) != 0) {
			this.method5200(arg0.getClickCount(), 4, arg0.getX(), arg0.getY());
		}
		this.anInt6147 &= ~local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!maa", name = "f", descriptor = "(B)V")
	@Override
	public synchronized void method5197() {
		this.anInt6144 = this.anInt6146;
		this.anInt6142 = this.anInt6147;
		this.anInt6143 = this.anInt6145;
		@Pc(14) Class362 local14 = this.aClass362_28;
		this.aClass362_28 = this.aClass362_29;
		this.aClass362_29 = local14;
		this.aClass362_29.method8543();
	}

	@OriginalMember(owner = "client!maa", name = "e", descriptor = "(B)Z")
	@Override
	protected boolean method5195() {
		return (this.anInt6142 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!maa", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method5199(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(BLjava/awt/event/MouseEvent;)I")
	private int method5202(@OriginalArg(1) MouseEvent arg0) {
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
