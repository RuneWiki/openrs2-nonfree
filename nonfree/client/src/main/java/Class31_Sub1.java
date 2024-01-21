import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class Class31_Sub1 extends Class31 implements MouseWheelListener {

	@OriginalMember(owner = "client!ic", name = "o", descriptor = "I")
	private int anInt1380 = 0;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
	@Override
	public void method945(@OriginalArg(0) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!ic", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt1380 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILjava/awt/Component;)V")
	@Override
	public void method949(@OriginalArg(1) Component arg0) {
		arg0.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)I")
	@Override
	public synchronized int method947() {
		@Pc(2) int local2 = this.anInt1380;
		this.anInt1380 = 0;
		return local2;
	}
}
