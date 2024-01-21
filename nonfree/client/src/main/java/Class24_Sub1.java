import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eh")
public final class Class24_Sub1 extends Class24 implements MouseWheelListener {

	@OriginalMember(owner = "client!eh", name = "p", descriptor = "I")
	private int anInt1029 = 0;

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	@Override
	public void method692(@OriginalArg(0) Component arg0) {
		arg0.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(Ljava/awt/Component;I)V")
	@Override
	public void method694(@OriginalArg(0) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Z)I")
	@Override
	public synchronized int method699() {
		@Pc(2) int local2 = this.anInt1029;
		this.anInt1029 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!eh", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt1029 += arg0.getWheelRotation();
	}
}
