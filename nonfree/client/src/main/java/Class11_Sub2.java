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

@OriginalClass("client!oc")
public final class Class11_Sub2 extends Class11 implements MouseListener, MouseMotionListener, MouseWheelListener {

	@OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
	private int anInt7325;

	@OriginalMember(owner = "client!oc", name = "i", descriptor = "I")
	private int anInt7326;

	@OriginalMember(owner = "client!oc", name = "j", descriptor = "I")
	private int anInt7327;

	@OriginalMember(owner = "client!oc", name = "l", descriptor = "I")
	private int anInt7328;

	@OriginalMember(owner = "client!oc", name = "m", descriptor = "I")
	private int anInt7329;

	@OriginalMember(owner = "client!oc", name = "n", descriptor = "I")
	private int anInt7330;

	@OriginalMember(owner = "client!oc", name = "q", descriptor = "Ljava/awt/Component;")
	private Component aComponent3;

	@OriginalMember(owner = "client!oc", name = "k", descriptor = "Lclient!fca;")
	private Class114 aClass114_49 = new Class114();

	@OriginalMember(owner = "client!oc", name = "o", descriptor = "Lclient!fca;")
	private Class114 aClass114_50 = new Class114();

	@OriginalMember(owner = "client!oc", name = "p", descriptor = "Z")
	private final boolean aBoolean634;

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class11_Sub2(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method6148(arg0);
		this.aBoolean634 = arg1;
	}

	@OriginalMember(owner = "client!oc", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method6152(arg0);
		if ((local4 & this.anInt7328) == 0) {
			local4 = this.anInt7328;
		}
		if ((local4 & 0x1) != 0) {
			this.method6150(arg0.getY(), arg0.getX(), arg0.getClickCount(), 3);
		}
		if ((local4 & 0x4) != 0) {
			this.method6150(arg0.getY(), arg0.getX(), arg0.getClickCount(), 5);
		}
		if ((local4 & 0x2) != 0) {
			this.method6150(arg0.getY(), arg0.getX(), arg0.getClickCount(), 4);
		}
		this.anInt7328 &= ~local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(BLjava/awt/Component;)V")
	private void method6148(@OriginalArg(1) Component arg0) {
		this.method6149();
		this.aComponent3 = arg0;
		this.aComponent3.addMouseListener(this);
		this.aComponent3.addMouseMotionListener(this);
		this.aComponent3.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!oc", name = "e", descriptor = "(I)I")
	@Override
	public int method6144() {
		return this.anInt7326;
	}

	@OriginalMember(owner = "client!oc", name = "i", descriptor = "(I)V")
	private void method6149() {
		if (this.aComponent3 == null) {
			return;
		}
		this.aComponent3.removeMouseWheelListener(this);
		this.aComponent3.removeMouseMotionListener(this);
		this.aComponent3.removeMouseListener(this);
		this.aClass114_50 = null;
		this.anInt7327 = this.anInt7326 = this.anInt7325 = 0;
		this.anInt7330 = this.anInt7329 = this.anInt7328 = 0;
		this.aClass114_49 = null;
		this.aComponent3 = null;
	}

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "(I)I")
	@Override
	public int method6141() {
		return this.anInt7327;
	}

	@OriginalMember(owner = "client!oc", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		@Pc(8) int local8 = arg0.getWheelRotation();
		this.method6150(local5, local2, local8, 6);
		arg0.consume();
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(B)V")
	@Override
	public synchronized void method6143() {
		this.anInt7325 = this.anInt7328;
		this.anInt7327 = this.anInt7330;
		this.anInt7326 = this.anInt7329;
		@Pc(14) Class114 local14 = this.aClass114_49;
		this.aClass114_49 = this.aClass114_50;
		this.aClass114_50 = local14;
		this.aClass114_50.method2808();
	}

	@OriginalMember(owner = "client!oc", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method6151(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!oc", name = "f", descriptor = "(I)Z")
	@Override
	protected boolean method6145() {
		return (this.anInt7325 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!oc", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method6146() {
		return (this.anInt7325 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!oc", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)Z")
	@Override
	protected boolean method6139() {
		return (this.anInt7325 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!oc", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method6151(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!oc", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method6151(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIIB)V")
	private void method6150(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class5_Sub7_Sub1 local3 = new Class5_Sub7_Sub1();
		local3.anInt642 = arg3;
		local3.anInt639 = arg0;
		local3.anInt641 = arg1;
		local3.aLong22 = Static547.method7619();
		local3.anInt640 = arg2;
		this.aClass114_50.method2807(local3);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(III)V")
	private void method6151(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt7329 = arg1;
		this.anInt7330 = arg0;
		if (this.aBoolean634) {
			this.method6150(arg1, arg0, 0, -1);
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
	@Override
	public void method6138() {
		this.method6149();
	}

	@OriginalMember(owner = "client!oc", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method6151(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(BLjava/awt/event/MouseEvent;)I")
	private int method6152(@OriginalArg(1) MouseEvent arg0) {
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

	@OriginalMember(owner = "client!oc", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method6152(arg0);
		if (local4 == 1) {
			this.method6150(arg0.getY(), arg0.getX(), arg0.getClickCount(), 0);
		} else if (local4 == 4) {
			this.method6150(arg0.getY(), arg0.getX(), arg0.getClickCount(), 2);
		} else if (local4 == 2) {
			this.method6150(arg0.getY(), arg0.getX(), arg0.getClickCount(), 1);
		}
		this.anInt7328 |= local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)Lclient!vt;")
	@Override
	public Class5_Sub7 method6142() {
		return (Class5_Sub7) this.aClass114_49.method2813();
	}
}
