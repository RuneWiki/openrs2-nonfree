import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class6_Sub2 extends Class6 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!ia", name = "i", descriptor = "I")
	private int anInt4440;

	@OriginalMember(owner = "client!ia", name = "n", descriptor = "I")
	private int anInt4443;

	@OriginalMember(owner = "client!ia", name = "z", descriptor = "I")
	private int anInt4454;

	@OriginalMember(owner = "client!ia", name = "G", descriptor = "I")
	private int anInt4461;

	@OriginalMember(owner = "client!ia", name = "I", descriptor = "I")
	private int anInt4463;

	@OriginalMember(owner = "client!ia", name = "K", descriptor = "I")
	private int anInt4465;

	@OriginalMember(owner = "client!ia", name = "O", descriptor = "Ljava/awt/Component;")
	private Component aComponent4;

	@OriginalMember(owner = "client!ia", name = "v", descriptor = "Lclient!dm;")
	private Class73 aClass73_34 = new Class73();

	@OriginalMember(owner = "client!ia", name = "M", descriptor = "Lclient!dm;")
	private Class73 aClass73_35 = new Class73();

	@OriginalMember(owner = "client!ia", name = "N", descriptor = "Z")
	private final boolean aBoolean351;

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class6_Sub2(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method3759(arg0);
		this.aBoolean351 = arg1;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)Z")
	@Override
	protected boolean method3747() {
		return (this.anInt4443 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!ia", name = "d", descriptor = "(B)V")
	@Override
	public synchronized void method3755() {
		this.anInt4443 = this.anInt4463;
		this.anInt4440 = this.anInt4465;
		this.anInt4454 = this.anInt4461;
		@Pc(18) Class73 local18 = this.aClass73_34;
		this.aClass73_34 = this.aClass73_35;
		this.aClass73_35 = local18;
		this.aClass73_35.method2014();
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	private void method3759(@OriginalArg(0) Component arg0) {
		this.method3767();
		this.aComponent4 = arg0;
		this.aComponent4.addMouseListener(this);
		this.aComponent4.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z)Z")
	@Override
	protected boolean method3753() {
		return (this.anInt4443 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!ia", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method3763(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "(I)I")
	@Override
	public int method3757() {
		return this.anInt4440;
	}

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "(B)I")
	@Override
	public int method3754() {
		return this.anInt4454;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIZ)V")
	private void method3760(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class12_Sub3_Sub1 local7 = new Class12_Sub3_Sub1();
		local7.anInt353 = arg2;
		local7.anInt355 = arg1;
		local7.anInt349 = arg0;
		local7.aLong9 = Static76.method1679();
		this.aClass73_35.method2012(local7);
	}

	@OriginalMember(owner = "client!ia", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method3766(arg0);
		if ((local8 & this.anInt4463) == 0) {
			local8 = this.anInt4463;
		}
		if ((local8 & 0x1) != 0) {
			this.method3760(arg0.getX(), arg0.getY(), 3);
		}
		if ((local8 & 0x4) != 0) {
			this.method3760(arg0.getX(), arg0.getY(), 5);
		}
		if ((local8 & 0x2) != 0) {
			this.method3760(arg0.getX(), arg0.getY(), 4);
		}
		this.anInt4463 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ia", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method3763(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!ia", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(III)V")
	private void method3763(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4465 = arg0;
		this.anInt4461 = arg1;
		if (this.aBoolean351) {
			this.method3760(arg1, arg0, -1);
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V")
	@Override
	public void method3751() {
		this.method3767();
	}

	@OriginalMember(owner = "client!ia", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method3763(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)I")
	private int method3766(@OriginalArg(1) MouseEvent arg0) {
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

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method3752() {
		return (this.anInt4443 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ia", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method3763(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!ia", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method3766(arg0);
		if (local10 == 1) {
			this.method3760(arg0.getX(), arg0.getY(), 0);
		} else if (local10 == 4) {
			this.method3760(arg0.getX(), arg0.getY(), 2);
		} else if (local10 == 2) {
			this.method3760(arg0.getX(), arg0.getY(), 1);
		}
		this.anInt4463 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "(I)V")
	private void method3767() {
		if (this.aComponent4 == null) {
			return;
		}
		this.aComponent4.removeMouseMotionListener(this);
		this.aComponent4.removeMouseListener(this);
		this.aClass73_34 = null;
		this.anInt4454 = this.anInt4440 = this.anInt4443 = 0;
		this.aClass73_35 = null;
		this.anInt4461 = this.anInt4465 = this.anInt4463 = 0;
		this.aComponent4 = null;
	}

	@OriginalMember(owner = "client!ia", name = "f", descriptor = "(B)Lclient!bh;")
	@Override
	public Class12_Sub3 method3758() {
		return (Class12_Sub3) this.aClass73_34.method2008();
	}
}
