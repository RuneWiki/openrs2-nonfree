import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class Class41_Sub1 extends Class41 implements MouseWheelListener {

	@OriginalMember(owner = "client!i", name = "m", descriptor = "I")
	private int anInt2237 = 0;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I)I")
	@Override
	public synchronized int method1728() {
		@Pc(2) int local2 = this.anInt2237;
		this.anInt2237 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	@Override
	public void method1729(@OriginalArg(0) Component arg0) {
		arg0.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(ILjava/awt/Component;)V")
	@Override
	public void method1730(@OriginalArg(1) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!i", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt2237 += arg0.getWheelRotation();
	}
}
