import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static360 {

	@OriginalMember(owner = "client!ve", name = "G", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray7;

	@OriginalMember(owner = "client!ve", name = "r", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_133 = new Class205(63, 0);

	@OriginalMember(owner = "client!ve", name = "v", descriptor = "[Lclient!mq;")
	public static final Class162[] aClass162Array1 = new Class162[128];

	@OriginalMember(owner = "client!ve", name = "z", descriptor = "[I")
	public static final int[] anIntArray1274 = new int[50];

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZLclient!fo;)V")
	public static void method5253(@OriginalArg(1) Class1_Sub5_Sub1 arg0) {
		@Pc(5) boolean local5 = false;
		if (Static253.anInt4469 == arg0.anInt6441 || arg0.anInt6405 == -1 || arg0.anInt6429 != 0) {
			local5 = true;
		} else {
			@Pc(26) Class202 local26 = Static36.aClass236_1.method5396(arg0.anInt6405);
			if (local26.aBoolean376 || arg0.anInt6427 + 1 > local26.anIntArray973[arg0.anInt6443]) {
				local5 = true;
			}
		}
		if (local5) {
			@Pc(54) int local54 = arg0.anInt6441 - arg0.anInt6412;
			@Pc(60) int local60 = Static253.anInt4469 - arg0.anInt6412;
			@Pc(72) int local72 = arg0.anInt6433 * 128 + arg0.method5547() * 64;
			@Pc(83) int local83 = arg0.anInt6437 * 128 + arg0.method5547() * 64;
			@Pc(94) int local94 = arg0.anInt6407 * 128 + arg0.method5547() * 64;
			@Pc(105) int local105 = arg0.anInt6432 * 128 + arg0.method5547() * 64;
			arg0.anInt6390 = (local94 * local60 + (local54 - local60) * local72) / local54;
			arg0.anInt6386 = (local60 * local105 + (local54 - local60) * local83) / local54;
		}
		arg0.anInt6454 = 0;
		if (arg0.lb == 0) {
			arg0.method5542(8192);
		}
		if (arg0.lb == 1) {
			arg0.method5542(12288);
		}
		if (arg0.lb == 2) {
			arg0.method5542(0);
		}
		if (arg0.lb == 3) {
			arg0.method5542(4096);
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILclient!wt;I)Lclient!dg;")
	public static Class46 method5254(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub5 arg1) {
		@Pc(9) Class46 local9;
		if (Static299.aClass46_2 == null) {
			local9 = new Class46();
		} else {
			local9 = Static299.aClass46_2;
			Static299.aClass46_2 = Static299.aClass46_2.aClass46_1;
			local9.aClass46_1 = null;
			Static203.anInt3754--;
		}
		local9.aClass1_Sub5_1 = arg1;
		local9.anInt1089 = arg0;
		return local9;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!ae;Z)V")
	public static void method5256(@OriginalArg(0) Class4 arg0) {
		if (arg0.anInt133 != Static63.anInt1271) {
			return;
		}
		if (Static206.aClass1_Sub5_Sub1_Sub1_1.aString24 == null) {
			arg0.anInt99 = 0;
			arg0.anInt62 = 0;
			return;
		}
		arg0.anInt112 = 150;
		arg0.anInt103 = (int) (Math.sin((double) Static253.anInt4469 / 40.0D) * 256.0D) & 0x7FF;
		arg0.anInt60 = 5;
		arg0.anInt99 = Static176.anInt3381;
		arg0.anInt62 = Static225.method3687(Static206.aClass1_Sub5_Sub1_Sub1_1.aString24);
		arg0.anInt105 = Static206.aClass1_Sub5_Sub1_Sub1_1.anInt6425;
		arg0.anInt85 = Static206.aClass1_Sub5_Sub1_Sub1_1.anInt6414;
		arg0.anInt124 = Static206.aClass1_Sub5_Sub1_Sub1_1.anInt6423;
		arg0.anInt117 = 0;
	}

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "(I)V")
	public static void method5257() {
		@Pc(5) byte local5 = 0;
		if (Static212.aBoolean293) {
			local5 = 55;
		}
		Static58.method947(local5);
		Static221.aClass118_6.method2859(local5);
		Static15.aClass81_1.method2179(local5);
		Static356.aClass48_2.method948(local5);
		Static149.aClass173_5.method3801(local5);
		Static46.method803(local5);
		Static287.method4353(local5);
		Static337.method4969(local5);
		Static312.method4643(local5);
		if (Static391.anInt6627 == 10) {
			Static104.method2180(28);
		} else if (Static391.anInt6627 == 30) {
			Static104.method2180(25);
			return;
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIIIZZ)V")
	public static void method5258(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) boolean arg3, @OriginalArg(6) boolean arg4) {
		Static333.anInt5694 = 7;
		Static180.anInt6489 = 0x1 << Static333.anInt5694;
		Static241.anInt4320 = Static180.anInt6489 >> 1;
		Static207.anInt4910 = (int) Math.sqrt((double) (Static241.anInt4320 * Static241.anInt4320 + Static241.anInt4320 * Static241.anInt4320));
		Static12.anInt312 = arg0;
		Static341.anInt5833 = arg1;
		Static309.anInt5190 = arg2;
		Static246.aClass251ArrayArrayArray3 = new Class251[4][Static12.anInt312][Static341.anInt5833];
		Static90.aClass107Array1 = new Class107[4];
		if (arg3) {
			Static68.anIntArrayArray13 = new int[Static12.anInt312][Static341.anInt5833];
			Static324.aByteArrayArray17 = new byte[Static12.anInt312][Static341.anInt5833];
			Static367.aByteArrayArray19 = new byte[Static12.anInt312][Static341.anInt5833];
			Static232.aClass251ArrayArrayArray2 = new Class251[1][Static12.anInt312][Static341.anInt5833];
			Static94.aClass107Array2 = new Class107[1];
		} else {
			Static68.anIntArrayArray13 = null;
			Static324.aByteArrayArray17 = null;
			Static367.aByteArrayArray19 = null;
			Static232.aClass251ArrayArrayArray2 = null;
			Static94.aClass107Array2 = null;
		}
		if (arg4) {
			Static223.aLongArrayArrayArray1 = new long[4][arg0][arg1];
			Static386.aClass2_Sub17_Sub1Array3 = new Class2_Sub17_Sub1[65535];
			Static196.aBooleanArray24 = new boolean[65535];
			Static104.anInt2157 = 0;
		} else {
			Static223.aLongArrayArrayArray1 = null;
			Static386.aClass2_Sub17_Sub1Array3 = null;
			Static196.aBooleanArray24 = null;
			Static104.anInt2157 = 0;
		}
		Static184.method3175(false);
		Static209.aClass227Array1 = new Class227[500];
		Static168.anInt3222 = 0;
		Static343.aClass227Array2 = new Class227[500];
		Static386.anInt6583 = 0;
		Static85.anIntArrayArrayArray2 = new int[4][Static12.anInt312 + 1][Static341.anInt5833 + 1];
		Static377.aClass1_Sub5Array5 = new Class1_Sub5[5000];
		Static167.anInt5330 = 0;
		Static199.aBooleanArrayArray4 = new boolean[Static309.anInt5190 + Static309.anInt5190 + 1][Static309.anInt5190 + Static309.anInt5190 + 1];
		aBooleanArrayArray7 = new boolean[Static309.anInt5190 + Static309.anInt5190 + 2][Static309.anInt5190 + Static309.anInt5190 + 2];
		Static305.aClass29_1 = null;
	}
}
