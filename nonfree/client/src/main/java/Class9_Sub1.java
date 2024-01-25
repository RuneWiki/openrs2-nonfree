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

@OriginalClass("client!aea")
public final class Class9_Sub1 extends Class9 implements MouseListener, MouseMotionListener, MouseWheelListener {

	@OriginalMember(owner = "client!aea", name = "d", descriptor = "I")
	private int anInt140;

	@OriginalMember(owner = "client!aea", name = "e", descriptor = "I")
	private int anInt141;

	@OriginalMember(owner = "client!aea", name = "g", descriptor = "I")
	private int anInt142;

	@OriginalMember(owner = "client!aea", name = "i", descriptor = "I")
	private int anInt143;

	@OriginalMember(owner = "client!aea", name = "j", descriptor = "I")
	private int anInt144;

	@OriginalMember(owner = "client!aea", name = "k", descriptor = "I")
	private int anInt145;

	@OriginalMember(owner = "client!aea", name = "m", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!aea", name = "f", descriptor = "Lclient!uh;")
	private Class341 aClass341_3 = new Class341();

	@OriginalMember(owner = "client!aea", name = "h", descriptor = "Lclient!uh;")
	private Class341 aClass341_4 = new Class341();

	@OriginalMember(owner = "client!aea", name = "l", descriptor = "Z")
	private final boolean aBoolean10;

	@OriginalMember(owner = "client!aea", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class9_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method204(arg0);
		this.aBoolean10 = arg1;
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(I)Z")
	@Override
	protected boolean method794() {
		return (this.anInt142 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(IIIIZ)V")
	private void method200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class2_Sub9_Sub1 local3 = new Class2_Sub9_Sub1();
		local3.anInt7413 = arg3;
		local3.anInt7415 = arg1;
		local3.anInt7416 = arg0;
		local3.aLong180 = Static277.method5091();
		local3.anInt7414 = arg2;
		this.aClass341_4.method8528(local3);
	}

	@OriginalMember(owner = "client!aea", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method202(arg0);
		if ((local4 & this.anInt144) == 0) {
			local4 = this.anInt144;
		}
		if ((local4 & 0x1) != 0) {
			this.method200(arg0.getX(), 3, arg0.getClickCount(), arg0.getY());
		}
		if ((local4 & 0x4) != 0) {
			this.method200(arg0.getX(), 5, arg0.getClickCount(), arg0.getY());
		}
		if ((local4 & 0x2) != 0) {
			this.method200(arg0.getX(), 4, arg0.getClickCount(), arg0.getY());
		}
		this.anInt144 &= ~local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!aea", name = "b", descriptor = "(B)I")
	@Override
	public int method800() {
		return this.anInt140;
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(III)V")
	private void method201(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt143 = arg1;
		this.anInt145 = arg0;
		if (this.aBoolean10) {
			this.method200(arg0, -1, 0, arg1);
		}
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(B)Z")
	@Override
	protected boolean method796() {
		return (this.anInt142 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!aea", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method202(arg0);
		if (local4 == 1) {
			this.method200(arg0.getX(), 0, arg0.getClickCount(), arg0.getY());
		} else if (local4 == 4) {
			this.method200(arg0.getX(), 2, arg0.getClickCount(), arg0.getY());
		} else if (local4 == 2) {
			this.method200(arg0.getX(), 1, arg0.getClickCount(), arg0.getY());
		}
		this.anInt144 |= local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(Z)I")
	@Override
	public int method803() {
		return this.anInt141;
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)I")
	private int method202(@OriginalArg(0) MouseEvent arg0) {
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

	@OriginalMember(owner = "client!aea", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method201(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!aea", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!aea", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method801() {
		return (this.anInt142 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!aea", name = "f", descriptor = "(I)Lclient!bu;")
	@Override
	public Class2_Sub9 method802() {
		return (Class2_Sub9) this.aClass341_3.method8526();
	}

	@OriginalMember(owner = "client!aea", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method201(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!aea", name = "g", descriptor = "(I)V")
	private void method203() {
		if (this.aComponent1 == null) {
			return;
		}
		this.aComponent1.removeMouseWheelListener(this);
		this.aComponent1.removeMouseMotionListener(this);
		this.aComponent1.removeMouseListener(this);
		this.aComponent1 = null;
		this.anInt145 = this.anInt143 = this.anInt144 = 0;
		this.anInt141 = this.anInt140 = this.anInt142 = 0;
		this.aClass341_3 = null;
		this.aClass341_4 = null;
	}

	@OriginalMember(owner = "client!aea", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method795() {
		this.anInt140 = this.anInt143;
		this.anInt141 = this.anInt145;
		this.anInt142 = this.anInt144;
		@Pc(17) Class341 local17 = this.aClass341_3;
		this.aClass341_3 = this.aClass341_4;
		this.aClass341_4 = local17;
		this.aClass341_4.method8525();
	}

	@OriginalMember(owner = "client!aea", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		@Pc(8) int local8 = arg0.getWheelRotation();
		this.method200(local2, 6, local8, local5);
		arg0.consume();
	}

	@OriginalMember(owner = "client!aea", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method201(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!aea", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method201(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!aea", name = "c", descriptor = "(I)V")
	@Override
	public void method798() {
		this.method203();
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(ILjava/awt/Component;)V")
	private void method204(@OriginalArg(1) Component arg0) {
		this.method203();
		this.aComponent1 = arg0;
		this.aComponent1.addMouseListener(this);
		this.aComponent1.addMouseMotionListener(this);
		this.aComponent1.addMouseWheelListener(this);
	}
}
