import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ig")
public final class Class135_Sub1 extends Class135 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!ig", name = "f", descriptor = "I")
	private int anInt3963;

	@OriginalMember(owner = "client!ig", name = "w", descriptor = "I")
	private int anInt3980;

	@OriginalMember(owner = "client!ig", name = "E", descriptor = "I")
	private int anInt3987;

	@OriginalMember(owner = "client!ig", name = "G", descriptor = "I")
	private int anInt3988;

	@OriginalMember(owner = "client!ig", name = "H", descriptor = "I")
	private int anInt3989;

	@OriginalMember(owner = "client!ig", name = "I", descriptor = "I")
	private int anInt3990;

	@OriginalMember(owner = "client!ig", name = "L", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!ig", name = "A", descriptor = "Lclient!oe;")
	private Class244 aClass244_31 = new Class244();

	@OriginalMember(owner = "client!ig", name = "J", descriptor = "Lclient!oe;")
	private Class244 aClass244_32 = new Class244();

	@OriginalMember(owner = "client!ig", name = "K", descriptor = "Z")
	private final boolean aBoolean303;

	@OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class135_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method3556(arg0);
		this.aBoolean303 = arg1;
	}

	@OriginalMember(owner = "client!ig", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method3554(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!ig", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method3554(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!ig", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method3555(arg0);
		if ((this.anInt3988 & local8) == 0) {
			local8 = this.anInt3988;
		}
		if ((local8 & 0x1) != 0) {
			this.method3553(arg0.getX(), 3, arg0.getY(), arg0.getClickCount());
		}
		if ((local8 & 0x4) != 0) {
			this.method3553(arg0.getX(), 5, arg0.getY(), arg0.getClickCount());
		}
		if ((local8 & 0x2) != 0) {
			this.method3553(arg0.getX(), 4, arg0.getY(), arg0.getClickCount());
		}
		this.anInt3988 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ig", name = "f", descriptor = "(I)I")
	@Override
	public int method6378() {
		return this.anInt3987;
	}

	@OriginalMember(owner = "client!ig", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method3554(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(I)V")
	@Override
	public void method6373() {
		this.method3552();
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Z)V")
	@Override
	public synchronized void method6369() {
		this.anInt3987 = this.anInt3989;
		this.anInt3963 = this.anInt3990;
		this.anInt3980 = this.anInt3988;
		@Pc(18) Class244 local18 = this.aClass244_31;
		this.aClass244_31 = this.aClass244_32;
		this.aClass244_32 = local18;
		this.aClass244_32.method5962();
	}

	@OriginalMember(owner = "client!ig", name = "i", descriptor = "(I)V")
	private void method3552() {
		if (this.aComponent2 == null) {
			return;
		}
		this.aComponent2.removeMouseMotionListener(this);
		this.aComponent2.removeMouseListener(this);
		this.aClass244_31 = null;
		this.aComponent2 = null;
		this.aClass244_32 = null;
		this.anInt3990 = this.anInt3989 = this.anInt3988 = 0;
		this.anInt3963 = this.anInt3987 = this.anInt3980 = 0;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIII)V")
	private void method3553(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) Class4_Sub15_Sub2 local14 = new Class4_Sub15_Sub2();
		local14.anInt3903 = arg2;
		local14.anInt3900 = arg1;
		local14.anInt3908 = arg0;
		local14.anInt3905 = arg3;
		local14.aLong116 = Static574.method8210();
		this.aClass244_32.method5960(local14);
	}

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "(I)Z")
	@Override
	protected boolean method6375() {
		return (this.anInt3980 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!ig", name = "e", descriptor = "(I)Z")
	@Override
	protected boolean method6377() {
		return (this.anInt3980 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(BII)V")
	private void method3554(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt3990 = arg0;
		this.anInt3989 = arg1;
		if (this.aBoolean303) {
			this.method3553(arg0, -1, arg1, 0);
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;B)I")
	private int method3555(@OriginalArg(0) MouseEvent arg0) {
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

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method6371() {
		return (this.anInt3980 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	private void method3556(@OriginalArg(0) Component arg0) {
		this.method3552();
		this.aComponent2 = arg0;
		this.aComponent2.addMouseListener(this);
		this.aComponent2.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)I")
	@Override
	public int method6370() {
		return this.anInt3963;
	}

	@OriginalMember(owner = "client!ig", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ig", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method3554(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!ig", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method3555(arg0);
		if (local10 == 1) {
			this.method3553(arg0.getX(), 0, arg0.getY(), arg0.getClickCount());
		} else if (local10 == 4) {
			this.method3553(arg0.getX(), 2, arg0.getY(), arg0.getClickCount());
		} else if (local10 == 2) {
			this.method3553(arg0.getX(), 1, arg0.getY(), arg0.getClickCount());
		}
		this.anInt3988 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "(I)Lclient!ek;")
	@Override
	public Class4_Sub15 method6374() {
		return (Class4_Sub15) this.aClass244_31.method5968();
	}
}
