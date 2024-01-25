import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cba")
public final class Class48_Sub1 extends Class48 implements MouseListener, MouseMotionListener, MouseWheelListener {

	@OriginalMember(owner = "client!cba", name = "e", descriptor = "I")
	private int anInt1344;

	@OriginalMember(owner = "client!cba", name = "f", descriptor = "I")
	private int anInt1345;

	@OriginalMember(owner = "client!cba", name = "h", descriptor = "I")
	private int anInt1346;

	@OriginalMember(owner = "client!cba", name = "i", descriptor = "I")
	private int anInt1347;

	@OriginalMember(owner = "client!cba", name = "k", descriptor = "I")
	private int anInt1348;

	@OriginalMember(owner = "client!cba", name = "l", descriptor = "I")
	private int anInt1349;

	@OriginalMember(owner = "client!cba", name = "n", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!cba", name = "g", descriptor = "Lclient!qw;")
	private Class302 aClass302_7 = new Class302();

	@OriginalMember(owner = "client!cba", name = "j", descriptor = "Lclient!qw;")
	private Class302 aClass302_8 = new Class302();

	@OriginalMember(owner = "client!cba", name = "m", descriptor = "Z")
	private final boolean aBoolean96;

	@OriginalMember(owner = "client!cba", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class48_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method1194(arg0);
		this.aBoolean96 = arg1;
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(B)V")
	@Override
	public void method7510() {
		this.method1191();
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(III)V")
	private void method1190(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1349 = arg0;
		this.anInt1348 = arg1;
		if (this.aBoolean96) {
			this.method1193(-1, 0, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!cba", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!cba", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method1192(arg0);
		if ((local4 & this.anInt1347) == 0) {
			local4 = this.anInt1347;
		}
		if ((local4 & 0x1) != 0) {
			this.method1193(3, arg0.getClickCount(), arg0.getX(), arg0.getY());
		}
		if ((local4 & 0x4) != 0) {
			this.method1193(5, arg0.getClickCount(), arg0.getX(), arg0.getY());
		}
		if ((local4 & 0x2) != 0) {
			this.method1193(4, arg0.getClickCount(), arg0.getX(), arg0.getY());
		}
		this.anInt1347 &= ~local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!cba", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method1190(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!cba", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method1190(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!cba", name = "b", descriptor = "(B)I")
	@Override
	public int method7511() {
		return this.anInt1345;
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(I)I")
	@Override
	public int method7512() {
		return this.anInt1344;
	}

	@OriginalMember(owner = "client!cba", name = "g", descriptor = "(I)V")
	private void method1191() {
		if (this.aComponent1 == null) {
			return;
		}
		this.aComponent1.removeMouseWheelListener(this);
		this.aComponent1.removeMouseMotionListener(this);
		this.aComponent1.removeMouseListener(this);
		this.aClass302_7 = null;
		this.anInt1349 = this.anInt1348 = this.anInt1347 = 0;
		this.aClass302_8 = null;
		this.anInt1344 = this.anInt1345 = this.anInt1346 = 0;
		this.aComponent1 = null;
	}

	@OriginalMember(owner = "client!cba", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		@Pc(8) int local8 = arg0.getWheelRotation();
		this.method1193(6, local8, local2, local5);
		arg0.consume();
	}

	@OriginalMember(owner = "client!cba", name = "d", descriptor = "(I)Z")
	@Override
	protected boolean method7516() {
		return (this.anInt1346 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!cba", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method1190(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!cba", name = "b", descriptor = "(I)Lclient!taa;")
	@Override
	public Class3_Sub6 method7513() {
		return (Class3_Sub6) this.aClass302_7.method6611();
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(BLjava/awt/event/MouseEvent;)I")
	private int method1192(@OriginalArg(1) MouseEvent arg0) {
		if (arg0.getButton() == 1) {
			return arg0.isMetaDown() ? 4 : 1;
		} else if (arg0.getButton() == 2) {
			return 2;
		} else if (arg0.getButton() == 3) {
			return 4;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!cba", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method1192(arg0);
		if (local4 == 1) {
			this.method1193(0, arg0.getClickCount(), arg0.getX(), arg0.getY());
		} else if (local4 == 4) {
			this.method1193(2, arg0.getClickCount(), arg0.getX(), arg0.getY());
		} else if (local4 == 2) {
			this.method1193(1, arg0.getClickCount(), arg0.getX(), arg0.getY());
		}
		this.anInt1347 |= local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!cba", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method1190(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!cba", name = "f", descriptor = "(I)V")
	@Override
	public synchronized void method7519() {
		this.anInt1344 = this.anInt1349;
		this.anInt1345 = this.anInt1348;
		this.anInt1346 = this.anInt1347;
		@Pc(14) Class302 local14 = this.aClass302_7;
		this.aClass302_7 = this.aClass302_8;
		this.aClass302_8 = local14;
		this.aClass302_8.method6614();
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(IIZII)V")
	private void method1193(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) Class3_Sub6_Sub2 local9 = new Class3_Sub6_Sub2();
		local9.anInt6325 = arg3;
		local9.anInt6326 = arg2;
		local9.anInt6327 = arg0;
		local9.aLong175 = Static15.method380();
		local9.anInt6324 = arg1;
		this.aClass302_8.method6613(local9);
	}

	@OriginalMember(owner = "client!cba", name = "e", descriptor = "(I)Z")
	@Override
	protected boolean method7518() {
		return (this.anInt1346 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!cba", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method7514() {
		return (this.anInt1346 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	private void method1194(@OriginalArg(0) Component arg0) {
		this.method1191();
		this.aComponent1 = arg0;
		this.aComponent1.addMouseListener(this);
		this.aComponent1.addMouseMotionListener(this);
		this.aComponent1.addMouseWheelListener(this);
	}
}
