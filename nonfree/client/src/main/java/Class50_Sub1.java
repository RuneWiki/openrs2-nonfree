import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!n")
public final class Class50_Sub1 extends Class50 implements MouseWheelListener {

	@OriginalMember(owner = "client!n", name = "v", descriptor = "I")
	private int anInt1931 = 0;

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(BLjava/awt/Component;)V")
	@Override
	public void method1232(@OriginalArg(1) Component arg0) {
		arg0.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(ILjava/awt/Component;)V")
	@Override
	public void method1237(@OriginalArg(1) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!n", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt1931 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(I)I")
	@Override
	public synchronized int method1234() {
		@Pc(10) int local10 = this.anInt1931;
		this.anInt1931 = 0;
		return local10;
	}
}
