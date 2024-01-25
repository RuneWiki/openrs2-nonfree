import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lr")
public final class Class127_Sub1 extends Class127 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!lr", name = "h", descriptor = "I")
	private int anInt3943;

	@OriginalMember(owner = "client!lr", name = "j", descriptor = "I")
	private int anInt3945;

	@OriginalMember(owner = "client!lr", name = "C", descriptor = "I")
	private int anInt3963;

	@OriginalMember(owner = "client!lr", name = "L", descriptor = "I")
	private int anInt3971;

	@OriginalMember(owner = "client!lr", name = "Q", descriptor = "I")
	private int anInt3972;

	@OriginalMember(owner = "client!lr", name = "R", descriptor = "I")
	private int anInt3973;

	@OriginalMember(owner = "client!lr", name = "S", descriptor = "Ljava/awt/Component;")
	private Component aComponent3;

	@OriginalMember(owner = "client!lr", name = "x", descriptor = "Lclient!kn;")
	private Class116 aClass116_33 = new Class116();

	@OriginalMember(owner = "client!lr", name = "N", descriptor = "Lclient!kn;")
	private Class116 aClass116_34 = new Class116();

	@OriginalMember(owner = "client!lr", name = "T", descriptor = "Z")
	private final boolean aBoolean307;

	@OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class127_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method3605(arg0);
		this.aBoolean307 = arg1;
	}

	@OriginalMember(owner = "client!lr", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method3600(arg0);
	}

	@OriginalMember(owner = "client!lr", name = "h", descriptor = "(I)Z")
	@Override
	protected boolean method3594() {
		return (this.anInt3963 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!lr", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method3600(arg0);
	}

	@OriginalMember(owner = "client!lr", name = "j", descriptor = "(I)Z")
	@Override
	protected boolean method3598() {
		return (this.anInt3963 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(I)V")
	@Override
	public void method3585() {
		this.method3602();
	}

	@OriginalMember(owner = "client!lr", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method3587() {
		this.anInt3963 = this.anInt3972;
		this.anInt3945 = this.anInt3973;
		this.anInt3943 = this.anInt3971;
		@Pc(22) Class116 local22 = this.aClass116_33;
		this.aClass116_33 = this.aClass116_34;
		this.aClass116_34 = local22;
		this.aClass116_34.method3273();
	}

	@OriginalMember(owner = "client!lr", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method3600(arg0);
	}

	@OriginalMember(owner = "client!lr", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method3589() {
		return (this.anInt3963 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!lr", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		this.anInt3972 |= arg0.getModifiers();
		@Pc(14) byte local14 = -1;
		if ((arg0.getModifiers() & 0x8) != 0) {
			local14 = 1;
		} else if ((arg0.getModifiers() & 0x4) != 0) {
			local14 = 2;
		} else if ((arg0.getModifiers() & 0x10) != 0) {
			local14 = 0;
		}
		if (local14 != -1) {
			this.method3607(local14, arg0.getX(), arg0.getY());
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!lr", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.anInt3973 = -1;
		this.anInt3971 = -1;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)V")
	private void method3600(@OriginalArg(1) MouseEvent arg0) {
		this.anInt3971 = arg0.getX();
		this.anInt3973 = arg0.getY();
		if (this.aBoolean307) {
			this.method3607(-1, arg0.getX(), arg0.getY());
		}
	}

	@OriginalMember(owner = "client!lr", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!lr", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		this.anInt3972 &= ~arg0.getModifiers();
		@Pc(16) byte local16 = -1;
		if ((arg0.getModifiers() & 0x8) != 0) {
			local16 = 4;
		} else if ((arg0.getModifiers() & 0x4) != 0) {
			local16 = 5;
		} else if ((arg0.getModifiers() & 0x10) != 0) {
			local16 = 3;
		}
		if (local16 != -1) {
			this.method3607(local16, arg0.getX(), arg0.getY());
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!lr", name = "k", descriptor = "(I)V")
	private void method3602() {
		if (this.aComponent3 == null) {
			return;
		}
		this.aComponent3.removeMouseListener(this);
		this.aComponent3.removeMouseMotionListener(this);
		this.anInt3971 = this.anInt3973 = this.anInt3972 = 0;
		this.aComponent3 = null;
		this.anInt3943 = this.anInt3945 = this.anInt3963 = 0;
		this.aClass116_34 = null;
		this.aClass116_33 = null;
	}

	@OriginalMember(owner = "client!lr", name = "i", descriptor = "(I)I")
	@Override
	public int method3595() {
		return this.anInt3945;
	}

	@OriginalMember(owner = "client!lr", name = "d", descriptor = "(I)I")
	@Override
	public int method3588() {
		return this.anInt3943;
	}

	@OriginalMember(owner = "client!lr", name = "f", descriptor = "(I)Lclient!mh;")
	@Override
	public Class4_Sub28 method3591() {
		return (Class4_Sub28) this.aClass116_33.method3266();
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
	private void method3605(@OriginalArg(0) Component arg0) {
		this.method3602();
		this.aComponent3 = arg0;
		this.aComponent3.addMouseListener(this);
		this.aComponent3.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIII)V")
	private void method3607(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class4_Sub28_Sub1 local7 = new Class4_Sub28_Sub1();
		local7.anInt6643 = arg0;
		local7.anInt6644 = arg1;
		local7.anInt6639 = arg2;
		local7.aLong219 = Static208.method3879();
		this.aClass116_34.method3274(local7);
	}
}
