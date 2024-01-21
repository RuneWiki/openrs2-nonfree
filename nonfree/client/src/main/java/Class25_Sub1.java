import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public final class Class25_Sub1 extends Class25 implements MouseWheelListener {

	@OriginalMember(owner = "client!eb", name = "h", descriptor = "I")
	private int anInt963 = 0;

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)I")
	@Override
	public synchronized int method792() {
		@Pc(2) int local2 = this.anInt963;
		this.anInt963 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	@Override
	public void method794(@OriginalArg(0) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILjava/awt/Component;)V")
	@Override
	public void method796(@OriginalArg(1) Component arg0) {
		arg0.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!eb", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt963 += arg0.getWheelRotation();
	}
}
