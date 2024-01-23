import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class90_Sub1 extends Class90 implements MouseWheelListener {

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "I")
	private int anInt4237 = 0;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILjava/awt/Component;)V")
	@Override
	public void method3358(@OriginalArg(1) Component arg0) {
		arg0.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!qe", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt4237 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)I")
	@Override
	public synchronized int method3355() {
		@Pc(2) int local2 = this.anInt4237;
		this.anInt4237 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(BLjava/awt/Component;)V")
	@Override
	public void method3356(@OriginalArg(1) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}
}
