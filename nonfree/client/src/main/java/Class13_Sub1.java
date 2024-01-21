import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ob")
public final class Class13_Sub1 extends Class13 implements MouseWheelListener {

	@OriginalMember(owner = "client!ob", name = "k", descriptor = "I")
	private int anInt2838 = 0;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)I")
	@Override
	public synchronized int method1950() {
		@Pc(2) int local2 = this.anInt2838;
		this.anInt2838 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!ob", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt2838 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(BLjava/awt/Component;)V")
	@Override
	public void method1952(@OriginalArg(1) Component arg0) {
		arg0.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	@Override
	public void method1955(@OriginalArg(0) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}
}
