import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public final class Class22_Sub1 extends Class22 implements MouseWheelListener {

	@OriginalMember(owner = "client!ee", name = "q", descriptor = "I")
	private int anInt896 = 0;

	@OriginalMember(owner = "client!ee", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt896 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(Ljava/awt/Component;I)V")
	@Override
	public void method620(@OriginalArg(0) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(Z)I")
	@Override
	public synchronized int method618() {
		@Pc(8) int local8 = this.anInt896;
		this.anInt896 = 0;
		return local8;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	@Override
	public void method612(@OriginalArg(0) Component arg0) {
		arg0.addMouseWheelListener(this);
	}
}
