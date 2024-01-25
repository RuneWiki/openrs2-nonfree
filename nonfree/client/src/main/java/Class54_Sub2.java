import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class54_Sub2 extends Class54 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!ud", name = "l", descriptor = "I")
	private int anInt9299;

	@OriginalMember(owner = "client!ud", name = "w", descriptor = "I")
	private int anInt9309;

	@OriginalMember(owner = "client!ud", name = "G", descriptor = "I")
	private int anInt9319;

	@OriginalMember(owner = "client!ud", name = "J", descriptor = "I")
	private int anInt9322;

	@OriginalMember(owner = "client!ud", name = "K", descriptor = "I")
	private int anInt9323;

	@OriginalMember(owner = "client!ud", name = "L", descriptor = "I")
	private int anInt9324;

	@OriginalMember(owner = "client!ud", name = "O", descriptor = "Ljava/awt/Component;")
	private Component aComponent5;

	@OriginalMember(owner = "client!ud", name = "s", descriptor = "Lclient!or;")
	private Class244 aClass244_66 = new Class244();

	@OriginalMember(owner = "client!ud", name = "M", descriptor = "Lclient!or;")
	private Class244 aClass244_67 = new Class244();

	@OriginalMember(owner = "client!ud", name = "N", descriptor = "Z")
	private final boolean aBoolean625;

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class54_Sub2(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method7319(arg0);
		this.aBoolean625 = arg1;
	}

	@OriginalMember(owner = "client!ud", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method7323(arg0);
		if (local10 == 1) {
			this.method7322(0, arg0.getY(), arg0.getClickCount(), arg0.getX());
		} else if (local10 == 4) {
			this.method7322(2, arg0.getY(), arg0.getClickCount(), arg0.getX());
		} else if (local10 == 2) {
			this.method7322(1, arg0.getY(), arg0.getClickCount(), arg0.getX());
		}
		this.anInt9323 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ud", name = "g", descriptor = "(I)V")
	@Override
	public synchronized void method7312() {
		this.anInt9319 = this.anInt9323;
		this.anInt9299 = this.anInt9324;
		this.anInt9309 = this.anInt9322;
		@Pc(25) Class244 local25 = this.aClass244_66;
		this.aClass244_66 = this.aClass244_67;
		this.aClass244_67 = local25;
		this.aClass244_67.method5581();
	}

	@OriginalMember(owner = "client!ud", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method7320(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)Lclient!vfa;")
	@Override
	public Class3_Sub27 method7301() {
		return (Class3_Sub27) this.aClass244_66.method5578();
	}

	@OriginalMember(owner = "client!ud", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method7323(arg0);
		if ((this.anInt9323 & local8) == 0) {
			local8 = this.anInt9323;
		}
		if ((local8 & 0x1) != 0) {
			this.method7322(3, arg0.getY(), arg0.getClickCount(), arg0.getX());
		}
		if ((local8 & 0x4) != 0) {
			this.method7322(5, arg0.getY(), arg0.getClickCount(), arg0.getX());
		}
		if ((local8 & 0x2) != 0) {
			this.method7322(4, arg0.getY(), arg0.getClickCount(), arg0.getX());
		}
		this.anInt9323 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "(I)I")
	@Override
	public int method7306() {
		return this.anInt9309;
	}

	@OriginalMember(owner = "client!ud", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method7320(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	private void method7319(@OriginalArg(0) Component arg0) {
		this.method7321();
		this.aComponent5 = arg0;
		this.aComponent5.addMouseListener(this);
		this.aComponent5.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!ud", name = "i", descriptor = "(I)I")
	@Override
	public int method7315() {
		return this.anInt9299;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(III)V")
	private void method7320(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt9322 = arg0;
		this.anInt9324 = arg1;
		if (this.aBoolean625) {
			this.method7322(-1, arg1, 0, arg0);
		}
	}

	@OriginalMember(owner = "client!ud", name = "k", descriptor = "(I)V")
	private void method7321() {
		if (this.aComponent5 == null) {
			return;
		}
		this.aComponent5.removeMouseMotionListener(this);
		this.aComponent5.removeMouseListener(this);
		this.aComponent5 = null;
		this.anInt9322 = this.anInt9324 = this.anInt9323 = 0;
		this.anInt9309 = this.anInt9299 = this.anInt9319 = 0;
		this.aClass244_66 = null;
		this.aClass244_67 = null;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIII)V")
	private void method7322(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class3_Sub27_Sub1 local7 = new Class3_Sub27_Sub1();
		local7.anInt4784 = arg3;
		local7.anInt4781 = arg0;
		local7.anInt4780 = arg1;
		local7.anInt4789 = arg2;
		local7.aLong114 = Static96.method2000();
		this.aClass244_67.method5570(local7);
	}

	@OriginalMember(owner = "client!ud", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method7320(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
	@Override
	public void method7302() {
		this.method7321();
	}

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method7307() {
		return (this.anInt9319 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(B)Z")
	@Override
	protected boolean method7305() {
		return (this.anInt9319 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;B)I")
	private int method7323(@OriginalArg(0) MouseEvent arg0) {
		@Pc(11) int local11 = arg0.getModifiers();
		@Pc(22) boolean local22 = (local11 & 0x10) != 0;
		@Pc(30) boolean local30 = (local11 & 0x8) != 0;
		@Pc(41) boolean local41 = (local11 & 0x4) != 0;
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

	@OriginalMember(owner = "client!ud", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method7320(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!ud", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ud", name = "f", descriptor = "(I)Z")
	@Override
	protected boolean method7311() {
		return (this.anInt9319 & 0x4) != 0;
	}
}
