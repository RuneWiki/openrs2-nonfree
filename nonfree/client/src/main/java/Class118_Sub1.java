import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public final class Class118_Sub1 extends Class118 implements MouseWheelListener {

	@OriginalMember(owner = "client!q", name = "e", descriptor = "I")
	private int anInt5594 = 0;

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(ILjava/awt/Component;)V")
	@Override
	public void method4489(@OriginalArg(1) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	@Override
	public void method4490(@OriginalArg(0) Component arg0) {
		arg0.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!q", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt5594 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(I)I")
	@Override
	public synchronized int method4488() {
		@Pc(2) int local2 = this.anInt5594;
		this.anInt5594 = 0;
		return local2;
	}
}
