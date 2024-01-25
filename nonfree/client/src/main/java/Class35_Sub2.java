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

@OriginalClass("client!nl")
public final class Class35_Sub2 extends Class35 implements MouseListener, MouseMotionListener, MouseWheelListener {

	@OriginalMember(owner = "client!nl", name = "h", descriptor = "I")
	private int anInt7024;

	@OriginalMember(owner = "client!nl", name = "j", descriptor = "I")
	private int anInt7025;

	@OriginalMember(owner = "client!nl", name = "k", descriptor = "I")
	private int anInt7026;

	@OriginalMember(owner = "client!nl", name = "l", descriptor = "I")
	private int anInt7027;

	@OriginalMember(owner = "client!nl", name = "n", descriptor = "I")
	private int anInt7028;

	@OriginalMember(owner = "client!nl", name = "o", descriptor = "I")
	private int anInt7029;

	@OriginalMember(owner = "client!nl", name = "q", descriptor = "Ljava/awt/Component;")
	private Component aComponent3;

	@OriginalMember(owner = "client!nl", name = "i", descriptor = "Lclient!bq;")
	private Class43 aClass43_39 = new Class43();

	@OriginalMember(owner = "client!nl", name = "m", descriptor = "Lclient!bq;")
	private Class43 aClass43_40 = new Class43();

	@OriginalMember(owner = "client!nl", name = "p", descriptor = "Z")
	private final boolean aBoolean492;

	@OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class35_Sub2(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method5772(arg0);
		this.aBoolean492 = arg1;
	}

	@OriginalMember(owner = "client!nl", name = "c", descriptor = "(Z)Z")
	@Override
	protected boolean method5768() {
		return (this.anInt7024 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!nl", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method5774(arg0);
		if ((local4 & this.anInt7028) == 0) {
			local4 = this.anInt7028;
		}
		if ((local4 & 0x1) != 0) {
			this.method5776(arg0.getClickCount(), arg0.getX(), arg0.getY(), 3);
		}
		if ((local4 & 0x4) != 0) {
			this.method5776(arg0.getClickCount(), arg0.getX(), arg0.getY(), 5);
		}
		if ((local4 & 0x2) != 0) {
			this.method5776(arg0.getClickCount(), arg0.getX(), arg0.getY(), 4);
		}
		this.anInt7028 &= ~local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!nl", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method5774(arg0);
		if (local4 == 1) {
			this.method5776(arg0.getClickCount(), arg0.getX(), arg0.getY(), 0);
		} else if (local4 == 4) {
			this.method5776(arg0.getClickCount(), arg0.getX(), arg0.getY(), 2);
		} else if (local4 == 2) {
			this.method5776(arg0.getClickCount(), arg0.getX(), arg0.getY(), 1);
		}
		this.anInt7028 |= local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!nl", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method5775(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!nl", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method5775(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!nl", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method5771() {
		this.anInt7026 = this.anInt7029;
		this.anInt7024 = this.anInt7028;
		this.anInt7025 = this.anInt7027;
		@Pc(14) Class43 local14 = this.aClass43_39;
		this.aClass43_39 = this.aClass43_40;
		this.aClass43_40 = local14;
		this.aClass43_40.method1431();
	}

	@OriginalMember(owner = "client!nl", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method5775(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!nl", name = "c", descriptor = "(B)I")
	@Override
	public int method5764() {
		return this.anInt7026;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
	private void method5772(@OriginalArg(0) Component arg0) {
		this.method5773();
		this.aComponent3 = arg0;
		this.aComponent3.addMouseListener(this);
		this.aComponent3.addMouseMotionListener(this);
		this.aComponent3.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!nl", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!nl", name = "d", descriptor = "(I)V")
	private void method5773() {
		if (this.aComponent3 == null) {
			return;
		}
		this.aComponent3.removeMouseWheelListener(this);
		this.aComponent3.removeMouseMotionListener(this);
		this.aComponent3.removeMouseListener(this);
		this.anInt7029 = this.anInt7027 = this.anInt7028 = 0;
		this.aClass43_39 = null;
		this.aComponent3 = null;
		this.anInt7026 = this.anInt7025 = this.anInt7024 = 0;
		this.aClass43_40 = null;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(B)I")
	@Override
	public int method5761() {
		return this.anInt7025;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Z)Z")
	@Override
	protected boolean method5762() {
		return (this.anInt7024 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "(B)V")
	@Override
	public void method5763() {
		this.method5773();
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(BLjava/awt/event/MouseEvent;)I")
	private int method5774(@OriginalArg(1) MouseEvent arg0) {
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

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "(Z)Lclient!u;")
	@Override
	public Class8_Sub33 method5765() {
		return (Class8_Sub33) this.aClass43_39.method1432();
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(ZII)V")
	private void method5775(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt7029 = arg0;
		this.anInt7027 = arg1;
		if (this.aBoolean492) {
			this.method5776(0, arg0, arg1, -1);
		}
	}

	@OriginalMember(owner = "client!nl", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method5775(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!nl", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		@Pc(8) int local8 = arg0.getWheelRotation();
		this.method5776(local8, local2, local5, 6);
		arg0.consume();
	}

	@OriginalMember(owner = "client!nl", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method5769() {
		return (this.anInt7024 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IZIII)V")
	private void method5776(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class8_Sub33_Sub1 local3 = new Class8_Sub33_Sub1();
		local3.anInt6078 = arg2;
		local3.anInt6080 = arg3;
		local3.anInt6081 = arg1;
		local3.aLong155 = Static342.method5463();
		local3.anInt6079 = arg0;
		this.aClass43_40.method1424(local3);
	}
}
