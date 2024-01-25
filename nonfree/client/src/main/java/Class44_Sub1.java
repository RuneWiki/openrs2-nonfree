import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mr")
public final class Class44_Sub1 extends Class44 implements MouseWheelListener {

	@OriginalMember(owner = "client!mr", name = "g", descriptor = "I")
	private int anInt4585 = 0;

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "(I)I")
	@Override
	public synchronized int method3471() {
		@Pc(2) int local2 = this.anInt4585;
		this.anInt4585 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
	@Override
	public void method3469(@OriginalArg(0) Component arg0) {
		arg0.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(ILjava/awt/Component;)V")
	@Override
	public void method3472(@OriginalArg(1) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!mr", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt4585 += arg0.getWheelRotation();
	}
}
