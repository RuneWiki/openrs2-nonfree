import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class41_Sub1 extends Class41 implements MouseWheelListener {

	@OriginalMember(owner = "client!re", name = "j", descriptor = "I")
	private int anInt2485 = 0;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	@Override
	public void method1728(@OriginalArg(0) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(BLjava/awt/Component;)V")
	@Override
	public void method1726(@OriginalArg(1) Component arg0) {
		arg0.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(B)I")
	@Override
	public synchronized int method1725() {
		@Pc(2) int local2 = this.anInt2485;
		this.anInt2485 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!re", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt2485 += arg0.getWheelRotation();
	}
}
