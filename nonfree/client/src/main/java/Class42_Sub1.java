import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gg")
public final class Class42_Sub1 extends Class42 implements MouseWheelListener {

	@OriginalMember(owner = "client!gg", name = "g", descriptor = "I")
	private int anInt1345 = 0;

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	@Override
	public void method1038(@OriginalArg(0) Component arg0) {
		arg0.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZLjava/awt/Component;)V")
	@Override
	public void method1036(@OriginalArg(1) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!gg", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt1345 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)I")
	@Override
	public synchronized int method1039() {
		@Pc(9) int local9 = this.anInt1345;
		this.anInt1345 = 0;
		return local9;
	}
}
