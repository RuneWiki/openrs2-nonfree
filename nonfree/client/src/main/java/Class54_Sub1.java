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

@OriginalClass("client!ct")
public final class Class54_Sub1 extends Class54 implements MouseListener, MouseMotionListener, MouseWheelListener {

	@OriginalMember(owner = "client!ct", name = "n", descriptor = "I")
	private int anInt1572;

	@OriginalMember(owner = "client!ct", name = "o", descriptor = "I")
	private int anInt1573;

	@OriginalMember(owner = "client!ct", name = "p", descriptor = "I")
	private int anInt1574;

	@OriginalMember(owner = "client!ct", name = "q", descriptor = "I")
	private int anInt1575;

	@OriginalMember(owner = "client!ct", name = "r", descriptor = "I")
	private int anInt1576;

	@OriginalMember(owner = "client!ct", name = "t", descriptor = "I")
	private int anInt1577;

	@OriginalMember(owner = "client!ct", name = "u", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!ct", name = "m", descriptor = "Lclient!eea;")
	private Class71 aClass71_14 = new Class71();

	@OriginalMember(owner = "client!ct", name = "s", descriptor = "Lclient!eea;")
	private Class71 aClass71_15 = new Class71();

	@OriginalMember(owner = "client!ct", name = "v", descriptor = "Z")
	private final boolean aBoolean126;

	@OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class54_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method1437(arg0);
		this.aBoolean126 = arg1;
	}

	@OriginalMember(owner = "client!ct", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method1438(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)I")
	private int method1435(@OriginalArg(0) MouseEvent arg0) {
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

	@OriginalMember(owner = "client!ct", name = "b", descriptor = "(B)I")
	@Override
	public int method4071() {
		return this.anInt1572;
	}

	@OriginalMember(owner = "client!ct", name = "e", descriptor = "(I)I")
	@Override
	public int method4074() {
		return this.anInt1573;
	}

	@OriginalMember(owner = "client!ct", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method1435(arg0);
		if ((local4 & this.anInt1576) == 0) {
			local4 = this.anInt1576;
		}
		if ((local4 & 0x1) != 0) {
			this.method1436(arg0.getX(), arg0.getY(), 0, 3);
		}
		if ((local4 & 0x4) != 0) {
			this.method1436(arg0.getX(), arg0.getY(), 0, 5);
		}
		if ((local4 & 0x2) != 0) {
			this.method1436(arg0.getX(), arg0.getY(), 0, 4);
		}
		this.anInt1576 &= ~local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ct", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method1435(arg0);
		if (local4 == 1) {
			this.method1436(arg0.getX(), arg0.getY(), 0, 0);
		} else if (local4 == 4) {
			this.method1436(arg0.getX(), arg0.getY(), 0, 2);
		} else if (local4 == 2) {
			this.method1436(arg0.getX(), arg0.getY(), 0, 1);
		}
		this.anInt1576 |= local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ct", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method1438(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!ct", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method4072() {
		this.anInt1572 = this.anInt1575;
		this.anInt1573 = this.anInt1577;
		this.anInt1574 = this.anInt1576;
		@Pc(21) Class71 local21 = this.aClass71_14;
		this.aClass71_14 = this.aClass71_15;
		this.aClass71_15 = local21;
		this.aClass71_15.method2088();
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(Z)Lclient!hl;")
	@Override
	public Class3_Sub19 method4063() {
		return (Class3_Sub19) this.aClass71_14.method2084();
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(I)Z")
	@Override
	protected boolean method4064() {
		return (this.anInt1574 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method4070() {
		return (this.anInt1574 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ct", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(IIIII)V")
	private void method1436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class3_Sub19_Sub1 local3 = new Class3_Sub19_Sub1();
		local3.anInt3833 = arg3;
		local3.anInt3834 = arg1;
		local3.anInt3832 = arg0;
		local3.aLong97 = Static12.method647();
		local3.anInt3835 = arg2;
		this.aClass71_15.method2076(local3);
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(ILjava/awt/Component;)V")
	private void method1437(@OriginalArg(1) Component arg0) {
		this.method1439();
		this.aComponent1 = arg0;
		this.aComponent1.addMouseListener(this);
		this.aComponent1.addMouseMotionListener(this);
		this.aComponent1.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!ct", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		@Pc(8) int local8 = arg0.getWheelRotation();
		this.method1436(local2, local5, local8, 6);
		arg0.consume();
	}

	@OriginalMember(owner = "client!ct", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method1438(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!ct", name = "c", descriptor = "(I)Z")
	@Override
	protected boolean method4068() {
		return (this.anInt1574 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!ct", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method1438(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!ct", name = "b", descriptor = "(III)V")
	private void method1438(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1577 = arg1;
		this.anInt1575 = arg0;
		if (this.aBoolean126) {
			this.method1436(arg1, arg0, 0, -1);
		}
	}

	@OriginalMember(owner = "client!ct", name = "b", descriptor = "(I)V")
	@Override
	public void method4065() {
		this.method1439();
	}

	@OriginalMember(owner = "client!ct", name = "f", descriptor = "(I)V")
	private void method1439() {
		if (this.aComponent1 == null) {
			return;
		}
		this.aComponent1.removeMouseWheelListener(this);
		this.aComponent1.removeMouseMotionListener(this);
		this.aComponent1.removeMouseListener(this);
		this.anInt1573 = this.anInt1572 = this.anInt1574 = 0;
		this.aClass71_14 = null;
		this.aComponent1 = null;
		this.aClass71_15 = null;
		this.anInt1577 = this.anInt1575 = this.anInt1576 = 0;
	}
}
