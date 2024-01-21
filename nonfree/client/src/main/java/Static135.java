import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!ph", name = "V", descriptor = "Z")
	public static boolean aBoolean135;

	@OriginalMember(owner = "client!ph", name = "X", descriptor = "I")
	public static int anInt3214;

	@OriginalMember(owner = "client!ph", name = "Z", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray1;

	@OriginalMember(owner = "client!ph", name = "ib", descriptor = "I")
	public static int anInt3221;

	@OriginalMember(owner = "client!ph", name = "jb", descriptor = "I")
	public static int anInt3222;

	@OriginalMember(owner = "client!ph", name = "kb", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_1181 = Static177.method3050("K");

	@OriginalMember(owner = "client!ph", name = "S", descriptor = "Lclient!jd;")
	public static Class46 aClass46_1175 = aClass46_1181;

	@OriginalMember(owner = "client!ph", name = "T", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1176 = Static177.method3050("(U2");

	@OriginalMember(owner = "client!ph", name = "fb", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_1179 = Static177.method3050("Checking for updates )2 ");

	@OriginalMember(owner = "client!ph", name = "W", descriptor = "Lclient!jd;")
	public static Class46 aClass46_1177 = aClass46_1179;

	@OriginalMember(owner = "client!ph", name = "ab", descriptor = "I")
	public static final int anInt3216 = 0;

	@OriginalMember(owner = "client!ph", name = "cb", descriptor = "I")
	public static int anInt3218 = 255;

	@OriginalMember(owner = "client!ph", name = "eb", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1178 = Static177.method3050("(U(Y");

	@OriginalMember(owner = "client!ph", name = "hb", descriptor = "Lclient!jd;")
	public static Class46 aClass46_1180 = aClass46_1181;

	@OriginalMember(owner = "client!ph", name = "mb", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1182 = Static177.method3050("Bitte geben Sie Ihren Benutzernamen ein)3");

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILclient!qd;I)V")
	public static void method2369(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub21 arg1) {
		@Pc(4) Object[] local4 = arg1.anObjectArray28;
		@Pc(10) int local10 = (Integer) local4[0];
		@Pc(18) Class4_Sub1_Sub14 local18 = Static151.method2590(local10);
		if (local18 == null) {
			return;
		}
		Static156.anInt3527 = 0;
		@Pc(25) int local25 = 0;
		@Pc(34) int local34 = -1;
		@Pc(36) int local36 = 0;
		@Pc(39) int[] local39 = local18.anIntArray250;
		@Pc(41) byte local41 = -1;
		@Pc(44) int[] local44 = local18.anIntArray249;
		@Pc(58) int local58;
		@Pc(96) int local96;
		try {
			Static17.aClass46Array3 = new Class46[local18.anInt2671];
			Static102.anIntArray242 = new int[local18.anInt2668];
			@Pc(54) int local54 = 0;
			@Pc(56) int local56 = 0;
			for (local58 = 1; local58 < local4.length; local58++) {
				if (local4[local58] instanceof Integer) {
					local96 = (Integer) local4[local58];
					if (local96 == -2147483647) {
						local96 = arg1.anInt3268;
					}
					if (local96 == -2147483646) {
						local96 = arg1.anInt3265;
					}
					if (local96 == -2147483645) {
						local96 = arg1.aClass1_40 == null ? -1 : arg1.aClass1_40.anInt53;
					}
					if (local96 == -2147483644) {
						local96 = arg1.anInt3266;
					}
					if (local96 == -2147483643) {
						local96 = arg1.aClass1_40 == null ? -1 : arg1.aClass1_40.anInt48;
					}
					if (local96 == -2147483642) {
						local96 = arg1.aClass1_39 == null ? -1 : arg1.aClass1_39.anInt53;
					}
					if (local96 == -2147483641) {
						local96 = arg1.aClass1_39 == null ? -1 : arg1.aClass1_39.anInt48;
					}
					if (local96 == -2147483640) {
						local96 = arg1.anInt3264;
					}
					if (local96 == -2147483639) {
						local96 = arg1.anInt3270;
					}
					Static102.anIntArray242[local54++] = local96;
				} else if (local4[local58] instanceof Class46) {
					@Pc(75) Class46 local75 = (Class46) local4[local58];
					if (local75.method1668(Static167.aClass46_1365)) {
						local75 = arg1.aClass46_1205;
					}
					Static17.aClass46Array3[local56++] = local75;
				}
			}
			local96 = 0;
			label2229: while (true) {
				local96++;
				if (local96 > arg0) {
					throw new RuntimeException("slow");
				}
				local34++;
				@Pc(218) int local218 = local39[local34];
				@Pc(772) int local772;
				@Pc(767) int local767;
				@Pc(619) int local619;
				@Pc(640) int local640;
				@Pc(577) Class46 local577;
				if (local218 < 100) {
					if (local218 == 0) {
						Static55.anIntArray144[local25++] = local44[local34];
						continue;
					}
					@Pc(243) int local243;
					if (local218 == 1) {
						local243 = local44[local34];
						Static55.anIntArray144[local25++] = Static147.anIntArray64[local243];
						continue;
					}
					if (local218 == 2) {
						local243 = local44[local34];
						local25--;
						Static147.anIntArray64[local243] = Static55.anIntArray144[local25];
						continue;
					}
					if (local218 == 3) {
						Static53.aClass46Array12[local36++] = local18.aClass46Array20[local34];
						continue;
					}
					if (local218 == 6) {
						local34 += local44[local34];
						continue;
					}
					if (local218 == 7) {
						local25 -= 2;
						if (Static55.anIntArray144[local25] != Static55.anIntArray144[local25 + 1]) {
							local34 += local44[local34];
						}
						continue;
					}
					if (local218 == 8) {
						local25 -= 2;
						if (Static55.anIntArray144[local25 + 1] == Static55.anIntArray144[local25]) {
							local34 += local44[local34];
						}
						continue;
					}
					if (local218 == 9) {
						local25 -= 2;
						if (Static55.anIntArray144[local25 + 1] > Static55.anIntArray144[local25]) {
							local34 += local44[local34];
						}
						continue;
					}
					if (local218 == 10) {
						local25 -= 2;
						if (Static55.anIntArray144[local25] > Static55.anIntArray144[local25 + 1]) {
							local34 += local44[local34];
						}
						continue;
					}
					if (local218 == 21) {
						if (Static156.anInt3527 == 0) {
							return;
						}
						@Pc(400) Class26 local400 = Static69.aClass26Array1[--Static156.anInt3527];
						Static17.aClass46Array3 = local400.aClass46Array11;
						local34 = local400.anInt1229;
						Static102.anIntArray242 = local400.anIntArray119;
						local18 = local400.aClass4_Sub1_Sub14_1;
						local44 = local18.anIntArray249;
						local39 = local18.anIntArray250;
						continue;
					}
					if (local218 == 25) {
						local243 = local44[local34];
						Static55.anIntArray144[local25++] = Static26.method438(local243);
						continue;
					}
					if (local218 == 27) {
						local243 = local44[local34];
						local25--;
						Static42.method715(Static55.anIntArray144[local25], local243);
						continue;
					}
					if (local218 == 31) {
						local25 -= 2;
						if (Static55.anIntArray144[local25] <= Static55.anIntArray144[local25 + 1]) {
							local34 += local44[local34];
						}
						continue;
					}
					if (local218 == 32) {
						local25 -= 2;
						if (Static55.anIntArray144[local25] >= Static55.anIntArray144[local25 + 1]) {
							local34 += local44[local34];
						}
						continue;
					}
					if (local218 == 33) {
						Static55.anIntArray144[local25++] = Static102.anIntArray242[local44[local34]];
						continue;
					}
					@Pc(525) int local525;
					if (local218 == 34) {
						local525 = local44[local34];
						local25--;
						Static102.anIntArray242[local525] = Static55.anIntArray144[local25];
						continue;
					}
					if (local218 == 35) {
						Static53.aClass46Array12[local36++] = Static17.aClass46Array3[local44[local34]];
						continue;
					}
					if (local218 == 36) {
						local525 = local44[local34];
						local36--;
						Static17.aClass46Array3[local525] = Static53.aClass46Array12[local36];
						continue;
					}
					if (local218 == 37) {
						local243 = local44[local34];
						local36 -= local243;
						local577 = Static116.method2123(local243, Static53.aClass46Array12, local36);
						Static53.aClass46Array12[local36++] = local577;
						continue;
					}
					if (local218 == 38) {
						local25--;
						continue;
					}
					if (local218 == 39) {
						local36--;
						continue;
					}
					if (local218 == 40) {
						local243 = local44[local34];
						@Pc(609) Class4_Sub1_Sub14 local609 = Static151.method2590(local243);
						@Pc(613) Class46[] local613 = new Class46[local609.anInt2671];
						@Pc(617) int[] local617 = new int[local609.anInt2668];
						for (local619 = 0; local619 < local609.anInt2670; local619++) {
							local617[local619] = Static55.anIntArray144[local25 + local619 - local609.anInt2670];
						}
						for (local640 = 0; local640 < local609.anInt2667; local640++) {
							local613[local640] = Static53.aClass46Array12[local640 + local36 - local609.anInt2667];
						}
						local36 -= local609.anInt2667;
						local25 -= local609.anInt2670;
						@Pc(672) Class26 local672 = new Class26();
						local672.anIntArray119 = Static102.anIntArray242;
						local672.aClass4_Sub1_Sub14_1 = local18;
						local672.anInt1229 = local34;
						local672.aClass46Array11 = Static17.aClass46Array3;
						if (Static69.aClass26Array1.length <= Static156.anInt3527) {
							throw new RuntimeException();
						}
						local34 = -1;
						Static69.aClass26Array1[Static156.anInt3527++] = local672;
						local18 = local609;
						local44 = local609.anIntArray249;
						local39 = local609.anIntArray250;
						Static17.aClass46Array3 = local613;
						Static102.anIntArray242 = local617;
						continue;
					}
					if (local218 == 42) {
						Static55.anIntArray144[local25++] = Static139.anIntArray313[local44[local34]];
						continue;
					}
					if (local218 == 43) {
						local525 = local44[local34];
						local25--;
						Static139.anIntArray313[local525] = Static55.anIntArray144[local25];
						continue;
					}
					if (local218 == 44) {
						local243 = local44[local34] >> 16;
						local767 = local44[local34] & 0xFFFF;
						local25--;
						local772 = Static55.anIntArray144[local25];
						if (local772 >= 0 && local772 <= 5000) {
							Static106.anIntArray247[local243] = local772;
							@Pc(790) byte local790 = -1;
							if (local767 == 105) {
								local790 = 0;
							}
							local619 = 0;
							while (true) {
								if (local619 >= local772) {
									continue label2229;
								}
								Static132.anIntArrayArray25[local243][local619] = local790;
								local619++;
							}
						}
						throw new RuntimeException();
					}
					if (local218 == 45) {
						local243 = local44[local34];
						local25--;
						local767 = Static55.anIntArray144[local25];
						if (local767 >= 0 && Static106.anIntArray247[local243] > local767) {
							Static55.anIntArray144[local25++] = Static132.anIntArrayArray25[local243][local767];
							continue;
						}
						throw new RuntimeException();
					}
					if (local218 == 46) {
						local25 -= 2;
						local243 = local44[local34];
						local767 = Static55.anIntArray144[local25];
						if (local767 >= 0 && Static106.anIntArray247[local243] > local767) {
							Static132.anIntArrayArray25[local243][local767] = Static55.anIntArray144[local25 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (local218 == 47) {
						@Pc(910) Class46 local910 = Static127.aClass46Array22[local44[local34]];
						if (local910 == null) {
							local910 = Static126.aClass46_1096;
						}
						Static53.aClass46Array12[local36++] = local910;
						continue;
					}
					if (local218 == 48) {
						local525 = local44[local34];
						local36--;
						Static127.aClass46Array22[local525] = Static53.aClass46Array12[local36];
						continue;
					}
					if (local218 == 51) {
						@Pc(945) Class20 local945 = local18.aClass20Array1[local44[local34]];
						local25--;
						@Pc(955) Class4_Sub18 local955 = (Class4_Sub18) local945.method505((long) Static55.anIntArray144[local25]);
						if (local955 != null) {
							local34 += local955.anInt2869;
						}
						continue;
					}
				}
				@Pc(973) boolean local973;
				if (local44[local34] == 1) {
					local973 = true;
				} else {
					local973 = false;
				}
				@Pc(1009) Class1 local1009;
				@Pc(2282) int local2282;
				@Pc(1807) int local1807;
				@Pc(2641) Class1 local2641;
				@Pc(2670) Class1 local2670;
				if (local218 < 300) {
					if (local218 == 100) {
						local25 -= 3;
						local772 = Static55.anIntArray144[local25 + 1];
						local2282 = Static55.anIntArray144[local25 + 2];
						local767 = Static55.anIntArray144[local25];
						if (local772 == 0) {
							throw new RuntimeException();
						}
						local2641 = Static154.method3136(local767);
						if (local2641.aClass1Array1 == null) {
							local2641.aClass1Array1 = new Class1[local2282 + 1];
						}
						if (local2282 >= local2641.aClass1Array1.length) {
							@Pc(7862) Class1[] local7862 = new Class1[local2282 + 1];
							for (local1807 = 0; local1807 < local2641.aClass1Array1.length; local1807++) {
								local7862[local1807] = local2641.aClass1Array1[local1807];
							}
							local2641.aClass1Array1 = local7862;
						}
						if (local2282 > 0 && local2641.aClass1Array1[local2282 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local2282 - 1));
						}
						@Pc(7908) Class1 local7908 = new Class1();
						local7908.anInt24 = local7908.anInt53 = local2641.anInt53;
						local7908.anInt7 = local772;
						local7908.aBoolean8 = true;
						local7908.anInt48 = local2282;
						local2641.aClass1Array1[local2282] = local7908;
						if (local973) {
							Static142.aClass1_42 = local7908;
						} else {
							Static87.aClass1_26 = local7908;
						}
						Static3.method21(local2641);
						continue;
					}
					@Pc(7972) Class1 local7972;
					if (local218 == 101) {
						local1009 = local973 ? Static142.aClass1_42 : Static87.aClass1_26;
						if (local1009.anInt48 == -1) {
							if (!local973) {
								throw new RuntimeException("Tried to cc_delete static active-component!");
							}
							throw new RuntimeException("Tried to .cc_delete static .active-component!");
						}
						local7972 = Static154.method3136(local1009.anInt53);
						local7972.aClass1Array1[local1009.anInt48] = null;
						Static3.method21(local7972);
						continue;
					}
					if (local218 == 102) {
						local25--;
						local1009 = Static154.method3136(Static55.anIntArray144[local25]);
						local1009.aClass1Array1 = null;
						Static3.method21(local1009);
						continue;
					}
					if (local218 == 200) {
						local25 -= 2;
						local767 = Static55.anIntArray144[local25];
						local772 = Static55.anIntArray144[local25 + 1];
						local2670 = Static132.method2334(local772, local767);
						if (local2670 != null && local772 != -1) {
							Static55.anIntArray144[local25++] = 1;
							if (local973) {
								Static142.aClass1_42 = local2670;
							} else {
								Static87.aClass1_26 = local2670;
							}
							continue;
						}
						Static55.anIntArray144[local25++] = 0;
						continue;
					}
					if (local218 == 201) {
						local25--;
						local767 = Static55.anIntArray144[local25];
						local7972 = Static154.method3136(local767);
						if (local7972 == null) {
							Static55.anIntArray144[local25++] = 0;
						} else {
							Static55.anIntArray144[local25++] = 1;
							if (local973) {
								Static142.aClass1_42 = local7972;
							} else {
								Static87.aClass1_26 = local7972;
							}
						}
						continue;
					}
				} else if (local218 < 500) {
					if (local218 == 403) {
						local25 -= 2;
						local772 = Static55.anIntArray144[local25 + 1];
						local767 = Static55.anIntArray144[local25];
						if (local767 >= 7) {
							local767 -= 7;
						}
						Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.aClass43_1.method1566(local767, local772);
						continue;
					}
					if (local218 == 404) {
						local25 -= 2;
						local767 = Static55.anIntArray144[local25];
						local772 = Static55.anIntArray144[local25 + 1];
						Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.aClass43_1.method1563(local772, local767);
						continue;
					}
					if (local218 == 410) {
						local25--;
						@Pc(7802) boolean local7802 = Static55.anIntArray144[local25] != 0;
						Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.aClass43_1.method1558(local7802);
						continue;
					}
				} else if (local218 >= 1000 && local218 < 1100 || local218 >= 2000 && local218 < 2100) {
					if (local218 >= 2000) {
						local25--;
						local1009 = Static154.method3136(Static55.anIntArray144[local25]);
						local218 -= 1000;
					} else {
						local1009 = local973 ? Static142.aClass1_42 : Static87.aClass1_26;
					}
					if (local218 == 1000) {
						local25 -= 2;
						local1009.anInt43 = Static55.anIntArray144[local25];
						local1009.anInt8 = Static55.anIntArray144[local25 + 1];
						Static3.method21(local1009);
						continue;
					}
					if (local218 == 1001) {
						local25 -= 2;
						local1009.anInt50 = Static55.anIntArray144[local25];
						local1009.anInt20 = Static55.anIntArray144[local25 + 1];
						Static3.method21(local1009);
						continue;
					}
					if (local218 == 1003) {
						local25--;
						@Pc(1079) boolean local1079 = Static55.anIntArray144[local25] == 1;
						if (local1079 != local1009.aBoolean5) {
							local1009.aBoolean5 = local1079;
							Static3.method21(local1009);
						}
						continue;
					}
				} else {
					@Pc(1454) Class46 local1454;
					if (local218 >= 1100 && local218 < 1200 || local218 >= 2100 && local218 < 2200) {
						if (local218 >= 2000) {
							local218 -= 1000;
							local25--;
							local1009 = Static154.method3136(Static55.anIntArray144[local25]);
						} else {
							local1009 = local973 ? Static142.aClass1_42 : Static87.aClass1_26;
						}
						if (local218 == 1100) {
							local25 -= 2;
							local1009.anInt18 = Static55.anIntArray144[local25];
							if (local1009.anInt77 - local1009.anInt50 < local1009.anInt18) {
								local1009.anInt18 = local1009.anInt77 - local1009.anInt50;
							}
							if (local1009.anInt18 < 0) {
								local1009.anInt18 = 0;
							}
							local1009.anInt32 = Static55.anIntArray144[local25 + 1];
							if (local1009.anInt42 - local1009.anInt20 < local1009.anInt32) {
								local1009.anInt32 = local1009.anInt42 - local1009.anInt20;
							}
							if (local1009.anInt32 < 0) {
								local1009.anInt32 = 0;
							}
							Static3.method21(local1009);
							continue;
						}
						if (local218 == 1101) {
							local25--;
							local1009.anInt6 = Static55.anIntArray144[local25];
							Static3.method21(local1009);
							continue;
						}
						if (local218 == 1102) {
							local25--;
							local1009.aBoolean3 = Static55.anIntArray144[local25] == 1;
							Static3.method21(local1009);
							continue;
						}
						if (local218 == 1103) {
							local25--;
							local1009.anInt68 = Static55.anIntArray144[local25];
							Static3.method21(local1009);
							continue;
						}
						if (local218 == 1104) {
							local25--;
							local1009.anInt15 = Static55.anIntArray144[local25];
							Static3.method21(local1009);
							continue;
						}
						if (local218 == 1105) {
							local25--;
							local1009.anInt59 = Static55.anIntArray144[local25];
							Static3.method21(local1009);
							continue;
						}
						if (local218 == 1106) {
							local25--;
							local1009.anInt40 = Static55.anIntArray144[local25];
							Static3.method21(local1009);
							continue;
						}
						if (local218 == 1107) {
							local25--;
							local1009.aBoolean9 = Static55.anIntArray144[local25] == 1;
							Static3.method21(local1009);
							continue;
						}
						if (local218 == 1108) {
							local1009.anInt33 = 1;
							local25--;
							local1009.anInt71 = Static55.anIntArray144[local25];
							Static3.method21(local1009);
							continue;
						}
						if (local218 == 1109) {
							local25 -= 6;
							local1009.anInt22 = Static55.anIntArray144[local25];
							local1009.anInt4 = Static55.anIntArray144[local25 + 1];
							local1009.anInt35 = Static55.anIntArray144[local25 + 2];
							local1009.anInt56 = Static55.anIntArray144[local25 + 3];
							local1009.anInt5 = Static55.anIntArray144[local25 + 4];
							local1009.anInt72 = Static55.anIntArray144[local25 + 5];
							Static3.method21(local1009);
							continue;
						}
						if (local218 == 1110) {
							local25--;
							local772 = Static55.anIntArray144[local25];
							if (local1009.anInt19 != local772) {
								local1009.anInt19 = local772;
								local1009.anInt76 = 0;
								local1009.anInt70 = 0;
								Static3.method21(local1009);
							}
							continue;
						}
						if (local218 == 1111) {
							local25--;
							local1009.aBoolean11 = Static55.anIntArray144[local25] == 1;
							Static3.method21(local1009);
							continue;
						}
						if (local218 == 1112) {
							local36--;
							local1454 = Static53.aClass46Array12[local36];
							if (!local1454.method1668(local1009.aClass46_2)) {
								local1009.aClass46_2 = local1454;
								Static3.method21(local1009);
							}
							continue;
						}
						if (local218 == 1113) {
							local25--;
							local1009.anInt55 = Static55.anIntArray144[local25];
							Static3.method21(local1009);
							continue;
						}
						if (local218 == 1114) {
							local25 -= 3;
							local1009.anInt47 = Static55.anIntArray144[local25];
							local1009.anInt67 = Static55.anIntArray144[local25 + 1];
							local1009.anInt61 = Static55.anIntArray144[local25 + 2];
							Static3.method21(local1009);
							continue;
						}
						if (local218 == 1115) {
							local25--;
							local1009.aBoolean10 = Static55.anIntArray144[local25] == 1;
							Static3.method21(local1009);
							continue;
						}
						if (local218 == 1116) {
							local25--;
							local1009.anInt58 = Static55.anIntArray144[local25];
							Static3.method21(local1009);
							continue;
						}
						if (local218 == 1117) {
							local25--;
							local1009.anInt34 = Static55.anIntArray144[local25];
							Static3.method21(local1009);
							continue;
						}
						if (local218 == 1118) {
							local25--;
							local1009.aBoolean12 = Static55.anIntArray144[local25] == 1;
							Static3.method21(local1009);
							continue;
						}
						if (local218 == 1119) {
							local25--;
							local1009.aBoolean6 = Static55.anIntArray144[local25] == 1;
							Static3.method21(local1009);
							continue;
						}
						if (local218 == 1120) {
							local25 -= 2;
							local1009.anInt77 = Static55.anIntArray144[local25];
							local1009.anInt42 = Static55.anIntArray144[local25 + 1];
							Static3.method21(local1009);
							continue;
						}
					} else if (local218 >= 1200 && local218 < 1300 || !(local218 < 2200 || local218 >= 2300)) {
						if (local218 < 2000) {
							local1009 = local973 ? Static142.aClass1_42 : Static87.aClass1_26;
						} else {
							local25--;
							local1009 = Static154.method3136(Static55.anIntArray144[local25]);
							local218 -= 1000;
						}
						Static3.method21(local1009);
						if (local218 == 1200) {
							local25 -= 2;
							local2282 = Static55.anIntArray144[local25 + 1];
							local772 = Static55.anIntArray144[local25];
							if (local772 == -1) {
								local1009.anInt33 = 1;
								local1009.anInt25 = -1;
								local1009.anInt71 = -1;
							} else {
								local1009.anInt46 = local2282;
								local1009.anInt25 = local772;
								@Pc(7637) Class4_Sub1_Sub12 local7637 = Static83.method1663(local772);
								local1009.anInt4 = local7637.anInt2485;
								local1009.anInt72 = local7637.anInt2499;
								local1009.anInt35 = local7637.anInt2493;
								if (local1009.anInt50 > 0) {
									local1009.anInt72 = local1009.anInt72 * 32 / local1009.anInt50;
								}
								local1009.anInt22 = local7637.anInt2504;
								local1009.anInt56 = local7637.anInt2491;
								local1009.anInt5 = local7637.anInt2474;
							}
							continue;
						}
						if (local218 == 1201) {
							local1009.anInt33 = 2;
							local25--;
							local1009.anInt71 = Static55.anIntArray144[local25];
							continue;
						}
						if (local218 == 1202) {
							local1009.anInt33 = 3;
							local1009.anInt71 = Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.aClass43_1.method1569();
							continue;
						}
						if (local218 == 1203) {
							local1009.anInt33 = 6;
							local25--;
							local1009.anInt71 = Static55.anIntArray144[local25];
							continue;
						}
						if (local218 == 1204) {
							local1009.anInt33 = 5;
							local25--;
							local1009.anInt71 = Static55.anIntArray144[local25];
							continue;
						}
					} else if (local218 >= 1300 && local218 < 1400 || local218 >= 2300 && local218 < 2400) {
						if (local218 >= 2000) {
							local25--;
							local1009 = Static154.method3136(Static55.anIntArray144[local25]);
							local218 -= 1000;
						} else {
							local1009 = local973 ? Static142.aClass1_42 : Static87.aClass1_26;
						}
						if (local218 == 1300) {
							local25--;
							local772 = Static55.anIntArray144[local25] - 1;
							if (local772 >= 0 && local772 <= 9) {
								local36--;
								local1009.method16(Static53.aClass46Array12[local36], local772);
								continue;
							}
							local36--;
							continue;
						}
						if (local218 == 1301) {
							local25 -= 2;
							local772 = Static55.anIntArray144[local25];
							local2282 = Static55.anIntArray144[local25 + 1];
							local1009.aClass1_1 = Static132.method2334(local2282, local772);
							continue;
						}
						if (local218 == 1302) {
							local25--;
							local1009.aBoolean7 = Static55.anIntArray144[local25] == 1;
							continue;
						}
						if (local218 == 1303) {
							local25--;
							local1009.anInt37 = Static55.anIntArray144[local25];
							continue;
						}
						if (local218 == 1304) {
							local25--;
							local1009.anInt14 = Static55.anIntArray144[local25];
							continue;
						}
						if (local218 == 1305) {
							local36--;
							local1009.aClass46_10 = Static53.aClass46Array12[local36];
							continue;
						}
						if (local218 == 1306) {
							local36--;
							local1009.aClass46_3 = Static53.aClass46Array12[local36];
							continue;
						}
						if (local218 == 1307) {
							local1009.aClass46Array1 = null;
							continue;
						}
					} else {
						if (local218 >= 1400 && local218 < 1500 || local218 >= 2400 && local218 < 2500) {
							if (local218 < 2000) {
								local1009 = local973 ? Static142.aClass1_42 : Static87.aClass1_26;
							} else {
								local218 -= 1000;
								local25--;
								local1009 = Static154.method3136(Static55.anIntArray144[local25]);
							}
							local36--;
							local1454 = Static53.aClass46Array12[local36];
							@Pc(1708) int[] local1708 = null;
							if (local1454.method1677() > 0 && local1454.method1672(local1454.method1677() - 1) == 89) {
								local25--;
								local619 = Static55.anIntArray144[local25];
								if (local619 > 0) {
									local1708 = new int[local619];
									while (local619-- > 0) {
										local25--;
										local1708[local619] = Static55.anIntArray144[local25];
									}
								}
								local1454 = local1454.method1666(local1454.method1677() - 1, 0);
							}
							@Pc(1764) Object[] local1764 = new Object[local1454.method1677() + 1];
							for (local640 = local1764.length - 1; local640 >= 1; local640--) {
								if (local1454.method1672(local640 - 1) == 115) {
									local36--;
									local1764[local640] = Static53.aClass46Array12[local36];
								} else {
									local25--;
									local1764[local640] = Integer.valueOf(Static55.anIntArray144[local25]);
								}
							}
							local25--;
							local1807 = Static55.anIntArray144[local25];
							if (local1807 == -1) {
								local1764 = null;
							} else {
								local1764[0] = Integer.valueOf(local1807);
							}
							if (local218 == 1408) {
								local1009.anObjectArray4 = local1764;
							}
							if (local218 == 1423) {
								local1009.anObjectArray2 = local1764;
							}
							if (local218 == 1400) {
								local1009.anObjectArray6 = local1764;
							}
							if (local218 == 1419) {
								local1009.anObjectArray24 = local1764;
							}
							local1009.aBoolean1 = true;
							if (local218 == 1418) {
								local1009.anObjectArray12 = local1764;
							}
							if (local218 == 1420) {
								local1009.anObjectArray22 = local1764;
							}
							if (local218 == 1425) {
								local1009.anObjectArray5 = local1764;
							}
							if (local218 == 1410) {
								local1009.anObjectArray16 = local1764;
							}
							if (local218 == 1409) {
								local1009.anObjectArray7 = local1764;
							}
							if (local218 == 1415) {
								local1009.anObjectArray9 = local1764;
								local1009.anIntArray6 = local1708;
							}
							if (local218 == 1407) {
								local1009.anObjectArray3 = local1764;
								local1009.anIntArray9 = local1708;
							}
							if (local218 == 1414) {
								local1009.anIntArray12 = local1708;
								local1009.anObjectArray17 = local1764;
							}
							if (local218 == 1401) {
								local1009.anObjectArray21 = local1764;
							}
							if (local218 == 1403) {
								local1009.anObjectArray13 = local1764;
							}
							if (local218 == 1421) {
								local1009.anObjectArray14 = local1764;
							}
							if (local218 == 1424) {
								local1009.anObjectArray11 = local1764;
							}
							if (local218 == 1416) {
								local1009.anObjectArray26 = local1764;
							}
							if (local218 == 1417) {
								local1009.anObjectArray15 = local1764;
							}
							if (local218 == 1412) {
								local1009.anObjectArray10 = local1764;
							}
							if (local218 == 1411) {
								local1009.anObjectArray18 = local1764;
							}
							if (local218 == 1422) {
								local1009.anObjectArray1 = local1764;
							}
							if (local218 == 1402) {
								local1009.anObjectArray23 = local1764;
							}
							if (local218 == 1405) {
								local1009.anObjectArray19 = local1764;
							}
							if (local218 == 1404) {
								local1009.anObjectArray20 = local1764;
							}
							if (local218 == 1406) {
								local1009.anObjectArray25 = local1764;
							}
							continue;
						}
						if (local218 < 1600) {
							local1009 = local973 ? Static142.aClass1_42 : Static87.aClass1_26;
							if (local218 == 1500) {
								Static55.anIntArray144[local25++] = local1009.anInt43;
								continue;
							}
							if (local218 == 1501) {
								Static55.anIntArray144[local25++] = local1009.anInt8;
								continue;
							}
							if (local218 == 1502) {
								Static55.anIntArray144[local25++] = local1009.anInt50;
								continue;
							}
							if (local218 == 1503) {
								Static55.anIntArray144[local25++] = local1009.anInt20;
								continue;
							}
							if (local218 == 1504) {
								Static55.anIntArray144[local25++] = local1009.aBoolean5 ? 1 : 0;
								continue;
							}
							if (local218 == 1505) {
								Static55.anIntArray144[local25++] = local1009.anInt24;
								continue;
							}
						} else if (local218 < 1700) {
							local1009 = local973 ? Static142.aClass1_42 : Static87.aClass1_26;
							if (local218 == 1600) {
								Static55.anIntArray144[local25++] = local1009.anInt18;
								continue;
							}
							if (local218 == 1601) {
								Static55.anIntArray144[local25++] = local1009.anInt32;
								continue;
							}
							if (local218 == 1602) {
								Static53.aClass46Array12[local36++] = local1009.aClass46_2;
								continue;
							}
							if (local218 == 1603) {
								Static55.anIntArray144[local25++] = local1009.anInt77;
								continue;
							}
							if (local218 == 1604) {
								Static55.anIntArray144[local25++] = local1009.anInt42;
								continue;
							}
							if (local218 == 1605) {
								Static55.anIntArray144[local25++] = local1009.anInt72;
								continue;
							}
							if (local218 == 1606) {
								Static55.anIntArray144[local25++] = local1009.anInt35;
								continue;
							}
							if (local218 == 1607) {
								Static55.anIntArray144[local25++] = local1009.anInt5;
								continue;
							}
							if (local218 == 1608) {
								Static55.anIntArray144[local25++] = local1009.anInt56;
								continue;
							}
							if (local218 == 1609) {
								Static55.anIntArray144[local25++] = local1009.anInt68;
								continue;
							}
						} else if (local218 < 1800) {
							local1009 = local973 ? Static142.aClass1_42 : Static87.aClass1_26;
							if (local218 == 1700) {
								Static55.anIntArray144[local25++] = local1009.anInt25;
								continue;
							}
							if (local218 == 1701) {
								if (local1009.anInt25 == -1) {
									Static55.anIntArray144[local25++] = 0;
								} else {
									Static55.anIntArray144[local25++] = local1009.anInt46;
								}
								continue;
							}
							if (local218 == 1702) {
								Static55.anIntArray144[local25++] = local1009.anInt48;
								continue;
							}
						} else if (local218 < 1900) {
							local1009 = local973 ? Static142.aClass1_42 : Static87.aClass1_26;
							if (local218 == 1800) {
								Static55.anIntArray144[local25++] = Static119.method2144(Static102.method1954(local1009));
								continue;
							}
							if (local218 == 1801) {
								local25--;
								local772 = Static55.anIntArray144[local25];
								local772--;
								if (local1009.aClass46Array1 != null && local1009.aClass46Array1.length > local772 && local1009.aClass46Array1[local772] != null) {
									Static53.aClass46Array12[local36++] = local1009.aClass46Array1[local772];
									continue;
								}
								Static53.aClass46Array12[local36++] = Static110.aClass46_995;
								continue;
							}
							if (local218 == 1802) {
								if (local1009.aClass46_10 == null) {
									Static53.aClass46Array12[local36++] = Static110.aClass46_995;
								} else {
									Static53.aClass46Array12[local36++] = local1009.aClass46_10;
								}
								continue;
							}
						} else if (local218 < 2600) {
							local25--;
							local1009 = Static154.method3136(Static55.anIntArray144[local25]);
							if (local218 == 2500) {
								Static55.anIntArray144[local25++] = local1009.anInt43;
								continue;
							}
							if (local218 == 2501) {
								Static55.anIntArray144[local25++] = local1009.anInt8;
								continue;
							}
							if (local218 == 2502) {
								Static55.anIntArray144[local25++] = local1009.anInt50;
								continue;
							}
							if (local218 == 2503) {
								Static55.anIntArray144[local25++] = local1009.anInt20;
								continue;
							}
							if (local218 == 2504) {
								Static55.anIntArray144[local25++] = local1009.aBoolean5 ? 1 : 0;
								continue;
							}
							if (local218 == 2505) {
								Static55.anIntArray144[local25++] = local1009.anInt24;
								continue;
							}
						} else if (local218 < 2700) {
							local25--;
							local1009 = Static154.method3136(Static55.anIntArray144[local25]);
							if (local218 == 2600) {
								Static55.anIntArray144[local25++] = local1009.anInt18;
								continue;
							}
							if (local218 == 2601) {
								Static55.anIntArray144[local25++] = local1009.anInt32;
								continue;
							}
							if (local218 == 2602) {
								Static53.aClass46Array12[local36++] = local1009.aClass46_2;
								continue;
							}
							if (local218 == 2603) {
								Static55.anIntArray144[local25++] = local1009.anInt77;
								continue;
							}
							if (local218 == 2604) {
								Static55.anIntArray144[local25++] = local1009.anInt42;
								continue;
							}
							if (local218 == 2605) {
								Static55.anIntArray144[local25++] = local1009.anInt72;
								continue;
							}
							if (local218 == 2606) {
								Static55.anIntArray144[local25++] = local1009.anInt35;
								continue;
							}
							if (local218 == 2607) {
								Static55.anIntArray144[local25++] = local1009.anInt5;
								continue;
							}
							if (local218 == 2608) {
								Static55.anIntArray144[local25++] = local1009.anInt56;
								continue;
							}
							if (local218 == 2609) {
								Static55.anIntArray144[local25++] = local1009.anInt68;
								continue;
							}
						} else if (local218 < 2800) {
							if (local218 == 2700) {
								local25--;
								local1009 = Static154.method3136(Static55.anIntArray144[local25]);
								Static55.anIntArray144[local25++] = local1009.anInt25;
								continue;
							}
							if (local218 == 2701) {
								local25--;
								local1009 = Static154.method3136(Static55.anIntArray144[local25]);
								if (local1009.anInt25 == -1) {
									Static55.anIntArray144[local25++] = 0;
								} else {
									Static55.anIntArray144[local25++] = local1009.anInt46;
								}
								continue;
							}
							if (local218 == 2702) {
								local25--;
								local767 = Static55.anIntArray144[local25];
								@Pc(2240) Class4_Sub14 local2240 = (Class4_Sub14) Static106.aClass20_5.method505((long) local767);
								if (local2240 == null) {
									Static55.anIntArray144[local25++] = 0;
								} else {
									Static55.anIntArray144[local25++] = 1;
								}
								continue;
							}
							if (local218 == 2703) {
								local25--;
								local1009 = Static154.method3136(Static55.anIntArray144[local25]);
								if (local1009.aClass1Array1 == null) {
									Static55.anIntArray144[local25++] = 0;
									continue;
								}
								local772 = local1009.aClass1Array1.length;
								for (local2282 = 0; local2282 < local1009.aClass1Array1.length; local2282++) {
									if (local1009.aClass1Array1[local2282] == null) {
										local772 = local2282;
										break;
									}
								}
								Static55.anIntArray144[local25++] = local772;
								continue;
							}
							if (local218 == 2704 || local218 == 2705) {
								local25 -= 2;
								local767 = Static55.anIntArray144[local25];
								local772 = Static55.anIntArray144[local25 + 1];
								@Pc(2336) Class4_Sub14 local2336 = (Class4_Sub14) Static106.aClass20_5.method505((long) local767);
								if (local2336 != null && local772 == local2336.anInt2450) {
									Static55.anIntArray144[local25++] = 1;
								} else {
									Static55.anIntArray144[local25++] = 0;
								}
								continue;
							}
						} else if (local218 < 2900) {
							local25--;
							local1009 = Static154.method3136(Static55.anIntArray144[local25]);
							if (local218 == 2800) {
								Static55.anIntArray144[local25++] = Static119.method2144(Static102.method1954(local1009));
								continue;
							}
							if (local218 == 2801) {
								local25--;
								local772 = Static55.anIntArray144[local25];
								local772--;
								if (local1009.aClass46Array1 != null && local1009.aClass46Array1.length > local772 && local1009.aClass46Array1[local772] != null) {
									Static53.aClass46Array12[local36++] = local1009.aClass46Array1[local772];
									continue;
								}
								Static53.aClass46Array12[local36++] = Static110.aClass46_995;
								continue;
							}
							if (local218 == 2802) {
								if (local1009.aClass46_10 == null) {
									Static53.aClass46Array12[local36++] = Static110.aClass46_995;
								} else {
									Static53.aClass46Array12[local36++] = local1009.aClass46_10;
								}
								continue;
							}
						} else if (local218 < 3200) {
							if (local218 == 3100) {
								local36--;
								local577 = Static53.aClass46Array12[local36];
								Static105.method1982(Static110.aClass46_995, 0, local577);
								continue;
							}
							if (local218 == 3101) {
								local25 -= 2;
								Static113.method2088(Static55.anIntArray144[local25 + 1], Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1, Static55.anIntArray144[local25]);
								continue;
							}
							if (local218 == 3103) {
								Static41.method712();
								continue;
							}
							if (local218 == 3104) {
								local36--;
								local577 = Static53.aClass46Array12[local36];
								local772 = 0;
								if (local577.method1659()) {
									local772 = local577.method1658();
								}
								Static90.aClass4_Sub11_Sub1_1.method1285(72);
								Static90.aClass4_Sub11_Sub1_1.method1256(local772);
								continue;
							}
							if (local218 == 3105) {
								local36--;
								local577 = Static53.aClass46Array12[local36];
								Static90.aClass4_Sub11_Sub1_1.method1285(119);
								Static90.aClass4_Sub11_Sub1_1.method1269(local577.method1646());
								continue;
							}
							if (local218 == 3106) {
								local36--;
								local577 = Static53.aClass46Array12[local36];
								Static90.aClass4_Sub11_Sub1_1.method1285(35);
								Static90.aClass4_Sub11_Sub1_1.method1238(local577.method1677() + 1);
								Static90.aClass4_Sub11_Sub1_1.method1276(local577);
								continue;
							}
							if (local218 == 3107) {
								local25--;
								local767 = Static55.anIntArray144[local25];
								local36--;
								local1454 = Static53.aClass46Array12[local36];
								Static169.method2889(local767, local1454);
								continue;
							}
							if (local218 == 3108) {
								local25 -= 3;
								local772 = Static55.anIntArray144[local25 + 1];
								local767 = Static55.anIntArray144[local25];
								local2282 = Static55.anIntArray144[local25 + 2];
								local2641 = Static154.method3136(local2282);
								Static58.method1101(local2641, local772, local767);
								continue;
							}
							if (local218 == 3109) {
								local25 -= 2;
								local767 = Static55.anIntArray144[local25];
								local772 = Static55.anIntArray144[local25 + 1];
								local2670 = local973 ? Static142.aClass1_42 : Static87.aClass1_26;
								Static58.method1101(local2670, local772, local767);
								continue;
							}
							if (local218 == 3110) {
								local25--;
								local767 = Static55.anIntArray144[local25];
								Static90.aClass4_Sub11_Sub1_1.method1285(152);
								Static90.aClass4_Sub11_Sub1_1.method1268(local767);
								continue;
							}
						} else if (local218 < 3300) {
							if (local218 == 3200) {
								local25 -= 3;
								Static91.method1804(Static55.anIntArray144[local25], Static55.anIntArray144[local25 + 1], Static55.anIntArray144[local25 + 2]);
								continue;
							}
							if (local218 == 3201) {
								local25--;
								Static72.method1499(Static55.anIntArray144[local25]);
								continue;
							}
							if (local218 == 3202) {
								local25 -= 2;
								Static17.method305(Static55.anIntArray144[local25 + 1], Static55.anIntArray144[local25]);
								continue;
							}
						} else if (local218 < 3400) {
							if (local218 == 3300) {
								Static55.anIntArray144[local25++] = Static142.anInt3325;
								continue;
							}
							if (local218 == 3301) {
								local25 -= 2;
								local767 = Static55.anIntArray144[local25];
								local772 = Static55.anIntArray144[local25 + 1];
								Static55.anIntArray144[local25++] = Static122.method2206(local772, local767);
								continue;
							}
							if (local218 == 3302) {
								local25 -= 2;
								local767 = Static55.anIntArray144[local25];
								local772 = Static55.anIntArray144[local25 + 1];
								Static55.anIntArray144[local25++] = Static72.method1495(local767, local772);
								continue;
							}
							if (local218 == 3303) {
								local25 -= 2;
								local767 = Static55.anIntArray144[local25];
								local772 = Static55.anIntArray144[local25 + 1];
								Static55.anIntArray144[local25++] = Static109.method2034(local772, local767);
								continue;
							}
							if (local218 == 3304) {
								local25--;
								local767 = Static55.anIntArray144[local25];
								Static55.anIntArray144[local25++] = Static7.method105(local767).anInt2536;
								continue;
							}
							if (local218 == 3305) {
								local25--;
								local767 = Static55.anIntArray144[local25];
								Static55.anIntArray144[local25++] = Static13.anIntArray39[local767];
								continue;
							}
							if (local218 == 3306) {
								local25--;
								local767 = Static55.anIntArray144[local25];
								Static55.anIntArray144[local25++] = Static91.anIntArray224[local767];
								continue;
							}
							if (local218 == 3307) {
								local25--;
								local767 = Static55.anIntArray144[local25];
								Static55.anIntArray144[local25++] = Static121.anIntArray274[local767];
								continue;
							}
							if (local218 == 3308) {
								local767 = Static73.anInt1873;
								local772 = Static103.anInt2610 + (Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anInt2832 >> 7);
								local2282 = Static184.anInt4144 + (Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anInt2803 >> 7);
								Static55.anIntArray144[local25++] = (local772 << 14) + ((local767 << 28) + local2282);
								continue;
							}
							if (local218 == 3309) {
								local25--;
								local767 = Static55.anIntArray144[local25];
								Static55.anIntArray144[local25++] = local767 >> 14 & 0x3FFF;
								continue;
							}
							if (local218 == 3310) {
								local25--;
								local767 = Static55.anIntArray144[local25];
								Static55.anIntArray144[local25++] = local767 >> 28;
								continue;
							}
							if (local218 == 3311) {
								local25--;
								local767 = Static55.anIntArray144[local25];
								Static55.anIntArray144[local25++] = local767 & 0x3FFF;
								continue;
							}
							if (local218 == 3312) {
								Static55.anIntArray144[local25++] = Static94.aBoolean106 ? 1 : 0;
								continue;
							}
							if (local218 == 3313) {
								local25 -= 2;
								local767 = Static55.anIntArray144[local25] + 32768;
								local772 = Static55.anIntArray144[local25 + 1];
								Static55.anIntArray144[local25++] = Static122.method2206(local772, local767);
								continue;
							}
							if (local218 == 3314) {
								local25 -= 2;
								local767 = Static55.anIntArray144[local25] + 32768;
								local772 = Static55.anIntArray144[local25 + 1];
								Static55.anIntArray144[local25++] = Static72.method1495(local767, local772);
								continue;
							}
							if (local218 == 3315) {
								local25 -= 2;
								local767 = Static55.anIntArray144[local25] + 32768;
								local772 = Static55.anIntArray144[local25 + 1];
								Static55.anIntArray144[local25++] = Static109.method2034(local772, local767);
								continue;
							}
							if (local218 == 3316) {
								if (Static79.anInt1991 >= 2) {
									Static55.anIntArray144[local25++] = Static79.anInt1991;
								} else {
									Static55.anIntArray144[local25++] = 0;
								}
								continue;
							}
							if (local218 == 3317) {
								Static55.anIntArray144[local25++] = Static27.anInt743;
								continue;
							}
							if (local218 == 3318) {
								Static55.anIntArray144[local25++] = Static69.anInt1855;
								continue;
							}
							if (local218 == 3321) {
								Static55.anIntArray144[local25++] = Static153.anInt3513;
								continue;
							}
							if (local218 == 3322) {
								Static55.anIntArray144[local25++] = Static45.anInt1129;
								continue;
							}
							if (local218 == 3323) {
								if (Static147.anInt729 >= 5 && Static147.anInt729 <= 9) {
									Static55.anIntArray144[local25++] = 1;
									continue;
								}
								Static55.anIntArray144[local25++] = 0;
								continue;
							}
							if (local218 == 3324) {
								if (Static147.anInt729 >= 5 && Static147.anInt729 <= 9) {
									Static55.anIntArray144[local25++] = Static147.anInt729;
									continue;
								}
								Static55.anIntArray144[local25++] = 0;
								continue;
							}
							if (local218 == 3325) {
								if (Static21.anInt574 <= 0) {
									Static55.anIntArray144[local25++] = 0;
								} else {
									Static55.anIntArray144[local25++] = 1;
								}
								continue;
							}
							if (local218 == 3326) {
								Static55.anIntArray144[local25++] = Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anInt2107;
								continue;
							}
							if (local218 == 3327) {
								Static55.anIntArray144[local25++] = Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.aClass43_1.aBoolean88 ? 1 : 0;
								continue;
							}
						} else if (local218 < 3500) {
							if (local218 == 3400) {
								local25 -= 2;
								local767 = Static55.anIntArray144[local25];
								local772 = Static55.anIntArray144[local25 + 1];
								@Pc(2732) Class4_Sub1_Sub17 local2732 = Static119.method2145(local767);
								Static53.aClass46Array12[local36++] = local2732.method2487(local772);
								continue;
							}
							if (local218 == 3408) {
								local25 -= 4;
								local767 = Static55.anIntArray144[local25];
								local772 = Static55.anIntArray144[local25 + 1];
								local2282 = Static55.anIntArray144[local25 + 2];
								local619 = Static55.anIntArray144[local25 + 3];
								@Pc(2774) Class4_Sub1_Sub17 local2774 = Static119.method2145(local2282);
								if (local2774.anInt3368 == local767 && local772 == local2774.anInt3366) {
									if (local772 == 115) {
										Static53.aClass46Array12[local36++] = local2774.method2487(local619);
									} else {
										Static55.anIntArray144[local25++] = local2774.method2483(local619);
									}
									continue;
								}
								if (local772 == 115) {
									Static53.aClass46Array12[local36++] = Static126.aClass46_1096;
								} else {
									Static55.anIntArray144[local25++] = 0;
								}
								continue;
							}
						} else if (local218 < 3700) {
							if (local218 == 3600) {
								if (Static83.anInt2136 == 0) {
									Static55.anIntArray144[local25++] = -2;
								} else if (Static83.anInt2136 == 1) {
									Static55.anIntArray144[local25++] = -1;
								} else {
									Static55.anIntArray144[local25++] = Static148.anInt3385;
								}
								continue;
							}
							if (local218 == 3601) {
								local25--;
								local767 = Static55.anIntArray144[local25];
								if (Static83.anInt2136 == 2 && Static148.anInt3385 > local767) {
									Static53.aClass46Array12[local36++] = Static23.aClass46Array4[local767];
									continue;
								}
								Static53.aClass46Array12[local36++] = Static110.aClass46_995;
								continue;
							}
							if (local218 == 3602) {
								local25--;
								local767 = Static55.anIntArray144[local25];
								if (Static83.anInt2136 == 2 && local767 < Static148.anInt3385) {
									Static55.anIntArray144[local25++] = Static132.anIntArray294[local767];
									continue;
								}
								Static55.anIntArray144[local25++] = 0;
								continue;
							}
							if (local218 == 3603) {
								local25--;
								local767 = Static55.anIntArray144[local25];
								if (Static83.anInt2136 == 2 && Static148.anInt3385 > local767) {
									Static55.anIntArray144[local25++] = Static104.anIntArray243[local767];
									continue;
								}
								Static55.anIntArray144[local25++] = 0;
								continue;
							}
							if (local218 == 3604) {
								local25--;
								local772 = Static55.anIntArray144[local25];
								local36--;
								local577 = Static53.aClass46Array12[local36];
								Static126.method2227(local772, local577);
								continue;
							}
							if (local218 == 3605) {
								local36--;
								local577 = Static53.aClass46Array12[local36];
								Static49.method950(local577.method1646());
								continue;
							}
							if (local218 == 3606) {
								local36--;
								local577 = Static53.aClass46Array12[local36];
								Static148.method2492(local577.method1646());
								continue;
							}
							if (local218 == 3607) {
								local36--;
								local577 = Static53.aClass46Array12[local36];
								Static179.method3067(local577.method1646());
								continue;
							}
							if (local218 == 3608) {
								local36--;
								local577 = Static53.aClass46Array12[local36];
								Static90.method1799(local577.method1646());
								continue;
							}
							if (local218 == 3609) {
								local36--;
								local577 = Static53.aClass46Array12[local36];
								if (local577.method1673(Static107.aClass46_970) || local577.method1673(Static35.aClass46_313)) {
									local577 = local577.method1650(7);
								}
								Static55.anIntArray144[local25++] = Static68.method1475(local577) ? 1 : 0;
								continue;
							}
							if (local218 == 3610) {
								local25--;
								local767 = Static55.anIntArray144[local25];
								if (Static83.anInt2136 == 2 && Static148.anInt3385 > local767) {
									Static53.aClass46Array12[local36++] = Static31.aClass46Array6[local767];
									continue;
								}
								Static53.aClass46Array12[local36++] = Static110.aClass46_995;
								continue;
							}
							if (local218 == 3611) {
								if (Static31.aClass46_263 == null) {
									Static53.aClass46Array12[local36++] = Static110.aClass46_995;
								} else {
									Static53.aClass46Array12[local36++] = Static31.aClass46_263.method1654();
								}
								continue;
							}
							if (local218 == 3612) {
								if (Static31.aClass46_263 == null) {
									Static55.anIntArray144[local25++] = 0;
								} else {
									Static55.anIntArray144[local25++] = Static8.anInt305;
								}
								continue;
							}
							if (local218 == 3613) {
								local25--;
								local767 = Static55.anIntArray144[local25];
								if (Static31.aClass46_263 != null && local767 < Static8.anInt305) {
									Static53.aClass46Array12[local36++] = Static61.aClass4_Sub6Array1[local767].aClass46_311.method1654();
									continue;
								}
								Static53.aClass46Array12[local36++] = Static110.aClass46_995;
								continue;
							}
							if (local218 == 3614) {
								local25--;
								local767 = Static55.anIntArray144[local25];
								if (Static31.aClass46_263 != null && local767 < Static8.anInt305) {
									Static55.anIntArray144[local25++] = Static61.aClass4_Sub6Array1[local767].anInt922;
									continue;
								}
								Static55.anIntArray144[local25++] = 0;
								continue;
							}
							if (local218 == 3615) {
								local25--;
								local767 = Static55.anIntArray144[local25];
								if (Static31.aClass46_263 != null && local767 < Static8.anInt305) {
									Static55.anIntArray144[local25++] = Static61.aClass4_Sub6Array1[local767].aByte3;
									continue;
								}
								Static55.anIntArray144[local25++] = 0;
								continue;
							}
							if (local218 == 3616) {
								Static55.anIntArray144[local25++] = Static6.aByte1;
								continue;
							}
							if (local218 == 3617) {
								local36--;
								local577 = Static53.aClass46Array12[local36];
								Static61.method1281(local577);
								continue;
							}
							if (local218 == 3618) {
								Static55.anIntArray144[local25++] = Static24.aByte2;
								continue;
							}
							if (local218 == 3619) {
								local36--;
								local577 = Static53.aClass46Array12[local36];
								Static186.method3140(local577.method1646());
								continue;
							}
							if (local218 == 3620) {
								Static4.method2115();
								continue;
							}
							if (local218 == 3621) {
								if (Static83.anInt2136 == 0) {
									Static55.anIntArray144[local25++] = -1;
								} else {
									Static55.anIntArray144[local25++] = Static57.anInt1403;
								}
								continue;
							}
							if (local218 == 3622) {
								local25--;
								local767 = Static55.anIntArray144[local25];
								if (Static83.anInt2136 != 0 && local767 < Static57.anInt1403) {
									Static53.aClass46Array12[local36++] = Static116.method2124(Static129.aLongArray33[local767]).method1654();
									continue;
								}
								Static53.aClass46Array12[local36++] = Static110.aClass46_995;
								continue;
							}
							if (local218 == 3623) {
								local36--;
								local577 = Static53.aClass46Array12[local36];
								if (local577.method1673(Static107.aClass46_970) || local577.method1673(Static35.aClass46_313)) {
									local577 = local577.method1650(7);
								}
								Static55.anIntArray144[local25++] = Static40.method699(local577) ? 1 : 0;
								continue;
							}
							if (local218 == 3624) {
								local25--;
								local767 = Static55.anIntArray144[local25];
								if (Static61.aClass4_Sub6Array1 != null && local767 < Static8.anInt305 && Static61.aClass4_Sub6Array1[local767].aClass46_311.method1683(Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.aClass46_796)) {
									Static55.anIntArray144[local25++] = 1;
									continue;
								}
								Static55.anIntArray144[local25++] = 0;
								continue;
							}
							if (local218 == 3625) {
								if (Static101.aClass46_932 == null) {
									Static53.aClass46Array12[local36++] = Static110.aClass46_995;
								} else {
									Static53.aClass46Array12[local36++] = Static101.aClass46_932.method1654();
								}
								continue;
							}
							if (local218 == 3626) {
								local25--;
								local767 = Static55.anIntArray144[local25];
								if (Static31.aClass46_263 != null && Static8.anInt305 > local767) {
									Static53.aClass46Array12[local36++] = Static61.aClass4_Sub6Array1[local767].aClass46_305;
									continue;
								}
								Static53.aClass46Array12[local36++] = Static110.aClass46_995;
								continue;
							}
						} else if (local218 < 4000) {
							if (local218 == 3903) {
								local25--;
								local767 = Static55.anIntArray144[local25];
								Static55.anIntArray144[local25++] = Static61.aClass68Array1[local767].method2241();
								continue;
							}
							if (local218 == 3904) {
								local25--;
								local767 = Static55.anIntArray144[local25];
								Static55.anIntArray144[local25++] = Static61.aClass68Array1[local767].anInt3017;
								continue;
							}
							if (local218 == 3905) {
								local25--;
								local767 = Static55.anIntArray144[local25];
								Static55.anIntArray144[local25++] = Static61.aClass68Array1[local767].anInt3023;
								continue;
							}
							if (local218 == 3906) {
								local25--;
								local767 = Static55.anIntArray144[local25];
								Static55.anIntArray144[local25++] = Static61.aClass68Array1[local767].anInt3018;
								continue;
							}
							if (local218 == 3907) {
								local25--;
								local767 = Static55.anIntArray144[local25];
								Static55.anIntArray144[local25++] = Static61.aClass68Array1[local767].anInt3016;
								continue;
							}
							if (local218 == 3908) {
								local25--;
								local767 = Static55.anIntArray144[local25];
								Static55.anIntArray144[local25++] = Static61.aClass68Array1[local767].anInt3022;
								continue;
							}
							if (local218 == 3910) {
								local25--;
								local767 = Static55.anIntArray144[local25];
								local772 = Static61.aClass68Array1[local767].method2237();
								Static55.anIntArray144[local25++] = local772 == 0 ? 1 : 0;
								continue;
							}
							if (local218 == 3911) {
								local25--;
								local767 = Static55.anIntArray144[local25];
								local772 = Static61.aClass68Array1[local767].method2237();
								Static55.anIntArray144[local25++] = local772 == 2 ? 1 : 0;
								continue;
							}
							if (local218 == 3912) {
								local25--;
								local767 = Static55.anIntArray144[local25];
								local772 = Static61.aClass68Array1[local767].method2237();
								Static55.anIntArray144[local25++] = local772 == 5 ? 1 : 0;
								continue;
							}
							if (local218 == 3913) {
								local25--;
								local767 = Static55.anIntArray144[local25];
								local772 = Static61.aClass68Array1[local767].method2237();
								Static55.anIntArray144[local25++] = local772 == 1 ? 1 : 0;
								continue;
							}
						} else if (local218 < 4100) {
							if (local218 == 4000) {
								local25 -= 2;
								local767 = Static55.anIntArray144[local25];
								local772 = Static55.anIntArray144[local25 + 1];
								Static55.anIntArray144[local25++] = local772 + local767;
								continue;
							}
							if (local218 == 4001) {
								local25 -= 2;
								local767 = Static55.anIntArray144[local25];
								local772 = Static55.anIntArray144[local25 + 1];
								Static55.anIntArray144[local25++] = local767 - local772;
								continue;
							}
							if (local218 == 4002) {
								local25 -= 2;
								local767 = Static55.anIntArray144[local25];
								local772 = Static55.anIntArray144[local25 + 1];
								Static55.anIntArray144[local25++] = local767 * local772;
								continue;
							}
							if (local218 == 4003) {
								local25 -= 2;
								local772 = Static55.anIntArray144[local25 + 1];
								local767 = Static55.anIntArray144[local25];
								Static55.anIntArray144[local25++] = local767 / local772;
								continue;
							}
							if (local218 == 4004) {
								local25--;
								local767 = Static55.anIntArray144[local25];
								Static55.anIntArray144[local25++] = (int) (Math.random() * (double) local767);
								continue;
							}
							if (local218 == 4005) {
								local25--;
								local767 = Static55.anIntArray144[local25];
								Static55.anIntArray144[local25++] = (int) (Math.random() * (double) (local767 + 1));
								continue;
							}
							if (local218 == 4006) {
								local25 -= 5;
								local772 = Static55.anIntArray144[local25 + 1];
								local767 = Static55.anIntArray144[local25];
								local2282 = Static55.anIntArray144[local25 + 2];
								local619 = Static55.anIntArray144[local25 + 3];
								local640 = Static55.anIntArray144[local25 + 4];
								Static55.anIntArray144[local25++] = local767 + (local640 - local2282) * (local772 - local767) / (local619 - local2282);
								continue;
							}
							if (local218 == 4007) {
								local25 -= 2;
								local767 = Static55.anIntArray144[local25];
								local772 = Static55.anIntArray144[local25 + 1];
								Static55.anIntArray144[local25++] = local772 * local767 / 100 + local767;
								continue;
							}
							if (local218 == 4008) {
								local25 -= 2;
								local772 = Static55.anIntArray144[local25 + 1];
								local767 = Static55.anIntArray144[local25];
								Static55.anIntArray144[local25++] = 0x1 << local772 | local767;
								continue;
							}
							if (local218 == 4009) {
								local25 -= 2;
								local767 = Static55.anIntArray144[local25];
								local772 = Static55.anIntArray144[local25 + 1];
								Static55.anIntArray144[local25++] = local767 & -(0x1 << local772) - 1;
								continue;
							}
							if (local218 == 4010) {
								local25 -= 2;
								local772 = Static55.anIntArray144[local25 + 1];
								local767 = Static55.anIntArray144[local25];
								Static55.anIntArray144[local25++] = (local767 & 0x1 << local772) == 0 ? 0 : 1;
								continue;
							}
							if (local218 == 4011) {
								local25 -= 2;
								local772 = Static55.anIntArray144[local25 + 1];
								local767 = Static55.anIntArray144[local25];
								Static55.anIntArray144[local25++] = local767 % local772;
								continue;
							}
							if (local218 == 4012) {
								local25 -= 2;
								local767 = Static55.anIntArray144[local25];
								local772 = Static55.anIntArray144[local25 + 1];
								if (local767 == 0) {
									Static55.anIntArray144[local25++] = 0;
								} else {
									Static55.anIntArray144[local25++] = (int) Math.pow((double) local767, (double) local772);
								}
								continue;
							}
							if (local218 == 4013) {
								local25 -= 2;
								local772 = Static55.anIntArray144[local25 + 1];
								local767 = Static55.anIntArray144[local25];
								if (local767 == 0) {
									Static55.anIntArray144[local25++] = 0;
								} else if (local772 == 0) {
									Static55.anIntArray144[local25++] = Integer.MAX_VALUE;
								} else {
									Static55.anIntArray144[local25++] = (int) Math.pow((double) local767, 1.0D / (double) local772);
								}
								continue;
							}
							if (local218 == 4014) {
								local25 -= 2;
								local772 = Static55.anIntArray144[local25 + 1];
								local767 = Static55.anIntArray144[local25];
								Static55.anIntArray144[local25++] = local767 & local772;
								continue;
							}
							if (local218 == 4015) {
								local25 -= 2;
								local767 = Static55.anIntArray144[local25];
								local772 = Static55.anIntArray144[local25 + 1];
								Static55.anIntArray144[local25++] = local767 | local772;
								continue;
							}
							if (local218 == 4016) {
								local25 -= 2;
								local767 = Static55.anIntArray144[local25];
								local772 = Static55.anIntArray144[local25 + 1];
								Static55.anIntArray144[local25++] = local772 <= local767 ? local772 : local767;
								continue;
							}
							if (local218 == 4017) {
								local25 -= 2;
								local772 = Static55.anIntArray144[local25 + 1];
								local767 = Static55.anIntArray144[local25];
								Static55.anIntArray144[local25++] = local772 < local767 ? local767 : local772;
								continue;
							}
							if (local218 == 4018) {
								local25 -= 3;
								@Pc(4309) long local4309 = (long) Static55.anIntArray144[local25 + 1];
								@Pc(4314) long local4314 = (long) Static55.anIntArray144[local25];
								@Pc(4321) long local4321 = (long) Static55.anIntArray144[local25 + 2];
								Static55.anIntArray144[local25++] = (int) (local4321 * local4314 / local4309);
								continue;
							}
						} else if (local218 < 4200) {
							if (local218 == 4100) {
								local36--;
								local577 = Static53.aClass46Array12[local36];
								local25--;
								local772 = Static55.anIntArray144[local25];
								Static53.aClass46Array12[local36++] = Static69.method1482(new Class46[] { local577, Static127.method2240(local772) });
								continue;
							}
							if (local218 == 4101) {
								local36 -= 2;
								local1454 = Static53.aClass46Array12[local36 + 1];
								local577 = Static53.aClass46Array12[local36];
								Static53.aClass46Array12[local36++] = Static69.method1482(new Class46[] { local577, local1454 });
								continue;
							}
							if (local218 == 4102) {
								local36--;
								local577 = Static53.aClass46Array12[local36];
								local25--;
								local772 = Static55.anIntArray144[local25];
								Static53.aClass46Array12[local36++] = Static69.method1482(new Class46[] { local577, Static99.method1901(local772) });
								continue;
							}
							if (local218 == 4103) {
								local36--;
								local577 = Static53.aClass46Array12[local36];
								Static53.aClass46Array12[local36++] = local577.method1669();
								continue;
							}
							if (local218 == 4104) {
								local25--;
								local767 = Static55.anIntArray144[local25];
								@Pc(4479) long local4479 = ((long) local767 + 11745L) * 86400000L;
								Static66.aCalendar1.setTime(new Date(local4479));
								local619 = Static66.aCalendar1.get(5);
								local640 = Static66.aCalendar1.get(2);
								local1807 = Static66.aCalendar1.get(1);
								Static53.aClass46Array12[local36++] = Static69.method1482(new Class46[] { Static127.method2240(local619), Static167.aClass46_1362, Static44.aClass46Array7[local640], Static167.aClass46_1362, Static127.method2240(local1807) });
								continue;
							}
							if (local218 == 4105) {
								local36 -= 2;
								local577 = Static53.aClass46Array12[local36];
								local1454 = Static53.aClass46Array12[local36 + 1];
								if (Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.aClass43_1 != null && Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.aClass43_1.aBoolean88) {
									Static53.aClass46Array12[local36++] = local1454;
									continue;
								}
								Static53.aClass46Array12[local36++] = local577;
								continue;
							}
							if (local218 == 4106) {
								local25--;
								local767 = Static55.anIntArray144[local25];
								Static53.aClass46Array12[local36++] = Static127.method2240(local767);
								continue;
							}
							if (local218 == 4107) {
								local36 -= 2;
								Static55.anIntArray144[local25++] = Static53.aClass46Array12[local36].method1653(Static53.aClass46Array12[local36 + 1]);
								continue;
							}
							@Pc(4636) byte[] local4636;
							@Pc(4641) Class4_Sub1_Sub7_Sub1_Sub1 local4641;
							if (local218 == 4108) {
								local25 -= 2;
								local36--;
								local577 = Static53.aClass46Array12[local36];
								local772 = Static55.anIntArray144[local25];
								local2282 = Static55.anIntArray144[local25 + 1];
								local4636 = Static175.aClass62_Sub1_94.method2878(local2282, 0);
								local4641 = new Class4_Sub1_Sub7_Sub1_Sub1(local4636);
								local4641.method910(Static102.aClass4_Sub1_Sub7_Sub3Array11, null);
								Static55.anIntArray144[local25++] = local4641.method900(local577, local772);
								continue;
							}
							if (local218 == 4109) {
								local25 -= 2;
								local36--;
								local577 = Static53.aClass46Array12[local36];
								local772 = Static55.anIntArray144[local25];
								local2282 = Static55.anIntArray144[local25 + 1];
								local4636 = Static175.aClass62_Sub1_94.method2878(local2282, 0);
								local4641 = new Class4_Sub1_Sub7_Sub1_Sub1(local4636);
								local4641.method910(Static102.aClass4_Sub1_Sub7_Sub3Array11, null);
								Static55.anIntArray144[local25++] = local4641.method905(local577, local772);
								continue;
							}
							if (local218 == 4110) {
								local36 -= 2;
								local577 = Static53.aClass46Array12[local36];
								local1454 = Static53.aClass46Array12[local36 + 1];
								local25--;
								if (Static55.anIntArray144[local25] == 1) {
									Static53.aClass46Array12[local36++] = local577;
								} else {
									Static53.aClass46Array12[local36++] = local1454;
								}
								continue;
							}
							if (local218 == 4111) {
								local36--;
								local577 = Static53.aClass46Array12[local36];
								Static53.aClass46Array12[local36++] = Static138.method891(local577);
								continue;
							}
							if (local218 == 4112) {
								local36--;
								local577 = Static53.aClass46Array12[local36];
								local25--;
								local772 = Static55.anIntArray144[local25];
								Static53.aClass46Array12[local36++] = local577.method1655(local772);
								continue;
							}
							if (local218 == 4113) {
								local25--;
								local767 = Static55.anIntArray144[local25];
								Static55.anIntArray144[local25++] = Static83.method1674(local767) ? 1 : 0;
								continue;
							}
							if (local218 == 4114) {
								local25--;
								local767 = Static55.anIntArray144[local25];
								Static55.anIntArray144[local25++] = Static15.method279(local767) ? 1 : 0;
								continue;
							}
							if (local218 == 4115) {
								local25--;
								local767 = Static55.anIntArray144[local25];
								Static55.anIntArray144[local25++] = Static178.method3066(local767) ? 1 : 0;
								continue;
							}
							if (local218 == 4116) {
								local25--;
								local767 = Static55.anIntArray144[local25];
								Static55.anIntArray144[local25++] = Static31.method526(local767) ? 1 : 0;
								continue;
							}
							if (local218 == 4117) {
								local36--;
								local577 = Static53.aClass46Array12[local36];
								if (local577 == null) {
									Static55.anIntArray144[local25++] = 0;
								} else {
									Static55.anIntArray144[local25++] = local577.method1677();
								}
								continue;
							}
							if (local218 == 4118) {
								local25 -= 2;
								local36--;
								local577 = Static53.aClass46Array12[local36];
								local772 = Static55.anIntArray144[local25];
								local2282 = Static55.anIntArray144[local25 + 1];
								Static53.aClass46Array12[local36++] = local577.method1666(local2282, local772);
								continue;
							}
							if (local218 == 4119) {
								local36--;
								local577 = Static53.aClass46Array12[local36];
								@Pc(4938) boolean local4938 = false;
								local1454 = Static166.method2761(local577.method1677());
								for (local619 = 0; local577.method1677() > local619; local619++) {
									local640 = local577.method1672(local619);
									if (local640 == 60) {
										local4938 = true;
									} else if (local640 == 62) {
										local4938 = false;
									} else if (!local4938) {
										local1454.method1643(local640);
									}
								}
								local1454.method1641();
								Static53.aClass46Array12[local36++] = local1454;
								continue;
							}
							if (local218 == 4120) {
								local25 -= 2;
								local2282 = Static55.anIntArray144[local25 + 1];
								local772 = Static55.anIntArray144[local25];
								local36--;
								local577 = Static53.aClass46Array12[local36];
								Static55.anIntArray144[local25++] = local577.method1667(local2282, local772);
								continue;
							}
							if (local218 == 4121) {
								local36 -= 2;
								local577 = Static53.aClass46Array12[local36];
								local1454 = Static53.aClass46Array12[local36 + 1];
								local25--;
								local2282 = Static55.anIntArray144[local25];
								Static55.anIntArray144[local25++] = local577.method1679(local2282, local1454);
								continue;
							}
						} else if (local218 < 4300) {
							if (local218 == 4200) {
								local25--;
								local767 = Static55.anIntArray144[local25];
								Static53.aClass46Array12[local36++] = Static83.method1663(local767).aClass46_895;
								continue;
							}
							@Pc(6139) Class4_Sub1_Sub12 local6139;
							if (local218 == 4201) {
								local25 -= 2;
								local772 = Static55.anIntArray144[local25 + 1];
								local767 = Static55.anIntArray144[local25];
								local6139 = Static83.method1663(local767);
								if (local772 >= 1 && local772 <= 5 && local6139.aClass46Array18[local772 - 1] != null) {
									Static53.aClass46Array12[local36++] = local6139.aClass46Array18[local772 - 1];
									continue;
								}
								Static53.aClass46Array12[local36++] = Static110.aClass46_995;
								continue;
							}
							if (local218 == 4202) {
								local25 -= 2;
								local767 = Static55.anIntArray144[local25];
								local772 = Static55.anIntArray144[local25 + 1];
								local6139 = Static83.method1663(local767);
								if (local772 >= 1 && local772 <= 5 && local6139.aClass46Array19[local772 - 1] != null) {
									Static53.aClass46Array12[local36++] = local6139.aClass46Array19[local772 - 1];
									continue;
								}
								Static53.aClass46Array12[local36++] = Static110.aClass46_995;
								continue;
							}
							if (local218 == 4203) {
								local25--;
								local767 = Static55.anIntArray144[local25];
								Static55.anIntArray144[local25++] = Static83.method1663(local767).anInt2484;
								continue;
							}
							if (local218 == 4204) {
								local25--;
								local767 = Static55.anIntArray144[local25];
								Static55.anIntArray144[local25++] = Static83.method1663(local767).anInt2481 == 1 ? 1 : 0;
								continue;
							}
							@Pc(6280) Class4_Sub1_Sub12 local6280;
							if (local218 == 4205) {
								local25--;
								local767 = Static55.anIntArray144[local25];
								local6280 = Static83.method1663(local767);
								if (local6280.anInt2478 == -1 && local6280.anInt2479 >= 0) {
									Static55.anIntArray144[local25++] = local6280.anInt2479;
									continue;
								}
								Static55.anIntArray144[local25++] = local767;
								continue;
							}
							if (local218 == 4206) {
								local25--;
								local767 = Static55.anIntArray144[local25];
								local6280 = Static83.method1663(local767);
								if (local6280.anInt2478 >= 0 && local6280.anInt2479 >= 0) {
									Static55.anIntArray144[local25++] = local6280.anInt2479;
									continue;
								}
								Static55.anIntArray144[local25++] = local767;
								continue;
							}
							if (local218 == 4207) {
								local25--;
								local767 = Static55.anIntArray144[local25];
								Static55.anIntArray144[local25++] = Static83.method1663(local767).aBoolean109 ? 1 : 0;
								continue;
							}
							if (local218 == 4210) {
								local36--;
								local577 = Static53.aClass46Array12[local36];
								local25--;
								local772 = Static55.anIntArray144[local25];
								Static181.method3119(local577, local772 == 1);
								Static55.anIntArray144[local25++] = Static61.anInt1637;
								continue;
							}
							if (local218 == 4211) {
								if (Static28.aShortArray6 != null && Static61.anInt1637 > Static19.anInt543) {
									Static55.anIntArray144[local25++] = Static28.aShortArray6[Static19.anInt543++] & 0xFFFF;
									continue;
								}
								Static55.anIntArray144[local25++] = -1;
								continue;
							}
							if (local218 == 4212) {
								Static19.anInt543 = 0;
								continue;
							}
						} else if (local218 < 5100) {
							if (local218 == 5000) {
								Static55.anIntArray144[local25++] = Static58.anInt1415;
								continue;
							}
							if (local218 == 5001) {
								local25 -= 3;
								Static58.anInt1415 = Static55.anIntArray144[local25];
								Static127.anInt3027 = Static55.anIntArray144[local25 + 1];
								Static54.anInt1361 = Static55.anIntArray144[local25 + 2];
								Static90.aClass4_Sub11_Sub1_1.method1285(246);
								Static90.aClass4_Sub11_Sub1_1.method1238(Static58.anInt1415);
								Static90.aClass4_Sub11_Sub1_1.method1238(Static127.anInt3027);
								Static90.aClass4_Sub11_Sub1_1.method1238(Static54.anInt1361);
								continue;
							}
							if (local218 == 5002) {
								local25 -= 2;
								local2282 = Static55.anIntArray144[local25 + 1];
								local36--;
								local577 = Static53.aClass46Array12[local36];
								local772 = Static55.anIntArray144[local25];
								Static90.aClass4_Sub11_Sub1_1.method1285(226);
								Static90.aClass4_Sub11_Sub1_1.method1269(local577.method1646());
								Static90.aClass4_Sub11_Sub1_1.method1238(local772 - 1);
								Static90.aClass4_Sub11_Sub1_1.method1238(local2282);
								continue;
							}
							if (local218 == 5003) {
								local25--;
								local767 = Static55.anIntArray144[local25];
								local1454 = null;
								if (local767 < 100) {
									local1454 = Static185.aClass46Array25[local767];
								}
								if (local1454 == null) {
									local1454 = Static110.aClass46_995;
								}
								Static53.aClass46Array12[local36++] = local1454;
								continue;
							}
							if (local218 == 5004) {
								local772 = -1;
								local25--;
								local767 = Static55.anIntArray144[local25];
								if (local767 < 100 && Static185.aClass46Array25[local767] != null) {
									local772 = Static160.anIntArray347[local767];
								}
								Static55.anIntArray144[local25++] = local772;
								continue;
							}
							if (local218 == 5005) {
								Static55.anIntArray144[local25++] = Static127.anInt3027;
								continue;
							}
							if (local218 == 5008) {
								local36--;
								local577 = Static53.aClass46Array12[local36];
								if (local577.method1673(Static62.aClass46_637)) {
									Static174.method3006(local577);
								} else {
									local1454 = local577.method1669();
									@Pc(5350) byte local5350 = 0;
									@Pc(5352) byte local5352 = 0;
									if (local1454.method1673(Static13.aClass46_150)) {
										local577 = local577.method1650(Static13.aClass46_150.method1677());
										local5350 = 0;
									} else if (local1454.method1673(Static94.aClass46_878)) {
										local5350 = 1;
										local577 = local577.method1650(Static94.aClass46_878.method1677());
									} else if (local1454.method1673(Static63.aClass46_592)) {
										local577 = local577.method1650(Static63.aClass46_592.method1677());
										local5350 = 2;
									} else if (local1454.method1673(Static2.aClass46_22)) {
										local5350 = 3;
										local577 = local577.method1650(Static2.aClass46_22.method1677());
									} else if (local1454.method1673(Static160.aClass46_1323)) {
										local5350 = 4;
										local577 = local577.method1650(Static160.aClass46_1323.method1677());
									} else if (local1454.method1673(Static2.aClass46_19)) {
										local5350 = 5;
										local577 = local577.method1650(Static2.aClass46_19.method1677());
									} else if (local1454.method1673(Static35.aClass46_312)) {
										local577 = local577.method1650(Static35.aClass46_312.method1677());
										local5350 = 6;
									} else if (local1454.method1673(Static169.aClass46_1382)) {
										local5350 = 7;
										local577 = local577.method1650(Static169.aClass46_1382.method1677());
									} else if (local1454.method1673(Static24.aClass46_195)) {
										local5350 = 8;
										local577 = local577.method1650(Static24.aClass46_195.method1677());
									} else if (local1454.method1673(Static173.aClass46_1416)) {
										local5350 = 9;
										local577 = local577.method1650(Static173.aClass46_1416.method1677());
									} else if (local1454.method1673(Static177.aClass46_1454)) {
										local5350 = 10;
										local577 = local577.method1650(Static177.aClass46_1454.method1677());
									} else if (local1454.method1673(Static86.aClass46_811)) {
										local577 = local577.method1650(Static86.aClass46_811.method1677());
										local5350 = 11;
									} else if (Static64.anInt1688 != 0) {
										if (local1454.method1673(Static13.aClass46_149)) {
											local577 = local577.method1650(Static13.aClass46_149.method1677());
											local5350 = 0;
										} else if (local1454.method1673(Static94.aClass46_876)) {
											local5350 = 1;
											local577 = local577.method1650(Static94.aClass46_876.method1677());
										} else if (local1454.method1673(Static63.aClass46_588)) {
											local5350 = 2;
											local577 = local577.method1650(Static63.aClass46_588.method1677());
										} else if (local1454.method1673(Static2.aClass46_28)) {
											local577 = local577.method1650(Static2.aClass46_28.method1677());
											local5350 = 3;
										} else if (local1454.method1673(Static160.aClass46_1325)) {
											local577 = local577.method1650(Static160.aClass46_1325.method1677());
											local5350 = 4;
										} else if (local1454.method1673(Static2.aClass46_12)) {
											local5350 = 5;
											local577 = local577.method1650(Static2.aClass46_12.method1677());
										} else if (local1454.method1673(Static35.aClass46_309)) {
											local5350 = 6;
											local577 = local577.method1650(Static35.aClass46_309.method1677());
										} else if (local1454.method1673(Static169.aClass46_1381)) {
											local577 = local577.method1650(Static169.aClass46_1381.method1677());
											local5350 = 7;
										} else if (local1454.method1673(Static24.aClass46_199)) {
											local5350 = 8;
											local577 = local577.method1650(Static24.aClass46_199.method1677());
										} else if (local1454.method1673(Static173.aClass46_1414)) {
											local577 = local577.method1650(Static173.aClass46_1414.method1677());
											local5350 = 9;
										} else if (local1454.method1673(Static177.aClass46_1452)) {
											local577 = local577.method1650(Static177.aClass46_1452.method1677());
											local5350 = 10;
										} else if (local1454.method1673(Static86.aClass46_813)) {
											local5350 = 11;
											local577 = local577.method1650(Static86.aClass46_813.method1677());
										}
									}
									local1454 = local577.method1669();
									if (local1454.method1673(Static134.aClass46_1164)) {
										local5352 = 1;
										local577 = local577.method1650(Static134.aClass46_1164.method1677());
									} else if (local1454.method1673(Static128.aClass46_1120)) {
										local5352 = 2;
										local577 = local577.method1650(Static128.aClass46_1120.method1677());
									} else if (local1454.method1673(Static187.aClass46_1513)) {
										local5352 = 3;
										local577 = local577.method1650(Static187.aClass46_1513.method1677());
									} else if (local1454.method1673(Static66.aClass46_688)) {
										local577 = local577.method1650(Static66.aClass46_688.method1677());
										local5352 = 4;
									} else if (local1454.method1673(Static102.aClass46_933)) {
										local5352 = 5;
										local577 = local577.method1650(Static102.aClass46_933.method1677());
									} else if (Static64.anInt1688 != 0) {
										if (local1454.method1673(Static134.aClass46_1163)) {
											local5352 = 1;
											local577 = local577.method1650(Static134.aClass46_1163.method1677());
										} else if (local1454.method1673(Static128.aClass46_1115)) {
											local5352 = 2;
											local577 = local577.method1650(Static128.aClass46_1115.method1677());
										} else if (local1454.method1673(Static187.aClass46_1508)) {
											local577 = local577.method1650(Static187.aClass46_1508.method1677());
											local5352 = 3;
										} else if (local1454.method1673(Static66.aClass46_687)) {
											local577 = local577.method1650(Static66.aClass46_687.method1677());
											local5352 = 4;
										} else if (local1454.method1673(Static102.aClass46_938)) {
											local577 = local577.method1650(Static102.aClass46_938.method1677());
											local5352 = 5;
										}
									}
									Static90.aClass4_Sub11_Sub1_1.method1285(173);
									Static90.aClass4_Sub11_Sub1_1.method1238(0);
									local640 = Static90.aClass4_Sub11_Sub1_1.anInt1597;
									Static90.aClass4_Sub11_Sub1_1.method1238(local5350);
									Static90.aClass4_Sub11_Sub1_1.method1238(local5352);
									Static147.method464(Static90.aClass4_Sub11_Sub1_1, local577);
									Static90.aClass4_Sub11_Sub1_1.method1231(Static90.aClass4_Sub11_Sub1_1.anInt1597 - local640);
								}
								continue;
							}
							if (local218 == 5009) {
								local36 -= 2;
								local1454 = Static53.aClass46Array12[local36 + 1];
								local577 = Static53.aClass46Array12[local36];
								Static90.aClass4_Sub11_Sub1_1.method1285(25);
								Static90.aClass4_Sub11_Sub1_1.method1238(0);
								local2282 = Static90.aClass4_Sub11_Sub1_1.anInt1597;
								Static90.aClass4_Sub11_Sub1_1.method1269(local577.method1646());
								Static147.method464(Static90.aClass4_Sub11_Sub1_1, local1454);
								Static90.aClass4_Sub11_Sub1_1.method1231(Static90.aClass4_Sub11_Sub1_1.anInt1597 - local2282);
								continue;
							}
							if (local218 == 5010) {
								local25--;
								local767 = Static55.anIntArray144[local25];
								local1454 = null;
								if (local767 < 100) {
									local1454 = Static86.aClass46Array16[local767];
								}
								if (local1454 == null) {
									local1454 = Static110.aClass46_995;
								}
								Static53.aClass46Array12[local36++] = local1454;
								continue;
							}
							if (local218 == 5011) {
								local25--;
								local767 = Static55.anIntArray144[local25];
								local1454 = null;
								if (local767 < 100) {
									local1454 = Static119.aClass46Array21[local767];
								}
								if (local1454 == null) {
									local1454 = Static110.aClass46_995;
								}
								Static53.aClass46Array12[local36++] = local1454;
								continue;
							}
							if (local218 == 5015) {
								if (Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1 == null || Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.aClass46_796 == null) {
									local577 = Static3.aClass46_38;
								} else {
									local577 = Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.aClass46_796;
								}
								Static53.aClass46Array12[local36++] = local577;
								continue;
							}
							if (local218 == 5016) {
								Static55.anIntArray144[local25++] = Static54.anInt1361;
								continue;
							}
							if (local218 == 5017) {
								Static55.anIntArray144[local25++] = Static111.anInt2728;
								continue;
							}
						} else if (local218 < 5200) {
							if (local218 == 5100) {
								if (Static14.aBooleanArray2[86]) {
									Static55.anIntArray144[local25++] = 1;
								} else {
									Static55.anIntArray144[local25++] = 0;
								}
								continue;
							}
							if (local218 == 5101) {
								if (Static14.aBooleanArray2[82]) {
									Static55.anIntArray144[local25++] = 1;
								} else {
									Static55.anIntArray144[local25++] = 0;
								}
								continue;
							}
							if (local218 == 5102) {
								if (Static14.aBooleanArray2[81]) {
									Static55.anIntArray144[local25++] = 1;
								} else {
									Static55.anIntArray144[local25++] = 0;
								}
								continue;
							}
						}
					}
				}
				throw new IllegalStateException();
			}
		} catch (@Pc(8094) Exception local8094) {
			if (local18.aClass46_984 == null) {
				if (Static89.anInt2298 != 0) {
					Static105.method1982(Static110.aClass46_995, 0, Static95.aClass46_1107);
				}
				Static146.method2485("CS2 - scr:" + local18.aLong148 + " op:" + local41, local8094);
			} else {
				@Pc(8103) Class46 local8103 = Static166.method2761(30);
				local8103.method1642(Static37.aClass46_333).method1642(local18.aClass46_984);
				for (local58 = Static156.anInt3527 - 1; local58 >= 0; local58--) {
					local8103.method1642(Static100.aClass46_912).method1642(Static69.aClass26Array1[local58].aClass4_Sub1_Sub14_1.aClass46_984);
				}
				if (local41 == 40) {
					local96 = local44[local34];
					local8103.method1642(Static84.aClass46_1506).method1642(Static127.method2240(local96));
				}
				if (Static89.anInt2298 != 0) {
					Static105.method1982(Static110.aClass46_995, 0, Static69.method1482(new Class46[] { Static82.aClass46_795, local18.aClass46_984 }));
				}
				Static146.method2485("CS2 - scr:" + local18.aLong148 + " op:" + local41 + new String(local8103.method1660()), local8094);
			}
		}
	}

	@OriginalMember(owner = "client!ph", name = "g", descriptor = "(I)V")
	public static void method2371() {
		Static163.aClass66_47.method2218();
		Static36.aClass66_20.method2218();
		Static58.aClass66_26.method2218();
	}
}
