import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public final class Class56_Sub1 extends Class56 implements MouseWheelListener {

	@OriginalMember(owner = "client!oc", name = "s", descriptor = "I")
	private int anInt1817 = 0;

	@OriginalMember(owner = "client!oc", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt1817 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z)I")
	@Override
	public synchronized int method1309() {
		@Pc(2) int local2 = this.anInt1817;
		this.anInt1817 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(ILjava/awt/Component;)V")
	@Override
	public void method1310(@OriginalArg(1) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILjava/awt/Component;)V")
	@Override
	public void method1307(@OriginalArg(1) Component arg0) {
		arg0.addMouseWheelListener(this);
	}
}
