import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vo")
public final class Class93_Sub1 extends Class93 implements MouseWheelListener {

	@OriginalMember(owner = "client!vo", name = "h", descriptor = "I")
	private int anInt6527 = 0;

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	@Override
	public void method5588(@OriginalArg(0) Component arg0) {
		arg0.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!vo", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt6527 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(ILjava/awt/Component;)V")
	@Override
	public void method5590(@OriginalArg(1) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(Z)I")
	@Override
	public synchronized int method5587() {
		@Pc(10) int local10 = this.anInt6527;
		this.anInt6527 = 0;
		return local10;
	}
}
