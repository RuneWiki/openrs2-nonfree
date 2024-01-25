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

@OriginalClass("client!lga")
public final class Class164_Sub2 extends Class164 implements MouseListener, MouseMotionListener, MouseWheelListener {

	@OriginalMember(owner = "client!lga", name = "h", descriptor = "I")
	private int anInt5575;

	@OriginalMember(owner = "client!lga", name = "l", descriptor = "I")
	private int anInt5576;

	@OriginalMember(owner = "client!lga", name = "f", descriptor = "I")
	private int anInt5577;

	@OriginalMember(owner = "client!lga", name = "i", descriptor = "I")
	private int anInt5578;

	@OriginalMember(owner = "client!lga", name = "e", descriptor = "I")
	private int anInt5579;

	@OriginalMember(owner = "client!lga", name = "j", descriptor = "I")
	private int anInt5580;

	@OriginalMember(owner = "client!lga", name = "g", descriptor = "Ljava/awt/Component;")
	private Component aComponent3;

	@OriginalMember(owner = "client!lga", name = "n", descriptor = "Lclient!at;")
	private Class20 aClass20_24 = new Class20();

	@OriginalMember(owner = "client!lga", name = "m", descriptor = "Lclient!at;")
	private Class20 aClass20_25 = new Class20();

	@OriginalMember(owner = "client!lga", name = "k", descriptor = "Z")
	private final boolean aBoolean370;

	@OriginalMember(owner = "client!lga", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	private Class164_Sub2(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method5007(0, arg0);
		this.aBoolean370 = arg1;
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(Z)I")
	@Override
	public int method5000() {
		return this.anInt5577;
	}

	@OriginalMember(owner = "client!lga", name = "b", descriptor = "(III)V")
	private void method5006(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt5578 = arg0;
		this.anInt5580 = arg1;
		if (this.aBoolean370) {
			this.method5009(arg0, -1, 0, arg1);
		}
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(ILjava/awt/Component;)V")
	private void method5007(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1) {
		this.method5010(arg0);
		this.aComponent3 = arg1;
		this.aComponent3.addMouseListener(this);
		this.aComponent3.addMouseMotionListener(this);
		this.aComponent3.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!lga", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method5006(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!lga", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method5006(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;B)I")
	private int method5008(@OriginalArg(0) MouseEvent arg0) {
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

	@OriginalMember(owner = "client!lga", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method5001() {
		this.anInt5575 = this.anInt5580;
		this.anInt5577 = this.anInt5578;
		this.anInt5576 = this.anInt5579;
		@Pc(14) Class20 local14 = this.aClass20_24;
		this.aClass20_24 = this.aClass20_25;
		this.aClass20_25 = local14;
		this.aClass20_25.method374();
	}

	@OriginalMember(owner = "client!lga", name = "c", descriptor = "(I)Lclient!va;")
	@Override
	public Class5_Sub10 method5005() {
		return (Class5_Sub10) this.aClass20_24.method369();
	}

	@OriginalMember(owner = "client!lga", name = "b", descriptor = "(I)V")
	@Override
	public void method5003() {
		this.method5010(0);
	}

	@OriginalMember(owner = "client!lga", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		@Pc(8) int local8 = arg0.getWheelRotation();
		this.method5009(local5, 6, local8, local2);
		arg0.consume();
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(B)Z")
	@Override
	protected boolean method4996() {
		return (this.anInt5576 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!lga", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method5002() {
		return (this.anInt5576 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!lga", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!lga", name = "b", descriptor = "(B)Z")
	@Override
	protected boolean method5004() {
		return (this.anInt5576 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!lga", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method5006(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(IIIII)V")
	private void method5009(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class5_Sub10_Sub1 local3 = new Class5_Sub10_Sub1();
		local3.anInt994 = arg3;
		local3.anInt992 = arg1;
		local3.anInt993 = arg0;
		local3.aLong40 = Static480.method6763();
		local3.anInt995 = arg2;
		this.aClass20_25.method370(local3);
	}

	@OriginalMember(owner = "client!lga", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method5008(arg0);
		if (local4 == 1) {
			this.method5009(arg0.getY(), 0, arg0.getClickCount(), arg0.getX());
		} else if (local4 == 4) {
			this.method5009(arg0.getY(), 2, arg0.getClickCount(), arg0.getX());
		} else if (local4 == 2) {
			this.method5009(arg0.getY(), 1, arg0.getClickCount(), arg0.getX());
		}
		this.anInt5579 |= local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!lga", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method5008(arg0);
		if ((this.anInt5579 & local4) == 0) {
			local4 = this.anInt5579;
		}
		if ((local4 & 0x1) != 0) {
			this.method5009(arg0.getY(), 3, arg0.getClickCount(), arg0.getX());
		}
		if ((local4 & 0x4) != 0) {
			this.method5009(arg0.getY(), 5, arg0.getClickCount(), arg0.getX());
		}
		if ((local4 & 0x2) != 0) {
			this.method5009(arg0.getY(), 4, arg0.getClickCount(), arg0.getX());
		}
		this.anInt5579 &= ~local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!lga", name = "f", descriptor = "(I)V")
	private void method5010(@OriginalArg(0) int arg0) {
		if (this.aComponent3 == null) {
			return;
		}
		this.aComponent3.removeMouseWheelListener(this);
		this.aComponent3.removeMouseMotionListener(this);
		this.aComponent3.removeMouseListener(this);
		this.aComponent3 = null;
		this.anInt5580 = this.anInt5578 = this.anInt5579 = 0;
		this.anInt5575 = this.anInt5577 = this.anInt5576 = 0;
		this.aClass20_25 = null;
		this.aClass20_24 = null;
	}

	@OriginalMember(owner = "client!lga", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method5006(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!lga", name = "e", descriptor = "(I)I")
	@Override
	public int method4999() {
		return this.anInt5575;
	}
}
