import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fv")
public final class Class84_Sub1 extends Class84 implements MouseWheelListener {

	@OriginalMember(owner = "client!fv", name = "g", descriptor = "I")
	private int anInt2549 = 0;

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	@Override
	public void method2113(@OriginalArg(0) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(BLjava/awt/Component;)V")
	@Override
	public void method2110(@OriginalArg(1) Component arg0) {
		arg0.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!fv", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt2549 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!fv", name = "b", descriptor = "(I)I")
	@Override
	public synchronized int method2115() {
		@Pc(2) int local2 = this.anInt2549;
		this.anInt2549 = 0;
		return local2;
	}
}
