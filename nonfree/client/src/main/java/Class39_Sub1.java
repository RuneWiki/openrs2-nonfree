import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ll")
public final class Class39_Sub1 extends Class39 implements MouseWheelListener {

	@OriginalMember(owner = "client!ll", name = "e", descriptor = "I")
	private int anInt4343 = 0;

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	@Override
	public void method3514(@OriginalArg(0) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(ILjava/awt/Component;)V")
	@Override
	public void method3512(@OriginalArg(1) Component arg0) {
		arg0.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)I")
	@Override
	public synchronized int method3516() {
		@Pc(2) int local2 = this.anInt4343;
		this.anInt4343 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!ll", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt4343 += arg0.getWheelRotation();
	}
}
