import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wn")
public final class Class234_Sub1 extends Class234 implements MouseWheelListener {

	@OriginalMember(owner = "client!wn", name = "e", descriptor = "I")
	private int anInt7595 = 0;

	@OriginalMember(owner = "client!wn", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt7595 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(ILjava/awt/Component;)V")
	@Override
	public void method5931(@OriginalArg(1) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(B)I")
	@Override
	public synchronized int method5929() {
		@Pc(10) int local10 = this.anInt7595;
		this.anInt7595 = 0;
		return local10;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	@Override
	public void method5930(@OriginalArg(0) Component arg0) {
		arg0.addMouseWheelListener(this);
	}
}
