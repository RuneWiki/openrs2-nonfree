import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ha")
public final class Class16_Sub1 extends Class16 implements MouseWheelListener {

	@OriginalMember(owner = "client!ha", name = "p", descriptor = "I")
	private int anInt1160 = 0;

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	@Override
	public void method789(@OriginalArg(0) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!ha", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt1160 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILjava/awt/Component;)V")
	@Override
	public void method788(@OriginalArg(1) Component arg0) {
		arg0.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)I")
	@Override
	public synchronized int method790() {
		@Pc(2) int local2 = this.anInt1160;
		this.anInt1160 = 0;
		return local2;
	}
}
