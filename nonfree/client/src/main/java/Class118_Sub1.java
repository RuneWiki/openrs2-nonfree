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

@OriginalClass("client!fk")
public final class Class118_Sub1 extends Class118 implements MouseListener, MouseMotionListener, MouseWheelListener {

	@OriginalMember(owner = "client!fk", name = "m", descriptor = "I")
	private int anInt2573;

	@OriginalMember(owner = "client!fk", name = "k", descriptor = "I")
	private int anInt2574;

	@OriginalMember(owner = "client!fk", name = "j", descriptor = "I")
	private int anInt2575;

	@OriginalMember(owner = "client!fk", name = "g", descriptor = "I")
	private int anInt2576;

	@OriginalMember(owner = "client!fk", name = "o", descriptor = "I")
	private int anInt2577;

	@OriginalMember(owner = "client!fk", name = "i", descriptor = "I")
	private int anInt2578;

	@OriginalMember(owner = "client!fk", name = "l", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!fk", name = "h", descriptor = "Lclient!bd;")
	private Class32 aClass32_13 = new Class32();

	@OriginalMember(owner = "client!fk", name = "n", descriptor = "Lclient!bd;")
	private Class32 aClass32_14 = new Class32();

	@OriginalMember(owner = "client!fk", name = "p", descriptor = "Z")
	private final boolean aBoolean179;

	@OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	private Class118_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method2417(arg0, 95);
		this.aBoolean179 = arg1;
	}

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)I")
	@Override
	public int method7590() {
		return this.anInt2574;
	}

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(Z)Z")
	@Override
	protected boolean method7589() {
		return (this.anInt2575 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(BII)V")
	private void method2415(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt2576 = arg0;
		this.anInt2577 = arg1;
		if (this.aBoolean179) {
			this.method2418(arg0, -1, arg1, 0);
		}
	}

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(B)V")
	@Override
	public void method7592() {
		this.method2419();
	}

	@OriginalMember(owner = "client!fk", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method2416(arg0);
		if ((this.anInt2578 & local4) == 0) {
			local4 = this.anInt2578;
		}
		if ((local4 & 0x1) != 0) {
			this.method2418(arg0.getY(), 3, arg0.getX(), arg0.getClickCount());
		}
		if ((local4 & 0x4) != 0) {
			this.method2418(arg0.getY(), 5, arg0.getX(), arg0.getClickCount());
		}
		if ((local4 & 0x2) != 0) {
			this.method2418(arg0.getY(), 4, arg0.getX(), arg0.getClickCount());
		}
		this.anInt2578 &= ~local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method7595() {
		this.anInt2574 = this.anInt2576;
		this.anInt2575 = this.anInt2578;
		this.anInt2573 = this.anInt2577;
		@Pc(22) Class32 local22 = this.aClass32_13;
		this.aClass32_13 = this.aClass32_14;
		this.aClass32_14 = local22;
		this.aClass32_14.method588();
	}

	@OriginalMember(owner = "client!fk", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method2415(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!fk", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method2415(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(BLjava/awt/event/MouseEvent;)I")
	private int method2416(@OriginalArg(1) MouseEvent arg0) {
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

	@OriginalMember(owner = "client!fk", name = "c", descriptor = "(B)I")
	@Override
	public int method7586() {
		return this.anInt2573;
	}

	@OriginalMember(owner = "client!fk", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method2416(arg0);
		if (local4 == 1) {
			this.method2418(arg0.getY(), 0, arg0.getX(), arg0.getClickCount());
		} else if (local4 == 4) {
			this.method2418(arg0.getY(), 2, arg0.getX(), arg0.getClickCount());
		} else if (local4 == 2) {
			this.method2418(arg0.getY(), 1, arg0.getX(), arg0.getClickCount());
		}
		this.anInt2578 |= local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!fk", name = "c", descriptor = "(Z)Lclient!mo;")
	@Override
	public Class14_Sub29 method7594() {
		return (Class14_Sub29) this.aClass32_13.method579();
	}

	@OriginalMember(owner = "client!fk", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method2415(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	private void method2417(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1) {
		this.method2419();
		if (arg1 <= 33) {
			this.anInt2576 = 100;
		}
		this.aComponent2 = arg0;
		this.aComponent2.addMouseListener(this);
		this.aComponent2.addMouseMotionListener(this);
		this.aComponent2.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIII)V")
	private void method2418(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class14_Sub29_Sub1 local3 = new Class14_Sub29_Sub1();
		local3.anInt8410 = arg0;
		local3.anInt8412 = arg1;
		local3.anInt8411 = arg2;
		local3.aLong225 = Static26.method382();
		local3.anInt8409 = arg3;
		this.aClass32_14.method582(local3);
	}

	@OriginalMember(owner = "client!fk", name = "e", descriptor = "(I)V")
	private void method2419() {
		if (this.aComponent2 == null) {
			return;
		}
		this.aComponent2.removeMouseWheelListener(this);
		this.aComponent2.removeMouseMotionListener(this);
		this.aComponent2.removeMouseListener(this);
		this.aClass32_13 = null;
		this.aClass32_14 = null;
		this.anInt2577 = this.anInt2576 = this.anInt2578 = 0;
		this.anInt2573 = this.anInt2574 = this.anInt2575 = 0;
		this.aComponent2 = null;
	}

	@OriginalMember(owner = "client!fk", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method2415(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!fk", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7587() {
		return (this.anInt2575 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!fk", name = "d", descriptor = "(I)Z")
	@Override
	protected boolean method7591() {
		return (this.anInt2575 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!fk", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!fk", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		@Pc(8) int local8 = arg0.getWheelRotation();
		this.method2418(local5, 6, local2, local8);
		arg0.consume();
	}
}
