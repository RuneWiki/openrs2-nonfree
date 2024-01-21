import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public final class Class20_Sub1 extends Class20 implements MouseWheelListener {

	@OriginalMember(owner = "client!tc", name = "m", descriptor = "I")
	private int anInt3843 = 0;

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)I")
	@Override
	public synchronized int method2658() {
		@Pc(7) int local7 = this.anInt3843;
		this.anInt3843 = 0;
		return local7;
	}

	@OriginalMember(owner = "client!tc", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt3843 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(BLjava/awt/Component;)V")
	@Override
	public void method2653(@OriginalArg(1) Component arg0) {
		arg0.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILjava/awt/Component;)V")
	@Override
	public void method2656(@OriginalArg(1) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}
}
