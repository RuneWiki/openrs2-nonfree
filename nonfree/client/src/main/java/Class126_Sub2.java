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

@OriginalClass("client!tc")
public final class Class126_Sub2 extends Class126 implements MouseListener, MouseMotionListener, MouseWheelListener {

	@OriginalMember(owner = "client!tc", name = "h", descriptor = "I")
	private int anInt6695;

	@OriginalMember(owner = "client!tc", name = "i", descriptor = "I")
	private int anInt6696;

	@OriginalMember(owner = "client!tc", name = "j", descriptor = "I")
	private int anInt6697;

	@OriginalMember(owner = "client!tc", name = "l", descriptor = "I")
	private int anInt6698;

	@OriginalMember(owner = "client!tc", name = "m", descriptor = "I")
	private int anInt6699;

	@OriginalMember(owner = "client!tc", name = "n", descriptor = "I")
	private int anInt6700;

	@OriginalMember(owner = "client!tc", name = "p", descriptor = "Ljava/awt/Component;")
	private Component aComponent4;

	@OriginalMember(owner = "client!tc", name = "k", descriptor = "Lclient!nj;")
	private Class181 aClass181_42 = new Class181();

	@OriginalMember(owner = "client!tc", name = "o", descriptor = "Lclient!nj;")
	private Class181 aClass181_43 = new Class181();

	@OriginalMember(owner = "client!tc", name = "q", descriptor = "Z")
	private final boolean aBoolean452;

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class126_Sub2(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method5368(arg0);
		this.aBoolean452 = arg1;
	}

	@OriginalMember(owner = "client!tc", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		@Pc(8) int local8 = arg0.getWheelRotation();
		this.method5370(local5, 6, local8, local2);
		arg0.consume();
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V")
	@Override
	public void method5357() {
		this.method5371();
	}

	@OriginalMember(owner = "client!tc", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method5367(arg0);
		if ((this.anInt6699 & local4) == 0) {
			local4 = this.anInt6699;
		}
		if ((local4 & 0x1) != 0) {
			this.method5370(arg0.getY(), 3, 0, arg0.getX());
		}
		if ((local4 & 0x4) != 0) {
			this.method5370(arg0.getY(), 5, 0, arg0.getX());
		}
		if ((local4 & 0x2) != 0) {
			this.method5370(arg0.getY(), 4, 0, arg0.getX());
		}
		this.anInt6699 &= ~local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!tc", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method5367(arg0);
		if (local4 == 1) {
			this.method5370(arg0.getY(), 0, 0, arg0.getX());
		} else if (local4 == 4) {
			this.method5370(arg0.getY(), 2, 0, arg0.getX());
		} else if (local4 == 2) {
			this.method5370(arg0.getY(), 1, 0, arg0.getX());
		}
		this.anInt6699 |= local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(B)I")
	@Override
	public int method5364() {
		return this.anInt6697;
	}

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method5361() {
		this.anInt6696 = this.anInt6700;
		this.anInt6697 = this.anInt6698;
		this.anInt6695 = this.anInt6699;
		@Pc(14) Class181 local14 = this.aClass181_42;
		this.aClass181_42 = this.aClass181_43;
		this.aClass181_43 = local14;
		this.aClass181_43.method3969();
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)I")
	private int method5367(@OriginalArg(1) MouseEvent arg0) {
		if (arg0.getButton() == 1) {
			return 1;
		} else if (arg0.getButton() == 2) {
			return 2;
		} else if (arg0.getButton() == 3) {
			return 4;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILjava/awt/Component;)V")
	private void method5368(@OriginalArg(1) Component arg0) {
		this.method5371();
		this.aComponent4 = arg0;
		this.aComponent4.addMouseListener(this);
		this.aComponent4.addMouseMotionListener(this);
		this.aComponent4.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!tc", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!tc", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method5369(arg0);
	}

	@OriginalMember(owner = "client!tc", name = "f", descriptor = "(I)I")
	@Override
	public int method5366() {
		return this.anInt6696;
	}

	@OriginalMember(owner = "client!tc", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.anInt6700 = -1;
		this.anInt6698 = -1;
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5358() {
		return (this.anInt6695 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Z)Z")
	@Override
	protected boolean method5355() {
		return (this.anInt6695 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!tc", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method5369(arg0);
	}

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "(B)Lclient!ic;")
	@Override
	public Class2_Sub11 method5365() {
		return (Class2_Sub11) this.aClass181_42.method3976();
	}

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "(I)Z")
	@Override
	protected boolean method5363() {
		return (this.anInt6695 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)V")
	private void method5369(@OriginalArg(0) MouseEvent arg0) {
		this.anInt6700 = arg0.getX();
		this.anInt6698 = arg0.getY();
		if (this.aBoolean452) {
			this.method5370(arg0.getY(), -1, 0, arg0.getX());
		}
	}

	@OriginalMember(owner = "client!tc", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method5369(arg0);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIII)V")
	private void method5370(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class2_Sub11_Sub2 local3 = new Class2_Sub11_Sub2();
		local3.anInt5507 = arg3;
		local3.anInt5508 = arg0;
		local3.anInt5506 = arg1;
		local3.aLong266 = Static432.method5870();
		local3.anInt5505 = arg2;
		this.aClass181_43.method3973(local3);
	}

	@OriginalMember(owner = "client!tc", name = "g", descriptor = "(I)V")
	private void method5371() {
		if (this.aComponent4 == null) {
			return;
		}
		this.aComponent4.removeMouseWheelListener(this);
		this.aComponent4.removeMouseMotionListener(this);
		this.aComponent4.removeMouseListener(this);
		this.anInt6700 = this.anInt6698 = this.anInt6699 = 0;
		this.aClass181_43 = null;
		this.aClass181_42 = null;
		this.anInt6696 = this.anInt6697 = this.anInt6695 = 0;
		this.aComponent4 = null;
	}
}
