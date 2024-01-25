import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rj")
public final class Class50_Sub2 extends Class50 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!rj", name = "p", descriptor = "I")
	private int anInt6079;

	@OriginalMember(owner = "client!rj", name = "L", descriptor = "I")
	private int anInt6099;

	@OriginalMember(owner = "client!rj", name = "N", descriptor = "I")
	private int anInt6101;

	@OriginalMember(owner = "client!rj", name = "S", descriptor = "I")
	private int anInt6105;

	@OriginalMember(owner = "client!rj", name = "V", descriptor = "I")
	private int anInt6106;

	@OriginalMember(owner = "client!rj", name = "W", descriptor = "I")
	private int anInt6107;

	@OriginalMember(owner = "client!rj", name = "Z", descriptor = "Ljava/awt/Component;")
	private Component aComponent3;

	@OriginalMember(owner = "client!rj", name = "x", descriptor = "Lclient!ps;")
	private Class193 aClass193_58 = new Class193();

	@OriginalMember(owner = "client!rj", name = "Q", descriptor = "Lclient!ps;")
	private Class193 aClass193_59 = new Class193();

	@OriginalMember(owner = "client!rj", name = "ab", descriptor = "Z")
	private final boolean aBoolean421;

	@OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class50_Sub2(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method5006(arg0);
		this.aBoolean421 = arg1;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)I")
	private int method5002(@OriginalArg(1) MouseEvent arg0) {
		@Pc(6) int local6 = arg0.getModifiers();
		@Pc(14) boolean local14 = (local6 & 0x10) != 0;
		@Pc(22) boolean local22 = (local6 & 0x8) != 0;
		@Pc(33) boolean local33 = (local6 & 0x4) != 0;
		if (local22 && (local14 || local33)) {
			local22 = false;
		}
		if (local14 && local33) {
			return 4;
		} else if (local14) {
			return 1;
		} else if (local22) {
			return 2;
		} else if (local33) {
			return 4;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)Z")
	@Override
	protected boolean method4988() {
		return (this.anInt6079 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIZI)V")
	private void method5003(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class3_Sub5_Sub2 local7 = new Class3_Sub5_Sub2();
		local7.anInt6533 = arg2;
		local7.anInt6527 = arg1;
		local7.anInt6528 = arg0;
		local7.aLong220 = Static354.method4966();
		this.aClass193_59.method4527(local7);
	}

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "(I)I")
	@Override
	public int method4989() {
		return this.anInt6101;
	}

	@OriginalMember(owner = "client!rj", name = "d", descriptor = "(B)Z")
	@Override
	protected boolean method5000() {
		return (this.anInt6079 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
	private void method5006(@OriginalArg(0) Component arg0) {
		this.method5010();
		this.aComponent3 = arg0;
		this.aComponent3.addMouseListener(this);
		this.aComponent3.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(B)Lclient!oq;")
	@Override
	public Class3_Sub5 method4991() {
		return (Class3_Sub5) this.aClass193_58.method4521();
	}

	@OriginalMember(owner = "client!rj", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method5002(arg0);
		if (local10 == 1) {
			this.method5003(arg0.getX(), 0, arg0.getY());
		} else if (local10 == 4) {
			this.method5003(arg0.getX(), 2, arg0.getY());
		} else if (local10 == 2) {
			this.method5003(arg0.getX(), 1, arg0.getY());
		}
		this.anInt6105 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!rj", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method5009(arg0);
	}

	@OriginalMember(owner = "client!rj", name = "c", descriptor = "(I)V")
	@Override
	public void method4990() {
		this.method5010();
	}

	@OriginalMember(owner = "client!rj", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method5002(arg0);
		if ((this.anInt6105 & local8) == 0) {
			local8 = this.anInt6105;
		}
		if ((local8 & 0x1) != 0) {
			this.method5003(arg0.getX(), 3, arg0.getY());
		}
		if ((local8 & 0x4) != 0) {
			this.method5003(arg0.getX(), 5, arg0.getY());
		}
		if ((local8 & 0x2) != 0) {
			this.method5003(arg0.getX(), 4, arg0.getY());
		}
		this.anInt6105 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!rj", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method4995() {
		return (this.anInt6079 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;B)V")
	private void method5009(@OriginalArg(0) MouseEvent arg0) {
		this.anInt6107 = arg0.getX();
		this.anInt6106 = arg0.getY();
		if (this.aBoolean421) {
			this.method5003(arg0.getX(), -1, arg0.getY());
		}
	}

	@OriginalMember(owner = "client!rj", name = "e", descriptor = "(I)V")
	@Override
	public synchronized void method4996() {
		this.anInt6101 = this.anInt6106;
		this.anInt6079 = this.anInt6105;
		this.anInt6099 = this.anInt6107;
		@Pc(18) Class193 local18 = this.aClass193_58;
		this.aClass193_58 = this.aClass193_59;
		this.aClass193_59 = local18;
		this.aClass193_59.method4524();
	}

	@OriginalMember(owner = "client!rj", name = "i", descriptor = "(I)V")
	private void method5010() {
		if (this.aComponent3 == null) {
			return;
		}
		this.aComponent3.removeMouseMotionListener(this);
		this.aComponent3.removeMouseListener(this);
		this.aClass193_58 = null;
		this.aComponent3 = null;
		this.anInt6099 = this.anInt6101 = this.anInt6079 = 0;
		this.anInt6107 = this.anInt6106 = this.anInt6105 = 0;
		this.aClass193_59 = null;
	}

	@OriginalMember(owner = "client!rj", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method5009(arg0);
	}

	@OriginalMember(owner = "client!rj", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!rj", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method5009(arg0);
	}

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "(B)I")
	@Override
	public int method4993() {
		return this.anInt6099;
	}

	@OriginalMember(owner = "client!rj", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.anInt6106 = -1;
		this.anInt6107 = -1;
	}
}
