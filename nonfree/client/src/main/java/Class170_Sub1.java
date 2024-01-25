import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uv")
public final class Class170_Sub1 extends Class170 implements MouseWheelListener {

	@OriginalMember(owner = "client!uv", name = "j", descriptor = "I")
	private int anInt7240 = 0;

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(B)I")
	@Override
	public synchronized int method5634() {
		@Pc(2) int local2 = this.anInt7240;
		this.anInt7240 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(BLjava/awt/Component;)V")
	@Override
	public void method5632(@OriginalArg(1) Component arg0) {
		arg0.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	@Override
	public void method5631(@OriginalArg(0) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!uv", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt7240 += arg0.getWheelRotation();
	}
}
