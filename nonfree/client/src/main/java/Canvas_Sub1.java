import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public final class Canvas_Sub1 extends Canvas {

	@OriginalMember(owner = "client!fi", name = "f", descriptor = "Ljava/awt/Component;")
	private final Component aComponent1;

	static {
		new Class84("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.");
	}

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Canvas_Sub1(@OriginalArg(0) Component arg0) {
		this.aComponent1 = arg0;
	}

	@OriginalMember(owner = "client!fi", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		this.aComponent1.paint(arg0);
	}

	@OriginalMember(owner = "client!fi", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		this.aComponent1.update(arg0);
	}
}
