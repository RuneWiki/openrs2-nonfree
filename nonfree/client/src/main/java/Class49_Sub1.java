import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kh")
public final class Class49_Sub1 extends Class49 implements MouseWheelListener {

	@OriginalMember(owner = "client!kh", name = "n", descriptor = "I")
	private int anInt2128 = 0;

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	@Override
	public void method1446(@OriginalArg(0) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Z)I")
	@Override
	public synchronized int method1441() {
		@Pc(7) int local7 = this.anInt2128;
		this.anInt2128 = 0;
		return local7;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	@Override
	public void method1445(@OriginalArg(0) Component arg0) {
		arg0.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!kh", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt2128 += arg0.getWheelRotation();
	}
}
