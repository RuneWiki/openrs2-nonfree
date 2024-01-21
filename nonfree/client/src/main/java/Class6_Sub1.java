import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class Class6_Sub1 extends Class6 implements MouseWheelListener {

	@OriginalMember(owner = "client!ae", name = "u", descriptor = "I")
	private int anInt83 = 0;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	@Override
	public void method56(@OriginalArg(0) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!ae", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt83 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILjava/awt/Component;)V")
	@Override
	public void method53(@OriginalArg(1) Component arg0) {
		arg0.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(B)I")
	@Override
	public synchronized int method54() {
		@Pc(8) int local8 = this.anInt83;
		this.anInt83 = 0;
		return local8;
	}
}
