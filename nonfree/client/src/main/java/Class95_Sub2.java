import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rs")
public final class Class95_Sub2 extends Class95 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!rs", name = "B", descriptor = "I")
	private int anInt6310;

	@OriginalMember(owner = "client!rs", name = "H", descriptor = "I")
	private int anInt6315;

	@OriginalMember(owner = "client!rs", name = "I", descriptor = "I")
	private int anInt6316;

	@OriginalMember(owner = "client!rs", name = "O", descriptor = "I")
	private int anInt6321;

	@OriginalMember(owner = "client!rs", name = "P", descriptor = "I")
	private int anInt6322;

	@OriginalMember(owner = "client!rs", name = "Q", descriptor = "I")
	private int anInt6323;

	@OriginalMember(owner = "client!rs", name = "S", descriptor = "Ljava/awt/Component;")
	private Component aComponent3;

	@OriginalMember(owner = "client!rs", name = "A", descriptor = "Lclient!gw;")
	private Class91 aClass91_44 = new Class91();

	@OriginalMember(owner = "client!rs", name = "N", descriptor = "Lclient!gw;")
	private Class91 aClass91_45 = new Class91();

	@OriginalMember(owner = "client!rs", name = "R", descriptor = "Z")
	private final boolean aBoolean466;

	@OriginalMember(owner = "client!rs", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class95_Sub2(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method5186(arg0);
		this.aBoolean466 = arg1;
	}

	@OriginalMember(owner = "client!rs", name = "g", descriptor = "(I)I")
	@Override
	public int method5175() {
		return this.anInt6310;
	}

	@OriginalMember(owner = "client!rs", name = "h", descriptor = "(I)Lclient!sm;")
	@Override
	public Class4_Sub15 method5178() {
		return (Class4_Sub15) this.aClass91_44.method2583();
	}

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "(B)V")
	@Override
	public synchronized void method5177() {
		this.anInt6310 = this.anInt6321;
		this.anInt6315 = this.anInt6323;
		this.anInt6316 = this.anInt6322;
		@Pc(18) Class91 local18 = this.aClass91_44;
		this.aClass91_44 = this.aClass91_45;
		this.aClass91_45 = local18;
		this.aClass91_45.method2582();
	}

	@OriginalMember(owner = "client!rs", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method5184(arg0);
		if ((local8 & this.anInt6323) == 0) {
			local8 = this.anInt6323;
		}
		if ((local8 & 0x1) != 0) {
			this.method5182(arg0.getY(), 3, arg0.getX());
		}
		if ((local8 & 0x4) != 0) {
			this.method5182(arg0.getY(), 5, arg0.getX());
		}
		if ((local8 & 0x2) != 0) {
			this.method5182(arg0.getY(), 4, arg0.getX());
		}
		this.anInt6323 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIII)V")
	private void method5182(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class4_Sub15_Sub2 local7 = new Class4_Sub15_Sub2();
		local7.anInt6127 = arg2;
		local7.anInt6121 = arg1;
		local7.anInt6117 = arg0;
		local7.aLong182 = Static167.method2929();
		this.aClass91_45.method2587(local7);
	}

	@OriginalMember(owner = "client!rs", name = "e", descriptor = "(I)Z")
	@Override
	protected boolean method5173() {
		return (this.anInt6315 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!rs", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method5184(arg0);
		if (local10 == 1) {
			this.method5182(arg0.getY(), 0, arg0.getX());
		} else if (local10 == 4) {
			this.method5182(arg0.getY(), 2, arg0.getX());
		} else if (local10 == 2) {
			this.method5182(arg0.getY(), 1, arg0.getX());
		}
		this.anInt6323 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!rs", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method5174() {
		return (this.anInt6315 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!rs", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method5183(arg0);
	}

	@OriginalMember(owner = "client!rs", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.anInt6321 = -1;
		this.anInt6322 = -1;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;Z)V")
	private void method5183(@OriginalArg(0) MouseEvent arg0) {
		this.anInt6322 = arg0.getX();
		this.anInt6321 = arg0.getY();
		if (this.aBoolean466) {
			this.method5182(arg0.getY(), -1, arg0.getX());
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(B)I")
	@Override
	public int method5170() {
		return this.anInt6316;
	}

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "(I)Z")
	@Override
	protected boolean method5168() {
		return (this.anInt6315 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!rs", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method5183(arg0);
	}

	@OriginalMember(owner = "client!rs", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(BLjava/awt/event/MouseEvent;)I")
	private int method5184(@OriginalArg(1) MouseEvent arg0) {
		@Pc(6) int local6 = arg0.getModifiers();
		@Pc(14) boolean local14 = (local6 & 0x10) != 0;
		@Pc(22) boolean local22 = (local6 & 0x8) != 0;
		@Pc(33) boolean local33 = (local6 & 0x4) != 0;
		if (local22 && (local14 || local33)) {
			local22 = false;
		}
		if (local14 && local33) {
			return 4;
		} else if (local14) {
			return 1;
		} else if (local22) {
			return 2;
		} else if (local33) {
			return 4;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!rs", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method5183(arg0);
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Z)V")
	private void method5185() {
		if (this.aComponent3 == null) {
			return;
		}
		this.aComponent3.removeMouseMotionListener(this);
		this.aComponent3.removeMouseListener(this);
		this.anInt6316 = this.anInt6310 = this.anInt6315 = 0;
		this.aClass91_44 = null;
		this.aClass91_45 = null;
		this.aComponent3 = null;
		this.anInt6322 = this.anInt6321 = this.anInt6323 = 0;
	}

	@OriginalMember(owner = "client!rs", name = "d", descriptor = "(I)V")
	@Override
	public void method5172() {
		this.method5185();
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(ILjava/awt/Component;)V")
	private void method5186(@OriginalArg(1) Component arg0) {
		this.method5185();
		this.aComponent3 = arg0;
		this.aComponent3.addMouseListener(this);
		this.aComponent3.addMouseMotionListener(this);
	}
}
