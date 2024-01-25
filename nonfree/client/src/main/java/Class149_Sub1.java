import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class149_Sub1 extends Class149 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!ia", name = "p", descriptor = "I")
	private int anInt4076;

	@OriginalMember(owner = "client!ia", name = "D", descriptor = "I")
	private int anInt4088;

	@OriginalMember(owner = "client!ia", name = "F", descriptor = "I")
	private int anInt4090;

	@OriginalMember(owner = "client!ia", name = "M", descriptor = "I")
	private int anInt4096;

	@OriginalMember(owner = "client!ia", name = "N", descriptor = "I")
	private int anInt4097;

	@OriginalMember(owner = "client!ia", name = "P", descriptor = "I")
	private int anInt4099;

	@OriginalMember(owner = "client!ia", name = "R", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!ia", name = "j", descriptor = "Lclient!ae;")
	private Class8 aClass8_20 = new Class8();

	@OriginalMember(owner = "client!ia", name = "L", descriptor = "Lclient!ae;")
	private Class8 aClass8_21 = new Class8();

	@OriginalMember(owner = "client!ia", name = "Q", descriptor = "Z")
	private final boolean aBoolean334;

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class149_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method3436(arg0);
		this.aBoolean334 = arg1;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z)Lclient!ew;")
	@Override
	public Class2_Sub16 method5878() {
		return (Class2_Sub16) this.aClass8_20.method217();
	}

	@OriginalMember(owner = "client!ia", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method3432(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!ia", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method5884() {
		return (this.anInt4076 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(B)V")
	@Override
	public void method5880() {
		this.method3433();
	}

	@OriginalMember(owner = "client!ia", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method3437(arg0);
		if ((local8 & this.anInt4097) == 0) {
			local8 = this.anInt4097;
		}
		if ((local8 & 0x1) != 0) {
			this.method3431(arg0.getY(), 3, arg0.getX(), arg0.getClickCount());
		}
		if ((local8 & 0x4) != 0) {
			this.method3431(arg0.getY(), 5, arg0.getX(), arg0.getClickCount());
		}
		if ((local8 & 0x2) != 0) {
			this.method3431(arg0.getY(), 4, arg0.getX(), arg0.getClickCount());
		}
		this.anInt4097 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ia", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method3432(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!ia", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method3432(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(I)I")
	@Override
	public int method5875() {
		return this.anInt4088;
	}

	@OriginalMember(owner = "client!ia", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method3437(arg0);
		if (local10 == 1) {
			this.method3431(arg0.getY(), 0, arg0.getX(), arg0.getClickCount());
		} else if (local10 == 4) {
			this.method3431(arg0.getY(), 2, arg0.getX(), arg0.getClickCount());
		} else if (local10 == 2) {
			this.method3431(arg0.getY(), 1, arg0.getX(), arg0.getClickCount());
		}
		this.anInt4097 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IBIII)V")
	private void method3431(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) Class2_Sub16_Sub1 local13 = new Class2_Sub16_Sub1();
		local13.anInt6227 = arg3;
		local13.anInt6228 = arg1;
		local13.anInt6230 = arg0;
		local13.anInt6224 = arg2;
		local13.aLong156 = Static548.method7437();
		this.aClass8_21.method212(local13);
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(III)V")
	private void method3432(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4099 = arg1;
		this.anInt4096 = arg0;
		if (this.aBoolean334) {
			this.method3431(arg1, -1, arg0, 0);
		}
	}

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "(Z)V")
	@Override
	public synchronized void method5883() {
		this.anInt4076 = this.anInt4097;
		this.anInt4090 = this.anInt4096;
		this.anInt4088 = this.anInt4099;
		@Pc(18) Class8 local18 = this.aClass8_20;
		this.aClass8_20 = this.aClass8_21;
		this.aClass8_21 = local18;
		this.aClass8_21.method220();
	}

	@OriginalMember(owner = "client!ia", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ia", name = "d", descriptor = "(B)V")
	private void method3433() {
		if (this.aComponent1 == null) {
			return;
		}
		this.aComponent1.removeMouseMotionListener(this);
		this.aComponent1.removeMouseListener(this);
		this.anInt4096 = this.anInt4099 = this.anInt4097 = 0;
		this.aClass8_21 = null;
		this.anInt4090 = this.anInt4088 = this.anInt4076 = 0;
		this.aComponent1 = null;
		this.aClass8_20 = null;
	}

	@OriginalMember(owner = "client!ia", name = "d", descriptor = "(I)I")
	@Override
	public int method5879() {
		return this.anInt4090;
	}

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "(I)Z")
	@Override
	protected boolean method5881() {
		return (this.anInt4076 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	private void method3436(@OriginalArg(0) Component arg0) {
		this.method3433();
		this.aComponent1 = arg0;
		this.aComponent1.addMouseListener(this);
		this.aComponent1.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "(I)Z")
	@Override
	protected boolean method5876() {
		return (this.anInt4076 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;B)I")
	private int method3437(@OriginalArg(0) MouseEvent arg0) {
		@Pc(6) int local6 = arg0.getModifiers();
		@Pc(22) boolean local22 = (local6 & 0x10) != 0;
		@Pc(30) boolean local30 = (local6 & 0x8) != 0;
		@Pc(41) boolean local41 = (local6 & 0x4) != 0;
		if (local30 && (local22 || local41)) {
			local30 = false;
		}
		if (local22 && local41) {
			return 4;
		} else if (local22) {
			return 1;
		} else if (local30) {
			return 2;
		} else if (local41) {
			return 4;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ia", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method3432(arg0.getX(), arg0.getY());
	}
}
