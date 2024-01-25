import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wa")
public final class Class25_Sub1 extends Class25 implements MouseWheelListener {

	@OriginalMember(owner = "client!wa", name = "h", descriptor = "I")
	private int anInt7091 = 0;

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(Ljava/awt/Component;I)V")
	@Override
	public void method5800(@OriginalArg(0) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(B)I")
	@Override
	public synchronized int method5799() {
		@Pc(7) int local7 = this.anInt7091;
		this.anInt7091 = 0;
		return local7;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	@Override
	public void method5794(@OriginalArg(0) Component arg0) {
		arg0.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!wa", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt7091 += arg0.getWheelRotation();
	}
}
