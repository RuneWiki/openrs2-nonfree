import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public final class Class50_Sub1 extends Class50 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!fd", name = "q", descriptor = "I")
	private int anInt2188;

	@OriginalMember(owner = "client!fd", name = "E", descriptor = "I")
	private int anInt2201;

	@OriginalMember(owner = "client!fd", name = "F", descriptor = "I")
	private int anInt2202;

	@OriginalMember(owner = "client!fd", name = "G", descriptor = "I")
	private int anInt2203;

	@OriginalMember(owner = "client!fd", name = "H", descriptor = "I")
	private int anInt2204;

	@OriginalMember(owner = "client!fd", name = "I", descriptor = "I")
	private int anInt2205;

	@OriginalMember(owner = "client!fd", name = "M", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!fd", name = "r", descriptor = "Lclient!fr;")
	private Class85 aClass85_10 = new Class85();

	@OriginalMember(owner = "client!fd", name = "J", descriptor = "Lclient!fr;")
	private Class85 aClass85_11 = new Class85();

	@OriginalMember(owner = "client!fd", name = "L", descriptor = "Z")
	private final boolean aBoolean122;

	static {
		new Class55("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
	}

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class50_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method1871(arg0);
		this.aBoolean122 = arg1;
	}

	@OriginalMember(owner = "client!fd", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method1869() {
		this.anInt2202 = this.anInt2203;
		this.anInt2201 = this.anInt2205;
		this.anInt2188 = this.anInt2204;
		@Pc(18) Class85 local18 = this.aClass85_10;
		this.aClass85_10 = this.aClass85_11;
		this.aClass85_11 = local18;
		this.aClass85_11.method2008();
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	private void method1871(@OriginalArg(0) Component arg0) {
		this.method1872();
		this.aComponent1 = arg0;
		this.aComponent1.addMouseListener(this);
		this.aComponent1.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "(B)V")
	private void method1872() {
		if (this.aComponent1 == null) {
			return;
		}
		this.aComponent1.removeMouseListener(this);
		this.aComponent1.removeMouseMotionListener(this);
		this.anInt2203 = this.anInt2205 = this.anInt2204 = 0;
		this.aClass85_11 = null;
		this.aClass85_10 = null;
		this.aComponent1 = null;
		this.anInt2202 = this.anInt2201 = this.anInt2188 = 0;
	}

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "(B)Lclient!kn;")
	@Override
	public Class7_Sub12 method1867() {
		return (Class7_Sub12) this.aClass85_10.method2004();
	}

	@OriginalMember(owner = "client!fd", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method1878(arg0);
		if ((this.anInt2204 & local8) == 0) {
			local8 = this.anInt2204;
		}
		if ((local8 & 0x1) != 0) {
			this.method1879(3, arg0.getX(), arg0.getY());
		}
		if ((local8 & 0x4) != 0) {
			this.method1879(5, arg0.getX(), arg0.getY());
		}
		if ((local8 & 0x2) != 0) {
			this.method1879(4, arg0.getX(), arg0.getY());
		}
		this.anInt2204 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)V")
	private void method1874(@OriginalArg(1) MouseEvent arg0) {
		this.anInt2203 = arg0.getX();
		this.anInt2205 = arg0.getY();
		if (this.aBoolean122) {
			this.method1879(-1, arg0.getX(), arg0.getY());
		}
	}

	@OriginalMember(owner = "client!fd", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method1878(arg0);
		if (local10 == 1) {
			this.method1879(0, arg0.getX(), arg0.getY());
		} else if (local10 == 4) {
			this.method1879(2, arg0.getX(), arg0.getY());
		} else if (local10 == 2) {
			this.method1879(1, arg0.getX(), arg0.getY());
		}
		this.anInt2204 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!fd", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method1874(arg0);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)Z")
	@Override
	protected boolean method1863() {
		return (this.anInt2188 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!fd", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method1874(arg0);
	}

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "(I)I")
	@Override
	public int method1870() {
		return this.anInt2201;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method1864() {
		return (this.anInt2188 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!fd", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.anInt2205 = -1;
		this.anInt2203 = -1;
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(B)V")
	@Override
	public void method1862() {
		this.method1872();
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)Z")
	@Override
	protected boolean method1865() {
		return (this.anInt2188 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!fd", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method1874(arg0);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)I")
	@Override
	public int method1860() {
		return this.anInt2202;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(BLjava/awt/event/MouseEvent;)I")
	private int method1878(@OriginalArg(1) MouseEvent arg0) {
		@Pc(13) int local13 = arg0.getModifiers();
		@Pc(21) boolean local21 = (local13 & 0x10) != 0;
		@Pc(29) boolean local29 = (local13 & 0x8) != 0;
		@Pc(37) boolean local37 = (local13 & 0x4) != 0;
		if (local29 && (local21 || local37)) {
			local29 = false;
		}
		if (local21 && local37) {
			return 4;
		} else if (local21) {
			return 1;
		} else if (local29) {
			return 2;
		} else if (local37) {
			return 4;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIB)V")
	private void method1879(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) Class7_Sub12_Sub1 local12 = new Class7_Sub12_Sub1();
		local12.anInt1235 = arg2;
		local12.anInt1232 = arg0;
		local12.anInt1228 = arg1;
		local12.aLong43 = Static158.method2342();
		this.aClass85_11.method2011(local12);
	}
}
