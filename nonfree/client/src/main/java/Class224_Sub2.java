import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wa")
public final class Class224_Sub2 extends Class224 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!wa", name = "v", descriptor = "I")
	private int anInt6997;

	@OriginalMember(owner = "client!wa", name = "D", descriptor = "I")
	private int anInt7004;

	@OriginalMember(owner = "client!wa", name = "H", descriptor = "I")
	private int anInt7008;

	@OriginalMember(owner = "client!wa", name = "K", descriptor = "I")
	private int anInt7011;

	@OriginalMember(owner = "client!wa", name = "O", descriptor = "I")
	private int anInt7013;

	@OriginalMember(owner = "client!wa", name = "P", descriptor = "I")
	private int anInt7014;

	@OriginalMember(owner = "client!wa", name = "R", descriptor = "Ljava/awt/Component;")
	private Component aComponent4;

	@OriginalMember(owner = "client!wa", name = "j", descriptor = "Lclient!am;")
	private Class14 aClass14_49 = new Class14();

	@OriginalMember(owner = "client!wa", name = "N", descriptor = "Lclient!am;")
	private Class14 aClass14_50 = new Class14();

	@OriginalMember(owner = "client!wa", name = "T", descriptor = "Z")
	private final boolean aBoolean610;

	@OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class224_Sub2(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method5624(arg0);
		this.aBoolean610 = arg1;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	private void method5624(@OriginalArg(0) Component arg0) {
		this.method5631();
		this.aComponent4 = arg0;
		this.aComponent4.addMouseListener(this);
		this.aComponent4.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)I")
	private int method5625(@OriginalArg(1) MouseEvent arg0) {
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

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(B)Z")
	@Override
	protected boolean method5618() {
		return (this.anInt7008 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!wa", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method5625(arg0);
		if (local10 == 1) {
			this.method5633(0, arg0.getX(), arg0.getY());
		} else if (local10 == 4) {
			this.method5633(2, arg0.getX(), arg0.getY());
		} else if (local10 == 2) {
			this.method5633(1, arg0.getX(), arg0.getY());
		}
		this.anInt7014 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!wa", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!wa", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method5628(arg0);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Z)I")
	@Override
	public int method5613() {
		return this.anInt7004;
	}

	@OriginalMember(owner = "client!wa", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method5628(arg0);
	}

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "(I)Lclient!ke;")
	@Override
	public Class1_Sub22 method5617() {
		return (Class1_Sub22) this.aClass14_49.method202();
	}

	@OriginalMember(owner = "client!wa", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method5628(arg0);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)V")
	private void method5628(@OriginalArg(0) MouseEvent arg0) {
		this.anInt7011 = arg0.getX();
		this.anInt7013 = arg0.getY();
		if (this.aBoolean610) {
			this.method5633(-1, arg0.getX(), arg0.getY());
		}
	}

	@OriginalMember(owner = "client!wa", name = "f", descriptor = "(I)V")
	private void method5631() {
		if (this.aComponent4 == null) {
			return;
		}
		this.aComponent4.removeMouseMotionListener(this);
		this.aComponent4.removeMouseListener(this);
		this.anInt7011 = this.anInt7013 = this.anInt7014 = 0;
		this.anInt7004 = this.anInt6997 = this.anInt7008 = 0;
		this.aClass14_50 = null;
		this.aClass14_49 = null;
		this.aComponent4 = null;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)V")
	@Override
	public void method5614() {
		this.method5631();
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)I")
	@Override
	public int method5615() {
		return this.anInt6997;
	}

	@OriginalMember(owner = "client!wa", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method5625(arg0);
		if ((local8 & this.anInt7014) == 0) {
			local8 = this.anInt7014;
		}
		if ((local8 & 0x1) != 0) {
			this.method5633(3, arg0.getX(), arg0.getY());
		}
		if ((local8 & 0x4) != 0) {
			this.method5633(5, arg0.getX(), arg0.getY());
		}
		if ((local8 & 0x2) != 0) {
			this.method5633(4, arg0.getX(), arg0.getY());
		}
		this.anInt7014 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method5619() {
		this.anInt7004 = this.anInt7011;
		this.anInt7008 = this.anInt7014;
		this.anInt6997 = this.anInt7013;
		@Pc(18) Class14 local18 = this.aClass14_49;
		this.aClass14_49 = this.aClass14_50;
		this.aClass14_50 = local18;
		this.aClass14_50.method204();
	}

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "(B)Z")
	@Override
	protected boolean method5622() {
		return (this.anInt7008 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIBI)V")
	private void method5633(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class1_Sub22_Sub1 local7 = new Class1_Sub22_Sub1();
		local7.anInt2821 = arg1;
		local7.anInt2820 = arg0;
		local7.anInt2822 = arg2;
		local7.aLong96 = Static183.method2674();
		this.aClass14_50.method205(local7);
	}

	@OriginalMember(owner = "client!wa", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.anInt7013 = -1;
		this.anInt7011 = -1;
	}

	@OriginalMember(owner = "client!wa", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5620() {
		return (this.anInt7008 & 0x1) != 0;
	}
}
