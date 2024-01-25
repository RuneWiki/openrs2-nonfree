import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class10_Sub1 extends Class10 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!ud", name = "v", descriptor = "I")
	private int anInt5848;

	@OriginalMember(owner = "client!ud", name = "D", descriptor = "I")
	private int anInt5855;

	@OriginalMember(owner = "client!ud", name = "I", descriptor = "I")
	private int anInt5858;

	@OriginalMember(owner = "client!ud", name = "K", descriptor = "I")
	private int anInt5860;

	@OriginalMember(owner = "client!ud", name = "L", descriptor = "I")
	private int anInt5861;

	@OriginalMember(owner = "client!ud", name = "M", descriptor = "I")
	private int anInt5862;

	@OriginalMember(owner = "client!ud", name = "P", descriptor = "Ljava/awt/Component;")
	private Component aComponent3;

	@OriginalMember(owner = "client!ud", name = "H", descriptor = "Lclient!kr;")
	private Class138 aClass138_42 = new Class138();

	@OriginalMember(owner = "client!ud", name = "O", descriptor = "Lclient!kr;")
	private Class138 aClass138_43 = new Class138();

	@OriginalMember(owner = "client!ud", name = "Q", descriptor = "Z")
	private final boolean aBoolean447;

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class10_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method5251(arg0);
		this.aBoolean447 = arg1;
	}

	@OriginalMember(owner = "client!ud", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ud", name = "f", descriptor = "(I)I")
	@Override
	public int method5242() {
		return this.anInt5858;
	}

	@OriginalMember(owner = "client!ud", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method5243() {
		return (this.anInt5848 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "(I)I")
	@Override
	public int method5240() {
		return this.anInt5855;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Z)Z")
	@Override
	protected boolean method5235() {
		return (this.anInt5848 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!ud", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method5255(arg0);
	}

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "(I)V")
	@Override
	public void method5239() {
		this.method5250();
	}

	@OriginalMember(owner = "client!ud", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method5249(arg0);
		if (local10 == 1) {
			this.method5248(0, arg0.getX(), arg0.getY());
		} else if (local10 == 4) {
			this.method5248(2, arg0.getX(), arg0.getY());
		} else if (local10 == 2) {
			this.method5248(1, arg0.getX(), arg0.getY());
		}
		this.anInt5862 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIII)V")
	private void method5248(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class3_Sub33_Sub1 local7 = new Class3_Sub33_Sub1();
		local7.anInt5745 = arg1;
		local7.anInt5747 = arg2;
		local7.anInt5744 = arg0;
		local7.aLong209 = Static288.method4512();
		this.aClass138_43.method3053(local7);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)I")
	private int method5249(@OriginalArg(1) MouseEvent arg0) {
		@Pc(6) int local6 = arg0.getModifiers();
		@Pc(17) boolean local17 = (local6 & 0x10) != 0;
		@Pc(25) boolean local25 = (local6 & 0x8) != 0;
		@Pc(36) boolean local36 = (local6 & 0x4) != 0;
		if (local25 && (local17 || local36)) {
			local25 = false;
		}
		if (local17 && local36) {
			return 4;
		} else if (local17) {
			return 1;
		} else if (local25) {
			return 2;
		} else if (local36) {
			return 4;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ud", name = "h", descriptor = "(I)V")
	private void method5250() {
		if (this.aComponent3 == null) {
			return;
		}
		this.aComponent3.removeMouseListener(this);
		this.aComponent3.removeMouseMotionListener(this);
		this.anInt5861 = this.anInt5860 = this.anInt5862 = 0;
		this.anInt5858 = this.anInt5855 = this.anInt5848 = 0;
		this.aComponent3 = null;
		this.aClass138_42 = null;
		this.aClass138_43 = null;
	}

	@OriginalMember(owner = "client!ud", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method5249(arg0);
		if ((this.anInt5862 & local8) == 0) {
			local8 = this.anInt5862;
		}
		if ((local8 & 0x1) != 0) {
			this.method5248(3, arg0.getX(), arg0.getY());
		}
		if ((local8 & 0x4) != 0) {
			this.method5248(5, arg0.getX(), arg0.getY());
		}
		if ((local8 & 0x2) != 0) {
			this.method5248(4, arg0.getX(), arg0.getY());
		}
		this.anInt5862 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ud", name = "e", descriptor = "(I)V")
	@Override
	public synchronized void method5241() {
		this.anInt5855 = this.anInt5860;
		this.anInt5858 = this.anInt5861;
		this.anInt5848 = this.anInt5862;
		@Pc(18) Class138 local18 = this.aClass138_42;
		this.aClass138_42 = this.aClass138_43;
		this.aClass138_43 = local18;
		this.aClass138_43.method3046();
	}

	@OriginalMember(owner = "client!ud", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method5255(arg0);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(BLjava/awt/Component;)V")
	private void method5251(@OriginalArg(1) Component arg0) {
		this.method5250();
		this.aComponent3 = arg0;
		this.aComponent3.addMouseListener(this);
		this.aComponent3.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)Lclient!ph;")
	@Override
	public Class3_Sub33 method5236() {
		return (Class3_Sub33) this.aClass138_42.method3047();
	}

	@OriginalMember(owner = "client!ud", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method5255(arg0);
	}

	@OriginalMember(owner = "client!ud", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.anInt5860 = -1;
		this.anInt5861 = -1;
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(B)Z")
	@Override
	protected boolean method5244() {
		return (this.anInt5848 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;B)V")
	private void method5255(@OriginalArg(0) MouseEvent arg0) {
		this.anInt5861 = arg0.getX();
		this.anInt5860 = arg0.getY();
		if (this.aBoolean447) {
			this.method5248(-1, arg0.getX(), arg0.getY());
		}
	}
}
