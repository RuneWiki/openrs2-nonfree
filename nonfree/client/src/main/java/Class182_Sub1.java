import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ph")
public final class Class182_Sub1 extends Class182 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!ph", name = "i", descriptor = "I")
	private int anInt4647;

	@OriginalMember(owner = "client!ph", name = "j", descriptor = "I")
	private int anInt4648;

	@OriginalMember(owner = "client!ph", name = "t", descriptor = "I")
	private int anInt4657;

	@OriginalMember(owner = "client!ph", name = "N", descriptor = "I")
	private int anInt4675;

	@OriginalMember(owner = "client!ph", name = "O", descriptor = "I")
	private int anInt4676;

	@OriginalMember(owner = "client!ph", name = "P", descriptor = "I")
	private int anInt4677;

	@OriginalMember(owner = "client!ph", name = "S", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!ph", name = "J", descriptor = "Lclient!at;")
	private Class17 aClass17_51 = new Class17();

	@OriginalMember(owner = "client!ph", name = "Q", descriptor = "Lclient!at;")
	private Class17 aClass17_52 = new Class17();

	@OriginalMember(owner = "client!ph", name = "R", descriptor = "Z")
	private final boolean aBoolean452;

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class182_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method4123(arg0);
		this.aBoolean452 = arg1;
	}

	@OriginalMember(owner = "client!ph", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.anInt4676 = -1;
		this.anInt4675 = -1;
	}

	@OriginalMember(owner = "client!ph", name = "f", descriptor = "(I)V")
	@Override
	public synchronized void method4120() {
		this.anInt4648 = this.anInt4675;
		this.anInt4657 = this.anInt4677;
		this.anInt4647 = this.anInt4676;
		@Pc(18) Class17 local18 = this.aClass17_51;
		this.aClass17_51 = this.aClass17_52;
		this.aClass17_52 = local18;
		this.aClass17_52.method205();
	}

	@OriginalMember(owner = "client!ph", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method4126(arg0);
		if ((this.anInt4677 & local8) == 0) {
			local8 = this.anInt4677;
		}
		if ((local8 & 0x1) != 0) {
			this.method4127(3, arg0.getY(), arg0.getX());
		}
		if ((local8 & 0x4) != 0) {
			this.method4127(5, arg0.getY(), arg0.getX());
		}
		if ((local8 & 0x2) != 0) {
			this.method4127(4, arg0.getY(), arg0.getX());
		}
		this.anInt4677 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method4109() {
		return (this.anInt4657 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ph", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method4128(arg0);
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILjava/awt/Component;)V")
	private void method4123(@OriginalArg(1) Component arg0) {
		this.method4131();
		this.aComponent2 = arg0;
		this.aComponent2.addMouseListener(this);
		this.aComponent2.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!ph", name = "e", descriptor = "(I)Z")
	@Override
	protected boolean method4115() {
		return (this.anInt4657 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!ph", name = "f", descriptor = "(B)I")
	@Override
	public int method4121() {
		return this.anInt4647;
	}

	@OriginalMember(owner = "client!ph", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ph", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method4126(arg0);
		if (local10 == 1) {
			this.method4127(0, arg0.getY(), arg0.getX());
		} else if (local10 == 4) {
			this.method4127(2, arg0.getY(), arg0.getX());
		} else if (local10 == 2) {
			this.method4127(1, arg0.getY(), arg0.getX());
		}
		this.anInt4677 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)I")
	private int method4126(@OriginalArg(1) MouseEvent arg0) {
		@Pc(6) int local6 = arg0.getModifiers();
		@Pc(14) boolean local14 = (local6 & 0x10) != 0;
		@Pc(33) boolean local33 = (local6 & 0x8) != 0;
		@Pc(41) boolean local41 = (local6 & 0x4) != 0;
		if (local33 && (local14 || local41)) {
			local33 = false;
		}
		if (local14 && local41) {
			return 4;
		} else if (local14) {
			return 1;
		} else if (local33) {
			return 2;
		} else if (local41) {
			return 4;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIII)V")
	private void method4127(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class1_Sub13_Sub1 local7 = new Class1_Sub13_Sub1();
		local7.anInt3168 = arg1;
		local7.anInt3170 = arg2;
		local7.anInt3172 = arg0;
		local7.aLong99 = Static378.method5293();
		this.aClass17_52.method199(local7);
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(ILjava/awt/event/MouseEvent;)V")
	private void method4128(@OriginalArg(1) MouseEvent arg0) {
		this.anInt4675 = arg0.getX();
		this.anInt4676 = arg0.getY();
		if (this.aBoolean452) {
			this.method4127(-1, arg0.getY(), arg0.getX());
		}
	}

	@OriginalMember(owner = "client!ph", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method4128(arg0);
	}

	@OriginalMember(owner = "client!ph", name = "d", descriptor = "(I)Lclient!fl;")
	@Override
	public Class1_Sub13 method4113() {
		return (Class1_Sub13) this.aClass17_51.method203();
	}

	@OriginalMember(owner = "client!ph", name = "c", descriptor = "(I)I")
	@Override
	public int method4112() {
		return this.anInt4648;
	}

	@OriginalMember(owner = "client!ph", name = "e", descriptor = "(B)Z")
	@Override
	protected boolean method4119() {
		return (this.anInt4657 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!ph", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method4128(arg0);
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Z)V")
	private void method4131() {
		if (this.aComponent2 == null) {
			return;
		}
		this.aComponent2.removeMouseListener(this);
		this.aComponent2.removeMouseMotionListener(this);
		this.aComponent2 = null;
		this.anInt4675 = this.anInt4676 = this.anInt4677 = 0;
		this.aClass17_51 = null;
		this.anInt4648 = this.anInt4647 = this.anInt4657 = 0;
		this.aClass17_52 = null;
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(I)V")
	@Override
	public void method4111() {
		this.method4131();
	}
}
