import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public final class Class19_Sub1 extends Class19 implements MouseWheelListener {

	@OriginalMember(owner = "client!eb", name = "h", descriptor = "I")
	private int anInt1240 = 0;

	@OriginalMember(owner = "client!eb", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt1240 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(BLjava/awt/Component;)V")
	@Override
	public void method1063(@OriginalArg(1) Component arg0) {
		arg0.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
	@Override
	public void method1060(@OriginalArg(0) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)I")
	@Override
	public synchronized int method1066() {
		@Pc(10) int local10 = this.anInt1240;
		this.anInt1240 = 0;
		return local10;
	}
}
