import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qq")
public final class Class118_Sub2 extends Class118 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!qq", name = "p", descriptor = "I")
	private int anInt8810;

	@OriginalMember(owner = "client!qq", name = "J", descriptor = "I")
	private int anInt8816;

	@OriginalMember(owner = "client!qq", name = "z", descriptor = "I")
	private int anInt8820;

	@OriginalMember(owner = "client!qq", name = "l", descriptor = "I")
	private int anInt8824;

	@OriginalMember(owner = "client!qq", name = "y", descriptor = "I")
	private int anInt8825;

	@OriginalMember(owner = "client!qq", name = "s", descriptor = "I")
	private int anInt8826;

	@OriginalMember(owner = "client!qq", name = "K", descriptor = "Ljava/awt/Component;")
	private Component aComponent4;

	@OriginalMember(owner = "client!qq", name = "L", descriptor = "Lclient!bd;")
	private Class32 aClass32_59 = new Class32();

	@OriginalMember(owner = "client!qq", name = "A", descriptor = "Lclient!bd;")
	private Class32 aClass32_60 = new Class32();

	@OriginalMember(owner = "client!qq", name = "o", descriptor = "Z")
	private final boolean aBoolean621;

	@OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class118_Sub2(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method7600(arg0);
		this.aBoolean621 = arg1;
	}

	@OriginalMember(owner = "client!qq", name = "f", descriptor = "(I)V")
	private void method7597() {
		if (this.aComponent4 == null) {
			return;
		}
		this.aComponent4.removeMouseMotionListener(this);
		this.aComponent4.removeMouseListener(this);
		this.anInt8824 = this.anInt8825 = this.anInt8826 = 0;
		this.aClass32_59 = null;
		this.aComponent4 = null;
		this.aClass32_60 = null;
		this.anInt8820 = this.anInt8816 = this.anInt8810 = 0;
	}

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "(I)I")
	@Override
	public int method7590() {
		return this.anInt8816;
	}

	@OriginalMember(owner = "client!qq", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method7602(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!qq", name = "c", descriptor = "(B)I")
	@Override
	public int method7586() {
		return this.anInt8820;
	}

	@OriginalMember(owner = "client!qq", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method7602(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "(B)V")
	@Override
	public void method7592() {
		this.method7597();
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;B)I")
	private int method7598(@OriginalArg(0) MouseEvent arg0) {
		@Pc(6) int local6 = arg0.getModifiers();
		@Pc(18) boolean local18 = (local6 & 0x10) != 0;
		@Pc(27) boolean local27 = (local6 & 0x8) != 0;
		@Pc(39) boolean local39 = (local6 & 0x4) != 0;
		if (local27 && (local18 || local39)) {
			local27 = false;
		}
		if (local18 && local39) {
			return 4;
		} else if (local18) {
			return 1;
		} else if (local27) {
			return 2;
		} else if (local39) {
			return 4;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "(Z)Z")
	@Override
	protected boolean method7589() {
		return (this.anInt8810 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	private void method7600(@OriginalArg(0) Component arg0) {
		this.method7597();
		this.aComponent4 = arg0;
		this.aComponent4.addMouseListener(this);
		this.aComponent4.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!qq", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method7598(arg0);
		if (local10 == 1) {
			this.method7603(arg0.getY(), arg0.getX(), arg0.getClickCount(), 0);
		} else if (local10 == 4) {
			this.method7603(arg0.getY(), arg0.getX(), arg0.getClickCount(), 2);
		} else if (local10 == 2) {
			this.method7603(arg0.getY(), arg0.getX(), arg0.getClickCount(), 1);
		}
		this.anInt8826 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!qq", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7587() {
		return (this.anInt8810 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(III)V")
	private void method7602(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt8825 = arg0;
		this.anInt8824 = arg1;
		if (this.aBoolean621) {
			this.method7603(arg0, arg1, 0, -1);
		}
	}

	@OriginalMember(owner = "client!qq", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method7602(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!qq", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method7602(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIIII)V")
	private void method7603(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) Class14_Sub29_Sub2 local12 = new Class14_Sub29_Sub2();
		local12.anInt9128 = arg1;
		local12.anInt9116 = arg3;
		local12.anInt9125 = arg2;
		local12.anInt9123 = arg0;
		local12.aLong244 = Static26.method382();
		this.aClass32_60.method582(local12);
	}

	@OriginalMember(owner = "client!qq", name = "c", descriptor = "(Z)Lclient!mo;")
	@Override
	public Class14_Sub29 method7594() {
		return (Class14_Sub29) this.aClass32_59.method579();
	}

	@OriginalMember(owner = "client!qq", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method7598(arg0);
		if ((this.anInt8826 & local8) == 0) {
			local8 = this.anInt8826;
		}
		if ((local8 & 0x1) != 0) {
			this.method7603(arg0.getY(), arg0.getX(), arg0.getClickCount(), 3);
		}
		if ((local8 & 0x4) != 0) {
			this.method7603(arg0.getY(), arg0.getX(), arg0.getClickCount(), 5);
		}
		if ((local8 & 0x2) != 0) {
			this.method7603(arg0.getY(), arg0.getX(), arg0.getClickCount(), 4);
		}
		this.anInt8826 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method7595() {
		this.anInt8810 = this.anInt8826;
		this.anInt8816 = this.anInt8825;
		this.anInt8820 = this.anInt8824;
		@Pc(23) Class32 local23 = this.aClass32_59;
		this.aClass32_59 = this.aClass32_60;
		this.aClass32_60 = local23;
		this.aClass32_60.method588();
	}

	@OriginalMember(owner = "client!qq", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!qq", name = "d", descriptor = "(I)Z")
	@Override
	protected boolean method7591() {
		return (this.anInt8810 & 0x4) != 0;
	}
}
