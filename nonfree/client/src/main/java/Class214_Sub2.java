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

@OriginalClass("client!uc")
public final class Class214_Sub2 extends Class214 implements MouseListener, MouseMotionListener, MouseWheelListener {

	@OriginalMember(owner = "client!uc", name = "e", descriptor = "I")
	private int anInt8403;

	@OriginalMember(owner = "client!uc", name = "f", descriptor = "I")
	private int anInt8404;

	@OriginalMember(owner = "client!uc", name = "g", descriptor = "I")
	private int anInt8405;

	@OriginalMember(owner = "client!uc", name = "h", descriptor = "I")
	private int anInt8406;

	@OriginalMember(owner = "client!uc", name = "i", descriptor = "I")
	private int anInt8407;

	@OriginalMember(owner = "client!uc", name = "j", descriptor = "I")
	private int anInt8408;

	@OriginalMember(owner = "client!uc", name = "m", descriptor = "Ljava/awt/Component;")
	private Component aComponent4;

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "Lclient!fea;")
	private Class99 aClass99_74 = new Class99();

	@OriginalMember(owner = "client!uc", name = "k", descriptor = "Lclient!fea;")
	private Class99 aClass99_75 = new Class99();

	@OriginalMember(owner = "client!uc", name = "l", descriptor = "Z")
	private final boolean aBoolean604;

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class214_Sub2(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method6778(arg0);
		this.aBoolean604 = arg1;
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method6767() {
		this.anInt8405 = this.anInt8408;
		this.anInt8404 = this.anInt8406;
		this.anInt8403 = this.anInt8407;
		@Pc(14) Class99 local14 = this.aClass99_74;
		this.aClass99_74 = this.aClass99_75;
		this.aClass99_75 = local14;
		this.aClass99_75.method2524();
	}

	@OriginalMember(owner = "client!uc", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "(B)I")
	@Override
	public int method6770() {
		return this.anInt8404;
	}

	@OriginalMember(owner = "client!uc", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method6776(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)I")
	private int method6775(@OriginalArg(0) MouseEvent arg0) {
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

	@OriginalMember(owner = "client!uc", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method6775(arg0);
		if (local4 == 1) {
			this.method6779(arg0.getY(), 0, 0, arg0.getX());
		} else if (local4 == 4) {
			this.method6779(arg0.getY(), 2, 0, arg0.getX());
		} else if (local4 == 2) {
			this.method6779(arg0.getY(), 1, 0, arg0.getX());
		}
		this.anInt8407 |= local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(III)V")
	private void method6776(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt8408 = arg1;
		this.anInt8406 = arg0;
		if (this.aBoolean604) {
			this.method6779(arg0, -1, 0, arg1);
		}
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(Z)V")
	private void method6777() {
		if (this.aComponent4 == null) {
			return;
		}
		this.aComponent4.removeMouseWheelListener(this);
		this.aComponent4.removeMouseMotionListener(this);
		this.aComponent4.removeMouseListener(this);
		this.aClass99_74 = null;
		this.aClass99_75 = null;
		this.aComponent4 = null;
		this.anInt8405 = this.anInt8404 = this.anInt8403 = 0;
		this.anInt8408 = this.anInt8406 = this.anInt8407 = 0;
	}

	@OriginalMember(owner = "client!uc", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method6776(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!uc", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method6776(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!uc", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		@Pc(8) int local8 = arg0.getWheelRotation();
		this.method6779(local5, 6, local8, local2);
		arg0.consume();
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)Z")
	@Override
	protected boolean method6765() {
		return (this.anInt8403 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Z)Z")
	@Override
	protected boolean method6769() {
		return (this.anInt8403 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!uc", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method6774() {
		return (this.anInt8403 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)I")
	@Override
	public int method6766() {
		return this.anInt8405;
	}

	@OriginalMember(owner = "client!uc", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method6775(arg0);
		if ((local4 & this.anInt8407) == 0) {
			local4 = this.anInt8407;
		}
		if ((local4 & 0x1) != 0) {
			this.method6779(arg0.getY(), 3, 0, arg0.getX());
		}
		if ((local4 & 0x4) != 0) {
			this.method6779(arg0.getY(), 5, 0, arg0.getX());
		}
		if ((local4 & 0x2) != 0) {
			this.method6779(arg0.getY(), 4, 0, arg0.getX());
		}
		this.anInt8407 &= ~local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!uc", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method6776(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(B)V")
	@Override
	public void method6768() {
		this.method6777();
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	private void method6778(@OriginalArg(0) Component arg0) {
		this.method6777();
		this.aComponent4 = arg0;
		this.aComponent4.addMouseListener(this);
		this.aComponent4.addMouseMotionListener(this);
		this.aComponent4.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIBII)V")
	private void method6779(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class5_Sub42_Sub2 local7 = new Class5_Sub42_Sub2();
		local7.anInt9146 = arg0;
		local7.anInt9144 = arg1;
		local7.anInt9145 = arg3;
		local7.aLong254 = Static105.method2132();
		local7.anInt9147 = arg2;
		this.aClass99_75.method2513(local7);
	}

	@OriginalMember(owner = "client!uc", name = "e", descriptor = "(I)Lclient!sda;")
	@Override
	public Class5_Sub42 method6773() {
		return (Class5_Sub42) this.aClass99_74.method2516();
	}
}
