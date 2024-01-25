import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class Class161_Sub1 extends Class161 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!ie", name = "g", descriptor = "I")
	private int anInt4035;

	@OriginalMember(owner = "client!ie", name = "r", descriptor = "I")
	private int anInt4045;

	@OriginalMember(owner = "client!ie", name = "u", descriptor = "I")
	private int anInt4047;

	@OriginalMember(owner = "client!ie", name = "F", descriptor = "I")
	private int anInt4056;

	@OriginalMember(owner = "client!ie", name = "G", descriptor = "I")
	private int anInt4057;

	@OriginalMember(owner = "client!ie", name = "H", descriptor = "I")
	private int anInt4058;

	@OriginalMember(owner = "client!ie", name = "J", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!ie", name = "B", descriptor = "Lclient!ifa;")
	private Class163 aClass163_21 = new Class163();

	@OriginalMember(owner = "client!ie", name = "E", descriptor = "Lclient!ifa;")
	private Class163 aClass163_22 = new Class163();

	@OriginalMember(owner = "client!ie", name = "I", descriptor = "Z")
	private final boolean aBoolean302;

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class161_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method3632(arg0);
		this.aBoolean302 = arg1;
	}

	@OriginalMember(owner = "client!ie", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method3627(arg0);
		if ((this.anInt4058 & local8) == 0) {
			local8 = this.anInt4058;
		}
		if ((local8 & 0x1) != 0) {
			this.method3628(arg0.getClickCount(), arg0.getX(), arg0.getY(), 3);
		}
		if ((local8 & 0x4) != 0) {
			this.method3628(arg0.getClickCount(), arg0.getX(), arg0.getY(), 5);
		}
		if ((local8 & 0x2) != 0) {
			this.method3628(arg0.getClickCount(), arg0.getX(), arg0.getY(), 4);
		}
		this.anInt4058 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(BLjava/awt/event/MouseEvent;)I")
	private int method3627(@OriginalArg(1) MouseEvent arg0) {
		@Pc(11) int local11 = arg0.getModifiers();
		@Pc(19) boolean local19 = (local11 & 0x10) != 0;
		@Pc(27) boolean local27 = (local11 & 0x8) != 0;
		@Pc(35) boolean local35 = (local11 & 0x4) != 0;
		if (local27 && (local19 || local35)) {
			local27 = false;
		}
		if (local19 && local35) {
			return 4;
		} else if (local19) {
			return 1;
		} else if (local27) {
			return 2;
		} else if (local35) {
			return 4;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)I")
	@Override
	public int method5903() {
		return this.anInt4047;
	}

	@OriginalMember(owner = "client!ie", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method3631(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)Z")
	@Override
	protected boolean method5900() {
		return (this.anInt4035 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "(I)Lclient!gn;")
	@Override
	public Class4_Sub15 method5906() {
		return (Class4_Sub15) this.aClass163_21.method3644();
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(B)Z")
	@Override
	protected boolean method5901() {
		return (this.anInt4035 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!ie", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method3631(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!ie", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method5905() {
		return (this.anInt4035 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIII)V")
	private void method3628(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class4_Sub15_Sub1 local7 = new Class4_Sub15_Sub1();
		local7.anInt2062 = arg2;
		local7.anInt2069 = arg0;
		local7.anInt2064 = arg1;
		local7.anInt2066 = arg3;
		local7.aLong72 = Static429.method5935();
		this.aClass163_22.method3646(local7);
	}

	@OriginalMember(owner = "client!ie", name = "e", descriptor = "(I)V")
	private void method3630() {
		if (this.aComponent2 == null) {
			return;
		}
		this.aComponent2.removeMouseMotionListener(this);
		this.aComponent2.removeMouseListener(this);
		this.aComponent2 = null;
		this.aClass163_21 = null;
		this.aClass163_22 = null;
		this.anInt4047 = this.anInt4045 = this.anInt4035 = 0;
		this.anInt4057 = this.anInt4056 = this.anInt4058 = 0;
	}

	@OriginalMember(owner = "client!ie", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method3627(arg0);
		if (local10 == 1) {
			this.method3628(arg0.getClickCount(), arg0.getX(), arg0.getY(), 0);
		} else if (local10 == 4) {
			this.method3628(arg0.getClickCount(), arg0.getX(), arg0.getY(), 2);
		} else if (local10 == 2) {
			this.method3628(arg0.getClickCount(), arg0.getX(), arg0.getY(), 1);
		}
		this.anInt4058 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ie", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method3631(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!ie", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ie", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method3631(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Z)I")
	@Override
	public int method5898() {
		return this.anInt4045;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(BII)V")
	private void method3631(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt4056 = arg0;
		this.anInt4057 = arg1;
		if (this.aBoolean302) {
			this.method3628(0, arg1, arg0, -1);
		}
	}

	@OriginalMember(owner = "client!ie", name = "f", descriptor = "(B)V")
	@Override
	public void method5907() {
		this.method3630();
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	private void method3632(@OriginalArg(0) Component arg0) {
		this.method3630();
		this.aComponent2 = arg0;
		this.aComponent2.addMouseListener(this);
		this.aComponent2.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "(B)V")
	@Override
	public synchronized void method5902() {
		this.anInt4035 = this.anInt4058;
		this.anInt4045 = this.anInt4056;
		this.anInt4047 = this.anInt4057;
		@Pc(18) Class163 local18 = this.aClass163_21;
		this.aClass163_21 = this.aClass163_22;
		this.aClass163_22 = local18;
		this.aClass163_22.method3643();
	}
}
