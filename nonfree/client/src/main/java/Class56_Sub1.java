import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public final class Class56_Sub1 extends Class56 implements MouseWheelListener {

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
	private int anInt4610 = 0;

	@OriginalMember(owner = "client!oe", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt4610 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
	@Override
	public void method3754(@OriginalArg(0) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)I")
	@Override
	public synchronized int method3756() {
		@Pc(2) int local2 = this.anInt4610;
		this.anInt4610 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(BLjava/awt/Component;)V")
	@Override
	public void method3755(@OriginalArg(1) Component arg0) {
		arg0.addMouseWheelListener(this);
	}
}
