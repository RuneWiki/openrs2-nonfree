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

@OriginalClass("client!uf")
public final class Class335_Sub2 extends Class335 implements MouseListener, MouseMotionListener, MouseWheelListener {

	@OriginalMember(owner = "client!uf", name = "h", descriptor = "I")
	private int anInt9309;

	@OriginalMember(owner = "client!uf", name = "j", descriptor = "I")
	private int anInt9310;

	@OriginalMember(owner = "client!uf", name = "k", descriptor = "I")
	private int anInt9311;

	@OriginalMember(owner = "client!uf", name = "l", descriptor = "I")
	private int anInt9312;

	@OriginalMember(owner = "client!uf", name = "n", descriptor = "I")
	private int anInt9313;

	@OriginalMember(owner = "client!uf", name = "o", descriptor = "I")
	private int anInt9314;

	@OriginalMember(owner = "client!uf", name = "q", descriptor = "Ljava/awt/Component;")
	private Component aComponent5;

	@OriginalMember(owner = "client!uf", name = "i", descriptor = "Lclient!fha;")
	private Class109 aClass109_67 = new Class109();

	@OriginalMember(owner = "client!uf", name = "m", descriptor = "Lclient!fha;")
	private Class109 aClass109_68 = new Class109();

	@OriginalMember(owner = "client!uf", name = "p", descriptor = "Z")
	private final boolean aBoolean691;

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class335_Sub2(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method7826(arg0);
		this.aBoolean691 = arg1;
	}

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "(I)V")
	@Override
	public void method7815() {
		this.method7825();
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(BIIII)V")
	private void method7822(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class2_Sub12_Sub1 local3 = new Class2_Sub12_Sub1();
		local3.anInt5394 = arg1;
		local3.anInt5396 = arg2;
		local3.anInt5393 = arg3;
		local3.aLong148 = Static476.method6413();
		local3.anInt5395 = arg0;
		this.aClass109_68.method2323(local3);
	}

	@OriginalMember(owner = "client!uf", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method7817() {
		this.anInt9309 = this.anInt9312;
		this.anInt9311 = this.anInt9313;
		this.anInt9310 = this.anInt9314;
		@Pc(14) Class109 local14 = this.aClass109_67;
		this.aClass109_67 = this.aClass109_68;
		this.aClass109_68 = local14;
		this.aClass109_68.method2329();
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(III)V")
	private void method7823(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt9313 = arg1;
		this.anInt9312 = arg0;
		if (this.aBoolean691) {
			this.method7822(0, -1, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!uf", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method7823(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!uf", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method7824(arg0);
		if ((this.anInt9314 & local4) == 0) {
			local4 = this.anInt9314;
		}
		if ((local4 & 0x1) != 0) {
			this.method7822(arg0.getClickCount(), 3, arg0.getY(), arg0.getX());
		}
		if ((local4 & 0x4) != 0) {
			this.method7822(arg0.getClickCount(), 5, arg0.getY(), arg0.getX());
		}
		if ((local4 & 0x2) != 0) {
			this.method7822(arg0.getClickCount(), 4, arg0.getY(), arg0.getX());
		}
		this.anInt9314 &= ~local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!uf", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method7823(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(B)Z")
	@Override
	protected boolean method7814() {
		return (this.anInt9310 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;B)I")
	private int method7824(@OriginalArg(0) MouseEvent arg0) {
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

	@OriginalMember(owner = "client!uf", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)I")
	@Override
	public int method7811() {
		return this.anInt9309;
	}

	@OriginalMember(owner = "client!uf", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method7823(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!uf", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method7824(arg0);
		if (local4 == 1) {
			this.method7822(arg0.getClickCount(), 0, arg0.getY(), arg0.getX());
		} else if (local4 == 4) {
			this.method7822(arg0.getClickCount(), 2, arg0.getY(), arg0.getX());
		} else if (local4 == 2) {
			this.method7822(arg0.getClickCount(), 1, arg0.getY(), arg0.getX());
		}
		this.anInt9314 |= local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "(B)Lclient!fi;")
	@Override
	public Class2_Sub12 method7816() {
		return (Class2_Sub12) this.aClass109_67.method2322();
	}

	@OriginalMember(owner = "client!uf", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method7823(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!uf", name = "g", descriptor = "(I)I")
	@Override
	public int method7821() {
		return this.anInt9311;
	}

	@OriginalMember(owner = "client!uf", name = "e", descriptor = "(B)V")
	private void method7825() {
		if (this.aComponent5 == null) {
			return;
		}
		this.aComponent5.removeMouseWheelListener(this);
		this.aComponent5.removeMouseMotionListener(this);
		this.aComponent5.removeMouseListener(this);
		this.aClass109_68 = null;
		this.aClass109_67 = null;
		this.aComponent5 = null;
		this.anInt9312 = this.anInt9313 = this.anInt9314 = 0;
		this.anInt9309 = this.anInt9311 = this.anInt9310 = 0;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILjava/awt/Component;)V")
	private void method7826(@OriginalArg(1) Component arg0) {
		this.method7825();
		this.aComponent5 = arg0;
		this.aComponent5.addMouseListener(this);
		this.aComponent5.addMouseMotionListener(this);
		this.aComponent5.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!uf", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method7818() {
		return (this.anInt9310 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!uf", name = "f", descriptor = "(I)Z")
	@Override
	protected boolean method7820() {
		return (this.anInt9310 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!uf", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		@Pc(8) int local8 = arg0.getWheelRotation();
		this.method7822(local8, 6, local5, local2);
		arg0.consume();
	}
}
