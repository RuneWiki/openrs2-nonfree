import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!hba", name = "s", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_73 = new Class133(28, 2);

	@OriginalMember(owner = "client!hba", name = "t", descriptor = "Lclient!hb;")
	public static final Class117 aClass117_11 = new Class117(3, 6);

	@OriginalMember(owner = "client!hba", name = "b", descriptor = "(II)Z")
	public static boolean method3293(@OriginalArg(0) int arg0) {
		return arg0 == 6 || arg0 == 7 || arg0 == 8;
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(IB)V")
	public static void method3294(@OriginalArg(0) int arg0) {
		if (!Static62.method7109(arg0)) {
			return;
		}
		@Pc(22) Class245[] local22 = Static459.aClass245ArrayArray2[arg0];
		for (@Pc(24) int local24 = 0; local24 < local22.length; local24++) {
			@Pc(30) Class245 local30 = local22[local24];
			if (local30 != null) {
				local30.anInt7233 = 0;
				local30.anInt7250 = 1;
				local30.anInt7291 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(Lclient!oa;Lclient!va;IIIII)V")
	public static void method3295(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class6 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg3;
		@Pc(7) int local7 = arg3 + arg5;
		@Pc(11) int local11 = arg4 - 1;
		@Pc(15) int local15 = arg4 + arg6;
		for (@Pc(17) int local17 = arg2; local17 <= arg2 + 1; local17++) {
			if (local17 != Static399.anInt7385) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static126.anInt2626) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static108.anInt2385 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg4 && local23 != arg3)) {
								@Pc(62) Class290 local62 = Static279.aClass290ArrayArrayArray7[local17][local23][local32];
								if (local62 != null) {
									@Pc(140) int local140 = (Static511.aClass52Array3[local17].JA(local23, local32) + Static511.aClass52Array3[local17].JA(local23 + 1, local32) + Static511.aClass52Array3[local17].JA(local23, local32 + 1) + Static511.aClass52Array3[local17].JA(local23 + 1, local32 + 1)) / 4 - (Static511.aClass52Array3[arg2].JA(arg3, arg4) + Static511.aClass52Array3[arg2].JA(arg3 + 1, arg4) + Static511.aClass52Array3[arg2].JA(arg3, arg4 + 1) + Static511.aClass52Array3[arg2].JA(arg3 + 1, arg4 + 1)) / 4;
									@Pc(143) Class6_Sub2 local143 = local62.aClass6_Sub2_2;
									@Pc(146) Class6_Sub2 local146 = local62.aClass6_Sub2_3;
									if (local143 != null && local143.method7743()) {
										arg1.method7749((local23 - arg3) * Static219.anInt4777 + (1 - arg5) * Static467.anInt8424, (local32 - arg4) * Static219.anInt4777 + (1 - arg6) * Static467.anInt8424, local143, arg0, local1, local140);
									}
									if (local146 != null && local146.method7743()) {
										arg1.method7749((local23 - arg3) * Static219.anInt4777 + (1 - arg5) * Static467.anInt8424, (local32 - arg4) * Static219.anInt4777 + (1 - arg6) * Static467.anInt8424, local146, arg0, local1, local140);
									}
									for (@Pc(219) Class98 local219 = local62.aClass98_3; local219 != null; local219 = local219.aClass98_1) {
										@Pc(223) Class6_Sub1 local223 = local219.aClass6_Sub1_1;
										if (local223 != null && local223.method7743() && (local23 == local223.aShort123 || local23 == local3) && (local32 == local223.aShort120 || local32 == local11)) {
											@Pc(252) int local252 = local223.aShort122 + 1 - local223.aShort123;
											@Pc(260) int local260 = local223.aShort121 + 1 - local223.aShort120;
											arg1.method7749((local223.aShort123 - arg3) * Static219.anInt4777 + (local252 - arg5) * Static467.anInt8424, (local223.aShort120 - arg4) * Static219.anInt4777 + (local260 - arg6) * Static467.anInt8424, local223, arg0, local1, local140);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(IIIIZII)V")
	public static void method3296(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (Static7.aClass3_Sub15_Sub1_1.anInt8362 != 0 && arg3 != 0 && Static128.anInt2675 < 50 && arg0 != -1) {
			Static360.aClass70Array1[Static128.anInt2675++] = new Class70((byte) 2, arg0, arg3, arg1, arg2, arg4);
		}
	}
}
