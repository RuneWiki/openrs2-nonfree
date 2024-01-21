import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public final class Class21_Sub1 extends Class21 implements MouseWheelListener {

	@OriginalMember(owner = "client!ee", name = "r", descriptor = "I")
	private int anInt804 = 0;

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)I")
	@Override
	public synchronized int method568() {
		@Pc(2) int local2 = this.anInt804;
		this.anInt804 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!ee", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt804 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(ILjava/awt/Component;)V")
	@Override
	public void method569(@OriginalArg(1) Component arg0) {
		arg0.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILjava/awt/Component;)V")
	@Override
	public void method566(@OriginalArg(1) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}
}
