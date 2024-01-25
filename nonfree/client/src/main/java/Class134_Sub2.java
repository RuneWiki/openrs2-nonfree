import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qg")
public final class Class134_Sub2 extends Class134 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!qg", name = "f", descriptor = "I")
	private int anInt7338;

	@OriginalMember(owner = "client!qg", name = "l", descriptor = "I")
	private int anInt7343;

	@OriginalMember(owner = "client!qg", name = "B", descriptor = "I")
	private int anInt7357;

	@OriginalMember(owner = "client!qg", name = "G", descriptor = "I")
	private int anInt7362;

	@OriginalMember(owner = "client!qg", name = "H", descriptor = "I")
	private int anInt7363;

	@OriginalMember(owner = "client!qg", name = "J", descriptor = "I")
	private int anInt7364;

	@OriginalMember(owner = "client!qg", name = "K", descriptor = "Ljava/awt/Component;")
	private Component aComponent4;

	@OriginalMember(owner = "client!qg", name = "g", descriptor = "Lclient!rh;")
	private Class275 aClass275_151 = new Class275();

	@OriginalMember(owner = "client!qg", name = "I", descriptor = "Lclient!rh;")
	private Class275 aClass275_152 = new Class275();

	@OriginalMember(owner = "client!qg", name = "L", descriptor = "Z")
	private final boolean aBoolean507;

	@OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class134_Sub2(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method6098(arg0);
		this.aBoolean507 = arg1;
	}

	@OriginalMember(owner = "client!qg", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method6094() {
		return (this.anInt7343 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	private void method6098(@OriginalArg(0) Component arg0) {
		this.method6106();
		this.aComponent4 = arg0;
		this.aComponent4.addMouseListener(this);
		this.aComponent4.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!qg", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method6104(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method6090() {
		this.anInt7343 = this.anInt7363;
		this.anInt7338 = this.anInt7362;
		this.anInt7357 = this.anInt7364;
		@Pc(18) Class275 local18 = this.aClass275_151;
		this.aClass275_151 = this.aClass275_152;
		this.aClass275_152 = local18;
		this.aClass275_152.method6357();
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIII)V")
	private void method6102(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class6_Sub8_Sub1 local11 = new Class6_Sub8_Sub1();
		local11.anInt1213 = arg1;
		local11.anInt1224 = arg0;
		local11.anInt1222 = arg2;
		local11.aLong45 = Static137.method2058();
		this.aClass275_152.method6370(local11);
	}

	@OriginalMember(owner = "client!qg", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method6104(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(BLjava/awt/event/MouseEvent;)I")
	private int method6103(@OriginalArg(1) MouseEvent arg0) {
		@Pc(6) int local6 = arg0.getModifiers();
		@Pc(25) boolean local25 = (local6 & 0x10) != 0;
		@Pc(33) boolean local33 = (local6 & 0x8) != 0;
		@Pc(41) boolean local41 = (local6 & 0x4) != 0;
		if (local33 && (local25 || local41)) {
			local33 = false;
		}
		if (local25 && local41) {
			return 4;
		} else if (local25) {
			return 1;
		} else if (local33) {
			return 2;
		} else if (local41) {
			return 4;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!qg", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)Z")
	@Override
	protected boolean method6087() {
		return (this.anInt7343 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!qg", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method6104(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(III)V")
	private void method6104(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt7362 = arg1;
		this.anInt7364 = arg0;
		if (this.aBoolean507) {
			this.method6102(arg1, arg0, -1);
		}
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(B)I")
	@Override
	public int method6093() {
		return this.anInt7357;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(B)I")
	@Override
	public int method6092() {
		return this.anInt7338;
	}

	@OriginalMember(owner = "client!qg", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method6103(arg0);
		if ((local8 & this.anInt7363) == 0) {
			local8 = this.anInt7363;
		}
		if ((local8 & 0x1) != 0) {
			this.method6102(arg0.getY(), arg0.getX(), 3);
		}
		if ((local8 & 0x4) != 0) {
			this.method6102(arg0.getY(), arg0.getX(), 5);
		}
		if ((local8 & 0x2) != 0) {
			this.method6102(arg0.getY(), arg0.getX(), 4);
		}
		this.anInt7363 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!qg", name = "e", descriptor = "(I)Lclient!bv;")
	@Override
	public Class6_Sub8 method6095() {
		return (Class6_Sub8) this.aClass275_151.method6360();
	}

	@OriginalMember(owner = "client!qg", name = "d", descriptor = "(B)V")
	private void method6106() {
		if (this.aComponent4 == null) {
			return;
		}
		this.aComponent4.removeMouseMotionListener(this);
		this.aComponent4.removeMouseListener(this);
		this.anInt7357 = this.anInt7338 = this.anInt7343 = 0;
		this.aClass275_152 = null;
		this.aComponent4 = null;
		this.aClass275_151 = null;
		this.anInt7364 = this.anInt7362 = this.anInt7363 = 0;
	}

	@OriginalMember(owner = "client!qg", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method6103(arg0);
		if (local10 == 1) {
			this.method6102(arg0.getY(), arg0.getX(), 0);
		} else if (local10 == 4) {
			this.method6102(arg0.getY(), arg0.getX(), 2);
		} else if (local10 == 2) {
			this.method6102(arg0.getY(), arg0.getX(), 1);
		}
		this.anInt7363 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!qg", name = "f", descriptor = "(I)Z")
	@Override
	protected boolean method6096() {
		return (this.anInt7343 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "(I)V")
	@Override
	public void method6091() {
		this.method6106();
	}

	@OriginalMember(owner = "client!qg", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method6104(arg0.getX(), arg0.getY());
	}
}
