import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vd")
public final class Class61_Sub1 extends Class61 implements MouseWheelListener {

	@OriginalMember(owner = "client!vd", name = "r", descriptor = "I")
	private int anInt2720 = 0;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	@Override
	public void method1938(@OriginalArg(0) Component arg0) {
		arg0.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)I")
	@Override
	public synchronized int method1935() {
		@Pc(9) int local9 = this.anInt2720;
		this.anInt2720 = 0;
		return local9;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(BLjava/awt/Component;)V")
	@Override
	public void method1931(@OriginalArg(1) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!vd", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt2720 += arg0.getWheelRotation();
	}
}
