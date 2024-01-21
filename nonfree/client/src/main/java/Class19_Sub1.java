import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!of")
public final class Class19_Sub1 extends Class19 implements MouseWheelListener {

	@OriginalMember(owner = "client!of", name = "t", descriptor = "I")
	private int anInt2009 = 0;

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	@Override
	public void method1360(@OriginalArg(0) Component arg0) {
		arg0.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(I)I")
	@Override
	public synchronized int method1357() {
		@Pc(2) int local2 = this.anInt2009;
		this.anInt2009 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!of", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt2009 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(ZLjava/awt/Component;)V")
	@Override
	public void method1356(@OriginalArg(1) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}
}
