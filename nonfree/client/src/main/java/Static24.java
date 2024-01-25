import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!bj", name = "c", descriptor = "Lclient!ve;")
	public static Class66 aClass66_6;

	@OriginalMember(owner = "client!bj", name = "g", descriptor = "I")
	public static int anInt6106;

	@OriginalMember(owner = "client!bj", name = "h", descriptor = "[Lclient!wn;")
	public static Class95[] aClass95Array16;

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(II)Z")
	public static boolean method5480(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(Z)V")
	public static void method5483() {
		Static118.aClass190_11.method5472();
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(BZ)V")
	public static void method5484(@OriginalArg(1) boolean arg0) {
		@Pc(19) byte local19;
		@Pc(17) byte[][] local17;
		if (arg0) {
			local17 = Static318.aByteArrayArray20;
			local19 = 1;
		} else {
			local17 = Static245.aByteArrayArray15;
			local19 = 4;
		}
		@Pc(28) int local28 = local17.length;
		@Pc(44) int local44;
		@Pc(57) int local57;
		for (@Pc(30) int local30 = 0; local30 < local28; local30++) {
			@Pc(34) int[] local34 = null;
			@Pc(38) byte[] local38 = local17[local30];
			local44 = Static198.anIntArray387[local30] >> 8;
			@Pc(50) int local50 = Static198.anIntArray387[local30] & 0xFF;
			local57 = local44 * 64 - Static172.anInt4394;
			@Pc(64) int local64 = local50 * 64 - Static12.anInt3797;
			if (local38 != null) {
				Static315.method5535();
				local34 = Static150.method2711(Static152.aClass24Array3, arg0, local19, local64, Static172.anInt4394, Static12.anInt3797, local57, Static236.aClass55_9, local38);
			}
			if (!arg0 && Static53.anInt990 / 8 == local44 && local50 == Static111.anInt2079 / 8) {
				if (local34 == null) {
					Static48.aClass184_1 = null;
				} else {
					Static48.aClass184_1 = Static214.method3926(local34[1], local34[2], local34[0], local34[3]);
					anInt6106 = local34[4];
				}
			}
		}
		for (@Pc(127) int local127 = 0; local127 < local28; local127++) {
			@Pc(140) int local140 = (Static198.anIntArray387[local127] >> 8) * 64 - Static172.anInt4394;
			local44 = (Static198.anIntArray387[local127] & 0xFF) * 64 - Static12.anInt3797;
			@Pc(155) byte[] local155 = local17[local127];
			if (local155 == null && Static111.anInt2079 < 800) {
				Static315.method5535();
				for (local57 = 0; local57 < local19; local57++) {
					Static194.method3451(local44, local57, local140, 64, 64);
				}
			}
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIILclient!je;)V")
	public static void method5485(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class4_Sub4 arg3) {
		if (Static178.aClass174ArrayArrayArray3[arg0][arg1][arg2] == null) {
			Static1.method3(arg0, arg1, arg2);
		}
		Static178.aClass174ArrayArrayArray3[arg0][arg1][arg2].aClass4_Sub4_1 = arg3;
	}

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "(Z)Z")
	public static boolean method5486(@OriginalArg(0) boolean arg0) {
		for (@Pc(1) int local1 = Static63.anInt5185; local1 < Static345.anInt6647; local1++) {
			@Pc(6) Class174[][] local6 = Static178.aClass174ArrayArrayArray3[local1];
			for (@Pc(9) int local9 = -Static257.anInt5067; local9 <= 0; local9++) {
				@Pc(14) int local14 = Static66.anInt5817 + local9;
				@Pc(18) int local18 = Static66.anInt5817 - local9;
				if (local14 >= Static329.anInt6378 || local18 < Static325.anInt6299) {
					for (@Pc(27) int local27 = -Static257.anInt5067; local27 <= 0; local27++) {
						@Pc(32) int local32 = Static150.anInt2937 + local27;
						@Pc(36) int local36 = Static150.anInt2937 - local27;
						@Pc(48) Class174 local48;
						if (local14 >= Static329.anInt6378) {
							if (local32 >= Static12.anInt3796) {
								local48 = local6[local14][local32];
								if (local48 != null && local48.aBoolean438) {
									Static88.aBoolean116 = arg0;
									Static136.aClass91_1.method3911(local48);
									Static136.aClass91_1.method3916();
								}
							}
							if (local36 < Static142.anInt2744) {
								local48 = local6[local14][local36];
								if (local48 != null && local48.aBoolean438) {
									Static88.aBoolean116 = arg0;
									Static136.aClass91_1.method3911(local48);
									Static136.aClass91_1.method3916();
								}
							}
						}
						if (local18 < Static325.anInt6299) {
							if (local32 >= Static12.anInt3796) {
								local48 = local6[local18][local32];
								if (local48 != null && local48.aBoolean438) {
									Static88.aBoolean116 = arg0;
									Static136.aClass91_1.method3911(local48);
									Static136.aClass91_1.method3916();
								}
							}
							if (local36 < Static142.anInt2744) {
								local48 = local6[local18][local36];
								if (local48 != null && local48.aBoolean438) {
									Static88.aBoolean116 = arg0;
									Static136.aClass91_1.method3911(local48);
									Static136.aClass91_1.method3916();
								}
							}
						}
						if (Static263.anInt5206 == 0) {
							if (Static115.aBoolean163) {
								Static136.aClass91_1.method3919(24);
							}
							return true;
						}
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "(I)V")
	public static void method5488() {
		Static190.aClass109_6.method2858();
	}
}
