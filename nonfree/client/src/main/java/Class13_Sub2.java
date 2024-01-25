import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ov")
public final class Class13_Sub2 extends Class13 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!ov", name = "p", descriptor = "I")
	private int anInt7150;

	@OriginalMember(owner = "client!ov", name = "w", descriptor = "I")
	private int anInt7157;

	@OriginalMember(owner = "client!ov", name = "D", descriptor = "I")
	private int anInt7161;

	@OriginalMember(owner = "client!ov", name = "F", descriptor = "I")
	private int anInt7163;

	@OriginalMember(owner = "client!ov", name = "I", descriptor = "I")
	private int anInt7165;

	@OriginalMember(owner = "client!ov", name = "K", descriptor = "I")
	private int anInt7167;

	@OriginalMember(owner = "client!ov", name = "M", descriptor = "Ljava/awt/Component;")
	private Component aComponent4;

	@OriginalMember(owner = "client!ov", name = "h", descriptor = "Lclient!ro;")
	private Class306 aClass306_39 = new Class306();

	@OriginalMember(owner = "client!ov", name = "L", descriptor = "Lclient!ro;")
	private Class306 aClass306_40 = new Class306();

	@OriginalMember(owner = "client!ov", name = "N", descriptor = "Z")
	private final boolean aBoolean598;

	@OriginalMember(owner = "client!ov", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class13_Sub2(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method6360(arg0);
		this.aBoolean598 = arg1;
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(BLjava/awt/event/MouseEvent;)I")
	private int method6356(@OriginalArg(1) MouseEvent arg0) {
		@Pc(6) int local6 = arg0.getModifiers();
		@Pc(17) boolean local17 = (local6 & 0x10) != 0;
		@Pc(28) boolean local28 = (local6 & 0x8) != 0;
		@Pc(36) boolean local36 = (local6 & 0x4) != 0;
		if (local28 && (local17 || local36)) {
			local28 = false;
		}
		if (local17 && local36) {
			return 4;
		} else if (local17) {
			return 1;
		} else if (local28) {
			return 2;
		} else if (local36) {
			return 4;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ov", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method6361(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!ov", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(Z)Z")
	@Override
	protected boolean method6349() {
		return (this.anInt7161 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!ov", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method6353() {
		this.anInt7161 = this.anInt7165;
		this.anInt7150 = this.anInt7163;
		this.anInt7157 = this.anInt7167;
		@Pc(22) Class306 local22 = this.aClass306_39;
		this.aClass306_39 = this.aClass306_40;
		this.aClass306_40 = local22;
		this.aClass306_40.method7315();
	}

	@OriginalMember(owner = "client!ov", name = "e", descriptor = "(I)V")
	private void method6357() {
		if (this.aComponent4 == null) {
			return;
		}
		this.aComponent4.removeMouseMotionListener(this);
		this.aComponent4.removeMouseListener(this);
		this.aClass306_39 = null;
		this.aComponent4 = null;
		this.anInt7163 = this.anInt7167 = this.anInt7165 = 0;
		this.aClass306_40 = null;
		this.anInt7150 = this.anInt7157 = this.anInt7161 = 0;
	}

	@OriginalMember(owner = "client!ov", name = "b", descriptor = "(Z)Z")
	@Override
	protected boolean method6351() {
		return (this.anInt7161 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!ov", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method6356(arg0);
		if ((this.anInt7165 & local8) == 0) {
			local8 = this.anInt7165;
		}
		if ((local8 & 0x1) != 0) {
			this.method6358(arg0.getY(), 3, arg0.getX(), arg0.getClickCount());
		}
		if ((local8 & 0x4) != 0) {
			this.method6358(arg0.getY(), 5, arg0.getX(), arg0.getClickCount());
		}
		if ((local8 & 0x2) != 0) {
			this.method6358(arg0.getY(), 4, arg0.getX(), arg0.getClickCount());
		}
		this.anInt7165 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ov", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method6356(arg0);
		if (local10 == 1) {
			this.method6358(arg0.getY(), 0, arg0.getX(), arg0.getClickCount());
		} else if (local10 == 4) {
			this.method6358(arg0.getY(), 2, arg0.getX(), arg0.getClickCount());
		} else if (local10 == 2) {
			this.method6358(arg0.getY(), 1, arg0.getX(), arg0.getClickCount());
		}
		this.anInt7165 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(IIIIZ)V")
	private void method6358(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class5_Sub33_Sub2 local7 = new Class5_Sub33_Sub2();
		local7.anInt6847 = arg2;
		local7.anInt6841 = arg1;
		local7.anInt6842 = arg3;
		local7.anInt6840 = arg0;
		local7.aLong188 = Static205.method3179();
		this.aClass306_40.method7303(local7);
	}

	@OriginalMember(owner = "client!ov", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method6361(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!ov", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method6361(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!ov", name = "b", descriptor = "(B)Lclient!qg;")
	@Override
	public Class5_Sub33 method6348() {
		return (Class5_Sub33) this.aClass306_39.method7302();
	}

	@OriginalMember(owner = "client!ov", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method6361(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!ov", name = "d", descriptor = "(B)I")
	@Override
	public int method6355() {
		return this.anInt7150;
	}

	@OriginalMember(owner = "client!ov", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method6352() {
		return (this.anInt7161 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(ILjava/awt/Component;)V")
	private void method6360(@OriginalArg(1) Component arg0) {
		this.method6357();
		this.aComponent4 = arg0;
		this.aComponent4.addMouseListener(this);
		this.aComponent4.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(III)V")
	private void method6361(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt7167 = arg1;
		this.anInt7163 = arg0;
		if (this.aBoolean598) {
			this.method6358(arg1, -1, arg0, 0);
		}
	}

	@OriginalMember(owner = "client!ov", name = "b", descriptor = "(I)I")
	@Override
	public int method6347() {
		return this.anInt7157;
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(B)V")
	@Override
	public void method6344() {
		this.method6357();
	}
}
