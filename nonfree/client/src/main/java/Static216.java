import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!id", name = "t", descriptor = "Lclient!ja;")
	public static final Class158 aClass158_7 = new Class158(1, 2, 2, 0);

	@OriginalMember(owner = "client!id", name = "v", descriptor = "Lclient!sb;")
	public static final Class298 aClass298_82 = new Class298(22, 3);

	@OriginalMember(owner = "client!id", name = "w", descriptor = "[I")
	public static final int[] anIntArray343 = new int[14];

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!vr;Z)Z")
	public static boolean method3774(@OriginalArg(0) Class9_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static29.aClass139Array6 == Static168.aClass139Array22;
		@Pc(8) int local8 = 0;
		@Pc(10) short local10 = 0;
		@Pc(12) byte local12 = 0;
		arg0.method7086();
		if (arg0.aShort112 < 0 || arg0.aShort115 < 0 || arg0.aShort114 >= Static411.anInt6927 || arg0.aShort113 >= Static157.anInt3168) {
			return false;
		}
		@Pc(33) short local33 = 0;
		@Pc(40) int local40;
		for (@Pc(36) int local36 = arg0.aShort112; local36 <= arg0.aShort114; local36++) {
			for (local40 = arg0.aShort115; local40 <= arg0.aShort113; local40++) {
				@Pc(47) Class63 local47 = Static343.method5228(arg0.aByte126, local36, local40);
				if (local47 != null) {
					@Pc(53) Class16 local53 = Static94.method2074(arg0);
					@Pc(56) Class16 local56 = local47.aClass16_3;
					if (local56 == null) {
						local47.aClass16_3 = local53;
					} else {
						while (local56.aClass16_1 != null) {
							local56 = local56.aClass16_1;
						}
						local56.aClass16_1 = local53;
					}
					if (local6 && (Static309.anIntArrayArray10[local36][local40] & 0xFF000000) != 0) {
						local8 = Static309.anIntArrayArray10[local36][local40];
						local10 = Static466.aShortArrayArray83[local36][local40];
						local12 = Static218.aByteArrayArray12[local36][local40];
					}
					if (!arg1 && local47.aClass9_Sub1_Sub3_1 != null && local47.aClass9_Sub1_Sub3_1.aShort42 > local33) {
						local33 = local47.aClass9_Sub1_Sub3_1.aShort42;
					}
				}
			}
		}
		if (local6 && (local8 & 0xFF000000) != 0) {
			for (local40 = arg0.aShort112; local40 <= arg0.aShort114; local40++) {
				for (@Pc(136) int local136 = arg0.aShort115; local136 <= arg0.aShort113; local136++) {
					if ((Static309.anIntArrayArray10[local40][local136] & 0xFF000000) == 0) {
						Static309.anIntArrayArray10[local40][local136] = local8;
						Static466.aShortArrayArray83[local40][local136] = local10;
						Static218.aByteArrayArray12[local40][local136] = local12;
					}
				}
			}
		}
		if (arg1) {
			Static288.aClass9_Sub1_Sub1Array1[Static472.anInt7698++] = arg0;
		} else {
			local40 = Static29.aClass139Array6 == Static168.aClass139Array22 ? 1 : 0;
			if (!arg0.method7481()) {
				Static225.aClass9_Sub1ArrayArray1[local40][Static1.anIntArray1[local40]++] = arg0;
			} else if (arg0.method7473()) {
				Static239.aClass9_Sub1ArrayArray2[local40][Static343.anIntArray471[local40]++] = arg0;
			} else {
				Static499.aClass9_Sub1ArrayArray3[local40][Static332.anIntArray459[local40]++] = arg0;
			}
		}
		if (arg1) {
			arg0.anInt8977 -= local33;
		}
		return true;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIII)V")
	public static void method3775(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class3_Sub3_Sub7 local8 = Static363.method5457(arg2, 10);
		local8.method839();
		local8.anInt1088 = arg1;
		local8.anInt1086 = arg0;
		local8.anInt1091 = arg3;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ZI)V")
	public static void method3776() {
		@Pc(16) Class3_Sub34 local16 = Static374.method5522(Static139.aClass298_57, Static220.aClass287_2);
		Static131.method2572(local16);
		for (@Pc(24) Class3_Sub28 local24 = (Class3_Sub28) Static227.aClass310_15.method6602(); local24 != null; local24 = (Class3_Sub28) Static227.aClass310_15.method6599()) {
			if (!local24.method7813()) {
				local24 = (Class3_Sub28) Static227.aClass310_15.method6602();
				if (local24 == null) {
					break;
				}
			}
			if (local24.anInt5330 == 0) {
				Static423.method6029(true, true, local24);
			}
		}
		if (Static48.aClass203_24 != null) {
			Static138.method2656(Static48.aClass203_24);
			Static48.aClass203_24 = null;
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ZZI)V")
	public static void method3777(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			Static546.anInt8827--;
			if (Static546.anInt8827 == 0) {
				Static563.anIntArray661 = null;
			}
		}
		if (arg0) {
			Static317.anInt5752--;
			if (Static317.anInt5752 == 0) {
				Static213.anIntArray342 = null;
			}
		}
	}
}
