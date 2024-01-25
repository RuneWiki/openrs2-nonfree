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

@OriginalClass("client!v")
public final class Class358_Sub1 extends Class358 implements MouseListener, MouseMotionListener, MouseWheelListener {

	@OriginalMember(owner = "client!v", name = "h", descriptor = "I")
	private int anInt9913;

	@OriginalMember(owner = "client!v", name = "i", descriptor = "I")
	private int anInt9914;

	@OriginalMember(owner = "client!v", name = "j", descriptor = "I")
	private int anInt9915;

	@OriginalMember(owner = "client!v", name = "l", descriptor = "I")
	private int anInt9916;

	@OriginalMember(owner = "client!v", name = "m", descriptor = "I")
	private int anInt9917;

	@OriginalMember(owner = "client!v", name = "n", descriptor = "I")
	private int anInt9918;

	@OriginalMember(owner = "client!v", name = "o", descriptor = "Ljava/awt/Component;")
	private Component aComponent4;

	@OriginalMember(owner = "client!v", name = "g", descriptor = "Lclient!fh;")
	private Class114 aClass114_60 = new Class114();

	@OriginalMember(owner = "client!v", name = "k", descriptor = "Lclient!fh;")
	private Class114 aClass114_61 = new Class114();

	@OriginalMember(owner = "client!v", name = "p", descriptor = "Z")
	private final boolean aBoolean714;

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class358_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method8429(arg0);
		this.aBoolean714 = arg1;
	}

	@OriginalMember(owner = "client!v", name = "e", descriptor = "(I)V")
	@Override
	public void method8728() {
		this.method8428();
	}

	@OriginalMember(owner = "client!v", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method8727() {
		this.anInt9913 = this.anInt9918;
		this.anInt9915 = this.anInt9916;
		this.anInt9914 = this.anInt9917;
		@Pc(14) Class114 local14 = this.aClass114_60;
		this.aClass114_60 = this.aClass114_61;
		this.aClass114_61 = local14;
		this.aClass114_61.method2768();
	}

	@OriginalMember(owner = "client!v", name = "g", descriptor = "(I)V")
	private void method8428() {
		if (this.aComponent4 == null) {
			return;
		}
		this.aComponent4.removeMouseWheelListener(this);
		this.aComponent4.removeMouseMotionListener(this);
		this.aComponent4.removeMouseListener(this);
		this.aComponent4 = null;
		this.anInt9917 = this.anInt9916 = this.anInt9918 = 0;
		this.anInt9914 = this.anInt9915 = this.anInt9913 = 0;
		this.aClass114_61 = null;
		this.aClass114_60 = null;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(BLjava/awt/Component;)V")
	private void method8429(@OriginalArg(1) Component arg0) {
		this.method8428();
		this.aComponent4 = arg0;
		this.aComponent4.addMouseListener(this);
		this.aComponent4.addMouseMotionListener(this);
		this.aComponent4.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!v", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method8431(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(B)I")
	@Override
	public int method8722() {
		return this.anInt9914;
	}

	@OriginalMember(owner = "client!v", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method8431(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIII)V")
	private void method8430(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class2_Sub1_Sub2 local3 = new Class2_Sub1_Sub2();
		local3.anInt8324 = arg3;
		local3.anInt8327 = arg2;
		local3.anInt8325 = arg1;
		local3.aLong221 = Static48.method1203();
		local3.anInt8326 = arg0;
		this.aClass114_61.method2771(local3);
	}

	@OriginalMember(owner = "client!v", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method8431(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8723() {
		return (this.anInt9913 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!v", name = "c", descriptor = "(B)Z")
	@Override
	protected boolean method8730() {
		return (this.anInt9913 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(I)I")
	@Override
	public int method8721() {
		return this.anInt9915;
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(I)Lclient!cia;")
	@Override
	public Class2_Sub1 method8724() {
		return (Class2_Sub1) this.aClass114_60.method2765();
	}

	@OriginalMember(owner = "client!v", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method8432(arg0);
		if ((local4 & this.anInt9918) == 0) {
			local4 = this.anInt9918;
		}
		if ((local4 & 0x1) != 0) {
			this.method8430(arg0.getClickCount(), arg0.getX(), 3, arg0.getY());
		}
		if ((local4 & 0x4) != 0) {
			this.method8430(arg0.getClickCount(), arg0.getX(), 5, arg0.getY());
		}
		if ((local4 & 0x2) != 0) {
			this.method8430(arg0.getClickCount(), arg0.getX(), 4, arg0.getY());
		}
		this.anInt9918 &= ~local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(III)V")
	private void method8431(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt9916 = arg0;
		this.anInt9917 = arg1;
		if (this.aBoolean714) {
			this.method8430(0, arg1, -1, arg0);
		}
	}

	@OriginalMember(owner = "client!v", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method8431(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)I")
	private int method8432(@OriginalArg(0) MouseEvent arg0) {
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

	@OriginalMember(owner = "client!v", name = "f", descriptor = "(I)Z")
	@Override
	protected boolean method8729() {
		return (this.anInt9913 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!v", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!v", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		@Pc(8) int local8 = arg0.getWheelRotation();
		this.method8430(local8, local2, 6, local5);
		arg0.consume();
	}

	@OriginalMember(owner = "client!v", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method8432(arg0);
		if (local4 == 1) {
			this.method8430(arg0.getClickCount(), arg0.getX(), 0, arg0.getY());
		} else if (local4 == 4) {
			this.method8430(arg0.getClickCount(), arg0.getX(), 2, arg0.getY());
		} else if (local4 == 2) {
			this.method8430(arg0.getClickCount(), arg0.getX(), 1, arg0.getY());
		}
		this.anInt9918 |= local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}
}
