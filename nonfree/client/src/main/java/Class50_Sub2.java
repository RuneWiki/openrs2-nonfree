import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tca")
public final class Class50_Sub2 extends Class50 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!tca", name = "g", descriptor = "I")
	private int anInt8638;

	@OriginalMember(owner = "client!tca", name = "k", descriptor = "I")
	private int anInt8642;

	@OriginalMember(owner = "client!tca", name = "t", descriptor = "I")
	private int anInt8651;

	@OriginalMember(owner = "client!tca", name = "B", descriptor = "I")
	private int anInt8656;

	@OriginalMember(owner = "client!tca", name = "C", descriptor = "I")
	private int anInt8657;

	@OriginalMember(owner = "client!tca", name = "D", descriptor = "I")
	private int anInt8658;

	@OriginalMember(owner = "client!tca", name = "G", descriptor = "Ljava/awt/Component;")
	private Component aComponent4;

	@OriginalMember(owner = "client!tca", name = "z", descriptor = "Lclient!gj;")
	private Class124 aClass124_56 = new Class124();

	@OriginalMember(owner = "client!tca", name = "A", descriptor = "Lclient!gj;")
	private Class124 aClass124_57 = new Class124();

	@OriginalMember(owner = "client!tca", name = "F", descriptor = "Z")
	private final boolean aBoolean601;

	@OriginalMember(owner = "client!tca", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class50_Sub2(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method7110(arg0);
		this.aBoolean601 = arg1;
	}

	@OriginalMember(owner = "client!tca", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method7108(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!tca", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method7107() {
		return (this.anInt8651 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(III)V")
	private void method7108(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt8657 = arg1;
		this.anInt8656 = arg0;
		if (this.aBoolean601) {
			this.method7113(arg1, -1, arg0);
		}
	}

	@OriginalMember(owner = "client!tca", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method7105() {
		this.anInt8651 = this.anInt8658;
		this.anInt8638 = this.anInt8657;
		this.anInt8642 = this.anInt8656;
		@Pc(18) Class124 local18 = this.aClass124_56;
		this.aClass124_56 = this.aClass124_57;
		this.aClass124_57 = local18;
		this.aClass124_57.method3265();
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	private void method7110(@OriginalArg(0) Component arg0) {
		this.method7112();
		this.aComponent4 = arg0;
		this.aComponent4.addMouseListener(this);
		this.aComponent4.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(B)Lclient!hca;")
	@Override
	public Class4_Sub22 method7099() {
		return (Class4_Sub22) this.aClass124_56.method3272();
	}

	@OriginalMember(owner = "client!tca", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method7108(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!tca", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method7111(arg0);
		if ((local8 & this.anInt8658) == 0) {
			local8 = this.anInt8658;
		}
		if ((local8 & 0x1) != 0) {
			this.method7113(arg0.getX(), 3, arg0.getY());
		}
		if ((local8 & 0x4) != 0) {
			this.method7113(arg0.getX(), 5, arg0.getY());
		}
		if ((local8 & 0x2) != 0) {
			this.method7113(arg0.getX(), 4, arg0.getY());
		}
		this.anInt8658 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!tca", name = "c", descriptor = "(B)Z")
	@Override
	protected boolean method7106() {
		return (this.anInt8651 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!tca", name = "b", descriptor = "(I)V")
	@Override
	public void method7103() {
		this.method7112();
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(I)I")
	@Override
	public int method7102() {
		return this.anInt8642;
	}

	@OriginalMember(owner = "client!tca", name = "b", descriptor = "(B)I")
	@Override
	public int method7100() {
		return this.anInt8638;
	}

	@OriginalMember(owner = "client!tca", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(BLjava/awt/event/MouseEvent;)I")
	private int method7111(@OriginalArg(1) MouseEvent arg0) {
		@Pc(6) int local6 = arg0.getModifiers();
		@Pc(19) boolean local19 = (local6 & 0x10) != 0;
		@Pc(30) boolean local30 = (local6 & 0x8) != 0;
		@Pc(38) boolean local38 = (local6 & 0x4) != 0;
		if (local30 && (local19 || local38)) {
			local30 = false;
		}
		if (local19 && local38) {
			return 4;
		} else if (local19) {
			return 1;
		} else if (local30) {
			return 2;
		} else if (local38) {
			return 4;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!tca", name = "c", descriptor = "(I)Z")
	@Override
	protected boolean method7104() {
		return (this.anInt8651 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!tca", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method7108(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!tca", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method7108(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!tca", name = "e", descriptor = "(I)V")
	private void method7112() {
		if (this.aComponent4 == null) {
			return;
		}
		this.aComponent4.removeMouseMotionListener(this);
		this.aComponent4.removeMouseListener(this);
		this.aClass124_57 = null;
		this.anInt8638 = this.anInt8642 = this.anInt8651 = 0;
		this.aComponent4 = null;
		this.aClass124_56 = null;
		this.anInt8657 = this.anInt8656 = this.anInt8658 = 0;
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(IIIZ)V")
	private void method7113(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class4_Sub22_Sub2 local7 = new Class4_Sub22_Sub2();
		local7.anInt8855 = arg1;
		local7.anInt8852 = arg0;
		local7.anInt8850 = arg2;
		local7.aLong265 = Static184.method3422();
		this.aClass124_57.method3275(local7);
	}

	@OriginalMember(owner = "client!tca", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method7111(arg0);
		if (local10 == 1) {
			this.method7113(arg0.getX(), 0, arg0.getY());
		} else if (local10 == 4) {
			this.method7113(arg0.getX(), 2, arg0.getY());
		} else if (local10 == 2) {
			this.method7113(arg0.getX(), 1, arg0.getY());
		}
		this.anInt8658 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}
}
