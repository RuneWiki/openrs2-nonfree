import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public final class Canvas_Sub2 extends Canvas {

	@OriginalMember(owner = "client!ga", name = "e", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Canvas_Sub2(@OriginalArg(0) Component arg0) {
		this.aComponent1 = arg0;
	}

	@OriginalMember(owner = "client!ga", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		this.aComponent1.paint(arg0);
	}

	@OriginalMember(owner = "client!ga", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		this.aComponent1.update(arg0);
	}
}
