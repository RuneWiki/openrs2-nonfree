import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oo")
public final class Class13_Sub1 extends Class13 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!oo", name = "m", descriptor = "I")
	private int anInt5119;

	@OriginalMember(owner = "client!oo", name = "s", descriptor = "I")
	private int anInt5125;

	@OriginalMember(owner = "client!oo", name = "u", descriptor = "I")
	private int anInt5127;

	@OriginalMember(owner = "client!oo", name = "H", descriptor = "I")
	private int anInt5138;

	@OriginalMember(owner = "client!oo", name = "I", descriptor = "I")
	private int anInt5139;

	@OriginalMember(owner = "client!oo", name = "K", descriptor = "I")
	private int anInt5140;

	@OriginalMember(owner = "client!oo", name = "L", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!oo", name = "G", descriptor = "Lclient!mf;")
	private Class163 aClass163_35 = new Class163();

	@OriginalMember(owner = "client!oo", name = "J", descriptor = "Lclient!mf;")
	private Class163 aClass163_36 = new Class163();

	@OriginalMember(owner = "client!oo", name = "M", descriptor = "Z")
	private final boolean aBoolean348;

	@OriginalMember(owner = "client!oo", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class13_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method4129(arg0);
		this.aBoolean348 = arg1;
	}

	@OriginalMember(owner = "client!oo", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method4126(arg0);
		if (local10 == 1) {
			this.method4128(arg0.getY(), arg0.getX(), 0);
		} else if (local10 == 4) {
			this.method4128(arg0.getY(), arg0.getX(), 2);
		} else if (local10 == 2) {
			this.method4128(arg0.getY(), arg0.getX(), 1);
		}
		this.anInt5140 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!oo", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method4132(arg0);
	}

	@OriginalMember(owner = "client!oo", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)I")
	private int method4126(@OriginalArg(1) MouseEvent arg0) {
		@Pc(6) int local6 = arg0.getModifiers();
		@Pc(17) boolean local17 = (local6 & 0x10) != 0;
		@Pc(28) boolean local28 = (local6 & 0x8) != 0;
		@Pc(45) boolean local45 = (local6 & 0x4) != 0;
		if (local28 && (local17 || local45)) {
			local28 = false;
		}
		if (local17 && local45) {
			return 4;
		} else if (local17) {
			return 1;
		} else if (local28) {
			return 2;
		} else if (local45) {
			return 4;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!oo", name = "f", descriptor = "(B)Z")
	@Override
	protected boolean method4124() {
		return (this.anInt5125 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!oo", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method4126(arg0);
		if ((this.anInt5140 & local8) == 0) {
			local8 = this.anInt5140;
		}
		if ((local8 & 0x1) != 0) {
			this.method4128(arg0.getY(), arg0.getX(), 3);
		}
		if ((local8 & 0x4) != 0) {
			this.method4128(arg0.getY(), arg0.getX(), 5);
		}
		if ((local8 & 0x2) != 0) {
			this.method4128(arg0.getY(), arg0.getX(), 4);
		}
		this.anInt5140 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(I)I")
	@Override
	public int method4116() {
		return this.anInt5119;
	}

	@OriginalMember(owner = "client!oo", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method4132(arg0);
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(IIZI)V")
	private void method4128(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class10_Sub16_Sub1 local7 = new Class10_Sub16_Sub1();
		local7.anInt2204 = arg1;
		local7.anInt2206 = arg2;
		local7.anInt2200 = arg0;
		local7.aLong78 = Static220.method3314();
		this.aClass163_36.method3613(local7);
	}

	@OriginalMember(owner = "client!oo", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method4132(arg0);
	}

	@OriginalMember(owner = "client!oo", name = "e", descriptor = "(B)Z")
	@Override
	protected boolean method4122() {
		return (this.anInt5125 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(BLjava/awt/Component;)V")
	private void method4129(@OriginalArg(1) Component arg0) {
		this.method4130();
		this.aComponent2 = arg0;
		this.aComponent2.addMouseListener(this);
		this.aComponent2.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method4115() {
		return (this.anInt5125 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!oo", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.anInt5139 = -1;
		this.anInt5138 = -1;
	}

	@OriginalMember(owner = "client!oo", name = "g", descriptor = "(B)V")
	private void method4130() {
		if (this.aComponent2 == null) {
			return;
		}
		this.aComponent2.removeMouseListener(this);
		this.aComponent2.removeMouseMotionListener(this);
		this.anInt5138 = this.anInt5139 = this.anInt5140 = 0;
		this.aComponent2 = null;
		this.aClass163_36 = null;
		this.anInt5119 = this.anInt5127 = this.anInt5125 = 0;
		this.aClass163_35 = null;
	}

	@OriginalMember(owner = "client!oo", name = "c", descriptor = "(B)V")
	@Override
	public void method4120() {
		this.method4130();
	}

	@OriginalMember(owner = "client!oo", name = "d", descriptor = "(I)I")
	@Override
	public int method4123() {
		return this.anInt5127;
	}

	@OriginalMember(owner = "client!oo", name = "d", descriptor = "(B)Lclient!qj;")
	@Override
	public Class10_Sub16 method4121() {
		return (Class10_Sub16) this.aClass163_35.method3622();
	}

	@OriginalMember(owner = "client!oo", name = "b", descriptor = "(B)V")
	@Override
	public synchronized void method4118() {
		this.anInt5127 = this.anInt5139;
		this.anInt5119 = this.anInt5138;
		this.anInt5125 = this.anInt5140;
		@Pc(18) Class163 local18 = this.aClass163_35;
		this.aClass163_35 = this.aClass163_36;
		this.aClass163_36 = local18;
		this.aClass163_36.method3619();
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(ZLjava/awt/event/MouseEvent;)V")
	private void method4132(@OriginalArg(1) MouseEvent arg0) {
		this.anInt5138 = arg0.getX();
		this.anInt5139 = arg0.getY();
		if (this.aBoolean348) {
			this.method4128(arg0.getY(), arg0.getX(), -1);
		}
	}
}
