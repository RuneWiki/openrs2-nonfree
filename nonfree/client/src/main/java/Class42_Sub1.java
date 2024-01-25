import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hka")
public final class Class42_Sub1 extends Class42 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!hka", name = "q", descriptor = "I")
	private int anInt4443;

	@OriginalMember(owner = "client!hka", name = "j", descriptor = "I")
	private int anInt4447;

	@OriginalMember(owner = "client!hka", name = "k", descriptor = "I")
	private int anInt4461;

	@OriginalMember(owner = "client!hka", name = "D", descriptor = "I")
	private int anInt4466;

	@OriginalMember(owner = "client!hka", name = "v", descriptor = "I")
	private int anInt4467;

	@OriginalMember(owner = "client!hka", name = "s", descriptor = "I")
	private int anInt4468;

	@OriginalMember(owner = "client!hka", name = "B", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!hka", name = "F", descriptor = "Lclient!tf;")
	private Class340 aClass340_30 = new Class340();

	@OriginalMember(owner = "client!hka", name = "L", descriptor = "Lclient!tf;")
	private Class340 aClass340_31 = new Class340();

	@OriginalMember(owner = "client!hka", name = "r", descriptor = "Z")
	private final boolean aBoolean348;

	@OriginalMember(owner = "client!hka", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class42_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method4091(arg0);
		this.aBoolean348 = arg1;
	}

	@OriginalMember(owner = "client!hka", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method4090(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!hka", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!hka", name = "d", descriptor = "(I)Z")
	@Override
	protected boolean method6009() {
		return (this.anInt4447 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!hka", name = "e", descriptor = "(B)V")
	private void method4089() {
		if (this.aComponent2 == null) {
			return;
		}
		this.aComponent2.removeMouseMotionListener(this);
		this.aComponent2.removeMouseListener(this);
		this.aClass340_31 = null;
		this.anInt4468 = this.anInt4466 = this.anInt4467 = 0;
		this.anInt4461 = this.anInt4443 = this.anInt4447 = 0;
		this.aComponent2 = null;
		this.aClass340_30 = null;
	}

	@OriginalMember(owner = "client!hka", name = "c", descriptor = "(B)V")
	@Override
	public synchronized void method6012() {
		this.anInt4447 = this.anInt4467;
		this.anInt4443 = this.anInt4466;
		this.anInt4461 = this.anInt4468;
		@Pc(18) Class340 local18 = this.aClass340_30;
		this.aClass340_30 = this.aClass340_31;
		this.aClass340_31 = local18;
		this.aClass340_31.method8129();
	}

	@OriginalMember(owner = "client!hka", name = "a", descriptor = "(IIZ)V")
	private void method4090(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4466 = arg0;
		this.anInt4468 = arg1;
		if (this.aBoolean348) {
			this.method4092(arg0, -1, arg1, 0);
		}
	}

	@OriginalMember(owner = "client!hka", name = "b", descriptor = "(I)I")
	@Override
	public int method6014() {
		return this.anInt4443;
	}

	@OriginalMember(owner = "client!hka", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method4093(arg0);
		if ((local8 & this.anInt4467) == 0) {
			local8 = this.anInt4467;
		}
		if ((local8 & 0x1) != 0) {
			this.method4092(arg0.getY(), 3, arg0.getX(), arg0.getClickCount());
		}
		if ((local8 & 0x4) != 0) {
			this.method4092(arg0.getY(), 5, arg0.getX(), arg0.getClickCount());
		}
		if ((local8 & 0x2) != 0) {
			this.method4092(arg0.getY(), 4, arg0.getX(), arg0.getClickCount());
		}
		this.anInt4467 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!hka", name = "a", descriptor = "(BLjava/awt/Component;)V")
	private void method4091(@OriginalArg(1) Component arg0) {
		this.method4089();
		this.aComponent2 = arg0;
		this.aComponent2.addMouseListener(this);
		this.aComponent2.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!hka", name = "a", descriptor = "(B)I")
	@Override
	public int method6019() {
		return this.anInt4461;
	}

	@OriginalMember(owner = "client!hka", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method4090(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!hka", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6016() {
		return (this.anInt4447 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!hka", name = "a", descriptor = "(IIBII)V")
	private void method4092(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class6_Sub9_Sub1 local7 = new Class6_Sub9_Sub1();
		local7.anInt721 = arg3;
		local7.anInt717 = arg0;
		local7.anInt719 = arg1;
		local7.anInt716 = arg2;
		local7.aLong39 = Static549.method7758();
		this.aClass340_31.method8131(local7);
	}

	@OriginalMember(owner = "client!hka", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)I")
	private int method4093(@OriginalArg(1) MouseEvent arg0) {
		@Pc(6) int local6 = arg0.getModifiers();
		@Pc(18) boolean local18 = (local6 & 0x10) != 0;
		@Pc(30) boolean local30 = (local6 & 0x8) != 0;
		@Pc(42) boolean local42 = (local6 & 0x4) != 0;
		if (local30 && (local18 || local42)) {
			local30 = false;
		}
		if (local18 && local42) {
			return 4;
		} else if (local18) {
			return 1;
		} else if (local30) {
			return 2;
		} else if (local42) {
			return 4;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!hka", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method4093(arg0);
		if (local10 == 1) {
			this.method4092(arg0.getY(), 0, arg0.getX(), arg0.getClickCount());
		} else if (local10 == 4) {
			this.method4092(arg0.getY(), 2, arg0.getX(), arg0.getClickCount());
		} else if (local10 == 2) {
			this.method4092(arg0.getY(), 1, arg0.getX(), arg0.getClickCount());
		}
		this.anInt4467 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!hka", name = "f", descriptor = "(I)Z")
	@Override
	protected boolean method6017() {
		return (this.anInt4447 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!hka", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method4090(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!hka", name = "a", descriptor = "(I)Lclient!vha;")
	@Override
	public Class6_Sub9 method6011() {
		return (Class6_Sub9) this.aClass340_30.method8127();
	}

	@OriginalMember(owner = "client!hka", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method4090(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!hka", name = "b", descriptor = "(B)V")
	@Override
	public void method6021() {
		this.method4089();
	}
}
