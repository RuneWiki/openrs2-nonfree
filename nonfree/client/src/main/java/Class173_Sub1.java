import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kfa")
public final class Class173_Sub1 extends Class173 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!kfa", name = "i", descriptor = "I")
	private int anInt4978;

	@OriginalMember(owner = "client!kfa", name = "v", descriptor = "I")
	private int anInt4989;

	@OriginalMember(owner = "client!kfa", name = "x", descriptor = "I")
	private int anInt4991;

	@OriginalMember(owner = "client!kfa", name = "I", descriptor = "I")
	private int anInt5001;

	@OriginalMember(owner = "client!kfa", name = "K", descriptor = "I")
	private int anInt5003;

	@OriginalMember(owner = "client!kfa", name = "L", descriptor = "I")
	private int anInt5004;

	@OriginalMember(owner = "client!kfa", name = "N", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!kfa", name = "s", descriptor = "Lclient!ws;")
	private Class361 aClass361_39 = new Class361();

	@OriginalMember(owner = "client!kfa", name = "E", descriptor = "Lclient!ws;")
	private Class361 aClass361_40 = new Class361();

	@OriginalMember(owner = "client!kfa", name = "M", descriptor = "Z")
	private final boolean aBoolean350;

	@OriginalMember(owner = "client!kfa", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class173_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method4331(arg0);
		this.aBoolean350 = arg1;
	}

	@OriginalMember(owner = "client!kfa", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method4333(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!kfa", name = "e", descriptor = "(I)Z")
	@Override
	protected boolean method6495() {
		return (this.anInt4978 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!kfa", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!kfa", name = "b", descriptor = "(I)V")
	@Override
	public void method6490() {
		this.method4335();
	}

	@OriginalMember(owner = "client!kfa", name = "b", descriptor = "(B)Z")
	@Override
	protected boolean method6488() {
		return (this.anInt4978 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!kfa", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method6494() {
		this.anInt4978 = this.anInt5001;
		this.anInt4991 = this.anInt5004;
		this.anInt4989 = this.anInt5003;
		@Pc(26) Class361 local26 = this.aClass361_39;
		this.aClass361_39 = this.aClass361_40;
		this.aClass361_40 = local26;
		this.aClass361_40.method7842();
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)I")
	private int method4329(@OriginalArg(1) MouseEvent arg0) {
		@Pc(6) int local6 = arg0.getModifiers();
		@Pc(14) boolean local14 = (local6 & 0x10) != 0;
		@Pc(31) boolean local31 = (local6 & 0x8) != 0;
		@Pc(39) boolean local39 = (local6 & 0x4) != 0;
		if (local31 && (local14 || local39)) {
			local31 = false;
		}
		if (local14 && local39) {
			return 4;
		} else if (local14) {
			return 1;
		} else if (local31) {
			return 2;
		} else if (local39) {
			return 4;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!kfa", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method4333(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!kfa", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method6496() {
		return (this.anInt4978 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ILjava/awt/Component;)V")
	private void method4331(@OriginalArg(1) Component arg0) {
		this.method4335();
		this.aComponent2 = arg0;
		this.aComponent2.addMouseListener(this);
		this.aComponent2.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!kfa", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method4329(arg0);
		if ((local8 & this.anInt5001) == 0) {
			local8 = this.anInt5001;
		}
		if ((local8 & 0x1) != 0) {
			this.method4334(3, arg0.getY(), arg0.getX());
		}
		if ((local8 & 0x4) != 0) {
			this.method4334(5, arg0.getY(), arg0.getX());
		}
		if ((local8 & 0x2) != 0) {
			this.method4334(4, arg0.getY(), arg0.getX());
		}
		this.anInt5001 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!kfa", name = "c", descriptor = "(B)I")
	@Override
	public int method6489() {
		return this.anInt4989;
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(III)V")
	private void method4333(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt5004 = arg0;
		this.anInt5003 = arg1;
		if (this.aBoolean350) {
			this.method4334(-1, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IIIZ)V")
	private void method4334(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(13) Class6_Sub5_Sub1 local13 = new Class6_Sub5_Sub1();
		local13.anInt760 = arg2;
		local13.anInt758 = arg0;
		local13.anInt761 = arg1;
		local13.aLong19 = Static8.method201();
		this.aClass361_40.method7833(local13);
	}

	@OriginalMember(owner = "client!kfa", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method4329(arg0);
		if (local10 == 1) {
			this.method4334(0, arg0.getY(), arg0.getX());
		} else if (local10 == 4) {
			this.method4334(2, arg0.getY(), arg0.getX());
		} else if (local10 == 2) {
			this.method4334(1, arg0.getY(), arg0.getX());
		}
		this.anInt5001 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!kfa", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method4333(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!kfa", name = "b", descriptor = "(Z)V")
	private void method4335() {
		if (this.aComponent2 == null) {
			return;
		}
		this.aComponent2.removeMouseMotionListener(this);
		this.aComponent2.removeMouseListener(this);
		this.anInt5004 = this.anInt5003 = this.anInt5001 = 0;
		this.aClass361_40 = null;
		this.anInt4991 = this.anInt4989 = this.anInt4978 = 0;
		this.aComponent2 = null;
		this.aClass361_39 = null;
	}

	@OriginalMember(owner = "client!kfa", name = "c", descriptor = "(I)Lclient!wk;")
	@Override
	public Class6_Sub5 method6491() {
		return (Class6_Sub5) this.aClass361_39.method7835();
	}

	@OriginalMember(owner = "client!kfa", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method4333(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(B)I")
	@Override
	public int method6487() {
		return this.anInt4991;
	}
}
