import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ica")
public final class Class164_Sub1 extends Class164 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!ica", name = "I", descriptor = "I")
	private int anInt4065;

	@OriginalMember(owner = "client!ica", name = "y", descriptor = "I")
	private int anInt4076;

	@OriginalMember(owner = "client!ica", name = "O", descriptor = "I")
	private int anInt4079;

	@OriginalMember(owner = "client!ica", name = "p", descriptor = "I")
	private int anInt4093;

	@OriginalMember(owner = "client!ica", name = "G", descriptor = "I")
	private int anInt4094;

	@OriginalMember(owner = "client!ica", name = "B", descriptor = "I")
	private int anInt4096;

	@OriginalMember(owner = "client!ica", name = "u", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!ica", name = "m", descriptor = "Lclient!at;")
	private Class20 aClass20_13 = new Class20();

	@OriginalMember(owner = "client!ica", name = "s", descriptor = "Lclient!at;")
	private Class20 aClass20_14 = new Class20();

	@OriginalMember(owner = "client!ica", name = "E", descriptor = "Z")
	private final boolean aBoolean275;

	@OriginalMember(owner = "client!ica", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class164_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method3743(arg0);
		this.aBoolean275 = arg1;
	}

	@OriginalMember(owner = "client!ica", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method3746(arg0);
		if (local10 == 1) {
			this.method3745(arg0.getClickCount(), arg0.getX(), arg0.getY(), 0);
		} else if (local10 == 4) {
			this.method3745(arg0.getClickCount(), arg0.getX(), arg0.getY(), 2);
		} else if (local10 == 2) {
			this.method3745(arg0.getClickCount(), arg0.getX(), arg0.getY(), 1);
		}
		this.anInt4096 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ica", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ica", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method5002() {
		return (this.anInt4065 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ica", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method3742(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(B)Z")
	@Override
	protected boolean method4996() {
		return (this.anInt4065 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!ica", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method3742(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!ica", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method3746(arg0);
		if ((local8 & this.anInt4096) == 0) {
			local8 = this.anInt4096;
		}
		if ((local8 & 0x1) != 0) {
			this.method3745(arg0.getClickCount(), arg0.getX(), arg0.getY(), 3);
		}
		if ((local8 & 0x4) != 0) {
			this.method3745(arg0.getClickCount(), arg0.getX(), arg0.getY(), 5);
		}
		if ((local8 & 0x2) != 0) {
			this.method3745(arg0.getClickCount(), arg0.getX(), arg0.getY(), 4);
		}
		this.anInt4096 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ica", name = "b", descriptor = "(III)V")
	private void method3742(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4094 = arg0;
		this.anInt4093 = arg1;
		if (this.aBoolean275) {
			this.method3745(0, arg1, arg0, -1);
		}
	}

	@OriginalMember(owner = "client!ica", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method3742(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!ica", name = "b", descriptor = "(I)V")
	@Override
	public void method5003() {
		this.method3744();
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(ILjava/awt/Component;)V")
	private void method3743(@OriginalArg(1) Component arg0) {
		this.method3744();
		this.aComponent1 = arg0;
		this.aComponent1.addMouseListener(this);
		this.aComponent1.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!ica", name = "f", descriptor = "(I)V")
	private void method3744() {
		if (this.aComponent1 == null) {
			return;
		}
		this.aComponent1.removeMouseMotionListener(this);
		this.aComponent1.removeMouseListener(this);
		this.aComponent1 = null;
		this.anInt4093 = this.anInt4094 = this.anInt4096 = 0;
		this.aClass20_13 = null;
		this.anInt4079 = this.anInt4076 = this.anInt4065 = 0;
		this.aClass20_14 = null;
	}

	@OriginalMember(owner = "client!ica", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method5001() {
		this.anInt4079 = this.anInt4093;
		this.anInt4065 = this.anInt4096;
		this.anInt4076 = this.anInt4094;
		@Pc(24) Class20 local24 = this.aClass20_13;
		this.aClass20_13 = this.aClass20_14;
		this.aClass20_14 = local24;
		this.aClass20_14.method374();
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(Z)I")
	@Override
	public int method5000() {
		return this.anInt4076;
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(BIIII)V")
	private void method3745(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class5_Sub10_Sub2 local7 = new Class5_Sub10_Sub2();
		local7.anInt8152 = arg3;
		local7.anInt8155 = arg2;
		local7.anInt8151 = arg0;
		local7.anInt8148 = arg1;
		local7.aLong237 = Static480.method6763();
		this.aClass20_14.method370(local7);
	}

	@OriginalMember(owner = "client!ica", name = "c", descriptor = "(I)Lclient!va;")
	@Override
	public Class5_Sub10 method5005() {
		return (Class5_Sub10) this.aClass20_13.method369();
	}

	@OriginalMember(owner = "client!ica", name = "e", descriptor = "(I)I")
	@Override
	public int method4999() {
		return this.anInt4079;
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)I")
	private int method3746(@OriginalArg(1) MouseEvent arg0) {
		@Pc(6) int local6 = arg0.getModifiers();
		@Pc(15) boolean local15 = (local6 & 0x10) != 0;
		@Pc(27) boolean local27 = (local6 & 0x8) != 0;
		@Pc(48) boolean local48 = (local6 & 0x4) != 0;
		if (local27 && (local15 || local48)) {
			local27 = false;
		}
		if (local15 && local48) {
			return 4;
		} else if (local15) {
			return 1;
		} else if (local27) {
			return 2;
		} else if (local48) {
			return 4;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ica", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method3742(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!ica", name = "b", descriptor = "(B)Z")
	@Override
	protected boolean method5004() {
		return (this.anInt4065 & 0x4) != 0;
	}
}
