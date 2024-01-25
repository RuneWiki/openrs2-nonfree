import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bi")
public final class Class35_Sub1 extends Class35 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!bi", name = "i", descriptor = "I")
	private int anInt1513;

	@OriginalMember(owner = "client!bi", name = "s", descriptor = "I")
	private int anInt1522;

	@OriginalMember(owner = "client!bi", name = "A", descriptor = "I")
	private int anInt1528;

	@OriginalMember(owner = "client!bi", name = "M", descriptor = "I")
	private int anInt1538;

	@OriginalMember(owner = "client!bi", name = "N", descriptor = "I")
	private int anInt1539;

	@OriginalMember(owner = "client!bi", name = "O", descriptor = "I")
	private int anInt1540;

	@OriginalMember(owner = "client!bi", name = "P", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!bi", name = "o", descriptor = "Lclient!bq;")
	private Class43 aClass43_13 = new Class43();

	@OriginalMember(owner = "client!bi", name = "K", descriptor = "Lclient!bq;")
	private Class43 aClass43_14 = new Class43();

	@OriginalMember(owner = "client!bi", name = "Q", descriptor = "Z")
	private final boolean aBoolean120;

	@OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class35_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method1330(arg0);
		this.aBoolean120 = arg1;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Z)Z")
	@Override
	protected boolean method5762() {
		return (this.anInt1522 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!bi", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method1331(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILjava/awt/Component;)V")
	private void method1330(@OriginalArg(1) Component arg0) {
		this.method1337();
		this.aComponent1 = arg0;
		this.aComponent1.addMouseListener(this);
		this.aComponent1.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(Z)Lclient!u;")
	@Override
	public Class8_Sub33 method5765() {
		return (Class8_Sub33) this.aClass43_13.method1432();
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIB)V")
	private void method1331(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1539 = arg0;
		this.anInt1538 = arg1;
		if (this.aBoolean120) {
			this.method1334(0, arg0, arg1, -1);
		}
	}

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "(B)I")
	@Override
	public int method5764() {
		return this.anInt1528;
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(B)V")
	@Override
	public void method5763() {
		this.method1337();
	}

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method5771() {
		this.anInt1522 = this.anInt1540;
		this.anInt1513 = this.anInt1539;
		this.anInt1528 = this.anInt1538;
		@Pc(22) Class43 local22 = this.aClass43_13;
		this.aClass43_13 = this.aClass43_14;
		this.aClass43_14 = local22;
		this.aClass43_14.method1431();
	}

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "(Z)Z")
	@Override
	protected boolean method5768() {
		return (this.anInt1522 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!bi", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method1331(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!bi", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method1331(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!bi", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(BIIII)V")
	private void method1334(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class8_Sub33_Sub2 local7 = new Class8_Sub33_Sub2();
		local7.anInt8718 = arg2;
		local7.anInt8717 = arg3;
		local7.anInt8721 = arg1;
		local7.anInt8723 = arg0;
		local7.aLong228 = Static342.method5463();
		this.aClass43_14.method1424(local7);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)I")
	private int method1335(@OriginalArg(1) MouseEvent arg0) {
		@Pc(6) int local6 = arg0.getModifiers();
		@Pc(17) boolean local17 = (local6 & 0x10) != 0;
		@Pc(34) boolean local34 = (local6 & 0x8) != 0;
		@Pc(45) boolean local45 = (local6 & 0x4) != 0;
		if (local34 && (local17 || local45)) {
			local34 = false;
		}
		if (local17 && local45) {
			return 4;
		} else if (local17) {
			return 1;
		} else if (local34) {
			return 2;
		} else if (local45) {
			return 4;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!bi", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method1331(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!bi", name = "e", descriptor = "(I)V")
	private void method1337() {
		if (this.aComponent1 == null) {
			return;
		}
		this.aComponent1.removeMouseMotionListener(this);
		this.aComponent1.removeMouseListener(this);
		this.aComponent1 = null;
		this.aClass43_14 = null;
		this.aClass43_13 = null;
		this.anInt1538 = this.anInt1539 = this.anInt1540 = 0;
		this.anInt1528 = this.anInt1513 = this.anInt1522 = 0;
	}

	@OriginalMember(owner = "client!bi", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method5769() {
		return (this.anInt1522 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)I")
	@Override
	public int method5761() {
		return this.anInt1513;
	}

	@OriginalMember(owner = "client!bi", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method1335(arg0);
		if (local10 == 1) {
			this.method1334(arg0.getClickCount(), arg0.getY(), arg0.getX(), 0);
		} else if (local10 == 4) {
			this.method1334(arg0.getClickCount(), arg0.getY(), arg0.getX(), 2);
		} else if (local10 == 2) {
			this.method1334(arg0.getClickCount(), arg0.getY(), arg0.getX(), 1);
		}
		this.anInt1540 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!bi", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method1335(arg0);
		if ((local8 & this.anInt1540) == 0) {
			local8 = this.anInt1540;
		}
		if ((local8 & 0x1) != 0) {
			this.method1334(arg0.getClickCount(), arg0.getY(), arg0.getX(), 3);
		}
		if ((local8 & 0x4) != 0) {
			this.method1334(arg0.getClickCount(), arg0.getY(), arg0.getX(), 5);
		}
		if ((local8 & 0x2) != 0) {
			this.method1334(arg0.getClickCount(), arg0.getY(), arg0.getX(), 4);
		}
		this.anInt1540 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}
}
