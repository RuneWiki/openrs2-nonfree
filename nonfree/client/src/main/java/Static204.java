import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "Lclient!wd;")
	public static Class97 aClass97_16;

	@OriginalMember(owner = "client!wc", name = "h", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!wc", name = "l", descriptor = "Lclient!uf;")
	public static Class1_Sub2_Sub5_Sub5 aClass1_Sub2_Sub5_Sub5_9;

	@OriginalMember(owner = "client!wc", name = "m", descriptor = "Lclient!sd;")
	public static Class60 aClass60_39;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_2558 = Static118.method2249("flash1:");

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2559 = Static118.method2249("Anmelde)2Limit -Uberschritten)3");

	@OriginalMember(owner = "client!wc", name = "f", descriptor = "Lclient!oc;")
	public static Class65 aClass65_2560 = aClass65_2558;

	@OriginalMember(owner = "client!wc", name = "g", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_2561 = aClass65_2558;

	@OriginalMember(owner = "client!wc", name = "j", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2562 = Static118.method2249("und die Schaltfl-=che (WSpielkonto erstellen(W am");

	@OriginalMember(owner = "client!wc", name = "k", descriptor = "[Z")
	public static final boolean[] aBooleanArray19 = new boolean[112];

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V")
	public static void method3258() {
		Static144.method2779(Static33.anInt972, Static176.anInt3920, Static28.anInt856);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IILclient!vf;)V")
	public static void method3260(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub26 arg1) {
		@Pc(2) Object[] local2 = arg1.anObjectArray3;
		@Pc(12) int local12 = (Integer) local2[0];
		@Pc(16) Class1_Sub2_Sub3 local16 = Static18.method346(local12);
		if (local16 == null) {
			return;
		}
		Static47.anInt1241 = 0;
		@Pc(23) int local23 = 0;
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = -1;
		@Pc(30) int[] local30 = local16.anIntArray43;
		@Pc(32) byte local32 = -1;
		@Pc(35) int[] local35 = local16.anIntArray45;
		@Pc(57) int local57;
		try {
			Static148.anIntArray400 = new int[local16.anInt435];
			Static153.aClass65Array48 = new Class65[local16.anInt436];
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = 0;
			@Pc(69) int local69;
			for (local57 = 1; local57 < local2.length; local57++) {
				if (local2[local57] instanceof Integer) {
					local69 = (Integer) local2[local57];
					if (local69 == -2147483647) {
						local69 = arg1.anInt4256;
					}
					if (local69 == -2147483646) {
						local69 = arg1.anInt4254;
					}
					if (local69 == -2147483645) {
						local69 = arg1.aClass97_14 == null ? -1 : arg1.aClass97_14.anInt4376;
					}
					if (local69 == -2147483644) {
						local69 = arg1.anInt4253;
					}
					if (local69 == -2147483643) {
						local69 = arg1.aClass97_14 == null ? -1 : arg1.aClass97_14.anInt4330;
					}
					if (local69 == -2147483642) {
						local69 = arg1.aClass97_15 == null ? -1 : arg1.aClass97_15.anInt4376;
					}
					if (local69 == -2147483641) {
						local69 = arg1.aClass97_15 == null ? -1 : arg1.aClass97_15.anInt4330;
					}
					if (local69 == -2147483640) {
						local69 = arg1.anInt4252;
					}
					if (local69 == -2147483639) {
						local69 = arg1.anInt4255;
					}
					Static148.anIntArray400[local47++] = local69;
				} else if (local2[local57] instanceof Class65) {
					@Pc(177) Class65 local177 = (Class65) local2[local57];
					if (local177.method2470(Static33.aClass65_641)) {
						local177 = arg1.aClass65_2538;
					}
					Static153.aClass65Array48[local45++] = local177;
				}
			}
			local69 = 0;
			label2417: while (true) {
				local69++;
				if (arg0 < local69) {
					throw new RuntimeException("slow");
				}
				local27++;
				@Pc(215) int local215 = local30[local27];
				@Pc(608) int local608;
				@Pc(765) int local765;
				@Pc(760) int local760;
				@Pc(633) int local633;
				@Pc(569) Class65 local569;
				if (local215 < 100) {
					if (local215 == 0) {
						Static16.anIntArray44[local23++] = local35[local27];
						continue;
					}
					@Pc(239) int local239;
					if (local215 == 1) {
						local239 = local35[local27];
						Static16.anIntArray44[local23++] = Static135.anIntArray379[local239];
						continue;
					}
					if (local215 == 2) {
						local239 = local35[local27];
						local23--;
						Static135.anIntArray379[local239] = Static16.anIntArray44[local23];
						continue;
					}
					if (local215 == 3) {
						Static195.aClass65Array59[local25++] = local16.aClass65Array7[local27];
						continue;
					}
					if (local215 == 6) {
						local27 += local35[local27];
						continue;
					}
					if (local215 == 7) {
						local23 -= 2;
						if (Static16.anIntArray44[local23 + 1] != Static16.anIntArray44[local23]) {
							local27 += local35[local27];
						}
						continue;
					}
					if (local215 == 8) {
						local23 -= 2;
						if (Static16.anIntArray44[local23] == Static16.anIntArray44[local23 + 1]) {
							local27 += local35[local27];
						}
						continue;
					}
					if (local215 == 9) {
						local23 -= 2;
						if (Static16.anIntArray44[local23] < Static16.anIntArray44[local23 + 1]) {
							local27 += local35[local27];
						}
						continue;
					}
					if (local215 == 10) {
						local23 -= 2;
						if (Static16.anIntArray44[local23 + 1] < Static16.anIntArray44[local23]) {
							local27 += local35[local27];
						}
						continue;
					}
					if (local215 == 21) {
						if (Static47.anInt1241 == 0) {
							return;
						}
						@Pc(397) Class94 local397 = Static90.aClass94Array105[--Static47.anInt1241];
						local16 = local397.aClass1_Sub2_Sub3_1;
						local27 = local397.anInt4289;
						local35 = local16.anIntArray45;
						local30 = local16.anIntArray43;
						Static148.anIntArray400 = local397.anIntArray499;
						Static153.aClass65Array48 = local397.aClass65Array64;
						continue;
					}
					if (local215 == 25) {
						local239 = local35[local27];
						Static16.anIntArray44[local23++] = Static160.method2103(local239);
						continue;
					}
					if (local215 == 27) {
						local239 = local35[local27];
						local23--;
						Static147.method2646(local239, Static16.anIntArray44[local23]);
						continue;
					}
					if (local215 == 31) {
						local23 -= 2;
						if (Static16.anIntArray44[local23] <= Static16.anIntArray44[local23 + 1]) {
							local27 += local35[local27];
						}
						continue;
					}
					if (local215 == 32) {
						local23 -= 2;
						if (Static16.anIntArray44[local23 + 1] <= Static16.anIntArray44[local23]) {
							local27 += local35[local27];
						}
						continue;
					}
					if (local215 == 33) {
						Static16.anIntArray44[local23++] = Static148.anIntArray400[local35[local27]];
						continue;
					}
					@Pc(516) int local516;
					if (local215 == 34) {
						local516 = local35[local27];
						local23--;
						Static148.anIntArray400[local516] = Static16.anIntArray44[local23];
						continue;
					}
					if (local215 == 35) {
						Static195.aClass65Array59[local25++] = Static153.aClass65Array48[local35[local27]];
						continue;
					}
					if (local215 == 36) {
						local516 = local35[local27];
						local25--;
						Static153.aClass65Array48[local516] = Static195.aClass65Array59[local25];
						continue;
					}
					if (local215 == 37) {
						local239 = local35[local27];
						local25 -= local239;
						local569 = Static123.method2356(Static195.aClass65Array59, local25, local239);
						Static195.aClass65Array59[local25++] = local569;
						continue;
					}
					if (local215 == 38) {
						local23--;
						continue;
					}
					if (local215 == 39) {
						local25--;
						continue;
					}
					if (local215 == 40) {
						local239 = local35[local27];
						@Pc(598) Class1_Sub2_Sub3 local598 = Static18.method346(local239);
						@Pc(602) int[] local602 = new int[local598.anInt435];
						@Pc(606) Class65[] local606 = new Class65[local598.anInt436];
						for (local608 = 0; local608 < local598.anInt441; local608++) {
							local602[local608] = Static16.anIntArray44[local23 + local608 - local598.anInt441];
						}
						for (local633 = 0; local633 < local598.anInt443; local633++) {
							local606[local633] = Static195.aClass65Array59[local25 + local633 - local598.anInt443];
						}
						local23 -= local598.anInt441;
						local25 -= local598.anInt443;
						@Pc(670) Class94 local670 = new Class94();
						local670.anInt4289 = local27;
						local670.aClass1_Sub2_Sub3_1 = local16;
						local670.anIntArray499 = Static148.anIntArray400;
						local670.aClass65Array64 = Static153.aClass65Array48;
						if (Static90.aClass94Array105.length <= Static47.anInt1241) {
							throw new RuntimeException();
						}
						local16 = local598;
						local27 = -1;
						Static90.aClass94Array105[Static47.anInt1241++] = local670;
						local30 = local598.anIntArray43;
						Static153.aClass65Array48 = local606;
						Static148.anIntArray400 = local602;
						local35 = local598.anIntArray45;
						continue;
					}
					if (local215 == 42) {
						Static16.anIntArray44[local23++] = Static89.anIntArray244[local35[local27]];
						continue;
					}
					if (local215 == 43) {
						local516 = local35[local27];
						local23--;
						Static89.anIntArray244[local516] = Static16.anIntArray44[local23];
						continue;
					}
					if (local215 == 44) {
						local239 = local35[local27] >> 16;
						local760 = local35[local27] & 0xFFFF;
						local23--;
						local765 = Static16.anIntArray44[local23];
						if (local765 >= 0 && local765 <= 5000) {
							Static139.anIntArray387[local239] = local765;
							@Pc(783) byte local783 = -1;
							if (local760 == 105) {
								local783 = 0;
							}
							local608 = 0;
							while (true) {
								if (local765 <= local608) {
									continue label2417;
								}
								Static202.anIntArrayArray21[local239][local608] = local783;
								local608++;
							}
						}
						throw new RuntimeException();
					}
					if (local215 == 45) {
						local239 = local35[local27];
						local23--;
						local760 = Static16.anIntArray44[local23];
						if (local760 >= 0 && Static139.anIntArray387[local239] > local760) {
							Static16.anIntArray44[local23++] = Static202.anIntArrayArray21[local239][local760];
							continue;
						}
						throw new RuntimeException();
					}
					if (local215 == 46) {
						local23 -= 2;
						local239 = local35[local27];
						local760 = Static16.anIntArray44[local23];
						if (local760 >= 0 && Static139.anIntArray387[local239] > local760) {
							Static202.anIntArrayArray21[local239][local760] = Static16.anIntArray44[local23 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (local215 == 47) {
						@Pc(899) Class65 local899 = Static84.aClass65Array28[local35[local27]];
						if (local899 == null) {
							local899 = Static51.aClass65_846;
						}
						Static195.aClass65Array59[local25++] = local899;
						continue;
					}
					if (local215 == 48) {
						local516 = local35[local27];
						local25--;
						Static84.aClass65Array28[local516] = Static195.aClass65Array59[local25];
						continue;
					}
					if (local215 == 51) {
						@Pc(934) Class99 local934 = local16.aClass99Array1[local35[local27]];
						local23--;
						@Pc(944) Class1_Sub21 local944 = (Class1_Sub21) local934.method3292((long) Static16.anIntArray44[local23]);
						if (local944 != null) {
							local27 += local944.anInt3504;
						}
						continue;
					}
				}
				@Pc(959) boolean local959;
				if (local35[local27] == 1) {
					local959 = true;
				} else {
					local959 = false;
				}
				@Pc(1104) Class97 local1104;
				@Pc(989) int local989;
				@Pc(1020) int local1020;
				@Pc(999) Class97 local999;
				@Pc(1176) Class97 local1176;
				if (local215 < 300) {
					if (local215 == 100) {
						local23 -= 3;
						local765 = Static16.anIntArray44[local23 + 1];
						local760 = Static16.anIntArray44[local23];
						local989 = Static16.anIntArray44[local23 + 2];
						if (local765 == 0) {
							throw new RuntimeException();
						}
						local999 = Static154.method2691(local760);
						if (local999.aClass97Array2 == null) {
							local999.aClass97Array2 = new Class97[local989 + 1];
						}
						if (local999.aClass97Array2.length <= local989) {
							@Pc(1018) Class97[] local1018 = new Class97[local989 + 1];
							for (local1020 = 0; local1020 < local999.aClass97Array2.length; local1020++) {
								local1018[local1020] = local999.aClass97Array2[local1020];
							}
							local999.aClass97Array2 = local1018;
						}
						if (local989 > 0 && local999.aClass97Array2[local989 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local989 - 1));
						}
						@Pc(1063) Class97 local1063 = new Class97();
						local1063.aBoolean181 = true;
						local1063.anInt4330 = local989;
						local1063.anInt4329 = local765;
						local1063.anInt4319 = local1063.anInt4376 = local999.anInt4376;
						local999.aClass97Array2[local989] = local1063;
						if (local959) {
							Static84.aClass97_9 = local1063;
						} else {
							Static16.aClass97_2 = local1063;
						}
						Static25.method448(local999);
						continue;
					}
					@Pc(1126) Class97 local1126;
					if (local215 == 101) {
						local1104 = local959 ? Static84.aClass97_9 : Static16.aClass97_2;
						if (local1104.anInt4330 == -1) {
							if (!local959) {
								throw new RuntimeException("Tried to cc_delete static active-component!");
							}
							throw new RuntimeException("Tried to .cc_delete static .active-component!");
						}
						local1126 = Static154.method2691(local1104.anInt4376);
						local1126.aClass97Array2[local1104.anInt4330] = null;
						Static25.method448(local1126);
						continue;
					}
					if (local215 == 102) {
						local23--;
						local1104 = Static154.method2691(Static16.anIntArray44[local23]);
						local1104.aClass97Array2 = null;
						Static25.method448(local1104);
						continue;
					}
					if (local215 == 200) {
						local23 -= 2;
						local760 = Static16.anIntArray44[local23];
						local765 = Static16.anIntArray44[local23 + 1];
						local1176 = Static173.method2926(local760, local765);
						if (local1176 != null && local765 != -1) {
							Static16.anIntArray44[local23++] = 1;
							if (local959) {
								Static84.aClass97_9 = local1176;
							} else {
								Static16.aClass97_2 = local1176;
							}
							continue;
						}
						Static16.anIntArray44[local23++] = 0;
						continue;
					}
					if (local215 == 201) {
						local23--;
						local760 = Static16.anIntArray44[local23];
						local1126 = Static154.method2691(local760);
						if (local1126 == null) {
							Static16.anIntArray44[local23++] = 0;
						} else {
							Static16.anIntArray44[local23++] = 1;
							if (local959) {
								Static84.aClass97_9 = local1126;
							} else {
								Static16.aClass97_2 = local1126;
							}
						}
						continue;
					}
				} else if (local215 < 500) {
					if (local215 == 403) {
						local23 -= 2;
						local760 = Static16.anIntArray44[local23];
						if (local760 >= 7) {
							local760 -= 7;
						}
						local765 = Static16.anIntArray44[local23 + 1];
						Static201.aClass6_Sub4_Sub1_3.aClass19_1.method702(local760, local765);
						continue;
					}
					if (local215 == 404) {
						local23 -= 2;
						local765 = Static16.anIntArray44[local23 + 1];
						local760 = Static16.anIntArray44[local23];
						Static201.aClass6_Sub4_Sub1_3.aClass19_1.method701(local760, local765);
						continue;
					}
					if (local215 == 410) {
						local23--;
						@Pc(8581) boolean local8581 = Static16.anIntArray44[local23] != 0;
						Static201.aClass6_Sub4_Sub1_3.aClass19_1.method704(local8581);
						continue;
					}
				} else if ((local215 < 1000 || local215 >= 1100) && (local215 < 2000 || local215 >= 2100)) {
					@Pc(3993) Class65 local3993;
					if (local215 >= 1100 && local215 < 1200 || local215 >= 2100 && local215 < 2200) {
						if (local215 < 2000) {
							local1104 = local959 ? Static84.aClass97_9 : Static16.aClass97_2;
						} else {
							local215 -= 1000;
							local23--;
							local1104 = Static154.method2691(Static16.anIntArray44[local23]);
						}
						if (local215 == 1100) {
							local23 -= 2;
							local1104.anInt4310 = Static16.anIntArray44[local23];
							if (local1104.anInt4368 - local1104.anInt4353 < local1104.anInt4310) {
								local1104.anInt4310 = local1104.anInt4368 - local1104.anInt4353;
							}
							if (local1104.anInt4310 < 0) {
								local1104.anInt4310 = 0;
							}
							local1104.anInt4342 = Static16.anIntArray44[local23 + 1];
							if (local1104.anInt4341 - local1104.anInt4354 < local1104.anInt4342) {
								local1104.anInt4342 = local1104.anInt4341 - local1104.anInt4354;
							}
							if (local1104.anInt4342 < 0) {
								local1104.anInt4342 = 0;
							}
							Static25.method448(local1104);
							continue;
						}
						if (local215 == 1101) {
							local23--;
							local1104.anInt4367 = Static16.anIntArray44[local23];
							Static25.method448(local1104);
							continue;
						}
						if (local215 == 1102) {
							local23--;
							local1104.aBoolean172 = Static16.anIntArray44[local23] == 1;
							Static25.method448(local1104);
							continue;
						}
						if (local215 == 1103) {
							local23--;
							local1104.anInt4382 = Static16.anIntArray44[local23];
							Static25.method448(local1104);
							continue;
						}
						if (local215 == 1104) {
							local23--;
							local1104.anInt4333 = Static16.anIntArray44[local23];
							Static25.method448(local1104);
							continue;
						}
						if (local215 == 1105) {
							local23--;
							local1104.anInt4347 = Static16.anIntArray44[local23];
							Static25.method448(local1104);
							continue;
						}
						if (local215 == 1106) {
							local23--;
							local1104.anInt4374 = Static16.anIntArray44[local23];
							Static25.method448(local1104);
							continue;
						}
						if (local215 == 1107) {
							local23--;
							local1104.aBoolean182 = Static16.anIntArray44[local23] == 1;
							Static25.method448(local1104);
							continue;
						}
						if (local215 == 1108) {
							local1104.anInt4315 = 1;
							local23--;
							local1104.anInt4325 = Static16.anIntArray44[local23];
							Static25.method448(local1104);
							continue;
						}
						if (local215 == 1109) {
							local23 -= 6;
							local1104.anInt4352 = Static16.anIntArray44[local23];
							local1104.anInt4307 = Static16.anIntArray44[local23 + 1];
							local1104.anInt4370 = Static16.anIntArray44[local23 + 2];
							local1104.anInt4380 = Static16.anIntArray44[local23 + 3];
							local1104.anInt4359 = Static16.anIntArray44[local23 + 4];
							local1104.anInt4369 = Static16.anIntArray44[local23 + 5];
							Static25.method448(local1104);
							continue;
						}
						if (local215 == 1110) {
							local23--;
							local765 = Static16.anIntArray44[local23];
							if (local765 != local1104.anInt4381) {
								local1104.anInt4328 = 0;
								local1104.anInt4381 = local765;
								local1104.anInt4316 = 0;
								Static25.method448(local1104);
							}
							continue;
						}
						if (local215 == 1111) {
							local23--;
							local1104.aBoolean170 = Static16.anIntArray44[local23] == 1;
							Static25.method448(local1104);
							continue;
						}
						if (local215 == 1112) {
							local25--;
							local3993 = Static195.aClass65Array59[local25];
							if (!local3993.method2470(local1104.aClass65_2566)) {
								local1104.aClass65_2566 = local3993;
								Static25.method448(local1104);
							}
							continue;
						}
						if (local215 == 1113) {
							local23--;
							local1104.anInt4327 = Static16.anIntArray44[local23];
							Static25.method448(local1104);
							continue;
						}
						if (local215 == 1114) {
							local23 -= 3;
							local1104.anInt4379 = Static16.anIntArray44[local23];
							local1104.anInt4312 = Static16.anIntArray44[local23 + 1];
							local1104.anInt4365 = Static16.anIntArray44[local23 + 2];
							Static25.method448(local1104);
							continue;
						}
						if (local215 == 1115) {
							local23--;
							local1104.aBoolean171 = Static16.anIntArray44[local23] == 1;
							Static25.method448(local1104);
							continue;
						}
						if (local215 == 1116) {
							local23--;
							local1104.anInt4360 = Static16.anIntArray44[local23];
							Static25.method448(local1104);
							continue;
						}
						if (local215 == 1117) {
							local23--;
							local1104.anInt4375 = Static16.anIntArray44[local23];
							Static25.method448(local1104);
							continue;
						}
						if (local215 == 1118) {
							local23--;
							local1104.aBoolean179 = Static16.anIntArray44[local23] == 1;
							Static25.method448(local1104);
							continue;
						}
						if (local215 == 1119) {
							local23--;
							local1104.aBoolean176 = Static16.anIntArray44[local23] == 1;
							Static25.method448(local1104);
							continue;
						}
						if (local215 == 1120) {
							local23 -= 2;
							local1104.anInt4368 = Static16.anIntArray44[local23];
							local1104.anInt4341 = Static16.anIntArray44[local23 + 1];
							Static25.method448(local1104);
							if (local1104.anInt4329 == 0) {
								Static94.method1781(local1104);
							}
							continue;
						}
					} else if (local215 >= 1200 && local215 < 1300 || local215 >= 2200 && local215 < 2300) {
						if (local215 >= 2000) {
							local215 -= 1000;
							local23--;
							local1104 = Static154.method2691(Static16.anIntArray44[local23]);
						} else {
							local1104 = local959 ? Static84.aClass97_9 : Static16.aClass97_2;
						}
						Static25.method448(local1104);
						if (local215 == 1200 || local215 == 1205) {
							local23 -= 2;
							local989 = Static16.anIntArray44[local23 + 1];
							local765 = Static16.anIntArray44[local23];
							if (local765 == -1) {
								local1104.anInt4325 = -1;
								local1104.anInt4315 = 1;
								local1104.anInt4306 = -1;
							} else {
								local1104.anInt4306 = local765;
								local1104.anInt4336 = local989;
								@Pc(1352) Class1_Sub2_Sub2 local1352 = Static40.method700(local765);
								local1104.anInt4307 = local1352.anInt312;
								if (local215 == 1205) {
									local1104.aBoolean174 = false;
								} else {
									local1104.aBoolean174 = true;
								}
								local1104.anInt4380 = local1352.anInt313;
								local1104.anInt4369 = local1352.anInt311;
								if (local1104.anInt4356 > 0) {
									local1104.anInt4369 = local1104.anInt4369 * 32 / local1104.anInt4356;
								} else if (local1104.anInt4371 > 0) {
									local1104.anInt4369 = local1104.anInt4369 * 32 / local1104.anInt4371;
								}
								local1104.anInt4370 = local1352.anInt323;
								local1104.anInt4352 = local1352.anInt296;
								local1104.anInt4359 = local1352.anInt289;
							}
							continue;
						}
						if (local215 == 1201) {
							local1104.anInt4315 = 2;
							local23--;
							local1104.anInt4325 = Static16.anIntArray44[local23];
							continue;
						}
						if (local215 == 1202) {
							local1104.anInt4315 = 3;
							local1104.anInt4325 = Static201.aClass6_Sub4_Sub1_3.aClass19_1.method695();
							continue;
						}
						if (local215 == 1203) {
							local1104.anInt4315 = 6;
							local23--;
							local1104.anInt4325 = Static16.anIntArray44[local23];
							continue;
						}
						if (local215 == 1204) {
							local1104.anInt4315 = 5;
							local23--;
							local1104.anInt4325 = Static16.anIntArray44[local23];
							continue;
						}
					} else if (local215 >= 1300 && local215 < 1400 || local215 >= 2300 && local215 < 2400) {
						if (local215 < 2000) {
							local1104 = local959 ? Static84.aClass97_9 : Static16.aClass97_2;
						} else {
							local215 -= 1000;
							local23--;
							local1104 = Static154.method2691(Static16.anIntArray44[local23]);
						}
						if (local215 == 1300) {
							local23--;
							local765 = Static16.anIntArray44[local23] - 1;
							if (local765 >= 0 && local765 <= 9) {
								local25--;
								local1104.method3263(local765, Static195.aClass65Array59[local25]);
								continue;
							}
							local25--;
							continue;
						}
						if (local215 == 1301) {
							local23 -= 2;
							local765 = Static16.anIntArray44[local23];
							local989 = Static16.anIntArray44[local23 + 1];
							local1104.aClass97_17 = Static173.method2926(local765, local989);
							continue;
						}
						if (local215 == 1302) {
							local23--;
							local1104.aBoolean183 = Static16.anIntArray44[local23] == 1;
							continue;
						}
						if (local215 == 1303) {
							local23--;
							local1104.anInt4324 = Static16.anIntArray44[local23];
							continue;
						}
						if (local215 == 1304) {
							local23--;
							local1104.anInt4320 = Static16.anIntArray44[local23];
							continue;
						}
						if (local215 == 1305) {
							local25--;
							local1104.aClass65_2565 = Static195.aClass65Array59[local25];
							continue;
						}
						if (local215 == 1306) {
							local25--;
							local1104.aClass65_2563 = Static195.aClass65Array59[local25];
							continue;
						}
						if (local215 == 1307) {
							local1104.aClass65Array66 = null;
							continue;
						}
					} else {
						if (local215 >= 1400 && local215 < 1500 || local215 >= 2400 && local215 < 2500) {
							if (local215 >= 2000) {
								local23--;
								local1104 = Static154.method2691(Static16.anIntArray44[local23]);
								local215 -= 1000;
							} else {
								local1104 = local959 ? Static84.aClass97_9 : Static16.aClass97_2;
							}
							local25--;
							local3993 = Static195.aClass65Array59[local25];
							@Pc(7444) int[] local7444 = null;
							if (local3993.method2482() > 0 && local3993.method2473(local3993.method2482() - 1) == 89) {
								local23--;
								local608 = Static16.anIntArray44[local23];
								if (local608 > 0) {
									local7444 = new int[local608];
									while (local608-- > 0) {
										local23--;
										local7444[local608] = Static16.anIntArray44[local23];
									}
								}
								local3993 = local3993.method2481(local3993.method2482() - 1, 0);
							}
							@Pc(7501) Object[] local7501 = new Object[local3993.method2482() + 1];
							for (local633 = local7501.length - 1; local633 >= 1; local633--) {
								if (local3993.method2473(local633 - 1) == 115) {
									local25--;
									local7501[local633] = Static195.aClass65Array59[local25];
								} else {
									local23--;
									local7501[local633] = Integer.valueOf(Static16.anIntArray44[local23]);
								}
							}
							local23--;
							local1020 = Static16.anIntArray44[local23];
							if (local1020 == -1) {
								local7501 = null;
							} else {
								local7501[0] = Integer.valueOf(local1020);
							}
							if (local215 == 1415) {
								local1104.anIntArray506 = local7444;
								local1104.anObjectArray5 = local7501;
							}
							if (local215 == 1421) {
								local1104.anObjectArray18 = local7501;
							}
							if (local215 == 1420) {
								local1104.anObjectArray17 = local7501;
							}
							if (local215 == 1403) {
								local1104.anObjectArray6 = local7501;
							}
							if (local215 == 1414) {
								local1104.anIntArray513 = local7444;
								local1104.anObjectArray13 = local7501;
							}
							if (local215 == 1412) {
								local1104.anObjectArray12 = local7501;
							}
							if (local215 == 1419) {
								local1104.anObjectArray7 = local7501;
							}
							if (local215 == 1423) {
								local1104.anObjectArray29 = local7501;
							}
							if (local215 == 1411) {
								local1104.anObjectArray26 = local7501;
							}
							if (local215 == 1424) {
								local1104.anObjectArray8 = local7501;
							}
							local1104.aBoolean177 = true;
							if (local215 == 1416) {
								local1104.anObjectArray14 = local7501;
							}
							if (local215 == 1425) {
								local1104.anObjectArray4 = local7501;
							}
							if (local215 == 1422) {
								local1104.anObjectArray28 = local7501;
							}
							if (local215 == 1408) {
								local1104.anObjectArray19 = local7501;
							}
							if (local215 == 1409) {
								local1104.anObjectArray22 = local7501;
							}
							if (local215 == 1418) {
								local1104.anObjectArray25 = local7501;
							}
							if (local215 == 1406) {
								local1104.anObjectArray9 = local7501;
							}
							if (local215 == 1404) {
								local1104.anObjectArray24 = local7501;
							}
							if (local215 == 1400) {
								local1104.anObjectArray20 = local7501;
							}
							if (local215 == 1407) {
								local1104.anIntArray510 = local7444;
								local1104.anObjectArray16 = local7501;
							}
							if (local215 == 1410) {
								local1104.anObjectArray21 = local7501;
							}
							if (local215 == 1405) {
								local1104.anObjectArray23 = local7501;
							}
							if (local215 == 1417) {
								local1104.anObjectArray11 = local7501;
							}
							if (local215 == 1402) {
								local1104.anObjectArray10 = local7501;
							}
							if (local215 == 1401) {
								local1104.anObjectArray27 = local7501;
							}
							continue;
						}
						if (local215 < 1600) {
							local1104 = local959 ? Static84.aClass97_9 : Static16.aClass97_2;
							if (local215 == 1500) {
								Static16.anIntArray44[local23++] = local1104.anInt4339;
								continue;
							}
							if (local215 == 1501) {
								Static16.anIntArray44[local23++] = local1104.anInt4318;
								continue;
							}
							if (local215 == 1502) {
								Static16.anIntArray44[local23++] = local1104.anInt4353;
								continue;
							}
							if (local215 == 1503) {
								Static16.anIntArray44[local23++] = local1104.anInt4354;
								continue;
							}
							if (local215 == 1504) {
								Static16.anIntArray44[local23++] = local1104.aBoolean180 ? 1 : 0;
								continue;
							}
							if (local215 == 1505) {
								Static16.anIntArray44[local23++] = local1104.anInt4319;
								continue;
							}
						} else if (local215 < 1700) {
							local1104 = local959 ? Static84.aClass97_9 : Static16.aClass97_2;
							if (local215 == 1600) {
								Static16.anIntArray44[local23++] = local1104.anInt4310;
								continue;
							}
							if (local215 == 1601) {
								Static16.anIntArray44[local23++] = local1104.anInt4342;
								continue;
							}
							if (local215 == 1602) {
								Static195.aClass65Array59[local25++] = local1104.aClass65_2566;
								continue;
							}
							if (local215 == 1603) {
								Static16.anIntArray44[local23++] = local1104.anInt4368;
								continue;
							}
							if (local215 == 1604) {
								Static16.anIntArray44[local23++] = local1104.anInt4341;
								continue;
							}
							if (local215 == 1605) {
								Static16.anIntArray44[local23++] = local1104.anInt4369;
								continue;
							}
							if (local215 == 1606) {
								Static16.anIntArray44[local23++] = local1104.anInt4370;
								continue;
							}
							if (local215 == 1607) {
								Static16.anIntArray44[local23++] = local1104.anInt4359;
								continue;
							}
							if (local215 == 1608) {
								Static16.anIntArray44[local23++] = local1104.anInt4380;
								continue;
							}
							if (local215 == 1609) {
								Static16.anIntArray44[local23++] = local1104.anInt4382;
								continue;
							}
						} else if (local215 < 1800) {
							local1104 = local959 ? Static84.aClass97_9 : Static16.aClass97_2;
							if (local215 == 1700) {
								Static16.anIntArray44[local23++] = local1104.anInt4306;
								continue;
							}
							if (local215 == 1701) {
								if (local1104.anInt4306 == -1) {
									Static16.anIntArray44[local23++] = 0;
								} else {
									Static16.anIntArray44[local23++] = local1104.anInt4336;
								}
								continue;
							}
							if (local215 == 1702) {
								Static16.anIntArray44[local23++] = local1104.anInt4330;
								continue;
							}
						} else if (local215 < 1900) {
							local1104 = local959 ? Static84.aClass97_9 : Static16.aClass97_2;
							if (local215 == 1800) {
								Static16.anIntArray44[local23++] = Static106.method1970(Static153.method2677(local1104));
								continue;
							}
							if (local215 == 1801) {
								local23--;
								local765 = Static16.anIntArray44[local23];
								local765--;
								if (local1104.aClass65Array66 != null && local1104.aClass65Array66.length > local765 && local1104.aClass65Array66[local765] != null) {
									Static195.aClass65Array59[local25++] = local1104.aClass65Array66[local765];
									continue;
								}
								Static195.aClass65Array59[local25++] = Static42.aClass65_686;
								continue;
							}
							if (local215 == 1802) {
								if (local1104.aClass65_2565 == null) {
									Static195.aClass65Array59[local25++] = Static42.aClass65_686;
								} else {
									Static195.aClass65Array59[local25++] = local1104.aClass65_2565;
								}
								continue;
							}
						} else if (local215 < 2600) {
							local23--;
							local1104 = Static154.method2691(Static16.anIntArray44[local23]);
							if (local215 == 2500) {
								Static16.anIntArray44[local23++] = local1104.anInt4339;
								continue;
							}
							if (local215 == 2501) {
								Static16.anIntArray44[local23++] = local1104.anInt4318;
								continue;
							}
							if (local215 == 2502) {
								Static16.anIntArray44[local23++] = local1104.anInt4353;
								continue;
							}
							if (local215 == 2503) {
								Static16.anIntArray44[local23++] = local1104.anInt4354;
								continue;
							}
							if (local215 == 2504) {
								Static16.anIntArray44[local23++] = local1104.aBoolean180 ? 1 : 0;
								continue;
							}
							if (local215 == 2505) {
								Static16.anIntArray44[local23++] = local1104.anInt4319;
								continue;
							}
						} else if (local215 < 2700) {
							local23--;
							local1104 = Static154.method2691(Static16.anIntArray44[local23]);
							if (local215 == 2600) {
								Static16.anIntArray44[local23++] = local1104.anInt4310;
								continue;
							}
							if (local215 == 2601) {
								Static16.anIntArray44[local23++] = local1104.anInt4342;
								continue;
							}
							if (local215 == 2602) {
								Static195.aClass65Array59[local25++] = local1104.aClass65_2566;
								continue;
							}
							if (local215 == 2603) {
								Static16.anIntArray44[local23++] = local1104.anInt4368;
								continue;
							}
							if (local215 == 2604) {
								Static16.anIntArray44[local23++] = local1104.anInt4341;
								continue;
							}
							if (local215 == 2605) {
								Static16.anIntArray44[local23++] = local1104.anInt4369;
								continue;
							}
							if (local215 == 2606) {
								Static16.anIntArray44[local23++] = local1104.anInt4370;
								continue;
							}
							if (local215 == 2607) {
								Static16.anIntArray44[local23++] = local1104.anInt4359;
								continue;
							}
							if (local215 == 2608) {
								Static16.anIntArray44[local23++] = local1104.anInt4380;
								continue;
							}
							if (local215 == 2609) {
								Static16.anIntArray44[local23++] = local1104.anInt4382;
								continue;
							}
						} else if (local215 < 2800) {
							if (local215 == 2700) {
								local23--;
								local1104 = Static154.method2691(Static16.anIntArray44[local23]);
								Static16.anIntArray44[local23++] = local1104.anInt4306;
								continue;
							}
							if (local215 == 2701) {
								local23--;
								local1104 = Static154.method2691(Static16.anIntArray44[local23]);
								if (local1104.anInt4306 == -1) {
									Static16.anIntArray44[local23++] = 0;
								} else {
									Static16.anIntArray44[local23++] = local1104.anInt4336;
								}
								continue;
							}
							if (local215 == 2702) {
								local23--;
								local760 = Static16.anIntArray44[local23];
								@Pc(1837) Class1_Sub20 local1837 = (Class1_Sub20) Static200.aClass99_14.method3292((long) local760);
								if (local1837 == null) {
									Static16.anIntArray44[local23++] = 0;
								} else {
									Static16.anIntArray44[local23++] = 1;
								}
								continue;
							}
							if (local215 == 2703) {
								local23--;
								local1104 = Static154.method2691(Static16.anIntArray44[local23]);
								if (local1104.aClass97Array2 == null) {
									Static16.anIntArray44[local23++] = 0;
									continue;
								}
								local765 = local1104.aClass97Array2.length;
								for (local989 = 0; local989 < local1104.aClass97Array2.length; local989++) {
									if (local1104.aClass97Array2[local989] == null) {
										local765 = local989;
										break;
									}
								}
								Static16.anIntArray44[local23++] = local765;
								continue;
							}
							if (local215 == 2704 || local215 == 2705) {
								local23 -= 2;
								local765 = Static16.anIntArray44[local23 + 1];
								local760 = Static16.anIntArray44[local23];
								@Pc(1925) Class1_Sub20 local1925 = (Class1_Sub20) Static200.aClass99_14.method3292((long) local760);
								if (local1925 != null && local765 == local1925.anInt3111) {
									Static16.anIntArray44[local23++] = 1;
									continue;
								}
								Static16.anIntArray44[local23++] = 0;
								continue;
							}
						} else if (local215 < 2900) {
							local23--;
							local1104 = Static154.method2691(Static16.anIntArray44[local23]);
							if (local215 == 2800) {
								Static16.anIntArray44[local23++] = Static106.method1970(Static153.method2677(local1104));
								continue;
							}
							if (local215 == 2801) {
								local23--;
								local765 = Static16.anIntArray44[local23];
								@Pc(1985) int local1985 = local765 - 1;
								if (local1104.aClass65Array66 != null && local1985 < local1104.aClass65Array66.length && local1104.aClass65Array66[local1985] != null) {
									Static195.aClass65Array59[local25++] = local1104.aClass65Array66[local1985];
									continue;
								}
								Static195.aClass65Array59[local25++] = Static42.aClass65_686;
								continue;
							}
							if (local215 == 2802) {
								if (local1104.aClass65_2565 == null) {
									Static195.aClass65Array59[local25++] = Static42.aClass65_686;
								} else {
									Static195.aClass65Array59[local25++] = local1104.aClass65_2565;
								}
								continue;
							}
						} else if (local215 < 3200) {
							if (local215 == 3100) {
								local25--;
								local569 = Static195.aClass65Array59[local25];
								Static31.method603(0, Static42.aClass65_686, local569);
								continue;
							}
							if (local215 == 3101) {
								local23 -= 2;
								Static128.method2420(Static16.anIntArray44[local23 + 1], Static201.aClass6_Sub4_Sub1_3, Static16.anIntArray44[local23]);
								continue;
							}
							if (local215 == 3103) {
								Static157.method3230();
								continue;
							}
							if (local215 == 3104) {
								local25--;
								local569 = Static195.aClass65Array59[local25];
								local765 = 0;
								if (local569.method2471()) {
									local765 = local569.method2454();
								}
								Static45.aClass1_Sub14_Sub1_8.method1761(104);
								Static45.aClass1_Sub14_Sub1_8.method1724(local765);
								continue;
							}
							if (local215 == 3105) {
								local25--;
								local569 = Static195.aClass65Array59[local25];
								Static45.aClass1_Sub14_Sub1_8.method1761(179);
								Static45.aClass1_Sub14_Sub1_8.method1721(local569.method2475());
								continue;
							}
							if (local215 == 3106) {
								local25--;
								local569 = Static195.aClass65Array59[local25];
								Static45.aClass1_Sub14_Sub1_8.method1761(88);
								Static45.aClass1_Sub14_Sub1_8.method1710(local569.method2482() + 1);
								Static45.aClass1_Sub14_Sub1_8.method1742(local569);
								continue;
							}
							if (local215 == 3107) {
								local23--;
								local760 = Static16.anIntArray44[local23];
								local25--;
								local3993 = Static195.aClass65Array59[local25];
								Static95.method1804(local3993, local760);
								continue;
							}
							if (local215 == 3108) {
								local23 -= 3;
								local760 = Static16.anIntArray44[local23];
								local765 = Static16.anIntArray44[local23 + 1];
								local989 = Static16.anIntArray44[local23 + 2];
								local999 = Static154.method2691(local989);
								Static170.method2880(local760, local999, local765);
								continue;
							}
							if (local215 == 3109) {
								local23 -= 2;
								local765 = Static16.anIntArray44[local23 + 1];
								local1176 = local959 ? Static84.aClass97_9 : Static16.aClass97_2;
								local760 = Static16.anIntArray44[local23];
								Static170.method2880(local760, local1176, local765);
								continue;
							}
							if (local215 == 3110) {
								local23--;
								local760 = Static16.anIntArray44[local23];
								Static45.aClass1_Sub14_Sub1_8.method1761(180);
								Static45.aClass1_Sub14_Sub1_8.method1726(local760);
								continue;
							}
						} else if (local215 < 3300) {
							if (local215 == 3200) {
								local23 -= 3;
								Static184.method3067(Static16.anIntArray44[local23], Static16.anIntArray44[local23 + 1], Static16.anIntArray44[local23 + 2]);
								continue;
							}
							if (local215 == 3201) {
								local23--;
								Static117.method2156(Static16.anIntArray44[local23]);
								continue;
							}
							if (local215 == 3202) {
								local23 -= 2;
								Static15.method287(Static16.anIntArray44[local23], Static16.anIntArray44[local23 + 1]);
								continue;
							}
						} else if (local215 < 3400) {
							if (local215 == 3300) {
								Static16.anIntArray44[local23++] = Static174.anInt3887;
								continue;
							}
							if (local215 == 3301) {
								local23 -= 2;
								local760 = Static16.anIntArray44[local23];
								local765 = Static16.anIntArray44[local23 + 1];
								Static16.anIntArray44[local23++] = Static21.method398(local765, local760);
								continue;
							}
							if (local215 == 3302) {
								local23 -= 2;
								local765 = Static16.anIntArray44[local23 + 1];
								local760 = Static16.anIntArray44[local23];
								Static16.anIntArray44[local23++] = Static171.method2893(local760, local765);
								continue;
							}
							if (local215 == 3303) {
								local23 -= 2;
								local760 = Static16.anIntArray44[local23];
								local765 = Static16.anIntArray44[local23 + 1];
								Static16.anIntArray44[local23++] = Static26.method471(local760, local765);
								continue;
							}
							if (local215 == 3304) {
								local23--;
								local760 = Static16.anIntArray44[local23];
								Static16.anIntArray44[local23++] = Static154.method2695(local760).anInt3551;
								continue;
							}
							if (local215 == 3305) {
								local23--;
								local760 = Static16.anIntArray44[local23];
								Static16.anIntArray44[local23++] = Static118.anIntArray335[local760];
								continue;
							}
							if (local215 == 3306) {
								local23--;
								local760 = Static16.anIntArray44[local23];
								Static16.anIntArray44[local23++] = Static113.anIntArray327[local760];
								continue;
							}
							if (local215 == 3307) {
								local23--;
								local760 = Static16.anIntArray44[local23];
								Static16.anIntArray44[local23++] = Static37.anIntArray97[local760];
								continue;
							}
							if (local215 == 3308) {
								local760 = Static207.anInt4425;
								local765 = (Static201.aClass6_Sub4_Sub1_3.anInt3934 >> 7) + Static205.anInt4337;
								local989 = Static58.anInt1543 + (Static201.aClass6_Sub4_Sub1_3.anInt3976 >> 7);
								Static16.anIntArray44[local23++] = (local765 << 14) + (local760 << 28) + local989;
								continue;
							}
							if (local215 == 3309) {
								local23--;
								local760 = Static16.anIntArray44[local23];
								Static16.anIntArray44[local23++] = local760 >> 14 & 0x3FFF;
								continue;
							}
							if (local215 == 3310) {
								local23--;
								local760 = Static16.anIntArray44[local23];
								Static16.anIntArray44[local23++] = local760 >> 28;
								continue;
							}
							if (local215 == 3311) {
								local23--;
								local760 = Static16.anIntArray44[local23];
								Static16.anIntArray44[local23++] = local760 & 0x3FFF;
								continue;
							}
							if (local215 == 3312) {
								Static16.anIntArray44[local23++] = Static15.aBoolean19 ? 1 : 0;
								continue;
							}
							if (local215 == 3313) {
								local23 -= 2;
								local765 = Static16.anIntArray44[local23 + 1];
								local760 = Static16.anIntArray44[local23] + 32768;
								Static16.anIntArray44[local23++] = Static21.method398(local765, local760);
								continue;
							}
							if (local215 == 3314) {
								local23 -= 2;
								local760 = Static16.anIntArray44[local23] + 32768;
								local765 = Static16.anIntArray44[local23 + 1];
								Static16.anIntArray44[local23++] = Static171.method2893(local760, local765);
								continue;
							}
							if (local215 == 3315) {
								local23 -= 2;
								local765 = Static16.anIntArray44[local23 + 1];
								local760 = Static16.anIntArray44[local23] + 32768;
								Static16.anIntArray44[local23++] = Static26.method471(local760, local765);
								continue;
							}
							if (local215 == 3316) {
								if (Static129.anInt3184 < 2) {
									Static16.anIntArray44[local23++] = 0;
								} else {
									Static16.anIntArray44[local23++] = Static129.anInt3184;
								}
								continue;
							}
							if (local215 == 3317) {
								Static16.anIntArray44[local23++] = Static51.anInt1367;
								continue;
							}
							if (local215 == 3318) {
								Static16.anIntArray44[local23++] = Static13.anInt910;
								continue;
							}
							if (local215 == 3321) {
								Static16.anIntArray44[local23++] = Static34.anInt998;
								continue;
							}
							if (local215 == 3322) {
								Static16.anIntArray44[local23++] = Static47.anInt1234;
								continue;
							}
							if (local215 == 3323) {
								if (Static201.anInt3957 >= 5 && Static201.anInt3957 <= 9) {
									Static16.anIntArray44[local23++] = 1;
									continue;
								}
								Static16.anIntArray44[local23++] = 0;
								continue;
							}
							if (local215 == 3324) {
								if (Static201.anInt3957 >= 5 && Static201.anInt3957 <= 9) {
									Static16.anIntArray44[local23++] = Static201.anInt3957;
									continue;
								}
								Static16.anIntArray44[local23++] = 0;
								continue;
							}
							if (local215 == 3325) {
								if (Static58.anInt1537 > 0) {
									Static16.anIntArray44[local23++] = 1;
								} else {
									Static16.anIntArray44[local23++] = 0;
								}
								continue;
							}
							if (local215 == 3326) {
								Static16.anIntArray44[local23++] = Static201.aClass6_Sub4_Sub1_3.anInt606;
								continue;
							}
							if (local215 == 3327) {
								Static16.anIntArray44[local23++] = Static201.aClass6_Sub4_Sub1_3.aClass19_1.aBoolean43 ? 1 : 0;
								continue;
							}
						} else if (local215 < 3500) {
							if (local215 == 3400) {
								local23 -= 2;
								local760 = Static16.anIntArray44[local23];
								local765 = Static16.anIntArray44[local23 + 1];
								@Pc(6779) Class1_Sub2_Sub10 local6779 = Static30.method579(local760);
								Static195.aClass65Array59[local25++] = local6779.method889(local765);
								continue;
							}
							if (local215 == 3408) {
								local23 -= 4;
								local760 = Static16.anIntArray44[local23];
								local608 = Static16.anIntArray44[local23 + 3];
								local989 = Static16.anIntArray44[local23 + 2];
								local765 = Static16.anIntArray44[local23 + 1];
								@Pc(6818) Class1_Sub2_Sub10 local6818 = Static30.method579(local989);
								if (local6818.anInt1365 == local760 && local765 == local6818.anInt1362) {
									if (local765 == 115) {
										Static195.aClass65Array59[local25++] = local6818.method889(local608);
									} else {
										Static16.anIntArray44[local23++] = local6818.method894(local608);
									}
									continue;
								}
								if (local765 == 115) {
									Static195.aClass65Array59[local25++] = Static51.aClass65_846;
								} else {
									Static16.anIntArray44[local23++] = 0;
								}
								continue;
							}
						} else if (local215 < 3700) {
							if (local215 == 3600) {
								if (Static171.anInt3802 == 0) {
									Static16.anIntArray44[local23++] = -2;
								} else if (Static171.anInt3802 == 1) {
									Static16.anIntArray44[local23++] = -1;
								} else {
									Static16.anIntArray44[local23++] = Static33.anInt973;
								}
								continue;
							}
							if (local215 == 3601) {
								local23--;
								local760 = Static16.anIntArray44[local23];
								if (Static171.anInt3802 == 2 && Static33.anInt973 > local760) {
									Static195.aClass65Array59[local25++] = Static125.aClass65Array41[local760];
									continue;
								}
								Static195.aClass65Array59[local25++] = Static42.aClass65_686;
								continue;
							}
							if (local215 == 3602) {
								local23--;
								local760 = Static16.anIntArray44[local23];
								if (Static171.anInt3802 == 2 && local760 < Static33.anInt973) {
									Static16.anIntArray44[local23++] = Static9.anIntArray16[local760];
									continue;
								}
								Static16.anIntArray44[local23++] = 0;
								continue;
							}
							if (local215 == 3603) {
								local23--;
								local760 = Static16.anIntArray44[local23];
								if (Static171.anInt3802 == 2 && Static33.anInt973 > local760) {
									Static16.anIntArray44[local23++] = Static46.anIntArray116[local760];
									continue;
								}
								Static16.anIntArray44[local23++] = 0;
								continue;
							}
							if (local215 == 3604) {
								local25--;
								local569 = Static195.aClass65Array59[local25];
								local23--;
								local765 = Static16.anIntArray44[local23];
								Static94.method1778(local765, local569);
								continue;
							}
							if (local215 == 3605) {
								local25--;
								local569 = Static195.aClass65Array59[local25];
								Static50.method920(local569.method2475());
								continue;
							}
							if (local215 == 3606) {
								local25--;
								local569 = Static195.aClass65Array59[local25];
								Static191.method3143(local569.method2475());
								continue;
							}
							if (local215 == 3607) {
								local25--;
								local569 = Static195.aClass65Array59[local25];
								Static125.method2375(local569.method2475());
								continue;
							}
							if (local215 == 3608) {
								local25--;
								local569 = Static195.aClass65Array59[local25];
								Static149.method2657(local569.method2475());
								continue;
							}
							if (local215 == 3609) {
								local25--;
								local569 = Static195.aClass65Array59[local25];
								if (local569.method2472(Static177.aClass65_2378) || local569.method2472(Static55.aClass65_931)) {
									local569 = local569.method2483(7);
								}
								Static16.anIntArray44[local23++] = Static92.method1764(local569) ? 1 : 0;
								continue;
							}
							if (local215 == 3610) {
								local23--;
								local760 = Static16.anIntArray44[local23];
								if (Static171.anInt3802 == 2 && local760 < Static33.anInt973) {
									Static195.aClass65Array59[local25++] = Static53.aClass65Array19[local760];
									continue;
								}
								Static195.aClass65Array59[local25++] = Static42.aClass65_686;
								continue;
							}
							if (local215 == 3611) {
								if (Static167.aClass65_2240 == null) {
									Static195.aClass65Array59[local25++] = Static42.aClass65_686;
								} else {
									Static195.aClass65Array59[local25++] = Static167.aClass65_2240.method2488();
								}
								continue;
							}
							if (local215 == 3612) {
								if (Static167.aClass65_2240 == null) {
									Static16.anIntArray44[local23++] = 0;
								} else {
									Static16.anIntArray44[local23++] = Static58.anInt1542;
								}
								continue;
							}
							if (local215 == 3613) {
								local23--;
								local760 = Static16.anIntArray44[local23];
								if (Static167.aClass65_2240 != null && local760 < Static58.anInt1542) {
									Static195.aClass65Array59[local25++] = Static26.aClass1_Sub13Array1[local760].aClass65_1177.method2488();
									continue;
								}
								Static195.aClass65Array59[local25++] = Static42.aClass65_686;
								continue;
							}
							if (local215 == 3614) {
								local23--;
								local760 = Static16.anIntArray44[local23];
								if (Static167.aClass65_2240 != null && Static58.anInt1542 > local760) {
									Static16.anIntArray44[local23++] = Static26.aClass1_Sub13Array1[local760].anInt1929;
									continue;
								}
								Static16.anIntArray44[local23++] = 0;
								continue;
							}
							if (local215 == 3615) {
								local23--;
								local760 = Static16.anIntArray44[local23];
								if (Static167.aClass65_2240 != null && local760 < Static58.anInt1542) {
									Static16.anIntArray44[local23++] = Static26.aClass1_Sub13Array1[local760].aByte7;
									continue;
								}
								Static16.anIntArray44[local23++] = 0;
								continue;
							}
							if (local215 == 3616) {
								Static16.anIntArray44[local23++] = Static79.aByte8;
								continue;
							}
							if (local215 == 3617) {
								local25--;
								local569 = Static195.aClass65Array59[local25];
								Static196.method3198(local569);
								continue;
							}
							if (local215 == 3618) {
								Static16.anIntArray44[local23++] = Static30.aByte3;
								continue;
							}
							if (local215 == 3619) {
								local25--;
								local569 = Static195.aClass65Array59[local25];
								Static111.method2033(local569.method2475());
								continue;
							}
							if (local215 == 3620) {
								Static178.method3025();
								continue;
							}
							if (local215 == 3621) {
								if (Static171.anInt3802 == 0) {
									Static16.anIntArray44[local23++] = -1;
								} else {
									Static16.anIntArray44[local23++] = Static29.anInt859;
								}
								continue;
							}
							if (local215 == 3622) {
								local23--;
								local760 = Static16.anIntArray44[local23];
								if (Static171.anInt3802 != 0 && Static29.anInt859 > local760) {
									Static195.aClass65Array59[local25++] = Static134.method2558(Static197.aLongArray9[local760]).method2488();
									continue;
								}
								Static195.aClass65Array59[local25++] = Static42.aClass65_686;
								continue;
							}
							if (local215 == 3623) {
								local25--;
								local569 = Static195.aClass65Array59[local25];
								if (local569.method2472(Static177.aClass65_2378) || local569.method2472(Static55.aClass65_931)) {
									local569 = local569.method2483(7);
								}
								Static16.anIntArray44[local23++] = Static131.method2506(local569) ? 1 : 0;
								continue;
							}
							if (local215 == 3624) {
								local23--;
								local760 = Static16.anIntArray44[local23];
								if (Static26.aClass1_Sub13Array1 != null && Static58.anInt1542 > local760 && Static26.aClass1_Sub13Array1[local760].aClass65_1177.method2489(Static201.aClass6_Sub4_Sub1_3.aClass65_479)) {
									Static16.anIntArray44[local23++] = 1;
									continue;
								}
								Static16.anIntArray44[local23++] = 0;
								continue;
							}
							if (local215 == 3625) {
								if (Static51.aClass65_853 == null) {
									Static195.aClass65Array59[local25++] = Static42.aClass65_686;
								} else {
									Static195.aClass65Array59[local25++] = Static51.aClass65_853.method2488();
								}
								continue;
							}
							if (local215 == 3626) {
								local23--;
								local760 = Static16.anIntArray44[local23];
								if (Static167.aClass65_2240 != null && Static58.anInt1542 > local760) {
									Static195.aClass65Array59[local25++] = Static26.aClass1_Sub13Array1[local760].aClass65_1178;
									continue;
								}
								Static195.aClass65Array59[local25++] = Static42.aClass65_686;
								continue;
							}
						} else if (local215 < 4000) {
							if (local215 == 3903) {
								local23--;
								local760 = Static16.anIntArray44[local23];
								Static16.anIntArray44[local23++] = Static109.aClass9Array1[local760].method384();
								continue;
							}
							if (local215 == 3904) {
								local23--;
								local760 = Static16.anIntArray44[local23];
								Static16.anIntArray44[local23++] = Static109.aClass9Array1[local760].anInt626;
								continue;
							}
							if (local215 == 3905) {
								local23--;
								local760 = Static16.anIntArray44[local23];
								Static16.anIntArray44[local23++] = Static109.aClass9Array1[local760].anInt620;
								continue;
							}
							if (local215 == 3906) {
								local23--;
								local760 = Static16.anIntArray44[local23];
								Static16.anIntArray44[local23++] = Static109.aClass9Array1[local760].anInt629;
								continue;
							}
							if (local215 == 3907) {
								local23--;
								local760 = Static16.anIntArray44[local23];
								Static16.anIntArray44[local23++] = Static109.aClass9Array1[local760].anInt625;
								continue;
							}
							if (local215 == 3908) {
								local23--;
								local760 = Static16.anIntArray44[local23];
								Static16.anIntArray44[local23++] = Static109.aClass9Array1[local760].anInt618;
								continue;
							}
							if (local215 == 3910) {
								local23--;
								local760 = Static16.anIntArray44[local23];
								local765 = Static109.aClass9Array1[local760].method389();
								Static16.anIntArray44[local23++] = local765 == 0 ? 1 : 0;
								continue;
							}
							if (local215 == 3911) {
								local23--;
								local760 = Static16.anIntArray44[local23];
								local765 = Static109.aClass9Array1[local760].method389();
								Static16.anIntArray44[local23++] = local765 == 2 ? 1 : 0;
								continue;
							}
							if (local215 == 3912) {
								local23--;
								local760 = Static16.anIntArray44[local23];
								local765 = Static109.aClass9Array1[local760].method389();
								Static16.anIntArray44[local23++] = local765 == 5 ? 1 : 0;
								continue;
							}
							if (local215 == 3913) {
								local23--;
								local760 = Static16.anIntArray44[local23];
								local765 = Static109.aClass9Array1[local760].method389();
								Static16.anIntArray44[local23++] = local765 == 1 ? 1 : 0;
								continue;
							}
						} else if (local215 < 4100) {
							if (local215 == 4000) {
								local23 -= 2;
								local760 = Static16.anIntArray44[local23];
								local765 = Static16.anIntArray44[local23 + 1];
								Static16.anIntArray44[local23++] = local765 + local760;
								continue;
							}
							if (local215 == 4001) {
								local23 -= 2;
								local765 = Static16.anIntArray44[local23 + 1];
								local760 = Static16.anIntArray44[local23];
								Static16.anIntArray44[local23++] = local760 - local765;
								continue;
							}
							if (local215 == 4002) {
								local23 -= 2;
								local765 = Static16.anIntArray44[local23 + 1];
								local760 = Static16.anIntArray44[local23];
								Static16.anIntArray44[local23++] = local760 * local765;
								continue;
							}
							if (local215 == 4003) {
								local23 -= 2;
								local760 = Static16.anIntArray44[local23];
								local765 = Static16.anIntArray44[local23 + 1];
								Static16.anIntArray44[local23++] = local760 / local765;
								continue;
							}
							if (local215 == 4004) {
								local23--;
								local760 = Static16.anIntArray44[local23];
								Static16.anIntArray44[local23++] = (int) (Math.random() * (double) local760);
								continue;
							}
							if (local215 == 4005) {
								local23--;
								local760 = Static16.anIntArray44[local23];
								Static16.anIntArray44[local23++] = (int) (Math.random() * (double) (local760 + 1));
								continue;
							}
							if (local215 == 4006) {
								local23 -= 5;
								local760 = Static16.anIntArray44[local23];
								local765 = Static16.anIntArray44[local23 + 1];
								local608 = Static16.anIntArray44[local23 + 3];
								local989 = Static16.anIntArray44[local23 + 2];
								local633 = Static16.anIntArray44[local23 + 4];
								Static16.anIntArray44[local23++] = local760 + (local765 - local760) * (local633 - local989) / (local608 - local989);
								continue;
							}
							@Pc(3620) long local3620;
							@Pc(3613) long local3613;
							if (local215 == 4007) {
								local23 -= 2;
								local3613 = Static16.anIntArray44[local23];
								local3620 = Static16.anIntArray44[local23 + 1];
								Static16.anIntArray44[local23++] = (int) (local3613 + local3613 * local3620 / 100L);
								continue;
							}
							if (local215 == 4008) {
								local23 -= 2;
								local760 = Static16.anIntArray44[local23];
								local765 = Static16.anIntArray44[local23 + 1];
								Static16.anIntArray44[local23++] = 0x1 << local765 | local760;
								continue;
							}
							if (local215 == 4009) {
								local23 -= 2;
								local760 = Static16.anIntArray44[local23];
								local765 = Static16.anIntArray44[local23 + 1];
								Static16.anIntArray44[local23++] = local760 & -(0x1 << local765) - 1;
								continue;
							}
							if (local215 == 4010) {
								local23 -= 2;
								local765 = Static16.anIntArray44[local23 + 1];
								local760 = Static16.anIntArray44[local23];
								Static16.anIntArray44[local23++] = (local760 & 0x1 << local765) == 0 ? 0 : 1;
								continue;
							}
							if (local215 == 4011) {
								local23 -= 2;
								local760 = Static16.anIntArray44[local23];
								local765 = Static16.anIntArray44[local23 + 1];
								Static16.anIntArray44[local23++] = local760 % local765;
								continue;
							}
							if (local215 == 4012) {
								local23 -= 2;
								local760 = Static16.anIntArray44[local23];
								local765 = Static16.anIntArray44[local23 + 1];
								if (local760 == 0) {
									Static16.anIntArray44[local23++] = 0;
								} else {
									Static16.anIntArray44[local23++] = (int) Math.pow((double) local760, (double) local765);
								}
								continue;
							}
							if (local215 == 4013) {
								local23 -= 2;
								local760 = Static16.anIntArray44[local23];
								local765 = Static16.anIntArray44[local23 + 1];
								if (local760 == 0) {
									Static16.anIntArray44[local23++] = 0;
								} else if (local765 == 0) {
									Static16.anIntArray44[local23++] = Integer.MAX_VALUE;
								} else {
									Static16.anIntArray44[local23++] = (int) Math.pow((double) local760, 1.0D / (double) local765);
								}
								continue;
							}
							if (local215 == 4014) {
								local23 -= 2;
								local765 = Static16.anIntArray44[local23 + 1];
								local760 = Static16.anIntArray44[local23];
								Static16.anIntArray44[local23++] = local765 & local760;
								continue;
							}
							if (local215 == 4015) {
								local23 -= 2;
								local760 = Static16.anIntArray44[local23];
								local765 = Static16.anIntArray44[local23 + 1];
								Static16.anIntArray44[local23++] = local760 | local765;
								continue;
							}
							if (local215 == 4016) {
								local23 -= 2;
								local760 = Static16.anIntArray44[local23];
								local765 = Static16.anIntArray44[local23 + 1];
								Static16.anIntArray44[local23++] = local765 > local760 ? local760 : local765;
								continue;
							}
							if (local215 == 4017) {
								local23 -= 2;
								local760 = Static16.anIntArray44[local23];
								local765 = Static16.anIntArray44[local23 + 1];
								Static16.anIntArray44[local23++] = local760 > local765 ? local760 : local765;
								continue;
							}
							if (local215 == 4018) {
								local23 -= 3;
								local3620 = Static16.anIntArray44[local23 + 1];
								@Pc(3930) long local3930 = (long) Static16.anIntArray44[local23 + 2];
								local3613 = Static16.anIntArray44[local23];
								Static16.anIntArray44[local23++] = (int) (local3613 * local3930 / local3620);
								continue;
							}
						} else if (local215 < 4200) {
							if (local215 == 4100) {
								local25--;
								local569 = Static195.aClass65Array59[local25];
								local23--;
								local765 = Static16.anIntArray44[local23];
								Static195.aClass65Array59[local25++] = Static109.method2004(new Class65[] { local569, Static118.method2250(local765) });
								continue;
							}
							if (local215 == 4101) {
								local25 -= 2;
								local3993 = Static195.aClass65Array59[local25 + 1];
								local569 = Static195.aClass65Array59[local25];
								Static195.aClass65Array59[local25++] = Static109.method2004(new Class65[] { local569, local3993 });
								continue;
							}
							if (local215 == 4102) {
								local25--;
								local569 = Static195.aClass65Array59[local25];
								local23--;
								local765 = Static16.anIntArray44[local23];
								Static195.aClass65Array59[local25++] = Static109.method2004(new Class65[] { local569, Static109.method2002(local765) });
								continue;
							}
							if (local215 == 4103) {
								local25--;
								local569 = Static195.aClass65Array59[local25];
								Static195.aClass65Array59[local25++] = local569.method2487();
								continue;
							}
							if (local215 == 4104) {
								local23--;
								local760 = Static16.anIntArray44[local23];
								@Pc(4078) long local4078 = (long) local760 * 86400000L + 1014768000000L;
								Static70.aCalendar1.setTime(new Date(local4078));
								local608 = Static70.aCalendar1.get(5);
								local633 = Static70.aCalendar1.get(2);
								local1020 = Static70.aCalendar1.get(1);
								Static195.aClass65Array59[local25++] = Static109.method2004(new Class65[] { Static118.method2250(local608), Static2.aClass65_47, Static118.aClass65Array40[local633], Static2.aClass65_47, Static118.method2250(local1020) });
								continue;
							}
							if (local215 == 4105) {
								local25 -= 2;
								local569 = Static195.aClass65Array59[local25];
								local3993 = Static195.aClass65Array59[local25 + 1];
								if (Static201.aClass6_Sub4_Sub1_3.aClass19_1 != null && Static201.aClass6_Sub4_Sub1_3.aClass19_1.aBoolean43) {
									Static195.aClass65Array59[local25++] = local3993;
									continue;
								}
								Static195.aClass65Array59[local25++] = local569;
								continue;
							}
							if (local215 == 4106) {
								local23--;
								local760 = Static16.anIntArray44[local23];
								Static195.aClass65Array59[local25++] = Static118.method2250(local760);
								continue;
							}
							if (local215 == 4107) {
								local25 -= 2;
								Static16.anIntArray44[local23++] = Static195.aClass65Array59[local25].method2490(Static195.aClass65Array59[local25 + 1]);
								continue;
							}
							@Pc(4228) byte[] local4228;
							@Pc(4233) Class1_Sub2_Sub5_Sub4_Sub1 local4233;
							if (local215 == 4108) {
								local23 -= 2;
								local765 = Static16.anIntArray44[local23];
								local25--;
								local569 = Static195.aClass65Array59[local25];
								local989 = Static16.anIntArray44[local23 + 1];
								local4228 = Static33.aClass60_Sub1_35.method2340(0, local989);
								local4233 = new Class1_Sub2_Sub5_Sub4_Sub1(local4228);
								local4233.method1613(Static139.aClass1_Sub2_Sub5_Sub1Array11, null);
								Static16.anIntArray44[local23++] = local4233.method1616(local569, local765);
								continue;
							}
							if (local215 == 4109) {
								local23 -= 2;
								local25--;
								local569 = Static195.aClass65Array59[local25];
								local989 = Static16.anIntArray44[local23 + 1];
								local765 = Static16.anIntArray44[local23];
								local4228 = Static33.aClass60_Sub1_35.method2340(0, local989);
								local4233 = new Class1_Sub2_Sub5_Sub4_Sub1(local4228);
								local4233.method1613(Static139.aClass1_Sub2_Sub5_Sub1Array11, null);
								Static16.anIntArray44[local23++] = local4233.method1599(local569, local765);
								continue;
							}
							if (local215 == 4110) {
								local25 -= 2;
								local569 = Static195.aClass65Array59[local25];
								local3993 = Static195.aClass65Array59[local25 + 1];
								local23--;
								if (Static16.anIntArray44[local23] == 1) {
									Static195.aClass65Array59[local25++] = local569;
								} else {
									Static195.aClass65Array59[local25++] = local3993;
								}
								continue;
							}
							if (local215 == 4111) {
								local25--;
								local569 = Static195.aClass65Array59[local25];
								Static195.aClass65Array59[local25++] = Static175.method1620(local569);
								continue;
							}
							if (local215 == 4112) {
								local25--;
								local569 = Static195.aClass65Array59[local25];
								local23--;
								local765 = Static16.anIntArray44[local23];
								if (local765 == -1) {
									throw new RuntimeException("null char");
								}
								Static195.aClass65Array59[local25++] = local569.method2462(local765);
								continue;
							}
							if (local215 == 4113) {
								local23--;
								local760 = Static16.anIntArray44[local23];
								Static16.anIntArray44[local23++] = Static61.method1082(local760) ? 1 : 0;
								continue;
							}
							if (local215 == 4114) {
								local23--;
								local760 = Static16.anIntArray44[local23];
								Static16.anIntArray44[local23++] = Static184.method3059(local760) ? 1 : 0;
								continue;
							}
							if (local215 == 4115) {
								local23--;
								local760 = Static16.anIntArray44[local23];
								Static16.anIntArray44[local23++] = Static70.method1203(local760) ? 1 : 0;
								continue;
							}
							if (local215 == 4116) {
								local23--;
								local760 = Static16.anIntArray44[local23];
								Static16.anIntArray44[local23++] = Static45.method761(local760) ? 1 : 0;
								continue;
							}
							if (local215 == 4117) {
								local25--;
								local569 = Static195.aClass65Array59[local25];
								if (local569 == null) {
									Static16.anIntArray44[local23++] = 0;
								} else {
									Static16.anIntArray44[local23++] = local569.method2482();
								}
								continue;
							}
							if (local215 == 4118) {
								local23 -= 2;
								local765 = Static16.anIntArray44[local23];
								local989 = Static16.anIntArray44[local23 + 1];
								local25--;
								local569 = Static195.aClass65Array59[local25];
								Static195.aClass65Array59[local25++] = local569.method2481(local989, local765);
								continue;
							}
							if (local215 == 4119) {
								local25--;
								local569 = Static195.aClass65Array59[local25];
								local3993 = Static172.method2919(local569.method2482());
								@Pc(4524) boolean local4524 = false;
								for (local608 = 0; local569.method2482() > local608; local608++) {
									local633 = local569.method2473(local608);
									if (local633 == 60) {
										local4524 = true;
									} else if (local633 == 62) {
										local4524 = false;
									} else if (!local4524) {
										local3993.method2468(local633);
									}
								}
								local3993.method2469();
								Static195.aClass65Array59[local25++] = local3993;
								continue;
							}
							if (local215 == 4120) {
								local23 -= 2;
								local765 = Static16.anIntArray44[local23];
								local25--;
								local569 = Static195.aClass65Array59[local25];
								local989 = Static16.anIntArray44[local23 + 1];
								Static16.anIntArray44[local23++] = local569.method2446(local765, local989);
								continue;
							}
							if (local215 == 4121) {
								local25 -= 2;
								local569 = Static195.aClass65Array59[local25];
								local23--;
								local989 = Static16.anIntArray44[local23];
								local3993 = Static195.aClass65Array59[local25 + 1];
								Static16.anIntArray44[local23++] = local569.method2453(local989, local3993);
								continue;
							}
							if (local215 == 4122) {
								local23--;
								local760 = Static16.anIntArray44[local23];
								Static16.anIntArray44[local23++] = Static66.method1144(local760);
								continue;
							}
							if (local215 == 4123) {
								local23--;
								local760 = Static16.anIntArray44[local23];
								Static16.anIntArray44[local23++] = Static127.method2414(local760);
								continue;
							}
						} else if (local215 < 4300) {
							if (local215 == 4200) {
								local23--;
								local760 = Static16.anIntArray44[local23];
								Static195.aClass65Array59[local25++] = Static40.method700(local760).aClass65_229;
								continue;
							}
							@Pc(6476) Class1_Sub2_Sub2 local6476;
							if (local215 == 4201) {
								local23 -= 2;
								local760 = Static16.anIntArray44[local23];
								local765 = Static16.anIntArray44[local23 + 1];
								local6476 = Static40.method700(local760);
								if (local765 >= 1 && local765 <= 5 && local6476.aClass65Array5[local765 - 1] != null) {
									Static195.aClass65Array59[local25++] = local6476.aClass65Array5[local765 - 1];
									continue;
								}
								Static195.aClass65Array59[local25++] = Static42.aClass65_686;
								continue;
							}
							if (local215 == 4202) {
								local23 -= 2;
								local760 = Static16.anIntArray44[local23];
								local765 = Static16.anIntArray44[local23 + 1];
								local6476 = Static40.method700(local760);
								if (local765 >= 1 && local765 <= 5 && local6476.aClass65Array4[local765 - 1] != null) {
									Static195.aClass65Array59[local25++] = local6476.aClass65Array4[local765 - 1];
									continue;
								}
								Static195.aClass65Array59[local25++] = Static42.aClass65_686;
								continue;
							}
							if (local215 == 4203) {
								local23--;
								local760 = Static16.anIntArray44[local23];
								Static16.anIntArray44[local23++] = Static40.method700(local760).anInt285;
								continue;
							}
							if (local215 == 4204) {
								local23--;
								local760 = Static16.anIntArray44[local23];
								Static16.anIntArray44[local23++] = Static40.method700(local760).anInt321 == 1 ? 1 : 0;
								continue;
							}
							@Pc(6611) Class1_Sub2_Sub2 local6611;
							if (local215 == 4205) {
								local23--;
								local760 = Static16.anIntArray44[local23];
								local6611 = Static40.method700(local760);
								if (local6611.anInt300 == -1 && local6611.anInt290 >= 0) {
									Static16.anIntArray44[local23++] = local6611.anInt290;
									continue;
								}
								Static16.anIntArray44[local23++] = local760;
								continue;
							}
							if (local215 == 4206) {
								local23--;
								local760 = Static16.anIntArray44[local23];
								local6611 = Static40.method700(local760);
								if (local6611.anInt300 >= 0 && local6611.anInt290 >= 0) {
									Static16.anIntArray44[local23++] = local6611.anInt290;
									continue;
								}
								Static16.anIntArray44[local23++] = local760;
								continue;
							}
							if (local215 == 4207) {
								local23--;
								local760 = Static16.anIntArray44[local23];
								Static16.anIntArray44[local23++] = Static40.method700(local760).aBoolean13 ? 1 : 0;
								continue;
							}
							if (local215 == 4210) {
								local23--;
								local765 = Static16.anIntArray44[local23];
								local25--;
								local569 = Static195.aClass65Array59[local25];
								Static120.method2277(local765 == 1, local569);
								Static16.anIntArray44[local23++] = Static199.anInt4285;
								continue;
							}
							if (local215 == 4211) {
								if (Static31.aShortArray20 != null && Static58.anInt1544 < Static199.anInt4285) {
									Static16.anIntArray44[local23++] = Static31.aShortArray20[Static58.anInt1544++] & 0xFFFF;
									continue;
								}
								Static16.anIntArray44[local23++] = -1;
								continue;
							}
							if (local215 == 4212) {
								Static58.anInt1544 = 0;
								continue;
							}
						} else if (local215 < 5100) {
							if (local215 == 5000) {
								Static16.anIntArray44[local23++] = Static78.anInt1922;
								continue;
							}
							if (local215 == 5001) {
								local23 -= 3;
								Static78.anInt1922 = Static16.anIntArray44[local23];
								Static180.anInt3908 = Static16.anIntArray44[local23 + 1];
								Static102.anInt2549 = Static16.anIntArray44[local23 + 2];
								Static45.aClass1_Sub14_Sub1_8.method1761(44);
								Static45.aClass1_Sub14_Sub1_8.method1710(Static78.anInt1922);
								Static45.aClass1_Sub14_Sub1_8.method1710(Static180.anInt3908);
								Static45.aClass1_Sub14_Sub1_8.method1710(Static102.anInt2549);
								continue;
							}
							if (local215 == 5002) {
								local23 -= 2;
								local25--;
								local569 = Static195.aClass65Array59[local25];
								local765 = Static16.anIntArray44[local23];
								local989 = Static16.anIntArray44[local23 + 1];
								Static45.aClass1_Sub14_Sub1_8.method1761(135);
								Static45.aClass1_Sub14_Sub1_8.method1721(local569.method2475());
								Static45.aClass1_Sub14_Sub1_8.method1710(local765 - 1);
								Static45.aClass1_Sub14_Sub1_8.method1710(local989);
								continue;
							}
							if (local215 == 5003) {
								local23--;
								local760 = Static16.anIntArray44[local23];
								local3993 = null;
								if (local760 < 100) {
									local3993 = Static28.aClass65Array11[local760];
								}
								if (local3993 == null) {
									local3993 = Static42.aClass65_686;
								}
								Static195.aClass65Array59[local25++] = local3993;
								continue;
							}
							if (local215 == 5004) {
								local23--;
								local760 = Static16.anIntArray44[local23];
								local765 = -1;
								if (local760 < 100 && Static28.aClass65Array11[local760] != null) {
									local765 = Static46.anIntArray115[local760];
								}
								Static16.anIntArray44[local23++] = local765;
								continue;
							}
							if (local215 == 5005) {
								Static16.anIntArray44[local23++] = Static180.anInt3908;
								continue;
							}
							if (local215 == 5008) {
								local25--;
								local569 = Static195.aClass65Array59[local25];
								if (local569.method2472(Static132.aClass65_1838)) {
									Static81.method1429(local569);
								} else {
									local3993 = local569.method2487();
									@Pc(5068) byte local5068 = 0;
									if (local3993.method2472(Static14.aClass65_255)) {
										local5068 = 0;
										local569 = local569.method2483(Static14.aClass65_255.method2482());
									} else if (local3993.method2472(Static100.aClass65_1493)) {
										local5068 = 1;
										local569 = local569.method2483(Static100.aClass65_1493.method2482());
									} else if (local3993.method2472(Static172.aClass65_2279)) {
										local569 = local569.method2483(Static172.aClass65_2279.method2482());
										local5068 = 2;
									} else if (local3993.method2472(Static141.aClass65_1968)) {
										local5068 = 3;
										local569 = local569.method2483(Static141.aClass65_1968.method2482());
									} else if (local3993.method2472(Static140.aClass65_1966)) {
										local5068 = 4;
										local569 = local569.method2483(Static140.aClass65_1966.method2482());
									} else if (local3993.method2472(Static138.aClass65_1899)) {
										local5068 = 5;
										local569 = local569.method2483(Static138.aClass65_1899.method2482());
									} else if (local3993.method2472(aClass65_2561)) {
										local569 = local569.method2483(aClass65_2561.method2482());
										local5068 = 6;
									} else if (local3993.method2472(Static96.aClass65_1421)) {
										local5068 = 7;
										local569 = local569.method2483(Static96.aClass65_1421.method2482());
									} else if (local3993.method2472(Static114.aClass65_1616)) {
										local5068 = 8;
										local569 = local569.method2483(Static114.aClass65_1616.method2482());
									} else if (local3993.method2472(Static141.aClass65_1967)) {
										local5068 = 9;
										local569 = local569.method2483(Static141.aClass65_1967.method2482());
									} else if (local3993.method2472(Static178.aClass65_2403)) {
										local5068 = 10;
										local569 = local569.method2483(Static178.aClass65_2403.method2482());
									} else if (local3993.method2472(Static42.aClass65_691)) {
										local5068 = 11;
										local569 = local569.method2483(Static42.aClass65_691.method2482());
									} else if (Static107.anInt2630 != 0) {
										if (local3993.method2472(Static14.aClass65_257)) {
											local569 = local569.method2483(Static14.aClass65_257.method2482());
											local5068 = 0;
										} else if (local3993.method2472(Static100.aClass65_1494)) {
											local5068 = 1;
											local569 = local569.method2483(Static100.aClass65_1494.method2482());
										} else if (local3993.method2472(Static172.aClass65_2276)) {
											local5068 = 2;
											local569 = local569.method2483(Static172.aClass65_2276.method2482());
										} else if (local3993.method2472(Static141.aClass65_1970)) {
											local5068 = 3;
											local569 = local569.method2483(Static141.aClass65_1970.method2482());
										} else if (local3993.method2472(Static140.aClass65_1965)) {
											local569 = local569.method2483(Static140.aClass65_1965.method2482());
											local5068 = 4;
										} else if (local3993.method2472(Static138.aClass65_1898)) {
											local5068 = 5;
											local569 = local569.method2483(Static138.aClass65_1898.method2482());
										} else if (local3993.method2472(aClass65_2560)) {
											local569 = local569.method2483(aClass65_2560.method2482());
											local5068 = 6;
										} else if (local3993.method2472(Static96.aClass65_1422)) {
											local569 = local569.method2483(Static96.aClass65_1422.method2482());
											local5068 = 7;
										} else if (local3993.method2472(Static114.aClass65_1618)) {
											local5068 = 8;
											local569 = local569.method2483(Static114.aClass65_1618.method2482());
										} else if (local3993.method2472(Static141.aClass65_1969)) {
											local569 = local569.method2483(Static141.aClass65_1969.method2482());
											local5068 = 9;
										} else if (local3993.method2472(Static178.aClass65_2401)) {
											local5068 = 10;
											local569 = local569.method2483(Static178.aClass65_2401.method2482());
										} else if (local3993.method2472(Static42.aClass65_694)) {
											local569 = local569.method2483(Static42.aClass65_694.method2482());
											local5068 = 11;
										}
									}
									local3993 = local569.method2487();
									@Pc(5439) byte local5439 = 0;
									if (local3993.method2472(Static101.aClass65_1499)) {
										local569 = local569.method2483(Static101.aClass65_1499.method2482());
										local5439 = 1;
									} else if (local3993.method2472(Static142.aClass65_1979)) {
										local5439 = 2;
										local569 = local569.method2483(Static142.aClass65_1979.method2482());
									} else if (local3993.method2472(Static155.aClass65_2070)) {
										local5439 = 3;
										local569 = local569.method2483(Static155.aClass65_2070.method2482());
									} else if (local3993.method2472(Static77.aClass65_1167)) {
										local569 = local569.method2483(Static77.aClass65_1167.method2482());
										local5439 = 4;
									} else if (local3993.method2472(Static157.aClass65_2547)) {
										local5439 = 5;
										local569 = local569.method2483(Static157.aClass65_2547.method2482());
									} else if (Static107.anInt2630 != 0) {
										if (local3993.method2472(Static101.aClass65_1500)) {
											local5439 = 1;
											local569 = local569.method2483(Static101.aClass65_1500.method2482());
										} else if (local3993.method2472(Static142.aClass65_1980)) {
											local569 = local569.method2483(Static142.aClass65_1980.method2482());
											local5439 = 2;
										} else if (local3993.method2472(Static155.aClass65_2067)) {
											local5439 = 3;
											local569 = local569.method2483(Static155.aClass65_2067.method2482());
										} else if (local3993.method2472(Static77.aClass65_1164)) {
											local5439 = 4;
											local569 = local569.method2483(Static77.aClass65_1164.method2482());
										} else if (local3993.method2472(Static157.aClass65_2548)) {
											local569 = local569.method2483(Static157.aClass65_2548.method2482());
											local5439 = 5;
										}
									}
									Static45.aClass1_Sub14_Sub1_8.method1761(69);
									Static45.aClass1_Sub14_Sub1_8.method1710(0);
									local633 = Static45.aClass1_Sub14_Sub1_8.anInt2306;
									Static45.aClass1_Sub14_Sub1_8.method1710(local5068);
									Static45.aClass1_Sub14_Sub1_8.method1710(local5439);
									Static16.method299(local569, Static45.aClass1_Sub14_Sub1_8);
									Static45.aClass1_Sub14_Sub1_8.method1697(Static45.aClass1_Sub14_Sub1_8.anInt2306 - local633);
								}
								continue;
							}
							if (local215 == 5009) {
								local25 -= 2;
								local3993 = Static195.aClass65Array59[local25 + 1];
								local569 = Static195.aClass65Array59[local25];
								Static45.aClass1_Sub14_Sub1_8.method1761(219);
								Static45.aClass1_Sub14_Sub1_8.method1710(0);
								local989 = Static45.aClass1_Sub14_Sub1_8.anInt2306;
								Static45.aClass1_Sub14_Sub1_8.method1721(local569.method2475());
								Static16.method299(local3993, Static45.aClass1_Sub14_Sub1_8);
								Static45.aClass1_Sub14_Sub1_8.method1697(Static45.aClass1_Sub14_Sub1_8.anInt2306 - local989);
								continue;
							}
							if (local215 == 5010) {
								local23--;
								local760 = Static16.anIntArray44[local23];
								local3993 = null;
								if (local760 < 100) {
									local3993 = Static127.aClass65Array43[local760];
								}
								if (local3993 == null) {
									local3993 = Static42.aClass65_686;
								}
								Static195.aClass65Array59[local25++] = local3993;
								continue;
							}
							if (local215 == 5011) {
								local23--;
								local760 = Static16.anIntArray44[local23];
								local3993 = null;
								if (local760 < 100) {
									local3993 = Static16.aClass65Array8[local760];
								}
								if (local3993 == null) {
									local3993 = Static42.aClass65_686;
								}
								Static195.aClass65Array59[local25++] = local3993;
								continue;
							}
							if (local215 == 5012) {
								local23--;
								local760 = Static16.anIntArray44[local23];
								local765 = -1;
								if (local760 < 100) {
									local765 = Static86.anIntArray240[local760];
								}
								Static16.anIntArray44[local23++] = local765;
								continue;
							}
							if (local215 == 5015) {
								if (Static201.aClass6_Sub4_Sub1_3 == null || Static201.aClass6_Sub4_Sub1_3.aClass65_479 == null) {
									local569 = Static139.aClass65_1958;
								} else {
									local569 = Static201.aClass6_Sub4_Sub1_3.aClass65_479;
								}
								Static195.aClass65Array59[local25++] = local569;
								continue;
							}
							if (local215 == 5016) {
								Static16.anIntArray44[local23++] = Static102.anInt2549;
								continue;
							}
							if (local215 == 5017) {
								Static16.anIntArray44[local23++] = Static156.anInt3582;
								continue;
							}
							if (local215 == 5050) {
								local23--;
								local760 = Static16.anIntArray44[local23];
								Static195.aClass65Array59[local25++] = Static119.method2259(local760).aClass65_654;
								continue;
							}
							@Pc(5828) Class1_Sub2_Sub8 local5828;
							if (local215 == 5051) {
								local23--;
								local760 = Static16.anIntArray44[local23];
								local5828 = Static119.method2259(local760);
								if (local5828.anIntArray94 == null) {
									Static16.anIntArray44[local23++] = 0;
								} else {
									Static16.anIntArray44[local23++] = local5828.anIntArray94.length;
								}
								continue;
							}
							if (local215 == 5052) {
								local23 -= 2;
								local760 = Static16.anIntArray44[local23];
								local765 = Static16.anIntArray44[local23 + 1];
								Static16.anIntArray44[local23++] = Static119.method2259(local760).anIntArray94[local765];
								continue;
							}
							if (local215 == 5053) {
								local23--;
								local760 = Static16.anIntArray44[local23];
								local5828 = Static119.method2259(local760);
								if (local5828.anIntArray91 == null) {
									Static16.anIntArray44[local23++] = 0;
								} else {
									Static16.anIntArray44[local23++] = local5828.anIntArray91.length;
								}
								continue;
							}
							if (local215 == 5054) {
								local23 -= 2;
								local760 = Static16.anIntArray44[local23];
								local765 = Static16.anIntArray44[local23 + 1];
								Static16.anIntArray44[local23++] = Static119.method2259(local760).anIntArray91[local765];
								continue;
							}
							if (local215 == 5055) {
								local23--;
								local760 = Static16.anIntArray44[local23];
								Static195.aClass65Array59[local25++] = Static15.method282(local760).method3206();
								continue;
							}
							if (local215 == 5056) {
								local23--;
								local760 = Static16.anIntArray44[local23];
								@Pc(5958) Class1_Sub2_Sub24 local5958 = Static15.method282(local760);
								if (local5958.anIntArray488 == null) {
									Static16.anIntArray44[local23++] = 0;
								} else {
									Static16.anIntArray44[local23++] = local5958.anIntArray488.length;
								}
								continue;
							}
							if (local215 == 5057) {
								local23 -= 2;
								local760 = Static16.anIntArray44[local23];
								local765 = Static16.anIntArray44[local23 + 1];
								Static16.anIntArray44[local23++] = Static15.method282(local760).anIntArray488[local765];
								continue;
							}
							if (local215 == 5058) {
								Static98.aClass69_1 = new Class69();
								local23--;
								Static98.aClass69_1.anInt3416 = Static16.anIntArray44[local23];
								Static98.aClass69_1.aClass1_Sub2_Sub24_1 = Static15.method282(Static98.aClass69_1.anInt3416);
								Static98.aClass69_1.anIntArray389 = new int[Static98.aClass69_1.aClass1_Sub2_Sub24_1.method3203()];
								continue;
							}
							if (local215 == 5059) {
								Static45.aClass1_Sub14_Sub1_8.method1761(241);
								Static45.aClass1_Sub14_Sub1_8.method1710(0);
								local760 = Static45.aClass1_Sub14_Sub1_8.anInt2306;
								Static45.aClass1_Sub14_Sub1_8.method1710(0);
								Static45.aClass1_Sub14_Sub1_8.method1726(Static98.aClass69_1.anInt3416);
								Static98.aClass69_1.aClass1_Sub2_Sub24_1.method3201(Static98.aClass69_1.anIntArray389, Static45.aClass1_Sub14_Sub1_8);
								Static45.aClass1_Sub14_Sub1_8.method1697(Static45.aClass1_Sub14_Sub1_8.anInt2306 - local760);
								continue;
							}
							if (local215 == 5060) {
								local25--;
								local569 = Static195.aClass65Array59[local25];
								Static45.aClass1_Sub14_Sub1_8.method1761(207);
								Static45.aClass1_Sub14_Sub1_8.method1710(0);
								local765 = Static45.aClass1_Sub14_Sub1_8.anInt2306;
								Static45.aClass1_Sub14_Sub1_8.method1721(local569.method2475());
								Static45.aClass1_Sub14_Sub1_8.method1726(Static98.aClass69_1.anInt3416);
								Static98.aClass69_1.aClass1_Sub2_Sub24_1.method3201(Static98.aClass69_1.anIntArray389, Static45.aClass1_Sub14_Sub1_8);
								Static45.aClass1_Sub14_Sub1_8.method1697(Static45.aClass1_Sub14_Sub1_8.anInt2306 - local765);
								continue;
							}
							if (local215 == 5061) {
								Static45.aClass1_Sub14_Sub1_8.method1761(241);
								Static45.aClass1_Sub14_Sub1_8.method1710(0);
								local760 = Static45.aClass1_Sub14_Sub1_8.anInt2306;
								Static45.aClass1_Sub14_Sub1_8.method1710(1);
								Static45.aClass1_Sub14_Sub1_8.method1726(Static98.aClass69_1.anInt3416);
								Static98.aClass69_1.aClass1_Sub2_Sub24_1.method3201(Static98.aClass69_1.anIntArray389, Static45.aClass1_Sub14_Sub1_8);
								Static45.aClass1_Sub14_Sub1_8.method1697(Static45.aClass1_Sub14_Sub1_8.anInt2306 - local760);
								continue;
							}
							if (local215 == 5062) {
								local23 -= 2;
								local760 = Static16.anIntArray44[local23];
								local765 = Static16.anIntArray44[local23 + 1];
								Static16.anIntArray44[local23++] = Static119.method2259(local760).anIntArray92[local765];
								continue;
							}
							if (local215 == 5063) {
								local23 -= 2;
								local760 = Static16.anIntArray44[local23];
								local765 = Static16.anIntArray44[local23 + 1];
								Static16.anIntArray44[local23++] = Static119.method2259(local760).anIntArray93[local765];
								continue;
							}
							if (local215 == 5064) {
								local23 -= 2;
								local760 = Static16.anIntArray44[local23];
								local765 = Static16.anIntArray44[local23 + 1];
								if (local765 == -1) {
									Static16.anIntArray44[local23++] = -1;
								} else {
									Static16.anIntArray44[local23++] = Static119.method2259(local760).method656(local765);
								}
								continue;
							}
							if (local215 == 5065) {
								local23 -= 2;
								local760 = Static16.anIntArray44[local23];
								local765 = Static16.anIntArray44[local23 + 1];
								if (local765 == -1) {
									Static16.anIntArray44[local23++] = -1;
								} else {
									Static16.anIntArray44[local23++] = Static119.method2259(local760).method654(local765);
								}
								continue;
							}
							if (local215 == 5066) {
								local23--;
								local760 = Static16.anIntArray44[local23];
								Static16.anIntArray44[local23++] = Static15.method282(local760).method3203();
								continue;
							}
							if (local215 == 5067) {
								local23 -= 2;
								local760 = Static16.anIntArray44[local23];
								local765 = Static16.anIntArray44[local23 + 1];
								local989 = Static15.method282(local760).method3204(local765);
								System.out.println("chatphrase_getdynamiccommand=" + local989);
								Static16.anIntArray44[local23++] = local989;
								continue;
							}
							if (local215 == 5068) {
								local23 -= 2;
								local760 = Static16.anIntArray44[local23];
								local765 = Static16.anIntArray44[local23 + 1];
								Static98.aClass69_1.anIntArray389[local760] = local765;
								continue;
							}
							if (local215 == 5069) {
								local23 -= 2;
								local765 = Static16.anIntArray44[local23 + 1];
								local760 = Static16.anIntArray44[local23];
								Static98.aClass69_1.anIntArray389[local760] = local765;
								continue;
							}
							if (local215 == 5070) {
								local23 -= 3;
								local989 = Static16.anIntArray44[local23 + 2];
								local765 = Static16.anIntArray44[local23 + 1];
								local760 = Static16.anIntArray44[local23];
								@Pc(6417) Class1_Sub2_Sub24 local6417 = Static15.method282(local760);
								if (local6417.method3204(local765) != 0) {
									throw new RuntimeException("bad command");
								}
								Static16.anIntArray44[local23++] = local6417.method3200(local765, local989);
								continue;
							}
						} else if (local215 < 5200) {
							if (local215 == 5100) {
								if (aBooleanArray19[86]) {
									Static16.anIntArray44[local23++] = 1;
								} else {
									Static16.anIntArray44[local23++] = 0;
								}
								continue;
							}
							if (local215 == 5101) {
								if (aBooleanArray19[82]) {
									Static16.anIntArray44[local23++] = 1;
								} else {
									Static16.anIntArray44[local23++] = 0;
								}
								continue;
							}
							if (local215 == 5102) {
								if (aBooleanArray19[81]) {
									Static16.anIntArray44[local23++] = 1;
								} else {
									Static16.anIntArray44[local23++] = 0;
								}
								continue;
							}
						} else if (local215 < 5300) {
							if (local215 == 5200) {
								local23--;
								Static157.method3228(Static16.anIntArray44[local23]);
								continue;
							}
							if (local215 == 5201) {
								Static16.anIntArray44[local23++] = Static183.method2979();
								continue;
							}
							if (local215 == 5202) {
								local23--;
								Static184.method3063(Static16.anIntArray44[local23]);
								continue;
							}
							if (local215 == 5203) {
								local25--;
								Static39.method687(Static195.aClass65Array59[local25]);
								continue;
							}
							if (local215 == 5204) {
								Static195.aClass65Array59[local25 - 1] = Static140.method2612(Static195.aClass65Array59[local25 - 1]);
								continue;
							}
							if (local215 == 5205) {
								local25--;
								Static141.method2614(Static195.aClass65Array59[local25]);
								continue;
							}
						} else if (local215 >= 5400 && local215 < 5500 && local215 == 5400) {
							local25 -= 2;
							local23--;
							local989 = Static16.anIntArray44[local23];
							local3993 = Static195.aClass65Array59[local25 + 1];
							local569 = Static195.aClass65Array59[local25];
							Static45.aClass1_Sub14_Sub1_8.method1761(178);
							Static45.aClass1_Sub14_Sub1_8.method1710(Static59.method1052(local569) + Static59.method1052(local3993) + 1);
							Static45.aClass1_Sub14_Sub1_8.method1742(local569);
							Static45.aClass1_Sub14_Sub1_8.method1742(local3993);
							Static45.aClass1_Sub14_Sub1_8.method1710(local989);
							continue;
						}
					}
				} else {
					if (local215 >= 2000) {
						local215 -= 1000;
						local23--;
						local1104 = Static154.method2691(Static16.anIntArray44[local23]);
					} else {
						local1104 = local959 ? Static84.aClass97_9 : Static16.aClass97_2;
					}
					if (local215 == 1000) {
						local1104.aByte13 = 0;
						local23 -= 2;
						local1104.anInt4339 = local1104.anInt4350 = Static16.anIntArray44[local23];
						local1104.aByte10 = 0;
						local1104.anInt4318 = local1104.anInt4308 = Static16.anIntArray44[local23 + 1];
						Static25.method448(local1104);
						continue;
					}
					if (local215 == 1001) {
						local1104.aByte12 = 0;
						local23 -= 2;
						local1104.anInt4353 = local1104.anInt4371 = Static16.anIntArray44[local23];
						local1104.anInt4356 = 0;
						local1104.aByte11 = 0;
						local1104.anInt4354 = local1104.anInt4346 = Static16.anIntArray44[local23 + 1];
						local1104.anInt4332 = 0;
						Static25.method448(local1104);
						if (local1104.anInt4329 == 0) {
							Static94.method1781(local1104);
						}
						continue;
					}
					if (local215 == 1003) {
						local23--;
						@Pc(8497) boolean local8497 = Static16.anIntArray44[local23] == 1;
						if (local8497 != local1104.aBoolean180) {
							local1104.aBoolean180 = local8497;
							Static25.method448(local1104);
						}
						continue;
					}
				}
				throw new IllegalStateException();
			}
		} catch (@Pc(8592) Exception local8592) {
			if (local16.aClass65_322 == null) {
				if (Static99.anInt2495 != 0) {
					Static31.method603(0, Static42.aClass65_686, Static11.aClass65_218);
				}
				Static107.method1977(local8592, "CS2 - scr:" + local16.aLong150 + " op:" + local32);
			} else {
				@Pc(8599) Class65 local8599 = Static172.method2919(30);
				local8599.method2474(Static132.aClass65_1839).method2474(local16.aClass65_322);
				for (local57 = Static47.anInt1241 - 1; local57 >= 0; local57--) {
					local8599.method2474(Static185.aClass65_2438).method2474(Static90.aClass94Array105[local57].aClass1_Sub2_Sub3_1.aClass65_322);
				}
				if (local32 == 40) {
					@Pc(8637) int local8637 = local35[local27];
					local8599.method2474(Static155.aClass65_2069).method2474(Static118.method2250(local8637));
				}
				if (Static99.anInt2495 != 0) {
					Static31.method603(0, Static42.aClass65_686, Static109.method2004(new Class65[] { Static170.aClass65_2243, local16.aClass65_322 }));
				}
				Static107.method1977(local8592, "CS2 - scr:" + local16.aLong150 + " op:" + local32 + new String(local8599.method2452()));
			}
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIIIII)Z")
	public static boolean method3261(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
			return false;
		} else {
			@Pc(59) int local59 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
			@Pc(75) int local75 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
			@Pc(91) int local91 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
			return local59 * local91 > 0 && local91 * local75 > 0;
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!oc;BLclient!oc;Lclient!sd;)[Lclient!hh;")
	public static Class1_Sub2_Sub5_Sub3[] method3262(@OriginalArg(0) Class65 arg0, @OriginalArg(2) Class65 arg1, @OriginalArg(3) Class60 arg2) {
		@Pc(6) int local6 = arg2.method2328(arg1);
		@Pc(12) int local12 = arg2.method2333(arg0, local6);
		return Static16.method303(local12, arg2, local6);
	}
}
