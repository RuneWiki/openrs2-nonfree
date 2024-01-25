import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wea")
public final class Class358_Sub2 extends Class358 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!wea", name = "g", descriptor = "I")
	private int anInt10247;

	@OriginalMember(owner = "client!wea", name = "l", descriptor = "I")
	private int anInt10251;

	@OriginalMember(owner = "client!wea", name = "u", descriptor = "I")
	private int anInt10260;

	@OriginalMember(owner = "client!wea", name = "D", descriptor = "I")
	private int anInt10267;

	@OriginalMember(owner = "client!wea", name = "G", descriptor = "I")
	private int anInt10270;

	@OriginalMember(owner = "client!wea", name = "H", descriptor = "I")
	private int anInt10271;

	@OriginalMember(owner = "client!wea", name = "K", descriptor = "Ljava/awt/Component;")
	private Component aComponent5;

	@OriginalMember(owner = "client!wea", name = "z", descriptor = "Lclient!fh;")
	private Class114 aClass114_63 = new Class114();

	@OriginalMember(owner = "client!wea", name = "C", descriptor = "Lclient!fh;")
	private Class114 aClass114_64 = new Class114();

	@OriginalMember(owner = "client!wea", name = "I", descriptor = "Z")
	private final boolean aBoolean745;

	@OriginalMember(owner = "client!wea", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class358_Sub2(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method8733(arg0);
		this.aBoolean745 = arg1;
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)I")
	private int method8731(@OriginalArg(1) MouseEvent arg0) {
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

	@OriginalMember(owner = "client!wea", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method8734(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!wea", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method8734(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8723() {
		return (this.anInt10247 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!wea", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(ZIIII)V")
	private void method8732(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class2_Sub1_Sub1 local7 = new Class2_Sub1_Sub1();
		local7.anInt32 = arg2;
		local7.anInt28 = arg3;
		local7.anInt33 = arg0;
		local7.anInt29 = arg1;
		local7.aLong4 = Static48.method1203();
		this.aClass114_64.method2771(local7);
	}

	@OriginalMember(owner = "client!wea", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method8727() {
		this.anInt10247 = this.anInt10271;
		this.anInt10260 = this.anInt10270;
		this.anInt10251 = this.anInt10267;
		@Pc(18) Class114 local18 = this.aClass114_63;
		this.aClass114_63 = this.aClass114_64;
		this.aClass114_64 = local18;
		this.aClass114_64.method2768();
	}

	@OriginalMember(owner = "client!wea", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method8734(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	private void method8733(@OriginalArg(0) Component arg0) {
		this.method8735();
		this.aComponent5 = arg0;
		this.aComponent5.addMouseListener(this);
		this.aComponent5.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!wea", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method8731(arg0);
		if (local10 == 1) {
			this.method8732(0, arg0.getClickCount(), arg0.getY(), arg0.getX());
		} else if (local10 == 4) {
			this.method8732(2, arg0.getClickCount(), arg0.getY(), arg0.getX());
		} else if (local10 == 2) {
			this.method8732(1, arg0.getClickCount(), arg0.getY(), arg0.getX());
		}
		this.anInt10271 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!wea", name = "c", descriptor = "(B)Z")
	@Override
	protected boolean method8730() {
		return (this.anInt10247 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!wea", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method8731(arg0);
		if ((local8 & this.anInt10271) == 0) {
			local8 = this.anInt10271;
		}
		if ((local8 & 0x1) != 0) {
			this.method8732(3, arg0.getClickCount(), arg0.getY(), arg0.getX());
		}
		if ((local8 & 0x4) != 0) {
			this.method8732(5, arg0.getClickCount(), arg0.getY(), arg0.getX());
		}
		if ((local8 & 0x2) != 0) {
			this.method8732(4, arg0.getClickCount(), arg0.getY(), arg0.getX());
		}
		this.anInt10271 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!wea", name = "b", descriptor = "(I)Lclient!cia;")
	@Override
	public Class2_Sub1 method8724() {
		return (Class2_Sub1) this.aClass114_63.method2765();
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(I)I")
	@Override
	public int method8721() {
		return this.anInt10251;
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(IZI)V")
	private void method8734(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt10267 = arg0;
		this.anInt10270 = arg1;
		if (this.aBoolean745) {
			this.method8732(-1, 0, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!wea", name = "e", descriptor = "(I)V")
	@Override
	public void method8728() {
		this.method8735();
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(B)I")
	@Override
	public int method8722() {
		return this.anInt10260;
	}

	@OriginalMember(owner = "client!wea", name = "f", descriptor = "(I)Z")
	@Override
	protected boolean method8729() {
		return (this.anInt10247 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!wea", name = "b", descriptor = "(Z)V")
	private void method8735() {
		if (this.aComponent5 == null) {
			return;
		}
		this.aComponent5.removeMouseMotionListener(this);
		this.aComponent5.removeMouseListener(this);
		this.aComponent5 = null;
		this.anInt10270 = this.anInt10267 = this.anInt10271 = 0;
		this.anInt10260 = this.anInt10251 = this.anInt10247 = 0;
		this.aClass114_63 = null;
		this.aClass114_64 = null;
	}

	@OriginalMember(owner = "client!wea", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method8734(arg0.getY(), arg0.getX());
	}
}
