import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bj")
public final class Class24_Sub1 extends Class24 implements MouseWheelListener {

	@OriginalMember(owner = "client!bj", name = "i", descriptor = "I")
	private int anInt488 = 0;

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	@Override
	public void method439(@OriginalArg(0) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	@Override
	public void method444(@OriginalArg(0) Component arg0) {
		arg0.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!bj", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt488 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)I")
	@Override
	public synchronized int method442() {
		@Pc(2) int local2 = this.anInt488;
		this.anInt488 = 0;
		return local2;
	}
}
