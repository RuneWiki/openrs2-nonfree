import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bn")
public final class Class29_Sub1 extends Class29 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!bn", name = "f", descriptor = "I")
	private int anInt469;

	@OriginalMember(owner = "client!bn", name = "y", descriptor = "I")
	private int anInt487;

	@OriginalMember(owner = "client!bn", name = "F", descriptor = "I")
	private int anInt492;

	@OriginalMember(owner = "client!bn", name = "H", descriptor = "I")
	private int anInt494;

	@OriginalMember(owner = "client!bn", name = "K", descriptor = "I")
	private int anInt496;

	@OriginalMember(owner = "client!bn", name = "L", descriptor = "I")
	private int anInt497;

	@OriginalMember(owner = "client!bn", name = "N", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!bn", name = "A", descriptor = "Lclient!aq;")
	private Class16 aClass16_7 = new Class16();

	@OriginalMember(owner = "client!bn", name = "J", descriptor = "Lclient!aq;")
	private Class16 aClass16_8 = new Class16();

	@OriginalMember(owner = "client!bn", name = "M", descriptor = "Z")
	private final boolean aBoolean31;

	static {
		new Class117("The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que você tentou acessar está cheio no momento.");
	}

	@OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class29_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method390(arg0);
		this.aBoolean31 = arg1;
	}

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "(Z)V")
	@Override
	public synchronized void method382() {
		this.anInt492 = this.anInt497;
		this.anInt469 = this.anInt496;
		this.anInt487 = this.anInt494;
		@Pc(18) Class16 local18 = this.aClass16_7;
		this.aClass16_7 = this.aClass16_8;
		this.aClass16_8 = local18;
		this.aClass16_8.method191();
	}

	@OriginalMember(owner = "client!bn", name = "c", descriptor = "(B)I")
	@Override
	public int method384() {
		return this.anInt487;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIII)V")
	private void method387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) Class11_Sub39_Sub1 local15 = new Class11_Sub39_Sub1();
		local15.anInt6593 = arg0;
		local15.anInt6583 = arg1;
		local15.anInt6588 = arg2;
		local15.aLong211 = Static268.method4627();
		this.aClass16_8.method190(local15);
	}

	@OriginalMember(owner = "client!bn", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method389(arg0);
	}

	@OriginalMember(owner = "client!bn", name = "c", descriptor = "(I)Z")
	@Override
	protected boolean method383() {
		return (this.anInt469 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!bn", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method389(arg0);
	}

	@OriginalMember(owner = "client!bn", name = "d", descriptor = "(B)Z")
	@Override
	protected boolean method385() {
		return (this.anInt469 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!bn", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.anInt494 = -1;
		this.anInt497 = -1;
	}

	@OriginalMember(owner = "client!bn", name = "e", descriptor = "(B)Lclient!um;")
	@Override
	public Class11_Sub39 method386() {
		return (Class11_Sub39) this.aClass16_7.method180();
	}

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "(B)I")
	@Override
	public int method381() {
		return this.anInt492;
	}

	@OriginalMember(owner = "client!bn", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method389(arg0);
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)V")
	private void method389(@OriginalArg(0) MouseEvent arg0) {
		this.anInt494 = arg0.getX();
		this.anInt497 = arg0.getY();
		if (this.aBoolean31) {
			this.method387(arg0.getY(), arg0.getX(), -1);
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
	private void method390(@OriginalArg(0) Component arg0) {
		this.method392();
		this.aComponent1 = arg0;
		this.aComponent1.addMouseListener(this);
		this.aComponent1.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!bn", name = "f", descriptor = "(B)V")
	private void method392() {
		if (this.aComponent1 == null) {
			return;
		}
		this.aComponent1.removeMouseListener(this);
		this.aComponent1.removeMouseMotionListener(this);
		this.aComponent1 = null;
		this.aClass16_7 = null;
		this.aClass16_8 = null;
		this.anInt494 = this.anInt497 = this.anInt496 = 0;
		this.anInt487 = this.anInt492 = this.anInt469 = 0;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)I")
	private int method393(@OriginalArg(1) MouseEvent arg0) {
		@Pc(6) int local6 = arg0.getModifiers();
		@Pc(17) boolean local17 = (local6 & 0x10) != 0;
		@Pc(25) boolean local25 = (local6 & 0x8) != 0;
		@Pc(36) boolean local36 = (local6 & 0x4) != 0;
		if (local25 && (local17 || local36)) {
			local25 = false;
		}
		if (local17 && local36) {
			return 4;
		} else if (local17) {
			return 1;
		} else if (local25) {
			return 2;
		} else if (local36) {
			return 4;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Z)V")
	@Override
	public void method377() {
		this.method392();
	}

	@OriginalMember(owner = "client!bn", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method393(arg0);
		if (local10 == 1) {
			this.method387(arg0.getY(), arg0.getX(), 0);
		} else if (local10 == 4) {
			this.method387(arg0.getY(), arg0.getX(), 2);
		} else if (local10 == 2) {
			this.method387(arg0.getY(), arg0.getX(), 1);
		}
		this.anInt496 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method379() {
		return (this.anInt469 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!bn", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!bn", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method393(arg0);
		if ((local8 & this.anInt496) == 0) {
			local8 = this.anInt496;
		}
		if ((local8 & 0x1) != 0) {
			this.method387(arg0.getY(), arg0.getX(), 3);
		}
		if ((local8 & 0x4) != 0) {
			this.method387(arg0.getY(), arg0.getX(), 5);
		}
		if ((local8 & 0x2) != 0) {
			this.method387(arg0.getY(), arg0.getX(), 4);
		}
		this.anInt496 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}
}
