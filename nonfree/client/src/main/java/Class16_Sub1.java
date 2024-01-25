import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aja")
public final class Class16_Sub1 extends Class16 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!aja", name = "j", descriptor = "I")
	private int anInt442;

	@OriginalMember(owner = "client!aja", name = "n", descriptor = "I")
	private int anInt446;

	@OriginalMember(owner = "client!aja", name = "x", descriptor = "I")
	private int anInt456;

	@OriginalMember(owner = "client!aja", name = "H", descriptor = "I")
	private int anInt464;

	@OriginalMember(owner = "client!aja", name = "J", descriptor = "I")
	private int anInt465;

	@OriginalMember(owner = "client!aja", name = "K", descriptor = "I")
	private int anInt466;

	@OriginalMember(owner = "client!aja", name = "L", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!aja", name = "C", descriptor = "Lclient!tm;")
	private Class338 aClass338_7 = new Class338();

	@OriginalMember(owner = "client!aja", name = "I", descriptor = "Lclient!tm;")
	private Class338 aClass338_8 = new Class338();

	@OriginalMember(owner = "client!aja", name = "M", descriptor = "Z")
	private final boolean aBoolean37;

	@OriginalMember(owner = "client!aja", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class16_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method567(arg0);
		this.aBoolean37 = arg1;
	}

	@OriginalMember(owner = "client!aja", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method570(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!aja", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method5889() {
		this.anInt446 = this.anInt464;
		this.anInt442 = this.anInt466;
		this.anInt456 = this.anInt465;
		@Pc(18) Class338 local18 = this.aClass338_7;
		this.aClass338_7 = this.aClass338_8;
		this.aClass338_8 = local18;
		this.aClass338_8.method8175();
	}

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5883() {
		return (this.anInt456 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(IIIII)V")
	private void method564(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(11) Class3_Sub43_Sub2 local11 = new Class3_Sub43_Sub2();
		local11.anInt8917 = arg1;
		local11.anInt8908 = arg3;
		local11.anInt8913 = arg0;
		local11.anInt8914 = arg2;
		local11.aLong258 = Static524.method7320();
		this.aClass338_8.method8171(local11);
	}

	@OriginalMember(owner = "client!aja", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method570(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)I")
	private int method565(@OriginalArg(0) MouseEvent arg0) {
		@Pc(6) int local6 = arg0.getModifiers();
		@Pc(15) boolean local15 = (local6 & 0x10) != 0;
		@Pc(23) boolean local23 = (local6 & 0x8) != 0;
		@Pc(34) boolean local34 = (local6 & 0x4) != 0;
		if (local23 && (local15 || local34)) {
			local23 = false;
		}
		if (local15 && local34) {
			return 4;
		} else if (local15) {
			return 1;
		} else if (local23) {
			return 2;
		} else if (local34) {
			return 4;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(I)Z")
	@Override
	protected boolean method5884() {
		return (this.anInt456 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!aja", name = "g", descriptor = "(I)V")
	private void method566() {
		if (this.aComponent1 == null) {
			return;
		}
		this.aComponent1.removeMouseMotionListener(this);
		this.aComponent1.removeMouseListener(this);
		this.anInt464 = this.anInt466 = this.anInt465 = 0;
		this.aComponent1 = null;
		this.aClass338_7 = null;
		this.aClass338_8 = null;
		this.anInt446 = this.anInt442 = this.anInt456 = 0;
	}

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(B)Z")
	@Override
	protected boolean method5882() {
		return (this.anInt456 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!aja", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method570(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!aja", name = "f", descriptor = "(I)Lclient!qq;")
	@Override
	public Class3_Sub43 method5891() {
		return (Class3_Sub43) this.aClass338_7.method8169();
	}

	@OriginalMember(owner = "client!aja", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!aja", name = "c", descriptor = "(I)V")
	@Override
	public void method5886() {
		this.method566();
	}

	@OriginalMember(owner = "client!aja", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method565(arg0);
		if ((this.anInt465 & local8) == 0) {
			local8 = this.anInt465;
		}
		if ((local8 & 0x1) != 0) {
			this.method564(arg0.getClickCount(), arg0.getY(), arg0.getX(), 3);
		}
		if ((local8 & 0x4) != 0) {
			this.method564(arg0.getClickCount(), arg0.getY(), arg0.getX(), 5);
		}
		if ((local8 & 0x2) != 0) {
			this.method564(arg0.getClickCount(), arg0.getY(), arg0.getX(), 4);
		}
		this.anInt465 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(ILjava/awt/Component;)V")
	private void method567(@OriginalArg(1) Component arg0) {
		this.method566();
		this.aComponent1 = arg0;
		this.aComponent1.addMouseListener(this);
		this.aComponent1.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!aja", name = "b", descriptor = "(B)I")
	@Override
	public int method5887() {
		return this.anInt442;
	}

	@OriginalMember(owner = "client!aja", name = "b", descriptor = "(I)I")
	@Override
	public int method5885() {
		return this.anInt446;
	}

	@OriginalMember(owner = "client!aja", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method570(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(BII)V")
	private void method570(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt464 = arg1;
		this.anInt466 = arg0;
		if (this.aBoolean37) {
			this.method564(0, arg0, arg1, -1);
		}
	}

	@OriginalMember(owner = "client!aja", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method565(arg0);
		if (local10 == 1) {
			this.method564(arg0.getClickCount(), arg0.getY(), arg0.getX(), 0);
		} else if (local10 == 4) {
			this.method564(arg0.getClickCount(), arg0.getY(), arg0.getX(), 2);
		} else if (local10 == 2) {
			this.method564(arg0.getClickCount(), arg0.getY(), arg0.getX(), 1);
		}
		this.anInt465 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}
}
