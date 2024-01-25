import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ms")
public final class Class123_Sub1 extends Class123 implements MouseWheelListener {

	@OriginalMember(owner = "client!ms", name = "i", descriptor = "I")
	private int anInt4008 = 0;

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(ILjava/awt/Component;)V")
	@Override
	public void method3698(@OriginalArg(1) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(B)I")
	@Override
	public synchronized int method3697() {
		@Pc(9) int local9 = this.anInt4008;
		this.anInt4008 = 0;
		return local9;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	@Override
	public void method3696(@OriginalArg(0) Component arg0) {
		arg0.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!ms", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt4008 += arg0.getWheelRotation();
	}
}
