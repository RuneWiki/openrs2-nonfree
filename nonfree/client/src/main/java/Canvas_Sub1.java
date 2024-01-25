import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public final class Canvas_Sub1 extends Canvas {

	@OriginalMember(owner = "client!fo", name = "f", descriptor = "Ljava/awt/Component;")
	private final Component aComponent2;

	@OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Canvas_Sub1(@OriginalArg(0) Component arg0) {
		this.aComponent2 = arg0;
	}

	@OriginalMember(owner = "client!fo", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		this.aComponent2.paint(arg0);
	}

	@OriginalMember(owner = "client!fo", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		this.aComponent2.update(arg0);
	}
}
