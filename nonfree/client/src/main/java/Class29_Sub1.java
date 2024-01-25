import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class29_Sub1 extends Class29 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!be", name = "m", descriptor = "I")
	private int anInt684;

	@OriginalMember(owner = "client!be", name = "u", descriptor = "I")
	private int anInt692;

	@OriginalMember(owner = "client!be", name = "B", descriptor = "I")
	private int anInt697;

	@OriginalMember(owner = "client!be", name = "I", descriptor = "I")
	private int anInt704;

	@OriginalMember(owner = "client!be", name = "J", descriptor = "I")
	private int anInt705;

	@OriginalMember(owner = "client!be", name = "K", descriptor = "I")
	private int anInt706;

	@OriginalMember(owner = "client!be", name = "N", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!be", name = "A", descriptor = "Lclient!su;")
	private Class298 aClass298_18 = new Class298();

	@OriginalMember(owner = "client!be", name = "L", descriptor = "Lclient!su;")
	private Class298 aClass298_19 = new Class298();

	@OriginalMember(owner = "client!be", name = "M", descriptor = "Z")
	private final boolean aBoolean46;

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class29_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method608(arg0);
		this.aBoolean46 = arg1;
	}

	@OriginalMember(owner = "client!be", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!be", name = "c", descriptor = "(I)Z")
	@Override
	protected boolean method2947() {
		return (this.anInt684 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!be", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method612(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!be", name = "d", descriptor = "(I)Lclient!qea;")
	@Override
	public Class6_Sub41 method2948() {
		return (Class6_Sub41) this.aClass298_18.method6811();
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method2941() {
		return (this.anInt684 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!be", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method613(arg0);
		if ((local8 & this.anInt704) == 0) {
			local8 = this.anInt704;
		}
		if ((local8 & 0x1) != 0) {
			this.method611(arg0.getY(), arg0.getX(), 3);
		}
		if ((local8 & 0x4) != 0) {
			this.method611(arg0.getY(), arg0.getX(), 5);
		}
		if ((local8 & 0x2) != 0) {
			this.method611(arg0.getY(), arg0.getX(), 4);
		}
		this.anInt704 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!be", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method612(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!be", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method613(arg0);
		if (local10 == 1) {
			this.method611(arg0.getY(), arg0.getX(), 0);
		} else if (local10 == 4) {
			this.method611(arg0.getY(), arg0.getX(), 2);
		} else if (local10 == 2) {
			this.method611(arg0.getY(), arg0.getX(), 1);
		}
		this.anInt704 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(I)I")
	@Override
	public int method2942() {
		return this.anInt692;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(BLjava/awt/Component;)V")
	private void method608(@OriginalArg(1) Component arg0) {
		this.method610();
		this.aComponent1 = arg0;
		this.aComponent1.addMouseListener(this);
		this.aComponent1.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!be", name = "d", descriptor = "(B)I")
	@Override
	public int method2946() {
		return this.anInt697;
	}

	@OriginalMember(owner = "client!be", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method612(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(B)Z")
	@Override
	protected boolean method2939() {
		return (this.anInt684 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!be", name = "g", descriptor = "(B)V")
	private void method610() {
		if (this.aComponent1 == null) {
			return;
		}
		this.aComponent1.removeMouseMotionListener(this);
		this.aComponent1.removeMouseListener(this);
		this.aClass298_18 = null;
		this.aClass298_19 = null;
		this.aComponent1 = null;
		this.anInt697 = this.anInt692 = this.anInt684 = 0;
		this.anInt705 = this.anInt706 = this.anInt704 = 0;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method2938() {
		this.anInt684 = this.anInt704;
		this.anInt697 = this.anInt705;
		this.anInt692 = this.anInt706;
		@Pc(26) Class298 local26 = this.aClass298_18;
		this.aClass298_18 = this.aClass298_19;
		this.aClass298_19 = local26;
		this.aClass298_19.method6808();
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(BIII)V")
	private void method611(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class6_Sub41_Sub2 local11 = new Class6_Sub41_Sub2();
		local11.anInt8179 = arg0;
		local11.anInt8178 = arg1;
		local11.anInt8180 = arg2;
		local11.aLong204 = Static416.method5922();
		this.aClass298_19.method6812(local11);
	}

	@OriginalMember(owner = "client!be", name = "e", descriptor = "(B)V")
	@Override
	public void method2949() {
		this.method610();
	}

	@OriginalMember(owner = "client!be", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method612(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(III)V")
	private void method612(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt706 = arg1;
		this.anInt705 = arg0;
		if (this.aBoolean46) {
			this.method611(arg1, arg0, -1);
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)I")
	private int method613(@OriginalArg(0) MouseEvent arg0) {
		@Pc(6) int local6 = arg0.getModifiers();
		@Pc(14) boolean local14 = (local6 & 0x10) != 0;
		@Pc(22) boolean local22 = (local6 & 0x8) != 0;
		@Pc(30) boolean local30 = (local6 & 0x4) != 0;
		if (local22 && (local14 || local30)) {
			local22 = false;
		}
		if (local14 && local30) {
			return 4;
		} else if (local14) {
			return 1;
		} else if (local22) {
			return 2;
		} else if (local30) {
			return 4;
		} else {
			return 0;
		}
	}
}
