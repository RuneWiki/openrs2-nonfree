import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class Class32_Sub1 extends Class32 implements MouseWheelListener {

	@OriginalMember(owner = "client!ie", name = "t", descriptor = "I")
	private int anInt1616 = 0;

	@OriginalMember(owner = "client!ie", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt1616 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(BLjava/awt/Component;)V")
	@Override
	public void method1069(@OriginalArg(1) Component arg0) {
		arg0.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	@Override
	public void method1070(@OriginalArg(0) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(B)I")
	@Override
	public synchronized int method1071() {
		@Pc(2) int local2 = this.anInt1616;
		this.anInt1616 = 0;
		return local2;
	}
}
