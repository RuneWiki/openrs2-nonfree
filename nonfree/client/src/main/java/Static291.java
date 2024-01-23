import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static291 {

	@OriginalMember(owner = "client!v", name = "m", descriptor = "Z")
	public static boolean aBoolean371;

	@OriginalMember(owner = "client!v", name = "g", descriptor = "Lclient!sf;")
	public static Class157 aClass157_43 = new Class157(64);

	@OriginalMember(owner = "client!v", name = "j", descriptor = "I")
	public static int anInt5632 = 1;

	@OriginalMember(owner = "client!v", name = "k", descriptor = "J")
	public static long aLong200 = 0L;

	@OriginalMember(owner = "client!v", name = "l", descriptor = "[I")
	public static int[] anIntArray537 = new int[100];

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IIILclient!w;ZI)V")
	public static void method4443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class2_Sub31 arg3, @OriginalArg(5) int arg4) {
		if (arg3.anInt5913 == -1 && arg3.anIntArray576 == null) {
			return;
		}
		@Pc(18) int local18 = 0;
		if (arg1 > arg3.anInt5930) {
			local18 = arg1 - arg3.anInt5930;
		} else if (arg3.anInt5918 > arg1) {
			local18 = arg3.anInt5918 - arg1;
		}
		if (arg2 > arg3.anInt5927) {
			local18 += arg2 - arg3.anInt5927;
		} else if (arg2 < arg3.anInt5920) {
			local18 += arg3.anInt5920 - arg2;
		}
		@Pc(81) int local81 = arg3.anInt5917 * Static201.anInt4203 >> 8;
		if (arg3.anInt5922 == 0 || local18 - 64 > arg3.anInt5922 || Static201.anInt4203 == 0 || arg0 != arg3.anInt5923) {
			if (arg3.aClass2_Sub3_Sub2_3 != null) {
				Static173.aClass2_Sub3_Sub4_2.method4662(arg3.aClass2_Sub3_Sub2_3);
				arg3.aClass2_Sub3_Sub2_3 = null;
			}
			if (arg3.aClass2_Sub3_Sub2_2 != null) {
				Static173.aClass2_Sub3_Sub4_2.method4662(arg3.aClass2_Sub3_Sub2_2);
				arg3.aClass2_Sub3_Sub2_2 = null;
			}
			return;
		}
		local18 -= 64;
		if (local18 < 0) {
			local18 = 0;
		}
		@Pc(148) int local148 = local81 * (arg3.anInt5922 - local18) / arg3.anInt5922;
		if (arg3.aClass2_Sub3_Sub2_3 != null) {
			arg3.aClass2_Sub3_Sub2_3.method426(local148);
		} else if (arg3.anInt5913 >= 0) {
			@Pc(165) Class173 local165 = Static326.method4332(Static185.aClass42_101, arg3.anInt5913, 0);
			if (local165 != null) {
				@Pc(174) Class2_Sub19_Sub1 local174 = local165.method4333().method2904(Static99.aClass23_1);
				@Pc(179) Class2_Sub3_Sub2 local179 = Static316.method401(local174, local148);
				local179.method405(-1);
				Static173.aClass2_Sub3_Sub4_2.method4657(local179);
				arg3.aClass2_Sub3_Sub2_3 = local179;
			}
		}
		if (arg3.aClass2_Sub3_Sub2_2 != null) {
			arg3.aClass2_Sub3_Sub2_2.method426(local148);
			if (!arg3.aClass2_Sub3_Sub2_2.method4742()) {
				arg3.aClass2_Sub3_Sub2_2 = null;
			}
		} else if (arg3.anIntArray576 != null && (arg3.anInt5925 -= arg4) <= 0) {
			@Pc(233) int local233 = (int) (Math.random() * (double) arg3.anIntArray576.length);
			@Pc(241) Class173 local241 = Static326.method4332(Static185.aClass42_101, arg3.anIntArray576[local233], 0);
			if (local241 != null) {
				@Pc(248) Class2_Sub19_Sub1 local248 = local241.method4333().method2904(Static99.aClass23_1);
				@Pc(253) Class2_Sub3_Sub2 local253 = Static316.method401(local248, local148);
				local253.method405(0);
				Static173.aClass2_Sub3_Sub4_2.method4657(local253);
				arg3.aClass2_Sub3_Sub2_2 = local253;
				arg3.anInt5925 = arg3.anInt5929 + (int) (Math.random() * (double) (arg3.anInt5928 - arg3.anInt5929));
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(B)V")
	public static void method4446() {
		Static287.method4466(Static199.aClass56_19);
		Static44.anInt1146++;
		if (Static71.aBoolean115 && Static189.aBoolean274) {
			@Pc(29) int local29 = Static281.anInt5551;
			@Pc(31) int local31 = Static131.anInt3016;
			local31 -= Static229.anInt4618;
			if (local31 < Static71.anInt1808) {
				local31 = Static71.anInt1808;
			}
			if (Static192.aClass56_18.anInt2057 + Static71.anInt1808 < local31 - -Static199.aClass56_19.anInt2057) {
				local31 = Static71.anInt1808 + Static192.aClass56_18.anInt2057 - Static199.aClass56_19.anInt2057;
			}
			@Pc(69) int local69 = local31 - Static13.anInt259;
			local29 -= Static215.anInt4386;
			@Pc(76) int local76 = Static199.aClass56_19.anInt2080;
			if (Static209.anInt4314 > local29) {
				local29 = Static209.anInt4314;
			}
			if (Static209.anInt4314 + Static192.aClass56_18.anInt2031 < local29 + Static199.aClass56_19.anInt2031) {
				local29 = Static192.aClass56_18.anInt2031 + Static209.anInt4314 - Static199.aClass56_19.anInt2031;
			}
			@Pc(110) int local110 = local29 - Static185.anInt5545;
			if (Static44.anInt1146 > Static199.aClass56_19.anInt2050 && (local69 > local76 || -local76 > local69 || local110 > local76 || -local76 > local110)) {
				Static40.aBoolean63 = true;
			}
			@Pc(155) int local155 = Static192.aClass56_18.anInt2063 + local31 - Static71.anInt1808;
			@Pc(163) int local163 = local29 + Static192.aClass56_18.anInt2039 - Static209.anInt4314;
			@Pc(173) Class2_Sub12 local173;
			if (Static199.aClass56_19.anObjectArray27 != null && Static40.aBoolean63) {
				local173 = new Class2_Sub12();
				local173.aClass56_6 = Static199.aClass56_19;
				local173.anObjectArray1 = Static199.aClass56_19.anObjectArray27;
				local173.anInt1524 = local163;
				local173.anInt1527 = local155;
				Static204.method3467(local173);
			}
			if (Static307.anInt5933 == 0) {
				if (Static40.aBoolean63) {
					if (Static199.aClass56_19.anObjectArray3 != null) {
						local173 = new Class2_Sub12();
						local173.aClass56_6 = Static199.aClass56_19;
						local173.aClass56_7 = Static10.aClass56_1;
						local173.anObjectArray1 = Static199.aClass56_19.anObjectArray3;
						local173.anInt1527 = local155;
						local173.anInt1524 = local163;
						Static204.method3467(local173);
					}
					if (Static10.aClass56_1 != null && Static42.method809(Static199.aClass56_19) != null) {
						Static211.aClass2_Sub16_Sub1_2.method2198(210);
						Static211.aClass2_Sub16_Sub1_2.method2143(Static199.aClass56_19.anInt2056);
						Static211.aClass2_Sub16_Sub1_2.method2186(Static199.aClass56_19.anInt2096);
						Static211.aClass2_Sub16_Sub1_2.method2184(Static10.aClass56_1.anInt2096);
						Static211.aClass2_Sub16_Sub1_2.method2143(Static10.aClass56_1.anInt2056);
					}
				} else if ((Static238.anInt5978 == 1 || Static183.method3239(Static68.anInt1741 - 1)) && Static68.anInt1741 > 2) {
					Static13.method239();
				} else if (Static68.anInt1741 > 0) {
					Static121.method2022();
				}
				Static199.aClass56_19 = null;
			}
		} else if (Static44.anInt1146 > 1) {
			Static199.aClass56_19 = null;
		}
	}
}
