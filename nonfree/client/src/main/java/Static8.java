import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ah", name = "z", descriptor = "I")
	public static int anInt336;

	@OriginalMember(owner = "client!ah", name = "H", descriptor = "Lclient!bj;")
	public static Class15_Sub1 aClass15_Sub1_10;

	@OriginalMember(owner = "client!ah", name = "L", descriptor = "[Lclient!m;")
	public static Class61[] aClass61Array1 = new Class61[6];

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIIIII)V")
	public static void method252(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static121.method3319(arg3);
		@Pc(13) int local13 = arg3 - arg5;
		if (local13 < 0) {
			local13 = 0;
		}
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = arg3;
		@Pc(24) int local24 = -local13;
		@Pc(26) int local26 = local13;
		@Pc(28) int local28 = -1;
		@Pc(31) int local31 = -arg3;
		@Pc(33) int local33 = -1;
		@Pc(37) int local37 = arg1 - local13;
		@Pc(41) int local41 = local13 + arg1;
		@Pc(45) int[] local45 = Static3.anIntArrayArray1[arg4];
		Static204.method3147(arg1 - arg3, arg2, local37, local45);
		Static204.method3147(local37, arg0, local41, local45);
		Static204.method3147(local41, arg2, arg3 + arg1, local45);
		while (local19 < local21) {
			local33 += 2;
			local24 += local33;
			local28 += 2;
			if (local24 >= 0 && local26 >= 1) {
				Static27.anIntArray230[local26] = local19;
				local26--;
				local24 -= local26 << 1;
			}
			local31 += local28;
			local19++;
			@Pc(117) int[] local117;
			@Pc(128) int[] local128;
			@Pc(121) int local121;
			@Pc(138) int local138;
			@Pc(133) int local133;
			@Pc(142) int local142;
			@Pc(147) int local147;
			if (local31 >= 0) {
				local21--;
				if (local21 < local13) {
					local117 = Static3.anIntArrayArray1[arg4 + local21];
					local121 = Static27.anIntArray230[local21];
					local128 = Static3.anIntArrayArray1[arg4 - local21];
					local133 = arg1 - local19;
					local138 = arg1 + local19;
					local142 = arg1 + local121;
					local147 = arg1 - local121;
					Static204.method3147(local133, arg2, local147, local117);
					Static204.method3147(local147, arg0, local142, local117);
					Static204.method3147(local142, arg2, local138, local117);
					Static204.method3147(local133, arg2, local147, local128);
					Static204.method3147(local147, arg0, local142, local128);
					Static204.method3147(local142, arg2, local138, local128);
				} else {
					local117 = Static3.anIntArrayArray1[arg4 + local21];
					local128 = Static3.anIntArrayArray1[arg4 - local21];
					local121 = local19 + arg1;
					local138 = arg1 - local19;
					Static204.method3147(local138, arg2, local121, local117);
					Static204.method3147(local138, arg2, local121, local128);
				}
				local31 -= local21 << 1;
			}
			local117 = Static3.anIntArrayArray1[local19 + arg4];
			local128 = Static3.anIntArrayArray1[arg4 - local19];
			local121 = local21 + arg1;
			local138 = arg1 - local21;
			if (local13 <= local19) {
				Static204.method3147(local138, arg2, local121, local117);
				Static204.method3147(local138, arg2, local121, local128);
			} else {
				local133 = local26 < local19 ? Static27.anIntArray230[local19] : local26;
				local147 = arg1 - local133;
				Static204.method3147(local138, arg2, local147, local117);
				local142 = local133 + arg1;
				Static204.method3147(local147, arg0, local142, local117);
				Static204.method3147(local142, arg2, local121, local117);
				Static204.method3147(local138, arg2, local147, local128);
				Static204.method3147(local147, arg0, local142, local128);
				Static204.method3147(local142, arg2, local121, local128);
			}
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(III)I")
	public static int method254(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(37) int local37 = Static170.method2734(arg0 - 1, arg1 + -1) + Static170.method2734(arg0 - 1, arg1 + 1) + Static170.method2734(arg0 + 1, arg1 + -1) + Static170.method2734(arg0 - -1, arg1 - -1);
		@Pc(76) int local76 = Static170.method2734(arg0, arg1 - 1) + Static170.method2734(arg0, arg1 + 1) + Static170.method2734(arg0 + -1, arg1) + Static170.method2734(arg0 - -1, arg1);
		@Pc(81) int local81 = Static170.method2734(arg0, arg1);
		return local37 / 16 + local76 / 8 + local81 / 4;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lclient!i;BLclient!nb;Lclient!i;)Lclient!pf;")
	public static Class2_Sub2_Sub16_Sub1 method255(@OriginalArg(0) Class41 arg0, @OriginalArg(2) Class15 arg1, @OriginalArg(3) Class41 arg2) {
		@Pc(16) int local16 = arg1.method414(arg0);
		@Pc(22) int local22 = arg1.method416(arg2, local16);
		return Static29.method551(arg1, local22, local16);
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IB)I")
	public static int method256(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "(II)I")
	public static int method257(@OriginalArg(0) int arg0) {
		if (arg0 >= 97 && arg0 <= 122 || arg0 >= 224 && arg0 <= 254 && arg0 != 247) {
			return arg0 - 32;
		} else if (arg0 == 255) {
			return 159;
		} else if (arg0 == 156) {
			return 140;
		} else {
			return arg0;
		}
	}
}
