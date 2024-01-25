import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dk")
public final class Class50_Sub1 extends Class50 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!dk", name = "t", descriptor = "I")
	private int anInt1855;

	@OriginalMember(owner = "client!dk", name = "z", descriptor = "I")
	private int anInt1861;

	@OriginalMember(owner = "client!dk", name = "J", descriptor = "I")
	private int anInt1870;

	@OriginalMember(owner = "client!dk", name = "M", descriptor = "I")
	private int anInt1872;

	@OriginalMember(owner = "client!dk", name = "O", descriptor = "I")
	private int anInt1873;

	@OriginalMember(owner = "client!dk", name = "P", descriptor = "I")
	private int anInt1874;

	@OriginalMember(owner = "client!dk", name = "U", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!dk", name = "r", descriptor = "Lclient!um;")
	private Class244 aClass244_8 = new Class244();

	@OriginalMember(owner = "client!dk", name = "N", descriptor = "Lclient!um;")
	private Class244 aClass244_9 = new Class244();

	@OriginalMember(owner = "client!dk", name = "V", descriptor = "Z")
	private final boolean aBoolean137;

	@OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class50_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method1451(arg0);
		this.aBoolean137 = arg1;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(ZIII)V")
	private void method1449(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class6_Sub33_Sub1 local11 = new Class6_Sub33_Sub1();
		local11.anInt6362 = arg0;
		local11.anInt6365 = arg1;
		local11.anInt6361 = arg2;
		local11.aLong185 = Static449.method6552();
		this.aClass244_9.method5966(local11);
	}

	@OriginalMember(owner = "client!dk", name = "e", descriptor = "(B)V")
	private void method1450() {
		if (this.aComponent1 == null) {
			return;
		}
		this.aComponent1.removeMouseListener(this);
		this.aComponent1.removeMouseMotionListener(this);
		this.anInt1861 = this.anInt1870 = this.anInt1855 = 0;
		this.aComponent1 = null;
		this.aClass244_8 = null;
		this.anInt1874 = this.anInt1873 = this.anInt1872 = 0;
		this.aClass244_9 = null;
	}

	@OriginalMember(owner = "client!dk", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method1440() {
		this.anInt1855 = this.anInt1872;
		this.anInt1861 = this.anInt1874;
		this.anInt1870 = this.anInt1873;
		@Pc(18) Class244 local18 = this.aClass244_8;
		this.aClass244_8 = this.aClass244_9;
		this.aClass244_9 = local18;
		this.aClass244_9.method5969();
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(ILjava/awt/Component;)V")
	private void method1451(@OriginalArg(1) Component arg0) {
		this.method1450();
		this.aComponent1 = arg0;
		this.aComponent1.addMouseListener(this);
		this.aComponent1.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!dk", name = "e", descriptor = "(I)Z")
	@Override
	protected boolean method1441() {
		return (this.anInt1855 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!dk", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.anInt1874 = -1;
		this.anInt1873 = -1;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)I")
	private int method1452(@OriginalArg(0) MouseEvent arg0) {
		@Pc(6) int local6 = arg0.getModifiers();
		@Pc(17) boolean local17 = (local6 & 0x10) != 0;
		@Pc(28) boolean local28 = (local6 & 0x8) != 0;
		@Pc(39) boolean local39 = (local6 & 0x4) != 0;
		if (local28 && (local17 || local39)) {
			local28 = false;
		}
		if (local17 && local39) {
			return 4;
		} else if (local17) {
			return 1;
		} else if (local28) {
			return 2;
		} else if (local39) {
			return 4;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!dk", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method1456(arg0);
	}

	@OriginalMember(owner = "client!dk", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method1452(arg0);
		if (local10 == 1) {
			this.method1449(0, arg0.getX(), arg0.getY());
		} else if (local10 == 4) {
			this.method1449(2, arg0.getX(), arg0.getY());
		} else if (local10 == 2) {
			this.method1449(1, arg0.getX(), arg0.getY());
		}
		this.anInt1872 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)I")
	@Override
	public int method1436() {
		return this.anInt1861;
	}

	@OriginalMember(owner = "client!dk", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method1456(arg0);
	}

	@OriginalMember(owner = "client!dk", name = "f", descriptor = "(I)Lclient!rm;")
	@Override
	public Class6_Sub33 method1444() {
		return (Class6_Sub33) this.aClass244_8.method5973();
	}

	@OriginalMember(owner = "client!dk", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method1456(arg0);
	}

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method1442() {
		return (this.anInt1855 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!dk", name = "c", descriptor = "(B)I")
	@Override
	public int method1446() {
		return this.anInt1870;
	}

	@OriginalMember(owner = "client!dk", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "(I)Z")
	@Override
	protected boolean method1437() {
		return (this.anInt1855 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!dk", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method1452(arg0);
		if ((local8 & this.anInt1872) == 0) {
			local8 = this.anInt1872;
		}
		if ((local8 & 0x1) != 0) {
			this.method1449(3, arg0.getX(), arg0.getY());
		}
		if ((local8 & 0x4) != 0) {
			this.method1449(5, arg0.getX(), arg0.getY());
		}
		if ((local8 & 0x2) != 0) {
			this.method1449(4, arg0.getX(), arg0.getY());
		}
		this.anInt1872 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!dk", name = "d", descriptor = "(B)V")
	@Override
	public void method1447() {
		this.method1450();
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;B)V")
	private void method1456(@OriginalArg(0) MouseEvent arg0) {
		this.anInt1874 = arg0.getX();
		this.anInt1873 = arg0.getY();
		if (this.aBoolean137) {
			this.method1449(-1, arg0.getX(), arg0.getY());
		}
	}
}
