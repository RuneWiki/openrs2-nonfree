import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tca")
public final class Canvas_Sub1 extends Canvas {

	@OriginalMember(owner = "client!tca", name = "b", descriptor = "Ljava/awt/Component;")
	private final Component aComponent4;

	@OriginalMember(owner = "client!tca", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Canvas_Sub1(@OriginalArg(0) Component arg0) {
		this.aComponent4 = arg0;
	}

	@OriginalMember(owner = "client!tca", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		this.aComponent4.update(arg0);
	}

	@OriginalMember(owner = "client!tca", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		this.aComponent4.paint(arg0);
	}
}
