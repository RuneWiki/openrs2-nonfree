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

@OriginalClass("client!fe")
public final class Class99_Sub1 extends Class99 implements MouseListener, MouseMotionListener, MouseWheelListener {

	@OriginalMember(owner = "client!fe", name = "i", descriptor = "I")
	private int anInt2617;

	@OriginalMember(owner = "client!fe", name = "j", descriptor = "I")
	private int anInt2618;

	@OriginalMember(owner = "client!fe", name = "l", descriptor = "I")
	private int anInt2619;

	@OriginalMember(owner = "client!fe", name = "m", descriptor = "I")
	private int anInt2620;

	@OriginalMember(owner = "client!fe", name = "n", descriptor = "I")
	private int anInt2621;

	@OriginalMember(owner = "client!fe", name = "p", descriptor = "I")
	private int anInt2622;

	@OriginalMember(owner = "client!fe", name = "q", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!fe", name = "k", descriptor = "Lclient!ui;")
	private Class295 aClass295_11 = new Class295();

	@OriginalMember(owner = "client!fe", name = "o", descriptor = "Lclient!ui;")
	private Class295 aClass295_12 = new Class295();

	@OriginalMember(owner = "client!fe", name = "r", descriptor = "Z")
	private final boolean aBoolean225;

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class99_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method2479(arg0);
		this.aBoolean225 = arg1;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	private void method2479(@OriginalArg(0) Component arg0) {
		this.method2480();
		this.aComponent1 = arg0;
		this.aComponent1.addMouseListener(this);
		this.aComponent1.addMouseMotionListener(this);
		this.aComponent1.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!fe", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!fe", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method2481(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!fe", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method2483(arg0);
		if ((this.anInt2622 & local4) == 0) {
			local4 = this.anInt2622;
		}
		if ((local4 & 0x1) != 0) {
			this.method2482(arg0.getX(), 3, 0, arg0.getY());
		}
		if ((local4 & 0x4) != 0) {
			this.method2482(arg0.getX(), 5, 0, arg0.getY());
		}
		if ((local4 & 0x2) != 0) {
			this.method2482(arg0.getX(), 4, 0, arg0.getY());
		}
		this.anInt2622 &= ~local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!fe", name = "e", descriptor = "(I)Z")
	@Override
	protected boolean method6623() {
		return (this.anInt2617 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!fe", name = "f", descriptor = "(I)V")
	private void method2480() {
		if (this.aComponent1 == null) {
			return;
		}
		this.aComponent1.removeMouseWheelListener(this);
		this.aComponent1.removeMouseMotionListener(this);
		this.aComponent1.removeMouseListener(this);
		this.anInt2619 = this.anInt2618 = this.anInt2617 = 0;
		this.aClass295_12 = null;
		this.aClass295_11 = null;
		this.anInt2620 = this.anInt2621 = this.anInt2622 = 0;
		this.aComponent1 = null;
	}

	@OriginalMember(owner = "client!fe", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method2481(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(ZII)V")
	private void method2481(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt2621 = arg1;
		this.anInt2620 = arg0;
		if (this.aBoolean225) {
			this.method2482(arg0, -1, 0, arg1);
		}
	}

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "(I)I")
	@Override
	public int method6619() {
		return this.anInt2618;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIII)V")
	private void method2482(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class1_Sub32_Sub2 local3 = new Class1_Sub32_Sub2();
		local3.anInt6363 = arg1;
		local3.anInt6362 = arg3;
		local3.anInt6360 = arg0;
		local3.aLong173 = Static110.method2222();
		local3.anInt6361 = arg2;
		this.aClass295_12.method7533(local3);
	}

	@OriginalMember(owner = "client!fe", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method6620() {
		return (this.anInt2617 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;B)I")
	private int method2483(@OriginalArg(0) MouseEvent arg0) {
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

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
	@Override
	public void method6617() {
		this.method2480();
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Z)Z")
	@Override
	protected boolean method6616() {
		return (this.anInt2617 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)I")
	@Override
	public int method6618() {
		return this.anInt2619;
	}

	@OriginalMember(owner = "client!fe", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method2481(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!fe", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method2483(arg0);
		if (local4 == 1) {
			this.method2482(arg0.getX(), 0, 0, arg0.getY());
		} else if (local4 == 4) {
			this.method2482(arg0.getX(), 2, 0, arg0.getY());
		} else if (local4 == 2) {
			this.method2482(arg0.getX(), 1, 0, arg0.getY());
		}
		this.anInt2622 |= local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)V")
	@Override
	public synchronized void method6613() {
		this.anInt2619 = this.anInt2620;
		this.anInt2618 = this.anInt2621;
		this.anInt2617 = this.anInt2622;
		@Pc(21) Class295 local21 = this.aClass295_11;
		this.aClass295_11 = this.aClass295_12;
		this.aClass295_12 = local21;
		this.aClass295_12.method7541();
	}

	@OriginalMember(owner = "client!fe", name = "d", descriptor = "(B)Lclient!uf;")
	@Override
	public Class1_Sub32 method6624() {
		return (Class1_Sub32) this.aClass295_11.method7547();
	}

	@OriginalMember(owner = "client!fe", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method2481(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!fe", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		@Pc(8) int local8 = arg0.getWheelRotation();
		this.method2482(local2, 6, local8, local5);
		arg0.consume();
	}
}
