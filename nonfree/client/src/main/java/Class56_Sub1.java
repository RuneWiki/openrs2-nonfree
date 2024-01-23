import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public final class Class56_Sub1 extends Class56 implements MouseWheelListener {

	@OriginalMember(owner = "client!ge", name = "j", descriptor = "I")
	private int anInt1743 = 0;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILjava/awt/Component;)V")
	@Override
	public void method1642(@OriginalArg(1) Component arg0) {
		arg0.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!ge", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt1743 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	@Override
	public void method1644(@OriginalArg(0) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)I")
	@Override
	public synchronized int method1640() {
		@Pc(9) int local9 = this.anInt1743;
		this.anInt1743 = 0;
		return local9;
	}
}
