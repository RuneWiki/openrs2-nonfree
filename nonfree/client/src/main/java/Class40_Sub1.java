import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cp")
public final class Class40_Sub1 extends Class40 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!cp", name = "l", descriptor = "I")
	private int anInt1570;

	@OriginalMember(owner = "client!cp", name = "o", descriptor = "I")
	private int anInt1573;

	@OriginalMember(owner = "client!cp", name = "J", descriptor = "I")
	private int anInt1591;

	@OriginalMember(owner = "client!cp", name = "L", descriptor = "I")
	private int anInt1593;

	@OriginalMember(owner = "client!cp", name = "M", descriptor = "I")
	private int anInt1594;

	@OriginalMember(owner = "client!cp", name = "P", descriptor = "I")
	private int anInt1596;

	@OriginalMember(owner = "client!cp", name = "Q", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!cp", name = "u", descriptor = "Lclient!wl;")
	private Class265 aClass265_12 = new Class265();

	@OriginalMember(owner = "client!cp", name = "O", descriptor = "Lclient!wl;")
	private Class265 aClass265_13 = new Class265();

	@OriginalMember(owner = "client!cp", name = "R", descriptor = "Z")
	private final boolean aBoolean126;

	@OriginalMember(owner = "client!cp", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class40_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method1170(arg0);
		this.aBoolean126 = arg1;
	}

	@OriginalMember(owner = "client!cp", name = "c", descriptor = "(B)V")
	@Override
	public synchronized void method1158() {
		this.anInt1591 = this.anInt1593;
		this.anInt1573 = this.anInt1594;
		this.anInt1570 = this.anInt1596;
		@Pc(18) Class265 local18 = this.aClass265_12;
		this.aClass265_12 = this.aClass265_13;
		this.aClass265_13 = local18;
		this.aClass265_13.method6003();
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;Z)I")
	private int method1166(@OriginalArg(0) MouseEvent arg0) {
		@Pc(6) int local6 = arg0.getModifiers();
		@Pc(17) boolean local17 = (local6 & 0x10) != 0;
		@Pc(35) boolean local35 = (local6 & 0x8) != 0;
		@Pc(43) boolean local43 = (local6 & 0x4) != 0;
		if (local35 && (local17 || local43)) {
			local35 = false;
		}
		if (local17 && local43) {
			return 4;
		} else if (local17) {
			return 1;
		} else if (local35) {
			return 2;
		} else if (local43) {
			return 4;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!cp", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method1169(arg0);
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(I)Z")
	@Override
	protected boolean method1154() {
		return (this.anInt1591 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!cp", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method1166(arg0);
		if ((local8 & this.anInt1593) == 0) {
			local8 = this.anInt1593;
		}
		if ((local8 & 0x1) != 0) {
			this.method1168(arg0.getX(), 3, arg0.getY());
		}
		if ((local8 & 0x4) != 0) {
			this.method1168(arg0.getX(), 5, arg0.getY());
		}
		if ((local8 & 0x2) != 0) {
			this.method1168(arg0.getX(), 4, arg0.getY());
		}
		this.anInt1593 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!cp", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method1169(arg0);
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(B)Z")
	@Override
	protected boolean method1155() {
		return (this.anInt1591 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!cp", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.anInt1594 = -1;
		this.anInt1596 = -1;
	}

	@OriginalMember(owner = "client!cp", name = "g", descriptor = "(B)V")
	private void method1167() {
		if (this.aComponent2 == null) {
			return;
		}
		this.aComponent2.removeMouseListener(this);
		this.aComponent2.removeMouseMotionListener(this);
		this.anInt1594 = this.anInt1596 = this.anInt1593 = 0;
		this.aClass265_13 = null;
		this.aClass265_12 = null;
		this.aComponent2 = null;
		this.anInt1573 = this.anInt1570 = this.anInt1591 = 0;
	}

	@OriginalMember(owner = "client!cp", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIII)V")
	private void method1168(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class2_Sub6_Sub1 local7 = new Class2_Sub6_Sub1();
		local7.anInt1084 = arg1;
		local7.anInt1086 = arg2;
		local7.anInt1083 = arg0;
		local7.aLong31 = Static208.method3182();
		this.aClass265_13.method5999(local7);
	}

	@OriginalMember(owner = "client!cp", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method1156() {
		return (this.anInt1591 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;B)V")
	private void method1169(@OriginalArg(0) MouseEvent arg0) {
		this.anInt1594 = arg0.getX();
		this.anInt1596 = arg0.getY();
		if (this.aBoolean126) {
			this.method1168(arg0.getX(), -1, arg0.getY());
		}
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(Z)I")
	@Override
	public int method1159() {
		return this.anInt1570;
	}

	@OriginalMember(owner = "client!cp", name = "c", descriptor = "(I)V")
	@Override
	public void method1161() {
		this.method1167();
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	private void method1170(@OriginalArg(0) Component arg0) {
		this.method1167();
		this.aComponent2 = arg0;
		this.aComponent2.addMouseListener(this);
		this.aComponent2.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!cp", name = "b", descriptor = "(I)Lclient!lb;")
	@Override
	public Class2_Sub6 method1160() {
		return (Class2_Sub6) this.aClass265_12.method5995();
	}

	@OriginalMember(owner = "client!cp", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method1166(arg0);
		if (local10 == 1) {
			this.method1168(arg0.getX(), 0, arg0.getY());
		} else if (local10 == 4) {
			this.method1168(arg0.getX(), 2, arg0.getY());
		} else if (local10 == 2) {
			this.method1168(arg0.getX(), 1, arg0.getY());
		}
		this.anInt1593 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!cp", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method1169(arg0);
	}

	@OriginalMember(owner = "client!cp", name = "d", descriptor = "(I)I")
	@Override
	public int method1164() {
		return this.anInt1573;
	}
}
