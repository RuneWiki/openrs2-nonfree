import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fo")
public final class Class78_Sub1 extends Class78 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!fo", name = "f", descriptor = "I")
	private int anInt1976;

	@OriginalMember(owner = "client!fo", name = "y", descriptor = "I")
	private int anInt1995;

	@OriginalMember(owner = "client!fo", name = "B", descriptor = "I")
	private int anInt1997;

	@OriginalMember(owner = "client!fo", name = "F", descriptor = "I")
	private int anInt2000;

	@OriginalMember(owner = "client!fo", name = "G", descriptor = "I")
	private int anInt2001;

	@OriginalMember(owner = "client!fo", name = "I", descriptor = "I")
	private int anInt2002;

	@OriginalMember(owner = "client!fo", name = "J", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!fo", name = "E", descriptor = "Lclient!sm;")
	private Class210 aClass210_17 = new Class210();

	@OriginalMember(owner = "client!fo", name = "H", descriptor = "Lclient!sm;")
	private Class210 aClass210_18 = new Class210();

	@OriginalMember(owner = "client!fo", name = "K", descriptor = "Z")
	private final boolean aBoolean152;

	static {
		new Class221("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.", "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.");
	}

	@OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class78_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method1823(arg0);
		this.aBoolean152 = arg1;
	}

	@OriginalMember(owner = "client!fo", name = "c", descriptor = "(B)Z")
	@Override
	protected boolean method1811() {
		return (this.anInt1997 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(I)I")
	@Override
	public int method1804() {
		return this.anInt1976;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)V")
	private void method1817(@OriginalArg(0) MouseEvent arg0) {
		this.anInt2000 = arg0.getX();
		this.anInt2002 = arg0.getY();
		if (this.aBoolean152) {
			this.method1822(arg0.getY(), -1, arg0.getX());
		}
	}

	@OriginalMember(owner = "client!fo", name = "g", descriptor = "(I)V")
	private void method1819() {
		if (this.aComponent1 == null) {
			return;
		}
		this.aComponent1.removeMouseListener(this);
		this.aComponent1.removeMouseMotionListener(this);
		this.aClass210_18 = null;
		this.aComponent1 = null;
		this.anInt2000 = this.anInt2002 = this.anInt2001 = 0;
		this.aClass210_17 = null;
		this.anInt1976 = this.anInt1995 = this.anInt1997 = 0;
	}

	@OriginalMember(owner = "client!fo", name = "d", descriptor = "(I)Z")
	@Override
	protected boolean method1809() {
		return (this.anInt1997 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)I")
	private int method1820(@OriginalArg(1) MouseEvent arg0) {
		@Pc(6) int local6 = arg0.getModifiers();
		@Pc(17) boolean local17 = (local6 & 0x10) != 0;
		@Pc(25) boolean local25 = (local6 & 0x8) != 0;
		@Pc(33) boolean local33 = (local6 & 0x4) != 0;
		if (local25 && (local17 || local33)) {
			local25 = false;
		}
		if (local17 && local33) {
			return 4;
		} else if (local17) {
			return 1;
		} else if (local25) {
			return 2;
		} else if (local33) {
			return 4;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "(B)V")
	@Override
	public synchronized void method1807() {
		this.anInt1976 = this.anInt2000;
		this.anInt1995 = this.anInt2002;
		this.anInt1997 = this.anInt2001;
		@Pc(18) Class210 local18 = this.aClass210_17;
		this.aClass210_17 = this.aClass210_18;
		this.aClass210_18 = local18;
		this.aClass210_18.method5043();
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIII)V")
	private void method1822(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub10_Sub1 local7 = new Class2_Sub10_Sub1();
		local7.anInt1207 = arg2;
		local7.anInt1205 = arg1;
		local7.anInt1200 = arg0;
		local7.aLong41 = Static51.method979();
		this.aClass210_18.method5044(local7);
	}

	@OriginalMember(owner = "client!fo", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method1817(arg0);
	}

	@OriginalMember(owner = "client!fo", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method1817(arg0);
	}

	@OriginalMember(owner = "client!fo", name = "d", descriptor = "(B)V")
	@Override
	public void method1814() {
		this.method1819();
	}

	@OriginalMember(owner = "client!fo", name = "c", descriptor = "(I)I")
	@Override
	public int method1808() {
		return this.anInt1995;
	}

	@OriginalMember(owner = "client!fo", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.anInt2000 = -1;
		this.anInt2002 = -1;
	}

	@OriginalMember(owner = "client!fo", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!fo", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method1820(arg0);
		if (local10 == 1) {
			this.method1822(arg0.getY(), 0, arg0.getX());
		} else if (local10 == 4) {
			this.method1822(arg0.getY(), 2, arg0.getX());
		} else if (local10 == 2) {
			this.method1822(arg0.getY(), 1, arg0.getX());
		}
		this.anInt2001 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!fo", name = "e", descriptor = "(I)Lclient!wc;")
	@Override
	public Class2_Sub10 method1812() {
		return (Class2_Sub10) this.aClass210_17.method5039();
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(ILjava/awt/Component;)V")
	private void method1823(@OriginalArg(1) Component arg0) {
		this.method1819();
		this.aComponent1 = arg0;
		this.aComponent1.addMouseListener(this);
		this.aComponent1.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!fo", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method1817(arg0);
	}

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method1806() {
		return (this.anInt1997 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!fo", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method1820(arg0);
		if ((local8 & this.anInt2001) == 0) {
			local8 = this.anInt2001;
		}
		if ((local8 & 0x1) != 0) {
			this.method1822(arg0.getY(), 3, arg0.getX());
		}
		if ((local8 & 0x4) != 0) {
			this.method1822(arg0.getY(), 5, arg0.getX());
		}
		if ((local8 & 0x2) != 0) {
			this.method1822(arg0.getY(), 4, arg0.getX());
		}
		this.anInt2001 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}
}
