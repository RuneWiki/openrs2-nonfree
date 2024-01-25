import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!on")
public final class Class156_Sub2 extends Class156 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!on", name = "z", descriptor = "I")
	private int anInt6649;

	@OriginalMember(owner = "client!on", name = "B", descriptor = "I")
	private int anInt6651;

	@OriginalMember(owner = "client!on", name = "E", descriptor = "I")
	private int anInt6654;

	@OriginalMember(owner = "client!on", name = "F", descriptor = "I")
	private int anInt6655;

	@OriginalMember(owner = "client!on", name = "G", descriptor = "I")
	private int anInt6656;

	@OriginalMember(owner = "client!on", name = "I", descriptor = "I")
	private int anInt6657;

	@OriginalMember(owner = "client!on", name = "K", descriptor = "Ljava/awt/Component;")
	private Component aComponent3;

	@OriginalMember(owner = "client!on", name = "k", descriptor = "Lclient!hga;")
	private Class130 aClass130_40 = new Class130();

	@OriginalMember(owner = "client!on", name = "J", descriptor = "Lclient!hga;")
	private Class130 aClass130_41 = new Class130();

	@OriginalMember(owner = "client!on", name = "M", descriptor = "Z")
	private final boolean aBoolean539;

	@OriginalMember(owner = "client!on", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class156_Sub2(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method5699(arg0);
		this.aBoolean539 = arg1;
	}

	@OriginalMember(owner = "client!on", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method5695(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!on", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5685() {
		return (this.anInt6654 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!on", name = "e", descriptor = "(I)I")
	@Override
	public int method5690() {
		return this.anInt6651;
	}

	@OriginalMember(owner = "client!on", name = "c", descriptor = "(B)Lclient!nm;")
	@Override
	public Class3_Sub24 method5691() {
		return (Class3_Sub24) this.aClass130_40.method3545();
	}

	@OriginalMember(owner = "client!on", name = "d", descriptor = "(I)I")
	@Override
	public int method5689() {
		return this.anInt6649;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(III)V")
	private void method5695(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6655 = arg0;
		this.anInt6657 = arg1;
		if (this.aBoolean539) {
			this.method5697(arg1, arg0, 0, -1);
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Z)V")
	@Override
	public void method5687() {
		this.method5698();
	}

	@OriginalMember(owner = "client!on", name = "f", descriptor = "(I)V")
	@Override
	public synchronized void method5692() {
		this.anInt6649 = this.anInt6655;
		this.anInt6651 = this.anInt6657;
		this.anInt6654 = this.anInt6656;
		@Pc(22) Class130 local22 = this.aClass130_40;
		this.aClass130_40 = this.aClass130_41;
		this.aClass130_41 = local22;
		this.aClass130_41.method3541();
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IIIIZ)V")
	private void method5697(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class3_Sub24_Sub1 local7 = new Class3_Sub24_Sub1();
		local7.anInt3677 = arg1;
		local7.anInt3676 = arg2;
		local7.anInt3674 = arg3;
		local7.anInt3675 = arg0;
		local7.aLong108 = Static587.method7753();
		this.aClass130_41.method3548(local7);
	}

	@OriginalMember(owner = "client!on", name = "d", descriptor = "(B)V")
	private void method5698() {
		if (this.aComponent3 == null) {
			return;
		}
		this.aComponent3.removeMouseMotionListener(this);
		this.aComponent3.removeMouseListener(this);
		this.anInt6649 = this.anInt6651 = this.anInt6654 = 0;
		this.anInt6655 = this.anInt6657 = this.anInt6656 = 0;
		this.aClass130_40 = null;
		this.aClass130_41 = null;
		this.aComponent3 = null;
	}

	@OriginalMember(owner = "client!on", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method5700(arg0);
		if (local10 == 1) {
			this.method5697(arg0.getY(), arg0.getX(), arg0.getClickCount(), 0);
		} else if (local10 == 4) {
			this.method5697(arg0.getY(), arg0.getX(), arg0.getClickCount(), 2);
		} else if (local10 == 2) {
			this.method5697(arg0.getY(), arg0.getX(), arg0.getClickCount(), 1);
		}
		this.anInt6656 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!on", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method5700(arg0);
		if ((this.anInt6656 & local8) == 0) {
			local8 = this.anInt6656;
		}
		if ((local8 & 0x1) != 0) {
			this.method5697(arg0.getY(), arg0.getX(), arg0.getClickCount(), 3);
		}
		if ((local8 & 0x4) != 0) {
			this.method5697(arg0.getY(), arg0.getX(), arg0.getClickCount(), 5);
		}
		if ((local8 & 0x2) != 0) {
			this.method5697(arg0.getY(), arg0.getX(), arg0.getClickCount(), 4);
		}
		this.anInt6656 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!on", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(ILjava/awt/Component;)V")
	private void method5699(@OriginalArg(1) Component arg0) {
		this.method5698();
		this.aComponent3 = arg0;
		this.aComponent3.addMouseListener(this);
		this.aComponent3.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!on", name = "c", descriptor = "(I)Z")
	@Override
	protected boolean method5688() {
		return (this.anInt6654 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!on", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method5695(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!on", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method5695(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(B)Z")
	@Override
	protected boolean method5683() {
		return (this.anInt6654 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!on", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method5695(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)I")
	private int method5700(@OriginalArg(1) MouseEvent arg0) {
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
}
