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

@OriginalClass("client!pm")
public final class Class135_Sub2 extends Class135 implements MouseListener, MouseMotionListener, MouseWheelListener {

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "I")
	private int anInt7698;

	@OriginalMember(owner = "client!pm", name = "e", descriptor = "I")
	private int anInt7699;

	@OriginalMember(owner = "client!pm", name = "f", descriptor = "I")
	private int anInt7700;

	@OriginalMember(owner = "client!pm", name = "h", descriptor = "I")
	private int anInt7701;

	@OriginalMember(owner = "client!pm", name = "i", descriptor = "I")
	private int anInt7702;

	@OriginalMember(owner = "client!pm", name = "j", descriptor = "I")
	private int anInt7703;

	@OriginalMember(owner = "client!pm", name = "k", descriptor = "Ljava/awt/Component;")
	private Component aComponent4;

	@OriginalMember(owner = "client!pm", name = "d", descriptor = "Lclient!oe;")
	private Class244 aClass244_52 = new Class244();

	@OriginalMember(owner = "client!pm", name = "g", descriptor = "Lclient!oe;")
	private Class244 aClass244_53 = new Class244();

	@OriginalMember(owner = "client!pm", name = "l", descriptor = "Z")
	private final boolean aBoolean531;

	@OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class135_Sub2(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method6381(arg0);
		this.aBoolean531 = arg1;
	}

	@OriginalMember(owner = "client!pm", name = "e", descriptor = "(I)Z")
	@Override
	protected boolean method6377() {
		return (this.anInt7698 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)I")
	@Override
	public int method6370() {
		return this.anInt7700;
	}

	@OriginalMember(owner = "client!pm", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method6380(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!pm", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method6382(arg0);
		if (local4 == 1) {
			this.method6383(arg0.getY(), arg0.getClickCount(), 0, arg0.getX());
		} else if (local4 == 4) {
			this.method6383(arg0.getY(), arg0.getClickCount(), 2, arg0.getX());
		} else if (local4 == 2) {
			this.method6383(arg0.getY(), arg0.getClickCount(), 1, arg0.getX());
		}
		this.anInt7702 |= local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!pm", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method6380(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!pm", name = "f", descriptor = "(I)I")
	@Override
	public int method6378() {
		return this.anInt7699;
	}

	@OriginalMember(owner = "client!pm", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method6380(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method6371() {
		return (this.anInt7698 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "(B)V")
	private void method6379() {
		if (this.aComponent4 == null) {
			return;
		}
		this.aComponent4.removeMouseWheelListener(this);
		this.aComponent4.removeMouseMotionListener(this);
		this.aComponent4.removeMouseListener(this);
		this.aClass244_52 = null;
		this.anInt7700 = this.anInt7699 = this.anInt7698 = 0;
		this.aClass244_53 = null;
		this.anInt7703 = this.anInt7701 = this.anInt7702 = 0;
		this.aComponent4 = null;
	}

	@OriginalMember(owner = "client!pm", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method6380(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!pm", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(I)V")
	@Override
	public void method6373() {
		this.method6379();
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Z)V")
	@Override
	public synchronized void method6369() {
		this.anInt7699 = this.anInt7701;
		this.anInt7700 = this.anInt7703;
		this.anInt7698 = this.anInt7702;
		@Pc(14) Class244 local14 = this.aClass244_52;
		this.aClass244_52 = this.aClass244_53;
		this.aClass244_53 = local14;
		this.aClass244_53.method5962();
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IBI)V")
	private void method6380(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt7701 = arg1;
		this.anInt7703 = arg0;
		if (this.aBoolean531) {
			this.method6383(arg1, 0, -1, arg0);
		}
	}

	@OriginalMember(owner = "client!pm", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method6382(arg0);
		if ((local4 & this.anInt7702) == 0) {
			local4 = this.anInt7702;
		}
		if ((local4 & 0x1) != 0) {
			this.method6383(arg0.getY(), arg0.getClickCount(), 3, arg0.getX());
		}
		if ((local4 & 0x4) != 0) {
			this.method6383(arg0.getY(), arg0.getClickCount(), 5, arg0.getX());
		}
		if ((local4 & 0x2) != 0) {
			this.method6383(arg0.getY(), arg0.getClickCount(), 4, arg0.getX());
		}
		this.anInt7702 &= ~local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!pm", name = "d", descriptor = "(I)Z")
	@Override
	protected boolean method6375() {
		return (this.anInt7698 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	private void method6381(@OriginalArg(0) Component arg0) {
		this.method6379();
		this.aComponent4 = arg0;
		this.aComponent4.addMouseListener(this);
		this.aComponent4.addMouseMotionListener(this);
		this.aComponent4.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "(I)Lclient!ek;")
	@Override
	public Class4_Sub15 method6374() {
		return (Class4_Sub15) this.aClass244_52.method5968();
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(ZLjava/awt/event/MouseEvent;)I")
	private int method6382(@OriginalArg(1) MouseEvent arg0) {
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

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIII)V")
	private void method6383(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class4_Sub15_Sub1 local3 = new Class4_Sub15_Sub1();
		local3.anInt2727 = arg0;
		local3.anInt2724 = arg3;
		local3.anInt2725 = arg2;
		local3.aLong62 = Static574.method8210();
		local3.anInt2726 = arg1;
		this.aClass244_53.method5960(local3);
	}

	@OriginalMember(owner = "client!pm", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		@Pc(8) int local8 = arg0.getWheelRotation();
		this.method6383(local5, local8, 6, local2);
		arg0.consume();
	}
}
