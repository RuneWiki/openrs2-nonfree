import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fk")
public final class Class87_Sub1 extends Class87 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!fk", name = "u", descriptor = "I")
	private int anInt2624;

	@OriginalMember(owner = "client!fk", name = "y", descriptor = "I")
	private int anInt2628;

	@OriginalMember(owner = "client!fk", name = "A", descriptor = "I")
	private int anInt2630;

	@OriginalMember(owner = "client!fk", name = "H", descriptor = "I")
	private int anInt2635;

	@OriginalMember(owner = "client!fk", name = "J", descriptor = "I")
	private int anInt2636;

	@OriginalMember(owner = "client!fk", name = "M", descriptor = "I")
	private int anInt2638;

	@OriginalMember(owner = "client!fk", name = "P", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!fk", name = "C", descriptor = "Lclient!pu;")
	private Class203 aClass203_14 = new Class203();

	@OriginalMember(owner = "client!fk", name = "I", descriptor = "Lclient!pu;")
	private Class203 aClass203_15 = new Class203();

	@OriginalMember(owner = "client!fk", name = "O", descriptor = "Z")
	private final boolean aBoolean169;

	@OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class87_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method1924(arg0);
		this.aBoolean169 = arg1;
	}

	@OriginalMember(owner = "client!fk", name = "e", descriptor = "(B)Z")
	@Override
	protected boolean method1918() {
		return (this.anInt2624 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)Lclient!vb;")
	@Override
	public Class1_Sub25 method1911() {
		return (Class1_Sub25) this.aClass203_14.method4549();
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;Z)I")
	private int method1921(@OriginalArg(0) MouseEvent arg0) {
		@Pc(6) int local6 = arg0.getModifiers();
		@Pc(17) boolean local17 = (local6 & 0x10) != 0;
		@Pc(30) boolean local30 = (local6 & 0x8) != 0;
		@Pc(41) boolean local41 = (local6 & 0x4) != 0;
		if (local30 && (local17 || local41)) {
			local30 = false;
		}
		if (local17 && local41) {
			return 4;
		} else if (local17) {
			return 1;
		} else if (local30) {
			return 2;
		} else if (local41) {
			return 4;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!fk", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)Z")
	@Override
	protected boolean method1908() {
		return (this.anInt2624 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!fk", name = "d", descriptor = "(I)V")
	@Override
	public void method1914() {
		this.method1926();
	}

	@OriginalMember(owner = "client!fk", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method1921(arg0);
		if ((this.anInt2638 & local8) == 0) {
			local8 = this.anInt2638;
		}
		if ((local8 & 0x1) != 0) {
			this.method1925(arg0.getX(), arg0.getY(), 3);
		}
		if ((local8 & 0x4) != 0) {
			this.method1925(arg0.getX(), arg0.getY(), 5);
		}
		if ((local8 & 0x2) != 0) {
			this.method1925(arg0.getX(), arg0.getY(), 4);
		}
		this.anInt2638 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(BLjava/awt/Component;)V")
	private void method1924(@OriginalArg(1) Component arg0) {
		this.method1926();
		this.aComponent2 = arg0;
		this.aComponent2.addMouseListener(this);
		this.aComponent2.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIII)V")
	private void method1925(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class1_Sub25_Sub1 local7 = new Class1_Sub25_Sub1();
		local7.anInt4331 = arg0;
		local7.anInt4328 = arg1;
		local7.anInt4334 = arg2;
		local7.aLong119 = Static250.method3737();
		this.aClass203_15.method4551(local7);
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)I")
	@Override
	public int method1909() {
		return this.anInt2630;
	}

	@OriginalMember(owner = "client!fk", name = "f", descriptor = "(B)V")
	private void method1926() {
		if (this.aComponent2 == null) {
			return;
		}
		this.aComponent2.removeMouseListener(this);
		this.aComponent2.removeMouseMotionListener(this);
		this.anInt2635 = this.anInt2636 = this.anInt2638 = 0;
		this.aClass203_15 = null;
		this.aClass203_14 = null;
		this.aComponent2 = null;
		this.anInt2628 = this.anInt2630 = this.anInt2624 = 0;
	}

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(B)V")
	@Override
	public synchronized void method1910() {
		this.anInt2628 = this.anInt2635;
		this.anInt2624 = this.anInt2638;
		this.anInt2630 = this.anInt2636;
		@Pc(24) Class203 local24 = this.aClass203_14;
		this.aClass203_14 = this.aClass203_15;
		this.aClass203_15 = local24;
		this.aClass203_15.method4553();
	}

	@OriginalMember(owner = "client!fk", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method1929(arg0);
	}

	@OriginalMember(owner = "client!fk", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method1929(arg0);
	}

	@OriginalMember(owner = "client!fk", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.anInt2636 = -1;
		this.anInt2635 = -1;
	}

	@OriginalMember(owner = "client!fk", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method1916() {
		return (this.anInt2624 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!fk", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method1929(arg0);
	}

	@OriginalMember(owner = "client!fk", name = "f", descriptor = "(I)I")
	@Override
	public int method1919() {
		return this.anInt2628;
	}

	@OriginalMember(owner = "client!fk", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method1921(arg0);
		if (local10 == 1) {
			this.method1925(arg0.getX(), arg0.getY(), 0);
		} else if (local10 == 4) {
			this.method1925(arg0.getX(), arg0.getY(), 2);
		} else if (local10 == 2) {
			this.method1925(arg0.getX(), arg0.getY(), 1);
		}
		this.anInt2638 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)V")
	private void method1929(@OriginalArg(1) MouseEvent arg0) {
		this.anInt2635 = arg0.getX();
		this.anInt2636 = arg0.getY();
		if (this.aBoolean169) {
			this.method1925(arg0.getX(), arg0.getY(), -1);
		}
	}
}
