import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afa")
public final class Class11_Sub1 extends Class11 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!afa", name = "q", descriptor = "I")
	private int anInt159;

	@OriginalMember(owner = "client!afa", name = "r", descriptor = "I")
	private int anInt160;

	@OriginalMember(owner = "client!afa", name = "s", descriptor = "I")
	private int anInt161;

	@OriginalMember(owner = "client!afa", name = "F", descriptor = "I")
	private int anInt173;

	@OriginalMember(owner = "client!afa", name = "N", descriptor = "I")
	private int anInt179;

	@OriginalMember(owner = "client!afa", name = "O", descriptor = "I")
	private int anInt180;

	@OriginalMember(owner = "client!afa", name = "Q", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!afa", name = "w", descriptor = "Lclient!fca;")
	private Class114 aClass114_1 = new Class114();

	@OriginalMember(owner = "client!afa", name = "J", descriptor = "Lclient!fca;")
	private Class114 aClass114_2 = new Class114();

	@OriginalMember(owner = "client!afa", name = "P", descriptor = "Z")
	private final boolean aBoolean12;

	@OriginalMember(owner = "client!afa", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class11_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method152(arg0);
		this.aBoolean12 = arg1;
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(I)V")
	@Override
	public void method6138() {
		this.method151();
	}

	@OriginalMember(owner = "client!afa", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method147(arg0);
		if ((local8 & this.anInt173) == 0) {
			local8 = this.anInt173;
		}
		if ((local8 & 0x1) != 0) {
			this.method150(arg0.getClickCount(), arg0.getY(), arg0.getX(), 3);
		}
		if ((local8 & 0x4) != 0) {
			this.method150(arg0.getClickCount(), arg0.getY(), arg0.getX(), 5);
		}
		if ((local8 & 0x2) != 0) {
			this.method150(arg0.getClickCount(), arg0.getY(), arg0.getX(), 4);
		}
		this.anInt173 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(ZII)V")
	private void method145(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt180 = arg0;
		this.anInt179 = arg1;
		if (this.aBoolean12) {
			this.method150(0, arg0, arg1, -1);
		}
	}

	@OriginalMember(owner = "client!afa", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method147(arg0);
		if (local10 == 1) {
			this.method150(arg0.getClickCount(), arg0.getY(), arg0.getX(), 0);
		} else if (local10 == 4) {
			this.method150(arg0.getClickCount(), arg0.getY(), arg0.getX(), 2);
		} else if (local10 == 2) {
			this.method150(arg0.getClickCount(), arg0.getY(), arg0.getX(), 1);
		}
		this.anInt173 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!afa", name = "e", descriptor = "(I)I")
	@Override
	public int method6144() {
		return this.anInt161;
	}

	@OriginalMember(owner = "client!afa", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method145(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!afa", name = "d", descriptor = "(I)I")
	@Override
	public int method6141() {
		return this.anInt159;
	}

	@OriginalMember(owner = "client!afa", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method145(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;B)I")
	private int method147(@OriginalArg(0) MouseEvent arg0) {
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

	@OriginalMember(owner = "client!afa", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method145(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!afa", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method6146() {
		return (this.anInt160 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!afa", name = "b", descriptor = "(I)Z")
	@Override
	protected boolean method6139() {
		return (this.anInt160 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!afa", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(IIIBI)V")
	private void method150(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class5_Sub7_Sub2 local7 = new Class5_Sub7_Sub2();
		local7.anInt10471 = arg2;
		local7.anInt10478 = arg0;
		local7.anInt10479 = arg1;
		local7.anInt10476 = arg3;
		local7.aLong299 = Static547.method7619();
		this.aClass114_2.method2807(local7);
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(B)Lclient!vt;")
	@Override
	public Class5_Sub7 method6142() {
		return (Class5_Sub7) this.aClass114_1.method2813();
	}

	@OriginalMember(owner = "client!afa", name = "f", descriptor = "(I)Z")
	@Override
	protected boolean method6145() {
		return (this.anInt160 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(Z)V")
	private void method151() {
		if (this.aComponent1 == null) {
			return;
		}
		this.aComponent1.removeMouseMotionListener(this);
		this.aComponent1.removeMouseListener(this);
		this.aComponent1 = null;
		this.aClass114_2 = null;
		this.aClass114_1 = null;
		this.anInt159 = this.anInt161 = this.anInt160 = 0;
		this.anInt179 = this.anInt180 = this.anInt173 = 0;
	}

	@OriginalMember(owner = "client!afa", name = "b", descriptor = "(B)V")
	@Override
	public synchronized void method6143() {
		this.anInt161 = this.anInt180;
		this.anInt159 = this.anInt179;
		this.anInt160 = this.anInt173;
		@Pc(18) Class114 local18 = this.aClass114_1;
		this.aClass114_1 = this.aClass114_2;
		this.aClass114_2 = local18;
		this.aClass114_2.method2808();
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	private void method152(@OriginalArg(0) Component arg0) {
		this.method151();
		this.aComponent1 = arg0;
		this.aComponent1.addMouseListener(this);
		this.aComponent1.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!afa", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method145(arg0.getY(), arg0.getX());
	}
}
