import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public final class Class59_Sub1 extends Class59 implements MouseWheelListener {

	@OriginalMember(owner = "client!ed", name = "n", descriptor = "I")
	private int anInt1279 = 0;

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)I")
	@Override
	public synchronized int method1025() {
		@Pc(2) int local2 = this.anInt1279;
		this.anInt1279 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	@Override
	public void method1022(@OriginalArg(0) Component arg0) {
		arg0.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILjava/awt/Component;)V")
	@Override
	public void method1030(@OriginalArg(1) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!ed", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt1279 += arg0.getWheelRotation();
	}
}
