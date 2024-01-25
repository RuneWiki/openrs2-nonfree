import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public final class Class111_Sub1 extends Class111 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!fd", name = "k", descriptor = "I")
	private int anInt2510;

	@OriginalMember(owner = "client!fd", name = "s", descriptor = "I")
	private int anInt2517;

	@OriginalMember(owner = "client!fd", name = "w", descriptor = "I")
	private int anInt2520;

	@OriginalMember(owner = "client!fd", name = "J", descriptor = "I")
	private int anInt2531;

	@OriginalMember(owner = "client!fd", name = "K", descriptor = "I")
	private int anInt2532;

	@OriginalMember(owner = "client!fd", name = "M", descriptor = "I")
	private int anInt2533;

	@OriginalMember(owner = "client!fd", name = "O", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!fd", name = "F", descriptor = "Lclient!ga;")
	private Class124 aClass124_25 = new Class124();

	@OriginalMember(owner = "client!fd", name = "L", descriptor = "Lclient!ga;")
	private Class124 aClass124_26 = new Class124();

	@OriginalMember(owner = "client!fd", name = "P", descriptor = "Z")
	private final boolean aBoolean174;

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class111_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method2273(arg0);
		this.aBoolean174 = arg1;
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)Z")
	@Override
	protected boolean method8695() {
		return (this.anInt2517 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!fd", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method2271(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V")
	@Override
	public void method8694() {
		this.method2272();
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)I")
	@Override
	public int method8696() {
		return this.anInt2510;
	}

	@OriginalMember(owner = "client!fd", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!fd", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method2270(arg0);
		if ((local8 & this.anInt2533) == 0) {
			local8 = this.anInt2533;
		}
		if ((local8 & 0x1) != 0) {
			this.method2276(arg0.getY(), arg0.getClickCount(), arg0.getX(), 3);
		}
		if ((local8 & 0x4) != 0) {
			this.method2276(arg0.getY(), arg0.getClickCount(), arg0.getX(), 5);
		}
		if ((local8 & 0x2) != 0) {
			this.method2276(arg0.getY(), arg0.getClickCount(), arg0.getX(), 4);
		}
		this.anInt2533 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(BLjava/awt/event/MouseEvent;)I")
	private int method2270(@OriginalArg(1) MouseEvent arg0) {
		@Pc(6) int local6 = arg0.getModifiers();
		@Pc(14) boolean local14 = (local6 & 0x10) != 0;
		@Pc(22) boolean local22 = (local6 & 0x8) != 0;
		@Pc(30) boolean local30 = (local6 & 0x4) != 0;
		if (local22 && (local14 || local30)) {
			local22 = false;
		}
		if (local14 && local30) {
			return 4;
		} else if (local14) {
			return 1;
		} else if (local22) {
			return 2;
		} else if (local30) {
			return 4;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method8700() {
		return (this.anInt2517 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!fd", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method2271(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZII)V")
	private void method2271(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt2532 = arg1;
		this.anInt2531 = arg0;
		if (this.aBoolean174) {
			this.method2276(arg0, 0, arg1, -1);
		}
	}

	@OriginalMember(owner = "client!fd", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method2271(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!fd", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method2271(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "(B)I")
	@Override
	public int method8703() {
		return this.anInt2520;
	}

	@OriginalMember(owner = "client!fd", name = "i", descriptor = "(I)V")
	private void method2272() {
		if (this.aComponent2 == null) {
			return;
		}
		this.aComponent2.removeMouseMotionListener(this);
		this.aComponent2.removeMouseListener(this);
		this.anInt2532 = this.anInt2531 = this.anInt2533 = 0;
		this.aClass124_25 = null;
		this.anInt2520 = this.anInt2510 = this.anInt2517 = 0;
		this.aComponent2 = null;
		this.aClass124_26 = null;
	}

	@OriginalMember(owner = "client!fd", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method2270(arg0);
		if (local10 == 1) {
			this.method2276(arg0.getY(), arg0.getClickCount(), arg0.getX(), 0);
		} else if (local10 == 4) {
			this.method2276(arg0.getY(), arg0.getClickCount(), arg0.getX(), 2);
		} else if (local10 == 2) {
			this.method2276(arg0.getY(), arg0.getClickCount(), arg0.getX(), 1);
		}
		this.anInt2533 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!fd", name = "f", descriptor = "(I)Z")
	@Override
	protected boolean method8701() {
		return (this.anInt2517 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	private void method2273(@OriginalArg(0) Component arg0) {
		this.method2272();
		this.aComponent2 = arg0;
		this.aComponent2.addMouseListener(this);
		this.aComponent2.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(B)V")
	@Override
	public synchronized void method8698() {
		this.anInt2517 = this.anInt2533;
		this.anInt2510 = this.anInt2531;
		this.anInt2520 = this.anInt2532;
		@Pc(18) Class124 local18 = this.aClass124_25;
		this.aClass124_25 = this.aClass124_26;
		this.aClass124_26 = local18;
		this.aClass124_26.method2567();
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIB)V")
	private void method2276(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class5_Sub25_Sub1 local7 = new Class5_Sub25_Sub1();
		local7.anInt2909 = arg0;
		local7.anInt2906 = arg3;
		local7.anInt2905 = arg2;
		local7.anInt2904 = arg1;
		local7.aLong110 = Static124.method1947();
		this.aClass124_26.method2574(local7);
	}

	@OriginalMember(owner = "client!fd", name = "g", descriptor = "(I)Lclient!ik;")
	@Override
	public Class5_Sub25 method8702() {
		return (Class5_Sub25) this.aClass124_25.method2571();
	}
}
