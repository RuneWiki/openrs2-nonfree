import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public final class Class39_Sub1 extends Class39 implements MouseWheelListener {

	@OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
	private int anInt3211 = 0;

	@OriginalMember(owner = "client!pc", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt3211 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	@Override
	public void method2487(@OriginalArg(0) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZLjava/awt/Component;)V")
	@Override
	public void method2490(@OriginalArg(1) Component arg0) {
		arg0.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)I")
	@Override
	public synchronized int method2485() {
		@Pc(10) int local10 = this.anInt3211;
		this.anInt3211 = 0;
		return local10;
	}
}
