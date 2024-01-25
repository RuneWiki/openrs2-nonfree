import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public final class Class48_Sub1 extends Class48 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!df", name = "r", descriptor = "I")
	private int anInt1370;

	@OriginalMember(owner = "client!df", name = "A", descriptor = "I")
	private int anInt1377;

	@OriginalMember(owner = "client!df", name = "G", descriptor = "I")
	private int anInt1383;

	@OriginalMember(owner = "client!df", name = "N", descriptor = "I")
	private int anInt1388;

	@OriginalMember(owner = "client!df", name = "P", descriptor = "I")
	private int anInt1390;

	@OriginalMember(owner = "client!df", name = "R", descriptor = "I")
	private int anInt1391;

	@OriginalMember(owner = "client!df", name = "U", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!df", name = "y", descriptor = "Lclient!ub;")
	private Class244 aClass244_7 = new Class244();

	@OriginalMember(owner = "client!df", name = "Q", descriptor = "Lclient!ub;")
	private Class244 aClass244_8 = new Class244();

	@OriginalMember(owner = "client!df", name = "T", descriptor = "Z")
	private final boolean aBoolean75;

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class48_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method1154(arg0);
		this.aBoolean75 = arg1;
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(I)Z")
	@Override
	protected boolean method1139() {
		return (this.anInt1370 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!df", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method1150(arg0);
	}

	@OriginalMember(owner = "client!df", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!df", name = "c", descriptor = "(B)V")
	@Override
	public void method1148() {
		this.method1149();
	}

	@OriginalMember(owner = "client!df", name = "h", descriptor = "(I)V")
	private void method1149() {
		if (this.aComponent1 == null) {
			return;
		}
		this.aComponent1.removeMouseListener(this);
		this.aComponent1.removeMouseMotionListener(this);
		this.aComponent1 = null;
		this.anInt1390 = this.anInt1388 = this.anInt1391 = 0;
		this.aClass244_8 = null;
		this.aClass244_7 = null;
		this.anInt1377 = this.anInt1383 = this.anInt1370 = 0;
	}

	@OriginalMember(owner = "client!df", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method1155(arg0);
		if (local10 == 1) {
			this.method1156(arg0.getX(), 0, arg0.getY());
		} else if (local10 == 4) {
			this.method1156(arg0.getX(), 2, arg0.getY());
		} else if (local10 == 2) {
			this.method1156(arg0.getX(), 1, arg0.getY());
		}
		this.anInt1391 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!df", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.anInt1388 = -1;
		this.anInt1390 = -1;
	}

	@OriginalMember(owner = "client!df", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method1150(arg0);
	}

	@OriginalMember(owner = "client!df", name = "e", descriptor = "(I)I")
	@Override
	public int method1142() {
		return this.anInt1383;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(BLjava/awt/event/MouseEvent;)V")
	private void method1150(@OriginalArg(1) MouseEvent arg0) {
		this.anInt1390 = arg0.getX();
		this.anInt1388 = arg0.getY();
		if (this.aBoolean75) {
			this.method1156(arg0.getX(), -1, arg0.getY());
		}
	}

	@OriginalMember(owner = "client!df", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method1155(arg0);
		if ((this.anInt1391 & local8) == 0) {
			local8 = this.anInt1391;
		}
		if ((local8 & 0x1) != 0) {
			this.method1156(arg0.getX(), 3, arg0.getY());
		}
		if ((local8 & 0x4) != 0) {
			this.method1156(arg0.getX(), 5, arg0.getY());
		}
		if ((local8 & 0x2) != 0) {
			this.method1156(arg0.getX(), 4, arg0.getY());
		}
		this.anInt1391 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(B)V")
	@Override
	public synchronized void method1145() {
		this.anInt1383 = this.anInt1388;
		this.anInt1370 = this.anInt1391;
		this.anInt1377 = this.anInt1390;
		@Pc(18) Class244 local18 = this.aClass244_7;
		this.aClass244_7 = this.aClass244_8;
		this.aClass244_8 = local18;
		this.aClass244_8.method5264();
	}

	@OriginalMember(owner = "client!df", name = "c", descriptor = "(I)Z")
	@Override
	protected boolean method1140() {
		return (this.anInt1370 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(ILjava/awt/Component;)V")
	private void method1154(@OriginalArg(1) Component arg0) {
		this.method1149();
		this.aComponent1 = arg0;
		this.aComponent1.addMouseListener(this);
		this.aComponent1.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!df", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method1150(arg0);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(I)I")
	@Override
	public int method1138() {
		return this.anInt1377;
	}

	@OriginalMember(owner = "client!df", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method1141() {
		return (this.anInt1370 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)I")
	private int method1155(@OriginalArg(1) MouseEvent arg0) {
		@Pc(6) int local6 = arg0.getModifiers();
		@Pc(15) boolean local15 = (local6 & 0x10) != 0;
		@Pc(26) boolean local26 = (local6 & 0x8) != 0;
		@Pc(37) boolean local37 = (local6 & 0x4) != 0;
		if (local26 && (local15 || local37)) {
			local26 = false;
		}
		if (local15 && local37) {
			return 4;
		} else if (local15) {
			return 1;
		} else if (local26) {
			return 2;
		} else if (local37) {
			return 4;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIII)V")
	private void method1156(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class4_Sub1_Sub1 local7 = new Class4_Sub1_Sub1();
		local7.anInt80 = arg0;
		local7.anInt87 = arg1;
		local7.anInt75 = arg2;
		local7.aLong4 = Static266.method3498();
		this.aClass244_8.method5273(local7);
	}

	@OriginalMember(owner = "client!df", name = "f", descriptor = "(I)Lclient!ic;")
	@Override
	public Class4_Sub1 method1146() {
		return (Class4_Sub1) this.aClass244_7.method5268();
	}
}
