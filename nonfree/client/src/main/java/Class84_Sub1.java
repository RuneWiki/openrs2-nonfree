import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vk")
public final class Class84_Sub1 extends Class84 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!vk", name = "u", descriptor = "I")
	private int anInt6413;

	@OriginalMember(owner = "client!vk", name = "B", descriptor = "I")
	private int anInt6420;

	@OriginalMember(owner = "client!vk", name = "F", descriptor = "I")
	private int anInt6424;

	@OriginalMember(owner = "client!vk", name = "J", descriptor = "I")
	private int anInt6426;

	@OriginalMember(owner = "client!vk", name = "K", descriptor = "I")
	private int anInt6427;

	@OriginalMember(owner = "client!vk", name = "N", descriptor = "I")
	private int anInt6429;

	@OriginalMember(owner = "client!vk", name = "Q", descriptor = "Ljava/awt/Component;")
	private Component aComponent3;

	@OriginalMember(owner = "client!vk", name = "H", descriptor = "Lclient!bb;")
	private Class16 aClass16_40 = new Class16();

	@OriginalMember(owner = "client!vk", name = "L", descriptor = "Lclient!bb;")
	private Class16 aClass16_41 = new Class16();

	@OriginalMember(owner = "client!vk", name = "P", descriptor = "Z")
	private final boolean aBoolean627;

	@OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class84_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method5427(arg0);
		this.aBoolean627 = arg1;
	}

	@OriginalMember(owner = "client!vk", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method5425(arg0);
		if (local10 == 1) {
			this.method5423(arg0.getX(), 0, arg0.getY());
		} else if (local10 == 4) {
			this.method5423(arg0.getX(), 2, arg0.getY());
		} else if (local10 == 2) {
			this.method5423(arg0.getX(), 1, arg0.getY());
		}
		this.anInt6429 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!vk", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method5426(arg0);
	}

	@OriginalMember(owner = "client!vk", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method5426(arg0);
	}

	@OriginalMember(owner = "client!vk", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5413() {
		return (this.anInt6424 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!vk", name = "h", descriptor = "(I)Z")
	@Override
	protected boolean method5420() {
		return (this.anInt6424 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIZI)V")
	private void method5423(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class1_Sub21_Sub1 local7 = new Class1_Sub21_Sub1();
		local7.anInt2910 = arg1;
		local7.anInt2915 = arg2;
		local7.anInt2912 = arg0;
		local7.aLong98 = Static162.method3252();
		this.aClass16_41.method416(local7);
	}

	@OriginalMember(owner = "client!vk", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!vk", name = "c", descriptor = "(B)V")
	private void method5424() {
		if (this.aComponent3 == null) {
			return;
		}
		this.aComponent3.removeMouseListener(this);
		this.aComponent3.removeMouseMotionListener(this);
		this.aComponent3 = null;
		this.anInt6426 = this.anInt6427 = this.anInt6429 = 0;
		this.aClass16_41 = null;
		this.anInt6413 = this.anInt6420 = this.anInt6424 = 0;
		this.aClass16_40 = null;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(Z)Z")
	@Override
	protected boolean method5412() {
		return (this.anInt6424 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!vk", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method5415() {
		this.anInt6413 = this.anInt6426;
		this.anInt6420 = this.anInt6427;
		this.anInt6424 = this.anInt6429;
		@Pc(18) Class16 local18 = this.aClass16_40;
		this.aClass16_40 = this.aClass16_41;
		this.aClass16_41 = local18;
		this.aClass16_41.method421();
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(BLjava/awt/event/MouseEvent;)I")
	private int method5425(@OriginalArg(1) MouseEvent arg0) {
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

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)V")
	private void method5426(@OriginalArg(1) MouseEvent arg0) {
		this.anInt6426 = arg0.getX();
		this.anInt6427 = arg0.getY();
		if (this.aBoolean627) {
			this.method5423(arg0.getX(), -1, arg0.getY());
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(ILjava/awt/Component;)V")
	private void method5427(@OriginalArg(1) Component arg0) {
		this.method5424();
		this.aComponent3 = arg0;
		this.aComponent3.addMouseListener(this);
		this.aComponent3.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!vk", name = "f", descriptor = "(I)V")
	@Override
	public void method5418() {
		this.method5424();
	}

	@OriginalMember(owner = "client!vk", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method5426(arg0);
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)I")
	@Override
	public int method5406() {
		return this.anInt6420;
	}

	@OriginalMember(owner = "client!vk", name = "g", descriptor = "(I)Lclient!qn;")
	@Override
	public Class1_Sub21 method5419() {
		return (Class1_Sub21) this.aClass16_40.method408();
	}

	@OriginalMember(owner = "client!vk", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.anInt6427 = -1;
		this.anInt6426 = -1;
	}

	@OriginalMember(owner = "client!vk", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method5425(arg0);
		if ((local8 & this.anInt6429) == 0) {
			local8 = this.anInt6429;
		}
		if ((local8 & 0x1) != 0) {
			this.method5423(arg0.getX(), 3, arg0.getY());
		}
		if ((local8 & 0x4) != 0) {
			this.method5423(arg0.getX(), 5, arg0.getY());
		}
		if ((local8 & 0x2) != 0) {
			this.method5423(arg0.getX(), 4, arg0.getY());
		}
		this.anInt6429 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!vk", name = "c", descriptor = "(I)I")
	@Override
	public int method5408() {
		return this.anInt6413;
	}
}
