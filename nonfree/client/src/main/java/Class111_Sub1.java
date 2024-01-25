import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class111_Sub1 extends Class111 implements MouseWheelListener {

	@OriginalMember(owner = "client!nd", name = "d", descriptor = "I")
	private int anInt4484 = 0;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILjava/awt/Component;)V")
	@Override
	public void method3571(@OriginalArg(1) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(BLjava/awt/Component;)V")
	@Override
	public void method3574(@OriginalArg(1) Component arg0) {
		arg0.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!nd", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt4484 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)I")
	@Override
	public synchronized int method3572() {
		@Pc(2) int local2 = this.anInt4484;
		this.anInt4484 = 0;
		return local2;
	}
}
