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

@OriginalClass("client!gp")
public final class Class138_Sub1 extends Class138 implements MouseListener, MouseMotionListener, MouseWheelListener {

	@OriginalMember(owner = "client!gp", name = "n", descriptor = "I")
	private int anInt3451;

	@OriginalMember(owner = "client!gp", name = "p", descriptor = "I")
	private int anInt3452;

	@OriginalMember(owner = "client!gp", name = "k", descriptor = "I")
	private int anInt3453;

	@OriginalMember(owner = "client!gp", name = "m", descriptor = "I")
	private int anInt3454;

	@OriginalMember(owner = "client!gp", name = "h", descriptor = "I")
	private int anInt3455;

	@OriginalMember(owner = "client!gp", name = "g", descriptor = "I")
	private int anInt3456;

	@OriginalMember(owner = "client!gp", name = "o", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!gp", name = "i", descriptor = "Lclient!cga;")
	private Class60 aClass60_69 = new Class60();

	@OriginalMember(owner = "client!gp", name = "j", descriptor = "Lclient!cga;")
	private Class60 aClass60_70 = new Class60();

	@OriginalMember(owner = "client!gp", name = "l", descriptor = "Z")
	private final boolean aBoolean315;

	@OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	private Class138_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method3032(arg0, (byte) 119);
		this.aBoolean315 = arg1;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIZ)V")
	private void method3031(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3454 = arg1;
		this.anInt3455 = arg0;
		if (this.aBoolean315) {
			this.method3034(-1, arg0, arg1, 0);
		}
	}

	@OriginalMember(owner = "client!gp", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method3031(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!gp", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		@Pc(8) int local8 = arg0.getWheelRotation();
		this.method3034(6, local2, local5, local8);
		arg0.consume();
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	private void method3032(@OriginalArg(0) Component arg0, @OriginalArg(1) byte arg1) {
		this.method3033();
		this.aComponent1 = arg0;
		this.aComponent1.addMouseListener(this);
		if (arg1 != 119) {
			this.method4770();
		}
		this.aComponent1.addMouseMotionListener(this);
		this.aComponent1.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!gp", name = "c", descriptor = "(I)I")
	@Override
	public int method4771() {
		return this.anInt3453;
	}

	@OriginalMember(owner = "client!gp", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method3031(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!gp", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method3031(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!gp", name = "h", descriptor = "(I)V")
	private void method3033() {
		if (this.aComponent1 == null) {
			return;
		}
		this.aComponent1.removeMouseWheelListener(this);
		this.aComponent1.removeMouseMotionListener(this);
		this.aComponent1.removeMouseListener(this);
		this.aClass60_69 = null;
		this.aComponent1 = null;
		this.anInt3451 = this.anInt3453 = this.anInt3452 = 0;
		this.aClass60_70 = null;
		this.anInt3455 = this.anInt3454 = this.anInt3456 = 0;
	}

	@OriginalMember(owner = "client!gp", name = "e", descriptor = "(I)V")
	@Override
	public synchronized void method4768() {
		this.anInt3451 = this.anInt3455;
		this.anInt3453 = this.anInt3454;
		this.anInt3452 = this.anInt3456;
		@Pc(14) Class60 local14 = this.aClass60_69;
		this.aClass60_69 = this.aClass60_70;
		this.aClass60_70 = local14;
		this.aClass60_70.method1223();
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIIZI)V")
	private void method3034(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class2_Sub18_Sub1 local3 = new Class2_Sub18_Sub1();
		local3.anInt1978 = arg2;
		local3.anInt1980 = arg0;
		local3.anInt1977 = arg1;
		local3.aLong70 = Static567.method7863();
		local3.anInt1979 = arg3;
		this.aClass60_70.method1233(local3);
	}

	@OriginalMember(owner = "client!gp", name = "f", descriptor = "(I)Lclient!em;")
	@Override
	public Class2_Sub18 method4772() {
		return (Class2_Sub18) this.aClass60_69.method1225();
	}

	@OriginalMember(owner = "client!gp", name = "g", descriptor = "(I)V")
	@Override
	public void method4770() {
		this.method3033();
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method4769() {
		return (this.anInt3452 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "(B)I")
	@Override
	public int method4767() {
		return this.anInt3451;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(BLjava/awt/event/MouseEvent;)I")
	private int method3035(@OriginalArg(1) MouseEvent arg0) {
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

	@OriginalMember(owner = "client!gp", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method3035(arg0);
		if ((local4 & this.anInt3456) == 0) {
			local4 = this.anInt3456;
		}
		if ((local4 & 0x1) != 0) {
			this.method3034(3, arg0.getX(), arg0.getY(), arg0.getClickCount());
		}
		if ((local4 & 0x4) != 0) {
			this.method3034(5, arg0.getX(), arg0.getY(), arg0.getClickCount());
		}
		if ((local4 & 0x2) != 0) {
			this.method3034(4, arg0.getX(), arg0.getY(), arg0.getClickCount());
		}
		this.anInt3456 &= ~local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!gp", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method3035(arg0);
		if (local4 == 1) {
			this.method3034(0, arg0.getX(), arg0.getY(), arg0.getClickCount());
		} else if (local4 == 4) {
			this.method3034(2, arg0.getX(), arg0.getY(), arg0.getClickCount());
		} else if (local4 == 2) {
			this.method3034(1, arg0.getX(), arg0.getY(), arg0.getClickCount());
		}
		this.anInt3456 |= local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "(I)Z")
	@Override
	protected boolean method4765() {
		return (this.anInt3452 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!gp", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method3031(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!gp", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!gp", name = "d", descriptor = "(I)Z")
	@Override
	protected boolean method4766() {
		return (this.anInt3452 & 0x4) != 0;
	}
}
