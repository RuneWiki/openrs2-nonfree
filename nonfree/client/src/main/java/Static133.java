import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!je", name = "j", descriptor = "[[[Lclient!nh;")
	public static Class4_Sub19[][][] aClass4_Sub19ArrayArrayArray2;

	@OriginalMember(owner = "client!je", name = "l", descriptor = "Lclient!wl;")
	public static Class193 aClass193_5;

	@OriginalMember(owner = "client!je", name = "m", descriptor = "Lclient!ic;")
	public static Class85 aClass85_10;

	@OriginalMember(owner = "client!je", name = "c", descriptor = "Lclient!cc;")
	public static Class26 aClass26_26 = new Class26(64);

	@OriginalMember(owner = "client!je", name = "d", descriptor = "[Lclient!gb;")
	public static Class63_Sub1[] aClass63_Sub1Array2 = new Class63_Sub1[0];

	@OriginalMember(owner = "client!je", name = "e", descriptor = "I")
	public static int anInt2571 = -1;

	@OriginalMember(owner = "client!je", name = "h", descriptor = "I")
	public static int anInt2574 = 0;

	@OriginalMember(owner = "client!je", name = "k", descriptor = "I")
	public static int anInt2576 = 0;

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
	public static void method2008() {
		if (Static250.aBoolean331) {
			return;
		}
		Static182.aBoolean248 = true;
		if (Static212.aBoolean293) {
			Static198.aFloat147 = (int) Static198.aFloat147 + 47 & 0xFFFFFFF0;
		} else {
			Static35.aFloat20 += (12.0F - Static35.aFloat20) / 2.0F;
		}
		Static250.aBoolean331 = true;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IZLclient!wf;I)V")
	public static void method2009(@OriginalArg(0) int arg0, @OriginalArg(2) Class189 arg1, @OriginalArg(3) int arg2) {
		if (Static300.anInt5638 < 2 && Static69.anInt1334 == 0 && !Static135.aBoolean177) {
			return;
		}
		@Pc(26) String local26 = Static284.method4365();
		if (arg1 == null) {
			@Pc(43) int local43 = Static211.aClass4_Sub3_Sub5_3.method2270(local26, arg0 + 4, arg2 - -15, Static216.aRandom1, Static85.anInt1976);
			Static4.method66(local43 + Static211.aClass4_Sub3_Sub5_3.method2259(local26), 15, arg0 + 4, arg2);
			return;
		}
		@Pc(62) Class4_Sub3_Sub5 local62 = arg1.method4771(Static125.aClass56Array3);
		if (local62 == null) {
			local62 = Static211.aClass4_Sub3_Sub5_3;
		}
		local62.method2276(local26, arg0, arg2, arg1.anInt5897, arg1.anInt5953, arg1.anInt5937, arg1.anInt5938, arg1.anInt5928, arg1.anInt5926, Static216.aRandom1, Static85.anInt1976, Static281.anIntArray600);
		Static4.method66(Static281.anIntArray600[2], Static281.anIntArray600[3], Static281.anIntArray600[0], Static281.anIntArray600[1]);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ZI)V")
	public static void method2010(@OriginalArg(0) boolean arg0) {
		@Pc(11) byte local11;
		@Pc(13) byte[][] local13;
		if (Static94.aBoolean138 && arg0) {
			local11 = 1;
			local13 = Static278.aByteArrayArray49;
		} else {
			local11 = 4;
			local13 = Static24.aByteArrayArray4;
		}
		@Pc(22) int local22 = local13.length;
		@Pc(24) int local24;
		@Pc(49) int local49;
		for (local24 = 0; local24 < local22; local24++) {
			@Pc(33) int[] local33 = null;
			@Pc(39) int local39 = Static278.anIntArray597[local24] >> 8;
			@Pc(43) byte[] local43 = local13[local24];
			local49 = Static278.anIntArray597[local24] & 0xFF;
			@Pc(56) int local56 = local39 * 64 - Static220.anInt3983;
			@Pc(63) int local63 = local49 * 64 - Static295.anInt5480;
			if (local43 != null) {
				Static16.method763();
				local33 = Static272.method4285(arg0, Static296.aClass30Array1, Static295.anInt5480, local63, local56, Static220.anInt3983, local43);
			}
			if (!arg0 && Static177.anInt3360 / 8 == local39 && local49 == Static3.anInt5 / 8) {
				if (local33 == null) {
					Static256.anInt4864 = -1;
				} else {
					Static256.anInt4864 = local33[0];
					Static223.anInt4304 = local33[3];
					Static29.anInt466 = local33[2];
					Static141.anInt5830 = local33[1];
					Static210.anInt3774 = local33[4];
				}
			}
		}
		for (local24 = 0; local24 < local22; local24++) {
			@Pc(144) int local144 = (Static278.anIntArray597[local24] & 0xFF) * 64 - Static295.anInt5480;
			@Pc(154) int local154 = (Static278.anIntArray597[local24] >> 8) * 64 - Static220.anInt3983;
			@Pc(158) byte[] local158 = local13[local24];
			if (local158 == null && Static3.anInt5 < 800) {
				Static16.method763();
				for (local49 = 0; local49 < local11; local49++) {
					Static221.method3573(local154, local49, 64, local144, 64);
				}
			}
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(II)V")
	public static void method2011(@OriginalArg(1) int arg0) {
		@Pc(16) Class4_Sub18 local16 = (Class4_Sub18) Static189.aClass85_17.method1845((long) arg0);
		if (local16 != null) {
			local16.method4854();
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ILclient!fh;)V")
	public static void method2012(@OriginalArg(1) Class58 arg0) {
		Static271.aClass58_95 = arg0;
	}
}
