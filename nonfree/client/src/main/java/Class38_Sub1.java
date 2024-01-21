import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pa")
public final class Class38_Sub1 extends Class38 implements MouseWheelListener {

	@OriginalMember(owner = "client!pa", name = "p", descriptor = "I")
	private int anInt2088 = 0;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)I")
	@Override
	public synchronized int method1442() {
		@Pc(2) int local2 = this.anInt2088;
		this.anInt2088 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!pa", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt2088 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	@Override
	public void method1441(@OriginalArg(0) Component arg0) {
		arg0.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(Ljava/awt/Component;I)V")
	@Override
	public void method1443(@OriginalArg(0) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}
}
