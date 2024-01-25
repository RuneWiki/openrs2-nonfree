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

@OriginalClass("client!oi")
public final class Class214_Sub1 extends Class214 implements MouseListener, MouseMotionListener, MouseWheelListener {

	@OriginalMember(owner = "client!oi", name = "i", descriptor = "I")
	private int anInt6376;

	@OriginalMember(owner = "client!oi", name = "k", descriptor = "I")
	private int anInt6377;

	@OriginalMember(owner = "client!oi", name = "l", descriptor = "I")
	private int anInt6378;

	@OriginalMember(owner = "client!oi", name = "m", descriptor = "I")
	private int anInt6379;

	@OriginalMember(owner = "client!oi", name = "n", descriptor = "I")
	private int anInt6380;

	@OriginalMember(owner = "client!oi", name = "p", descriptor = "I")
	private int anInt6381;

	@OriginalMember(owner = "client!oi", name = "r", descriptor = "Ljava/awt/Component;")
	private Component aComponent3;

	@OriginalMember(owner = "client!oi", name = "j", descriptor = "Lclient!rk;")
	private Class249 aClass249_35 = new Class249();

	@OriginalMember(owner = "client!oi", name = "o", descriptor = "Lclient!rk;")
	private Class249 aClass249_36 = new Class249();

	@OriginalMember(owner = "client!oi", name = "q", descriptor = "Z")
	private final boolean aBoolean476;

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class214_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method5454(arg0);
		this.aBoolean476 = arg1;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
	private void method5454(@OriginalArg(0) Component arg0) {
		this.method5458();
		this.aComponent3 = arg0;
		this.aComponent3.addMouseListener(this);
		this.aComponent3.addMouseMotionListener(this);
		this.aComponent3.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)I")
	private int method5455(@OriginalArg(1) MouseEvent arg0) {
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

	@OriginalMember(owner = "client!oi", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method5456(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!oi", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method5456(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(III)V")
	private void method5456(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt6380 = arg0;
		this.anInt6381 = arg1;
		if (this.aBoolean476) {
			this.method5457(arg0, 0, -1, arg1);
		}
	}

	@OriginalMember(owner = "client!oi", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method5455(arg0);
		if ((local4 & this.anInt6379) == 0) {
			local4 = this.anInt6379;
		}
		if ((local4 & 0x1) != 0) {
			this.method5457(arg0.getY(), 0, 3, arg0.getX());
		}
		if ((local4 & 0x4) != 0) {
			this.method5457(arg0.getY(), 0, 5, arg0.getX());
		}
		if ((local4 & 0x2) != 0) {
			this.method5457(arg0.getY(), 0, 4, arg0.getX());
		}
		this.anInt6379 &= ~local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!oi", name = "d", descriptor = "(B)Lclient!wi;")
	@Override
	public Class2_Sub26 method7242() {
		return (Class2_Sub26) this.aClass249_35.method6529();
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIIII)V")
	private void method5457(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class2_Sub26_Sub2 local3 = new Class2_Sub26_Sub2();
		local3.anInt7943 = arg0;
		local3.anInt7944 = arg2;
		local3.anInt7946 = arg3;
		local3.aLong193 = Static143.method2502();
		local3.anInt7945 = arg1;
		this.aClass249_36.method6523(local3);
	}

	@OriginalMember(owner = "client!oi", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method5455(arg0);
		if (local4 == 1) {
			this.method5457(arg0.getY(), 0, 0, arg0.getX());
		} else if (local4 == 4) {
			this.method5457(arg0.getY(), 0, 2, arg0.getX());
		} else if (local4 == 2) {
			this.method5457(arg0.getY(), 0, 1, arg0.getX());
		}
		this.anInt6379 |= local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!oi", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method7245() {
		this.anInt6378 = this.anInt6380;
		this.anInt6377 = this.anInt6381;
		this.anInt6376 = this.anInt6379;
		@Pc(14) Class249 local14 = this.aClass249_35;
		this.aClass249_35 = this.aClass249_36;
		this.aClass249_36 = local14;
		this.aClass249_36.method6530();
	}

	@OriginalMember(owner = "client!oi", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!oi", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		@Pc(8) int local8 = arg0.getWheelRotation();
		this.method5457(local5, local8, 6, local2);
		arg0.consume();
	}

	@OriginalMember(owner = "client!oi", name = "c", descriptor = "(I)I")
	@Override
	public int method7241() {
		return this.anInt6377;
	}

	@OriginalMember(owner = "client!oi", name = "c", descriptor = "(B)I")
	@Override
	public int method7240() {
		return this.anInt6378;
	}

	@OriginalMember(owner = "client!oi", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method5456(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!oi", name = "f", descriptor = "(I)V")
	private void method5458() {
		if (this.aComponent3 == null) {
			return;
		}
		this.aComponent3.removeMouseWheelListener(this);
		this.aComponent3.removeMouseMotionListener(this);
		this.aComponent3.removeMouseListener(this);
		this.aComponent3 = null;
		this.aClass249_35 = null;
		this.anInt6377 = this.anInt6378 = this.anInt6376 = 0;
		this.anInt6381 = this.anInt6380 = this.anInt6379 = 0;
		this.aClass249_36 = null;
	}

	@OriginalMember(owner = "client!oi", name = "f", descriptor = "(B)Z")
	@Override
	public boolean method7244() {
		return (this.anInt6376 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!oi", name = "e", descriptor = "(I)Z")
	@Override
	protected boolean method7249() {
		return (this.anInt6376 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!oi", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method5456(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!oi", name = "g", descriptor = "(B)V")
	@Override
	public void method7247() {
		this.method5458();
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(B)Z")
	@Override
	protected boolean method7237() {
		return (this.anInt6376 & 0x4) != 0;
	}
}
