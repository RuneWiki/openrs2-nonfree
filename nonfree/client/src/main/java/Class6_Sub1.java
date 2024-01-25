import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aca")
public final class Class6_Sub1 extends Class6 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!aca", name = "n", descriptor = "I")
	private int anInt107;

	@OriginalMember(owner = "client!aca", name = "o", descriptor = "I")
	private int anInt108;

	@OriginalMember(owner = "client!aca", name = "r", descriptor = "I")
	private int anInt110;

	@OriginalMember(owner = "client!aca", name = "J", descriptor = "I")
	private int anInt125;

	@OriginalMember(owner = "client!aca", name = "K", descriptor = "I")
	private int anInt126;

	@OriginalMember(owner = "client!aca", name = "M", descriptor = "I")
	private int anInt127;

	@OriginalMember(owner = "client!aca", name = "N", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!aca", name = "s", descriptor = "Lclient!ow;")
	private Class271 aClass271_1 = new Class271();

	@OriginalMember(owner = "client!aca", name = "L", descriptor = "Lclient!ow;")
	private Class271 aClass271_2 = new Class271();

	@OriginalMember(owner = "client!aca", name = "O", descriptor = "Z")
	private final boolean aBoolean3;

	@OriginalMember(owner = "client!aca", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class6_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method123(arg0);
		this.aBoolean3 = arg1;
	}

	@OriginalMember(owner = "client!aca", name = "d", descriptor = "(I)I")
	@Override
	public int method7048() {
		return this.anInt107;
	}

	@OriginalMember(owner = "client!aca", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method127(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!aca", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method126(arg0);
		if ((local8 & this.anInt127) == 0) {
			local8 = this.anInt127;
		}
		if ((local8 & 0x1) != 0) {
			this.method124(arg0.getClickCount(), 3, arg0.getX(), arg0.getY());
		}
		if ((local8 & 0x4) != 0) {
			this.method124(arg0.getClickCount(), 5, arg0.getX(), arg0.getY());
		}
		if ((local8 & 0x2) != 0) {
			this.method124(arg0.getClickCount(), 4, arg0.getX(), arg0.getY());
		}
		this.anInt127 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	private void method123(@OriginalArg(0) Component arg0) {
		this.method125();
		this.aComponent1 = arg0;
		this.aComponent1.addMouseListener(this);
		this.aComponent1.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!aca", name = "b", descriptor = "(I)Z")
	@Override
	protected boolean method7046() {
		return (this.anInt108 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(IIIZI)V")
	private void method124(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(14) Class2_Sub35_Sub2 local14 = new Class2_Sub35_Sub2();
		local14.anInt10743 = arg2;
		local14.anInt10736 = arg3;
		local14.anInt10738 = arg1;
		local14.anInt10737 = arg0;
		local14.aLong286 = Static99.method1701();
		this.aClass271_2.method7174(local14);
	}

	@OriginalMember(owner = "client!aca", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!aca", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method127(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(Z)V")
	private void method125() {
		if (this.aComponent1 == null) {
			return;
		}
		this.aComponent1.removeMouseMotionListener(this);
		this.aComponent1.removeMouseListener(this);
		this.aComponent1 = null;
		this.aClass271_2 = null;
		this.anInt126 = this.anInt125 = this.anInt127 = 0;
		this.aClass271_1 = null;
		this.anInt107 = this.anInt110 = this.anInt108 = 0;
	}

	@OriginalMember(owner = "client!aca", name = "g", descriptor = "(I)Lclient!uaa;")
	@Override
	public Class2_Sub35 method7052() {
		return (Class2_Sub35) this.aClass271_1.method7172();
	}

	@OriginalMember(owner = "client!aca", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7047() {
		return (this.anInt108 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!aca", name = "f", descriptor = "(I)V")
	@Override
	public synchronized void method7051() {
		this.anInt107 = this.anInt126;
		this.anInt108 = this.anInt127;
		this.anInt110 = this.anInt125;
		@Pc(22) Class271 local22 = this.aClass271_1;
		this.aClass271_1 = this.aClass271_2;
		this.aClass271_2 = local22;
		this.aClass271_2.method7181();
	}

	@OriginalMember(owner = "client!aca", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method127(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!aca", name = "e", descriptor = "(I)I")
	@Override
	public int method7049() {
		return this.anInt110;
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(B)Z")
	@Override
	protected boolean method7053() {
		return (this.anInt108 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!aca", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method126(arg0);
		if (local10 == 1) {
			this.method124(arg0.getClickCount(), 0, arg0.getX(), arg0.getY());
		} else if (local10 == 4) {
			this.method124(arg0.getClickCount(), 2, arg0.getX(), arg0.getY());
		} else if (local10 == 2) {
			this.method124(arg0.getClickCount(), 1, arg0.getX(), arg0.getY());
		}
		this.anInt127 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;B)I")
	private int method126(@OriginalArg(0) MouseEvent arg0) {
		@Pc(13) int local13 = arg0.getModifiers();
		@Pc(24) boolean local24 = (local13 & 0x10) != 0;
		@Pc(35) boolean local35 = (local13 & 0x8) != 0;
		@Pc(43) boolean local43 = (local13 & 0x4) != 0;
		if (local35 && (local24 || local43)) {
			local35 = false;
		}
		if (local24 && local43) {
			return 4;
		} else if (local24) {
			return 1;
		} else if (local35) {
			return 2;
		} else if (local43) {
			return 4;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(III)V")
	private void method127(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt125 = arg0;
		this.anInt126 = arg1;
		if (this.aBoolean3) {
			this.method124(0, -1, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!aca", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method127(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(I)V")
	@Override
	public void method7045() {
		this.method125();
	}
}
