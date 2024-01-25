import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public final class Class79_Sub1 extends Class79 implements MouseWheelListener {

	@OriginalMember(owner = "client!pb", name = "g", descriptor = "I")
	private int anInt4823 = 0;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILjava/awt/Component;)V")
	@Override
	public void method4264(@OriginalArg(1) Component arg0) {
		arg0.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!pb", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt4823 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)I")
	@Override
	public synchronized int method4266() {
		@Pc(2) int local2 = this.anInt4823;
		this.anInt4823 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	@Override
	public void method4267(@OriginalArg(0) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}
}
