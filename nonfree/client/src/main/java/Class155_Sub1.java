import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ur")
public final class Class155_Sub1 extends Class155 implements MouseWheelListener {

	@OriginalMember(owner = "client!ur", name = "f", descriptor = "I")
	private int anInt6316 = 0;

	@OriginalMember(owner = "client!ur", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt6316 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(ZLjava/awt/Component;)V")
	@Override
	public void method5337(@OriginalArg(1) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(BLjava/awt/Component;)V")
	@Override
	public void method5334(@OriginalArg(1) Component arg0) {
		arg0.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(B)I")
	@Override
	public synchronized int method5339() {
		@Pc(2) int local2 = this.anInt6316;
		this.anInt6316 = 0;
		return local2;
	}
}
