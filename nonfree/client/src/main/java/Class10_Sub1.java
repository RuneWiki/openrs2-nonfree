import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class10_Sub1 extends Class10 implements MouseWheelListener {

	@OriginalMember(owner = "client!bd", name = "j", descriptor = "I")
	private int anInt323 = 0;

	@OriginalMember(owner = "client!bd", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt323 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	@Override
	public void method210(@OriginalArg(0) Component arg0) {
		arg0.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Z)I")
	@Override
	public synchronized int method212() {
		@Pc(6) int local6 = this.anInt323;
		this.anInt323 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
	@Override
	public void method211(@OriginalArg(0) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}
}
