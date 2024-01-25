import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!a")
public final class Class1_Sub1 extends Class1 implements MouseWheelListener {

	@OriginalMember(owner = "client!a", name = "k", descriptor = "I")
	private int anInt13 = 0;

	@OriginalMember(owner = "client!a", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt13 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	@Override
	public void method14(@OriginalArg(0) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)I")
	@Override
	public synchronized int method12() {
		@Pc(6) int local6 = this.anInt13;
		this.anInt13 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(BLjava/awt/Component;)V")
	@Override
	public void method11(@OriginalArg(1) Component arg0) {
		arg0.addMouseWheelListener(this);
	}
}
