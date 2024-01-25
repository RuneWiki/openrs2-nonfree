import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class335_Sub1 extends Class335 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!uc", name = "h", descriptor = "I")
	private int anInt9224;

	@OriginalMember(owner = "client!uc", name = "s", descriptor = "I")
	private int anInt9235;

	@OriginalMember(owner = "client!uc", name = "B", descriptor = "I")
	private int anInt9244;

	@OriginalMember(owner = "client!uc", name = "J", descriptor = "I")
	private int anInt9250;

	@OriginalMember(owner = "client!uc", name = "K", descriptor = "I")
	private int anInt9251;

	@OriginalMember(owner = "client!uc", name = "O", descriptor = "I")
	private int anInt9253;

	@OriginalMember(owner = "client!uc", name = "S", descriptor = "Ljava/awt/Component;")
	private Component aComponent4;

	@OriginalMember(owner = "client!uc", name = "D", descriptor = "Lclient!fha;")
	private Class109 aClass109_64 = new Class109();

	@OriginalMember(owner = "client!uc", name = "L", descriptor = "Lclient!fha;")
	private Class109 aClass109_65 = new Class109();

	@OriginalMember(owner = "client!uc", name = "P", descriptor = "Z")
	private final boolean aBoolean687;

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class335_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method7761(arg0);
		this.aBoolean687 = arg1;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(III)V")
	private void method7757(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt9251 = arg1;
		this.anInt9250 = arg0;
		if (this.aBoolean687) {
			this.method7764(arg0, -1, 0, arg1);
		}
	}

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "(B)Lclient!fi;")
	@Override
	public Class2_Sub12 method7816() {
		return (Class2_Sub12) this.aClass109_64.method2322();
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;Z)I")
	private int method7758(@OriginalArg(0) MouseEvent arg0) {
		@Pc(6) int local6 = arg0.getModifiers();
		@Pc(19) boolean local19 = (local6 & 0x10) != 0;
		@Pc(27) boolean local27 = (local6 & 0x8) != 0;
		@Pc(35) boolean local35 = (local6 & 0x4) != 0;
		if (local27 && (local19 || local35)) {
			local27 = false;
		}
		if (local19 && local35) {
			return 4;
		} else if (local19) {
			return 1;
		} else if (local27) {
			return 2;
		} else if (local35) {
			return 4;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!uc", name = "h", descriptor = "(I)V")
	private void method7759() {
		if (this.aComponent4 == null) {
			return;
		}
		this.aComponent4.removeMouseMotionListener(this);
		this.aComponent4.removeMouseListener(this);
		this.anInt9235 = this.anInt9224 = this.anInt9244 = 0;
		this.aClass109_65 = null;
		this.aClass109_64 = null;
		this.aComponent4 = null;
		this.anInt9250 = this.anInt9251 = this.anInt9253 = 0;
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)I")
	@Override
	public int method7811() {
		return this.anInt9235;
	}

	@OriginalMember(owner = "client!uc", name = "g", descriptor = "(I)I")
	@Override
	public int method7821() {
		return this.anInt9224;
	}

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)V")
	@Override
	public void method7815() {
		this.method7759();
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(B)Z")
	@Override
	protected boolean method7814() {
		return (this.anInt9244 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!uc", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method7758(arg0);
		if ((this.anInt9253 & local8) == 0) {
			local8 = this.anInt9253;
		}
		if ((local8 & 0x1) != 0) {
			this.method7764(arg0.getX(), 3, arg0.getClickCount(), arg0.getY());
		}
		if ((local8 & 0x4) != 0) {
			this.method7764(arg0.getX(), 5, arg0.getClickCount(), arg0.getY());
		}
		if ((local8 & 0x2) != 0) {
			this.method7764(arg0.getX(), 4, arg0.getClickCount(), arg0.getY());
		}
		this.anInt9253 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!uc", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method7758(arg0);
		if (local10 == 1) {
			this.method7764(arg0.getX(), 0, arg0.getClickCount(), arg0.getY());
		} else if (local10 == 4) {
			this.method7764(arg0.getX(), 2, arg0.getClickCount(), arg0.getY());
		} else if (local10 == 2) {
			this.method7764(arg0.getX(), 1, arg0.getClickCount(), arg0.getY());
		}
		this.anInt9253 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method7817() {
		this.anInt9244 = this.anInt9253;
		this.anInt9235 = this.anInt9250;
		this.anInt9224 = this.anInt9251;
		@Pc(18) Class109 local18 = this.aClass109_64;
		this.aClass109_64 = this.aClass109_65;
		this.aClass109_65 = local18;
		this.aClass109_65.method2329();
	}

	@OriginalMember(owner = "client!uc", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method7757(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!uc", name = "f", descriptor = "(I)Z")
	@Override
	protected boolean method7820() {
		return (this.anInt9244 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!uc", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	private void method7761(@OriginalArg(0) Component arg0) {
		this.method7759();
		this.aComponent4 = arg0;
		this.aComponent4.addMouseListener(this);
		this.aComponent4.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!uc", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method7757(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!uc", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method7757(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!uc", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method7818() {
		return (this.anInt9244 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIII)V")
	private void method7764(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(11) Class2_Sub12_Sub2 local11 = new Class2_Sub12_Sub2();
		local11.anInt8597 = arg0;
		local11.anInt8603 = arg3;
		local11.anInt8598 = arg2;
		local11.anInt8591 = arg1;
		local11.aLong233 = Static476.method6413();
		this.aClass109_65.method2323(local11);
	}

	@OriginalMember(owner = "client!uc", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method7757(arg0.getX(), arg0.getY());
	}
}
