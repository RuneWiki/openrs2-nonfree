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

@OriginalClass("client!nl")
public final class Class238_Sub1 extends Class238 implements MouseListener, MouseMotionListener, MouseWheelListener {

	@OriginalMember(owner = "client!nl", name = "g", descriptor = "I")
	private int anInt6448;

	@OriginalMember(owner = "client!nl", name = "h", descriptor = "I")
	private int anInt6449;

	@OriginalMember(owner = "client!nl", name = "i", descriptor = "I")
	private int anInt6450;

	@OriginalMember(owner = "client!nl", name = "k", descriptor = "I")
	private int anInt6451;

	@OriginalMember(owner = "client!nl", name = "m", descriptor = "I")
	private int anInt6452;

	@OriginalMember(owner = "client!nl", name = "n", descriptor = "I")
	private int anInt6453;

	@OriginalMember(owner = "client!nl", name = "o", descriptor = "Ljava/awt/Component;")
	private Component aComponent4;

	@OriginalMember(owner = "client!nl", name = "j", descriptor = "Lclient!gca;")
	private Class111 aClass111_38 = new Class111();

	@OriginalMember(owner = "client!nl", name = "l", descriptor = "Lclient!gca;")
	private Class111 aClass111_39 = new Class111();

	@OriginalMember(owner = "client!nl", name = "p", descriptor = "Z")
	private final boolean aBoolean504;

	@OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class238_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method5240(arg0);
		this.aBoolean504 = arg1;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)I")
	private int method5237(@OriginalArg(1) MouseEvent arg0) {
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

	@OriginalMember(owner = "client!nl", name = "e", descriptor = "(B)Z")
	@Override
	protected boolean method5658() {
		return (this.anInt6450 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!nl", name = "d", descriptor = "(I)I")
	@Override
	public int method5661() {
		return this.anInt6449;
	}

	@OriginalMember(owner = "client!nl", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method5237(arg0);
		if ((local4 & this.anInt6452) == 0) {
			local4 = this.anInt6452;
		}
		if ((local4 & 0x1) != 0) {
			this.method5238(arg0.getY(), arg0.getX(), 3, arg0.getClickCount());
		}
		if ((local4 & 0x4) != 0) {
			this.method5238(arg0.getY(), arg0.getX(), 5, arg0.getClickCount());
		}
		if ((local4 & 0x2) != 0) {
			this.method5238(arg0.getY(), arg0.getX(), 4, arg0.getClickCount());
		}
		this.anInt6452 &= ~local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)V")
	@Override
	public void method5651() {
		this.method5241();
	}

	@OriginalMember(owner = "client!nl", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "(B)Lclient!bs;")
	@Override
	public Class1_Sub12 method5654() {
		return (Class1_Sub12) this.aClass111_38.method2553();
	}

	@OriginalMember(owner = "client!nl", name = "d", descriptor = "(B)V")
	@Override
	public synchronized void method5656() {
		this.anInt6449 = this.anInt6453;
		this.anInt6450 = this.anInt6452;
		this.anInt6448 = this.anInt6451;
		@Pc(14) Class111 local14 = this.aClass111_38;
		this.aClass111_38 = this.aClass111_39;
		this.aClass111_39 = local14;
		this.aClass111_39.method2555();
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IBIII)V")
	private void method5238(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class1_Sub12_Sub1 local3 = new Class1_Sub12_Sub1();
		local3.anInt4521 = arg1;
		local3.anInt4522 = arg2;
		local3.anInt4524 = arg0;
		local3.aLong114 = Static480.method6650();
		local3.anInt4523 = arg3;
		this.aClass111_39.method2552(local3);
	}

	@OriginalMember(owner = "client!nl", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method5239(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!nl", name = "f", descriptor = "(I)Z")
	@Override
	protected boolean method5663() {
		return (this.anInt6450 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIZ)V")
	private void method5239(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6453 = arg1;
		this.anInt6451 = arg0;
		if (this.aBoolean504) {
			this.method5238(arg0, arg1, -1, 0);
		}
	}

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5652() {
		return (this.anInt6450 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	private void method5240(@OriginalArg(0) Component arg0) {
		this.method5241();
		this.aComponent4 = arg0;
		this.aComponent4.addMouseListener(this);
		this.aComponent4.addMouseMotionListener(this);
		this.aComponent4.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(B)I")
	@Override
	public int method5653() {
		return this.anInt6448;
	}

	@OriginalMember(owner = "client!nl", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method5239(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!nl", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method5239(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!nl", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		@Pc(8) int local8 = arg0.getWheelRotation();
		this.method5238(local5, local2, 6, local8);
		arg0.consume();
	}

	@OriginalMember(owner = "client!nl", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method5237(arg0);
		if (local4 == 1) {
			this.method5238(arg0.getY(), arg0.getX(), 0, arg0.getClickCount());
		} else if (local4 == 4) {
			this.method5238(arg0.getY(), arg0.getX(), 2, arg0.getClickCount());
		} else if (local4 == 2) {
			this.method5238(arg0.getY(), arg0.getX(), 1, arg0.getClickCount());
		}
		this.anInt6452 |= local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!nl", name = "g", descriptor = "(I)V")
	private void method5241() {
		if (this.aComponent4 == null) {
			return;
		}
		this.aComponent4.removeMouseWheelListener(this);
		this.aComponent4.removeMouseMotionListener(this);
		this.aComponent4.removeMouseListener(this);
		this.aClass111_39 = null;
		this.aComponent4 = null;
		this.anInt6453 = this.anInt6451 = this.anInt6452 = 0;
		this.anInt6449 = this.anInt6448 = this.anInt6450 = 0;
		this.aClass111_38 = null;
	}

	@OriginalMember(owner = "client!nl", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method5239(arg0.getY(), arg0.getX());
	}
}
