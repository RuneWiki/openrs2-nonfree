import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hi")
public final class Class59_Sub2 extends Class59 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!hi", name = "l", descriptor = "I")
	private int anInt4828;

	@OriginalMember(owner = "client!hi", name = "x", descriptor = "I")
	private int anInt4838;

	@OriginalMember(owner = "client!hi", name = "z", descriptor = "I")
	private int anInt4840;

	@OriginalMember(owner = "client!hi", name = "A", descriptor = "I")
	private int anInt4841;

	@OriginalMember(owner = "client!hi", name = "B", descriptor = "I")
	private int anInt4842;

	@OriginalMember(owner = "client!hi", name = "H", descriptor = "I")
	private int anInt4847;

	@OriginalMember(owner = "client!hi", name = "J", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!hi", name = "t", descriptor = "Lclient!qia;")
	private Class276 aClass276_32 = new Class276();

	@OriginalMember(owner = "client!hi", name = "E", descriptor = "Lclient!qia;")
	private Class276 aClass276_33 = new Class276();

	@OriginalMember(owner = "client!hi", name = "L", descriptor = "Z")
	private final boolean aBoolean426;

	@OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class59_Sub2(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method4118(arg0);
		this.aBoolean426 = arg1;
	}

	@OriginalMember(owner = "client!hi", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method4112(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!hi", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method4113(arg0);
		if ((local8 & this.anInt4842) == 0) {
			local8 = this.anInt4842;
		}
		if ((local8 & 0x1) != 0) {
			this.method4117(3, arg0.getX(), arg0.getY(), arg0.getClickCount());
		}
		if ((local8 & 0x4) != 0) {
			this.method4117(5, arg0.getX(), arg0.getY(), arg0.getClickCount());
		}
		if ((local8 & 0x2) != 0) {
			this.method4117(4, arg0.getX(), arg0.getY(), arg0.getClickCount());
		}
		this.anInt4842 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!hi", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method4112(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Z)Lclient!uk;")
	@Override
	public Class3_Sub30 method4104() {
		return (Class3_Sub30) this.aClass276_32.method6911();
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(III)V")
	private void method4112(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt4841 = arg0;
		this.anInt4847 = arg1;
		if (this.aBoolean426) {
			this.method4117(-1, arg0, arg1, 0);
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)Z")
	@Override
	protected boolean method4102() {
		return (this.anInt4840 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!hi", name = "d", descriptor = "(I)Z")
	@Override
	protected boolean method4108() {
		return (this.anInt4840 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!hi", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method4112(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!hi", name = "d", descriptor = "(B)I")
	@Override
	public int method4106() {
		return this.anInt4828;
	}

	@OriginalMember(owner = "client!hi", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method4113(arg0);
		if (local10 == 1) {
			this.method4117(0, arg0.getX(), arg0.getY(), arg0.getClickCount());
		} else if (local10 == 4) {
			this.method4117(2, arg0.getX(), arg0.getY(), arg0.getClickCount());
		} else if (local10 == 2) {
			this.method4117(1, arg0.getX(), arg0.getY(), arg0.getClickCount());
		}
		this.anInt4842 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "(B)V")
	@Override
	public synchronized void method4101() {
		this.anInt4840 = this.anInt4842;
		this.anInt4828 = this.anInt4847;
		this.anInt4838 = this.anInt4841;
		@Pc(24) Class276 local24 = this.aClass276_32;
		this.aClass276_32 = this.aClass276_33;
		this.aClass276_33 = local24;
		this.aClass276_33.method6910();
	}

	@OriginalMember(owner = "client!hi", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method4110() {
		return (this.anInt4840 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)I")
	private int method4113(@OriginalArg(0) MouseEvent arg0) {
		@Pc(14) int local14 = arg0.getModifiers();
		@Pc(25) boolean local25 = (local14 & 0x10) != 0;
		@Pc(33) boolean local33 = (local14 & 0x8) != 0;
		@Pc(44) boolean local44 = (local14 & 0x4) != 0;
		if (local33 && (local25 || local44)) {
			local33 = false;
		}
		if (local25 && local44) {
			return 4;
		} else if (local25) {
			return 1;
		} else if (local33) {
			return 2;
		} else if (local44) {
			return 4;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!hi", name = "f", descriptor = "(B)V")
	private void method4115() {
		if (this.aComponent2 == null) {
			return;
		}
		this.aComponent2.removeMouseMotionListener(this);
		this.aComponent2.removeMouseListener(this);
		this.aClass276_33 = null;
		this.anInt4841 = this.anInt4847 = this.anInt4842 = 0;
		this.aClass276_32 = null;
		this.anInt4838 = this.anInt4828 = this.anInt4840 = 0;
		this.aComponent2 = null;
	}

	@OriginalMember(owner = "client!hi", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIII)V")
	private void method4117(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class3_Sub30_Sub2 local7 = new Class3_Sub30_Sub2();
		local7.anInt7612 = arg1;
		local7.anInt7615 = arg3;
		local7.anInt7624 = arg0;
		local7.anInt7617 = arg2;
		local7.aLong179 = Static444.method6719();
		this.aClass276_33.method6906(local7);
	}

	@OriginalMember(owner = "client!hi", name = "c", descriptor = "(B)V")
	@Override
	public void method4103() {
		this.method4115();
	}

	@OriginalMember(owner = "client!hi", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method4112(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!hi", name = "c", descriptor = "(I)I")
	@Override
	public int method4107() {
		return this.anInt4838;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(BLjava/awt/Component;)V")
	private void method4118(@OriginalArg(1) Component arg0) {
		this.method4115();
		this.aComponent2 = arg0;
		this.aComponent2.addMouseListener(this);
		this.aComponent2.addMouseMotionListener(this);
	}
}
