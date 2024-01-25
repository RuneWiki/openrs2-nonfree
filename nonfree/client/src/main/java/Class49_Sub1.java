import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cg")
public final class Class49_Sub1 extends Class49 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!cg", name = "j", descriptor = "I")
	private int anInt1346;

	@OriginalMember(owner = "client!cg", name = "p", descriptor = "I")
	private int anInt1351;

	@OriginalMember(owner = "client!cg", name = "F", descriptor = "I")
	private int anInt1365;

	@OriginalMember(owner = "client!cg", name = "G", descriptor = "I")
	private int anInt1366;

	@OriginalMember(owner = "client!cg", name = "I", descriptor = "I")
	private int anInt1367;

	@OriginalMember(owner = "client!cg", name = "J", descriptor = "I")
	private int anInt1368;

	@OriginalMember(owner = "client!cg", name = "K", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!cg", name = "i", descriptor = "Lclient!mba;")
	private Class216 aClass216_6 = new Class216();

	@OriginalMember(owner = "client!cg", name = "H", descriptor = "Lclient!mba;")
	private Class216 aClass216_7 = new Class216();

	@OriginalMember(owner = "client!cg", name = "L", descriptor = "Z")
	private final boolean aBoolean87;

	@OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class49_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method1192(arg0);
		this.aBoolean87 = arg1;
	}

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "(I)I")
	@Override
	public int method2429() {
		return this.anInt1351;
	}

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "(Z)Z")
	@Override
	public boolean method2433() {
		return (this.anInt1365 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)I")
	private int method1189(@OriginalArg(1) MouseEvent arg0) {
		@Pc(6) int local6 = arg0.getModifiers();
		@Pc(14) boolean local14 = (local6 & 0x10) != 0;
		@Pc(23) boolean local23 = (local6 & 0x8) != 0;
		@Pc(34) boolean local34 = (local6 & 0x4) != 0;
		if (local23 && (local14 || local34)) {
			local23 = false;
		}
		if (local14 && local34) {
			return 4;
		} else if (local14) {
			return 1;
		} else if (local23) {
			return 2;
		} else if (local34) {
			return 4;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)I")
	@Override
	public int method2426() {
		return this.anInt1346;
	}

	@OriginalMember(owner = "client!cg", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method1189(arg0);
		if (local10 == 1) {
			this.method1190(arg0.getClickCount(), arg0.getY(), 0, arg0.getX());
		} else if (local10 == 4) {
			this.method1190(arg0.getClickCount(), arg0.getY(), 2, arg0.getX());
		} else if (local10 == 2) {
			this.method1190(arg0.getClickCount(), arg0.getY(), 1, arg0.getX());
		}
		this.anInt1366 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(Z)Z")
	@Override
	protected boolean method2432() {
		return (this.anInt1365 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIII)V")
	private void method1190(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class3_Sub21_Sub1 local7 = new Class3_Sub21_Sub1();
		local7.anInt3412 = arg2;
		local7.anInt3419 = arg0;
		local7.anInt3416 = arg1;
		local7.anInt3409 = arg3;
		local7.aLong98 = Static191.method3071();
		this.aClass216_7.method5449(local7);
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(ILjava/awt/Component;)V")
	private void method1192(@OriginalArg(1) Component arg0) {
		this.method1194();
		this.aComponent1 = arg0;
		this.aComponent1.addMouseListener(this);
		this.aComponent1.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IZI)V")
	private void method1193(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt1367 = arg1;
		this.anInt1368 = arg0;
		if (this.aBoolean87) {
			this.method1190(0, arg0, -1, arg1);
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Z)Lclient!q;")
	@Override
	public Class3_Sub21 method2425() {
		return (Class3_Sub21) this.aClass216_6.method5462();
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(B)V")
	@Override
	public synchronized void method2427() {
		this.anInt1351 = this.anInt1368;
		this.anInt1365 = this.anInt1366;
		this.anInt1346 = this.anInt1367;
		@Pc(26) Class216 local26 = this.aClass216_6;
		this.aClass216_6 = this.aClass216_7;
		this.aClass216_7 = local26;
		this.aClass216_7.method5454();
	}

	@OriginalMember(owner = "client!cg", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method1193(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V")
	@Override
	public void method2424() {
		this.method1194();
	}

	@OriginalMember(owner = "client!cg", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method1193(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(I)Z")
	@Override
	protected boolean method2428() {
		return (this.anInt1365 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!cg", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method1193(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!cg", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method1189(arg0);
		if ((this.anInt1366 & local8) == 0) {
			local8 = this.anInt1366;
		}
		if ((local8 & 0x1) != 0) {
			this.method1190(arg0.getClickCount(), arg0.getY(), 3, arg0.getX());
		}
		if ((local8 & 0x4) != 0) {
			this.method1190(arg0.getClickCount(), arg0.getY(), 5, arg0.getX());
		}
		if ((local8 & 0x2) != 0) {
			this.method1190(arg0.getClickCount(), arg0.getY(), 4, arg0.getX());
		}
		this.anInt1366 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!cg", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method1193(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!cg", name = "g", descriptor = "(I)V")
	private void method1194() {
		if (this.aComponent1 == null) {
			return;
		}
		this.aComponent1.removeMouseMotionListener(this);
		this.aComponent1.removeMouseListener(this);
		this.anInt1346 = this.anInt1351 = this.anInt1365 = 0;
		this.aComponent1 = null;
		this.anInt1367 = this.anInt1368 = this.anInt1366 = 0;
		this.aClass216_6 = null;
		this.aClass216_7 = null;
	}

	@OriginalMember(owner = "client!cg", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}
}
