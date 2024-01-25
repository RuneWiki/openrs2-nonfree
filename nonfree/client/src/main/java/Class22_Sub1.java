import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public final class Class22_Sub1 extends Class22 implements MouseWheelListener {

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
	private int anInt607 = 0;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(BLjava/awt/Component;)V")
	@Override
	public void method507(@OriginalArg(1) Component arg0) {
		arg0.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)I")
	@Override
	public synchronized int method509() {
		@Pc(2) int local2 = this.anInt607;
		this.anInt607 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!bc", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt607 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	@Override
	public void method506(@OriginalArg(0) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}
}
