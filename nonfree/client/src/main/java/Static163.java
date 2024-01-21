import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!ua", name = "o", descriptor = "Lclient!u;")
	public static Class76 aClass76_126;

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "I")
	public static int anInt4253 = 0;

	@OriginalMember(owner = "client!ua", name = "k", descriptor = "Lclient!rf;")
	private static Class70 aClass70_1445 = Static49.method1293("Loading wordpack )2 ");

	@OriginalMember(owner = "client!ua", name = "m", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1446 = Static49.method1293("Abbrechen");

	@OriginalMember(owner = "client!ua", name = "n", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1447 = aClass70_1445;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Z)V")
	public static void method3265() {
		Static98.aClass1_Sub9_Sub1_2.method1285();
		@Pc(14) int local14 = Static98.aClass1_Sub9_Sub1_2.method1288(1);
		if (local14 == 0) {
			return;
		}
		@Pc(26) int local26 = Static98.aClass1_Sub9_Sub1_2.method1288(2);
		if (local26 == 0) {
			Static48.anIntArray167[Static161.anInt4212++] = 2047;
			return;
		}
		@Pc(48) int local48;
		@Pc(58) int local58;
		if (local26 == 1) {
			local48 = Static98.aClass1_Sub9_Sub1_2.method1288(3);
			Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.method1512(local48, false);
			local58 = Static98.aClass1_Sub9_Sub1_2.method1288(1);
			if (local58 == 1) {
				Static48.anIntArray167[Static161.anInt4212++] = 2047;
			}
			return;
		}
		@Pc(108) int local108;
		if (local26 == 2) {
			local48 = Static98.aClass1_Sub9_Sub1_2.method1288(3);
			Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.method1512(local48, true);
			local58 = Static98.aClass1_Sub9_Sub1_2.method1288(3);
			Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.method1512(local58, true);
			local108 = Static98.aClass1_Sub9_Sub1_2.method1288(1);
			if (local108 == 1) {
				Static48.anIntArray167[Static161.anInt4212++] = 2047;
			}
		} else if (local26 == 3) {
			local48 = Static98.aClass1_Sub9_Sub1_2.method1288(7);
			local58 = Static98.aClass1_Sub9_Sub1_2.method1288(1);
			local108 = Static98.aClass1_Sub9_Sub1_2.method1288(7);
			Static56.anInt1784 = Static98.aClass1_Sub9_Sub1_2.method1288(2);
			@Pc(152) int local152 = Static98.aClass1_Sub9_Sub1_2.method1288(1);
			if (local152 == 1) {
				Static48.anIntArray167[Static161.anInt4212++] = 2047;
			}
			Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.method1514(local48, local108, local58 == 1);
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILclient!u;I)Lclient!jb;")
	public static Class1_Sub15 method3267(@OriginalArg(1) Class76 arg0, @OriginalArg(2) int arg1) {
		@Pc(13) byte[] local13 = arg0.method3327(arg1);
		return local13 == null ? null : new Class1_Sub15(local13);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V")
	public static void method3268() {
		aClass76_126 = null;
		aClass70_1445 = null;
		aClass70_1446 = null;
		aClass70_1447 = null;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILclient!me;I)V")
	public static void method3269(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub19 arg1) {
		@Pc(8) Object[] local8 = arg1.anObjectArray27;
		@Pc(14) int local14 = (Integer) local8[0];
		@Pc(18) Class1_Sub1_Sub15 local18 = Static114.method2299(local14);
		if (local18 == null) {
			return;
		}
		@Pc(23) int local23 = 0;
		Static165.anInt4304 = 0;
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = -1;
		@Pc(32) int[] local32 = local18.anIntArray350;
		@Pc(35) int[] local35 = local18.anIntArray349;
		@Pc(37) byte local37 = -1;
		@Pc(55) int local55;
		@Pc(93) int local93;
		try {
			Static176.aClass70Array24 = new Class70[local18.anInt3624];
			Static121.anIntArray321 = new int[local18.anInt3620];
			@Pc(47) int local47 = 0;
			@Pc(49) int local49 = 0;
			for (local55 = 1; local55 < local8.length; local55++) {
				if (local8[local55] instanceof Integer) {
					local93 = (Integer) local8[local55];
					if (local93 == -2147483647) {
						local93 = arg1.anInt3084;
					}
					if (local93 == -2147483646) {
						local93 = arg1.anInt3080;
					}
					if (local93 == -2147483645) {
						local93 = arg1.aClass39_31 == null ? -1 : arg1.aClass39_31.anInt2355;
					}
					if (local93 == -2147483644) {
						local93 = arg1.anInt3086;
					}
					if (local93 == -2147483643) {
						local93 = arg1.aClass39_31 == null ? -1 : arg1.aClass39_31.anInt2344;
					}
					if (local93 == -2147483642) {
						local93 = arg1.aClass39_29 == null ? -1 : arg1.aClass39_29.anInt2355;
					}
					if (local93 == -2147483641) {
						local93 = arg1.aClass39_29 == null ? -1 : arg1.aClass39_29.anInt2344;
					}
					if (local93 == -2147483640) {
						local93 = arg1.anInt3079;
					}
					if (local93 == -2147483639) {
						local93 = arg1.anInt3083;
					}
					Static121.anIntArray321[local49++] = local93;
				} else if (local8[local55] instanceof Class70) {
					@Pc(72) Class70 local72 = (Class70) local8[local55];
					if (local72.method2910(Static72.aClass70_713)) {
						local72 = arg1.aClass70_1009;
					}
					Static176.aClass70Array24[local47++] = local72;
				}
			}
			local93 = 0;
			label2215: while (true) {
				local93++;
				if (arg0 < local93) {
					throw new RuntimeException("slow");
				}
				local29++;
				@Pc(209) int local209 = local32[local29];
				@Pc(774) int local774;
				@Pc(779) int local779;
				@Pc(625) int local625;
				@Pc(649) int local649;
				@Pc(581) Class70 local581;
				if (local209 < 100) {
					if (local209 == 0) {
						Static129.anIntArray421[local23++] = local35[local29];
						continue;
					}
					@Pc(234) int local234;
					if (local209 == 1) {
						local234 = local35[local29];
						Static129.anIntArray421[local23++] = Static133.anIntArray330[local234];
						continue;
					}
					if (local209 == 2) {
						local234 = local35[local29];
						local23--;
						Static133.anIntArray330[local234] = Static129.anIntArray421[local23];
						continue;
					}
					if (local209 == 3) {
						Static96.aClass70Array14[local27++] = local18.aClass70Array20[local29];
						continue;
					}
					if (local209 == 6) {
						local29 += local35[local29];
						continue;
					}
					if (local209 == 7) {
						local23 -= 2;
						if (Static129.anIntArray421[local23] != Static129.anIntArray421[local23 + 1]) {
							local29 += local35[local29];
						}
						continue;
					}
					if (local209 == 8) {
						local23 -= 2;
						if (Static129.anIntArray421[local23 + 1] == Static129.anIntArray421[local23]) {
							local29 += local35[local29];
						}
						continue;
					}
					if (local209 == 9) {
						local23 -= 2;
						if (Static129.anIntArray421[local23] < Static129.anIntArray421[local23 + 1]) {
							local29 += local35[local29];
						}
						continue;
					}
					if (local209 == 10) {
						local23 -= 2;
						if (Static129.anIntArray421[local23] > Static129.anIntArray421[local23 + 1]) {
							local29 += local35[local29];
						}
						continue;
					}
					if (local209 == 21) {
						if (Static165.anInt4304 == 0) {
							return;
						}
						@Pc(398) Class78 local398 = Static89.aClass78Array1[--Static165.anInt4304];
						Static121.anIntArray321 = local398.anIntArray410;
						local18 = local398.aClass1_Sub1_Sub15_1;
						local35 = local18.anIntArray349;
						local32 = local18.anIntArray350;
						Static176.aClass70Array24 = local398.aClass70Array21;
						local29 = local398.anInt4306;
						continue;
					}
					if (local209 == 25) {
						local234 = local35[local29];
						Static129.anIntArray421[local23++] = Static79.method1809(local234);
						continue;
					}
					if (local209 == 27) {
						local234 = local35[local29];
						local23--;
						Static83.method3493(local234, Static129.anIntArray421[local23]);
						continue;
					}
					if (local209 == 31) {
						local23 -= 2;
						if (Static129.anIntArray421[local23] <= Static129.anIntArray421[local23 + 1]) {
							local29 += local35[local29];
						}
						continue;
					}
					if (local209 == 32) {
						local23 -= 2;
						if (Static129.anIntArray421[local23] >= Static129.anIntArray421[local23 + 1]) {
							local29 += local35[local29];
						}
						continue;
					}
					if (local209 == 33) {
						Static129.anIntArray421[local23++] = Static121.anIntArray321[local35[local29]];
						continue;
					}
					@Pc(523) int local523;
					if (local209 == 34) {
						local523 = local35[local29];
						local23--;
						Static121.anIntArray321[local523] = Static129.anIntArray421[local23];
						continue;
					}
					if (local209 == 35) {
						Static96.aClass70Array14[local27++] = Static176.aClass70Array24[local35[local29]];
						continue;
					}
					if (local209 == 36) {
						local523 = local35[local29];
						local27--;
						Static176.aClass70Array24[local523] = Static96.aClass70Array14[local27];
						continue;
					}
					if (local209 == 37) {
						local234 = local35[local29];
						local27 -= local234;
						local581 = Static53.method1335(Static96.aClass70Array14, local234, local27);
						Static96.aClass70Array14[local27++] = local581;
						continue;
					}
					if (local209 == 38) {
						local23--;
						continue;
					}
					if (local209 == 39) {
						local27--;
						continue;
					}
					if (local209 == 40) {
						local234 = local35[local29];
						@Pc(615) Class1_Sub1_Sub15 local615 = Static114.method2299(local234);
						@Pc(619) int[] local619 = new int[local615.anInt3620];
						@Pc(623) Class70[] local623 = new Class70[local615.anInt3624];
						for (local625 = 0; local625 < local615.anInt3622; local625++) {
							local619[local625] = Static129.anIntArray421[local625 + local23 - local615.anInt3622];
						}
						for (local649 = 0; local649 < local615.anInt3625; local649++) {
							local623[local649] = Static96.aClass70Array14[local649 + local27 - local615.anInt3625];
						}
						local23 -= local615.anInt3622;
						local27 -= local615.anInt3625;
						@Pc(685) Class78 local685 = new Class78();
						local685.anInt4306 = local29;
						local685.aClass1_Sub1_Sub15_1 = local18;
						local685.anIntArray410 = Static121.anIntArray321;
						local685.aClass70Array21 = Static176.aClass70Array24;
						if (Static165.anInt4304 >= Static89.aClass78Array1.length) {
							throw new RuntimeException();
						}
						local18 = local615;
						Static89.aClass78Array1[Static165.anInt4304++] = local685;
						local35 = local615.anIntArray349;
						Static176.aClass70Array24 = local623;
						local29 = -1;
						local32 = local615.anIntArray350;
						Static121.anIntArray321 = local619;
						continue;
					}
					if (local209 == 42) {
						Static129.anIntArray421[local23++] = Static142.anIntArray357[local35[local29]];
						continue;
					}
					if (local209 == 43) {
						local523 = local35[local29];
						local23--;
						Static142.anIntArray357[local523] = Static129.anIntArray421[local23];
						continue;
					}
					if (local209 == 44) {
						local234 = local35[local29] >> 16;
						local774 = local35[local29] & 0xFFFF;
						local23--;
						local779 = Static129.anIntArray421[local23];
						if (local779 >= 0 && local779 <= 5000) {
							Static14.anIntArray29[local234] = local779;
							@Pc(799) byte local799 = -1;
							if (local774 == 105) {
								local799 = 0;
							}
							local625 = 0;
							while (true) {
								if (local779 <= local625) {
									continue label2215;
								}
								Static152.anIntArrayArray20[local234][local625] = local799;
								local625++;
							}
						}
						throw new RuntimeException();
					}
					if (local209 == 45) {
						local234 = local35[local29];
						local23--;
						local774 = Static129.anIntArray421[local23];
						if (local774 >= 0 && Static14.anIntArray29[local234] > local774) {
							Static129.anIntArray421[local23++] = Static152.anIntArrayArray20[local234][local774];
							continue;
						}
						throw new RuntimeException();
					}
					if (local209 == 46) {
						local23 -= 2;
						local234 = local35[local29];
						local774 = Static129.anIntArray421[local23];
						if (local774 >= 0 && Static14.anIntArray29[local234] > local774) {
							Static152.anIntArrayArray20[local234][local774] = Static129.anIntArray421[local23 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (local209 == 47) {
						@Pc(900) Class70 local900 = Static135.aClass70Array18[local35[local29]];
						if (local900 == null) {
							local900 = Static152.aClass70_693;
						}
						Static96.aClass70Array14[local27++] = local900;
						continue;
					}
					if (local209 == 48) {
						local523 = local35[local29];
						local27--;
						Static135.aClass70Array18[local523] = Static96.aClass70Array14[local27];
						continue;
					}
				}
				@Pc(934) boolean local934;
				if (local35[local29] == 1) {
					local934 = true;
				} else {
					local934 = false;
				}
				@Pc(1167) Class39 local1167;
				@Pc(974) Class39 local974;
				@Pc(999) int local999;
				@Pc(1092) Class39 local1092;
				@Pc(961) int local961;
				if (local209 < 300) {
					if (local209 == 100) {
						local23 -= 3;
						local774 = Static129.anIntArray421[local23];
						local779 = Static129.anIntArray421[local23 + 1];
						local961 = Static129.anIntArray421[local23 + 2];
						if (local779 == 0) {
							throw new RuntimeException();
						}
						local974 = Static128.method3227(local774);
						if (local974.aClass39Array1 == null) {
							local974.aClass39Array1 = new Class39[local961 + 1];
						}
						if (local961 >= local974.aClass39Array1.length) {
							@Pc(997) Class39[] local997 = new Class39[local961 + 1];
							for (local999 = 0; local999 < local974.aClass39Array1.length; local999++) {
								local997[local999] = local974.aClass39Array1[local999];
							}
							local974.aClass39Array1 = local997;
						}
						if (local961 > 0 && local974.aClass39Array1[local961 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local961 - 1));
						}
						@Pc(1047) Class39 local1047 = new Class39();
						local1047.aBoolean89 = true;
						local1047.anInt2344 = local961;
						local1047.anInt2325 = local1047.anInt2355 = local974.anInt2355;
						local1047.anInt2342 = local779;
						local974.aClass39Array1[local961] = local1047;
						if (local934) {
							Static169.aClass39_46 = local1047;
						} else {
							Static99.aClass39_47 = local1047;
						}
						Static171.method3407(local974);
						continue;
					}
					@Pc(1113) Class39 local1113;
					if (local209 == 101) {
						local1092 = local934 ? Static169.aClass39_46 : Static99.aClass39_47;
						if (local1092.anInt2344 == -1) {
							if (!local934) {
								throw new RuntimeException("Tried to cc_delete static active-component!");
							}
							throw new RuntimeException("Tried to .cc_delete static .active-component!");
						}
						local1113 = Static128.method3227(local1092.anInt2355);
						local1113.aClass39Array1[local1092.anInt2344] = null;
						Static171.method3407(local1113);
						continue;
					}
					if (local209 == 102) {
						local23--;
						local1092 = Static128.method3227(Static129.anIntArray421[local23]);
						local1092.aClass39Array1 = null;
						Static171.method3407(local1092);
						continue;
					}
					if (local209 == 200) {
						local23 -= 2;
						local774 = Static129.anIntArray421[local23];
						local779 = Static129.anIntArray421[local23 + 1];
						local1167 = Static44.method1103(local774, local779);
						if (local1167 != null && local779 != -1) {
							Static129.anIntArray421[local23++] = 1;
							if (local934) {
								Static169.aClass39_46 = local1167;
							} else {
								Static99.aClass39_47 = local1167;
							}
							continue;
						}
						Static129.anIntArray421[local23++] = 0;
						continue;
					}
					if (local209 == 201) {
						local23--;
						local774 = Static129.anIntArray421[local23];
						local1113 = Static128.method3227(local774);
						if (local1113 == null) {
							Static129.anIntArray421[local23++] = 0;
						} else {
							Static129.anIntArray421[local23++] = 1;
							if (local934) {
								Static169.aClass39_46 = local1113;
							} else {
								Static99.aClass39_47 = local1113;
							}
						}
						continue;
					}
				} else if (local209 < 500) {
					if (local209 == 403) {
						local23 -= 2;
						local774 = Static129.anIntArray421[local23];
						local779 = Static129.anIntArray421[local23 + 1];
						if (local774 >= 7) {
							local774 -= 7;
						}
						Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.aClass49_1.method2214(local774, local779);
						continue;
					}
					if (local209 == 404) {
						local23 -= 2;
						local774 = Static129.anIntArray421[local23];
						local779 = Static129.anIntArray421[local23 + 1];
						Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.aClass49_1.method2223(local779, local774);
						continue;
					}
					if (local209 == 410) {
						local23--;
						@Pc(7959) boolean local7959 = Static129.anIntArray421[local23] != 0;
						Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.aClass49_1.method2225(local7959);
						continue;
					}
				} else if (local209 >= 1000 && local209 < 1100 || local209 >= 2000 && local209 < 2100) {
					if (local209 >= 2000) {
						local23--;
						local1092 = Static128.method3227(Static129.anIntArray421[local23]);
						local209 -= 1000;
					} else {
						local1092 = local934 ? Static169.aClass39_46 : Static99.aClass39_47;
					}
					if (local209 == 1000) {
						local23 -= 2;
						local1092.anInt2326 = Static129.anIntArray421[local23];
						local1092.anInt2338 = Static129.anIntArray421[local23 + 1];
						Static171.method3407(local1092);
						continue;
					}
					if (local209 == 1001) {
						local23 -= 2;
						local1092.anInt2340 = Static129.anIntArray421[local23];
						local1092.anInt2369 = Static129.anIntArray421[local23 + 1];
						Static171.method3407(local1092);
						continue;
					}
					if (local209 == 1003) {
						local23--;
						@Pc(1331) boolean local1331 = Static129.anIntArray421[local23] == 1;
						if (local1331 != local1092.aBoolean83) {
							local1092.aBoolean83 = local1331;
							Static171.method3407(local1092);
						}
						continue;
					}
				} else {
					@Pc(1577) Class70 local1577;
					if (local209 >= 1100 && local209 < 1200 || local209 >= 2100 && local209 < 2200) {
						if (local209 >= 2000) {
							local23--;
							local1092 = Static128.method3227(Static129.anIntArray421[local23]);
							local209 -= 1000;
						} else {
							local1092 = local934 ? Static169.aClass39_46 : Static99.aClass39_47;
						}
						if (local209 == 1100) {
							local23 -= 2;
							local1092.anInt2354 = Static129.anIntArray421[local23];
							if (local1092.anInt2374 - local1092.anInt2340 < local1092.anInt2354) {
								local1092.anInt2354 = local1092.anInt2374 - local1092.anInt2340;
							}
							if (local1092.anInt2354 < 0) {
								local1092.anInt2354 = 0;
							}
							local1092.anInt2341 = Static129.anIntArray421[local23 + 1];
							if (local1092.anInt2341 > local1092.anInt2353 - local1092.anInt2369) {
								local1092.anInt2341 = local1092.anInt2353 - local1092.anInt2369;
							}
							if (local1092.anInt2341 < 0) {
								local1092.anInt2341 = 0;
							}
							Static171.method3407(local1092);
							continue;
						}
						if (local209 == 1101) {
							local23--;
							local1092.anInt2380 = Static129.anIntArray421[local23];
							Static171.method3407(local1092);
							continue;
						}
						if (local209 == 1102) {
							local23--;
							local1092.aBoolean84 = Static129.anIntArray421[local23] == 1;
							Static171.method3407(local1092);
							continue;
						}
						if (local209 == 1103) {
							local23--;
							local1092.anInt2368 = Static129.anIntArray421[local23];
							Static171.method3407(local1092);
							continue;
						}
						if (local209 == 1104) {
							local23--;
							local1092.anInt2388 = Static129.anIntArray421[local23];
							Static171.method3407(local1092);
							continue;
						}
						if (local209 == 1105) {
							local23--;
							local1092.anInt2330 = Static129.anIntArray421[local23];
							Static171.method3407(local1092);
							continue;
						}
						if (local209 == 1106) {
							local23--;
							local1092.anInt2382 = Static129.anIntArray421[local23];
							Static171.method3407(local1092);
							continue;
						}
						if (local209 == 1107) {
							local23--;
							local1092.aBoolean78 = Static129.anIntArray421[local23] == 1;
							Static171.method3407(local1092);
							continue;
						}
						if (local209 == 1108) {
							local1092.anInt2370 = 1;
							local23--;
							local1092.anInt2358 = Static129.anIntArray421[local23];
							Static171.method3407(local1092);
							continue;
						}
						if (local209 == 1109) {
							local23 -= 6;
							local1092.anInt2345 = Static129.anIntArray421[local23];
							local1092.anInt2359 = Static129.anIntArray421[local23 + 1];
							local1092.anInt2336 = Static129.anIntArray421[local23 + 2];
							local1092.anInt2334 = Static129.anIntArray421[local23 + 3];
							local1092.anInt2335 = Static129.anIntArray421[local23 + 4];
							local1092.anInt2363 = Static129.anIntArray421[local23 + 5];
							Static171.method3407(local1092);
							continue;
						}
						if (local209 == 1110) {
							local23--;
							local779 = Static129.anIntArray421[local23];
							if (local779 != local1092.anInt2378) {
								local1092.anInt2319 = 0;
								local1092.anInt2378 = local779;
								local1092.anInt2357 = 0;
								Static171.method3407(local1092);
							}
							continue;
						}
						if (local209 == 1111) {
							local23--;
							local1092.aBoolean82 = Static129.anIntArray421[local23] == 1;
							Static171.method3407(local1092);
							continue;
						}
						if (local209 == 1112) {
							local27--;
							local1577 = Static96.aClass70Array14[local27];
							if (!local1577.method2910(local1092.aClass70_772)) {
								local1092.aClass70_772 = local1577;
								Static171.method3407(local1092);
							}
							continue;
						}
						if (local209 == 1113) {
							local23--;
							local1092.anInt2337 = Static129.anIntArray421[local23];
							Static171.method3407(local1092);
							continue;
						}
						if (local209 == 1114) {
							local23 -= 3;
							local1092.anInt2394 = Static129.anIntArray421[local23];
							local1092.anInt2328 = Static129.anIntArray421[local23 + 1];
							local1092.anInt2385 = Static129.anIntArray421[local23 + 2];
							Static171.method3407(local1092);
							continue;
						}
						if (local209 == 1115) {
							local23--;
							local1092.aBoolean86 = Static129.anIntArray421[local23] == 1;
							Static171.method3407(local1092);
							continue;
						}
						if (local209 == 1116) {
							local23--;
							local1092.anInt2391 = Static129.anIntArray421[local23];
							Static171.method3407(local1092);
							continue;
						}
						if (local209 == 1117) {
							local23--;
							local1092.anInt2362 = Static129.anIntArray421[local23];
							Static171.method3407(local1092);
							continue;
						}
						if (local209 == 1118) {
							local23--;
							local1092.aBoolean79 = Static129.anIntArray421[local23] == 1;
							Static171.method3407(local1092);
							continue;
						}
						if (local209 == 1119) {
							local23--;
							local1092.aBoolean80 = Static129.anIntArray421[local23] == 1;
							Static171.method3407(local1092);
							continue;
						}
						if (local209 == 1120) {
							local23 -= 2;
							local1092.anInt2374 = Static129.anIntArray421[local23];
							local1092.anInt2353 = Static129.anIntArray421[local23 + 1];
							Static171.method3407(local1092);
							continue;
						}
					} else if (local209 >= 1200 && local209 < 1300 || !(local209 < 2200 || local209 >= 2300)) {
						if (local209 < 2000) {
							local1092 = local934 ? Static169.aClass39_46 : Static99.aClass39_47;
						} else {
							local209 -= 1000;
							local23--;
							local1092 = Static128.method3227(Static129.anIntArray421[local23]);
						}
						Static171.method3407(local1092);
						if (local209 == 1200) {
							local23 -= 2;
							local961 = Static129.anIntArray421[local23 + 1];
							local779 = Static129.anIntArray421[local23];
							if (local779 == -1) {
								local1092.anInt2358 = -1;
								local1092.anInt2370 = 1;
								local1092.anInt2373 = -1;
							} else {
								local1092.anInt2360 = local961;
								local1092.anInt2373 = local779;
								@Pc(7285) Class1_Sub1_Sub2 local7285 = Static90.method1963(local779);
								local1092.anInt2345 = local7285.anInt166;
								local1092.anInt2363 = local7285.anInt188;
								local1092.anInt2335 = local7285.anInt191;
								if (local1092.anInt2340 > 0) {
									local1092.anInt2363 = local1092.anInt2363 * 32 / local1092.anInt2340;
								}
								local1092.anInt2334 = local7285.anInt170;
								local1092.anInt2359 = local7285.anInt171;
								local1092.anInt2336 = local7285.anInt181;
							}
							continue;
						}
						if (local209 == 1201) {
							local1092.anInt2370 = 2;
							local23--;
							local1092.anInt2358 = Static129.anIntArray421[local23];
							continue;
						}
						if (local209 == 1202) {
							local1092.anInt2370 = 3;
							local1092.anInt2358 = Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.aClass49_1.method2220();
							continue;
						}
						if (local209 == 1203) {
							local1092.anInt2370 = 6;
							local23--;
							local1092.anInt2358 = Static129.anIntArray421[local23];
							continue;
						}
						if (local209 == 1204) {
							local1092.anInt2370 = 5;
							local23--;
							local1092.anInt2358 = Static129.anIntArray421[local23];
							continue;
						}
					} else if ((local209 < 1300 || local209 >= 1400) && (local209 < 2300 || local209 >= 2400)) {
						if (local209 >= 1400 && local209 < 1500 || local209 >= 2400 && local209 < 2500) {
							if (local209 < 2000) {
								local1092 = local934 ? Static169.aClass39_46 : Static99.aClass39_47;
							} else {
								local209 -= 1000;
								local23--;
								local1092 = Static128.method3227(Static129.anIntArray421[local23]);
							}
							local27--;
							local1577 = Static96.aClass70Array14[local27];
							@Pc(1579) int[] local1579 = null;
							if (local1577.method2896() > 0 && local1577.method2899(local1577.method2896() - 1) == 89) {
								local23--;
								local625 = Static129.anIntArray421[local23];
								if (local625 > 0) {
									local1579 = new int[local625];
									while (local625-- > 0) {
										local23--;
										local1579[local625] = Static129.anIntArray421[local23];
									}
								}
								local1577 = local1577.method2903(local1577.method2896() - 1, 0);
							}
							@Pc(1636) Object[] local1636 = new Object[local1577.method2896() + 1];
							for (local649 = local1636.length - 1; local649 >= 1; local649--) {
								if (local1577.method2899(local649 - 1) == 115) {
									local27--;
									local1636[local649] = Static96.aClass70Array14[local27];
								} else {
									local23--;
									local1636[local649] = Integer.valueOf(Static129.anIntArray421[local23]);
								}
							}
							local23--;
							local999 = Static129.anIntArray421[local23];
							if (local999 == -1) {
								local1636 = null;
							} else {
								local1636[0] = Integer.valueOf(local999);
							}
							if (local209 == 1423) {
								local1092.anObjectArray2 = local1636;
							}
							if (local209 == 1407) {
								local1092.anIntArray226 = local1579;
								local1092.anObjectArray19 = local1636;
							}
							if (local209 == 1416) {
								local1092.anObjectArray9 = local1636;
							}
							if (local209 == 1421) {
								local1092.anObjectArray26 = local1636;
							}
							if (local209 == 1405) {
								local1092.anObjectArray18 = local1636;
							}
							if (local209 == 1412) {
								local1092.anObjectArray17 = local1636;
							}
							if (local209 == 1415) {
								local1092.anIntArray232 = local1579;
								local1092.anObjectArray24 = local1636;
							}
							if (local209 == 1401) {
								local1092.anObjectArray13 = local1636;
							}
							if (local209 == 1406) {
								local1092.anObjectArray3 = local1636;
							}
							if (local209 == 1419) {
								local1092.anObjectArray4 = local1636;
							}
							if (local209 == 1420) {
								local1092.anObjectArray11 = local1636;
							}
							local1092.aBoolean85 = true;
							if (local209 == 1414) {
								local1092.anIntArray225 = local1579;
								local1092.anObjectArray5 = local1636;
							}
							if (local209 == 1418) {
								local1092.anObjectArray6 = local1636;
							}
							if (local209 == 1402) {
								local1092.anObjectArray12 = local1636;
							}
							if (local209 == 1425) {
								local1092.anObjectArray25 = local1636;
							}
							if (local209 == 1404) {
								local1092.anObjectArray23 = local1636;
							}
							if (local209 == 1408) {
								local1092.anObjectArray8 = local1636;
							}
							if (local209 == 1409) {
								local1092.anObjectArray15 = local1636;
							}
							if (local209 == 1422) {
								local1092.anObjectArray7 = local1636;
							}
							if (local209 == 1417) {
								local1092.anObjectArray21 = local1636;
							}
							if (local209 == 1424) {
								local1092.anObjectArray22 = local1636;
							}
							if (local209 == 1410) {
								local1092.anObjectArray14 = local1636;
							}
							if (local209 == 1411) {
								local1092.anObjectArray1 = local1636;
							}
							if (local209 == 1403) {
								local1092.anObjectArray20 = local1636;
							}
							if (local209 == 1400) {
								local1092.anObjectArray10 = local1636;
							}
							continue;
						}
						if (local209 < 1600) {
							local1092 = local934 ? Static169.aClass39_46 : Static99.aClass39_47;
							if (local209 == 1500) {
								Static129.anIntArray421[local23++] = local1092.anInt2326;
								continue;
							}
							if (local209 == 1501) {
								Static129.anIntArray421[local23++] = local1092.anInt2338;
								continue;
							}
							if (local209 == 1502) {
								Static129.anIntArray421[local23++] = local1092.anInt2340;
								continue;
							}
							if (local209 == 1503) {
								Static129.anIntArray421[local23++] = local1092.anInt2369;
								continue;
							}
							if (local209 == 1504) {
								Static129.anIntArray421[local23++] = local1092.aBoolean83 ? 1 : 0;
								continue;
							}
							if (local209 == 1505) {
								Static129.anIntArray421[local23++] = local1092.anInt2325;
								continue;
							}
						} else if (local209 < 1700) {
							local1092 = local934 ? Static169.aClass39_46 : Static99.aClass39_47;
							if (local209 == 1600) {
								Static129.anIntArray421[local23++] = local1092.anInt2354;
								continue;
							}
							if (local209 == 1601) {
								Static129.anIntArray421[local23++] = local1092.anInt2341;
								continue;
							}
							if (local209 == 1602) {
								Static96.aClass70Array14[local27++] = local1092.aClass70_772;
								continue;
							}
							if (local209 == 1603) {
								Static129.anIntArray421[local23++] = local1092.anInt2374;
								continue;
							}
							if (local209 == 1604) {
								Static129.anIntArray421[local23++] = local1092.anInt2353;
								continue;
							}
							if (local209 == 1605) {
								Static129.anIntArray421[local23++] = local1092.anInt2363;
								continue;
							}
							if (local209 == 1606) {
								Static129.anIntArray421[local23++] = local1092.anInt2336;
								continue;
							}
							if (local209 == 1607) {
								Static129.anIntArray421[local23++] = local1092.anInt2335;
								continue;
							}
							if (local209 == 1608) {
								Static129.anIntArray421[local23++] = local1092.anInt2334;
								continue;
							}
							if (local209 == 1609) {
								Static129.anIntArray421[local23++] = local1092.anInt2368;
								continue;
							}
						} else if (local209 < 1800) {
							local1092 = local934 ? Static169.aClass39_46 : Static99.aClass39_47;
							if (local209 == 1700) {
								Static129.anIntArray421[local23++] = local1092.anInt2373;
								continue;
							}
							if (local209 == 1701) {
								if (local1092.anInt2373 == -1) {
									Static129.anIntArray421[local23++] = 0;
								} else {
									Static129.anIntArray421[local23++] = local1092.anInt2360;
								}
								continue;
							}
							if (local209 == 1702) {
								Static129.anIntArray421[local23++] = local1092.anInt2344;
								continue;
							}
						} else if (local209 < 1900) {
							local1092 = local934 ? Static169.aClass39_46 : Static99.aClass39_47;
							if (local209 == 1800) {
								Static129.anIntArray421[local23++] = Static81.method1836(Static20.method439(local1092));
								continue;
							}
							if (local209 == 1801) {
								local23--;
								local779 = Static129.anIntArray421[local23];
								local779--;
								if (local1092.aClass70Array11 != null && local779 < local1092.aClass70Array11.length && local1092.aClass70Array11[local779] != null) {
									Static96.aClass70Array14[local27++] = local1092.aClass70Array11[local779];
									continue;
								}
								Static96.aClass70Array14[local27++] = Static19.aClass70_187;
								continue;
							}
							if (local209 == 1802) {
								if (local1092.aClass70_774 == null) {
									Static96.aClass70Array14[local27++] = Static19.aClass70_187;
								} else {
									Static96.aClass70Array14[local27++] = local1092.aClass70_774;
								}
								continue;
							}
						} else if (local209 < 2600) {
							local23--;
							local1092 = Static128.method3227(Static129.anIntArray421[local23]);
							if (local209 == 2500) {
								Static129.anIntArray421[local23++] = local1092.anInt2326;
								continue;
							}
							if (local209 == 2501) {
								Static129.anIntArray421[local23++] = local1092.anInt2338;
								continue;
							}
							if (local209 == 2502) {
								Static129.anIntArray421[local23++] = local1092.anInt2340;
								continue;
							}
							if (local209 == 2503) {
								Static129.anIntArray421[local23++] = local1092.anInt2369;
								continue;
							}
							if (local209 == 2504) {
								Static129.anIntArray421[local23++] = local1092.aBoolean83 ? 1 : 0;
								continue;
							}
							if (local209 == 2505) {
								Static129.anIntArray421[local23++] = local1092.anInt2325;
								continue;
							}
						} else if (local209 < 2700) {
							local23--;
							local1092 = Static128.method3227(Static129.anIntArray421[local23]);
							if (local209 == 2600) {
								Static129.anIntArray421[local23++] = local1092.anInt2354;
								continue;
							}
							if (local209 == 2601) {
								Static129.anIntArray421[local23++] = local1092.anInt2341;
								continue;
							}
							if (local209 == 2602) {
								Static96.aClass70Array14[local27++] = local1092.aClass70_772;
								continue;
							}
							if (local209 == 2603) {
								Static129.anIntArray421[local23++] = local1092.anInt2374;
								continue;
							}
							if (local209 == 2604) {
								Static129.anIntArray421[local23++] = local1092.anInt2353;
								continue;
							}
							if (local209 == 2605) {
								Static129.anIntArray421[local23++] = local1092.anInt2363;
								continue;
							}
							if (local209 == 2606) {
								Static129.anIntArray421[local23++] = local1092.anInt2336;
								continue;
							}
							if (local209 == 2607) {
								Static129.anIntArray421[local23++] = local1092.anInt2335;
								continue;
							}
							if (local209 == 2608) {
								Static129.anIntArray421[local23++] = local1092.anInt2334;
								continue;
							}
							if (local209 == 2609) {
								Static129.anIntArray421[local23++] = local1092.anInt2368;
								continue;
							}
						} else if (local209 < 2800) {
							if (local209 == 2700) {
								local23--;
								local1092 = Static128.method3227(Static129.anIntArray421[local23]);
								Static129.anIntArray421[local23++] = local1092.anInt2373;
								continue;
							}
							if (local209 == 2701) {
								local23--;
								local1092 = Static128.method3227(Static129.anIntArray421[local23]);
								if (local1092.anInt2373 == -1) {
									Static129.anIntArray421[local23++] = 0;
								} else {
									Static129.anIntArray421[local23++] = local1092.anInt2360;
								}
								continue;
							}
							if (local209 == 2702) {
								local23--;
								local774 = Static129.anIntArray421[local23];
								@Pc(6895) Class1_Sub14 local6895 = (Class1_Sub14) Static128.aClass30_14.method1467((long) local774);
								if (local6895 == null) {
									Static129.anIntArray421[local23++] = 0;
								} else {
									Static129.anIntArray421[local23++] = 1;
								}
								continue;
							}
							if (local209 == 2703) {
								local23--;
								local1092 = Static128.method3227(Static129.anIntArray421[local23]);
								if (local1092.aClass39Array1 == null) {
									Static129.anIntArray421[local23++] = 0;
									continue;
								}
								local779 = local1092.aClass39Array1.length;
								for (local961 = 0; local961 < local1092.aClass39Array1.length; local961++) {
									if (local1092.aClass39Array1[local961] == null) {
										local779 = local961;
										break;
									}
								}
								Static129.anIntArray421[local23++] = local779;
								continue;
							}
							if (local209 == 2704 || local209 == 2705) {
								local23 -= 2;
								local774 = Static129.anIntArray421[local23];
								local779 = Static129.anIntArray421[local23 + 1];
								@Pc(6991) Class1_Sub14 local6991 = (Class1_Sub14) Static128.aClass30_14.method1467((long) local774);
								if (local6991 != null && local6991.anInt2467 == local779) {
									Static129.anIntArray421[local23++] = 1;
									continue;
								}
								Static129.anIntArray421[local23++] = 0;
								continue;
							}
						} else if (local209 < 2900) {
							local23--;
							local1092 = Static128.method3227(Static129.anIntArray421[local23]);
							if (local209 == 2800) {
								Static129.anIntArray421[local23++] = Static81.method1836(Static20.method439(local1092));
								continue;
							}
							if (local209 == 2801) {
								local23--;
								local779 = Static129.anIntArray421[local23];
								local779--;
								if (local1092.aClass70Array11 != null && local1092.aClass70Array11.length > local779 && local1092.aClass70Array11[local779] != null) {
									Static96.aClass70Array14[local27++] = local1092.aClass70Array11[local779];
									continue;
								}
								Static96.aClass70Array14[local27++] = Static19.aClass70_187;
								continue;
							}
							if (local209 == 2802) {
								if (local1092.aClass70_774 == null) {
									Static96.aClass70Array14[local27++] = Static19.aClass70_187;
								} else {
									Static96.aClass70Array14[local27++] = local1092.aClass70_774;
								}
								continue;
							}
						} else if (local209 < 3200) {
							if (local209 == 3100) {
								local27--;
								local581 = Static96.aClass70Array14[local27];
								Static41.method1036(local581, Static19.aClass70_187, 0);
								continue;
							}
							if (local209 == 3101) {
								local23 -= 2;
								Static37.method958(Static129.anIntArray421[local23], Static129.anIntArray421[local23 + 1], Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1);
								continue;
							}
							if (local209 == 3103) {
								Static90.method1964();
								continue;
							}
							if (local209 == 3104) {
								local27--;
								local581 = Static96.aClass70Array14[local27];
								local779 = 0;
								if (local581.method2909()) {
									local779 = local581.method2892();
								}
								Static131.aClass1_Sub9_Sub1_3.method1283(135);
								Static131.aClass1_Sub9_Sub1_3.method1259(local779);
								continue;
							}
							if (local209 == 3105) {
								local27--;
								local581 = Static96.aClass70Array14[local27];
								Static131.aClass1_Sub9_Sub1_3.method1283(153);
								Static131.aClass1_Sub9_Sub1_3.method1263(local581.method2925());
								continue;
							}
							if (local209 == 3106) {
								local27--;
								local581 = Static96.aClass70Array14[local27];
								Static131.aClass1_Sub9_Sub1_3.method1283(239);
								Static131.aClass1_Sub9_Sub1_3.method1260(local581.method2896() + 1);
								Static131.aClass1_Sub9_Sub1_3.method1232(local581);
								continue;
							}
							if (local209 == 3107) {
								local23--;
								local774 = Static129.anIntArray421[local23];
								local27--;
								local1577 = Static96.aClass70Array14[local27];
								Static68.method1565(local1577, local774);
								continue;
							}
							if (local209 == 3108) {
								local23 -= 3;
								local779 = Static129.anIntArray421[local23 + 1];
								local961 = Static129.anIntArray421[local23 + 2];
								local774 = Static129.anIntArray421[local23];
								local974 = Static128.method3227(local961);
								Static38.method975(local774, local779, local974);
								continue;
							}
							if (local209 == 3109) {
								local23 -= 2;
								local774 = Static129.anIntArray421[local23];
								local1167 = local934 ? Static169.aClass39_46 : Static99.aClass39_47;
								local779 = Static129.anIntArray421[local23 + 1];
								Static38.method975(local774, local779, local1167);
								continue;
							}
							if (local209 == 3110) {
								local23--;
								local774 = Static129.anIntArray421[local23];
								Static131.aClass1_Sub9_Sub1_3.method1283(90);
								Static131.aClass1_Sub9_Sub1_3.method1236(local774);
								continue;
							}
						} else if (local209 < 3300) {
							if (local209 == 3200) {
								local23 -= 3;
								Static156.method3140(Static129.anIntArray421[local23], Static129.anIntArray421[local23 + 2], Static129.anIntArray421[local23 + 1]);
								continue;
							}
							if (local209 == 3201) {
								local23--;
								Static55.method1370(Static129.anIntArray421[local23]);
								continue;
							}
							if (local209 == 3202) {
								local23 -= 2;
								Static100.method2117(Static129.anIntArray421[local23 + 1], Static129.anIntArray421[local23]);
								continue;
							}
						} else if (local209 < 3400) {
							if (local209 == 3300) {
								Static129.anIntArray421[local23++] = Static47.anInt1654;
								continue;
							}
							if (local209 == 3301) {
								local23 -= 2;
								local774 = Static129.anIntArray421[local23];
								local779 = Static129.anIntArray421[local23 + 1];
								Static129.anIntArray421[local23++] = Static171.method3404(local774, local779);
								continue;
							}
							if (local209 == 3302) {
								local23 -= 2;
								local779 = Static129.anIntArray421[local23 + 1];
								local774 = Static129.anIntArray421[local23];
								Static129.anIntArray421[local23++] = Static125.method2532(local774, local779);
								continue;
							}
							if (local209 == 3303) {
								local23 -= 2;
								local779 = Static129.anIntArray421[local23 + 1];
								local774 = Static129.anIntArray421[local23];
								Static129.anIntArray421[local23++] = Static69.method1571(local779, local774);
								continue;
							}
							if (local209 == 3304) {
								local23--;
								local774 = Static129.anIntArray421[local23];
								Static129.anIntArray421[local23++] = Static105.method2208(local774).anInt3338;
								continue;
							}
							if (local209 == 3305) {
								local23--;
								local774 = Static129.anIntArray421[local23];
								Static129.anIntArray421[local23++] = Static85.anIntArray246[local774];
								continue;
							}
							if (local209 == 3306) {
								local23--;
								local774 = Static129.anIntArray421[local23];
								Static129.anIntArray421[local23++] = Static164.anIntArray407[local774];
								continue;
							}
							if (local209 == 3307) {
								local23--;
								local774 = Static129.anIntArray421[local23];
								Static129.anIntArray421[local23++] = Static10.anIntArray24[local774];
								continue;
							}
							if (local209 == 3308) {
								local774 = Static56.anInt1784;
								local779 = Static154.anInt4068 + (Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anInt2030 >> 7);
								local961 = (Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anInt2001 >> 7) + Static64.anInt987;
								Static129.anIntArray421[local23++] = (local774 << 28) + (local779 << 14) + local961;
								continue;
							}
							if (local209 == 3309) {
								local23--;
								local774 = Static129.anIntArray421[local23];
								Static129.anIntArray421[local23++] = local774 >> 14 & 0x3FFF;
								continue;
							}
							if (local209 == 3310) {
								local23--;
								local774 = Static129.anIntArray421[local23];
								Static129.anIntArray421[local23++] = local774 >> 28;
								continue;
							}
							if (local209 == 3311) {
								local23--;
								local774 = Static129.anIntArray421[local23];
								Static129.anIntArray421[local23++] = local774 & 0x3FFF;
								continue;
							}
							if (local209 == 3312) {
								Static129.anIntArray421[local23++] = Static133.aBoolean136 ? 1 : 0;
								continue;
							}
							if (local209 == 3313) {
								local23 -= 2;
								local774 = Static129.anIntArray421[local23] + 32768;
								local779 = Static129.anIntArray421[local23 + 1];
								Static129.anIntArray421[local23++] = Static171.method3404(local774, local779);
								continue;
							}
							if (local209 == 3314) {
								local23 -= 2;
								local779 = Static129.anIntArray421[local23 + 1];
								local774 = Static129.anIntArray421[local23] + 32768;
								Static129.anIntArray421[local23++] = Static125.method2532(local774, local779);
								continue;
							}
							if (local209 == 3315) {
								local23 -= 2;
								local774 = Static129.anIntArray421[local23] + 32768;
								local779 = Static129.anIntArray421[local23 + 1];
								Static129.anIntArray421[local23++] = Static69.method1571(local779, local774);
								continue;
							}
							if (local209 == 3316) {
								if (Static20.anInt551 >= 2) {
									Static129.anIntArray421[local23++] = Static20.anInt551;
								} else {
									Static129.anIntArray421[local23++] = 0;
								}
								continue;
							}
							if (local209 == 3317) {
								Static129.anIntArray421[local23++] = Static166.anInt4305;
								continue;
							}
							if (local209 == 3318) {
								Static129.anIntArray421[local23++] = Static26.anInt708;
								continue;
							}
							if (local209 == 3321) {
								Static129.anIntArray421[local23++] = Static54.anInt1755;
								continue;
							}
							if (local209 == 3322) {
								Static129.anIntArray421[local23++] = Static37.anInt1313;
								continue;
							}
							if (local209 == 3323) {
								if (Static20.anInt551 == 1) {
									Static129.anIntArray421[local23++] = 1;
								} else {
									Static129.anIntArray421[local23++] = 0;
								}
								continue;
							}
							if (local209 == 3324) {
								if (Static61.anInt1952 >= 5 && Static61.anInt1952 <= 9) {
									Static129.anIntArray421[local23++] = Static61.anInt1952;
									continue;
								}
								Static129.anIntArray421[local23++] = 0;
								continue;
							}
							if (local209 == 3325) {
								if (Static143.anInt3770 <= 0) {
									Static129.anIntArray421[local23++] = 0;
								} else {
									Static129.anIntArray421[local23++] = 1;
								}
								continue;
							}
							if (local209 == 3326) {
								Static129.anIntArray421[local23++] = Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anInt1293;
								continue;
							}
							if (local209 == 3327) {
								Static129.anIntArray421[local23++] = Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.aClass49_1.aBoolean123 ? 1 : 0;
								continue;
							}
						} else if (local209 < 3500) {
							if (local209 == 3400) {
								local23 -= 2;
								local774 = Static129.anIntArray421[local23];
								local779 = Static129.anIntArray421[local23 + 1];
								@Pc(5901) Class1_Sub1_Sub6 local5901 = Static152.method1613(local774);
								for (local625 = 0; local625 < local5901.anInt1400; local625++) {
									if (local5901.anIntArray129[local625] == local779) {
										Static96.aClass70Array14[local27++] = local5901.aClass70Array7[local625];
										local5901 = null;
										break;
									}
								}
								if (local5901 != null) {
									Static96.aClass70Array14[local27++] = local5901.aClass70_453;
								}
								continue;
							}
							if (local209 == 3408) {
								local23 -= 4;
								local961 = Static129.anIntArray421[local23 + 2];
								local625 = Static129.anIntArray421[local23 + 3];
								local774 = Static129.anIntArray421[local23];
								local779 = Static129.anIntArray421[local23 + 1];
								@Pc(5977) Class1_Sub1_Sub6 local5977 = Static152.method1613(local961);
								if (local774 == local5977.anInt1392 && local779 == local5977.anInt1401) {
									for (local999 = 0; local999 < local5977.anInt1400; local999++) {
										if (local5977.anIntArray129[local999] == local625) {
											if (local779 == 115) {
												Static96.aClass70Array14[local27++] = local5977.aClass70Array7[local999];
											} else {
												Static129.anIntArray421[local23++] = local5977.anIntArray130[local999];
											}
											local5977 = null;
											break;
										}
									}
									if (local5977 != null) {
										if (local779 == 115) {
											Static96.aClass70Array14[local27++] = local5977.aClass70_453;
										} else {
											Static129.anIntArray421[local23++] = local5977.anInt1397;
										}
									}
									continue;
								}
								if (local779 == 115) {
									Static96.aClass70Array14[local27++] = Static152.aClass70_693;
								} else {
									Static129.anIntArray421[local23++] = 0;
								}
								continue;
							}
						} else if (local209 < 3700) {
							if (local209 == 3600) {
								if (Static5.anInt212 == 0) {
									Static129.anIntArray421[local23++] = -2;
								} else if (Static5.anInt212 == 1) {
									Static129.anIntArray421[local23++] = -1;
								} else {
									Static129.anIntArray421[local23++] = Static164.anInt4267;
								}
								continue;
							}
							if (local209 == 3601) {
								local23--;
								local774 = Static129.anIntArray421[local23];
								if (Static5.anInt212 == 2 && Static164.anInt4267 > local774) {
									Static96.aClass70Array14[local27++] = Static80.aClass70Array13[local774];
									continue;
								}
								Static96.aClass70Array14[local27++] = Static19.aClass70_187;
								continue;
							}
							if (local209 == 3602) {
								local23--;
								local774 = Static129.anIntArray421[local23];
								if (Static5.anInt212 == 2 && local774 < Static164.anInt4267) {
									Static129.anIntArray421[local23++] = Static107.anIntArray296[local774];
									continue;
								}
								Static129.anIntArray421[local23++] = 0;
								continue;
							}
							if (local209 == 3603) {
								local23--;
								local774 = Static129.anIntArray421[local23];
								if (Static5.anInt212 == 2 && local774 < Static164.anInt4267) {
									Static129.anIntArray421[local23++] = Static48.anIntArray168[local774];
									continue;
								}
								Static129.anIntArray421[local23++] = 0;
								continue;
							}
							if (local209 == 3604) {
								local23--;
								local779 = Static129.anIntArray421[local23];
								local27--;
								local581 = Static96.aClass70Array14[local27];
								Static82.method1864(local581, local779);
								continue;
							}
							if (local209 == 3605) {
								local27--;
								local581 = Static96.aClass70Array14[local27];
								Static146.method2859(local581.method2925());
								continue;
							}
							if (local209 == 3606) {
								local27--;
								local581 = Static96.aClass70Array14[local27];
								Static70.method1601(local581.method2925());
								continue;
							}
							if (local209 == 3607) {
								local27--;
								local581 = Static96.aClass70Array14[local27];
								Static88.method1931(local581.method2925());
								continue;
							}
							if (local209 == 3608) {
								local27--;
								local581 = Static96.aClass70Array14[local27];
								Static18.method409(local581.method2925());
								continue;
							}
							if (local209 == 3609) {
								local27--;
								local581 = Static96.aClass70Array14[local27];
								if (local581.method2891(Static160.aClass70_1421) || local581.method2891(Static42.aClass70_460)) {
									local581 = local581.method2906(7);
								}
								Static129.anIntArray421[local23++] = Static31.method790(local581) ? 1 : 0;
								continue;
							}
							if (local209 == 3611) {
								if (Static61.aClass70_609 == null) {
									Static96.aClass70Array14[local27++] = Static19.aClass70_187;
								} else {
									Static96.aClass70Array14[local27++] = Static61.aClass70_609.method2898();
								}
								continue;
							}
							if (local209 == 3612) {
								if (Static61.aClass70_609 == null) {
									Static129.anIntArray421[local23++] = 0;
								} else {
									Static129.anIntArray421[local23++] = Static70.anInt2162;
								}
								continue;
							}
							if (local209 == 3613) {
								local23--;
								local774 = Static129.anIntArray421[local23];
								if (Static61.aClass70_609 != null && Static70.anInt2162 > local774) {
									Static96.aClass70Array14[local27++] = Static157.aClass1_Sub25Array3[local774].aClass70_1580.method2898();
									continue;
								}
								Static96.aClass70Array14[local27++] = Static19.aClass70_187;
								continue;
							}
							if (local209 == 3614) {
								local23--;
								local774 = Static129.anIntArray421[local23];
								if (Static61.aClass70_609 != null && Static70.anInt2162 > local774) {
									Static129.anIntArray421[local23++] = Static157.aClass1_Sub25Array3[local774].anInt4531;
									continue;
								}
								Static129.anIntArray421[local23++] = 0;
								continue;
							}
							if (local209 == 3615) {
								local23--;
								local774 = Static129.anIntArray421[local23];
								if (Static61.aClass70_609 != null && local774 < Static70.anInt2162) {
									Static129.anIntArray421[local23++] = Static157.aClass1_Sub25Array3[local774].aByte9;
									continue;
								}
								Static129.anIntArray421[local23++] = 0;
								continue;
							}
							if (local209 == 3616) {
								Static129.anIntArray421[local23++] = Static143.aByte6;
								continue;
							}
							if (local209 == 3617) {
								local27--;
								local581 = Static96.aClass70Array14[local27];
								Static16.method387(local581);
								continue;
							}
							if (local209 == 3618) {
								Static129.anIntArray421[local23++] = Static181.aByte8;
								continue;
							}
							if (local209 == 3619) {
								local27--;
								local581 = Static96.aClass70Array14[local27];
								Static65.method1522(local581.method2925());
								continue;
							}
							if (local209 == 3620) {
								Static63.method1486();
								continue;
							}
							if (local209 == 3621) {
								if (Static5.anInt212 == 0) {
									Static129.anIntArray421[local23++] = -1;
								} else {
									Static129.anIntArray421[local23++] = Static25.anInt695;
								}
								continue;
							}
							if (local209 == 3622) {
								local23--;
								local774 = Static129.anIntArray421[local23];
								if (Static5.anInt212 != 0 && Static25.anInt695 > local774) {
									Static96.aClass70Array14[local27++] = Static108.method2267(Static120.aLongArray7[local774]).method2898();
									continue;
								}
								Static96.aClass70Array14[local27++] = Static19.aClass70_187;
								continue;
							}
							if (local209 == 3623) {
								local27--;
								local581 = Static96.aClass70Array14[local27];
								if (local581.method2891(Static160.aClass70_1421) || local581.method2891(Static42.aClass70_460)) {
									local581 = local581.method2906(7);
								}
								Static129.anIntArray421[local23++] = Static72.method1658(local581) ? 1 : 0;
								continue;
							}
							if (local209 == 3624) {
								local23--;
								local774 = Static129.anIntArray421[local23];
								if (Static157.aClass1_Sub25Array3 != null && Static70.anInt2162 > local774 && Static157.aClass1_Sub25Array3[local774].aClass70_1580.method2905(Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.aClass70_408)) {
									Static129.anIntArray421[local23++] = 1;
									continue;
								}
								Static129.anIntArray421[local23++] = 0;
								continue;
							}
							if (local209 == 3625) {
								if (Static105.aClass70_966 == null) {
									Static96.aClass70Array14[local27++] = Static19.aClass70_187;
								} else {
									Static96.aClass70Array14[local27++] = Static105.aClass70_966.method2898();
								}
								continue;
							}
						} else if (local209 < 4000) {
							if (local209 == 3903) {
								local23--;
								local774 = Static129.anIntArray421[local23];
								Static129.anIntArray421[local23++] = Static66.aClass29Array1[local774].method1377();
								continue;
							}
							if (local209 == 3904) {
								local23--;
								local774 = Static129.anIntArray421[local23];
								Static129.anIntArray421[local23++] = Static66.aClass29Array1[local774].anInt1787;
								continue;
							}
							if (local209 == 3905) {
								local23--;
								local774 = Static129.anIntArray421[local23];
								Static129.anIntArray421[local23++] = Static66.aClass29Array1[local774].anInt1782;
								continue;
							}
							if (local209 == 3906) {
								local23--;
								local774 = Static129.anIntArray421[local23];
								Static129.anIntArray421[local23++] = Static66.aClass29Array1[local774].anInt1783;
								continue;
							}
							if (local209 == 3907) {
								local23--;
								local774 = Static129.anIntArray421[local23];
								Static129.anIntArray421[local23++] = Static66.aClass29Array1[local774].anInt1786;
								continue;
							}
							if (local209 == 3908) {
								local23--;
								local774 = Static129.anIntArray421[local23];
								Static129.anIntArray421[local23++] = Static66.aClass29Array1[local774].anInt1780;
								continue;
							}
							if (local209 == 3910) {
								local23--;
								local774 = Static129.anIntArray421[local23];
								local779 = Static66.aClass29Array1[local774].method1375();
								Static129.anIntArray421[local23++] = local779 == 0 ? 1 : 0;
								continue;
							}
							if (local209 == 3911) {
								local23--;
								local774 = Static129.anIntArray421[local23];
								local779 = Static66.aClass29Array1[local774].method1375();
								Static129.anIntArray421[local23++] = local779 == 2 ? 1 : 0;
								continue;
							}
							if (local209 == 3912) {
								local23--;
								local774 = Static129.anIntArray421[local23];
								local779 = Static66.aClass29Array1[local774].method1375();
								Static129.anIntArray421[local23++] = local779 == 5 ? 1 : 0;
								continue;
							}
							if (local209 == 3913) {
								local23--;
								local774 = Static129.anIntArray421[local23];
								local779 = Static66.aClass29Array1[local774].method1375();
								Static129.anIntArray421[local23++] = local779 == 1 ? 1 : 0;
								continue;
							}
						} else if (local209 < 4100) {
							if (local209 == 4000) {
								local23 -= 2;
								local779 = Static129.anIntArray421[local23 + 1];
								local774 = Static129.anIntArray421[local23];
								Static129.anIntArray421[local23++] = local779 + local774;
								continue;
							}
							if (local209 == 4001) {
								local23 -= 2;
								local774 = Static129.anIntArray421[local23];
								local779 = Static129.anIntArray421[local23 + 1];
								Static129.anIntArray421[local23++] = local774 - local779;
								continue;
							}
							if (local209 == 4002) {
								local23 -= 2;
								local774 = Static129.anIntArray421[local23];
								local779 = Static129.anIntArray421[local23 + 1];
								Static129.anIntArray421[local23++] = local774 * local779;
								continue;
							}
							if (local209 == 4003) {
								local23 -= 2;
								local774 = Static129.anIntArray421[local23];
								local779 = Static129.anIntArray421[local23 + 1];
								Static129.anIntArray421[local23++] = local774 / local779;
								continue;
							}
							if (local209 == 4004) {
								local23--;
								local774 = Static129.anIntArray421[local23];
								Static129.anIntArray421[local23++] = (int) (Math.random() * (double) local774);
								continue;
							}
							if (local209 == 4005) {
								local23--;
								local774 = Static129.anIntArray421[local23];
								Static129.anIntArray421[local23++] = (int) (Math.random() * (double) (local774 + 1));
								continue;
							}
							if (local209 == 4006) {
								local23 -= 5;
								local779 = Static129.anIntArray421[local23 + 1];
								local774 = Static129.anIntArray421[local23];
								local625 = Static129.anIntArray421[local23 + 3];
								local649 = Static129.anIntArray421[local23 + 4];
								local961 = Static129.anIntArray421[local23 + 2];
								Static129.anIntArray421[local23++] = (local779 - local774) * (local649 - local961) / (local625 - local961) + local774;
								continue;
							}
							if (local209 == 4007) {
								local23 -= 2;
								local779 = Static129.anIntArray421[local23 + 1];
								local774 = Static129.anIntArray421[local23];
								Static129.anIntArray421[local23++] = local779 * local774 / 100 + local774;
								continue;
							}
							if (local209 == 4008) {
								local23 -= 2;
								local774 = Static129.anIntArray421[local23];
								local779 = Static129.anIntArray421[local23 + 1];
								Static129.anIntArray421[local23++] = 0x1 << local779 | local774;
								continue;
							}
							if (local209 == 4009) {
								local23 -= 2;
								local774 = Static129.anIntArray421[local23];
								local779 = Static129.anIntArray421[local23 + 1];
								Static129.anIntArray421[local23++] = -(0x1 << local779) - 1 & local774;
								continue;
							}
							if (local209 == 4010) {
								local23 -= 2;
								local774 = Static129.anIntArray421[local23];
								local779 = Static129.anIntArray421[local23 + 1];
								Static129.anIntArray421[local23++] = (local774 & 0x1 << local779) == 0 ? 0 : 1;
								continue;
							}
							if (local209 == 4011) {
								local23 -= 2;
								local774 = Static129.anIntArray421[local23];
								local779 = Static129.anIntArray421[local23 + 1];
								Static129.anIntArray421[local23++] = local774 % local779;
								continue;
							}
							if (local209 == 4012) {
								local23 -= 2;
								local774 = Static129.anIntArray421[local23];
								local779 = Static129.anIntArray421[local23 + 1];
								if (local774 == 0) {
									Static129.anIntArray421[local23++] = 0;
								} else {
									Static129.anIntArray421[local23++] = (int) Math.pow((double) local774, (double) local779);
								}
								continue;
							}
							if (local209 == 4013) {
								local23 -= 2;
								local779 = Static129.anIntArray421[local23 + 1];
								local774 = Static129.anIntArray421[local23];
								if (local774 == 0) {
									Static129.anIntArray421[local23++] = 0;
								} else if (local779 == 0) {
									Static129.anIntArray421[local23++] = Integer.MAX_VALUE;
								} else {
									Static129.anIntArray421[local23++] = (int) Math.pow((double) local774, 1.0D / (double) local779);
								}
								continue;
							}
							if (local209 == 4014) {
								local23 -= 2;
								local779 = Static129.anIntArray421[local23 + 1];
								local774 = Static129.anIntArray421[local23];
								Static129.anIntArray421[local23++] = local774 & local779;
								continue;
							}
							if (local209 == 4015) {
								local23 -= 2;
								local774 = Static129.anIntArray421[local23];
								local779 = Static129.anIntArray421[local23 + 1];
								Static129.anIntArray421[local23++] = local774 | local779;
								continue;
							}
							if (local209 == 4016) {
								local23 -= 2;
								local779 = Static129.anIntArray421[local23 + 1];
								local774 = Static129.anIntArray421[local23];
								Static129.anIntArray421[local23++] = local779 > local774 ? local774 : local779;
								continue;
							}
							if (local209 == 4017) {
								local23 -= 2;
								local774 = Static129.anIntArray421[local23];
								local779 = Static129.anIntArray421[local23 + 1];
								Static129.anIntArray421[local23++] = local774 > local779 ? local774 : local779;
								continue;
							}
							if (local209 == 4018) {
								local23 -= 3;
								@Pc(5637) long local5637 = (long) Static129.anIntArray421[local23 + 1];
								@Pc(5642) long local5642 = (long) Static129.anIntArray421[local23];
								@Pc(5649) long local5649 = (long) Static129.anIntArray421[local23 + 2];
								Static129.anIntArray421[local23++] = (int) (local5642 * local5649 / local5637);
								continue;
							}
						} else if (local209 < 4200) {
							if (local209 == 4100) {
								local27--;
								local581 = Static96.aClass70Array14[local27];
								local23--;
								local779 = Static129.anIntArray421[local23];
								Static96.aClass70Array14[local27++] = Static160.method3210(new Class70[] { local581, Static34.method873(local779) });
								continue;
							}
							if (local209 == 4101) {
								local27 -= 2;
								local581 = Static96.aClass70Array14[local27];
								local1577 = Static96.aClass70Array14[local27 + 1];
								Static96.aClass70Array14[local27++] = Static160.method3210(new Class70[] { local581, local1577 });
								continue;
							}
							if (local209 == 4102) {
								local27--;
								local581 = Static96.aClass70Array14[local27];
								local23--;
								local779 = Static129.anIntArray421[local23];
								Static96.aClass70Array14[local27++] = Static160.method3210(new Class70[] { local581, Static10.method298(local779) });
								continue;
							}
							if (local209 == 4103) {
								local27--;
								local581 = Static96.aClass70Array14[local27];
								Static96.aClass70Array14[local27++] = local581.method2927();
								continue;
							}
							if (local209 == 4104) {
								local23--;
								local774 = Static129.anIntArray421[local23];
								@Pc(3161) long local3161 = ((long) local774 + 11745L) * 86400000L;
								Static47.aCalendar1.setTime(new Date(local3161));
								local625 = Static47.aCalendar1.get(5);
								local649 = Static47.aCalendar1.get(2);
								local999 = Static47.aCalendar1.get(1);
								Static96.aClass70Array14[local27++] = Static160.method3210(new Class70[] { Static34.method873(local625), Static125.aClass70_1139, Static6.aClass70Array3[local649], Static125.aClass70_1139, Static34.method873(local999) });
								continue;
							}
							if (local209 == 4105) {
								local27 -= 2;
								local581 = Static96.aClass70Array14[local27];
								local1577 = Static96.aClass70Array14[local27 + 1];
								if (Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.aClass49_1 != null && Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.aClass49_1.aBoolean123) {
									Static96.aClass70Array14[local27++] = local1577;
									continue;
								}
								Static96.aClass70Array14[local27++] = local581;
								continue;
							}
							if (local209 == 4106) {
								local23--;
								local774 = Static129.anIntArray421[local23];
								Static96.aClass70Array14[local27++] = Static34.method873(local774);
								continue;
							}
							if (local209 == 4107) {
								local27 -= 2;
								Static129.anIntArray421[local23++] = Static96.aClass70Array14[local27].method2912(Static96.aClass70Array14[local27 + 1]);
								continue;
							}
							@Pc(3316) byte[] local3316;
							@Pc(3321) Class1_Sub1_Sub1_Sub2_Sub1 local3321;
							if (local209 == 4108) {
								local23 -= 2;
								local779 = Static129.anIntArray421[local23];
								local27--;
								local581 = Static96.aClass70Array14[local27];
								local961 = Static129.anIntArray421[local23 + 1];
								local3316 = Static179.aClass76_Sub1_18.method3316(0, local961);
								local3321 = new Class1_Sub1_Sub1_Sub2_Sub1(local3316);
								local3321.method2390(Static123.aClass1_Sub1_Sub1_Sub3Array9, null);
								Static129.anIntArray421[local23++] = local3321.method2385(local581, local779);
								continue;
							}
							if (local209 == 4109) {
								local27--;
								local581 = Static96.aClass70Array14[local27];
								local23 -= 2;
								local779 = Static129.anIntArray421[local23];
								local961 = Static129.anIntArray421[local23 + 1];
								local3316 = Static179.aClass76_Sub1_18.method3316(0, local961);
								local3321 = new Class1_Sub1_Sub1_Sub2_Sub1(local3316);
								local3321.method2390(Static123.aClass1_Sub1_Sub1_Sub3Array9, null);
								Static129.anIntArray421[local23++] = local3321.method2396(local581, local779);
								continue;
							}
							if (local209 == 4110) {
								local27 -= 2;
								local581 = Static96.aClass70Array14[local27];
								local1577 = Static96.aClass70Array14[local27 + 1];
								local23--;
								if (Static129.anIntArray421[local23] == 1) {
									Static96.aClass70Array14[local27++] = local581;
								} else {
									Static96.aClass70Array14[local27++] = local1577;
								}
								continue;
							}
							if (local209 == 4111) {
								local27--;
								local581 = Static96.aClass70Array14[local27];
								Static96.aClass70Array14[local27++] = Static76.method2394(local581);
								continue;
							}
							if (local209 == 4112) {
								local27--;
								local581 = Static96.aClass70Array14[local27];
								local23--;
								local779 = Static129.anIntArray421[local23];
								Static96.aClass70Array14[local27++] = local581.method2914(local779);
								continue;
							}
							if (local209 == 4113) {
								local23--;
								local774 = Static129.anIntArray421[local23];
								Static129.anIntArray421[local23++] = Static52.method1332(local774) ? 1 : 0;
								continue;
							}
							if (local209 == 4114) {
								local23--;
								local774 = Static129.anIntArray421[local23];
								Static129.anIntArray421[local23++] = Static147.method2877(local774) ? 1 : 0;
								continue;
							}
							if (local209 == 4115) {
								local23--;
								local774 = Static129.anIntArray421[local23];
								Static129.anIntArray421[local23++] = Static164.method3273(local774) ? 1 : 0;
								continue;
							}
							if (local209 == 4116) {
								local23--;
								local774 = Static129.anIntArray421[local23];
								Static129.anIntArray421[local23++] = Static120.method2459(local774) ? 1 : 0;
								continue;
							}
							if (local209 == 4117) {
								local27--;
								local581 = Static96.aClass70Array14[local27];
								if (local581 == null) {
									Static129.anIntArray421[local23++] = 0;
								} else {
									Static129.anIntArray421[local23++] = local581.method2896();
								}
								continue;
							}
							if (local209 == 4118) {
								local23 -= 2;
								local779 = Static129.anIntArray421[local23];
								local27--;
								local581 = Static96.aClass70Array14[local27];
								local961 = Static129.anIntArray421[local23 + 1];
								Static96.aClass70Array14[local27++] = local581.method2903(local961, local779);
								continue;
							}
							if (local209 == 4119) {
								local27--;
								local581 = Static96.aClass70Array14[local27];
								local1577 = Static83.method3494(local581.method2896());
								@Pc(3626) boolean local3626 = false;
								for (local625 = 0; local581.method2896() > local625; local625++) {
									local649 = local581.method2899(local625);
									if (local649 == 60) {
										local3626 = true;
									} else if (local649 == 62) {
										local3626 = false;
									} else if (!local3626) {
										local1577.method2889(local649);
									}
								}
								local1577.method2893();
								Static96.aClass70Array14[local27++] = local1577;
								continue;
							}
							if (local209 == 4120) {
								local27--;
								local581 = Static96.aClass70Array14[local27];
								local23 -= 2;
								local779 = Static129.anIntArray421[local23];
								local961 = Static129.anIntArray421[local23 + 1];
								Static129.anIntArray421[local23++] = local581.method2924(local779, local961);
								continue;
							}
							if (local209 == 4121) {
								local27 -= 2;
								local581 = Static96.aClass70Array14[local27];
								local23--;
								local961 = Static129.anIntArray421[local23];
								local1577 = Static96.aClass70Array14[local27 + 1];
								Static129.anIntArray421[local23++] = local581.method2900(local961, local1577);
								continue;
							}
						} else if (local209 < 4300) {
							if (local209 == 4200) {
								local23--;
								local774 = Static129.anIntArray421[local23];
								Static96.aClass70Array14[local27++] = Static90.method1963(local774).aClass70_49;
								continue;
							}
							@Pc(3780) Class1_Sub1_Sub2 local3780;
							if (local209 == 4201) {
								local23 -= 2;
								local774 = Static129.anIntArray421[local23];
								local779 = Static129.anIntArray421[local23 + 1];
								local3780 = Static90.method1963(local774);
								if (local779 >= 1 && local779 <= 5 && local3780.aClass70Array2[local779 - 1] != null) {
									Static96.aClass70Array14[local27++] = local3780.aClass70Array2[local779 - 1];
									continue;
								}
								Static96.aClass70Array14[local27++] = Static19.aClass70_187;
								continue;
							}
							if (local209 == 4202) {
								local23 -= 2;
								local774 = Static129.anIntArray421[local23];
								local779 = Static129.anIntArray421[local23 + 1];
								local3780 = Static90.method1963(local774);
								if (local779 >= 1 && local779 <= 5 && local3780.aClass70Array1[local779 - 1] != null) {
									Static96.aClass70Array14[local27++] = local3780.aClass70Array1[local779 - 1];
									continue;
								}
								Static96.aClass70Array14[local27++] = Static19.aClass70_187;
								continue;
							}
							if (local209 == 4203) {
								local23--;
								local774 = Static129.anIntArray421[local23];
								Static129.anIntArray421[local23++] = Static90.method1963(local774).anInt190;
								continue;
							}
							if (local209 == 4204) {
								local23--;
								local774 = Static129.anIntArray421[local23];
								Static129.anIntArray421[local23++] = Static90.method1963(local774).anInt184 == 1 ? 1 : 0;
								continue;
							}
							@Pc(3925) Class1_Sub1_Sub2 local3925;
							if (local209 == 4205) {
								local23--;
								local774 = Static129.anIntArray421[local23];
								local3925 = Static90.method1963(local774);
								if (local3925.anInt158 == -1 && local3925.anInt159 >= 0) {
									Static129.anIntArray421[local23++] = local3925.anInt159;
									continue;
								}
								Static129.anIntArray421[local23++] = local774;
								continue;
							}
							if (local209 == 4206) {
								local23--;
								local774 = Static129.anIntArray421[local23];
								local3925 = Static90.method1963(local774);
								if (local3925.anInt158 >= 0 && local3925.anInt159 >= 0) {
									Static129.anIntArray421[local23++] = local3925.anInt159;
									continue;
								}
								Static129.anIntArray421[local23++] = local774;
								continue;
							}
							if (local209 == 4207) {
								local23--;
								local774 = Static129.anIntArray421[local23];
								Static129.anIntArray421[local23++] = Static90.method1963(local774).aBoolean7 ? 1 : 0;
								continue;
							}
							if (local209 == 4210) {
								local27--;
								local581 = Static96.aClass70Array14[local27];
								local23--;
								local779 = Static129.anIntArray421[local23];
								Static9.method280(local779 == 1, local581);
								Static129.anIntArray421[local23++] = Static72.anInt2240;
								continue;
							}
							if (local209 == 4211) {
								if (Static104.aShortArray25 != null && Static72.anInt2240 > Static7.anInt282) {
									Static129.anIntArray421[local23++] = Static104.aShortArray25[Static7.anInt282++] & 0xFFFF;
									continue;
								}
								Static129.anIntArray421[local23++] = -1;
								continue;
							}
							if (local209 == 4212) {
								Static7.anInt282 = 0;
								continue;
							}
						} else if (local209 < 5100) {
							if (local209 == 5000) {
								Static129.anIntArray421[local23++] = Static53.anInt1710;
								continue;
							}
							if (local209 == 5001) {
								local23 -= 3;
								Static53.anInt1710 = Static129.anIntArray421[local23];
								Static110.anInt3088 = Static129.anIntArray421[local23 + 1];
								Static164.anInt4264 = Static129.anIntArray421[local23 + 2];
								Static131.aClass1_Sub9_Sub1_3.method1283(107);
								Static131.aClass1_Sub9_Sub1_3.method1260(Static53.anInt1710);
								Static131.aClass1_Sub9_Sub1_3.method1260(Static110.anInt3088);
								Static131.aClass1_Sub9_Sub1_3.method1260(Static164.anInt4264);
								continue;
							}
							if (local209 == 5002) {
								local23 -= 2;
								local27--;
								local581 = Static96.aClass70Array14[local27];
								local779 = Static129.anIntArray421[local23];
								local961 = Static129.anIntArray421[local23 + 1];
								Static131.aClass1_Sub9_Sub1_3.method1283(51);
								Static131.aClass1_Sub9_Sub1_3.method1263(local581.method2925());
								Static131.aClass1_Sub9_Sub1_3.method1260(local779 - 1);
								Static131.aClass1_Sub9_Sub1_3.method1260(local961);
								continue;
							}
							if (local209 == 5003) {
								local23--;
								local774 = Static129.anIntArray421[local23];
								local1577 = null;
								if (local774 < 100) {
									local1577 = Static169.aClass70Array22[local774];
								}
								if (local1577 == null) {
									local1577 = Static19.aClass70_187;
								}
								Static96.aClass70Array14[local27++] = local1577;
								continue;
							}
							if (local209 == 5004) {
								local23--;
								local774 = Static129.anIntArray421[local23];
								local779 = -1;
								if (local774 < 100 && Static169.aClass70Array22[local774] != null) {
									local779 = Static136.anIntArray337[local774];
								}
								Static129.anIntArray421[local23++] = local779;
								continue;
							}
							if (local209 == 5005) {
								Static129.anIntArray421[local23++] = Static110.anInt3088;
								continue;
							}
							if (local209 == 5008) {
								local27--;
								local581 = Static96.aClass70Array14[local27];
								if (local581.method2891(Static93.aClass70_892)) {
									Static8.method250(local581);
								} else {
									local1577 = local581.method2927();
									@Pc(4296) byte local4296 = 0;
									if (local1577.method2891(Static69.aClass70_667)) {
										local581 = local581.method2906(Static69.aClass70_667.method2896());
										local4296 = 0;
									} else if (local1577.method2891(Static81.aClass70_830)) {
										local581 = local581.method2906(Static81.aClass70_830.method2896());
										local4296 = 1;
									} else if (local1577.method2891(Static182.aClass70_1581)) {
										local581 = local581.method2906(Static182.aClass70_1581.method2896());
										local4296 = 2;
									} else if (local1577.method2891(Static121.aClass70_1114)) {
										local4296 = 3;
										local581 = local581.method2906(Static121.aClass70_1114.method2896());
									} else if (local1577.method2891(Static44.aClass70_486)) {
										local4296 = 4;
										local581 = local581.method2906(Static44.aClass70_486.method2896());
									} else if (local1577.method2891(Static37.aClass70_407)) {
										local581 = local581.method2906(Static37.aClass70_407.method2896());
										local4296 = 5;
									} else if (local1577.method2891(Static45.aClass70_491)) {
										local581 = local581.method2906(Static45.aClass70_491.method2896());
										local4296 = 6;
									} else if (local1577.method2891(Static57.aClass70_575)) {
										local4296 = 7;
										local581 = local581.method2906(Static57.aClass70_575.method2896());
									} else if (local1577.method2891(Static185.aClass70_1601)) {
										local581 = local581.method2906(Static185.aClass70_1601.method2896());
										local4296 = 8;
									} else if (local1577.method2891(Static96.aClass70_911)) {
										local4296 = 9;
										local581 = local581.method2906(Static96.aClass70_911.method2896());
									} else if (local1577.method2891(Static121.aClass70_1111)) {
										local581 = local581.method2906(Static121.aClass70_1111.method2896());
										local4296 = 10;
									} else if (local1577.method2891(Static126.aClass70_286)) {
										local4296 = 11;
										local581 = local581.method2906(Static126.aClass70_286.method2896());
									} else if (Static123.anInt3345 != 0) {
										if (local1577.method2891(Static69.aClass70_666)) {
											local4296 = 0;
											local581 = local581.method2906(Static69.aClass70_666.method2896());
										} else if (local1577.method2891(Static81.aClass70_829)) {
											local4296 = 1;
											local581 = local581.method2906(Static81.aClass70_829.method2896());
										} else if (local1577.method2891(Static182.aClass70_1582)) {
											local4296 = 2;
											local581 = local581.method2906(Static182.aClass70_1582.method2896());
										} else if (local1577.method2891(Static121.aClass70_1115)) {
											local4296 = 3;
											local581 = local581.method2906(Static121.aClass70_1115.method2896());
										} else if (local1577.method2891(Static44.aClass70_487)) {
											local581 = local581.method2906(Static44.aClass70_487.method2896());
											local4296 = 4;
										} else if (local1577.method2891(Static37.aClass70_406)) {
											local4296 = 5;
											local581 = local581.method2906(Static37.aClass70_406.method2896());
										} else if (local1577.method2891(Static45.aClass70_489)) {
											local581 = local581.method2906(Static45.aClass70_489.method2896());
											local4296 = 6;
										} else if (local1577.method2891(Static57.aClass70_572)) {
											local581 = local581.method2906(Static57.aClass70_572.method2896());
											local4296 = 7;
										} else if (local1577.method2891(Static185.aClass70_1600)) {
											local581 = local581.method2906(Static185.aClass70_1600.method2896());
											local4296 = 8;
										} else if (local1577.method2891(Static96.aClass70_915)) {
											local581 = local581.method2906(Static96.aClass70_915.method2896());
											local4296 = 9;
										} else if (local1577.method2891(Static121.aClass70_1113)) {
											local4296 = 10;
											local581 = local581.method2906(Static121.aClass70_1113.method2896());
										} else if (local1577.method2891(Static126.aClass70_289)) {
											local581 = local581.method2906(Static126.aClass70_289.method2896());
											local4296 = 11;
										}
									}
									local1577 = local581.method2927();
									@Pc(4731) byte local4731 = 0;
									if (local1577.method2891(Static119.aClass70_1095)) {
										local4731 = 1;
										local581 = local581.method2906(Static119.aClass70_1095.method2896());
									} else if (local1577.method2891(Static83.aClass70_1588)) {
										local581 = local581.method2906(Static83.aClass70_1588.method2896());
										local4731 = 2;
									} else if (local1577.method2891(Static68.aClass70_662)) {
										local4731 = 3;
										local581 = local581.method2906(Static68.aClass70_662.method2896());
									} else if (local1577.method2891(Static48.aClass70_521)) {
										local4731 = 4;
										local581 = local581.method2906(Static48.aClass70_521.method2896());
									} else if (local1577.method2891(Static141.aClass70_1255)) {
										local581 = local581.method2906(Static141.aClass70_1255.method2896());
										local4731 = 5;
									} else if (Static123.anInt3345 != 0) {
										if (local1577.method2891(Static119.aClass70_1096)) {
											local4731 = 1;
											local581 = local581.method2906(Static119.aClass70_1096.method2896());
										} else if (local1577.method2891(Static83.aClass70_1590)) {
											local581 = local581.method2906(Static83.aClass70_1590.method2896());
											local4731 = 2;
										} else if (local1577.method2891(Static68.aClass70_659)) {
											local581 = local581.method2906(Static68.aClass70_659.method2896());
											local4731 = 3;
										} else if (local1577.method2891(Static48.aClass70_522)) {
											local4731 = 4;
											local581 = local581.method2906(Static48.aClass70_522.method2896());
										} else if (local1577.method2891(Static141.aClass70_1253)) {
											local581 = local581.method2906(Static141.aClass70_1253.method2896());
											local4731 = 5;
										}
									}
									Static131.aClass1_Sub9_Sub1_3.method1283(188);
									Static131.aClass1_Sub9_Sub1_3.method1260(0);
									local649 = Static131.aClass1_Sub9_Sub1_3.anInt1592;
									Static131.aClass1_Sub9_Sub1_3.method1260(local4296);
									Static131.aClass1_Sub9_Sub1_3.method1260(local4731);
									Static101.method2119(local581, Static131.aClass1_Sub9_Sub1_3);
									Static131.aClass1_Sub9_Sub1_3.method1249(Static131.aClass1_Sub9_Sub1_3.anInt1592 - local649);
								}
								continue;
							}
							if (local209 == 5009) {
								local27 -= 2;
								local1577 = Static96.aClass70Array14[local27 + 1];
								local581 = Static96.aClass70Array14[local27];
								Static131.aClass1_Sub9_Sub1_3.method1283(195);
								Static131.aClass1_Sub9_Sub1_3.method1260(0);
								local961 = Static131.aClass1_Sub9_Sub1_3.anInt1592;
								Static131.aClass1_Sub9_Sub1_3.method1263(local581.method2925());
								Static101.method2119(local1577, Static131.aClass1_Sub9_Sub1_3);
								Static131.aClass1_Sub9_Sub1_3.method1249(Static131.aClass1_Sub9_Sub1_3.anInt1592 - local961);
								continue;
							}
							if (local209 == 5010) {
								local23--;
								local774 = Static129.anIntArray421[local23];
								local1577 = null;
								if (local774 < 100) {
									local1577 = Static18.aClass70Array5[local774];
								}
								if (local1577 == null) {
									local1577 = Static19.aClass70_187;
								}
								Static96.aClass70Array14[local27++] = local1577;
								continue;
							}
							if (local209 == 5011) {
								local23--;
								local774 = Static129.anIntArray421[local23];
								local1577 = null;
								if (local774 < 100) {
									local1577 = Static102.aClass70Array15[local774];
								}
								if (local1577 == null) {
									local1577 = Static19.aClass70_187;
								}
								Static96.aClass70Array14[local27++] = local1577;
								continue;
							}
							if (local209 == 5015) {
								if (Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1 == null || Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.aClass70_408 == null) {
									local581 = Static179.aClass70_1563;
								} else {
									local581 = Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.aClass70_408;
								}
								Static96.aClass70Array14[local27++] = local581;
								continue;
							}
							if (local209 == 5016) {
								Static129.anIntArray421[local23++] = Static164.anInt4264;
								continue;
							}
							if (local209 == 5017) {
								Static129.anIntArray421[local23++] = Static127.anInt3384;
								continue;
							}
						}
					} else {
						if (local209 < 2000) {
							local1092 = local934 ? Static169.aClass39_46 : Static99.aClass39_47;
						} else {
							local23--;
							local1092 = Static128.method3227(Static129.anIntArray421[local23]);
							local209 -= 1000;
						}
						if (local209 == 1300) {
							local23--;
							local779 = Static129.anIntArray421[local23] - 1;
							if (local779 >= 0 && local779 <= 9) {
								local27--;
								local1092.method1761(local779, Static96.aClass70Array14[local27]);
								continue;
							}
							local27--;
							continue;
						}
						if (local209 == 1301) {
							local23 -= 2;
							local779 = Static129.anIntArray421[local23];
							local961 = Static129.anIntArray421[local23 + 1];
							local1092.aClass39_23 = Static44.method1103(local779, local961);
							continue;
						}
						if (local209 == 1302) {
							local23--;
							local1092.aBoolean81 = Static129.anIntArray421[local23] == 1;
							continue;
						}
						if (local209 == 1303) {
							local23--;
							local1092.anInt2320 = Static129.anIntArray421[local23];
							continue;
						}
						if (local209 == 1304) {
							local23--;
							local1092.anInt2392 = Static129.anIntArray421[local23];
							continue;
						}
						if (local209 == 1305) {
							local27--;
							local1092.aClass70_774 = Static96.aClass70Array14[local27];
							continue;
						}
						if (local209 == 1306) {
							local27--;
							local1092.aClass70_775 = Static96.aClass70Array14[local27];
							continue;
						}
						if (local209 == 1307) {
							local1092.aClass70Array11 = null;
							continue;
						}
					}
				}
				throw new IllegalStateException();
			}
		} catch (@Pc(7971) Exception local7971) {
			if (local18.aClass70_1228 == null) {
				if (Static35.anInt2016 != 0) {
					Static41.method1036(Static21.aClass70_204, Static19.aClass70_187, 0);
				}
				Static141.method2762(local7971, "CS2 - scr:" + local18.aLong147 + " op:" + local37);
			} else {
				@Pc(7978) Class70 local7978 = Static83.method3494(30);
				local7978.method2901(Static106.aClass70_972).method2901(local18.aClass70_1228);
				for (local55 = Static165.anInt4304 - 1; local55 >= 0; local55--) {
					local7978.method2901(Static142.aClass70_1283).method2901(Static89.aClass78Array1[local55].aClass1_Sub1_Sub15_1.aClass70_1228);
				}
				if (local37 == 40) {
					local93 = local35[local29];
					local7978.method2901(Static25.aClass70_239).method2901(Static34.method873(local93));
				}
				if (Static35.anInt2016 != 0) {
					Static41.method1036(Static160.method3210(new Class70[] { Static68.aClass70_657, local18.aClass70_1228 }), Static19.aClass70_187, 0);
				}
				Static141.method2762(local7971, "CS2 - scr:" + local18.aLong147 + " op:" + local37 + new String(local7978.method2926()));
			}
		}
	}
}
