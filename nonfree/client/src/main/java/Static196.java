import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!mh", name = "o", descriptor = "Lclient!lk;")
	public static Class4_Sub1_Sub3 aClass4_Sub1_Sub3_3;

	@OriginalMember(owner = "client!mh", name = "t", descriptor = "I")
	public static int anInt6632;

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(BZ)V")
	public static void method5556(@OriginalArg(1) boolean arg0) {
		Static144.method2969(arg0, Static357.anInt6821, Static24.anInt496, Static23.anInt465);
	}

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "(I)V")
	public static void method5557() {
		Static72.aByteArrayArrayArray5 = null;
		Static353.aByteArrayArrayArray9 = null;
		Static76.anIntArray115 = null;
		Static290.anIntArray455 = null;
		Static338.anIntArrayArrayArray40 = null;
		Static222.anIntArray386 = null;
		Static67.aByteArrayArrayArray4 = null;
		Static116.anIntArray240 = null;
		Static251.aByteArrayArrayArray12 = null;
		Static181.anIntArray325 = null;
		Static80.aByteArrayArrayArray6 = null;
		Static319.anIntArray483 = null;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(ZB)V")
	public static void method5561(@OriginalArg(0) boolean arg0) {
		@Pc(9) byte local9;
		@Pc(11) byte[][] local11;
		if (arg0) {
			local9 = 1;
			local11 = Static293.aByteArrayArray16;
		} else {
			local9 = 4;
			local11 = Static65.aByteArrayArray4;
		}
		@Pc(20) int local20 = local11.length;
		@Pc(36) int local36;
		@Pc(42) int local42;
		@Pc(55) int local55;
		for (@Pc(22) int local22 = 0; local22 < local20; local22++) {
			@Pc(26) int[] local26 = null;
			@Pc(30) byte[] local30 = local11[local22];
			local36 = Static155.anIntArray297[local22] >> 8;
			local42 = Static155.anIntArray297[local22] & 0xFF;
			@Pc(49) int local49 = local36 * 64 - Static286.anInt6699;
			local55 = local42 * 64 - Static136.anInt3193;
			if (local30 != null) {
				Static319.method5250();
				local26 = Static241.method4299(local55, Static286.anInt6699, local49, local30, Static136.anInt3193, local9, arg0, Static274.aClass47_9, Static16.aClass170Array1);
			}
			if (!arg0 && Static103.anInt2592 / 8 == local36 && Static36.anInt1007 / 8 == local42) {
				if (local26 == null) {
					Static122.aClass73_1 = null;
				} else {
					Static122.aClass73_1 = Static309.method5097(local26[1], local26[2], local26[3], local26[0]);
					Static248.anInt5060 = local26[4];
				}
			}
		}
		for (@Pc(130) int local130 = 0; local130 < local20; local130++) {
			local36 = (Static155.anIntArray297[local130] >> 8) * 64 - Static286.anInt6699;
			local42 = (Static155.anIntArray297[local130] & 0xFF) * 64 - Static136.anInt3193;
			@Pc(157) byte[] local157 = local11[local130];
			if (local157 == null && Static36.anInt1007 < 800) {
				Static319.method5250();
				for (local55 = 0; local55 < local9; local55++) {
					Static62.method1277(64, 64, local55, local42, local36);
				}
			}
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!ec;IIZ)V")
	public static void method5562(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static162.aClass50ArrayArray1[arg2][arg1] = arg0;
	}
}
