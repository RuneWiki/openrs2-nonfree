import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hi")
public final class Class69_Sub1 extends Class69 implements MouseWheelListener {

	@OriginalMember(owner = "client!hi", name = "i", descriptor = "I")
	private int anInt2298 = 0;

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILjava/awt/Component;)V")
	@Override
	public void method1697(@OriginalArg(1) Component arg0) {
		arg0.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!hi", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt2298 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)I")
	@Override
	public synchronized int method1694() {
		@Pc(2) int local2 = this.anInt2298;
		this.anInt2298 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
	@Override
	public void method1699(@OriginalArg(0) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}
}
