import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ep")
public final class Class71_Sub1 extends Class71 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!ep", name = "o", descriptor = "I")
	private int anInt1736;

	@OriginalMember(owner = "client!ep", name = "t", descriptor = "I")
	private int anInt1741;

	@OriginalMember(owner = "client!ep", name = "C", descriptor = "I")
	private int anInt1750;

	@OriginalMember(owner = "client!ep", name = "D", descriptor = "I")
	private int anInt1751;

	@OriginalMember(owner = "client!ep", name = "H", descriptor = "I")
	private int anInt1754;

	@OriginalMember(owner = "client!ep", name = "I", descriptor = "I")
	private int anInt1755;

	@OriginalMember(owner = "client!ep", name = "M", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!ep", name = "l", descriptor = "Lclient!ft;")
	private Class88 aClass88_19 = new Class88();

	@OriginalMember(owner = "client!ep", name = "F", descriptor = "Lclient!ft;")
	private Class88 aClass88_20 = new Class88();

	@OriginalMember(owner = "client!ep", name = "P", descriptor = "Z")
	private final boolean aBoolean146;

	@OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class71_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method1638(arg0);
		this.aBoolean146 = arg1;
	}

	@OriginalMember(owner = "client!ep", name = "d", descriptor = "(B)Z")
	@Override
	protected boolean method1626() {
		return (this.anInt1736 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!ep", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method1637(arg0);
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(BIII)V")
	private void method1631(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class6_Sub7_Sub1 local7 = new Class6_Sub7_Sub1();
		local7.anInt1396 = arg0;
		local7.anInt1400 = arg1;
		local7.anInt1398 = arg2;
		local7.aLong46 = Static154.method2527();
		this.aClass88_20.method1878(local7);
	}

	@OriginalMember(owner = "client!ep", name = "c", descriptor = "(I)Lclient!ei;")
	@Override
	public Class6_Sub7 method1621() {
		return (Class6_Sub7) this.aClass88_19.method1881();
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)I")
	@Override
	public int method1618() {
		return this.anInt1750;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(BLjava/awt/event/MouseEvent;)I")
	private int method1633(@OriginalArg(1) MouseEvent arg0) {
		@Pc(6) int local6 = arg0.getModifiers();
		@Pc(17) boolean local17 = (local6 & 0x10) != 0;
		@Pc(25) boolean local25 = (local6 & 0x8) != 0;
		@Pc(36) boolean local36 = (local6 & 0x4) != 0;
		if (local25 && (local17 || local36)) {
			local25 = false;
		}
		if (local17 && local36) {
			return 4;
		} else if (local17) {
			return 1;
		} else if (local25) {
			return 2;
		} else if (local36) {
			return 4;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ep", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method1637(arg0);
	}

	@OriginalMember(owner = "client!ep", name = "f", descriptor = "(I)V")
	private void method1634() {
		if (this.aComponent1 == null) {
			return;
		}
		this.aComponent1.removeMouseListener(this);
		this.aComponent1.removeMouseMotionListener(this);
		this.anInt1755 = this.anInt1754 = this.anInt1751 = 0;
		this.aClass88_20 = null;
		this.aComponent1 = null;
		this.anInt1750 = this.anInt1741 = this.anInt1736 = 0;
		this.aClass88_19 = null;
	}

	@OriginalMember(owner = "client!ep", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.anInt1755 = -1;
		this.anInt1754 = -1;
	}

	@OriginalMember(owner = "client!ep", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method1628() {
		return (this.anInt1736 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ep", name = "d", descriptor = "(I)I")
	@Override
	public int method1624() {
		return this.anInt1741;
	}

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "(B)V")
	@Override
	public synchronized void method1622() {
		this.anInt1741 = this.anInt1754;
		this.anInt1736 = this.anInt1751;
		this.anInt1750 = this.anInt1755;
		@Pc(18) Class88 local18 = this.aClass88_19;
		this.aClass88_19 = this.aClass88_20;
		this.aClass88_20 = local18;
		this.aClass88_20.method1887();
	}

	@OriginalMember(owner = "client!ep", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method1633(arg0);
		if ((local8 & this.anInt1751) == 0) {
			local8 = this.anInt1751;
		}
		if ((local8 & 0x1) != 0) {
			this.method1631(arg0.getY(), arg0.getX(), 3);
		}
		if ((local8 & 0x4) != 0) {
			this.method1631(arg0.getY(), arg0.getX(), 5);
		}
		if ((local8 & 0x2) != 0) {
			this.method1631(arg0.getY(), arg0.getX(), 4);
		}
		this.anInt1751 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ep", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method1637(arg0);
	}

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "(I)V")
	@Override
	public void method1620() {
		this.method1634();
	}

	@OriginalMember(owner = "client!ep", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method1633(arg0);
		if (local10 == 1) {
			this.method1631(arg0.getY(), arg0.getX(), 0);
		} else if (local10 == 4) {
			this.method1631(arg0.getY(), arg0.getX(), 2);
		} else if (local10 == 2) {
			this.method1631(arg0.getY(), arg0.getX(), 1);
		}
		this.anInt1751 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ep", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)V")
	private void method1637(@OriginalArg(0) MouseEvent arg0) {
		this.anInt1755 = arg0.getX();
		this.anInt1754 = arg0.getY();
		if (this.aBoolean146) {
			this.method1631(arg0.getY(), arg0.getX(), -1);
		}
	}

	@OriginalMember(owner = "client!ep", name = "e", descriptor = "(I)Z")
	@Override
	protected boolean method1629() {
		return (this.anInt1736 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(ILjava/awt/Component;)V")
	private void method1638(@OriginalArg(1) Component arg0) {
		this.method1634();
		this.aComponent1 = arg0;
		this.aComponent1.addMouseListener(this);
		this.aComponent1.addMouseMotionListener(this);
	}
}
