import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qg")
public final class Class44_Sub1 extends Class44 implements MouseWheelListener {

	@OriginalMember(owner = "client!qg", name = "j", descriptor = "I")
	private int anInt2932 = 0;

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(BLjava/awt/Component;)V")
	@Override
	public void method2287(@OriginalArg(1) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!qg", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt2932 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	@Override
	public void method2285(@OriginalArg(0) Component arg0) {
		arg0.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(B)I")
	@Override
	public synchronized int method2286() {
		@Pc(7) int local7 = this.anInt2932;
		this.anInt2932 = 0;
		return local7;
	}
}
