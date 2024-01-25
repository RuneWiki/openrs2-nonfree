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

@OriginalClass("client!cda")
public final class Class50_Sub1 extends Class50 implements MouseListener, MouseMotionListener, MouseWheelListener {

	@OriginalMember(owner = "client!cda", name = "b", descriptor = "I")
	private int anInt975;

	@OriginalMember(owner = "client!cda", name = "d", descriptor = "I")
	private int anInt976;

	@OriginalMember(owner = "client!cda", name = "e", descriptor = "I")
	private int anInt977;

	@OriginalMember(owner = "client!cda", name = "g", descriptor = "I")
	private int anInt978;

	@OriginalMember(owner = "client!cda", name = "h", descriptor = "I")
	private int anInt979;

	@OriginalMember(owner = "client!cda", name = "i", descriptor = "I")
	private int anInt980;

	@OriginalMember(owner = "client!cda", name = "k", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!cda", name = "c", descriptor = "Lclient!gj;")
	private Class124 aClass124_3 = new Class124();

	@OriginalMember(owner = "client!cda", name = "f", descriptor = "Lclient!gj;")
	private Class124 aClass124_4 = new Class124();

	@OriginalMember(owner = "client!cda", name = "j", descriptor = "Z")
	private final boolean aBoolean85;

	@OriginalMember(owner = "client!cda", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class50_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method883(arg0);
		this.aBoolean85 = arg1;
	}

	@OriginalMember(owner = "client!cda", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method886(arg0);
		if ((this.anInt979 & local4) == 0) {
			local4 = this.anInt979;
		}
		if ((local4 & 0x1) != 0) {
			this.method884(arg0.getX(), 3, arg0.getY(), 0);
		}
		if ((local4 & 0x4) != 0) {
			this.method884(arg0.getX(), 5, arg0.getY(), 0);
		}
		if ((local4 & 0x2) != 0) {
			this.method884(arg0.getX(), 4, arg0.getY(), 0);
		}
		this.anInt979 &= ~local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!cda", name = "c", descriptor = "(B)Z")
	@Override
	protected boolean method7106() {
		return (this.anInt977 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!cda", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method887(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!cda", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method887(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!cda", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method7105() {
		this.anInt975 = this.anInt980;
		this.anInt977 = this.anInt979;
		this.anInt976 = this.anInt978;
		@Pc(14) Class124 local14 = this.aClass124_3;
		this.aClass124_3 = this.aClass124_4;
		this.aClass124_4 = local14;
		this.aClass124_4.method3265();
	}

	@OriginalMember(owner = "client!cda", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method7107() {
		return (this.anInt977 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!cda", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method886(arg0);
		if (local4 == 1) {
			this.method884(arg0.getX(), 0, arg0.getY(), 0);
		} else if (local4 == 4) {
			this.method884(arg0.getX(), 2, arg0.getY(), 0);
		} else if (local4 == 2) {
			this.method884(arg0.getX(), 1, arg0.getY(), 0);
		}
		this.anInt979 |= local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!cda", name = "b", descriptor = "(I)V")
	@Override
	public void method7103() {
		this.method885();
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(B)Lclient!hca;")
	@Override
	public Class4_Sub22 method7099() {
		return (Class4_Sub22) this.aClass124_3.method3272();
	}

	@OriginalMember(owner = "client!cda", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method887(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	private void method883(@OriginalArg(0) Component arg0) {
		this.method885();
		this.aComponent1 = arg0;
		this.aComponent1.addMouseListener(this);
		this.aComponent1.addMouseMotionListener(this);
		this.aComponent1.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!cda", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		@Pc(8) int local8 = arg0.getWheelRotation();
		this.method884(local2, 6, local5, local8);
		arg0.consume();
	}

	@OriginalMember(owner = "client!cda", name = "c", descriptor = "(I)Z")
	@Override
	protected boolean method7104() {
		return (this.anInt977 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!cda", name = "b", descriptor = "(B)I")
	@Override
	public int method7100() {
		return this.anInt975;
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(IIIII)V")
	private void method884(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class4_Sub22_Sub1 local3 = new Class4_Sub22_Sub1();
		local3.anInt4344 = arg0;
		local3.anInt4345 = arg1;
		local3.anInt4347 = arg2;
		local3.aLong104 = Static184.method3422();
		local3.anInt4346 = arg3;
		this.aClass124_4.method3275(local3);
	}

	@OriginalMember(owner = "client!cda", name = "e", descriptor = "(I)V")
	private void method885() {
		if (this.aComponent1 == null) {
			return;
		}
		this.aComponent1.removeMouseWheelListener(this);
		this.aComponent1.removeMouseMotionListener(this);
		this.aComponent1.removeMouseListener(this);
		this.anInt975 = this.anInt976 = this.anInt977 = 0;
		this.aClass124_4 = null;
		this.aComponent1 = null;
		this.aClass124_3 = null;
		this.anInt980 = this.anInt978 = this.anInt979 = 0;
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(I)I")
	@Override
	public int method7102() {
		return this.anInt976;
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;B)I")
	private int method886(@OriginalArg(0) MouseEvent arg0) {
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

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(III)V")
	private void method887(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt980 = arg1;
		this.anInt978 = arg0;
		if (this.aBoolean85) {
			this.method884(arg1, -1, arg0, 0);
		}
	}

	@OriginalMember(owner = "client!cda", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method887(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!cda", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}
}
