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

@OriginalClass("client!fa")
public final class Class49_Sub2 extends Class49 implements MouseListener, MouseMotionListener, MouseWheelListener {

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "I")
	private int anInt2909;

	@OriginalMember(owner = "client!fa", name = "e", descriptor = "I")
	private int anInt2910;

	@OriginalMember(owner = "client!fa", name = "f", descriptor = "I")
	private int anInt2911;

	@OriginalMember(owner = "client!fa", name = "h", descriptor = "I")
	private int anInt2912;

	@OriginalMember(owner = "client!fa", name = "i", descriptor = "I")
	private int anInt2913;

	@OriginalMember(owner = "client!fa", name = "k", descriptor = "I")
	private int anInt2914;

	@OriginalMember(owner = "client!fa", name = "l", descriptor = "Ljava/awt/Component;")
	private Component aComponent3;

	@OriginalMember(owner = "client!fa", name = "g", descriptor = "Lclient!mba;")
	private Class216 aClass216_23 = new Class216();

	@OriginalMember(owner = "client!fa", name = "j", descriptor = "Lclient!mba;")
	private Class216 aClass216_24 = new Class216();

	@OriginalMember(owner = "client!fa", name = "m", descriptor = "Z")
	private final boolean aBoolean217;

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class49_Sub2(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method2434(arg0);
		this.aBoolean217 = arg1;
	}

	@OriginalMember(owner = "client!fa", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		@Pc(8) int local8 = arg0.getWheelRotation();
		this.method2436(local2, 6, local5, local8);
		arg0.consume();
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	private void method2434(@OriginalArg(0) Component arg0) {
		this.method2437();
		this.aComponent3 = arg0;
		this.aComponent3.addMouseListener(this);
		this.aComponent3.addMouseMotionListener(this);
		this.aComponent3.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!fa", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method2435(arg0);
		if (local4 == 1) {
			this.method2436(arg0.getX(), 0, arg0.getY(), arg0.getClickCount());
		} else if (local4 == 4) {
			this.method2436(arg0.getX(), 2, arg0.getY(), arg0.getClickCount());
		} else if (local4 == 2) {
			this.method2436(arg0.getX(), 1, arg0.getY(), arg0.getClickCount());
		}
		this.anInt2912 |= local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)I")
	@Override
	public int method2426() {
		return this.anInt2910;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Z)Lclient!q;")
	@Override
	public Class3_Sub21 method2425() {
		return (Class3_Sub21) this.aClass216_23.method5462();
	}

	@OriginalMember(owner = "client!fa", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!fa", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method2438(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)I")
	private int method2435(@OriginalArg(0) MouseEvent arg0) {
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

	@OriginalMember(owner = "client!fa", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method2438(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!fa", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method2438(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(B)V")
	@Override
	public synchronized void method2427() {
		this.anInt2909 = this.anInt2912;
		this.anInt2910 = this.anInt2913;
		this.anInt2911 = this.anInt2914;
		@Pc(14) Class216 local14 = this.aClass216_23;
		this.aClass216_23 = this.aClass216_24;
		this.aClass216_24 = local14;
		this.aClass216_24.method5454();
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIIB)V")
	private void method2436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class3_Sub21_Sub2 local3 = new Class3_Sub21_Sub2();
		local3.anInt5874 = arg1;
		local3.anInt5873 = arg0;
		local3.anInt5872 = arg2;
		local3.aLong155 = Static191.method3071();
		local3.anInt5871 = arg3;
		this.aClass216_24.method5449(local3);
	}

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "(Z)Z")
	@Override
	public boolean method2433() {
		return (this.anInt2909 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V")
	@Override
	public void method2424() {
		this.method2437();
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(I)Z")
	@Override
	protected boolean method2428() {
		return (this.anInt2909 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!fa", name = "f", descriptor = "(I)V")
	private void method2437() {
		if (this.aComponent3 == null) {
			return;
		}
		this.aComponent3.removeMouseWheelListener(this);
		this.aComponent3.removeMouseMotionListener(this);
		this.aComponent3.removeMouseListener(this);
		this.aClass216_24 = null;
		this.aComponent3 = null;
		this.anInt2910 = this.anInt2911 = this.anInt2909 = 0;
		this.anInt2913 = this.anInt2914 = this.anInt2912 = 0;
		this.aClass216_23 = null;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(III)V")
	private void method2438(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2914 = arg0;
		this.anInt2913 = arg1;
		if (this.aBoolean217) {
			this.method2436(arg1, -1, arg0, 0);
		}
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(Z)Z")
	@Override
	protected boolean method2432() {
		return (this.anInt2909 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!fa", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method2435(arg0);
		if ((this.anInt2912 & local4) == 0) {
			local4 = this.anInt2912;
		}
		if ((local4 & 0x1) != 0) {
			this.method2436(arg0.getX(), 3, arg0.getY(), arg0.getClickCount());
		}
		if ((local4 & 0x4) != 0) {
			this.method2436(arg0.getX(), 5, arg0.getY(), arg0.getClickCount());
		}
		if ((local4 & 0x2) != 0) {
			this.method2436(arg0.getX(), 4, arg0.getY(), arg0.getClickCount());
		}
		this.anInt2912 &= ~local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "(I)I")
	@Override
	public int method2429() {
		return this.anInt2911;
	}

	@OriginalMember(owner = "client!fa", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method2438(arg0.getY(), arg0.getX());
	}
}
