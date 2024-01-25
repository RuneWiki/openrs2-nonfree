import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!cw", name = "v", descriptor = "Lclient!vi;")
	public static final Class256 aClass256_3 = new Class256("WIP", 2);

	@OriginalMember(owner = "client!cw", name = "w", descriptor = "[S")
	public static final short[] aShortArray37 = new short[] { 58, 6, 10, 13, 9, 8, 50, 44 };

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(ZIIII)V")
	public static void method1303(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = arg1;
		@Pc(17) int local17 = -arg1;
		@Pc(19) int local19 = -1;
		@Pc(27) int local27 = Static337.method4744(arg1 + arg2, Static70.anInt1843, Static105.anInt2417);
		@Pc(36) int local36 = Static337.method4744(arg2 - arg1, Static70.anInt1843, Static105.anInt2417);
		Static228.method3480(local36, arg0, Static60.anIntArrayArray14[arg3], local27);
		while (local12 < local14) {
			local19 += 2;
			local17 += local19;
			@Pc(65) int local65;
			@Pc(69) int local69;
			@Pc(84) int local84;
			@Pc(93) int local93;
			if (local17 > 0) {
				local14--;
				local17 -= local14 << 1;
				local65 = arg3 - local14;
				local69 = local14 + arg3;
				if (local69 >= Static362.anInt6654 && local65 <= Static164.anInt6595) {
					local84 = Static337.method4744(arg2 + local12, Static70.anInt1843, Static105.anInt2417);
					local93 = Static337.method4744(arg2 - local12, Static70.anInt1843, Static105.anInt2417);
					if (local69 <= Static164.anInt6595) {
						Static228.method3480(local93, arg0, Static60.anIntArrayArray14[local69], local84);
					}
					if (Static362.anInt6654 <= local65) {
						Static228.method3480(local93, arg0, Static60.anIntArrayArray14[local65], local84);
					}
				}
			}
			local12++;
			local65 = arg3 - local12;
			local69 = local12 + arg3;
			if (local69 >= Static362.anInt6654 && Static164.anInt6595 >= local65) {
				local84 = Static337.method4744(local14 + arg2, Static70.anInt1843, Static105.anInt2417);
				local93 = Static337.method4744(arg2 - local14, Static70.anInt1843, Static105.anInt2417);
				if (local69 <= Static164.anInt6595) {
					Static228.method3480(local93, arg0, Static60.anIntArrayArray14[local69], local84);
				}
				if (local65 >= Static362.anInt6654) {
					Static228.method3480(local93, arg0, Static60.anIntArrayArray14[local65], local84);
				}
			}
		}
	}
}
