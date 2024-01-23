import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eo")
public final class Class47_Sub1 extends Class47 implements MouseWheelListener {

	@OriginalMember(owner = "client!eo", name = "l", descriptor = "I")
	private int anInt1449 = 0;

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(B)I")
	@Override
	public synchronized int method1211() {
		@Pc(2) int local2 = this.anInt1449;
		this.anInt1449 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!eo", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt1449 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	@Override
	public void method1208(@OriginalArg(0) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "(Ljava/awt/Component;B)V")
	@Override
	public void method1212(@OriginalArg(0) Component arg0) {
		arg0.addMouseWheelListener(this);
	}
}
