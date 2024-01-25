import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bo")
public final class Class26_Sub1 extends Class26 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!bo", name = "h", descriptor = "I")
	private int anInt649;

	@OriginalMember(owner = "client!bo", name = "A", descriptor = "I")
	private int anInt664;

	@OriginalMember(owner = "client!bo", name = "G", descriptor = "I")
	private int anInt669;

	@OriginalMember(owner = "client!bo", name = "L", descriptor = "I")
	private int anInt672;

	@OriginalMember(owner = "client!bo", name = "M", descriptor = "I")
	private int anInt673;

	@OriginalMember(owner = "client!bo", name = "N", descriptor = "I")
	private int anInt674;

	@OriginalMember(owner = "client!bo", name = "Q", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!bo", name = "u", descriptor = "Lclient!vp;")
	private Class254 aClass254_4 = new Class254();

	@OriginalMember(owner = "client!bo", name = "O", descriptor = "Lclient!vp;")
	private Class254 aClass254_5 = new Class254();

	@OriginalMember(owner = "client!bo", name = "R", descriptor = "Z")
	private final boolean aBoolean50;

	static {
		new Class151("Please close the interface you have open before using 'Report Abuse'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
	}

	@OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class26_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method583(arg0);
		this.aBoolean50 = arg1;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IIII)V")
	private void method578(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub29_Sub1 local7 = new Class1_Sub29_Sub1();
		local7.anInt4329 = arg1;
		local7.anInt4330 = arg2;
		local7.anInt4333 = arg0;
		local7.aLong143 = Static232.method3058();
		this.aClass254_5.method5430(local7);
	}

	@OriginalMember(owner = "client!bo", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!bo", name = "f", descriptor = "(I)I")
	@Override
	public int method576() {
		return this.anInt664;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)V")
	private void method579(@OriginalArg(1) MouseEvent arg0) {
		this.anInt672 = arg0.getX();
		this.anInt673 = arg0.getY();
		if (this.aBoolean50) {
			this.method578(arg0.getX(), arg0.getY(), -1);
		}
	}

	@OriginalMember(owner = "client!bo", name = "c", descriptor = "(B)I")
	@Override
	public int method574() {
		return this.anInt669;
	}

	@OriginalMember(owner = "client!bo", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method579(arg0);
	}

	@OriginalMember(owner = "client!bo", name = "h", descriptor = "(I)V")
	private void method582() {
		if (this.aComponent1 == null) {
			return;
		}
		this.aComponent1.removeMouseListener(this);
		this.aComponent1.removeMouseMotionListener(this);
		this.aClass254_5 = null;
		this.aComponent1 = null;
		this.anInt672 = this.anInt673 = this.anInt674 = 0;
		this.aClass254_4 = null;
		this.anInt664 = this.anInt669 = this.anInt649 = 0;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	private void method583(@OriginalArg(0) Component arg0) {
		this.method582();
		this.aComponent1 = arg0;
		this.aComponent1.addMouseListener(this);
		this.aComponent1.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(ILjava/awt/event/MouseEvent;)I")
	private int method584(@OriginalArg(1) MouseEvent arg0) {
		@Pc(6) int local6 = arg0.getModifiers();
		@Pc(14) boolean local14 = (local6 & 0x10) != 0;
		@Pc(22) boolean local22 = (local6 & 0x8) != 0;
		@Pc(30) boolean local30 = (local6 & 0x4) != 0;
		if (local22 && (local14 || local30)) {
			local22 = false;
		}
		if (local14 && local30) {
			return 4;
		} else if (local14) {
			return 1;
		} else if (local22) {
			return 2;
		} else if (local30) {
			return 4;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!bo", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method570() {
		this.anInt664 = this.anInt672;
		this.anInt669 = this.anInt673;
		this.anInt649 = this.anInt674;
		@Pc(25) Class254 local25 = this.aClass254_4;
		this.aClass254_4 = this.aClass254_5;
		this.aClass254_5 = local25;
		this.aClass254_5.method5438();
	}

	@OriginalMember(owner = "client!bo", name = "e", descriptor = "(I)Z")
	@Override
	protected boolean method575() {
		return (this.anInt649 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(I)Z")
	@Override
	protected boolean method569() {
		return (this.anInt649 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(B)V")
	@Override
	public void method571() {
		this.method582();
	}

	@OriginalMember(owner = "client!bo", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method579(arg0);
	}

	@OriginalMember(owner = "client!bo", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.anInt673 = -1;
		this.anInt672 = -1;
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method573() {
		return (this.anInt649 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!bo", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method579(arg0);
	}

	@OriginalMember(owner = "client!bo", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method584(arg0);
		if (local10 == 1) {
			this.method578(arg0.getX(), arg0.getY(), 0);
		} else if (local10 == 4) {
			this.method578(arg0.getX(), arg0.getY(), 2);
		} else if (local10 == 2) {
			this.method578(arg0.getX(), arg0.getY(), 1);
		}
		this.anInt674 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!bo", name = "g", descriptor = "(I)Lclient!vq;")
	@Override
	public Class1_Sub29 method577() {
		return (Class1_Sub29) this.aClass254_4.method5436();
	}

	@OriginalMember(owner = "client!bo", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method584(arg0);
		if ((this.anInt674 & local8) == 0) {
			local8 = this.anInt674;
		}
		if ((local8 & 0x1) != 0) {
			this.method578(arg0.getX(), arg0.getY(), 3);
		}
		if ((local8 & 0x4) != 0) {
			this.method578(arg0.getX(), arg0.getY(), 5);
		}
		if ((local8 & 0x2) != 0) {
			this.method578(arg0.getX(), arg0.getY(), 4);
		}
		this.anInt674 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}
}
