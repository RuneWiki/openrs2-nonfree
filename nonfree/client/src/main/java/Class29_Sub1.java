import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!im")
public final class Class29_Sub1 extends Class29 implements MouseWheelListener {

	@OriginalMember(owner = "client!im", name = "k", descriptor = "I")
	private int anInt2958 = 0;

	@OriginalMember(owner = "client!im", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt2958 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	@Override
	public void method2778(@OriginalArg(0) Component arg0) {
		arg0.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!im", name = "b", descriptor = "(I)I")
	@Override
	public synchronized int method2781() {
		@Pc(7) int local7 = this.anInt2958;
		this.anInt2958 = 0;
		return local7;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(ILjava/awt/Component;)V")
	@Override
	public void method2775(@OriginalArg(1) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}
}
