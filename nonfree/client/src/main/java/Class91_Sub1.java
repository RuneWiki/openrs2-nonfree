import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sm")
public final class Class91_Sub1 extends Class91 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!sm", name = "g", descriptor = "I")
	private int anInt5938;

	@OriginalMember(owner = "client!sm", name = "j", descriptor = "I")
	private int anInt5940;

	@OriginalMember(owner = "client!sm", name = "z", descriptor = "I")
	private int anInt5955;

	@OriginalMember(owner = "client!sm", name = "H", descriptor = "I")
	private int anInt5962;

	@OriginalMember(owner = "client!sm", name = "K", descriptor = "I")
	private int anInt5964;

	@OriginalMember(owner = "client!sm", name = "L", descriptor = "I")
	private int anInt5965;

	@OriginalMember(owner = "client!sm", name = "N", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!sm", name = "n", descriptor = "Lclient!vf;")
	private Class238 aClass238_37 = new Class238();

	@OriginalMember(owner = "client!sm", name = "I", descriptor = "Lclient!vf;")
	private Class238 aClass238_38 = new Class238();

	@OriginalMember(owner = "client!sm", name = "M", descriptor = "Z")
	private final boolean aBoolean437;

	@OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class91_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method5232(arg0);
		this.aBoolean437 = arg1;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)V")
	private void method5227(@OriginalArg(1) MouseEvent arg0) {
		this.anInt5964 = arg0.getX();
		this.anInt5962 = arg0.getY();
		if (this.aBoolean437) {
			this.method5228(arg0.getY(), arg0.getX(), -1);
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)Lclient!oc;")
	@Override
	public Class2_Sub17 method5219() {
		return (Class2_Sub17) this.aClass238_37.method5803();
	}

	@OriginalMember(owner = "client!sm", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method5222() {
		return (this.anInt5955 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIII)V")
	private void method5228(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class2_Sub17_Sub1 local7 = new Class2_Sub17_Sub1();
		local7.anInt2717 = arg2;
		local7.anInt2714 = arg0;
		local7.anInt2716 = arg1;
		local7.aLong73 = Static101.method1805();
		this.aClass238_38.method5796(local7);
	}

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "(B)V")
	@Override
	public void method5218() {
		this.method5234();
	}

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "(I)I")
	@Override
	public int method5223() {
		return this.anInt5940;
	}

	@OriginalMember(owner = "client!sm", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method5233(arg0);
		if ((local8 & this.anInt5965) == 0) {
			local8 = this.anInt5965;
		}
		if ((local8 & 0x1) != 0) {
			this.method5228(arg0.getY(), arg0.getX(), 3);
		}
		if ((local8 & 0x4) != 0) {
			this.method5228(arg0.getY(), arg0.getX(), 5);
		}
		if ((local8 & 0x2) != 0) {
			this.method5228(arg0.getY(), arg0.getX(), 4);
		}
		this.anInt5965 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!sm", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!sm", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method5227(arg0);
	}

	@OriginalMember(owner = "client!sm", name = "c", descriptor = "(I)I")
	@Override
	public int method5224() {
		return this.anInt5938;
	}

	@OriginalMember(owner = "client!sm", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method5227(arg0);
	}

	@OriginalMember(owner = "client!sm", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.anInt5962 = -1;
		this.anInt5964 = -1;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(Z)Z")
	@Override
	protected boolean method5220() {
		return (this.anInt5955 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!sm", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method5227(arg0);
	}

	@OriginalMember(owner = "client!sm", name = "d", descriptor = "(I)Z")
	@Override
	protected boolean method5225() {
		return (this.anInt5955 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(BLjava/awt/Component;)V")
	private void method5232(@OriginalArg(1) Component arg0) {
		this.method5234();
		this.aComponent2 = arg0;
		this.aComponent2.addMouseListener(this);
		this.aComponent2.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(B)V")
	@Override
	public synchronized void method5217() {
		this.anInt5940 = this.anInt5964;
		this.anInt5938 = this.anInt5962;
		this.anInt5955 = this.anInt5965;
		@Pc(22) Class238 local22 = this.aClass238_37;
		this.aClass238_37 = this.aClass238_38;
		this.aClass238_38 = local22;
		this.aClass238_38.method5806();
	}

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "(ILjava/awt/event/MouseEvent;)I")
	private int method5233(@OriginalArg(1) MouseEvent arg0) {
		@Pc(6) int local6 = arg0.getModifiers();
		@Pc(14) boolean local14 = (local6 & 0x10) != 0;
		@Pc(29) boolean local29 = (local6 & 0x8) != 0;
		@Pc(37) boolean local37 = (local6 & 0x4) != 0;
		if (local29 && (local14 || local37)) {
			local29 = false;
		}
		if (local14 && local37) {
			return 4;
		} else if (local14) {
			return 1;
		} else if (local29) {
			return 2;
		} else if (local37) {
			return 4;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!sm", name = "g", descriptor = "(I)V")
	private void method5234() {
		if (this.aComponent2 == null) {
			return;
		}
		this.aComponent2.removeMouseListener(this);
		this.aComponent2.removeMouseMotionListener(this);
		this.anInt5940 = this.anInt5938 = this.anInt5955 = 0;
		this.anInt5964 = this.anInt5962 = this.anInt5965 = 0;
		this.aClass238_38 = null;
		this.aComponent2 = null;
		this.aClass238_37 = null;
	}

	@OriginalMember(owner = "client!sm", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method5233(arg0);
		if (local10 == 1) {
			this.method5228(arg0.getY(), arg0.getX(), 0);
		} else if (local10 == 4) {
			this.method5228(arg0.getY(), arg0.getX(), 2);
		} else if (local10 == 2) {
			this.method5228(arg0.getY(), arg0.getX(), 1);
		}
		this.anInt5965 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}
}
