import java.awt.event.KeyEvent;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import nativeadvert.browsercontrol;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!cf", name = "P", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!cf", name = "Q", descriptor = "Lclient!df;")
	public static Class27 aClass27_3;

	@OriginalMember(owner = "client!cf", name = "U", descriptor = "I")
	public static int anInt577;

	@OriginalMember(owner = "client!cf", name = "S", descriptor = "Lclient!sc;")
	public static Class107 aClass107_203 = Static231.method3737("<img=0>");

	@OriginalMember(owner = "client!cf", name = "X", descriptor = "[Lclient!vf;")
	public static Class1_Sub26[] aClass1_Sub26Array1 = new Class1_Sub26[2048];

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IZ)I")
	public static int method576(@OriginalArg(1) boolean arg0) {
		@Pc(13) long local13 = Static209.method3309();
		for (@Pc(25) Class1_Sub12 local25 = arg0 ? (Class1_Sub12) Static158.aClass50_19.method1358() : (Class1_Sub12) Static158.aClass50_19.method1361(); local25 != null; local25 = (Class1_Sub12) Static158.aClass50_19.method1361()) {
			if (local13 > (local25.aLong53 & 0x3FFFFFFFFFFFFFFFL)) {
				if ((local25.aLong53 & 0x4000000000000000L) != 0L) {
					@Pc(47) int local47 = (int) local25.aLong177;
					Static141.anIntArray267[local47] = Static203.anIntArray12[local47];
					local25.method3735();
					return local47;
				}
				local25.method3735();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IILclient!oh;)V")
	public static void method577(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub22 arg1) {
		@Pc(4) Object[] local4 = arg1.anObjectArray33;
		@Pc(14) int local14 = (Integer) local4[0];
		@Pc(18) Class1_Sub2_Sub11 local18 = Static212.method3413(local14);
		if (local18 == null) {
			return;
		}
		Static44.anInt990 = 0;
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = 0;
		@Pc(30) int[] local30 = local18.anIntArray235;
		@Pc(32) int local32 = -1;
		@Pc(34) byte local34 = -1;
		@Pc(37) int[] local37 = local18.anIntArray236;
		@Pc(51) int local51;
		@Pc(89) int local89;
		try {
			Static183.aClass107Array26 = new Class107[local18.anInt2649];
			@Pc(43) int local43 = 0;
			@Pc(45) int local45 = 0;
			Static203.anIntArray11 = new int[local18.anInt2651];
			for (local51 = 1; local51 < local4.length; local51++) {
				if (local4[local51] instanceof Integer) {
					local89 = (Integer) local4[local51];
					if (local89 == -2147483647) {
						local89 = arg1.anInt3447;
					}
					if (local89 == -2147483646) {
						local89 = arg1.anInt3444;
					}
					if (local89 == -2147483645) {
						local89 = arg1.aClass86_10 == null ? -1 : arg1.aClass86_10.anInt3239;
					}
					if (local89 == -2147483644) {
						local89 = arg1.anInt3439;
					}
					if (local89 == -2147483643) {
						local89 = arg1.aClass86_10 == null ? -1 : arg1.aClass86_10.anInt3219;
					}
					if (local89 == -2147483642) {
						local89 = arg1.aClass86_9 == null ? -1 : arg1.aClass86_9.anInt3239;
					}
					if (local89 == -2147483641) {
						local89 = arg1.aClass86_9 == null ? -1 : arg1.aClass86_9.anInt3219;
					}
					if (local89 == -2147483640) {
						local89 = arg1.anInt3445;
					}
					if (local89 == -2147483639) {
						local89 = arg1.anInt3446;
					}
					Static203.anIntArray11[local43++] = local89;
				} else if (local4[local51] instanceof Class107) {
					@Pc(68) Class107 local68 = (Class107) local4[local51];
					if (local68.method3071(Static224.aClass107_1320)) {
						local68 = arg1.aClass107_908;
					}
					Static183.aClass107Array26[local45++] = local68;
				}
			}
			local89 = 0;
			label3389: while (true) {
				local89++;
				if (arg0 < local89) {
					throw new RuntimeException("slow");
				}
				local32++;
				@Pc(199) int local199 = local30[local32];
				@Pc(772) int local772;
				@Pc(609) int local609;
				@Pc(633) int local633;
				@Pc(767) int local767;
				@Pc(565) Class107 local565;
				if (local199 < 100) {
					if (local199 == 0) {
						Static134.anIntArray250[local25++] = local37[local32];
						continue;
					}
					@Pc(225) int local225;
					if (local199 == 1) {
						local225 = local37[local32];
						Static134.anIntArray250[local25++] = Static141.anIntArray267[local225];
						continue;
					}
					if (local199 == 2) {
						local225 = local37[local32];
						local25--;
						Static10.method311(local225, Static134.anIntArray250[local25]);
						continue;
					}
					if (local199 == 3) {
						Static101.aClass107Array10[local27++] = local18.aClass107Array12[local32];
						continue;
					}
					if (local199 == 6) {
						local32 += local37[local32];
						continue;
					}
					if (local199 == 7) {
						local25 -= 2;
						if (Static134.anIntArray250[local25 + 1] != Static134.anIntArray250[local25]) {
							local32 += local37[local32];
						}
						continue;
					}
					if (local199 == 8) {
						local25 -= 2;
						if (Static134.anIntArray250[local25] == Static134.anIntArray250[local25 + 1]) {
							local32 += local37[local32];
						}
						continue;
					}
					if (local199 == 9) {
						local25 -= 2;
						if (Static134.anIntArray250[local25] < Static134.anIntArray250[local25 + 1]) {
							local32 += local37[local32];
						}
						continue;
					}
					if (local199 == 10) {
						local25 -= 2;
						if (Static134.anIntArray250[local25] > Static134.anIntArray250[local25 + 1]) {
							local32 += local37[local32];
						}
						continue;
					}
					if (local199 == 21) {
						if (Static44.anInt990 == 0) {
							return;
						}
						@Pc(386) Class74 local386 = Static140.aClass74Array2[--Static44.anInt990];
						local18 = local386.aClass1_Sub2_Sub11_1;
						local37 = local18.anIntArray236;
						Static203.anIntArray11 = local386.anIntArray241;
						local30 = local18.anIntArray235;
						Static183.aClass107Array26 = local386.aClass107Array13;
						local32 = local386.anInt2703;
						continue;
					}
					if (local199 == 25) {
						local225 = local37[local32];
						Static134.anIntArray250[local25++] = Static227.method3695(local225);
						continue;
					}
					if (local199 == 27) {
						local225 = local37[local32];
						local25--;
						Static223.method3653(local225, Static134.anIntArray250[local25]);
						continue;
					}
					if (local199 == 31) {
						local25 -= 2;
						if (Static134.anIntArray250[local25] <= Static134.anIntArray250[local25 + 1]) {
							local32 += local37[local32];
						}
						continue;
					}
					if (local199 == 32) {
						local25 -= 2;
						if (Static134.anIntArray250[local25 + 1] <= Static134.anIntArray250[local25]) {
							local32 += local37[local32];
						}
						continue;
					}
					if (local199 == 33) {
						Static134.anIntArray250[local25++] = Static203.anIntArray11[local37[local32]];
						continue;
					}
					@Pc(511) int local511;
					if (local199 == 34) {
						local511 = local37[local32];
						local25--;
						Static203.anIntArray11[local511] = Static134.anIntArray250[local25];
						continue;
					}
					if (local199 == 35) {
						Static101.aClass107Array10[local27++] = Static183.aClass107Array26[local37[local32]];
						continue;
					}
					if (local199 == 36) {
						local511 = local37[local32];
						local27--;
						Static183.aClass107Array26[local511] = Static101.aClass107Array10[local27];
						continue;
					}
					if (local199 == 37) {
						local225 = local37[local32];
						local27 -= local225;
						local565 = Static91.method1541(Static101.aClass107Array10, local225, local27);
						Static101.aClass107Array10[local27++] = local565;
						continue;
					}
					if (local199 == 38) {
						local25--;
						continue;
					}
					if (local199 == 39) {
						local27--;
						continue;
					}
					if (local199 == 40) {
						local225 = local37[local32];
						@Pc(599) Class1_Sub2_Sub11 local599 = Static212.method3413(local225);
						@Pc(603) int[] local603 = new int[local599.anInt2651];
						@Pc(607) Class107[] local607 = new Class107[local599.anInt2649];
						for (local609 = 0; local609 < local599.anInt2647; local609++) {
							local603[local609] = Static134.anIntArray250[local25 + local609 - local599.anInt2647];
						}
						for (local633 = 0; local633 < local599.anInt2652; local633++) {
							local607[local633] = Static101.aClass107Array10[local27 + local633 - local599.anInt2652];
						}
						local25 -= local599.anInt2647;
						local27 -= local599.anInt2652;
						@Pc(671) Class74 local671 = new Class74();
						local671.anInt2703 = local32;
						local671.anIntArray241 = Static203.anIntArray11;
						local671.aClass107Array13 = Static183.aClass107Array26;
						local671.aClass1_Sub2_Sub11_1 = local18;
						if (Static44.anInt990 >= Static140.aClass74Array2.length) {
							throw new RuntimeException();
						}
						local32 = -1;
						local18 = local599;
						Static140.aClass74Array2[Static44.anInt990++] = local671;
						Static203.anIntArray11 = local603;
						Static183.aClass107Array26 = local607;
						local30 = local599.anIntArray235;
						local37 = local599.anIntArray236;
						continue;
					}
					if (local199 == 42) {
						Static134.anIntArray250[local25++] = Static87.anIntArray198[local37[local32]];
						continue;
					}
					if (local199 == 43) {
						local225 = local37[local32];
						local25--;
						Static87.anIntArray198[local225] = Static134.anIntArray250[local25];
						Static71.method1280(local225);
						continue;
					}
					if (local199 == 44) {
						local225 = local37[local32] >> 16;
						local767 = local37[local32] & 0xFFFF;
						local25--;
						local772 = Static134.anIntArray250[local25];
						if (local772 >= 0 && local772 <= 5000) {
							Static89.anIntArray201[local225] = local772;
							@Pc(790) byte local790 = -1;
							if (local767 == 105) {
								local790 = 0;
							}
							local609 = 0;
							while (true) {
								if (local772 <= local609) {
									continue label3389;
								}
								Static211.anIntArrayArray43[local225][local609] = local790;
								local609++;
							}
						}
						throw new RuntimeException();
					}
					if (local199 == 45) {
						local225 = local37[local32];
						local25--;
						local767 = Static134.anIntArray250[local25];
						if (local767 >= 0 && Static89.anIntArray201[local225] > local767) {
							Static134.anIntArray250[local25++] = Static211.anIntArrayArray43[local225][local767];
							continue;
						}
						throw new RuntimeException();
					}
					if (local199 == 46) {
						local225 = local37[local32];
						local25 -= 2;
						local767 = Static134.anIntArray250[local25];
						if (local767 >= 0 && local767 < Static89.anIntArray201[local225]) {
							Static211.anIntArrayArray43[local225][local767] = Static134.anIntArray250[local25 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (local199 == 47) {
						@Pc(902) Class107 local902 = Static23.aClass107Array2[local37[local32]];
						if (local902 == null) {
							local902 = Static188.aClass107_1099;
						}
						Static101.aClass107Array10[local27++] = local902;
						continue;
					}
					if (local199 == 48) {
						local225 = local37[local32];
						local27--;
						Static23.aClass107Array2[local225] = Static101.aClass107Array10[local27];
						Static43.method859(local225);
						continue;
					}
					if (local199 == 51) {
						@Pc(946) Class50 local946 = local18.aClass50Array1[local37[local32]];
						local25--;
						@Pc(956) Class1_Sub5 local956 = (Class1_Sub5) local946.method1364((long) Static134.anIntArray250[local25]);
						if (local956 != null) {
							local32 += local956.anInt782;
						}
						continue;
					}
				}
				@Pc(974) boolean local974;
				if (local37[local32] == 1) {
					local974 = true;
				} else {
					local974 = false;
				}
				@Pc(1139) Class86 local1139;
				@Pc(1005) int local1005;
				@Pc(1018) Class86 local1018;
				@Pc(1043) int local1043;
				@Pc(1211) Class86 local1211;
				if (local199 < 300) {
					if (local199 == 100) {
						local25 -= 3;
						local767 = Static134.anIntArray250[local25];
						local772 = Static134.anIntArray250[local25 + 1];
						local1005 = Static134.anIntArray250[local25 + 2];
						if (local772 == 0) {
							throw new RuntimeException();
						}
						local1018 = Static13.method333(local767);
						if (local1018.aClass86Array1 == null) {
							local1018.aClass86Array1 = new Class86[local1005 + 1];
						}
						if (local1018.aClass86Array1.length <= local1005) {
							@Pc(1041) Class86[] local1041 = new Class86[local1005 + 1];
							for (local1043 = 0; local1043 < local1018.aClass86Array1.length; local1043++) {
								local1041[local1043] = local1018.aClass86Array1[local1043];
							}
							local1018.aClass86Array1 = local1041;
						}
						if (local1005 > 0 && local1018.aClass86Array1[local1005 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local1005 - 1));
						}
						@Pc(1094) Class86 local1094 = new Class86();
						local1094.aBoolean280 = true;
						local1094.anInt3286 = local772;
						local1094.anInt3219 = local1005;
						local1094.anInt3225 = local1094.anInt3239 = local1018.anInt3239;
						local1018.aClass86Array1[local1005] = local1094;
						if (local974) {
							Static183.aClass86_13 = local1094;
						} else {
							Static58.aClass86_2 = local1094;
						}
						Static16.method354(local1018);
						continue;
					}
					@Pc(1161) Class86 local1161;
					if (local199 == 101) {
						local1139 = local974 ? Static183.aClass86_13 : Static58.aClass86_2;
						if (local1139.anInt3219 == -1) {
							if (!local974) {
								throw new RuntimeException("Tried to cc_delete static active-component!");
							}
							throw new RuntimeException("Tried to .cc_delete static .active-component!");
						}
						local1161 = Static13.method333(local1139.anInt3239);
						local1161.aClass86Array1[local1139.anInt3219] = null;
						Static16.method354(local1161);
						continue;
					}
					if (local199 == 102) {
						local25--;
						local1139 = Static13.method333(Static134.anIntArray250[local25]);
						local1139.aClass86Array1 = null;
						Static16.method354(local1139);
						continue;
					}
					if (local199 == 200) {
						local25 -= 2;
						local767 = Static134.anIntArray250[local25];
						local772 = Static134.anIntArray250[local25 + 1];
						local1211 = Static11.method314(local767, local772);
						if (local1211 != null && local772 != -1) {
							Static134.anIntArray250[local25++] = 1;
							if (local974) {
								Static183.aClass86_13 = local1211;
							} else {
								Static58.aClass86_2 = local1211;
							}
							continue;
						}
						Static134.anIntArray250[local25++] = 0;
						continue;
					}
					if (local199 == 201) {
						local25--;
						local767 = Static134.anIntArray250[local25];
						local1161 = Static13.method333(local767);
						if (local1161 == null) {
							Static134.anIntArray250[local25++] = 0;
						} else {
							Static134.anIntArray250[local25++] = 1;
							if (local974) {
								Static183.aClass86_13 = local1161;
							} else {
								Static58.aClass86_2 = local1161;
							}
						}
						continue;
					}
				} else if (local199 < 500) {
					if (local199 == 403) {
						local25 -= 2;
						local767 = Static134.anIntArray250[local25];
						if (local767 >= 7) {
							local767 -= 7;
						}
						local772 = Static134.anIntArray250[local25 + 1];
						Static204.aClass5_Sub5_Sub1_2.aClass56_10.method1544(local772, local767);
						continue;
					}
					if (local199 == 404) {
						local25 -= 2;
						local767 = Static134.anIntArray250[local25];
						local772 = Static134.anIntArray250[local25 + 1];
						Static204.aClass5_Sub5_Sub1_2.aClass56_10.method1542(local772, local767);
						continue;
					}
					if (local199 == 410) {
						local25--;
						@Pc(12206) boolean local12206 = Static134.anIntArray250[local25] != 0;
						Static204.aClass5_Sub5_Sub1_2.aClass56_10.method1537(local12206);
						continue;
					}
				} else {
					@Pc(6574) boolean local6574;
					if ((local199 < 1000 || local199 >= 1100) && (local199 < 2000 || local199 >= 2100)) {
						@Pc(1955) Class107 local1955;
						if (local199 >= 1100 && local199 < 1200 || !(local199 < 2100 || local199 >= 2200)) {
							if (local199 >= 2000) {
								local25--;
								local1139 = Static13.method333(Static134.anIntArray250[local25]);
								local199 -= 1000;
							} else {
								local1139 = local974 ? Static183.aClass86_13 : Static58.aClass86_2;
							}
							if (local199 == 1100) {
								local25 -= 2;
								local1139.anInt3256 = Static134.anIntArray250[local25];
								if (local1139.anInt3218 - local1139.anInt3280 < local1139.anInt3256) {
									local1139.anInt3256 = local1139.anInt3218 - local1139.anInt3280;
								}
								if (local1139.anInt3256 < 0) {
									local1139.anInt3256 = 0;
								}
								local1139.anInt3222 = Static134.anIntArray250[local25 + 1];
								if (local1139.anInt3266 - local1139.anInt3270 < local1139.anInt3222) {
									local1139.anInt3222 = local1139.anInt3266 - local1139.anInt3270;
								}
								if (local1139.anInt3222 < 0) {
									local1139.anInt3222 = 0;
								}
								Static16.method354(local1139);
								continue;
							}
							if (local199 == 1101) {
								local25--;
								local1139.anInt3230 = Static134.anIntArray250[local25];
								Static16.method354(local1139);
								continue;
							}
							if (local199 == 1102) {
								local25--;
								local1139.aBoolean285 = Static134.anIntArray250[local25] == 1;
								Static16.method354(local1139);
								continue;
							}
							if (local199 == 1103) {
								local25--;
								local1139.anInt3277 = Static134.anIntArray250[local25];
								Static16.method354(local1139);
								continue;
							}
							if (local199 == 1104) {
								local25--;
								local1139.anInt3249 = Static134.anIntArray250[local25];
								Static16.method354(local1139);
								continue;
							}
							if (local199 == 1105) {
								local25--;
								local1139.anInt3242 = Static134.anIntArray250[local25];
								Static16.method354(local1139);
								continue;
							}
							if (local199 == 1106) {
								local25--;
								local1139.anInt3212 = Static134.anIntArray250[local25];
								Static16.method354(local1139);
								continue;
							}
							if (local199 == 1107) {
								local25--;
								local1139.aBoolean281 = Static134.anIntArray250[local25] == 1;
								Static16.method354(local1139);
								continue;
							}
							if (local199 == 1108) {
								local1139.anInt3257 = 1;
								local25--;
								local1139.anInt3228 = Static134.anIntArray250[local25];
								Static16.method354(local1139);
								continue;
							}
							if (local199 == 1109) {
								local25 -= 6;
								local1139.anInt3252 = Static134.anIntArray250[local25];
								local1139.anInt3226 = Static134.anIntArray250[local25 + 1];
								local1139.anInt3229 = Static134.anIntArray250[local25 + 2];
								local1139.anInt3275 = Static134.anIntArray250[local25 + 3];
								local1139.anInt3217 = Static134.anIntArray250[local25 + 4];
								local1139.anInt3214 = Static134.anIntArray250[local25 + 5];
								Static16.method354(local1139);
								continue;
							}
							if (local199 == 1110) {
								local25--;
								local772 = Static134.anIntArray250[local25];
								if (local772 != local1139.anInt3283) {
									local1139.anInt3246 = 0;
									local1139.anInt3283 = local772;
									local1139.anInt3269 = 0;
									Static16.method354(local1139);
								}
								continue;
							}
							if (local199 == 1111) {
								local25--;
								local1139.aBoolean276 = Static134.anIntArray250[local25] == 1;
								Static16.method354(local1139);
								continue;
							}
							if (local199 == 1112) {
								local27--;
								local1955 = Static101.aClass107Array10[local27];
								if (!local1955.method3071(local1139.aClass107_867)) {
									local1139.aClass107_867 = local1955;
									Static16.method354(local1139);
								}
								continue;
							}
							if (local199 == 1113) {
								local25--;
								local1139.anInt3235 = Static134.anIntArray250[local25];
								Static16.method354(local1139);
								continue;
							}
							if (local199 == 1114) {
								local25 -= 3;
								local1139.anInt3267 = Static134.anIntArray250[local25];
								local1139.anInt3261 = Static134.anIntArray250[local25 + 1];
								local1139.anInt3278 = Static134.anIntArray250[local25 + 2];
								Static16.method354(local1139);
								continue;
							}
							if (local199 == 1115) {
								local25--;
								local1139.aBoolean274 = Static134.anIntArray250[local25] == 1;
								Static16.method354(local1139);
								continue;
							}
							if (local199 == 1116) {
								local25--;
								local1139.anInt3258 = Static134.anIntArray250[local25];
								Static16.method354(local1139);
								continue;
							}
							if (local199 == 1117) {
								local25--;
								local1139.anInt3279 = Static134.anIntArray250[local25];
								Static16.method354(local1139);
								continue;
							}
							if (local199 == 1118) {
								local25--;
								local1139.aBoolean287 = Static134.anIntArray250[local25] == 1;
								Static16.method354(local1139);
								continue;
							}
							if (local199 == 1119) {
								local25--;
								local1139.aBoolean284 = Static134.anIntArray250[local25] == 1;
								Static16.method354(local1139);
								continue;
							}
							if (local199 == 1120) {
								local25 -= 2;
								local1139.anInt3218 = Static134.anIntArray250[local25];
								local1139.anInt3266 = Static134.anIntArray250[local25 + 1];
								Static16.method354(local1139);
								if (local1139.anInt3286 == 0) {
									Static160.method2582(local1139, false);
								}
								continue;
							}
							if (local199 == 1121) {
								local25 -= 2;
								Static16.method354(local1139);
								continue;
							}
							if (local199 == 1122) {
								local25--;
								local1139.aBoolean278 = Static134.anIntArray250[local25] == 1;
								Static16.method354(local1139);
								continue;
							}
						} else if (local199 >= 1200 && local199 < 1300 || local199 >= 2200 && local199 < 2300) {
							if (local199 < 2000) {
								local1139 = local974 ? Static183.aClass86_13 : Static58.aClass86_2;
							} else {
								local199 -= 1000;
								local25--;
								local1139 = Static13.method333(Static134.anIntArray250[local25]);
							}
							Static16.method354(local1139);
							if (local199 == 1200 || local199 == 1205) {
								local25 -= 2;
								local1005 = Static134.anIntArray250[local25 + 1];
								local772 = Static134.anIntArray250[local25];
								if (local772 == -1) {
									local1139.anInt3228 = -1;
									local1139.anInt3233 = -1;
									local1139.anInt3257 = 1;
								} else {
									local1139.anInt3291 = local1005;
									local1139.anInt3233 = local772;
									@Pc(11227) Class75 local11227 = Static128.method2147(local772);
									local1139.anInt3217 = local11227.anInt2738;
									local1139.anInt3275 = local11227.anInt2706;
									if (local199 == 1205) {
										local1139.aBoolean283 = false;
									} else {
										local1139.aBoolean283 = true;
									}
									local1139.anInt3226 = local11227.anInt2760;
									local1139.anInt3229 = local11227.anInt2730;
									local1139.anInt3214 = local11227.anInt2721;
									if (local1139.anInt3264 > 0) {
										local1139.anInt3214 = local1139.anInt3214 * 32 / local1139.anInt3264;
									} else if (local1139.anInt3288 > 0) {
										local1139.anInt3214 = local1139.anInt3214 * 32 / local1139.anInt3288;
									}
									local1139.anInt3252 = local11227.anInt2752;
								}
								continue;
							}
							if (local199 == 1201) {
								local1139.anInt3257 = 2;
								local25--;
								local1139.anInt3228 = Static134.anIntArray250[local25];
								continue;
							}
							if (local199 == 1202) {
								local1139.anInt3257 = 3;
								local1139.anInt3228 = Static204.aClass5_Sub5_Sub1_2.aClass56_10.method1531();
								continue;
							}
							if (local199 == 1203) {
								local1139.anInt3257 = 6;
								local25--;
								local1139.anInt3228 = Static134.anIntArray250[local25];
								continue;
							}
							if (local199 == 1204) {
								local1139.anInt3257 = 5;
								local25--;
								local1139.anInt3228 = Static134.anIntArray250[local25];
								continue;
							}
						} else if ((local199 < 1300 || local199 >= 1400) && (local199 < 2300 || local199 >= 2400)) {
							if (local199 >= 1400 && local199 < 1500 || local199 >= 2400 && local199 < 2500) {
								if (local199 >= 2000) {
									local199 -= 1000;
									local25--;
									local1139 = Static13.method333(Static134.anIntArray250[local25]);
								} else {
									local1139 = local974 ? Static183.aClass86_13 : Static58.aClass86_2;
								}
								local27--;
								local1955 = Static101.aClass107Array10[local27];
								@Pc(10764) int[] local10764 = null;
								if (local1955.method3095() > 0 && local1955.method3086(local1955.method3095() - 1) == 89) {
									local25--;
									local609 = Static134.anIntArray250[local25];
									if (local609 > 0) {
										local10764 = new int[local609];
										while (local609-- > 0) {
											local25--;
											local10764[local609] = Static134.anIntArray250[local25];
										}
									}
									local1955 = local1955.method3104(0, local1955.method3095() - 1);
								}
								@Pc(10820) Object[] local10820 = new Object[local1955.method3095() + 1];
								for (local633 = local10820.length - 1; local633 >= 1; local633--) {
									if (local1955.method3086(local633 - 1) == 115) {
										local27--;
										local10820[local633] = Static101.aClass107Array10[local27];
									} else {
										local25--;
										local10820[local633] = Integer.valueOf(Static134.anIntArray250[local25]);
									}
								}
								local25--;
								local1043 = Static134.anIntArray250[local25];
								if (local1043 == -1) {
									local10820 = null;
								} else {
									local10820[0] = Integer.valueOf(local1043);
								}
								if (local199 == 1400) {
									local1139.anObjectArray22 = local10820;
								} else if (local199 == 1401) {
									local1139.anObjectArray19 = local10820;
								} else if (local199 == 1402) {
									local1139.anObjectArray16 = local10820;
								} else if (local199 == 1403) {
									local1139.anObjectArray7 = local10820;
								} else if (local199 == 1404) {
									local1139.anObjectArray26 = local10820;
								} else if (local199 == 1405) {
									local1139.anObjectArray3 = local10820;
								} else if (local199 == 1406) {
									local1139.anObjectArray13 = local10820;
								} else if (local199 == 1407) {
									local1139.anObjectArray32 = local10820;
									local1139.anIntArray281 = local10764;
								} else if (local199 == 1408) {
									local1139.anObjectArray14 = local10820;
								} else if (local199 == 1409) {
									local1139.anObjectArray12 = local10820;
								} else if (local199 == 1410) {
									local1139.anObjectArray21 = local10820;
								} else if (local199 == 1411) {
									local1139.anObjectArray9 = local10820;
								} else if (local199 == 1412) {
									local1139.anObjectArray11 = local10820;
								} else if (local199 == 1414) {
									local1139.anIntArray277 = local10764;
									local1139.anObjectArray31 = local10820;
								} else if (local199 == 1415) {
									local1139.anIntArray276 = local10764;
									local1139.anObjectArray24 = local10820;
								} else if (local199 == 1416) {
									local1139.anObjectArray29 = local10820;
								} else if (local199 == 1417) {
									local1139.anObjectArray15 = local10820;
								} else if (local199 == 1418) {
									local1139.anObjectArray10 = local10820;
								} else if (local199 == 1419) {
									local1139.anObjectArray4 = local10820;
								} else if (local199 == 1420) {
									local1139.anObjectArray5 = local10820;
								} else if (local199 == 1421) {
									local1139.anObjectArray28 = local10820;
								} else if (local199 == 1422) {
									local1139.anObjectArray30 = local10820;
								} else if (local199 == 1423) {
									local1139.anObjectArray18 = local10820;
								} else if (local199 == 1424) {
									local1139.anObjectArray17 = local10820;
								} else if (local199 == 1425) {
									local1139.anObjectArray20 = local10820;
								} else if (local199 == 1426) {
									local1139.anObjectArray23 = local10820;
								} else if (local199 == 1427) {
									local1139.anObjectArray27 = local10820;
								} else if (local199 == 1428) {
									local1139.anObjectArray8 = local10820;
									local1139.anIntArray282 = local10764;
								} else if (local199 == 1429) {
									local1139.anIntArray286 = local10764;
									local1139.anObjectArray25 = local10820;
								}
								local1139.aBoolean277 = true;
								continue;
							}
							if (local199 < 1600) {
								local1139 = local974 ? Static183.aClass86_13 : Static58.aClass86_2;
								if (local199 == 1500) {
									Static134.anIntArray250[local25++] = local1139.anInt3215;
									continue;
								}
								if (local199 == 1501) {
									Static134.anIntArray250[local25++] = local1139.anInt3268;
									continue;
								}
								if (local199 == 1502) {
									Static134.anIntArray250[local25++] = local1139.anInt3280;
									continue;
								}
								if (local199 == 1503) {
									Static134.anIntArray250[local25++] = local1139.anInt3270;
									continue;
								}
								if (local199 == 1504) {
									Static134.anIntArray250[local25++] = local1139.aBoolean275 ? 1 : 0;
									continue;
								}
								if (local199 == 1505) {
									Static134.anIntArray250[local25++] = local1139.anInt3225;
									continue;
								}
							} else if (local199 < 1700) {
								local1139 = local974 ? Static183.aClass86_13 : Static58.aClass86_2;
								if (local199 == 1600) {
									Static134.anIntArray250[local25++] = local1139.anInt3256;
									continue;
								}
								if (local199 == 1601) {
									Static134.anIntArray250[local25++] = local1139.anInt3222;
									continue;
								}
								if (local199 == 1602) {
									Static101.aClass107Array10[local27++] = local1139.aClass107_867;
									continue;
								}
								if (local199 == 1603) {
									Static134.anIntArray250[local25++] = local1139.anInt3218;
									continue;
								}
								if (local199 == 1604) {
									Static134.anIntArray250[local25++] = local1139.anInt3266;
									continue;
								}
								if (local199 == 1605) {
									Static134.anIntArray250[local25++] = local1139.anInt3214;
									continue;
								}
								if (local199 == 1606) {
									Static134.anIntArray250[local25++] = local1139.anInt3229;
									continue;
								}
								if (local199 == 1607) {
									Static134.anIntArray250[local25++] = local1139.anInt3217;
									continue;
								}
								if (local199 == 1608) {
									Static134.anIntArray250[local25++] = local1139.anInt3275;
									continue;
								}
								if (local199 == 1609) {
									Static134.anIntArray250[local25++] = local1139.anInt3277;
									continue;
								}
							} else if (local199 < 1800) {
								local1139 = local974 ? Static183.aClass86_13 : Static58.aClass86_2;
								if (local199 == 1700) {
									Static134.anIntArray250[local25++] = local1139.anInt3233;
									continue;
								}
								if (local199 == 1701) {
									if (local1139.anInt3233 == -1) {
										Static134.anIntArray250[local25++] = 0;
									} else {
										Static134.anIntArray250[local25++] = local1139.anInt3291;
									}
									continue;
								}
								if (local199 == 1702) {
									Static134.anIntArray250[local25++] = local1139.anInt3219;
									continue;
								}
							} else if (local199 < 1900) {
								local1139 = local974 ? Static183.aClass86_13 : Static58.aClass86_2;
								if (local199 == 1800) {
									Static134.anIntArray250[local25++] = Static65.method1211(Static34.method676(local1139));
									continue;
								}
								if (local199 == 1801) {
									local25--;
									local772 = Static134.anIntArray250[local25];
									local772--;
									if (local1139.aClass107Array18 != null && local1139.aClass107Array18.length > local772 && local1139.aClass107Array18[local772] != null) {
										Static101.aClass107Array10[local27++] = local1139.aClass107Array18[local772];
										continue;
									}
									Static101.aClass107Array10[local27++] = Static131.aClass107_766;
									continue;
								}
								if (local199 == 1802) {
									if (local1139.aClass107_863 == null) {
										Static101.aClass107Array10[local27++] = Static131.aClass107_766;
									} else {
										Static101.aClass107Array10[local27++] = local1139.aClass107_863;
									}
									continue;
								}
							} else if (local199 < 2600) {
								local25--;
								local1139 = Static13.method333(Static134.anIntArray250[local25]);
								if (local199 == 2500) {
									Static134.anIntArray250[local25++] = local1139.anInt3215;
									continue;
								}
								if (local199 == 2501) {
									Static134.anIntArray250[local25++] = local1139.anInt3268;
									continue;
								}
								if (local199 == 2502) {
									Static134.anIntArray250[local25++] = local1139.anInt3280;
									continue;
								}
								if (local199 == 2503) {
									Static134.anIntArray250[local25++] = local1139.anInt3270;
									continue;
								}
								if (local199 == 2504) {
									Static134.anIntArray250[local25++] = local1139.aBoolean275 ? 1 : 0;
									continue;
								}
								if (local199 == 2505) {
									Static134.anIntArray250[local25++] = local1139.anInt3225;
									continue;
								}
							} else if (local199 < 2700) {
								local25--;
								local1139 = Static13.method333(Static134.anIntArray250[local25]);
								if (local199 == 2600) {
									Static134.anIntArray250[local25++] = local1139.anInt3256;
									continue;
								}
								if (local199 == 2601) {
									Static134.anIntArray250[local25++] = local1139.anInt3222;
									continue;
								}
								if (local199 == 2602) {
									Static101.aClass107Array10[local27++] = local1139.aClass107_867;
									continue;
								}
								if (local199 == 2603) {
									Static134.anIntArray250[local25++] = local1139.anInt3218;
									continue;
								}
								if (local199 == 2604) {
									Static134.anIntArray250[local25++] = local1139.anInt3266;
									continue;
								}
								if (local199 == 2605) {
									Static134.anIntArray250[local25++] = local1139.anInt3214;
									continue;
								}
								if (local199 == 2606) {
									Static134.anIntArray250[local25++] = local1139.anInt3229;
									continue;
								}
								if (local199 == 2607) {
									Static134.anIntArray250[local25++] = local1139.anInt3217;
									continue;
								}
								if (local199 == 2608) {
									Static134.anIntArray250[local25++] = local1139.anInt3275;
									continue;
								}
								if (local199 == 2609) {
									Static134.anIntArray250[local25++] = local1139.anInt3277;
									continue;
								}
							} else if (local199 < 2800) {
								if (local199 == 2700) {
									local25--;
									local1139 = Static13.method333(Static134.anIntArray250[local25]);
									Static134.anIntArray250[local25++] = local1139.anInt3233;
									continue;
								}
								if (local199 == 2701) {
									local25--;
									local1139 = Static13.method333(Static134.anIntArray250[local25]);
									if (local1139.anInt3233 == -1) {
										Static134.anIntArray250[local25++] = 0;
									} else {
										Static134.anIntArray250[local25++] = local1139.anInt3291;
									}
									continue;
								}
								if (local199 == 2702) {
									local25--;
									local767 = Static134.anIntArray250[local25];
									@Pc(1606) Class1_Sub11 local1606 = (Class1_Sub11) Static154.aClass50_18.method1364((long) local767);
									if (local1606 == null) {
										Static134.anIntArray250[local25++] = 0;
									} else {
										Static134.anIntArray250[local25++] = 1;
									}
									continue;
								}
								if (local199 == 2703) {
									local25--;
									local1139 = Static13.method333(Static134.anIntArray250[local25]);
									if (local1139.aClass86Array1 == null) {
										Static134.anIntArray250[local25++] = 0;
										continue;
									}
									local772 = local1139.aClass86Array1.length;
									for (local1005 = 0; local1005 < local1139.aClass86Array1.length; local1005++) {
										if (local1139.aClass86Array1[local1005] == null) {
											local772 = local1005;
											break;
										}
									}
									Static134.anIntArray250[local25++] = local772;
									continue;
								}
								if (local199 == 2704 || local199 == 2705) {
									local25 -= 2;
									local767 = Static134.anIntArray250[local25];
									local772 = Static134.anIntArray250[local25 + 1];
									@Pc(1702) Class1_Sub11 local1702 = (Class1_Sub11) Static154.aClass50_18.method1364((long) local767);
									if (local1702 != null && local772 == local1702.anInt1575) {
										Static134.anIntArray250[local25++] = 1;
										continue;
									}
									Static134.anIntArray250[local25++] = 0;
									continue;
								}
							} else if (local199 < 2900) {
								local25--;
								local1139 = Static13.method333(Static134.anIntArray250[local25]);
								if (local199 == 2800) {
									Static134.anIntArray250[local25++] = Static65.method1211(Static34.method676(local1139));
									continue;
								}
								if (local199 == 2801) {
									local25--;
									local772 = Static134.anIntArray250[local25];
									local772--;
									if (local1139.aClass107Array18 != null && local1139.aClass107Array18.length > local772 && local1139.aClass107Array18[local772] != null) {
										Static101.aClass107Array10[local27++] = local1139.aClass107Array18[local772];
										continue;
									}
									Static101.aClass107Array10[local27++] = Static131.aClass107_766;
									continue;
								}
								if (local199 == 2802) {
									if (local1139.aClass107_863 == null) {
										Static101.aClass107Array10[local27++] = Static131.aClass107_766;
									} else {
										Static101.aClass107Array10[local27++] = local1139.aClass107_863;
									}
									continue;
								}
							} else if (local199 < 3200) {
								if (local199 == 3100) {
									local27--;
									local565 = Static101.aClass107Array10[local27];
									Static136.method2282(local565, 0, Static131.aClass107_766);
									continue;
								}
								if (local199 == 3101) {
									local25 -= 2;
									Static104.method2404(Static134.anIntArray250[local25], Static204.aClass5_Sub5_Sub1_2, Static134.anIntArray250[local25 + 1]);
									continue;
								}
								if (local199 == 3103) {
									Static54.method1091();
									continue;
								}
								if (local199 == 3104) {
									local772 = 0;
									local27--;
									local565 = Static101.aClass107Array10[local27];
									if (local565.method3111()) {
										local772 = local565.method3103();
									}
									Static193.aClass1_Sub26_Sub1_2.method3000(239);
									Static193.aClass1_Sub26_Sub1_2.method2973(local772);
									continue;
								}
								if (local199 == 3105) {
									local27--;
									local565 = Static101.aClass107Array10[local27];
									Static193.aClass1_Sub26_Sub1_2.method3000(148);
									Static193.aClass1_Sub26_Sub1_2.method2940(local565.method3066());
									continue;
								}
								if (local199 == 3106) {
									local27--;
									local565 = Static101.aClass107Array10[local27];
									Static193.aClass1_Sub26_Sub1_2.method3000(234);
									Static193.aClass1_Sub26_Sub1_2.method2967(local565.method3095() + 1);
									Static193.aClass1_Sub26_Sub1_2.method2979(local565);
									continue;
								}
								if (local199 == 3107) {
									local27--;
									local1955 = Static101.aClass107Array10[local27];
									local25--;
									local767 = Static134.anIntArray250[local25];
									Static176.method2782(local767, local1955);
									continue;
								}
								if (local199 == 3108) {
									local25 -= 3;
									local767 = Static134.anIntArray250[local25];
									local1005 = Static134.anIntArray250[local25 + 2];
									local772 = Static134.anIntArray250[local25 + 1];
									local1018 = Static13.method333(local1005);
									Static118.method2043(local772, local1018, local767);
									continue;
								}
								if (local199 == 3109) {
									local25 -= 2;
									local772 = Static134.anIntArray250[local25 + 1];
									local767 = Static134.anIntArray250[local25];
									local1211 = local974 ? Static183.aClass86_13 : Static58.aClass86_2;
									Static118.method2043(local772, local1211, local767);
									continue;
								}
								if (local199 == 3110) {
									local25--;
									local767 = Static134.anIntArray250[local25];
									Static193.aClass1_Sub26_Sub1_2.method3000(56);
									Static193.aClass1_Sub26_Sub1_2.method2963(local767);
									continue;
								}
							} else if (local199 < 3300) {
								if (local199 == 3200) {
									local25 -= 3;
									Static15.method337(Static134.anIntArray250[local25], Static134.anIntArray250[local25 + 2], Static134.anIntArray250[local25 + 1]);
									continue;
								}
								if (local199 == 3201) {
									local25--;
									Static97.method1648(Static134.anIntArray250[local25]);
									continue;
								}
								if (local199 == 3202) {
									local25 -= 2;
									Static224.method3664(Static134.anIntArray250[local25 + 1], Static134.anIntArray250[local25]);
									continue;
								}
							} else if (local199 < 3400) {
								if (local199 == 3300) {
									Static134.anIntArray250[local25++] = Static128.anInt2802;
									continue;
								}
								if (local199 == 3301) {
									local25 -= 2;
									local767 = Static134.anIntArray250[local25];
									local772 = Static134.anIntArray250[local25 + 1];
									Static134.anIntArray250[local25++] = Static173.method2749(local772, local767);
									continue;
								}
								if (local199 == 3302) {
									local25 -= 2;
									local767 = Static134.anIntArray250[local25];
									local772 = Static134.anIntArray250[local25 + 1];
									Static134.anIntArray250[local25++] = Static57.method3712(local772, local767);
									continue;
								}
								if (local199 == 3303) {
									local25 -= 2;
									local767 = Static134.anIntArray250[local25];
									local772 = Static134.anIntArray250[local25 + 1];
									Static134.anIntArray250[local25++] = Static211.method3402(local772, local767);
									continue;
								}
								if (local199 == 3304) {
									local25--;
									local767 = Static134.anIntArray250[local25];
									Static134.anIntArray250[local25++] = Static11.method315(local767).anInt109;
									continue;
								}
								if (local199 == 3305) {
									local25--;
									local767 = Static134.anIntArray250[local25];
									Static134.anIntArray250[local25++] = Static85.anIntArray191[local767];
									continue;
								}
								if (local199 == 3306) {
									local25--;
									local767 = Static134.anIntArray250[local25];
									Static134.anIntArray250[local25++] = Static59.anIntArray126[local767];
									continue;
								}
								if (local199 == 3307) {
									local25--;
									local767 = Static134.anIntArray250[local25];
									Static134.anIntArray250[local25++] = Static83.anIntArray180[local767];
									continue;
								}
								if (local199 == 3308) {
									local1005 = (Static204.aClass5_Sub5_Sub1_2.anInt3044 >> 7) + Static152.anInt3377;
									local767 = Static191.anInt4237;
									local772 = Static36.anInt764 + (Static204.aClass5_Sub5_Sub1_2.anInt3021 >> 7);
									Static134.anIntArray250[local25++] = (local767 << 28) + (local772 << 14) + local1005;
									continue;
								}
								if (local199 == 3309) {
									local25--;
									local767 = Static134.anIntArray250[local25];
									Static134.anIntArray250[local25++] = local767 >> 14 & 0x3FFF;
									continue;
								}
								if (local199 == 3310) {
									local25--;
									local767 = Static134.anIntArray250[local25];
									Static134.anIntArray250[local25++] = local767 >> 28;
									continue;
								}
								if (local199 == 3311) {
									local25--;
									local767 = Static134.anIntArray250[local25];
									Static134.anIntArray250[local25++] = local767 & 0x3FFF;
									continue;
								}
								if (local199 == 3312) {
									Static134.anIntArray250[local25++] = Static209.aBoolean396 ? 1 : 0;
									continue;
								}
								if (local199 == 3313) {
									local25 -= 2;
									local767 = Static134.anIntArray250[local25] + 32768;
									local772 = Static134.anIntArray250[local25 + 1];
									Static134.anIntArray250[local25++] = Static173.method2749(local772, local767);
									continue;
								}
								if (local199 == 3314) {
									local25 -= 2;
									local772 = Static134.anIntArray250[local25 + 1];
									local767 = Static134.anIntArray250[local25] + 32768;
									Static134.anIntArray250[local25++] = Static57.method3712(local772, local767);
									continue;
								}
								if (local199 == 3315) {
									local25 -= 2;
									local767 = Static134.anIntArray250[local25] + 32768;
									local772 = Static134.anIntArray250[local25 + 1];
									Static134.anIntArray250[local25++] = Static211.method3402(local772, local767);
									continue;
								}
								if (local199 == 3316) {
									if (Static156.anInt3417 < 2) {
										Static134.anIntArray250[local25++] = 0;
									} else {
										Static134.anIntArray250[local25++] = Static156.anInt3417;
									}
									continue;
								}
								if (local199 == 3317) {
									Static134.anIntArray250[local25++] = Static207.anInt4426;
									continue;
								}
								if (local199 == 3318) {
									Static134.anIntArray250[local25++] = Static170.anInt3689;
									continue;
								}
								if (local199 == 3321) {
									Static134.anIntArray250[local25++] = Static90.anInt1960;
									continue;
								}
								if (local199 == 3322) {
									Static134.anIntArray250[local25++] = Static171.anInt3711;
									continue;
								}
								if (local199 == 3323) {
									if (Static128.anInt2799 >= 5 && Static128.anInt2799 <= 9) {
										Static134.anIntArray250[local25++] = 1;
										continue;
									}
									Static134.anIntArray250[local25++] = 0;
									continue;
								}
								if (local199 == 3324) {
									if (Static128.anInt2799 >= 5 && Static128.anInt2799 <= 9) {
										Static134.anIntArray250[local25++] = Static128.anInt2799;
										continue;
									}
									Static134.anIntArray250[local25++] = 0;
									continue;
								}
								if (local199 == 3325) {
									if (Static130.anInt2837 > 0) {
										Static134.anIntArray250[local25++] = 1;
									} else {
										Static134.anIntArray250[local25++] = 0;
									}
									continue;
								}
								if (local199 == 3326) {
									Static134.anIntArray250[local25++] = Static204.aClass5_Sub5_Sub1_2.anInt1286;
									continue;
								}
								if (local199 == 3327) {
									Static134.anIntArray250[local25++] = Static204.aClass5_Sub5_Sub1_2.aClass56_10.aBoolean181 ? 1 : 0;
									continue;
								}
								if (local199 == 3328) {
									Static134.anIntArray250[local25++] = Static49.anInt1281;
									continue;
								}
								if (local199 == 3329) {
									Static134.anIntArray250[local25++] = Static99.anInt929;
									continue;
								}
								if (local199 == 3330) {
									local25--;
									local767 = Static134.anIntArray250[local25];
									Static134.anIntArray250[local25++] = Static154.method2515(local767);
									continue;
								}
								if (local199 == 3331) {
									local25 -= 2;
									local767 = Static134.anIntArray250[local25];
									local772 = Static134.anIntArray250[local25 + 1];
									Static134.anIntArray250[local25++] = Static198.method3190(local767, false, local772);
									continue;
								}
								if (local199 == 3332) {
									local25 -= 2;
									local767 = Static134.anIntArray250[local25];
									local772 = Static134.anIntArray250[local25 + 1];
									Static134.anIntArray250[local25++] = Static198.method3190(local767, true, local772);
									continue;
								}
								if (local199 == 3333) {
									Static134.anIntArray250[local25++] = Static98.anInt2134;
									continue;
								}
							} else if (local199 < 3500) {
								@Pc(9340) Class1_Sub2_Sub17 local9340;
								if (local199 == 3400) {
									local25 -= 2;
									local767 = Static134.anIntArray250[local25];
									local772 = Static134.anIntArray250[local25 + 1];
									local9340 = Static31.method2201(local767);
									Static101.aClass107Array10[local27++] = local9340.method3280(local772);
									continue;
								}
								if (local199 == 3408) {
									local25 -= 4;
									local767 = Static134.anIntArray250[local25];
									local772 = Static134.anIntArray250[local25 + 1];
									local609 = Static134.anIntArray250[local25 + 3];
									local1005 = Static134.anIntArray250[local25 + 2];
									@Pc(9380) Class1_Sub2_Sub17 local9380 = Static31.method2201(local1005);
									if (local9380.anInt4418 == local767 && local9380.anInt4420 == local772) {
										if (local772 == 115) {
											Static101.aClass107Array10[local27++] = local9380.method3280(local609);
										} else {
											Static134.anIntArray250[local25++] = local9380.method3278(local609);
										}
										continue;
									}
									throw new RuntimeException("C3408-1");
								}
								if (local199 == 3409) {
									local25 -= 3;
									local767 = Static134.anIntArray250[local25];
									local772 = Static134.anIntArray250[local25 + 1];
									local1005 = Static134.anIntArray250[local25 + 2];
									@Pc(9450) Class1_Sub2_Sub17 local9450 = Static31.method2201(local772);
									if (local9450.anInt4420 != local767) {
										throw new RuntimeException("C3409-1");
									}
									Static134.anIntArray250[local25++] = local9450.method3284(local1005) ? 1 : 0;
									continue;
								}
								if (local199 == 3410) {
									local25--;
									local767 = Static134.anIntArray250[local25];
									local27--;
									local1955 = Static101.aClass107Array10[local27];
									local9340 = Static31.method2201(local767);
									if (local9340.anInt4420 != 115) {
										throw new RuntimeException("C3410-1");
									}
									Static134.anIntArray250[local25++] = local9340.method3277(local1955) ? 1 : 0;
									continue;
								}
							} else if (local199 < 3700) {
								if (local199 == 3600) {
									if (Static3.anInt3934 == 0) {
										Static134.anIntArray250[local25++] = -2;
									} else if (Static3.anInt3934 == 1) {
										Static134.anIntArray250[local25++] = -1;
									} else {
										Static134.anIntArray250[local25++] = Static231.anInt4994;
									}
									continue;
								}
								if (local199 == 3601) {
									local25--;
									local767 = Static134.anIntArray250[local25];
									if (Static3.anInt3934 == 2 && local767 < Static231.anInt4994) {
										Static101.aClass107Array10[local27++] = Static178.aClass107Array23[local767];
										continue;
									}
									Static101.aClass107Array10[local27++] = Static131.aClass107_766;
									continue;
								}
								if (local199 == 3602) {
									local25--;
									local767 = Static134.anIntArray250[local25];
									if (Static3.anInt3934 == 2 && Static231.anInt4994 > local767) {
										Static134.anIntArray250[local25++] = Static196.anIntArray351[local767];
										continue;
									}
									Static134.anIntArray250[local25++] = 0;
									continue;
								}
								if (local199 == 3603) {
									local25--;
									local767 = Static134.anIntArray250[local25];
									if (Static3.anInt3934 == 2 && Static231.anInt4994 > local767) {
										Static134.anIntArray250[local25++] = Static151.anIntArray292[local767];
										continue;
									}
									Static134.anIntArray250[local25++] = 0;
									continue;
								}
								if (local199 == 3604) {
									local27--;
									local565 = Static101.aClass107Array10[local27];
									local25--;
									local772 = Static134.anIntArray250[local25];
									Static127.method2123(local565, local772);
									continue;
								}
								if (local199 == 3605) {
									local27--;
									local565 = Static101.aClass107Array10[local27];
									Static114.method1974(local565.method3066());
									continue;
								}
								if (local199 == 3606) {
									local27--;
									local565 = Static101.aClass107Array10[local27];
									Static88.method1502(local565.method3066());
									continue;
								}
								if (local199 == 3607) {
									local27--;
									local565 = Static101.aClass107Array10[local27];
									Static36.method702(local565.method3066());
									continue;
								}
								if (local199 == 3608) {
									local27--;
									local565 = Static101.aClass107Array10[local27];
									Static168.method2688(local565.method3066());
									continue;
								}
								if (local199 == 3609) {
									local27--;
									local565 = Static101.aClass107Array10[local27];
									if (local565.method3099(Static105.aClass107_626) || local565.method3099(Static130.aClass107_758)) {
										local565 = local565.method3084(7);
									}
									Static134.anIntArray250[local25++] = Static71.method1286(local565) ? 1 : 0;
									continue;
								}
								if (local199 == 3610) {
									local25--;
									local767 = Static134.anIntArray250[local25];
									if (Static3.anInt3934 == 2 && local767 < Static231.anInt4994) {
										Static101.aClass107Array10[local27++] = Static149.aClass107Array17[local767];
										continue;
									}
									Static101.aClass107Array10[local27++] = Static131.aClass107_766;
									continue;
								}
								if (local199 == 3611) {
									if (Static116.aClass107_694 == null) {
										Static101.aClass107Array10[local27++] = Static131.aClass107_766;
									} else {
										Static101.aClass107Array10[local27++] = Static116.aClass107_694.method3092();
									}
									continue;
								}
								if (local199 == 3612) {
									if (Static116.aClass107_694 == null) {
										Static134.anIntArray250[local25++] = 0;
									} else {
										Static134.anIntArray250[local25++] = Static22.anInt437;
									}
									continue;
								}
								if (local199 == 3613) {
									local25--;
									local767 = Static134.anIntArray250[local25];
									if (Static116.aClass107_694 != null && local767 < Static22.anInt437) {
										Static101.aClass107Array10[local27++] = Static39.aClass1_Sub13Array1[local767].aClass107_503.method3092();
										continue;
									}
									Static101.aClass107Array10[local27++] = Static131.aClass107_766;
									continue;
								}
								if (local199 == 3614) {
									local25--;
									local767 = Static134.anIntArray250[local25];
									if (Static116.aClass107_694 != null && Static22.anInt437 > local767) {
										Static134.anIntArray250[local25++] = Static39.aClass1_Sub13Array1[local767].anInt1728;
										continue;
									}
									Static134.anIntArray250[local25++] = 0;
									continue;
								}
								if (local199 == 3615) {
									local25--;
									local767 = Static134.anIntArray250[local25];
									if (Static116.aClass107_694 != null && Static22.anInt437 > local767) {
										Static134.anIntArray250[local25++] = Static39.aClass1_Sub13Array1[local767].aByte9;
										continue;
									}
									Static134.anIntArray250[local25++] = 0;
									continue;
								}
								if (local199 == 3616) {
									Static134.anIntArray250[local25++] = Static16.aByte3;
									continue;
								}
								if (local199 == 3617) {
									local27--;
									local565 = Static101.aClass107Array10[local27];
									Static91.method1539(local565);
									continue;
								}
								if (local199 == 3618) {
									Static134.anIntArray250[local25++] = Static10.aByte2;
									continue;
								}
								if (local199 == 3619) {
									local27--;
									local565 = Static101.aClass107Array10[local27];
									Static190.method3097(local565.method3066());
									continue;
								}
								if (local199 == 3620) {
									Static65.method1209();
									continue;
								}
								if (local199 == 3621) {
									if (Static3.anInt3934 == 0) {
										Static134.anIntArray250[local25++] = -1;
									} else {
										Static134.anIntArray250[local25++] = Static174.anInt3793;
									}
									continue;
								}
								if (local199 == 3622) {
									local25--;
									local767 = Static134.anIntArray250[local25];
									if (Static3.anInt3934 != 0 && Static174.anInt3793 > local767) {
										Static101.aClass107Array10[local27++] = Static19.method382(Static201.aLongArray7[local767]).method3092();
										continue;
									}
									Static101.aClass107Array10[local27++] = Static131.aClass107_766;
									continue;
								}
								if (local199 == 3623) {
									local27--;
									local565 = Static101.aClass107Array10[local27];
									if (local565.method3099(Static105.aClass107_626) || local565.method3099(Static130.aClass107_758)) {
										local565 = local565.method3084(7);
									}
									Static134.anIntArray250[local25++] = Static196.method3168(local565) ? 1 : 0;
									continue;
								}
								if (local199 == 3624) {
									local25--;
									local767 = Static134.anIntArray250[local25];
									if (Static39.aClass1_Sub13Array1 != null && local767 < Static22.anInt437 && Static39.aClass1_Sub13Array1[local767].aClass107_503.method3096(Static204.aClass5_Sub5_Sub1_2.aClass107_351)) {
										Static134.anIntArray250[local25++] = 1;
										continue;
									}
									Static134.anIntArray250[local25++] = 0;
									continue;
								}
								if (local199 == 3625) {
									if (Static151.aClass107_879 == null) {
										Static101.aClass107Array10[local27++] = Static131.aClass107_766;
									} else {
										Static101.aClass107Array10[local27++] = Static151.aClass107_879.method3092();
									}
									continue;
								}
								if (local199 == 3626) {
									local25--;
									local767 = Static134.anIntArray250[local25];
									if (Static116.aClass107_694 != null && local767 < Static22.anInt437) {
										Static101.aClass107Array10[local27++] = Static39.aClass1_Sub13Array1[local767].aClass107_504;
										continue;
									}
									Static101.aClass107Array10[local27++] = Static131.aClass107_766;
									continue;
								}
								if (local199 == 3627) {
									local25--;
									local767 = Static134.anIntArray250[local25];
									if (Static3.anInt3934 == 2 && local767 >= 0 && Static231.anInt4994 > local767) {
										Static134.anIntArray250[local25++] = Static211.aBooleanArray27[local767] ? 1 : 0;
										continue;
									}
									Static134.anIntArray250[local25++] = 0;
									continue;
								}
								if (local199 == 3628) {
									local27--;
									local565 = Static101.aClass107Array10[local27];
									if (local565.method3099(Static105.aClass107_626) || local565.method3099(Static130.aClass107_758)) {
										local565 = local565.method3084(7);
									}
									Static134.anIntArray250[local25++] = Static222.method2986(local565);
									continue;
								}
							} else if (local199 < 4000) {
								if (local199 == 3903) {
									local25--;
									local767 = Static134.anIntArray250[local25];
									Static134.anIntArray250[local25++] = Static165.aClass15Array2[local767].method375();
									continue;
								}
								if (local199 == 3904) {
									local25--;
									local767 = Static134.anIntArray250[local25];
									Static134.anIntArray250[local25++] = Static165.aClass15Array2[local767].anInt396;
									continue;
								}
								if (local199 == 3905) {
									local25--;
									local767 = Static134.anIntArray250[local25];
									Static134.anIntArray250[local25++] = Static165.aClass15Array2[local767].anInt391;
									continue;
								}
								if (local199 == 3906) {
									local25--;
									local767 = Static134.anIntArray250[local25];
									Static134.anIntArray250[local25++] = Static165.aClass15Array2[local767].anInt390;
									continue;
								}
								if (local199 == 3907) {
									local25--;
									local767 = Static134.anIntArray250[local25];
									Static134.anIntArray250[local25++] = Static165.aClass15Array2[local767].anInt400;
									continue;
								}
								if (local199 == 3908) {
									local25--;
									local767 = Static134.anIntArray250[local25];
									Static134.anIntArray250[local25++] = Static165.aClass15Array2[local767].anInt384;
									continue;
								}
								if (local199 == 3910) {
									local25--;
									local767 = Static134.anIntArray250[local25];
									local772 = Static165.aClass15Array2[local767].method378();
									Static134.anIntArray250[local25++] = local772 == 0 ? 1 : 0;
									continue;
								}
								if (local199 == 3911) {
									local25--;
									local767 = Static134.anIntArray250[local25];
									local772 = Static165.aClass15Array2[local767].method378();
									Static134.anIntArray250[local25++] = local772 == 2 ? 1 : 0;
									continue;
								}
								if (local199 == 3912) {
									local25--;
									local767 = Static134.anIntArray250[local25];
									local772 = Static165.aClass15Array2[local767].method378();
									Static134.anIntArray250[local25++] = local772 == 5 ? 1 : 0;
									continue;
								}
								if (local199 == 3913) {
									local25--;
									local767 = Static134.anIntArray250[local25];
									local772 = Static165.aClass15Array2[local767].method378();
									Static134.anIntArray250[local25++] = local772 == 1 ? 1 : 0;
									continue;
								}
							} else if (local199 < 4100) {
								if (local199 == 4000) {
									local25 -= 2;
									local767 = Static134.anIntArray250[local25];
									local772 = Static134.anIntArray250[local25 + 1];
									Static134.anIntArray250[local25++] = local767 + local772;
									continue;
								}
								if (local199 == 4001) {
									local25 -= 2;
									local767 = Static134.anIntArray250[local25];
									local772 = Static134.anIntArray250[local25 + 1];
									Static134.anIntArray250[local25++] = local767 - local772;
									continue;
								}
								if (local199 == 4002) {
									local25 -= 2;
									local767 = Static134.anIntArray250[local25];
									local772 = Static134.anIntArray250[local25 + 1];
									Static134.anIntArray250[local25++] = local767 * local772;
									continue;
								}
								if (local199 == 4003) {
									local25 -= 2;
									local772 = Static134.anIntArray250[local25 + 1];
									local767 = Static134.anIntArray250[local25];
									Static134.anIntArray250[local25++] = local767 / local772;
									continue;
								}
								if (local199 == 4004) {
									local25--;
									local767 = Static134.anIntArray250[local25];
									Static134.anIntArray250[local25++] = (int) (Math.random() * (double) local767);
									continue;
								}
								if (local199 == 4005) {
									local25--;
									local767 = Static134.anIntArray250[local25];
									Static134.anIntArray250[local25++] = (int) ((double) (local767 + 1) * Math.random());
									continue;
								}
								if (local199 == 4006) {
									local25 -= 5;
									local772 = Static134.anIntArray250[local25 + 1];
									local767 = Static134.anIntArray250[local25];
									local1005 = Static134.anIntArray250[local25 + 2];
									local633 = Static134.anIntArray250[local25 + 4];
									local609 = Static134.anIntArray250[local25 + 3];
									Static134.anIntArray250[local25++] = (local772 - local767) * (-local1005 + local633) / (local609 - local1005) + local767;
									continue;
								}
								@Pc(2526) long local2526;
								@Pc(2519) long local2519;
								if (local199 == 4007) {
									local25 -= 2;
									local2519 = Static134.anIntArray250[local25];
									local2526 = Static134.anIntArray250[local25 + 1];
									Static134.anIntArray250[local25++] = (int) (local2519 + local2519 * local2526 / 100L);
									continue;
								}
								if (local199 == 4008) {
									local25 -= 2;
									local767 = Static134.anIntArray250[local25];
									local772 = Static134.anIntArray250[local25 + 1];
									Static134.anIntArray250[local25++] = local767 | 0x1 << local772;
									continue;
								}
								if (local199 == 4009) {
									local25 -= 2;
									local772 = Static134.anIntArray250[local25 + 1];
									local767 = Static134.anIntArray250[local25];
									Static134.anIntArray250[local25++] = local767 & -(0x1 << local772) - 1;
									continue;
								}
								if (local199 == 4010) {
									local25 -= 2;
									local767 = Static134.anIntArray250[local25];
									local772 = Static134.anIntArray250[local25 + 1];
									Static134.anIntArray250[local25++] = (local767 & 0x1 << local772) == 0 ? 0 : 1;
									continue;
								}
								if (local199 == 4011) {
									local25 -= 2;
									local772 = Static134.anIntArray250[local25 + 1];
									local767 = Static134.anIntArray250[local25];
									Static134.anIntArray250[local25++] = local767 % local772;
									continue;
								}
								if (local199 == 4012) {
									local25 -= 2;
									local767 = Static134.anIntArray250[local25];
									local772 = Static134.anIntArray250[local25 + 1];
									if (local767 == 0) {
										Static134.anIntArray250[local25++] = 0;
									} else {
										Static134.anIntArray250[local25++] = (int) Math.pow((double) local767, (double) local772);
									}
									continue;
								}
								if (local199 == 4013) {
									local25 -= 2;
									local767 = Static134.anIntArray250[local25];
									local772 = Static134.anIntArray250[local25 + 1];
									if (local767 == 0) {
										Static134.anIntArray250[local25++] = 0;
									} else if (local772 == 0) {
										Static134.anIntArray250[local25++] = Integer.MAX_VALUE;
									} else {
										Static134.anIntArray250[local25++] = (int) Math.pow((double) local767, 1.0D / (double) local772);
									}
									continue;
								}
								if (local199 == 4014) {
									local25 -= 2;
									local767 = Static134.anIntArray250[local25];
									local772 = Static134.anIntArray250[local25 + 1];
									Static134.anIntArray250[local25++] = local772 & local767;
									continue;
								}
								if (local199 == 4015) {
									local25 -= 2;
									local772 = Static134.anIntArray250[local25 + 1];
									local767 = Static134.anIntArray250[local25];
									Static134.anIntArray250[local25++] = local772 | local767;
									continue;
								}
								if (local199 == 4016) {
									local25 -= 2;
									local772 = Static134.anIntArray250[local25 + 1];
									local767 = Static134.anIntArray250[local25];
									Static134.anIntArray250[local25++] = local772 > local767 ? local767 : local772;
									continue;
								}
								if (local199 == 4017) {
									local25 -= 2;
									local772 = Static134.anIntArray250[local25 + 1];
									local767 = Static134.anIntArray250[local25];
									Static134.anIntArray250[local25++] = local767 > local772 ? local767 : local772;
									continue;
								}
								if (local199 == 4018) {
									local25 -= 3;
									local2519 = Static134.anIntArray250[local25];
									local2526 = Static134.anIntArray250[local25 + 1];
									@Pc(2871) long local2871 = (long) Static134.anIntArray250[local25 + 2];
									Static134.anIntArray250[local25++] = (int) (local2871 * local2519 / local2526);
									continue;
								}
							} else if (local199 < 4200) {
								if (local199 == 4100) {
									local25--;
									local772 = Static134.anIntArray250[local25];
									local27--;
									local565 = Static101.aClass107Array10[local27];
									Static101.aClass107Array10[local27++] = Static149.method2437(new Class107[] { local565, Static115.method2001(local772) });
									continue;
								}
								if (local199 == 4101) {
									local27 -= 2;
									local1955 = Static101.aClass107Array10[local27 + 1];
									local565 = Static101.aClass107Array10[local27];
									Static101.aClass107Array10[local27++] = Static149.method2437(new Class107[] { local565, local1955 });
									continue;
								}
								if (local199 == 4102) {
									local27--;
									local565 = Static101.aClass107Array10[local27];
									local25--;
									local772 = Static134.anIntArray250[local25];
									Static101.aClass107Array10[local27++] = Static149.method2437(new Class107[] { local565, Static105.method1795(local772) });
									continue;
								}
								if (local199 == 4103) {
									local27--;
									local565 = Static101.aClass107Array10[local27];
									Static101.aClass107Array10[local27++] = local565.method3085();
									continue;
								}
								if (local199 == 4104) {
									local25--;
									local767 = Static134.anIntArray250[local25];
									@Pc(3025) long local3025 = ((long) local767 + 11745L) * 86400000L;
									Static40.aCalendar1.setTime(new Date(local3025));
									local609 = Static40.aCalendar1.get(5);
									local633 = Static40.aCalendar1.get(2);
									local1043 = Static40.aCalendar1.get(1);
									Static101.aClass107Array10[local27++] = Static149.method2437(new Class107[] { Static115.method2001(local609), Static40.aClass107_283, Static231.aClass107Array31[local633], Static40.aClass107_283, Static115.method2001(local1043) });
									continue;
								}
								if (local199 == 4105) {
									local27 -= 2;
									local1955 = Static101.aClass107Array10[local27 + 1];
									local565 = Static101.aClass107Array10[local27];
									if (Static204.aClass5_Sub5_Sub1_2.aClass56_10 != null && Static204.aClass5_Sub5_Sub1_2.aClass56_10.aBoolean181) {
										Static101.aClass107Array10[local27++] = local1955;
										continue;
									}
									Static101.aClass107Array10[local27++] = local565;
									continue;
								}
								if (local199 == 4106) {
									local25--;
									local767 = Static134.anIntArray250[local25];
									Static101.aClass107Array10[local27++] = Static115.method2001(local767);
									continue;
								}
								if (local199 == 4107) {
									local27 -= 2;
									Static134.anIntArray250[local25++] = Static101.aClass107Array10[local27].method3091(Static101.aClass107Array10[local27 + 1]);
									continue;
								}
								@Pc(3182) byte[] local3182;
								@Pc(3187) Class1_Sub2_Sub15_Sub1 local3187;
								if (local199 == 4108) {
									local25 -= 2;
									local27--;
									local565 = Static101.aClass107Array10[local27];
									local1005 = Static134.anIntArray250[local25 + 1];
									local772 = Static134.anIntArray250[local25];
									local3182 = Static225.aClass28_Sub1_130.method819(0, local1005);
									local3187 = new Class1_Sub2_Sub15_Sub1(local3182);
									local3187.method3338(Static93.aClass64Array2, null);
									Static134.anIntArray250[local25++] = local3187.method3337(local565, local772);
									continue;
								}
								if (local199 == 4109) {
									local25 -= 2;
									local27--;
									local565 = Static101.aClass107Array10[local27];
									local772 = Static134.anIntArray250[local25];
									local1005 = Static134.anIntArray250[local25 + 1];
									local3182 = Static225.aClass28_Sub1_130.method819(0, local1005);
									local3187 = new Class1_Sub2_Sub15_Sub1(local3182);
									local3187.method3338(Static93.aClass64Array2, null);
									Static134.anIntArray250[local25++] = local3187.method3349(local565, local772);
									continue;
								}
								if (local199 == 4110) {
									local27 -= 2;
									local1955 = Static101.aClass107Array10[local27 + 1];
									local565 = Static101.aClass107Array10[local27];
									local25--;
									if (Static134.anIntArray250[local25] == 1) {
										Static101.aClass107Array10[local27++] = local565;
									} else {
										Static101.aClass107Array10[local27++] = local1955;
									}
									continue;
								}
								if (local199 == 4111) {
									local27--;
									local565 = Static101.aClass107Array10[local27];
									Static101.aClass107Array10[local27++] = Static164.method3329(local565);
									continue;
								}
								if (local199 == 4112) {
									local27--;
									local565 = Static101.aClass107Array10[local27];
									local25--;
									local772 = Static134.anIntArray250[local25];
									if (local772 == -1) {
										throw new RuntimeException("null char");
									}
									Static101.aClass107Array10[local27++] = local565.method3072(local772);
									continue;
								}
								if (local199 == 4113) {
									local25--;
									local767 = Static134.anIntArray250[local25];
									Static134.anIntArray250[local25++] = Static198.method3188(local767) ? 1 : 0;
									continue;
								}
								if (local199 == 4114) {
									local25--;
									local767 = Static134.anIntArray250[local25];
									Static134.anIntArray250[local25++] = Static152.method2505(local767) ? 1 : 0;
									continue;
								}
								if (local199 == 4115) {
									local25--;
									local767 = Static134.anIntArray250[local25];
									Static134.anIntArray250[local25++] = Static176.method2785(local767) ? 1 : 0;
									continue;
								}
								if (local199 == 4116) {
									local25--;
									local767 = Static134.anIntArray250[local25];
									Static134.anIntArray250[local25++] = Static99.method840(local767) ? 1 : 0;
									continue;
								}
								if (local199 == 4117) {
									local27--;
									local565 = Static101.aClass107Array10[local27];
									if (local565 == null) {
										Static134.anIntArray250[local25++] = 0;
									} else {
										Static134.anIntArray250[local25++] = local565.method3095();
									}
									continue;
								}
								if (local199 == 4118) {
									local25 -= 2;
									local27--;
									local565 = Static101.aClass107Array10[local27];
									local772 = Static134.anIntArray250[local25];
									local1005 = Static134.anIntArray250[local25 + 1];
									Static101.aClass107Array10[local27++] = local565.method3104(local772, local1005);
									continue;
								}
								if (local199 == 4119) {
									local27--;
									local565 = Static101.aClass107Array10[local27];
									local1955 = Static130.method2170(local565.method3095());
									@Pc(3500) boolean local3500 = false;
									for (local609 = 0; local609 < local565.method3095(); local609++) {
										local633 = local565.method3086(local609);
										if (local633 == 60) {
											local3500 = true;
										} else if (local633 == 62) {
											local3500 = false;
										} else if (!local3500) {
											local1955.method3094(local633);
										}
									}
									local1955.method3090();
									Static101.aClass107Array10[local27++] = local1955;
									continue;
								}
								if (local199 == 4120) {
									local27--;
									local565 = Static101.aClass107Array10[local27];
									local25 -= 2;
									local772 = Static134.anIntArray250[local25];
									local1005 = Static134.anIntArray250[local25 + 1];
									Static134.anIntArray250[local25++] = local565.method3077(local772, local1005);
									continue;
								}
								if (local199 == 4121) {
									local27 -= 2;
									local1955 = Static101.aClass107Array10[local27 + 1];
									local25--;
									local1005 = Static134.anIntArray250[local25];
									local565 = Static101.aClass107Array10[local27];
									Static134.anIntArray250[local25++] = local565.method3075(local1005, local1955);
									continue;
								}
								if (local199 == 4122) {
									local25--;
									local767 = Static134.anIntArray250[local25];
									Static134.anIntArray250[local25++] = Static189.method3062(local767);
									continue;
								}
								if (local199 == 4123) {
									local25--;
									local767 = Static134.anIntArray250[local25];
									Static134.anIntArray250[local25++] = Static171.method2732(local767);
									continue;
								}
							} else {
								@Pc(3690) Class1_Sub2_Sub14 local3690;
								if (local199 < 4300) {
									if (local199 == 4200) {
										local25--;
										local767 = Static134.anIntArray250[local25];
										Static101.aClass107Array10[local27++] = Static128.method2147(local767).aClass107_737;
										continue;
									}
									@Pc(8175) Class75 local8175;
									if (local199 == 4201) {
										local25 -= 2;
										local767 = Static134.anIntArray250[local25];
										local772 = Static134.anIntArray250[local25 + 1];
										local8175 = Static128.method2147(local767);
										if (local772 >= 1 && local772 <= 5 && local8175.aClass107Array14[local772 - 1] != null) {
											Static101.aClass107Array10[local27++] = local8175.aClass107Array14[local772 - 1];
											continue;
										}
										Static101.aClass107Array10[local27++] = Static131.aClass107_766;
										continue;
									}
									if (local199 == 4202) {
										local25 -= 2;
										local767 = Static134.anIntArray250[local25];
										local772 = Static134.anIntArray250[local25 + 1];
										local8175 = Static128.method2147(local767);
										if (local772 >= 1 && local772 <= 5 && local8175.aClass107Array15[local772 - 1] != null) {
											Static101.aClass107Array10[local27++] = local8175.aClass107Array15[local772 - 1];
											continue;
										}
										Static101.aClass107Array10[local27++] = Static131.aClass107_766;
										continue;
									}
									if (local199 == 4203) {
										local25--;
										local767 = Static134.anIntArray250[local25];
										Static134.anIntArray250[local25++] = Static128.method2147(local767).anInt2707;
										continue;
									}
									if (local199 == 4204) {
										local25--;
										local767 = Static134.anIntArray250[local25];
										Static134.anIntArray250[local25++] = Static128.method2147(local767).anInt2741 == 1 ? 1 : 0;
										continue;
									}
									@Pc(8320) Class75 local8320;
									if (local199 == 4205) {
										local25--;
										local767 = Static134.anIntArray250[local25];
										local8320 = Static128.method2147(local767);
										if (local8320.anInt2744 == -1 && local8320.anInt2733 >= 0) {
											Static134.anIntArray250[local25++] = local8320.anInt2733;
											continue;
										}
										Static134.anIntArray250[local25++] = local767;
										continue;
									}
									if (local199 == 4206) {
										local25--;
										local767 = Static134.anIntArray250[local25];
										local8320 = Static128.method2147(local767);
										if (local8320.anInt2744 >= 0 && local8320.anInt2733 >= 0) {
											Static134.anIntArray250[local25++] = local8320.anInt2733;
											continue;
										}
										Static134.anIntArray250[local25++] = local767;
										continue;
									}
									if (local199 == 4207) {
										local25--;
										local767 = Static134.anIntArray250[local25];
										Static134.anIntArray250[local25++] = Static128.method2147(local767).aBoolean229 ? 1 : 0;
										continue;
									}
									if (local199 == 4208) {
										local25 -= 2;
										local767 = Static134.anIntArray250[local25];
										local772 = Static134.anIntArray250[local25 + 1];
										local3690 = Static208.method3305(local772);
										if (local3690.method2601()) {
											Static101.aClass107Array10[local27++] = Static128.method2147(local767).method2101(local3690.aClass107_943, local772);
										} else {
											Static134.anIntArray250[local25++] = Static128.method2147(local767).method2103(local3690.anInt3535, local772);
										}
										continue;
									}
									if (local199 == 4210) {
										local27--;
										local565 = Static101.aClass107Array10[local27];
										local25--;
										local772 = Static134.anIntArray250[local25];
										Static19.method376(local565, local772 == 1);
										Static134.anIntArray250[local25++] = Static98.anInt2144;
										continue;
									}
									if (local199 == 4211) {
										if (Static126.aShortArray38 != null && Static98.anInt2144 > Static213.anInt4601) {
											Static134.anIntArray250[local25++] = Static126.aShortArray38[Static213.anInt4601++] & 0xFFFF;
											continue;
										}
										Static134.anIntArray250[local25++] = -1;
										continue;
									}
									if (local199 == 4212) {
										Static213.anInt4601 = 0;
										continue;
									}
								} else if (local199 >= 4400) {
									if (local199 < 4500) {
										if (local199 == 4400) {
											local25 -= 2;
											local772 = Static134.anIntArray250[local25 + 1];
											local767 = Static134.anIntArray250[local25];
											local3690 = Static208.method3305(local772);
											if (local3690.method2601()) {
												Static101.aClass107Array10[local27++] = Static170.method2725(local767).method2844(local3690.aClass107_943, local772);
											} else {
												Static134.anIntArray250[local25++] = Static170.method2725(local767).method2840(local3690.anInt3535, local772);
											}
											continue;
										}
									} else if (local199 >= 4600) {
										if (local199 < 5100) {
											if (local199 == 5000) {
												Static134.anIntArray250[local25++] = Static107.anInt2342;
												continue;
											}
											if (local199 == 5001) {
												local25 -= 3;
												Static107.anInt2342 = Static134.anIntArray250[local25];
												Static59.anInt1432 = Static134.anIntArray250[local25 + 1];
												Static174.anInt3795 = Static134.anIntArray250[local25 + 2];
												Static193.aClass1_Sub26_Sub1_2.method3000(82);
												Static193.aClass1_Sub26_Sub1_2.method2967(Static107.anInt2342);
												Static193.aClass1_Sub26_Sub1_2.method2967(Static59.anInt1432);
												Static193.aClass1_Sub26_Sub1_2.method2967(Static174.anInt3795);
												continue;
											}
											if (local199 == 5002) {
												local25 -= 2;
												local27--;
												local565 = Static101.aClass107Array10[local27];
												local772 = Static134.anIntArray250[local25];
												local1005 = Static134.anIntArray250[local25 + 1];
												Static193.aClass1_Sub26_Sub1_2.method3000(83);
												Static193.aClass1_Sub26_Sub1_2.method2940(local565.method3066());
												Static193.aClass1_Sub26_Sub1_2.method2967(local772 - 1);
												Static193.aClass1_Sub26_Sub1_2.method2967(local1005);
												continue;
											}
											if (local199 == 5003) {
												local1955 = null;
												local25--;
												local767 = Static134.anIntArray250[local25];
												if (local767 < 100) {
													local1955 = Static61.aClass107Array7[local767];
												}
												if (local1955 == null) {
													local1955 = Static131.aClass107_766;
												}
												Static101.aClass107Array10[local27++] = local1955;
												continue;
											}
											if (local199 == 5004) {
												local25--;
												local767 = Static134.anIntArray250[local25];
												local772 = -1;
												if (local767 < 100 && Static61.aClass107Array7[local767] != null) {
													local772 = Static227.anIntArray379[local767];
												}
												Static134.anIntArray250[local25++] = local772;
												continue;
											}
											if (local199 == 5005) {
												Static134.anIntArray250[local25++] = Static59.anInt1432;
												continue;
											}
											if (local199 == 5008) {
												local27--;
												local565 = Static101.aClass107Array10[local27];
												if (local565.method3099(Static5.aClass107_96)) {
													Static23.method419(local565);
													continue;
												}
												if (Static156.anInt3417 == 0 && (Static49.anInt1281 == 1 || Static99.anInt929 == 1)) {
													continue;
												}
												@Pc(3940) byte local3940 = 0;
												local1955 = local565.method3085();
												if (local1955.method3099(Static70.aClass107_454)) {
													local565 = local565.method3084(Static70.aClass107_454.method3095());
													local3940 = 0;
												} else if (local1955.method3099(Static203.aClass107_92)) {
													local565 = local565.method3084(Static203.aClass107_92.method3095());
													local3940 = 1;
												} else if (local1955.method3099(Static178.aClass107_1057)) {
													local3940 = 2;
													local565 = local565.method3084(Static178.aClass107_1057.method3095());
												} else if (local1955.method3099(Static114.aClass107_680)) {
													local565 = local565.method3084(Static114.aClass107_680.method3095());
													local3940 = 3;
												} else if (local1955.method3099(Static157.aClass107_913)) {
													local3940 = 4;
													local565 = local565.method3084(Static157.aClass107_913.method3095());
												} else if (local1955.method3099(Static15.aClass107_127)) {
													local3940 = 5;
													local565 = local565.method3084(Static15.aClass107_127.method3095());
												} else if (local1955.method3099(Static194.aClass107_1120)) {
													local565 = local565.method3084(Static194.aClass107_1120.method3095());
													local3940 = 6;
												} else if (local1955.method3099(Static152.aClass107_889)) {
													local565 = local565.method3084(Static152.aClass107_889.method3095());
													local3940 = 7;
												} else if (local1955.method3099(Static52.aClass107_365)) {
													local3940 = 8;
													local565 = local565.method3084(Static52.aClass107_365.method3095());
												} else if (local1955.method3099(Static76.aClass107_497)) {
													local565 = local565.method3084(Static76.aClass107_497.method3095());
													local3940 = 9;
												} else if (local1955.method3099(Static210.aClass107_1224)) {
													local565 = local565.method3084(Static210.aClass107_1224.method3095());
													local3940 = 10;
												} else if (local1955.method3099(Static159.aClass107_931)) {
													local3940 = 11;
													local565 = local565.method3084(Static159.aClass107_931.method3095());
												} else if (Static141.anInt3124 != 0) {
													if (local1955.method3099(Static70.aClass107_457)) {
														local3940 = 0;
														local565 = local565.method3084(Static70.aClass107_457.method3095());
													} else if (local1955.method3099(Static203.aClass107_89)) {
														local565 = local565.method3084(Static203.aClass107_89.method3095());
														local3940 = 1;
													} else if (local1955.method3099(Static178.aClass107_1058)) {
														local3940 = 2;
														local565 = local565.method3084(Static178.aClass107_1058.method3095());
													} else if (local1955.method3099(Static114.aClass107_676)) {
														local565 = local565.method3084(Static114.aClass107_676.method3095());
														local3940 = 3;
													} else if (local1955.method3099(Static157.aClass107_909)) {
														local565 = local565.method3084(Static157.aClass107_909.method3095());
														local3940 = 4;
													} else if (local1955.method3099(Static15.aClass107_128)) {
														local3940 = 5;
														local565 = local565.method3084(Static15.aClass107_128.method3095());
													} else if (local1955.method3099(Static194.aClass107_1117)) {
														local3940 = 6;
														local565 = local565.method3084(Static194.aClass107_1117.method3095());
													} else if (local1955.method3099(Static152.aClass107_888)) {
														local565 = local565.method3084(Static152.aClass107_888.method3095());
														local3940 = 7;
													} else if (local1955.method3099(Static52.aClass107_366)) {
														local3940 = 8;
														local565 = local565.method3084(Static52.aClass107_366.method3095());
													} else if (local1955.method3099(Static76.aClass107_495)) {
														local3940 = 9;
														local565 = local565.method3084(Static76.aClass107_495.method3095());
													} else if (local1955.method3099(Static210.aClass107_1226)) {
														local3940 = 10;
														local565 = local565.method3084(Static210.aClass107_1226.method3095());
													} else if (local1955.method3099(Static159.aClass107_929)) {
														local3940 = 11;
														local565 = local565.method3084(Static159.aClass107_929.method3095());
													}
												}
												@Pc(4348) byte local4348 = 0;
												local1955 = local565.method3085();
												if (local1955.method3099(Static158.aClass107_921)) {
													local4348 = 1;
													local565 = local565.method3084(Static158.aClass107_921.method3095());
												} else if (local1955.method3099(Static206.aClass107_1170)) {
													local4348 = 2;
													local565 = local565.method3084(Static206.aClass107_1170.method3095());
												} else if (local1955.method3099(Static39.aClass107_272)) {
													local4348 = 3;
													local565 = local565.method3084(Static39.aClass107_272.method3095());
												} else if (local1955.method3099(Static71.aClass107_471)) {
													local4348 = 4;
													local565 = local565.method3084(Static71.aClass107_471.method3095());
												} else if (local1955.method3099(Static25.aClass107_165)) {
													local565 = local565.method3084(Static25.aClass107_165.method3095());
													local4348 = 5;
												} else if (Static141.anInt3124 != 0) {
													if (local1955.method3099(Static158.aClass107_926)) {
														local565 = local565.method3084(Static158.aClass107_926.method3095());
														local4348 = 1;
													} else if (local1955.method3099(Static206.aClass107_1169)) {
														local565 = local565.method3084(Static206.aClass107_1169.method3095());
														local4348 = 2;
													} else if (local1955.method3099(Static39.aClass107_275)) {
														local565 = local565.method3084(Static39.aClass107_275.method3095());
														local4348 = 3;
													} else if (local1955.method3099(Static71.aClass107_469)) {
														local4348 = 4;
														local565 = local565.method3084(Static71.aClass107_469.method3095());
													} else if (local1955.method3099(Static25.aClass107_167)) {
														local4348 = 5;
														local565 = local565.method3084(Static25.aClass107_167.method3095());
													}
												}
												Static193.aClass1_Sub26_Sub1_2.method3000(70);
												Static193.aClass1_Sub26_Sub1_2.method2967(0);
												local633 = Static193.aClass1_Sub26_Sub1_2.anInt4021;
												Static193.aClass1_Sub26_Sub1_2.method2967(local3940);
												Static193.aClass1_Sub26_Sub1_2.method2967(local4348);
												Static104.method2417(local565, Static193.aClass1_Sub26_Sub1_2);
												Static193.aClass1_Sub26_Sub1_2.method2982(Static193.aClass1_Sub26_Sub1_2.anInt4021 - local633);
												continue;
											}
											if (local199 == 5009) {
												local27 -= 2;
												local565 = Static101.aClass107Array10[local27];
												local1955 = Static101.aClass107Array10[local27 + 1];
												if (Static156.anInt3417 != 0 || Static49.anInt1281 != 1 && Static99.anInt929 != 1) {
													Static193.aClass1_Sub26_Sub1_2.method3000(183);
													Static193.aClass1_Sub26_Sub1_2.method2967(0);
													local1005 = Static193.aClass1_Sub26_Sub1_2.anInt4021;
													Static193.aClass1_Sub26_Sub1_2.method2940(local565.method3066());
													Static104.method2417(local1955, Static193.aClass1_Sub26_Sub1_2);
													Static193.aClass1_Sub26_Sub1_2.method2982(Static193.aClass1_Sub26_Sub1_2.anInt4021 - local1005);
												}
												continue;
											}
											if (local199 == 5010) {
												local25--;
												local767 = Static134.anIntArray250[local25];
												local1955 = null;
												if (local767 < 100) {
													local1955 = Static182.aClass107Array25[local767];
												}
												if (local1955 == null) {
													local1955 = Static131.aClass107_766;
												}
												Static101.aClass107Array10[local27++] = local1955;
												continue;
											}
											if (local199 == 5011) {
												local25--;
												local767 = Static134.anIntArray250[local25];
												local1955 = null;
												if (local767 < 100) {
													local1955 = Static227.aClass107Array30[local767];
												}
												if (local1955 == null) {
													local1955 = Static131.aClass107_766;
												}
												Static101.aClass107Array10[local27++] = local1955;
												continue;
											}
											if (local199 == 5012) {
												local25--;
												local767 = Static134.anIntArray250[local25];
												local772 = -1;
												if (local767 < 100) {
													local772 = Static76.anIntArray161[local767];
												}
												Static134.anIntArray250[local25++] = local772;
												continue;
											}
											if (local199 == 5015) {
												if (Static204.aClass5_Sub5_Sub1_2 == null || Static204.aClass5_Sub5_Sub1_2.aClass107_351 == null) {
													local565 = Static63.aClass107_430;
												} else {
													local565 = Static204.aClass5_Sub5_Sub1_2.method1018();
												}
												Static101.aClass107Array10[local27++] = local565;
												continue;
											}
											if (local199 == 5016) {
												Static134.anIntArray250[local25++] = Static174.anInt3795;
												continue;
											}
											if (local199 == 5017) {
												Static134.anIntArray250[local25++] = Static156.anInt3415;
												continue;
											}
											if (local199 == 5050) {
												local25--;
												local767 = Static134.anIntArray250[local25];
												Static101.aClass107Array10[local27++] = Static180.method3736(local767).aClass107_593;
												continue;
											}
											@Pc(4783) Class1_Sub2_Sub9 local4783;
											if (local199 == 5051) {
												local25--;
												local767 = Static134.anIntArray250[local25];
												local4783 = Static180.method3736(local767);
												if (local4783.anIntArray213 == null) {
													Static134.anIntArray250[local25++] = 0;
												} else {
													Static134.anIntArray250[local25++] = local4783.anIntArray213.length;
												}
												continue;
											}
											if (local199 == 5052) {
												local25 -= 2;
												local767 = Static134.anIntArray250[local25];
												local772 = Static134.anIntArray250[local25 + 1];
												@Pc(4822) Class1_Sub2_Sub9 local4822 = Static180.method3736(local767);
												local609 = local4822.anIntArray213[local772];
												Static134.anIntArray250[local25++] = local609;
												continue;
											}
											if (local199 == 5053) {
												local25--;
												local767 = Static134.anIntArray250[local25];
												local4783 = Static180.method3736(local767);
												if (local4783.anIntArray215 == null) {
													Static134.anIntArray250[local25++] = 0;
												} else {
													Static134.anIntArray250[local25++] = local4783.anIntArray215.length;
												}
												continue;
											}
											if (local199 == 5054) {
												local25 -= 2;
												local767 = Static134.anIntArray250[local25];
												local772 = Static134.anIntArray250[local25 + 1];
												Static134.anIntArray250[local25++] = Static180.method3736(local767).anIntArray215[local772];
												continue;
											}
											if (local199 == 5055) {
												local25--;
												local767 = Static134.anIntArray250[local25];
												Static101.aClass107Array10[local27++] = Static58.method1124(local767).method1718();
												continue;
											}
											if (local199 == 5056) {
												local25--;
												local767 = Static134.anIntArray250[local25];
												@Pc(4928) Class1_Sub2_Sub10 local4928 = Static58.method1124(local767);
												if (local4928.anIntArray218 == null) {
													Static134.anIntArray250[local25++] = 0;
												} else {
													Static134.anIntArray250[local25++] = local4928.anIntArray218.length;
												}
												continue;
											}
											if (local199 == 5057) {
												local25 -= 2;
												local767 = Static134.anIntArray250[local25];
												local772 = Static134.anIntArray250[local25 + 1];
												Static134.anIntArray250[local25++] = Static58.method1124(local767).anIntArray218[local772];
												continue;
											}
											if (local199 == 5058) {
												Static51.aClass77_3 = new Class77();
												local25--;
												Static51.aClass77_3.anInt2811 = Static134.anIntArray250[local25];
												Static51.aClass77_3.aClass1_Sub2_Sub10_1 = Static58.method1124(Static51.aClass77_3.anInt2811);
												Static51.aClass77_3.anIntArray247 = new int[Static51.aClass77_3.aClass1_Sub2_Sub10_1.method1724()];
												continue;
											}
											if (local199 == 5059) {
												Static193.aClass1_Sub26_Sub1_2.method3000(151);
												Static193.aClass1_Sub26_Sub1_2.method2967(0);
												local767 = Static193.aClass1_Sub26_Sub1_2.anInt4021;
												Static193.aClass1_Sub26_Sub1_2.method2967(0);
												Static193.aClass1_Sub26_Sub1_2.method2963(Static51.aClass77_3.anInt2811);
												Static51.aClass77_3.aClass1_Sub2_Sub10_1.method1721(Static193.aClass1_Sub26_Sub1_2, Static51.aClass77_3.anIntArray247);
												Static193.aClass1_Sub26_Sub1_2.method2982(Static193.aClass1_Sub26_Sub1_2.anInt4021 - local767);
												continue;
											}
											if (local199 == 5060) {
												local27--;
												local565 = Static101.aClass107Array10[local27];
												Static193.aClass1_Sub26_Sub1_2.method3000(126);
												Static193.aClass1_Sub26_Sub1_2.method2967(0);
												local772 = Static193.aClass1_Sub26_Sub1_2.anInt4021;
												Static193.aClass1_Sub26_Sub1_2.method2940(local565.method3066());
												Static193.aClass1_Sub26_Sub1_2.method2963(Static51.aClass77_3.anInt2811);
												Static51.aClass77_3.aClass1_Sub2_Sub10_1.method1721(Static193.aClass1_Sub26_Sub1_2, Static51.aClass77_3.anIntArray247);
												Static193.aClass1_Sub26_Sub1_2.method2982(Static193.aClass1_Sub26_Sub1_2.anInt4021 - local772);
												continue;
											}
											if (local199 == 5061) {
												Static193.aClass1_Sub26_Sub1_2.method3000(151);
												Static193.aClass1_Sub26_Sub1_2.method2967(0);
												local767 = Static193.aClass1_Sub26_Sub1_2.anInt4021;
												Static193.aClass1_Sub26_Sub1_2.method2967(1);
												Static193.aClass1_Sub26_Sub1_2.method2963(Static51.aClass77_3.anInt2811);
												Static51.aClass77_3.aClass1_Sub2_Sub10_1.method1721(Static193.aClass1_Sub26_Sub1_2, Static51.aClass77_3.anIntArray247);
												Static193.aClass1_Sub26_Sub1_2.method2982(Static193.aClass1_Sub26_Sub1_2.anInt4021 - local767);
												continue;
											}
											if (local199 == 5062) {
												local25 -= 2;
												local767 = Static134.anIntArray250[local25];
												local772 = Static134.anIntArray250[local25 + 1];
												Static134.anIntArray250[local25++] = Static180.method3736(local767).anIntArray216[local772];
												continue;
											}
											if (local199 == 5063) {
												local25 -= 2;
												local767 = Static134.anIntArray250[local25];
												local772 = Static134.anIntArray250[local25 + 1];
												Static134.anIntArray250[local25++] = Static180.method3736(local767).anIntArray214[local772];
												continue;
											}
											if (local199 == 5064) {
												local25 -= 2;
												local767 = Static134.anIntArray250[local25];
												local772 = Static134.anIntArray250[local25 + 1];
												if (local772 == -1) {
													Static134.anIntArray250[local25++] = -1;
												} else {
													Static134.anIntArray250[local25++] = Static180.method3736(local767).method1670(local772);
												}
												continue;
											}
											if (local199 == 5065) {
												local25 -= 2;
												local772 = Static134.anIntArray250[local25 + 1];
												local767 = Static134.anIntArray250[local25];
												if (local772 == -1) {
													Static134.anIntArray250[local25++] = -1;
												} else {
													Static134.anIntArray250[local25++] = Static180.method3736(local767).method1671(local772);
												}
												continue;
											}
											if (local199 == 5066) {
												local25--;
												local767 = Static134.anIntArray250[local25];
												Static134.anIntArray250[local25++] = Static58.method1124(local767).method1724();
												continue;
											}
											if (local199 == 5067) {
												local25 -= 2;
												local767 = Static134.anIntArray250[local25];
												local772 = Static134.anIntArray250[local25 + 1];
												local1005 = Static58.method1124(local767).method1722(local772);
												Static134.anIntArray250[local25++] = local1005;
												continue;
											}
											if (local199 == 5068) {
												local25 -= 2;
												local767 = Static134.anIntArray250[local25];
												local772 = Static134.anIntArray250[local25 + 1];
												Static51.aClass77_3.anIntArray247[local767] = local772;
												continue;
											}
											if (local199 == 5069) {
												local25 -= 2;
												local767 = Static134.anIntArray250[local25];
												local772 = Static134.anIntArray250[local25 + 1];
												Static51.aClass77_3.anIntArray247[local767] = local772;
												continue;
											}
											if (local199 == 5070) {
												local25 -= 3;
												local772 = Static134.anIntArray250[local25 + 1];
												local767 = Static134.anIntArray250[local25];
												local1005 = Static134.anIntArray250[local25 + 2];
												@Pc(5392) Class1_Sub2_Sub10 local5392 = Static58.method1124(local767);
												if (local5392.method1722(local772) != 0) {
													throw new RuntimeException("bad command");
												}
												Static134.anIntArray250[local25++] = local5392.method1717(local1005, local772);
												continue;
											}
										} else if (local199 < 5200) {
											if (local199 == 5100) {
												if (Static132.aBooleanArray19[86]) {
													Static134.anIntArray250[local25++] = 1;
												} else {
													Static134.anIntArray250[local25++] = 0;
												}
												continue;
											}
											if (local199 == 5101) {
												if (Static132.aBooleanArray19[82]) {
													Static134.anIntArray250[local25++] = 1;
												} else {
													Static134.anIntArray250[local25++] = 0;
												}
												continue;
											}
											if (local199 == 5102) {
												if (Static132.aBooleanArray19[81]) {
													Static134.anIntArray250[local25++] = 1;
												} else {
													Static134.anIntArray250[local25++] = 0;
												}
												continue;
											}
										} else if (local199 < 5300) {
											if (local199 == 5200) {
												local25--;
												Static175.method2780(Static134.anIntArray250[local25]);
												continue;
											}
											if (local199 == 5201) {
												Static134.anIntArray250[local25++] = Static216.method3530();
												continue;
											}
											if (local199 == 5202) {
												local25--;
												Static155.method410(Static134.anIntArray250[local25]);
												continue;
											}
											if (local199 == 5203) {
												local27--;
												Static101.method1691(Static101.aClass107Array10[local27]);
												continue;
											}
											if (local199 == 5204) {
												Static101.aClass107Array10[local27 - 1] = Static212.method3405(Static101.aClass107Array10[local27 - 1]);
												continue;
											}
											if (local199 == 5205) {
												local27--;
												Static169.method2693(Static101.aClass107Array10[local27]);
												continue;
											}
											if (local199 == 5206) {
												local25--;
												local767 = Static134.anIntArray250[local25];
												@Pc(5591) Class1_Sub2_Sub6 local5591 = Static32.method602(local767 >> 14 & 0x3FFF, local767 & 0x3FFF);
												if (local5591 == null) {
													Static101.aClass107Array10[local27++] = Static131.aClass107_766;
												} else {
													Static101.aClass107Array10[local27++] = local5591.aClass107_252;
												}
												continue;
											}
											if (local199 == 5207) {
												local27--;
												@Pc(5620) Class1_Sub2_Sub6 local5620 = Static229.method3723(Static101.aClass107Array10[local27]);
												if (local5620 != null && local5620.aClass107_250 != null) {
													Static101.aClass107Array10[local27++] = local5620.aClass107_250;
													continue;
												}
												Static101.aClass107Array10[local27++] = Static131.aClass107_766;
												continue;
											}
										} else if (local199 < 5400) {
											if (local199 == 5306) {
												Static134.anIntArray250[local25++] = Static194.method3157();
												continue;
											}
										} else if (local199 < 5500) {
											if (local199 == 5400) {
												local27 -= 2;
												local565 = Static101.aClass107Array10[local27];
												local1955 = Static101.aClass107Array10[local27 + 1];
												local25--;
												local1005 = Static134.anIntArray250[local25];
												Static193.aClass1_Sub26_Sub1_2.method3000(45);
												Static193.aClass1_Sub26_Sub1_2.method2967(Static182.method2998(local565) + Static182.method2998(local1955) + 1);
												Static193.aClass1_Sub26_Sub1_2.method2979(local565);
												Static193.aClass1_Sub26_Sub1_2.method2979(local1955);
												Static193.aClass1_Sub26_Sub1_2.method2967(local1005);
												continue;
											}
											if (local199 == 5401) {
												local25 -= 2;
												Static89.aShortArray22[Static134.anIntArray250[local25]] = (short) Static80.method1381(Static134.anIntArray250[local25 + 1]);
												Static67.method1227();
												Static47.method924();
												Static118.method2048();
												Static206.method3287();
												Static191.method3118();
												continue;
											}
											if (local199 == 5405) {
												local25 -= 2;
												local767 = Static134.anIntArray250[local25];
												local772 = Static134.anIntArray250[local25 + 1];
												if (local767 >= 0 && local767 < 2) {
													Static174.anIntArrayArrayArray10[local767] = new int[local772 << 1][4];
												}
												continue;
											}
											if (local199 == 5406) {
												local25 -= 7;
												local1005 = Static134.anIntArray250[local25 + 2];
												local609 = Static134.anIntArray250[local25 + 3];
												local767 = Static134.anIntArray250[local25];
												local772 = Static134.anIntArray250[local25 + 1] << 1;
												local633 = Static134.anIntArray250[local25 + 4];
												@Pc(7732) int local7732 = Static134.anIntArray250[local25 + 6];
												local1043 = Static134.anIntArray250[local25 + 5];
												if (local767 >= 0 && local767 < 2 && Static174.anIntArrayArrayArray10[local767] != null && local772 >= 0 && local772 < Static174.anIntArrayArrayArray10[local767].length) {
													Static174.anIntArrayArrayArray10[local767][local772] = new int[] { (local1005 >> 14 & 0x3FFF) * 128, local609, (local1005 & 0x3FFF) * 128, local7732 };
													Static174.anIntArrayArrayArray10[local767][local772 + 1] = new int[] { (local633 >> 14 & 0x3FFF) * 128, local1043, (local633 & 0x3FFF) * 128 };
												}
												continue;
											}
											if (local199 == 5407) {
												local25--;
												local767 = Static174.anIntArrayArrayArray10[Static134.anIntArray250[local25]].length >> 1;
												Static134.anIntArray250[local25++] = local767;
												continue;
											}
											if (local199 == 5408) {
												Static134.anIntArray250[local25++] = 0;
												continue;
											}
											if (local199 == 5409) {
												Static61.method1164();
												continue;
											}
											if (local199 == 5411) {
												if (Static125.aFrame2 == null) {
													Static97.method1646(false, Static56.method1122());
												} else {
													System.exit(0);
												}
												continue;
											}
											if (local199 == 5419) {
												local565 = Static131.aClass107_766;
												if (Static8.aClass84_1 != null) {
													local565 = Static128.method2149(Static8.aClass84_1.anInt3170);
													try {
														if (Static8.aClass84_1.anObject4 != null) {
															@Pc(7904) byte[] local7904 = ((String) Static8.aClass84_1.anObject4).getBytes("ISO-8859-1");
															local565 = Static140.method661(0, local7904.length, local7904);
														}
													} catch (@Pc(7913) UnsupportedEncodingException local7913) {
													}
												}
												Static101.aClass107Array10[local27++] = local565;
												continue;
											}
											if (local199 == 5420) {
												Static134.anIntArray250[local25++] = Static96.anInt2096 == 2 ? 1 : 0;
												continue;
											}
											if (local199 == 5421) {
												local27--;
												local565 = Static101.aClass107Array10[local27];
												local25--;
												local6574 = Static134.anIntArray250[local25] == 1;
												Static97.method1646(local6574, Static149.method2437(new Class107[] { Static56.method1122(), local565 }));
												continue;
											}
											if (local199 == 5422) {
												local27 -= 2;
												local565 = Static101.aClass107Array10[local27];
												local1955 = Static101.aClass107Array10[local27 + 1];
												local25--;
												local1005 = Static134.anIntArray250[local25];
												if (local565.method3095() > 0) {
													if (Static84.aClass107Array9 == null) {
														Static84.aClass107Array9 = new Class107[Static102.anIntArray220[Static46.anInt1029]];
													}
													Static84.aClass107Array9[local1005] = local565;
												}
												if (local1955.method3095() > 0) {
													if (Static142.aClass107Array16 == null) {
														Static142.aClass107Array16 = new Class107[Static102.anIntArray220[Static46.anInt1029]];
													}
													Static142.aClass107Array16[local1005] = local1955;
												}
												continue;
											}
										} else if (local199 < 5600) {
											if (local199 == 5500) {
												local25 -= 4;
												local767 = Static134.anIntArray250[local25];
												local772 = Static134.anIntArray250[local25 + 1];
												local1005 = Static134.anIntArray250[local25 + 2];
												local609 = Static134.anIntArray250[local25 + 3];
												Static76.method1340(false, local1005, (local767 >> 14 & 0x3FFF) - Static36.anInt764, (local767 & 0x3FFF) - Static152.anInt3377, local772, local609);
												continue;
											}
											if (local199 == 5501) {
												local25 -= 4;
												local767 = Static134.anIntArray250[local25];
												local1005 = Static134.anIntArray250[local25 + 2];
												local772 = Static134.anIntArray250[local25 + 1];
												local609 = Static134.anIntArray250[local25 + 3];
												Static184.method3039(local1005, (local767 >> 14 & 0x3FFF) - Static36.anInt764, local772, local609, (local767 & 0x3FFF) - Static152.anInt3377);
												continue;
											}
											if (local199 == 5502) {
												local25 -= 6;
												local767 = Static134.anIntArray250[local25];
												if (local767 >= 2) {
													throw new RuntimeException();
												}
												Static59.anInt1431 = local767;
												local772 = Static134.anIntArray250[local25 + 1];
												if (local772 + 1 >= Static174.anIntArrayArrayArray10[Static59.anInt1431].length >> 1) {
													throw new RuntimeException();
												}
												Static24.anInt448 = 0;
												Static200.anInt3494 = local772;
												Static65.anInt1533 = Static134.anIntArray250[local25 + 2];
												Static170.anInt3695 = Static134.anIntArray250[local25 + 3];
												local1005 = Static134.anIntArray250[local25 + 4];
												if (local1005 >= 2) {
													throw new RuntimeException();
												}
												Static127.anInt2766 = local1005;
												local609 = Static134.anIntArray250[local25 + 5];
												if (Static174.anIntArrayArrayArray10[Static127.anInt2766].length >> 1 <= local609 + 1) {
													throw new RuntimeException();
												}
												Static61.anInt1480 = 3;
												Static111.anInt2472 = local609;
												continue;
											}
											if (local199 == 5503) {
												Static97.method1642();
												continue;
											}
											if (local199 == 5504) {
												local25 -= 2;
												Static88.anInt1924 = Static134.anIntArray250[local25];
												Static79.anInt1741 = Static134.anIntArray250[local25 + 1];
												Static70.method1250();
												continue;
											}
											if (local199 == 5505) {
												Static134.anIntArray250[local25++] = Static88.anInt1924;
												continue;
											}
											if (local199 == 5506) {
												Static134.anIntArray250[local25++] = Static79.anInt1741;
												continue;
											}
										} else if (local199 < 5700) {
											if (local199 == 5600) {
												local27 -= 2;
												local565 = Static101.aClass107Array10[local27];
												local1955 = Static101.aClass107Array10[local27 + 1];
												local25--;
												local1005 = Static134.anIntArray250[local25];
												if (Static178.anInt3884 == 10 && Static25.anInt497 == 0 && Static122.anInt2676 == 0) {
													Static213.method3441(local565, local1005, local1955);
												}
												continue;
											}
											if (local199 == 5601) {
												Static176.method2784();
												continue;
											}
											if (local199 == 5602) {
												if (Static25.anInt497 == 0) {
													Static207.anInt4429 = -2;
												}
												continue;
											}
											if (local199 == 5603) {
												local25 -= 4;
												if (Static178.anInt3884 == 10 && Static25.anInt497 == 0 && Static122.anInt2676 == 0) {
													Static118.method2042(Static134.anIntArray250[local25 + 1], Static134.anIntArray250[local25 + 3], Static134.anIntArray250[local25], Static134.anIntArray250[local25 + 2]);
												}
												continue;
											}
											if (local199 == 5604) {
												local27--;
												if (Static178.anInt3884 == 10 && Static25.anInt497 == 0 && Static122.anInt2676 == 0) {
													Static31.method2203(Static101.aClass107Array10[local27].method3066());
												}
												continue;
											}
											if (local199 == 5605) {
												local27 -= 2;
												local25 -= 4;
												if (Static178.anInt3884 == 10 && Static25.anInt497 == 0 && Static122.anInt2676 == 0) {
													Static196.method3176(Static101.aClass107Array10[local27].method3066(), Static134.anIntArray250[local25 + 1], Static134.anIntArray250[local25 + 3], Static134.anIntArray250[local25 + 2], Static101.aClass107Array10[local27 + 1], Static134.anIntArray250[local25]);
												}
												continue;
											}
											if (local199 == 5606) {
												if (Static122.anInt2676 == 0) {
													Static143.anInt3140 = -2;
												}
												continue;
											}
											if (local199 == 5607) {
												Static134.anIntArray250[local25++] = Static207.anInt4429;
												continue;
											}
											if (local199 == 5608) {
												Static134.anIntArray250[local25++] = Static176.anInt3816;
												continue;
											}
											if (local199 == 5609) {
												Static134.anIntArray250[local25++] = Static143.anInt3140;
												continue;
											}
											if (local199 == 5610) {
												for (local767 = 0; local767 < 5; local767++) {
													Static101.aClass107Array10[local27++] = local767 < Static32.aClass107Array3.length ? Static32.aClass107Array3[local767] : Static131.aClass107_766;
												}
												Static32.aClass107Array3 = null;
												continue;
											}
										} else if (local199 < 6100) {
											if (local199 == 6001) {
												local25--;
												local767 = Static134.anIntArray250[local25];
												if (local767 < 1) {
													local767 = 1;
												}
												if (local767 > 4) {
													local767 = 4;
												}
												Static27.anInt523 = local767;
												if (Static27.anInt523 == 1) {
													Static74.method1322(0.9F);
												}
												if (Static27.anInt523 == 2) {
													Static74.method1322(0.8F);
												}
												if (Static27.anInt523 == 3) {
													Static74.method1322(0.7F);
												}
												if (Static27.anInt523 == 4) {
													Static74.method1322(0.6F);
												}
												Static47.method924();
												Static35.method697(Static117.aClass34_2);
												Static195.aBoolean382 = false;
												continue;
											}
											if (local199 == 6002) {
												local25--;
												Static27.method477(Static134.anIntArray250[local25] == 1);
												Static82.method1386();
												Static83.method1392();
												Static182.method2999();
												Static35.method697(Static117.aClass34_2);
												Static195.aBoolean382 = false;
												continue;
											}
											if (local199 == 6003) {
												local25--;
												Static100.aBoolean195 = Static134.anIntArray250[local25] == 1;
												Static182.method2999();
												Static35.method697(Static117.aClass34_2);
												Static195.aBoolean382 = false;
												continue;
											}
											if (local199 == 6005) {
												local25--;
												Static163.aBoolean317 = Static134.anIntArray250[local25] == 1;
												Static83.method1392();
												Static35.method697(Static117.aClass34_2);
												Static195.aBoolean382 = false;
												continue;
											}
											if (local199 == 6006) {
												local25--;
												Static142.aBoolean266 = Static134.anIntArray250[local25] == 1;
												((Class59) Static74.anInterface4_1).method1640(!Static142.aBoolean266);
												Static35.method697(Static117.aClass34_2);
												Static195.aBoolean382 = false;
												continue;
											}
											if (local199 == 6007) {
												local25--;
												Static14.aBoolean30 = Static134.anIntArray250[local25] == 1;
												Static35.method697(Static117.aClass34_2);
												Static195.aBoolean382 = false;
												continue;
											}
											if (local199 == 6008) {
												local25--;
												Static179.aBoolean357 = Static134.anIntArray250[local25] == 1;
												Static35.method697(Static117.aClass34_2);
												Static195.aBoolean382 = false;
												continue;
											}
											if (local199 == 6009) {
												local25--;
												Static153.aBoolean296 = Static134.anIntArray250[local25] == 1;
												Static35.method697(Static117.aClass34_2);
												Static195.aBoolean382 = false;
												continue;
											}
											if (local199 == 6010) {
												local25--;
												Static163.aBoolean316 = Static134.anIntArray250[local25] == 1;
												Static35.method697(Static117.aClass34_2);
												Static195.aBoolean382 = false;
												continue;
											}
											if (local199 == 6011) {
												local25--;
												local767 = Static134.anIntArray250[local25];
												if (local767 < 0 || local767 > 2) {
													local767 = 0;
												}
												Static85.anInt1851 = local767;
												Static35.method697(Static117.aClass34_2);
												Static195.aBoolean382 = false;
												continue;
											}
											if (local199 == 6012) {
												local25--;
												Static169.aBoolean326 = Static134.anIntArray250[local25] == 1;
												if (Static27.anInt523 == 1) {
													Static74.method1322(0.9F);
												}
												if (Static27.anInt523 == 2) {
													Static74.method1322(0.8F);
												}
												if (Static27.anInt523 == 3) {
													Static74.method1322(0.7F);
												}
												if (Static27.anInt523 == 4) {
													Static74.method1322(0.6F);
												}
												Static83.method1392();
												Static35.method697(Static117.aClass34_2);
												Static195.aBoolean382 = false;
												continue;
											}
											if (local199 == 6014) {
												local25--;
												Static182.aBoolean362 = Static134.anIntArray250[local25] == 1;
												Static35.method697(Static117.aClass34_2);
												Static195.aBoolean382 = false;
												continue;
											}
											if (local199 == 6015) {
												local25--;
												Static224.aBoolean434 = Static134.anIntArray250[local25] == 1;
												Static35.method697(Static117.aClass34_2);
												Static195.aBoolean382 = false;
												continue;
											}
											if (local199 == 6016) {
												local25--;
												local767 = Static134.anIntArray250[local25];
												if (local767 < 0 || local767 > 2) {
													local767 = 0;
												}
												Static83.anInt1786 = local767;
												Static35.method697(Static117.aClass34_2);
												Static195.aBoolean382 = false;
												continue;
											}
											if (local199 == 6017) {
												local25--;
												Static73.aBoolean151 = Static134.anIntArray250[local25] == 1;
												Static24.method423();
												Static35.method697(Static117.aClass34_2);
												Static195.aBoolean382 = false;
												continue;
											}
											if (local199 == 6018) {
												local25--;
												local767 = Static134.anIntArray250[local25];
												if (local767 < 0) {
													local767 = 0;
												}
												if (local767 > 127) {
													local767 = 127;
												}
												Static91.anInt1982 = local767;
												Static35.method697(Static117.aClass34_2);
												Static195.aBoolean382 = false;
												continue;
											}
											if (local199 == 6019) {
												local25--;
												local767 = Static134.anIntArray250[local25];
												if (local767 < 0) {
													local767 = 0;
												}
												if (local767 > 255) {
													local767 = 255;
												}
												if (local767 != Static157.anInt3449) {
													if (Static157.anInt3449 == 0 && Static10.anInt276 != -1) {
														Static172.method2739(Static10.anInt276, local767, Static80.aClass28_Sub1_47);
														Static179.aBoolean356 = false;
													} else if (local767 == 0) {
														Static55.method1108();
														Static179.aBoolean356 = false;
													} else {
														Static167.method2659(local767);
													}
													Static157.anInt3449 = local767;
												}
												Static35.method697(Static117.aClass34_2);
												Static195.aBoolean382 = false;
												continue;
											}
											if (local199 == 6020) {
												local25--;
												local767 = Static134.anIntArray250[local25];
												if (local767 < 0) {
													local767 = 0;
												}
												if (local767 > 127) {
													local767 = 127;
												}
												Static90.anInt1961 = local767;
												Static35.method697(Static117.aClass34_2);
												Static195.aBoolean382 = false;
												continue;
											}
											if (local199 == 6021) {
												local25--;
												Static191.aBoolean372 = Static134.anIntArray250[local25] == 1;
												Static182.method2999();
												continue;
											}
											if (local199 == 6022) {
												local25--;
												Static156.aBoolean301 = Static134.anIntArray250[local25] == 1;
												Static35.method697(Static117.aClass34_2);
												Static148.method2424();
												continue;
											}
										} else if (local199 < 6200) {
											if (local199 == 6101) {
												Static134.anIntArray250[local25++] = Static27.anInt523;
												continue;
											}
											if (local199 == 6102) {
												Static134.anIntArray250[local25++] = Static155.method412() ? 1 : 0;
												continue;
											}
											if (local199 == 6103) {
												Static134.anIntArray250[local25++] = Static100.aBoolean195 ? 1 : 0;
												continue;
											}
											if (local199 == 6105) {
												Static134.anIntArray250[local25++] = Static163.aBoolean317 ? 1 : 0;
												continue;
											}
											if (local199 == 6106) {
												Static134.anIntArray250[local25++] = Static142.aBoolean266 ? 1 : 0;
												continue;
											}
											if (local199 == 6107) {
												Static134.anIntArray250[local25++] = Static14.aBoolean30 ? 1 : 0;
												continue;
											}
											if (local199 == 6108) {
												Static134.anIntArray250[local25++] = Static179.aBoolean357 ? 1 : 0;
												continue;
											}
											if (local199 == 6109) {
												Static134.anIntArray250[local25++] = Static153.aBoolean296 ? 1 : 0;
												continue;
											}
											if (local199 == 6110) {
												Static134.anIntArray250[local25++] = Static163.aBoolean316 ? 1 : 0;
												continue;
											}
											if (local199 == 6111) {
												Static134.anIntArray250[local25++] = Static85.anInt1851;
												continue;
											}
											if (local199 == 6112) {
												Static134.anIntArray250[local25++] = Static169.aBoolean326 ? 1 : 0;
												continue;
											}
											if (local199 == 6114) {
												Static134.anIntArray250[local25++] = Static182.aBoolean362 ? 1 : 0;
												continue;
											}
											if (local199 == 6115) {
												Static134.anIntArray250[local25++] = Static224.aBoolean434 ? 1 : 0;
												continue;
											}
											if (local199 == 6116) {
												Static134.anIntArray250[local25++] = Static83.anInt1786;
												continue;
											}
											if (local199 == 6117) {
												Static134.anIntArray250[local25++] = Static73.aBoolean151 ? 1 : 0;
												continue;
											}
											if (local199 == 6118) {
												Static134.anIntArray250[local25++] = Static91.anInt1982;
												continue;
											}
											if (local199 == 6119) {
												Static134.anIntArray250[local25++] = Static157.anInt3449;
												continue;
											}
											if (local199 == 6120) {
												Static134.anIntArray250[local25++] = Static90.anInt1961;
												continue;
											}
											if (local199 == 6121) {
												Static134.anIntArray250[local25++] = 0;
												continue;
											}
											if (local199 == 6122) {
												Static134.anIntArray250[local25++] = Static156.aBoolean301 ? 1 : 0;
												continue;
											}
										} else if (local199 < 6300) {
											if (local199 == 6200) {
												local25 -= 2;
												Static232.aShort31 = (short) Static134.anIntArray250[local25];
												if (Static232.aShort31 <= 0) {
													Static232.aShort31 = 256;
												}
												Static157.aShort27 = (short) Static134.anIntArray250[local25 + 1];
												if (Static157.aShort27 <= 0) {
													Static157.aShort27 = 205;
												}
												continue;
											}
											if (local199 == 6201) {
												local25 -= 2;
												Static160.aShort28 = (short) Static134.anIntArray250[local25];
												if (Static160.aShort28 <= 0) {
													Static160.aShort28 = 256;
												}
												Static126.aShort26 = (short) Static134.anIntArray250[local25 + 1];
												if (Static126.aShort26 <= 0) {
													Static126.aShort26 = 320;
												}
												continue;
											}
											if (local199 == 6202) {
												local25 -= 4;
												Static216.aShort32 = (short) Static134.anIntArray250[local25];
												if (Static216.aShort32 <= 0) {
													Static216.aShort32 = 1;
												}
												Static111.aShort25 = (short) Static134.anIntArray250[local25 + 1];
												if (Static111.aShort25 <= 0) {
													Static111.aShort25 = 32767;
												} else if (Static216.aShort32 > Static111.aShort25) {
													Static111.aShort25 = Static216.aShort32;
												}
												Static52.aShort24 = (short) Static134.anIntArray250[local25 + 2];
												if (Static52.aShort24 <= 0) {
													Static52.aShort24 = 1;
												}
												Static22.aShort9 = (short) Static134.anIntArray250[local25 + 3];
												if (Static22.aShort9 <= 0) {
													Static22.aShort9 = 32767;
												} else if (Static52.aShort24 > Static22.aShort9) {
													Static22.aShort9 = Static52.aShort24;
												}
												continue;
											}
											if (local199 == 6203) {
												Static213.method3437(Static158.aClass86_11.anInt3270, Static158.aClass86_11.anInt3280);
												Static134.anIntArray250[local25++] = Static110.anInt2435;
												Static134.anIntArray250[local25++] = Static159.anInt3504;
												continue;
											}
											if (local199 == 6204) {
												Static134.anIntArray250[local25++] = Static160.aShort28;
												Static134.anIntArray250[local25++] = Static126.aShort26;
												continue;
											}
											if (local199 == 6205) {
												Static134.anIntArray250[local25++] = Static232.aShort31;
												Static134.anIntArray250[local25++] = Static157.aShort27;
												continue;
											}
										} else if (local199 < 6400) {
											if (local199 == 6300) {
												Static134.anIntArray250[local25++] = (int) (Static209.method3309() / 60000L);
												continue;
											}
											if (local199 == 6301) {
												Static134.anIntArray250[local25++] = (int) (Static209.method3309() / 86400000L) - 11745;
												continue;
											}
											if (local199 == 6302) {
												local25 -= 3;
												local767 = Static134.anIntArray250[local25];
												local772 = Static134.anIntArray250[local25 + 1];
												local1005 = Static134.anIntArray250[local25 + 2];
												Static40.aCalendar1.clear();
												Static40.aCalendar1.set(11, 12);
												Static40.aCalendar1.set(local1005, local772, local767);
												Static134.anIntArray250[local25++] = (int) (Static40.aCalendar1.getTime().getTime() / 86400000L) - 11745;
												continue;
											}
											if (local199 == 6303) {
												Static40.aCalendar1.clear();
												Static40.aCalendar1.setTime(new Date(Static209.method3309()));
												Static134.anIntArray250[local25++] = Static40.aCalendar1.get(1);
												continue;
											}
											if (local199 == 6304) {
												local25--;
												local767 = Static134.anIntArray250[local25];
												local6574 = true;
												if (local767 < 0) {
													local6574 = (local767 + 1) % 4 == 0;
												} else if (local767 < 1582) {
													local6574 = local767 % 4 == 0;
												} else if (local767 % 4 != 0) {
													local6574 = false;
												} else if (local767 % 100 != 0) {
													local6574 = true;
												} else if (local767 % 400 != 0) {
													local6574 = false;
												}
												Static134.anIntArray250[local25++] = local6574 ? 1 : 0;
												continue;
											}
										} else if (local199 < 6500) {
											if (local199 == 6400) {
												Static134.anIntArray250[local25++] = Static228.aBoolean443 ? 1 : 0;
												continue;
											}
											if (local199 == 6401) {
												local27--;
												local565 = Static101.aClass107Array10[local27];
												local25--;
												local772 = Static134.anIntArray250[local25];
												@Pc(6685) String local6685;
												try {
													local6685 = new String(local565.method3116(), "ISO-8859-1");
												} catch (@Pc(6687) UnsupportedEncodingException local6687) {
													local6685 = new String(local565.method3116());
												}
												if (Static228.aBoolean443) {
													if (!browsercontrol.method2357()) {
														browsercontrol.method2356("about:blank");
													}
													if (browsercontrol.method2357()) {
														browsercontrol.method2360(local6685);
														Static42.anInt947 = local772;
														Static148.method2424();
													}
												}
												continue;
											}
											if (local199 == 6402) {
												if (browsercontrol.method2357()) {
													browsercontrol.method2360("about:blank");
													browsercontrol.method2359();
													Static42.anInt947 = 0;
													Static148.method2424();
												}
												continue;
											}
											if (local199 == 6403) {
												Static101.aClass107Array10[local27++] = Static220.aClass107_1300;
												continue;
											}
											if (local199 == 6404) {
												Static101.aClass107Array10[local27++] = Static117.aClass107_697;
												continue;
											}
											if (local199 == 6405) {
												Static134.anIntArray250[local25++] = Static40.method772() ? 1 : 0;
												continue;
											}
											if (local199 == 6406) {
												Static134.anIntArray250[local25++] = Static30.method589() ? 1 : 0;
												continue;
											}
										}
									} else if (local199 == 4500) {
										local25 -= 2;
										local767 = Static134.anIntArray250[local25];
										local772 = Static134.anIntArray250[local25 + 1];
										local3690 = Static208.method3305(local772);
										if (local3690.method2601()) {
											Static101.aClass107Array10[local27++] = Static10.method309(local767).method2805(local3690.aClass107_943, local772);
										} else {
											Static134.anIntArray250[local25++] = Static10.method309(local767).method2803(local772, local3690.anInt3535);
										}
										continue;
									}
								} else if (local199 == 4300) {
									local25 -= 2;
									local772 = Static134.anIntArray250[local25 + 1];
									local767 = Static134.anIntArray250[local25];
									local3690 = Static208.method3305(local772);
									if (local3690.method2601()) {
										Static101.aClass107Array10[local27++] = Static139.method2340(local767).method865(local772, local3690.aClass107_943);
									} else {
										Static134.anIntArray250[local25++] = Static139.method2340(local767).method871(local772, local3690.anInt3535);
									}
									continue;
								}
							}
						} else {
							if (local199 >= 2000) {
								local199 -= 1000;
								local25--;
								local1139 = Static13.method333(Static134.anIntArray250[local25]);
							} else {
								local1139 = local974 ? Static183.aClass86_13 : Static58.aClass86_2;
							}
							if (local199 == 1300) {
								local25--;
								local772 = Static134.anIntArray250[local25] - 1;
								if (local772 >= 0 && local772 <= 9) {
									local27--;
									local1139.method2438(local772, Static101.aClass107Array10[local27]);
									continue;
								}
								local27--;
								continue;
							}
							if (local199 == 1301) {
								local25 -= 2;
								local772 = Static134.anIntArray250[local25];
								local1005 = Static134.anIntArray250[local25 + 1];
								local1139.aClass86_8 = Static11.method314(local772, local1005);
								continue;
							}
							if (local199 == 1302) {
								local25--;
								local1139.aBoolean273 = Static134.anIntArray250[local25] == 1;
								continue;
							}
							if (local199 == 1303) {
								local25--;
								local1139.anInt3272 = Static134.anIntArray250[local25];
								continue;
							}
							if (local199 == 1304) {
								local25--;
								local1139.anInt3223 = Static134.anIntArray250[local25];
								continue;
							}
							if (local199 == 1305) {
								local27--;
								local1139.aClass107_863 = Static101.aClass107Array10[local27];
								continue;
							}
							if (local199 == 1306) {
								local27--;
								local1139.aClass107_868 = Static101.aClass107Array10[local27];
								continue;
							}
							if (local199 == 1307) {
								local1139.aClass107Array18 = null;
								continue;
							}
						}
					} else {
						if (local199 >= 2000) {
							local199 -= 1000;
							local25--;
							local1139 = Static13.method333(Static134.anIntArray250[local25]);
						} else {
							local1139 = local974 ? Static183.aClass86_13 : Static58.aClass86_2;
						}
						if (local199 == 1000) {
							local25 -= 4;
							local1139.anInt3243 = Static134.anIntArray250[local25];
							local1139.anInt3250 = Static134.anIntArray250[local25 + 1];
							local772 = Static134.anIntArray250[local25 + 2];
							if (local772 < 0) {
								local772 = 0;
							} else if (local772 > 5) {
								local772 = 5;
							}
							local1005 = Static134.anIntArray250[local25 + 3];
							if (local1005 < 0) {
								local1005 = 0;
							} else if (local1005 > 5) {
								local1005 = 5;
							}
							local1139.aByte11 = (byte) local1005;
							local1139.aByte12 = (byte) local772;
							Static16.method354(local1139);
							Static24.method426(local1139);
							continue;
						}
						if (local199 == 1001) {
							local25 -= 4;
							local1139.anInt3288 = Static134.anIntArray250[local25];
							local1139.anInt3244 = Static134.anIntArray250[local25 + 1];
							local1139.anInt3264 = 0;
							local1139.anInt3292 = 0;
							local772 = Static134.anIntArray250[local25 + 2];
							local1005 = Static134.anIntArray250[local25 + 3];
							if (local772 < 0) {
								local772 = 0;
							} else if (local772 > 4) {
								local772 = 4;
							}
							if (local1005 < 0) {
								local1005 = 0;
							} else if (local1005 > 4) {
								local1005 = 4;
							}
							local1139.aByte14 = (byte) local1005;
							local1139.aByte13 = (byte) local772;
							Static16.method354(local1139);
							Static24.method426(local1139);
							if (local1139.anInt3286 == 0) {
								Static160.method2582(local1139, false);
							}
							continue;
						}
						if (local199 == 1003) {
							local25--;
							local6574 = Static134.anIntArray250[local25] == 1;
							if (local1139.aBoolean275 != local6574) {
								local1139.aBoolean275 = local6574;
								Static16.method354(local1139);
							}
							continue;
						}
						if (local199 == 1004) {
							local25 -= 2;
							local1139.anInt3281 = Static134.anIntArray250[local25];
							local1139.anInt3213 = Static134.anIntArray250[local25 + 1];
							Static16.method354(local1139);
							Static24.method426(local1139);
							if (local1139.anInt3286 == 0) {
								Static160.method2582(local1139, false);
							}
							continue;
						}
					}
				}
				throw new IllegalStateException();
			}
		} catch (@Pc(12219) Exception local12219) {
			if (local18.aClass107_716 == null) {
				if (Static88.anInt1920 != 0) {
					Static136.method2282(Static215.aClass107_1263, 0, Static131.aClass107_766);
				}
				Static81.method1384(local12219, "CS2 - scr:" + local18.aLong177 + " op:" + local34);
			} else {
				@Pc(12226) Class107 local12226 = Static130.method2170(30);
				local12226.method3108(Static204.aClass107_675).method3108(local18.aClass107_716);
				for (local51 = Static44.anInt990 - 1; local51 >= 0; local51--) {
					local12226.method3108(Static121.aClass107_718).method3108(Static140.aClass74Array2[local51].aClass1_Sub2_Sub11_1.aClass107_716);
				}
				if (local34 == 40) {
					local89 = local37[local32];
					local12226.method3108(Static24.aClass107_153).method3108(Static115.method2001(local89));
				}
				if (Static88.anInt1920 != 0) {
					Static136.method2282(Static149.method2437(new Class107[] { Static210.aClass107_1230, local18.aClass107_716 }), 0, Static131.aClass107_766);
				}
				Static81.method1384(local12219, "CS2 - scr:" + local18.aLong177 + " op:" + local34 + new String(local12226.method3116()));
			}
		}
	}

	@OriginalMember(owner = "client!cf", name = "e", descriptor = "(I)V")
	public static void method578() {
		Static165.aClass61_42.method1689();
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;)I")
	public static int method580(@OriginalArg(1) KeyEvent arg0) {
		@Pc(2) int local2 = arg0.getKeyChar();
		if (local2 == 8364) {
			return 128;
		} else {
			if (local2 <= 0 || local2 >= 256) {
				local2 = -1;
			}
			return local2;
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIII)V")
	public static void method581(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(15) int local15 = arg3 - arg4;
		@Pc(20) int local20 = arg0 - arg2;
		if (local20 == 0) {
			if (local15 != 0) {
				Static149.method2444(arg4, arg3, arg1, arg2);
			}
		} else if (local15 == 0) {
			Static183.method3034(arg4, arg1, arg2, arg0);
		} else {
			if (local15 < 0) {
				local15 = -local15;
			}
			if (local20 < 0) {
				local20 = -local20;
			}
			@Pc(73) boolean local73 = local15 > local20;
			@Pc(77) int local77;
			@Pc(81) int local81;
			if (local73) {
				local77 = arg2;
				arg2 = arg4;
				local81 = arg0;
				arg4 = local77;
				arg0 = arg3;
				arg3 = local81;
			}
			if (arg0 < arg2) {
				local81 = arg4;
				local77 = arg2;
				arg4 = arg3;
				arg3 = local81;
				arg2 = arg0;
				arg0 = local77;
			}
			local77 = arg4;
			local81 = arg0 - arg2;
			@Pc(116) int local116 = arg3 - arg4;
			@Pc(127) int local127 = arg4 < arg3 ? 1 : -1;
			if (local116 < 0) {
				local116 = -local116;
			}
			@Pc(140) int local140 = -(local81 >> 1);
			@Pc(144) int local144;
			if (local73) {
				for (local144 = arg2; local144 <= arg0; local144++) {
					Static231.anIntArrayArray44[local144][local77] = arg1;
					local140 += local116;
					if (local140 > 0) {
						local140 -= local81;
						local77 += local127;
					}
				}
			} else {
				for (local144 = arg2; local144 <= arg0; local144++) {
					Static231.anIntArrayArray44[local77][local144] = arg1;
					local140 += local116;
					if (local140 > 0) {
						local77 += local127;
						local140 -= local81;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cf", name = "g", descriptor = "(I)V")
	public static void method582() {
		Static213.aClass2_1.method2852();
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			Static231.aLongArray8[local6] = 0L;
		}
		for (@Pc(24) int local24 = 0; local24 < 32; local24++) {
			Static64.aLongArray3[local24] = 0L;
		}
		Static147.anInt3166 = 0;
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(BZ)V")
	public static void method583(@OriginalArg(1) boolean arg0) {
		for (@Pc(10) Class1_Sub21 local10 = (Class1_Sub21) Static157.aClass120_18.method3564(); local10 != null; local10 = (Class1_Sub21) Static157.aClass120_18.method3561()) {
			if (local10.aClass1_Sub6_Sub3_3 != null) {
				Static42.aClass1_Sub6_Sub1_1.method966(local10.aClass1_Sub6_Sub3_3);
				local10.aClass1_Sub6_Sub3_3 = null;
			}
			if (local10.aClass1_Sub6_Sub3_2 != null) {
				Static42.aClass1_Sub6_Sub1_1.method966(local10.aClass1_Sub6_Sub3_2);
				local10.aClass1_Sub6_Sub3_2 = null;
			}
			local10.method3735();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(54) Class1_Sub21 local54 = (Class1_Sub21) Static82.aClass120_9.method3564(); local54 != null; local54 = (Class1_Sub21) Static82.aClass120_9.method3561()) {
			if (local54.aClass1_Sub6_Sub3_3 != null) {
				Static42.aClass1_Sub6_Sub1_1.method966(local54.aClass1_Sub6_Sub3_3);
				local54.aClass1_Sub6_Sub3_3 = null;
			}
			local54.method3735();
		}
		for (@Pc(81) Class1_Sub21 local81 = (Class1_Sub21) Static59.aClass50_10.method1358(); local81 != null; local81 = (Class1_Sub21) Static59.aClass50_10.method1361()) {
			if (local81.aClass1_Sub6_Sub3_3 != null) {
				Static42.aClass1_Sub6_Sub1_1.method966(local81.aClass1_Sub6_Sub3_3);
				local81.aClass1_Sub6_Sub3_3 = null;
			}
			local81.method3735();
		}
	}
}
