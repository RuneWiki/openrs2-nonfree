import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static482 {

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method7394(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % (long) 37 == 0L) {
			return null;
		} else {
			@Pc(30) int local30 = 0;
			for (@Pc(32) long local32 = arg0; local32 != 0L; local32 /= 37L) {
				local30++;
			}
			@Pc(47) StringBuffer local47 = new StringBuffer(local30);
			while (arg0 != 0L) {
				@Pc(50) long local50 = arg0;
				arg0 /= 37L;
				local47.append(Static508.aCharArray10[(int) (local50 - arg0 * 37L)]);
			}
			return local47.reverse().toString();
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(BIILclient!kq;Lclient!oa;Lclient!dt;)Z")
	public static boolean method7395(@OriginalArg(3) Class3_Sub32 arg0, @OriginalArg(4) Class15 arg1, @OriginalArg(5) Class70 arg2) {
		@Pc(5) int local5 = Integer.MAX_VALUE;
		@Pc(12) int local12 = Integer.MIN_VALUE;
		@Pc(14) int local14 = Integer.MAX_VALUE;
		@Pc(16) int local16 = Integer.MIN_VALUE;
		if (arg2.anIntArray119 != null) {
			local16 = Static87.anInt6921 - (arg0.anInt5916 + arg2.anInt2388 - Static87.anInt6927) * (-Static87.anInt6920 + Static87.anInt6921) / (Static87.anInt6923 - Static87.anInt6927);
			local5 = (arg0.anInt5917 + arg2.anInt2371 - Static87.anInt6926) * (Static87.anInt6917 - Static87.anInt6918) / (Static87.anInt6922 - Static87.anInt6926) + Static87.anInt6918;
			local14 = Static87.anInt6921 - (arg2.anInt2400 + arg0.anInt5916 - Static87.anInt6927) * (Static87.anInt6921 - Static87.anInt6920) / (Static87.anInt6923 - Static87.anInt6927);
			local12 = (Static87.anInt6917 - Static87.anInt6918) * (arg0.anInt5917 + arg2.anInt2389 - Static87.anInt6926) / (Static87.anInt6922 - Static87.anInt6926) + Static87.anInt6918;
		}
		@Pc(103) Class37 local103 = null;
		@Pc(105) int local105 = 0;
		@Pc(107) int local107 = 0;
		@Pc(109) int local109 = 0;
		@Pc(111) int local111 = 0;
		if (arg2.anInt2378 != -1) {
			if (arg0.aBoolean509 && arg2.anInt2380 != -1) {
				local103 = arg2.method2140(arg1, true);
			} else {
				local103 = arg2.method2140(arg1, false);
			}
			if (local103 != null) {
				local105 = arg0.anInt5920 - (local103.AA() + 1 >> 1);
				local107 = arg0.anInt5920 + (local103.AA() + 1 >> 1);
				if (local105 < local5) {
					local5 = local105;
				}
				local109 = arg0.anInt5922 - (local103.a() + 1 >> 1);
				if (local107 > local12) {
					local12 = local107;
				}
				local111 = arg0.anInt5922 + (local103.a() + 1 >> 1);
				if (local14 > local109) {
					local14 = local109;
				}
				if (local111 > local16) {
					local16 = local111;
				}
			}
		}
		@Pc(209) Class247 local209 = null;
		@Pc(211) int local211 = 0;
		@Pc(213) int local213 = 0;
		@Pc(215) int local215 = 0;
		@Pc(217) int local217 = 0;
		@Pc(219) int local219 = 0;
		@Pc(221) int local221 = 0;
		@Pc(223) int local223 = 0;
		@Pc(272) int local272;
		@Pc(294) int local294;
		if (arg2.aString30 != null) {
			local209 = Static139.method2840(arg2.anInt2382);
			if (local209 != null) {
				local211 = Static200.aClass297_9.method7320(null, null, Static350.aStringArray26, arg2.aString30);
				local213 = arg0.anInt5922;
				if (local103 == null) {
					local213 -= local211 * local209.method6141() / 2;
				} else {
					local213 -= (local103.a() >> 1) + (local209.method6143() * local211);
				}
				for (local272 = 0; local272 < local211; local272++) {
					@Pc(277) String local277 = Static350.aStringArray26[local272];
					if (local272 < local211 - 1) {
						local277 = local277.substring(0, local277.length() - 4);
					}
					local294 = local209.method6144(local277);
					if (local215 < local294) {
						local215 = local294;
					}
				}
				local217 = arg0.anInt5920 - local215 / 2;
				if (local217 < local5) {
					local5 = local217;
				}
				local219 = arg0.anInt5920 + local215 / 2;
				if (local12 < local219) {
					local12 = local219;
				}
				local221 = local213;
				local223 = local213 + local211 * local209.method6143();
				if (local14 > local221) {
					local14 = local221;
				}
				if (local223 > local16) {
					local16 = local223;
				}
			}
		}
		if (Static87.anInt6918 > local12 || local5 > Static87.anInt6917 || local16 < Static87.anInt6920 || Static87.anInt6921 < local14) {
			return true;
		}
		@Pc(409) int local409;
		if (arg2.anIntArray119 != null) {
			@Pc(407) int[] local407 = new int[arg2.anIntArray119.length];
			for (local409 = 0; local409 < local407.length / 2; local409++) {
				local294 = arg0.anInt5917 + arg2.anIntArray119[local409 * 2];
				@Pc(432) int local432 = arg2.anIntArray119[local409 * 2 + 1] + arg0.anInt5916;
				local407[local409 * 2] = Static87.anInt6918 + (local294 - Static87.anInt6926) * (-Static87.anInt6918 + Static87.anInt6917) / (Static87.anInt6922 - Static87.anInt6926);
				local407[local409 * 2 + 1] = Static87.anInt6921 - (local432 - Static87.anInt6927) * (-Static87.anInt6920 + Static87.anInt6921) / (Static87.anInt6923 - Static87.anInt6927);
			}
			Static371.method6060(arg1, local407, arg2.anInt2386);
			for (local294 = 0; local294 < local407.length / 2 - 1; local294++) {
				arg1.method5287(local407[local294 * 2], local407[local294 * 2 + 2], local407[(local294 + 1) * 2 + 1], arg2.anInt2394, local407[local294 * 2 + 1]);
			}
			arg1.method5287(local407[local407.length - 2], local407[0], local407[1], arg2.anInt2394, local407[local407.length - 1]);
		}
		if (local103 != null) {
			if (Static568.anInt10054 > 0 && (Static407.anInt8012 != -1 && arg0.anInt5918 == Static407.anInt8012 || Static296.anInt6027 != -1 && arg2.anInt2390 == Static296.anInt6027)) {
				if (Static338.anInt6970 > 50) {
					local272 = 200 - Static338.anInt6970 * 2;
				} else {
					local272 = Static338.anInt6970 * 2;
				}
				local409 = local272 << 24 | 0xFFFF00;
				arg1.method5306(arg0.anInt5920, arg0.anInt5922, local103.QA() / 2 + 7, local409);
				arg1.method5306(arg0.anInt5920, arg0.anInt5922, local103.QA() / 2 + 5, local409);
				arg1.method5306(arg0.anInt5920, arg0.anInt5922, local103.QA() / 2 + 3, local409);
				arg1.method5306(arg0.anInt5920, arg0.anInt5922, local103.QA() / 2 + 1, local409);
				arg1.method5306(arg0.anInt5920, arg0.anInt5922, local103.QA() / 2, local409);
			}
			local103.method7076(arg0.anInt5920 - (local103.AA() >> 1), arg0.anInt5922 + -(local103.a() >> 1));
		}
		if (arg2.aString30 != null && local209 != null) {
			Static310.method5171(local215, local209, arg1, local211, arg0, local213, arg2);
		}
		if (arg2.anInt2378 != -1 || arg2.aString30 != null) {
			@Pc(713) Class3_Sub22 local713 = new Class3_Sub22(arg0);
			local713.anInt4438 = local223;
			local713.anInt4429 = local221;
			local713.anInt4430 = local217;
			local713.anInt4433 = local111;
			local713.anInt4432 = local105;
			local713.anInt4431 = local107;
			local713.anInt4428 = local109;
			local713.anInt4434 = local219;
			Static493.aClass183_55.method4792(local713);
		}
		return false;
	}
}
