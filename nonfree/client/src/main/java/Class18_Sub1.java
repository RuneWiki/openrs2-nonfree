import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class18_Sub1 extends Class18 implements MouseWheelListener {

	@OriginalMember(owner = "client!dd", name = "g", descriptor = "I")
	private int anInt897 = 0;

	@OriginalMember(owner = "client!dd", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt897 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZLjava/awt/Component;)V")
	@Override
	public void method621(@OriginalArg(1) Component arg0) {
		arg0.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)I")
	@Override
	public synchronized int method620() {
		@Pc(7) int local7 = this.anInt897;
		this.anInt897 = 0;
		return local7;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILjava/awt/Component;)V")
	@Override
	public void method623(@OriginalArg(1) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}
}
