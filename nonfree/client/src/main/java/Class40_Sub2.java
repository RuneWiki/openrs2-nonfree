import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kda")
public final class Class40_Sub2 extends Class40 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!kda", name = "f", descriptor = "I")
	private int anInt5383;

	@OriginalMember(owner = "client!kda", name = "q", descriptor = "I")
	private int anInt5393;

	@OriginalMember(owner = "client!kda", name = "D", descriptor = "I")
	private int anInt5404;

	@OriginalMember(owner = "client!kda", name = "H", descriptor = "I")
	private int anInt5407;

	@OriginalMember(owner = "client!kda", name = "L", descriptor = "I")
	private int anInt5411;

	@OriginalMember(owner = "client!kda", name = "N", descriptor = "I")
	private int anInt5412;

	@OriginalMember(owner = "client!kda", name = "O", descriptor = "Ljava/awt/Component;")
	private Component aComponent3;

	@OriginalMember(owner = "client!kda", name = "A", descriptor = "Lclient!nt;")
	private Class238 aClass238_30 = new Class238();

	@OriginalMember(owner = "client!kda", name = "M", descriptor = "Lclient!nt;")
	private Class238 aClass238_31 = new Class238();

	@OriginalMember(owner = "client!kda", name = "P", descriptor = "Z")
	private final boolean aBoolean413;

	@OriginalMember(owner = "client!kda", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class40_Sub2(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method4508(arg0);
		this.aBoolean413 = arg1;
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(Z)I")
	@Override
	public int method4499() {
		return this.anInt5404;
	}

	@OriginalMember(owner = "client!kda", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method4496() {
		return (this.anInt5393 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!kda", name = "d", descriptor = "(I)Lclient!lga;")
	@Override
	public Class2_Sub32 method4497() {
		return (Class2_Sub32) this.aClass238_30.method5832();
	}

	@OriginalMember(owner = "client!kda", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!kda", name = "d", descriptor = "(B)V")
	private void method4505() {
		if (this.aComponent3 == null) {
			return;
		}
		this.aComponent3.removeMouseMotionListener(this);
		this.aComponent3.removeMouseListener(this);
		this.anInt5407 = this.anInt5411 = this.anInt5412 = 0;
		this.aClass238_31 = null;
		this.aComponent3 = null;
		this.anInt5383 = this.anInt5404 = this.anInt5393 = 0;
		this.aClass238_30 = null;
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(B)V")
	@Override
	public void method4498() {
		this.method4505();
	}

	@OriginalMember(owner = "client!kda", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method4507(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!kda", name = "c", descriptor = "(B)Z")
	@Override
	protected boolean method4503() {
		return (this.anInt5393 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!kda", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method4509(arg0);
		if ((local8 & this.anInt5412) == 0) {
			local8 = this.anInt5412;
		}
		if ((local8 & 0x1) != 0) {
			this.method4510(arg0.getY(), arg0.getClickCount(), arg0.getX(), 3);
		}
		if ((local8 & 0x4) != 0) {
			this.method4510(arg0.getY(), arg0.getClickCount(), arg0.getX(), 5);
		}
		if ((local8 & 0x2) != 0) {
			this.method4510(arg0.getY(), arg0.getClickCount(), arg0.getX(), 4);
		}
		this.anInt5412 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(I)Z")
	@Override
	protected boolean method4494() {
		return (this.anInt5393 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!kda", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method4507(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(BII)V")
	private void method4507(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt5407 = arg0;
		this.anInt5411 = arg1;
		if (this.aBoolean413) {
			this.method4510(arg1, 0, arg0, -1);
		}
	}

	@OriginalMember(owner = "client!kda", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method4495() {
		this.anInt5383 = this.anInt5407;
		this.anInt5393 = this.anInt5412;
		this.anInt5404 = this.anInt5411;
		@Pc(18) Class238 local18 = this.aClass238_30;
		this.aClass238_30 = this.aClass238_31;
		this.aClass238_31 = local18;
		this.aClass238_31.method5841();
	}

	@OriginalMember(owner = "client!kda", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method4507(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!kda", name = "f", descriptor = "(I)I")
	@Override
	public int method4504() {
		return this.anInt5383;
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(BLjava/awt/Component;)V")
	private void method4508(@OriginalArg(1) Component arg0) {
		this.method4505();
		this.aComponent3 = arg0;
		this.aComponent3.addMouseListener(this);
		this.aComponent3.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!kda", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method4509(arg0);
		if (local10 == 1) {
			this.method4510(arg0.getY(), arg0.getClickCount(), arg0.getX(), 0);
		} else if (local10 == 4) {
			this.method4510(arg0.getY(), arg0.getClickCount(), arg0.getX(), 2);
		} else if (local10 == 2) {
			this.method4510(arg0.getY(), arg0.getClickCount(), arg0.getX(), 1);
		}
		this.anInt5412 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)I")
	private int method4509(@OriginalArg(0) MouseEvent arg0) {
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

	@OriginalMember(owner = "client!kda", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method4507(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(IIIII)V")
	private void method4510(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class2_Sub32_Sub2 local7 = new Class2_Sub32_Sub2();
		local7.anInt10238 = arg1;
		local7.anInt10245 = arg0;
		local7.anInt10249 = arg3;
		local7.anInt10241 = arg2;
		local7.aLong285 = Static438.method6517();
		this.aClass238_31.method5837(local7);
	}
}
