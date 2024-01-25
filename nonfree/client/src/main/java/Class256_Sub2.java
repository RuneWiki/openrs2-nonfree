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

@OriginalClass("client!vn")
public final class Class256_Sub2 extends Class256 implements MouseListener, MouseMotionListener, MouseWheelListener {

	@OriginalMember(owner = "client!vn", name = "g", descriptor = "I")
	private int anInt9133;

	@OriginalMember(owner = "client!vn", name = "h", descriptor = "I")
	private int anInt9134;

	@OriginalMember(owner = "client!vn", name = "j", descriptor = "I")
	private int anInt9135;

	@OriginalMember(owner = "client!vn", name = "k", descriptor = "I")
	private int anInt9136;

	@OriginalMember(owner = "client!vn", name = "l", descriptor = "I")
	private int anInt9137;

	@OriginalMember(owner = "client!vn", name = "n", descriptor = "I")
	private int anInt9138;

	@OriginalMember(owner = "client!vn", name = "o", descriptor = "Ljava/awt/Component;")
	private Component aComponent4;

	@OriginalMember(owner = "client!vn", name = "i", descriptor = "Lclient!wo;")
	private Class361 aClass361_97 = new Class361();

	@OriginalMember(owner = "client!vn", name = "m", descriptor = "Lclient!wo;")
	private Class361 aClass361_98 = new Class361();

	@OriginalMember(owner = "client!vn", name = "p", descriptor = "Z")
	private final boolean aBoolean667;

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class256_Sub2(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method7568(arg0);
		this.aBoolean667 = arg1;
	}

	@OriginalMember(owner = "client!vn", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method7566(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!vn", name = "e", descriptor = "(B)V")
	private void method7564() {
		if (this.aComponent4 == null) {
			return;
		}
		this.aComponent4.removeMouseWheelListener(this);
		this.aComponent4.removeMouseMotionListener(this);
		this.aComponent4.removeMouseListener(this);
		this.aClass361_97 = null;
		this.aComponent4 = null;
		this.anInt9137 = this.anInt9136 = this.anInt9138 = 0;
		this.aClass361_98 = null;
		this.anInt9135 = this.anInt9134 = this.anInt9133 = 0;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method7556() {
		this.anInt9135 = this.anInt9137;
		this.anInt9134 = this.anInt9136;
		this.anInt9133 = this.anInt9138;
		@Pc(14) Class361 local14 = this.aClass361_97;
		this.aClass361_97 = this.aClass361_98;
		this.aClass361_98 = local14;
		this.aClass361_98.method7860();
	}

	@OriginalMember(owner = "client!vn", name = "c", descriptor = "(B)I")
	@Override
	public int method7561() {
		return this.anInt9134;
	}

	@OriginalMember(owner = "client!vn", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method7566(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!vn", name = "e", descriptor = "(I)V")
	@Override
	public void method7563() {
		this.method7564();
	}

	@OriginalMember(owner = "client!vn", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(ZLjava/awt/event/MouseEvent;)I")
	private int method7565(@OriginalArg(1) MouseEvent arg0) {
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

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(B)Z")
	@Override
	protected boolean method7555() {
		return (this.anInt9133 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!vn", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		@Pc(8) int local8 = arg0.getWheelRotation();
		this.method7567(local5, 6, local2, local8);
		arg0.consume();
	}

	@OriginalMember(owner = "client!vn", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method7566(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(III)V")
	private void method7566(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt9136 = arg1;
		this.anInt9137 = arg0;
		if (this.aBoolean667) {
			this.method7567(arg1, -1, arg0, 0);
		}
	}

	@OriginalMember(owner = "client!vn", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method7565(arg0);
		if ((this.anInt9138 & local4) == 0) {
			local4 = this.anInt9138;
		}
		if ((local4 & 0x1) != 0) {
			this.method7567(arg0.getY(), 3, arg0.getX(), arg0.getClickCount());
		}
		if ((local4 & 0x4) != 0) {
			this.method7567(arg0.getY(), 5, arg0.getX(), arg0.getClickCount());
		}
		if ((local4 & 0x2) != 0) {
			this.method7567(arg0.getY(), 4, arg0.getX(), arg0.getClickCount());
		}
		this.anInt9138 &= ~local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!vn", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method7566(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!vn", name = "d", descriptor = "(I)Z")
	@Override
	protected boolean method7559() {
		return (this.anInt9133 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIIBI)V")
	private void method7567(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class1_Sub13_Sub2 local3 = new Class1_Sub13_Sub2();
		local3.anInt2999 = arg0;
		local3.anInt2998 = arg1;
		local3.anInt2997 = arg2;
		local3.aLong145 = Static255.method4035();
		local3.anInt2996 = arg3;
		this.aClass361_98.method7855(local3);
	}

	@OriginalMember(owner = "client!vn", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method7562() {
		return (this.anInt9133 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!vn", name = "c", descriptor = "(I)I")
	@Override
	public int method7558() {
		return this.anInt9135;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(Z)Lclient!ll;")
	@Override
	public Class1_Sub13 method7554() {
		return (Class1_Sub13) this.aClass361_97.method7850();
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(ILjava/awt/Component;)V")
	private void method7568(@OriginalArg(1) Component arg0) {
		this.method7564();
		this.aComponent4 = arg0;
		this.aComponent4.addMouseListener(this);
		this.aComponent4.addMouseMotionListener(this);
		this.aComponent4.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!vn", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method7565(arg0);
		if (local4 == 1) {
			this.method7567(arg0.getY(), 0, arg0.getX(), arg0.getClickCount());
		} else if (local4 == 4) {
			this.method7567(arg0.getY(), 2, arg0.getX(), arg0.getClickCount());
		} else if (local4 == 2) {
			this.method7567(arg0.getY(), 1, arg0.getX(), arg0.getClickCount());
		}
		this.anInt9138 |= local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}
}
