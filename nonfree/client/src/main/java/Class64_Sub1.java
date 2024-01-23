import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kg")
public final class Class64_Sub1 extends Class64 implements MouseWheelListener {

	@OriginalMember(owner = "client!kg", name = "j", descriptor = "I")
	private int anInt2424 = 0;

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Z)I")
	@Override
	public synchronized int method1850() {
		@Pc(2) int local2 = this.anInt2424;
		this.anInt2424 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(BLjava/awt/Component;)V")
	@Override
	public void method1851(@OriginalArg(1) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	@Override
	public void method1852(@OriginalArg(0) Component arg0) {
		arg0.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!kg", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt2424 += arg0.getWheelRotation();
	}
}
