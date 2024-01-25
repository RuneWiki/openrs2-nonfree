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

@OriginalClass("client!dw")
public final class Class79_Sub1 extends Class79 implements MouseListener, MouseMotionListener, MouseWheelListener {

	@OriginalMember(owner = "client!dw", name = "g", descriptor = "I")
	private int anInt2330;

	@OriginalMember(owner = "client!dw", name = "h", descriptor = "I")
	private int anInt2331;

	@OriginalMember(owner = "client!dw", name = "j", descriptor = "I")
	private int anInt2332;

	@OriginalMember(owner = "client!dw", name = "k", descriptor = "I")
	private int anInt2333;

	@OriginalMember(owner = "client!dw", name = "m", descriptor = "I")
	private int anInt2334;

	@OriginalMember(owner = "client!dw", name = "n", descriptor = "I")
	private int anInt2335;

	@OriginalMember(owner = "client!dw", name = "p", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!dw", name = "i", descriptor = "Lclient!ok;")
	private Class262 aClass262_11 = new Class262();

	@OriginalMember(owner = "client!dw", name = "l", descriptor = "Lclient!ok;")
	private Class262 aClass262_12 = new Class262();

	@OriginalMember(owner = "client!dw", name = "o", descriptor = "Z")
	private final boolean aBoolean193;

	@OriginalMember(owner = "client!dw", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class79_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method1989(arg0);
		this.aBoolean193 = arg1;
	}

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "(B)V")
	@Override
	public synchronized void method3355() {
		this.anInt2332 = this.anInt2335;
		this.anInt2331 = this.anInt2334;
		this.anInt2330 = this.anInt2333;
		@Pc(14) Class262 local14 = this.aClass262_11;
		this.aClass262_11 = this.aClass262_12;
		this.aClass262_12 = local14;
		this.aClass262_12.method6316();
	}

	@OriginalMember(owner = "client!dw", name = "c", descriptor = "(B)I")
	@Override
	public int method3358() {
		return this.anInt2330;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(IIBII)V")
	private void method1986(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class14_Sub30_Sub1 local3 = new Class14_Sub30_Sub1();
		local3.anInt5164 = arg3;
		local3.anInt5165 = arg0;
		local3.anInt5162 = arg1;
		local3.aLong159 = Static521.method7499();
		local3.anInt5163 = arg2;
		this.aClass262_12.method6314(local3);
	}

	@OriginalMember(owner = "client!dw", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method1988(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!dw", name = "d", descriptor = "(I)V")
	@Override
	public void method3356() {
		this.method1990();
	}

	@OriginalMember(owner = "client!dw", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method1988(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(B)Z")
	@Override
	protected boolean method3352() {
		return (this.anInt2331 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!dw", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method1987(arg0);
		if ((this.anInt2334 & local4) == 0) {
			local4 = this.anInt2334;
		}
		if ((local4 & 0x1) != 0) {
			this.method1986(3, arg0.getY(), arg0.getClickCount(), arg0.getX());
		}
		if ((local4 & 0x4) != 0) {
			this.method1986(5, arg0.getY(), arg0.getClickCount(), arg0.getX());
		}
		if ((local4 & 0x2) != 0) {
			this.method1986(4, arg0.getY(), arg0.getClickCount(), arg0.getX());
		}
		this.anInt2334 &= ~local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!dw", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method1988(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!dw", name = "f", descriptor = "(I)I")
	@Override
	public int method3361() {
		return this.anInt2332;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;B)I")
	private int method1987(@OriginalArg(0) MouseEvent arg0) {
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

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(III)V")
	private void method1988(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt2333 = arg0;
		this.anInt2335 = arg1;
		if (this.aBoolean193) {
			this.method1986(-1, arg0, 0, arg1);
		}
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method3351() {
		return (this.anInt2331 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	private void method1989(@OriginalArg(0) Component arg0) {
		this.method1990();
		this.aComponent2 = arg0;
		this.aComponent2.addMouseListener(this);
		this.aComponent2.addMouseMotionListener(this);
		this.aComponent2.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!dw", name = "e", descriptor = "(B)V")
	private void method1990() {
		if (this.aComponent2 == null) {
			return;
		}
		this.aComponent2.removeMouseWheelListener(this);
		this.aComponent2.removeMouseMotionListener(this);
		this.aComponent2.removeMouseListener(this);
		this.aClass262_12 = null;
		this.aComponent2 = null;
		this.anInt2335 = this.anInt2333 = this.anInt2334 = 0;
		this.aClass262_11 = null;
		this.anInt2332 = this.anInt2330 = this.anInt2331 = 0;
	}

	@OriginalMember(owner = "client!dw", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method1988(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!dw", name = "c", descriptor = "(I)Z")
	@Override
	protected boolean method3354() {
		return (this.anInt2331 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!dw", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method1987(arg0);
		if (local4 == 1) {
			this.method1986(0, arg0.getY(), arg0.getClickCount(), arg0.getX());
		} else if (local4 == 4) {
			this.method1986(2, arg0.getY(), arg0.getClickCount(), arg0.getX());
		} else if (local4 == 2) {
			this.method1986(1, arg0.getY(), arg0.getClickCount(), arg0.getX());
		}
		this.anInt2334 |= local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!dw", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		@Pc(8) int local8 = arg0.getWheelRotation();
		this.method1986(6, local5, local8, local2);
		arg0.consume();
	}

	@OriginalMember(owner = "client!dw", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "(I)Lclient!rm;")
	@Override
	public Class14_Sub30 method3353() {
		return (Class14_Sub30) this.aClass262_11.method6323();
	}
}
