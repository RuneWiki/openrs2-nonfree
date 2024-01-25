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

@OriginalClass("client!iw")
public final class Class156_Sub1 extends Class156 implements MouseListener, MouseMotionListener, MouseWheelListener {

	@OriginalMember(owner = "client!iw", name = "d", descriptor = "I")
	private int anInt4448;

	@OriginalMember(owner = "client!iw", name = "e", descriptor = "I")
	private int anInt4449;

	@OriginalMember(owner = "client!iw", name = "f", descriptor = "I")
	private int anInt4450;

	@OriginalMember(owner = "client!iw", name = "i", descriptor = "I")
	private int anInt4451;

	@OriginalMember(owner = "client!iw", name = "j", descriptor = "I")
	private int anInt4452;

	@OriginalMember(owner = "client!iw", name = "k", descriptor = "I")
	private int anInt4453;

	@OriginalMember(owner = "client!iw", name = "m", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!iw", name = "g", descriptor = "Lclient!hga;")
	private Class130 aClass130_23 = new Class130();

	@OriginalMember(owner = "client!iw", name = "h", descriptor = "Lclient!hga;")
	private Class130 aClass130_24 = new Class130();

	@OriginalMember(owner = "client!iw", name = "l", descriptor = "Z")
	private final boolean aBoolean342;

	@OriginalMember(owner = "client!iw", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class156_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method3966(arg0);
		this.aBoolean342 = arg1;
	}

	@OriginalMember(owner = "client!iw", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5685() {
		return (this.anInt4450 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!iw", name = "c", descriptor = "(I)Z")
	@Override
	protected boolean method5688() {
		return (this.anInt4450 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(IIB)V")
	private void method3964(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4452 = arg1;
		this.anInt4453 = arg0;
		if (this.aBoolean342) {
			this.method3968(0, -1, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!iw", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method3964(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!iw", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method3967(arg0);
		if (local4 == 1) {
			this.method3968(arg0.getClickCount(), 0, arg0.getY(), arg0.getX());
		} else if (local4 == 4) {
			this.method3968(arg0.getClickCount(), 2, arg0.getY(), arg0.getX());
		} else if (local4 == 2) {
			this.method3968(arg0.getClickCount(), 1, arg0.getY(), arg0.getX());
		}
		this.anInt4451 |= local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!iw", name = "g", descriptor = "(I)V")
	private void method3965() {
		if (this.aComponent2 == null) {
			return;
		}
		this.aComponent2.removeMouseWheelListener(this);
		this.aComponent2.removeMouseMotionListener(this);
		this.aComponent2.removeMouseListener(this);
		this.anInt4452 = this.anInt4453 = this.anInt4451 = 0;
		this.aClass130_24 = null;
		this.anInt4449 = this.anInt4448 = this.anInt4450 = 0;
		this.aClass130_23 = null;
		this.aComponent2 = null;
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(BLjava/awt/Component;)V")
	private void method3966(@OriginalArg(1) Component arg0) {
		this.method3965();
		this.aComponent2 = arg0;
		this.aComponent2.addMouseListener(this);
		this.aComponent2.addMouseMotionListener(this);
		this.aComponent2.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!iw", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!iw", name = "f", descriptor = "(I)V")
	@Override
	public synchronized void method5692() {
		this.anInt4449 = this.anInt4452;
		this.anInt4450 = this.anInt4451;
		this.anInt4448 = this.anInt4453;
		@Pc(22) Class130 local22 = this.aClass130_23;
		this.aClass130_23 = this.aClass130_24;
		this.aClass130_24 = local22;
		this.aClass130_24.method3541();
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(Z)V")
	@Override
	public void method5687() {
		this.method3965();
	}

	@OriginalMember(owner = "client!iw", name = "d", descriptor = "(I)I")
	@Override
	public int method5689() {
		return this.anInt4449;
	}

	@OriginalMember(owner = "client!iw", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method3964(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)I")
	private int method3967(@OriginalArg(0) MouseEvent arg0) {
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

	@OriginalMember(owner = "client!iw", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method3964(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!iw", name = "c", descriptor = "(B)Lclient!nm;")
	@Override
	public Class3_Sub24 method5691() {
		return (Class3_Sub24) this.aClass130_23.method3545();
	}

	@OriginalMember(owner = "client!iw", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method3964(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(B)Z")
	@Override
	protected boolean method5683() {
		return (this.anInt4450 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(IIIII)V")
	private void method3968(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class3_Sub24_Sub2 local3 = new Class3_Sub24_Sub2();
		local3.anInt9350 = arg3;
		local3.anInt9349 = arg1;
		local3.anInt9352 = arg2;
		local3.aLong267 = Static587.method7753();
		local3.anInt9351 = arg0;
		this.aClass130_24.method3548(local3);
	}

	@OriginalMember(owner = "client!iw", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		@Pc(8) int local8 = arg0.getWheelRotation();
		this.method3968(local8, 6, local5, local2);
		arg0.consume();
	}

	@OriginalMember(owner = "client!iw", name = "e", descriptor = "(I)I")
	@Override
	public int method5690() {
		return this.anInt4448;
	}

	@OriginalMember(owner = "client!iw", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method3967(arg0);
		if ((this.anInt4451 & local4) == 0) {
			local4 = this.anInt4451;
		}
		if ((local4 & 0x1) != 0) {
			this.method3968(arg0.getClickCount(), 3, arg0.getY(), arg0.getX());
		}
		if ((local4 & 0x4) != 0) {
			this.method3968(arg0.getClickCount(), 5, arg0.getY(), arg0.getX());
		}
		if ((local4 & 0x2) != 0) {
			this.method3968(arg0.getClickCount(), 4, arg0.getY(), arg0.getX());
		}
		this.anInt4451 &= ~local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}
}
