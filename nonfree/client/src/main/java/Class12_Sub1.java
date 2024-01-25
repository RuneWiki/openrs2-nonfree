import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pl")
public final class Class12_Sub1 extends Class12 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!pl", name = "A", descriptor = "I")
	private int anInt5495;

	@OriginalMember(owner = "client!pl", name = "E", descriptor = "I")
	private int anInt5498;

	@OriginalMember(owner = "client!pl", name = "H", descriptor = "I")
	private int anInt5501;

	@OriginalMember(owner = "client!pl", name = "K", descriptor = "I")
	private int anInt5503;

	@OriginalMember(owner = "client!pl", name = "L", descriptor = "I")
	private int anInt5504;

	@OriginalMember(owner = "client!pl", name = "N", descriptor = "I")
	private int anInt5506;

	@OriginalMember(owner = "client!pl", name = "O", descriptor = "Ljava/awt/Component;")
	private Component aComponent3;

	@OriginalMember(owner = "client!pl", name = "x", descriptor = "Lclient!vr;")
	private Class258 aClass258_35 = new Class258();

	@OriginalMember(owner = "client!pl", name = "J", descriptor = "Lclient!vr;")
	private Class258 aClass258_36 = new Class258();

	@OriginalMember(owner = "client!pl", name = "P", descriptor = "Z")
	private final boolean aBoolean370;

	@OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class12_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method4225(arg0);
		this.aBoolean370 = arg1;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method4210() {
		return (this.anInt5501 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!pl", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.anInt5506 = -1;
		this.anInt5503 = -1;
	}

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "(I)V")
	@Override
	public void method4212() {
		this.method4224();
	}

	@OriginalMember(owner = "client!pl", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method4223(arg0);
	}

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "(I)Z")
	@Override
	protected boolean method4214() {
		return (this.anInt5501 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(ZLjava/awt/event/MouseEvent;)I")
	private int method4222(@OriginalArg(1) MouseEvent arg0) {
		@Pc(11) int local11 = arg0.getModifiers();
		@Pc(22) boolean local22 = (local11 & 0x10) != 0;
		@Pc(30) boolean local30 = (local11 & 0x8) != 0;
		@Pc(41) boolean local41 = (local11 & 0x4) != 0;
		if (local30 && (local22 || local41)) {
			local30 = false;
		}
		if (local22 && local41) {
			return 4;
		} else if (local22) {
			return 1;
		} else if (local30) {
			return 2;
		} else if (local41) {
			return 4;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "(Z)I")
	@Override
	public int method4219() {
		return this.anInt5498;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(BLjava/awt/event/MouseEvent;)V")
	private void method4223(@OriginalArg(1) MouseEvent arg0) {
		this.anInt5503 = arg0.getX();
		this.anInt5506 = arg0.getY();
		if (this.aBoolean370) {
			this.method4226(-1, arg0.getY(), arg0.getX());
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(B)Z")
	@Override
	protected boolean method4211() {
		return (this.anInt5501 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!pl", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method4222(arg0);
		if ((local8 & this.anInt5504) == 0) {
			local8 = this.anInt5504;
		}
		if ((local8 & 0x1) != 0) {
			this.method4226(3, arg0.getY(), arg0.getX());
		}
		if ((local8 & 0x4) != 0) {
			this.method4226(5, arg0.getY(), arg0.getX());
		}
		if ((local8 & 0x2) != 0) {
			this.method4226(4, arg0.getY(), arg0.getX());
		}
		this.anInt5504 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!pl", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method4223(arg0);
	}

	@OriginalMember(owner = "client!pl", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method4222(arg0);
		if (local10 == 1) {
			this.method4226(0, arg0.getY(), arg0.getX());
		} else if (local10 == 4) {
			this.method4226(2, arg0.getY(), arg0.getX());
		} else if (local10 == 2) {
			this.method4226(1, arg0.getY(), arg0.getX());
		}
		this.anInt5504 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "(B)V")
	private void method4224() {
		if (this.aComponent3 == null) {
			return;
		}
		this.aComponent3.removeMouseListener(this);
		this.aComponent3.removeMouseMotionListener(this);
		this.aClass258_36 = null;
		this.aClass258_35 = null;
		this.aComponent3 = null;
		this.anInt5495 = this.anInt5498 = this.anInt5501 = 0;
		this.anInt5503 = this.anInt5506 = this.anInt5504 = 0;
	}

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "(Z)I")
	@Override
	public int method4220() {
		return this.anInt5495;
	}

	@OriginalMember(owner = "client!pl", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method4223(arg0);
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
	private void method4225(@OriginalArg(0) Component arg0) {
		this.method4224();
		this.aComponent3 = arg0;
		this.aComponent3.addMouseListener(this);
		this.aComponent3.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!pl", name = "d", descriptor = "(I)Lclient!uj;")
	@Override
	public Class4_Sub10 method4216() {
		return (Class4_Sub10) this.aClass258_35.method5530();
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIII)V")
	private void method4226(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class4_Sub10_Sub1 local7 = new Class4_Sub10_Sub1();
		local7.anInt2221 = arg0;
		local7.anInt2230 = arg2;
		local7.anInt2223 = arg1;
		local7.aLong46 = Static199.method2845();
		this.aClass258_36.method5526(local7);
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method4209() {
		this.anInt5501 = this.anInt5504;
		this.anInt5498 = this.anInt5506;
		this.anInt5495 = this.anInt5503;
		@Pc(22) Class258 local22 = this.aClass258_35;
		this.aClass258_35 = this.aClass258_36;
		this.aClass258_36 = local22;
		this.aClass258_36.method5527();
	}

	@OriginalMember(owner = "client!pl", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}
}
