import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class103_Sub1 extends Class103 implements MouseWheelListener {

	@OriginalMember(owner = "client!he", name = "i", descriptor = "I")
	private int anInt2524 = 0;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(BLjava/awt/Component;)V")
	@Override
	public void method2127(@OriginalArg(1) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ZLjava/awt/Component;)V")
	@Override
	public void method2125(@OriginalArg(1) Component arg0) {
		arg0.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(I)I")
	@Override
	public synchronized int method2126() {
		@Pc(9) int local9 = this.anInt2524;
		this.anInt2524 = 0;
		return local9;
	}

	@OriginalMember(owner = "client!he", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt2524 += arg0.getWheelRotation();
	}
}
