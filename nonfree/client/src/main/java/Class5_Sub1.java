import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ad")
public final class Class5_Sub1 extends Class5 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!ad", name = "x", descriptor = "I")
	private int anInt188;

	@OriginalMember(owner = "client!ad", name = "z", descriptor = "I")
	private int anInt190;

	@OriginalMember(owner = "client!ad", name = "C", descriptor = "I")
	private int anInt193;

	@OriginalMember(owner = "client!ad", name = "E", descriptor = "I")
	private int anInt195;

	@OriginalMember(owner = "client!ad", name = "F", descriptor = "I")
	private int anInt196;

	@OriginalMember(owner = "client!ad", name = "H", descriptor = "I")
	private int anInt198;

	@OriginalMember(owner = "client!ad", name = "K", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!ad", name = "o", descriptor = "Lclient!bv;")
	private Class37 aClass37_2 = new Class37();

	@OriginalMember(owner = "client!ad", name = "I", descriptor = "Lclient!bv;")
	private Class37 aClass37_3 = new Class37();

	@OriginalMember(owner = "client!ad", name = "J", descriptor = "Z")
	private final boolean aBoolean11;

	@OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class5_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method310(arg0);
		this.aBoolean11 = arg1;
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)Lclient!sda;")
	@Override
	public Class1_Sub13 method7043() {
		return (Class1_Sub13) this.aClass37_2.method973();
	}

	@OriginalMember(owner = "client!ad", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Z)V")
	@Override
	public void method7047() {
		this.method313();
	}

	@OriginalMember(owner = "client!ad", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method314(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!ad", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method314(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "(I)Z")
	@Override
	protected boolean method7045() {
		return (this.anInt188 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	private void method310(@OriginalArg(0) Component arg0) {
		this.method313();
		this.aComponent1 = arg0;
		this.aComponent1.addMouseListener(this);
		this.aComponent1.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!ad", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method312(arg0);
		if ((local8 & this.anInt196) == 0) {
			local8 = this.anInt196;
		}
		if ((local8 & 0x1) != 0) {
			this.method315(3, arg0.getY(), arg0.getX());
		}
		if ((local8 & 0x4) != 0) {
			this.method315(5, arg0.getY(), arg0.getX());
		}
		if ((local8 & 0x2) != 0) {
			this.method315(4, arg0.getY(), arg0.getX());
		}
		this.anInt196 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)I")
	@Override
	public int method7042() {
		return this.anInt190;
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7044() {
		return (this.anInt188 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ad", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method314(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!ad", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method312(arg0);
		if (local10 == 1) {
			this.method315(0, arg0.getY(), arg0.getX());
		} else if (local10 == 4) {
			this.method315(2, arg0.getY(), arg0.getX());
		} else if (local10 == 2) {
			this.method315(1, arg0.getY(), arg0.getX());
		}
		this.anInt196 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ad", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method314(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)I")
	private int method312(@OriginalArg(0) MouseEvent arg0) {
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

	@OriginalMember(owner = "client!ad", name = "g", descriptor = "(I)V")
	private void method313() {
		if (this.aComponent1 == null) {
			return;
		}
		this.aComponent1.removeMouseMotionListener(this);
		this.aComponent1.removeMouseListener(this);
		this.aComponent1 = null;
		this.aClass37_2 = null;
		this.anInt195 = this.anInt198 = this.anInt196 = 0;
		this.aClass37_3 = null;
		this.anInt193 = this.anInt190 = this.anInt188 = 0;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IBI)V")
	private void method314(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt195 = arg1;
		this.anInt198 = arg0;
		if (this.aBoolean11) {
			this.method315(-1, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(Z)Z")
	@Override
	protected boolean method7048() {
		return (this.anInt188 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!ad", name = "e", descriptor = "(I)V")
	@Override
	public synchronized void method7054() {
		this.anInt190 = this.anInt198;
		this.anInt193 = this.anInt195;
		this.anInt188 = this.anInt196;
		@Pc(26) Class37 local26 = this.aClass37_2;
		this.aClass37_2 = this.aClass37_3;
		this.aClass37_3 = local26;
		this.aClass37_3.method967();
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(B)I")
	@Override
	public int method7052() {
		return this.anInt193;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IBII)V")
	private void method315(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class1_Sub13_Sub2 local7 = new Class1_Sub13_Sub2();
		local7.anInt6860 = arg2;
		local7.anInt6858 = arg0;
		local7.anInt6859 = arg1;
		local7.aLong291 = Static60.method1119();
		this.aClass37_3.method970(local7);
	}
}
