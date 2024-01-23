import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kh")
public final class Class67_Sub1 extends Class67 implements MouseWheelListener {

	@OriginalMember(owner = "client!kh", name = "k", descriptor = "I")
	private int anInt2503 = 0;

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)I")
	@Override
	public synchronized int method1968() {
		@Pc(2) int local2 = this.anInt2503;
		this.anInt2503 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	@Override
	public void method1969(@OriginalArg(0) Component arg0) {
		arg0.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILjava/awt/Component;)V")
	@Override
	public void method1970(@OriginalArg(1) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!kh", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt2503 += arg0.getWheelRotation();
	}
}
