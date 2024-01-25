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

@OriginalClass("client!bn")
public final class Class40_Sub1 extends Class40 implements MouseListener, MouseMotionListener, MouseWheelListener {

	@OriginalMember(owner = "client!bn", name = "g", descriptor = "I")
	private int anInt1034;

	@OriginalMember(owner = "client!bn", name = "h", descriptor = "I")
	private int anInt1035;

	@OriginalMember(owner = "client!bn", name = "i", descriptor = "I")
	private int anInt1036;

	@OriginalMember(owner = "client!bn", name = "j", descriptor = "I")
	private int anInt1037;

	@OriginalMember(owner = "client!bn", name = "k", descriptor = "I")
	private int anInt1038;

	@OriginalMember(owner = "client!bn", name = "l", descriptor = "I")
	private int anInt1039;

	@OriginalMember(owner = "client!bn", name = "n", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!bn", name = "f", descriptor = "Lclient!nt;")
	private Class238 aClass238_3 = new Class238();

	@OriginalMember(owner = "client!bn", name = "m", descriptor = "Lclient!nt;")
	private Class238 aClass238_4 = new Class238();

	@OriginalMember(owner = "client!bn", name = "o", descriptor = "Z")
	private final boolean aBoolean73;

	@OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class40_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method926(arg0);
		this.aBoolean73 = arg1;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(B)V")
	@Override
	public void method4498() {
		this.method924();
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(III)V")
	private void method922(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt1037 = arg0;
		this.anInt1039 = arg1;
		if (this.aBoolean73) {
			this.method923(arg1, arg0, -1, 0);
		}
	}

	@OriginalMember(owner = "client!bn", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		@Pc(8) int local8 = arg0.getWheelRotation();
		this.method923(local2, local5, 6, local8);
		arg0.consume();
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIIIB)V")
	private void method923(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class2_Sub32_Sub1 local3 = new Class2_Sub32_Sub1();
		local3.anInt6437 = arg2;
		local3.anInt6435 = arg1;
		local3.anInt6434 = arg0;
		local3.aLong183 = Static438.method6517();
		local3.anInt6436 = arg3;
		this.aClass238_4.method5837(local3);
	}

	@OriginalMember(owner = "client!bn", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!bn", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method922(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!bn", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method925(arg0);
		if (local4 == 1) {
			this.method923(arg0.getX(), arg0.getY(), 0, arg0.getClickCount());
		} else if (local4 == 4) {
			this.method923(arg0.getX(), arg0.getY(), 2, arg0.getClickCount());
		} else if (local4 == 2) {
			this.method923(arg0.getX(), arg0.getY(), 1, arg0.getClickCount());
		}
		this.anInt1038 |= local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!bn", name = "g", descriptor = "(I)V")
	private void method924() {
		if (this.aComponent2 == null) {
			return;
		}
		this.aComponent2.removeMouseWheelListener(this);
		this.aComponent2.removeMouseMotionListener(this);
		this.aComponent2.removeMouseListener(this);
		this.aComponent2 = null;
		this.aClass238_4 = null;
		this.aClass238_3 = null;
		this.anInt1035 = this.anInt1036 = this.anInt1034 = 0;
		this.anInt1039 = this.anInt1037 = this.anInt1038 = 0;
	}

	@OriginalMember(owner = "client!bn", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method922(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!bn", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method925(arg0);
		if ((local4 & this.anInt1038) == 0) {
			local4 = this.anInt1038;
		}
		if ((local4 & 0x1) != 0) {
			this.method923(arg0.getX(), arg0.getY(), 3, arg0.getClickCount());
		}
		if ((local4 & 0x4) != 0) {
			this.method923(arg0.getX(), arg0.getY(), 5, arg0.getClickCount());
		}
		if ((local4 & 0x2) != 0) {
			this.method923(arg0.getX(), arg0.getY(), 4, arg0.getClickCount());
		}
		this.anInt1038 &= ~local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!bn", name = "d", descriptor = "(I)Lclient!lga;")
	@Override
	public Class2_Sub32 method4497() {
		return (Class2_Sub32) this.aClass238_3.method5832();
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)Z")
	@Override
	protected boolean method4494() {
		return (this.anInt1034 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(ZLjava/awt/event/MouseEvent;)I")
	private int method925(@OriginalArg(1) MouseEvent arg0) {
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

	@OriginalMember(owner = "client!bn", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method4496() {
		return (this.anInt1034 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!bn", name = "f", descriptor = "(I)I")
	@Override
	public int method4504() {
		return this.anInt1035;
	}

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method4495() {
		this.anInt1035 = this.anInt1039;
		this.anInt1036 = this.anInt1037;
		this.anInt1034 = this.anInt1038;
		@Pc(14) Class238 local14 = this.aClass238_3;
		this.aClass238_3 = this.aClass238_4;
		this.aClass238_4 = local14;
		this.aClass238_4.method5841();
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	private void method926(@OriginalArg(0) Component arg0) {
		this.method924();
		this.aComponent2 = arg0;
		this.aComponent2.addMouseListener(this);
		this.aComponent2.addMouseMotionListener(this);
		this.aComponent2.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Z)I")
	@Override
	public int method4499() {
		return this.anInt1036;
	}

	@OriginalMember(owner = "client!bn", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method922(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!bn", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method922(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!bn", name = "c", descriptor = "(B)Z")
	@Override
	protected boolean method4503() {
		return (this.anInt1034 & 0x2) != 0;
	}
}
