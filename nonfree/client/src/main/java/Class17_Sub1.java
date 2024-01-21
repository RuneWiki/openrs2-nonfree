import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cg")
public final class Class17_Sub1 extends Class17 implements MouseWheelListener {

	@OriginalMember(owner = "client!cg", name = "h", descriptor = "I")
	private int anInt618 = 0;

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	@Override
	public void method629(@OriginalArg(0) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)I")
	@Override
	public synchronized int method625() {
		@Pc(2) int local2 = this.anInt618;
		this.anInt618 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!cg", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt618 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(BLjava/awt/Component;)V")
	@Override
	public void method630(@OriginalArg(1) Component arg0) {
		arg0.addMouseWheelListener(this);
	}
}
