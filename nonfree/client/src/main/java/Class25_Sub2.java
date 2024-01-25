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

@OriginalClass("client!nga")
public final class Class25_Sub2 extends Class25 implements MouseListener, MouseMotionListener, MouseWheelListener {

	@OriginalMember(owner = "client!nga", name = "h", descriptor = "I")
	private int anInt5840;

	@OriginalMember(owner = "client!nga", name = "i", descriptor = "I")
	private int anInt5841;

	@OriginalMember(owner = "client!nga", name = "j", descriptor = "I")
	private int anInt5842;

	@OriginalMember(owner = "client!nga", name = "l", descriptor = "I")
	private int anInt5843;

	@OriginalMember(owner = "client!nga", name = "m", descriptor = "I")
	private int anInt5844;

	@OriginalMember(owner = "client!nga", name = "n", descriptor = "I")
	private int anInt5845;

	@OriginalMember(owner = "client!nga", name = "q", descriptor = "Ljava/awt/Component;")
	private Component aComponent3;

	@OriginalMember(owner = "client!nga", name = "k", descriptor = "Lclient!wba;")
	private Class353 aClass353_38 = new Class353();

	@OriginalMember(owner = "client!nga", name = "o", descriptor = "Lclient!wba;")
	private Class353 aClass353_39 = new Class353();

	@OriginalMember(owner = "client!nga", name = "p", descriptor = "Z")
	private final boolean aBoolean459;

	@OriginalMember(owner = "client!nga", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class25_Sub2(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method4791(arg0);
		this.aBoolean459 = arg1;
	}

	@OriginalMember(owner = "client!nga", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method4779() {
		return (this.anInt5842 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!nga", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method4792(arg0);
		if ((this.anInt5845 & local4) == 0) {
			local4 = this.anInt5845;
		}
		if ((local4 & 0x1) != 0) {
			this.method4790(arg0.getY(), arg0.getClickCount(), 3, arg0.getX());
		}
		if ((local4 & 0x4) != 0) {
			this.method4790(arg0.getY(), arg0.getClickCount(), 5, arg0.getX());
		}
		if ((local4 & 0x2) != 0) {
			this.method4790(arg0.getY(), arg0.getClickCount(), 4, arg0.getX());
		}
		this.anInt5845 &= ~local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!nga", name = "e", descriptor = "(I)I")
	@Override
	public int method4783() {
		return this.anInt5840;
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(IIIII)V")
	private void method4790(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class1_Sub16_Sub2 local3 = new Class1_Sub16_Sub2();
		local3.anInt4495 = arg2;
		local3.anInt4497 = arg0;
		local3.anInt4494 = arg3;
		local3.aLong133 = Static413.method5668();
		local3.anInt4496 = arg1;
		this.aClass353_39.method7679(local3);
	}

	@OriginalMember(owner = "client!nga", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method4792(arg0);
		if (local4 == 1) {
			this.method4790(arg0.getY(), arg0.getClickCount(), 0, arg0.getX());
		} else if (local4 == 4) {
			this.method4790(arg0.getY(), arg0.getClickCount(), 2, arg0.getX());
		} else if (local4 == 2) {
			this.method4790(arg0.getY(), arg0.getClickCount(), 1, arg0.getX());
		}
		this.anInt5845 |= local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!nga", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method4793(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!nga", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method4781() {
		this.anInt5841 = this.anInt5843;
		this.anInt5840 = this.anInt5844;
		this.anInt5842 = this.anInt5845;
		@Pc(14) Class353 local14 = this.aClass353_38;
		this.aClass353_38 = this.aClass353_39;
		this.aClass353_39 = local14;
		this.aClass353_39.method7680();
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
	private void method4791(@OriginalArg(0) Component arg0) {
		this.method4794();
		this.aComponent3 = arg0;
		this.aComponent3.addMouseListener(this);
		this.aComponent3.addMouseMotionListener(this);
		this.aComponent3.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(ZLjava/awt/event/MouseEvent;)I")
	private int method4792(@OriginalArg(1) MouseEvent arg0) {
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

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(Z)Z")
	@Override
	protected boolean method4784() {
		return (this.anInt5842 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(B)Z")
	@Override
	protected boolean method4780() {
		return (this.anInt5842 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(BII)V")
	private void method4793(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt5844 = arg0;
		this.anInt5843 = arg1;
		if (this.aBoolean459) {
			this.method4790(arg1, 0, -1, arg0);
		}
	}

	@OriginalMember(owner = "client!nga", name = "g", descriptor = "(I)I")
	@Override
	public int method4788() {
		return this.anInt5841;
	}

	@OriginalMember(owner = "client!nga", name = "d", descriptor = "(I)Lclient!lp;")
	@Override
	public Class1_Sub16 method4782() {
		return (Class1_Sub16) this.aClass353_38.method7688();
	}

	@OriginalMember(owner = "client!nga", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method4793(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!nga", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method4793(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!nga", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!nga", name = "b", descriptor = "(Z)V")
	@Override
	public void method4787() {
		this.method4794();
	}

	@OriginalMember(owner = "client!nga", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		@Pc(8) int local8 = arg0.getWheelRotation();
		this.method4790(local5, local8, 6, local2);
		arg0.consume();
	}

	@OriginalMember(owner = "client!nga", name = "h", descriptor = "(I)V")
	private void method4794() {
		if (this.aComponent3 == null) {
			return;
		}
		this.aComponent3.removeMouseWheelListener(this);
		this.aComponent3.removeMouseMotionListener(this);
		this.aComponent3.removeMouseListener(this);
		this.aComponent3 = null;
		this.anInt5840 = this.anInt5841 = this.anInt5842 = 0;
		this.aClass353_38 = null;
		this.anInt5844 = this.anInt5843 = this.anInt5845 = 0;
		this.aClass353_39 = null;
	}

	@OriginalMember(owner = "client!nga", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method4793(arg0.getX(), arg0.getY());
	}
}
