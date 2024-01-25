import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static651 {

	@OriginalMember(owner = "client!w", name = "k", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_158 = new Class171(126, 1);

	@OriginalMember(owner = "client!w", name = "o", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray66 = new String[200];

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(I)I")
	public static int method8741() {
		return Static471.anInt7481 == 1 ? Static320.anInt5358 : Static516.anInt8123;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IZLjava/lang/String;Lclient!ha;Lclient!eb;Lclient!da;)V")
	public static void method8742(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class95 arg2, @OriginalArg(4) Class91 arg3, @OriginalArg(5) Class67 arg4) {
		@Pc(15) boolean local15 = !Static386.aBoolean450 || Static7.method109();
		if (!local15) {
			return;
		}
		@Pc(37) int local37;
		@Pc(46) int local46;
		if (Static386.aBoolean450 && local15) {
			@Pc(24) Class91 local24 = Static503.aClass91_11;
			@Pc(30) Class67 local30 = arg2.method8032(local24, Static434.aClass370Array1);
			local37 = local24.method1856((Class6[]) null, arg1, 250);
			local46 = local24.method1846((Class6[]) null, local24.anInt2208, 250, arg1);
			@Pc(49) int local49 = Static181.aClass370_3.anInt10491;
			@Pc(53) int local53 = local49 + 4;
			local37 += local53 * 2;
			local46 += local53 * 2;
			if (local46 < Static169.anInt3098) {
				local46 = Static169.anInt3098;
			}
			if (local37 < Static398.anInt6569) {
				local37 = Static398.anInt6569;
			}
			@Pc(87) int local87 = Static660.aClass266_13.method5919(Static95.anInt9415, local37) + Static247.anInt4363;
			@Pc(95) int local95 = Static571.aClass131_22.method3034(local46, Static195.anInt3525) + Static410.anInt6694;
			if (Static498.aBoolean757) {
				local87 += Static84.method1336();
				local95 += Static614.method8324();
			}
			arg2.method8008(Static34.aClass370_1, false).method5137(Static135.aClass370_2.anInt10491 + local87, local95 + Static135.aClass370_2.anInt10490, local37 - Static135.aClass370_2.anInt10491 * 2, local46 + -(Static135.aClass370_2.anInt10490 * 2), 1, 0, 0);
			arg2.method8008(Static135.aClass370_2, true).method5115(local87, local95);
			Static135.aClass370_2.method8603();
			arg2.method8008(Static135.aClass370_2, true).method5115(local87 + local37 - local49, local95);
			Static135.aClass370_2.method8592();
			arg2.method8008(Static135.aClass370_2, true).method5115(local37 + local87 - local49, -local49 + local95 - -local46);
			Static135.aClass370_2.method8603();
			arg2.method8008(Static135.aClass370_2, true).method5115(local87, local46 + local95 - local49);
			Static135.aClass370_2.method8592();
			arg2.method8008(Static181.aClass370_3, true).method5139(local87, local95 + Static135.aClass370_2.anInt10490, local49, local46 - Static135.aClass370_2.anInt10490 * 2);
			Static181.aClass370_3.method8598();
			arg2.method8008(Static181.aClass370_3, true).method5139(Static135.aClass370_2.anInt10491 + local87, local95, local37 - Static135.aClass370_2.anInt10491 * 2, local49);
			Static181.aClass370_3.method8598();
			arg2.method8008(Static181.aClass370_3, true).method5139(local87 + local37 - local49, local95 - -Static135.aClass370_2.anInt10490, local49, local46 - Static135.aClass370_2.anInt10490 * 2);
			Static181.aClass370_3.method8598();
			arg2.method8008(Static181.aClass370_3, true).method5139(local87 + Static135.aClass370_2.anInt10491, local46 + local95 + -local49, local37 - Static135.aClass370_2.anInt10491 * 2, local49);
			Static181.aClass370_3.method8598();
			local30.method7672(local53 + local95, local53 + local87, (Class6[]) null, (int[]) null, 1, arg1, local37 - local53 * 2, -1, 0, (Class1) null, 0, 0, Static185.anInt3405 | 0xFF000000, 1, local46 - local53 * 2);
			Static499.method6547(local46, local87, local37, local95);
		} else {
			local37 = arg3.method1856((Class6[]) null, arg1, 250);
			local46 = arg3.method1845((Class6[]) null, arg1, 250) * 13;
			arg2.aa(6, 6, local37 + 4 + 4, local46 - -4 + 4, -16777216, 0);
			arg2.method8062(6, 6, local37 + 4 + 4, local46 + 8, -1, 0);
			arg4.method7672(10, 10, (Class6[]) null, (int[]) null, 1, arg1, local37, -1, 0, (Class1) null, 0, 0, -1, 1, local46);
			Static499.method6547(local46 + 4 + 4, 6, local37 + 4 + 4, 6);
		}
		if (!arg0) {
			return;
		}
		try {
			if (Static498.aBoolean757) {
				Static90.method1504();
			} else {
				arg2.method8020();
			}
		} catch (@Pc(453) Exception_Sub1 local453) {
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIII)V")
	public static void method8744(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static424.anInt6910 = arg1;
		Static528.anInt8313 = arg0;
		Static76.anInt1481 = arg2;
		Static131.anInt2538 = arg4;
		Static93.anInt1931 = arg3;
		if (Static131.anInt2538 >= 100) {
			@Pc(28) int local28 = Static93.anInt1931 * 512 + 256;
			@Pc(34) int local34 = Static76.anInt1481 * 512 + 256;
			@Pc(42) int local42 = Static662.method8831(local34, local28, Static570.anInt9192) - Static424.anInt6910;
			@Pc(47) int local47 = local28 - Static370.anInt6266;
			@Pc(52) int local52 = local42 - Static166.anInt3034;
			@Pc(57) int local57 = local34 - Static564.anInt9117;
			@Pc(69) int local69 = (int) Math.sqrt((double) (local47 * local47 + local57 * local57));
			Static655.anInt10676 = (int) (Math.atan2((double) local52, (double) local69) * 2607.5945876176133D) & 0x3FFF;
			Static40.anInt856 = (int) (Math.atan2((double) local47, (double) local57) * -2607.5945876176133D) & 0x3FFF;
			if (Static655.anInt10676 < 1024) {
				Static655.anInt10676 = 1024;
			}
			Static325.anInt5414 = 0;
			if (Static655.anInt10676 > 3072) {
				Static655.anInt10676 = 3072;
			}
		}
		Static468.anInt7425 = -1;
		Static351.anInt6038 = -1;
		Static451.anInt7263 = 2;
	}
}
