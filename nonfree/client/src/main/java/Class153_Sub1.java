import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vj")
public final class Class153_Sub1 extends Class153 implements MouseWheelListener {

	@OriginalMember(owner = "client!vj", name = "k", descriptor = "I")
	private int anInt6332 = 0;

	@OriginalMember(owner = "client!vj", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt6332 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)I")
	@Override
	public synchronized int method5542() {
		@Pc(2) int local2 = this.anInt6332;
		this.anInt6332 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(ILjava/awt/Component;)V")
	@Override
	public void method5540(@OriginalArg(1) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	@Override
	public void method5541(@OriginalArg(0) Component arg0) {
		arg0.addMouseWheelListener(this);
	}
}
