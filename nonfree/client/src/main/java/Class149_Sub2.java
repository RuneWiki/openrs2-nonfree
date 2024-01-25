import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Class149_Sub2 extends Class149 implements MouseListener, MouseMotionListener, MouseWheelListener {

	@OriginalMember(owner = "client!pe", name = "h", descriptor = "I")
	private int anInt7026;

	@OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
	private int anInt7027;

	@OriginalMember(owner = "client!pe", name = "j", descriptor = "I")
	private int anInt7028;

	@OriginalMember(owner = "client!pe", name = "k", descriptor = "I")
	private int anInt7029;

	@OriginalMember(owner = "client!pe", name = "l", descriptor = "I")
	private int anInt7030;

	@OriginalMember(owner = "client!pe", name = "m", descriptor = "I")
	private int anInt7031;

	@OriginalMember(owner = "client!pe", name = "o", descriptor = "Ljava/awt/Component;")
	private Component aComponent4;

	@OriginalMember(owner = "client!pe", name = "g", descriptor = "Lclient!ae;")
	private Class8 aClass8_43 = new Class8();

	@OriginalMember(owner = "client!pe", name = "n", descriptor = "Lclient!ae;")
	private Class8 aClass8_44 = new Class8();

	@OriginalMember(owner = "client!pe", name = "p", descriptor = "Z")
	private final boolean aBoolean545;

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class149_Sub2(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method5887(arg0);
		this.aBoolean545 = arg1;
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)I")
	@Override
	public int method5875() {
		return this.anInt7027;
	}

	@OriginalMember(owner = "client!pe", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method5886(arg0);
		if ((local4 & this.anInt7029) == 0) {
			local4 = this.anInt7029;
		}
		if ((local4 & 0x1) != 0) {
			this.method5889(arg0.getClickCount(), 3, arg0.getX(), arg0.getY());
		}
		if ((local4 & 0x4) != 0) {
			this.method5889(arg0.getClickCount(), 5, arg0.getX(), arg0.getY());
		}
		if ((local4 & 0x2) != 0) {
			this.method5889(arg0.getClickCount(), 4, arg0.getX(), arg0.getY());
		}
		this.anInt7029 &= ~local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!pe", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method5885(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!pe", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Z)Lclient!ew;")
	@Override
	public Class2_Sub16 method5878() {
		return (Class2_Sub16) this.aClass8_43.method217();
	}

	@OriginalMember(owner = "client!pe", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method5885(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!pe", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method5885(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "(I)Z")
	@Override
	protected boolean method5876() {
		return (this.anInt7028 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "(I)I")
	@Override
	public int method5879() {
		return this.anInt7026;
	}

	@OriginalMember(owner = "client!pe", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method5884() {
		return (this.anInt7028 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!pe", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method5885(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIZ)V")
	private void method5885(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7031 = arg1;
		this.anInt7030 = arg0;
		if (this.aBoolean545) {
			this.method5889(0, -1, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "(I)Z")
	@Override
	protected boolean method5881() {
		return (this.anInt7028 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!pe", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		@Pc(8) int local8 = arg0.getWheelRotation();
		this.method5889(local8, 6, local2, local5);
		arg0.consume();
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)I")
	private int method5886(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.getButton() == 1) {
			return arg0.isMetaDown() ? 4 : 1;
		} else if (arg0.getButton() == 2) {
			return 2;
		} else if (arg0.getButton() == 3) {
			return 4;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "(Z)V")
	@Override
	public synchronized void method5883() {
		this.anInt7027 = this.anInt7031;
		this.anInt7028 = this.anInt7029;
		this.anInt7026 = this.anInt7030;
		@Pc(20) Class8 local20 = this.aClass8_43;
		this.aClass8_43 = this.aClass8_44;
		this.aClass8_44 = local20;
		this.aClass8_44.method220();
	}

	@OriginalMember(owner = "client!pe", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method5886(arg0);
		if (local4 == 1) {
			this.method5889(arg0.getClickCount(), 0, arg0.getX(), arg0.getY());
		} else if (local4 == 4) {
			this.method5889(arg0.getClickCount(), 2, arg0.getX(), arg0.getY());
		} else if (local4 == 2) {
			this.method5889(arg0.getClickCount(), 1, arg0.getX(), arg0.getY());
		}
		this.anInt7029 |= local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(B)V")
	@Override
	public void method5880() {
		this.method5888();
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	private void method5887(@OriginalArg(0) Component arg0) {
		this.method5888();
		this.aComponent4 = arg0;
		this.aComponent4.addMouseListener(this);
		this.aComponent4.addMouseMotionListener(this);
		this.aComponent4.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "(B)V")
	private void method5888() {
		if (this.aComponent4 == null) {
			return;
		}
		this.aComponent4.removeMouseWheelListener(this);
		this.aComponent4.removeMouseMotionListener(this);
		this.aComponent4.removeMouseListener(this);
		this.aComponent4 = null;
		this.anInt7026 = this.anInt7027 = this.anInt7028 = 0;
		this.aClass8_44 = null;
		this.anInt7030 = this.anInt7031 = this.anInt7029 = 0;
		this.aClass8_43 = null;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIII)V")
	private void method5889(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class2_Sub16_Sub2 local3 = new Class2_Sub16_Sub2();
		local3.anInt7166 = arg2;
		local3.anInt7164 = arg3;
		local3.anInt7165 = arg1;
		local3.aLong199 = Static548.method7437();
		local3.anInt7163 = arg0;
		this.aClass8_44.method212(local3);
	}
}
