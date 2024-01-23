import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jk")
public final class Canvas_Sub1 extends Canvas {

	@OriginalMember(owner = "client!jk", name = "m", descriptor = "[I")
	public static int[] anIntArray224 = new int[99];

	@OriginalMember(owner = "client!jk", name = "i", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	static {
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < 99; local20++) {
			@Pc(25) int local25 = local20 + 1;
			@Pc(38) int local38 = (int) (Math.pow(2.0D, (double) local25 / 7.0D) * 300.0D + (double) local25);
			local18 += local38;
			anIntArray224[local20] = local18 / 4;
		}
	}

	@OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Canvas_Sub1(@OriginalArg(0) Component arg0) {
		this.aComponent2 = arg0;
	}

	@OriginalMember(owner = "client!jk", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		this.aComponent2.paint(arg0);
	}

	@OriginalMember(owner = "client!jk", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		this.aComponent2.update(arg0);
	}
}
