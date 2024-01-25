import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public final class Class25_Sub1 extends Class25 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!bc", name = "j", descriptor = "I")
	private int anInt435;

	@OriginalMember(owner = "client!bc", name = "p", descriptor = "I")
	private int anInt441;

	@OriginalMember(owner = "client!bc", name = "s", descriptor = "I")
	private int anInt444;

	@OriginalMember(owner = "client!bc", name = "J", descriptor = "I")
	private int anInt460;

	@OriginalMember(owner = "client!bc", name = "K", descriptor = "I")
	private int anInt461;

	@OriginalMember(owner = "client!bc", name = "N", descriptor = "I")
	private int anInt463;

	@OriginalMember(owner = "client!bc", name = "P", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!bc", name = "x", descriptor = "Lclient!wba;")
	private Class353 aClass353_4 = new Class353();

	@OriginalMember(owner = "client!bc", name = "M", descriptor = "Lclient!wba;")
	private Class353 aClass353_5 = new Class353();

	@OriginalMember(owner = "client!bc", name = "O", descriptor = "Z")
	private final boolean aBoolean46;

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class25_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method385(arg0);
		this.aBoolean46 = arg1;
	}

	@OriginalMember(owner = "client!bc", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method382(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method4781() {
		this.anInt441 = this.anInt461;
		this.anInt444 = this.anInt463;
		this.anInt435 = this.anInt460;
		@Pc(18) Class353 local18 = this.aClass353_4;
		this.aClass353_4 = this.aClass353_5;
		this.aClass353_5 = local18;
		this.aClass353_5.method7680();
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIII)V")
	private void method381(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) Class1_Sub16_Sub1 local13 = new Class1_Sub16_Sub1();
		local13.anInt2086 = arg0;
		local13.anInt2089 = arg1;
		local13.anInt2087 = arg2;
		local13.anInt2085 = arg3;
		local13.aLong69 = Static413.method5668();
		this.aClass353_5.method7679(local13);
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Z)Z")
	@Override
	protected boolean method4784() {
		return (this.anInt441 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(III)V")
	private void method382(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt463 = arg1;
		this.anInt460 = arg0;
		if (this.aBoolean46) {
			this.method381(arg1, 0, arg0, -1);
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)Z")
	@Override
	protected boolean method4780() {
		return (this.anInt441 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(Z)V")
	@Override
	public void method4787() {
		this.method387();
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	private void method385(@OriginalArg(0) Component arg0) {
		this.method387();
		this.aComponent1 = arg0;
		this.aComponent1.addMouseListener(this);
		this.aComponent1.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!bc", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method382(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)I")
	private int method386(@OriginalArg(0) MouseEvent arg0) {
		@Pc(6) int local6 = arg0.getModifiers();
		@Pc(20) boolean local20 = (local6 & 0x10) != 0;
		@Pc(31) boolean local31 = (local6 & 0x8) != 0;
		@Pc(39) boolean local39 = (local6 & 0x4) != 0;
		if (local31 && (local20 || local39)) {
			local31 = false;
		}
		if (local20 && local39) {
			return 4;
		} else if (local20) {
			return 1;
		} else if (local31) {
			return 2;
		} else if (local39) {
			return 4;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "(I)I")
	@Override
	public int method4783() {
		return this.anInt444;
	}

	@OriginalMember(owner = "client!bc", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method386(arg0);
		if ((local8 & this.anInt461) == 0) {
			local8 = this.anInt461;
		}
		if ((local8 & 0x1) != 0) {
			this.method381(arg0.getX(), arg0.getClickCount(), arg0.getY(), 3);
		}
		if ((local8 & 0x4) != 0) {
			this.method381(arg0.getX(), arg0.getClickCount(), arg0.getY(), 5);
		}
		if ((local8 & 0x2) != 0) {
			this.method381(arg0.getX(), arg0.getClickCount(), arg0.getY(), 4);
		}
		this.anInt461 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "(B)V")
	private void method387() {
		if (this.aComponent1 == null) {
			return;
		}
		this.aComponent1.removeMouseMotionListener(this);
		this.aComponent1.removeMouseListener(this);
		this.aClass353_5 = null;
		this.aClass353_4 = null;
		this.anInt463 = this.anInt460 = this.anInt461 = 0;
		this.aComponent1 = null;
		this.anInt444 = this.anInt435 = this.anInt441 = 0;
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method4779() {
		return (this.anInt441 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!bc", name = "g", descriptor = "(I)I")
	@Override
	public int method4788() {
		return this.anInt435;
	}

	@OriginalMember(owner = "client!bc", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method382(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!bc", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!bc", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method386(arg0);
		if (local10 == 1) {
			this.method381(arg0.getX(), arg0.getClickCount(), arg0.getY(), 0);
		} else if (local10 == 4) {
			this.method381(arg0.getX(), arg0.getClickCount(), arg0.getY(), 2);
		} else if (local10 == 2) {
			this.method381(arg0.getX(), arg0.getClickCount(), arg0.getY(), 1);
		}
		this.anInt461 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!bc", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method382(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "(I)Lclient!lp;")
	@Override
	public Class1_Sub16 method4782() {
		return (Class1_Sub16) this.aClass353_4.method7688();
	}
}
