import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pda")
public final class Class238_Sub2 extends Class238 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!pda", name = "u", descriptor = "I")
	private int anInt7011;

	@OriginalMember(owner = "client!pda", name = "C", descriptor = "I")
	private int anInt7018;

	@OriginalMember(owner = "client!pda", name = "F", descriptor = "I")
	private int anInt7021;

	@OriginalMember(owner = "client!pda", name = "G", descriptor = "I")
	private int anInt7022;

	@OriginalMember(owner = "client!pda", name = "H", descriptor = "I")
	private int anInt7023;

	@OriginalMember(owner = "client!pda", name = "J", descriptor = "I")
	private int anInt7024;

	@OriginalMember(owner = "client!pda", name = "L", descriptor = "Ljava/awt/Component;")
	private Component aComponent5;

	@OriginalMember(owner = "client!pda", name = "y", descriptor = "Lclient!gca;")
	private Class111 aClass111_44 = new Class111();

	@OriginalMember(owner = "client!pda", name = "I", descriptor = "Lclient!gca;")
	private Class111 aClass111_45 = new Class111();

	@OriginalMember(owner = "client!pda", name = "K", descriptor = "Z")
	private final boolean aBoolean538;

	@OriginalMember(owner = "client!pda", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class238_Sub2(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method5668(arg0);
		this.aBoolean538 = arg1;
	}

	@OriginalMember(owner = "client!pda", name = "f", descriptor = "(I)Z")
	@Override
	protected boolean method5663() {
		return (this.anInt7021 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!pda", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5652() {
		return (this.anInt7021 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(IIIII)V")
	private void method5665(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class1_Sub12_Sub2 local7 = new Class1_Sub12_Sub2();
		local7.anInt8273 = arg0;
		local7.anInt8278 = arg2;
		local7.anInt8274 = arg3;
		local7.anInt8276 = arg1;
		local7.aLong224 = Static480.method6650();
		this.aClass111_45.method2552(local7);
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(B)I")
	@Override
	public int method5653() {
		return this.anInt7011;
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(I)V")
	@Override
	public void method5651() {
		this.method5667();
	}

	@OriginalMember(owner = "client!pda", name = "b", descriptor = "(B)Lclient!bs;")
	@Override
	public Class1_Sub12 method5654() {
		return (Class1_Sub12) this.aClass111_44.method2553();
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)I")
	private int method5666(@OriginalArg(0) MouseEvent arg0) {
		@Pc(12) int local12 = arg0.getModifiers();
		@Pc(23) boolean local23 = (local12 & 0x10) != 0;
		@Pc(34) boolean local34 = (local12 & 0x8) != 0;
		@Pc(45) boolean local45 = (local12 & 0x4) != 0;
		if (local34 && (local23 || local45)) {
			local34 = false;
		}
		if (local23 && local45) {
			return 4;
		} else if (local23) {
			return 1;
		} else if (local34) {
			return 2;
		} else if (local45) {
			return 4;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!pda", name = "d", descriptor = "(I)I")
	@Override
	public int method5661() {
		return this.anInt7018;
	}

	@OriginalMember(owner = "client!pda", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method5669(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!pda", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method5669(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!pda", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method5669(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!pda", name = "g", descriptor = "(I)V")
	private void method5667() {
		if (this.aComponent5 == null) {
			return;
		}
		this.aComponent5.removeMouseMotionListener(this);
		this.aComponent5.removeMouseListener(this);
		this.aClass111_45 = null;
		this.anInt7018 = this.anInt7011 = this.anInt7021 = 0;
		this.aClass111_44 = null;
		this.aComponent5 = null;
		this.anInt7024 = this.anInt7023 = this.anInt7022 = 0;
	}

	@OriginalMember(owner = "client!pda", name = "d", descriptor = "(B)V")
	@Override
	public synchronized void method5656() {
		this.anInt7011 = this.anInt7023;
		this.anInt7018 = this.anInt7024;
		this.anInt7021 = this.anInt7022;
		@Pc(24) Class111 local24 = this.aClass111_44;
		this.aClass111_44 = this.aClass111_45;
		this.aClass111_45 = local24;
		this.aClass111_45.method2555();
	}

	@OriginalMember(owner = "client!pda", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method5666(arg0);
		if ((local8 & this.anInt7022) == 0) {
			local8 = this.anInt7022;
		}
		if ((local8 & 0x1) != 0) {
			this.method5665(arg0.getX(), 3, arg0.getY(), arg0.getClickCount());
		}
		if ((local8 & 0x4) != 0) {
			this.method5665(arg0.getX(), 5, arg0.getY(), arg0.getClickCount());
		}
		if ((local8 & 0x2) != 0) {
			this.method5665(arg0.getX(), 4, arg0.getY(), arg0.getClickCount());
		}
		this.anInt7022 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	private void method5668(@OriginalArg(0) Component arg0) {
		this.method5667();
		this.aComponent5 = arg0;
		this.aComponent5.addMouseListener(this);
		this.aComponent5.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!pda", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method5669(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(III)V")
	private void method5669(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt7024 = arg1;
		this.anInt7023 = arg0;
		if (this.aBoolean538) {
			this.method5665(arg1, -1, arg0, 0);
		}
	}

	@OriginalMember(owner = "client!pda", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method5666(arg0);
		if (local10 == 1) {
			this.method5665(arg0.getX(), 0, arg0.getY(), arg0.getClickCount());
		} else if (local10 == 4) {
			this.method5665(arg0.getX(), 2, arg0.getY(), arg0.getClickCount());
		} else if (local10 == 2) {
			this.method5665(arg0.getX(), 1, arg0.getY(), arg0.getClickCount());
		}
		this.anInt7022 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!pda", name = "e", descriptor = "(B)Z")
	@Override
	protected boolean method5658() {
		return (this.anInt7021 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!pda", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}
}
