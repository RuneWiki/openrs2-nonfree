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

@OriginalClass("client!dda")
public final class Class59_Sub1 extends Class59 implements MouseListener, MouseMotionListener, MouseWheelListener {

	@OriginalMember(owner = "client!dda", name = "e", descriptor = "I")
	private int anInt2300;

	@OriginalMember(owner = "client!dda", name = "f", descriptor = "I")
	private int anInt2301;

	@OriginalMember(owner = "client!dda", name = "g", descriptor = "I")
	private int anInt2302;

	@OriginalMember(owner = "client!dda", name = "j", descriptor = "I")
	private int anInt2303;

	@OriginalMember(owner = "client!dda", name = "k", descriptor = "I")
	private int anInt2304;

	@OriginalMember(owner = "client!dda", name = "l", descriptor = "I")
	private int anInt2305;

	@OriginalMember(owner = "client!dda", name = "m", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!dda", name = "h", descriptor = "Lclient!qia;")
	private Class276 aClass276_17 = new Class276();

	@OriginalMember(owner = "client!dda", name = "i", descriptor = "Lclient!qia;")
	private Class276 aClass276_18 = new Class276();

	@OriginalMember(owner = "client!dda", name = "n", descriptor = "Z")
	private final boolean aBoolean196;

	@OriginalMember(owner = "client!dda", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class59_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method2278(arg0);
		this.aBoolean196 = arg1;
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(BLjava/awt/event/MouseEvent;)I")
	private int method2274(@OriginalArg(1) MouseEvent arg0) {
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

	@OriginalMember(owner = "client!dda", name = "c", descriptor = "(B)V")
	@Override
	public void method4103() {
		this.method2275();
	}

	@OriginalMember(owner = "client!dda", name = "e", descriptor = "(I)V")
	private void method2275() {
		if (this.aComponent1 == null) {
			return;
		}
		this.aComponent1.removeMouseWheelListener(this);
		this.aComponent1.removeMouseMotionListener(this);
		this.aComponent1.removeMouseListener(this);
		this.aClass276_17 = null;
		this.aClass276_18 = null;
		this.aComponent1 = null;
		this.anInt2302 = this.anInt2301 = this.anInt2300 = 0;
		this.anInt2305 = this.anInt2304 = this.anInt2303 = 0;
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(I)Z")
	@Override
	protected boolean method4102() {
		return (this.anInt2300 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!dda", name = "b", descriptor = "(B)V")
	@Override
	public synchronized void method4101() {
		this.anInt2300 = this.anInt2303;
		this.anInt2301 = this.anInt2304;
		this.anInt2302 = this.anInt2305;
		@Pc(14) Class276 local14 = this.aClass276_17;
		this.aClass276_17 = this.aClass276_18;
		this.aClass276_18 = local14;
		this.aClass276_18.method6910();
	}

	@OriginalMember(owner = "client!dda", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method2274(arg0);
		if ((local4 & this.anInt2303) == 0) {
			local4 = this.anInt2303;
		}
		if ((local4 & 0x1) != 0) {
			this.method2277(arg0.getClickCount(), arg0.getY(), 3, arg0.getX());
		}
		if ((local4 & 0x4) != 0) {
			this.method2277(arg0.getClickCount(), arg0.getY(), 5, arg0.getX());
		}
		if ((local4 & 0x2) != 0) {
			this.method2277(arg0.getClickCount(), arg0.getY(), 4, arg0.getX());
		}
		this.anInt2303 &= ~local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!dda", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!dda", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method2274(arg0);
		if (local4 == 1) {
			this.method2277(arg0.getClickCount(), arg0.getY(), 0, arg0.getX());
		} else if (local4 == 4) {
			this.method2277(arg0.getClickCount(), arg0.getY(), 2, arg0.getX());
		} else if (local4 == 2) {
			this.method2277(arg0.getClickCount(), arg0.getY(), 1, arg0.getX());
		}
		this.anInt2303 |= local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(IIB)V")
	private void method2276(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2305 = arg1;
		this.anInt2304 = arg0;
		if (this.aBoolean196) {
			this.method2277(0, arg0, -1, arg1);
		}
	}

	@OriginalMember(owner = "client!dda", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		@Pc(8) int local8 = arg0.getWheelRotation();
		this.method2277(local8, local5, 6, local2);
		arg0.consume();
	}

	@OriginalMember(owner = "client!dda", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method2276(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(Z)Lclient!uk;")
	@Override
	public Class3_Sub30 method4104() {
		return (Class3_Sub30) this.aClass276_17.method6911();
	}

	@OriginalMember(owner = "client!dda", name = "d", descriptor = "(I)Z")
	@Override
	protected boolean method4108() {
		return (this.anInt2300 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(IIIBI)V")
	private void method2277(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class3_Sub30_Sub1 local3 = new Class3_Sub30_Sub1();
		local3.anInt7439 = arg3;
		local3.anInt7440 = arg2;
		local3.anInt7441 = arg1;
		local3.aLong175 = Static444.method6719();
		local3.anInt7438 = arg0;
		this.aClass276_18.method6906(local3);
	}

	@OriginalMember(owner = "client!dda", name = "d", descriptor = "(B)I")
	@Override
	public int method4106() {
		return this.anInt2301;
	}

	@OriginalMember(owner = "client!dda", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method2276(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!dda", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method2276(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!dda", name = "c", descriptor = "(I)I")
	@Override
	public int method4107() {
		return this.anInt2302;
	}

	@OriginalMember(owner = "client!dda", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method4110() {
		return (this.anInt2300 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
	private void method2278(@OriginalArg(0) Component arg0) {
		this.method2275();
		this.aComponent1 = arg0;
		this.aComponent1.addMouseListener(this);
		this.aComponent1.addMouseMotionListener(this);
		this.aComponent1.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!dda", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method2276(arg0.getY(), arg0.getX());
	}
}
