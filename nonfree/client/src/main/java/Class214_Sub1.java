import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class214_Sub1 extends Class214 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
	private int anInt8374;

	@OriginalMember(owner = "client!ub", name = "h", descriptor = "I")
	private int anInt8378;

	@OriginalMember(owner = "client!ub", name = "x", descriptor = "I")
	private int anInt8392;

	@OriginalMember(owner = "client!ub", name = "D", descriptor = "I")
	private int anInt8398;

	@OriginalMember(owner = "client!ub", name = "F", descriptor = "I")
	private int anInt8399;

	@OriginalMember(owner = "client!ub", name = "G", descriptor = "I")
	private int anInt8400;

	@OriginalMember(owner = "client!ub", name = "I", descriptor = "Ljava/awt/Component;")
	private Component aComponent3;

	@OriginalMember(owner = "client!ub", name = "r", descriptor = "Lclient!fea;")
	private Class99 aClass99_72 = new Class99();

	@OriginalMember(owner = "client!ub", name = "E", descriptor = "Lclient!fea;")
	private Class99 aClass99_73 = new Class99();

	@OriginalMember(owner = "client!ub", name = "J", descriptor = "Z")
	private final boolean aBoolean603;

	static {
		new Class40("Unable to send message - player not on your friends list.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.");
	}

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class214_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method6762(arg0);
		this.aBoolean603 = arg1;
	}

	@OriginalMember(owner = "client!ub", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method6761(arg0);
		if (local10 == 1) {
			this.method6759(0, arg0.getY(), arg0.getX());
		} else if (local10 == 4) {
			this.method6759(2, arg0.getY(), arg0.getX());
		} else if (local10 == 2) {
			this.method6759(1, arg0.getY(), arg0.getX());
		}
		this.anInt8400 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)V")
	@Override
	public void method6768() {
		this.method6760();
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Z)Z")
	@Override
	protected boolean method6769() {
		return (this.anInt8374 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "(B)I")
	@Override
	public int method6770() {
		return this.anInt8392;
	}

	@OriginalMember(owner = "client!ub", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method6774() {
		return (this.anInt8374 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ub", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method6763(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)I")
	@Override
	public int method6766() {
		return this.anInt8378;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZIII)V")
	private void method6759(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class5_Sub42_Sub1 local7 = new Class5_Sub42_Sub1();
		local7.anInt8236 = arg0;
		local7.anInt8242 = arg1;
		local7.anInt8239 = arg2;
		local7.aLong227 = Static105.method2132();
		this.aClass99_73.method2513(local7);
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method6767() {
		this.anInt8392 = this.anInt8398;
		this.anInt8378 = this.anInt8399;
		this.anInt8374 = this.anInt8400;
		@Pc(18) Class99 local18 = this.aClass99_72;
		this.aClass99_72 = this.aClass99_73;
		this.aClass99_73 = local18;
		this.aClass99_73.method2524();
	}

	@OriginalMember(owner = "client!ub", name = "i", descriptor = "(I)V")
	private void method6760() {
		if (this.aComponent3 == null) {
			return;
		}
		this.aComponent3.removeMouseMotionListener(this);
		this.aComponent3.removeMouseListener(this);
		this.anInt8378 = this.anInt8392 = this.anInt8374 = 0;
		this.anInt8399 = this.anInt8398 = this.anInt8400 = 0;
		this.aClass99_72 = null;
		this.aClass99_73 = null;
		this.aComponent3 = null;
	}

	@OriginalMember(owner = "client!ub", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method6761(arg0);
		if ((this.anInt8400 & local8) == 0) {
			local8 = this.anInt8400;
		}
		if ((local8 & 0x1) != 0) {
			this.method6759(3, arg0.getY(), arg0.getX());
		}
		if ((local8 & 0x4) != 0) {
			this.method6759(5, arg0.getY(), arg0.getX());
		}
		if ((local8 & 0x2) != 0) {
			this.method6759(4, arg0.getY(), arg0.getX());
		}
		this.anInt8400 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ub", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method6763(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;B)I")
	private int method6761(@OriginalArg(0) MouseEvent arg0) {
		@Pc(6) int local6 = arg0.getModifiers();
		@Pc(17) boolean local17 = (local6 & 0x10) != 0;
		@Pc(28) boolean local28 = (local6 & 0x8) != 0;
		@Pc(44) boolean local44 = (local6 & 0x4) != 0;
		if (local28 && (local17 || local44)) {
			local28 = false;
		}
		if (local17 && local44) {
			return 4;
		} else if (local17) {
			return 1;
		} else if (local28) {
			return 2;
		} else if (local44) {
			return 4;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ub", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method6763(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(BLjava/awt/Component;)V")
	private void method6762(@OriginalArg(1) Component arg0) {
		this.method6760();
		this.aComponent3 = arg0;
		this.aComponent3.addMouseListener(this);
		this.aComponent3.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!ub", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method6763(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "(I)Lclient!sda;")
	@Override
	public Class5_Sub42 method6773() {
		return (Class5_Sub42) this.aClass99_72.method2516();
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)Z")
	@Override
	protected boolean method6765() {
		return (this.anInt8374 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIB)V")
	private void method6763(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt8399 = arg0;
		this.anInt8398 = arg1;
		if (this.aBoolean603) {
			this.method6759(-1, arg1, arg0);
		}
	}
}
