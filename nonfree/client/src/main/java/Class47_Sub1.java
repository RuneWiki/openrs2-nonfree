import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kj")
public final class Class47_Sub1 extends Class47 implements MouseWheelListener {

	@OriginalMember(owner = "client!kj", name = "f", descriptor = "I")
	private int anInt3616 = 0;

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)I")
	@Override
	public synchronized int method2875() {
		@Pc(8) int local8 = this.anInt3616;
		this.anInt3616 = 0;
		return local8;
	}

	@OriginalMember(owner = "client!kj", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt3616 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "(Ljava/awt/Component;I)V")
	@Override
	public void method2873(@OriginalArg(0) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	@Override
	public void method2872(@OriginalArg(0) Component arg0) {
		arg0.addMouseWheelListener(this);
	}
}
