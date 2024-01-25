import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class52_Sub1 extends Class52 implements MouseWheelListener {

	@OriginalMember(owner = "client!db", name = "h", descriptor = "I")
	private int anInt1206 = 0;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(I)I")
	@Override
	public synchronized int method1038() {
		@Pc(8) int local8 = this.anInt1206;
		this.anInt1206 = 0;
		return local8;
	}

	@OriginalMember(owner = "client!db", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt1206 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	@Override
	public void method1043(@OriginalArg(0) Component arg0) {
		arg0.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(Ljava/awt/Component;I)V")
	@Override
	public void method1044(@OriginalArg(0) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}
}
