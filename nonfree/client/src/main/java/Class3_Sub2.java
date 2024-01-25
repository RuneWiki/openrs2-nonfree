import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wga")
public final class Class3_Sub2 extends Class3 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!wga", name = "n", descriptor = "I")
	private int anInt10441;

	@OriginalMember(owner = "client!wga", name = "r", descriptor = "I")
	private int anInt10444;

	@OriginalMember(owner = "client!wga", name = "A", descriptor = "I")
	private int anInt10452;

	@OriginalMember(owner = "client!wga", name = "L", descriptor = "I")
	private int anInt10460;

	@OriginalMember(owner = "client!wga", name = "O", descriptor = "I")
	private int anInt10463;

	@OriginalMember(owner = "client!wga", name = "P", descriptor = "I")
	private int anInt10464;

	@OriginalMember(owner = "client!wga", name = "R", descriptor = "Ljava/awt/Component;")
	private Component aComponent5;

	@OriginalMember(owner = "client!wga", name = "E", descriptor = "Lclient!tg;")
	private Class330 aClass330_63 = new Class330();

	@OriginalMember(owner = "client!wga", name = "K", descriptor = "Lclient!tg;")
	private Class330 aClass330_64 = new Class330();

	@OriginalMember(owner = "client!wga", name = "Q", descriptor = "Z")
	private final boolean aBoolean747;

	@OriginalMember(owner = "client!wga", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class3_Sub2(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method8887(arg0);
		this.aBoolean747 = arg1;
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(ZLjava/awt/event/MouseEvent;)I")
	private int method8881(@OriginalArg(1) MouseEvent arg0) {
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

	@OriginalMember(owner = "client!wga", name = "c", descriptor = "(I)I")
	@Override
	public int method8875() {
		return this.anInt10452;
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(I)V")
	@Override
	public void method8871() {
		this.method8885();
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(III)V")
	private void method8882(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt10464 = arg1;
		this.anInt10463 = arg0;
		if (this.aBoolean747) {
			this.method8884(arg1, -1, arg0, 0);
		}
	}

	@OriginalMember(owner = "client!wga", name = "b", descriptor = "(I)Z")
	@Override
	protected boolean method8873() {
		return (this.anInt10441 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!wga", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method8882(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(IIIII)V")
	private void method8884(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) Class5_Sub13_Sub2 local12 = new Class5_Sub13_Sub2();
		local12.anInt6091 = arg3;
		local12.anInt6084 = arg0;
		local12.anInt6088 = arg2;
		local12.anInt6093 = arg1;
		local12.aLong149 = Static95.method1587();
		this.aClass330_64.method7917(local12);
	}

	@OriginalMember(owner = "client!wga", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method8881(arg0);
		if ((this.anInt10460 & local8) == 0) {
			local8 = this.anInt10460;
		}
		if ((local8 & 0x1) != 0) {
			this.method8884(arg0.getX(), 3, arg0.getY(), arg0.getClickCount());
		}
		if ((local8 & 0x4) != 0) {
			this.method8884(arg0.getX(), 5, arg0.getY(), arg0.getClickCount());
		}
		if ((local8 & 0x2) != 0) {
			this.method8884(arg0.getX(), 4, arg0.getY(), arg0.getClickCount());
		}
		this.anInt10460 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!wga", name = "e", descriptor = "(B)I")
	@Override
	public int method8879() {
		return this.anInt10444;
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(B)Z")
	@Override
	protected boolean method8872() {
		return (this.anInt10441 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!wga", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method8882(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!wga", name = "e", descriptor = "(I)V")
	private void method8885() {
		if (this.aComponent5 == null) {
			return;
		}
		this.aComponent5.removeMouseMotionListener(this);
		this.aComponent5.removeMouseListener(this);
		this.aClass330_64 = null;
		this.anInt10464 = this.anInt10463 = this.anInt10460 = 0;
		this.anInt10452 = this.anInt10444 = this.anInt10441 = 0;
		this.aClass330_63 = null;
		this.aComponent5 = null;
	}

	@OriginalMember(owner = "client!wga", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!wga", name = "c", descriptor = "(B)Lclient!ck;")
	@Override
	public Class5_Sub13 method8876() {
		return (Class5_Sub13) this.aClass330_63.method7911();
	}

	@OriginalMember(owner = "client!wga", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method8881(arg0);
		if (local10 == 1) {
			this.method8884(arg0.getX(), 0, arg0.getY(), arg0.getClickCount());
		} else if (local10 == 4) {
			this.method8884(arg0.getX(), 2, arg0.getY(), arg0.getClickCount());
		} else if (local10 == 2) {
			this.method8884(arg0.getX(), 1, arg0.getY(), arg0.getClickCount());
		}
		this.anInt10460 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
	private void method8887(@OriginalArg(0) Component arg0) {
		this.method8885();
		this.aComponent5 = arg0;
		this.aComponent5.addMouseListener(this);
		this.aComponent5.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!wga", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method8882(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!wga", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method8882(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!wga", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8874() {
		return (this.anInt10441 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!wga", name = "f", descriptor = "(B)V")
	@Override
	public synchronized void method8880() {
		this.anInt10441 = this.anInt10460;
		this.anInt10452 = this.anInt10464;
		this.anInt10444 = this.anInt10463;
		@Pc(18) Class330 local18 = this.aClass330_63;
		this.aClass330_63 = this.aClass330_64;
		this.aClass330_64 = local18;
		this.aClass330_64.method7910();
	}
}
