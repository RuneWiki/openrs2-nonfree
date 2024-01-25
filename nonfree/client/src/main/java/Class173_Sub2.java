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

@OriginalClass("client!ru")
public final class Class173_Sub2 extends Class173 implements MouseListener, MouseMotionListener, MouseWheelListener {

	@OriginalMember(owner = "client!ru", name = "f", descriptor = "I")
	private int anInt7979;

	@OriginalMember(owner = "client!ru", name = "g", descriptor = "I")
	private int anInt7980;

	@OriginalMember(owner = "client!ru", name = "h", descriptor = "I")
	private int anInt7981;

	@OriginalMember(owner = "client!ru", name = "j", descriptor = "I")
	private int anInt7982;

	@OriginalMember(owner = "client!ru", name = "k", descriptor = "I")
	private int anInt7983;

	@OriginalMember(owner = "client!ru", name = "l", descriptor = "I")
	private int anInt7984;

	@OriginalMember(owner = "client!ru", name = "n", descriptor = "Ljava/awt/Component;")
	private Component aComponent4;

	@OriginalMember(owner = "client!ru", name = "i", descriptor = "Lclient!ws;")
	private Class361 aClass361_61 = new Class361();

	@OriginalMember(owner = "client!ru", name = "m", descriptor = "Lclient!ws;")
	private Class361 aClass361_62 = new Class361();

	@OriginalMember(owner = "client!ru", name = "o", descriptor = "Z")
	private final boolean aBoolean572;

	@OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class173_Sub2(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method6499(arg0);
		this.aBoolean572 = arg1;
	}

	@OriginalMember(owner = "client!ru", name = "e", descriptor = "(I)Z")
	@Override
	protected boolean method6495() {
		return (this.anInt7981 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!ru", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method6498(arg0);
		if ((local4 & this.anInt7983) == 0) {
			local4 = this.anInt7983;
		}
		if ((local4 & 0x1) != 0) {
			this.method6500(3, 0, arg0.getX(), arg0.getY());
		}
		if ((local4 & 0x4) != 0) {
			this.method6500(5, 0, arg0.getX(), arg0.getY());
		}
		if ((local4 & 0x2) != 0) {
			this.method6500(4, 0, arg0.getX(), arg0.getY());
		}
		this.anInt7983 &= ~local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ru", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method6494() {
		this.anInt7981 = this.anInt7983;
		this.anInt7980 = this.anInt7982;
		this.anInt7979 = this.anInt7984;
		@Pc(22) Class361 local22 = this.aClass361_61;
		this.aClass361_61 = this.aClass361_62;
		this.aClass361_62 = local22;
		this.aClass361_62.method7842();
	}

	@OriginalMember(owner = "client!ru", name = "b", descriptor = "(I)V")
	@Override
	public void method6490() {
		this.method6497();
	}

	@OriginalMember(owner = "client!ru", name = "g", descriptor = "(I)V")
	private void method6497() {
		if (this.aComponent4 == null) {
			return;
		}
		this.aComponent4.removeMouseWheelListener(this);
		this.aComponent4.removeMouseMotionListener(this);
		this.aComponent4.removeMouseListener(this);
		this.aClass361_61 = null;
		this.aClass361_62 = null;
		this.anInt7980 = this.anInt7979 = this.anInt7981 = 0;
		this.anInt7982 = this.anInt7984 = this.anInt7983 = 0;
		this.aComponent4 = null;
	}

	@OriginalMember(owner = "client!ru", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ru", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		@Pc(8) int local8 = arg0.getWheelRotation();
		this.method6500(6, local8, local2, local5);
		arg0.consume();
	}

	@OriginalMember(owner = "client!ru", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method6496() {
		return (this.anInt7981 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ru", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method6498(arg0);
		if (local4 == 1) {
			this.method6500(0, 0, arg0.getX(), arg0.getY());
		} else if (local4 == 4) {
			this.method6500(2, 0, arg0.getX(), arg0.getY());
		} else if (local4 == 2) {
			this.method6500(1, 0, arg0.getX(), arg0.getY());
		}
		this.anInt7983 |= local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ru", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method6501(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;B)I")
	private int method6498(@OriginalArg(0) MouseEvent arg0) {
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

	@OriginalMember(owner = "client!ru", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method6501(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(B)I")
	@Override
	public int method6487() {
		return this.anInt7980;
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(ILjava/awt/Component;)V")
	private void method6499(@OriginalArg(1) Component arg0) {
		this.method6497();
		this.aComponent4 = arg0;
		this.aComponent4.addMouseListener(this);
		this.aComponent4.addMouseMotionListener(this);
		this.aComponent4.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!ru", name = "b", descriptor = "(B)Z")
	@Override
	protected boolean method6488() {
		return (this.anInt7981 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(IIBII)V")
	private void method6500(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class6_Sub5_Sub2 local3 = new Class6_Sub5_Sub2();
		local3.anInt2174 = arg0;
		local3.anInt2172 = arg2;
		local3.anInt2171 = arg3;
		local3.aLong64 = Static8.method201();
		local3.anInt2173 = arg1;
		this.aClass361_62.method7833(local3);
	}

	@OriginalMember(owner = "client!ru", name = "c", descriptor = "(B)I")
	@Override
	public int method6489() {
		return this.anInt7979;
	}

	@OriginalMember(owner = "client!ru", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method6501(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!ru", name = "c", descriptor = "(I)Lclient!wk;")
	@Override
	public Class6_Sub5 method6491() {
		return (Class6_Sub5) this.aClass361_61.method7835();
	}

	@OriginalMember(owner = "client!ru", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method6501(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(III)V")
	private void method6501(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt7984 = arg1;
		this.anInt7982 = arg0;
		if (this.aBoolean572) {
			this.method6500(-1, 0, arg0, arg1);
		}
	}
}
