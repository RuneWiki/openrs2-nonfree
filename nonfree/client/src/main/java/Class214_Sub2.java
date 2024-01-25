import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!um")
public final class Class214_Sub2 extends Class214 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!um", name = "r", descriptor = "I")
	private int anInt8633;

	@OriginalMember(owner = "client!um", name = "v", descriptor = "I")
	private int anInt8637;

	@OriginalMember(owner = "client!um", name = "D", descriptor = "I")
	private int anInt8645;

	@OriginalMember(owner = "client!um", name = "F", descriptor = "I")
	private int anInt8647;

	@OriginalMember(owner = "client!um", name = "H", descriptor = "I")
	private int anInt8648;

	@OriginalMember(owner = "client!um", name = "I", descriptor = "I")
	private int anInt8649;

	@OriginalMember(owner = "client!um", name = "J", descriptor = "Ljava/awt/Component;")
	private Component aComponent4;

	@OriginalMember(owner = "client!um", name = "k", descriptor = "Lclient!rk;")
	private Class249 aClass249_67 = new Class249();

	@OriginalMember(owner = "client!um", name = "G", descriptor = "Lclient!rk;")
	private Class249 aClass249_68 = new Class249();

	@OriginalMember(owner = "client!um", name = "N", descriptor = "Z")
	private final boolean aBoolean622;

	static {
		new Class202("Error sending message to clan chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es später erneut.", "Erreur lors de l'envoi du message au canal de clan - veuillez réessayer ultérieurement.", "Erro ao enviar mensagem ao canal de clã. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class214_Sub2(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method7251(arg0);
		this.aBoolean622 = arg1;
	}

	@OriginalMember(owner = "client!um", name = "d", descriptor = "(B)Lclient!wi;")
	@Override
	public Class2_Sub26 method7242() {
		return (Class2_Sub26) this.aClass249_67.method6529();
	}

	@OriginalMember(owner = "client!um", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method7252(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!um", name = "c", descriptor = "(B)I")
	@Override
	public int method7240() {
		return this.anInt8633;
	}

	@OriginalMember(owner = "client!um", name = "e", descriptor = "(I)Z")
	@Override
	protected boolean method7249() {
		return (this.anInt8637 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!um", name = "c", descriptor = "(I)I")
	@Override
	public int method7241() {
		return this.anInt8645;
	}

	@OriginalMember(owner = "client!um", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method7252(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	private void method7251(@OriginalArg(0) Component arg0) {
		this.method7256();
		this.aComponent4 = arg0;
		this.aComponent4.addMouseListener(this);
		this.aComponent4.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!um", name = "g", descriptor = "(B)V")
	@Override
	public void method7247() {
		this.method7256();
	}

	@OriginalMember(owner = "client!um", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method7252(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(B)Z")
	@Override
	protected boolean method7237() {
		return (this.anInt8637 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(III)V")
	private void method7252(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt8648 = arg0;
		this.anInt8647 = arg1;
		if (this.aBoolean622) {
			this.method7253(arg1, -1, arg0);
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(BIII)V")
	private void method7253(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class2_Sub26_Sub1 local7 = new Class2_Sub26_Sub1();
		local7.anInt3451 = arg0;
		local7.anInt3455 = arg2;
		local7.anInt3452 = arg1;
		local7.aLong96 = Static143.method2502();
		this.aClass249_68.method6523(local7);
	}

	@OriginalMember(owner = "client!um", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method7245() {
		this.anInt8645 = this.anInt8648;
		this.anInt8637 = this.anInt8649;
		this.anInt8633 = this.anInt8647;
		@Pc(26) Class249 local26 = this.aClass249_67;
		this.aClass249_67 = this.aClass249_68;
		this.aClass249_68 = local26;
		this.aClass249_68.method6530();
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;B)I")
	private int method7254(@OriginalArg(0) MouseEvent arg0) {
		@Pc(6) int local6 = arg0.getModifiers();
		@Pc(20) boolean local20 = (local6 & 0x10) != 0;
		@Pc(28) boolean local28 = (local6 & 0x8) != 0;
		@Pc(39) boolean local39 = (local6 & 0x4) != 0;
		if (local28 && (local20 || local39)) {
			local28 = false;
		}
		if (local20 && local39) {
			return 4;
		} else if (local20) {
			return 1;
		} else if (local28) {
			return 2;
		} else if (local39) {
			return 4;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!um", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method7254(arg0);
		if ((this.anInt8649 & local8) == 0) {
			local8 = this.anInt8649;
		}
		if ((local8 & 0x1) != 0) {
			this.method7253(arg0.getY(), 3, arg0.getX());
		}
		if ((local8 & 0x4) != 0) {
			this.method7253(arg0.getY(), 5, arg0.getX());
		}
		if ((local8 & 0x2) != 0) {
			this.method7253(arg0.getY(), 4, arg0.getX());
		}
		this.anInt8649 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!um", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!um", name = "i", descriptor = "(B)V")
	private void method7256() {
		if (this.aComponent4 == null) {
			return;
		}
		this.aComponent4.removeMouseMotionListener(this);
		this.aComponent4.removeMouseListener(this);
		this.anInt8645 = this.anInt8633 = this.anInt8637 = 0;
		this.anInt8648 = this.anInt8647 = this.anInt8649 = 0;
		this.aClass249_67 = null;
		this.aClass249_68 = null;
		this.aComponent4 = null;
	}

	@OriginalMember(owner = "client!um", name = "f", descriptor = "(B)Z")
	@Override
	public boolean method7244() {
		return (this.anInt8637 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!um", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method7254(arg0);
		if (local10 == 1) {
			this.method7253(arg0.getY(), 0, arg0.getX());
		} else if (local10 == 4) {
			this.method7253(arg0.getY(), 2, arg0.getX());
		} else if (local10 == 2) {
			this.method7253(arg0.getY(), 1, arg0.getX());
		}
		this.anInt8649 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!um", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method7252(arg0.getX(), arg0.getY());
	}
}
