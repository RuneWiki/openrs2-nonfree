import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static562 {

	@OriginalMember(owner = "client!sk", name = "o", descriptor = "I")
	public static int anInt9084;

	@OriginalMember(owner = "client!sk", name = "m", descriptor = "I")
	public static int anInt9088;

	@OriginalMember(owner = "client!sk", name = "l", descriptor = "I")
	public static int anInt9091 = -1;

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)Z")
	public static boolean method7942(@OriginalArg(0) int arg0) {
		@Pc(13) boolean local13 = true;
		if (Static492.aClass64_4 == null) {
			if (Static583.aClass223_113.method5285(Static231.anInt4485)) {
				Static492.aClass64_4 = Static691.method1246(Static583.aClass223_113, Static231.anInt4485);
			} else {
				local13 = false;
			}
		}
		if (Static41.aClass64_2 == null) {
			if (Static583.aClass223_113.method5285(Static347.anInt5922)) {
				Static41.aClass64_2 = Static691.method1246(Static583.aClass223_113, Static347.anInt5922);
			} else {
				local13 = false;
			}
		}
		if (Static12.aClass64_1 == null) {
			if (Static583.aClass223_113.method5285(Static459.anInt7964)) {
				Static12.aClass64_1 = Static691.method1246(Static583.aClass223_113, Static459.anInt7964);
			} else {
				local13 = false;
			}
		}
		if (Static419.aClass53_12 == null) {
			if (Static373.aClass223_79.method5285(Static226.anInt4399)) {
				Static419.aClass53_12 = Static287.method4708(Static226.anInt4399, Static373.aClass223_79);
			} else {
				local13 = false;
			}
		}
		if (Static540.aClass64Array2 == null) {
			if (Static583.aClass223_113.method5285(Static226.anInt4399)) {
				Static540.aClass64Array2 = Static691.method1247(Static583.aClass223_113, Static226.anInt4399);
			} else {
				local13 = false;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(ZJBII)Ljava/lang/String;")
	public static String method7943(@OriginalArg(0) boolean arg0, @OriginalArg(1) long arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) char local7 = ',';
		@Pc(9) char local9 = '.';
		if (arg2 == 0) {
			local7 = '.';
			local9 = ',';
		}
		if (arg2 == 2) {
			local9 = ' ';
		}
		@Pc(25) boolean local25 = false;
		if (arg1 < 0L) {
			local25 = true;
			arg1 = -arg1;
		}
		@Pc(47) StringBuffer local47 = new StringBuffer(26);
		@Pc(51) int local51;
		@Pc(56) int local56;
		if (arg3 > 0) {
			for (local51 = 0; local51 < arg3; local51++) {
				local56 = (int) arg1;
				arg1 /= 10L;
				local47.append((char) (local56 + 48 - (int) arg1 * 10));
			}
			local47.append(local7);
		}
		local51 = 0;
		while (true) {
			local56 = (int) arg1;
			arg1 /= 10L;
			local47.append((char) (local56 + 48 - (int) arg1 * 10));
			if (arg1 == 0L) {
				if (local25) {
					local47.append('-');
				}
				return local47.reverse().toString();
			}
			if (arg0) {
				local51++;
				if (local51 % 3 == 0) {
					local47.append(local9);
				}
			}
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILclient!cd;Ljava/lang/String;Lclient!da;Lclient!ha;Z)V")
	public static void method7944(@OriginalArg(1) Class53 arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class67 arg2, @OriginalArg(4) Class75 arg3, @OriginalArg(5) boolean arg4) {
		@Pc(17) boolean local17 = !Static457.aBoolean599 || method7942(0x2 ^ 0xFFFFFF83);
		if (!local17) {
			return;
		}
		@Pc(49) int local49;
		@Pc(58) int local58;
		if (Static457.aBoolean599 && local17) {
			@Pc(36) Class53 local36 = Static419.aClass53_12;
			@Pc(42) Class67 local42 = arg3.method6649(local36, Static540.aClass64Array2);
			local49 = local36.method814(250, arg1, (Class49[]) null);
			local58 = local36.method815((Class49[]) null, 250, arg1, local36.anInt822);
			@Pc(61) int local61 = Static41.aClass64_2.anInt1300;
			@Pc(65) int local65 = local61 + 4;
			local58 += local65 * 2;
			local49 += local65 * 2;
			if (local49 < Static513.anInt8473) {
				local49 = Static513.anInt8473;
			}
			if (local58 < Static21.anInt284) {
				local58 = Static21.anInt284;
			}
			@Pc(99) int local99 = Static331.aClass318_17.method7565(local49, Static339.anInt5789) + Static87.anInt9501;
			@Pc(109) int local109 = Static66.aClass238_2.method5892(local58, Static48.anInt6772) + Static136.anInt2650;
			if (Static93.aBoolean113) {
				local99 += Static24.method290();
				local109 += Static488.method7227();
			}
			arg3.method6714(Static12.aClass64_1, false).method8990(Static492.aClass64_4.anInt1300 + local99, local109 - -Static492.aClass64_4.anInt1297, local49 - Static492.aClass64_4.anInt1300 * 2, local58 + -(Static492.aClass64_4.anInt1297 * 2), 1, 0, 0);
			arg3.method6714(Static492.aClass64_4, true).method8997(local99, local109);
			Static492.aClass64_4.method1240();
			arg3.method6714(Static492.aClass64_4, true).method8997(local99 + local49 - local61, local109);
			Static492.aClass64_4.method1236();
			arg3.method6714(Static492.aClass64_4, true).method8997(local49 + local99 - local61, -local61 + local109 + local58);
			Static492.aClass64_4.method1240();
			arg3.method6714(Static492.aClass64_4, true).method8997(local99, local58 + local109 - local61);
			Static492.aClass64_4.method1236();
			arg3.method6714(Static41.aClass64_2, true).method8998(local99, local109 + Static492.aClass64_4.anInt1297, local61, local58 - Static492.aClass64_4.anInt1297 * 2);
			Static41.aClass64_2.method1241();
			arg3.method6714(Static41.aClass64_2, true).method8998(Static492.aClass64_4.anInt1300 + local99, local109, local49 - Static492.aClass64_4.anInt1300 * 2, local61);
			Static41.aClass64_2.method1241();
			arg3.method6714(Static41.aClass64_2, true).method8998(local99 + local49 - local61, local109 - -Static492.aClass64_4.anInt1297, local61, local58 - Static492.aClass64_4.anInt1297 * 2);
			Static41.aClass64_2.method1241();
			arg3.method6714(Static41.aClass64_2, true).method8998(Static492.aClass64_4.anInt1300 + local99, -local61 + local109 + local58, local49 - Static492.aClass64_4.anInt1300 * 2, local61);
			Static41.aClass64_2.method1241();
			local42.method8281(local109 + local65, Static274.anInt3230 | 0xFF000000, local99 + local65, (int[]) null, 1, local58 - local65 * 2, 0, 0, 1, 0, (Class49[]) null, -1, (Class1) null, local49 - local65 * 2, arg1);
			Static15.method206(local58, local49, local99, local109);
		} else {
			local49 = arg0.method814(250, arg1, (Class49[]) null);
			local58 = arg0.method823(250, (Class49[]) null, arg1) * 13;
			arg3.aa(6, 6, local49 + 4 + 4, local58 + 4 + 4, -16777216, 0);
			arg3.method6701(6, 6, local49 + 4 + 4, local58 + 8, -1, 0);
			arg2.method8281(10, -1, 10, (int[]) null, 1, local58, 0, 0, 1, 0, (Class49[]) null, -1, (Class1) null, local49, arg1);
			Static15.method206(local58 + 4 + 4, local49 + 4 + 4, 6, 6);
		}
		if (!arg4) {
			return;
		}
		try {
			if (Static93.aBoolean113) {
				Static23.method262();
			} else {
				arg3.method6638();
			}
		} catch (@Pc(470) Exception_Sub1 local470) {
		}
	}
}
