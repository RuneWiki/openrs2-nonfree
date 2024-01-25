import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static490 {

	@OriginalMember(owner = "client!rj", name = "L", descriptor = "Lclient!gba;")
	public static Class125 aClass125_11;

	@OriginalMember(owner = "client!rj", name = "F", descriptor = "[I")
	public static final int[] anIntArray571 = new int[1];

	@OriginalMember(owner = "client!rj", name = "G", descriptor = "Z")
	public static boolean aBoolean626 = false;

	@OriginalMember(owner = "client!rj", name = "H", descriptor = "I")
	public static int anInt8356 = 0;

	@OriginalMember(owner = "client!rj", name = "K", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_137 = new Class274(58, 28);

	@OriginalMember(owner = "client!rj", name = "M", descriptor = "Z")
	public static boolean aBoolean627 = false;

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/String;B)V")
	public static void method7019(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		Static187.aString46 = arg1;
		Static213.aString15 = arg2;
		Static80.aBoolean146 = arg0;
		if (!Static80.aBoolean146 && (Static187.aString46.equals("") || Static213.aString15.equals(""))) {
			Static163.method3036(3);
			return;
		}
		Static578.aBoolean692 = false;
		if (Static606.anInt9911 != 1) {
			Static237.anInt4723 = -1;
			Static287.anInt5405 = 0;
		}
		Static163.method3036(-3);
		Static531.anInt8871 = 0;
		Static585.anInt9601 = 1;
		Static225.anInt4618 = 0;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIII[BZI)Z")
	public static boolean method7020(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(6) int arg4) {
		@Pc(12) int local12 = arg1 % 8;
		@Pc(19) int local19;
		if (local12 == 0) {
			local19 = 0;
		} else {
			local19 = 8 - local12;
		}
		@Pc(34) int local34 = -((arg4 + 8 - 1) / 8);
		@Pc(43) int local43 = -((arg1 + 8 - 1) / 8);
		for (@Pc(45) int local45 = local34; local45 < 0; local45++) {
			for (@Pc(48) int local48 = local43; local48 < 0; local48++) {
				if (arg3[arg0] == 0) {
					return true;
				}
				arg0 += 8;
			}
			arg0 -= local19;
			if (arg3[arg0 - 1] == 0) {
				return true;
			}
			arg0 += arg2;
		}
		return false;
	}
}
