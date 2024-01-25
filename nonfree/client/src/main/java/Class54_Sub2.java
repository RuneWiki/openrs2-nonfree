import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ji")
public final class Class54_Sub2 extends Class54 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!ji", name = "E", descriptor = "I")
	private int anInt4865;

	@OriginalMember(owner = "client!ji", name = "J", descriptor = "I")
	private int anInt4870;

	@OriginalMember(owner = "client!ji", name = "L", descriptor = "I")
	private int anInt4872;

	@OriginalMember(owner = "client!ji", name = "M", descriptor = "I")
	private int anInt4873;

	@OriginalMember(owner = "client!ji", name = "N", descriptor = "I")
	private int anInt4874;

	@OriginalMember(owner = "client!ji", name = "P", descriptor = "I")
	private int anInt4876;

	@OriginalMember(owner = "client!ji", name = "R", descriptor = "Ljava/awt/Component;")
	private Component aComponent3;

	@OriginalMember(owner = "client!ji", name = "D", descriptor = "Lclient!eea;")
	private Class71 aClass71_37 = new Class71();

	@OriginalMember(owner = "client!ji", name = "Q", descriptor = "Lclient!eea;")
	private Class71 aClass71_38 = new Class71();

	@OriginalMember(owner = "client!ji", name = "S", descriptor = "Z")
	private final boolean aBoolean340;

	@OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class54_Sub2(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method4078(arg0);
		this.aBoolean340 = arg1;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)Z")
	@Override
	protected boolean method4064() {
		return (this.anInt4872 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!ji", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method4079(arg0);
		if (local10 == 1) {
			this.method4077(arg0.getX(), 0, arg0.getY());
		} else if (local10 == 4) {
			this.method4077(arg0.getX(), 2, arg0.getY());
		} else if (local10 == 2) {
			this.method4077(arg0.getX(), 1, arg0.getY());
		}
		this.anInt4876 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(B)I")
	@Override
	public int method4071() {
		return this.anInt4870;
	}

	@OriginalMember(owner = "client!ji", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ji", name = "f", descriptor = "(I)V")
	private void method4076() {
		if (this.aComponent3 == null) {
			return;
		}
		this.aComponent3.removeMouseMotionListener(this);
		this.aComponent3.removeMouseListener(this);
		this.aClass71_37 = null;
		this.anInt4865 = this.anInt4870 = this.anInt4872 = 0;
		this.aClass71_38 = null;
		this.aComponent3 = null;
		this.anInt4874 = this.anInt4873 = this.anInt4876 = 0;
	}

	@OriginalMember(owner = "client!ji", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method4081(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIII)V")
	private void method4077(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class3_Sub19_Sub2 local7 = new Class3_Sub19_Sub2();
		local7.anInt5947 = arg1;
		local7.anInt5943 = arg2;
		local7.anInt5946 = arg0;
		local7.aLong162 = Static12.method647();
		this.aClass71_38.method2076(local7);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(ILjava/awt/Component;)V")
	private void method4078(@OriginalArg(1) Component arg0) {
		this.method4076();
		this.aComponent3 = arg0;
		this.aComponent3.addMouseListener(this);
		this.aComponent3.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Z)Lclient!hl;")
	@Override
	public Class3_Sub19 method4063() {
		return (Class3_Sub19) this.aClass71_37.method2084();
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)I")
	private int method4079(@OriginalArg(1) MouseEvent arg0) {
		@Pc(6) int local6 = arg0.getModifiers();
		@Pc(15) boolean local15 = (local6 & 0x10) != 0;
		@Pc(23) boolean local23 = (local6 & 0x8) != 0;
		@Pc(31) boolean local31 = (local6 & 0x4) != 0;
		if (local23 && (local15 || local31)) {
			local23 = false;
		}
		if (local15 && local31) {
			return 4;
		} else if (local15) {
			return 1;
		} else if (local23) {
			return 2;
		} else if (local31) {
			return 4;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ji", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method4081(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!ji", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method4079(arg0);
		if ((local8 & this.anInt4876) == 0) {
			local8 = this.anInt4876;
		}
		if ((local8 & 0x1) != 0) {
			this.method4077(arg0.getX(), 3, arg0.getY());
		}
		if ((local8 & 0x4) != 0) {
			this.method4077(arg0.getX(), 5, arg0.getY());
		}
		if ((local8 & 0x2) != 0) {
			this.method4077(arg0.getX(), 4, arg0.getY());
		}
		this.anInt4876 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "(I)Z")
	@Override
	protected boolean method4068() {
		return (this.anInt4872 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!ji", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method4072() {
		this.anInt4870 = this.anInt4873;
		this.anInt4865 = this.anInt4874;
		this.anInt4872 = this.anInt4876;
		@Pc(18) Class71 local18 = this.aClass71_37;
		this.aClass71_37 = this.aClass71_38;
		this.aClass71_38 = local18;
		this.aClass71_38.method2088();
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method4070() {
		return (this.anInt4872 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ji", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method4081(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!ji", name = "e", descriptor = "(I)I")
	@Override
	public int method4074() {
		return this.anInt4865;
	}

	@OriginalMember(owner = "client!ji", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method4081(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(BII)V")
	private void method4081(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt4874 = arg1;
		this.anInt4873 = arg0;
		if (this.aBoolean340) {
			this.method4077(arg1, -1, arg0);
		}
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(I)V")
	@Override
	public void method4065() {
		this.method4076();
	}
}
