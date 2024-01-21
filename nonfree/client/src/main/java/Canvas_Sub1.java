import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!na")
public final class Canvas_Sub1 extends Canvas {

	@OriginalMember(owner = "client!na", name = "f", descriptor = "[I")
	public static int[] anIntArray466 = new int[256];

	@OriginalMember(owner = "client!na", name = "b", descriptor = "Ljava/awt/Component;")
	private final Component aComponent1;

	static {
		for (@Pc(18) int local18 = 0; local18 < 256; local18++) {
			@Pc(21) int local21 = local18;
			for (@Pc(23) int local23 = 0; local23 < 8; local23++) {
				if ((local21 & 0x1) == 1) {
					local21 = local21 >>> 1 ^ 0xEDB88320;
				} else {
					local21 >>>= 0x1;
				}
			}
			anIntArray466[local18] = local21;
		}
	}

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Canvas_Sub1(@OriginalArg(0) Component arg0) {
		this.aComponent1 = arg0;
	}

	@OriginalMember(owner = "client!na", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		this.aComponent1.update(arg0);
	}

	@OriginalMember(owner = "client!na", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		this.aComponent1.paint(arg0);
	}
}
