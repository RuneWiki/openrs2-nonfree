import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!aj", name = "l", descriptor = "F")
	public static float aFloat1;

	@OriginalMember(owner = "client!aj", name = "p", descriptor = "[I")
	public static int[] anIntArray10;

	@OriginalMember(owner = "client!aj", name = "u", descriptor = "Lclient!nq;")
	public static Class144 aClass144_3;

	@OriginalMember(owner = "client!aj", name = "m", descriptor = "I")
	public static int anInt71 = -1;

	@OriginalMember(owner = "client!aj", name = "o", descriptor = "[I")
	public static final int[] anIntArray9 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

	@OriginalMember(owner = "client!aj", name = "v", descriptor = "Z")
	public static final boolean aBoolean6 = false;

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(ILclient!be;ILclient!uo;Lclient!co;I)Z")
	public static boolean method63(@OriginalArg(1) Class23 arg0, @OriginalArg(3) Class129 arg1, @OriginalArg(4) Class11_Sub8 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(9) int local9 = Integer.MIN_VALUE;
		@Pc(11) int local11 = Integer.MAX_VALUE;
		@Pc(13) int local13 = Integer.MIN_VALUE;
		if (arg0.anIntArray19 != null) {
			local7 = (arg0.anInt298 + arg2.anInt864 - Static271.anInt4335) * (Static271.anInt4334 - Static271.anInt4336) / (Static271.anInt4341 - Static271.anInt4335) + Static271.anInt4336;
			local11 = Static271.anInt4333 - (Static271.anInt4333 - Static271.anInt4340) * (-Static271.anInt4337 + arg0.anInt308 + arg2.anInt868) / (Static271.anInt4330 - Static271.anInt4337);
			local13 = Static271.anInt4333 - (arg2.anInt868 + arg0.anInt317 - Static271.anInt4337) * (Static271.anInt4333 - Static271.anInt4340) / (Static271.anInt4330 - Static271.anInt4337);
			local9 = Static271.anInt4336 + (Static271.anInt4334 - Static271.anInt4336) * (arg0.anInt312 + arg2.anInt864 + -Static271.anInt4335) / (Static271.anInt4341 - Static271.anInt4335);
		}
		@Pc(102) Class97 local102 = null;
		@Pc(104) int local104 = 0;
		@Pc(106) int local106 = 0;
		@Pc(108) int local108 = 0;
		@Pc(110) int local110 = 0;
		if (arg0.anInt303 != -1) {
			if (arg2.aBoolean53 && arg0.anInt292 != -1) {
				local102 = arg0.method247(true, arg1);
			} else {
				local102 = arg0.method247(false, arg1);
			}
			if (local102 != null) {
				local104 = arg2.anInt861 - (local102.method5542() + 1 >> 1);
				if (local7 > local104) {
					local7 = local104;
				}
				local106 = arg2.anInt861 + (local102.method5542() + 1 >> 1);
				local108 = arg2.anInt862 - (local102.method5557() + 1 >> 1);
				if (local106 > local9) {
					local9 = local106;
				}
				if (local108 < local11) {
					local11 = local108;
				}
				local110 = arg2.anInt862 + (local102.method5557() + 1 >> 1);
				if (local13 < local110) {
					local13 = local110;
				}
			}
		}
		@Pc(213) Class30 local213 = null;
		@Pc(215) int local215 = 0;
		@Pc(217) int local217 = 0;
		@Pc(224) int local224 = 0;
		@Pc(226) int local226 = 0;
		@Pc(228) int local228 = 0;
		@Pc(230) int local230 = 0;
		@Pc(232) int local232 = 0;
		@Pc(281) int local281;
		@Pc(304) int local304;
		if (arg0.aString7 != null) {
			local213 = Static198.method3598(arg0.anInt299);
			if (local213 != null) {
				local215 = Static275.aClass114_7.method2469(null, arg0.aString7, Static288.aStringArray47, null);
				local217 = arg2.anInt862;
				if (local102 == null) {
					local217 -= local215 * local213.method398() / 2;
				} else {
					local217 -= (local102.method5557() >> 1) + local215 * local213.method400();
				}
				for (local281 = 0; local281 < local215; local281++) {
					@Pc(287) String local287 = Static288.aStringArray47[local281];
					if (local215 - 1 > local281) {
						local287 = local287.substring(0, local287.length() - 4);
					}
					local304 = local213.method397(local287);
					if (local224 < local304) {
						local224 = local304;
					}
				}
				local226 = arg2.anInt861 - local224 / 2;
				local228 = arg2.anInt861 + local224 / 2;
				if (local7 > local226) {
					local7 = local226;
				}
				local230 = local217;
				if (local9 < local228) {
					local9 = local228;
				}
				if (local11 > local230) {
					local11 = local230;
				}
				local232 = local217 + local213.method400() * local215;
				if (local13 < local232) {
					local13 = local232;
				}
			}
		}
		if (local9 < Static271.anInt4336 || Static271.anInt4334 < local7 || Static271.anInt4340 > local13 || Static271.anInt4333 < local11) {
			return true;
		}
		@Pc(406) int local406;
		if (arg0.anIntArray19 != null) {
			@Pc(404) int[] local404 = new int[arg0.anIntArray19.length];
			for (local406 = 0; local406 < local404.length / 2; local406++) {
				local304 = arg2.anInt864 + arg0.anIntArray19[local406 * 2];
				@Pc(430) int local430 = arg0.anIntArray19[local406 * 2 + 1] + arg2.anInt868;
				local404[local406 * 2] = (Static271.anInt4334 - Static271.anInt4336) * (-Static271.anInt4335 + local304) / (Static271.anInt4341 - Static271.anInt4335) + Static271.anInt4336;
				local404[local406 * 2 + 1] = Static271.anInt4333 - (local430 - Static271.anInt4337) * (-Static271.anInt4340 + Static271.anInt4333) / (Static271.anInt4330 - Static271.anInt4337);
			}
			Static60.method904(arg1, local404, arg0.anInt314);
			for (local304 = 0; local304 < local404.length / 2 - 1; local304++) {
				arg1.method4991(local404[local304 * 2 + 1], local404[(local304 + 1) * 2 + 1], local404[local304 * 2 + 2], local404[local304 * 2], arg0.anInt291);
			}
			arg1.method4991(local404[local404.length - 1], local404[1], local404[0], local404[local404.length - 2], arg0.anInt291);
		}
		if (local102 != null) {
			if (Static247.anInt4961 > 0 && (Static124.anInt2296 != -1 && Static124.anInt2296 == arg2.anInt863 || Static31.anInt550 != -1 && arg0.anInt297 == Static31.anInt550)) {
				if (Static292.anInt5791 > 50) {
					local281 = (100 - Static292.anInt5791) * 2;
				} else {
					local281 = Static292.anInt5791 * 2;
				}
				local406 = local281 << 24 | 0xFFFF00;
				arg1.method5013(local102.method5558() / 2 + 7, arg2.anInt861, local406, arg2.anInt862);
				arg1.method5013(local102.method5558() / 2 + 5, arg2.anInt861, local406, arg2.anInt862);
				arg1.method5013(local102.method5558() / 2 + 3, arg2.anInt861, local406, arg2.anInt862);
				arg1.method5013(local102.method5558() / 2 + 1, arg2.anInt861, local406, arg2.anInt862);
				arg1.method5013(local102.method5558() / 2, arg2.anInt861, local406, arg2.anInt862);
			}
			local102.method5555(arg2.anInt861 - (local102.method5542() >> 1), arg2.anInt862 + -(local102.method5557() >> 1));
		}
		if (arg0.aString7 != null && local213 != null) {
			Static134.method2079(local215, local224, local217, arg1, arg0, arg2, local213);
		}
		if (arg0.anInt303 != -1 || arg0.aString7 != null) {
			@Pc(714) Class11_Sub37 local714 = new Class11_Sub37(arg2);
			local714.anInt5827 = local104;
			local714.anInt5830 = local108;
			local714.anInt5834 = local110;
			local714.anInt5832 = local228;
			local714.anInt5838 = local232;
			local714.anInt5828 = local226;
			local714.anInt5833 = local106;
			local714.anInt5836 = local230;
			Static4.aClass16_1.method190(local714);
		}
		return false;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIILclient!nq;ZI)V")
	public static void method65(@OriginalArg(0) int arg0, @OriginalArg(3) Class144 arg1, @OriginalArg(5) int arg2) {
		Static329.anInt6323 = 1;
		Static281.anInt5587 = arg2;
		Static240.anInt4833 = 10000;
		Static190.anInt3890 = 0;
		Static178.anInt3536 = arg0;
		Static177.aClass144_46 = arg1;
		Static226.aBoolean305 = false;
	}
}
