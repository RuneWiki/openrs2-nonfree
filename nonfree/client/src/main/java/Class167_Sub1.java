import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vr")
public final class Class167_Sub1 extends Class167 implements MouseWheelListener {

	@OriginalMember(owner = "client!vr", name = "h", descriptor = "I")
	private int anInt6288 = 0;

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(BLjava/awt/Component;)V")
	@Override
	public void method5461(@OriginalArg(1) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "(BLjava/awt/Component;)V")
	@Override
	public void method5462(@OriginalArg(1) Component arg0) {
		arg0.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(B)I")
	@Override
	public synchronized int method5464() {
		@Pc(7) int local7 = this.anInt6288;
		this.anInt6288 = 0;
		return local7;
	}

	@OriginalMember(owner = "client!vr", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt6288 += arg0.getWheelRotation();
	}
}
