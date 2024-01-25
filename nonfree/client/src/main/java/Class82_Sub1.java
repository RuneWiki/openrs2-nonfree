import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gf")
public final class Class82_Sub1 extends Class82 implements MouseWheelListener {

	@OriginalMember(owner = "client!gf", name = "l", descriptor = "I")
	private int anInt2413 = 0;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILjava/awt/Component;)V")
	@Override
	public void method2011(@OriginalArg(1) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)I")
	@Override
	public synchronized int method2005() {
		@Pc(7) int local7 = this.anInt2413;
		this.anInt2413 = 0;
		return local7;
	}

	@OriginalMember(owner = "client!gf", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt2413 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	@Override
	public void method2003(@OriginalArg(0) Component arg0) {
		arg0.addMouseWheelListener(this);
	}
}
