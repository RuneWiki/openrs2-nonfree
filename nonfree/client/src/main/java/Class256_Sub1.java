import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pi")
public final class Class256_Sub1 extends Class256 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!pi", name = "y", descriptor = "I")
	private int anInt6990;

	@OriginalMember(owner = "client!pi", name = "C", descriptor = "I")
	private int anInt6993;

	@OriginalMember(owner = "client!pi", name = "E", descriptor = "I")
	private int anInt6995;

	@OriginalMember(owner = "client!pi", name = "F", descriptor = "I")
	private int anInt6996;

	@OriginalMember(owner = "client!pi", name = "J", descriptor = "I")
	private int anInt6999;

	@OriginalMember(owner = "client!pi", name = "M", descriptor = "I")
	private int anInt7002;

	@OriginalMember(owner = "client!pi", name = "N", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!pi", name = "B", descriptor = "Lclient!wo;")
	private Class361 aClass361_72 = new Class361();

	@OriginalMember(owner = "client!pi", name = "H", descriptor = "Lclient!wo;")
	private Class361 aClass361_73 = new Class361();

	@OriginalMember(owner = "client!pi", name = "O", descriptor = "Z")
	private final boolean aBoolean504;

	@OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class256_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method5759(arg0);
		this.aBoolean504 = arg1;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIZI)V")
	private void method5752(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class1_Sub13_Sub1 local7 = new Class1_Sub13_Sub1();
		local7.anInt2474 = arg0;
		local7.anInt2477 = arg3;
		local7.anInt2475 = arg2;
		local7.anInt2470 = arg1;
		local7.aLong113 = Static255.method4035();
		this.aClass361_73.method7855(local7);
	}

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "(I)I")
	@Override
	public int method7558() {
		return this.anInt6995;
	}

	@OriginalMember(owner = "client!pi", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method5758(arg0);
		if (local10 == 1) {
			this.method5752(arg0.getClickCount(), arg0.getX(), 0, arg0.getY());
		} else if (local10 == 4) {
			this.method5752(arg0.getClickCount(), arg0.getX(), 2, arg0.getY());
		} else if (local10 == 2) {
			this.method5752(arg0.getClickCount(), arg0.getX(), 1, arg0.getY());
		}
		this.anInt6999 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "(B)I")
	@Override
	public int method7561() {
		return this.anInt6990;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(BII)V")
	private void method5756(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt6996 = arg1;
		this.anInt7002 = arg0;
		if (this.aBoolean504) {
			this.method5752(0, arg0, -1, arg1);
		}
	}

	@OriginalMember(owner = "client!pi", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method7562() {
		return (this.anInt6993 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!pi", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method5756(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!pi", name = "e", descriptor = "(I)V")
	@Override
	public void method7563() {
		this.method5760();
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)I")
	private int method5758(@OriginalArg(1) MouseEvent arg0) {
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

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method7556() {
		this.anInt6990 = this.anInt6996;
		this.anInt6993 = this.anInt6999;
		this.anInt6995 = this.anInt7002;
		@Pc(18) Class361 local18 = this.aClass361_72;
		this.aClass361_72 = this.aClass361_73;
		this.aClass361_73 = local18;
		this.aClass361_73.method7860();
	}

	@OriginalMember(owner = "client!pi", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!pi", name = "d", descriptor = "(I)Z")
	@Override
	protected boolean method7559() {
		return (this.anInt6993 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!pi", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method5756(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!pi", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method5758(arg0);
		if ((this.anInt6999 & local8) == 0) {
			local8 = this.anInt6999;
		}
		if ((local8 & 0x1) != 0) {
			this.method5752(arg0.getClickCount(), arg0.getX(), 3, arg0.getY());
		}
		if ((local8 & 0x4) != 0) {
			this.method5752(arg0.getClickCount(), arg0.getX(), 5, arg0.getY());
		}
		if ((local8 & 0x2) != 0) {
			this.method5752(arg0.getClickCount(), arg0.getX(), 4, arg0.getY());
		}
		this.anInt6999 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!pi", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method5756(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!pi", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method5756(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	private void method5759(@OriginalArg(0) Component arg0) {
		this.method5760();
		this.aComponent2 = arg0;
		this.aComponent2.addMouseListener(this);
		this.aComponent2.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!pi", name = "g", descriptor = "(I)V")
	private void method5760() {
		if (this.aComponent2 == null) {
			return;
		}
		this.aComponent2.removeMouseMotionListener(this);
		this.aComponent2.removeMouseListener(this);
		this.anInt6995 = this.anInt6990 = this.anInt6993 = 0;
		this.aComponent2 = null;
		this.aClass361_72 = null;
		this.aClass361_73 = null;
		this.anInt7002 = this.anInt6996 = this.anInt6999 = 0;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(B)Z")
	@Override
	protected boolean method7555() {
		return (this.anInt6993 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Z)Lclient!ll;")
	@Override
	public Class1_Sub13 method7554() {
		return (Class1_Sub13) this.aClass361_72.method7850();
	}
}
