import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class191_Sub2 extends Class191 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!qe", name = "k", descriptor = "I")
	private int anInt8036;

	@OriginalMember(owner = "client!qe", name = "l", descriptor = "I")
	private int anInt8037;

	@OriginalMember(owner = "client!qe", name = "x", descriptor = "I")
	private int anInt8047;

	@OriginalMember(owner = "client!qe", name = "G", descriptor = "I")
	private int anInt8055;

	@OriginalMember(owner = "client!qe", name = "H", descriptor = "I")
	private int anInt8056;

	@OriginalMember(owner = "client!qe", name = "K", descriptor = "I")
	private int anInt8058;

	@OriginalMember(owner = "client!qe", name = "L", descriptor = "Ljava/awt/Component;")
	private Component aComponent5;

	@OriginalMember(owner = "client!qe", name = "F", descriptor = "Lclient!mr;")
	private Class223 aClass223_46 = new Class223();

	@OriginalMember(owner = "client!qe", name = "I", descriptor = "Lclient!mr;")
	private Class223 aClass223_47 = new Class223();

	@OriginalMember(owner = "client!qe", name = "M", descriptor = "Z")
	private final boolean aBoolean558;

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class191_Sub2(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method6996(arg0);
		this.aBoolean558 = arg1;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)Lclient!rg;")
	@Override
	public Class3_Sub31 method6986() {
		return (Class3_Sub31) this.aClass223_46.method5872();
	}

	@OriginalMember(owner = "client!qe", name = "h", descriptor = "(I)I")
	@Override
	public int method6989() {
		return this.anInt8047;
	}

	@OriginalMember(owner = "client!qe", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method6991(arg0);
		if ((local8 & this.anInt8055) == 0) {
			local8 = this.anInt8055;
		}
		if ((local8 & 0x1) != 0) {
			this.method6993(arg0.getY(), 3, arg0.getClickCount(), arg0.getX());
		}
		if ((local8 & 0x4) != 0) {
			this.method6993(arg0.getY(), 5, arg0.getClickCount(), arg0.getX());
		}
		if ((local8 & 0x2) != 0) {
			this.method6993(arg0.getY(), 4, arg0.getClickCount(), arg0.getX());
		}
		this.anInt8055 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!qe", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;B)I")
	private int method6991(@OriginalArg(0) MouseEvent arg0) {
		@Pc(6) int local6 = arg0.getModifiers();
		@Pc(17) boolean local17 = (local6 & 0x10) != 0;
		@Pc(31) boolean local31 = (local6 & 0x8) != 0;
		@Pc(39) boolean local39 = (local6 & 0x4) != 0;
		if (local31 && (local17 || local39)) {
			local31 = false;
		}
		if (local17 && local39) {
			return 4;
		} else if (local17) {
			return 1;
		} else if (local31) {
			return 2;
		} else if (local39) {
			return 4;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "(I)I")
	@Override
	public int method6982() {
		return this.anInt8036;
	}

	@OriginalMember(owner = "client!qe", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method6994(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!qe", name = "i", descriptor = "(I)V")
	private void method6992() {
		if (this.aComponent5 == null) {
			return;
		}
		this.aComponent5.removeMouseMotionListener(this);
		this.aComponent5.removeMouseListener(this);
		this.aClass223_46 = null;
		this.anInt8058 = this.anInt8056 = this.anInt8055 = 0;
		this.aClass223_47 = null;
		this.aComponent5 = null;
		this.anInt8047 = this.anInt8036 = this.anInt8037 = 0;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIZI)V")
	private void method6993(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(11) Class3_Sub31_Sub1 local11 = new Class3_Sub31_Sub1();
		local11.anInt4927 = arg0;
		local11.anInt4929 = arg3;
		local11.anInt4928 = arg2;
		local11.anInt4935 = arg1;
		local11.aLong153 = Static374.method6036();
		this.aClass223_47.method5868(local11);
	}

	@OriginalMember(owner = "client!qe", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method6991(arg0);
		if (local10 == 1) {
			this.method6993(arg0.getY(), 0, arg0.getClickCount(), arg0.getX());
		} else if (local10 == 4) {
			this.method6993(arg0.getY(), 2, arg0.getClickCount(), arg0.getX());
		} else if (local10 == 2) {
			this.method6993(arg0.getY(), 1, arg0.getClickCount(), arg0.getX());
		}
		this.anInt8055 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(III)V")
	private void method6994(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt8056 = arg0;
		this.anInt8058 = arg1;
		if (this.aBoolean558) {
			this.method6993(arg0, -1, 0, arg1);
		}
	}

	@OriginalMember(owner = "client!qe", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method6984() {
		return (this.anInt8037 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)Z")
	@Override
	protected boolean method6980() {
		return (this.anInt8037 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!qe", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method6994(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!qe", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method6994(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!qe", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method6994(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!qe", name = "g", descriptor = "(I)V")
	@Override
	public void method6988() {
		this.method6992();
	}

	@OriginalMember(owner = "client!qe", name = "f", descriptor = "(I)Z")
	@Override
	protected boolean method6987() {
		return (this.anInt8037 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILjava/awt/Component;)V")
	private void method6996(@OriginalArg(1) Component arg0) {
		this.method6992();
		this.aComponent5 = arg0;
		this.aComponent5.addMouseListener(this);
		this.aComponent5.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method6983() {
		this.anInt8037 = this.anInt8055;
		this.anInt8047 = this.anInt8058;
		this.anInt8036 = this.anInt8056;
		@Pc(18) Class223 local18 = this.aClass223_46;
		this.aClass223_46 = this.aClass223_47;
		this.aClass223_47 = local18;
		this.aClass223_47.method5862();
	}
}
