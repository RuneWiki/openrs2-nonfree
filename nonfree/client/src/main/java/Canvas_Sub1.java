import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public final class Canvas_Sub1 extends Canvas {

	@OriginalMember(owner = "client!vh", name = "g", descriptor = "Ljava/awt/Component;")
	private final Component aComponent5;

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Canvas_Sub1(@OriginalArg(0) Component arg0) {
		this.aComponent5 = arg0;
	}

	@OriginalMember(owner = "client!vh", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		this.aComponent5.update(arg0);
	}

	@OriginalMember(owner = "client!vh", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		this.aComponent5.paint(arg0);
	}
}
