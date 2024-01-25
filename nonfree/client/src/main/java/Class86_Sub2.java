import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vba")
public final class Class86_Sub2 extends Class86 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!vba", name = "eb", descriptor = "[Lclient!nfa;")
	private static final Class224[] aClass224Array1 = new Class224[32];

	@OriginalMember(owner = "client!vba", name = "k", descriptor = "I")
	private int anInt8709;

	@OriginalMember(owner = "client!vba", name = "v", descriptor = "I")
	private int anInt8718;

	@OriginalMember(owner = "client!vba", name = "M", descriptor = "I")
	private int anInt8730;

	@OriginalMember(owner = "client!vba", name = "O", descriptor = "I")
	private int anInt8731;

	@OriginalMember(owner = "client!vba", name = "R", descriptor = "I")
	private int anInt8732;

	@OriginalMember(owner = "client!vba", name = "S", descriptor = "I")
	private int anInt8733;

	@OriginalMember(owner = "client!vba", name = "T", descriptor = "Ljava/awt/Component;")
	private Component aComponent5;

	@OriginalMember(owner = "client!vba", name = "y", descriptor = "Lclient!gk;")
	private Class112 aClass112_61 = new Class112();

	@OriginalMember(owner = "client!vba", name = "P", descriptor = "Lclient!gk;")
	private Class112 aClass112_62 = new Class112();

	@OriginalMember(owner = "client!vba", name = "U", descriptor = "Z")
	private final boolean aBoolean669;

	static {
		@Pc(94) Class224[] local94 = Static3.method5707();
		for (@Pc(96) int local96 = 0; local96 < local94.length; local96++) {
			aClass224Array1[local94[local96].anInt6213] = local94[local96];
		}
	}

	@OriginalMember(owner = "client!vba", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class86_Sub2(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method7275(arg0);
		this.aBoolean669 = arg1;
	}

	@OriginalMember(owner = "client!vba", name = "h", descriptor = "(I)Z")
	@Override
	protected boolean method7272() {
		return (this.anInt8709 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!vba", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method7273(arg0);
		if ((this.anInt8733 & local8) == 0) {
			local8 = this.anInt8733;
		}
		if ((local8 & 0x1) != 0) {
			this.method7280(arg0.getY(), 3, arg0.getClickCount(), arg0.getX());
		}
		if ((local8 & 0x4) != 0) {
			this.method7280(arg0.getY(), 5, arg0.getClickCount(), arg0.getX());
		}
		if ((local8 & 0x2) != 0) {
			this.method7280(arg0.getY(), 4, arg0.getClickCount(), arg0.getX());
		}
		this.anInt8733 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(I)V")
	@Override
	public void method7262() {
		this.method7276();
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)I")
	private int method7273(@OriginalArg(1) MouseEvent arg0) {
		@Pc(6) int local6 = arg0.getModifiers();
		@Pc(14) boolean local14 = (local6 & 0x10) != 0;
		@Pc(22) boolean local22 = (local6 & 0x8) != 0;
		@Pc(30) boolean local30 = (local6 & 0x4) != 0;
		if (local22 && (local14 || local30)) {
			local22 = false;
		}
		if (local14 && local30) {
			return 4;
		} else if (local14) {
			return 1;
		} else if (local22) {
			return 2;
		} else if (local30) {
			return 4;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!vba", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method7269() {
		return (this.anInt8709 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!vba", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method7279(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!vba", name = "c", descriptor = "(I)I")
	@Override
	public int method7265() {
		return this.anInt8730;
	}

	@OriginalMember(owner = "client!vba", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method7279(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(ILjava/awt/Component;)V")
	private void method7275(@OriginalArg(1) Component arg0) {
		this.method7276();
		this.aComponent5 = arg0;
		this.aComponent5.addMouseListener(this);
		this.aComponent5.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!vba", name = "i", descriptor = "(I)V")
	private void method7276() {
		if (this.aComponent5 == null) {
			return;
		}
		this.aComponent5.removeMouseMotionListener(this);
		this.aComponent5.removeMouseListener(this);
		this.anInt8731 = this.anInt8732 = this.anInt8733 = 0;
		this.aComponent5 = null;
		this.aClass112_61 = null;
		this.aClass112_62 = null;
		this.anInt8718 = this.anInt8730 = this.anInt8709 = 0;
	}

	@OriginalMember(owner = "client!vba", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method7264() {
		this.anInt8730 = this.anInt8732;
		this.anInt8709 = this.anInt8733;
		this.anInt8718 = this.anInt8731;
		@Pc(18) Class112 local18 = this.aClass112_61;
		this.aClass112_61 = this.aClass112_62;
		this.aClass112_62 = local18;
		this.aClass112_62.method3092();
	}

	@OriginalMember(owner = "client!vba", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!vba", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method7279(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!vba", name = "e", descriptor = "(I)Lclient!aaa;")
	@Override
	public Class3_Sub1 method7268() {
		return (Class3_Sub1) this.aClass112_61.method3094();
	}

	@OriginalMember(owner = "client!vba", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method7279(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(BII)V")
	private void method7279(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt8732 = arg1;
		this.anInt8731 = arg0;
		if (this.aBoolean669) {
			this.method7280(arg1, -1, 0, arg0);
		}
	}

	@OriginalMember(owner = "client!vba", name = "d", descriptor = "(I)Z")
	@Override
	protected boolean method7266() {
		return (this.anInt8709 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(Z)I")
	@Override
	public int method7267() {
		return this.anInt8718;
	}

	@OriginalMember(owner = "client!vba", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method7273(arg0);
		if (local10 == 1) {
			this.method7280(arg0.getY(), 0, arg0.getClickCount(), arg0.getX());
		} else if (local10 == 4) {
			this.method7280(arg0.getY(), 2, arg0.getClickCount(), arg0.getX());
		} else if (local10 == 2) {
			this.method7280(arg0.getY(), 1, arg0.getClickCount(), arg0.getX());
		}
		this.anInt8733 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(IIIII)V")
	private void method7280(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class3_Sub1_Sub2 local7 = new Class3_Sub1_Sub2();
		local7.anInt6810 = arg3;
		local7.anInt6811 = arg2;
		local7.anInt6807 = arg1;
		local7.anInt6809 = arg0;
		local7.aLong184 = Static158.method2936();
		this.aClass112_62.method3079(local7);
	}
}
