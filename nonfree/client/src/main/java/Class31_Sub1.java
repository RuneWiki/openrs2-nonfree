import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qh")
public final class Class31_Sub1 extends Class31 implements MouseWheelListener {

	@OriginalMember(owner = "client!qh", name = "i", descriptor = "I")
	private int anInt3341 = 0;

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(I)I")
	@Override
	public synchronized int method2452() {
		@Pc(8) int local8 = this.anInt3341;
		this.anInt3341 = 0;
		return local8;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	@Override
	public void method2451(@OriginalArg(0) Component arg0) {
		arg0.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!qh", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt3341 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(ILjava/awt/Component;)V")
	@Override
	public void method2453(@OriginalArg(1) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}
}
