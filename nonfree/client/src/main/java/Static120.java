import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!of", name = "o", descriptor = "Lclient!oh;")
	public static Class11_Sub1 aClass11_Sub1_27;

	@OriginalMember(owner = "client!of", name = "w", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray1;

	@OriginalMember(owner = "client!of", name = "x", descriptor = "B")
	public static byte aByte8;

	@OriginalMember(owner = "client!of", name = "E", descriptor = "Lclient!kf;")
	public static Class2_Sub2_Sub2_Sub3 aClass2_Sub2_Sub2_Sub3_5;

	@OriginalMember(owner = "client!of", name = "A", descriptor = "Lclient!lf;")
	private static Class49 aClass49_1160 = Static32.method683("Loading title screen )2 ");

	@OriginalMember(owner = "client!of", name = "q", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1158 = aClass49_1160;

	@OriginalMember(owner = "client!of", name = "r", descriptor = "I")
	public static int anInt2508 = 0;

	@OriginalMember(owner = "client!of", name = "v", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1159 = Static32.method683(")4lang)4de");

	@OriginalMember(owner = "client!of", name = "C", descriptor = "Lclient!lf;")
	private static Class49 aClass49_1161 = Static32.method683("Please subscribe)1 or use a different world)3");

	@OriginalMember(owner = "client!of", name = "D", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1162 = aClass49_1161;

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V")
	public static void method2043() {
		aClass49_1161 = null;
		aBooleanArrayArray1 = null;
		aClass11_Sub1_27 = null;
		aClass49_1159 = null;
		aClass49_1160 = null;
		aClass49_1162 = null;
		aClass2_Sub2_Sub2_Sub3_5 = null;
		aClass49_1158 = null;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!bg;B)V")
	public static void method2044(@OriginalArg(0) Class11 arg0) {
		Static61.aClass11_53 = arg0;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(ZLclient!id;I)V")
	public static void method2045(@OriginalArg(1) Class2_Sub12 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Object[] local8 = arg0.anObjectArray2;
		@Pc(14) int local14 = (Integer) local8[0];
		@Pc(18) Class2_Sub2_Sub18 local18 = Static21.method398(local14);
		if (local18 == null) {
			return;
		}
		@Pc(23) int local23 = 0;
		@Pc(26) int[] local26 = local18.anIntArray331;
		@Pc(28) int local28 = 0;
		Static66.anInt1394 = 0;
		@Pc(33) int[] local33 = local18.anIntArray332;
		@Pc(35) byte local35 = -1;
		@Pc(37) int local37 = -1;
		@Pc(55) int local55;
		@Pc(93) int local93;
		try {
			Static127.anIntArray262 = new int[local18.anInt3744];
			@Pc(47) int local47 = 0;
			Static174.aClass49Array21 = new Class49[local18.anInt3743];
			@Pc(53) int local53 = 0;
			for (local55 = 1; local55 < local8.length; local55++) {
				if (local8[local55] instanceof Integer) {
					local93 = (Integer) local8[local55];
					if (local93 == -2147483647) {
						local93 = arg0.anInt1567;
					}
					if (local93 == -2147483646) {
						local93 = arg0.anInt1560;
					}
					if (local93 == -2147483645) {
						local93 = arg0.aClass85_4 == null ? -1 : arg0.aClass85_4.anInt3849;
					}
					if (local93 == -2147483644) {
						local93 = arg0.anInt1564;
					}
					if (local93 == -2147483643) {
						local93 = arg0.aClass85_4 == null ? -1 : arg0.aClass85_4.anInt3866;
					}
					if (local93 == -2147483642) {
						local93 = arg0.aClass85_5 == null ? -1 : arg0.aClass85_5.anInt3849;
					}
					if (local93 == -2147483641) {
						local93 = arg0.aClass85_5 == null ? -1 : arg0.aClass85_5.anInt3866;
					}
					if (local93 == -2147483640) {
						local93 = arg0.anInt1569;
					}
					if (local93 == -2147483639) {
						local93 = arg0.anInt1561;
					}
					Static127.anIntArray262[local47++] = local93;
				} else if (local8[local55] instanceof Class49) {
					@Pc(72) Class49 local72 = (Class49) local8[local55];
					if (local72.method1676(Static28.aClass49_356)) {
						local72 = arg0.aClass49_820;
					}
					Static174.aClass49Array21[local53++] = local72;
				}
			}
			local93 = 0;
			label2223: while (true) {
				local93++;
				if (arg1 < local93) {
					throw new RuntimeException("slow");
				}
				local37++;
				@Pc(207) int local207 = local26[local37];
				@Pc(774) int local774;
				@Pc(768) int local768;
				@Pc(617) int local617;
				@Pc(637) int local637;
				@Pc(575) Class49 local575;
				if (local207 < 100) {
					if (local207 == 0) {
						Static91.anIntArray193[local23++] = local33[local37];
						continue;
					}
					@Pc(230) int local230;
					if (local207 == 1) {
						local230 = local33[local37];
						Static91.anIntArray193[local23++] = Static165.anIntArray317[local230];
						continue;
					}
					if (local207 == 2) {
						local230 = local33[local37];
						local23--;
						Static165.anIntArray317[local230] = Static91.anIntArray193[local23];
						continue;
					}
					if (local207 == 3) {
						Static12.aClass49Array2[local28++] = local18.aClass49Array20[local37];
						continue;
					}
					if (local207 == 6) {
						local37 += local33[local37];
						continue;
					}
					if (local207 == 7) {
						local23 -= 2;
						if (Static91.anIntArray193[local23 + 1] != Static91.anIntArray193[local23]) {
							local37 += local33[local37];
						}
						continue;
					}
					if (local207 == 8) {
						local23 -= 2;
						if (Static91.anIntArray193[local23] == Static91.anIntArray193[local23 + 1]) {
							local37 += local33[local37];
						}
						continue;
					}
					if (local207 == 9) {
						local23 -= 2;
						if (Static91.anIntArray193[local23 + 1] > Static91.anIntArray193[local23]) {
							local37 += local33[local37];
						}
						continue;
					}
					if (local207 == 10) {
						local23 -= 2;
						if (Static91.anIntArray193[local23 + 1] < Static91.anIntArray193[local23]) {
							local37 += local33[local37];
						}
						continue;
					}
					if (local207 == 21) {
						if (Static66.anInt1394 == 0) {
							return;
						}
						@Pc(390) Class23 local390 = Static121.aClass23Array1[--Static66.anInt1394];
						local18 = local390.aClass2_Sub2_Sub18_1;
						local37 = local390.anInt1038;
						Static174.aClass49Array21 = local390.aClass49Array7;
						local26 = local18.anIntArray331;
						Static127.anIntArray262 = local390.anIntArray101;
						local33 = local18.anIntArray332;
						continue;
					}
					if (local207 == 25) {
						local230 = local33[local37];
						Static91.anIntArray193[local23++] = Static102.method1754(local230);
						continue;
					}
					if (local207 == 27) {
						local230 = local33[local37];
						local23--;
						Static163.method530(local230, Static91.anIntArray193[local23]);
						continue;
					}
					if (local207 == 31) {
						local23 -= 2;
						if (Static91.anIntArray193[local23 + 1] >= Static91.anIntArray193[local23]) {
							local37 += local33[local37];
						}
						continue;
					}
					if (local207 == 32) {
						local23 -= 2;
						if (Static91.anIntArray193[local23 + 1] <= Static91.anIntArray193[local23]) {
							local37 += local33[local37];
						}
						continue;
					}
					if (local207 == 33) {
						Static91.anIntArray193[local23++] = Static127.anIntArray262[local33[local37]];
						continue;
					}
					@Pc(517) int local517;
					if (local207 == 34) {
						local517 = local33[local37];
						local23--;
						Static127.anIntArray262[local517] = Static91.anIntArray193[local23];
						continue;
					}
					if (local207 == 35) {
						Static12.aClass49Array2[local28++] = Static174.aClass49Array21[local33[local37]];
						continue;
					}
					if (local207 == 36) {
						local517 = local33[local37];
						local28--;
						Static174.aClass49Array21[local517] = Static12.aClass49Array2[local28];
						continue;
					}
					if (local207 == 37) {
						local230 = local33[local37];
						local28 -= local230;
						local575 = Static27.method482(local230, Static12.aClass49Array2, local28);
						Static12.aClass49Array2[local28++] = local575;
						continue;
					}
					if (local207 == 38) {
						local23--;
						continue;
					}
					if (local207 == 39) {
						local28--;
						continue;
					}
					if (local207 == 40) {
						local230 = local33[local37];
						@Pc(607) Class2_Sub2_Sub18 local607 = Static21.method398(local230);
						@Pc(611) int[] local611 = new int[local607.anInt3744];
						@Pc(615) Class49[] local615 = new Class49[local607.anInt3743];
						for (local617 = 0; local617 < local607.anInt3741; local617++) {
							local611[local617] = Static91.anIntArray193[local23 + local617 - local607.anInt3741];
						}
						for (local637 = 0; local637 < local607.anInt3737; local637++) {
							local615[local637] = Static12.aClass49Array2[local28 + local637 - local607.anInt3737];
						}
						local23 -= local607.anInt3741;
						local28 -= local607.anInt3737;
						@Pc(674) Class23 local674 = new Class23();
						local674.aClass2_Sub2_Sub18_1 = local18;
						local674.anIntArray101 = Static127.anIntArray262;
						local674.aClass49Array7 = Static174.aClass49Array21;
						local674.anInt1038 = local37;
						if (Static121.aClass23Array1.length <= Static66.anInt1394) {
							throw new RuntimeException();
						}
						local37 = -1;
						Static121.aClass23Array1[Static66.anInt1394++] = local674;
						Static127.anIntArray262 = local611;
						Static174.aClass49Array21 = local615;
						local18 = local607;
						local33 = local607.anIntArray332;
						local26 = local607.anIntArray331;
						continue;
					}
					if (local207 == 42) {
						Static91.anIntArray193[local23++] = Static38.anIntArray83[local33[local37]];
						continue;
					}
					if (local207 == 43) {
						local517 = local33[local37];
						local23--;
						Static38.anIntArray83[local517] = Static91.anIntArray193[local23];
						continue;
					}
					if (local207 == 44) {
						local230 = local33[local37] >> 16;
						local23--;
						local768 = Static91.anIntArray193[local23];
						local774 = local33[local37] & 0xFFFF;
						if (local768 >= 0 && local768 <= 5000) {
							Static74.anIntArray179[local230] = local768;
							@Pc(794) byte local794 = -1;
							if (local774 == 105) {
								local794 = 0;
							}
							local617 = 0;
							while (true) {
								if (local768 <= local617) {
									continue label2223;
								}
								Static113.anIntArrayArray23[local230][local617] = local794;
								local617++;
							}
						}
						throw new RuntimeException();
					}
					if (local207 == 45) {
						local23--;
						local774 = Static91.anIntArray193[local23];
						local230 = local33[local37];
						if (local774 >= 0 && local774 < Static74.anIntArray179[local230]) {
							Static91.anIntArray193[local23++] = Static113.anIntArrayArray23[local230][local774];
							continue;
						}
						throw new RuntimeException();
					}
					if (local207 == 46) {
						local230 = local33[local37];
						local23 -= 2;
						local774 = Static91.anIntArray193[local23];
						if (local774 >= 0 && local774 < Static74.anIntArray179[local230]) {
							Static113.anIntArrayArray23[local230][local774] = Static91.anIntArray193[local23 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (local207 == 47) {
						@Pc(911) Class49 local911 = Static103.aClass49Array16[local33[local37]];
						if (local911 == null) {
							local911 = Static150.aClass49_1454;
						}
						Static12.aClass49Array2[local28++] = local911;
						continue;
					}
					if (local207 == 48) {
						local517 = local33[local37];
						local28--;
						Static103.aClass49Array16[local517] = Static12.aClass49Array2[local28];
						continue;
					}
				}
				@Pc(945) boolean local945;
				if (local33[local37] == 1) {
					local945 = true;
				} else {
					local945 = false;
				}
				@Pc(7320) Class85 local7320;
				@Pc(7291) Class85 local7291;
				@Pc(2004) int local2004;
				@Pc(1058) Class85 local1058;
				@Pc(1776) int local1776;
				if (local207 < 300) {
					if (local207 == 100) {
						local23 -= 3;
						local768 = Static91.anIntArray193[local23 + 1];
						local1776 = Static91.anIntArray193[local23 + 2];
						local774 = Static91.anIntArray193[local23];
						if (local768 == 0) {
							throw new RuntimeException();
						}
						local7291 = Static140.method2337(local774);
						if (local7291.aClass85Array2 == null) {
							local7291.aClass85Array2 = new Class85[local1776 + 1];
						}
						if (local1776 >= local7291.aClass85Array2.length) {
							@Pc(7734) Class85[] local7734 = new Class85[local1776 + 1];
							for (local2004 = 0; local2004 < local7291.aClass85Array2.length; local2004++) {
								local7734[local2004] = local7291.aClass85Array2[local2004];
							}
							local7291.aClass85Array2 = local7734;
						}
						if (local1776 > 0 && local7291.aClass85Array2[local1776 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local1776 - 1));
						}
						@Pc(7784) Class85 local7784 = new Class85();
						local7784.anInt3851 = local7784.anInt3849 = local7291.anInt3849;
						local7784.anInt3855 = local768;
						local7784.anInt3866 = local1776;
						local7784.aBoolean171 = true;
						local7291.aClass85Array2[local1776] = local7784;
						if (local945) {
							Static118.aClass85_11 = local7784;
						} else {
							Static111.aClass85_10 = local7784;
						}
						Static102.method1756(local7291);
						continue;
					}
					@Pc(7848) Class85 local7848;
					if (local207 == 101) {
						local1058 = local945 ? Static118.aClass85_11 : Static111.aClass85_10;
						if (local1058.anInt3866 == -1) {
							if (!local945) {
								throw new RuntimeException("Tried to cc_delete static active-component!");
							}
							throw new RuntimeException("Tried to .cc_delete static .active-component!");
						}
						local7848 = Static140.method2337(local1058.anInt3849);
						local7848.aClass85Array2[local1058.anInt3866] = null;
						Static102.method1756(local7848);
						continue;
					}
					if (local207 == 102) {
						local23--;
						local1058 = Static140.method2337(Static91.anIntArray193[local23]);
						local1058.aClass85Array2 = null;
						Static102.method1756(local1058);
						continue;
					}
					if (local207 == 200) {
						local23 -= 2;
						local774 = Static91.anIntArray193[local23];
						local768 = Static91.anIntArray193[local23 + 1];
						local7320 = Static114.method1938(local774, local768);
						if (local7320 != null && local768 != -1) {
							Static91.anIntArray193[local23++] = 1;
							if (local945) {
								Static118.aClass85_11 = local7320;
							} else {
								Static111.aClass85_10 = local7320;
							}
							continue;
						}
						Static91.anIntArray193[local23++] = 0;
						continue;
					}
					if (local207 == 201) {
						local23--;
						local774 = Static91.anIntArray193[local23];
						local7848 = Static140.method2337(local774);
						if (local7848 == null) {
							Static91.anIntArray193[local23++] = 0;
						} else {
							Static91.anIntArray193[local23++] = 1;
							if (local945) {
								Static118.aClass85_11 = local7848;
							} else {
								Static111.aClass85_10 = local7848;
							}
						}
						continue;
					}
				} else if (local207 < 500) {
					if (local207 == 403) {
						local23 -= 2;
						local774 = Static91.anIntArray193[local23];
						if (local774 >= 7) {
							local774 -= 7;
						}
						local768 = Static91.anIntArray193[local23 + 1];
						Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.aClass10_2.method213(local768, local774);
						continue;
					}
					if (local207 == 404) {
						local23 -= 2;
						local774 = Static91.anIntArray193[local23];
						local768 = Static91.anIntArray193[local23 + 1];
						Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.aClass10_2.method210(local774, local768);
						continue;
					}
					if (local207 == 410) {
						local23--;
						@Pc(1024) boolean local1024 = Static91.anIntArray193[local23] != 0;
						Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.aClass10_2.method220(local1024);
						continue;
					}
				} else if ((local207 < 1000 || local207 >= 1100) && (local207 < 2000 || local207 >= 2100)) {
					@Pc(1500) Class49 local1500;
					if (local207 >= 1100 && local207 < 1200 || local207 >= 2100 && local207 < 2200) {
						if (local207 < 2000) {
							local1058 = local945 ? Static118.aClass85_11 : Static111.aClass85_10;
						} else {
							local23--;
							local1058 = Static140.method2337(Static91.anIntArray193[local23]);
							local207 -= 1000;
						}
						if (local207 == 1100) {
							local23 -= 2;
							local1058.anInt3822 = Static91.anIntArray193[local23];
							if (local1058.anInt3822 > local1058.anInt3854 - local1058.anInt3858) {
								local1058.anInt3822 = local1058.anInt3854 - local1058.anInt3858;
							}
							if (local1058.anInt3822 < 0) {
								local1058.anInt3822 = 0;
							}
							local1058.anInt3891 = Static91.anIntArray193[local23 + 1];
							if (local1058.anInt3891 > local1058.anInt3839 - local1058.anInt3867) {
								local1058.anInt3891 = local1058.anInt3839 - local1058.anInt3867;
							}
							if (local1058.anInt3891 < 0) {
								local1058.anInt3891 = 0;
							}
							Static102.method1756(local1058);
							continue;
						}
						if (local207 == 1101) {
							local23--;
							local1058.anInt3837 = Static91.anIntArray193[local23];
							Static102.method1756(local1058);
							continue;
						}
						if (local207 == 1102) {
							local23--;
							local1058.aBoolean169 = Static91.anIntArray193[local23] == 1;
							Static102.method1756(local1058);
							continue;
						}
						if (local207 == 1103) {
							local23--;
							local1058.anInt3841 = Static91.anIntArray193[local23];
							Static102.method1756(local1058);
							continue;
						}
						if (local207 == 1104) {
							local23--;
							local1058.anInt3887 = Static91.anIntArray193[local23];
							Static102.method1756(local1058);
							continue;
						}
						if (local207 == 1105) {
							local23--;
							local1058.anInt3881 = Static91.anIntArray193[local23];
							Static102.method1756(local1058);
							continue;
						}
						if (local207 == 1106) {
							local23--;
							local1058.anInt3846 = Static91.anIntArray193[local23];
							Static102.method1756(local1058);
							continue;
						}
						if (local207 == 1107) {
							local23--;
							local1058.aBoolean162 = Static91.anIntArray193[local23] == 1;
							Static102.method1756(local1058);
							continue;
						}
						if (local207 == 1108) {
							local1058.anInt3864 = 1;
							local23--;
							local1058.anInt3885 = Static91.anIntArray193[local23];
							Static102.method1756(local1058);
							continue;
						}
						if (local207 == 1109) {
							local23 -= 6;
							local1058.anInt3856 = Static91.anIntArray193[local23];
							local1058.anInt3843 = Static91.anIntArray193[local23 + 1];
							local1058.anInt3853 = Static91.anIntArray193[local23 + 2];
							local1058.anInt3862 = Static91.anIntArray193[local23 + 3];
							local1058.anInt3871 = Static91.anIntArray193[local23 + 4];
							local1058.anInt3874 = Static91.anIntArray193[local23 + 5];
							Static102.method1756(local1058);
							continue;
						}
						if (local207 == 1110) {
							local23--;
							local768 = Static91.anIntArray193[local23];
							if (local1058.anInt3863 != local768) {
								local1058.anInt3824 = 0;
								local1058.anInt3888 = 0;
								local1058.anInt3863 = local768;
								Static102.method1756(local1058);
							}
							continue;
						}
						if (local207 == 1111) {
							local23--;
							local1058.aBoolean164 = Static91.anIntArray193[local23] == 1;
							Static102.method1756(local1058);
							continue;
						}
						if (local207 == 1112) {
							local28--;
							local1500 = Static12.aClass49Array2[local28];
							if (!local1500.method1676(local1058.aClass49_1716)) {
								local1058.aClass49_1716 = local1500;
								Static102.method1756(local1058);
							}
							continue;
						}
						if (local207 == 1113) {
							local23--;
							local1058.anInt3836 = Static91.anIntArray193[local23];
							Static102.method1756(local1058);
							continue;
						}
						if (local207 == 1114) {
							local23 -= 3;
							local1058.anInt3830 = Static91.anIntArray193[local23];
							local1058.anInt3833 = Static91.anIntArray193[local23 + 1];
							local1058.anInt3890 = Static91.anIntArray193[local23 + 2];
							Static102.method1756(local1058);
							continue;
						}
						if (local207 == 1115) {
							local23--;
							local1058.aBoolean167 = Static91.anIntArray193[local23] == 1;
							Static102.method1756(local1058);
							continue;
						}
						if (local207 == 1116) {
							local23--;
							local1058.anInt3884 = Static91.anIntArray193[local23];
							Static102.method1756(local1058);
							continue;
						}
						if (local207 == 1117) {
							local23--;
							local1058.anInt3882 = Static91.anIntArray193[local23];
							Static102.method1756(local1058);
							continue;
						}
						if (local207 == 1118) {
							local23--;
							local1058.aBoolean168 = Static91.anIntArray193[local23] == 1;
							Static102.method1756(local1058);
							continue;
						}
						if (local207 == 1119) {
							local23--;
							local1058.aBoolean160 = Static91.anIntArray193[local23] == 1;
							Static102.method1756(local1058);
							continue;
						}
						if (local207 == 1120) {
							local23 -= 2;
							local1058.anInt3854 = Static91.anIntArray193[local23];
							local1058.anInt3839 = Static91.anIntArray193[local23 + 1];
							Static102.method1756(local1058);
							continue;
						}
					} else if (local207 >= 1200 && local207 < 1300 || !(local207 < 2200 || local207 >= 2300)) {
						if (local207 >= 2000) {
							local207 -= 1000;
							local23--;
							local1058 = Static140.method2337(Static91.anIntArray193[local23]);
						} else {
							local1058 = local945 ? Static118.aClass85_11 : Static111.aClass85_10;
						}
						Static102.method1756(local1058);
						if (local207 == 1200) {
							local23 -= 2;
							local768 = Static91.anIntArray193[local23];
							local1776 = Static91.anIntArray193[local23 + 1];
							if (local768 == -1) {
								local1058.anInt3864 = 1;
								local1058.anInt3885 = -1;
								local1058.anInt3826 = -1;
							} else {
								local1058.anInt3826 = local768;
								local1058.anInt3821 = local1776;
								@Pc(7581) Class2_Sub2_Sub10 local7581 = Static113.method1913(local768);
								local1058.anInt3871 = local7581.anInt1615;
								local1058.anInt3853 = local7581.anInt1587;
								local1058.anInt3843 = local7581.anInt1617;
								local1058.anInt3862 = local7581.anInt1624;
								local1058.anInt3874 = local7581.anInt1608;
								local1058.anInt3856 = local7581.anInt1600;
								if (local1058.anInt3858 > 0) {
									local1058.anInt3874 = local1058.anInt3874 * 32 / local1058.anInt3858;
								}
							}
							continue;
						}
						if (local207 == 1201) {
							local1058.anInt3864 = 2;
							local23--;
							local1058.anInt3885 = Static91.anIntArray193[local23];
							continue;
						}
						if (local207 == 1202) {
							local1058.anInt3864 = 3;
							local1058.anInt3885 = Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.aClass10_2.method219();
							continue;
						}
						if (local207 == 1203) {
							local1058.anInt3864 = 6;
							local23--;
							local1058.anInt3885 = Static91.anIntArray193[local23];
							continue;
						}
						if (local207 == 1204) {
							local1058.anInt3864 = 5;
							local23--;
							local1058.anInt3885 = Static91.anIntArray193[local23];
							continue;
						}
					} else if ((local207 < 1300 || local207 >= 1400) && (local207 < 2300 || local207 >= 2400)) {
						if (local207 >= 1400 && local207 < 1500 || local207 >= 2400 && local207 < 2500) {
							if (local207 >= 2000) {
								local207 -= 1000;
								local23--;
								local1058 = Static140.method2337(Static91.anIntArray193[local23]);
							} else {
								local1058 = local945 ? Static118.aClass85_11 : Static111.aClass85_10;
							}
							@Pc(1899) int[] local1899 = null;
							local28--;
							local1500 = Static12.aClass49Array2[local28];
							if (local1500.method1653() > 0 && local1500.method1646(local1500.method1653() - 1) == 89) {
								local23--;
								local617 = Static91.anIntArray193[local23];
								if (local617 > 0) {
									local1899 = new int[local617];
									while (local617-- > 0) {
										local23--;
										local1899[local617] = Static91.anIntArray193[local23];
									}
								}
								local1500 = local1500.method1661(local1500.method1653() - 1, 0);
							}
							@Pc(1957) Object[] local1957 = new Object[local1500.method1653() + 1];
							for (local637 = local1957.length - 1; local637 >= 1; local637--) {
								if (local1500.method1646(local637 - 1) == 115) {
									local28--;
									local1957[local637] = Static12.aClass49Array2[local28];
								} else {
									local23--;
									local1957[local637] = Integer.valueOf(Static91.anIntArray193[local23]);
								}
							}
							local23--;
							local2004 = Static91.anIntArray193[local23];
							if (local2004 == -1) {
								local1957 = null;
							} else {
								local1957[0] = Integer.valueOf(local2004);
							}
							if (local207 == 1402) {
								local1058.anObjectArray13 = local1957;
							}
							if (local207 == 1425) {
								local1058.anObjectArray9 = local1957;
							}
							if (local207 == 1421) {
								local1058.anObjectArray14 = local1957;
							}
							if (local207 == 1405) {
								local1058.anObjectArray26 = local1957;
							}
							if (local207 == 1403) {
								local1058.anObjectArray8 = local1957;
							}
							if (local207 == 1423) {
								local1058.anObjectArray19 = local1957;
							}
							if (local207 == 1411) {
								local1058.anObjectArray12 = local1957;
							}
							if (local207 == 1400) {
								local1058.anObjectArray15 = local1957;
							}
							if (local207 == 1412) {
								local1058.anObjectArray6 = local1957;
							}
							if (local207 == 1410) {
								local1058.anObjectArray29 = local1957;
							}
							if (local207 == 1416) {
								local1058.anObjectArray21 = local1957;
							}
							if (local207 == 1404) {
								local1058.anObjectArray11 = local1957;
							}
							if (local207 == 1407) {
								local1058.anObjectArray7 = local1957;
								local1058.anIntArray351 = local1899;
							}
							if (local207 == 1408) {
								local1058.anObjectArray27 = local1957;
							}
							local1058.aBoolean166 = true;
							if (local207 == 1424) {
								local1058.anObjectArray23 = local1957;
							}
							if (local207 == 1420) {
								local1058.anObjectArray24 = local1957;
							}
							if (local207 == 1417) {
								local1058.anObjectArray25 = local1957;
							}
							if (local207 == 1406) {
								local1058.anObjectArray5 = local1957;
							}
							if (local207 == 1401) {
								local1058.anObjectArray20 = local1957;
							}
							if (local207 == 1414) {
								local1058.anIntArray350 = local1899;
								local1058.anObjectArray28 = local1957;
							}
							if (local207 == 1419) {
								local1058.anObjectArray17 = local1957;
							}
							if (local207 == 1415) {
								local1058.anIntArray355 = local1899;
								local1058.anObjectArray22 = local1957;
							}
							if (local207 == 1422) {
								local1058.anObjectArray4 = local1957;
							}
							if (local207 == 1418) {
								local1058.anObjectArray18 = local1957;
							}
							if (local207 == 1409) {
								local1058.anObjectArray10 = local1957;
							}
							continue;
						}
						if (local207 < 1600) {
							local1058 = local945 ? Static118.aClass85_11 : Static111.aClass85_10;
							if (local207 == 1500) {
								Static91.anIntArray193[local23++] = local1058.anInt3827;
								continue;
							}
							if (local207 == 1501) {
								Static91.anIntArray193[local23++] = local1058.anInt3886;
								continue;
							}
							if (local207 == 1502) {
								Static91.anIntArray193[local23++] = local1058.anInt3858;
								continue;
							}
							if (local207 == 1503) {
								Static91.anIntArray193[local23++] = local1058.anInt3867;
								continue;
							}
							if (local207 == 1504) {
								Static91.anIntArray193[local23++] = local1058.aBoolean161 ? 1 : 0;
								continue;
							}
							if (local207 == 1505) {
								Static91.anIntArray193[local23++] = local1058.anInt3851;
								continue;
							}
						} else if (local207 < 1700) {
							local1058 = local945 ? Static118.aClass85_11 : Static111.aClass85_10;
							if (local207 == 1600) {
								Static91.anIntArray193[local23++] = local1058.anInt3822;
								continue;
							}
							if (local207 == 1601) {
								Static91.anIntArray193[local23++] = local1058.anInt3891;
								continue;
							}
							if (local207 == 1602) {
								Static12.aClass49Array2[local28++] = local1058.aClass49_1716;
								continue;
							}
							if (local207 == 1603) {
								Static91.anIntArray193[local23++] = local1058.anInt3854;
								continue;
							}
							if (local207 == 1604) {
								Static91.anIntArray193[local23++] = local1058.anInt3839;
								continue;
							}
							if (local207 == 1605) {
								Static91.anIntArray193[local23++] = local1058.anInt3874;
								continue;
							}
							if (local207 == 1606) {
								Static91.anIntArray193[local23++] = local1058.anInt3853;
								continue;
							}
							if (local207 == 1607) {
								Static91.anIntArray193[local23++] = local1058.anInt3871;
								continue;
							}
							if (local207 == 1608) {
								Static91.anIntArray193[local23++] = local1058.anInt3862;
								continue;
							}
							if (local207 == 1609) {
								Static91.anIntArray193[local23++] = local1058.anInt3841;
								continue;
							}
						} else if (local207 < 1800) {
							local1058 = local945 ? Static118.aClass85_11 : Static111.aClass85_10;
							if (local207 == 1700) {
								Static91.anIntArray193[local23++] = local1058.anInt3826;
								continue;
							}
							if (local207 == 1701) {
								if (local1058.anInt3826 == -1) {
									Static91.anIntArray193[local23++] = 0;
								} else {
									Static91.anIntArray193[local23++] = local1058.anInt3821;
								}
								continue;
							}
							if (local207 == 1702) {
								Static91.anIntArray193[local23++] = local1058.anInt3866;
								continue;
							}
						} else if (local207 < 1900) {
							local1058 = local945 ? Static118.aClass85_11 : Static111.aClass85_10;
							if (local207 == 1800) {
								Static91.anIntArray193[local23++] = Static28.method506(Static111.method1895(local1058));
								continue;
							}
							if (local207 == 1801) {
								local23--;
								local768 = Static91.anIntArray193[local23];
								local768--;
								if (local1058.aClass49Array22 != null && local1058.aClass49Array22.length > local768 && local1058.aClass49Array22[local768] != null) {
									Static12.aClass49Array2[local28++] = local1058.aClass49Array22[local768];
									continue;
								}
								Static12.aClass49Array2[local28++] = Static49.aClass49_563;
								continue;
							}
							if (local207 == 1802) {
								if (local1058.aClass49_1709 == null) {
									Static12.aClass49Array2[local28++] = Static49.aClass49_563;
								} else {
									Static12.aClass49Array2[local28++] = local1058.aClass49_1709;
								}
								continue;
							}
						} else if (local207 < 2600) {
							local23--;
							local1058 = Static140.method2337(Static91.anIntArray193[local23]);
							if (local207 == 2500) {
								Static91.anIntArray193[local23++] = local1058.anInt3827;
								continue;
							}
							if (local207 == 2501) {
								Static91.anIntArray193[local23++] = local1058.anInt3886;
								continue;
							}
							if (local207 == 2502) {
								Static91.anIntArray193[local23++] = local1058.anInt3858;
								continue;
							}
							if (local207 == 2503) {
								Static91.anIntArray193[local23++] = local1058.anInt3867;
								continue;
							}
							if (local207 == 2504) {
								Static91.anIntArray193[local23++] = local1058.aBoolean161 ? 1 : 0;
								continue;
							}
							if (local207 == 2505) {
								Static91.anIntArray193[local23++] = local1058.anInt3851;
								continue;
							}
						} else if (local207 < 2700) {
							local23--;
							local1058 = Static140.method2337(Static91.anIntArray193[local23]);
							if (local207 == 2600) {
								Static91.anIntArray193[local23++] = local1058.anInt3822;
								continue;
							}
							if (local207 == 2601) {
								Static91.anIntArray193[local23++] = local1058.anInt3891;
								continue;
							}
							if (local207 == 2602) {
								Static12.aClass49Array2[local28++] = local1058.aClass49_1716;
								continue;
							}
							if (local207 == 2603) {
								Static91.anIntArray193[local23++] = local1058.anInt3854;
								continue;
							}
							if (local207 == 2604) {
								Static91.anIntArray193[local23++] = local1058.anInt3839;
								continue;
							}
							if (local207 == 2605) {
								Static91.anIntArray193[local23++] = local1058.anInt3874;
								continue;
							}
							if (local207 == 2606) {
								Static91.anIntArray193[local23++] = local1058.anInt3853;
								continue;
							}
							if (local207 == 2607) {
								Static91.anIntArray193[local23++] = local1058.anInt3871;
								continue;
							}
							if (local207 == 2608) {
								Static91.anIntArray193[local23++] = local1058.anInt3862;
								continue;
							}
							if (local207 == 2609) {
								Static91.anIntArray193[local23++] = local1058.anInt3841;
								continue;
							}
						} else if (local207 < 2800) {
							if (local207 == 2700) {
								local23--;
								local1058 = Static140.method2337(Static91.anIntArray193[local23]);
								Static91.anIntArray193[local23++] = local1058.anInt3826;
								continue;
							}
							if (local207 == 2701) {
								local23--;
								local1058 = Static140.method2337(Static91.anIntArray193[local23]);
								if (local1058.anInt3826 == -1) {
									Static91.anIntArray193[local23++] = 0;
								} else {
									Static91.anIntArray193[local23++] = local1058.anInt3821;
								}
								continue;
							}
							if (local207 == 2702) {
								local23--;
								local774 = Static91.anIntArray193[local23];
								@Pc(2791) Class2_Sub8 local2791 = (Class2_Sub8) Static100.aClass25_7.method836((long) local774);
								if (local2791 == null) {
									Static91.anIntArray193[local23++] = 0;
								} else {
									Static91.anIntArray193[local23++] = 1;
								}
								continue;
							}
							if (local207 == 2703) {
								local23--;
								local1058 = Static140.method2337(Static91.anIntArray193[local23]);
								if (local1058.aClass85Array2 == null) {
									Static91.anIntArray193[local23++] = 0;
									continue;
								}
								local768 = local1058.aClass85Array2.length;
								for (local1776 = 0; local1776 < local1058.aClass85Array2.length; local1776++) {
									if (local1058.aClass85Array2[local1776] == null) {
										local768 = local1776;
										break;
									}
								}
								Static91.anIntArray193[local23++] = local768;
								continue;
							}
							if (local207 == 2704 || local207 == 2705) {
								local23 -= 2;
								local774 = Static91.anIntArray193[local23];
								local768 = Static91.anIntArray193[local23 + 1];
								@Pc(2885) Class2_Sub8 local2885 = (Class2_Sub8) Static100.aClass25_7.method836((long) local774);
								if (local2885 != null && local2885.anInt1201 == local768) {
									Static91.anIntArray193[local23++] = 1;
									continue;
								}
								Static91.anIntArray193[local23++] = 0;
								continue;
							}
						} else if (local207 < 2900) {
							local23--;
							local1058 = Static140.method2337(Static91.anIntArray193[local23]);
							if (local207 == 2800) {
								Static91.anIntArray193[local23++] = Static28.method506(Static111.method1895(local1058));
								continue;
							}
							if (local207 == 2801) {
								local23--;
								local768 = Static91.anIntArray193[local23];
								local768--;
								if (local1058.aClass49Array22 != null && local1058.aClass49Array22.length > local768 && local1058.aClass49Array22[local768] != null) {
									Static12.aClass49Array2[local28++] = local1058.aClass49Array22[local768];
									continue;
								}
								Static12.aClass49Array2[local28++] = Static49.aClass49_563;
								continue;
							}
							if (local207 == 2802) {
								if (local1058.aClass49_1709 == null) {
									Static12.aClass49Array2[local28++] = Static49.aClass49_563;
								} else {
									Static12.aClass49Array2[local28++] = local1058.aClass49_1709;
								}
								continue;
							}
						} else if (local207 < 3200) {
							if (local207 == 3100) {
								local28--;
								local575 = Static12.aClass49Array2[local28];
								Static88.method1475(Static49.aClass49_563, local575, 0);
								continue;
							}
							if (local207 == 3101) {
								local23 -= 2;
								Static9.method130(Static91.anIntArray193[local23 + 1], Static91.anIntArray193[local23], Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1);
								continue;
							}
							if (local207 == 3103) {
								Static129.method2182();
								continue;
							}
							if (local207 == 3104) {
								local28--;
								local575 = Static12.aClass49Array2[local28];
								local768 = 0;
								if (local575.method1649()) {
									local768 = local575.method1648();
								}
								Static176.aClass2_Sub13_Sub1_14.method2976(171);
								Static176.aClass2_Sub13_Sub1_14.method2952(local768);
								continue;
							}
							if (local207 == 3105) {
								local28--;
								local575 = Static12.aClass49Array2[local28];
								Static176.aClass2_Sub13_Sub1_14.method2976(150);
								Static176.aClass2_Sub13_Sub1_14.method2956(local575.method1651());
								continue;
							}
							if (local207 == 3106) {
								local28--;
								local575 = Static12.aClass49Array2[local28];
								Static176.aClass2_Sub13_Sub1_14.method2976(39);
								Static176.aClass2_Sub13_Sub1_14.method2932(local575.method1653() + 1);
								Static176.aClass2_Sub13_Sub1_14.method2949(local575);
								continue;
							}
							if (local207 == 3107) {
								local23--;
								local774 = Static91.anIntArray193[local23];
								local28--;
								local1500 = Static12.aClass49Array2[local28];
								Static116.method1967(local774, local1500);
								continue;
							}
							if (local207 == 3108) {
								local23 -= 3;
								local768 = Static91.anIntArray193[local23 + 1];
								local774 = Static91.anIntArray193[local23];
								local1776 = Static91.anIntArray193[local23 + 2];
								local7291 = Static140.method2337(local1776);
								Static72.method1207(local768, local7291, local774);
								continue;
							}
							if (local207 == 3109) {
								local23 -= 2;
								local774 = Static91.anIntArray193[local23];
								local768 = Static91.anIntArray193[local23 + 1];
								local7320 = local945 ? Static118.aClass85_11 : Static111.aClass85_10;
								Static72.method1207(local768, local7320, local774);
								continue;
							}
							if (local207 == 3110) {
								local23--;
								local774 = Static91.anIntArray193[local23];
								Static176.aClass2_Sub13_Sub1_14.method2976(43);
								Static176.aClass2_Sub13_Sub1_14.method2921(local774);
								continue;
							}
						} else if (local207 < 3300) {
							if (local207 == 3200) {
								local23 -= 3;
								Static7.method107(Static91.anIntArray193[local23 + 1], Static91.anIntArray193[local23], Static91.anIntArray193[local23 + 2]);
								continue;
							}
							if (local207 == 3201) {
								local23--;
								Static161.method2712(Static91.anIntArray193[local23]);
								continue;
							}
							if (local207 == 3202) {
								local23 -= 2;
								Static136.method2265(Static91.anIntArray193[local23 + 1], Static91.anIntArray193[local23]);
								continue;
							}
						} else if (local207 < 3400) {
							if (local207 == 3300) {
								Static91.anIntArray193[local23++] = Static127.anInt2757;
								continue;
							}
							if (local207 == 3301) {
								local23 -= 2;
								local774 = Static91.anIntArray193[local23];
								local768 = Static91.anIntArray193[local23 + 1];
								Static91.anIntArray193[local23++] = Static50.method898(local768, local774);
								continue;
							}
							if (local207 == 3302) {
								local23 -= 2;
								local768 = Static91.anIntArray193[local23 + 1];
								local774 = Static91.anIntArray193[local23];
								Static91.anIntArray193[local23++] = Static27.method484(local768, local774);
								continue;
							}
							if (local207 == 3303) {
								local23 -= 2;
								local774 = Static91.anIntArray193[local23];
								local768 = Static91.anIntArray193[local23 + 1];
								Static91.anIntArray193[local23++] = Static85.method1445(local774, local768);
								continue;
							}
							if (local207 == 3304) {
								local23--;
								local774 = Static91.anIntArray193[local23];
								Static91.anIntArray193[local23++] = Static17.method2064(local774).anInt1155;
								continue;
							}
							if (local207 == 3305) {
								local23--;
								local774 = Static91.anIntArray193[local23];
								Static91.anIntArray193[local23++] = Static17.anIntArray242[local774];
								continue;
							}
							if (local207 == 3306) {
								local23--;
								local774 = Static91.anIntArray193[local23];
								Static91.anIntArray193[local23++] = Static163.anIntArray58[local774];
								continue;
							}
							if (local207 == 3307) {
								local23--;
								local774 = Static91.anIntArray193[local23];
								Static91.anIntArray193[local23++] = Static171.anIntArray333[local774];
								continue;
							}
							if (local207 == 3308) {
								local774 = Static66.anInt1396;
								local768 = (Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anInt3529 >> 7) + Static49.anInt1133;
								local1776 = Static38.anInt944 + (Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anInt3578 >> 7);
								Static91.anIntArray193[local23++] = (local768 << 14) + (local774 << 28) + local1776;
								continue;
							}
							if (local207 == 3309) {
								local23--;
								local774 = Static91.anIntArray193[local23];
								Static91.anIntArray193[local23++] = local774 >> 14 & 0x3FFF;
								continue;
							}
							if (local207 == 3310) {
								local23--;
								local774 = Static91.anIntArray193[local23];
								Static91.anIntArray193[local23++] = local774 >> 28;
								continue;
							}
							if (local207 == 3311) {
								local23--;
								local774 = Static91.anIntArray193[local23];
								Static91.anIntArray193[local23++] = local774 & 0x3FFF;
								continue;
							}
							if (local207 == 3312) {
								Static91.anIntArray193[local23++] = Static62.aBoolean56 ? 1 : 0;
								continue;
							}
							if (local207 == 3313) {
								local23 -= 2;
								local774 = Static91.anIntArray193[local23] + 32768;
								local768 = Static91.anIntArray193[local23 + 1];
								Static91.anIntArray193[local23++] = Static50.method898(local768, local774);
								continue;
							}
							if (local207 == 3314) {
								local23 -= 2;
								local768 = Static91.anIntArray193[local23 + 1];
								local774 = Static91.anIntArray193[local23] + 32768;
								Static91.anIntArray193[local23++] = Static27.method484(local768, local774);
								continue;
							}
							if (local207 == 3315) {
								local23 -= 2;
								local774 = Static91.anIntArray193[local23] + 32768;
								local768 = Static91.anIntArray193[local23 + 1];
								Static91.anIntArray193[local23++] = Static85.method1445(local774, local768);
								continue;
							}
							if (local207 == 3316) {
								if (Static102.anInt2166 >= 2) {
									Static91.anIntArray193[local23++] = Static102.anInt2166;
								} else {
									Static91.anIntArray193[local23++] = 0;
								}
								continue;
							}
							if (local207 == 3317) {
								Static91.anIntArray193[local23++] = Static28.anInt626;
								continue;
							}
							if (local207 == 3318) {
								Static91.anIntArray193[local23++] = Static67.anInt1405;
								continue;
							}
							if (local207 == 3321) {
								Static91.anIntArray193[local23++] = Static155.anInt3386;
								continue;
							}
							if (local207 == 3322) {
								Static91.anIntArray193[local23++] = Static163.anInt694;
								continue;
							}
							if (local207 == 3323) {
								if (Static102.anInt2166 == 1) {
									Static91.anIntArray193[local23++] = 1;
								} else {
									Static91.anIntArray193[local23++] = 0;
								}
								continue;
							}
							if (local207 == 3324) {
								if (Static178.anInt3900 >= 5 && Static178.anInt3900 <= 9) {
									Static91.anIntArray193[local23++] = Static178.anInt3900;
									continue;
								}
								Static91.anIntArray193[local23++] = 0;
								continue;
							}
							if (local207 == 3325) {
								if (Static78.anInt1632 > 0) {
									Static91.anIntArray193[local23++] = 1;
								} else {
									Static91.anIntArray193[local23++] = 0;
								}
								continue;
							}
							if (local207 == 3326) {
								Static91.anIntArray193[local23++] = Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anInt3599;
								continue;
							}
							if (local207 == 3327) {
								Static91.anIntArray193[local23++] = Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.aClass10_2.aBoolean13 ? 1 : 0;
								continue;
							}
						} else if (local207 < 3500) {
							if (local207 == 3400) {
								local23 -= 2;
								local774 = Static91.anIntArray193[local23];
								local768 = Static91.anIntArray193[local23 + 1];
								@Pc(3453) Class2_Sub2_Sub1 local3453 = Static66.method1123(local774);
								for (local617 = 0; local617 < local3453.anInt51; local617++) {
									if (local3453.anIntArray4[local617] == local768) {
										Static12.aClass49Array2[local28++] = local3453.aClass49Array1[local617];
										local3453 = null;
										break;
									}
								}
								if (local3453 != null) {
									Static12.aClass49Array2[local28++] = local3453.aClass49_47;
								}
								continue;
							}
							if (local207 == 3408) {
								local23 -= 4;
								local774 = Static91.anIntArray193[local23];
								local768 = Static91.anIntArray193[local23 + 1];
								local1776 = Static91.anIntArray193[local23 + 2];
								local617 = Static91.anIntArray193[local23 + 3];
								@Pc(3523) Class2_Sub2_Sub1 local3523 = Static66.method1123(local1776);
								if (local3523.anInt53 == local774 && local768 == local3523.anInt58) {
									for (local2004 = 0; local2004 < local3523.anInt51; local2004++) {
										if (local3523.anIntArray4[local2004] == local617) {
											if (local768 == 115) {
												Static12.aClass49Array2[local28++] = local3523.aClass49Array1[local2004];
											} else {
												Static91.anIntArray193[local23++] = local3523.anIntArray3[local2004];
											}
											local3523 = null;
											break;
										}
									}
									if (local3523 != null) {
										if (local768 == 115) {
											Static12.aClass49Array2[local28++] = local3523.aClass49_47;
										} else {
											Static91.anIntArray193[local23++] = local3523.anInt50;
										}
									}
									continue;
								}
								if (local768 == 115) {
									Static12.aClass49Array2[local28++] = Static150.aClass49_1454;
								} else {
									Static91.anIntArray193[local23++] = 0;
								}
								continue;
							}
						} else if (local207 < 3700) {
							if (local207 == 3600) {
								if (Static142.anInt3015 == 0) {
									Static91.anIntArray193[local23++] = -2;
								} else if (Static142.anInt3015 == 1) {
									Static91.anIntArray193[local23++] = -1;
								} else {
									Static91.anIntArray193[local23++] = Static175.anInt3799;
								}
								continue;
							}
							if (local207 == 3601) {
								local23--;
								local774 = Static91.anIntArray193[local23];
								if (Static142.anInt3015 == 2 && local774 < Static175.anInt3799) {
									Static12.aClass49Array2[local28++] = Static101.aClass49Array14[local774];
									continue;
								}
								Static12.aClass49Array2[local28++] = Static49.aClass49_563;
								continue;
							}
							if (local207 == 3602) {
								local23--;
								local774 = Static91.anIntArray193[local23];
								if (Static142.anInt3015 == 2 && Static175.anInt3799 > local774) {
									Static91.anIntArray193[local23++] = Static85.anIntArray188[local774];
									continue;
								}
								Static91.anIntArray193[local23++] = 0;
								continue;
							}
							if (local207 == 3603) {
								local23--;
								local774 = Static91.anIntArray193[local23];
								if (Static142.anInt3015 == 2 && Static175.anInt3799 > local774) {
									Static91.anIntArray193[local23++] = Static126.anIntArray261[local774];
									continue;
								}
								Static91.anIntArray193[local23++] = 0;
								continue;
							}
							if (local207 == 3604) {
								local28--;
								local575 = Static12.aClass49Array2[local28];
								local23--;
								local768 = Static91.anIntArray193[local23];
								Static13.method202(local768, local575);
								continue;
							}
							if (local207 == 3605) {
								local28--;
								local575 = Static12.aClass49Array2[local28];
								Static79.method3010(local575.method1651());
								continue;
							}
							if (local207 == 3606) {
								local28--;
								local575 = Static12.aClass49Array2[local28];
								Static93.method1592(local575.method1651());
								continue;
							}
							if (local207 == 3607) {
								local28--;
								local575 = Static12.aClass49Array2[local28];
								Static48.method883(local575.method1651());
								continue;
							}
							if (local207 == 3608) {
								local28--;
								local575 = Static12.aClass49Array2[local28];
								Static169.method2804(local575.method1651());
								continue;
							}
							if (local207 == 3609) {
								local28--;
								local575 = Static12.aClass49Array2[local28];
								if (local575.method1660(Static73.aClass49_799) || local575.method1660(Static40.aClass49_498)) {
									local575 = local575.method1665(7);
								}
								Static91.anIntArray193[local23++] = Static21.method399(local575) ? 1 : 0;
								continue;
							}
							if (local207 == 3611) {
								if (Static18.aClass49_240 == null) {
									Static12.aClass49Array2[local28++] = Static49.aClass49_563;
								} else {
									Static12.aClass49Array2[local28++] = Static18.aClass49_240.method1677();
								}
								continue;
							}
							if (local207 == 3612) {
								if (Static18.aClass49_240 == null) {
									Static91.anIntArray193[local23++] = 0;
								} else {
									Static91.anIntArray193[local23++] = Static107.anInt2240;
								}
								continue;
							}
							if (local207 == 3613) {
								local23--;
								local774 = Static91.anIntArray193[local23];
								if (Static18.aClass49_240 != null && local774 < Static107.anInt2240) {
									Static12.aClass49Array2[local28++] = Static169.aClass2_Sub15Array1[local774].aClass49_866.method1677();
									continue;
								}
								Static12.aClass49Array2[local28++] = Static49.aClass49_563;
								continue;
							}
							if (local207 == 3614) {
								local23--;
								local774 = Static91.anIntArray193[local23];
								if (Static18.aClass49_240 != null && local774 < Static107.anInt2240) {
									Static91.anIntArray193[local23++] = Static169.aClass2_Sub15Array1[local774].anInt1733;
									continue;
								}
								Static91.anIntArray193[local23++] = 0;
								continue;
							}
							if (local207 == 3615) {
								local23--;
								local774 = Static91.anIntArray193[local23];
								if (Static18.aClass49_240 != null && Static107.anInt2240 > local774) {
									Static91.anIntArray193[local23++] = Static169.aClass2_Sub15Array1[local774].aByte5;
									continue;
								}
								Static91.anIntArray193[local23++] = 0;
								continue;
							}
							if (local207 == 3616) {
								Static91.anIntArray193[local23++] = aByte8;
								continue;
							}
							if (local207 == 3617) {
								local28--;
								local575 = Static12.aClass49Array2[local28];
								Static150.method2470(local575);
								continue;
							}
							if (local207 == 3618) {
								Static91.anIntArray193[local23++] = Static59.aByte2;
								continue;
							}
							if (local207 == 3619) {
								local28--;
								local575 = Static12.aClass49Array2[local28];
								Static170.method2830(local575.method1651());
								continue;
							}
							if (local207 == 3620) {
								Static94.method1609();
								continue;
							}
							if (local207 == 3621) {
								if (Static142.anInt3015 == 0) {
									Static91.anIntArray193[local23++] = -1;
								} else {
									Static91.anIntArray193[local23++] = Static18.anInt381;
								}
								continue;
							}
							if (local207 == 3622) {
								local23--;
								local774 = Static91.anIntArray193[local23];
								if (Static142.anInt3015 != 0 && Static18.anInt381 > local774) {
									Static12.aClass49Array2[local28++] = method2046(Static76.aLongArray11[local774]).method1677();
									continue;
								}
								Static12.aClass49Array2[local28++] = Static49.aClass49_563;
								continue;
							}
							if (local207 == 3623) {
								local28--;
								local575 = Static12.aClass49Array2[local28];
								if (local575.method1660(Static73.aClass49_799) || local575.method1660(Static40.aClass49_498)) {
									local575 = local575.method1665(7);
								}
								Static91.anIntArray193[local23++] = Static170.method2829(local575) ? 1 : 0;
								continue;
							}
							if (local207 == 3624) {
								local23--;
								local774 = Static91.anIntArray193[local23];
								if (Static169.aClass2_Sub15Array1 != null && local774 < Static107.anInt2240 && Static169.aClass2_Sub15Array1[local774].aClass49_866.method1645(Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.aClass49_1606)) {
									Static91.anIntArray193[local23++] = 1;
									continue;
								}
								Static91.anIntArray193[local23++] = 0;
								continue;
							}
							if (local207 == 3625) {
								if (Static40.aClass49_503 == null) {
									Static12.aClass49Array2[local28++] = Static49.aClass49_563;
								} else {
									Static12.aClass49Array2[local28++] = Static40.aClass49_503.method1677();
								}
								continue;
							}
						} else if (local207 < 4000) {
							if (local207 == 3903) {
								local23--;
								local774 = Static91.anIntArray193[local23];
								Static91.anIntArray193[local23++] = Static17.aClass61Array2[local774].method1969();
								continue;
							}
							if (local207 == 3904) {
								local23--;
								local774 = Static91.anIntArray193[local23];
								Static91.anIntArray193[local23++] = Static17.aClass61Array2[local774].anInt2437;
								continue;
							}
							if (local207 == 3905) {
								local23--;
								local774 = Static91.anIntArray193[local23];
								Static91.anIntArray193[local23++] = Static17.aClass61Array2[local774].anInt2441;
								continue;
							}
							if (local207 == 3906) {
								local23--;
								local774 = Static91.anIntArray193[local23];
								Static91.anIntArray193[local23++] = Static17.aClass61Array2[local774].anInt2442;
								continue;
							}
							if (local207 == 3907) {
								local23--;
								local774 = Static91.anIntArray193[local23];
								Static91.anIntArray193[local23++] = Static17.aClass61Array2[local774].anInt2439;
								continue;
							}
							if (local207 == 3908) {
								local23--;
								local774 = Static91.anIntArray193[local23];
								Static91.anIntArray193[local23++] = Static17.aClass61Array2[local774].anInt2440;
								continue;
							}
							if (local207 == 3910) {
								local23--;
								local774 = Static91.anIntArray193[local23];
								local768 = Static17.aClass61Array2[local774].method1968();
								Static91.anIntArray193[local23++] = local768 == 0 ? 1 : 0;
								continue;
							}
							if (local207 == 3911) {
								local23--;
								local774 = Static91.anIntArray193[local23];
								local768 = Static17.aClass61Array2[local774].method1968();
								Static91.anIntArray193[local23++] = local768 == 2 ? 1 : 0;
								continue;
							}
							if (local207 == 3912) {
								local23--;
								local774 = Static91.anIntArray193[local23];
								local768 = Static17.aClass61Array2[local774].method1968();
								Static91.anIntArray193[local23++] = local768 == 5 ? 1 : 0;
								continue;
							}
							if (local207 == 3913) {
								local23--;
								local774 = Static91.anIntArray193[local23];
								local768 = Static17.aClass61Array2[local774].method1968();
								Static91.anIntArray193[local23++] = local768 == 1 ? 1 : 0;
								continue;
							}
						} else if (local207 < 4100) {
							if (local207 == 4000) {
								local23 -= 2;
								local774 = Static91.anIntArray193[local23];
								local768 = Static91.anIntArray193[local23 + 1];
								Static91.anIntArray193[local23++] = local768 + local774;
								continue;
							}
							if (local207 == 4001) {
								local23 -= 2;
								local768 = Static91.anIntArray193[local23 + 1];
								local774 = Static91.anIntArray193[local23];
								Static91.anIntArray193[local23++] = local774 - local768;
								continue;
							}
							if (local207 == 4002) {
								local23 -= 2;
								local768 = Static91.anIntArray193[local23 + 1];
								local774 = Static91.anIntArray193[local23];
								Static91.anIntArray193[local23++] = local768 * local774;
								continue;
							}
							if (local207 == 4003) {
								local23 -= 2;
								local774 = Static91.anIntArray193[local23];
								local768 = Static91.anIntArray193[local23 + 1];
								Static91.anIntArray193[local23++] = local774 / local768;
								continue;
							}
							if (local207 == 4004) {
								local23--;
								local774 = Static91.anIntArray193[local23];
								Static91.anIntArray193[local23++] = (int) (Math.random() * (double) local774);
								continue;
							}
							if (local207 == 4005) {
								local23--;
								local774 = Static91.anIntArray193[local23];
								Static91.anIntArray193[local23++] = (int) ((double) (local774 + 1) * Math.random());
								continue;
							}
							if (local207 == 4006) {
								local23 -= 5;
								local768 = Static91.anIntArray193[local23 + 1];
								local774 = Static91.anIntArray193[local23];
								local1776 = Static91.anIntArray193[local23 + 2];
								local617 = Static91.anIntArray193[local23 + 3];
								local637 = Static91.anIntArray193[local23 + 4];
								Static91.anIntArray193[local23++] = (local768 - local774) * (local637 + -local1776) / (local617 - local1776) + local774;
								continue;
							}
							if (local207 == 4007) {
								local23 -= 2;
								local774 = Static91.anIntArray193[local23];
								local768 = Static91.anIntArray193[local23 + 1];
								Static91.anIntArray193[local23++] = local774 + local768 * local774 / 100;
								continue;
							}
							if (local207 == 4008) {
								local23 -= 2;
								local768 = Static91.anIntArray193[local23 + 1];
								local774 = Static91.anIntArray193[local23];
								Static91.anIntArray193[local23++] = local774 | 0x1 << local768;
								continue;
							}
							if (local207 == 4009) {
								local23 -= 2;
								local774 = Static91.anIntArray193[local23];
								local768 = Static91.anIntArray193[local23 + 1];
								Static91.anIntArray193[local23++] = -(0x1 << local768) - 1 & local774;
								continue;
							}
							if (local207 == 4010) {
								local23 -= 2;
								local768 = Static91.anIntArray193[local23 + 1];
								local774 = Static91.anIntArray193[local23];
								Static91.anIntArray193[local23++] = (local774 & 0x1 << local768) == 0 ? 0 : 1;
								continue;
							}
							if (local207 == 4011) {
								local23 -= 2;
								local774 = Static91.anIntArray193[local23];
								local768 = Static91.anIntArray193[local23 + 1];
								Static91.anIntArray193[local23++] = local774 % local768;
								continue;
							}
							if (local207 == 4012) {
								local23 -= 2;
								local774 = Static91.anIntArray193[local23];
								local768 = Static91.anIntArray193[local23 + 1];
								if (local774 == 0) {
									Static91.anIntArray193[local23++] = 0;
								} else {
									Static91.anIntArray193[local23++] = (int) Math.pow((double) local774, (double) local768);
								}
								continue;
							}
							if (local207 == 4013) {
								local23 -= 2;
								local774 = Static91.anIntArray193[local23];
								local768 = Static91.anIntArray193[local23 + 1];
								if (local774 == 0) {
									Static91.anIntArray193[local23++] = 0;
								} else if (local768 == 0) {
									Static91.anIntArray193[local23++] = Integer.MAX_VALUE;
								} else {
									Static91.anIntArray193[local23++] = (int) Math.pow((double) local774, 1.0D / (double) local768);
								}
								continue;
							}
							if (local207 == 4014) {
								local23 -= 2;
								local774 = Static91.anIntArray193[local23];
								local768 = Static91.anIntArray193[local23 + 1];
								Static91.anIntArray193[local23++] = local768 & local774;
								continue;
							}
							if (local207 == 4015) {
								local23 -= 2;
								local774 = Static91.anIntArray193[local23];
								local768 = Static91.anIntArray193[local23 + 1];
								Static91.anIntArray193[local23++] = local768 | local774;
								continue;
							}
							if (local207 == 4016) {
								local23 -= 2;
								local768 = Static91.anIntArray193[local23 + 1];
								local774 = Static91.anIntArray193[local23];
								Static91.anIntArray193[local23++] = local768 > local774 ? local774 : local768;
								continue;
							}
							if (local207 == 4017) {
								local23 -= 2;
								local768 = Static91.anIntArray193[local23 + 1];
								local774 = Static91.anIntArray193[local23];
								Static91.anIntArray193[local23++] = local774 <= local768 ? local768 : local774;
								continue;
							}
							if (local207 == 4018) {
								local23 -= 3;
								@Pc(6807) long local6807 = (long) Static91.anIntArray193[local23];
								@Pc(6814) long local6814 = (long) Static91.anIntArray193[local23 + 1];
								@Pc(6821) long local6821 = (long) Static91.anIntArray193[local23 + 2];
								Static91.anIntArray193[local23++] = (int) (local6821 * local6807 / local6814);
								continue;
							}
						} else if (local207 < 4200) {
							if (local207 == 4100) {
								local23--;
								local768 = Static91.anIntArray193[local23];
								local28--;
								local575 = Static12.aClass49Array2[local28];
								Static12.aClass49Array2[local28++] = Static33.method692(new Class49[] { local575, Static48.method882(local768) });
								continue;
							}
							if (local207 == 4101) {
								local28 -= 2;
								local575 = Static12.aClass49Array2[local28];
								local1500 = Static12.aClass49Array2[local28 + 1];
								Static12.aClass49Array2[local28++] = Static33.method692(new Class49[] { local575, local1500 });
								continue;
							}
							if (local207 == 4102) {
								local28--;
								local575 = Static12.aClass49Array2[local28];
								local23--;
								local768 = Static91.anIntArray193[local23];
								Static12.aClass49Array2[local28++] = Static33.method692(new Class49[] { local575, Static149.method2458(local768) });
								continue;
							}
							if (local207 == 4103) {
								local28--;
								local575 = Static12.aClass49Array2[local28];
								Static12.aClass49Array2[local28++] = local575.method1643();
								continue;
							}
							if (local207 == 4104) {
								local23--;
								local774 = Static91.anIntArray193[local23];
								@Pc(5705) long local5705 = (long) local774 * 86400000L + 1014768000000L;
								Static23.aCalendar1.setTime(new Date(local5705));
								local617 = Static23.aCalendar1.get(5);
								local637 = Static23.aCalendar1.get(2);
								local2004 = Static23.aCalendar1.get(1);
								Static12.aClass49Array2[local28++] = Static33.method692(new Class49[] { Static48.method882(local617), Static164.aClass49_1624, Static64.aClass49Array8[local637], Static164.aClass49_1624, Static48.method882(local2004) });
								continue;
							}
							if (local207 == 4105) {
								local28 -= 2;
								local575 = Static12.aClass49Array2[local28];
								local1500 = Static12.aClass49Array2[local28 + 1];
								if (Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.aClass10_2 != null && Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.aClass10_2.aBoolean13) {
									Static12.aClass49Array2[local28++] = local1500;
									continue;
								}
								Static12.aClass49Array2[local28++] = local575;
								continue;
							}
							if (local207 == 4106) {
								local23--;
								local774 = Static91.anIntArray193[local23];
								Static12.aClass49Array2[local28++] = Static48.method882(local774);
								continue;
							}
							if (local207 == 4107) {
								local28 -= 2;
								Static91.anIntArray193[local23++] = Static12.aClass49Array2[local28].method1673(Static12.aClass49Array2[local28 + 1]);
								continue;
							}
							@Pc(5867) Class2_Sub2_Sub2_Sub1_Sub1 local5867;
							@Pc(5862) byte[] local5862;
							if (local207 == 4108) {
								local23 -= 2;
								local28--;
								local575 = Static12.aClass49Array2[local28];
								local768 = Static91.anIntArray193[local23];
								local1776 = Static91.anIntArray193[local23 + 1];
								local5862 = Static62.aClass11_Sub1_19.method2049(0, local1776);
								local5867 = new Class2_Sub2_Sub2_Sub1_Sub1(local5862);
								local5867.method637(Static129.aClass2_Sub2_Sub2_Sub2Array8, null);
								Static91.anIntArray193[local23++] = local5867.method627(local575, local768);
								continue;
							}
							if (local207 == 4109) {
								local23 -= 2;
								local768 = Static91.anIntArray193[local23];
								local1776 = Static91.anIntArray193[local23 + 1];
								local28--;
								local575 = Static12.aClass49Array2[local28];
								local5862 = Static62.aClass11_Sub1_19.method2049(0, local1776);
								local5867 = new Class2_Sub2_Sub2_Sub1_Sub1(local5862);
								local5867.method637(Static129.aClass2_Sub2_Sub2_Sub2Array8, null);
								Static91.anIntArray193[local23++] = local5867.method623(local575, local768);
								continue;
							}
							if (local207 == 4110) {
								local28 -= 2;
								local575 = Static12.aClass49Array2[local28];
								local1500 = Static12.aClass49Array2[local28 + 1];
								local23--;
								if (Static91.anIntArray193[local23] == 1) {
									Static12.aClass49Array2[local28++] = local575;
								} else {
									Static12.aClass49Array2[local28++] = local1500;
								}
								continue;
							}
							if (local207 == 4111) {
								local28--;
								local575 = Static12.aClass49Array2[local28];
								Static12.aClass49Array2[local28++] = Static16.method618(local575);
								continue;
							}
							if (local207 == 4112) {
								local28--;
								local575 = Static12.aClass49Array2[local28];
								local23--;
								local768 = Static91.anIntArray193[local23];
								Static12.aClass49Array2[local28++] = local575.method1667(local768);
								continue;
							}
							if (local207 == 4113) {
								local23--;
								local774 = Static91.anIntArray193[local23];
								Static91.anIntArray193[local23++] = Static94.method1612(local774) ? 1 : 0;
								continue;
							}
							if (local207 == 4114) {
								local23--;
								local774 = Static91.anIntArray193[local23];
								Static91.anIntArray193[local23++] = Static37.method761(local774) ? 1 : 0;
								continue;
							}
							if (local207 == 4115) {
								local23--;
								local774 = Static91.anIntArray193[local23];
								Static91.anIntArray193[local23++] = Static53.method931(local774) ? 1 : 0;
								continue;
							}
							if (local207 == 4116) {
								local23--;
								local774 = Static91.anIntArray193[local23];
								Static91.anIntArray193[local23++] = Static69.method1151(local774) ? 1 : 0;
								continue;
							}
							if (local207 == 4117) {
								local28--;
								local575 = Static12.aClass49Array2[local28];
								if (local575 == null) {
									Static91.anIntArray193[local23++] = 0;
								} else {
									Static91.anIntArray193[local23++] = local575.method1653();
								}
								continue;
							}
							if (local207 == 4118) {
								local23 -= 2;
								local1776 = Static91.anIntArray193[local23 + 1];
								local768 = Static91.anIntArray193[local23];
								local28--;
								local575 = Static12.aClass49Array2[local28];
								Static12.aClass49Array2[local28++] = local575.method1661(local1776, local768);
								continue;
							}
							if (local207 == 4119) {
								local28--;
								local575 = Static12.aClass49Array2[local28];
								local1500 = Static162.method2742(local575.method1653());
								@Pc(6162) boolean local6162 = false;
								for (local617 = 0; local617 < local575.method1653(); local617++) {
									local637 = local575.method1646(local617);
									if (local637 == 60) {
										local6162 = true;
									} else if (local637 == 62) {
										local6162 = false;
									} else if (!local6162) {
										local1500.method1669(local637);
									}
								}
								local1500.method1658();
								Static12.aClass49Array2[local28++] = local1500;
								continue;
							}
							if (local207 == 4120) {
								local23 -= 2;
								local28--;
								local575 = Static12.aClass49Array2[local28];
								local1776 = Static91.anIntArray193[local23 + 1];
								local768 = Static91.anIntArray193[local23];
								Static91.anIntArray193[local23++] = local575.method1650(local768, local1776);
								continue;
							}
							if (local207 == 4121) {
								local28 -= 2;
								local575 = Static12.aClass49Array2[local28];
								local1500 = Static12.aClass49Array2[local28 + 1];
								local23--;
								local1776 = Static91.anIntArray193[local23];
								Static91.anIntArray193[local23++] = local575.method1671(local1776, local1500);
								continue;
							}
						} else if (local207 < 4300) {
							if (local207 == 4200) {
								local23--;
								local774 = Static91.anIntArray193[local23];
								Static12.aClass49Array2[local28++] = Static113.method1913(local774).aClass49_834;
								continue;
							}
							@Pc(4302) Class2_Sub2_Sub10 local4302;
							if (local207 == 4201) {
								local23 -= 2;
								local768 = Static91.anIntArray193[local23 + 1];
								local774 = Static91.anIntArray193[local23];
								local4302 = Static113.method1913(local774);
								if (local768 >= 1 && local768 <= 5 && local4302.aClass49Array11[local768 - 1] != null) {
									Static12.aClass49Array2[local28++] = local4302.aClass49Array11[local768 - 1];
									continue;
								}
								Static12.aClass49Array2[local28++] = Static49.aClass49_563;
								continue;
							}
							if (local207 == 4202) {
								local23 -= 2;
								local774 = Static91.anIntArray193[local23];
								local768 = Static91.anIntArray193[local23 + 1];
								local4302 = Static113.method1913(local774);
								if (local768 >= 1 && local768 <= 5 && local4302.aClass49Array12[local768 - 1] != null) {
									Static12.aClass49Array2[local28++] = local4302.aClass49Array12[local768 - 1];
									continue;
								}
								Static12.aClass49Array2[local28++] = Static49.aClass49_563;
								continue;
							}
							if (local207 == 4203) {
								local23--;
								local774 = Static91.anIntArray193[local23];
								Static91.anIntArray193[local23++] = Static113.method1913(local774).anInt1605;
								continue;
							}
							if (local207 == 4204) {
								local23--;
								local774 = Static91.anIntArray193[local23];
								Static91.anIntArray193[local23++] = Static113.method1913(local774).anInt1586 == 1 ? 1 : 0;
								continue;
							}
							@Pc(4453) Class2_Sub2_Sub10 local4453;
							if (local207 == 4205) {
								local23--;
								local774 = Static91.anIntArray193[local23];
								local4453 = Static113.method1913(local774);
								if (local4453.anInt1614 == -1 && local4453.anInt1592 >= 0) {
									Static91.anIntArray193[local23++] = local4453.anInt1592;
									continue;
								}
								Static91.anIntArray193[local23++] = local774;
								continue;
							}
							if (local207 == 4206) {
								local23--;
								local774 = Static91.anIntArray193[local23];
								local4453 = Static113.method1913(local774);
								if (local4453.anInt1614 >= 0 && local4453.anInt1592 >= 0) {
									Static91.anIntArray193[local23++] = local4453.anInt1592;
									continue;
								}
								Static91.anIntArray193[local23++] = local774;
								continue;
							}
							if (local207 == 4207) {
								local23--;
								local774 = Static91.anIntArray193[local23];
								Static91.anIntArray193[local23++] = Static113.method1913(local774).aBoolean69 ? 1 : 0;
								continue;
							}
							if (local207 == 4210) {
								local28--;
								local575 = Static12.aClass49Array2[local28];
								local23--;
								local768 = Static91.anIntArray193[local23];
								Static9.method131(local768 == 1, local575);
								Static91.anIntArray193[local23++] = Static12.anInt226;
								continue;
							}
							if (local207 == 4211) {
								if (Static35.aShortArray2 != null && Static143.anInt3040 < Static12.anInt226) {
									Static91.anIntArray193[local23++] = Static35.aShortArray2[Static143.anInt3040++] & 0xFFFF;
									continue;
								}
								Static91.anIntArray193[local23++] = -1;
								continue;
							}
							if (local207 == 4212) {
								Static143.anInt3040 = 0;
								continue;
							}
						} else if (local207 < 5100) {
							if (local207 == 5000) {
								Static91.anIntArray193[local23++] = Static76.anInt1568;
								continue;
							}
							if (local207 == 5001) {
								local23 -= 3;
								Static76.anInt1568 = Static91.anIntArray193[local23];
								Static128.anInt2776 = Static91.anIntArray193[local23 + 1];
								Static11.anInt189 = Static91.anIntArray193[local23 + 2];
								Static176.aClass2_Sub13_Sub1_14.method2976(42);
								Static176.aClass2_Sub13_Sub1_14.method2932(Static76.anInt1568);
								Static176.aClass2_Sub13_Sub1_14.method2932(Static128.anInt2776);
								Static176.aClass2_Sub13_Sub1_14.method2932(Static11.anInt189);
								continue;
							}
							if (local207 == 5002) {
								local23 -= 2;
								local768 = Static91.anIntArray193[local23];
								local28--;
								local575 = Static12.aClass49Array2[local28];
								local1776 = Static91.anIntArray193[local23 + 1];
								Static176.aClass2_Sub13_Sub1_14.method2976(165);
								Static176.aClass2_Sub13_Sub1_14.method2956(local575.method1651());
								Static176.aClass2_Sub13_Sub1_14.method2932(local768 - 1);
								Static176.aClass2_Sub13_Sub1_14.method2932(local1776);
								continue;
							}
							if (local207 == 5003) {
								local23--;
								local774 = Static91.anIntArray193[local23];
								local1500 = null;
								if (local774 < 100) {
									local1500 = Static81.aClass49Array13[local774];
								}
								if (local1500 == null) {
									local1500 = Static49.aClass49_563;
								}
								Static12.aClass49Array2[local28++] = local1500;
								continue;
							}
							if (local207 == 5004) {
								local768 = -1;
								local23--;
								local774 = Static91.anIntArray193[local23];
								if (local774 < 100 && Static81.aClass49Array13[local774] != null) {
									local768 = Static94.anIntArray201[local774];
								}
								Static91.anIntArray193[local23++] = local768;
								continue;
							}
							if (local207 == 5005) {
								Static91.anIntArray193[local23++] = Static128.anInt2776;
								continue;
							}
							if (local207 == 5008) {
								local28--;
								local575 = Static12.aClass49Array2[local28];
								if (local575.method1660(Static115.aClass49_1110)) {
									Static144.method2372(local575);
								} else {
									local1500 = local575.method1643();
									@Pc(4819) byte local4819 = 0;
									@Pc(4821) byte local4821 = 0;
									if (local1500.method1660(Static121.aClass49_1169)) {
										local575 = local575.method1665(Static121.aClass49_1169.method1653());
										local4819 = 0;
									} else if (local1500.method1660(Static139.aClass49_1342)) {
										local4819 = 1;
										local575 = local575.method1665(Static139.aClass49_1342.method1653());
									} else if (local1500.method1660(Static49.aClass49_560)) {
										local4819 = 2;
										local575 = local575.method1665(Static49.aClass49_560.method1653());
									} else if (local1500.method1660(Static61.aClass49_667)) {
										local575 = local575.method1665(Static61.aClass49_667.method1653());
										local4819 = 3;
									} else if (local1500.method1660(Static95.aClass49_974)) {
										local4819 = 4;
										local575 = local575.method1665(Static95.aClass49_974.method1653());
									} else if (local1500.method1660(Static21.aClass49_273)) {
										local4819 = 5;
										local575 = local575.method1665(Static21.aClass49_273.method1653());
									} else if (local1500.method1660(Static79.aClass49_1751)) {
										local4819 = 6;
										local575 = local575.method1665(Static79.aClass49_1751.method1653());
									} else if (local1500.method1660(Static138.aClass49_1330)) {
										local4819 = 7;
										local575 = local575.method1665(Static138.aClass49_1330.method1653());
									} else if (local1500.method1660(Static48.aClass49_555)) {
										local4819 = 8;
										local575 = local575.method1665(Static48.aClass49_555.method1653());
									} else if (local1500.method1660(Static185.aClass49_1764)) {
										local4819 = 9;
										local575 = local575.method1665(Static185.aClass49_1764.method1653());
									} else if (local1500.method1660(Static3.aClass49_42)) {
										local575 = local575.method1665(Static3.aClass49_42.method1653());
										local4819 = 10;
									} else if (local1500.method1660(Static71.aClass49_776)) {
										local575 = local575.method1665(Static71.aClass49_776.method1653());
										local4819 = 11;
									} else if (Static45.anInt1056 != 0) {
										if (local1500.method1660(Static121.aClass49_1173)) {
											local575 = local575.method1665(Static121.aClass49_1173.method1653());
											local4819 = 0;
										} else if (local1500.method1660(Static139.aClass49_1343)) {
											local575 = local575.method1665(Static139.aClass49_1343.method1653());
											local4819 = 1;
										} else if (local1500.method1660(Static49.aClass49_559)) {
											local4819 = 2;
											local575 = local575.method1665(Static49.aClass49_559.method1653());
										} else if (local1500.method1660(Static61.aClass49_666)) {
											local4819 = 3;
											local575 = local575.method1665(Static61.aClass49_666.method1653());
										} else if (local1500.method1660(Static95.aClass49_973)) {
											local4819 = 4;
											local575 = local575.method1665(Static95.aClass49_973.method1653());
										} else if (local1500.method1660(Static21.aClass49_274)) {
											local4819 = 5;
											local575 = local575.method1665(Static21.aClass49_274.method1653());
										} else if (local1500.method1660(Static79.aClass49_1750)) {
											local575 = local575.method1665(Static79.aClass49_1750.method1653());
											local4819 = 6;
										} else if (local1500.method1660(Static138.aClass49_1327)) {
											local4819 = 7;
											local575 = local575.method1665(Static138.aClass49_1327.method1653());
										} else if (local1500.method1660(Static48.aClass49_552)) {
											local575 = local575.method1665(Static48.aClass49_552.method1653());
											local4819 = 8;
										} else if (local1500.method1660(Static185.aClass49_1760)) {
											local4819 = 9;
											local575 = local575.method1665(Static185.aClass49_1760.method1653());
										} else if (local1500.method1660(Static3.aClass49_48)) {
											local4819 = 10;
											local575 = local575.method1665(Static3.aClass49_48.method1653());
										} else if (local1500.method1660(Static71.aClass49_775)) {
											local4819 = 11;
											local575 = local575.method1665(Static71.aClass49_775.method1653());
										}
									}
									local1500 = local575.method1643();
									if (local1500.method1660(Static62.aClass49_682)) {
										local575 = local575.method1665(Static62.aClass49_682.method1653());
										local4821 = 1;
									} else if (local1500.method1660(Static122.aClass49_1181)) {
										local4821 = 2;
										local575 = local575.method1665(Static122.aClass49_1181.method1653());
									} else if (local1500.method1660(Static100.aClass49_1012)) {
										local575 = local575.method1665(Static100.aClass49_1012.method1653());
										local4821 = 3;
									} else if (local1500.method1660(Static103.aClass49_1029)) {
										local575 = local575.method1665(Static103.aClass49_1029.method1653());
										local4821 = 4;
									} else if (local1500.method1660(Static156.aClass49_1526)) {
										local4821 = 5;
										local575 = local575.method1665(Static156.aClass49_1526.method1653());
									} else if (Static45.anInt1056 != 0) {
										if (local1500.method1660(Static62.aClass49_687)) {
											local575 = local575.method1665(Static62.aClass49_687.method1653());
											local4821 = 1;
										} else if (local1500.method1660(Static122.aClass49_1177)) {
											local4821 = 2;
											local575 = local575.method1665(Static122.aClass49_1177.method1653());
										} else if (local1500.method1660(Static100.aClass49_1014)) {
											local575 = local575.method1665(Static100.aClass49_1014.method1653());
											local4821 = 3;
										} else if (local1500.method1660(Static103.aClass49_1028)) {
											local575 = local575.method1665(Static103.aClass49_1028.method1653());
											local4821 = 4;
										} else if (local1500.method1660(Static156.aClass49_1518)) {
											local575 = local575.method1665(Static156.aClass49_1518.method1653());
											local4821 = 5;
										}
									}
									Static176.aClass2_Sub13_Sub1_14.method2976(218);
									Static176.aClass2_Sub13_Sub1_14.method2932(0);
									local637 = Static176.aClass2_Sub13_Sub1_14.anInt3940;
									Static176.aClass2_Sub13_Sub1_14.method2932(local4819);
									Static176.aClass2_Sub13_Sub1_14.method2932(local4821);
									Static149.method2455(Static176.aClass2_Sub13_Sub1_14, local575);
									Static176.aClass2_Sub13_Sub1_14.method2929(Static176.aClass2_Sub13_Sub1_14.anInt3940 - local637);
								}
								continue;
							}
							if (local207 == 5009) {
								local28 -= 2;
								local1500 = Static12.aClass49Array2[local28 + 1];
								local575 = Static12.aClass49Array2[local28];
								Static176.aClass2_Sub13_Sub1_14.method2976(178);
								Static176.aClass2_Sub13_Sub1_14.method2932(0);
								local1776 = Static176.aClass2_Sub13_Sub1_14.anInt3940;
								Static176.aClass2_Sub13_Sub1_14.method2956(local575.method1651());
								Static149.method2455(Static176.aClass2_Sub13_Sub1_14, local1500);
								Static176.aClass2_Sub13_Sub1_14.method2929(Static176.aClass2_Sub13_Sub1_14.anInt3940 - local1776);
								continue;
							}
							if (local207 == 5010) {
								local23--;
								local774 = Static91.anIntArray193[local23];
								local1500 = null;
								if (local774 < 100) {
									local1500 = Static103.aClass49Array17[local774];
								}
								if (local1500 == null) {
									local1500 = Static49.aClass49_563;
								}
								Static12.aClass49Array2[local28++] = local1500;
								continue;
							}
							if (local207 == 5011) {
								local23--;
								local774 = Static91.anIntArray193[local23];
								local1500 = null;
								if (local774 < 100) {
									local1500 = Static69.aClass49Array9[local774];
								}
								if (local1500 == null) {
									local1500 = Static49.aClass49_563;
								}
								Static12.aClass49Array2[local28++] = local1500;
								continue;
							}
							if (local207 == 5015) {
								if (Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1 == null || Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.aClass49_1606 == null) {
									local575 = Static129.aClass49_1264;
								} else {
									local575 = Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.aClass49_1606;
								}
								Static12.aClass49Array2[local28++] = local575;
								continue;
							}
							if (local207 == 5016) {
								Static91.anIntArray193[local23++] = Static11.anInt189;
								continue;
							}
							if (local207 == 5017) {
								Static91.anIntArray193[local23++] = Static4.anInt68;
								continue;
							}
						}
					} else {
						if (local207 < 2000) {
							local1058 = local945 ? Static118.aClass85_11 : Static111.aClass85_10;
						} else {
							local23--;
							local1058 = Static140.method2337(Static91.anIntArray193[local23]);
							local207 -= 1000;
						}
						if (local207 == 1300) {
							local23--;
							local768 = Static91.anIntArray193[local23] - 1;
							if (local768 >= 0 && local768 <= 9) {
								local28--;
								local1058.method2890(local768, Static12.aClass49Array2[local28]);
								continue;
							}
							local28--;
							continue;
						}
						if (local207 == 1301) {
							local23 -= 2;
							local768 = Static91.anIntArray193[local23];
							local1776 = Static91.anIntArray193[local23 + 1];
							local1058.aClass85_15 = Static114.method1938(local768, local1776);
							continue;
						}
						if (local207 == 1302) {
							local23--;
							local1058.aBoolean165 = Static91.anIntArray193[local23] == 1;
							continue;
						}
						if (local207 == 1303) {
							local23--;
							local1058.anInt3859 = Static91.anIntArray193[local23];
							continue;
						}
						if (local207 == 1304) {
							local23--;
							local1058.anInt3852 = Static91.anIntArray193[local23];
							continue;
						}
						if (local207 == 1305) {
							local28--;
							local1058.aClass49_1709 = Static12.aClass49Array2[local28];
							continue;
						}
						if (local207 == 1306) {
							local28--;
							local1058.aClass49_1710 = Static12.aClass49Array2[local28];
							continue;
						}
						if (local207 == 1307) {
							local1058.aClass49Array22 = null;
							continue;
						}
					}
				} else {
					if (local207 >= 2000) {
						local207 -= 1000;
						local23--;
						local1058 = Static140.method2337(Static91.anIntArray193[local23]);
					} else {
						local1058 = local945 ? Static118.aClass85_11 : Static111.aClass85_10;
					}
					if (local207 == 1000) {
						local23 -= 2;
						local1058.anInt3827 = Static91.anIntArray193[local23];
						local1058.anInt3886 = Static91.anIntArray193[local23 + 1];
						Static102.method1756(local1058);
						continue;
					}
					if (local207 == 1001) {
						local23 -= 2;
						local1058.anInt3858 = Static91.anIntArray193[local23];
						local1058.anInt3867 = Static91.anIntArray193[local23 + 1];
						Static102.method1756(local1058);
						continue;
					}
					if (local207 == 1003) {
						local23--;
						@Pc(1127) boolean local1127 = Static91.anIntArray193[local23] == 1;
						if (local1127 != local1058.aBoolean161) {
							local1058.aBoolean161 = local1127;
							Static102.method1756(local1058);
						}
						continue;
					}
				}
				throw new IllegalStateException();
			}
		} catch (@Pc(7968) Exception local7968) {
			if (local18.aClass49_1678 == null) {
				if (Static27.anInt594 != 0) {
					Static88.method1475(Static49.aClass49_563, Static70.aClass49_760, 0);
				}
				Static8.method1789("CS2 - scr:" + local18.aLong157 + " op:" + local35, local7968);
			} else {
				@Pc(7975) Class49 local7975 = Static162.method2742(30);
				local7975.method1662(Static142.aClass49_1364).method1662(local18.aClass49_1678);
				for (local55 = Static66.anInt1394 - 1; local55 >= 0; local55--) {
					local7975.method1662(Static121.aClass49_1171).method1662(Static121.aClass23Array1[local55].aClass2_Sub2_Sub18_1.aClass49_1678);
				}
				if (local35 == 40) {
					local93 = local33[local37];
					local7975.method1662(Static34.aClass49_461).method1662(Static48.method882(local93));
				}
				if (Static27.anInt594 != 0) {
					Static88.method1475(Static49.aClass49_563, Static33.method692(new Class49[] { Static147.aClass49_1414, local18.aClass49_1678 }), 0);
				}
				Static8.method1789("CS2 - scr:" + local18.aLong157 + " op:" + local35 + new String(local7975.method1674()), local7968);
			}
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(BJ)Lclient!lf;")
	public static Class49 method2046(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(37) long local37 = arg0;
			@Pc(39) int local39 = 0;
			while (local37 != 0L) {
				local39++;
				local37 /= 37L;
			}
			@Pc(55) byte[] local55 = new byte[local39];
			while (arg0 != 0L) {
				@Pc(59) long local59 = arg0;
				arg0 /= 37L;
				local39--;
				local55[local39] = Static95.aByteArray27[(int) (local59 - arg0 * 37L)];
			}
			@Pc(86) Class49 local86 = new Class49();
			local86.aByteArray28 = local55;
			local86.anInt2058 = local55.length;
			return local86;
		}
	}
}
