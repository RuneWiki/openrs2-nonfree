import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nv")
public final class Class96_Sub1 extends Class96 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!nv", name = "k", descriptor = "I")
	private int anInt4944;

	@OriginalMember(owner = "client!nv", name = "q", descriptor = "I")
	private int anInt4950;

	@OriginalMember(owner = "client!nv", name = "x", descriptor = "I")
	private int anInt4955;

	@OriginalMember(owner = "client!nv", name = "H", descriptor = "I")
	private int anInt4962;

	@OriginalMember(owner = "client!nv", name = "J", descriptor = "I")
	private int anInt4964;

	@OriginalMember(owner = "client!nv", name = "K", descriptor = "I")
	private int anInt4965;

	@OriginalMember(owner = "client!nv", name = "M", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!nv", name = "r", descriptor = "Lclient!sr;")
	private Class227 aClass227_29 = new Class227();

	@OriginalMember(owner = "client!nv", name = "E", descriptor = "Lclient!sr;")
	private Class227 aClass227_30 = new Class227();

	@OriginalMember(owner = "client!nv", name = "L", descriptor = "Z")
	private final boolean aBoolean563;

	@OriginalMember(owner = "client!nv", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class96_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method3887(arg0);
		this.aBoolean563 = arg1;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)V")
	private void method3881(@OriginalArg(0) MouseEvent arg0) {
		this.anInt4962 = arg0.getX();
		this.anInt4964 = arg0.getY();
		if (this.aBoolean563) {
			this.method3885(-1, arg0.getX(), arg0.getY());
		}
	}

	@OriginalMember(owner = "client!nv", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method3881(arg0);
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(ZLjava/awt/event/MouseEvent;)I")
	private int method3882(@OriginalArg(1) MouseEvent arg0) {
		@Pc(13) int local13 = arg0.getModifiers();
		@Pc(21) boolean local21 = (local13 & 0x10) != 0;
		@Pc(32) boolean local32 = (local13 & 0x8) != 0;
		@Pc(40) boolean local40 = (local13 & 0x4) != 0;
		if (local32 && (local21 || local40)) {
			local32 = false;
		}
		if (local21 && local40) {
			return 4;
		} else if (local21) {
			return 1;
		} else if (local32) {
			return 2;
		} else if (local40) {
			return 4;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "(B)I")
	@Override
	public int method3872() {
		return this.anInt4944;
	}

	@OriginalMember(owner = "client!nv", name = "d", descriptor = "(B)V")
	private void method3883() {
		if (this.aComponent2 == null) {
			return;
		}
		this.aComponent2.removeMouseListener(this);
		this.aComponent2.removeMouseMotionListener(this);
		this.aClass227_29 = null;
		this.anInt4944 = this.anInt4955 = this.anInt4950 = 0;
		this.aComponent2 = null;
		this.aClass227_30 = null;
		this.anInt4962 = this.anInt4964 = this.anInt4965 = 0;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(B)Z")
	@Override
	protected boolean method3871() {
		return (this.anInt4950 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!nv", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method3881(arg0);
	}

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "(I)Lclient!st;")
	@Override
	public Class1_Sub24 method3873() {
		return (Class1_Sub24) this.aClass227_29.method4974();
	}

	@OriginalMember(owner = "client!nv", name = "c", descriptor = "(I)V")
	@Override
	public void method3874() {
		this.method3883();
	}

	@OriginalMember(owner = "client!nv", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method3882(arg0);
		if (local10 == 1) {
			this.method3885(0, arg0.getX(), arg0.getY());
		} else if (local10 == 4) {
			this.method3885(2, arg0.getX(), arg0.getY());
		} else if (local10 == 2) {
			this.method3885(1, arg0.getX(), arg0.getY());
		}
		this.anInt4965 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIZI)V")
	private void method3885(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class1_Sub24_Sub1 local7 = new Class1_Sub24_Sub1();
		local7.anInt2811 = arg2;
		local7.anInt2810 = arg0;
		local7.anInt2812 = arg1;
		local7.aLong103 = Static27.method359();
		this.aClass227_30.method4972(local7);
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(BLjava/awt/Component;)V")
	private void method3887(@OriginalArg(1) Component arg0) {
		this.method3883();
		this.aComponent2 = arg0;
		this.aComponent2.addMouseListener(this);
		this.aComponent2.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!nv", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.anInt4964 = -1;
		this.anInt4962 = -1;
	}

	@OriginalMember(owner = "client!nv", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method3881(arg0);
	}

	@OriginalMember(owner = "client!nv", name = "c", descriptor = "(B)V")
	@Override
	public synchronized void method3879() {
		this.anInt4955 = this.anInt4964;
		this.anInt4950 = this.anInt4965;
		this.anInt4944 = this.anInt4962;
		@Pc(18) Class227 local18 = this.aClass227_29;
		this.aClass227_29 = this.aClass227_30;
		this.aClass227_30 = local18;
		this.aClass227_30.method4981();
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method3875() {
		return (this.anInt4950 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!nv", name = "d", descriptor = "(I)Z")
	@Override
	protected boolean method3876() {
		return (this.anInt4950 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!nv", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!nv", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method3882(arg0);
		if ((this.anInt4965 & local8) == 0) {
			local8 = this.anInt4965;
		}
		if ((local8 & 0x1) != 0) {
			this.method3885(3, arg0.getX(), arg0.getY());
		}
		if ((local8 & 0x4) != 0) {
			this.method3885(5, arg0.getX(), arg0.getY());
		}
		if ((local8 & 0x2) != 0) {
			this.method3885(4, arg0.getX(), arg0.getY());
		}
		this.anInt4965 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(I)I")
	@Override
	public int method3870() {
		return this.anInt4955;
	}
}
