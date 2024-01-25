import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dq")
public final class Class45_Sub1 extends Class45 implements MouseWheelListener {

	@OriginalMember(owner = "client!dq", name = "k", descriptor = "I")
	private int anInt1468 = 0;

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(BLjava/awt/Component;)V")
	@Override
	public void method1288(@OriginalArg(1) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!dq", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt1468 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(ILjava/awt/Component;)V")
	@Override
	public void method1294(@OriginalArg(1) Component arg0) {
		arg0.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(B)I")
	@Override
	public synchronized int method1292() {
		@Pc(8) int local8 = this.anInt1468;
		this.anInt1468 = 0;
		return local8;
	}
}
