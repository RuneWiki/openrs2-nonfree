import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vg")
public final class Class79_Sub1 extends Class79 implements MouseWheelListener {

	@OriginalMember(owner = "client!vg", name = "n", descriptor = "I")
	private int anInt6414 = 0;

	@OriginalMember(owner = "client!vg", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt6414 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(BLjava/awt/Component;)V")
	@Override
	public void method5423(@OriginalArg(1) Component arg0) {
		arg0.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "(I)I")
	@Override
	public synchronized int method5428() {
		@Pc(8) int local8 = this.anInt6414;
		this.anInt6414 = 0;
		return local8;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(ILjava/awt/Component;)V")
	@Override
	public void method5430(@OriginalArg(1) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}
}
