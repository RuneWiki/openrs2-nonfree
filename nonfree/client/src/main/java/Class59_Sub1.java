import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public final class Class59_Sub1 extends Class59 implements MouseWheelListener {

	@OriginalMember(owner = "client!q", name = "v", descriptor = "I")
	private int anInt2283 = 0;

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(ILjava/awt/Component;)V")
	@Override
	public void method1405(@OriginalArg(1) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(B)I")
	@Override
	public synchronized int method1401() {
		@Pc(2) int local2 = this.anInt2283;
		this.anInt2283 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!q", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt2283 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	@Override
	public void method1410(@OriginalArg(0) Component arg0) {
		arg0.addMouseWheelListener(this);
	}
}
