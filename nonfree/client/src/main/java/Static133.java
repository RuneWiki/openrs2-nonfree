import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!we", name = "A", descriptor = "Lclient!ea;")
	public static Class20 aClass20_62;

	@OriginalMember(owner = "client!we", name = "B", descriptor = "Lclient!ea;")
	public static Class20 aClass20_63;

	@OriginalMember(owner = "client!we", name = "C", descriptor = "I")
	public static int anInt3150;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "I")
	public static int anInt3136 = 0;

	@OriginalMember(owner = "client!we", name = "e", descriptor = "Lclient!ge;")
	public static Class4_Sub11_Sub1 aClass4_Sub11_Sub1_3 = new Class4_Sub11_Sub1(5000);

	@OriginalMember(owner = "client!we", name = "f", descriptor = "I")
	public static volatile int anInt3140 = 0;

	@OriginalMember(owner = "client!we", name = "i", descriptor = "I")
	public static int anInt3142 = 0;

	@OriginalMember(owner = "client!we", name = "o", descriptor = "Lclient!ec;")
	private static Class22 aClass22_967 = Static60.method1113("wave2:");

	@OriginalMember(owner = "client!we", name = "k", descriptor = "Lclient!ec;")
	private static Class22 aClass22_966 = aClass22_967;

	@OriginalMember(owner = "client!we", name = "l", descriptor = "Z")
	public static volatile boolean aBoolean285 = false;

	@OriginalMember(owner = "client!we", name = "m", descriptor = "[I")
	public static int[] anIntArray344 = new int[500];

	@OriginalMember(owner = "client!we", name = "p", descriptor = "Lclient!ec;")
	public static Class22 aClass22_968 = Static60.method1113("Unerwartete Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!we", name = "q", descriptor = "[Lclient!h;")
	public static Class4_Sub1_Sub2_Sub2[] aClass4_Sub1_Sub2_Sub2Array15 = new Class4_Sub1_Sub2_Sub2[1000];

	@OriginalMember(owner = "client!we", name = "r", descriptor = "Lclient!ec;")
	public static Class22 aClass22_969 = Static60.method1113("blinken2:");

	@OriginalMember(owner = "client!we", name = "s", descriptor = "[Lclient!ec;")
	private static Class22[] aClass22Array24 = new Class22[1000];

	@OriginalMember(owner = "client!we", name = "t", descriptor = "I")
	public static int anInt3145 = 0;

	@OriginalMember(owner = "client!we", name = "u", descriptor = "Lclient!ec;")
	public static Class22 aClass22_970 = aClass22_967;

	@OriginalMember(owner = "client!we", name = "v", descriptor = "Lclient!f;")
	public static Class4_Sub7 aClass4_Sub7_16 = null;

	@OriginalMember(owner = "client!we", name = "D", descriptor = "I")
	public static int anInt3151 = 0;

	@OriginalMember(owner = "client!we", name = "E", descriptor = "I")
	public static int anInt3152 = 255;

	@OriginalMember(owner = "client!we", name = "G", descriptor = "Lclient!ec;")
	private static Class22 aClass22_971 = Static60.method1113("RuneScape is loading )2 please wait)3)3)3");

	@OriginalMember(owner = "client!we", name = "H", descriptor = "Lclient!ec;")
	public static Class22 aClass22_972 = Static60.method1113("(Z");

	@OriginalMember(owner = "client!we", name = "I", descriptor = "Lclient!ec;")
	public static Class22 aClass22_973 = Static60.method1113("weiss:");

	@OriginalMember(owner = "client!we", name = "J", descriptor = "Lclient!ec;")
	public static Class22 aClass22_974 = aClass22_971;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Z)V")
	public static void method2035() {
		try {
			if (Static80.anInt2197 == 1) {
				@Pc(17) int local17 = Static69.aClass4_Sub4_Sub1_2.method226();
				if (local17 > 0 && Static69.aClass4_Sub4_Sub1_2.method206()) {
					local17 -= Static60.anInt1790;
					if (local17 < 0) {
						local17 = 0;
					}
					Static69.aClass4_Sub4_Sub1_2.method205(local17);
				} else {
					Static69.aClass4_Sub4_Sub1_2.method228();
					Static69.aClass4_Sub4_Sub1_2.method207();
					Static134.aClass35_1 = null;
					if (Static30.aClass20_17 == null) {
						Static80.anInt2197 = 0;
					} else {
						Static80.anInt2197 = 2;
					}
					Static107.aClass4_Sub2_1 = null;
				}
			}
		} catch (@Pc(56) Exception local56) {
			local56.printStackTrace();
			Static69.aClass4_Sub4_Sub1_2.method228();
			Static134.aClass35_1 = null;
			Static80.anInt2197 = 0;
			Static107.aClass4_Sub2_1 = null;
			Static30.aClass20_17 = null;
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Lclient!bd;B)V")
	public static void method2036(@OriginalArg(0) Class4_Sub3 arg0) {
		@Pc(8) Object[] local8 = arg0.anObjectArray1;
		@Pc(14) int local14 = (Integer) local8[0];
		@Pc(18) Class4_Sub1_Sub16 local18 = Static28.method485(local14);
		if (local18 == null) {
			return;
		}
		Static117.anInt2886 = 0;
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = 0;
		@Pc(30) int[] local30 = local18.anIntArray312;
		@Pc(33) int[] local33 = local18.anIntArray313;
		@Pc(39) byte local39 = -1;
		@Pc(41) int local41 = -1;
		@Pc(55) int local55;
		@Pc(93) int local93;
		try {
			Static34.aClass22Array7 = new Class22[local18.anInt2925];
			@Pc(47) int local47 = 0;
			Static3.anIntArray3 = new int[local18.anInt2922];
			@Pc(53) int local53 = 0;
			for (local55 = 1; local55 < local8.length; local55++) {
				if (local8[local55] instanceof Integer) {
					local93 = (Integer) local8[local55];
					if (local93 == -2147483647) {
						local93 = arg0.anInt207;
					}
					if (local93 == -2147483646) {
						local93 = arg0.anInt211;
					}
					if (local93 == -2147483645) {
						local93 = arg0.aClass4_Sub7_3 == null ? -1 : arg0.aClass4_Sub7_3.anInt738;
					}
					if (local93 == -2147483644) {
						local93 = arg0.anInt208;
					}
					if (local93 == -2147483643) {
						local93 = arg0.aClass4_Sub7_3 == null ? -1 : arg0.aClass4_Sub7_3.anInt784;
					}
					if (local93 == -2147483642) {
						local93 = arg0.aClass4_Sub7_2 == null ? -1 : arg0.aClass4_Sub7_2.anInt738;
					}
					if (local93 == -2147483641) {
						local93 = arg0.aClass4_Sub7_2 == null ? -1 : arg0.aClass4_Sub7_2.anInt784;
					}
					if (local93 == -2147483640) {
						local93 = arg0.anInt204;
					}
					if (local93 == -2147483639) {
						local93 = arg0.anInt210;
					}
					Static3.anIntArray3[local47++] = local93;
				} else if (local8[local55] instanceof Class22) {
					@Pc(72) Class22 local72 = (Class22) local8[local55];
					if (local72.method481(Static85.aClass22_641)) {
						local72 = arg0.aClass22_79;
					}
					Static34.aClass22Array7[local53++] = local72;
				}
			}
			local93 = 0;
			label1965: while (true) {
				local93++;
				if (local93 > 200000) {
					throw new RuntimeException("slow");
				}
				local41++;
				@Pc(217) int local217 = local30[local41];
				@Pc(782) int local782;
				@Pc(630) int local630;
				@Pc(656) int local656;
				@Pc(777) int local777;
				@Pc(588) Class22 local588;
				if (local217 < 100) {
					if (local217 == 0) {
						Static33.anIntArray93[local27++] = local33[local41];
						continue;
					}
					@Pc(242) int local242;
					if (local217 == 1) {
						local242 = local33[local41];
						Static33.anIntArray93[local27++] = Static23.anIntArray61[local242];
						continue;
					}
					if (local217 == 2) {
						local242 = local33[local41];
						local27--;
						Static23.anIntArray61[local242] = Static33.anIntArray93[local27];
						continue;
					}
					if (local217 == 3) {
						Static48.aClass22Array10[local25++] = local18.aClass22Array22[local41];
						continue;
					}
					if (local217 == 6) {
						local41 += local33[local41];
						continue;
					}
					if (local217 == 7) {
						local27 -= 2;
						if (Static33.anIntArray93[local27] != Static33.anIntArray93[local27 + 1]) {
							local41 += local33[local41];
						}
						continue;
					}
					if (local217 == 8) {
						local27 -= 2;
						if (Static33.anIntArray93[local27] == Static33.anIntArray93[local27 + 1]) {
							local41 += local33[local41];
						}
						continue;
					}
					if (local217 == 9) {
						local27 -= 2;
						if (Static33.anIntArray93[local27 + 1] > Static33.anIntArray93[local27]) {
							local41 += local33[local41];
						}
						continue;
					}
					if (local217 == 10) {
						local27 -= 2;
						if (Static33.anIntArray93[local27] > Static33.anIntArray93[local27 + 1]) {
							local41 += local33[local41];
						}
						continue;
					}
					if (local217 == 21) {
						if (Static117.anInt2886 == 0) {
							return;
						}
						@Pc(409) Class68 local409 = Static48.aClass68Array1[--Static117.anInt2886];
						Static34.aClass22Array7 = local409.aClass22Array20;
						local41 = local409.anInt2639;
						local18 = local409.aClass4_Sub1_Sub16_1;
						local30 = local18.anIntArray312;
						Static3.anIntArray3 = local409.anIntArray295;
						local33 = local18.anIntArray313;
						continue;
					}
					if (local217 == 25) {
						local242 = local33[local41];
						Static33.anIntArray93[local27++] = Static57.method1093(local242);
						continue;
					}
					if (local217 == 27) {
						local242 = local33[local41];
						local27--;
						Static134.method2041(Static33.anIntArray93[local27], local242);
						continue;
					}
					if (local217 == 31) {
						local27 -= 2;
						if (Static33.anIntArray93[local27] <= Static33.anIntArray93[local27 + 1]) {
							local41 += local33[local41];
						}
						continue;
					}
					if (local217 == 32) {
						local27 -= 2;
						if (Static33.anIntArray93[local27 + 1] <= Static33.anIntArray93[local27]) {
							local41 += local33[local41];
						}
						continue;
					}
					if (local217 == 33) {
						Static33.anIntArray93[local27++] = Static3.anIntArray3[local33[local41]];
						continue;
					}
					@Pc(534) int local534;
					if (local217 == 34) {
						local534 = local33[local41];
						local27--;
						Static3.anIntArray3[local534] = Static33.anIntArray93[local27];
						continue;
					}
					if (local217 == 35) {
						Static48.aClass22Array10[local25++] = Static34.aClass22Array7[local33[local41]];
						continue;
					}
					if (local217 == 36) {
						local534 = local33[local41];
						local25--;
						Static34.aClass22Array7[local534] = Static48.aClass22Array10[local25];
						continue;
					}
					if (local217 == 37) {
						local242 = local33[local41];
						local25 -= local242;
						local588 = Static70.method1175(Static48.aClass22Array10, local242, local25);
						Static48.aClass22Array10[local25++] = local588;
						continue;
					}
					if (local217 == 38) {
						local27--;
						continue;
					}
					if (local217 == 39) {
						local25--;
						continue;
					}
					if (local217 == 40) {
						local242 = local33[local41];
						@Pc(620) Class4_Sub1_Sub16 local620 = Static28.method485(local242);
						@Pc(624) int[] local624 = new int[local620.anInt2922];
						@Pc(628) Class22[] local628 = new Class22[local620.anInt2925];
						for (local630 = 0; local630 < local620.anInt2927; local630++) {
							local624[local630] = Static33.anIntArray93[local27 + local630 - local620.anInt2927];
						}
						for (local656 = 0; local656 < local620.anInt2924; local656++) {
							local628[local656] = Static48.aClass22Array10[local25 + local656 - local620.anInt2924];
						}
						local25 -= local620.anInt2924;
						local27 -= local620.anInt2927;
						@Pc(694) Class68 local694 = new Class68();
						local694.anInt2639 = local41;
						local694.aClass4_Sub1_Sub16_1 = local18;
						local41 = -1;
						local694.aClass22Array20 = Static34.aClass22Array7;
						local18 = local620;
						local694.anIntArray295 = Static3.anIntArray3;
						Static48.aClass68Array1[Static117.anInt2886++] = local694;
						Static3.anIntArray3 = local624;
						local30 = local620.anIntArray312;
						Static34.aClass22Array7 = local628;
						local33 = local620.anIntArray313;
						continue;
					}
					if (local217 == 42) {
						Static33.anIntArray93[local27++] = Static65.anIntArray187[local33[local41]];
						continue;
					}
					if (local217 == 43) {
						local534 = local33[local41];
						local27--;
						Static65.anIntArray187[local534] = Static33.anIntArray93[local27];
						continue;
					}
					if (local217 == 44) {
						local242 = local33[local41] >> 16;
						local777 = local33[local41] & 0xFFFF;
						local27--;
						local782 = Static33.anIntArray93[local27];
						if (local782 >= 0 && local782 <= 5000) {
							Static91.anIntArray275[local242] = local782;
							@Pc(797) byte local797 = -1;
							if (local777 == 105) {
								local797 = 0;
							}
							local630 = 0;
							while (true) {
								if (local630 >= local782) {
									continue label1965;
								}
								Static75.anIntArrayArray18[local242][local630] = local797;
								local630++;
							}
						}
						throw new RuntimeException();
					}
					if (local217 == 45) {
						local242 = local33[local41];
						local27--;
						local777 = Static33.anIntArray93[local27];
						if (local777 >= 0 && local777 < Static91.anIntArray275[local242]) {
							Static33.anIntArray93[local27++] = Static75.anIntArrayArray18[local242][local777];
							continue;
						}
						throw new RuntimeException();
					}
					if (local217 == 46) {
						local242 = local33[local41];
						local27 -= 2;
						local777 = Static33.anIntArray93[local27];
						if (local777 >= 0 && Static91.anIntArray275[local242] > local777) {
							Static75.anIntArrayArray18[local242][local777] = Static33.anIntArray93[local27 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (local217 == 47) {
						@Pc(911) Class22 local911 = aClass22Array24[local33[local41]];
						if (local911 == null) {
							local911 = Static70.aClass22_513;
						}
						Static48.aClass22Array10[local25++] = local911;
						continue;
					}
					if (local217 == 48) {
						local534 = local33[local41];
						local25--;
						aClass22Array24[local534] = Static48.aClass22Array10[local25];
						continue;
					}
				}
				@Pc(943) boolean local943;
				if (local33[local41] == 1) {
					local943 = true;
				} else {
					local943 = false;
				}
				@Pc(1103) Class4_Sub7 local1103;
				@Pc(974) int local974;
				@Pc(1009) int local1009;
				@Pc(984) Class4_Sub7 local984;
				@Pc(1158) Class4_Sub7 local1158;
				if (local217 < 1000) {
					if (local217 == 100) {
						local27 -= 3;
						local777 = Static33.anIntArray93[local27];
						local782 = Static33.anIntArray93[local27 + 1];
						local974 = Static33.anIntArray93[local27 + 2];
						if (local782 == 0) {
							throw new RuntimeException();
						}
						local984 = Static106.method1749(local777);
						if (local984.aClass4_Sub7Array1 == null) {
							local984.aClass4_Sub7Array1 = new Class4_Sub7[local974 + 1];
						}
						if (local974 >= local984.aClass4_Sub7Array1.length) {
							@Pc(1007) Class4_Sub7[] local1007 = new Class4_Sub7[local974 + 1];
							for (local1009 = 0; local1009 < local984.aClass4_Sub7Array1.length; local1009++) {
								local1007[local1009] = local984.aClass4_Sub7Array1[local1009];
							}
							local984.aClass4_Sub7Array1 = local1007;
						}
						if (local974 > 0 && local984.aClass4_Sub7Array1[local974 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local974 - 1));
						}
						@Pc(1060) Class4_Sub7 local1060 = new Class4_Sub7();
						local1060.anInt743 = local782;
						local1060.aBoolean79 = true;
						local1060.anInt784 = local974;
						local1060.anInt802 = local1060.anInt738 = local984.anInt738;
						local984.aClass4_Sub7Array1[local974] = local1060;
						if (local943) {
							Static52.aClass4_Sub7_11 = local1060;
						} else {
							Static132.aClass4_Sub7_15 = local1060;
						}
						Static110.method1772(local984);
						continue;
					}
					if (local217 == 101) {
						local1103 = local943 ? Static52.aClass4_Sub7_11 : Static132.aClass4_Sub7_15;
						@Pc(1108) Class4_Sub7 local1108 = Static106.method1749(local1103.anInt738);
						local1108.aClass4_Sub7Array1[local1103.anInt784] = null;
						Static110.method1772(local1108);
						continue;
					}
					if (local217 == 102) {
						local27--;
						local1103 = Static106.method1749(Static33.anIntArray93[local27]);
						local1103.aClass4_Sub7Array1 = null;
						Static110.method1772(local1103);
						continue;
					}
					if (local217 == 200) {
						local27 -= 2;
						local782 = Static33.anIntArray93[local27 + 1];
						local777 = Static33.anIntArray93[local27];
						local1158 = Static108.method1767(local782, local777);
						if (local1158 != null && local782 != -1) {
							Static33.anIntArray93[local27++] = 1;
							if (local943) {
								Static52.aClass4_Sub7_11 = local1158;
							} else {
								Static132.aClass4_Sub7_15 = local1158;
							}
							continue;
						}
						Static33.anIntArray93[local27++] = 0;
						continue;
					}
				} else if ((local217 < 1000 || local217 >= 1100) && (local217 < 2000 || local217 >= 2100)) {
					@Pc(1565) Class22 local1565;
					if (local217 >= 1100 && local217 < 1200 || !(local217 < 2100 || local217 >= 2200)) {
						if (local217 >= 2000) {
							local217 -= 1000;
							local27--;
							local1103 = Static106.method1749(Static33.anIntArray93[local27]);
						} else {
							local1103 = local943 ? Static52.aClass4_Sub7_11 : Static132.aClass4_Sub7_15;
						}
						if (local217 == 1100) {
							local27 -= 2;
							local1103.anInt791 = Static33.anIntArray93[local27];
							if (local1103.anInt799 - local1103.anInt773 < local1103.anInt791) {
								local1103.anInt791 = local1103.anInt799 - local1103.anInt773;
							}
							if (local1103.anInt791 < 0) {
								local1103.anInt791 = 0;
							}
							local1103.anInt806 = Static33.anIntArray93[local27 + 1];
							if (local1103.anInt806 > local1103.anInt781 - local1103.anInt753) {
								local1103.anInt806 = local1103.anInt781 - local1103.anInt753;
							}
							if (local1103.anInt806 < 0) {
								local1103.anInt806 = 0;
							}
							Static110.method1772(local1103);
							continue;
						}
						if (local217 == 1101) {
							local27--;
							local1103.anInt754 = Static33.anIntArray93[local27];
							Static110.method1772(local1103);
							continue;
						}
						if (local217 == 1102) {
							local27--;
							local1103.aBoolean74 = Static33.anIntArray93[local27] == 1;
							Static110.method1772(local1103);
							continue;
						}
						if (local217 == 1103) {
							local27--;
							local1103.anInt800 = Static33.anIntArray93[local27];
							Static110.method1772(local1103);
							continue;
						}
						if (local217 == 1104) {
							local27--;
							local1103.anInt761 = Static33.anIntArray93[local27];
							Static110.method1772(local1103);
							continue;
						}
						if (local217 == 1105) {
							local27--;
							local1103.anInt780 = Static33.anIntArray93[local27];
							Static110.method1772(local1103);
							continue;
						}
						if (local217 == 1106) {
							local27--;
							local1103.anInt755 = Static33.anIntArray93[local27];
							Static110.method1772(local1103);
							continue;
						}
						if (local217 == 1107) {
							local27--;
							local1103.aBoolean72 = Static33.anIntArray93[local27] == 1;
							Static110.method1772(local1103);
							continue;
						}
						if (local217 == 1108) {
							local1103.anInt752 = 1;
							local27--;
							local1103.anInt794 = Static33.anIntArray93[local27];
							Static110.method1772(local1103);
							continue;
						}
						if (local217 == 1109) {
							local27 -= 6;
							local1103.anInt777 = Static33.anIntArray93[local27];
							local1103.anInt795 = Static33.anIntArray93[local27 + 1];
							local1103.anInt775 = Static33.anIntArray93[local27 + 2];
							local1103.anInt808 = Static33.anIntArray93[local27 + 3];
							local1103.anInt741 = Static33.anIntArray93[local27 + 4];
							local1103.anInt772 = Static33.anIntArray93[local27 + 5];
							Static110.method1772(local1103);
							continue;
						}
						if (local217 == 1110) {
							local27--;
							local782 = Static33.anIntArray93[local27];
							if (local782 != local1103.anInt749) {
								local1103.anInt788 = 0;
								local1103.anInt747 = 0;
								local1103.anInt749 = local782;
								Static110.method1772(local1103);
							}
							continue;
						}
						if (local217 == 1111) {
							local27--;
							local1103.aBoolean80 = Static33.anIntArray93[local27] == 1;
							Static110.method1772(local1103);
							continue;
						}
						if (local217 == 1112) {
							local25--;
							local1565 = Static48.aClass22Array10[local25];
							if (!local1565.method481(local1103.aClass22_201)) {
								local1103.aClass22_201 = local1565;
								Static110.method1772(local1103);
							}
							continue;
						}
						if (local217 == 1113) {
							local27--;
							local1103.anInt771 = Static33.anIntArray93[local27];
							Static110.method1772(local1103);
							continue;
						}
						if (local217 == 1114) {
							local27 -= 3;
							local1103.anInt790 = Static33.anIntArray93[local27];
							local1103.anInt767 = Static33.anIntArray93[local27 + 1];
							local1103.anInt787 = Static33.anIntArray93[local27 + 2];
							Static110.method1772(local1103);
							continue;
						}
						if (local217 == 1115) {
							local27--;
							local1103.aBoolean81 = Static33.anIntArray93[local27] == 1;
							Static110.method1772(local1103);
							continue;
						}
						if (local217 == 1116) {
							local27--;
							local1103.anInt764 = Static33.anIntArray93[local27];
							Static110.method1772(local1103);
							continue;
						}
						if (local217 == 1117) {
							local27--;
							local1103.anInt778 = Static33.anIntArray93[local27];
							Static110.method1772(local1103);
							continue;
						}
						if (local217 == 1118) {
							local27--;
							local1103.aBoolean76 = Static33.anIntArray93[local27] == 1;
							Static110.method1772(local1103);
							continue;
						}
						if (local217 == 1119) {
							local27--;
							local1103.aBoolean73 = Static33.anIntArray93[local27] == 1;
							Static110.method1772(local1103);
							continue;
						}
						if (local217 == 1120) {
							local27 -= 2;
							local1103.anInt799 = Static33.anIntArray93[local27];
							local1103.anInt781 = Static33.anIntArray93[local27 + 1];
							Static110.method1772(local1103);
							continue;
						}
					} else if (local217 >= 1200 && local217 < 1300 || !(local217 < 2200 || local217 >= 2300)) {
						if (local217 < 2000) {
							local1103 = local943 ? Static52.aClass4_Sub7_11 : Static132.aClass4_Sub7_15;
						} else {
							local217 -= 1000;
							local27--;
							local1103 = Static106.method1749(Static33.anIntArray93[local27]);
						}
						Static110.method1772(local1103);
						if (local217 == 1200) {
							local27 -= 2;
							local782 = Static33.anIntArray93[local27];
							local974 = Static33.anIntArray93[local27 + 1];
							local1103.anInt759 = local974;
							local1103.anInt769 = local782;
							@Pc(1805) Class4_Sub1_Sub8 local1805 = Static123.method2000(local782);
							local1103.anInt808 = local1805.anInt1469;
							local1103.anInt775 = local1805.anInt1477;
							local1103.anInt772 = local1805.anInt1449;
							local1103.anInt795 = local1805.anInt1438;
							local1103.anInt741 = local1805.anInt1436;
							if (local1103.anInt773 > 0) {
								local1103.anInt772 = local1103.anInt772 * 32 / local1103.anInt773;
							}
							local1103.anInt777 = local1805.anInt1445;
							continue;
						}
						if (local217 == 1201) {
							local1103.anInt752 = 2;
							local27--;
							local1103.anInt794 = Static33.anIntArray93[local27];
							continue;
						}
						if (local217 == 1202) {
							local1103.anInt752 = 3;
							local1103.anInt794 = Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.aClass21_2.method443();
							continue;
						}
					} else if ((local217 < 1300 || local217 >= 1400) && (local217 < 2300 || local217 >= 2400)) {
						if (local217 >= 1400 && local217 < 1500 || local217 >= 2400 && local217 < 2500) {
							if (local217 < 2000) {
								local1103 = local943 ? Static52.aClass4_Sub7_11 : Static132.aClass4_Sub7_15;
							} else {
								local27--;
								local1103 = Static106.method1749(Static33.anIntArray93[local27]);
								local217 -= 1000;
							}
							local25--;
							local1565 = Static48.aClass22Array10[local25];
							@Pc(1933) int[] local1933 = null;
							if (local1565.method449() > 0 && local1565.method469(local1565.method449() - 1) == 89) {
								local27--;
								local630 = Static33.anIntArray93[local27];
								if (local630 > 0) {
									local1933 = new int[local630];
									while (local630-- > 0) {
										local27--;
										local1933[local630] = Static33.anIntArray93[local27];
									}
								}
								local1565 = local1565.method450(0, local1565.method449() - 1);
							}
							@Pc(1994) Object[] local1994 = new Object[local1565.method449() + 1];
							for (local656 = local1994.length - 1; local656 >= 1; local656--) {
								if (local1565.method469(local656 - 1) == 115) {
									local25--;
									local1994[local656] = Static48.aClass22Array10[local25];
								} else {
									local27--;
									local1994[local656] = Integer.valueOf(Static33.anIntArray93[local27]);
								}
							}
							local27--;
							local1009 = Static33.anIntArray93[local27];
							if (local1009 == -1) {
								local1994 = null;
							} else {
								local1994[0] = Integer.valueOf(local1009);
							}
							if (local217 == 1405) {
								local1103.anObjectArray23 = local1994;
							}
							if (local217 == 1412) {
								local1103.anObjectArray19 = local1994;
							}
							if (local217 == 1400) {
								local1103.anObjectArray24 = local1994;
							}
							if (local217 == 1406) {
								local1103.anObjectArray16 = local1994;
							}
							if (local217 == 1404) {
								local1103.anObjectArray8 = local1994;
							}
							if (local217 == 1415) {
								local1103.anObjectArray7 = local1994;
								local1103.anIntArray91 = local1933;
							}
							if (local217 == 1421) {
								local1103.anObjectArray12 = local1994;
							}
							if (local217 == 1418) {
								local1103.anObjectArray11 = local1994;
							}
							if (local217 == 1402) {
								local1103.anObjectArray18 = local1994;
							}
							if (local217 == 1401) {
								local1103.anObjectArray9 = local1994;
							}
							if (local217 == 1424) {
								local1103.anObjectArray14 = local1994;
							}
							if (local217 == 1414) {
								local1103.anIntArray82 = local1933;
								local1103.anObjectArray4 = local1994;
							}
							local1103.aBoolean78 = true;
							if (local217 == 1409) {
								local1103.anObjectArray13 = local1994;
							}
							if (local217 == 1420) {
								local1103.anObjectArray10 = local1994;
							}
							if (local217 == 1407) {
								local1103.anIntArray88 = local1933;
								local1103.anObjectArray15 = local1994;
							}
							if (local217 == 1422) {
								local1103.anObjectArray17 = local1994;
							}
							if (local217 == 1419) {
								local1103.anObjectArray3 = local1994;
							}
							if (local217 == 1416) {
								local1103.anObjectArray20 = local1994;
							}
							if (local217 == 1423) {
								local1103.anObjectArray5 = local1994;
							}
							if (local217 == 1417) {
								local1103.anObjectArray25 = local1994;
							}
							if (local217 == 1403) {
								local1103.anObjectArray22 = local1994;
							}
							if (local217 == 1411) {
								local1103.anObjectArray21 = local1994;
							}
							if (local217 == 1410) {
								local1103.anObjectArray27 = local1994;
							}
							if (local217 == 1408) {
								local1103.anObjectArray6 = local1994;
							}
							continue;
						}
						if (local217 < 1600) {
							local1103 = local943 ? Static52.aClass4_Sub7_11 : Static132.aClass4_Sub7_15;
							if (local217 == 1500) {
								Static33.anIntArray93[local27++] = local1103.anInt785;
								continue;
							}
							if (local217 == 1501) {
								Static33.anIntArray93[local27++] = local1103.anInt796;
								continue;
							}
							if (local217 == 1502) {
								Static33.anIntArray93[local27++] = local1103.anInt773;
								continue;
							}
							if (local217 == 1503) {
								Static33.anIntArray93[local27++] = local1103.anInt753;
								continue;
							}
							if (local217 == 1504) {
								Static33.anIntArray93[local27++] = local1103.aBoolean71 ? 1 : 0;
								continue;
							}
							if (local217 == 1505) {
								Static33.anIntArray93[local27++] = local1103.anInt802;
								continue;
							}
						} else if (local217 < 1700) {
							local1103 = local943 ? Static52.aClass4_Sub7_11 : Static132.aClass4_Sub7_15;
							if (local217 == 1600) {
								Static33.anIntArray93[local27++] = local1103.anInt791;
								continue;
							}
							if (local217 == 1601) {
								Static33.anIntArray93[local27++] = local1103.anInt806;
								continue;
							}
							if (local217 == 1602) {
								Static48.aClass22Array10[local25++] = local1103.aClass22_201;
								continue;
							}
							if (local217 == 1603) {
								Static33.anIntArray93[local27++] = local1103.anInt799;
								continue;
							}
							if (local217 == 1604) {
								Static33.anIntArray93[local27++] = local1103.anInt781;
								continue;
							}
							if (local217 == 1605) {
								Static33.anIntArray93[local27++] = local1103.anInt772;
								continue;
							}
							if (local217 == 1606) {
								Static33.anIntArray93[local27++] = local1103.anInt775;
								continue;
							}
							if (local217 == 1607) {
								Static33.anIntArray93[local27++] = local1103.anInt741;
								continue;
							}
							if (local217 == 1608) {
								Static33.anIntArray93[local27++] = local1103.anInt808;
								continue;
							}
						} else if (local217 < 1800) {
							local1103 = local943 ? Static52.aClass4_Sub7_11 : Static132.aClass4_Sub7_15;
							if (local217 == 1700) {
								Static33.anIntArray93[local27++] = local1103.anInt769;
								continue;
							}
							if (local217 == 1701) {
								if (local1103.anInt769 == -1) {
									Static33.anIntArray93[local27++] = 0;
								} else {
									Static33.anIntArray93[local27++] = local1103.anInt759;
								}
								continue;
							}
							if (local217 == 1702) {
								Static33.anIntArray93[local27++] = local1103.anInt784;
								continue;
							}
						} else if (local217 < 1900) {
							local1103 = local943 ? Static52.aClass4_Sub7_11 : Static132.aClass4_Sub7_15;
							if (local217 == 1800) {
								Static33.anIntArray93[local27++] = Static80.method1450(Static124.method1890(local1103));
								continue;
							}
							if (local217 == 1801) {
								local27--;
								local782 = Static33.anIntArray93[local27];
								local782--;
								if (local1103.aClass22Array3 != null && local1103.aClass22Array3.length > local782 && local1103.aClass22Array3[local782] != null) {
									Static48.aClass22Array10[local25++] = local1103.aClass22Array3[local782];
									continue;
								}
								Static48.aClass22Array10[local25++] = Static134.aClass22_977;
								continue;
							}
							if (local217 == 1802) {
								if (local1103.aClass22_205 == null) {
									Static48.aClass22Array10[local25++] = Static134.aClass22_977;
								} else {
									Static48.aClass22Array10[local25++] = local1103.aClass22_205;
								}
								continue;
							}
						} else if (local217 < 2600) {
							local27--;
							local1103 = Static106.method1749(Static33.anIntArray93[local27]);
							if (local217 == 2500) {
								Static33.anIntArray93[local27++] = local1103.anInt785;
								continue;
							}
							if (local217 == 2501) {
								Static33.anIntArray93[local27++] = local1103.anInt796;
								continue;
							}
							if (local217 == 2502) {
								Static33.anIntArray93[local27++] = local1103.anInt773;
								continue;
							}
							if (local217 == 2503) {
								Static33.anIntArray93[local27++] = local1103.anInt753;
								continue;
							}
							if (local217 == 2504) {
								Static33.anIntArray93[local27++] = local1103.aBoolean71 ? 1 : 0;
								continue;
							}
							if (local217 == 2505) {
								Static33.anIntArray93[local27++] = local1103.anInt802;
								continue;
							}
						} else if (local217 < 2700) {
							local27--;
							local1103 = Static106.method1749(Static33.anIntArray93[local27]);
							if (local217 == 2600) {
								Static33.anIntArray93[local27++] = local1103.anInt791;
								continue;
							}
							if (local217 == 2601) {
								Static33.anIntArray93[local27++] = local1103.anInt806;
								continue;
							}
							if (local217 == 2602) {
								Static48.aClass22Array10[local25++] = local1103.aClass22_201;
								continue;
							}
							if (local217 == 2603) {
								Static33.anIntArray93[local27++] = local1103.anInt799;
								continue;
							}
							if (local217 == 2604) {
								Static33.anIntArray93[local27++] = local1103.anInt781;
								continue;
							}
							if (local217 == 2605) {
								Static33.anIntArray93[local27++] = local1103.anInt772;
								continue;
							}
							if (local217 == 2606) {
								Static33.anIntArray93[local27++] = local1103.anInt775;
								continue;
							}
							if (local217 == 2607) {
								Static33.anIntArray93[local27++] = local1103.anInt741;
								continue;
							}
							if (local217 == 2608) {
								Static33.anIntArray93[local27++] = local1103.anInt808;
								continue;
							}
						} else if (local217 < 2800) {
							if (local217 == 2700) {
								local27--;
								local1103 = Static106.method1749(Static33.anIntArray93[local27]);
								Static33.anIntArray93[local27++] = local1103.anInt769;
								continue;
							}
							if (local217 == 2701) {
								local27--;
								local1103 = Static106.method1749(Static33.anIntArray93[local27]);
								if (local1103.anInt769 == -1) {
									Static33.anIntArray93[local27++] = 0;
								} else {
									Static33.anIntArray93[local27++] = local1103.anInt759;
								}
								continue;
							}
							if (local217 == 2702) {
								local27--;
								local777 = Static33.anIntArray93[local27];
								@Pc(2570) Class4_Sub21 local2570 = (Class4_Sub21) Static90.aClass81_11.method2010((long) local777);
								if (local2570 == null) {
									Static33.anIntArray93[local27++] = 0;
								} else {
									Static33.anIntArray93[local27++] = 1;
								}
								continue;
							}
						} else if (local217 < 2900) {
							local27--;
							local1103 = Static106.method1749(Static33.anIntArray93[local27]);
							if (local217 == 2800) {
								Static33.anIntArray93[local27++] = Static80.method1450(Static124.method1890(local1103));
								continue;
							}
							if (local217 == 2801) {
								local27--;
								local782 = Static33.anIntArray93[local27];
								local782--;
								if (local1103.aClass22Array3 != null && local1103.aClass22Array3.length > local782 && local1103.aClass22Array3[local782] != null) {
									Static48.aClass22Array10[local25++] = local1103.aClass22Array3[local782];
									continue;
								}
								Static48.aClass22Array10[local25++] = Static134.aClass22_977;
								continue;
							}
							if (local217 == 2802) {
								if (local1103.aClass22_205 == null) {
									Static48.aClass22Array10[local25++] = Static134.aClass22_977;
								} else {
									Static48.aClass22Array10[local25++] = local1103.aClass22_205;
								}
								continue;
							}
						} else if (local217 < 3200) {
							if (local217 == 3100) {
								local25--;
								local588 = Static48.aClass22Array10[local25];
								Static65.method1153(local588, 0, Static134.aClass22_977);
								continue;
							}
							if (local217 == 3101) {
								local27 -= 2;
								Static112.method1796(Static33.anIntArray93[local27 + 1], Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1, Static33.anIntArray93[local27]);
								continue;
							}
							if (local217 == 3103) {
								Static91.method1589();
								continue;
							}
							if (local217 == 3104) {
								local25--;
								local588 = Static48.aClass22Array10[local25];
								local782 = 0;
								if (local588.method483()) {
									local782 = local588.method470();
								}
								Static38.aClass4_Sub11_Sub1_1.method752(216);
								Static38.aClass4_Sub11_Sub1_1.method717(local782);
								continue;
							}
							if (local217 == 3105) {
								local25--;
								local588 = Static48.aClass22Array10[local25];
								Static38.aClass4_Sub11_Sub1_1.method752(36);
								Static38.aClass4_Sub11_Sub1_1.method728(local588.method468());
								continue;
							}
							if (local217 == 3106) {
								local25--;
								local588 = Static48.aClass22Array10[local25];
								Static38.aClass4_Sub11_Sub1_1.method752(86);
								Static38.aClass4_Sub11_Sub1_1.method701(local588.method449() + 1);
								Static38.aClass4_Sub11_Sub1_1.method708(local588);
								continue;
							}
							if (local217 == 3107) {
								local27--;
								local777 = Static33.anIntArray93[local27];
								local25--;
								local1565 = Static48.aClass22Array10[local25];
								Static126.method1912(local777, local1565);
								continue;
							}
							if (local217 == 3108) {
								local27 -= 3;
								local777 = Static33.anIntArray93[local27];
								local782 = Static33.anIntArray93[local27 + 1];
								local974 = Static33.anIntArray93[local27 + 2];
								local984 = Static106.method1749(local974);
								Static14.method276(local984, local782, local777);
								continue;
							}
							if (local217 == 3109) {
								local27 -= 2;
								local777 = Static33.anIntArray93[local27];
								local782 = Static33.anIntArray93[local27 + 1];
								local1158 = local943 ? Static52.aClass4_Sub7_11 : Static132.aClass4_Sub7_15;
								Static14.method276(local1158, local782, local777);
								continue;
							}
						} else if (local217 < 3300) {
							if (local217 == 3200) {
								local27 -= 3;
								Static4.method40(Static33.anIntArray93[local27], Static33.anIntArray93[local27 + 2], Static33.anIntArray93[local27 + 1]);
								continue;
							}
							if (local217 == 3201) {
								local27--;
								Static84.method1495(Static33.anIntArray93[local27]);
								continue;
							}
							if (local217 == 3202) {
								local27 -= 2;
								Static33.method548(Static33.anIntArray93[local27], Static33.anIntArray93[local27 + 1]);
								continue;
							}
						} else if (local217 < 3400) {
							if (local217 == 3300) {
								Static33.anIntArray93[local27++] = Static117.anInt2877;
								continue;
							}
							if (local217 == 3301) {
								local27 -= 2;
								local777 = Static33.anIntArray93[local27];
								local782 = Static33.anIntArray93[local27 + 1];
								Static33.anIntArray93[local27++] = Static60.method1117(local782, local777);
								continue;
							}
							if (local217 == 3302) {
								local27 -= 2;
								local777 = Static33.anIntArray93[local27];
								local782 = Static33.anIntArray93[local27 + 1];
								Static33.anIntArray93[local27++] = Static44.method860(local777, local782);
								continue;
							}
							if (local217 == 3303) {
								local27 -= 2;
								local782 = Static33.anIntArray93[local27 + 1];
								local777 = Static33.anIntArray93[local27];
								Static33.anIntArray93[local27++] = Static25.method405(local777, local782);
								continue;
							}
							if (local217 == 3304) {
								local27--;
								local777 = Static33.anIntArray93[local27];
								Static33.anIntArray93[local27++] = Static75.method1272(local777).anInt2869;
								continue;
							}
							if (local217 == 3305) {
								local27--;
								local777 = Static33.anIntArray93[local27];
								Static33.anIntArray93[local27++] = Static115.anIntArray308[local777];
								continue;
							}
							if (local217 == 3306) {
								local27--;
								local777 = Static33.anIntArray93[local27];
								Static33.anIntArray93[local27++] = Static43.anIntArray130[local777];
								continue;
							}
							if (local217 == 3307) {
								local27--;
								local777 = Static33.anIntArray93[local27];
								Static33.anIntArray93[local27++] = Static14.anIntArray39[local777];
								continue;
							}
							if (local217 == 3308) {
								local777 = Static37.anInt895;
								local782 = (Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anInt2500 >> 7) + Static59.anInt1769;
								local974 = Static98.anInt2584 + (Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anInt2462 >> 7);
								Static33.anIntArray93[local27++] = local974 + (local777 << 28) + (local782 << 14);
								continue;
							}
							if (local217 == 3309) {
								local27--;
								local777 = Static33.anIntArray93[local27];
								Static33.anIntArray93[local27++] = local777 >> 14 & 0x3FFF;
								continue;
							}
							if (local217 == 3310) {
								local27--;
								local777 = Static33.anIntArray93[local27];
								Static33.anIntArray93[local27++] = local777 >> 28;
								continue;
							}
							if (local217 == 3311) {
								local27--;
								local777 = Static33.anIntArray93[local27];
								Static33.anIntArray93[local27++] = local777 & 0x3FFF;
								continue;
							}
							if (local217 == 3312) {
								Static33.anIntArray93[local27++] = Static123.aBoolean277 ? 1 : 0;
								continue;
							}
							if (local217 == 3313) {
								local27 -= 2;
								local777 = Static33.anIntArray93[local27] + 32768;
								local782 = Static33.anIntArray93[local27 + 1];
								Static33.anIntArray93[local27++] = Static60.method1117(local782, local777);
								continue;
							}
							if (local217 == 3314) {
								local27 -= 2;
								local777 = Static33.anIntArray93[local27] + 32768;
								local782 = Static33.anIntArray93[local27 + 1];
								Static33.anIntArray93[local27++] = Static44.method860(local777, local782);
								continue;
							}
							if (local217 == 3315) {
								local27 -= 2;
								local777 = Static33.anIntArray93[local27] + 32768;
								local782 = Static33.anIntArray93[local27 + 1];
								Static33.anIntArray93[local27++] = Static25.method405(local777, local782);
								continue;
							}
							if (local217 == 3316) {
								if (Static122.anInt1377 >= 2) {
									Static33.anIntArray93[local27++] = Static122.anInt1377;
								} else {
									Static33.anIntArray93[local27++] = 0;
								}
								continue;
							}
							if (local217 == 3317) {
								Static33.anIntArray93[local27++] = Static48.anInt1298;
								continue;
							}
							if (local217 == 3318) {
								Static33.anIntArray93[local27++] = Static72.anInt1919;
								continue;
							}
							if (local217 == 3321) {
								Static33.anIntArray93[local27++] = Static114.anInt2819;
								continue;
							}
							if (local217 == 3322) {
								Static33.anIntArray93[local27++] = Static3.anInt27;
								continue;
							}
							if (local217 == 3323) {
								if (Static122.anInt1377 == 1) {
									Static33.anIntArray93[local27++] = 1;
								} else {
									Static33.anIntArray93[local27++] = 0;
								}
								continue;
							}
						} else if (local217 < 3500) {
							if (local217 == 3400) {
								local27 -= 2;
								local777 = Static33.anIntArray93[local27];
								local782 = Static33.anIntArray93[local27 + 1];
								@Pc(3149) Class4_Sub1_Sub13 local3149 = Static99.method1673(local777);
								for (local630 = 0; local630 < local3149.anInt2718; local630++) {
									if (local782 == local3149.anIntArray299[local630]) {
										Static48.aClass22Array10[local25++] = local3149.aClass22Array21[local630];
										local3149 = null;
										break;
									}
								}
								if (local3149 != null) {
									Static48.aClass22Array10[local25++] = local3149.aClass22_802;
								}
								continue;
							}
							if (local217 == 3408) {
								local27 -= 4;
								local782 = Static33.anIntArray93[local27 + 1];
								local777 = Static33.anIntArray93[local27];
								local974 = Static33.anIntArray93[local27 + 2];
								local630 = Static33.anIntArray93[local27 + 3];
								@Pc(3221) Class4_Sub1_Sub13 local3221 = Static99.method1673(local974);
								if (local3221.anInt2726 == local777 && local782 == local3221.anInt2724) {
									for (local1009 = 0; local1009 < local3221.anInt2718; local1009++) {
										if (local630 == local3221.anIntArray299[local1009]) {
											if (local782 == 115) {
												Static48.aClass22Array10[local25++] = local3221.aClass22Array21[local1009];
											} else {
												Static33.anIntArray93[local27++] = local3221.anIntArray300[local1009];
											}
											local3221 = null;
											break;
										}
									}
									if (local3221 != null) {
										if (local782 == 115) {
											Static48.aClass22Array10[local25++] = local3221.aClass22_802;
										} else {
											Static33.anIntArray93[local27++] = local3221.anInt2721;
										}
									}
									continue;
								}
								if (local782 == 115) {
									Static48.aClass22Array10[local25++] = Static70.aClass22_513;
								} else {
									Static33.anIntArray93[local27++] = 0;
								}
								continue;
							}
						} else if (local217 < 3700) {
							if (local217 == 3600) {
								if (Static50.anInt1408 == 0) {
									Static33.anIntArray93[local27++] = -2;
								} else if (Static50.anInt1408 == 1) {
									Static33.anIntArray93[local27++] = -1;
								} else {
									Static33.anIntArray93[local27++] = Static2.anInt9;
								}
								continue;
							}
							if (local217 == 3601) {
								local27--;
								local777 = Static33.anIntArray93[local27];
								if (Static50.anInt1408 == 2 && Static2.anInt9 > local777) {
									Static48.aClass22Array10[local25++] = Static12.aClass22Array1[local777];
									continue;
								}
								Static48.aClass22Array10[local25++] = Static134.aClass22_977;
								continue;
							}
							if (local217 == 3602) {
								local27--;
								local777 = Static33.anIntArray93[local27];
								if (Static50.anInt1408 == 2 && Static2.anInt9 > local777) {
									Static33.anIntArray93[local27++] = Static75.anIntArray199[local777];
									continue;
								}
								Static33.anIntArray93[local27++] = 0;
								continue;
							}
							if (local217 == 3603) {
								local27--;
								local777 = Static33.anIntArray93[local27];
								if (Static50.anInt1408 == 2 && Static2.anInt9 > local777) {
									Static33.anIntArray93[local27++] = Static5.anIntArray6[local777];
									continue;
								}
								Static33.anIntArray93[local27++] = 0;
								continue;
							}
							if (local217 == 3604) {
								local25--;
								local588 = Static48.aClass22Array10[local25];
								local27--;
								local782 = Static33.anIntArray93[local27];
								Static78.method1302(local782, local588);
								continue;
							}
							if (local217 == 3605) {
								local25--;
								local588 = Static48.aClass22Array10[local25];
								Static75.method1267(local588.method468());
								continue;
							}
							if (local217 == 3606) {
								local25--;
								local588 = Static48.aClass22Array10[local25];
								Static31.method528(local588.method468());
								continue;
							}
							if (local217 == 3607) {
								local25--;
								local588 = Static48.aClass22Array10[local25];
								Static19.method372(local588.method468());
								continue;
							}
							if (local217 == 3608) {
								local25--;
								local588 = Static48.aClass22Array10[local25];
								Static23.method393(local588.method468());
								continue;
							}
							if (local217 == 3609) {
								local25--;
								local588 = Static48.aClass22Array10[local25];
								if (local588.method471(Static43.aClass22_291) || local588.method471(Static62.aClass22_481)) {
									local588 = local588.method477(7);
								}
								Static33.anIntArray93[local27++] = Static97.method1657(local588) ? 1 : 0;
								continue;
							}
							if (local217 == 3611) {
								if (Static109.aClass22_70 == null) {
									Static48.aClass22Array10[local25++] = Static134.aClass22_977;
								} else {
									Static48.aClass22Array10[local25++] = Static109.aClass22_70.method473();
								}
								continue;
							}
							if (local217 == 3612) {
								if (Static109.aClass22_70 == null) {
									Static33.anIntArray93[local27++] = 0;
								} else {
									Static33.anIntArray93[local27++] = anInt3150;
								}
								continue;
							}
							if (local217 == 3613) {
								local27--;
								local777 = Static33.anIntArray93[local27];
								if (Static109.aClass22_70 != null && local777 < anInt3150) {
									Static48.aClass22Array10[local25++] = Static92.aClass4_Sub8Array1[local777].aClass22_214.method473();
									continue;
								}
								Static48.aClass22Array10[local25++] = Static134.aClass22_977;
								continue;
							}
							if (local217 == 3614) {
								local27--;
								local777 = Static33.anIntArray93[local27];
								if (Static109.aClass22_70 != null && local777 < anInt3150) {
									Static33.anIntArray93[local27++] = Static92.aClass4_Sub8Array1[local777].anInt822;
									continue;
								}
								Static33.anIntArray93[local27++] = 0;
								continue;
							}
							if (local217 == 3615) {
								local27--;
								local777 = Static33.anIntArray93[local27];
								if (Static109.aClass22_70 != null && local777 < anInt3150) {
									Static33.anIntArray93[local27++] = Static92.aClass4_Sub8Array1[local777].aByte1;
									continue;
								}
								Static33.anIntArray93[local27++] = 0;
								continue;
							}
							if (local217 == 3616) {
								Static33.anIntArray93[local27++] = Static84.aByte5;
								continue;
							}
							if (local217 == 3617) {
								local25--;
								local588 = Static48.aClass22Array10[local25];
								Static75.method1273(local588);
								continue;
							}
							if (local217 == 3618) {
								Static33.anIntArray93[local27++] = Static126.aByte8;
								continue;
							}
							if (local217 == 3619) {
								local25--;
								local588 = Static48.aClass22Array10[local25];
								Static126.method1916(local588.method468());
								continue;
							}
							if (local217 == 3620) {
								Static96.method1611();
								continue;
							}
							if (local217 == 3621) {
								if (Static50.anInt1408 == 0) {
									Static33.anIntArray93[local27++] = -1;
								} else {
									Static33.anIntArray93[local27++] = Static88.anInt2348;
								}
								continue;
							}
							if (local217 == 3622) {
								local27--;
								local777 = Static33.anIntArray93[local27];
								if (Static50.anInt1408 != 0 && local777 < Static88.anInt2348) {
									Static48.aClass22Array10[local25++] = Static8.method1575(Static85.aLongArray5[local777]).method473();
									continue;
								}
								Static48.aClass22Array10[local25++] = Static134.aClass22_977;
								continue;
							}
							if (local217 == 3623) {
								local25--;
								local588 = Static48.aClass22Array10[local25];
								if (local588.method471(Static43.aClass22_291) || local588.method471(Static62.aClass22_481)) {
									local588 = local588.method477(7);
								}
								Static33.anIntArray93[local27++] = Static92.method1618(local588) ? 1 : 0;
								continue;
							}
							if (local217 == 3624) {
								local27--;
								local777 = Static33.anIntArray93[local27];
								if (Static92.aClass4_Sub8Array1 != null && anInt3150 > local777 && Static92.aClass4_Sub8Array1[local777].aClass22_214.method480(Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.aClass22_444)) {
									Static33.anIntArray93[local27++] = 1;
									continue;
								}
								Static33.anIntArray93[local27++] = 0;
								continue;
							}
							if (local217 == 3625) {
								if (Static105.aClass22_780 == null) {
									Static48.aClass22Array10[local25++] = Static134.aClass22_977;
								} else {
									Static48.aClass22Array10[local25++] = Static105.aClass22_780.method473();
								}
								continue;
							}
						} else if (local217 < 4100) {
							if (local217 == 4000) {
								local27 -= 2;
								local782 = Static33.anIntArray93[local27 + 1];
								local777 = Static33.anIntArray93[local27];
								Static33.anIntArray93[local27++] = local777 + local782;
								continue;
							}
							if (local217 == 4001) {
								local27 -= 2;
								local777 = Static33.anIntArray93[local27];
								local782 = Static33.anIntArray93[local27 + 1];
								Static33.anIntArray93[local27++] = local777 - local782;
								continue;
							}
							if (local217 == 4002) {
								local27 -= 2;
								local782 = Static33.anIntArray93[local27 + 1];
								local777 = Static33.anIntArray93[local27];
								Static33.anIntArray93[local27++] = local777 * local782;
								continue;
							}
							if (local217 == 4003) {
								local27 -= 2;
								local777 = Static33.anIntArray93[local27];
								local782 = Static33.anIntArray93[local27 + 1];
								Static33.anIntArray93[local27++] = local777 / local782;
								continue;
							}
							if (local217 == 4004) {
								local27--;
								local777 = Static33.anIntArray93[local27];
								Static33.anIntArray93[local27++] = (int) (Math.random() * (double) local777);
								continue;
							}
							if (local217 == 4005) {
								local27--;
								local777 = Static33.anIntArray93[local27];
								Static33.anIntArray93[local27++] = (int) ((double) (local777 + 1) * Math.random());
								continue;
							}
							if (local217 == 4006) {
								local27 -= 5;
								local777 = Static33.anIntArray93[local27];
								local782 = Static33.anIntArray93[local27 + 1];
								local974 = Static33.anIntArray93[local27 + 2];
								local656 = Static33.anIntArray93[local27 + 4];
								local630 = Static33.anIntArray93[local27 + 3];
								Static33.anIntArray93[local27++] = (local782 - local777) * (local656 + -local974) / (local630 - local974) + local777;
								continue;
							}
							if (local217 == 4007) {
								local27 -= 2;
								local777 = Static33.anIntArray93[local27];
								local782 = Static33.anIntArray93[local27 + 1];
								Static33.anIntArray93[local27++] = local782 * local777 / 100 + local777;
								continue;
							}
							if (local217 == 4008) {
								local27 -= 2;
								local777 = Static33.anIntArray93[local27];
								local782 = Static33.anIntArray93[local27 + 1];
								Static33.anIntArray93[local27++] = 0x1 << local782 | local777;
								continue;
							}
							if (local217 == 4009) {
								local27 -= 2;
								local777 = Static33.anIntArray93[local27];
								local782 = Static33.anIntArray93[local27 + 1];
								Static33.anIntArray93[local27++] = local777 & -(0x1 << local782) - 1;
								continue;
							}
							if (local217 == 4010) {
								local27 -= 2;
								local782 = Static33.anIntArray93[local27 + 1];
								local777 = Static33.anIntArray93[local27];
								Static33.anIntArray93[local27++] = (0x1 << local782 & local777) == 0 ? 0 : 1;
								continue;
							}
							if (local217 == 4011) {
								local27 -= 2;
								local777 = Static33.anIntArray93[local27];
								local782 = Static33.anIntArray93[local27 + 1];
								Static33.anIntArray93[local27++] = local777 % local782;
								continue;
							}
							if (local217 == 4012) {
								local27 -= 2;
								local777 = Static33.anIntArray93[local27];
								local782 = Static33.anIntArray93[local27 + 1];
								if (local777 == 0) {
									Static33.anIntArray93[local27++] = 0;
								} else {
									Static33.anIntArray93[local27++] = (int) Math.pow((double) local777, (double) local782);
								}
								continue;
							}
							if (local217 == 4013) {
								local27 -= 2;
								local782 = Static33.anIntArray93[local27 + 1];
								local777 = Static33.anIntArray93[local27];
								if (local777 == 0) {
									Static33.anIntArray93[local27++] = 0;
								} else if (local782 == 0) {
									Static33.anIntArray93[local27++] = Integer.MAX_VALUE;
								} else {
									Static33.anIntArray93[local27++] = (int) Math.pow((double) local777, 1.0D / (double) local782);
								}
								continue;
							}
							if (local217 == 4014) {
								local27 -= 2;
								local782 = Static33.anIntArray93[local27 + 1];
								local777 = Static33.anIntArray93[local27];
								Static33.anIntArray93[local27++] = local782 & local777;
								continue;
							}
							if (local217 == 4015) {
								local27 -= 2;
								local777 = Static33.anIntArray93[local27];
								local782 = Static33.anIntArray93[local27 + 1];
								Static33.anIntArray93[local27++] = local782 | local777;
								continue;
							}
						} else if (local217 < 4200) {
							if (local217 == 4100) {
								local25--;
								local588 = Static48.aClass22Array10[local25];
								local27--;
								local782 = Static33.anIntArray93[local27];
								Static48.aClass22Array10[local25++] = Static44.method856(new Class22[] { local588, Static134.method2042(local782) });
								continue;
							}
							if (local217 == 4101) {
								local25 -= 2;
								local588 = Static48.aClass22Array10[local25];
								local1565 = Static48.aClass22Array10[local25 + 1];
								Static48.aClass22Array10[local25++] = Static44.method856(new Class22[] { local588, local1565 });
								continue;
							}
							if (local217 == 4102) {
								local25--;
								local588 = Static48.aClass22Array10[local25];
								local27--;
								local782 = Static33.anIntArray93[local27];
								Static48.aClass22Array10[local25++] = Static44.method856(new Class22[] { local588, Static122.method951(local782) });
								continue;
							}
							if (local217 == 4103) {
								local25--;
								local588 = Static48.aClass22Array10[local25];
								Static48.aClass22Array10[local25++] = local588.method479();
								continue;
							}
							if (local217 == 4104) {
								local27--;
								local777 = Static33.anIntArray93[local27];
								@Pc(3931) long local3931 = (long) local777 * 86400000L + 1014768000000L;
								Static123.aCalendar62.setTime(new Date(local3931));
								local630 = Static123.aCalendar62.get(5);
								local656 = Static123.aCalendar62.get(2);
								local1009 = Static123.aCalendar62.get(1);
								Static48.aClass22Array10[local25++] = Static44.method856(new Class22[] { Static134.method2042(local630), Static71.aClass22_516, Static124.aClass22Array23[local656], Static71.aClass22_516, Static134.method2042(local1009) });
								continue;
							}
							if (local217 == 4105) {
								local25 -= 2;
								local1565 = Static48.aClass22Array10[local25 + 1];
								local588 = Static48.aClass22Array10[local25];
								if (Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.aClass21_2 != null && Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.aClass21_2.aBoolean64) {
									Static48.aClass22Array10[local25++] = local1565;
									continue;
								}
								Static48.aClass22Array10[local25++] = local588;
								continue;
							}
							if (local217 == 4106) {
								local27--;
								local777 = Static33.anIntArray93[local27];
								Static48.aClass22Array10[local25++] = Static134.method2042(local777);
								continue;
							}
							if (local217 == 4107) {
								local25 -= 2;
								Static33.anIntArray93[local27++] = Static48.aClass22Array10[local25].method454(Static48.aClass22Array10[local25 + 1]);
								continue;
							}
							@Pc(4088) byte[] local4088;
							@Pc(4093) Class4_Sub1_Sub2_Sub4_Sub1 local4093;
							if (local217 == 4108) {
								local27 -= 2;
								local25--;
								local588 = Static48.aClass22Array10[local25];
								local782 = Static33.anIntArray93[local27];
								local974 = Static33.anIntArray93[local27 + 1];
								local4088 = Static132.aClass20_Sub1_82.method597(local974, 0);
								local4093 = new Class4_Sub1_Sub2_Sub4_Sub1(local4088);
								Static33.anIntArray93[local27++] = local4093.method1398(local588, local782);
								continue;
							}
							if (local217 == 4109) {
								local27 -= 2;
								local974 = Static33.anIntArray93[local27 + 1];
								local25--;
								local588 = Static48.aClass22Array10[local25];
								local782 = Static33.anIntArray93[local27];
								local4088 = Static132.aClass20_Sub1_82.method597(local974, 0);
								local4093 = new Class4_Sub1_Sub2_Sub4_Sub1(local4088);
								Static33.anIntArray93[local27++] = local4093.method1413(local588, local782);
								continue;
							}
							if (local217 == 4110) {
								local25 -= 2;
								local588 = Static48.aClass22Array10[local25];
								local1565 = Static48.aClass22Array10[local25 + 1];
								local27--;
								if (Static33.anIntArray93[local27] == 1) {
									Static48.aClass22Array10[local25++] = local588;
								} else {
									Static48.aClass22Array10[local25++] = local1565;
								}
								continue;
							}
							if (local217 == 4111) {
								local25--;
								local588 = Static48.aClass22Array10[local25];
								Static48.aClass22Array10[local25++] = Static81.method1393(local588);
								continue;
							}
							if (local217 == 4112) {
								local27--;
								local782 = Static33.anIntArray93[local27];
								local25--;
								local588 = Static48.aClass22Array10[local25];
								Static48.aClass22Array10[local25++] = local588.method486(local782);
								continue;
							}
							if (local217 == 4113) {
								local27--;
								local777 = Static33.anIntArray93[local27];
								Static33.anIntArray93[local27++] = Static19.method374(local777) ? 1 : 0;
								continue;
							}
							if (local217 == 4114) {
								local27--;
								local777 = Static33.anIntArray93[local27];
								Static33.anIntArray93[local27++] = Static132.method2026(local777) ? 1 : 0;
								continue;
							}
							if (local217 == 4115) {
								local27--;
								local777 = Static33.anIntArray93[local27];
								Static33.anIntArray93[local27++] = Static65.method1151(local777) ? 1 : 0;
								continue;
							}
							if (local217 == 4116) {
								local27--;
								local777 = Static33.anIntArray93[local27];
								Static33.anIntArray93[local27++] = Static130.method2007(local777) ? 1 : 0;
								continue;
							}
							if (local217 == 4117) {
								local25--;
								local588 = Static48.aClass22Array10[local25];
								if (local588 == null) {
									Static33.anIntArray93[local27++] = 0;
								} else {
									Static33.anIntArray93[local27++] = local588.method449();
								}
								continue;
							}
							if (local217 == 4118) {
								local27 -= 2;
								local25--;
								local588 = Static48.aClass22Array10[local25];
								local782 = Static33.anIntArray93[local27];
								local974 = Static33.anIntArray93[local27 + 1];
								Static48.aClass22Array10[local25++] = local588.method450(local782, local974);
								continue;
							}
							if (local217 == 4119) {
								local25--;
								local588 = Static48.aClass22Array10[local25];
								local1565 = Static53.method1004(local588.method449());
								@Pc(4384) boolean local4384 = false;
								for (local630 = 0; local630 < local588.method449(); local630++) {
									local656 = local588.method469(local630);
									if (local656 == 60) {
										local4384 = true;
									} else if (local656 == 62) {
										local4384 = false;
									} else if (!local4384) {
										local1565.method482(local656);
									}
								}
								local1565.method478();
								Static48.aClass22Array10[local25++] = local1565;
								continue;
							}
							if (local217 == 4120) {
								local25--;
								local588 = Static48.aClass22Array10[local25];
								local27--;
								local782 = Static33.anIntArray93[local27];
								Static33.anIntArray93[local27++] = local588.method472(local782);
								continue;
							}
						} else if (local217 < 4300) {
							if (local217 == 4200) {
								local27--;
								local777 = Static33.anIntArray93[local27];
								Static48.aClass22Array10[local25++] = Static123.method2000(local777).aClass22_359;
								continue;
							}
							@Pc(5448) Class4_Sub1_Sub8 local5448;
							if (local217 == 4201) {
								local27 -= 2;
								local777 = Static33.anIntArray93[local27];
								local782 = Static33.anIntArray93[local27 + 1];
								local5448 = Static123.method2000(local777);
								if (local782 >= 1 && local782 <= 5 && local5448.aClass22Array11[local782 - 1] != null) {
									Static48.aClass22Array10[local25++] = local5448.aClass22Array11[local782 - 1];
									continue;
								}
								Static48.aClass22Array10[local25++] = Static134.aClass22_977;
								continue;
							}
							if (local217 == 4202) {
								local27 -= 2;
								local777 = Static33.anIntArray93[local27];
								local782 = Static33.anIntArray93[local27 + 1];
								local5448 = Static123.method2000(local777);
								if (local782 >= 1 && local782 <= 5 && local5448.aClass22Array12[local782 - 1] != null) {
									Static48.aClass22Array10[local25++] = local5448.aClass22Array12[local782 - 1];
									continue;
								}
								Static48.aClass22Array10[local25++] = Static134.aClass22_977;
								continue;
							}
							if (local217 == 4203) {
								local27--;
								local777 = Static33.anIntArray93[local27];
								Static33.anIntArray93[local27++] = Static123.method2000(local777).anInt1437;
								continue;
							}
							if (local217 == 4204) {
								local27--;
								local777 = Static33.anIntArray93[local27];
								Static33.anIntArray93[local27++] = Static123.method2000(local777).anInt1465 == 1 ? 1 : 0;
								continue;
							}
							@Pc(5597) Class4_Sub1_Sub8 local5597;
							if (local217 == 4205) {
								local27--;
								local777 = Static33.anIntArray93[local27];
								local5597 = Static123.method2000(local777);
								if (local5597.anInt1448 == -1 && local5597.anInt1466 >= 0) {
									Static33.anIntArray93[local27++] = local5597.anInt1466;
									continue;
								}
								Static33.anIntArray93[local27++] = local777;
								continue;
							}
							if (local217 == 4206) {
								local27--;
								local777 = Static33.anIntArray93[local27];
								local5597 = Static123.method2000(local777);
								if (local5597.anInt1448 >= 0 && local5597.anInt1466 >= 0) {
									Static33.anIntArray93[local27++] = local5597.anInt1466;
									continue;
								}
								Static33.anIntArray93[local27++] = local777;
								continue;
							}
							if (local217 == 4207) {
								local27--;
								local777 = Static33.anIntArray93[local27];
								Static33.anIntArray93[local27++] = Static123.method2000(local777).aBoolean140 ? 1 : 0;
								continue;
							}
						} else if (local217 < 5100) {
							if (local217 == 5000) {
								Static33.anIntArray93[local27++] = Static2.anInt10;
								continue;
							}
							if (local217 == 5001) {
								local27 -= 3;
								Static2.anInt10 = Static33.anIntArray93[local27];
								Static2.anInt12 = Static33.anIntArray93[local27 + 1];
								Static37.anInt896 = Static33.anIntArray93[local27 + 2];
								Static38.aClass4_Sub11_Sub1_1.method752(69);
								Static38.aClass4_Sub11_Sub1_1.method701(Static2.anInt10);
								Static38.aClass4_Sub11_Sub1_1.method701(Static2.anInt12);
								Static38.aClass4_Sub11_Sub1_1.method701(Static37.anInt896);
								continue;
							}
							if (local217 == 5002) {
								local25--;
								local588 = Static48.aClass22Array10[local25];
								local27 -= 2;
								local974 = Static33.anIntArray93[local27 + 1];
								local782 = Static33.anIntArray93[local27];
								Static38.aClass4_Sub11_Sub1_1.method752(192);
								Static38.aClass4_Sub11_Sub1_1.method728(local588.method468());
								Static38.aClass4_Sub11_Sub1_1.method701(local782 - 1);
								Static38.aClass4_Sub11_Sub1_1.method701(local974);
								continue;
							}
							if (local217 == 5003) {
								local27--;
								local777 = Static33.anIntArray93[local27];
								local1565 = null;
								if (local777 < 100) {
									local1565 = Static31.aClass22Array5[local777];
								}
								if (local1565 == null) {
									local1565 = Static134.aClass22_977;
								}
								Static48.aClass22Array10[local25++] = local1565;
								continue;
							}
							if (local217 == 5004) {
								local27--;
								local777 = Static33.anIntArray93[local27];
								local782 = -1;
								if (local777 < 100 && Static31.aClass22Array5[local777] != null) {
									local782 = Static14.anIntArray40[local777];
								}
								Static33.anIntArray93[local27++] = local782;
								continue;
							}
							if (local217 == 5005) {
								Static33.anIntArray93[local27++] = Static2.anInt12;
								continue;
							}
							if (local217 == 5008) {
								local25--;
								local588 = Static48.aClass22Array10[local25];
								if (local588.method471(Static112.aClass22_862)) {
									Static129.method1990(local588);
								} else {
									local1565 = local588.method479();
									@Pc(4665) byte local4665 = 0;
									@Pc(4667) byte local4667 = 0;
									if (local1565.method471(Static106.aClass22_791)) {
										local4667 = 0;
										local588 = local588.method477(Static106.aClass22_791.method449());
									} else if (local1565.method471(Static78.aClass22_571)) {
										local4667 = 1;
										local588 = local588.method477(Static78.aClass22_571.method449());
									} else if (local1565.method471(Static33.aClass22_224)) {
										local588 = local588.method477(Static33.aClass22_224.method449());
										local4667 = 2;
									} else if (local1565.method471(Static128.aClass22_938)) {
										local4667 = 3;
										local588 = local588.method477(Static128.aClass22_938.method449());
									} else if (local1565.method471(Static108.aClass22_807)) {
										local4667 = 4;
										local588 = local588.method477(Static108.aClass22_807.method449());
									} else if (local1565.method471(Static5.aClass22_46)) {
										local588 = local588.method477(Static5.aClass22_46.method449());
										local4667 = 5;
									} else if (local1565.method471(Static23.aClass22_156)) {
										local4667 = 6;
										local588 = local588.method477(Static23.aClass22_156.method449());
									} else if (local1565.method471(Static34.aClass22_238)) {
										local4667 = 7;
										local588 = local588.method477(Static34.aClass22_238.method449());
									} else if (local1565.method471(Static5.aClass22_33)) {
										local588 = local588.method477(Static5.aClass22_33.method449());
										local4667 = 8;
									} else if (local1565.method471(Static39.aClass22_272)) {
										local4667 = 9;
										local588 = local588.method477(Static39.aClass22_272.method449());
									} else if (local1565.method471(Static115.aClass22_886)) {
										local4667 = 10;
										local588 = local588.method477(Static115.aClass22_886.method449());
									} else if (local1565.method471(Static98.aClass22_754)) {
										local4667 = 11;
										local588 = local588.method477(Static98.aClass22_754.method449());
									} else if (Static16.anInt379 != 0) {
										if (local1565.method471(Static106.aClass22_793)) {
											local4667 = 0;
											local588 = local588.method477(Static106.aClass22_793.method449());
										} else if (local1565.method471(Static78.aClass22_569)) {
											local588 = local588.method477(Static78.aClass22_569.method449());
											local4667 = 1;
										} else if (local1565.method471(Static33.aClass22_230)) {
											local4667 = 2;
											local588 = local588.method477(Static33.aClass22_230.method449());
										} else if (local1565.method471(Static128.aClass22_942)) {
											local4667 = 3;
											local588 = local588.method477(Static128.aClass22_942.method449());
										} else if (local1565.method471(Static108.aClass22_803)) {
											local4667 = 4;
											local588 = local588.method477(Static108.aClass22_803.method449());
										} else if (local1565.method471(Static5.aClass22_48)) {
											local4667 = 5;
											local588 = local588.method477(Static5.aClass22_48.method449());
										} else if (local1565.method471(Static23.aClass22_157)) {
											local588 = local588.method477(Static23.aClass22_157.method449());
											local4667 = 6;
										} else if (local1565.method471(Static34.aClass22_240)) {
											local588 = local588.method477(Static34.aClass22_240.method449());
											local4667 = 7;
										} else if (local1565.method471(Static5.aClass22_32)) {
											local588 = local588.method477(Static5.aClass22_32.method449());
											local4667 = 8;
										} else if (local1565.method471(Static39.aClass22_273)) {
											local4667 = 9;
											local588 = local588.method477(Static39.aClass22_273.method449());
										} else if (local1565.method471(Static115.aClass22_888)) {
											local588 = local588.method477(Static115.aClass22_888.method449());
											local4667 = 10;
										} else if (local1565.method471(Static98.aClass22_753)) {
											local4667 = 11;
											local588 = local588.method477(Static98.aClass22_753.method449());
										}
									}
									local1565 = local588.method479();
									if (local1565.method471(Static51.aClass22_365)) {
										local588 = local588.method477(Static51.aClass22_365.method449());
										local4665 = 1;
									} else if (local1565.method471(aClass22_966)) {
										local4665 = 2;
										local588 = local588.method477(aClass22_966.method449());
									} else if (local1565.method471(Static88.aClass22_674)) {
										local588 = local588.method477(Static88.aClass22_674.method449());
										local4665 = 3;
									} else if (local1565.method471(Static103.aClass22_770)) {
										local4665 = 4;
										local588 = local588.method477(Static103.aClass22_770.method449());
									} else if (local1565.method471(Static88.aClass22_673)) {
										local588 = local588.method477(Static88.aClass22_673.method449());
										local4665 = 5;
									} else if (Static16.anInt379 != 0) {
										if (local1565.method471(Static51.aClass22_361)) {
											local4665 = 1;
											local588 = local588.method477(Static51.aClass22_361.method449());
										} else if (local1565.method471(aClass22_970)) {
											local4665 = 2;
											local588 = local588.method477(aClass22_970.method449());
										} else if (local1565.method471(Static88.aClass22_678)) {
											local588 = local588.method477(Static88.aClass22_678.method449());
											local4665 = 3;
										} else if (local1565.method471(Static103.aClass22_772)) {
											local4665 = 4;
											local588 = local588.method477(Static103.aClass22_772.method449());
										} else if (local1565.method471(Static88.aClass22_676)) {
											local588 = local588.method477(Static88.aClass22_676.method449());
											local4665 = 5;
										}
									}
									Static38.aClass4_Sub11_Sub1_1.method752(27);
									Static38.aClass4_Sub11_Sub1_1.method701(0);
									local656 = Static38.aClass4_Sub11_Sub1_1.anInt1099;
									Static38.aClass4_Sub11_Sub1_1.method701(local4667);
									Static38.aClass4_Sub11_Sub1_1.method701(local4665);
									Static130.method2008(local588, Static38.aClass4_Sub11_Sub1_1);
									Static38.aClass4_Sub11_Sub1_1.method702(Static38.aClass4_Sub11_Sub1_1.anInt1099 - local656);
								}
								continue;
							}
							if (local217 == 5009) {
								local25 -= 2;
								local588 = Static48.aClass22Array10[local25];
								local1565 = Static48.aClass22Array10[local25 + 1];
								Static38.aClass4_Sub11_Sub1_1.method752(164);
								Static38.aClass4_Sub11_Sub1_1.method701(0);
								local974 = Static38.aClass4_Sub11_Sub1_1.anInt1099;
								Static38.aClass4_Sub11_Sub1_1.method728(local588.method468());
								Static130.method2008(local1565, Static38.aClass4_Sub11_Sub1_1);
								Static38.aClass4_Sub11_Sub1_1.method702(Static38.aClass4_Sub11_Sub1_1.anInt1099 - local974);
								continue;
							}
							if (local217 == 5010) {
								local27--;
								local777 = Static33.anIntArray93[local27];
								local1565 = null;
								if (local777 < 100) {
									local1565 = Static12.aClass22Array2[local777];
								}
								if (local1565 == null) {
									local1565 = Static134.aClass22_977;
								}
								Static48.aClass22Array10[local25++] = local1565;
								continue;
							}
							if (local217 == 5011) {
								local27--;
								local777 = Static33.anIntArray93[local27];
								local1565 = null;
								if (local777 < 100) {
									local1565 = Static92.aClass22Array19[local777];
								}
								if (local1565 == null) {
									local1565 = Static134.aClass22_977;
								}
								Static48.aClass22Array10[local25++] = local1565;
								continue;
							}
							if (local217 == 5015) {
								if (Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1 == null || Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.aClass22_444 == null) {
									local588 = Static61.aClass22_476;
								} else {
									local588 = Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.aClass22_444;
								}
								Static48.aClass22Array10[local25++] = local588;
								continue;
							}
							if (local217 == 5016) {
								Static33.anIntArray93[local27++] = Static37.anInt896;
								continue;
							}
							if (local217 == 5017) {
								Static33.anIntArray93[local27++] = Static19.anInt543;
								continue;
							}
						}
					} else {
						if (local217 >= 2000) {
							local27--;
							local1103 = Static106.method1749(Static33.anIntArray93[local27]);
							local217 -= 1000;
						} else {
							local1103 = local943 ? Static52.aClass4_Sub7_11 : Static132.aClass4_Sub7_15;
						}
						if (local217 == 1300) {
							local27--;
							local782 = Static33.anIntArray93[local27] - 1;
							if (local782 >= 0 && local782 <= 9) {
								local25--;
								local1103.method524(Static48.aClass22Array10[local25], local782);
								continue;
							}
							local25--;
							continue;
						}
						if (local217 == 1301) {
							local27 -= 2;
							local974 = Static33.anIntArray93[local27 + 1];
							local782 = Static33.anIntArray93[local27];
							local1103.aClass4_Sub7_7 = Static108.method1767(local974, local782);
							continue;
						}
						if (local217 == 1302) {
							local27--;
							local1103.aBoolean82 = Static33.anIntArray93[local27] == 1;
							continue;
						}
						if (local217 == 1303) {
							local27--;
							local1103.anInt746 = Static33.anIntArray93[local27];
							continue;
						}
						if (local217 == 1304) {
							local27--;
							local1103.anInt739 = Static33.anIntArray93[local27];
							continue;
						}
						if (local217 == 1305) {
							local25--;
							local1103.aClass22_205 = Static48.aClass22Array10[local25];
							continue;
						}
						if (local217 == 1306) {
							local25--;
							local1103.aClass22_206 = Static48.aClass22Array10[local25];
							continue;
						}
						if (local217 == 1307) {
							local1103.aClass22Array3 = null;
							continue;
						}
					}
				} else {
					if (local217 < 2000) {
						local1103 = local943 ? Static52.aClass4_Sub7_11 : Static132.aClass4_Sub7_15;
					} else {
						local217 -= 1000;
						local27--;
						local1103 = Static106.method1749(Static33.anIntArray93[local27]);
					}
					if (local217 == 1000) {
						local27 -= 2;
						local1103.anInt785 = Static33.anIntArray93[local27];
						local1103.anInt796 = Static33.anIntArray93[local27 + 1];
						Static110.method1772(local1103);
						continue;
					}
					if (local217 == 1001) {
						local27 -= 2;
						local1103.anInt773 = Static33.anIntArray93[local27];
						local1103.anInt753 = Static33.anIntArray93[local27 + 1];
						Static110.method1772(local1103);
						continue;
					}
					if (local217 == 1003) {
						local27--;
						@Pc(7050) boolean local7050 = Static33.anIntArray93[local27] == 1;
						if (local1103.aBoolean71 != local7050) {
							local1103.aBoolean71 = local7050;
							Static110.method1772(local1103);
						}
						continue;
					}
				}
				throw new IllegalStateException();
			}
		} catch (@Pc(7071) Exception local7071) {
			if (local18.aClass22_905 == null) {
				if (Static57.anInt1741 != 0) {
					Static65.method1153(Static97.aClass22_748, 0, Static134.aClass22_977);
				}
				Static91.method1588(local7071, "CS2 - scr:" + local18.aLong99 + " op:" + local39);
			} else {
				@Pc(7078) Class22 local7078 = Static53.method1004(30);
				local7078.method452(Static30.aClass22_194).method452(local18.aClass22_905);
				for (local55 = Static117.anInt2886 - 1; local55 >= 0; local55--) {
					local7078.method452(Static69.aClass22_508).method452(Static48.aClass68Array1[local55].aClass4_Sub1_Sub16_1.aClass22_905);
				}
				if (local39 == 40) {
					local93 = local33[local41];
					local7078.method452(Static29.aClass22_188).method452(Static134.method2042(local93));
				}
				if (Static57.anInt1741 != 0) {
					Static65.method1153(Static44.method856(new Class22[] { Static58.aClass22_454, local18.aClass22_905 }), 0, Static134.aClass22_977);
				}
				Static91.method1588(local7071, "CS2 - scr:" + local18.aLong99 + " op:" + local39 + new String(local7078.method464()));
			}
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V")
	public static void method2037() {
		aClass22_973 = null;
		aClass22_969 = null;
		aClass22_967 = null;
		aClass22_974 = null;
		aClass4_Sub1_Sub2_Sub2Array15 = null;
		aClass20_63 = null;
		anIntArray344 = null;
		aClass20_62 = null;
		aClass22_970 = null;
		aClass22_966 = null;
		aClass4_Sub11_Sub1_3 = null;
		aClass22_968 = null;
		aClass22_971 = null;
		aClass22_972 = null;
		aClass22Array24 = null;
		aClass4_Sub7_16 = null;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(II[BIIIILclient!vd;I[Lclient!qf;I)V")
	public static void method2038(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class77 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class60[] arg8, @OriginalArg(10) int arg9) {
		@Pc(16) Class4_Sub11 local16 = new Class4_Sub11(arg1);
		@Pc(18) int local18 = -1;
		while (true) {
			@Pc(22) int local22 = local16.method692();
			if (local22 == 0) {
				return;
			}
			local18 += local22;
			@Pc(30) int local30 = 0;
			while (true) {
				@Pc(34) int local34 = local16.method692();
				if (local34 == 0) {
					break;
				}
				@Pc(42) int local42 = local16.method719();
				local30 += local34 - 1;
				@Pc(54) int local54 = local30 >> 6 & 0x3F;
				@Pc(58) int local58 = local30 & 0x3F;
				@Pc(62) int local62 = local42 & 0x3;
				@Pc(66) int local66 = local30 >> 12;
				@Pc(70) int local70 = local42 >> 2;
				if (arg2 == local66 && arg9 <= local54 && local54 < arg9 + 8 && arg3 <= local58 && local58 < arg3 + 8) {
					@Pc(103) Class4_Sub1_Sub5 local103 = Static5.method45(local18);
					@Pc(121) int local121 = arg5 + Static120.method1874(local58 & 0x7, local103.anInt1267, local62, local103.anInt1256, local54 & 0x7, arg7);
					@Pc(138) int local138 = Static58.method1097(local62, local58 & 0x7, arg7, local103.anInt1267, local103.anInt1256, local54 & 0x7) + arg4;
					if (local121 > 0 && local138 > 0 && local121 < 103 && local138 < 103) {
						@Pc(157) int local157 = arg0;
						if ((Static3.aByteArrayArrayArray1[1][local121][local138] & 0x2) == 2) {
							local157 = arg0 - 1;
						}
						@Pc(173) Class60 local173 = null;
						if (local157 >= 0) {
							local173 = arg8[local157];
						}
						Static90.method1577(arg6, local138, local70, local18, arg7 + local62 & 0x3, local173, arg0, local121);
					}
				}
			}
		}
	}
}
