import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static625 {

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "I")
	public static int anInt10104;

	@OriginalMember(owner = "client!wg", name = "g", descriptor = "Lclient!eq;")
	public static Class97 aClass97_153;

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "[I")
	public static final int[] anIntArray722 = new int[] { 3500, 200 };

	@OriginalMember(owner = "client!wg", name = "e", descriptor = "[[B")
	public static final byte[][] aByteArrayArray27 = new byte[1000][];

	@OriginalMember(owner = "client!wg", name = "f", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_178 = new Class274(10, 6);

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)V")
	public static void method8452() {
		for (@Pc(12) int local12 = 0; local12 < Static549.anInt9102; local12++) {
			@Pc(18) int local18 = Static105.anIntArray190[local12];
			@Pc(26) Class11_Sub1_Sub1_Sub2_Sub2 local26 = ((Class2_Sub51) Static357.aClass222_23.method5468((long) local18)).aClass11_Sub1_Sub1_Sub2_Sub2_2;
			@Pc(30) int local30 = Static313.aClass2_Sub34_Sub2_1.method6904();
			if ((local30 & 0x8) != 0) {
				local30 += Static313.aClass2_Sub34_Sub2_1.method6904() << 8;
			}
			@Pc(50) int local50;
			if ((local30 & 0x400) != 0) {
				local50 = Static313.aClass2_Sub34_Sub2_1.method6911();
				local26.anInt3286 = Static313.aClass2_Sub34_Sub2_1.method6867();
				local26.anInt3207 = Static313.aClass2_Sub34_Sub2_1.method6867();
				local26.aBoolean277 = (local50 & 0x8000) != 0;
				local26.anInt3219 = local50 & 0x7FFF;
				local26.anInt3276 = local26.anInt3286 + local26.anInt3219 + Static325.anInt5888;
			}
			if ((local30 & 0x2000) != 0) {
				local26.anInt3209 = Static313.aClass2_Sub34_Sub2_1.method6917();
				local26.anInt3261 = Static313.aClass2_Sub34_Sub2_1.method6917();
				local26.anInt3287 = Static313.aClass2_Sub34_Sub2_1.method6905();
				local26.anInt3291 = Static313.aClass2_Sub34_Sub2_1.method6873();
				local26.anInt3220 = Static313.aClass2_Sub34_Sub2_1.method6859() + Static325.anInt5888;
				local26.anInt3274 = Static313.aClass2_Sub34_Sub2_1.method6879() + Static325.anInt5888;
				local26.anInt3289 = Static313.aClass2_Sub34_Sub2_1.method6909();
				local26.anInt3261 += local26.anIntArray233[0];
				local26.anInt3287 += local26.anIntArray232[0];
				local26.anInt3296 = 1;
				local26.anInt3291 += local26.anIntArray233[0];
				local26.anInt3209 += local26.anIntArray232[0];
				local26.anInt3294 = 0;
			}
			@Pc(180) int local180;
			@Pc(189) int local189;
			@Pc(193) int local193;
			@Pc(199) int local199;
			if ((local30 & 0x4000) != 0) {
				local50 = Static313.aClass2_Sub34_Sub2_1.method6879();
				local180 = Static313.aClass2_Sub34_Sub2_1.method6893();
				if (local50 == 65535) {
					local50 = -1;
				}
				local189 = Static313.aClass2_Sub34_Sub2_1.method6919();
				local193 = local189 & 0x7;
				local199 = local189 >> 3 & 0xF;
				if (local199 == 15) {
					local199 = -1;
				}
				local26.method2760(local193, local50, local199, true, local180);
			}
			if ((local30 & 0x2) != 0) {
				@Pc(221) int[] local221 = new int[4];
				for (local180 = 0; local180 < 4; local180++) {
					local221[local180] = Static313.aClass2_Sub34_Sub2_1.method6859();
					if (local221[local180] == 65535) {
						local221[local180] = -1;
					}
				}
				local189 = Static313.aClass2_Sub34_Sub2_1.method6867();
				Static577.method8014(local221, local26, local189);
			}
			if ((local30 & 0x800) != 0) {
				local26.aByte61 = Static313.aClass2_Sub34_Sub2_1.method6873();
				local26.aByte62 = Static313.aClass2_Sub34_Sub2_1.method6905();
				local26.aByte63 = Static313.aClass2_Sub34_Sub2_1.method6873();
				local26.aByte60 = (byte) Static313.aClass2_Sub34_Sub2_1.method6909();
				local26.anInt3271 = Static325.anInt5888 + Static313.aClass2_Sub34_Sub2_1.method6884();
				local26.anInt3228 = Static325.anInt5888 + Static313.aClass2_Sub34_Sub2_1.method6911();
			}
			if ((local30 & 0x80) != 0) {
				local50 = Static313.aClass2_Sub34_Sub2_1.method6863();
				local180 = Static313.aClass2_Sub34_Sub2_1.method6909();
				local26.method2766(local180, Static325.anInt5888, local50);
				local26.anInt3267 = Static325.anInt5888 + 300;
				local26.anInt3260 = Static313.aClass2_Sub34_Sub2_1.method6919();
			}
			if ((local30 & 0x40) != 0) {
				local26.aString33 = Static313.aClass2_Sub34_Sub2_1.method6903();
				local26.anInt3249 = 100;
			}
			@Pc(364) int local364;
			@Pc(350) int[] local350;
			@Pc(353) int[] local353;
			if ((local30 & 0x100) != 0) {
				local50 = Static313.aClass2_Sub34_Sub2_1.method6909();
				local350 = new int[local50];
				local353 = new int[local50];
				@Pc(356) int[] local356 = new int[local50];
				for (local199 = 0; local199 < local50; local199++) {
					local364 = Static313.aClass2_Sub34_Sub2_1.method6859();
					if (local364 == 65535) {
						local364 = -1;
					}
					local350[local199] = local364;
					local353[local199] = Static313.aClass2_Sub34_Sub2_1.method6909();
					local356[local199] = Static313.aClass2_Sub34_Sub2_1.method6879();
				}
				Static219.method3762(local353, local26, local356, local350);
			}
			if ((local30 & 0x200) != 0) {
				local50 = Static313.aClass2_Sub34_Sub2_1.method6904();
				local350 = new int[local50];
				local353 = new int[local50];
				for (local193 = 0; local193 < local50; local193++) {
					local199 = Static313.aClass2_Sub34_Sub2_1.method6884();
					if ((local199 & 0xC000) == 49152) {
						local364 = Static313.aClass2_Sub34_Sub2_1.method6911();
						local350[local193] = local364 | local199 << 16;
					} else {
						local350[local193] = local199;
					}
					local353[local193] = Static313.aClass2_Sub34_Sub2_1.method6884();
				}
				local26.method2779(local350, local353);
			}
			if ((local30 & 0x20) != 0) {
				local26.anInt3278 = Static313.aClass2_Sub34_Sub2_1.method6911();
				if (local26.anInt3278 == 65535) {
					local26.anInt3278 = -1;
				}
			}
			if ((local30 & 0x1) != 0) {
				local50 = Static313.aClass2_Sub34_Sub2_1.method6859();
				if (local50 == 65535) {
					local50 = -1;
				}
				local180 = Static313.aClass2_Sub34_Sub2_1.method6865();
				local189 = Static313.aClass2_Sub34_Sub2_1.method6904();
				local193 = local189 & 0x7;
				local199 = local189 >> 3 & 0xF;
				if (local199 == 15) {
					local199 = -1;
				}
				local26.method2760(local193, local50, local199, false, local180);
			}
			if ((local30 & 0x1000) != 0) {
				local50 = Static313.aClass2_Sub34_Sub2_1.method6863();
				local180 = Static313.aClass2_Sub34_Sub2_1.method6867();
				local26.method2766(local180, Static325.anInt5888, local50);
			}
			if ((local30 & 0x4) != 0) {
				if (local26.aClass236_1.method5781()) {
					Static206.method3598(local26);
				}
				local26.method2785(Static341.aClass76_1.method1676(Static313.aClass2_Sub34_Sub2_1.method6879()));
				local26.method2767(local26.aClass236_1.anInt6892);
				local26.anInt3206 = local26.aClass236_1.anInt6901 << 3;
				if (local26.aClass236_1.method5781()) {
					Static541.method7595(local26.aByte124, local26, null, null, 0, local26.anIntArray233[0], local26.anIntArray232[0]);
				}
			}
			if ((local30 & 0x10) != 0) {
				local26.anInt3305 = Static313.aClass2_Sub34_Sub2_1.method6859();
				local26.anInt3297 = Static313.aClass2_Sub34_Sub2_1.method6859();
			}
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIBI)V")
	public static void method8454(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		Static299.anInt5573 = arg0;
		Static259.anInt5081 = arg3;
		Static597.anInt9840 = arg1;
		Static556.anInt9172 = arg2;
		Static126.anInt2936 = arg4;
		if (Static126.anInt2936 >= 100) {
			@Pc(28) int local28 = Static556.anInt9172 * 512 + 256;
			@Pc(34) int local34 = Static597.anInt9840 * 512 + 256;
			@Pc(42) int local42 = Static582.method8038(Static16.anInt308, local28, local34) - Static299.anInt5573;
			@Pc(47) int local47 = local28 - Static53.anInt1153;
			@Pc(52) int local52 = local42 - Static64.anInt1371;
			@Pc(57) int local57 = local34 - Static395.anInt3530;
			@Pc(68) int local68 = (int) Math.sqrt((double) (local57 * local57 + local47 * local47));
			Static512.anInt8589 = (int) (Math.atan2((double) local52, (double) local68) * 2607.5945876176133D) & 0x3FFF;
			Static105.anInt2114 = (int) (-2607.5945876176133D * Math.atan2((double) local47, (double) local57)) & 0x3FFF;
			Static103.anInt2093 = 0;
			if (Static512.anInt8589 < 1024) {
				Static512.anInt8589 = 1024;
			}
			if (Static512.anInt8589 > 3072) {
				Static512.anInt8589 = 3072;
			}
		}
		Static2.anInt31 = 2;
		Static644.anInt10296 = -1;
		Static23.anInt718 = -1;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZZ)Z")
	public static boolean method8455(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		return arg0 | arg1;
	}
}
