import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public final class Class24_Sub1 extends Class24 implements MouseWheelListener {

	@OriginalMember(owner = "client!eb", name = "k", descriptor = "I")
	private int anInt975 = 0;

	@OriginalMember(owner = "client!eb", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt975 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)I")
	@Override
	public synchronized int method731() {
		@Pc(9) int local9 = this.anInt975;
		this.anInt975 = 0;
		return local9;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	@Override
	public void method733(@OriginalArg(0) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZLjava/awt/Component;)V")
	@Override
	public void method736(@OriginalArg(1) Component arg0) {
		arg0.addMouseWheelListener(this);
	}
}
