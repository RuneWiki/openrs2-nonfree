import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!p")
public final class Class42_Sub1 extends Class42 implements MouseWheelListener {

	@OriginalMember(owner = "client!p", name = "s", descriptor = "I")
	private int anInt2458 = 0;

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(ILjava/awt/Component;)V")
	@Override
	public void method1639(@OriginalArg(1) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(I)I")
	@Override
	public synchronized int method1636() {
		@Pc(10) int local10 = this.anInt2458;
		this.anInt2458 = 0;
		return local10;
	}

	@OriginalMember(owner = "client!p", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt2458 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(ILjava/awt/Component;)V")
	@Override
	public void method1635(@OriginalArg(1) Component arg0) {
		arg0.addMouseWheelListener(this);
	}
}
