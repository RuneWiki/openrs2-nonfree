import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public final class Class38_Sub1 extends Class38 implements MouseWheelListener {

	@OriginalMember(owner = "client!s", name = "s", descriptor = "I")
	private int anInt2388 = 0;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ILjava/awt/Component;)V")
	@Override
	public void method1563(@OriginalArg(1) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!s", name = "c", descriptor = "(I)I")
	@Override
	public synchronized int method1569() {
		@Pc(2) int local2 = this.anInt2388;
		this.anInt2388 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!s", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt2388 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	@Override
	public void method1568(@OriginalArg(0) Component arg0) {
		arg0.addMouseWheelListener(this);
	}
}
