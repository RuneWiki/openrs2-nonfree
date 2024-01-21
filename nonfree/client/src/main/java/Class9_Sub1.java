import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class9_Sub1 extends Class9 implements MouseWheelListener {

	@OriginalMember(owner = "client!bd", name = "j", descriptor = "I")
	private int anInt294 = 0;

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILjava/awt/Component;)V")
	@Override
	public void method194(@OriginalArg(1) Component arg0) {
		arg0.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!bd", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt294 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ZLjava/awt/Component;)V")
	@Override
	public void method196(@OriginalArg(1) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)I")
	@Override
	public synchronized int method195() {
		@Pc(10) int local10 = this.anInt294;
		this.anInt294 = 0;
		return local10;
	}
}
