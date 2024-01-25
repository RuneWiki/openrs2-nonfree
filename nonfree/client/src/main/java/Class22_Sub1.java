import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kk")
public final class Class22_Sub1 extends Class22 implements MouseWheelListener {

	@OriginalMember(owner = "client!kk", name = "l", descriptor = "I")
	private int anInt3839 = 0;

	@OriginalMember(owner = "client!kk", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt3839 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)I")
	@Override
	public synchronized int method3359() {
		@Pc(2) int local2 = this.anInt3839;
		this.anInt3839 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(ILjava/awt/Component;)V")
	@Override
	public void method3360(@OriginalArg(1) Component arg0) {
		arg0.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(BLjava/awt/Component;)V")
	@Override
	public void method3362(@OriginalArg(1) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}
}
