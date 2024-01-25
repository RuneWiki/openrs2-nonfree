import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jga")
public final class Class107_Sub2 extends Class107 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!jga", name = "o", descriptor = "I")
	private int anInt4800;

	@OriginalMember(owner = "client!jga", name = "N", descriptor = "I")
	private int anInt4816;

	@OriginalMember(owner = "client!jga", name = "B", descriptor = "I")
	private int anInt4823;

	@OriginalMember(owner = "client!jga", name = "u", descriptor = "I")
	private int anInt4824;

	@OriginalMember(owner = "client!jga", name = "m", descriptor = "I")
	private int anInt4826;

	@OriginalMember(owner = "client!jga", name = "K", descriptor = "I")
	private int anInt4828;

	@OriginalMember(owner = "client!jga", name = "C", descriptor = "Ljava/awt/Component;")
	private Component aComponent5;

	@OriginalMember(owner = "client!jga", name = "H", descriptor = "Lclient!ef;")
	private Class102 aClass102_35 = new Class102();

	@OriginalMember(owner = "client!jga", name = "G", descriptor = "Lclient!ef;")
	private Class102 aClass102_36 = new Class102();

	@OriginalMember(owner = "client!jga", name = "q", descriptor = "Z")
	private final boolean aBoolean378;

	@OriginalMember(owner = "client!jga", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class107_Sub2(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method4083(arg0);
		this.aBoolean378 = arg1;
	}

	@OriginalMember(owner = "client!jga", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method4076() {
		this.anInt4816 = this.anInt4826;
		this.anInt4800 = this.anInt4828;
		this.anInt4823 = this.anInt4824;
		@Pc(22) Class102 local22 = this.aClass102_35;
		this.aClass102_35 = this.aClass102_36;
		this.aClass102_36 = local22;
		this.aClass102_36.method1932();
	}

	@OriginalMember(owner = "client!jga", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method4081(arg0);
		if (local10 == 1) {
			this.method4087(arg0.getX(), arg0.getClickCount(), arg0.getY(), 0);
		} else if (local10 == 4) {
			this.method4087(arg0.getX(), arg0.getClickCount(), arg0.getY(), 2);
		} else if (local10 == 2) {
			this.method4087(arg0.getX(), arg0.getClickCount(), arg0.getY(), 1);
		}
		this.anInt4828 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(BLjava/awt/event/MouseEvent;)I")
	private int method4081(@OriginalArg(1) MouseEvent arg0) {
		@Pc(6) int local6 = arg0.getModifiers();
		@Pc(18) boolean local18 = (local6 & 0x10) != 0;
		@Pc(36) boolean local36 = (local6 & 0x8) != 0;
		@Pc(45) boolean local45 = (local6 & 0x4) != 0;
		if (local36 && (local18 || local45)) {
			local36 = false;
		}
		if (local18 && local45) {
			return 4;
		} else if (local18) {
			return 1;
		} else if (local36) {
			return 2;
		} else if (local45) {
			return 4;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!jga", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method4086(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(ILjava/awt/Component;)V")
	private void method4083(@OriginalArg(1) Component arg0) {
		this.method4089();
		this.aComponent5 = arg0;
		this.aComponent5.addMouseListener(this);
		this.aComponent5.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(B)Z")
	@Override
	protected boolean method4070() {
		return (this.anInt4800 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!jga", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method4081(arg0);
		if ((this.anInt4828 & local8) == 0) {
			local8 = this.anInt4828;
		}
		if ((local8 & 0x1) != 0) {
			this.method4087(arg0.getX(), arg0.getClickCount(), arg0.getY(), 3);
		}
		if ((local8 & 0x4) != 0) {
			this.method4087(arg0.getX(), arg0.getClickCount(), arg0.getY(), 5);
		}
		if ((local8 & 0x2) != 0) {
			this.method4087(arg0.getX(), arg0.getClickCount(), arg0.getY(), 4);
		}
		this.anInt4828 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!jga", name = "b", descriptor = "(III)V")
	private void method4086(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt4826 = arg0;
		this.anInt4824 = arg1;
		if (this.aBoolean378) {
			this.method4087(arg1, 0, arg0, -1);
		}
	}

	@OriginalMember(owner = "client!jga", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method4075() {
		return (this.anInt4800 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!jga", name = "b", descriptor = "(I)Lclient!bk;")
	@Override
	public Class5_Sub6 method4073() {
		return (Class5_Sub6) this.aClass102_35.method1928();
	}

	@OriginalMember(owner = "client!jga", name = "b", descriptor = "(B)I")
	@Override
	public int method4072() {
		return this.anInt4816;
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(IIIII)V")
	private void method4087(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class5_Sub6_Sub2 local7 = new Class5_Sub6_Sub2();
		local7.anInt6796 = arg1;
		local7.anInt6800 = arg3;
		local7.anInt6805 = arg0;
		local7.anInt6802 = arg2;
		local7.aLong210 = Static515.method7499(111);
		this.aClass102_36.method1921(local7);
	}

	@OriginalMember(owner = "client!jga", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method4086(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!jga", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method4086(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!jga", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method4086(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!jga", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!jga", name = "c", descriptor = "(I)I")
	@Override
	public int method4079() {
		return this.anInt4823;
	}

	@OriginalMember(owner = "client!jga", name = "f", descriptor = "(I)Z")
	@Override
	protected boolean method4074() {
		return (this.anInt4800 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!jga", name = "d", descriptor = "(B)V")
	@Override
	public void method4077() {
		this.method4089();
	}

	@OriginalMember(owner = "client!jga", name = "e", descriptor = "(B)V")
	private void method4089() {
		if (this.aComponent5 == null) {
			return;
		}
		this.aComponent5.removeMouseMotionListener(this);
		this.aComponent5.removeMouseListener(this);
		this.anInt4824 = this.anInt4826 = this.anInt4828 = 0;
		this.aClass102_35 = null;
		this.aComponent5 = null;
		this.anInt4823 = this.anInt4816 = this.anInt4800 = 0;
		this.aClass102_36 = null;
	}
}
