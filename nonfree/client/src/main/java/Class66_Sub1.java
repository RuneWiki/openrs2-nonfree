import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!w")
public final class Class66_Sub1 extends Class66 implements MouseWheelListener {

	@OriginalMember(owner = "client!w", name = "j", descriptor = "I")
	private int anInt2840 = 0;

	@OriginalMember(owner = "client!w", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt2840 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(ILjava/awt/Component;)V")
	@Override
	public void method1901(@OriginalArg(1) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(B)I")
	@Override
	public synchronized int method1900() {
		@Pc(2) int local2 = this.anInt2840;
		this.anInt2840 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	@Override
	public void method1903(@OriginalArg(0) Component arg0) {
		arg0.addMouseWheelListener(this);
	}
}
