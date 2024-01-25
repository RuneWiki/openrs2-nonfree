import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bw")
public final class Class4_Sub2 extends Class4 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!bw", name = "j", descriptor = "I")
	private int anInt1374;

	@OriginalMember(owner = "client!bw", name = "k", descriptor = "I")
	private int anInt1375;

	@OriginalMember(owner = "client!bw", name = "x", descriptor = "I")
	private int anInt1387;

	@OriginalMember(owner = "client!bw", name = "E", descriptor = "I")
	private int anInt1393;

	@OriginalMember(owner = "client!bw", name = "G", descriptor = "I")
	private int anInt1394;

	@OriginalMember(owner = "client!bw", name = "I", descriptor = "I")
	private int anInt1396;

	@OriginalMember(owner = "client!bw", name = "K", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!bw", name = "d", descriptor = "Lclient!mfa;")
	private Class211 aClass211_16 = new Class211();

	@OriginalMember(owner = "client!bw", name = "F", descriptor = "Lclient!mfa;")
	private Class211 aClass211_17 = new Class211();

	@OriginalMember(owner = "client!bw", name = "J", descriptor = "Z")
	private final boolean aBoolean147;

	@OriginalMember(owner = "client!bw", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class4_Sub2(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method1223(arg0);
		this.aBoolean147 = arg1;
	}

	@OriginalMember(owner = "client!bw", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method1224(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(Z)Lclient!ve;")
	@Override
	public Class6_Sub39 method1208() {
		return (Class6_Sub39) this.aClass211_16.method5180();
	}

	@OriginalMember(owner = "client!bw", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method1224(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!bw", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method1212() {
		return (this.anInt1374 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!bw", name = "c", descriptor = "(Z)Z")
	@Override
	protected boolean method1214() {
		return (this.anInt1374 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!bw", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method1219(arg0);
		if ((local8 & this.anInt1393) == 0) {
			local8 = this.anInt1393;
		}
		if ((local8 & 0x1) != 0) {
			this.method1225(arg0.getX(), arg0.getY(), 3);
		}
		if ((local8 & 0x4) != 0) {
			this.method1225(arg0.getX(), arg0.getY(), 5);
		}
		if ((local8 & 0x2) != 0) {
			this.method1225(arg0.getX(), arg0.getY(), 4);
		}
		this.anInt1393 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!bw", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method1224(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)I")
	private int method1219(@OriginalArg(0) MouseEvent arg0) {
		@Pc(6) int local6 = arg0.getModifiers();
		@Pc(17) boolean local17 = (local6 & 0x10) != 0;
		@Pc(25) boolean local25 = (local6 & 0x8) != 0;
		@Pc(33) boolean local33 = (local6 & 0x4) != 0;
		if (local25 && (local17 || local33)) {
			local25 = false;
		}
		if (local17 && local33) {
			return 4;
		} else if (local17) {
			return 1;
		} else if (local25) {
			return 2;
		} else if (local33) {
			return 4;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!bw", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method1224(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!bw", name = "f", descriptor = "(I)V")
	private void method1221() {
		if (this.aComponent2 == null) {
			return;
		}
		this.aComponent2.removeMouseMotionListener(this);
		this.aComponent2.removeMouseListener(this);
		this.aClass211_16 = null;
		this.anInt1387 = this.anInt1375 = this.anInt1374 = 0;
		this.aComponent2 = null;
		this.aClass211_17 = null;
		this.anInt1396 = this.anInt1394 = this.anInt1393 = 0;
	}

	@OriginalMember(owner = "client!bw", name = "c", descriptor = "(B)V")
	@Override
	public synchronized void method1217() {
		this.anInt1374 = this.anInt1393;
		this.anInt1375 = this.anInt1394;
		this.anInt1387 = this.anInt1396;
		@Pc(23) Class211 local23 = this.aClass211_16;
		this.aClass211_16 = this.aClass211_17;
		this.aClass211_17 = local23;
		this.aClass211_17.method5179();
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(I)Z")
	@Override
	protected boolean method1210() {
		return (this.anInt1374 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!bw", name = "c", descriptor = "(I)I")
	@Override
	public int method1215() {
		return this.anInt1375;
	}

	@OriginalMember(owner = "client!bw", name = "d", descriptor = "(I)I")
	@Override
	public int method1216() {
		return this.anInt1387;
	}

	@OriginalMember(owner = "client!bw", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(B)V")
	@Override
	public void method1211() {
		this.method1221();
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(ZLjava/awt/Component;)V")
	private void method1223(@OriginalArg(1) Component arg0) {
		this.method1221();
		this.aComponent2 = arg0;
		this.aComponent2.addMouseListener(this);
		this.aComponent2.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!bw", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method1219(arg0);
		if (local10 == 1) {
			this.method1225(arg0.getX(), arg0.getY(), 0);
		} else if (local10 == 4) {
			this.method1225(arg0.getX(), arg0.getY(), 2);
		} else if (local10 == 2) {
			this.method1225(arg0.getX(), arg0.getY(), 1);
		}
		this.anInt1393 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(IBI)V")
	private void method1224(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt1394 = arg1;
		this.anInt1396 = arg0;
		if (this.aBoolean147) {
			this.method1225(arg0, arg1, -1);
		}
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(IIII)V")
	private void method1225(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class6_Sub39_Sub1 local7 = new Class6_Sub39_Sub1();
		local7.anInt7733 = arg1;
		local7.anInt7739 = arg2;
		local7.anInt7734 = arg0;
		local7.aLong179 = Static174.method3502();
		this.aClass211_17.method5173(local7);
	}
}
