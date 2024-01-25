import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!ko", name = "f", descriptor = "[I")
	public static int[] anIntArray292;

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray1 = new Color[] { new Color(9179409), new Color(3289650) };

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "[I")
	public static final int[] anIntArray291 = new int[256];

	@OriginalMember(owner = "client!ko", name = "e", descriptor = "Lclient!ss;")
	public static final Class213 aClass213_9 = new Class213(2, 4);

	@OriginalMember(owner = "client!ko", name = "g", descriptor = "Z")
	public static boolean aBoolean279 = true;

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(I)V")
	public static void method3404() {
		Static164.aClass41_43.method825();
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIZI)Ljava/lang/String;")
	public static String method3405(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(37) int local37 = 2;
		@Pc(41) int local41 = arg0 / 10;
		while (local41 != 0) {
			local41 /= 10;
			local37++;
		}
		@Pc(53) char[] local53 = new char[local37];
		local53[0] = '+';
		for (@Pc(61) int local61 = local37 - 1; local61 > 0; local61--) {
			@Pc(65) int local65 = arg0;
			arg0 /= 10;
			@Pc(76) int local76 = local65 - arg0 * 10;
			if (local76 >= 10) {
				local53[local61] = (char) (local76 + 87);
			} else {
				local53[local61] = (char) (local76 + 48);
			}
		}
		return new String(local53);
	}
}
