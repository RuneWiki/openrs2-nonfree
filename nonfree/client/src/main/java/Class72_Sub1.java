import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ga")
public final class Class72_Sub1 extends Class72 implements MouseWheelListener {

	@OriginalMember(owner = "client!ga", name = "g", descriptor = "I")
	private int anInt2219 = 0;

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILjava/awt/Component;)V")
	@Override
	public void method2198(@OriginalArg(1) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Z)I")
	@Override
	public synchronized int method2197() {
		@Pc(2) int local2 = this.anInt2219;
		this.anInt2219 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!ga", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt2219 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
	@Override
	public void method2201(@OriginalArg(0) Component arg0) {
		arg0.addMouseWheelListener(this);
	}
}
