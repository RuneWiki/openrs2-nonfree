import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class Class77_Sub1 extends Class77 implements MouseWheelListener {

	@OriginalMember(owner = "client!ic", name = "h", descriptor = "I")
	private int anInt2117 = 0;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(BLjava/awt/Component;)V")
	@Override
	public void method1846(@OriginalArg(1) Component arg0) {
		arg0.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)I")
	@Override
	public synchronized int method1848() {
		@Pc(2) int local2 = this.anInt2117;
		this.anInt2117 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!ic", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt2117 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	@Override
	public void method1849(@OriginalArg(0) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}
}
