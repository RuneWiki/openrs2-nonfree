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

@OriginalClass("client!oca")
public final class Class161_Sub2 extends Class161 implements MouseListener, MouseMotionListener, MouseWheelListener {

	@OriginalMember(owner = "client!oca", name = "d", descriptor = "I")
	private int anInt6737;

	@OriginalMember(owner = "client!oca", name = "f", descriptor = "I")
	private int anInt6738;

	@OriginalMember(owner = "client!oca", name = "g", descriptor = "I")
	private int anInt6739;

	@OriginalMember(owner = "client!oca", name = "h", descriptor = "I")
	private int anInt6740;

	@OriginalMember(owner = "client!oca", name = "i", descriptor = "I")
	private int anInt6741;

	@OriginalMember(owner = "client!oca", name = "k", descriptor = "I")
	private int anInt6742;

	@OriginalMember(owner = "client!oca", name = "m", descriptor = "Ljava/awt/Component;")
	private Component aComponent5;

	@OriginalMember(owner = "client!oca", name = "e", descriptor = "Lclient!ifa;")
	private Class163 aClass163_46 = new Class163();

	@OriginalMember(owner = "client!oca", name = "j", descriptor = "Lclient!ifa;")
	private Class163 aClass163_47 = new Class163();

	@OriginalMember(owner = "client!oca", name = "l", descriptor = "Z")
	private final boolean aBoolean518;

	@OriginalMember(owner = "client!oca", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class161_Sub2(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method5911(arg0);
		this.aBoolean518 = arg1;
	}

	@OriginalMember(owner = "client!oca", name = "f", descriptor = "(B)V")
	@Override
	public void method5907() {
		this.method5912();
	}

	@OriginalMember(owner = "client!oca", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		@Pc(8) int local8 = arg0.getWheelRotation();
		this.method5909(local8, local5, 6, local2);
		arg0.consume();
	}

	@OriginalMember(owner = "client!oca", name = "c", descriptor = "(I)Lclient!gn;")
	@Override
	public Class4_Sub15 method5906() {
		return (Class4_Sub15) this.aClass163_46.method3644();
	}

	@OriginalMember(owner = "client!oca", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method5908(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(Z)I")
	@Override
	public int method5898() {
		return this.anInt6739;
	}

	@OriginalMember(owner = "client!oca", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method5905() {
		return (this.anInt6737 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!oca", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method5908(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(I)Z")
	@Override
	protected boolean method5900() {
		return (this.anInt6737 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(III)V")
	private void method5908(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6741 = arg1;
		this.anInt6740 = arg0;
		if (this.aBoolean518) {
			this.method5909(0, arg0, -1, arg1);
		}
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(IIIBI)V")
	private void method5909(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class4_Sub15_Sub2 local7 = new Class4_Sub15_Sub2();
		local7.anInt5445 = arg1;
		local7.anInt5446 = arg2;
		local7.anInt5443 = arg3;
		local7.aLong168 = Static429.method5935();
		local7.anInt5444 = arg0;
		this.aClass163_47.method3646(local7);
	}

	@OriginalMember(owner = "client!oca", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method5910(arg0);
		if ((this.anInt6742 & local4) == 0) {
			local4 = this.anInt6742;
		}
		if ((local4 & 0x1) != 0) {
			this.method5909(arg0.getClickCount(), arg0.getY(), 3, arg0.getX());
		}
		if ((local4 & 0x4) != 0) {
			this.method5909(arg0.getClickCount(), arg0.getY(), 5, arg0.getX());
		}
		if ((local4 & 0x2) != 0) {
			this.method5909(arg0.getClickCount(), arg0.getY(), 4, arg0.getX());
		}
		this.anInt6742 &= ~local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!oca", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method5910(arg0);
		if (local4 == 1) {
			this.method5909(arg0.getClickCount(), arg0.getY(), 0, arg0.getX());
		} else if (local4 == 4) {
			this.method5909(arg0.getClickCount(), arg0.getY(), 2, arg0.getX());
		} else if (local4 == 2) {
			this.method5909(arg0.getClickCount(), arg0.getY(), 1, arg0.getX());
		}
		this.anInt6742 |= local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!oca", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method5908(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!oca", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!oca", name = "c", descriptor = "(B)V")
	@Override
	public synchronized void method5902() {
		this.anInt6737 = this.anInt6742;
		this.anInt6738 = this.anInt6741;
		this.anInt6739 = this.anInt6740;
		@Pc(20) Class163 local20 = this.aClass163_46;
		this.aClass163_46 = this.aClass163_47;
		this.aClass163_47 = local20;
		this.aClass163_47.method3643();
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;B)I")
	private int method5910(@OriginalArg(0) MouseEvent arg0) {
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

	@OriginalMember(owner = "client!oca", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method5908(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!oca", name = "b", descriptor = "(B)Z")
	@Override
	protected boolean method5901() {
		return (this.anInt6737 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(ILjava/awt/Component;)V")
	private void method5911(@OriginalArg(1) Component arg0) {
		this.method5912();
		this.aComponent5 = arg0;
		this.aComponent5.addMouseListener(this);
		this.aComponent5.addMouseMotionListener(this);
		this.aComponent5.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!oca", name = "b", descriptor = "(I)I")
	@Override
	public int method5903() {
		return this.anInt6738;
	}

	@OriginalMember(owner = "client!oca", name = "d", descriptor = "(I)V")
	private void method5912() {
		if (this.aComponent5 == null) {
			return;
		}
		this.aComponent5.removeMouseWheelListener(this);
		this.aComponent5.removeMouseMotionListener(this);
		this.aComponent5.removeMouseListener(this);
		this.anInt6738 = this.anInt6739 = this.anInt6737 = 0;
		this.aComponent5 = null;
		this.aClass163_47 = null;
		this.anInt6741 = this.anInt6740 = this.anInt6742 = 0;
		this.aClass163_46 = null;
	}
}
