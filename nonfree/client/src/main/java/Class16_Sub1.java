import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class Class16_Sub1 extends Class16 implements MouseWheelListener {

	@OriginalMember(owner = "client!ne", name = "m", descriptor = "I")
	private int anInt2837 = 0;

	@OriginalMember(owner = "client!ne", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt2837 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZLjava/awt/Component;)V")
	@Override
	public void method1956(@OriginalArg(1) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Z)I")
	@Override
	public synchronized int method1961() {
		@Pc(10) int local10 = this.anInt2837;
		this.anInt2837 = 0;
		return local10;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	@Override
	public void method1960(@OriginalArg(0) Component arg0) {
		arg0.addMouseWheelListener(this);
	}
}
