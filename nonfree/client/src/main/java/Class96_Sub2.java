import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!un")
public final class Class96_Sub2 extends Class96 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!un", name = "n", descriptor = "I")
	private int anInt9833;

	@OriginalMember(owner = "client!un", name = "y", descriptor = "I")
	private int anInt9844;

	@OriginalMember(owner = "client!un", name = "A", descriptor = "I")
	private int anInt9846;

	@OriginalMember(owner = "client!un", name = "F", descriptor = "I")
	private int anInt9849;

	@OriginalMember(owner = "client!un", name = "H", descriptor = "I")
	private int anInt9851;

	@OriginalMember(owner = "client!un", name = "K", descriptor = "I")
	private int anInt9854;

	@OriginalMember(owner = "client!un", name = "Q", descriptor = "Ljava/awt/Component;")
	private Component aComponent5;

	@OriginalMember(owner = "client!un", name = "i", descriptor = "Lclient!kba;")
	private Class163 aClass163_58 = new Class163();

	@OriginalMember(owner = "client!un", name = "E", descriptor = "Lclient!kba;")
	private Class163 aClass163_59 = new Class163();

	@OriginalMember(owner = "client!un", name = "P", descriptor = "Z")
	private final boolean aBoolean778;

	@OriginalMember(owner = "client!un", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class96_Sub2(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method8032(arg0);
		this.aBoolean778 = arg1;
	}

	@OriginalMember(owner = "client!un", name = "d", descriptor = "(B)Z")
	@Override
	protected boolean method8022() {
		return (this.anInt9846 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!un", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8018() {
		return (this.anInt9846 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!un", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method8035(arg0);
		if (local10 == 1) {
			this.method8036(arg0.getX(), arg0.getClickCount(), arg0.getY(), 0);
		} else if (local10 == 4) {
			this.method8036(arg0.getX(), arg0.getClickCount(), arg0.getY(), 2);
		} else if (local10 == 2) {
			this.method8036(arg0.getX(), arg0.getClickCount(), arg0.getY(), 1);
		}
		this.anInt9851 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!un", name = "c", descriptor = "(I)Z")
	@Override
	protected boolean method8024() {
		return (this.anInt9846 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!un", name = "e", descriptor = "(I)V")
	@Override
	public void method8027() {
		this.method8037();
	}

	@OriginalMember(owner = "client!un", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!un", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method8038(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!un", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method8038(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(ILjava/awt/Component;)V")
	private void method8032(@OriginalArg(1) Component arg0) {
		this.method8037();
		this.aComponent5 = arg0;
		this.aComponent5.addMouseListener(this);
		this.aComponent5.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!un", name = "d", descriptor = "(I)I")
	@Override
	public int method8026() {
		return this.anInt9844;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(I)Lclient!hfa;")
	@Override
	public Class6_Sub22 method8020() {
		return (Class6_Sub22) this.aClass163_58.method4969();
	}

	@OriginalMember(owner = "client!un", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method8038(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)I")
	private int method8035(@OriginalArg(1) MouseEvent arg0) {
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

	@OriginalMember(owner = "client!un", name = "e", descriptor = "(B)V")
	@Override
	public synchronized void method8028() {
		this.anInt9833 = this.anInt9849;
		this.anInt9846 = this.anInt9851;
		this.anInt9844 = this.anInt9854;
		@Pc(18) Class163 local18 = this.aClass163_58;
		this.aClass163_58 = this.aClass163_59;
		this.aClass163_59 = local18;
		this.aClass163_59.method4970();
	}

	@OriginalMember(owner = "client!un", name = "c", descriptor = "(B)I")
	@Override
	public int method8019() {
		return this.anInt9833;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IIIII)V")
	private void method8036(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class6_Sub22_Sub1 local7 = new Class6_Sub22_Sub1();
		local7.anInt4008 = arg1;
		local7.anInt4017 = arg3;
		local7.anInt4009 = arg0;
		local7.anInt4013 = arg2;
		local7.aLong113 = Static582.method8056();
		this.aClass163_59.method4967(local7);
	}

	@OriginalMember(owner = "client!un", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method8038(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!un", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method8035(arg0);
		if ((local8 & this.anInt9851) == 0) {
			local8 = this.anInt9851;
		}
		if ((local8 & 0x1) != 0) {
			this.method8036(arg0.getX(), arg0.getClickCount(), arg0.getY(), 3);
		}
		if ((local8 & 0x4) != 0) {
			this.method8036(arg0.getX(), arg0.getClickCount(), arg0.getY(), 5);
		}
		if ((local8 & 0x2) != 0) {
			this.method8036(arg0.getX(), arg0.getClickCount(), arg0.getY(), 4);
		}
		this.anInt9851 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!un", name = "f", descriptor = "(B)V")
	private void method8037() {
		if (this.aComponent5 == null) {
			return;
		}
		this.aComponent5.removeMouseMotionListener(this);
		this.aComponent5.removeMouseListener(this);
		this.anInt9854 = this.anInt9849 = this.anInt9851 = 0;
		this.anInt9844 = this.anInt9833 = this.anInt9846 = 0;
		this.aComponent5 = null;
		this.aClass163_58 = null;
		this.aClass163_59 = null;
	}

	@OriginalMember(owner = "client!un", name = "c", descriptor = "(III)V")
	private void method8038(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt9849 = arg1;
		this.anInt9854 = arg0;
		if (this.aBoolean778) {
			this.method8036(arg0, 0, arg1, -1);
		}
	}
}
