import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rf")
public final class Class25_Sub1 extends Class25 implements MouseWheelListener {

	@OriginalMember(owner = "client!rf", name = "n", descriptor = "I")
	private int anInt3678 = 0;

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	@Override
	public void method2787(@OriginalArg(0) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)I")
	@Override
	public synchronized int method2788() {
		@Pc(2) int local2 = this.anInt3678;
		this.anInt3678 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!rf", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt3678 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(ILjava/awt/Component;)V")
	@Override
	public void method2785(@OriginalArg(1) Component arg0) {
		arg0.addMouseWheelListener(this);
	}
}
