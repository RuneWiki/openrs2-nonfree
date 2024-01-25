import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ob")
public final class Class118_Sub1 extends Class118 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!ob", name = "i", descriptor = "I")
	private int anInt4395;

	@OriginalMember(owner = "client!ob", name = "w", descriptor = "I")
	private int anInt4407;

	@OriginalMember(owner = "client!ob", name = "I", descriptor = "I")
	private int anInt4418;

	@OriginalMember(owner = "client!ob", name = "M", descriptor = "I")
	private int anInt4421;

	@OriginalMember(owner = "client!ob", name = "O", descriptor = "I")
	private int anInt4422;

	@OriginalMember(owner = "client!ob", name = "P", descriptor = "I")
	private int anInt4423;

	@OriginalMember(owner = "client!ob", name = "R", descriptor = "Ljava/awt/Component;")
	private Component aComponent3;

	@OriginalMember(owner = "client!ob", name = "r", descriptor = "Lclient!jm;")
	private Class103 aClass103_108 = new Class103();

	@OriginalMember(owner = "client!ob", name = "N", descriptor = "Lclient!jm;")
	private Class103 aClass103_109 = new Class103();

	@OriginalMember(owner = "client!ob", name = "Q", descriptor = "Z")
	private final boolean aBoolean358;

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class118_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method4066(arg0);
		this.aBoolean358 = arg1;
	}

	@OriginalMember(owner = "client!ob", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method4062(arg0);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZLjava/awt/event/MouseEvent;)V")
	private void method4062(@OriginalArg(1) MouseEvent arg0) {
		this.anInt4422 = arg0.getX();
		this.anInt4423 = arg0.getY();
		if (this.aBoolean358) {
			this.method4064(-1, arg0.getY(), arg0.getX());
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Z)V")
	@Override
	public void method4049() {
		this.method4065();
	}

	@OriginalMember(owner = "client!ob", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.anInt4422 = -1;
		this.anInt4423 = -1;
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method4051() {
		return (this.anInt4395 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)Z")
	@Override
	protected boolean method4048() {
		return (this.anInt4395 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!ob", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method4062(arg0);
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(Z)I")
	@Override
	public int method4054() {
		return this.anInt4418;
	}

	@OriginalMember(owner = "client!ob", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		this.anInt4421 &= ~arg0.getModifiers();
		@Pc(16) byte local16 = -1;
		if ((arg0.getModifiers() & 0x10) != 0) {
			local16 = 3;
		} else if ((arg0.getModifiers() & 0x8) != 0) {
			local16 = 4;
		} else if ((arg0.getModifiers() & 0x4) != 0) {
			local16 = 5;
		}
		if (local16 != -1) {
			this.method4064(local16, arg0.getY(), arg0.getX());
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)I")
	@Override
	public int method4050() {
		return this.anInt4407;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIBI)V")
	private void method4064(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class5_Sub26_Sub1 local7 = new Class5_Sub26_Sub1();
		local7.anInt5023 = arg1;
		local7.anInt5019 = arg2;
		local7.anInt5024 = arg0;
		local7.aLong171 = Static340.method5863();
		this.aClass103_109.method2745(local7);
	}

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "(B)V")
	private void method4065() {
		if (this.aComponent3 == null) {
			return;
		}
		this.aComponent3.removeMouseListener(this);
		this.aComponent3.removeMouseMotionListener(this);
		this.aClass103_109 = null;
		this.aClass103_108 = null;
		this.aComponent3 = null;
		this.anInt4422 = this.anInt4423 = this.anInt4421 = 0;
		this.anInt4418 = this.anInt4407 = this.anInt4395 = 0;
	}

	@OriginalMember(owner = "client!ob", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		this.anInt4421 |= arg0.getModifiers();
		@Pc(14) byte local14 = -1;
		if ((arg0.getModifiers() & 0x10) != 0) {
			local14 = 0;
		} else if ((arg0.getModifiers() & 0x8) != 0) {
			local14 = 1;
		} else if ((arg0.getModifiers() & 0x4) != 0) {
			local14 = 2;
		}
		if (local14 != -1) {
			this.method4064(local14, arg0.getY(), arg0.getX());
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
	private void method4066(@OriginalArg(0) Component arg0) {
		this.method4065();
		this.aComponent3 = arg0;
		this.aComponent3.addMouseListener(this);
		this.aComponent3.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "(I)Lclient!mp;")
	@Override
	public Class5_Sub26 method4057() {
		return (Class5_Sub26) this.aClass103_108.method2743();
	}

	@OriginalMember(owner = "client!ob", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method4062(arg0);
	}

	@OriginalMember(owner = "client!ob", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "(B)Z")
	@Override
	protected boolean method4059() {
		return (this.anInt4395 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "(I)V")
	@Override
	public synchronized void method4058() {
		this.anInt4418 = this.anInt4422;
		this.anInt4395 = this.anInt4421;
		this.anInt4407 = this.anInt4423;
		@Pc(22) Class103 local22 = this.aClass103_108;
		this.aClass103_108 = this.aClass103_109;
		this.aClass103_109 = local22;
		this.aClass103_109.method2751();
	}
}
