import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!jj", name = "t", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray9;

	@OriginalMember(owner = "client!jj", name = "v", descriptor = "Lclient!kh;")
	public static Class52_Sub1 aClass52_Sub1_15;

	@OriginalMember(owner = "client!jj", name = "q", descriptor = "I")
	public static final int anInt2097 = 4;

	@OriginalMember(owner = "client!jj", name = "r", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1034 = Static193.method3027("Hidden)2use");

	@OriginalMember(owner = "client!jj", name = "w", descriptor = "[[Lclient!t;")
	public static final Class87[][] aClass87ArrayArray1 = new Class87[anInt2097][500];

	@OriginalMember(owner = "client!jj", name = "x", descriptor = "[I")
	public static final int[] anIntArray117 = new int[anInt2097];

	@OriginalMember(owner = "client!jj", name = "z", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_1035 = Static193.method3027("We suspect someone knows your password)3");

	@OriginalMember(owner = "client!jj", name = "A", descriptor = "Lclient!oc;")
	public static Class70 aClass70_1036 = aClass70_1035;

	@OriginalMember(owner = "client!jj", name = "B", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1037 = Static193.method3027("Die Adresse dieses Computers wurde gesperrt)1");

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZIIIIIIIIBII)Z")
	public static boolean method1467(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(8) int local8;
		for (@Pc(5) int local5 = 0; local5 < 104; local5++) {
			for (local8 = 0; local8 < 104; local8++) {
				Static88.anIntArrayArray9[local5][local8] = 0;
				Static109.anIntArrayArray12[local5][local8] = 99999999;
			}
		}
		Static88.anIntArrayArray9[arg2][arg10] = 99;
		local8 = arg2;
		Static109.anIntArrayArray12[arg2][arg10] = 0;
		@Pc(52) int local52 = arg10;
		@Pc(54) int local54 = 0;
		@Pc(56) boolean local56 = false;
		@Pc(58) byte local58 = 0;
		Static183.anIntArray207[0] = arg2;
		@Pc(65) int local65 = local58 + 1;
		Static120.anIntArray145[0] = arg10;
		@Pc(70) int local70 = Static183.anIntArray207.length;
		@Pc(75) int[][] local75 = Static28.aClass77Array1[Static137.anInt2795].anIntArrayArray23;
		@Pc(180) int local180;
		while (local54 != local65) {
			local8 = Static183.anIntArray207[local54];
			local52 = Static120.anIntArray145[local54];
			local54 = (local54 + 1) % local70;
			if (local8 == arg7 && arg6 == local52) {
				local56 = true;
				break;
			}
			if (arg5 != 0) {
				if ((arg5 < 5 || arg5 == 10) && Static28.aClass77Array1[Static137.anInt2795].method2174(arg7, arg5 - 1, arg3, local52, arg6, local8)) {
					local56 = true;
					break;
				}
				if (arg5 < 10 && Static28.aClass77Array1[Static137.anInt2795].method2168(local8, arg7, arg5 - 1, local52, arg6, arg3)) {
					local56 = true;
					break;
				}
			}
			if (arg4 != 0 && arg1 != 0 && Static28.aClass77Array1[Static137.anInt2795].method2169(arg9, local8, arg4, arg1, local52, arg7, arg6)) {
				local56 = true;
				break;
			}
			local180 = Static109.anIntArrayArray12[local8][local52] + 1;
			if (local8 > 0 && Static88.anIntArrayArray9[local8 - 1][local52] == 0 && (local75[local8 - 1][local52] & 0x12C0108) == 0) {
				Static183.anIntArray207[local65] = local8 - 1;
				Static120.anIntArray145[local65] = local52;
				local65 = (local65 + 1) % local70;
				Static88.anIntArrayArray9[local8 - 1][local52] = 2;
				Static109.anIntArrayArray12[local8 - 1][local52] = local180;
			}
			if (local8 < 103 && Static88.anIntArrayArray9[local8 + 1][local52] == 0 && (local75[local8 + 1][local52] & 0x12C0180) == 0) {
				Static183.anIntArray207[local65] = local8 + 1;
				Static120.anIntArray145[local65] = local52;
				local65 = (local65 + 1) % local70;
				Static88.anIntArrayArray9[local8 + 1][local52] = 8;
				Static109.anIntArrayArray12[local8 + 1][local52] = local180;
			}
			if (local52 > 0 && Static88.anIntArrayArray9[local8][local52 - 1] == 0 && (local75[local8][local52 - 1] & 0x12C0102) == 0) {
				Static183.anIntArray207[local65] = local8;
				Static120.anIntArray145[local65] = local52 - 1;
				local65 = (local65 + 1) % local70;
				Static88.anIntArrayArray9[local8][local52 - 1] = 1;
				Static109.anIntArrayArray12[local8][local52 - 1] = local180;
			}
			if (local52 < 103 && Static88.anIntArrayArray9[local8][local52 + 1] == 0 && (local75[local8][local52 + 1] & 0x12C0120) == 0) {
				Static183.anIntArray207[local65] = local8;
				Static120.anIntArray145[local65] = local52 + 1;
				Static88.anIntArrayArray9[local8][local52 + 1] = 4;
				Static109.anIntArrayArray12[local8][local52 + 1] = local180;
				local65 = (local65 + 1) % local70;
			}
			if (local8 > 0 && local52 > 0 && Static88.anIntArrayArray9[local8 - 1][local52 - 1] == 0 && (local75[local8 - 1][local52 - 1] & 0x12C010E) == 0 && (local75[local8 - 1][local52] & 0x12C0108) == 0 && (local75[local8][local52 - 1] & 0x12C0102) == 0) {
				Static183.anIntArray207[local65] = local8 - 1;
				Static120.anIntArray145[local65] = local52 - 1;
				local65 = (local65 + 1) % local70;
				Static88.anIntArrayArray9[local8 - 1][local52 - 1] = 3;
				Static109.anIntArrayArray12[local8 - 1][local52 - 1] = local180;
			}
			if (local8 < 103 && local52 > 0 && Static88.anIntArrayArray9[local8 + 1][local52 - 1] == 0 && (local75[local8 + 1][local52 - 1] & 0x12C0183) == 0 && (local75[local8 + 1][local52] & 0x12C0180) == 0 && (local75[local8][local52 - 1] & 0x12C0102) == 0) {
				Static183.anIntArray207[local65] = local8 + 1;
				Static120.anIntArray145[local65] = local52 - 1;
				Static88.anIntArrayArray9[local8 + 1][local52 - 1] = 9;
				Static109.anIntArrayArray12[local8 + 1][local52 - 1] = local180;
				local65 = (local65 + 1) % local70;
			}
			if (local8 > 0 && local52 < 103 && Static88.anIntArrayArray9[local8 - 1][local52 + 1] == 0 && (local75[local8 - 1][local52 + 1] & 0x12C0138) == 0 && (local75[local8 - 1][local52] & 0x12C0108) == 0 && (local75[local8][local52 + 1] & 0x12C0120) == 0) {
				Static183.anIntArray207[local65] = local8 - 1;
				Static120.anIntArray145[local65] = local52 + 1;
				local65 = (local65 + 1) % local70;
				Static88.anIntArrayArray9[local8 - 1][local52 + 1] = 6;
				Static109.anIntArrayArray12[local8 - 1][local52 + 1] = local180;
			}
			if (local8 < 103 && local52 < 103 && Static88.anIntArrayArray9[local8 + 1][local52 + 1] == 0 && (local75[local8 + 1][local52 + 1] & 0x12C01E0) == 0 && (local75[local8 + 1][local52] & 0x12C0180) == 0 && (local75[local8][local52 + 1] & 0x12C0120) == 0) {
				Static183.anIntArray207[local65] = local8 + 1;
				Static120.anIntArray145[local65] = local52 + 1;
				Static88.anIntArrayArray9[local8 + 1][local52 + 1] = 12;
				local65 = (local65 + 1) % local70;
				Static109.anIntArrayArray12[local8 + 1][local52 + 1] = local180;
			}
		}
		Static44.anInt933 = 0;
		@Pc(800) int local800;
		@Pc(805) int local805;
		@Pc(810) int local810;
		if (!local56) {
			if (!arg0) {
				return false;
			}
			local180 = 1000;
			local800 = 100;
			for (local805 = arg7 - 10; local805 <= arg7 + 10; local805++) {
				for (local810 = arg6 - 10; local810 <= arg6 + 10; local810++) {
					if (local805 >= 0 && local810 >= 0 && local805 < 104 && local810 < 104 && Static109.anIntArrayArray12[local805][local810] < 100) {
						@Pc(832) int local832 = 0;
						if (local805 < arg7) {
							local832 = arg7 - local805;
						} else if (arg7 + arg4 - 1 < local805) {
							local832 = local805 + 1 - arg7 - arg4;
						}
						@Pc(858) int local858 = 0;
						if (arg6 > local810) {
							local858 = arg6 - local810;
						} else if (arg1 + arg6 - 1 < local810) {
							local858 = local810 + 1 - arg6 - arg1;
						}
						@Pc(896) int local896 = local858 * local858 + local832 * local832;
						if (local180 > local896 || local180 == local896 && Static109.anIntArrayArray12[local805][local810] < local800) {
							local8 = local805;
							local800 = Static109.anIntArrayArray12[local805][local810];
							local52 = local810;
							local180 = local896;
						}
					}
				}
			}
			if (local180 == 1000) {
				return false;
			}
			if (local8 == arg2 && arg10 == local52) {
				return false;
			}
			Static44.anInt933 = 1;
		}
		@Pc(967) byte local967 = 0;
		Static183.anIntArray207[0] = local8;
		local54 = local967 + 1;
		Static120.anIntArray145[0] = local52;
		local180 = local800 = Static88.anIntArrayArray9[local8][local52];
		while (arg2 != local8 || local52 != arg10) {
			if (local180 != local800) {
				local800 = local180;
				Static183.anIntArray207[local54] = local8;
				Static120.anIntArray145[local54++] = local52;
			}
			if ((local180 & 0x2) != 0) {
				local8++;
			} else if ((local180 & 0x8) != 0) {
				local8--;
			}
			if ((local180 & 0x1) != 0) {
				local52++;
			} else if ((local180 & 0x4) != 0) {
				local52--;
			}
			local180 = Static88.anIntArrayArray9[local8][local52];
		}
		if (local54 > 0) {
			local70 = local54--;
			if (local70 > 25) {
				local70 = 25;
			}
			@Pc(1064) int local1064 = Static183.anIntArray207[local54];
			local805 = Static120.anIntArray145[local54];
			if (arg8 == 0) {
				Static93.aClass3_Sub4_Sub1_18.method1298(89);
				Static93.aClass3_Sub4_Sub1_18.method1239(local70 + local70 + 3);
			}
			if (arg8 == 1) {
				Static93.aClass3_Sub4_Sub1_18.method1298(117);
				Static93.aClass3_Sub4_Sub1_18.method1239(local70 + local70 + 3 + 14);
			}
			if (arg8 == 2) {
				Static93.aClass3_Sub4_Sub1_18.method1298(58);
				Static93.aClass3_Sub4_Sub1_18.method1239(local70 + local70 + 3);
			}
			Static93.aClass3_Sub4_Sub1_18.method1252(Static30.anInt695 + local1064);
			Static93.aClass3_Sub4_Sub1_18.method1292(Static81.aBooleanArray4[82] ? 1 : 0);
			Static101.anInt2072 = Static120.anIntArray145[0];
			Static65.anInt1365 = Static183.anIntArray207[0];
			for (local810 = 1; local810 < local70; local810++) {
				local54--;
				Static93.aClass3_Sub4_Sub1_18.method1284(Static183.anIntArray207[local54] - local1064);
				Static93.aClass3_Sub4_Sub1_18.method1292(Static120.anIntArray145[local54] - local805);
			}
			Static93.aClass3_Sub4_Sub1_18.method1273(Static55.anInt1184 + local805);
			return true;
		} else if (arg8 == 1) {
			return false;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZLclient!b;)Z")
	public static boolean method1468(@OriginalArg(1) Class6 arg0) {
		if (Static58.aBoolean74) {
			if (Static157.method2365(arg0) != 0) {
				return false;
			}
			if (arg0.anInt250 == 0) {
				return false;
			}
		}
		return arg0.aBoolean19;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)Lclient!oc;")
	public static Class70 method1469(@OriginalArg(1) int arg0) {
		if (arg0 < 100000) {
			return Static207.method3296(new Class70[] { Static65.aClass70_637, Static107.method2404(arg0), Static87.aClass70_2102 });
		} else if (arg0 < 10000000) {
			return Static207.method3296(new Class70[] { Static88.aClass70_904, Static107.method2404(arg0 / 1000), Static121.aClass70_1176, Static87.aClass70_2102 });
		} else {
			return Static207.method3296(new Class70[] { Static189.aClass70_1873, Static107.method2404(arg0 / 1000000), Static209.aClass70_2091, Static87.aClass70_2102 });
		}
	}
}
