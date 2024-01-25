import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static276 {

	@OriginalMember(owner = "client!np", name = "z", descriptor = "[Lclient!o;")
	public static Class137[] aClass137Array12;

	@OriginalMember(owner = "client!np", name = "k", descriptor = "Lclient!lo;")
	public static final Class158 aClass158_137 = new Class158("scroll:", "scrollen:", "déroulement:", "rolagem:");

	@OriginalMember(owner = "client!np", name = "r", descriptor = "Lclient!nk;")
	public static final Class177 aClass177_75 = new Class177(44, 4);

	@OriginalMember(owner = "client!np", name = "u", descriptor = "Lclient!fr;")
	public static final Class91 aClass91_73 = new Class91(4);

	@OriginalMember(owner = "client!np", name = "x", descriptor = "Lclient!rr;")
	public static final Class220 aClass220_6 = new Class220(14, 0, 4, 1);

	@OriginalMember(owner = "client!np", name = "y", descriptor = "Lclient!nk;")
	public static final Class177 aClass177_76 = new Class177(10, 16);

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(III)B")
	public static byte method4082(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(IIIIII)V")
	public static void method4085(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(11) int local11 = arg2; local11 <= arg0; local11++) {
			Static228.method3480(arg1, arg3, Static60.anIntArrayArray14[local11], arg4);
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(II)V")
	public static void method4086(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class252 local7 = Static67.aClass252ArrayArrayArray2[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class252 local28 = Static67.aClass252ArrayArrayArray2[local9][arg0][arg1] = Static67.aClass252ArrayArrayArray2[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.aByte95--;
				for (@Pc(40) Class208 local40 = local28.aClass208_3; local40 != null; local40 = local40.aClass208_2) {
					@Pc(44) Class30_Sub1 local44 = local40.aClass30_Sub1_1;
					if (local44.aShort104 == arg0 && local44.aShort103 == arg1) {
						local44.aByte102--;
					}
				}
			}
		}
		if (Static67.aClass252ArrayArrayArray2[0][arg0][arg1] == null) {
			Static67.aClass252ArrayArrayArray2[0][arg0][arg1] = new Class252(0, arg0, arg1);
			Static67.aClass252ArrayArrayArray2[0][arg0][arg1].aByte100 = 1;
		}
		Static67.aClass252ArrayArrayArray2[0][arg0][arg1].aClass252_1 = local7;
		Static67.aClass252ArrayArrayArray2[3][arg0][arg1] = null;
	}
}
