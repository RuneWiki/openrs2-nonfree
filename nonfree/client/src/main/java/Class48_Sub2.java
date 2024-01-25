import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tea")
public final class Class48_Sub2 extends Class48 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!tea", name = "q", descriptor = "I")
	private int anInt9237;

	@OriginalMember(owner = "client!tea", name = "t", descriptor = "I")
	private int anInt9240;

	@OriginalMember(owner = "client!tea", name = "z", descriptor = "I")
	private int anInt9246;

	@OriginalMember(owner = "client!tea", name = "D", descriptor = "I")
	private int anInt9250;

	@OriginalMember(owner = "client!tea", name = "F", descriptor = "I")
	private int anInt9251;

	@OriginalMember(owner = "client!tea", name = "H", descriptor = "I")
	private int anInt9252;

	@OriginalMember(owner = "client!tea", name = "K", descriptor = "Ljava/awt/Component;")
	private Component aComponent3;

	@OriginalMember(owner = "client!tea", name = "h", descriptor = "Lclient!qw;")
	private Class302 aClass302_65 = new Class302();

	@OriginalMember(owner = "client!tea", name = "G", descriptor = "Lclient!qw;")
	private Class302 aClass302_66 = new Class302();

	@OriginalMember(owner = "client!tea", name = "I", descriptor = "Z")
	private final boolean aBoolean644;

	@OriginalMember(owner = "client!tea", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class48_Sub2(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method7520(arg0);
		this.aBoolean644 = arg1;
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(I)I")
	@Override
	public int method7512() {
		return this.anInt9246;
	}

	@OriginalMember(owner = "client!tea", name = "b", descriptor = "(I)Lclient!taa;")
	@Override
	public Class3_Sub6 method7513() {
		return (Class3_Sub6) this.aClass302_65.method6611();
	}

	@OriginalMember(owner = "client!tea", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method7525(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!tea", name = "e", descriptor = "(I)Z")
	@Override
	protected boolean method7518() {
		return (this.anInt9240 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!tea", name = "d", descriptor = "(I)Z")
	@Override
	protected boolean method7516() {
		return (this.anInt9240 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
	private void method7520(@OriginalArg(0) Component arg0) {
		this.method7523();
		this.aComponent3 = arg0;
		this.aComponent3.addMouseListener(this);
		this.aComponent3.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(B)V")
	@Override
	public void method7510() {
		this.method7523();
	}

	@OriginalMember(owner = "client!tea", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method7525(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!tea", name = "f", descriptor = "(I)V")
	@Override
	public synchronized void method7519() {
		this.anInt9237 = this.anInt9252;
		this.anInt9246 = this.anInt9250;
		this.anInt9240 = this.anInt9251;
		@Pc(23) Class302 local23 = this.aClass302_65;
		this.aClass302_65 = this.aClass302_66;
		this.aClass302_66 = local23;
		this.aClass302_66.method6614();
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(IBIII)V")
	private void method7521(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(15) Class3_Sub6_Sub1 local15 = new Class3_Sub6_Sub1();
		local15.anInt618 = arg0;
		local15.anInt611 = arg3;
		local15.anInt610 = arg2;
		local15.anInt619 = arg1;
		local15.aLong21 = Static15.method380();
		this.aClass302_66.method6613(local15);
	}

	@OriginalMember(owner = "client!tea", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method7524(arg0);
		if ((local8 & this.anInt9251) == 0) {
			local8 = this.anInt9251;
		}
		if ((local8 & 0x1) != 0) {
			this.method7521(arg0.getClickCount(), 3, arg0.getY(), arg0.getX());
		}
		if ((local8 & 0x4) != 0) {
			this.method7521(arg0.getClickCount(), 5, arg0.getY(), arg0.getX());
		}
		if ((local8 & 0x2) != 0) {
			this.method7521(arg0.getClickCount(), 4, arg0.getY(), arg0.getX());
		}
		this.anInt9251 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!tea", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method7525(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!tea", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method7525(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!tea", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method7524(arg0);
		if (local10 == 1) {
			this.method7521(arg0.getClickCount(), 0, arg0.getY(), arg0.getX());
		} else if (local10 == 4) {
			this.method7521(arg0.getClickCount(), 2, arg0.getY(), arg0.getX());
		} else if (local10 == 2) {
			this.method7521(arg0.getClickCount(), 1, arg0.getY(), arg0.getX());
		}
		this.anInt9251 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!tea", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method7514() {
		return (this.anInt9240 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!tea", name = "h", descriptor = "(I)V")
	private void method7523() {
		if (this.aComponent3 == null) {
			return;
		}
		this.aComponent3.removeMouseMotionListener(this);
		this.aComponent3.removeMouseListener(this);
		this.aClass302_65 = null;
		this.aClass302_66 = null;
		this.anInt9246 = this.anInt9237 = this.anInt9240 = 0;
		this.aComponent3 = null;
		this.anInt9250 = this.anInt9252 = this.anInt9251 = 0;
	}

	@OriginalMember(owner = "client!tea", name = "b", descriptor = "(B)I")
	@Override
	public int method7511() {
		return this.anInt9237;
	}

	@OriginalMember(owner = "client!tea", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;Z)I")
	private int method7524(@OriginalArg(0) MouseEvent arg0) {
		@Pc(6) int local6 = arg0.getModifiers();
		@Pc(14) boolean local14 = (local6 & 0x10) != 0;
		@Pc(25) boolean local25 = (local6 & 0x8) != 0;
		@Pc(33) boolean local33 = (local6 & 0x4) != 0;
		if (local25 && (local14 || local33)) {
			local25 = false;
		}
		if (local14 && local33) {
			return 4;
		} else if (local14) {
			return 1;
		} else if (local25) {
			return 2;
		} else if (local33) {
			return 4;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(III)V")
	private void method7525(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt9250 = arg0;
		this.anInt9252 = arg1;
		if (this.aBoolean644) {
			this.method7521(0, -1, arg1, arg0);
		}
	}
}
