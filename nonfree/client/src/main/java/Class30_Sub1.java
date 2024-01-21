import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class30_Sub1 extends Class30 implements MouseWheelListener {

	@OriginalMember(owner = "client!gb", name = "l", descriptor = "I")
	private int anInt1023 = 0;

	@OriginalMember(owner = "client!gb", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt1023 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZLjava/awt/Component;)V")
	@Override
	public void method685(@OriginalArg(1) Component arg0) {
		arg0.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "(I)I")
	@Override
	public synchronized int method686() {
		@Pc(2) int local2 = this.anInt1023;
		this.anInt1023 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	@Override
	public void method681(@OriginalArg(0) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}
}
