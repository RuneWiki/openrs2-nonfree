import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uf")
public final class Class50_Sub1 extends Class50 implements MouseWheelListener {

	@OriginalMember(owner = "client!uf", name = "k", descriptor = "I")
	private int anInt3882 = 0;

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILjava/awt/Component;)V")
	@Override
	public void method2629(@OriginalArg(1) Component arg0) {
		arg0.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(B)I")
	@Override
	public synchronized int method2631() {
		@Pc(2) int local2 = this.anInt3882;
		this.anInt3882 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!uf", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt3882 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	@Override
	public void method2634(@OriginalArg(0) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}
}
