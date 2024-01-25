import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eo")
public final class Class66_Sub1 extends Class66 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!eo", name = "o", descriptor = "I")
	private int anInt1740;

	@OriginalMember(owner = "client!eo", name = "z", descriptor = "I")
	private int anInt1747;

	@OriginalMember(owner = "client!eo", name = "F", descriptor = "I")
	private int anInt1753;

	@OriginalMember(owner = "client!eo", name = "M", descriptor = "I")
	private int anInt1760;

	@OriginalMember(owner = "client!eo", name = "N", descriptor = "I")
	private int anInt1761;

	@OriginalMember(owner = "client!eo", name = "O", descriptor = "I")
	private int anInt1762;

	@OriginalMember(owner = "client!eo", name = "R", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!eo", name = "y", descriptor = "Lclient!nv;")
	private Class177 aClass177_9 = new Class177();

	@OriginalMember(owner = "client!eo", name = "P", descriptor = "Lclient!nv;")
	private Class177 aClass177_10 = new Class177();

	@OriginalMember(owner = "client!eo", name = "Q", descriptor = "Z")
	private final boolean aBoolean121;

	@OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class66_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method1441(arg0);
		this.aBoolean121 = arg1;
	}

	@OriginalMember(owner = "client!eo", name = "i", descriptor = "(I)V")
	private void method1438() {
		if (this.aComponent1 == null) {
			return;
		}
		this.aComponent1.removeMouseMotionListener(this);
		this.aComponent1.removeMouseListener(this);
		this.anInt1740 = this.anInt1747 = this.anInt1753 = 0;
		this.aComponent1 = null;
		this.aClass177_10 = null;
		this.anInt1761 = this.anInt1760 = this.anInt1762 = 0;
		this.aClass177_9 = null;
	}

	@OriginalMember(owner = "client!eo", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5970() {
		return (this.anInt1753 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!eo", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method1439(arg0);
		if (local10 == 1) {
			this.method1442(0, arg0.getY(), arg0.getX());
		} else if (local10 == 4) {
			this.method1442(2, arg0.getY(), arg0.getX());
		} else if (local10 == 2) {
			this.method1442(1, arg0.getY(), arg0.getX());
		}
		this.anInt1762 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!eo", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method1440(arg0);
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(I)Lclient!bq;")
	@Override
	public Class5_Sub4 method5963() {
		return (Class5_Sub4) this.aClass177_9.method3621();
	}

	@OriginalMember(owner = "client!eo", name = "f", descriptor = "(I)V")
	@Override
	public void method5971() {
		this.method1438();
	}

	@OriginalMember(owner = "client!eo", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method1439(arg0);
		if ((this.anInt1762 & local8) == 0) {
			local8 = this.anInt1762;
		}
		if ((local8 & 0x1) != 0) {
			this.method1442(3, arg0.getY(), arg0.getX());
		}
		if ((local8 & 0x4) != 0) {
			this.method1442(5, arg0.getY(), arg0.getX());
		}
		if ((local8 & 0x2) != 0) {
			this.method1442(4, arg0.getY(), arg0.getX());
		}
		this.anInt1762 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(B)I")
	@Override
	public int method5965() {
		return this.anInt1740;
	}

	@OriginalMember(owner = "client!eo", name = "d", descriptor = "(I)Z")
	@Override
	protected boolean method5969() {
		return (this.anInt1753 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!eo", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.anInt1760 = -1;
		this.anInt1761 = -1;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)I")
	private int method1439(@OriginalArg(0) MouseEvent arg0) {
		@Pc(6) int local6 = arg0.getModifiers();
		@Pc(19) boolean local19 = (local6 & 0x10) != 0;
		@Pc(27) boolean local27 = (local6 & 0x8) != 0;
		@Pc(38) boolean local38 = (local6 & 0x4) != 0;
		if (local27 && (local19 || local38)) {
			local27 = false;
		}
		if (local19 && local38) {
			return 4;
		} else if (local19) {
			return 1;
		} else if (local27) {
			return 2;
		} else if (local38) {
			return 4;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(BLjava/awt/event/MouseEvent;)V")
	private void method1440(@OriginalArg(1) MouseEvent arg0) {
		this.anInt1761 = arg0.getX();
		this.anInt1760 = arg0.getY();
		if (this.aBoolean121) {
			this.method1442(-1, arg0.getY(), arg0.getX());
		}
	}

	@OriginalMember(owner = "client!eo", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method1440(arg0);
	}

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "(B)V")
	@Override
	public synchronized void method5973() {
		this.anInt1740 = this.anInt1761;
		this.anInt1747 = this.anInt1760;
		this.anInt1753 = this.anInt1762;
		@Pc(18) Class177 local18 = this.aClass177_9;
		this.aClass177_9 = this.aClass177_10;
		this.aClass177_10 = local18;
		this.aClass177_10.method3614();
	}

	@OriginalMember(owner = "client!eo", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!eo", name = "h", descriptor = "(I)Z")
	@Override
	protected boolean method5975() {
		return (this.anInt1753 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	private void method1441(@OriginalArg(0) Component arg0) {
		this.method1438();
		this.aComponent1 = arg0;
		this.aComponent1.addMouseListener(this);
		this.aComponent1.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIIB)V")
	private void method1442(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class5_Sub4_Sub2 local7 = new Class5_Sub4_Sub2();
		local7.anInt4836 = arg2;
		local7.anInt4842 = arg1;
		local7.anInt4844 = arg0;
		local7.aLong148 = Static446.method5903();
		this.aClass177_10.method3615(local7);
	}

	@OriginalMember(owner = "client!eo", name = "g", descriptor = "(I)I")
	@Override
	public int method5974() {
		return this.anInt1747;
	}

	@OriginalMember(owner = "client!eo", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method1440(arg0);
	}
}
