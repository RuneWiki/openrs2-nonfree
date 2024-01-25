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

@OriginalClass("client!dn")
public final class Class50_Sub1 extends Class50 implements MouseListener, MouseMotionListener, MouseWheelListener {

	@OriginalMember(owner = "client!dn", name = "n", descriptor = "I")
	private int anInt1359;

	@OriginalMember(owner = "client!dn", name = "o", descriptor = "I")
	private int anInt1360;

	@OriginalMember(owner = "client!dn", name = "q", descriptor = "I")
	private int anInt1361;

	@OriginalMember(owner = "client!dn", name = "r", descriptor = "I")
	private int anInt1362;

	@OriginalMember(owner = "client!dn", name = "t", descriptor = "I")
	private int anInt1363;

	@OriginalMember(owner = "client!dn", name = "u", descriptor = "I")
	private int anInt1364;

	@OriginalMember(owner = "client!dn", name = "w", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!dn", name = "p", descriptor = "Lclient!ps;")
	private Class193 aClass193_16 = new Class193();

	@OriginalMember(owner = "client!dn", name = "s", descriptor = "Lclient!ps;")
	private Class193 aClass193_17 = new Class193();

	@OriginalMember(owner = "client!dn", name = "v", descriptor = "Z")
	private final boolean aBoolean90;

	@OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class50_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method1350(arg0);
		this.aBoolean90 = arg1;
	}

	@OriginalMember(owner = "client!dn", name = "e", descriptor = "(B)V")
	private void method1348() {
		if (this.aComponent1 == null) {
			return;
		}
		this.aComponent1.removeMouseWheelListener(this);
		this.aComponent1.removeMouseMotionListener(this);
		this.aComponent1.removeMouseListener(this);
		this.anInt1361 = this.anInt1360 = this.anInt1359 = 0;
		this.aClass193_16 = null;
		this.anInt1363 = this.anInt1364 = this.anInt1362 = 0;
		this.aClass193_17 = null;
		this.aComponent1 = null;
	}

	@OriginalMember(owner = "client!dn", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method1352(arg0);
		if (local4 == 1) {
			this.method1349(arg0.getX(), arg0.getY(), 0, 0);
		} else if (local4 == 4) {
			this.method1349(arg0.getX(), arg0.getY(), 2, 0);
		} else if (local4 == 2) {
			this.method1349(arg0.getX(), arg0.getY(), 1, 0);
		}
		this.anInt1362 |= local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!dn", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		@Pc(8) int local8 = arg0.getWheelRotation();
		this.method1349(local2, local5, 6, local8);
		arg0.consume();
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIZII)V")
	private void method1349(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class3_Sub5_Sub1 local3 = new Class3_Sub5_Sub1();
		local3.anInt146 = arg0;
		local3.anInt145 = arg1;
		local3.anInt144 = arg2;
		local3.aLong14 = Static354.method4966();
		local3.anInt143 = arg3;
		this.aClass193_17.method4527(local3);
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	private void method1350(@OriginalArg(0) Component arg0) {
		this.method1348();
		this.aComponent1 = arg0;
		this.aComponent1.addMouseListener(this);
		this.aComponent1.addMouseMotionListener(this);
		this.aComponent1.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!dn", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method1351(arg0);
	}

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "(I)V")
	@Override
	public void method4990() {
		this.method1348();
	}

	@OriginalMember(owner = "client!dn", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.anInt1364 = -1;
		this.anInt1363 = -1;
	}

	@OriginalMember(owner = "client!dn", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method1351(arg0);
	}

	@OriginalMember(owner = "client!dn", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method1352(arg0);
		if ((this.anInt1362 & local4) == 0) {
			local4 = this.anInt1362;
		}
		if ((local4 & 0x1) != 0) {
			this.method1349(arg0.getX(), arg0.getY(), 3, 0);
		}
		if ((local4 & 0x4) != 0) {
			this.method1349(arg0.getX(), arg0.getY(), 5, 0);
		}
		if ((local4 & 0x2) != 0) {
			this.method1349(arg0.getX(), arg0.getY(), 4, 0);
		}
		this.anInt1362 &= ~local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(B)Lclient!oq;")
	@Override
	public Class3_Sub5 method4991() {
		return (Class3_Sub5) this.aClass193_16.method4521();
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)V")
	private void method1351(@OriginalArg(0) MouseEvent arg0) {
		this.anInt1363 = arg0.getX();
		this.anInt1364 = arg0.getY();
		if (this.aBoolean90) {
			this.method1349(arg0.getX(), arg0.getY(), -1, 0);
		}
	}

	@OriginalMember(owner = "client!dn", name = "e", descriptor = "(I)V")
	@Override
	public synchronized void method4996() {
		this.anInt1360 = this.anInt1364;
		this.anInt1361 = this.anInt1363;
		this.anInt1359 = this.anInt1362;
		@Pc(20) Class193 local20 = this.aClass193_16;
		this.aClass193_16 = this.aClass193_17;
		this.aClass193_17 = local20;
		this.aClass193_17.method4524();
	}

	@OriginalMember(owner = "client!dn", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!dn", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method4995() {
		return (this.anInt1359 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "(B)I")
	@Override
	public int method4993() {
		return this.anInt1361;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)I")
	private int method1352(@OriginalArg(1) MouseEvent arg0) {
		@Pc(2) int local2 = arg0.getModifiers();
		@Pc(11) boolean local11 = (local2 & 0x10) != 0;
		@Pc(22) boolean local22 = (local2 & 0x8) != 0;
		@Pc(30) boolean local30 = (local2 & 0x4) != 0;
		if (local22 && (local11 || local30)) {
			local22 = false;
		}
		if (local11 && local30) {
			return 4;
		} else if (local11) {
			return 1;
		} else if (local22) {
			return 2;
		} else if (local30) {
			return 4;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "(I)I")
	@Override
	public int method4989() {
		return this.anInt1360;
	}

	@OriginalMember(owner = "client!dn", name = "d", descriptor = "(B)Z")
	@Override
	protected boolean method5000() {
		return (this.anInt1359 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(I)Z")
	@Override
	protected boolean method4988() {
		return (this.anInt1359 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!dn", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method1351(arg0);
	}
}
