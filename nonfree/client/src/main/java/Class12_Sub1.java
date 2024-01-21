import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public final class Class12_Sub1 extends Class12 implements MouseWheelListener {

	@OriginalMember(owner = "client!cb", name = "t", descriptor = "I")
	private int anInt309 = 0;

	@OriginalMember(owner = "client!cb", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt309 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(BLjava/awt/Component;)V")
	@Override
	public void method267(@OriginalArg(1) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	@Override
	public void method268(@OriginalArg(0) Component arg0) {
		arg0.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)I")
	@Override
	public synchronized int method266() {
		@Pc(8) int local8 = this.anInt309;
		this.anInt309 = 0;
		return local8;
	}
}
