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

@OriginalClass("client!td")
public final class Class131_Sub2 extends Class131 implements MouseListener, MouseMotionListener, MouseWheelListener {

	@OriginalMember(owner = "client!td", name = "i", descriptor = "I")
	private int anInt8022;

	@OriginalMember(owner = "client!td", name = "k", descriptor = "I")
	private int anInt8023;

	@OriginalMember(owner = "client!td", name = "l", descriptor = "I")
	private int anInt8024;

	@OriginalMember(owner = "client!td", name = "m", descriptor = "I")
	private int anInt8025;

	@OriginalMember(owner = "client!td", name = "n", descriptor = "I")
	private int anInt8026;

	@OriginalMember(owner = "client!td", name = "p", descriptor = "I")
	private int anInt8027;

	@OriginalMember(owner = "client!td", name = "r", descriptor = "Ljava/awt/Component;")
	private Component aComponent4;

	@OriginalMember(owner = "client!td", name = "j", descriptor = "Lclient!dc;")
	private Class70 aClass70_52 = new Class70();

	@OriginalMember(owner = "client!td", name = "o", descriptor = "Lclient!dc;")
	private Class70 aClass70_53 = new Class70();

	@OriginalMember(owner = "client!td", name = "q", descriptor = "Z")
	private final boolean aBoolean679;

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class131_Sub2(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method6553(arg0);
		this.aBoolean679 = arg1;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Z)Lclient!ls;")
	@Override
	public Class2_Sub29 method6543() {
		return (Class2_Sub29) this.aClass70_52.method1262();
	}

	@OriginalMember(owner = "client!td", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method6549(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!td", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!td", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method6549(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!td", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		@Pc(8) int local8 = arg0.getWheelRotation();
		this.method6550(local5, 6, local8, local2);
		arg0.consume();
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(B)V")
	@Override
	public synchronized void method6541() {
		this.anInt8024 = this.anInt8025;
		this.anInt8022 = this.anInt8027;
		this.anInt8023 = this.anInt8026;
		@Pc(14) Class70 local14 = this.aClass70_52;
		this.aClass70_52 = this.aClass70_53;
		this.aClass70_53 = local14;
		this.aClass70_53.method1265();
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method6539() {
		return (this.anInt8022 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(III)V")
	private void method6549(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt8026 = arg1;
		this.anInt8025 = arg0;
		if (this.aBoolean679) {
			this.method6550(arg1, -1, 0, arg0);
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIII)V")
	private void method6550(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) Class2_Sub29_Sub2 local9 = new Class2_Sub29_Sub2();
		local9.anInt7789 = arg1;
		local9.anInt7788 = arg3;
		local9.anInt7790 = arg0;
		local9.aLong222 = Static362.method5133();
		local9.anInt7791 = arg2;
		this.aClass70_53.method1269(local9);
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(Z)V")
	@Override
	public void method6547() {
		this.method6551();
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(B)I")
	@Override
	public int method6542() {
		return this.anInt8023;
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "(I)I")
	@Override
	public int method6544() {
		return this.anInt8024;
	}

	@OriginalMember(owner = "client!td", name = "d", descriptor = "(B)V")
	private void method6551() {
		if (this.aComponent4 == null) {
			return;
		}
		this.aComponent4.removeMouseWheelListener(this);
		this.aComponent4.removeMouseMotionListener(this);
		this.aComponent4.removeMouseListener(this);
		this.aClass70_52 = null;
		this.anInt8025 = this.anInt8026 = this.anInt8027 = 0;
		this.aClass70_53 = null;
		this.aComponent4 = null;
		this.anInt8024 = this.anInt8023 = this.anInt8022 = 0;
	}

	@OriginalMember(owner = "client!td", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method6552(arg0);
		if (local4 == 1) {
			this.method6550(arg0.getY(), 0, arg0.getClickCount(), arg0.getX());
		} else if (local4 == 4) {
			this.method6550(arg0.getY(), 2, arg0.getClickCount(), arg0.getX());
		} else if (local4 == 2) {
			this.method6550(arg0.getY(), 1, arg0.getClickCount(), arg0.getX());
		}
		this.anInt8027 |= local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(BLjava/awt/event/MouseEvent;)I")
	private int method6552(@OriginalArg(1) MouseEvent arg0) {
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

	@OriginalMember(owner = "client!td", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method6552(arg0);
		if ((this.anInt8027 & local4) == 0) {
			local4 = this.anInt8027;
		}
		if ((local4 & 0x1) != 0) {
			this.method6550(arg0.getY(), 3, arg0.getClickCount(), arg0.getX());
		}
		if ((local4 & 0x4) != 0) {
			this.method6550(arg0.getY(), 5, arg0.getClickCount(), arg0.getX());
		}
		if ((local4 & 0x2) != 0) {
			this.method6550(arg0.getY(), 4, arg0.getClickCount(), arg0.getX());
		}
		this.anInt8027 &= ~local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!td", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method6549(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "(B)Z")
	@Override
	protected boolean method6548() {
		return (this.anInt8022 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!td", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method6549(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
	private void method6553(@OriginalArg(0) Component arg0) {
		this.method6551();
		this.aComponent4 = arg0;
		this.aComponent4.addMouseListener(this);
		this.aComponent4.addMouseMotionListener(this);
		this.aComponent4.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!td", name = "e", descriptor = "(I)Z")
	@Override
	protected boolean method6546() {
		return (this.anInt8022 & 0x2) != 0;
	}
}
