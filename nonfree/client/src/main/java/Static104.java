import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!ef", name = "l", descriptor = "B")
	public static byte aByte113;

	@OriginalMember(owner = "client!ef", name = "m", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray7 = new Color[] { new Color(16777215), new Color(16777215) };

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!kj;I)I")
	public static int method8230(@OriginalArg(0) Class1_Sub17_Sub2 arg0) {
		@Pc(18) int local18 = arg0.method4517(2);
		@Pc(34) int local34;
		if (local18 == 0) {
			local34 = 0;
		} else if (local18 == 1) {
			local34 = arg0.method4517(5);
		} else if (local18 == 2) {
			local34 = arg0.method4517(8);
		} else {
			local34 = arg0.method4517(11);
		}
		return local34;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(I[SI)[S")
	public static short[] method8231(@OriginalArg(1) short[] arg0, @OriginalArg(2) int arg1) {
		@Pc(11) short[] local11 = new short[arg1];
		Static556.method7045(arg0, 0, local11, 0, arg1);
		return local11;
	}
}
