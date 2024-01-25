import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gp")
public final class Class128_Sub1 extends Class128 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!gp", name = "i", descriptor = "I")
	private int anInt3268;

	@OriginalMember(owner = "client!gp", name = "n", descriptor = "I")
	private int anInt3273;

	@OriginalMember(owner = "client!gp", name = "A", descriptor = "I")
	private int anInt3284;

	@OriginalMember(owner = "client!gp", name = "G", descriptor = "I")
	private int anInt3288;

	@OriginalMember(owner = "client!gp", name = "H", descriptor = "I")
	private int anInt3289;

	@OriginalMember(owner = "client!gp", name = "J", descriptor = "I")
	private int anInt3290;

	@OriginalMember(owner = "client!gp", name = "K", descriptor = "Ljava/awt/Component;")
	private Component aComponent3;

	@OriginalMember(owner = "client!gp", name = "v", descriptor = "Lclient!v;")
	private Class362 aClass362_16 = new Class362();

	@OriginalMember(owner = "client!gp", name = "I", descriptor = "Lclient!v;")
	private Class362 aClass362_17 = new Class362();

	@OriginalMember(owner = "client!gp", name = "L", descriptor = "Z")
	private final boolean aBoolean198;

	@OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class128_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method2736(arg0);
		this.aBoolean198 = arg1;
	}

	@OriginalMember(owner = "client!gp", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method2734(arg0);
		if ((this.anInt3288 & local8) == 0) {
			local8 = this.anInt3288;
		}
		if ((local8 & 0x1) != 0) {
			this.method2735(arg0.getY(), arg0.getClickCount(), arg0.getX(), 3);
		}
		if ((local8 & 0x4) != 0) {
			this.method2735(arg0.getY(), arg0.getClickCount(), arg0.getX(), 5);
		}
		if ((local8 & 0x2) != 0) {
			this.method2735(arg0.getY(), arg0.getClickCount(), arg0.getX(), 4);
		}
		this.anInt3288 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!gp", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method2734(arg0);
		if (local10 == 1) {
			this.method2735(arg0.getY(), arg0.getClickCount(), arg0.getX(), 0);
		} else if (local10 == 4) {
			this.method2735(arg0.getY(), arg0.getClickCount(), arg0.getX(), 2);
		} else if (local10 == 2) {
			this.method2735(arg0.getY(), arg0.getClickCount(), arg0.getX(), 1);
		}
		this.anInt3288 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(III)V")
	private void method2733(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3290 = arg1;
		this.anInt3289 = arg0;
		if (this.aBoolean198) {
			this.method2735(arg1, 0, arg0, -1);
		}
	}

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "(B)Z")
	@Override
	protected boolean method5190() {
		return (this.anInt3284 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)I")
	private int method2734(@OriginalArg(1) MouseEvent arg0) {
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

	@OriginalMember(owner = "client!gp", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method2733(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!gp", name = "d", descriptor = "(I)Lclient!pea;")
	@Override
	public Class6_Sub27 method5196() {
		return (Class6_Sub27) this.aClass362_16.method8531();
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(I)I")
	@Override
	public int method5188() {
		return this.anInt3268;
	}

	@OriginalMember(owner = "client!gp", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method2733(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIIII)V")
	private void method2735(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class6_Sub27_Sub1 local7 = new Class6_Sub27_Sub1();
		local7.anInt4507 = arg3;
		local7.anInt4503 = arg1;
		local7.anInt4506 = arg2;
		local7.anInt4509 = arg0;
		local7.aLong132 = Static566.method7936();
		this.aClass362_17.method8536(local7);
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	private void method2736(@OriginalArg(0) Component arg0) {
		this.method2737();
		this.aComponent3 = arg0;
		this.aComponent3.addMouseListener(this);
		this.aComponent3.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!gp", name = "e", descriptor = "(I)V")
	private void method2737() {
		if (this.aComponent3 == null) {
			return;
		}
		this.aComponent3.removeMouseMotionListener(this);
		this.aComponent3.removeMouseListener(this);
		this.aClass362_17 = null;
		this.aClass362_16 = null;
		this.anInt3289 = this.anInt3290 = this.anInt3288 = 0;
		this.aComponent3 = null;
		this.anInt3273 = this.anInt3268 = this.anInt3284 = 0;
	}

	@OriginalMember(owner = "client!gp", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method2733(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!gp", name = "f", descriptor = "(B)V")
	@Override
	public synchronized void method5197() {
		this.anInt3273 = this.anInt3289;
		this.anInt3268 = this.anInt3290;
		this.anInt3284 = this.anInt3288;
		@Pc(18) Class362 local18 = this.aClass362_16;
		this.aClass362_16 = this.aClass362_17;
		this.aClass362_17 = local18;
		this.aClass362_17.method8543();
	}

	@OriginalMember(owner = "client!gp", name = "e", descriptor = "(B)Z")
	@Override
	protected boolean method5195() {
		return (this.anInt3284 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!gp", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!gp", name = "c", descriptor = "(I)V")
	@Override
	public void method5194() {
		this.method2737();
	}

	@OriginalMember(owner = "client!gp", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method2733(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5189() {
		return (this.anInt3284 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!gp", name = "c", descriptor = "(B)I")
	@Override
	public int method5191() {
		return this.anInt3273;
	}
}
