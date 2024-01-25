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

@OriginalClass("client!ne")
public final class Class42_Sub2 extends Class42 implements MouseListener, MouseMotionListener, MouseWheelListener {

	@OriginalMember(owner = "client!ne", name = "m", descriptor = "I")
	private int anInt6773;

	@OriginalMember(owner = "client!ne", name = "r", descriptor = "I")
	private int anInt6774;

	@OriginalMember(owner = "client!ne", name = "q", descriptor = "I")
	private int anInt6775;

	@OriginalMember(owner = "client!ne", name = "l", descriptor = "I")
	private int anInt6776;

	@OriginalMember(owner = "client!ne", name = "o", descriptor = "I")
	private int anInt6777;

	@OriginalMember(owner = "client!ne", name = "n", descriptor = "I")
	private int anInt6778;

	@OriginalMember(owner = "client!ne", name = "s", descriptor = "Ljava/awt/Component;")
	private Component aComponent3;

	@OriginalMember(owner = "client!ne", name = "j", descriptor = "Lclient!tf;")
	private Class340 aClass340_52 = new Class340();

	@OriginalMember(owner = "client!ne", name = "p", descriptor = "Lclient!tf;")
	private Class340 aClass340_53 = new Class340();

	@OriginalMember(owner = "client!ne", name = "k", descriptor = "Z")
	private final boolean aBoolean508;

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	private Class42_Sub2(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method6023((byte) 103, arg0);
		this.aBoolean508 = arg1;
	}

	@OriginalMember(owner = "client!ne", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method6025(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!ne", name = "f", descriptor = "(I)Z")
	@Override
	protected boolean method6017() {
		return (this.anInt6773 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!ne", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method6025(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(B)V")
	@Override
	public void method6021() {
		this.method6022();
	}

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "(B)V")
	private void method6022() {
		if (this.aComponent3 == null) {
			return;
		}
		this.aComponent3.removeMouseWheelListener(this);
		this.aComponent3.removeMouseMotionListener(this);
		this.aComponent3.removeMouseListener(this);
		this.anInt6777 = this.anInt6776 = this.anInt6778 = 0;
		this.aClass340_53 = null;
		this.aComponent3 = null;
		this.anInt6774 = this.anInt6775 = this.anInt6773 = 0;
		this.aClass340_52 = null;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6016() {
		return (this.anInt6773 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)I")
	@Override
	public int method6019() {
		return this.anInt6774;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)Lclient!vha;")
	@Override
	public Class6_Sub9 method6011() {
		return (Class6_Sub9) this.aClass340_52.method8127();
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(BLjava/awt/Component;)V")
	private void method6023(@OriginalArg(0) byte arg0, @OriginalArg(1) Component arg1) {
		this.method6022();
		if (arg0 < 89) {
			this.mousePressed((MouseEvent) null);
		}
		this.aComponent3 = arg1;
		this.aComponent3.addMouseListener(this);
		this.aComponent3.addMouseMotionListener(this);
		this.aComponent3.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!ne", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method6025(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "(B)V")
	@Override
	public synchronized void method6012() {
		this.anInt6773 = this.anInt6778;
		this.anInt6774 = this.anInt6777;
		this.anInt6775 = this.anInt6776;
		@Pc(14) Class340 local14 = this.aClass340_52;
		this.aClass340_52 = this.aClass340_53;
		this.aClass340_53 = local14;
		this.aClass340_53.method8129();
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)I")
	private int method6024(@OriginalArg(1) MouseEvent arg0) {
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

	@OriginalMember(owner = "client!ne", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method6024(arg0);
		if (local4 == 1) {
			this.method6026(arg0.getY(), 0, arg0.getClickCount(), arg0.getX());
		} else if (local4 == 4) {
			this.method6026(arg0.getY(), 2, arg0.getClickCount(), arg0.getX());
		} else if (local4 == 2) {
			this.method6026(arg0.getY(), 1, arg0.getClickCount(), arg0.getX());
		}
		this.anInt6778 |= local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)I")
	@Override
	public int method6014() {
		return this.anInt6775;
	}

	@OriginalMember(owner = "client!ne", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method6024(arg0);
		if ((local4 & this.anInt6778) == 0) {
			local4 = this.anInt6778;
		}
		if ((local4 & 0x1) != 0) {
			this.method6026(arg0.getY(), 3, arg0.getClickCount(), arg0.getX());
		}
		if ((local4 & 0x4) != 0) {
			this.method6026(arg0.getY(), 5, arg0.getClickCount(), arg0.getX());
		}
		if ((local4 & 0x2) != 0) {
			this.method6026(arg0.getY(), 4, arg0.getClickCount(), arg0.getX());
		}
		this.anInt6778 &= ~local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "(I)Z")
	@Override
	protected boolean method6009() {
		return (this.anInt6773 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!ne", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(III)V")
	private void method6025(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt6776 = arg1;
		this.anInt6777 = arg0;
		if (this.aBoolean508) {
			this.method6026(arg1, -1, 0, arg0);
		}
	}

	@OriginalMember(owner = "client!ne", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method6025(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIII)V")
	private void method6026(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class6_Sub9_Sub2 local3 = new Class6_Sub9_Sub2();
		local3.anInt8111 = arg1;
		local3.anInt8108 = arg0;
		local3.anInt8109 = arg3;
		local3.aLong259 = Static549.method7758();
		local3.anInt8110 = arg2;
		this.aClass340_53.method8131(local3);
	}

	@OriginalMember(owner = "client!ne", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		@Pc(8) int local8 = arg0.getWheelRotation();
		this.method6026(local5, 6, local8, local2);
		arg0.consume();
	}
}
