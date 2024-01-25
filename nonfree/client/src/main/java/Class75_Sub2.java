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

@OriginalClass("client!vja")
public final class Class75_Sub2 extends Class75 implements MouseListener, MouseMotionListener, MouseWheelListener {

	@OriginalMember(owner = "client!vja", name = "g", descriptor = "I")
	private int anInt9881;

	@OriginalMember(owner = "client!vja", name = "i", descriptor = "I")
	private int anInt9882;

	@OriginalMember(owner = "client!vja", name = "j", descriptor = "I")
	private int anInt9883;

	@OriginalMember(owner = "client!vja", name = "l", descriptor = "I")
	private int anInt9884;

	@OriginalMember(owner = "client!vja", name = "m", descriptor = "I")
	private int anInt9885;

	@OriginalMember(owner = "client!vja", name = "n", descriptor = "I")
	private int anInt9886;

	@OriginalMember(owner = "client!vja", name = "o", descriptor = "Ljava/awt/Component;")
	private Component aComponent5;

	@OriginalMember(owner = "client!vja", name = "h", descriptor = "Lclient!jia;")
	private Class193 aClass193_68 = new Class193();

	@OriginalMember(owner = "client!vja", name = "k", descriptor = "Lclient!jia;")
	private Class193 aClass193_69 = new Class193();

	@OriginalMember(owner = "client!vja", name = "p", descriptor = "Z")
	private final boolean aBoolean727;

	@OriginalMember(owner = "client!vja", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class75_Sub2(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method8418(arg0);
		this.aBoolean727 = arg1;
	}

	@OriginalMember(owner = "client!vja", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method8419(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!vja", name = "b", descriptor = "(Z)Lclient!hl;")
	@Override
	public Class3_Sub21 method8411() {
		return (Class3_Sub21) this.aClass193_68.method4452();
	}

	@OriginalMember(owner = "client!vja", name = "a", descriptor = "(B)V")
	@Override
	public synchronized void method8404() {
		this.anInt9881 = this.anInt9885;
		this.anInt9883 = this.anInt9886;
		this.anInt9882 = this.anInt9884;
		@Pc(18) Class193 local18 = this.aClass193_68;
		this.aClass193_68 = this.aClass193_69;
		this.aClass193_69 = local18;
		this.aClass193_69.method4458();
	}

	@OriginalMember(owner = "client!vja", name = "d", descriptor = "(B)I")
	@Override
	public int method8412() {
		return this.anInt9882;
	}

	@OriginalMember(owner = "client!vja", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method8416(arg0);
		if (local4 == 1) {
			this.method8417(0, arg0.getClickCount(), arg0.getX(), arg0.getY());
		} else if (local4 == 4) {
			this.method8417(2, arg0.getClickCount(), arg0.getX(), arg0.getY());
		} else if (local4 == 2) {
			this.method8417(1, arg0.getClickCount(), arg0.getX(), arg0.getY());
		}
		this.anInt9885 |= local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!vja", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;Z)I")
	private int method8416(@OriginalArg(0) MouseEvent arg0) {
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

	@OriginalMember(owner = "client!vja", name = "c", descriptor = "(B)V")
	@Override
	public void method8407() {
		this.method8420();
	}

	@OriginalMember(owner = "client!vja", name = "a", descriptor = "(IIIII)V")
	private void method8417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class3_Sub21_Sub2 local3 = new Class3_Sub21_Sub2();
		local3.anInt9437 = arg0;
		local3.anInt9435 = arg3;
		local3.anInt9436 = arg2;
		local3.aLong278 = Static131.method2268();
		local3.anInt9438 = arg1;
		this.aClass193_69.method4462(local3);
	}

	@OriginalMember(owner = "client!vja", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		@Pc(8) int local8 = arg0.getWheelRotation();
		this.method8417(6, local8, local2, local5);
		arg0.consume();
	}

	@OriginalMember(owner = "client!vja", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!vja", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method8419(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!vja", name = "b", descriptor = "(I)Z")
	@Override
	protected boolean method8409() {
		return (this.anInt9881 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!vja", name = "a", descriptor = "(ILjava/awt/Component;)V")
	private void method8418(@OriginalArg(1) Component arg0) {
		this.method8420();
		this.aComponent5 = arg0;
		this.aComponent5.addMouseListener(this);
		this.aComponent5.addMouseMotionListener(this);
		this.aComponent5.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!vja", name = "a", descriptor = "(IBI)V")
	private void method8419(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt9884 = arg0;
		this.anInt9886 = arg1;
		if (this.aBoolean727) {
			this.method8417(-1, 0, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!vja", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method8419(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!vja", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method8419(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!vja", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8408() {
		return (this.anInt9881 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!vja", name = "b", descriptor = "(B)I")
	@Override
	public int method8405() {
		return this.anInt9883;
	}

	@OriginalMember(owner = "client!vja", name = "a", descriptor = "(I)Z")
	@Override
	protected boolean method8403() {
		return (this.anInt9881 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!vja", name = "d", descriptor = "(I)V")
	private void method8420() {
		if (this.aComponent5 == null) {
			return;
		}
		this.aComponent5.removeMouseWheelListener(this);
		this.aComponent5.removeMouseMotionListener(this);
		this.aComponent5.removeMouseListener(this);
		this.aComponent5 = null;
		this.anInt9882 = this.anInt9883 = this.anInt9881 = 0;
		this.aClass193_68 = null;
		this.aClass193_69 = null;
		this.anInt9884 = this.anInt9886 = this.anInt9885 = 0;
	}

	@OriginalMember(owner = "client!vja", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method8416(arg0);
		if ((this.anInt9885 & local4) == 0) {
			local4 = this.anInt9885;
		}
		if ((local4 & 0x1) != 0) {
			this.method8417(3, arg0.getClickCount(), arg0.getX(), arg0.getY());
		}
		if ((local4 & 0x4) != 0) {
			this.method8417(5, arg0.getClickCount(), arg0.getX(), arg0.getY());
		}
		if ((local4 & 0x2) != 0) {
			this.method8417(4, arg0.getClickCount(), arg0.getX(), arg0.getY());
		}
		this.anInt9885 &= ~local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}
}
