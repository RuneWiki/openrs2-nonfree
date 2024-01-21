import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public final class Class53_Sub1 extends Class53 implements MouseWheelListener {

	@OriginalMember(owner = "client!o", name = "H", descriptor = "I")
	private int anInt1943 = 0;

	@OriginalMember(owner = "client!o", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt1943 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Z)I")
	@Override
	public synchronized int method1447() {
		@Pc(8) int local8 = this.anInt1943;
		this.anInt1943 = 0;
		return local8;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	@Override
	public void method1448(@OriginalArg(0) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ILjava/awt/Component;)V")
	@Override
	public void method1443(@OriginalArg(1) Component arg0) {
		arg0.addMouseWheelListener(this);
	}
}
