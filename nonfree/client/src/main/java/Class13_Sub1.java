import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bj")
public final class Class13_Sub1 extends Class13 implements MouseWheelListener {

	@OriginalMember(owner = "client!bj", name = "f", descriptor = "I")
	private int anInt566 = 0;

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	@Override
	public void method415(@OriginalArg(0) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)I")
	@Override
	public synchronized int method414() {
		@Pc(2) int local2 = this.anInt566;
		this.anInt566 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!bj", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt566 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(ILjava/awt/Component;)V")
	@Override
	public void method413(@OriginalArg(1) Component arg0) {
		arg0.addMouseWheelListener(this);
	}
}
