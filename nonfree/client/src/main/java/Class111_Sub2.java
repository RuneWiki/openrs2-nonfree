import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wo")
public final class Class111_Sub2 extends Class111 implements MouseListener, MouseMotionListener, MouseWheelListener {

	@OriginalMember(owner = "client!wo", name = "f", descriptor = "I")
	private int anInt10422;

	@OriginalMember(owner = "client!wo", name = "h", descriptor = "I")
	private int anInt10423;

	@OriginalMember(owner = "client!wo", name = "i", descriptor = "I")
	private int anInt10424;

	@OriginalMember(owner = "client!wo", name = "j", descriptor = "I")
	private int anInt10425;

	@OriginalMember(owner = "client!wo", name = "k", descriptor = "I")
	private int anInt10426;

	@OriginalMember(owner = "client!wo", name = "m", descriptor = "I")
	private int anInt10427;

	@OriginalMember(owner = "client!wo", name = "n", descriptor = "Ljava/awt/Component;")
	private Component aComponent5;

	@OriginalMember(owner = "client!wo", name = "g", descriptor = "Lclient!ga;")
	private Class124 aClass124_105 = new Class124();

	@OriginalMember(owner = "client!wo", name = "l", descriptor = "Lclient!ga;")
	private Class124 aClass124_106 = new Class124();

	@OriginalMember(owner = "client!wo", name = "o", descriptor = "Z")
	private final boolean aBoolean769;

	@OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class111_Sub2(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method8707(arg0);
		this.aBoolean769 = arg1;
	}

	@OriginalMember(owner = "client!wo", name = "c", descriptor = "(B)I")
	@Override
	public int method8703() {
		return this.anInt10423;
	}

	@OriginalMember(owner = "client!wo", name = "i", descriptor = "(I)V")
	private void method8705() {
		if (this.aComponent5 == null) {
			return;
		}
		this.aComponent5.removeMouseWheelListener(this);
		this.aComponent5.removeMouseMotionListener(this);
		this.aComponent5.removeMouseListener(this);
		this.anInt10423 = this.anInt10424 = this.anInt10422 = 0;
		this.aClass124_106 = null;
		this.aClass124_105 = null;
		this.anInt10426 = this.anInt10425 = this.anInt10427 = 0;
		this.aComponent5 = null;
	}

	@OriginalMember(owner = "client!wo", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		@Pc(8) int local8 = arg0.getWheelRotation();
		this.method8709(local5, local8, 6, local2);
		arg0.consume();
	}

	@OriginalMember(owner = "client!wo", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method8708(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!wo", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method8706(arg0);
		if ((this.anInt10427 & local4) == 0) {
			local4 = this.anInt10427;
		}
		if ((local4 & 0x1) != 0) {
			this.method8709(arg0.getY(), arg0.getClickCount(), 3, arg0.getX());
		}
		if ((local4 & 0x4) != 0) {
			this.method8709(arg0.getY(), arg0.getClickCount(), 5, arg0.getX());
		}
		if ((local4 & 0x2) != 0) {
			this.method8709(arg0.getY(), arg0.getClickCount(), 4, arg0.getX());
		}
		this.anInt10427 &= ~local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!wo", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method8706(arg0);
		if (local4 == 1) {
			this.method8709(arg0.getY(), arg0.getClickCount(), 0, arg0.getX());
		} else if (local4 == 4) {
			this.method8709(arg0.getY(), arg0.getClickCount(), 2, arg0.getX());
		} else if (local4 == 2) {
			this.method8709(arg0.getY(), arg0.getClickCount(), 1, arg0.getX());
		}
		this.anInt10427 |= local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)I")
	private int method8706(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.getButton() == 1) {
			return arg0.isMetaDown() ? 4 : 1;
		} else if (arg0.getButton() == 2) {
			return 2;
		} else if (arg0.getButton() == 3) {
			return 4;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(I)Z")
	@Override
	protected boolean method8695() {
		return (this.anInt10422 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!wo", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method8708(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	private void method8707(@OriginalArg(0) Component arg0) {
		this.method8705();
		this.aComponent5 = arg0;
		this.aComponent5.addMouseListener(this);
		this.aComponent5.addMouseMotionListener(this);
		this.aComponent5.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!wo", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method8708(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!wo", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(III)V")
	private void method8708(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt10425 = arg1;
		this.anInt10426 = arg0;
		if (this.aBoolean769) {
			this.method8709(arg1, 0, -1, arg0);
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(IIIII)V")
	private void method8709(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class5_Sub25_Sub2 local3 = new Class5_Sub25_Sub2();
		local3.anInt3747 = arg0;
		local3.anInt3746 = arg2;
		local3.anInt3745 = arg3;
		local3.aLong134 = Static124.method1947();
		local3.anInt3744 = arg1;
		this.aClass124_106.method2574(local3);
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(I)V")
	@Override
	public void method8694() {
		this.method8705();
	}

	@OriginalMember(owner = "client!wo", name = "f", descriptor = "(I)Z")
	@Override
	protected boolean method8701() {
		return (this.anInt10422 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!wo", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method8708(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(B)I")
	@Override
	public int method8696() {
		return this.anInt10424;
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(B)V")
	@Override
	public synchronized void method8698() {
		this.anInt10424 = this.anInt10425;
		this.anInt10422 = this.anInt10427;
		this.anInt10423 = this.anInt10426;
		@Pc(14) Class124 local14 = this.aClass124_105;
		this.aClass124_105 = this.aClass124_106;
		this.aClass124_106 = local14;
		this.aClass124_106.method2567();
	}

	@OriginalMember(owner = "client!wo", name = "g", descriptor = "(I)Lclient!ik;")
	@Override
	public Class5_Sub25 method8702() {
		return (Class5_Sub25) this.aClass124_105.method2571();
	}

	@OriginalMember(owner = "client!wo", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method8700() {
		return (this.anInt10422 & 0x1) != 0;
	}
}
