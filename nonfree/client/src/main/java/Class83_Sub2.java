import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public final class Class83_Sub2 extends Class83 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
	private int anInt8984;

	@OriginalMember(owner = "client!sc", name = "p", descriptor = "I")
	private int anInt8991;

	@OriginalMember(owner = "client!sc", name = "q", descriptor = "I")
	private int anInt8992;

	@OriginalMember(owner = "client!sc", name = "H", descriptor = "I")
	private int anInt9008;

	@OriginalMember(owner = "client!sc", name = "I", descriptor = "I")
	private int anInt9009;

	@OriginalMember(owner = "client!sc", name = "K", descriptor = "I")
	private int anInt9011;

	@OriginalMember(owner = "client!sc", name = "M", descriptor = "Ljava/awt/Component;")
	private Component aComponent5;

	@OriginalMember(owner = "client!sc", name = "B", descriptor = "Lclient!au;")
	private Class22 aClass22_59 = new Class22();

	@OriginalMember(owner = "client!sc", name = "L", descriptor = "Lclient!au;")
	private Class22 aClass22_60 = new Class22();

	@OriginalMember(owner = "client!sc", name = "N", descriptor = "Z")
	private final boolean aBoolean625;

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class83_Sub2(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method6906(arg0);
		this.aBoolean625 = arg1;
	}

	@OriginalMember(owner = "client!sc", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method6907(arg0);
		if ((this.anInt9011 & local8) == 0) {
			local8 = this.anInt9011;
		}
		if ((local8 & 0x1) != 0) {
			this.method6904(arg0.getY(), arg0.getX(), arg0.getClickCount(), 3);
		}
		if ((local8 & 0x4) != 0) {
			this.method6904(arg0.getY(), arg0.getX(), arg0.getClickCount(), 5);
		}
		if ((local8 & 0x2) != 0) {
			this.method6904(arg0.getY(), arg0.getX(), arg0.getClickCount(), 4);
		}
		this.anInt9011 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!sc", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method6908(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!sc", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method6908(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method6901() {
		return (this.anInt8992 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z)I")
	@Override
	public int method6895() {
		return this.anInt8991;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIII)V")
	private void method6904(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class4_Sub24_Sub2 local7 = new Class4_Sub24_Sub2();
		local7.anInt8219 = arg0;
		local7.anInt8217 = arg1;
		local7.anInt8208 = arg3;
		local7.anInt8213 = arg2;
		local7.aLong218 = Static112.method2047();
		this.aClass22_60.method894(local7);
	}

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "(I)V")
	@Override
	public synchronized void method6902() {
		this.anInt8992 = this.anInt9011;
		this.anInt8991 = this.anInt9008;
		this.anInt8984 = this.anInt9009;
		@Pc(18) Class22 local18 = this.aClass22_59;
		this.aClass22_59 = this.aClass22_60;
		this.aClass22_60 = local18;
		this.aClass22_60.method886();
	}

	@OriginalMember(owner = "client!sc", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method6907(arg0);
		if (local10 == 1) {
			this.method6904(arg0.getY(), arg0.getX(), arg0.getClickCount(), 0);
		} else if (local10 == 4) {
			this.method6904(arg0.getY(), arg0.getX(), arg0.getClickCount(), 2);
		} else if (local10 == 2) {
			this.method6904(arg0.getY(), arg0.getX(), arg0.getClickCount(), 1);
		}
		this.anInt9011 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!sc", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(B)Lclient!rl;")
	@Override
	public Class4_Sub24 method6897() {
		return (Class4_Sub24) this.aClass22_59.method896();
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)V")
	@Override
	public void method6894() {
		this.method6910();
	}

	@OriginalMember(owner = "client!sc", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method6908(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!sc", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method6908(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)Z")
	@Override
	protected boolean method6893() {
		return (this.anInt8992 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BLjava/awt/Component;)V")
	private void method6906(@OriginalArg(1) Component arg0) {
		this.method6910();
		this.aComponent5 = arg0;
		this.aComponent5.addMouseListener(this);
		this.aComponent5.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BLjava/awt/event/MouseEvent;)I")
	private int method6907(@OriginalArg(1) MouseEvent arg0) {
		@Pc(6) int local6 = arg0.getModifiers();
		@Pc(17) boolean local17 = (local6 & 0x10) != 0;
		@Pc(25) boolean local25 = (local6 & 0x8) != 0;
		@Pc(39) boolean local39 = (local6 & 0x4) != 0;
		if (local25 && (local17 || local39)) {
			local25 = false;
		}
		if (local17 && local39) {
			return 4;
		} else if (local17) {
			return 1;
		} else if (local25) {
			return 2;
		} else if (local39) {
			return 4;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BII)V")
	private void method6908(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt9008 = arg0;
		this.anInt9009 = arg1;
		if (this.aBoolean625) {
			this.method6904(arg1, arg0, 0, -1);
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)I")
	@Override
	public int method6896() {
		return this.anInt8984;
	}

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "(I)Z")
	@Override
	protected boolean method6903() {
		return (this.anInt8992 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!sc", name = "h", descriptor = "(I)V")
	private void method6910() {
		if (this.aComponent5 == null) {
			return;
		}
		this.aComponent5.removeMouseMotionListener(this);
		this.aComponent5.removeMouseListener(this);
		this.anInt9008 = this.anInt9009 = this.anInt9011 = 0;
		this.aClass22_59 = null;
		this.aComponent5 = null;
		this.aClass22_60 = null;
		this.anInt8991 = this.anInt8984 = this.anInt8992 = 0;
	}
}
