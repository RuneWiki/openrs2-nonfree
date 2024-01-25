import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eaa")
public final class Class71_Sub1 extends Class71 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!eaa", name = "l", descriptor = "I")
	private int anInt2304;

	@OriginalMember(owner = "client!eaa", name = "I", descriptor = "I")
	private int anInt2323;

	@OriginalMember(owner = "client!eaa", name = "K", descriptor = "I")
	private int anInt2324;

	@OriginalMember(owner = "client!eaa", name = "M", descriptor = "I")
	private int anInt2325;

	@OriginalMember(owner = "client!eaa", name = "N", descriptor = "I")
	private int anInt2326;

	@OriginalMember(owner = "client!eaa", name = "O", descriptor = "I")
	private int anInt2327;

	@OriginalMember(owner = "client!eaa", name = "R", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!eaa", name = "x", descriptor = "Lclient!ada;")
	private Class8 aClass8_13 = new Class8();

	@OriginalMember(owner = "client!eaa", name = "L", descriptor = "Lclient!ada;")
	private Class8 aClass8_14 = new Class8();

	@OriginalMember(owner = "client!eaa", name = "P", descriptor = "Z")
	private final boolean aBoolean169;

	@OriginalMember(owner = "client!eaa", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class71_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method1946(arg0);
		this.aBoolean169 = arg1;
	}

	@OriginalMember(owner = "client!eaa", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!eaa", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method1941(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!eaa", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method1941(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!eaa", name = "f", descriptor = "(I)I")
	@Override
	public int method7702() {
		return this.anInt2324;
	}

	@OriginalMember(owner = "client!eaa", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method1941(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(Z)Lclient!wi;")
	@Override
	public Class6_Sub15 method7703() {
		return (Class6_Sub15) this.aClass8_13.method152();
	}

	@OriginalMember(owner = "client!eaa", name = "c", descriptor = "(I)Z")
	@Override
	protected boolean method7696() {
		return (this.anInt2323 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(III)V")
	private void method1941(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2326 = arg0;
		this.anInt2327 = arg1;
		if (this.aBoolean169) {
			this.method1945(arg1, -1, arg0, 0);
		}
	}

	@OriginalMember(owner = "client!eaa", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method1943(arg0);
		if (local10 == 1) {
			this.method1945(arg0.getY(), 0, arg0.getX(), arg0.getClickCount());
		} else if (local10 == 4) {
			this.method1945(arg0.getY(), 2, arg0.getX(), arg0.getClickCount());
		} else if (local10 == 2) {
			this.method1945(arg0.getY(), 1, arg0.getX(), arg0.getClickCount());
		}
		this.anInt2325 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!eaa", name = "e", descriptor = "(I)I")
	@Override
	public int method7701() {
		return this.anInt2304;
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;B)I")
	private int method1943(@OriginalArg(0) MouseEvent arg0) {
		@Pc(12) int local12 = arg0.getModifiers();
		@Pc(20) boolean local20 = (local12 & 0x10) != 0;
		@Pc(31) boolean local31 = (local12 & 0x8) != 0;
		@Pc(42) boolean local42 = (local12 & 0x4) != 0;
		if (local31 && (local20 || local42)) {
			local31 = false;
		}
		if (local20 && local42) {
			return 4;
		} else if (local20) {
			return 1;
		} else if (local31) {
			return 2;
		} else if (local42) {
			return 4;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7694() {
		return (this.anInt2323 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(IBIII)V")
	private void method1945(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class6_Sub15_Sub2 local7 = new Class6_Sub15_Sub2();
		local7.anInt9947 = arg3;
		local7.anInt9942 = arg0;
		local7.anInt9939 = arg1;
		local7.anInt9937 = arg2;
		local7.aLong263 = Static32.method595();
		this.aClass8_14.method157(local7);
	}

	@OriginalMember(owner = "client!eaa", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method7695() {
		this.anInt2324 = this.anInt2327;
		this.anInt2323 = this.anInt2325;
		this.anInt2304 = this.anInt2326;
		@Pc(18) Class8 local18 = this.aClass8_13;
		this.aClass8_13 = this.aClass8_14;
		this.aClass8_14 = local18;
		this.aClass8_14.method154();
	}

	@OriginalMember(owner = "client!eaa", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method1943(arg0);
		if ((local8 & this.anInt2325) == 0) {
			local8 = this.anInt2325;
		}
		if ((local8 & 0x1) != 0) {
			this.method1945(arg0.getY(), 3, arg0.getX(), arg0.getClickCount());
		}
		if ((local8 & 0x4) != 0) {
			this.method1945(arg0.getY(), 5, arg0.getX(), arg0.getClickCount());
		}
		if ((local8 & 0x2) != 0) {
			this.method1945(arg0.getY(), 4, arg0.getX(), arg0.getClickCount());
		}
		this.anInt2325 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!eaa", name = "d", descriptor = "(I)V")
	@Override
	public void method7700() {
		this.method1947();
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	private void method1946(@OriginalArg(0) Component arg0) {
		this.method1947();
		this.aComponent1 = arg0;
		this.aComponent1.addMouseListener(this);
		this.aComponent1.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!eaa", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method1941(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!eaa", name = "i", descriptor = "(I)V")
	private void method1947() {
		if (this.aComponent1 == null) {
			return;
		}
		this.aComponent1.removeMouseMotionListener(this);
		this.aComponent1.removeMouseListener(this);
		this.aClass8_13 = null;
		this.anInt2304 = this.anInt2324 = this.anInt2323 = 0;
		this.anInt2326 = this.anInt2327 = this.anInt2325 = 0;
		this.aClass8_14 = null;
		this.aComponent1 = null;
	}

	@OriginalMember(owner = "client!eaa", name = "b", descriptor = "(B)Z")
	@Override
	protected boolean method7699() {
		return (this.anInt2323 & 0x4) != 0;
	}
}
