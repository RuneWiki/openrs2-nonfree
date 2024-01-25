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

@OriginalClass("client!sf")
public final class Class71_Sub2 extends Class71 implements MouseListener, MouseMotionListener, MouseWheelListener {

	@OriginalMember(owner = "client!sf", name = "g", descriptor = "I")
	private int anInt9014;

	@OriginalMember(owner = "client!sf", name = "i", descriptor = "I")
	private int anInt9015;

	@OriginalMember(owner = "client!sf", name = "j", descriptor = "I")
	private int anInt9016;

	@OriginalMember(owner = "client!sf", name = "l", descriptor = "I")
	private int anInt9017;

	@OriginalMember(owner = "client!sf", name = "m", descriptor = "I")
	private int anInt9018;

	@OriginalMember(owner = "client!sf", name = "n", descriptor = "I")
	private int anInt9019;

	@OriginalMember(owner = "client!sf", name = "p", descriptor = "Ljava/awt/Component;")
	private Component aComponent5;

	@OriginalMember(owner = "client!sf", name = "h", descriptor = "Lclient!ada;")
	private Class8 aClass8_58 = new Class8();

	@OriginalMember(owner = "client!sf", name = "k", descriptor = "Lclient!ada;")
	private Class8 aClass8_59 = new Class8();

	@OriginalMember(owner = "client!sf", name = "o", descriptor = "Z")
	private final boolean aBoolean606;

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class71_Sub2(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method7709(arg0);
		this.aBoolean606 = arg1;
	}

	@OriginalMember(owner = "client!sf", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method7710(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method7695() {
		this.anInt9015 = this.anInt9017;
		this.anInt9014 = this.anInt9019;
		this.anInt9016 = this.anInt9018;
		@Pc(14) Class8 local14 = this.aClass8_58;
		this.aClass8_58 = this.aClass8_59;
		this.aClass8_59 = local14;
		this.aClass8_59.method154();
	}

	@OriginalMember(owner = "client!sf", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!sf", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		@Pc(8) int local8 = arg0.getWheelRotation();
		this.method7707(local8, local5, local2, 6);
		arg0.consume();
	}

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "(B)V")
	private void method7706() {
		if (this.aComponent5 == null) {
			return;
		}
		this.aComponent5.removeMouseWheelListener(this);
		this.aComponent5.removeMouseMotionListener(this);
		this.aComponent5.removeMouseListener(this);
		this.anInt9018 = this.anInt9017 = this.anInt9019 = 0;
		this.aClass8_58 = null;
		this.aComponent5 = null;
		this.anInt9016 = this.anInt9015 = this.anInt9014 = 0;
		this.aClass8_59 = null;
	}

	@OriginalMember(owner = "client!sf", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method7708(arg0);
		if ((this.anInt9019 & local4) == 0) {
			local4 = this.anInt9019;
		}
		if ((local4 & 0x1) != 0) {
			this.method7707(arg0.getClickCount(), arg0.getY(), arg0.getX(), 3);
		}
		if ((local4 & 0x4) != 0) {
			this.method7707(arg0.getClickCount(), arg0.getY(), arg0.getX(), 5);
		}
		if ((local4 & 0x2) != 0) {
			this.method7707(arg0.getClickCount(), arg0.getY(), arg0.getX(), 4);
		}
		this.anInt9019 &= ~local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIBII)V")
	private void method7707(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class6_Sub15_Sub1 local3 = new Class6_Sub15_Sub1();
		local3.anInt2544 = arg2;
		local3.anInt2542 = arg3;
		local3.anInt2545 = arg1;
		local3.aLong73 = Static32.method595();
		local3.anInt2543 = arg0;
		this.aClass8_59.method157(local3);
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(B)Z")
	@Override
	protected boolean method7699() {
		return (this.anInt9014 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "(I)Z")
	@Override
	protected boolean method7696() {
		return (this.anInt9014 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)I")
	private int method7708(@OriginalArg(0) MouseEvent arg0) {
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

	@OriginalMember(owner = "client!sf", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method7710(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!sf", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method7710(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILjava/awt/Component;)V")
	private void method7709(@OriginalArg(1) Component arg0) {
		this.method7706();
		this.aComponent5 = arg0;
		this.aComponent5.addMouseListener(this);
		this.aComponent5.addMouseMotionListener(this);
		this.aComponent5.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!sf", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method7708(arg0);
		if (local4 == 1) {
			this.method7707(arg0.getClickCount(), arg0.getY(), arg0.getX(), 0);
		} else if (local4 == 4) {
			this.method7707(arg0.getClickCount(), arg0.getY(), arg0.getX(), 2);
		} else if (local4 == 2) {
			this.method7707(arg0.getClickCount(), arg0.getY(), arg0.getX(), 1);
		}
		this.anInt9019 |= local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!sf", name = "e", descriptor = "(I)I")
	@Override
	public int method7701() {
		return this.anInt9016;
	}

	@OriginalMember(owner = "client!sf", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method7710(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Z)Lclient!wi;")
	@Override
	public Class6_Sub15 method7703() {
		return (Class6_Sub15) this.aClass8_58.method152();
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(III)V")
	private void method7710(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt9017 = arg0;
		this.anInt9018 = arg1;
		if (this.aBoolean606) {
			this.method7707(0, arg0, arg1, -1);
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7694() {
		return (this.anInt9014 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!sf", name = "f", descriptor = "(I)I")
	@Override
	public int method7702() {
		return this.anInt9015;
	}

	@OriginalMember(owner = "client!sf", name = "d", descriptor = "(I)V")
	@Override
	public void method7700() {
		this.method7706();
	}
}
