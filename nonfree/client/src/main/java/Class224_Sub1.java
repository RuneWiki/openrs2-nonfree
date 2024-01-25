import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class Class224_Sub1 extends Class224 implements MouseWheelListener {

	@OriginalMember(owner = "client!te", name = "e", descriptor = "I")
	private int anInt6803 = 0;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Z)I")
	@Override
	public synchronized int method5332() {
		@Pc(8) int local8 = this.anInt6803;
		this.anInt6803 = 0;
		return local8;
	}

	@OriginalMember(owner = "client!te", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt6803 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(ZLjava/awt/Component;)V")
	@Override
	public void method5334(@OriginalArg(1) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(BLjava/awt/Component;)V")
	@Override
	public void method5336(@OriginalArg(1) Component arg0) {
		arg0.addMouseWheelListener(this);
	}
}
