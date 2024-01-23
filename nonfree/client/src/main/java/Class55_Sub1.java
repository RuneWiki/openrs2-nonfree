import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gj")
public final class Class55_Sub1 extends Class55 implements MouseWheelListener {

	@OriginalMember(owner = "client!gj", name = "k", descriptor = "I")
	private int anInt2010 = 0;

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)I")
	@Override
	public synchronized int method1571() {
		@Pc(2) int local2 = this.anInt2010;
		this.anInt2010 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	@Override
	public void method1570(@OriginalArg(0) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!gj", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt2010 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(ILjava/awt/Component;)V")
	@Override
	public void method1572(@OriginalArg(1) Component arg0) {
		arg0.addMouseWheelListener(this);
	}
}
