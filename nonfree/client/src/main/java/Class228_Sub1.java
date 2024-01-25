import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uk")
public final class Class228_Sub1 extends Class228 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!uk", name = "h", descriptor = "I")
	private int anInt7017;

	@OriginalMember(owner = "client!uk", name = "s", descriptor = "I")
	private int anInt7028;

	@OriginalMember(owner = "client!uk", name = "z", descriptor = "I")
	private int anInt7033;

	@OriginalMember(owner = "client!uk", name = "F", descriptor = "I")
	private int anInt7039;

	@OriginalMember(owner = "client!uk", name = "M", descriptor = "I")
	private int anInt7045;

	@OriginalMember(owner = "client!uk", name = "N", descriptor = "I")
	private int anInt7046;

	@OriginalMember(owner = "client!uk", name = "P", descriptor = "Ljava/awt/Component;")
	private Component aComponent3;

	@OriginalMember(owner = "client!uk", name = "y", descriptor = "Lclient!wo;")
	private Class266 aClass266_46 = new Class266();

	@OriginalMember(owner = "client!uk", name = "G", descriptor = "Lclient!wo;")
	private Class266 aClass266_47 = new Class266();

	@OriginalMember(owner = "client!uk", name = "Q", descriptor = "Z")
	private final boolean aBoolean453;

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class228_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method5487(arg0);
		this.aBoolean453 = arg1;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	private void method5487(@OriginalArg(0) Component arg0) {
		this.method5492();
		this.aComponent3 = arg0;
		this.aComponent3.addMouseListener(this);
		this.aComponent3.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!uk", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5483() {
		return (this.anInt7017 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)V")
	@Override
	public void method5475() {
		this.method5492();
	}

	@OriginalMember(owner = "client!uk", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method5494(arg0);
	}

	@OriginalMember(owner = "client!uk", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!uk", name = "d", descriptor = "(B)I")
	@Override
	public int method5486() {
		return this.anInt7033;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(B)Z")
	@Override
	protected boolean method5476() {
		return (this.anInt7017 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!uk", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method5494(arg0);
	}

	@OriginalMember(owner = "client!uk", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method5496(arg0);
		if (local10 == 1) {
			this.method5497(arg0.getX(), arg0.getY(), 0);
		} else if (local10 == 4) {
			this.method5497(arg0.getX(), arg0.getY(), 2);
		} else if (local10 == 2) {
			this.method5497(arg0.getX(), arg0.getY(), 1);
		}
		this.anInt7046 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!uk", name = "e", descriptor = "(B)V")
	private void method5492() {
		if (this.aComponent3 == null) {
			return;
		}
		this.aComponent3.removeMouseListener(this);
		this.aComponent3.removeMouseMotionListener(this);
		this.anInt7039 = this.anInt7045 = this.anInt7046 = 0;
		this.aClass266_47 = null;
		this.anInt7028 = this.anInt7033 = this.anInt7017 = 0;
		this.aClass266_46 = null;
		this.aComponent3 = null;
	}

	@OriginalMember(owner = "client!uk", name = "f", descriptor = "(I)I")
	@Override
	public int method5485() {
		return this.anInt7028;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)V")
	private void method5494(@OriginalArg(1) MouseEvent arg0) {
		this.anInt7039 = arg0.getX();
		this.anInt7045 = arg0.getY();
		if (this.aBoolean453) {
			this.method5497(arg0.getX(), arg0.getY(), -1);
		}
	}

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)Z")
	@Override
	protected boolean method5477() {
		return (this.anInt7017 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!uk", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method5494(arg0);
	}

	@OriginalMember(owner = "client!uk", name = "e", descriptor = "(I)V")
	@Override
	public synchronized void method5484() {
		this.anInt7028 = this.anInt7039;
		this.anInt7033 = this.anInt7045;
		this.anInt7017 = this.anInt7046;
		@Pc(18) Class266 local18 = this.aClass266_46;
		this.aClass266_46 = this.aClass266_47;
		this.aClass266_47 = local18;
		this.aClass266_47.method6004();
	}

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "(ILjava/awt/event/MouseEvent;)I")
	private int method5496(@OriginalArg(1) MouseEvent arg0) {
		@Pc(6) int local6 = arg0.getModifiers();
		@Pc(17) boolean local17 = (local6 & 0x10) != 0;
		@Pc(25) boolean local25 = (local6 & 0x8) != 0;
		@Pc(36) boolean local36 = (local6 & 0x4) != 0;
		if (local25 && (local17 || local36)) {
			local25 = false;
		}
		if (local17 && local36) {
			return 4;
		} else if (local17) {
			return 1;
		} else if (local25) {
			return 2;
		} else if (local36) {
			return 4;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIII)V")
	private void method5497(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class1_Sub27_Sub1 local13 = new Class1_Sub27_Sub1();
		local13.anInt5699 = arg0;
		local13.anInt5696 = arg1;
		local13.anInt5703 = arg2;
		local13.aLong175 = Static101.method1557();
		this.aClass266_47.method5998(local13);
	}

	@OriginalMember(owner = "client!uk", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.anInt7039 = -1;
		this.anInt7045 = -1;
	}

	@OriginalMember(owner = "client!uk", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method5496(arg0);
		if ((this.anInt7046 & local8) == 0) {
			local8 = this.anInt7046;
		}
		if ((local8 & 0x1) != 0) {
			this.method5497(arg0.getX(), arg0.getY(), 3);
		}
		if ((local8 & 0x4) != 0) {
			this.method5497(arg0.getX(), arg0.getY(), 5);
		}
		if ((local8 & 0x2) != 0) {
			this.method5497(arg0.getX(), arg0.getY(), 4);
		}
		this.anInt7046 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!uk", name = "c", descriptor = "(B)Lclient!lq;")
	@Override
	public Class1_Sub27 method5482() {
		return (Class1_Sub27) this.aClass266_46.method5999();
	}
}
