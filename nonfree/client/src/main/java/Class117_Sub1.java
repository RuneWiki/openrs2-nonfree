import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lc")
public final class Class117_Sub1 extends Class117 implements MouseWheelListener {

	@OriginalMember(owner = "client!lc", name = "l", descriptor = "I")
	private int anInt3772 = 0;

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "(I)I")
	@Override
	public synchronized int method3192() {
		@Pc(10) int local10 = this.anInt3772;
		this.anInt3772 = 0;
		return local10;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	@Override
	public void method3191(@OriginalArg(0) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!lc", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt3772 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	@Override
	public void method3193(@OriginalArg(0) Component arg0) {
		arg0.addMouseWheelListener(this);
	}
}
