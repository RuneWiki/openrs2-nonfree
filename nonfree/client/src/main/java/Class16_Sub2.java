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

@OriginalClass("client!ns")
public final class Class16_Sub2 extends Class16 implements MouseListener, MouseMotionListener, MouseWheelListener {

	@OriginalMember(owner = "client!ns", name = "e", descriptor = "I")
	private int anInt6589;

	@OriginalMember(owner = "client!ns", name = "f", descriptor = "I")
	private int anInt6590;

	@OriginalMember(owner = "client!ns", name = "h", descriptor = "I")
	private int anInt6591;

	@OriginalMember(owner = "client!ns", name = "i", descriptor = "I")
	private int anInt6592;

	@OriginalMember(owner = "client!ns", name = "j", descriptor = "I")
	private int anInt6593;

	@OriginalMember(owner = "client!ns", name = "k", descriptor = "I")
	private int anInt6594;

	@OriginalMember(owner = "client!ns", name = "n", descriptor = "Ljava/awt/Component;")
	private Component aComponent4;

	@OriginalMember(owner = "client!ns", name = "g", descriptor = "Lclient!tm;")
	private Class338 aClass338_162 = new Class338();

	@OriginalMember(owner = "client!ns", name = "l", descriptor = "Lclient!tm;")
	private Class338 aClass338_163 = new Class338();

	@OriginalMember(owner = "client!ns", name = "m", descriptor = "Z")
	private final boolean aBoolean467;

	@OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class16_Sub2(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method5894(arg0);
		this.aBoolean467 = arg1;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5883() {
		return (this.anInt6589 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ns", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method5889() {
		this.anInt6591 = this.anInt6593;
		this.anInt6590 = this.anInt6592;
		this.anInt6589 = this.anInt6594;
		@Pc(14) Class338 local14 = this.aClass338_162;
		this.aClass338_162 = this.aClass338_163;
		this.aClass338_163 = local14;
		this.aClass338_163.method8175();
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)Z")
	@Override
	protected boolean method5884() {
		return (this.anInt6589 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(III)V")
	private void method5892(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt6593 = arg0;
		this.anInt6592 = arg1;
		if (this.aBoolean467) {
			this.method5895(0, -1, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!ns", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method5893(arg0);
		if ((local4 & this.anInt6594) == 0) {
			local4 = this.anInt6594;
		}
		if ((local4 & 0x1) != 0) {
			this.method5895(arg0.getClickCount(), 3, arg0.getY(), arg0.getX());
		}
		if ((local4 & 0x4) != 0) {
			this.method5895(arg0.getClickCount(), 5, arg0.getY(), arg0.getX());
		}
		if ((local4 & 0x2) != 0) {
			this.method5895(arg0.getClickCount(), 4, arg0.getY(), arg0.getX());
		}
		this.anInt6594 &= ~local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ns", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method5892(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!ns", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ns", name = "f", descriptor = "(I)Lclient!qq;")
	@Override
	public Class3_Sub43 method5891() {
		return (Class3_Sub43) this.aClass338_162.method8169();
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)I")
	private int method5893(@OriginalArg(1) MouseEvent arg0) {
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

	@OriginalMember(owner = "client!ns", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method5893(arg0);
		if (local4 == 1) {
			this.method5895(arg0.getClickCount(), 0, arg0.getY(), arg0.getX());
		} else if (local4 == 4) {
			this.method5895(arg0.getClickCount(), 2, arg0.getY(), arg0.getX());
		} else if (local4 == 2) {
			this.method5895(arg0.getClickCount(), 1, arg0.getY(), arg0.getX());
		}
		this.anInt6594 |= local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	private void method5894(@OriginalArg(0) Component arg0) {
		this.method5896();
		this.aComponent4 = arg0;
		this.aComponent4.addMouseListener(this);
		this.aComponent4.addMouseMotionListener(this);
		this.aComponent4.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!ns", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		@Pc(8) int local8 = arg0.getWheelRotation();
		this.method5895(local8, 6, local5, local2);
		arg0.consume();
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(ZIIII)V")
	private void method5895(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class3_Sub43_Sub1 local3 = new Class3_Sub43_Sub1();
		local3.anInt6771 = arg3;
		local3.anInt6772 = arg1;
		local3.anInt6774 = arg2;
		local3.aLong216 = Static524.method7320();
		local3.anInt6773 = arg0;
		this.aClass338_163.method8171(local3);
	}

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "(I)I")
	@Override
	public int method5885() {
		return this.anInt6590;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(B)Z")
	@Override
	protected boolean method5882() {
		return (this.anInt6589 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "(B)I")
	@Override
	public int method5887() {
		return this.anInt6591;
	}

	@OriginalMember(owner = "client!ns", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method5892(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!ns", name = "g", descriptor = "(I)V")
	private void method5896() {
		if (this.aComponent4 == null) {
			return;
		}
		this.aComponent4.removeMouseWheelListener(this);
		this.aComponent4.removeMouseMotionListener(this);
		this.aComponent4.removeMouseListener(this);
		this.aClass338_163 = null;
		this.anInt6592 = this.anInt6593 = this.anInt6594 = 0;
		this.aClass338_162 = null;
		this.anInt6590 = this.anInt6591 = this.anInt6589 = 0;
		this.aComponent4 = null;
	}

	@OriginalMember(owner = "client!ns", name = "c", descriptor = "(I)V")
	@Override
	public void method5886() {
		this.method5896();
	}

	@OriginalMember(owner = "client!ns", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method5892(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!ns", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method5892(arg0.getY(), arg0.getX());
	}
}
