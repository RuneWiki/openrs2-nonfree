import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class2_Sub1 extends Class2 implements MouseWheelListener {

	@OriginalMember(owner = "client!nd", name = "p", descriptor = "I")
	private int anInt1867 = 0;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	@Override
	public void method1236(@OriginalArg(0) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!nd", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt1867 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)I")
	@Override
	public synchronized int method1234() {
		@Pc(2) int local2 = this.anInt1867;
		this.anInt1867 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(Ljava/awt/Component;I)V")
	@Override
	public void method1238(@OriginalArg(0) Component arg0) {
		arg0.addMouseWheelListener(this);
	}
}
