import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public final class Class37_Sub1 extends Class37 implements MouseWheelListener {

	@OriginalMember(owner = "client!we", name = "e", descriptor = "I")
	private int anInt6185 = 0;

	@OriginalMember(owner = "client!we", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt6185 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(B)I")
	@Override
	public synchronized int method4788() {
		@Pc(2) int local2 = this.anInt6185;
		this.anInt6185 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	@Override
	public void method4784(@OriginalArg(0) Component arg0) {
		arg0.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
	@Override
	public void method4785(@OriginalArg(0) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}
}
