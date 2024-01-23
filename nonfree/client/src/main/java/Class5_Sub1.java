import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public final class Class5_Sub1 extends Class5 implements MouseWheelListener {

	@OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
	private int anInt4798 = 0;

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(B)I")
	@Override
	public synchronized int method3852() {
		@Pc(2) int local2 = this.anInt4798;
		this.anInt4798 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILjava/awt/Component;)V")
	@Override
	public void method3847(@OriginalArg(1) Component arg0) {
		arg0.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!rc", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt4798 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(ILjava/awt/Component;)V")
	@Override
	public void method3848(@OriginalArg(1) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}
}
