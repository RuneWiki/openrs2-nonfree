import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mc")
public final class Class43_Sub1 extends Class43 implements MouseWheelListener {

	@OriginalMember(owner = "client!mc", name = "j", descriptor = "I")
	private int anInt2939 = 0;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILjava/awt/Component;)V")
	@Override
	public void method2070(@OriginalArg(1) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)I")
	@Override
	public synchronized int method2072() {
		@Pc(2) int local2 = this.anInt2939;
		this.anInt2939 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!mc", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt2939 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	@Override
	public void method2074(@OriginalArg(0) Component arg0) {
		arg0.addMouseWheelListener(this);
	}
}
