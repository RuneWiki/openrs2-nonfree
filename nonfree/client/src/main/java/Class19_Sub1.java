import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oh")
public final class Class19_Sub1 extends Class19 implements MouseWheelListener {

	@OriginalMember(owner = "client!oh", name = "j", descriptor = "I")
	private int anInt3277 = 0;

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(Ljava/awt/Component;I)V")
	@Override
	public void method2338(@OriginalArg(0) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	@Override
	public void method2334(@OriginalArg(0) Component arg0) {
		arg0.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!oh", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt3277 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Z)I")
	@Override
	public synchronized int method2337() {
		@Pc(9) int local9 = this.anInt3277;
		this.anInt3277 = 0;
		return local9;
	}
}
