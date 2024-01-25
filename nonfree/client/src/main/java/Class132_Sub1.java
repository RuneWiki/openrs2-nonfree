import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class Class132_Sub1 extends Class132 implements MouseWheelListener {

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
	private int anInt4070 = 0;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	@Override
	public void method3237(@OriginalArg(0) Component arg0) {
		arg0.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!kc", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt4070 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	@Override
	public void method3236(@OriginalArg(0) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)I")
	@Override
	public synchronized int method3239() {
		@Pc(10) int local10 = this.anInt4070;
		this.anInt4070 = 0;
		return local10;
	}
}
