import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public final class Class54_Sub1 extends Class54 implements MouseWheelListener {

	@OriginalMember(owner = "client!o", name = "v", descriptor = "I")
	private int anInt2024 = 0;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(BLjava/awt/Component;)V")
	@Override
	public void method1424(@OriginalArg(1) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!o", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt2024 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(B)I")
	@Override
	public synchronized int method1429() {
		@Pc(8) int local8 = this.anInt2024;
		this.anInt2024 = 0;
		return local8;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	@Override
	public void method1428(@OriginalArg(0) Component arg0) {
		arg0.addMouseWheelListener(this);
	}
}
