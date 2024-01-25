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

@OriginalClass("client!oja")
public final class Class161_Sub1 extends Class161 implements MouseListener, MouseMotionListener, MouseWheelListener {

	@OriginalMember(owner = "client!oja", name = "i", descriptor = "I")
	private int anInt8075;

	@OriginalMember(owner = "client!oja", name = "m", descriptor = "I")
	private int anInt8076;

	@OriginalMember(owner = "client!oja", name = "e", descriptor = "I")
	private int anInt8077;

	@OriginalMember(owner = "client!oja", name = "h", descriptor = "I")
	private int anInt8078;

	@OriginalMember(owner = "client!oja", name = "g", descriptor = "I")
	private int anInt8079;

	@OriginalMember(owner = "client!oja", name = "f", descriptor = "I")
	private int anInt8080;

	@OriginalMember(owner = "client!oja", name = "k", descriptor = "Ljava/awt/Component;")
	private Component aComponent4;

	@OriginalMember(owner = "client!oja", name = "j", descriptor = "Lclient!tj;")
	private Class357 aClass357_47 = new Class357();

	@OriginalMember(owner = "client!oja", name = "n", descriptor = "Lclient!tj;")
	private Class357 aClass357_48 = new Class357();

	@OriginalMember(owner = "client!oja", name = "l", descriptor = "Z")
	private final boolean aBoolean618;

	@OriginalMember(owner = "client!oja", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	private Class161_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method6807((byte) -123, arg0);
		this.aBoolean618 = arg1;
	}

	@OriginalMember(owner = "client!oja", name = "a", descriptor = "(B)I")
	@Override
	public int method8573() {
		return this.anInt8075;
	}

	@OriginalMember(owner = "client!oja", name = "e", descriptor = "(I)I")
	@Override
	public int method8581() {
		return this.anInt8076;
	}

	@OriginalMember(owner = "client!oja", name = "d", descriptor = "(I)Z")
	@Override
	protected boolean method8582() {
		return (this.anInt8077 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!oja", name = "a", descriptor = "(III)V")
	private void method6806(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt8078 = arg1;
		this.anInt8080 = arg0;
		if (this.aBoolean618) {
			this.method6809(arg0, -1, arg1, 0);
		}
	}

	@OriginalMember(owner = "client!oja", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method6808(arg0);
		if (local4 == 1) {
			this.method6809(arg0.getY(), 0, arg0.getX(), arg0.getClickCount());
		} else if (local4 == 4) {
			this.method6809(arg0.getY(), 2, arg0.getX(), arg0.getClickCount());
		} else if (local4 == 2) {
			this.method6809(arg0.getY(), 1, arg0.getX(), arg0.getClickCount());
		}
		this.anInt8079 |= local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!oja", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method6806(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!oja", name = "c", descriptor = "(I)Z")
	@Override
	protected boolean method8572() {
		return (this.anInt8077 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!oja", name = "b", descriptor = "(I)V")
	@Override
	public void method8575() {
		this.method6810();
	}

	@OriginalMember(owner = "client!oja", name = "a", descriptor = "(BLjava/awt/Component;)V")
	private void method6807(@OriginalArg(0) byte arg0, @OriginalArg(1) Component arg1) {
		this.method6810();
		this.aComponent4 = arg1;
		this.aComponent4.addMouseListener(this);
		this.aComponent4.addMouseMotionListener(this);
		if (arg0 > -119) {
			this.anInt8075 = -46;
		}
		this.aComponent4.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!oja", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method6806(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!oja", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)I")
	private int method6808(@OriginalArg(0) MouseEvent arg0) {
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

	@OriginalMember(owner = "client!oja", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8579() {
		return (this.anInt8077 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!oja", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!oja", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method6806(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!oja", name = "c", descriptor = "(B)Lclient!td;")
	@Override
	public Class3_Sub14 method8578() {
		return (Class3_Sub14) this.aClass357_47.method8398();
	}

	@OriginalMember(owner = "client!oja", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method6808(arg0);
		if ((this.anInt8079 & local4) == 0) {
			local4 = this.anInt8079;
		}
		if ((local4 & 0x1) != 0) {
			this.method6809(arg0.getY(), 3, arg0.getX(), arg0.getClickCount());
		}
		if ((local4 & 0x4) != 0) {
			this.method6809(arg0.getY(), 5, arg0.getX(), arg0.getClickCount());
		}
		if ((local4 & 0x2) != 0) {
			this.method6809(arg0.getY(), 4, arg0.getX(), arg0.getClickCount());
		}
		this.anInt8079 &= ~local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!oja", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		@Pc(8) int local8 = arg0.getWheelRotation();
		this.method6809(local5, 6, local2, local8);
		arg0.consume();
	}

	@OriginalMember(owner = "client!oja", name = "a", descriptor = "(IIIII)V")
	private void method6809(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class3_Sub14_Sub2 local3 = new Class3_Sub14_Sub2();
		local3.anInt5162 = arg0;
		local3.anInt5161 = arg1;
		local3.anInt5164 = arg2;
		local3.aLong175 = Static626.method8479();
		local3.anInt5163 = arg3;
		this.aClass357_48.method8401(local3);
	}

	@OriginalMember(owner = "client!oja", name = "e", descriptor = "(B)V")
	private void method6810() {
		if (this.aComponent4 == null) {
			return;
		}
		this.aComponent4.removeMouseWheelListener(this);
		this.aComponent4.removeMouseMotionListener(this);
		this.aComponent4.removeMouseListener(this);
		this.anInt8078 = this.anInt8080 = this.anInt8079 = 0;
		this.aClass357_47 = null;
		this.anInt8076 = this.anInt8075 = this.anInt8077 = 0;
		this.aComponent4 = null;
		this.aClass357_48 = null;
	}

	@OriginalMember(owner = "client!oja", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method8574() {
		this.anInt8075 = this.anInt8080;
		this.anInt8076 = this.anInt8078;
		this.anInt8077 = this.anInt8079;
		@Pc(14) Class357 local14 = this.aClass357_47;
		this.aClass357_47 = this.aClass357_48;
		this.aClass357_48 = local14;
		this.aClass357_48.method8403();
	}

	@OriginalMember(owner = "client!oja", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method6806(arg0.getY(), arg0.getX());
	}
}
