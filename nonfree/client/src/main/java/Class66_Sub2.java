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
public final class Class66_Sub2 extends Class66 implements MouseListener, MouseMotionListener, MouseWheelListener {

	@OriginalMember(owner = "client!wo", name = "k", descriptor = "I")
	private int anInt7438;

	@OriginalMember(owner = "client!wo", name = "l", descriptor = "I")
	private int anInt7439;

	@OriginalMember(owner = "client!wo", name = "n", descriptor = "I")
	private int anInt7440;

	@OriginalMember(owner = "client!wo", name = "o", descriptor = "I")
	private int anInt7441;

	@OriginalMember(owner = "client!wo", name = "p", descriptor = "I")
	private int anInt7442;

	@OriginalMember(owner = "client!wo", name = "q", descriptor = "I")
	private int anInt7443;

	@OriginalMember(owner = "client!wo", name = "s", descriptor = "Ljava/awt/Component;")
	private Component aComponent4;

	@OriginalMember(owner = "client!wo", name = "m", descriptor = "Lclient!nv;")
	private Class177 aClass177_52 = new Class177();

	@OriginalMember(owner = "client!wo", name = "r", descriptor = "Lclient!nv;")
	private Class177 aClass177_53 = new Class177();

	@OriginalMember(owner = "client!wo", name = "t", descriptor = "Z")
	private final boolean aBoolean501;

	@OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class66_Sub2(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method5978(arg0);
		this.aBoolean501 = arg1;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(I)Lclient!bq;")
	@Override
	public Class5_Sub4 method5963() {
		return (Class5_Sub4) this.aClass177_52.method3621();
	}

	@OriginalMember(owner = "client!wo", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method5979(arg0);
	}

	@OriginalMember(owner = "client!wo", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method5979(arg0);
	}

	@OriginalMember(owner = "client!wo", name = "c", descriptor = "(B)V")
	private void method5976() {
		if (this.aComponent4 == null) {
			return;
		}
		this.aComponent4.removeMouseWheelListener(this);
		this.aComponent4.removeMouseMotionListener(this);
		this.aComponent4.removeMouseListener(this);
		this.anInt7438 = this.anInt7439 = this.anInt7440 = 0;
		this.anInt7443 = this.anInt7441 = this.anInt7442 = 0;
		this.aClass177_53 = null;
		this.aComponent4 = null;
		this.aClass177_52 = null;
	}

	@OriginalMember(owner = "client!wo", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5970() {
		return (this.anInt7440 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!wo", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		@Pc(8) int local8 = arg0.getWheelRotation();
		this.method5980(local5, local8, local2, 6);
		arg0.consume();
	}

	@OriginalMember(owner = "client!wo", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!wo", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method5979(arg0);
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(B)V")
	@Override
	public synchronized void method5973() {
		this.anInt7439 = this.anInt7441;
		this.anInt7440 = this.anInt7442;
		this.anInt7438 = this.anInt7443;
		@Pc(21) Class177 local21 = this.aClass177_52;
		this.aClass177_52 = this.aClass177_53;
		this.aClass177_53 = local21;
		this.aClass177_53.method3614();
	}

	@OriginalMember(owner = "client!wo", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method5977(arg0);
		if (local4 == 1) {
			this.method5980(arg0.getY(), 0, arg0.getX(), 0);
		} else if (local4 == 4) {
			this.method5980(arg0.getY(), 0, arg0.getX(), 2);
		} else if (local4 == 2) {
			this.method5980(arg0.getY(), 0, arg0.getX(), 1);
		}
		this.anInt7442 |= local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!wo", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method5977(arg0);
		if ((this.anInt7442 & local4) == 0) {
			local4 = this.anInt7442;
		}
		if ((local4 & 0x1) != 0) {
			this.method5980(arg0.getY(), 0, arg0.getX(), 3);
		}
		if ((local4 & 0x4) != 0) {
			this.method5980(arg0.getY(), 0, arg0.getX(), 5);
		}
		if ((local4 & 0x2) != 0) {
			this.method5980(arg0.getY(), 0, arg0.getX(), 4);
		}
		this.anInt7442 &= ~local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;Z)I")
	private int method5977(@OriginalArg(0) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getModifiers();
		@Pc(11) boolean local11 = (local2 & 0x10) != 0;
		@Pc(26) boolean local26 = (local2 & 0x8) != 0;
		@Pc(34) boolean local34 = (local2 & 0x4) != 0;
		if (local26 && (local11 || local34)) {
			local26 = false;
		}
		if (local11 && local34) {
			return 4;
		} else if (local11) {
			return 1;
		} else if (local26) {
			return 2;
		} else if (local34) {
			return 4;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	private void method5978(@OriginalArg(0) Component arg0) {
		this.method5976();
		this.aComponent4 = arg0;
		this.aComponent4.addMouseListener(this);
		this.aComponent4.addMouseMotionListener(this);
		this.aComponent4.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!wo", name = "d", descriptor = "(I)Z")
	@Override
	protected boolean method5969() {
		return (this.anInt7440 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(BLjava/awt/event/MouseEvent;)V")
	private void method5979(@OriginalArg(1) MouseEvent arg0) {
		this.anInt7443 = arg0.getX();
		this.anInt7441 = arg0.getY();
		if (this.aBoolean501) {
			this.method5980(arg0.getY(), 0, arg0.getX(), -1);
		}
	}

	@OriginalMember(owner = "client!wo", name = "f", descriptor = "(I)V")
	@Override
	public void method5971() {
		this.method5976();
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(IIIII)V")
	private void method5980(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class5_Sub4_Sub1 local3 = new Class5_Sub4_Sub1();
		local3.anInt2402 = arg2;
		local3.anInt2401 = arg3;
		local3.anInt2403 = arg0;
		local3.aLong72 = Static446.method5903();
		local3.anInt2400 = arg1;
		this.aClass177_53.method3615(local3);
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(B)I")
	@Override
	public int method5965() {
		return this.anInt7438;
	}

	@OriginalMember(owner = "client!wo", name = "g", descriptor = "(I)I")
	@Override
	public int method5974() {
		return this.anInt7439;
	}

	@OriginalMember(owner = "client!wo", name = "h", descriptor = "(I)Z")
	@Override
	protected boolean method5975() {
		return (this.anInt7440 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!wo", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.anInt7441 = -1;
		this.anInt7443 = -1;
	}
}
