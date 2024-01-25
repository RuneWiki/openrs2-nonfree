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

@OriginalClass("client!gp")
public final class Class107_Sub1 extends Class107 implements MouseListener, MouseMotionListener, MouseWheelListener {

	@OriginalMember(owner = "client!gp", name = "g", descriptor = "I")
	private int anInt3247;

	@OriginalMember(owner = "client!gp", name = "k", descriptor = "I")
	private int anInt3248;

	@OriginalMember(owner = "client!gp", name = "h", descriptor = "I")
	private int anInt3249;

	@OriginalMember(owner = "client!gp", name = "l", descriptor = "I")
	private int anInt3250;

	@OriginalMember(owner = "client!gp", name = "n", descriptor = "I")
	private int anInt3251;

	@OriginalMember(owner = "client!gp", name = "j", descriptor = "I")
	private int anInt3252;

	@OriginalMember(owner = "client!gp", name = "i", descriptor = "Ljava/awt/Component;")
	private Component aComponent3;

	@OriginalMember(owner = "client!gp", name = "f", descriptor = "Lclient!ef;")
	private Class102 aClass102_27 = new Class102();

	@OriginalMember(owner = "client!gp", name = "m", descriptor = "Lclient!ef;")
	private Class102 aClass102_28 = new Class102();

	@OriginalMember(owner = "client!gp", name = "o", descriptor = "Z")
	private final boolean aBoolean264;

	@OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	private Class107_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method2882(arg0, -115);
		this.aBoolean264 = arg1;
	}

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "(B)I")
	@Override
	public int method4072() {
		return this.anInt3248;
	}

	@OriginalMember(owner = "client!gp", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method2881(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!gp", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!gp", name = "f", descriptor = "(I)Z")
	@Override
	protected boolean method4074() {
		return (this.anInt3249 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!gp", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method2883(arg0);
		if ((this.anInt3252 & local4) == 0) {
			local4 = this.anInt3252;
		}
		if ((local4 & 0x1) != 0) {
			this.method2884(arg0.getClickCount(), arg0.getY(), 3, arg0.getX());
		}
		if ((local4 & 0x4) != 0) {
			this.method2884(arg0.getClickCount(), arg0.getY(), 5, arg0.getX());
		}
		if ((local4 & 0x2) != 0) {
			this.method2884(arg0.getClickCount(), arg0.getY(), 4, arg0.getX());
		}
		this.anInt3252 &= ~local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!gp", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		@Pc(8) int local8 = arg0.getWheelRotation();
		this.method2884(local8, local5, 6, local2);
		arg0.consume();
	}

	@OriginalMember(owner = "client!gp", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method2881(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIB)V")
	private void method2881(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3251 = arg0;
		this.anInt3250 = arg1;
		if (this.aBoolean264) {
			this.method2884(0, arg0, -1, arg1);
		}
	}

	@OriginalMember(owner = "client!gp", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method4075() {
		return (this.anInt3249 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	private void method2882(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1) {
		if (arg1 >= -91) {
			return;
		}
		this.method2885();
		this.aComponent3 = arg0;
		this.aComponent3.addMouseListener(this);
		this.aComponent3.addMouseMotionListener(this);
		this.aComponent3.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "(I)Lclient!bk;")
	@Override
	public Class5_Sub6 method4073() {
		return (Class5_Sub6) this.aClass102_27.method1928();
	}

	@OriginalMember(owner = "client!gp", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method2881(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(B)Z")
	@Override
	protected boolean method4070() {
		return (this.anInt3249 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)I")
	private int method2883(@OriginalArg(0) MouseEvent arg0) {
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

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIIII)V")
	private void method2884(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class5_Sub6_Sub1 local3 = new Class5_Sub6_Sub1();
		local3.anInt2100 = arg2;
		local3.anInt2101 = arg1;
		local3.anInt2099 = arg3;
		local3.aLong54 = Static515.method7499(110);
		local3.anInt2102 = arg0;
		this.aClass102_28.method1921(local3);
	}

	@OriginalMember(owner = "client!gp", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method2883(arg0);
		if (local4 == 1) {
			this.method2884(arg0.getClickCount(), arg0.getY(), 0, arg0.getX());
		} else if (local4 == 4) {
			this.method2884(arg0.getClickCount(), arg0.getY(), 2, arg0.getX());
		} else if (local4 == 2) {
			this.method2884(arg0.getClickCount(), arg0.getY(), 1, arg0.getX());
		}
		this.anInt3252 |= local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!gp", name = "d", descriptor = "(B)V")
	@Override
	public void method4077() {
		this.method2885();
	}

	@OriginalMember(owner = "client!gp", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method2881(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!gp", name = "c", descriptor = "(I)I")
	@Override
	public int method4079() {
		return this.anInt3247;
	}

	@OriginalMember(owner = "client!gp", name = "g", descriptor = "(I)V")
	private void method2885() {
		if (this.aComponent3 == null) {
			return;
		}
		this.aComponent3.removeMouseWheelListener(this);
		this.aComponent3.removeMouseMotionListener(this);
		this.aComponent3.removeMouseListener(this);
		this.anInt3247 = this.anInt3248 = this.anInt3249 = 0;
		this.aComponent3 = null;
		this.aClass102_28 = null;
		this.anInt3250 = this.anInt3251 = this.anInt3252 = 0;
		this.aClass102_27 = null;
	}

	@OriginalMember(owner = "client!gp", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method4076() {
		this.anInt3247 = this.anInt3250;
		this.anInt3248 = this.anInt3251;
		this.anInt3249 = this.anInt3252;
		@Pc(14) Class102 local14 = this.aClass102_27;
		this.aClass102_27 = this.aClass102_28;
		this.aClass102_28 = local14;
		this.aClass102_28.method1932();
	}
}
