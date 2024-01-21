import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!w")
public final class Class52_Sub1 extends Class52 implements MouseWheelListener {

	@OriginalMember(owner = "client!w", name = "m", descriptor = "I")
	private int anInt3693 = 0;

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(B)I")
	@Override
	public synchronized int method2626() {
		@Pc(2) int local2 = this.anInt3693;
		this.anInt3693 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!w", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt3693 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(ZLjava/awt/Component;)V")
	@Override
	public void method2624(@OriginalArg(1) Component arg0) {
		arg0.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(ILjava/awt/Component;)V")
	@Override
	public void method2628(@OriginalArg(1) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}
}
