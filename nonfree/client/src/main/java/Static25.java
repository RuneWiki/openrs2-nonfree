import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!bl", name = "j", descriptor = "I")
	public static int anInt551 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!bl", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString23 = "glow3:";

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "([IIIIB)V")
	public static void method486(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		arg1--;
		@Pc(7) int local7 = arg2 - 1;
		@Pc(11) int local11 = local7 - 7;
		while (local11 > arg1) {
			@Pc(16) int local16 = arg1 + 1;
			arg0[local16] = arg3;
			@Pc(21) int local21 = local16 + 1;
			arg0[local21] = arg3;
			@Pc(26) int local26 = local21 + 1;
			arg0[local26] = arg3;
			@Pc(31) int local31 = local26 + 1;
			arg0[local31] = arg3;
			@Pc(36) int local36 = local31 + 1;
			arg0[local36] = arg3;
			@Pc(41) int local41 = local36 + 1;
			arg0[local41] = arg3;
			@Pc(46) int local46 = local41 + 1;
			arg0[local46] = arg3;
			arg1 = local46 + 1;
			arg0[arg1] = arg3;
		}
		while (local7 > arg1) {
			arg1++;
			arg0[arg1] = arg3;
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IB)V")
	public static void method487(@OriginalArg(0) int arg0) {
		if (Static268.method4233(arg0)) {
			Static84.method1510(-1, Static262.aClass56ArrayArray1[arg0]);
		}
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(I)V")
	public static void method488() {
		Static145.aClass157_27.method4033();
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIII)I")
	public static int method490(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static60.aBoolean97) {
			arg3 = 1000000;
			Static60.aBoolean97 = false;
		}
		@Pc(17) Class100 local17 = Static90.aClass100ArrayArray1[arg2][arg0];
		@Pc(27) float local27 = local17.aFloat40 * ((float) arg1 * 0.1F + 0.7F);
		@Pc(30) int local30 = local17.anInt3485;
		@Pc(33) float local33 = local17.aFloat35;
		@Pc(36) float local36 = local17.aFloat39;
		@Pc(39) int local39 = local17.anInt3475;
		@Pc(42) int local42 = local17.anInt3484;
		@Pc(50) Class2_Sub8_Sub14 local50 = local17.aClass2_Sub8_Sub14_4;
		@Pc(53) float local53 = local17.aFloat37;
		if (!Static40.aBoolean64) {
			local42 = 0;
		}
		@Pc(61) float local61 = local17.aFloat38;
		@Pc(64) float local64 = local17.aFloat36;
		if (local30 != Static6.anInt109 || local27 != Static74.aFloat5 || Static236.aFloat50 != local33 || Static29.aFloat2 != local36 || local39 != Static151.anInt3323 || Static60.anInt1504 != local42 || local50 != Static234.aClass2_Sub8_Sub14_7 || Static152.aFloat34 != local61 || local64 != Static82.aFloat7 || local53 != Static303.aFloat55) {
			Static123.aFloat22 = Static218.aFloat44;
			Static3.anInt76 = Static300.anInt5786;
			Static273.aFloat54 = Static118.aFloat19;
			Static32.anInt869 = Static7.anInt115;
			Static223.aClass2_Sub8_Sub14_6 = Static73.aClass2_Sub8_Sub14_3;
			Static219.aFloat45 = Static48.aFloat3;
			Static60.anInt1514 = Static248.anInt2157;
			Static74.aFloat6 = Static87.aFloat8;
			Static117.aFloat18 = Static202.aFloat21;
			Static175.aFloat42 = Static205.aFloat43;
			if (Static275.aClass2_Sub8_Sub14_8 == null || Static275.aClass2_Sub8_Sub14_8 == Static223.aClass2_Sub8_Sub14_6) {
				Static275.aClass2_Sub8_Sub14_8 = new Class2_Sub8_Sub14();
			}
			Static234.aClass2_Sub8_Sub14_7 = local50;
			Static82.aFloat7 = local64;
			Static60.anInt1504 = local42;
			Static285.anInt5635 = 0;
			Static6.anInt109 = local30;
			Static236.aFloat50 = local33;
			Static151.anInt3323 = local39;
			Static74.aFloat5 = local27;
			Static29.aFloat2 = local36;
			Static303.aFloat55 = local53;
			Static152.aFloat34 = local61;
		}
		if (Static285.anInt5635 < 65536) {
			Static285.anInt5635 += arg3 * 250;
			if (Static285.anInt5635 >= 65536) {
				Static223.aClass2_Sub8_Sub14_6 = null;
				Static48.aFloat3 = Static152.aFloat34;
				Static285.anInt5635 = 65536;
				Static7.anInt115 = Static60.anInt1504;
				Static87.aFloat8 = Static236.aFloat50;
				Static300.anInt5786 = Static6.anInt109;
				Static205.aFloat43 = Static74.aFloat5;
				Static248.anInt2157 = Static151.anInt3323;
				Static73.aClass2_Sub8_Sub14_3 = Static234.aClass2_Sub8_Sub14_7;
				Static218.aFloat44 = Static29.aFloat2;
				Static202.aFloat21 = Static82.aFloat7;
				Static118.aFloat19 = Static303.aFloat55;
			} else {
				@Pc(203) int local203 = Static285.anInt5635 >> 8;
				@Pc(210) int local210 = 65536 - Static285.anInt5635 >> 8;
				Static7.anInt115 = Static32.anInt869 * local210 + local203 * Static60.anInt1504 >> 8;
				Static300.anInt5786 = (local210 * (Static3.anInt76 & 0xFF00FF) + local203 * (Static6.anInt109 & 0xFF00FF) & 0xFF00FF00) + (local203 * (Static6.anInt109 & 0xFF00) + (Static3.anInt76 & 0xFF00) * local210 & 0xFF0000) >> 8;
				Static248.anInt2157 = (local210 * (Static60.anInt1514 & 0xFF00) + local203 * (Static151.anInt3323 & 0xFF00) & 0xFF0000) + ((Static60.anInt1514 & 0xFF00FF) * local210 + ((Static151.anInt3323 & 0xFF00FF) * local203) & 0xFF00FF00) >> 8;
				@Pc(290) float local290 = (float) (65536 - Static285.anInt5635) / 65536.0F;
				@Pc(295) float local295 = (float) Static285.anInt5635 / 65536.0F;
				Static87.aFloat8 = Static74.aFloat6 * local290 + Static236.aFloat50 * local295;
				Static218.aFloat44 = Static123.aFloat22 * local290 + Static29.aFloat2 * local295;
				Static118.aFloat19 = Static303.aFloat55 * local295 + local290 * Static273.aFloat54;
				Static205.aFloat43 = local290 * Static175.aFloat42 + Static74.aFloat5 * local295;
				Static202.aFloat21 = Static117.aFloat18 * local290 + local295 * Static82.aFloat7;
				Static48.aFloat3 = Static152.aFloat34 * local295 + Static219.aFloat45 * local290;
				if (Static223.aClass2_Sub8_Sub14_6 != Static234.aClass2_Sub8_Sub14_7) {
					if (Static223.aClass2_Sub8_Sub14_6 == null || Static234.aClass2_Sub8_Sub14_7 == null) {
						Static73.aClass2_Sub8_Sub14_3 = null;
					} else {
						Static73.aClass2_Sub8_Sub14_3 = Static275.aClass2_Sub8_Sub14_8.method3275(Static223.aClass2_Sub8_Sub14_6, Static234.aClass2_Sub8_Sub14_7, (float) Static285.anInt5635 / 65536.0F);
					}
				}
			}
		}
		return Static248.anInt2157;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lclient!to;Lclient!ek;Lclient!ek;I)V")
	public static void method491(@OriginalArg(0) Interface4 arg0, @OriginalArg(1) Class42 arg1, @OriginalArg(2) Class42 arg2) {
		Static229.aClass42_71 = arg2;
		Static105.anInterface4_2 = arg0;
		Static4.aClass42_1 = arg1;
		if (Static229.aClass42_71 != null) {
			Static155.anInt3474 = Static229.aClass42_71.method1269(1);
		}
		if (Static4.aClass42_1 != null) {
			Static162.anInt3613 = Static4.aClass42_1.method1269(1);
		}
	}
}
