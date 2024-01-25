import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hea")
public final class Class79_Sub2 extends Class79 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!hea", name = "u", descriptor = "I")
	private int anInt4046;

	@OriginalMember(owner = "client!hea", name = "B", descriptor = "I")
	private int anInt4052;

	@OriginalMember(owner = "client!hea", name = "H", descriptor = "I")
	private int anInt4057;

	@OriginalMember(owner = "client!hea", name = "K", descriptor = "I")
	private int anInt4060;

	@OriginalMember(owner = "client!hea", name = "N", descriptor = "I")
	private int anInt4062;

	@OriginalMember(owner = "client!hea", name = "O", descriptor = "I")
	private int anInt4063;

	@OriginalMember(owner = "client!hea", name = "P", descriptor = "Ljava/awt/Component;")
	private Component aComponent3;

	@OriginalMember(owner = "client!hea", name = "D", descriptor = "Lclient!ok;")
	private Class262 aClass262_18 = new Class262();

	@OriginalMember(owner = "client!hea", name = "M", descriptor = "Lclient!ok;")
	private Class262 aClass262_19 = new Class262();

	@OriginalMember(owner = "client!hea", name = "Q", descriptor = "Z")
	private final boolean aBoolean294;

	@OriginalMember(owner = "client!hea", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class79_Sub2(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method3364(arg0);
		this.aBoolean294 = arg1;
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)I")
	private int method3362(@OriginalArg(1) MouseEvent arg0) {
		@Pc(6) int local6 = arg0.getModifiers();
		@Pc(15) boolean local15 = (local6 & 0x10) != 0;
		@Pc(23) boolean local23 = (local6 & 0x8) != 0;
		@Pc(31) boolean local31 = (local6 & 0x4) != 0;
		if (local23 && (local15 || local31)) {
			local23 = false;
		}
		if (local15 && local31) {
			return 4;
		} else if (local15) {
			return 1;
		} else if (local23) {
			return 2;
		} else if (local31) {
			return 4;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!hea", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method3366(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!hea", name = "f", descriptor = "(I)I")
	@Override
	public int method3361() {
		return this.anInt4052;
	}

	@OriginalMember(owner = "client!hea", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method3366(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!hea", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!hea", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method3362(arg0);
		if ((local8 & this.anInt4062) == 0) {
			local8 = this.anInt4062;
		}
		if ((local8 & 0x1) != 0) {
			this.method3368(arg0.getY(), 3, arg0.getX(), arg0.getClickCount());
		}
		if ((local8 & 0x4) != 0) {
			this.method3368(arg0.getY(), 5, arg0.getX(), arg0.getClickCount());
		}
		if ((local8 & 0x2) != 0) {
			this.method3368(arg0.getY(), 4, arg0.getX(), arg0.getClickCount());
		}
		this.anInt4062 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method3351() {
		return (this.anInt4046 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!hea", name = "g", descriptor = "(I)V")
	private void method3363() {
		if (this.aComponent3 == null) {
			return;
		}
		this.aComponent3.removeMouseMotionListener(this);
		this.aComponent3.removeMouseListener(this);
		this.aClass262_18 = null;
		this.aComponent3 = null;
		this.anInt4063 = this.anInt4060 = this.anInt4062 = 0;
		this.aClass262_19 = null;
		this.anInt4052 = this.anInt4057 = this.anInt4046 = 0;
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	private void method3364(@OriginalArg(0) Component arg0) {
		this.method3363();
		this.aComponent3 = arg0;
		this.aComponent3.addMouseListener(this);
		this.aComponent3.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!hea", name = "c", descriptor = "(B)I")
	@Override
	public int method3358() {
		return this.anInt4057;
	}

	@OriginalMember(owner = "client!hea", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method3366(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!hea", name = "b", descriptor = "(I)Lclient!rm;")
	@Override
	public Class14_Sub30 method3353() {
		return (Class14_Sub30) this.aClass262_18.method6323();
	}

	@OriginalMember(owner = "client!hea", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method3366(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!hea", name = "d", descriptor = "(I)V")
	@Override
	public void method3356() {
		this.method3363();
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(B)Z")
	@Override
	protected boolean method3352() {
		return (this.anInt4046 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!hea", name = "b", descriptor = "(B)V")
	@Override
	public synchronized void method3355() {
		this.anInt4052 = this.anInt4063;
		this.anInt4057 = this.anInt4060;
		this.anInt4046 = this.anInt4062;
		@Pc(18) Class262 local18 = this.aClass262_18;
		this.aClass262_18 = this.aClass262_19;
		this.aClass262_19 = local18;
		this.aClass262_19.method6316();
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(IIB)V")
	private void method3366(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4063 = arg0;
		this.anInt4060 = arg1;
		if (this.aBoolean294) {
			this.method3368(arg1, -1, arg0, 0);
		}
	}

	@OriginalMember(owner = "client!hea", name = "c", descriptor = "(I)Z")
	@Override
	protected boolean method3354() {
		return (this.anInt4046 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!hea", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method3362(arg0);
		if (local10 == 1) {
			this.method3368(arg0.getY(), 0, arg0.getX(), arg0.getClickCount());
		} else if (local10 == 4) {
			this.method3368(arg0.getY(), 2, arg0.getX(), arg0.getClickCount());
		} else if (local10 == 2) {
			this.method3368(arg0.getY(), 1, arg0.getX(), arg0.getClickCount());
		}
		this.anInt4062 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(IIIZI)V")
	private void method3368(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class14_Sub30_Sub2 local7 = new Class14_Sub30_Sub2();
		local7.anInt10298 = arg3;
		local7.anInt10297 = arg1;
		local7.anInt10301 = arg0;
		local7.anInt10304 = arg2;
		local7.aLong273 = Static521.method7499();
		this.aClass262_19.method6314(local7);
	}
}
