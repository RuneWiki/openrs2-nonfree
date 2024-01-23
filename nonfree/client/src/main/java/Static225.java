import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static225 {

	@OriginalMember(owner = "client!rd", name = "W", descriptor = "[Lclient!cn;")
	public static Class34[] aClass34Array1;

	@OriginalMember(owner = "client!rd", name = "Y", descriptor = "Lclient!jd;")
	public static Class84 aClass84_102;

	@OriginalMember(owner = "client!rd", name = "bb", descriptor = "Lclient!a;")
	public static Class1 aClass1_20 = new Class1();

	@OriginalMember(owner = "client!rd", name = "cb", descriptor = "I")
	public static int anInt4698 = 0;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IZIILclient!bd;I)V")
	public static void method3777(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class15 arg3, @OriginalArg(5) int arg4) {
		if (Static151.anInt3191 >= 50 || (arg3 == null || arg3.anIntArrayArray2 == null || arg3.anIntArrayArray2.length <= arg0 || arg3.anIntArrayArray2[arg0] == null)) {
			return;
		}
		@Pc(40) int local40 = arg3.anIntArrayArray2[arg0][0];
		@Pc(46) int local46 = local40 >> 5 & 0x7;
		@Pc(50) int local50 = local40 >> 8;
		@Pc(70) int local70;
		if (arg3.anIntArrayArray2[arg0].length > 1) {
			local70 = (int) (Math.random() * (double) arg3.anIntArrayArray2[arg0].length);
			if (local70 > 0) {
				local50 = arg3.anIntArrayArray2[arg0][local70];
			}
		}
		@Pc(87) int local87 = local40 & 0x1F;
		if (local87 == 0) {
			if (arg1) {
				Static111.method2069(local50, 255, local46, 0);
			}
		} else if (Static144.anInt3122 != 0) {
			Static23.anIntArray36[Static151.anInt3191] = local50;
			Static184.anIntArray311[Static151.anInt3191] = local46;
			@Pc(116) int local116 = (arg2 - 64) / 128;
			Static219.anIntArray378[Static151.anInt3191] = 0;
			local70 = (arg4 - 64) / 128;
			Static73.aClass30Array1[Static151.anInt3191] = null;
			Static156.anIntArray488[Static151.anInt3191] = 255;
			Static63.anIntArray106[Static151.anInt3191] = local87 + (local116 << 8) + (local70 << 16);
			Static151.anInt3191++;
		}
	}

	@OriginalMember(owner = "client!rd", name = "f", descriptor = "(I)V")
	public static void method3778() {
		while (true) {
			@Pc(15) Class2_Sub7 local15 = (Class2_Sub7) Static156.aClass1_31.method3();
			if (local15 == null) {
				return;
			}
			@Pc(38) Class36_Sub3 local38;
			@Pc(29) int local29;
			if (local15.anInt946 < 0) {
				local29 = -local15.anInt946 - 1;
				if (Static11.anInt298 == local29) {
					local38 = Static111.aClass36_Sub3_Sub2_1;
				} else {
					local38 = Static212.aClass36_Sub3_Sub2Array1[local29];
				}
			} else {
				local29 = local15.anInt946 - 1;
				local38 = Static201.aClass36_Sub3_Sub1Array1[local29];
			}
			if (local38 != null) {
				@Pc(64) Class143 local64 = Static218.method3692(local15.anInt930);
				if (Static208.anInt4335 >= 3) {
				}
				@Pc(85) int local85;
				@Pc(82) int local82;
				if (local15.anInt934 == 1 || local15.anInt934 == 3) {
					local82 = local64.anInt4496;
					local85 = local64.anInt4494;
				} else {
					local82 = local64.anInt4494;
					local85 = local64.anInt4496;
				}
				@Pc(103) int local103 = local15.anInt928 + (local85 + 1 >> 1);
				@Pc(111) int local111 = local15.anInt928 + (local85 >> 1);
				@Pc(120) int local120 = local15.anInt940 + (local82 + 1 >> 1);
				@Pc(124) int[][] local124 = Static141.anIntArrayArrayArray4[Static208.anInt4335];
				@Pc(132) int local132 = local15.anInt940 + (local82 >> 1);
				@Pc(159) int local159 = local124[local103][local120] + local124[local103][local132] + local124[local111][local132] + local124[local111][local120] >> 2;
				@Pc(161) Class36 local161 = null;
				@Pc(166) int local166 = Static158.anIntArray235[local15.anInt931];
				if (local166 == 0) {
					@Pc(229) Class168 local229 = Static227.method3799(Static208.anInt4335, local15.anInt928, local15.anInt940);
					if (local229 != null) {
						local161 = local229.aClass36_10;
					}
				} else if (local166 == 1) {
					@Pc(215) Class50 local215 = Static192.method3217(Static208.anInt4335, local15.anInt928, local15.anInt940);
					if (local215 != null) {
						local161 = local215.aClass36_3;
					}
				} else if (local166 == 2) {
					@Pc(183) Class34 local183 = Static143.method2546(Static208.anInt4335, local15.anInt928, local15.anInt940);
					if (local183 != null) {
						local161 = local183.aClass36_1;
					}
				} else if (local166 == 3) {
					@Pc(201) Class65 local201 = Static96.method1832(Static208.anInt4335, local15.anInt928, local15.anInt940);
					if (local201 != null) {
						local161 = local201.aClass36_5;
					}
				}
				if (local161 != null) {
					Static212.method3618(0, Static208.anInt4335, local15.anInt933 + 1, 0, local15.anInt940, local15.anInt943 + 1, -1, local15.anInt928, local166);
					local38.anInt5108 = local159;
					local38.anObject6 = local161;
					local38.anInt5074 = local15.anInt943 + Static148.anInt3168;
					local38.anInt5072 = Static148.anInt3168 + local15.anInt933;
					local38.anInt5099 = local82 * 64 + local15.anInt940 * 128;
					local38.anInt5068 = local15.anInt928 * 128 + local85 * 64;
					@Pc(299) int local299 = local15.anInt942;
					@Pc(302) int local302 = local15.anInt938;
					@Pc(305) int local305 = local15.anInt935;
					@Pc(315) int local315;
					if (local305 < local299) {
						local315 = local299;
						local299 = local305;
						local305 = local315;
					}
					local38.anInt5101 = local305 + local15.anInt928;
					local38.anInt5084 = local299 + local15.anInt928;
					@Pc(334) int local334 = local15.anInt944;
					if (local334 < local302) {
						local315 = local302;
						local302 = local334;
						local334 = local315;
					}
					local38.anInt5094 = local302 + local15.anInt940;
					local38.anInt5141 = local15.anInt940 + local334;
				}
			}
		}
	}
}
