import java.awt.Component;
import java.lang.reflect.Constructor;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!iaa", name = "h", descriptor = "I")
	public static int anInt4004;

	@OriginalMember(owner = "client!iaa", name = "g", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_54 = new Class98(52, 8);

	@OriginalMember(owner = "client!iaa", name = "s", descriptor = "I")
	public static int anInt4015 = 0;

	@OriginalMember(owner = "client!iaa", name = "A", descriptor = "[Lclient!rs;")
	public static final Class6_Sub5_Sub15[] aClass6_Sub5_Sub15Array9 = new Class6_Sub5_Sub15[14];

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(ZJ)Ljava/lang/String;")
	public static String method3436(@OriginalArg(1) long arg0) {
		Static425.aCalendar2.setTime(new Date(arg0));
		@Pc(13) int local13 = Static425.aCalendar2.get(7);
		@Pc(17) int local17 = Static425.aCalendar2.get(5);
		@Pc(26) int local26 = Static425.aCalendar2.get(2);
		@Pc(30) int local30 = Static425.aCalendar2.get(1);
		@Pc(34) int local34 = Static425.aCalendar2.get(11);
		@Pc(38) int local38 = Static425.aCalendar2.get(12);
		@Pc(42) int local42 = Static425.aCalendar2.get(13);
		return Static493.aStringArray36[local13 - 1] + ", " + local17 / 10 + local17 % 10 + "-" + Static141.aStringArray13[local26] + "-" + local30 + " " + local34 / 10 + local34 % 10 + ":" + local38 / 10 + local38 % 10 + ":" + local42 / 10 + local42 % 10 + " GMT";
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(I)V")
	public static void method3439() {
		if (Static140.anInt2734 == -1 || Static89.anInt1491 == -1) {
			return;
		}
		@Pc(23) int local23 = ((Static86.anInt10003 - Static152.anInt1935) * Static60.anInt1009 >> 16) + Static152.anInt1935;
		Static60.anInt1009 += local23;
		if (Static60.anInt1009 < 65535) {
			Static551.aBoolean656 = false;
			Static264.aBoolean350 = false;
		} else {
			Static60.anInt1009 = 65535;
			if (Static264.aBoolean350) {
				Static551.aBoolean656 = false;
			} else {
				Static551.aBoolean656 = true;
			}
			Static264.aBoolean350 = true;
		}
		@Pc(59) float local59 = (float) Static60.anInt1009 / 65535.0F;
		@Pc(62) float[] local62 = new float[3];
		@Pc(66) int local66 = Static153.anInt2863 * 2;
		@Pc(92) int local92;
		@Pc(125) int local125;
		@Pc(133) int local133;
		@Pc(138) int local138;
		@Pc(146) int local146;
		@Pc(165) int local165;
		for (@Pc(68) int local68 = 0; local68 < 3; local68++) {
			@Pc(80) int local80 = Static351.anIntArrayArrayArray10[Static140.anInt2734][local66][local68] * 3;
			local92 = Static351.anIntArrayArrayArray10[Static140.anInt2734][local66 + 1][local68] * 3;
			local125 = (Static351.anIntArrayArrayArray10[Static140.anInt2734][local66 + 2][local68] + Static351.anIntArrayArrayArray10[Static140.anInt2734][local66 + 2][local68] - Static351.anIntArrayArrayArray10[Static140.anInt2734][local66 + 3][local68]) * 3;
			local133 = Static351.anIntArrayArrayArray10[Static140.anInt2734][local66][local68];
			local138 = local92 - local80;
			local146 = local125 + local80 - local92 * 2;
			local165 = Static351.anIntArrayArrayArray10[Static140.anInt2734][local66 + 2][local68] + local92 - local133 - local125;
			local62[local68] = (float) local133 + local59 * (((float) local146 + local59 * (float) local165) * local59 + (float) local138);
		}
		Static378.anInt6923 = (int) local62[0] - Static150.anInt2792 * 512;
		Static208.anInt3949 = (int) local62[2] - Static154.anInt2878 * 512;
		Static12.anInt183 = (int) local62[1] * -1;
		@Pc(221) float[] local221 = new float[3];
		local92 = Static331.anInt6257 * 2;
		for (local125 = 0; local125 < 3; local125++) {
			local133 = Static351.anIntArrayArrayArray10[Static89.anInt1491][local92][local125] * 3;
			local138 = Static351.anIntArrayArrayArray10[Static89.anInt1491][local92 + 1][local125] * 3;
			local146 = (Static351.anIntArrayArrayArray10[Static89.anInt1491][local92 + 2][local125] + Static351.anIntArrayArrayArray10[Static89.anInt1491][local92 + 2][local125] - Static351.anIntArrayArrayArray10[Static89.anInt1491][local92 + 3][local125]) * 3;
			local165 = Static351.anIntArrayArrayArray10[Static89.anInt1491][local92][local125];
			@Pc(297) int local297 = local138 - local133;
			@Pc(306) int local306 = local146 + local133 - local138 * 2;
			@Pc(324) int local324 = local138 + Static351.anIntArrayArrayArray10[Static89.anInt1491][local92 + 2][local125] - local146 - local165;
			local221[local125] = (float) local165 + (((float) local306 + local59 * (float) local324) * local59 + (float) local297) * local59;
		}
		@Pc(359) float local359 = local221[0] - local62[0];
		@Pc(369) float local369 = -1.0F * (local221[1] - local62[1]);
		@Pc(377) float local377 = local221[2] - local62[2];
		@Pc(387) double local387 = Math.sqrt((double) (local377 * local377 + local359 * local359));
		Static38.anInt742 = (int) (Math.atan2((double) local369, local387) * 2607.5945876176133D) & 0x3FFF;
		Static232.anInt9865 = (int) (-Math.atan2((double) local359, (double) local377) * 2607.5945876176133D) & 0x3FFF;
		Static463.anInt8184 = Static351.anIntArrayArrayArray10[Static140.anInt2734][local66][3] + (Static60.anInt1009 * (Static351.anIntArrayArrayArray10[Static140.anInt2734][local66 + 2][3] - Static351.anIntArrayArrayArray10[Static140.anInt2734][local66][3]) >> 16);
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(Lclient!oa;IILclient!q;III[[[B[I[I[I[I[IIBIIZ)V")
	public static void method3447(@OriginalArg(0) Class90 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class93 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[][][] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) byte arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) boolean arg17) {
		Static276.aClass90_9 = arg0;
		Static264.anInt4720 = arg1;
		Static126.aClass93_6 = arg3;
		Static301.aBoolean384 = Static276.aClass90_9.method7458() > 0;
		Static207.anInt3926 = arg4 >> Static23.anInt420;
		Static3.anInt7083 = arg6 >> Static23.anInt420;
		Static226.anInt4160 = arg4;
		Static567.anInt9819 = arg6;
		Static226.anInt4147 = arg5;
		Static538.anInt9252 = Static207.anInt3926 - Static2.anInt40;
		if (Static538.anInt9252 < 0) {
			Static274.anInt4855 = -Static538.anInt9252;
			Static538.anInt9252 = 0;
		} else {
			Static274.anInt4855 = 0;
		}
		Static203.anInt3852 = Static3.anInt7083 - Static2.anInt40;
		if (Static203.anInt3852 < 0) {
			Static283.anInt5218 = -Static203.anInt3852;
			Static203.anInt3852 = 0;
		} else {
			Static283.anInt5218 = 0;
		}
		Static70.anInt1182 = Static207.anInt3926 + Static2.anInt40;
		if (Static70.anInt1182 > Static547.anInt9363) {
			Static70.anInt1182 = Static547.anInt9363;
		}
		Static210.anInt3998 = Static3.anInt7083 + Static2.anInt40;
		if (Static210.anInt3998 > Static20.anInt358) {
			Static210.anInt3998 = Static20.anInt358;
		}
		@Pc(77) int local77;
		@Pc(84) int local84;
		@Pc(90) int local90;
		for (@Pc(74) int local74 = 0; local74 < Static2.anInt40 + Static2.anInt40 + 2; local74++) {
			for (local77 = 0; local77 < Static2.anInt40 + Static2.anInt40 + 2; local77++) {
				local84 = Static207.anInt3926 + local74 - Static2.anInt40;
				local90 = Static3.anInt7083 + local77 - Static2.anInt40;
				if (local84 >= 0 && local90 >= 0 && local84 < Static547.anInt9363 && local90 < Static20.anInt358) {
					@Pc(104) int local104 = local84 << Static23.anInt420;
					@Pc(108) int local108 = local90 << Static23.anInt420;
					@Pc(124) int local124 = Static496.aClass46Array4[Static496.aClass46Array4.length - 1].JA(local84, local90) - (0x3E8 << Static23.anInt420 - 7);
					@Pc(144) int local144 = Static480.aClass46Array2 == null ? Static496.aClass46Array4[0].JA(local84, local90) + Static113.anInt1928 : Static480.aClass46Array2[0].JA(local84, local90) + Static113.anInt1928;
					Static467.aBooleanArrayArray7[local74][local77] = Static276.aClass90_9.FA(local104, local124, local108, local104, local144, local108);
				} else {
					Static467.aBooleanArrayArray7[local74][local77] = false;
				}
			}
		}
		for (local77 = 0; local77 < Static2.anInt40 + Static2.anInt40 + 1; local77++) {
			for (local84 = 0; local84 < Static2.anInt40 + Static2.anInt40 + 1; local84++) {
				Static528.aBooleanArrayArray9[local77][local84] = Static467.aBooleanArrayArray7[local77][local84] || Static467.aBooleanArrayArray7[local77 + 1][local84] || Static467.aBooleanArrayArray7[local77][local84 + 1] || Static467.aBooleanArrayArray7[local77 + 1][local84 + 1];
			}
		}
		Static497.anIntArray618 = arg8;
		Static249.anIntArray377 = arg9;
		Static525.anIntArray640 = arg10;
		Static231.anIntArray715 = arg11;
		Static359.anIntArray698 = arg12;
		Static172.method2701();
		Static194.method3292(Static276.aClass90_9);
		for (@Pc(261) Class60_Sub8 local261 = (Class60_Sub8) Static260.aClass349_8.method7890(); local261 != null; local261 = (Class60_Sub8) Static260.aClass349_8.method7896()) {
			local261.method7802();
			Static10.method132(local261);
		}
		if (Static301.aBoolean384) {
			for (local90 = 0; local90 < Static28.anInt487; local90++) {
				Static111.aClass255Array1[local90].method5884(arg17, arg1);
			}
		}
		if (arg2 > 1) {
			Static276.aClass90_9.method7468(0);
			if (Static221.aClass175_1 == null || Static221.aClass175_1 instanceof Class175_Sub1) {
				Static221.aClass175_1 = new Class175_Sub2();
			}
		} else if (Static221.aClass175_1 == null || Static221.aClass175_1 instanceof Class175_Sub2) {
			Static221.aClass175_1 = new Class175_Sub1();
		}
		Static221.aClass175_1.method4163(arg2);
		Static221.aClass175_1.method4154();
		if (Static299.aClass133ArrayArrayArray3 != null) {
			Static54.method805(true);
			Static221.aClass175_1.method4159(22);
			Static172.method2699(arg2, null, 0, (byte) 0, arg15, arg16);
			Static221.aClass175_1.method4154();
			Static221.aClass175_1.method4159(23);
			Static54.method805(false);
		}
		Static172.method2699(arg2, arg7, arg13, arg14, arg15, arg16);
		Static221.aClass175_1.method4154();
		Static221.aClass175_1.method4160();
		Static221.aClass175_1.method4154();
		if (arg2 > 1) {
			Static276.aClass90_9.method7491(0);
		}
		Static276.aClass90_9.method7448(0, null);
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(ZBLjava/awt/Component;)Lclient!ds;")
	public static Class29 method3452(@OriginalArg(2) Component arg0) {
		try {
			@Pc(24) Constructor local24 = Class.forName("Class29_Sub2").getDeclaredConstructor(Component.class, Boolean.TYPE);
			return (Class29) local24.newInstance(arg0, Boolean.valueOf(true));
		} catch (@Pc(42) Throwable local42) {
			return new Class29_Sub1(arg0, true);
		}
	}
}
