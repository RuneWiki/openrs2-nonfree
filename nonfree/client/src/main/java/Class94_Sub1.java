import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class94_Sub1 extends Class94 implements MouseWheelListener {

	@OriginalMember(owner = "client!th", name = "e", descriptor = "I")
	private int anInt5689 = 0;

	@OriginalMember(owner = "client!th", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt5689 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(I)I")
	@Override
	public synchronized int method5162() {
		@Pc(2) int local2 = this.anInt5689;
		this.anInt5689 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ZLjava/awt/Component;)V")
	@Override
	public void method5163(@OriginalArg(1) Component arg0) {
		arg0.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	@Override
	public void method5164(@OriginalArg(0) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}
}
