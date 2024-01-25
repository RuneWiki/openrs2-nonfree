import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public final class Class126_Sub1 extends Class126 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!sf", name = "k", descriptor = "I")
	private int anInt6462;

	@OriginalMember(owner = "client!sf", name = "m", descriptor = "I")
	private int anInt6464;

	@OriginalMember(owner = "client!sf", name = "D", descriptor = "I")
	private int anInt6479;

	@OriginalMember(owner = "client!sf", name = "H", descriptor = "I")
	private int anInt6482;

	@OriginalMember(owner = "client!sf", name = "J", descriptor = "I")
	private int anInt6484;

	@OriginalMember(owner = "client!sf", name = "K", descriptor = "I")
	private int anInt6485;

	@OriginalMember(owner = "client!sf", name = "P", descriptor = "Ljava/awt/Component;")
	private Component aComponent3;

	@OriginalMember(owner = "client!sf", name = "A", descriptor = "Lclient!nj;")
	private Class181 aClass181_39 = new Class181();

	@OriginalMember(owner = "client!sf", name = "G", descriptor = "Lclient!nj;")
	private Class181 aClass181_40 = new Class181();

	@OriginalMember(owner = "client!sf", name = "N", descriptor = "Z")
	private final boolean aBoolean442;

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class126_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method5153(arg0);
		this.aBoolean442 = arg1;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	private void method5153(@OriginalArg(0) Component arg0) {
		this.method5158();
		this.aComponent3 = arg0;
		this.aComponent3.addMouseListener(this);
		this.aComponent3.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!sf", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method5156(arg0);
	}

	@OriginalMember(owner = "client!sf", name = "e", descriptor = "(I)Z")
	@Override
	protected boolean method5363() {
		return (this.anInt6464 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!sf", name = "f", descriptor = "(I)I")
	@Override
	public int method5366() {
		return this.anInt6479;
	}

	@OriginalMember(owner = "client!sf", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method5160(arg0);
		if ((this.anInt6482 & local8) == 0) {
			local8 = this.anInt6482;
		}
		if ((local8 & 0x1) != 0) {
			this.method5159(arg0.getY(), 3, arg0.getX());
		}
		if ((local8 & 0x4) != 0) {
			this.method5159(arg0.getY(), 5, arg0.getX());
		}
		if ((local8 & 0x2) != 0) {
			this.method5159(arg0.getY(), 4, arg0.getX());
		}
		this.anInt6482 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!sf", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method5156(arg0);
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;B)V")
	private void method5156(@OriginalArg(0) MouseEvent arg0) {
		this.anInt6484 = arg0.getX();
		this.anInt6485 = arg0.getY();
		if (this.aBoolean442) {
			this.method5159(arg0.getY(), -1, arg0.getX());
		}
	}

	@OriginalMember(owner = "client!sf", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method5160(arg0);
		if (local10 == 1) {
			this.method5159(arg0.getY(), 0, arg0.getX());
		} else if (local10 == 4) {
			this.method5159(arg0.getY(), 2, arg0.getX());
		} else if (local10 == 2) {
			this.method5159(arg0.getY(), 1, arg0.getX());
		}
		this.anInt6482 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!sf", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.anInt6485 = -1;
		this.anInt6484 = -1;
	}

	@OriginalMember(owner = "client!sf", name = "e", descriptor = "(B)V")
	private void method5158() {
		if (this.aComponent3 == null) {
			return;
		}
		this.aComponent3.removeMouseMotionListener(this);
		this.aComponent3.removeMouseListener(this);
		this.anInt6479 = this.anInt6462 = this.anInt6464 = 0;
		this.anInt6484 = this.anInt6485 = this.anInt6482 = 0;
		this.aClass181_39 = null;
		this.aClass181_40 = null;
		this.aComponent3 = null;
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(B)I")
	@Override
	public int method5364() {
		return this.anInt6462;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Z)Z")
	@Override
	protected boolean method5355() {
		return (this.anInt6464 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIBI)V")
	private void method5159(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class2_Sub11_Sub1 local14 = new Class2_Sub11_Sub1();
		local14.anInt1799 = arg2;
		local14.anInt1796 = arg1;
		local14.anInt1794 = arg0;
		local14.aLong114 = Static432.method5870();
		this.aClass181_40.method3973(local14);
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5358() {
		return (this.anInt6464 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "(B)Lclient!ic;")
	@Override
	public Class2_Sub11 method5365() {
		return (Class2_Sub11) this.aClass181_39.method3976();
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V")
	@Override
	public void method5357() {
		this.method5158();
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)I")
	private int method5160(@OriginalArg(0) MouseEvent arg0) {
		@Pc(14) int local14 = arg0.getModifiers();
		@Pc(22) boolean local22 = (local14 & 0x10) != 0;
		@Pc(30) boolean local30 = (local14 & 0x8) != 0;
		@Pc(41) boolean local41 = (local14 & 0x4) != 0;
		if (local30 && (local22 || local41)) {
			local30 = false;
		}
		if (local22 && local41) {
			return 4;
		} else if (local22) {
			return 1;
		} else if (local30) {
			return 2;
		} else if (local41) {
			return 4;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method5361() {
		this.anInt6462 = this.anInt6485;
		this.anInt6464 = this.anInt6482;
		this.anInt6479 = this.anInt6484;
		@Pc(24) Class181 local24 = this.aClass181_39;
		this.aClass181_39 = this.aClass181_40;
		this.aClass181_40 = local24;
		this.aClass181_40.method3969();
	}

	@OriginalMember(owner = "client!sf", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method5156(arg0);
	}

	@OriginalMember(owner = "client!sf", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}
}
