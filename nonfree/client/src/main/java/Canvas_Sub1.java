import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pfa")
public final class Canvas_Sub1 extends Canvas {

	@OriginalMember(owner = "client!pfa", name = "l", descriptor = "[I")
	public static final int[] anIntArray497 = new int[16384];

	@OriginalMember(owner = "client!pfa", name = "m", descriptor = "[I")
	public static final int[] anIntArray498 = new int[16384];

	@OriginalMember(owner = "client!pfa", name = "e", descriptor = "Ljava/awt/Component;")
	private final Component aComponent3;

	static {
		@Pc(21) double local21 = 3.834951969714103E-4D;
		for (@Pc(23) int local23 = 0; local23 < 16384; local23++) {
			anIntArray497[local23] = (int) (Math.sin((double) local23 * local21) * 16384.0D);
			anIntArray498[local23] = (int) (Math.cos((double) local23 * local21) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!pfa", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Canvas_Sub1(@OriginalArg(0) Component arg0) {
		this.aComponent3 = arg0;
	}

	@OriginalMember(owner = "client!pfa", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		this.aComponent3.update(arg0);
	}

	@OriginalMember(owner = "client!pfa", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		this.aComponent3.paint(arg0);
	}
}
