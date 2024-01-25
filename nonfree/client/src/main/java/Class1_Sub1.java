import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ci")
public final class Class1_Sub1 extends Class1 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!ci", name = "r", descriptor = "I")
	private int anInt811;

	@OriginalMember(owner = "client!ci", name = "y", descriptor = "I")
	private int anInt817;

	@OriginalMember(owner = "client!ci", name = "E", descriptor = "I")
	private int anInt823;

	@OriginalMember(owner = "client!ci", name = "M", descriptor = "I")
	private int anInt830;

	@OriginalMember(owner = "client!ci", name = "P", descriptor = "I")
	private int anInt832;

	@OriginalMember(owner = "client!ci", name = "Q", descriptor = "I")
	private int anInt833;

	@OriginalMember(owner = "client!ci", name = "R", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!ci", name = "w", descriptor = "Lclient!ar;")
	private Class14 aClass14_4 = new Class14();

	@OriginalMember(owner = "client!ci", name = "L", descriptor = "Lclient!ar;")
	private Class14 aClass14_5 = new Class14();

	@OriginalMember(owner = "client!ci", name = "S", descriptor = "Z")
	private final boolean aBoolean42;

	static {
		new Class209("Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.", "Merci, nous avons bien reçu votre rapport d'abus.", "Obrigado. Sua denúncia de abuso foi recebida.");
	}

	@OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class1_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method712(arg0);
		this.aBoolean42 = arg1;
	}

	@OriginalMember(owner = "client!ci", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method717(arg0);
	}

	@OriginalMember(owner = "client!ci", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ci", name = "h", descriptor = "(I)Z")
	@Override
	protected boolean method709() {
		return (this.anInt817 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!ci", name = "d", descriptor = "(I)I")
	@Override
	public int method702() {
		return this.anInt811;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Z)Z")
	@Override
	protected boolean method705() {
		return (this.anInt817 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	private void method712(@OriginalArg(0) Component arg0) {
		this.method714();
		this.aComponent1 = arg0;
		this.aComponent1.addMouseListener(this);
		this.aComponent1.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!ci", name = "k", descriptor = "(I)V")
	private void method714() {
		if (this.aComponent1 == null) {
			return;
		}
		this.aComponent1.removeMouseListener(this);
		this.aComponent1.removeMouseMotionListener(this);
		this.aComponent1 = null;
		this.anInt811 = this.anInt823 = this.anInt817 = 0;
		this.anInt832 = this.anInt830 = this.anInt833 = 0;
		this.aClass14_4 = null;
		this.aClass14_5 = null;
	}

	@OriginalMember(owner = "client!ci", name = "f", descriptor = "(I)V")
	@Override
	public synchronized void method706() {
		this.anInt823 = this.anInt830;
		this.anInt811 = this.anInt832;
		this.anInt817 = this.anInt833;
		@Pc(24) Class14 local24 = this.aClass14_4;
		this.aClass14_4 = this.aClass14_5;
		this.aClass14_5 = local24;
		this.aClass14_5.method305();
	}

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method700() {
		return (this.anInt817 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ci", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.anInt830 = -1;
		this.anInt832 = -1;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IZII)V")
	private void method716(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class2_Sub15_Sub1 local7 = new Class2_Sub15_Sub1();
		local7.anInt2924 = arg2;
		local7.anInt2916 = arg0;
		local7.anInt2925 = arg1;
		local7.aLong91 = Static21.method458();
		this.aClass14_5.method300(local7);
	}

	@OriginalMember(owner = "client!ci", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method717(arg0);
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)I")
	@Override
	public int method698() {
		return this.anInt823;
	}

	@OriginalMember(owner = "client!ci", name = "e", descriptor = "(I)Lclient!lo;")
	@Override
	public Class2_Sub15 method704() {
		return (Class2_Sub15) this.aClass14_4.method307();
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)V")
	private void method717(@OriginalArg(0) MouseEvent arg0) {
		this.anInt832 = arg0.getX();
		this.anInt830 = arg0.getY();
		if (this.aBoolean42) {
			this.method716(arg0.getY(), arg0.getX(), -1);
		}
	}

	@OriginalMember(owner = "client!ci", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method718(arg0);
		if ((this.anInt833 & local8) == 0) {
			local8 = this.anInt833;
		}
		if ((local8 & 0x1) != 0) {
			this.method716(arg0.getY(), arg0.getX(), 3);
		}
		if ((local8 & 0x4) != 0) {
			this.method716(arg0.getY(), arg0.getX(), 5);
		}
		if ((local8 & 0x2) != 0) {
			this.method716(arg0.getY(), arg0.getX(), 4);
		}
		this.anInt833 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ci", name = "i", descriptor = "(I)V")
	@Override
	public void method711() {
		this.method714();
	}

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "(Ljava/awt/event/MouseEvent;I)I")
	private int method718(@OriginalArg(0) MouseEvent arg0) {
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

	@OriginalMember(owner = "client!ci", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method717(arg0);
	}

	@OriginalMember(owner = "client!ci", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method718(arg0);
		if (local10 == 1) {
			this.method716(arg0.getY(), arg0.getX(), 0);
		} else if (local10 == 4) {
			this.method716(arg0.getY(), arg0.getX(), 2);
		} else if (local10 == 2) {
			this.method716(arg0.getY(), arg0.getX(), 1);
		}
		this.anInt833 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}
}
