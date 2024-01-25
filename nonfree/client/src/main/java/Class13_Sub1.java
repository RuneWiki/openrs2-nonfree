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

@OriginalClass("client!aga")
public final class Class13_Sub1 extends Class13 implements MouseListener, MouseMotionListener, MouseWheelListener {

	@OriginalMember(owner = "client!aga", name = "g", descriptor = "I")
	private int anInt225;

	@OriginalMember(owner = "client!aga", name = "h", descriptor = "I")
	private int anInt226;

	@OriginalMember(owner = "client!aga", name = "j", descriptor = "I")
	private int anInt227;

	@OriginalMember(owner = "client!aga", name = "k", descriptor = "I")
	private int anInt228;

	@OriginalMember(owner = "client!aga", name = "l", descriptor = "I")
	private int anInt229;

	@OriginalMember(owner = "client!aga", name = "n", descriptor = "I")
	private int anInt230;

	@OriginalMember(owner = "client!aga", name = "o", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!aga", name = "i", descriptor = "Lclient!ro;")
	private Class306 aClass306_3 = new Class306();

	@OriginalMember(owner = "client!aga", name = "m", descriptor = "Lclient!ro;")
	private Class306 aClass306_4 = new Class306();

	@OriginalMember(owner = "client!aga", name = "p", descriptor = "Z")
	private final boolean aBoolean9;

	@OriginalMember(owner = "client!aga", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class13_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method261(arg0);
		this.aBoolean9 = arg1;
	}

	@OriginalMember(owner = "client!aga", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method6353() {
		this.anInt227 = this.anInt229;
		this.anInt225 = this.anInt230;
		this.anInt226 = this.anInt228;
		@Pc(14) Class306 local14 = this.aClass306_3;
		this.aClass306_3 = this.aClass306_4;
		this.aClass306_4 = local14;
		this.aClass306_4.method7315();
	}

	@OriginalMember(owner = "client!aga", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method262(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!aga", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		@Pc(8) int local8 = arg0.getWheelRotation();
		this.method263(local2, 6, local8, local5);
		arg0.consume();
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)I")
	private int method259(@OriginalArg(0) MouseEvent arg0) {
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

	@OriginalMember(owner = "client!aga", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method259(arg0);
		if (local4 == 1) {
			this.method263(arg0.getX(), 0, arg0.getClickCount(), arg0.getY());
		} else if (local4 == 4) {
			this.method263(arg0.getX(), 2, arg0.getClickCount(), arg0.getY());
		} else if (local4 == 2) {
			this.method263(arg0.getX(), 1, arg0.getClickCount(), arg0.getY());
		}
		this.anInt230 |= local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!aga", name = "d", descriptor = "(B)I")
	@Override
	public int method6355() {
		return this.anInt227;
	}

	@OriginalMember(owner = "client!aga", name = "b", descriptor = "(B)Lclient!qg;")
	@Override
	public Class5_Sub33 method6348() {
		return (Class5_Sub33) this.aClass306_3.method7302();
	}

	@OriginalMember(owner = "client!aga", name = "e", descriptor = "(I)V")
	private void method260() {
		if (this.aComponent1 == null) {
			return;
		}
		this.aComponent1.removeMouseWheelListener(this);
		this.aComponent1.removeMouseMotionListener(this);
		this.aComponent1.removeMouseListener(this);
		this.aClass306_4 = null;
		this.aClass306_3 = null;
		this.anInt229 = this.anInt228 = this.anInt230 = 0;
		this.anInt227 = this.anInt226 = this.anInt225 = 0;
		this.aComponent1 = null;
	}

	@OriginalMember(owner = "client!aga", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method259(arg0);
		if ((local4 & this.anInt230) == 0) {
			local4 = this.anInt230;
		}
		if ((local4 & 0x1) != 0) {
			this.method263(arg0.getX(), 3, arg0.getClickCount(), arg0.getY());
		}
		if ((local4 & 0x4) != 0) {
			this.method263(arg0.getX(), 5, arg0.getClickCount(), arg0.getY());
		}
		if ((local4 & 0x2) != 0) {
			this.method263(arg0.getX(), 4, arg0.getClickCount(), arg0.getY());
		}
		this.anInt230 &= ~local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!aga", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method262(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	private void method261(@OriginalArg(0) Component arg0) {
		this.method260();
		this.aComponent1 = arg0;
		this.aComponent1.addMouseListener(this);
		this.aComponent1.addMouseMotionListener(this);
		this.aComponent1.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!aga", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method6352() {
		return (this.anInt225 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!aga", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method262(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(IIB)V")
	private void method262(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt228 = arg1;
		this.anInt229 = arg0;
		if (this.aBoolean9) {
			this.method263(arg0, -1, 0, arg1);
		}
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(IBIII)V")
	private void method263(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class5_Sub33_Sub1 local3 = new Class5_Sub33_Sub1();
		local3.anInt6375 = arg0;
		local3.anInt6377 = arg1;
		local3.anInt6374 = arg3;
		local3.aLong181 = Static205.method3179();
		local3.anInt6376 = arg2;
		this.aClass306_4.method7303(local3);
	}

	@OriginalMember(owner = "client!aga", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method262(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(B)V")
	@Override
	public void method6344() {
		this.method260();
	}

	@OriginalMember(owner = "client!aga", name = "b", descriptor = "(Z)Z")
	@Override
	protected boolean method6351() {
		return (this.anInt225 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(Z)Z")
	@Override
	protected boolean method6349() {
		return (this.anInt225 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!aga", name = "b", descriptor = "(I)I")
	@Override
	public int method6347() {
		return this.anInt226;
	}

	@OriginalMember(owner = "client!aga", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}
}
