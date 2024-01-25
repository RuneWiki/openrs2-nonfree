import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!am", name = "q", descriptor = "Lclient!eu;")
	public static Class97 aClass97_1;

	@OriginalMember(owner = "client!am", name = "p", descriptor = "I")
	public static int anInt510 = -1;

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Lclient!da;Lclient!ha;Lclient!eia;ZILjava/lang/String;)V")
	public static void method603(@OriginalArg(0) Class69 arg0, @OriginalArg(1) Class13 arg1, @OriginalArg(2) Class88 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) String arg4) {
		@Pc(12) boolean local12 = !Static154.aBoolean234 || Static79.method1516();
		if (!local12) {
			return;
		}
		@Pc(39) int local39;
		@Pc(48) int local48;
		if (Static154.aBoolean234 && local12) {
			@Pc(26) Class88 local26 = Static294.aClass88_16;
			@Pc(32) Class69 local32 = arg1.method8515(local26, Static103.aClass97Array1);
			local39 = local26.method2507(arg4, 250, (Class33[]) null);
			local48 = local26.method2510(250, arg4, (Class33[]) null, local26.anInt2723);
			@Pc(51) int local51 = Static677.aClass97_3.anInt2963;
			@Pc(55) int local55 = local51 + 4;
			local39 += local55 * 2;
			local48 += local55 * 2;
			if (Static648.anInt10269 > local48) {
				local48 = Static648.anInt10269;
			}
			if (local39 < Static479.anInt7949) {
				local39 = Static479.anInt7949;
			}
			@Pc(86) int local86 = Static493.aClass356_13.method8711(local39, Static33.anInt10742) + Static366.anInt5928;
			@Pc(94) int local94 = Static136.aClass56_2.method1354(Static602.anInt9666, local48) + Static87.anInt1693;
			if (Static82.aBoolean134) {
				local86 += Static31.method748();
				local94 += Static147.method2738();
			}
			arg1.method8465(Static411.aClass97_2, false).method7642(aClass97_1.anInt2963 + local86, aClass97_1.anInt2960 + local94, local39 - aClass97_1.anInt2963 * 2, local48 - aClass97_1.anInt2960 * 2, 1, 0, 0);
			arg1.method8465(aClass97_1, true).method7654(local86, local94);
			aClass97_1.method2746();
			arg1.method8465(aClass97_1, true).method7654(local86 + local39 - local51, local94);
			aClass97_1.method2753();
			arg1.method8465(aClass97_1, true).method7654(local39 + local86 - local51, local48 + (local94 - local51));
			aClass97_1.method2746();
			arg1.method8465(aClass97_1, true).method7654(local86, local48 + local94 - local51);
			aClass97_1.method2753();
			arg1.method8465(Static677.aClass97_3, true).method7663(local86, aClass97_1.anInt2960 + local94, local51, local48 - aClass97_1.anInt2960 * 2);
			Static677.aClass97_3.method2752();
			arg1.method8465(Static677.aClass97_3, true).method7663(aClass97_1.anInt2963 + local86, local94, local39 - aClass97_1.anInt2963 * 2, local51);
			Static677.aClass97_3.method2752();
			arg1.method8465(Static677.aClass97_3, true).method7663(local39 + local86 - local51, aClass97_1.anInt2960 + local94, local51, local48 - aClass97_1.anInt2960 * 2);
			Static677.aClass97_3.method2752();
			arg1.method8465(Static677.aClass97_3, true).method7663(aClass97_1.anInt2963 + local86, -local51 + local94 + local48, local39 - aClass97_1.anInt2963 * 2, local51);
			Static677.aClass97_3.method2752();
			local32.method8853(arg4, 0, 0, (Class33[]) null, local55 + local86, Static365.anInt5854 | 0xFF000000, 1, local39 - local55 * 2, local48 + -(local55 * 2), 0, 1, -1, (Class1) null, (int[]) null, local94 + local55);
			Static609.method8658(local86, local48, local94, local39);
		} else {
			local39 = arg2.method2507(arg4, 250, (Class33[]) null);
			local48 = arg2.method2503((Class33[]) null, arg4, 250) * 13;
			arg1.aa(6, 6, local39 + 4 + 4, local48 + 4 - -4, -16777216, 0);
			arg1.method8511(6, 6, local39 + 4 + 4, 4 + 4 + local48, -1, 0);
			arg0.method8853(arg4, 0, 0, (Class33[]) null, 10, -1, 1, local39, local48, 0, 1, -1, (Class1) null, (int[]) null, 10);
			Static609.method8658(6, local48 + 4 + 4, 6, local39 + 8);
		}
		if (!arg3) {
			return;
		}
		try {
			if (Static82.aBoolean134) {
				Static567.method5369();
			} else {
				arg1.method8518();
			}
		} catch (@Pc(444) Exception_Sub1 local444) {
		}
	}
}
