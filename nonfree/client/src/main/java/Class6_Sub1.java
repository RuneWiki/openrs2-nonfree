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

@OriginalClass("client!ad")
public final class Class6_Sub1 extends Class6 implements MouseListener, MouseMotionListener, MouseWheelListener {

	@OriginalMember(owner = "client!ad", name = "h", descriptor = "I")
	private int anInt105;

	@OriginalMember(owner = "client!ad", name = "i", descriptor = "I")
	private int anInt106;

	@OriginalMember(owner = "client!ad", name = "j", descriptor = "I")
	private int anInt107;

	@OriginalMember(owner = "client!ad", name = "k", descriptor = "I")
	private int anInt108;

	@OriginalMember(owner = "client!ad", name = "l", descriptor = "I")
	private int anInt109;

	@OriginalMember(owner = "client!ad", name = "m", descriptor = "I")
	private int anInt110;

	@OriginalMember(owner = "client!ad", name = "o", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!ad", name = "g", descriptor = "Lclient!dm;")
	private Class73 aClass73_6 = new Class73();

	@OriginalMember(owner = "client!ad", name = "n", descriptor = "Lclient!dm;")
	private Class73 aClass73_7 = new Class73();

	@OriginalMember(owner = "client!ad", name = "p", descriptor = "Z")
	private final boolean aBoolean5;

	@OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class6_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method253(arg0);
		this.aBoolean5 = arg1;
	}

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "(I)V")
	private void method250() {
		if (this.aComponent2 == null) {
			return;
		}
		this.aComponent2.removeMouseWheelListener(this);
		this.aComponent2.removeMouseMotionListener(this);
		this.aComponent2.removeMouseListener(this);
		this.aClass73_7 = null;
		this.anInt110 = this.anInt108 = this.anInt109 = 0;
		this.aClass73_6 = null;
		this.aComponent2 = null;
		this.anInt107 = this.anInt106 = this.anInt105 = 0;
	}

	@OriginalMember(owner = "client!ad", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method252(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "(B)V")
	@Override
	public synchronized void method3755() {
		this.anInt105 = this.anInt109;
		this.anInt106 = this.anInt108;
		this.anInt107 = this.anInt110;
		@Pc(14) Class73 local14 = this.aClass73_6;
		this.aClass73_6 = this.aClass73_7;
		this.aClass73_7 = local14;
		this.aClass73_7.method2014();
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)I")
	private int method251(@OriginalArg(0) MouseEvent arg0) {
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

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(BII)V")
	private void method252(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt110 = arg1;
		this.anInt108 = arg0;
		if (this.aBoolean5) {
			this.method254(arg0, arg1, 0, -1);
		}
	}

	@OriginalMember(owner = "client!ad", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method251(arg0);
		if (local4 == 1) {
			this.method254(arg0.getY(), arg0.getX(), 0, 0);
		} else if (local4 == 4) {
			this.method254(arg0.getY(), arg0.getX(), 0, 2);
		} else if (local4 == 2) {
			this.method254(arg0.getY(), arg0.getX(), 0, 1);
		}
		this.anInt109 |= local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ad", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method252(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	private void method253(@OriginalArg(0) Component arg0) {
		this.method250();
		this.aComponent2 = arg0;
		this.aComponent2.addMouseListener(this);
		this.aComponent2.addMouseMotionListener(this);
		this.aComponent2.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)Z")
	@Override
	protected boolean method3747() {
		return (this.anInt105 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method3752() {
		return (this.anInt105 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(I)I")
	@Override
	public int method3757() {
		return this.anInt106;
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(B)I")
	@Override
	public int method3754() {
		return this.anInt107;
	}

	@OriginalMember(owner = "client!ad", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIII)V")
	private void method254(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(11) Class12_Sub3_Sub2 local11 = new Class12_Sub3_Sub2();
		local11.anInt7519 = arg3;
		local11.anInt7520 = arg0;
		local11.anInt7518 = arg1;
		local11.aLong191 = Static76.method1679();
		local11.anInt7521 = arg2;
		this.aClass73_7.method2012(local11);
	}

	@OriginalMember(owner = "client!ad", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		@Pc(8) int local8 = arg0.getWheelRotation();
		this.method254(local5, local2, local8, 6);
		arg0.consume();
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Z)Z")
	@Override
	protected boolean method3753() {
		return (this.anInt105 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!ad", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method251(arg0);
		if ((local4 & this.anInt109) == 0) {
			local4 = this.anInt109;
		}
		if ((local4 & 0x1) != 0) {
			this.method254(arg0.getY(), arg0.getX(), 0, 3);
		}
		if ((local4 & 0x4) != 0) {
			this.method254(arg0.getY(), arg0.getX(), 0, 5);
		}
		if ((local4 & 0x2) != 0) {
			this.method254(arg0.getY(), arg0.getX(), 0, 4);
		}
		this.anInt109 &= ~local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ad", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method252(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!ad", name = "f", descriptor = "(B)Lclient!bh;")
	@Override
	public Class12_Sub3 method3758() {
		return (Class12_Sub3) this.aClass73_6.method2008();
	}

	@OriginalMember(owner = "client!ad", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method252(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V")
	@Override
	public void method3751() {
		this.method250();
	}
}
