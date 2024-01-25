import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public final class Class74_Sub1 extends Class74 implements MouseWheelListener {

	@OriginalMember(owner = "client!f", name = "f", descriptor = "I")
	private int anInt1821 = 0;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(B)I")
	@Override
	public synchronized int method1682() {
		@Pc(10) int local10 = this.anInt1821;
		this.anInt1821 = 0;
		return local10;
	}

	@OriginalMember(owner = "client!f", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt1821 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ILjava/awt/Component;)V")
	@Override
	public void method1683(@OriginalArg(1) Component arg0) {
		arg0.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	@Override
	public void method1685(@OriginalArg(0) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}
}
