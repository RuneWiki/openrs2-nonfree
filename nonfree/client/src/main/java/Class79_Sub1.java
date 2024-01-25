import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public final class Class79_Sub1 extends Class79 implements MouseWheelListener {

	@OriginalMember(owner = "client!hb", name = "m", descriptor = "I")
	private int anInt2359 = 0;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Z)I")
	@Override
	public synchronized int method2204() {
		@Pc(9) int local9 = this.anInt2359;
		this.anInt2359 = 0;
		return local9;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILjava/awt/Component;)V")
	@Override
	public void method2206(@OriginalArg(1) Component arg0) {
		arg0.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!hb", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt2359 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	@Override
	public void method2207(@OriginalArg(0) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}
}
