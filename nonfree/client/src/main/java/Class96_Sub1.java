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

@OriginalClass("client!fda")
public final class Class96_Sub1 extends Class96 implements MouseListener, MouseMotionListener, MouseWheelListener {

	@OriginalMember(owner = "client!fda", name = "h", descriptor = "I")
	private int anInt3527;

	@OriginalMember(owner = "client!fda", name = "i", descriptor = "I")
	private int anInt3528;

	@OriginalMember(owner = "client!fda", name = "j", descriptor = "I")
	private int anInt3529;

	@OriginalMember(owner = "client!fda", name = "k", descriptor = "I")
	private int anInt3530;

	@OriginalMember(owner = "client!fda", name = "l", descriptor = "I")
	private int anInt3531;

	@OriginalMember(owner = "client!fda", name = "m", descriptor = "I")
	private int anInt3532;

	@OriginalMember(owner = "client!fda", name = "o", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!fda", name = "g", descriptor = "Lclient!kba;")
	private Class163 aClass163_18 = new Class163();

	@OriginalMember(owner = "client!fda", name = "n", descriptor = "Lclient!kba;")
	private Class163 aClass163_19 = new Class163();

	@OriginalMember(owner = "client!fda", name = "p", descriptor = "Z")
	private final boolean aBoolean279;

	@OriginalMember(owner = "client!fda", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class96_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method3022(arg0);
		this.aBoolean279 = arg1;
	}

	@OriginalMember(owner = "client!fda", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		@Pc(8) int local8 = arg0.getWheelRotation();
		this.method3021(local8, local2, 6, local5);
		arg0.consume();
	}

	@OriginalMember(owner = "client!fda", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method3023(arg0);
		if (local4 == 1) {
			this.method3021(arg0.getClickCount(), arg0.getX(), 0, arg0.getY());
		} else if (local4 == 4) {
			this.method3021(arg0.getClickCount(), arg0.getX(), 2, arg0.getY());
		} else if (local4 == 2) {
			this.method3021(arg0.getClickCount(), arg0.getX(), 1, arg0.getY());
		}
		this.anInt3532 |= local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!fda", name = "d", descriptor = "(B)Z")
	@Override
	protected boolean method8022() {
		return (this.anInt3529 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!fda", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method3023(arg0);
		if ((local4 & this.anInt3532) == 0) {
			local4 = this.anInt3532;
		}
		if ((local4 & 0x1) != 0) {
			this.method3021(arg0.getClickCount(), arg0.getX(), 3, arg0.getY());
		}
		if ((local4 & 0x4) != 0) {
			this.method3021(arg0.getClickCount(), arg0.getX(), 5, arg0.getY());
		}
		if ((local4 & 0x2) != 0) {
			this.method3021(arg0.getClickCount(), arg0.getX(), 4, arg0.getY());
		}
		this.anInt3532 &= ~local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!fda", name = "e", descriptor = "(B)V")
	@Override
	public synchronized void method8028() {
		this.anInt3529 = this.anInt3532;
		this.anInt3527 = this.anInt3531;
		this.anInt3528 = this.anInt3530;
		@Pc(14) Class163 local14 = this.aClass163_18;
		this.aClass163_18 = this.aClass163_19;
		this.aClass163_19 = local14;
		this.aClass163_19.method4970();
	}

	@OriginalMember(owner = "client!fda", name = "c", descriptor = "(I)Z")
	@Override
	protected boolean method8024() {
		return (this.anInt3529 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!fda", name = "c", descriptor = "(B)I")
	@Override
	public int method8019() {
		return this.anInt3527;
	}

	@OriginalMember(owner = "client!fda", name = "e", descriptor = "(I)V")
	@Override
	public void method8027() {
		this.method3024();
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(I)Lclient!hfa;")
	@Override
	public Class6_Sub22 method8020() {
		return (Class6_Sub22) this.aClass163_18.method4969();
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(IBIII)V")
	private void method3021(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class6_Sub22_Sub2 local3 = new Class6_Sub22_Sub2();
		local3.anInt4070 = arg3;
		local3.anInt4071 = arg2;
		local3.anInt4072 = arg1;
		local3.aLong117 = Static582.method8056();
		local3.anInt4069 = arg0;
		this.aClass163_19.method4967(local3);
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	private void method3022(@OriginalArg(0) Component arg0) {
		this.method3024();
		this.aComponent2 = arg0;
		this.aComponent2.addMouseListener(this);
		this.aComponent2.addMouseMotionListener(this);
		this.aComponent2.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!fda", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method3025(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!fda", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method3025(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!fda", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method3025(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!fda", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method3025(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!fda", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)I")
	private int method3023(@OriginalArg(0) MouseEvent arg0) {
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

	@OriginalMember(owner = "client!fda", name = "f", descriptor = "(I)V")
	private void method3024() {
		if (this.aComponent2 == null) {
			return;
		}
		this.aComponent2.removeMouseWheelListener(this);
		this.aComponent2.removeMouseMotionListener(this);
		this.aComponent2.removeMouseListener(this);
		this.aClass163_19 = null;
		this.anInt3530 = this.anInt3531 = this.anInt3532 = 0;
		this.anInt3528 = this.anInt3527 = this.anInt3529 = 0;
		this.aComponent2 = null;
		this.aClass163_18 = null;
	}

	@OriginalMember(owner = "client!fda", name = "d", descriptor = "(I)I")
	@Override
	public int method8026() {
		return this.anInt3528;
	}

	@OriginalMember(owner = "client!fda", name = "b", descriptor = "(III)V")
	private void method3025(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt3531 = arg1;
		this.anInt3530 = arg0;
		if (this.aBoolean279) {
			this.method3021(0, arg0, -1, arg1);
		}
	}

	@OriginalMember(owner = "client!fda", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8018() {
		return (this.anInt3529 & 0x1) != 0;
	}
}
