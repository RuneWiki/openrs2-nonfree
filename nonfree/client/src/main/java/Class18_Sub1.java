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

@OriginalClass("client!ama")
public final class Class18_Sub1 extends Class18 implements MouseListener, MouseMotionListener, MouseWheelListener {

	@OriginalMember(owner = "client!ama", name = "j", descriptor = "I")
	private int anInt732;

	@OriginalMember(owner = "client!ama", name = "n", descriptor = "I")
	private int anInt733;

	@OriginalMember(owner = "client!ama", name = "k", descriptor = "I")
	private int anInt734;

	@OriginalMember(owner = "client!ama", name = "m", descriptor = "I")
	private int anInt735;

	@OriginalMember(owner = "client!ama", name = "g", descriptor = "I")
	private int anInt736;

	@OriginalMember(owner = "client!ama", name = "l", descriptor = "I")
	private int anInt737;

	@OriginalMember(owner = "client!ama", name = "i", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!ama", name = "h", descriptor = "Lclient!sja;")
	private Class342 aClass342_2 = new Class342();

	@OriginalMember(owner = "client!ama", name = "e", descriptor = "Lclient!sja;")
	private Class342 aClass342_3 = new Class342();

	@OriginalMember(owner = "client!ama", name = "f", descriptor = "Z")
	private final boolean aBoolean47;

	@OriginalMember(owner = "client!ama", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	private Class18_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method681(2, arg0);
		this.aBoolean47 = arg1;
	}

	@OriginalMember(owner = "client!ama", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method684(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!ama", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)I")
	private int method680(@OriginalArg(1) MouseEvent arg0) {
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

	@OriginalMember(owner = "client!ama", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method684(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!ama", name = "e", descriptor = "(I)V")
	@Override
	public synchronized void method4195() {
		this.anInt732 = this.anInt735;
		this.anInt733 = this.anInt737;
		this.anInt734 = this.anInt736;
		@Pc(23) Class342 local23 = this.aClass342_2;
		this.aClass342_2 = this.aClass342_3;
		this.aClass342_3 = local23;
		this.aClass342_3.method7655();
	}

	@OriginalMember(owner = "client!ama", name = "f", descriptor = "(I)I")
	@Override
	public int method4196() {
		return this.anInt733;
	}

	@OriginalMember(owner = "client!ama", name = "a", descriptor = "(ILjava/awt/Component;)V")
	private void method681(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1) {
		this.method682();
		this.aComponent1 = arg1;
		this.aComponent1.addMouseListener(this);
		this.aComponent1.addMouseMotionListener(this);
		this.aComponent1.addMouseWheelListener(this);
		if (arg0 != 2) {
			this.aClass342_2 = (Class342) null;
		}
	}

	@OriginalMember(owner = "client!ama", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method680(arg0);
		if (local4 == 1) {
			this.method683(arg0.getX(), arg0.getY(), 0, arg0.getClickCount());
		} else if (local4 == 4) {
			this.method683(arg0.getX(), arg0.getY(), 2, arg0.getClickCount());
		} else if (local4 == 2) {
			this.method683(arg0.getX(), arg0.getY(), 1, arg0.getClickCount());
		}
		this.anInt736 |= local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ama", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method4200() {
		return (this.anInt734 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ama", name = "a", descriptor = "(I)Z")
	@Override
	protected boolean method4201() {
		return (this.anInt734 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!ama", name = "c", descriptor = "(B)V")
	private void method682() {
		if (this.aComponent1 == null) {
			return;
		}
		this.aComponent1.removeMouseWheelListener(this);
		this.aComponent1.removeMouseMotionListener(this);
		this.aComponent1.removeMouseListener(this);
		this.anInt732 = this.anInt733 = this.anInt734 = 0;
		this.aClass342_3 = null;
		this.anInt735 = this.anInt737 = this.anInt736 = 0;
		this.aComponent1 = null;
		this.aClass342_2 = null;
	}

	@OriginalMember(owner = "client!ama", name = "a", descriptor = "(IIIII)V")
	private void method683(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class3_Sub23_Sub1 local3 = new Class3_Sub23_Sub1();
		local3.anInt3124 = arg2;
		local3.anInt3123 = arg1;
		local3.anInt3125 = arg0;
		local3.aLong123 = Static517.method6965();
		local3.anInt3126 = arg3;
		this.aClass342_3.method7654(local3);
	}

	@OriginalMember(owner = "client!ama", name = "a", descriptor = "(Z)Lclient!mn;")
	@Override
	public Class3_Sub23 method4198() {
		return (Class3_Sub23) this.aClass342_2.method7653();
	}

	@OriginalMember(owner = "client!ama", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		@Pc(8) int local8 = arg0.getWheelRotation();
		this.method683(local2, local5, 6, local8);
		arg0.consume();
	}

	@OriginalMember(owner = "client!ama", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method684(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!ama", name = "b", descriptor = "(B)I")
	@Override
	public int method4192() {
		return this.anInt732;
	}

	@OriginalMember(owner = "client!ama", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method684(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!ama", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ama", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method680(arg0);
		if ((local4 & this.anInt736) == 0) {
			local4 = this.anInt736;
		}
		if ((local4 & 0x1) != 0) {
			this.method683(arg0.getX(), arg0.getY(), 3, arg0.getClickCount());
		}
		if ((local4 & 0x4) != 0) {
			this.method683(arg0.getX(), arg0.getY(), 5, arg0.getClickCount());
		}
		if ((local4 & 0x2) != 0) {
			this.method683(arg0.getX(), arg0.getY(), 4, arg0.getClickCount());
		}
		this.anInt736 &= ~local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ama", name = "d", descriptor = "(I)Z")
	@Override
	protected boolean method4191() {
		return (this.anInt734 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!ama", name = "c", descriptor = "(I)V")
	@Override
	public void method4197() {
		this.method682();
	}

	@OriginalMember(owner = "client!ama", name = "a", descriptor = "(III)V")
	private void method684(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt737 = arg1;
		this.anInt735 = arg0;
		if (this.aBoolean47) {
			this.method683(arg0, arg1, -1, 0);
		}
	}
}
