import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public final class Class58_Sub1 extends Class58 implements MouseWheelListener {

	@OriginalMember(owner = "client!pb", name = "r", descriptor = "I")
	private int anInt2425 = 0;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
	@Override
	public void method1570(@OriginalArg(0) Component arg0) {
		arg0.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	@Override
	public void method1576(@OriginalArg(0) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!pb", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt2425 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)I")
	@Override
	public synchronized int method1569() {
		@Pc(2) int local2 = this.anInt2425;
		this.anInt2425 = 0;
		return local2;
	}
}
