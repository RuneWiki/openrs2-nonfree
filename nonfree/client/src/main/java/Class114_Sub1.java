import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ls")
public final class Class114_Sub1 extends Class114 implements MouseWheelListener {

	@OriginalMember(owner = "client!ls", name = "g", descriptor = "I")
	private int anInt3668 = 0;

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	@Override
	public void method2988(@OriginalArg(0) Component arg0) {
		arg0.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(I)I")
	@Override
	public synchronized int method2984() {
		@Pc(8) int local8 = this.anInt3668;
		this.anInt3668 = 0;
		return local8;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(ILjava/awt/Component;)V")
	@Override
	public void method2986(@OriginalArg(1) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!ls", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt3668 += arg0.getWheelRotation();
	}
}
