import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "F")
	public static float aFloat58;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "Lclient!pp;")
	public static final Class236 aClass236_9 = new Class236(53, -1);

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "Lclient!iu;")
	public static final Class150 aClass150_40 = new Class150(6, -2);

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "I")
	public static int anInt1578 = 0;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILclient!qa;IILclient!gb;Lclient!fm;)Z")
	public static boolean method1446(@OriginalArg(1) Class62 arg0, @OriginalArg(4) Class5_Sub18 arg1, @OriginalArg(5) Class101 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(9) int local9 = Integer.MIN_VALUE;
		@Pc(11) int local11 = Integer.MAX_VALUE;
		@Pc(13) int local13 = Integer.MIN_VALUE;
		if (arg2.anIntArray235 != null) {
			local7 = (arg1.anInt3137 + arg2.anInt2877 - Static245.anInt7319) * (Static245.anInt7310 - Static245.anInt7317) / (Static245.anInt7311 - Static245.anInt7319) + Static245.anInt7317;
			local9 = (arg1.anInt3137 + arg2.anInt2888 - Static245.anInt7319) * (Static245.anInt7310 - Static245.anInt7317) / (Static245.anInt7311 - Static245.anInt7319) + Static245.anInt7317;
			local13 = Static245.anInt7308 - (arg2.anInt2883 + arg1.anInt3144 - Static245.anInt7309) * (Static245.anInt7308 - Static245.anInt7318) / (Static245.anInt7312 - Static245.anInt7309);
			local11 = Static245.anInt7308 - (arg1.anInt3144 + arg2.anInt2861 - Static245.anInt7309) * (-Static245.anInt7318 + Static245.anInt7308) / (Static245.anInt7312 - Static245.anInt7309);
		}
		@Pc(107) Class25 local107 = null;
		@Pc(109) int local109 = 0;
		@Pc(111) int local111 = 0;
		@Pc(113) int local113 = 0;
		@Pc(115) int local115 = 0;
		if (arg2.anInt2867 != -1) {
			if (arg1.aBoolean207 && arg2.anInt2873 != -1) {
				local107 = arg2.method2604(true, arg0);
			} else {
				local107 = arg2.method2604(false, arg0);
			}
			if (local107 != null) {
				local109 = arg1.anInt3143 - (local107.EA() + 1 >> 1);
				if (local109 < local7) {
					local7 = local109;
				}
				local111 = arg1.anInt3143 + (local107.EA() + 1 >> 1);
				if (local9 < local111) {
					local9 = local111;
				}
				local113 = arg1.anInt3142 - (local107.ma() + 1 >> 1);
				local115 = arg1.anInt3142 + (local107.ma() + 1 >> 1);
				if (local11 > local113) {
					local11 = local113;
				}
				if (local13 < local115) {
					local13 = local115;
				}
			}
		}
		@Pc(214) Class94 local214 = null;
		@Pc(216) int local216 = 0;
		@Pc(218) int local218 = 0;
		@Pc(220) int local220 = 0;
		@Pc(222) int local222 = 0;
		@Pc(224) int local224 = 0;
		@Pc(226) int local226 = 0;
		@Pc(228) int local228 = 0;
		@Pc(282) int local282;
		@Pc(305) int local305;
		if (arg2.aString34 != null) {
			local214 = Static305.method5011(arg2.anInt2878);
			if (local214 != null) {
				local216 = Static291.aClass256_6.method6122(arg2.aString34, null, null, Static395.aStringArray32);
				local218 = arg1.anInt3142;
				if (local107 == null) {
					local218 -= local216 * local214.method2408() / 2;
				} else {
					local218 -= (local107.ma() >> 1) + (local214.method2409() * local216);
				}
				for (local282 = 0; local282 < local216; local282++) {
					@Pc(288) String local288 = Static395.aStringArray32[local282];
					if (local282 < local216 - 1) {
						local288 = local288.substring(0, local288.length() - 4);
					}
					local305 = local214.method2411(local288);
					if (local220 < local305) {
						local220 = local305;
					}
				}
				local222 = arg1.anInt3143 - local220 / 2;
				local224 = local220 / 2 + arg1.anInt3143;
				if (local7 > local222) {
					local7 = local222;
				}
				if (local9 < local224) {
					local9 = local224;
				}
				local226 = local218;
				if (local226 < local11) {
					local11 = local226;
				}
				local228 = local218 + local216 * local214.method2409();
				if (local228 > local13) {
					local13 = local228;
				}
			}
		}
		if (Static245.anInt7317 > local9 || Static245.anInt7310 < local7 || local13 < Static245.anInt7318 || Static245.anInt7308 < local11) {
			return true;
		}
		@Pc(424) int local424;
		if (arg2.anIntArray235 != null) {
			@Pc(422) int[] local422 = new int[arg2.anIntArray235.length];
			for (local424 = 0; local424 < local422.length / 2; local424++) {
				local305 = arg1.anInt3137 + arg2.anIntArray235[local424 * 2];
				@Pc(448) int local448 = arg1.anInt3144 + arg2.anIntArray235[local424 * 2 + 1];
				local422[local424 * 2] = (local305 - Static245.anInt7319) * (Static245.anInt7310 - Static245.anInt7317) / (Static245.anInt7311 - Static245.anInt7319) + Static245.anInt7317;
				local422[local424 * 2 + 1] = Static245.anInt7308 - (Static245.anInt7308 - Static245.anInt7318) * (local448 + -Static245.anInt7309) / (Static245.anInt7312 - Static245.anInt7309);
			}
			Static251.method4268(arg0, local422, arg2.anInt2863);
			for (local305 = 0; local305 < local422.length / 2 - 1; local305++) {
				arg0.method6992(arg2.anInt2884, local422[(local305 + 1) * 2], local422[local305 * 2], local422[local305 * 2 + 1], local422[local305 * 2 + 2 + 1]);
			}
			arg0.method6992(arg2.anInt2884, local422[0], local422[local422.length - 2], local422[local422.length - 1], local422[1]);
		}
		if (local107 != null) {
			if (Static224.anInt4176 > 0 && (Static263.anInt5182 != -1 && Static263.anInt5182 == arg1.anInt3138 || Static134.anInt2779 != -1 && Static134.anInt2779 == arg2.anInt2886)) {
				if (Static183.anInt4083 > 50) {
					local282 = 200 - Static183.anInt4083 * 2;
				} else {
					local282 = Static183.anInt4083 * 2;
				}
				local424 = local282 << 24 | 0xFFFF00;
				arg0.method7029(arg1.anInt3142, local107.c() / 2 + 7, local424, arg1.anInt3143);
				arg0.method7029(arg1.anInt3142, local107.c() / 2 + 5, local424, arg1.anInt3143);
				arg0.method7029(arg1.anInt3142, local107.c() / 2 + 3, local424, arg1.anInt3143);
				arg0.method7029(arg1.anInt3142, local107.c() / 2 + 1, local424, arg1.anInt3143);
				arg0.method7029(arg1.anInt3142, local107.c() / 2, local424, arg1.anInt3143);
			}
			local107.method6956(arg1.anInt3143 - (local107.EA() >> 1), arg1.anInt3142 + -(local107.ma() >> 1));
		}
		if (arg2.aString34 != null && local214 != null) {
			Static102.method2127(local218, local214, arg0, arg1, local220, local216, arg2);
		}
		if (arg2.anInt2867 != -1 || arg2.aString34 != null) {
			@Pc(737) Class5_Sub36 local737 = new Class5_Sub36(arg1);
			local737.anInt6870 = local222;
			local737.anInt6871 = local111;
			local737.anInt6875 = local115;
			local737.anInt6872 = local109;
			local737.anInt6874 = local228;
			local737.anInt6868 = local226;
			local737.anInt6867 = local224;
			local737.anInt6869 = local113;
			Static357.aClass99_56.method2513(local737);
		}
		return false;
	}
}
