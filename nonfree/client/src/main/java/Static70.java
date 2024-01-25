import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!df", name = "b", descriptor = "Z")
	public static boolean aBoolean129 = false;

	@OriginalMember(owner = "client!df", name = "h", descriptor = "Lclient!hb;")
	public static final Class92 aClass92_54 = new Class92(45, 3);

	@OriginalMember(owner = "client!df", name = "i", descriptor = "I")
	public static int anInt1610 = -1;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIBIIIIIIIIII)V")
	public static void method1309(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		if (Static120.aClass64Array1 == null) {
			return;
		}
		@Pc(25) Class1_Sub3_Sub3 local25;
		@Pc(16) int local16;
		if (arg0 < 0) {
			local16 = -arg0 - 1;
			if (Static177.anInt3617 == local16) {
				local25 = Static113.aClass1_Sub3_Sub3_Sub1_4;
			} else {
				local25 = Static308.aClass1_Sub3_Sub3_Sub1Array1[local16];
			}
		} else {
			local16 = arg0 - 1;
			local25 = Static451.aClass1_Sub3_Sub3_Sub2Array1[local16];
		}
		if (local25 == null) {
			return;
		}
		@Pc(47) Class128 local47 = Static55.aClass25_1.method855(arg1);
		@Pc(59) int local59;
		@Pc(56) int local56;
		if (arg3 == 1 || arg3 == 3) {
			local59 = local47.anInt4036;
			local56 = local47.anInt4004;
		} else {
			local56 = local47.anInt4036;
			local59 = local47.anInt4004;
		}
		@Pc(72) int local72 = (local59 >> 1) + arg10;
		@Pc(81) int local81 = arg10 + (local59 + 1 >> 1);
		@Pc(87) int local87 = (local56 >> 1) + arg6;
		@Pc(95) int local95 = arg6 + (local56 + 1 >> 1);
		@Pc(99) Class64 local99 = Static120.aClass64Array1[arg5];
		@Pc(122) int local122 = local99.I(local72, local87) + local99.I(local81, local87) + local99.I(local72, local95) + local99.I(local81, local95) >> 2;
		@Pc(126) Class3_Sub11 local126 = new Class3_Sub11();
		local126.anInt1465 = local25.aByte77;
		@Pc(135) int local135;
		if (arg8 < arg4) {
			local135 = arg4;
			arg4 = arg8;
			arg8 = local135;
		}
		local126.anInt1466 = arg1;
		local126.anInt1451 = Static290.anInt5325 + arg9;
		local126.anInt1461 = arg11;
		local126.anInt1452 = arg3;
		local126.anInt1467 = arg2 + Static290.anInt5325;
		local126.anInt1459 = arg6;
		local126.anInt1457 = arg10;
		if (arg12 > arg7) {
			local135 = arg12;
			arg12 = arg7;
			arg7 = local135;
		}
		local126.anInt1462 = arg8 + arg10;
		local126.anInt1453 = arg4 + arg10;
		local126.anInt1455 = (local59 << 6) + (local126.anInt1457 << 7);
		local126.anInt1460 = arg12 + arg6;
		local126.anInt1456 = arg7 + arg6;
		local126.anInt1463 = (local126.anInt1459 << 7) + (local56 << 6);
		local126.anInt1454 = local122;
		Static207.aClass229_27.method5321(local126);
		local25.aClass3_Sub11_3 = local126;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(B)V")
	public static void method1310() {
		Static35.aClass229_36.method5326();
		for (@Pc(13) Class3_Sub38 local13 = (Class3_Sub38) Static374.aClass229_41.method5328(); local13 != null; local13 = (Class3_Sub38) Static374.aClass229_41.method5325()) {
			if (local13.anInt6532 < 1000) {
				local13.method5987();
				Static35.aClass229_36.method5321(local13);
			}
		}
		Static35.aClass229_36.method5322(Static374.aClass229_41);
		@Pc(47) int local47 = -1;
		@Pc(54) Class3_Sub1 local54 = (Class3_Sub1) Static274.aClass229_31.method5328();
		if (local54 != null) {
			local47 = local54.method4772();
		}
		if (!Static378.aBoolean462) {
			if (local47 == 0 && (Static62.anInt1469 == 1 && Static169.anInt3551 > 2 || Static336.method4873())) {
				local47 = 2;
			}
			if (local47 == 2 && Static169.anInt3551 > 0 && local54 != null) {
				if (Static435.aClass68_14 == null && Static167.anInt6467 == 0) {
					Static438.method5861(local54.method4775(), local54.method4777());
				} else {
					Static390.anInt6740 = 2;
				}
			}
			if (local47 == 0 && Static169.anInt3551 > 0) {
				Static17.method515();
			}
			if (Static435.aClass68_14 == null && Static167.anInt6467 == 0) {
				Static419.aClass3_Sub38_2 = null;
				Static390.anInt6740 = 0;
				return;
			}
			return;
		}
		@Pc(130) int local130;
		@Pc(134) int local134;
		if (local47 == -1) {
			local130 = Static155.aClass74_1.method1870();
			local134 = Static155.aClass74_1.method1865();
			if (local130 < Static67.anInt1556 - 10 || Static283.anInt5203 + Static67.anInt1556 + 10 < local130 || Static153.anInt3319 - 10 > local134 || local134 > Static153.anInt3319 + Static318.anInt3229 + 10) {
				Static378.aBoolean462 = false;
				Static63.method5248(Static318.anInt3229, Static153.anInt3319, Static67.anInt1556, Static283.anInt5203);
			}
		}
		if (local47 != 0) {
			return;
		}
		local130 = Static67.anInt1556;
		local134 = Static153.anInt3319;
		@Pc(192) int local192 = Static283.anInt5203;
		@Pc(198) int local198 = local54.method4777();
		@Pc(202) int local202 = local54.method4775();
		@Pc(204) int local204 = -1;
		@Pc(222) int local222;
		for (@Pc(206) int local206 = 0; local206 < Static169.anInt3551; local206++) {
			if (Static126.aBoolean275) {
				local222 = local134 + (-local206 + (Static169.anInt3551 - 1)) * 16 + 33;
				if (local198 > local130 && local198 < local192 + local130 && local202 > local222 - 13 && local222 + 4 > local202) {
					local204 = local206;
				}
			} else {
				local222 = (Static169.anInt3551 - local206 - 1) * 16 + local134 + 31;
				if (local130 < local198 && local198 < local192 + local130 && local202 > local222 - 13 && local202 < local222 + 3) {
					local204 = local206;
				}
			}
		}
		if (local204 != -1) {
			local222 = 0;
			@Pc(314) Class162 local314 = new Class162(Static374.aClass229_41);
			for (@Pc(319) Class3_Sub38 local319 = (Class3_Sub38) local314.method3884(); local319 != null; local319 = (Class3_Sub38) local314.method3885()) {
				if (local222 == local204) {
					Static421.method3680(local319, local198, local202);
				}
				local222++;
			}
		}
		Static378.aBoolean462 = false;
		Static63.method5248(Static318.anInt3229, Static153.anInt3319, Static67.anInt1556, Static283.anInt5203);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(II)Z")
	public static boolean method1311(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method1312(@OriginalArg(0) long arg0) {
		Static78.aCalendar1.setTime(new Date(arg0));
		@Pc(13) int local13 = Static78.aCalendar1.get(7);
		@Pc(17) int local17 = Static78.aCalendar1.get(5);
		@Pc(21) int local21 = Static78.aCalendar1.get(2);
		@Pc(25) int local25 = Static78.aCalendar1.get(1);
		@Pc(29) int local29 = Static78.aCalendar1.get(11);
		@Pc(33) int local33 = Static78.aCalendar1.get(12);
		@Pc(37) int local37 = Static78.aCalendar1.get(13);
		return Static168.aStringArray75[local13 - 1] + ", " + local17 / 10 + local17 % 10 + "-" + Static265.aStringArray111[local21] + "-" + local25 + " " + local29 / 10 + local29 % 10 + ":" + local33 / 10 + local33 % 10 + ":" + local37 / 10 + local37 % 10 + " GMT";
	}
}
