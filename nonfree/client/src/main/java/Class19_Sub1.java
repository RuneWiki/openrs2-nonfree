import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ji")
public final class Class19_Sub1 extends Class19 implements MouseWheelListener {

	@OriginalMember(owner = "client!ji", name = "r", descriptor = "I")
	private int anInt2304 = 0;

	@OriginalMember(owner = "client!ji", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt2304 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(ILjava/awt/Component;)V")
	@Override
	public void method1634(@OriginalArg(1) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(B)I")
	@Override
	public synchronized int method1633() {
		@Pc(2) int local2 = this.anInt2304;
		this.anInt2304 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(ILjava/awt/Component;)V")
	@Override
	public void method1630(@OriginalArg(1) Component arg0) {
		arg0.addMouseWheelListener(this);
	}
}
