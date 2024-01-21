import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public final class Class50_Sub1 extends Class50 implements MouseWheelListener {

	@OriginalMember(owner = "client!me", name = "L", descriptor = "I")
	private int anInt1849 = 0;

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ILjava/awt/Component;)V")
	@Override
	public void method1343(@OriginalArg(1) Component arg0) {
		arg0.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!me", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt1849 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Z)I")
	@Override
	public synchronized int method1344() {
		@Pc(10) int local10 = this.anInt1849;
		this.anInt1849 = 0;
		return local10;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(BLjava/awt/Component;)V")
	@Override
	public void method1349(@OriginalArg(1) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}
}
