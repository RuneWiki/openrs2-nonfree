import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wda")
public final class Class116_Sub2 extends Class116 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!wda", name = "v", descriptor = "I")
	private int anInt10182;

	@OriginalMember(owner = "client!wda", name = "E", descriptor = "I")
	private int anInt10190;

	@OriginalMember(owner = "client!wda", name = "I", descriptor = "I")
	private int anInt10194;

	@OriginalMember(owner = "client!wda", name = "J", descriptor = "I")
	private int anInt10195;

	@OriginalMember(owner = "client!wda", name = "K", descriptor = "I")
	private int anInt10196;

	@OriginalMember(owner = "client!wda", name = "M", descriptor = "I")
	private int anInt10197;

	@OriginalMember(owner = "client!wda", name = "O", descriptor = "Ljava/awt/Component;")
	private Component aComponent5;

	@OriginalMember(owner = "client!wda", name = "m", descriptor = "Lclient!ki;")
	private Class183 aClass183_61 = new Class183();

	@OriginalMember(owner = "client!wda", name = "L", descriptor = "Lclient!ki;")
	private Class183 aClass183_62 = new Class183();

	@OriginalMember(owner = "client!wda", name = "N", descriptor = "Z")
	private final boolean aBoolean842;

	@OriginalMember(owner = "client!wda", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class116_Sub2(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method8257(arg0);
		this.aBoolean842 = arg1;
	}

	@OriginalMember(owner = "client!wda", name = "f", descriptor = "(I)Lclient!pc;")
	@Override
	public Class3_Sub21 method8254() {
		return (Class3_Sub21) this.aClass183_61.method4797();
	}

	@OriginalMember(owner = "client!wda", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method8256(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!wda", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method8256(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!wda", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method8259(arg0);
		if ((local8 & this.anInt10196) == 0) {
			local8 = this.anInt10196;
		}
		if ((local8 & 0x1) != 0) {
			this.method8261(3, arg0.getY(), arg0.getX());
		}
		if ((local8 & 0x4) != 0) {
			this.method8261(5, arg0.getY(), arg0.getX());
		}
		if ((local8 & 0x2) != 0) {
			this.method8261(4, arg0.getY(), arg0.getX());
		}
		this.anInt10196 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(I)Z")
	@Override
	protected boolean method8244() {
		return (this.anInt10182 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!wda", name = "d", descriptor = "(I)I")
	@Override
	public int method8250() {
		return this.anInt10194;
	}

	@OriginalMember(owner = "client!wda", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8247() {
		return (this.anInt10182 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!wda", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method8256(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(III)V")
	private void method8256(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt10197 = arg1;
		this.anInt10195 = arg0;
		if (this.aBoolean842) {
			this.method8261(-1, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!wda", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method8246() {
		this.anInt10190 = this.anInt10195;
		this.anInt10182 = this.anInt10196;
		this.anInt10194 = this.anInt10197;
		@Pc(18) Class183 local18 = this.aClass183_61;
		this.aClass183_61 = this.aClass183_62;
		this.aClass183_62 = local18;
		this.aClass183_62.method4790();
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(Z)V")
	@Override
	public void method8253() {
		this.method8263();
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	private void method8257(@OriginalArg(0) Component arg0) {
		this.method8263();
		this.aComponent5 = arg0;
		this.aComponent5.addMouseListener(this);
		this.aComponent5.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!wda", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method8256(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!wda", name = "e", descriptor = "(I)Z")
	@Override
	protected boolean method8252() {
		return (this.anInt10182 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!wda", name = "c", descriptor = "(I)I")
	@Override
	public int method8249() {
		return this.anInt10190;
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)I")
	private int method8259(@OriginalArg(1) MouseEvent arg0) {
		@Pc(6) int local6 = arg0.getModifiers();
		@Pc(14) boolean local14 = (local6 & 0x10) != 0;
		@Pc(25) boolean local25 = (local6 & 0x8) != 0;
		@Pc(36) boolean local36 = (local6 & 0x4) != 0;
		if (local25 && (local14 || local36)) {
			local25 = false;
		}
		if (local14 && local36) {
			return 4;
		} else if (local14) {
			return 1;
		} else if (local25) {
			return 2;
		} else if (local36) {
			return 4;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(IZII)V")
	private void method8261(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class3_Sub21_Sub2 local7 = new Class3_Sub21_Sub2();
		local7.anInt4658 = arg1;
		local7.anInt4653 = arg0;
		local7.anInt4656 = arg2;
		local7.aLong136 = Static376.method6088();
		this.aClass183_62.method4792(local7);
	}

	@OriginalMember(owner = "client!wda", name = "e", descriptor = "(B)V")
	private void method8263() {
		if (this.aComponent5 == null) {
			return;
		}
		this.aComponent5.removeMouseMotionListener(this);
		this.aComponent5.removeMouseListener(this);
		this.aClass183_62 = null;
		this.aComponent5 = null;
		this.anInt10190 = this.anInt10194 = this.anInt10182 = 0;
		this.aClass183_61 = null;
		this.anInt10195 = this.anInt10197 = this.anInt10196 = 0;
	}

	@OriginalMember(owner = "client!wda", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method8259(arg0);
		if (local10 == 1) {
			this.method8261(0, arg0.getY(), arg0.getX());
		} else if (local10 == 4) {
			this.method8261(2, arg0.getY(), arg0.getX());
		} else if (local10 == 2) {
			this.method8261(1, arg0.getY(), arg0.getX());
		}
		this.anInt10196 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!wda", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}
}
