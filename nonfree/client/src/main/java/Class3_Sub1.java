import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public final class Class3_Sub1 extends Class3 implements MouseWheelListener {

	@OriginalMember(owner = "client!ac", name = "s", descriptor = "I")
	private int anInt109 = 0;

	@OriginalMember(owner = "client!ac", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt109 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(BLjava/awt/Component;)V")
	@Override
	public void method71(@OriginalArg(1) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(B)I")
	@Override
	public synchronized int method67() {
		@Pc(8) int local8 = this.anInt109;
		this.anInt109 = 0;
		return local8;
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(BLjava/awt/Component;)V")
	@Override
	public void method75(@OriginalArg(1) Component arg0) {
		arg0.addMouseWheelListener(this);
	}
}
