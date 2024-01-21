import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ma")
public final class Class47_Sub1 extends Class47 implements MouseWheelListener {

	@OriginalMember(owner = "client!ma", name = "j", descriptor = "I")
	private int anInt1977 = 0;

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(BLjava/awt/Component;)V")
	@Override
	public void method1308(@OriginalArg(1) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	@Override
	public void method1309(@OriginalArg(0) Component arg0) {
		arg0.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)I")
	@Override
	public synchronized int method1307() {
		@Pc(2) int local2 = this.anInt1977;
		this.anInt1977 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!ma", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt1977 += arg0.getWheelRotation();
	}
}
