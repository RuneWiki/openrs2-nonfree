import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class9_Sub2 extends Class9 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!bd", name = "j", descriptor = "I")
	private int anInt739;

	@OriginalMember(owner = "client!bd", name = "t", descriptor = "I")
	private int anInt748;

	@OriginalMember(owner = "client!bd", name = "z", descriptor = "I")
	private int anInt752;

	@OriginalMember(owner = "client!bd", name = "E", descriptor = "I")
	private int anInt756;

	@OriginalMember(owner = "client!bd", name = "F", descriptor = "I")
	private int anInt757;

	@OriginalMember(owner = "client!bd", name = "H", descriptor = "I")
	private int anInt759;

	@OriginalMember(owner = "client!bd", name = "K", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!bd", name = "s", descriptor = "Lclient!uh;")
	private Class341 aClass341_6 = new Class341();

	@OriginalMember(owner = "client!bd", name = "B", descriptor = "Lclient!uh;")
	private Class341 aClass341_7 = new Class341();

	@OriginalMember(owner = "client!bd", name = "J", descriptor = "Z")
	private final boolean aBoolean62;

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class9_Sub2(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method804(arg0);
		this.aBoolean62 = arg1;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(BLjava/awt/Component;)V")
	private void method804(@OriginalArg(1) Component arg0) {
		this.method809();
		this.aComponent2 = arg0;
		this.aComponent2.addMouseListener(this);
		this.aComponent2.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!bd", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method806(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!bd", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method806(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)I")
	private int method805(@OriginalArg(1) MouseEvent arg0) {
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

	@OriginalMember(owner = "client!bd", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method806(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)Z")
	@Override
	protected boolean method796() {
		return (this.anInt739 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method795() {
		this.anInt739 = this.anInt759;
		this.anInt752 = this.anInt756;
		this.anInt748 = this.anInt757;
		@Pc(23) Class341 local23 = this.aClass341_6;
		this.aClass341_6 = this.aClass341_7;
		this.aClass341_7 = local23;
		this.aClass341_7.method8525();
	}

	@OriginalMember(owner = "client!bd", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method806(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IBI)V")
	private void method806(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt757 = arg1;
		this.anInt756 = arg0;
		if (this.aBoolean62) {
			this.method807(-1, arg0, arg1, 0);
		}
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(B)I")
	@Override
	public int method800() {
		return this.anInt752;
	}

	@OriginalMember(owner = "client!bd", name = "f", descriptor = "(I)Lclient!bu;")
	@Override
	public Class2_Sub9 method802() {
		return (Class2_Sub9) this.aClass341_6.method8526();
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIII)V")
	private void method807(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class2_Sub9_Sub2 local7 = new Class2_Sub9_Sub2();
		local7.anInt8373 = arg2;
		local7.anInt8368 = arg1;
		local7.anInt8365 = arg3;
		local7.anInt8370 = arg0;
		local7.aLong205 = Static277.method5091();
		this.aClass341_7.method8528(local7);
	}

	@OriginalMember(owner = "client!bd", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "(I)V")
	@Override
	public void method798() {
		this.method809();
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)Z")
	@Override
	protected boolean method794() {
		return (this.anInt739 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!bd", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method801() {
		return (this.anInt739 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!bd", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method805(arg0);
		if ((local8 & this.anInt759) == 0) {
			local8 = this.anInt759;
		}
		if ((local8 & 0x1) != 0) {
			this.method807(3, arg0.getY(), arg0.getX(), arg0.getClickCount());
		}
		if ((local8 & 0x4) != 0) {
			this.method807(5, arg0.getY(), arg0.getX(), arg0.getClickCount());
		}
		if ((local8 & 0x2) != 0) {
			this.method807(4, arg0.getY(), arg0.getX(), arg0.getClickCount());
		}
		this.anInt759 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!bd", name = "g", descriptor = "(I)V")
	private void method809() {
		if (this.aComponent2 == null) {
			return;
		}
		this.aComponent2.removeMouseMotionListener(this);
		this.aComponent2.removeMouseListener(this);
		this.aComponent2 = null;
		this.aClass341_6 = null;
		this.aClass341_7 = null;
		this.anInt748 = this.anInt752 = this.anInt739 = 0;
		this.anInt757 = this.anInt756 = this.anInt759 = 0;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Z)I")
	@Override
	public int method803() {
		return this.anInt748;
	}

	@OriginalMember(owner = "client!bd", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method805(arg0);
		if (local10 == 1) {
			this.method807(0, arg0.getY(), arg0.getX(), arg0.getClickCount());
		} else if (local10 == 4) {
			this.method807(2, arg0.getY(), arg0.getX(), arg0.getClickCount());
		} else if (local10 == 2) {
			this.method807(1, arg0.getY(), arg0.getX(), arg0.getClickCount());
		}
		this.anInt759 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}
}
