import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ch")
public final class Class6_Sub1 extends Class6 implements MouseWheelListener {

	@OriginalMember(owner = "client!ch", name = "q", descriptor = "I")
	private int anInt657 = 0;

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)I")
	@Override
	public synchronized int method558() {
		@Pc(2) int local2 = this.anInt657;
		this.anInt657 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILjava/awt/Component;)V")
	@Override
	public void method562(@OriginalArg(1) Component arg0) {
		arg0.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!ch", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt657 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	@Override
	public void method559(@OriginalArg(0) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}
}
