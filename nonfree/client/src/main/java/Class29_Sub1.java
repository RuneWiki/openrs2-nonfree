import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!p")
public final class Class29_Sub1 extends Class29 implements MouseWheelListener {

	@OriginalMember(owner = "client!p", name = "g", descriptor = "I")
	private int anInt2858 = 0;

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
	@Override
	public void method2106(@OriginalArg(0) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(BLjava/awt/Component;)V")
	@Override
	public void method2110(@OriginalArg(1) Component arg0) {
		arg0.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(I)I")
	@Override
	public synchronized int method2109() {
		@Pc(2) int local2 = this.anInt2858;
		this.anInt2858 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!p", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt2858 += arg0.getWheelRotation();
	}
}
