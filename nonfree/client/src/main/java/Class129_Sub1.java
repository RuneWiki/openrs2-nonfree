import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vh")
public final class Class129_Sub1 extends Class129 implements MouseWheelListener {

	@OriginalMember(owner = "client!vh", name = "h", descriptor = "I")
	private int anInt5635 = 0;

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)I")
	@Override
	public synchronized int method4451() {
		@Pc(2) int local2 = this.anInt5635;
		this.anInt5635 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!vh", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt5635 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	@Override
	public void method4453(@OriginalArg(0) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILjava/awt/Component;)V")
	@Override
	public void method4450(@OriginalArg(1) Component arg0) {
		arg0.addMouseWheelListener(this);
	}
}
