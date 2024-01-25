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

@OriginalClass("client!ac")
public final class Class4_Sub1 extends Class4 implements MouseListener, MouseMotionListener, MouseWheelListener {

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "I")
	private int anInt67;

	@OriginalMember(owner = "client!ac", name = "f", descriptor = "I")
	private int anInt68;

	@OriginalMember(owner = "client!ac", name = "g", descriptor = "I")
	private int anInt69;

	@OriginalMember(owner = "client!ac", name = "h", descriptor = "I")
	private int anInt70;

	@OriginalMember(owner = "client!ac", name = "j", descriptor = "I")
	private int anInt71;

	@OriginalMember(owner = "client!ac", name = "k", descriptor = "I")
	private int anInt72;

	@OriginalMember(owner = "client!ac", name = "m", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "Lclient!mfa;")
	private Class211 aClass211_3 = new Class211();

	@OriginalMember(owner = "client!ac", name = "i", descriptor = "Lclient!mfa;")
	private Class211 aClass211_4 = new Class211();

	@OriginalMember(owner = "client!ac", name = "l", descriptor = "Z")
	private final boolean aBoolean1;

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class4_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method147(arg0);
		this.aBoolean1 = arg1;
	}

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "(I)I")
	@Override
	public int method1216() {
		return this.anInt69;
	}

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "(I)V")
	private void method145() {
		if (this.aComponent1 == null) {
			return;
		}
		this.aComponent1.removeMouseWheelListener(this);
		this.aComponent1.removeMouseMotionListener(this);
		this.aComponent1.removeMouseListener(this);
		this.aClass211_4 = null;
		this.aClass211_3 = null;
		this.anInt70 = this.anInt71 = this.anInt72 = 0;
		this.anInt69 = this.anInt67 = this.anInt68 = 0;
		this.aComponent1 = null;
	}

	@OriginalMember(owner = "client!ac", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "(Z)Z")
	@Override
	protected boolean method1214() {
		return (this.anInt68 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "(B)V")
	@Override
	public synchronized void method1217() {
		this.anInt69 = this.anInt70;
		this.anInt67 = this.anInt71;
		this.anInt68 = this.anInt72;
		@Pc(14) Class211 local14 = this.aClass211_3;
		this.aClass211_3 = this.aClass211_4;
		this.aClass211_4 = local14;
		this.aClass211_4.method5179();
	}

	@OriginalMember(owner = "client!ac", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method149(arg0);
		if (local4 == 1) {
			this.method146(arg0.getX(), 0, 0, arg0.getY());
		} else if (local4 == 4) {
			this.method146(arg0.getX(), 2, 0, arg0.getY());
		} else if (local4 == 2) {
			this.method146(arg0.getX(), 1, 0, arg0.getY());
		}
		this.anInt72 |= local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method1212() {
		return (this.anInt68 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ac", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method148(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!ac", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		@Pc(8) int local8 = arg0.getWheelRotation();
		this.method146(local2, 6, local8, local5);
		arg0.consume();
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIII)V")
	private void method146(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) Class6_Sub39_Sub2 local10 = new Class6_Sub39_Sub2();
		local10.anInt9608 = arg1;
		local10.anInt9609 = arg0;
		local10.anInt9611 = arg3;
		local10.aLong245 = Static174.method3502();
		local10.anInt9610 = arg2;
		this.aClass211_4.method5173(local10);
	}

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "(I)I")
	@Override
	public int method1215() {
		return this.anInt67;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)Z")
	@Override
	protected boolean method1210() {
		return (this.anInt68 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Z)Lclient!ve;")
	@Override
	public Class6_Sub39 method1208() {
		return (Class6_Sub39) this.aClass211_3.method5180();
	}

	@OriginalMember(owner = "client!ac", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method148(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!ac", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method148(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(BLjava/awt/Component;)V")
	private void method147(@OriginalArg(1) Component arg0) {
		this.method145();
		this.aComponent1 = arg0;
		this.aComponent1.addMouseListener(this);
		this.aComponent1.addMouseMotionListener(this);
		this.aComponent1.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(III)V")
	private void method148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt71 = arg1;
		this.anInt70 = arg0;
		if (this.aBoolean1) {
			this.method146(arg0, -1, 0, arg1);
		}
	}

	@OriginalMember(owner = "client!ac", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method148(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!ac", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method149(arg0);
		if ((local4 & this.anInt72) == 0) {
			local4 = this.anInt72;
		}
		if ((local4 & 0x1) != 0) {
			this.method146(arg0.getX(), 3, 0, arg0.getY());
		}
		if ((local4 & 0x4) != 0) {
			this.method146(arg0.getX(), 5, 0, arg0.getY());
		}
		if ((local4 & 0x2) != 0) {
			this.method146(arg0.getX(), 4, 0, arg0.getY());
		}
		this.anInt72 &= ~local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)I")
	private int method149(@OriginalArg(0) MouseEvent arg0) {
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

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)V")
	@Override
	public void method1211() {
		this.method145();
	}
}
