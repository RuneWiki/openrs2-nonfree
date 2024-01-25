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

@OriginalClass("client!sba")
public final class Class116_Sub1 extends Class116 implements MouseListener, MouseMotionListener, MouseWheelListener {

	@OriginalMember(owner = "client!sba", name = "h", descriptor = "I")
	private int anInt8814;

	@OriginalMember(owner = "client!sba", name = "j", descriptor = "I")
	private int anInt8815;

	@OriginalMember(owner = "client!sba", name = "k", descriptor = "I")
	private int anInt8816;

	@OriginalMember(owner = "client!sba", name = "l", descriptor = "I")
	private int anInt8817;

	@OriginalMember(owner = "client!sba", name = "n", descriptor = "I")
	private int anInt8818;

	@OriginalMember(owner = "client!sba", name = "o", descriptor = "I")
	private int anInt8819;

	@OriginalMember(owner = "client!sba", name = "p", descriptor = "Ljava/awt/Component;")
	private Component aComponent3;

	@OriginalMember(owner = "client!sba", name = "i", descriptor = "Lclient!ki;")
	private Class183 aClass183_53 = new Class183();

	@OriginalMember(owner = "client!sba", name = "m", descriptor = "Lclient!ki;")
	private Class183 aClass183_54 = new Class183();

	@OriginalMember(owner = "client!sba", name = "q", descriptor = "Z")
	private final boolean aBoolean740;

	@OriginalMember(owner = "client!sba", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class116_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method7232(arg0);
		this.aBoolean740 = arg1;
	}

	@OriginalMember(owner = "client!sba", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method7231(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!sba", name = "e", descriptor = "(I)Z")
	@Override
	protected boolean method8252() {
		return (this.anInt8814 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!sba", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method7231(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!sba", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method7231(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!sba", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method7230(arg0);
		if ((this.anInt8818 & local4) == 0) {
			local4 = this.anInt8818;
		}
		if ((local4 & 0x1) != 0) {
			this.method7229(arg0.getX(), 3, arg0.getY(), 0);
		}
		if ((local4 & 0x4) != 0) {
			this.method7229(arg0.getX(), 5, arg0.getY(), 0);
		}
		if ((local4 & 0x2) != 0) {
			this.method7229(arg0.getX(), 4, arg0.getY(), 0);
		}
		this.anInt8818 &= ~local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!sba", name = "e", descriptor = "(B)V")
	private void method7228() {
		if (this.aComponent3 == null) {
			return;
		}
		this.aComponent3.removeMouseWheelListener(this);
		this.aComponent3.removeMouseMotionListener(this);
		this.aComponent3.removeMouseListener(this);
		this.anInt8817 = this.anInt8819 = this.anInt8818 = 0;
		this.aClass183_53 = null;
		this.aClass183_54 = null;
		this.anInt8815 = this.anInt8816 = this.anInt8814 = 0;
		this.aComponent3 = null;
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(BIIII)V")
	private void method7229(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) Class3_Sub21_Sub1 local10 = new Class3_Sub21_Sub1();
		local10.anInt4376 = arg2;
		local10.anInt4375 = arg0;
		local10.anInt4374 = arg1;
		local10.aLong124 = Static376.method6088();
		local10.anInt4377 = arg3;
		this.aClass183_54.method4792(local10);
	}

	@OriginalMember(owner = "client!sba", name = "d", descriptor = "(I)I")
	@Override
	public int method8250() {
		return this.anInt8816;
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(Z)V")
	@Override
	public void method8253() {
		this.method7228();
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(BLjava/awt/event/MouseEvent;)I")
	private int method7230(@OriginalArg(1) MouseEvent arg0) {
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

	@OriginalMember(owner = "client!sba", name = "f", descriptor = "(I)Lclient!pc;")
	@Override
	public Class3_Sub21 method8254() {
		return (Class3_Sub21) this.aClass183_53.method4797();
	}

	@OriginalMember(owner = "client!sba", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method7231(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(III)V")
	private void method7231(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt8817 = arg0;
		this.anInt8819 = arg1;
		if (this.aBoolean740) {
			this.method7229(arg0, -1, arg1, 0);
		}
	}

	@OriginalMember(owner = "client!sba", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method8246() {
		this.anInt8816 = this.anInt8819;
		this.anInt8814 = this.anInt8818;
		this.anInt8815 = this.anInt8817;
		@Pc(14) Class183 local14 = this.aClass183_53;
		this.aClass183_53 = this.aClass183_54;
		this.aClass183_54 = local14;
		this.aClass183_54.method4790();
	}

	@OriginalMember(owner = "client!sba", name = "c", descriptor = "(I)I")
	@Override
	public int method8249() {
		return this.anInt8815;
	}

	@OriginalMember(owner = "client!sba", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(I)Z")
	@Override
	protected boolean method8244() {
		return (this.anInt8814 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!sba", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8247() {
		return (this.anInt8814 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!sba", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		@Pc(8) int local8 = arg0.getWheelRotation();
		this.method7229(local2, 6, local5, local8);
		arg0.consume();
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(ILjava/awt/Component;)V")
	private void method7232(@OriginalArg(1) Component arg0) {
		this.method7228();
		this.aComponent3 = arg0;
		this.aComponent3.addMouseListener(this);
		this.aComponent3.addMouseMotionListener(this);
		this.aComponent3.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!sba", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method7230(arg0);
		if (local4 == 1) {
			this.method7229(arg0.getX(), 0, arg0.getY(), 0);
		} else if (local4 == 4) {
			this.method7229(arg0.getX(), 2, arg0.getY(), 0);
		} else if (local4 == 2) {
			this.method7229(arg0.getX(), 1, arg0.getY(), 0);
		}
		this.anInt8818 |= local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}
}
