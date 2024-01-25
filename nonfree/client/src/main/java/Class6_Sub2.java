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

@OriginalClass("client!oia")
public final class Class6_Sub2 extends Class6 implements MouseListener, MouseMotionListener, MouseWheelListener {

	@OriginalMember(owner = "client!oia", name = "i", descriptor = "I")
	private int anInt7891;

	@OriginalMember(owner = "client!oia", name = "j", descriptor = "I")
	private int anInt7892;

	@OriginalMember(owner = "client!oia", name = "k", descriptor = "I")
	private int anInt7893;

	@OriginalMember(owner = "client!oia", name = "l", descriptor = "I")
	private int anInt7894;

	@OriginalMember(owner = "client!oia", name = "m", descriptor = "I")
	private int anInt7895;

	@OriginalMember(owner = "client!oia", name = "o", descriptor = "I")
	private int anInt7896;

	@OriginalMember(owner = "client!oia", name = "q", descriptor = "Ljava/awt/Component;")
	private Component aComponent4;

	@OriginalMember(owner = "client!oia", name = "h", descriptor = "Lclient!ow;")
	private Class271 aClass271_45 = new Class271();

	@OriginalMember(owner = "client!oia", name = "n", descriptor = "Lclient!ow;")
	private Class271 aClass271_46 = new Class271();

	@OriginalMember(owner = "client!oia", name = "p", descriptor = "Z")
	private final boolean aBoolean586;

	@OriginalMember(owner = "client!oia", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class6_Sub2(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method7057(arg0);
		this.aBoolean586 = arg1;
	}

	@OriginalMember(owner = "client!oia", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method7056(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!oia", name = "g", descriptor = "(I)Lclient!uaa;")
	@Override
	public Class2_Sub35 method7052() {
		return (Class2_Sub35) this.aClass271_45.method7172();
	}

	@OriginalMember(owner = "client!oia", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method7058(arg0);
		if (local4 == 1) {
			this.method7060(arg0.getClickCount(), 0, arg0.getY(), arg0.getX());
		} else if (local4 == 4) {
			this.method7060(arg0.getClickCount(), 2, arg0.getY(), arg0.getX());
		} else if (local4 == 2) {
			this.method7060(arg0.getClickCount(), 1, arg0.getY(), arg0.getX());
		}
		this.anInt7894 |= local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!oia", name = "b", descriptor = "(I)Z")
	@Override
	protected boolean method7046() {
		return (this.anInt7893 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(III)V")
	private void method7056(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt7895 = arg1;
		this.anInt7896 = arg0;
		if (this.aBoolean586) {
			this.method7060(0, -1, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(I)V")
	@Override
	public void method7045() {
		this.method7059();
	}

	@OriginalMember(owner = "client!oia", name = "e", descriptor = "(I)I")
	@Override
	public int method7049() {
		return this.anInt7892;
	}

	@OriginalMember(owner = "client!oia", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		@Pc(8) int local8 = arg0.getWheelRotation();
		this.method7060(local8, 6, local5, local2);
		arg0.consume();
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(ILjava/awt/Component;)V")
	private void method7057(@OriginalArg(1) Component arg0) {
		this.method7059();
		this.aComponent4 = arg0;
		this.aComponent4.addMouseListener(this);
		this.aComponent4.addMouseMotionListener(this);
		this.aComponent4.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!oia", name = "d", descriptor = "(I)I")
	@Override
	public int method7048() {
		return this.anInt7891;
	}

	@OriginalMember(owner = "client!oia", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method7056(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!oia", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!oia", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7047() {
		return (this.anInt7893 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;B)I")
	private int method7058(@OriginalArg(0) MouseEvent arg0) {
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

	@OriginalMember(owner = "client!oia", name = "f", descriptor = "(I)V")
	@Override
	public synchronized void method7051() {
		this.anInt7893 = this.anInt7894;
		this.anInt7892 = this.anInt7896;
		this.anInt7891 = this.anInt7895;
		@Pc(14) Class271 local14 = this.aClass271_45;
		this.aClass271_45 = this.aClass271_46;
		this.aClass271_46 = local14;
		this.aClass271_46.method7181();
	}

	@OriginalMember(owner = "client!oia", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method7056(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!oia", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method7058(arg0);
		if ((this.anInt7894 & local4) == 0) {
			local4 = this.anInt7894;
		}
		if ((local4 & 0x1) != 0) {
			this.method7060(arg0.getClickCount(), 3, arg0.getY(), arg0.getX());
		}
		if ((local4 & 0x4) != 0) {
			this.method7060(arg0.getClickCount(), 5, arg0.getY(), arg0.getX());
		}
		if ((local4 & 0x2) != 0) {
			this.method7060(arg0.getClickCount(), 4, arg0.getY(), arg0.getX());
		}
		this.anInt7894 &= ~local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!oia", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method7056(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(B)Z")
	@Override
	protected boolean method7053() {
		return (this.anInt7893 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!oia", name = "b", descriptor = "(B)V")
	private void method7059() {
		if (this.aComponent4 == null) {
			return;
		}
		this.aComponent4.removeMouseWheelListener(this);
		this.aComponent4.removeMouseMotionListener(this);
		this.aComponent4.removeMouseListener(this);
		this.anInt7891 = this.anInt7892 = this.anInt7893 = 0;
		this.aClass271_45 = null;
		this.aComponent4 = null;
		this.anInt7895 = this.anInt7896 = this.anInt7894 = 0;
		this.aClass271_46 = null;
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(IIIII)V")
	private void method7060(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class2_Sub35_Sub1 local3 = new Class2_Sub35_Sub1();
		local3.anInt5580 = arg3;
		local3.anInt5578 = arg1;
		local3.anInt5577 = arg2;
		local3.aLong154 = Static99.method1701();
		local3.anInt5579 = arg0;
		this.aClass271_46.method7174(local3);
	}
}
