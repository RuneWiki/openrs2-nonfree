import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hr")
public final class Class72_Sub1 extends Class72 implements MouseWheelListener {

	@OriginalMember(owner = "client!hr", name = "g", descriptor = "I")
	private int anInt3460 = 0;

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(BLjava/awt/Component;)V")
	@Override
	public void method2815(@OriginalArg(1) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(I)I")
	@Override
	public synchronized int method2813() {
		@Pc(9) int local9 = this.anInt3460;
		this.anInt3460 = 0;
		return local9;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
	@Override
	public void method2812(@OriginalArg(0) Component arg0) {
		arg0.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!hr", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt3460 += arg0.getWheelRotation();
	}
}
